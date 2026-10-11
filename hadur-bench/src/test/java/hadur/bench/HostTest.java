package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * BENCH-12: a bench report should say which machine made the numbers (issue #102), so
 * {@link Host} must be able to describe this one.
 */
@Tag("BENCH-12")
class HostTest {

    @Test
    @DisplayName("describe names the logical cores and the OS")
    void describeNamesTheLogicalCoresAndTheOs() {
        String description = Host.describe();
        assertFalse(description.isBlank());
        assertTrue(description.contains("logical cores"));
        assertTrue(description.contains(System.getProperty("os.name")));
    }

    @Test
    @DisplayName("cpuModel is not blank")
    void cpuModelIsNotBlank() {
        assertFalse(Host.cpuModel().isBlank());
    }
}
