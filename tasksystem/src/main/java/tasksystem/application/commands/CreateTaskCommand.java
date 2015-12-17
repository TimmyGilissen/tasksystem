package tasksystem.application.commands;

import tasksystem.application.dto.SkillDTO;

import java.util.List;


public class CreateTaskCommand {
    public final String guid;

    private final String definition;

    private final String executor;

    private final String role;

    private final List<SkillDTO> vaardigheden;

    private CreateTaskCommand(Builder builder) {
        guid = builder.guid;
        definition = builder.definition;
        executor = builder.executor;
        role = builder.role;
        vaardigheden = builder.vaardigheden;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String guid;
        private String definition;
        private String executor;
        private String role;
        private List<SkillDTO> vaardigheden;

        private Builder() {
        }

        public Builder withVaardigheden(List<SkillDTO> val){
            vaardigheden = val;
            return this;
        }

        public Builder withGuid(String val) {
            guid = val;
            return this;
        }

        public Builder withDefinition(String val) {
            definition = val;
            return this;
        }

        public Builder withExecutor(String val) {
            executor = val;
            return this;
        }

        public Builder withRole(String val) {
            role = val;
            return this;
        }

        public CreateTaskCommand build() {
            return new CreateTaskCommand(this);
        }
    }
}
