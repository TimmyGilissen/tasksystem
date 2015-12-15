package tasksystem.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tasksystem.domain.TaskDefinition;

public interface Taskdefinitions extends JpaRepository<TaskDefinition, Long> {
}
