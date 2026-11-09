package hadur117.core.melee;

import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyShot;
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

    /** MSENSE-3: a controller with the energy ledger on, for the three cases it reads. */
    private MeleeController ledgered() {
        MeleeController c = new MeleeController(field(800, 600));
        c.ledger(true);
        return c;
    }

    private static EnemyShot shotOf(MeleeController c, String name, long now) {
        EnemyShot found = null;
        for (EnemyShot s : c.tracker.shots(now)) {
            if (s.shooter.equals(name)) {
                assertNull(found, "one shot of " + name);
                found = s;
            }
        }
        return found;
    }

    @Test
    @Tag("MSENSE-3")
    void ledgerReadsTheShotHiddenByItsHitOnHadur() {
        MeleeController c = ledgered();
        c.onScan("a", pt(400, 500), 200, 100, 0, 0, 0);
        c.onScan("b", pt(100, 100), 360, 100, 0, 0, 0);
        for (int t = 0; t <= 10; t++) c.tick(new MeleeController.Situation(me, 0, 0, 100, t, 2));
        // a's power-2 bullet hits Hadur at tick 10: a has 6 more. Its next scan shows 103, so it
        // also fired power 3 somewhere in the gap; the World alone read a gain and no shot.
        c.hitByBullet("a", 2.0, Math.PI, me, 10);
        c.onScan("a", pt(400, 500), 200, 103, 0, 0, 11);
        EnemyShot shot = shotOf(c, "a", 11);
        assertNotNull(shot);
        assertEquals(3.0, shot.power, 1e-9);
        assertTrue(shot.fireTime >= 0 && shot.fireTime <= 10);
        assertEquals(5, shot.window);

        // The same scans with the switch off read nothing (the World's own rule, MSENSE-2).
        MeleeController off = new MeleeController(field(800, 600));
        off.onScan("a", pt(400, 500), 200, 100, 0, 0, 0);
        for (int t = 0; t <= 10; t++) off.tick(new MeleeController.Situation(me, 0, 0, 100, t, 2));
        off.hitByBullet("a", 2.0, Math.PI, me, 10);
        off.onScan("a", pt(400, 500), 200, 103, 0, 0, 11);
        assertNull(shotOf(off, "a", 11));
    }

    @Test
    @Tag("MSENSE-3")
    void ledgerReadsTheShotHiddenByAnotherRobotsHit() {
        MeleeController c = ledgered();
        // b fires power 3 at tick 0 from (100, 100); its wave reaches a, 300 px away, near tick 27.
        c.onScan("b", pt(100, 100), 360, 100, 0, 0, 0);
        c.onScan("b", pt(100, 100), 360, 97, 0, 0, 1);
        c.onScan("a", pt(400, 100), 200, 100, 0, 0, 20);
        // a's scan at 30 shows a loss of 18: b's 16 of damage and a's own power-2 shot.
        c.onScan("a", pt(400, 100), 200, 82, 0, 0, 30);
        EnemyShot shot = shotOf(c, "a", 30);
        assertNotNull(shot);
        assertEquals(2.0, shot.power, 1e-9);
        assertTrue(shot.fireTime >= 20 && shot.fireTime <= 29);
        // A loss that is exactly the hit's damage is no shot.
        c.onScan("b", pt(100, 100), 360, 97, 0, 0, 31);
        c.onScan("b", pt(100, 100), 360, 94, 0, 0, 32);
        c.onScan("a", pt(400, 100), 200, 82, 0, 0, 50);
        c.onScan("a", pt(400, 100), 200, 66, 0, 0, 60);
        assertEquals(1, c.tracker.shots(60).stream().filter(s -> s.shooter.equals("a")).count());
    }

    @Test
    @Tag("MSENSE-3")
    void ledgerReadsTheShotHiddenByItsOwnBulletLanding() {
        MeleeController c = ledgered();
        // a fires power 3 at tick 0 from (400, 500); c stands 220 px north, where the wave lands near tick 20.
        c.onScan("c", pt(400, 720), 420, 100, 0, 0, 0);
        c.onScan("a", pt(400, 500), 200, 100, 0, 0, 0);
        c.onScan("a", pt(400, 500), 200, 97, 0, 0, 1);
        c.onScan("a", pt(400, 500), 200, 97, 0, 0, 15);
        // a's scan at 25 shows a gain of 7.5: 9 back from the hit on c, less its own power-1.5 shot.
        c.onScan("a", pt(400, 500), 200, 104.5, 0, 0, 25);
        long shots = c.tracker.shots(25).stream().filter(s -> s.shooter.equals("a")).count();
        assertEquals(2, shots);
        EnemyShot latest = c.tracker.shots(25).stream().filter(s -> s.shooter.equals("a"))
            .max((x, y) -> Long.compare(x.fireTime, y.fireTime)).get();
        assertEquals(1.5, latest.power, 1e-9);
        assertTrue(latest.fireTime >= 15 && latest.fireTime <= 24);
    }

    @Test
    @Tag("MSENSE-3")
    void ledgerReadsNoShotFromAGunStillHot() {
        MeleeController c = ledgered();
        // a fires power 3 at tick 0 (16 ticks of heat); a loss of 18 by tick 10 cannot hold a second shot.
        c.onScan("b", pt(100, 100), 360, 100, 0, 0, 0);
        c.onScan("b", pt(100, 100), 360, 97, 0, 0, 1);
        c.onScan("a", pt(100, 300), 300, 100, 0, 0, 0);
        c.onScan("a", pt(100, 300), 300, 97, 0, 0, 1);
        c.onScan("a", pt(100, 300), 300, 79, 0, 0, 10);
        assertEquals(1, c.tracker.shots(10).stream().filter(s -> s.shooter.equals("a")).count());
    }

    @Test
    @Tag("MSENSE-3")
    void ledgerCorrectsAShotTheWorldReadLightBecauseOfItsHitOnHadur() {
        MeleeController c = ledgered();
        c.onScan("a", pt(400, 500), 200, 100, 0, 0, 0);
        c.onScan("b", pt(100, 100), 360, 100, 0, 0, 0);
        for (int t = 0; t <= 10; t++) c.tick(new MeleeController.Situation(me, 0, 0, 100, t, 2));
        // a's power-0.5 bullet hits Hadur (1.5 back) and a fires power 3 in the same gap: the World
        // reads the net drop, 1.5, as a shot of 1.5. The ledger puts the shot right.
        c.hitByBullet("a", 0.5, Math.PI, me, 10);
        c.onScan("a", pt(400, 500), 200, 98.5, 0, 0, 11);
        EnemyShot shot = shotOf(c, "a", 11);
        assertNotNull(shot);
        assertEquals(3.0, shot.power, 1e-9);
        // A net drop that no bullet's power explains once the gain is back is no shot at all.
        c.hitByBullet("a", 2.0, Math.PI, me, 20);
        c.onScan("a", pt(400, 500), 200, 96.5, 0, 0, 21);
        assertEquals(1, c.tracker.shots(21).stream().filter(s -> s.shooter.equals("a")).count());
    }
}
