package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** END-4's engine check does not accept missing observations as proof. */
class InactivityCheckTest {

    @Test
    @Tag("END-4")
    @DisplayName("END-4: a case with no completion, no energy gap, no death or an engine error is invalid")
    void missingObservationsAreInvalid() {
        assertNull(InactivityCheck.problemWith(true, null, 0.1, 440, -1));
        assertNull(InactivityCheck.problemWith(true, null, 0, -1, 500));
        assertNotNull(InactivityCheck.problemWith(false, null, 0.1, 440, -1), "aborted");
        assertNotNull(InactivityCheck.problemWith(true, "boom", 0.1, 440, -1), "engine error");
        assertNotNull(InactivityCheck.problemWith(true, null, Double.NaN, 440, -1), "no gap");
        assertNotNull(InactivityCheck.problemWith(true, null, 0.1, -1, -1), "nobody died: idler 'survived' by default");
    }
}
