package tasksystem.application.commands;


public class CloseTaskCommand {
    public final Long TaskId;

    public final String Executor;

    private CloseTaskCommand(Builder builder) {
        TaskId = builder.TaskId;
        Executor = builder.Executor;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private Long TaskId;
        private String Executor;

        private Builder() {
        }

        public Builder withTaskId(Long val) {
            TaskId = val;
            return this;
        }

        public Builder withExecutor(String val) {
            Executor = val;
            return this;
        }

        public CloseTaskCommand build() {
            return new CloseTaskCommand(this);
        }
    }
}
