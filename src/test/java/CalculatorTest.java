import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {

    private Calculator calculator;
    private int counter;

    @BeforeAll
    public void setupAll() {
        System.out.println("Setup All - Initializing the Test class");
        System.out.println("Counter Value is - " + counter);
    }

    @BeforeEach
    public void setup() {
        System.out.println("Setup Test - Initializing the Calculator object");
        calculator = new Calculator();

        counter++;
    }

    @Test
    @DisplayName("Test Addition of 2 Integers")
    void shouldTestIntegerAddition() {

        // Act
        int result = calculator.add(1, 2);

        // Assert
        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("Test Division of 2 Integers")
    void shouldTestIntegerDivision() {


        // Act
        int result = calculator.divide(10, 2);

        // Assert
        Assertions.assertEquals(5, result);
    }

    @AfterEach
    public void cleanup() {
        System.out.println("Cleaning up resources after each test");
    }

    @AfterAll
    public void cleanupAll() {
        System.out.println("Cleaning up resources after test class execution");

        System.out.println("Counter Value is - " + counter);
    }
}
