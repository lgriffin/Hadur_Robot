package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The bench's wave fidelity scoring (WAVE-1): real shots {round, turn, power, disabled}. */
@Tag("WAVE-1")
class WaveMatcherTest {

    @Test
    @DisplayName("a wave matches the real shot one turn after its fire tick, within the window")
    void matchesWithinWindow() {
        List<double[]> shots = List.of(new double[] {0, 11, 1.9, 0}, new double[] {0, 40, 3.0, 0});
        List<double[]> waves = List.of(new double[] {0, 10, 1.9}, new double[] {0, 45, 3.0});
        assertArrayEquals(new boolean[] {true, false}, WaveMatcher.matchedShots(shots, waves));
    }

    @Test
    @DisplayName("power, round and one-to-one pairing are all required")
    void strictPairing() {
        List<double[]> shots = List.of(new double[] {0, 11, 1.0, 0});
        assertEquals(0, WaveMatcher.match(shots, List.of(new double[] {0, 10, 1.5})));
        assertEquals(0, WaveMatcher.match(shots, List.of(new double[] {1, 10, 1.0})));
        assertEquals(1, WaveMatcher.match(shots,
            List.of(new double[] {0, 10, 1.0}, new double[] {0, 10, 1.0})));
    }
}
