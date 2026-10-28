package hadur117.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import net.jqwik.api.Example;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Size;

/**
 * SHIELD-10: {@link ModalOffset} against a brute-force count over the kept window, on values
 * drawn from a few clusters so that repeats within the tolerance are common.
 */
class ModalOffsetProperties {

    private static final double TOL = 1e-5;

    /** The brute-force mode of the last {@code capacity} values: most neighbours, latest on a tie. */
    private static double bruteMode(List<Double> all, int capacity) {
        List<Double> kept = all.subList(Math.max(0, all.size() - capacity), all.size());
        int best = -1;
        int bestCount = -1;
        for (int i = 0; i < kept.size(); i++) {
            int n = 0;
            for (double v : kept) if (Math.abs(v - kept.get(i)) < TOL) n++;
            if (n >= bestCount) {
                best = i;
                bestCount = n;
            }
        }
        return best < 0 ? 0 : kept.get(best);
    }

    @Property
    @Tag("SHIELD-10")
    void matchesBruteForce(@ForAll @Size(max = 60) List<@IntRange(min = 0, max = 4) Integer> clusters,
                           @ForAll @IntRange(min = 1, max = 12) int capacity) {
        ModalOffset m = new ModalOffset(capacity, TOL);
        List<Double> all = new ArrayList<>();
        for (int i = 0; i < clusters.size(); i++) {
            // Cluster c sits at 0.01 * c, with a jitter well inside the tolerance.
            double v = 0.01 * clusters.get(i) + 1e-7 * (i % 3);
            all.add(v);
            assertEquals(bruteMode(all, capacity), m.add(v), 0, "after " + (i + 1) + " values");
            assertEquals(Math.min(all.size(), capacity), m.size());
        }
    }

    @Example
    @Tag("SHIELD-10")
    void emptyIsZeroAndOneStrayDoesNotMoveIt() {
        ModalOffset m = new ModalOffset(500, TOL);
        assertEquals(0, m.mode(), 0);
        m.add(0.02);
        m.add(0.02);
        assertEquals(0.02, m.add(-0.5), 0);
        assertTrue(m.size() == 3);
    }
}
