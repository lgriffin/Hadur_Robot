package hadur117.twin.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GunTest {

    static char[][] empty() {
        return new char[Gun.STATES][Gun.ROW + 1];
    }

    static int still() {
        return 1 + (8 << 2) + (2 << 7);
    }

    @Test
    @DisplayName("a still robot packs to speed 0, no turn, no acceleration")
    void stateOfAStillRobot() {
        assertEquals(still(), Gun.state(0, 0, 1, 1));
        int s = Gun.state(8, 8, 0, Math.toRadians(4));
        assertEquals(16, (s >> 2) & 31);
        assertTrue(s < Gun.STATES);
    }

    @Test
    @DisplayName("a cold gun aims straight at a still robot")
    void coldAimAtAStillRobot() {
        double a = Gun.aim(empty(), still(), 0, 400, 100, 400, 500, 0, 0, 2);
        assertEquals(0, Gun.normalRelativeAngle(a), 2 * Math.PI / Gun.BINS);
    }

    @Test
    @Tag("TWIN-6")
    @DisplayName("a relayed scan plays the robot forward by its age")
    void relayedScanLeadsByAge() {
        // Moving east at 8: an older scan must lead further east.
        int s = 1 + (16 << 2) + (2 << 7);
        double fresh = Gun.aim(empty(), s, 0, 400, 100, 300, 500, Math.PI / 2, 8, 2);
        double old = Gun.aim(empty(), s, 3, 400, 100, 300, 500, Math.PI / 2, 8, 2);
        assertTrue(Gun.normalRelativeAngle(old) > Gun.normalRelativeAngle(fresh), fresh + " " + old);
    }

    @Test
    @Tag("TWIN-6")
    @DisplayName("a row records up to its size, then walks a ring of the newest samples")
    void recordIsARing() {
        char[] row = new char[Gun.ROW + 1];
        for (int i = 0; i < 3 * Gun.ROW + 5; i++) {
            Gun.record(row, i % 500);
        }
        assertEquals(3 * Gun.ROW + 5, row[Gun.ROW]);
        // The newest sample sits just before the write position.
        int newest = (3 * Gun.ROW + 4) % 500;
        assertEquals(newest, row[(row[Gun.ROW] - 1) % Gun.ROW]);
    }

    @Test
    @DisplayName("a learned turn steers the aim off the circular line")
    void learnedRowSteersTheAim() {
        char[][] t = empty();
        int straight = 1 + (16 << 2) + (2 << 7);
        int hardLeft = 1 + (16 << 2) + (0 << 7);
        for (int i = 0; i < 20; i++) {
            Gun.record(t[straight], hardLeft);
            Gun.record(t[hardLeft], hardLeft);
        }
        double cold = Gun.aim(empty(), straight, 0, 400, 100, 400, 500, Math.PI / 2, 8, 2);
        double warm = Gun.aim(t, straight, 0, 400, 100, 400, 500, Math.PI / 2, 8, 2);
        assertTrue(Math.abs(Gun.normalRelativeAngle(warm - cold)) > 0.05, cold + " " + warm);
    }
}
