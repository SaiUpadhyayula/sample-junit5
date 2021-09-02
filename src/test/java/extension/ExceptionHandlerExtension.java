package extension;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class ExceptionHandlerExtension implements TestExecutionExceptionHandler {

    Logger logger = LogManager
            .getLogger(ExceptionHandlerExtension.class);

    @Override
    public void handleTestExecutionException(ExtensionContext extensionContext, Throwable throwable) throws Throwable {
        if (throwable instanceof ArithmeticException) {
            logger.error("ArithmeticException is handled by ExceptionHandlerExtension", throwable);
            return;
        }
        throw throwable;
    }
}
