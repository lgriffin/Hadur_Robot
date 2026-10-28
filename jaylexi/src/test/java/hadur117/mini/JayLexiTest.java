package hadur117.mini;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.geom.Point2D;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import robocode.Bullet;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
import robocode.ScannedRobotEvent;

/** JayLexi's orders for one scan at a time (JAYLEXI-2 to JAYLEXI-8), traced on the Probe. */
class JayLexiTest {

    @BeforeEach
    void reset() {
        Probe.reset();
    }

    // name, energy, bearing, distance, heading, velocity
    static ScannedRobotEvent scan(double energy, double bearing, double distance) {
        return new ScannedRobotEvent("enemy", energy, bearing, distance, 0, 0);
    }

    static JayLexi.Wave wave(double x, double y, double bearing, double speed) {
        JayLexi.Wave w = new JayLexi.Wave();
        w.source = new Point2D.Double(x, y);
        w.bearing = bearing;
        w.dir = 1;
        w.speed = speed;
        w.bins = new double[JayLexi.BINS];
        return w;
    }

    @Test
    @Tag("JAYLEXI-2")
    @DisplayName("each scan turns the radar twice the turn to the enemy")
    void radarLock() {
        Probe p = new Probe();
        p.radarHeading = -0.2;
        p.onScannedRobot(scan(100, 0.3, 300));
        assertEquals(2 * 0.5, p.radarRight, 1e-12);
    }

    @Test
    @Tag("JAYLEXI-3")
    @DisplayName("a drop of 0.1 to 3 in the enemy's energy launches a wave at that bullet's speed")
    void shotLaunchesWave() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 300));
        assertTrue(JayLexi.waves.isEmpty());
        p.onScannedRobot(scan(98, 0, 300));
        assertEquals(1, JayLexi.waves.size());
        assertEquals(20 - 3 * 2, JayLexi.waves.get(0).speed, 1e-9);
    }

    @Test
    @Tag("JAYLEXI-3")
    @DisplayName("drops outside 0.09 to 3 are not shots")
    void notShots() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 300));
        p.onScannedRobot(scan(99.95, 0, 300));
        p.onScannedRobot(scan(90, 0, 300));
        assertTrue(JayLexi.waves.isEmpty());
    }

    @Test
    @Tag("JAYLEXI-3")
    @DisplayName("our hit on the enemy is booked, so its energy loss is not read as a shot")
    void ourHitIsNotAShot() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 300));
        p.onBulletHit(new BulletHitEvent("enemy", 90, new Bullet(0, 0, 0, 2, "me", "enemy", false, 1)));
        p.onScannedRobot(scan(90, 0, 300));
        assertTrue(JayLexi.waves.isEmpty());
    }

    @Test
    @Tag("JAYLEXI-4")
    @DisplayName("every scan adds a gun wave, and a passing wave logs the enemy's guess factor highest")
    void gunWaves() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 300));
        p.onScannedRobot(scan(100, 0, 300));
        assertEquals(2, p.events.size());
        JayLexi.Wave w = wave(0, 0, 0, 14);
        Point2D.Double atOne = new Point2D.Double(Math.sin(Math.asin(8 / 14.0)) * 300, Math.cos(Math.asin(8 / 14.0)) * 300);
        assertEquals(JayLexi.BINS - 1, w.index(atOne));
        w.log(atOne, 600);
        for (int i = 0; i < JayLexi.BINS - 1; i++) {
            assertTrue(w.bins[i] < w.bins[JayLexi.BINS - 1]);
        }
    }

    @Test
    @Tag("JAYLEXI-5")
    @DisplayName("the side whose landing bin was hit before is the more dangerous one")
    void dangerFollowsTheBins() {
        Probe p = new Probe();
        JayLexi.me = new Point2D.Double(400, 300);
        JayLexi.enemy = new Point2D.Double(400, 600);
        // An enemy wave from due north of us, aimed straight at us.
        JayLexi.Wave s = wave(400, 600, Math.PI, 14);
        s.travelled = 0;
        for (int i = JayLexi.MID + 1; i < JayLexi.BINS; i++) {
            s.bins[i] = 1;
        }
        double back = p.danger(s, -1), ahead = p.danger(s, 1);
        // Clockwise round the source (+1) from due south of it is positive GF for dir 1: the hot side.
        assertTrue(ahead > back, "ahead " + ahead + " back " + back);
    }

    @Test
    @Tag("JAYLEXI-5")
    @DisplayName("with no enemy wave in flight it drives straight away from the enemy")
    void fleesWithoutWaves() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 300));
        assertEquals(0, p.turn, 1e-9, "the enemy dead ahead: no turn, back-as-front");
        assertTrue(p.ahead < 0, "backing away");
    }

    @Test
    @Tag("JAYLEXI-6")
    @DisplayName("a hit logs our guess factor on the wave that was passing us")
    void hitLogs() {
        Probe p = new Probe();
        JayLexi.me = new Point2D.Double(400, 300);
        JayLexi.Wave s = wave(400, 600, Math.PI, 14);
        s.travelled = 300;
        JayLexi.waves.add(s);
        p.onHitByBullet(new HitByBulletEvent(0, new Bullet(0, 400, 300, 2, "enemy", "me", false, 1)));
        int at = s.index(JayLexi.me);
        assertEquals(JayLexi.MID, at);
        for (int i = 0; i < JayLexi.BINS; i++) {
            assertTrue(i == at || s.bins[i] < s.bins[at]);
        }
        assertTrue(JayLexi.waves.isEmpty(), "the wave that hit is dropped");
    }

    @Test
    @Tag("JAYLEXI-6")
    @DisplayName("bullets colliding log the collision point on the wave that was passing it")
    void bulletHitBulletLogs() {
        Probe p = new Probe();
        JayLexi.Wave s = wave(400, 600, Math.PI, 14);
        s.travelled = 150;
        JayLexi.waves.add(s);
        p.onBulletHitBullet(new BulletHitBulletEvent(new Bullet(0, 400, 450, 1, "me", null, false, 2),
                new Bullet(Math.PI, 400, 450, 2, "enemy", null, false, 1)));
        assertTrue(s.bins[JayLexi.MID] > 0);
        assertTrue(JayLexi.waves.isEmpty());
    }

    @Test
    @Tag("JAYLEXI-7")
    @DisplayName("smoothing turns the drive until a stick of STICK px stays inside the field")
    void smoothing() {
        Point2D.Double p = new Point2D.Double(40, 300);
        double a = JayLexi.smooth(p, -Math.PI / 2, 1);
        assertTrue(JayLexi.FIELD.contains(JayLexi.project(p, a, JayLexi.STICK)));
    }

    @Test
    @Tag("JAYLEXI-8")
    @DisplayName("power is 3 inside 150 px, 2 beyond, a fifteenth of our energy at most, and no more than finishes")
    void power() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 100));
        assertEquals(3, p.fired, 1e-12);
        p.onScannedRobot(scan(100, 0, 400));
        assertEquals(2, p.fired, 1e-12);
        p.energy = 15;
        p.onScannedRobot(scan(100, 0, 400));
        assertEquals(1, p.fired, 1e-12);
        p.energy = 100;
        p.onScannedRobot(scan(2, 0, 400));
        assertEquals(0.6, p.fired, 1e-12);
    }

    @Test
    @Tag("JAYLEXI-8")
    @DisplayName("the gun holds fire while it is still turning")
    void holdsWhileTurning() {
        Probe p = new Probe();
        p.gunTurnRemaining = 10;
        p.onScannedRobot(scan(100, 0, 400));
        assertNull(p.fired);
    }
}
