package tasksystem.repository;

import tasksystem.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by timmygilissen on 7/12/15.
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task getTaskById(Long Id);
}
