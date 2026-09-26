package hadur117.melee;

import static hadur117.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import hadur117.utils.DiaUtils;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.Test;
import robocode.util.Utils;

class MeleeControllerTest {

    private final MeleeController controller = new MeleeController(field(800, 600));
    private final Point2D.Double me = pt(400, 300);

    private MeleeController.Command tick(long time, int others) {
        return controller.tick(new MeleeController.Situation(me, 0, 0, 100, time, others));
    }

    @Test
    void doesNothingButSweepUntilItSeesSomeone() {
        MeleeController.Command c = tick(0, 3);
        assertTrue(Double.isInfinite(c.radarTurn));
        assertNull(c.destination);
        assertNull(c.target);
        assertEquals(0, c.firePower);
    }

    @Test
    void movesAimsAndFiresAtAFreshTarget() {
        scan(controller.tracker, "a", 400, 500, 20, 0);
        scan(controller.tracker, "b", 100, 100, 100, 0);
        scan(controller.tracker, "c", 700, 100, 100, 0);
        MeleeController.Command c = tick(1, 3);
        assertEquals("a", c.target);
        assertNotNull(c.destination);
        assertTrue(c.firePower > 0);
        assertEquals(0, Utils.normalRelativeAngle(c.gunTurn
            - DiaUtils.absoluteBearing(me, pt(400, 500))), 1e-9);
    }

    @Test
    void holdsFireOnAStaleScan() {
        scan(controller.tracker, "a", 400, 500, 20, 0);
        scan(controller.tracker, "b", 100, 100, 100, 0);
        scan(controller.tracker, "c", 700, 100, 100, 0);
        MeleeController.Command c = tick(MeleeController.MAX_FIRE_AGE + 1, 3);
        assertEquals("a", c.target);
        assertEquals(0, c.firePower);
    }

    @Test
    void neverFiresMoreThanNeededToKill() {
        scan(controller.tracker, "a", 400, 450, 1.0, 0);
        scan(controller.tracker, "b", 100, 100, 100, 0);
        scan(controller.tracker, "c", 700, 100, 100, 0);
        assertEquals(MeleeGun.killPower(1.0), tick(0, 3).firePower, 1e-9);
    }

    @Test
    void retargetsTheTickAfterATargetDies() {
        scan(controller.tracker, "a", 400, 500, 20, 0);
        scan(controller.tracker, "b", 100, 100, 60, 0);
        scan(controller.tracker, "c", 700, 100, 100, 0);
        assertEquals("a", tick(0, 3).target);
        controller.onRobotDeath("a");
        assertEquals("b", tick(1, 2).target);
    }

    @Test
    void newRoundForgetsOpponents() {
        scan(controller.tracker, "a", 400, 500, 20, 0);
        controller.newRound();
        assertNull(tick(0, 3).target);
    }
}
