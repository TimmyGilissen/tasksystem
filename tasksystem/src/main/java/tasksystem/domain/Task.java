package tasksystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private int id;

    private String guid;

    private EnumTaskStatus status;

    private String definition;

    private LocalDateTime calculatedEndDate;

    private LocalDateTime creationDate;

    private LocalDateTime modificationDate;

    private LocalDateTime startDate;

    private String executor;

    private List<Skill> skills;

    private String role;

    public Task(String guid, EnumTaskStatus status, String definition, LocalDateTime calculatedEndDate, LocalDateTime creationDate, LocalDateTime modificationDate, LocalDateTime startDate, String executor, List<Skill> skills, String role) {
        this.guid = guid;
        this.status = status;
        this.definition = definition;
        this.calculatedEndDate = calculatedEndDate;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.startDate = startDate;
        this.executor = executor;
        this.skills = skills;
        this.role = role;
    }

    public Task() {

    }

    public String getGuid() {
        return guid;
    }

    public EnumTaskStatus getStatus() {
        return status;
    }

    public String getDefinition() {
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

    public void start(String executor){

        if(taskIsClosed()) return;

        this.executor = executor;
        this.status = EnumTaskStatus.RUNNING;
    }

    private boolean taskIsClosed() {
        return status.equals(EnumTaskStatus.CLOSED);
    }

    public LocalDateTime getCalculatedEndDate() {
        return calculatedEndDate;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getModificationDate() {
        return modificationDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public String getRole() {
        return role;
    }
}
