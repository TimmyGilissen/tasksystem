package Domain;

import Domain.contract.StatusRepository;
import enums.EnumTaskStatus;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by timmygilissen on 7/12/15.
 */
@Entity
public class Task {

    @Autowired
    private StatusRepository statusRepository;

    @Id
    @GeneratedValue
    private int id;

    private String guid;

    private Status status;

    private TaskDefinition definition;

    private String executor;

    private Priority priority;

    public Task(String guid, Status status, TaskDefinition definition, String executor, Priority priority) {
        this.guid = guid;
        this.status = status;
        this.definition = definition;
        this.executor = executor;
        this.priority = priority;
    }

    public String getGuid() {
        return guid;
    }

    public Status getStatus() {
        return status;
    }

    public TaskDefinition getDefinition() {
        return definition;
    }

    public String getExecutor() {
        return executor;
    }

    public Priority getPriority() {
        return priority;
    }

    public void CloseTask(String executor){

        if(taskIsClosed()) return;

        this.executor = executor;
        status = statusRepository.getStatusBasedOnName(EnumTaskStatus.CLOSED.toString());
    }

    public void StartTask(String executor){

        if(taskIsClosed()) return;

        this.executor = executor;
        status = statusRepository.getStatusBasedOnName(EnumTaskStatus.RUNNING.toString());
    }


    private boolean taskIsClosed() {
        return status.getName().equals(EnumTaskStatus.CLOSED.toString());
    }


}
