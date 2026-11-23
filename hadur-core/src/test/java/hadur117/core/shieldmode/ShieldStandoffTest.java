package hadur117.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * SHIELD-34's standoff. The opponent stands still at (400, 500) on an 800 x 600 field; every gun
 * starts a round at heat 3.0, so at cooling 0.1 the enemy's gun is ready at tick 30 and the
 * standoff stands still from tick 25.
 */
class ShieldStandoffTest {

    private static final double ENEMY_X = 400, ENEMY_Y = 500;
    private static final double W = 800, H = 600;
    private static final String LISTED = "list.Target 1.0";

    private static ShieldMode mode(String design) {
        List<String> records = new ArrayList<>();
        return new ShieldMode(ShieldList.parse(List.of("list.Target")), records::add, 35, ShieldDesign.parse(design));
    }

    private static void scan(ShieldMode m, double x, double y, long time) {
        m.onScan(LISTED, time, x, y, 0, 0, ENEMY_X, ENEMY_Y, Math.PI, 0);
    }

    /** Us at (400, y): {@code 500 - y} px south of the enemy. */
    private static ShieldMode.Situation at(long time, double y) {
        return new ShieldMode.Situation(time, 400, y, 0, 0, 0, 0.1, 100, ENEMY_X, ENEMY_Y,
            100, 0, 1.9, false, true, W, H);
    }

    @Test
    @Tag("SHIELD-34")
    @DisplayName("the standoff switch parses, stays out of 'all' and off the shipped design")
    void parses() {
        ShieldDesign d = ShieldDesign.parse("prior,standoff");
        assertTrue(d.standoff && d.prior);
        assertEquals("prior,standoff", d.toString());
        assertFalse(ShieldDesign.parse("all").standoff);
        assertFalse(ShieldDesign.SHIPPED.standoff);
        assertFalse(ShieldDesign.NONE.standoff);
    }

    @Test
    @Tag("SHIELD-34")
    @DisplayName("inside 150 px it drives away while the enemy's gun cools, and stands still 5 ticks before it is ready")
    void drivesWhenClose() {
        ShieldMode m = mode("stay,standoff");
        scan(m, 400, 400, 1);
        for (long t = 2; t < 25; t++) {
            ShieldMode.Command c = m.tick(at(t, 400));
            assertEquals(ShieldMode.MOVE_AHEAD, Math.abs(c.ahead), 1e-9, "tick " + t);
            assertTrue(Math.cos(c.bodyTurn) * Math.signum(c.ahead) < 0, "south, away from the enemy");
            assertEquals(0, c.firePower, 0.0, "no shot while driving");
        }
        assertEquals(0, m.tick(at(25, 400)).ahead, 0.0, "still from tick 25");
    }

    @Test
    @Tag("SHIELD-34")
    @DisplayName("once started it keeps driving until 190 px, and never starts beyond 150 px")
    void hysteresis() {
        ShieldMode m = mode("stay,standoff");
        scan(m, 400, 400, 1);
        assertEquals(ShieldMode.MOVE_AHEAD, Math.abs(m.tick(at(2, 400)).ahead), 1e-9, "100 px: drives");
        assertEquals(ShieldMode.MOVE_AHEAD, Math.abs(m.tick(at(3, 330)).ahead), 1e-9, "170 px: still driving");
        assertEquals(0, m.tick(at(4, 300)).ahead, 0.0, "200 px: stands");
        assertEquals(0, m.tick(at(5, 330)).ahead, 0.0, "170 px again: does not restart");

        ShieldMode far = mode("stay,standoff");
        scan(far, 400, 100, 1);
        assertEquals(0, far.tick(at(2, 100)).ahead, 0.0, "400 px: stands");
    }

    @Test
    @Tag("SHIELD-34")
    @DisplayName("without the switch shield mode stands still at close range")
    void offStandsStill() {
        ShieldMode m = mode("stay");
        scan(m, 400, 400, 1);
        assertEquals(0, m.tick(at(2, 400)).ahead, 0.0);
    }
}
