package tasksystem.application.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tasksystem.application.handlers.CloseTaskHandler;
import tasksystem.application.handlers.StartTaskHandler;
import tasksystem.application.commands.CloseTaskCommand;
import tasksystem.application.commands.StartTaskCommand;
import tasksystem.application.services.TaskService;

@Component
public class TaskServiceService implements TaskService {

    @Autowired
    private CloseTaskHandler closeTaskHandler;

    @Autowired
    private StartTaskHandler startTaskHandler;

    public void closeTask(CloseTaskCommand closeTaskCommand){
        closeTaskHandler.closeTask(closeTaskCommand);
    }

    public void startTask(StartTaskCommand startTaskCommand){
        startTaskHandler.startTask(startTaskCommand);
    }
}
