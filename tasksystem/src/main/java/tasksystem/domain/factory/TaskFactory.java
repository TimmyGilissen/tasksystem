package tasksystem.domain.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tasksystem.application.commands.CreateTaskCommand;
import tasksystem.domain.EnumTaskStatus;
import tasksystem.domain.Task;
import tasksystem.domain.repository.TaskRepository;

import java.time.LocalDateTime;

@Component
public class TaskFactory {

    @Autowired
    private TaskRepository taskRepository;

    public Task create(CreateTaskCommand createTaskCommand){

        if(!taskRepository.taskExists(createTaskCommand.guid)) return null;

        Task newTask = new Task(createTaskCommand.guid, EnumTaskStatus.CREATED,createTaskCommand.definition, LocalDateTime.now().plusDays(5),LocalDateTime.now(),LocalDateTime.now(), null,"",null,"");

        return newTask;
    }
}
