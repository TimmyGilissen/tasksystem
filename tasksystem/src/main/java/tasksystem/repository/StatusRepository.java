package tasksystem.repository;

import tasksystem.domain.Status;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by timmygilissen on 7/12/15.
 */
public interface StatusRepository extends JpaRepository<Status, Long> {
    Status getStatusBasedOnName(String name);
}
