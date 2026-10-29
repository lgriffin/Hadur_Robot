package hadur117.mini;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The shipped JayLexi plays as its readable reference (JAYLEXI-11). */
class JayLexiReplayTest {

    static String shipped(long seed) throws Exception {
        return Replay.run(JayLexi.class, ReplayBot::new, seed, 6, 1500);
    }

    static String readable(long seed) throws Exception {
        return Replay.run(hadur117.mini.ref.JayLexi.class, hadur117.mini.ref.ReplayBot::new, seed, 6, 1500);
    }

    /** The first tick (line) where the two records differ, or -1. */
    static int firstDifference(String a, String b) {
        String[] x = a.split("\n", -1), y = b.split("\n", -1);
        for (int i = 0; i < Math.min(x.length, y.length); i++) {
            if (!x[i].equals(y[i])) {
                return i;
            }
        }
        return x.length == y.length ? -1 : Math.min(x.length, y.length);
    }

    @Test
    @Tag("JAYLEXI-11")
    @DisplayName("the shipped code gives the readable reference's orders, bit for bit, on seeded scripts")
    void sameOrders() throws Exception {
        for (long seed = 1; seed <= 3; seed++) {
            String a = shipped(seed), b = readable(seed);
            assertTrue(a.contains("f") && a.contains("ce"), "the script fires and passes waves");
            assertEquals(-1, firstDifference(a, b), "seed " + seed + ": first tick whose orders differ");
        }
    }

    @Test
    @Tag("JAYLEXI-11")
    @DisplayName("the replay tells builds apart: another seed gives other orders")
    void replayDiscriminates() throws Exception {
        assertNotEquals(-1, firstDifference(shipped(1), shipped(2)));
    }
}
