package controller.contract.commands;

/**
 * Created by timmygilissen on 7/12/15.
 */
public class StartTaskCommand {
    public final Long Id;
    public final String Executor;

    private StartTaskCommand(Builder builder) {
        Id = builder.Id;
        Executor = builder.Executer;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {
        private Long Id;
        private String Executer;

        private Builder() {
        }

        public Builder Id(Long val) {
            Id = val;
            return this;
        }

        public Builder Executer(String val) {
            Executer = val;
            return this;
        }

        public StartTaskCommand build() {
            return new StartTaskCommand(this);
        }
    }
}
