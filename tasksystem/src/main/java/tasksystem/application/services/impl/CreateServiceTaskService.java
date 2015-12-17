package tasksystem.application.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tasksystem.application.commands.CreateTaskCommand;
import tasksystem.application.handlers.CreateTaskHandler;
import tasksystem.application.services.CreateTaskService;

@Component
public class CreateServiceTaskService implements CreateTaskService {

    @Autowired
    private CreateTaskHandler createTaskHandler;

    @Override
    public void create(CreateTaskCommand createTaskCommand) {

    }
}
