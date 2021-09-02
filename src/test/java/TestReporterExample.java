import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;
import java.util.Map;

class TestReporterExample {
    @Test
    void testReportSingleValue(TestReporter testReporter) {
        testReporter.publishEntry("Some text");
    }

    @Test
    void reportKeyValuePair(TestReporter testReporter) {
        testReporter.publishEntry("Key", "Value");
    }

    @Test
    void reportKeyValuePairMap(TestReporter testReporter) {
        Map<String, String> values = new HashMap<>();
        values.put("user", "John");
        values.put("email", "johndoe@gmail.com");

        testReporter.publishEntry(values);
    }
}
