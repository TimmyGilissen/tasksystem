package controller.impl;

import Domain.Task;
import Domain.contract.TaskRepository;
import controller.contract.TaskController;
import controller.contract.commands.StartTaskCommand;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by timmygilissen on 7/12/15.
 */
public class ImplTaskController implements TaskController {

    @Autowired
    private TaskRepository taskRepository;

    public void startTask(StartTaskCommand startTaskCommand) {
        Task task =  taskRepository.getTaskById(startTaskCommand.Id);

        task.StartTask(startTaskCommand.Executor);

        //save task
    }
}
