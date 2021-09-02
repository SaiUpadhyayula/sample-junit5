package extension;

import org.junit.jupiter.api.extension.*;

public class TestReportExtension implements BeforeAllCallback,
        AfterAllCallback,
        BeforeTestExecutionCallback,
        AfterTestExecutionCallback,
        BeforeEachCallback,
        AfterEachCallback {
    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        extensionContext.publishReportEntry("After All Callback Invoked");
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        extensionContext.publishReportEntry("After Each Callback Invoked");
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        extensionContext.publishReportEntry("After Test Callback Invoked");
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        extensionContext.publishReportEntry("Before All Callback Invoked");
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        extensionContext.publishReportEntry("Before Each Callback Invoked");
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        extensionContext.publishReportEntry("Before Test Callback Invoked");
    }
}
