import extension.*;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(LoggingExtension.class)
@ExtendWith(RunOnCIEnvironmentExtension.class)
@ExtendWith(TestReportExtension.class)
@ExtendWith(CalculatorInputParameterResolver.class)
class FirstTest {
    private Logger logger;
    private final Calculator calculator = new Calculator();

    @Test
    void firstTest(AdditionTestInput additionTestInput) {
        Assertions.assertEquals(2, calculator.add(additionTestInput.getInputOne(), additionTestInput.getInputTwo()));
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
