package tasksystem.services;

import tasksystem.application.commands.CloseTaskCommand;
import tasksystem.application.commands.StartTaskCommand;


public interface TaskService {

    void closeTask(CloseTaskCommand closeTaskCommand);

    void startTask(StartTaskCommand startTaskCommand);
}
