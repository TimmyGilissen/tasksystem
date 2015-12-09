package tasksystem.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tasksystem.application.CloseTaskHandler;
import tasksystem.commands.CloseTaskCommand;
import tasksystem.domain.Task;
import tasksystem.domain.enums.EnumTaskStatus;
import tasksystem.repository.TaskRepository;

/**
 * Created by timmygilissen on 8/12/15.
 */
public class CloseTaskHandlerHandler implements CloseTaskHandler {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void CloseTask(CloseTaskCommand closeTaskCommand) {

        Task task = taskRepository.getTaskById(closeTaskCommand.TaskId);

        task.CloseTask(closeTaskCommand.Executor);

        taskRepository.save(task);
    }
}
