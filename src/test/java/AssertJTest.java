import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertJTest {

    @Test
    @DisplayName("Test Drive AssertJ Assertions")
    void assertJTest() {
        int a = 10;
        Assertions.assertThat(a).isEqualTo(10);

        org.junit.jupiter.api.Assertions.assertEquals(10, a);

        String name = "John";

        Assertions.assertThat(name)
                .isEqualTo("John")
                .hasSize(4)
                .startsWith("K")
                .endsWith("n");
    }
}
