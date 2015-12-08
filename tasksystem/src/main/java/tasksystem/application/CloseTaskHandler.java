package tasksystem.application;

import org.springframework.stereotype.Component;
import tasksystem.commands.CloseTaskCommand;

@Component
public interface CloseTaskHandler {

    void CloseTask(CloseTaskCommand closeTaskCommand);
}
