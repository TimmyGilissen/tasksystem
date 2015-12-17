package tasksystem.services;

import org.springframework.stereotype.Service;
import tasksystem.application.commands.CloseTaskCommand;
import tasksystem.application.commands.StartTaskCommand;

@Service
public interface TaskService {

    void closeTask(CloseTaskCommand closeTaskCommand);

    void startTask(StartTaskCommand startTaskCommand);
}
