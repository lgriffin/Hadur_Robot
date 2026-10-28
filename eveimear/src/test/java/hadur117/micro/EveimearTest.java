package hadur117.micro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import robocode.Bullet;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
import robocode.ScannedRobotEvent;

/** Eveimear's orders for one scan at a time (EVEIMEAR-2 to EVEIMEAR-11), traced on the Probe. */
class EveimearTest {

    @BeforeEach
    void reset() {
        Probe.reset();
    }

    // name, energy, bearing, distance, heading, velocity
    static ScannedRobotEvent scan(double energy, double bearing, double distance) {
        return new ScannedRobotEvent("enemy", energy, bearing, distance, 0, 0);
    }

    static HitByBulletEvent hitBy(double power) {
        return new HitByBulletEvent(0, new Bullet(0, 400, 300, power, "enemy", "me", false, 1));
    }

    @Test
    @Tag("EVEIMEAR-2")
    @DisplayName("each enemy shot is one step of (3 + (int) (drop x 1.999999)) << 3 px")
    void stepPerShot() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 400));
        assertNull(p.ahead, "no shot yet: stand");
        p.onScannedRobot(scan(98, 0, 400));
        assertEquals((3 + (int) (2 * 1.999999)) << 3, Math.abs(p.ahead), 1e-9);
        p.ahead = null;
        p.onScannedRobot(scan(98, 0, 400));
        assertNull(p.ahead, "no drop, no step");
        p.onScannedRobot(scan(97.9, 0, 400));
        assertEquals(24, Math.abs(p.ahead), 1e-9, "a 0.1 shot is the shortest step");
    }

    @Test
    @Tag("EVEIMEAR-3")
    @DisplayName("past 40 + 23 x round of energy won back by their hits, it moves every tick for the rest of the battle")
    void switchesToRandom() {
        Probe p = new Probe();
        p.round = 1;
        for (int i = 0; i < 7; i++) {
            p.onHitByBullet(hitBy(3));
        }
        assertEquals(0, Eveimear.mode, 0, "seven power-3 hits win back 63, not over 40 + 23 in the second round");
        p.onHitByBullet(hitBy(3));
        assertEquals(-1, Eveimear.mode, 0, "an eighth, 72, is over");
        p.onScannedRobot(scan(100, 0, 400));
        p.ahead = null;
        p.onScannedRobot(scan(100, 0, 400));
        assertTrue(p.ahead != null, "random mode moves with no shot to answer");
    }

    @Test
    @Tag("EVEIMEAR-4")
    @DisplayName("a hit keeps the orbit direction")
    void hitKeepsDirection() {
        Probe p = new Probe();
        p.onHitByBullet(hitBy(1));
        assertEquals(1, Eveimear.direction, 0);
    }

    @Test
    @Tag("EVEIMEAR-5")
    @DisplayName("against a wall the drive turns until a 160 px stick stays inside the field")
    void smoothing() {
        Probe p = new Probe();
        p.x = 30;
        p.heading = 0;
        // Enemy due north; orbiting clockwise (+1) would drive west, into the wall.
        p.onScannedRobot(scan(100, 0, 400));
        double drive = p.turn + p.heading;
        assertTrue(Eveimear.FIELD.contains(p.x + 160 * Math.sin(Math.atan(Math.tan(drive))), p.y + 160 * Math.cos(Math.atan(Math.tan(drive))))
                || Eveimear.FIELD.contains(p.x - 160 * Math.sin(Math.atan(Math.tan(drive))), p.y - 160 * Math.cos(Math.atan(Math.tan(drive)))));
    }

    @Test
    @Tag("EVEIMEAR-6")
    @DisplayName("a gun wave every scan logs the bin the enemy is in when it passes")
    void gunWave() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 140));
        Eveimear.Wave w = (Eveimear.Wave) p.events.get(0);
        assertTrue(!w.test(), "14 px is not 140");
        for (int i = 0; i < 9; i++) {
            w.test();
        }
        assertTrue(w.bins[Eveimear.MID] == 1, "the enemy stood still: guess factor zero");
    }

    @Test
    @Tag("EVEIMEAR-7")
    @DisplayName("inside 100 px it fires 3 and steps every tick")
    void antiRam() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 90));
        assertEquals(3, p.fired, 1e-12);
        p.ahead = null;
        p.onScannedRobot(scan(100, 0, 90));
        assertTrue(p.ahead != null, "moving with no shot to answer");
    }

    @Test
    @Tag("EVEIMEAR-8")
    @DisplayName("power is 2 at range, enough to finish, and never the last 0.1 of our energy")
    void power() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 400));
        assertEquals(2, p.fired, 1e-12);
        p.onScannedRobot(scan(2, 0, 400));
        assertEquals(0.6, p.fired, 1e-12);
        p.energy = 0.5;
        p.onScannedRobot(scan(100, 0, 400));
        assertEquals(0.4, p.fired, 1e-12);
    }

    @Test
    @Tag("EVEIMEAR-10")
    @DisplayName("each scan turns the radar back by what it had left")
    void radar() {
        Probe p = new Probe();
        p.radarRemaining = 0.4;
        p.onScannedRobot(scan(100, 0, 400));
        assertEquals(0.4, p.radarLeft, 1e-12);
    }

    @Test
    @Tag("EVEIMEAR-11")
    @DisplayName("our hits and theirs are booked to the enemy's energy, so neither reads as a shot")
    void bookedHits() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 400));
        p.onBulletHit(new BulletHitEvent("enemy", 90, new Bullet(0, 0, 0, 2, "me", "enemy", false, 1)));
        p.onScannedRobot(scan(90, 0, 400));
        assertNull(p.ahead, "our hit is not their shot");
        p.onHitByBullet(hitBy(2));
        p.onScannedRobot(scan(96, 0, 400));
        assertNull(p.ahead, "their 6 energy back from hitting us is not a shot either");
    }
}
