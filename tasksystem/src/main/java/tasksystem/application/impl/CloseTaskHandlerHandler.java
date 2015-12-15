package tasksystem.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tasksystem.application.CloseTaskHandler;
import tasksystem.application.commands.CloseTaskCommand;
import tasksystem.domain.Task;
import tasksystem.domain.repository.TaskRepository;

public class CloseTaskHandlerHandler implements CloseTaskHandler {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void closeTask(CloseTaskCommand closeTaskCommand) {

        Task task = taskRepository.getTask(closeTaskCommand.TaskId);

        task.close(closeTaskCommand.Executor);

        taskRepository.save(task);
    }
}
