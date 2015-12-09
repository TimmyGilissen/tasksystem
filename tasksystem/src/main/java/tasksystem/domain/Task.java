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

    private EnumTaskStatus status;

    private TaskDefinition definition;

    private String executor;

    private Priority priority;

    public Task(String guid, EnumTaskStatus status, TaskDefinition definition, String executor, Priority priority) {
        this.guid = guid;
        this.status = status;
        this.definition = definition;
        this.executor = executor;
        this.priority = priority;
    }

    public String getGuid() {
        return guid;
    }

    public EnumTaskStatus getStatus() {
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
        this.status = EnumTaskStatus.CLOSED;
    }

    public void StartTask(String executor){

        if(taskIsClosed()) return;

        this.executor = executor;
        this.status = EnumTaskStatus.RUNNING;
    }

    private boolean taskIsClosed() {
        return status.equals(EnumTaskStatus.CLOSED);
    }


}
