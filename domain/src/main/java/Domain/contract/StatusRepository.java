package Domain.contract;

import Domain.Status;

/**
 * Created by timmygilissen on 7/12/15.
 */
public interface StatusRepository {
    Status getStatusBasedOnName(String name);
}
