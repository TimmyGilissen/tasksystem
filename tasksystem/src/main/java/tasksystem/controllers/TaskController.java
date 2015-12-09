package tasksystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tasksystem.application.CloseTaskHandler;
import tasksystem.application.StartTaskHandler;
import tasksystem.commands.CloseTaskCommand;
import tasksystem.commands.StartTaskCommand;

@Controller
public class TaskController {

    @Autowired
    private CloseTaskHandler closeTaskHandler;

    @Autowired
    private StartTaskHandler startTaskHandler;

    public void closeTask(Long taskId,String executor){
        closeTaskHandler.CloseTask(CloseTaskCommand.newBuilder().withTaskId(taskId).withExecutor(executor).build());
    }

    public void startTask(Long taskId,String executor){
        startTaskHandler.StartTask(StartTaskCommand.newBuilder().executor(executor).taskId(taskId).build());
    }
}
