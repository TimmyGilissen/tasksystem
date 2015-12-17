package tasksystem.application.handlers;

import org.springframework.stereotype.Component;
import tasksystem.application.commands.CreateTaskCommand;

@Component
public interface CreateTaskHandler {

    void create(CreateTaskCommand createTaskCommand);

}
