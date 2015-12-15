package tasksystem.domain;

import org.joda.time.DateTime;
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

    private DateTime calculatedEndDate;

    private DateTime creationDate;

    private DateTime modificationDate;

    private DateTime startDate;

    private String executor;

    public Task(String guid, EnumTaskStatus status, TaskDefinition definition, DateTime calculatedEndDate, DateTime creationDate, DateTime modificationDate, DateTime startDate, String executor) {
        this.guid = guid;
        this.status = status;
        this.definition = definition;
        this.calculatedEndDate = calculatedEndDate;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.startDate = startDate;
        this.executor = executor;
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

    public void close(String executor){

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


    public DateTime getCalculatedEndDate() {
        return calculatedEndDate;
    }

    public DateTime getCreationDate() {
        return creationDate;
    }

    public DateTime getModificationDate() {
        return modificationDate;
    }

    public DateTime getStartDate() {
        return startDate;
    }
}
