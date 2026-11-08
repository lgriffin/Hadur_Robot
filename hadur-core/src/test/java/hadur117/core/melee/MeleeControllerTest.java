package hadur117.core.melee;

import hadur117.core.world.EnemyInfo;
import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import hadur117.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import hadur117.core.physics.Angles;

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
    @Tag("MGUN-5")
    void keepsFiringTheTablesPowerWhileOthersFight() {
        // a and b, 100 px apart and both losing energy, fight each other; every opponent is
        // over 400 px away, where Hadur used to hold fire while it let them fight.
        scan(controller.tracker, "a", 20, 20, 100, 0);
        scan(controller.tracker, "b", 20, 120, 100, 0);
        scan(controller.tracker, "c", 780, 580, 100, 0);
        scan(controller.tracker, "a", 20, 20, 88, 10);
        scan(controller.tracker, "b", 20, 120, 90, 10);
        scan(controller.tracker, "c", 780, 580, 100, 10);
        MeleeController.Command c = tick(10, 3);
        assertEquals(MeleeStrategy.Posture.LET_THEM_FIGHT, c.posture);
        EnemyInfo target = controller.tracker.get(c.target);
        assertTrue(target.distance(me) > 400);
        FieldGun.Aim aim = controller.gun().aim(me, 100, 3, controller.tracker.alive(), 10);
        double table = Math.min(aim.power, MeleeEnergyPolicy.killPower(target.energy));
        assertTrue(table > 0);
        assertEquals(table, c.firePower, 1e-9);
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

    @Test
    @Tag("MMOVE-26")
    void recordsWhatTheSurferSawOfEachHit() {
        scan(controller.tracker, "a", 400, 500, 100, 0);
        scan(controller.tracker, "b", 100, 100, 100, 0);
        scan(controller.tracker, "c", 200, 150, 100, 0);
        tick(0, 3);
        // a fires power 3 at tick 0 with nobody nearer it than Hadur: the whole shot is ours.
        scan(controller.tracker, "a", 400, 500, 97, 1);
        for (int t = 1; t <= 18; t++) tick(t, 3);
        controller.hitByBullet("a", 3, Math.PI, me, 18);
        MeleeController.Hit hit = controller.takeHit();
        assertNotNull(hit);
        assertEquals("a", hit.shooter);
        assertTrue(hit.seen);
        assertEquals(0, hit.nearer);
        assertEquals(1.0, hit.weight, 1e-9);
        assertEquals(16, hit.damage, 1e-9);
        assertEquals(200, hit.distance, 1e-9);
        assertEquals(3, hit.alive);
        assertNull(controller.takeHit(), "read once");

        // b fires at tick 18 with c nearer it than Hadur: the surfer gave the shot a quarter.
        scan(controller.tracker, "b", 100, 100, 97, 19);
        for (int t = 19; t <= 18 + 33; t++) tick(t, 3);
        controller.hitByBullet("b", 3, 0, me, 18 + 33);
        hit = controller.takeHit();
        assertTrue(hit.seen);
        assertEquals(1, hit.nearer);
        assertEquals(0.25, hit.weight, 1e-9);

        // A hit no inferred shot explains: unseen, no weight.
        controller.hitByBullet("c", 1, 0, me, 60);
        hit = controller.takeHit();
        assertFalse(hit.seen);
        assertEquals(-1, hit.nearer);
        assertEquals(0, hit.weight, 1e-9);
        assertEquals("4.000,250,0,-1,0.000,3", hit.fields());

        // A dead shooter's bullet still flies: its shot is matched, and a killing bullet takes
        // no more than the energy Hadur had.
        scan(controller.tracker, "a", 400, 500, 94, 61);
        for (int t = 61; t <= 78; t++) {
            controller.tick(new MeleeController.Situation(me, 0, 0, 5, t, 3));
        }
        controller.onRobotDeath("a");
        controller.hitByBullet("a", 3, Math.PI, me, 78);
        hit = controller.takeHit();
        assertTrue(hit.seen);
        assertEquals(5, hit.damage, 1e-9);
        assertEquals(2, hit.alive);
    }
}
