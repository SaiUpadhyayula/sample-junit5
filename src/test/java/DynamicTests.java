import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

class DynamicTestExample {

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
    Iterator<DynamicTest> calculatorTests_Return_Iterator() {
        return Arrays.asList(
                DynamicTest.dynamicTest("addition", () -> Assertions.assertEquals(3, calculator.add(1, 2))),
                DynamicTest.dynamicTest("isEven", () -> Assertions.assertTrue(calculator.isEven(2))),
                DynamicTest.dynamicTest("divide", () -> Assertions.assertEquals(1, calculator.divide(2, 2)))
        ).iterator();
    }

    @TestFactory
    Iterable<DynamicTest> calculatorTests_Return_Iterable() {
        return Arrays.asList(
                DynamicTest.dynamicTest("addition", () -> Assertions.assertEquals(3, calculator.add(1, 2))),
                DynamicTest.dynamicTest("isEven", () -> Assertions.assertTrue(calculator.isEven(2))),
                DynamicTest.dynamicTest("divide", () -> Assertions.assertEquals(1, calculator.divide(2, 2)))
        );
    }

    @TestFactory
    Collection<DynamicTest> calculatorTests_Return_Collection() {
        return Arrays.asList(
                DynamicTest.dynamicTest("addition", () -> Assertions.assertEquals(3, calculator.add(1, 2))),
                DynamicTest.dynamicTest("isEven", () -> Assertions.assertTrue(calculator.isEven(2))),
                DynamicTest.dynamicTest("divide", () -> Assertions.assertEquals(1, calculator.divide(2, 2)))
        );
    }

    @TestFactory
    Stream<DynamicTest> calculatorTests_Return_Stream() {
        return Stream.of(
                DynamicTest.dynamicTest("addition", () -> Assertions.assertEquals(3, calculator.add(1, 2))),
                DynamicTest.dynamicTest("isEven", () -> Assertions.assertTrue(calculator.isEven(2))),
                DynamicTest.dynamicTest("divide", () -> Assertions.assertEquals(1, calculator.divide(2, 2)))
        );
    }

    @TestFactory
    DynamicTest[] calculatorTests_Return_Array() {
        return new DynamicTest[]{
                DynamicTest.dynamicTest("addition", () -> Assertions.assertEquals(3, calculator.add(1, 2))),
                DynamicTest.dynamicTest("isEven", () -> Assertions.assertTrue(calculator.isEven(2))),
                DynamicTest.dynamicTest("divide", () -> Assertions.assertEquals(1, calculator.divide(2, 2)))
        };
    }
}
