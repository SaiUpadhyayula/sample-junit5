package extension;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class RunOnCIEnvironmentExtension implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext extensionContext) {
        String jenkinsHome = System.getenv("JENKINS_HOME");
        if (jenkinsHome != null) {
            return ConditionEvaluationResult.enabled("Test enabled on CI");
        }
        return ConditionEvaluationResult.disabled("Test disabled, will run only on CI environment");
    }
}
