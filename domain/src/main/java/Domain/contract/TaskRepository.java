package Domain.contract;

import Domain.Task;

/**
 * Created by timmygilissen on 7/12/15.
 */
public interface TaskRepository {
    Task getTaskById(Long Id);
}
