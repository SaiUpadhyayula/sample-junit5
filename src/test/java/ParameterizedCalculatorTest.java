import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.EnumSet;

class ParameterizedCalculatorTest {

    @ParameterizedTest
    @DisplayName("Test Even Numbers")
    @ValueSource(ints = {2, 4, 6, 8, 1024})
    void shouldTestEvenNumbers(int input) {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        boolean result = calculator.isEven(input);

        // Assert
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @DisplayName("Should Test using EnumSource annotation")
    @EnumSource(Calculator.Operation.class)
    void shouldTestUsingEnumSource(Calculator.Operation operation) {
        Assertions.assertTrue(EnumSet.of(Calculator.Operation.ADDITION,
                Calculator.Operation.MULTIPLICATION,
                Calculator.Operation.SUBTRACTION,
                Calculator.Operation.DIVISION).contains(operation));
    }


    @ParameterizedTest
    @DisplayName("Should Test using CsvSource annotation")
    @CsvSource({"2,Hi", "5,Hello", "11,Hello World"})
    void shouldTestUsingCsvSource(int length, String text) {
        Assertions.assertEquals(text.length(), length);
    }
}
