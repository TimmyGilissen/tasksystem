package tasksystem.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tasksystem.application.StartTaskHandler;
import tasksystem.commands.StartTaskCommand;
import tasksystem.domain.Task;
import tasksystem.repository.TaskRepository;

/**
 * Created by timmygilissen on 9/12/15.
 */
public class StartTaskHandlerHandler implements StartTaskHandler {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void StartTask(StartTaskCommand startTaskCommand) {
        Task task = taskRepository.getTaskById(startTaskCommand.taskId);

        task.start(startTaskCommand.executor);

        taskRepository.save(task);
    }
}
