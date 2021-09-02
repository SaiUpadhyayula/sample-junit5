import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.*;

class RepetitionInfoParameterTest {

    private final Calculator calculator = new Calculator();

    @BeforeEach
    public void setup(TestInfo testInfo,
                      TestReporter testReporter,
                      RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();

        String testMethodName = testInfo.getTestMethod().get().getName();

        testReporter.publishEntry(
                String.format("Executing the test - %s, repetition %d - of - %d",
                        testMethodName,
                        currentRepetition,
                        totalRepetitions));

    }

    @RepeatedTest(2)
    @DisplayName("Sample Test")
    void sampleTest() {
        Assertions.assertEquals(3, calculator.add(1, 2));
    }
}
