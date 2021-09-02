import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestInfoExample {
    TestInfoExample(TestInfo testInfo) {
        assertEquals("TestInfoExample", testInfo.getDisplayName());
    }

    @BeforeEach
    void init(TestInfo testInfo) {
        String displayName = testInfo.getDisplayName();
        assertTrue(displayName.equals("Test Name of the Method")
                || displayName.equals("testMethodName(TestInfo)")
                || displayName.equals("Test Method Name through getTestMethod()")
                || displayName.equals("Test Class Name")
                || displayName.equals("Test Tags present in the test"));
    }

    @Test
    @DisplayName("Test Name of the Method")
    void testDisplayNameOfTheTest(TestInfo testInfo) {
        assertEquals("Test Name of the Method", testInfo.getDisplayName());
    }

    @Test
    void testMethodName(TestInfo testInfo) {
        assertEquals("testMethodName(TestInfo)", testInfo.getDisplayName());
    }


    @Test
    @DisplayName("Test Tags present in the test")
    @Tag("test")
    void testTagsForTest(TestInfo testInfo) {
        assertEquals("Test Tags present in the test", testInfo.getDisplayName());
        assertTrue(testInfo.getTags().contains("test"));
    }

    @Test
    @DisplayName("Test Method Name through getTestMethod()")
    void testMethodNameThroughReflection(TestInfo testInfo) {
        String methodName = testInfo.getTestMethod()
                .get().getName();
        System.out.println(methodName);
        assertEquals("testMethodNameThroughReflection", methodName);
    }

    @Test
    @DisplayName("Test Class Name")
    void testClassName(TestInfo testInfo) {
        String name = testInfo.getTestClass().get().getName();
        System.out.println(name);
        assertEquals("TestInfoExample", name);
    }
}
