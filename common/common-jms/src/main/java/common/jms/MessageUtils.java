package common.jms;


import javax.jms.JMSException;
import javax.jms.Message;


class MessageUtils {

    private static final String JMSX_DELIVERY_COUNT = "JMSXDeliveryCount";
    private static final String UNKNOWN_ID = "unknown id";

    private MessageUtils() {
    }

    public static String getId(Message message) {
        try {
            return message.getJMSMessageID();
        } catch (JMSException e) {
            return UNKNOWN_ID;
        }
    }

    public static int getDeliveryCount(Message message) {
        try {
            return message.getIntProperty(JMSX_DELIVERY_COUNT);
        } catch (JMSException ex) {
            throw new RuntimeException(ex);
        }
    }
}
