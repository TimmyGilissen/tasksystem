package tasksystem.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tasksystem.application.StartTaskHandler;
import tasksystem.application.commands.StartTaskCommand;
import tasksystem.domain.Task;
import tasksystem.domain.repository.TaskRepository;

@Component
public class StartTaskHandlerHandler implements StartTaskHandler {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void startTask(StartTaskCommand startTaskCommand) {
        Task task = taskRepository.getTask(startTaskCommand.taskId);

        task.start(startTaskCommand.executor);

        taskRepository.save(task);
    }
}
