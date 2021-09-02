import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Iterator;

class FirstDynamicTest {

    private final Calculator calculator = new Calculator();

    @BeforeAll
    static void setupClass() {
        System.out.println("Inside @BeforeAll method");
    }

    @AfterAll
    static void tearDownClass() {
        System.out.println("Inside @AfterAll method");
    }

    @BeforeEach
    void setup() {
        System.out.println("Inside @BeforeEach method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Inside @AfterEach method");
    }

    @TestFactory
    Iterator<DynamicTest> calculatorTests() {
        return Arrays.asList(
                DynamicTest.dynamicTest("addition", () -> Assertions.assertEquals(3, calculator.add(1, 2))),
                DynamicTest.dynamicTest("isEven", () -> Assertions.assertTrue(calculator.isEven(2))),
                DynamicTest.dynamicTest("divide", () -> Assertions.assertEquals(1, calculator.divide(2, 2)))
        ).iterator();
    }
}
