package tasksystem.factory;

import tasksystem.commands.CreateTaskCommand;
import tasksystem.domain.Task;

/**
 * Created by timmygilissen on 15/12/15.
 */
public class TaskFactory {


    public Task create(CreateTaskCommand createTaskCommand){
        return new Task();
    }
}
