package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import hadur2.core.physics.Angles;

class MeleeControllerTest {

    private final MeleeController controller = new MeleeController(field(800, 600));
    private final Point2D.Double me = pt(400, 300);

    private MeleeController.Command tick(long time, int others) {
        return controller.tick(new MeleeController.Situation(me, 0, 0, 100, time, others));
    }

    @Test
    @Tag("MRADAR-1")
    void doesNothingButSweepUntilItSeesSomeone() {
        MeleeController.Command c = tick(0, 3);
        assertTrue(Double.isInfinite(c.radarTurn));
        assertNull(c.destination);
        assertNull(c.target);
        assertEquals(0, c.firePower);
    }

    @Test
    @Tag("MMOVE-1")
    void movesAimsAndFiresAtAFreshTarget() {
        scan(controller.tracker, "a", 400, 500, 20, 0);
        scan(controller.tracker, "b", 100, 100, 100, 0);
        scan(controller.tracker, "c", 700, 100, 100, 0);
        MeleeController.Command c = tick(1, 3);
        assertEquals("a", c.target);
        assertNotNull(c.destination);
        assertTrue(c.firePower > 0);
        assertEquals(0, Angles.normalRelativeAngle(c.gunTurn
            - DiaUtils.absoluteBearing(me, pt(400, 500))), 1e-9);
    }

    @Test
    @Tag("MELEE-7")
    void holdsFireOnAStaleScan() {
        scan(controller.tracker, "a", 400, 500, 20, 0);
        scan(controller.tracker, "b", 100, 100, 100, 0);
        scan(controller.tracker, "c", 700, 100, 100, 0);
        MeleeController.Command c = tick(MeleeController.MAX_FIRE_AGE + 1, 3);
        assertEquals("a", c.target);
        assertEquals(0, c.firePower);
    }

    @Test
    @Tag("MGUN-2")
    void neverFiresMoreThanNeededToKill() {
        scan(controller.tracker, "a", 400, 450, 1.0, 0);
        scan(controller.tracker, "b", 100, 100, 100, 0);
        scan(controller.tracker, "c", 700, 100, 100, 0);
        assertEquals(MeleeEnergyPolicy.killPower(1.0), tick(0, 3).firePower, 1e-9);
    }

    @Test
    @Tag("MSENSE-1")
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
