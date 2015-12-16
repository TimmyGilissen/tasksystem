package tasksystem.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Taskdefinitions extends JpaRepository<TaskDefinition, Long> {
}
