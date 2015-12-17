package tasksystem.application.services;

import org.springframework.stereotype.Service;
import tasksystem.application.commands.CreateTaskCommand;

@Service
public interface CreateTaskService {

    void create(CreateTaskCommand createTaskCommand);

}
