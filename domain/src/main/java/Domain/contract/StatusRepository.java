package Domain.contract;

import Domain.Status;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by timmygilissen on 7/12/15.
 */
public interface StatusRepository extends JpaRepository<Status,Long> {

    Status getStatusBasedOnName(String name);
    Status getStatusBasedOnId(Long Id);
}
