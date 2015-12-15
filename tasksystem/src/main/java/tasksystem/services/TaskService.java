package tasksystem.services;

import tasksystem.application.commands.CloseTaskCommand;
import tasksystem.application.commands.StartTaskCommand;

/**
 * Created by timmygilissen on 15/12/15.
 */
public interface TaskService {

    void closeTask(CloseTaskCommand closeTaskCommand);

    void startTask(StartTaskCommand startTaskCommand);
}
