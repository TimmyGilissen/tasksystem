package repository;

import Domain.Status;
import Domain.contract.StatusRepository;

/**
 * Created by timmygilissen on 7/12/15.
 */
public class InMemoryStatusRepository implements StatusRepository {

    @Override
    public Status getStatusBasedOnName(String name) {
        return null;
    }
}
