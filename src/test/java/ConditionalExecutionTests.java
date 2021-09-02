import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class NestedConditionalTests {

    @DisplayName("OS Conditional Execution Tests")
    @Nested
    class OSConditionalTests {
        @Test
        @DisplayName("Run the tests only on Linux and MAC OS")
        @EnabledOnOs({OS.LINUX, OS.MAC})
        void shouldRunTestsOnlyOnLinuxAndMACOS() {
            // Some Test Code
        }

        @Test
        @DisplayName("Should not Run on Windows OS")
        @DisabledOnOs(OS.WINDOWS)
        void shouldNotRunOnWindowsOS() {
            // Some Test Code
        }

        @Test
        @DisplayName("Should Run on Windows OS")
        @EnabledOnOs(OS.WINDOWS)
        void shouldRunOnWindowsOS() {
            // Some Test Code
        }
    }

    @DisplayName("JRE Conditional Execution Tests")
    @Nested
    class JREConditionalTests {
        @Test
        @DisplayName("Should Run only on JRE 17")
        @EnabledOnJre(JRE.JAVA_17)
        void shouldRunOnJre17() {
            // Some Test Code
        }

        @Test
        @DisplayName("Should Run on Java version from 8 to 17")
        @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
        void shouldRunOnJreFrom8to17() {
            // Some Test Code
        }

        @Test
        @DisplayName("Should Not Run on JRE 16")
        @DisabledOnJre(JRE.JAVA_16)
        void shouldNotRunOnJRE16() {
            // Some Test Code
        }

        @Test
        @DisplayName("Should Run on Java version from 8 to 15")
        @DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_15)
        void shouldNotRunOnJreFrom8to15() {
            // Some Test Code
        }
    }

    @DisplayName("System Property Conditional Execution Tests")
    @Nested
    class SystemPropertyConditionalTests {
        @Test
        @DisplayName("Should Run on 64 Bit Architecture")
        @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
        void enableOn64BitMachines() {
            // Some Test Code
        }

        @Test
        @DisplayName("Should Run on 64 Bit Architecture")
        @DisabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
        void disableOn64BitMachines() {
            // Some Test Code
        }
    }

    @DisplayName("Custom Condition Execution Tests")
    @Nested
    class CustomConditionalTests {
        @Test
        @DisplayName("Run Test if Custom Condition Matches")
        @EnabledIf("customCondition")
        void runTestIfCustomConditionMatches() {
            // Some Test Code
        }

        @Test
        @DisplayName("Do Not Run Test if Custom Condition Matches")
        @DisabledIf("customCondition")
        void doNorunTestIfCustomConditionMatches() {
            // Some Test Code
        }

        boolean customCondition() {
            return true;
        }
    }
}
