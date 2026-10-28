package hadur117.mini.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GunTest {

    static char[][] empty() {
        return new char[Gun.STATES][Gun.ROW + 1];
    }

    static double off(double a, double b) {
        double d = (a - b) % (2 * Math.PI);
        return Math.abs(d > Math.PI ? d - 2 * Math.PI : d < -Math.PI ? d + 2 * Math.PI : d);
    }

    static final int STILL = Gun.state(0, 0, 0);

    @Test
    @Tag("DEISE-6")
    @DisplayName("a state packs acceleration, speed and turn, and stays inside the table")
    void statePacksATick() {
        assertEquals(1 + (8 << 2) + (2 << 7), STILL);
        int s = Gun.state(8, 7, Gun.turnRate(7));
        assertEquals(2, s & 3);
        assertEquals(16, (s >> 2) & 31);
        assertEquals(4, s >> 7);
        assertTrue(Gun.state(-8, 8, -1) < Gun.STATES);
        assertTrue(Gun.state(8, -8, 1) < Gun.STATES);
    }

    @Test
    @Tag("DEISE-6")
    @DisplayName("learning fills a row, then replaces a random sample")
    void learningFillsThenReplaces() {
        char[][] t = empty();
        Random r = new Random(1);
        for (int i = 0; i < Gun.ROW; i++) {
            Gun.learn(t, STILL, 7, r);
        }
        assertEquals(Gun.ROW, t[STILL][Gun.ROW]);
        Gun.learn(t, STILL, 9, r);
        assertEquals(Gun.ROW, t[STILL][Gun.ROW]);
        int nines = 0;
        for (int i = 0; i < Gun.ROW; i++) {
            nines += t[STILL][i] == 9 ? 1 : 0;
        }
        assertEquals(1, nines);
    }

    @Test
    @Tag("DEISE-7")
    @DisplayName("a cold gun aims straight at a still robot")
    void coldAimAtAStillRobot() {
        double a = Gun.aim(empty(), STILL, 500, 800, 0, 0, 500, 400, 400, 2, 32, new Random(1));
        assertTrue(off(a, 0) < 2 * Math.PI / Gun.BINS * 2, "aim " + a);
    }

    @Test
    @Tag("DEISE-7")
    @DisplayName("a cold gun leads a robot circling at full speed, as a circle")
    void coldAimLeadsACircle() {
        int turning = Gun.state(8, 8, Gun.turnRate(8));
        // East at 8 a tick, 400 px north of us, turning right (clockwise): it ends south-east of its line.
        double a = Gun.aim(empty(), turning, 500, 800, Math.PI / 2, 8, 500, 400, 400, 2, 32, new Random(1));
        assertTrue(a > 0.2 && a < Math.PI / 2, "aim " + a);
    }

    @Test
    @Tag("DEISE-8")
    @DisplayName("a thin row votes less than a warm one")
    void thinRowVotesLess() {
        char[][] t = empty();
        int stop = Gun.state(0, 8, 0);
        int run = Gun.state(8, 8, 0);
        Random r = new Random(3);
        // Two in three successors go through a one-sample row that stops; one in three through
        // an eight-sample row that keeps running north.
        for (int i = 0; i < 2; i++) {
            Gun.learn(t, run, stop, r);
        }
        Gun.learn(t, run, run, r);
        Gun.learn(t, stop, stop, r);
        for (int i = 0; i < 8; i++) {
            Gun.learn(t, run, run, r);
        }
        // Moving north at 8, 400 px east of us.
        double still = Math.atan2(400, 0);
        int stops = 0;
        for (int i = 0; i < 20; i++) {
            double a = Gun.aim(t, run, 900, 400, 0, 8, 500, 400, 400, 2, 64, new Random(i));
            stops += off(a, still) < 0.02 ? 1 : 0;
        }
        assertTrue(stops <= 2, "aimed at the stop " + stops + " of 20");
    }

    @Test
    @Tag("DEISE-9")
    @DisplayName("a vote covers the target's width: wider up close")
    void voteCoversTheTargetsWidth() {
        // A cold aim at a still robot at 100 px and at 600 px both centre on it.
        assertTrue(off(Gun.aim(empty(), STILL, 500, 500, 0, 0, 500, 400, 100, 2, 8, new Random(1)), 0) < 0.03);
        assertTrue(off(Gun.aim(empty(), STILL, 500, 1000 - 20, 0, 0, 500, 380, 600, 2, 8, new Random(1)), 0) < 0.01);
    }

    @Test
    @Tag("DEISE-10")
    @DisplayName("power: range power, the crowd cap, and no more than kills the target while the kill cap is on")
    void power() {
        assertEquals(Math.log10(100) * 325 / 400, Gun.power(100, 100, 400, 9), 1e-9);
        assertEquals(1.9, Gun.power(100, 100, 100, 2), 1e-9);
        if (Gun.KILL) {
            assertEquals(0.5, Gun.power(100, 2, 100, 9), 1e-9);
            assertEquals(2, Gun.power(100, 10, 100, 9), 1e-9);
            assertEquals(0.1, Gun.power(100, 0.1, 100, 9), 1e-9);
        } else {
            // The kill cap is off since 0.3: a weak target draws the range power.
            assertEquals(Math.log10(100) * 325 / 400, Gun.power(100, 2, 400, 9), 1e-9);
        }
        // Close, healthy, a full field: the crowd cap allows 4.9; Robocode fires 3 at most.
        assertEquals(3, Gun.power(100, 100, 50, 9), 1e-9);
    }
}
