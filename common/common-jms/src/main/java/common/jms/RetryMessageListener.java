package common.jms;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.adapter.MessageListenerAdapter;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import static common.jms.MessageUtils.getDeliveryCount;
import static common.jms.MessageUtils.getId;

class RetryMessageListener extends MessageListenerAdapter {

    private static final String ON_MESSAGE = "onMessage";
    private final int retryLimit;
    private final JmsTemplate jmsErrorTemplate;


    public RetryMessageListener(Object delegate, int retryLimit, JmsTemplate jmsErrorTemplate) {
        super(delegate);
        this.retryLimit = retryLimit;
        this.jmsErrorTemplate = jmsErrorTemplate;
        this.setDefaultListenerMethod(ON_MESSAGE);
    }

//    @Override
    @Transactional
    public void OnMessage(Message message, Session session) {
        final TextMessage textMessage = convertToTextMessage(message);

        if (isLimitReached(textMessage))
            sendToErrorQueue(textMessage, session);
        else
            procesMessage(textMessage, session);
    }

    private void procesMessage(TextMessage textMessage, Session session) {
        try {
            super.onMessage(textMessage, session);
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendToErrorQueue(TextMessage textMessage, Session session) {
        final TextMessage newMessage = createErrorTextMessage(textMessage, session);
        jmsErrorTemplate.convertAndSend(newMessage);
    }

    private TextMessage createErrorTextMessage(TextMessage textMessage, Session session) {
        try {
            return copyMessage(textMessage, session);
        } catch (JMSException e) {
            throw new RuntimeException("Unable to create error text message", e);
        }
    }

    private TextMessage copyMessage(TextMessage textMessage, Session session) throws JMSException {
        final TextMessage newMessage = session.createTextMessage();

        newMessage.setText(textMessage.getText());
        newMessage.setJMSCorrelationID(textMessage.getJMSCorrelationID());
        newMessage.setJMSDeliveryMode(textMessage.getJMSDeliveryMode());
        newMessage.setJMSDestination(textMessage.getJMSDestination());
        newMessage.setJMSExpiration(textMessage.getJMSExpiration());
        newMessage.setJMSMessageID(textMessage.getJMSMessageID());
        newMessage.setJMSPriority(textMessage.getJMSPriority());
        newMessage.setJMSRedelivered(textMessage.getJMSRedelivered());
        newMessage.setJMSTimestamp(textMessage.getJMSTimestamp());
        newMessage.setJMSType(textMessage.getJMSType());
        return newMessage;
    }

    private boolean isLimitReached(Message message) {
        return getDeliveryCount(message) >= retryLimit;
    }

    private TextMessage convertToTextMessage(Message message) {
        if (TextMessage.class.isInstance(message)) {
            final TextMessage textMessage = TextMessage.class.cast(message);
            return textMessage;
        } else {
            throw new RuntimeException("The received message [" + getId(message) + "] was not a text message");
        }
    }


}
