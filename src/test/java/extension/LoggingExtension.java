package extension;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class LoggingExtension implements TestInstancePostProcessor {
    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext extensionContext) throws Exception {
        Logger logger = LogManager.getLogger(testInstance.getClass());
        testInstance.getClass()
                .getMethod("setLogger", Logger.class)
                .invoke(testInstance, logger);
    }
}
