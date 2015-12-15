package tasksystem.application;

import org.springframework.stereotype.Component;
import tasksystem.application.commands.CloseTaskCommand;

@Component
public interface CloseTaskHandler {

    void closeTask(CloseTaskCommand closeTaskCommand);
}
