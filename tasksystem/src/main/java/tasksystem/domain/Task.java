package tasksystem.domain;

import tasksystem.domain.enums.EnumTaskStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by timmygilissen on 7/12/15.
 */
@Entity
public class Task {

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

    public void CloseTask(Status status,String executor){

        if(taskIsClosed()) return;

        this.executor = executor;
        this.status = status;
    }

    public void StartTask(Status status,String executor){

        if(taskIsClosed()) return;

        this.executor = executor;
        this.status = status;
    }

    private boolean taskIsClosed() {
        return status.getName().equals(EnumTaskStatus.CLOSED.toString());
    }


}
