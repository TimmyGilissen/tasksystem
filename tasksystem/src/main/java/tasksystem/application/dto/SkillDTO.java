package tasksystem.application.dto;

public class SkillDTO {
    public final String category;
    public final String code;

    private SkillDTO(Builder builder) {
        category = builder.category;
        code = builder.code;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String category;
        private String code;

        private Builder() {
        }

        public Builder withCategory(String val) {
            category = val;
            return this;
        }

        public Builder withCode(String val) {
            code = val;
            return this;
        }

        public SkillDTO build() {
            return new SkillDTO(this);
        }
    }
}
