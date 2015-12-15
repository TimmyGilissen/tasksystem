package tasksystem.domain.repository;

import tasksystem.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by timmygilissen on 7/12/15.
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task getTask(Long Id);

    boolean taskExists(String guid);
}
