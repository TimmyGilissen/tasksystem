package tasksystem.application;

import org.springframework.stereotype.Component;
import tasksystem.commands.StartTaskCommand;

@Component
public interface StartTaskHandler {

    void StartTask(StartTaskCommand startTaskCommand);

}
