package repository;

import domain.Status;
import domain.contract.StatusRepository;

/**
 * Created by timmygilissen on 7/12/15.
 */
public class InMemoryStatusRepository implements StatusRepository {

    @Override
    public Status getStatusBasedOnName(String name) {
        return null;
    }
}
