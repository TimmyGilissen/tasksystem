package tasksystem.application.services.impl;

import org.springframework.stereotype.Component;
import tasksystem.application.commands.CreateTaskCommand;
import tasksystem.application.services.CreateTaskService;

@Component
public class CreateServiceTaskService implements CreateTaskService {

    @Override
    public void create(CreateTaskCommand createTaskCommand) {

    }
}
