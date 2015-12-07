package controller.contract;

import controller.contract.commands.StartTaskCommand;

/**
 * Created by timmygilissen on 7/12/15.
 */
public interface TaskController {

    void startTask(StartTaskCommand startTaskCommand);

}
