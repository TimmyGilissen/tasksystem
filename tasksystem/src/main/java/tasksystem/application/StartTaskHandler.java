package tasksystem.application;

import org.springframework.stereotype.Component;
import tasksystem.application.commands.StartTaskCommand;

@Component
public interface StartTaskHandler {

    void startTask(StartTaskCommand startTaskCommand);

}
