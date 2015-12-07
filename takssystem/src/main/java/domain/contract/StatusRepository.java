package domain.contract;

import domain.Status;

/**
 * Created by timmygilissen on 7/12/15.
 */
public interface StatusRepository {
    Status getStatusBasedOnName(String name);
}
