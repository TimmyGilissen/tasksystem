package tasksystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tasksystem.application.CloseTaskHandler;
import tasksystem.commands.CloseTaskCommand;

@Controller
public class TaskController {

    @Autowired
    private CloseTaskHandler closeTaskHandler;

    public void closeTask(Long taskId,String executor){
        closeTaskHandler.CloseTask(CloseTaskCommand.newBuilder().withTaskId(taskId).withExecutor(executor).build());
    }


}
