package hadur117.micro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.geom.Rectangle2D;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import robocode.Bullet;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
import robocode.Rules;
import robocode.ScannedRobotEvent;
import robocode.StatusEvent;
import robocode.util.Utils;

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
    @DisplayName("past (2 + round) x the robot's MODES char of hits, each 5 / bullet speed, it moves every tick for the rest of the battle")
    void switchesToRandom() {
        Probe p = new Probe();
        p.round = 1;
        int scale = Eveimear.MODES.charAt("enemy".hashCode() >>> 18);
        double each = 5 / Rules.getBulletSpeed(3);
        int under = (int) Math.floor((2 + 1) * scale / each);
        for (int i = 0; i < under; i++) {
            p.onHitByBullet(hitBy(3));
        }
        assertEquals(0, Eveimear.flat, 0, under + " power-3 hits are not over (2 + 1) x " + scale);
        p.onHitByBullet(hitBy(3));
        assertEquals(-1, Eveimear.flat, 0, "one more is over");
        p.onScannedRobot(scan(100, 0, 400));
        p.ahead = null;
        p.onScannedRobot(scan(100, 0, 400));
        assertTrue(p.ahead != null, "random mode moves with no shot to answer");
    }

    @Test
    @Tag("EVEIMEAR-3")
    @DisplayName("the mode table reads the top 14 bits of the name's hash and holds only the four modes")
    void modeTable() {
        assertEquals(1 << 14, Eveimear.MODES.length());
        for (char c : Eveimear.MODES.toCharArray()) {
            assertTrue(c == 0 || c == 1 || c == 9 || c == 15, "mode " + (int) c);
        }
    }

    @Test
    @Tag("EVEIMEAR-4")
    @DisplayName("in stop-and-go in open field it keeps its orbit direction, hit or not")
    void keepsDirection() {
        Probe p = new Probe();
        p.onHitByBullet(hitBy(1));
        p.onScannedRobot(scan(100, 0, 400));
        assertEquals(1, Eveimear.direction, 0);
    }

    @Test
    @Tag("EVEIMEAR-5")
    @DisplayName("against a wall the drive turns until a 160 px stick stays inside the field")
    void smoothing() {
        Probe p = new Probe();
        p.x = 30;
        // Enemy due north; orbiting clockwise (+1) would drive west, into the wall.
        p.onScannedRobot(scan(100, 0, 400));
        double drive = Math.atan(p.turn) + p.heading;
        Rectangle2D.Double field = new Rectangle2D.Double(18, 18, 764, 564);
        assertTrue(field.contains(p.x + 160 * Math.sin(drive), p.y + 160 * Math.cos(drive))
                || field.contains(p.x - 160 * Math.sin(drive), p.y - 160 * Math.cos(drive)));
    }

    @Test
    @Tag("EVEIMEAR-6")
    @DisplayName("each scan adds one symbol, and against a robot that stands still the gun aims at it")
    void gunMatches() {
        Probe p = new Probe();
        for (int i = 1; i <= 40; i++) {
            p.onScannedRobot(scan(100, 0.3, 400));
            assertEquals(i, Eveimear.searchData.length());
        }
        double bin = 2 * Math.PI / (Eveimear.BINS - 1);
        assertEquals(0.3, Utils.normalRelativeAngle(p.gunTurn), bin, "within a bin of the enemy");
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
    @DisplayName("power is 2 at range, at most a quarter of the enemy's energy, and only while we have more than that")
    void power() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 400));
        assertEquals(2, p.fired, 1e-12);
        p.onScannedRobot(scan(2, 0, 400));
        assertEquals(0.5, p.fired, 1e-12);
        p.fired = null;
        p.energy = 1.5;
        p.onScannedRobot(scan(100, 0, 400));
        assertNull(p.fired, "1.5 energy does not fire 2");
    }

    @Test
    @Tag("EVEIMEAR-10")
    @DisplayName("the radar turns every tick until it sees the enemy, then locks at twice the bearing")
    void radar() {
        Probe p = new Probe();
        p.onStatus(new StatusEvent(null));
        assertEquals(1, p.radarTurn, 1e-12);
        p.radarHeading = 0.1;
        p.onScannedRobot(scan(100, 0.3, 400));
        assertEquals(0.4, p.radarTurn, 1e-12);
    }

    @Test
    @Tag("EVEIMEAR-11")
    @DisplayName("our hits and theirs are booked to the enemy's energy, so neither reads as a shot")
    void bookedHits() {
        Probe p = new Probe();
        p.onScannedRobot(scan(100, 0, 400));
        p.onBulletHit(new BulletHitEvent("enemy", 90, new Bullet(0, 0, 0, 2.5, "me", "enemy", false, 1)));
        p.onScannedRobot(scan(90, 0, 400));
        assertNull(p.ahead, "our hit is not their shot");
        p.onHitByBullet(hitBy(2));
        p.onScannedRobot(scan(96, 0, 400));
        assertNull(p.ahead, "their 6 energy back from hitting us is not a shot either");
    }
}
