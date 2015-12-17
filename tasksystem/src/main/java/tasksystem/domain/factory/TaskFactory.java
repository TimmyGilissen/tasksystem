package tasksystem.domain.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tasksystem.application.commands.CreateTaskCommand;
import tasksystem.domain.Task;
import tasksystem.domain.repository.TaskRepository;

@Component
public class TaskFactory {

    @Autowired
    private TaskRepository taskRepository;

    public Task create(CreateTaskCommand createTaskCommand){

        if(!taskRepository.taskExists(createTaskCommand.guid)) return null;

        return new Task();
    }
}
