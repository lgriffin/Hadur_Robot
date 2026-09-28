package hadur2;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** TIME-5: the throwaway warm-up tick run before the real battle starts. */
class HadurWarmUpTest {

    @Test
    @Tag("TIME-5")
    @DisplayName("TIME-5: the warm-up tick runs to completion and never throws out of the battle's start")
    void warmUpNeverThrows() {
        assertDoesNotThrow(() -> Hadur.warmUp(800, 600, 1));
        // Idempotent: nothing it touches is static, so running it again is just as safe.
        assertDoesNotThrow(() -> Hadur.warmUp(1000, 1000, 3));
    }
}
