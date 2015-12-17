package tasksystem.application.handlers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tasksystem.application.commands.CreateTaskCommand;
import tasksystem.application.handlers.CreateTaskHandler;
import tasksystem.domain.Task;
import tasksystem.domain.factory.TaskFactory;
import tasksystem.domain.repository.TaskRepository;

@Component
public class CreateTaskHandlerHandler implements CreateTaskHandler {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskFactory taskFactory;

    @Override
    public void create(CreateTaskCommand createTaskCommand) {

        Task newTask = taskFactory.create(createTaskCommand);

        taskRepository.save(newTask);
    }

}
