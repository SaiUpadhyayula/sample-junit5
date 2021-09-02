import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TaggedTests {

    @DisplayName("Should Run the Tagged Test")
    @Tag("test")
    @Test
    void shouldRunTaggedTest() {
        // Some Test Code
    }

    @DisplayName("Sample Test")
    @Test
    void shouldRunSampleTest() {
        // Some Test Code
    }
}
