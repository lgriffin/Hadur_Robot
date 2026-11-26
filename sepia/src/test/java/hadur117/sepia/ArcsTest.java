package hadur117.sepia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ArcsTest {

    @Test
    @Tag("INK-5")
    @DisplayName("a certain shadow counts 1 and a possible one a half")
    void certainCountsWholePossibleHalf() {
        List<double[]> certain = List.of(new double[] {0.0, 0.25});
        List<double[]> possible = List.of(new double[] {0.0, 0.25}, new double[] {0.5, 1.0});
        assertEquals(0.25 + 0.5 / 2, Arcs.shade(0, 1, certain, possible), 1e-12);
    }

    @Test
    @Tag("INK-5")
    @DisplayName("overlaps count once, and intervals across the seam are unwrapped")
    void unionAcrossSeam() {
        List<double[]> arcs = List.of(new double[] {3.0, 3.2}, new double[] {3.1, 3.3},
            new double[] {-3.1, -3.0});
        // [3.0, 3.3] and -3.1 + 2 pi = 3.183.. to 3.283.., all inside [3.0, 3.4]
        assertEquals(0.3, Arcs.covered(3.0, 3.4, arcs), 1e-9);
        assertEquals(0.0, Arcs.covered(1.0, 1.0, arcs), 0.0);
    }
}
