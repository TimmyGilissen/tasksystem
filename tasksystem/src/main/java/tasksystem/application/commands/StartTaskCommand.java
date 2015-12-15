package tasksystem.application.commands;

/**
 * Created by timmygilissen on 7/12/15.
 */
public class StartTaskCommand {

   public final Long taskId;

    public final String executor;

    private StartTaskCommand(Builder builder) {
        taskId = builder.taskId;
        executor = builder.executor;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private Long taskId;
        private String executor;

        private Builder() {
        }

        public Builder taskId(Long val) {
            taskId = val;
            return this;
        }

        public Builder executor(String val) {
            executor = val;
            return this;
        }

        public StartTaskCommand build() {
            return new StartTaskCommand(this);
        }
    }
}
