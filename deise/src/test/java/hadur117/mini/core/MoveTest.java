package hadur117.mini.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MoveTest {

    static final double[][] NO_WAVES = new double[4][];

    static double[][] bots(double[]... rows) {
        double[][] b = new double[16][];
        System.arraycopy(rows, 0, b, 0, rows.length);
        return b;
    }

    @Test
    @Tag("DEISE-1")
    @DisplayName("the ring reaches 0.45 of the target's distance, within 36 to 160 px")
    void reach() {
        assertEquals(36, Move.reach(10));
        assertEquals(90, Move.reach(200), 1e-9);
        assertEquals(160, Move.reach(Double.POSITIVE_INFINITY));
    }

    @Test
    @Tag("DEISE-1")
    @DisplayName("every candidate keeps off the walls")
    void candidatesKeepOffTheWalls() {
        double[] p = Move.best(20, 20, 160, bots(new double[] {500, 500, 100}), NO_WAVES, 0, 1);
        assertTrue(p[0] >= Gun.MARGIN && p[1] >= Gun.MARGIN && p[0] <= Gun.FIELD - Gun.MARGIN);
    }

    @Test
    @Tag("DEISE-2")
    @DisplayName("away from a lone opponent")
    void awayFromAnOpponent() {
        double[] p = Move.best(500, 500, 100, bots(new double[] {500, 600, 100}), NO_WAVES, 0, 1);
        assertTrue(p[1] < 500, "moved to " + p[1]);
    }

    @Test
    @Tag("DEISE-2")
    @DisplayName("a strong opponent pushes harder than a weak one, while the push weighs energy")
    void strongPushesHarder() {
        double[][] b = bots(new double[] {500, 650, 100}, new double[] {500, 350, 5});
        if (Move.ENERGY_PUSH) {
            double[] p = Move.best(500, 500, 60, b, NO_WAVES, 0, 2);
            assertTrue(p[1] < 500, "moved to " + p[1]);
        } else {
            // Flat since 0.3: two opponents equally far push equally, whatever their energy.
            assertEquals(Move.risk(500, 560, 0, 500, 500, b, NO_WAVES, 0, 2),
                Move.risk(500, 440, Math.PI, 500, 500, b, NO_WAVES, 0, 2), 1e-12);
        }
    }

    @Test
    @Tag("DEISE-3")
    @DisplayName("an opponent is likely aiming at us when no other robot is nearer to it")
    void aimsAtUs() {
        double[] a = {500, 800, 100};
        double[] near = {520, 780, 100};
        // We are at (500, 500), 300 from it.
        assertTrue(Move.aimsAtUs(a, 300, bots(a)));
        assertFalse(Move.aimsAtUs(a, 300, bots(a, near)));
    }

    @Test
    @Tag("DEISE-3")
    @DisplayName("across the line of a shooter is safer than along it, while the across term is on")
    void acrossNotAlong() {
        double[][] b = bots(new double[] {500, 900, 100});
        if (Move.ACROSS) {
            double along = Move.risk(500, 420, Math.PI, 500, 500, b, NO_WAVES, 0, 1);
            double across = Move.risk(580, 500, Math.PI / 2, 500, 500, b, NO_WAVES, 0, 1);
            assertTrue(across < along);
        } else {
            // Off since 0.3: the heading to a point no longer changes its risk.
            assertEquals(Move.risk(500, 420, Math.PI, 500, 500, b, NO_WAVES, 0, 1),
                Move.risk(500, 420, Math.PI / 2, 500, 500, b, NO_WAVES, 0, 1));
        }
    }

    @Test
    @Tag("DEISE-4")
    @DisplayName("corners pull while the field is crowded, not once it thins, while the corners are on")
    void cornersPullWhileCrowded() {
        double[][] b = bots();
        double corner = Move.risk(60, 60, 0, 100, 100, b, NO_WAVES, 0, Move.CROWD);
        double middle = Move.risk(500, 500, 0, 100, 100, b, NO_WAVES, 0, Move.CROWD);
        if (Move.CORNERS) {
            assertTrue(corner < middle);
        } else {
            // Off since 0.3: no pull at any crowd.
            assertEquals(corner, middle);
        }
        assertEquals(Move.risk(60, 60, 0, 100, 100, b, NO_WAVES, 0, Move.CROWD - 1),
            Move.risk(500, 500, 0, 100, 100, b, NO_WAVES, 0, Move.CROWD - 1));
    }

    @Test
    @Tag("DEISE-5")
    @DisplayName("a seen shot makes its head-on line dangerous, and off it safer")
    void waveDanger() {
        // Fired from (500, 900) at us at (500, 500), standing still: both lines point due south.
        double[] w = Move.wave(500, 900, 0, 2, 0, 0, 1);
        assertEquals(Math.PI, Math.abs(w[Move.HEAD_ON]), 1e-9);
        assertTrue(Move.danger(w, 500, 500, 5, 0) > 5 * Move.danger(w, 620, 500, 5, 0));
    }

    @Test
    @Tag("DEISE-5")
    @DisplayName("a moving target's second line leads it")
    void linearLineLeads() {
        double[] w = Move.wave(500, 900, 0, 2, 0, -8, 1);
        assertTrue(Math.sin(w[Move.LINEAR]) > Math.sin(w[Move.HEAD_ON]));
    }

    @Test
    @Tag("DEISE-5")
    @DisplayName("a wave past a point is no danger there, and is spent once past us")
    void passedWaves() {
        double[] w = Move.wave(500, 900, 0, 2, 0, 0, 1);
        assertEquals(0, Move.danger(w, 500, 500, 100, 0));
        assertFalse(Move.spent(w, 500, 500, 10));
        assertTrue(Move.spent(w, 500, 500, 100));
    }

    @Test
    @Tag("DEISE-5")
    @DisplayName("a shot from a robot likely aiming elsewhere counts a quarter")
    void weight() {
        double[] at = Move.wave(500, 900, 0, 2, 0, 0, 1);
        double[] away = Move.wave(500, 900, 0, 2, 0, 0, 0.25);
        assertEquals(0.25 * Move.danger(at, 500, 500, 5, 0), Move.danger(away, 500, 500, 5, 0), 1e-12);
    }
}
