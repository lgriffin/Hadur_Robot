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
            String b = readable(seed);
            int shots = Replay.shots, passed = Replay.passed;
            String a = shipped(seed);
            assertTrue(shots > 0 && passed > 0, "the script fires and passes waves");
            assertEquals(shots, Replay.shots);
            assertEquals(passed, Replay.passed);
            assertEquals(-1, firstDifference(a, b), "seed " + seed + ": first tick whose orders differ");
        }
    }

    @Test
    @Tag("JAYLEXI-11")
    @DisplayName("the two also agree against a robot with its own aim row, which plays other orders than the field's row")
    void sameOrdersOnARecordedRow() throws Exception {
        String field = shipped(1);
        Replay.name = recordedName();
        try {
            assertEquals(-1, firstDifference(shipped(1), readable(1)));
            assertNotEquals(-1, firstDifference(field, shipped(1)), "the row changes the orders");
        } finally {
            Replay.name = "e";
        }
    }

    @Test
    @Tag("JAYLEXI-11")
    @DisplayName("the two also agree against a robot with an orbit angle of its own, which plays other orders than 1.15")
    void sameOrdersOnAnOrbitRow() throws Exception {
        String field = shipped(1);
        Replay.name = orbitName();
        try {
            assertEquals(-1, firstDifference(shipped(1), readable(1)));
            assertNotEquals(-1, firstDifference(field, shipped(1)), "the orbit changes the orders");
        } finally {
            Replay.name = "e";
        }
    }

    @Test
    @Tag("JAYLEXI-19")
    @DisplayName("the aim jitter rides BulletCatcher's orbit char alone, and its orbit stays 2 pi from a picked one")
    void jitterOnlyAgainstTheCatcher() {
        int k = JayLexi.NAMES.indexOf((char) "rsim.mini.BulletCatcher 0.4".hashCode());
        assertTrue(k >= 0, "BulletCatcher has a row");
        for (int i = 0; i < JayLexi.ORB.length(); i++) {
            int c = JayLexi.ORB.charAt(i);
            assertEquals(i == k + 1, c >= 400, "row " + i);
        }
        double orbit = (JayLexi.ORB.charAt(k + 1) - 2 * Math.PI * 100) / 100.0;
        assertEquals(1.15, orbit, 0.005, "1.15 plus 2 pi, to 0.003 rad");
    }

    /** A name whose row has an orbit other than 1.15. */
    static String orbitName() {
        for (int i = 0; ; i++) {
            String n = "e" + i;
            int k = JayLexi.NAMES.indexOf((char) n.hashCode());
            if (k >= 0 && JayLexi.ORB.charAt(k + 1) != 115) {
                return n;
            }
        }
    }

    /** A name whose hash has a row in AIM. */
    static String recordedName() {
        for (int i = 0; ; i++) {
            String n = "e" + i;
            if (JayLexi.NAMES.indexOf((char) n.hashCode()) >= 0) {
                return n;
            }
        }
    }

    @Test
    @Tag("JAYLEXI-11")
    @DisplayName("the replay tells builds apart: the second wave at a third instead of a quarter gives other orders")
    void replayDiscriminates() throws Exception {
        String third = Replay.run(hadur117.mini.ref.JayLexi.class, hadur117.mini.ref.ReplayBot.Third::new, 1, 6, 1500);
        assertNotEquals(-1, firstDifference(readable(1), third));
    }
}
