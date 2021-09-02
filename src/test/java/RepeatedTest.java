import org.junit.jupiter.api.DisplayName;

class RepeatedTest {

    @org.junit.jupiter.api.RepeatedTest(value = 5, name = "{displayName} - repetition {currentRepetition}/{totalRepetitions}")
    @DisplayName("Repeated Addition 7 Times")
    void shouldTestAddition7Times() {
        // Some Test code
    }
}
