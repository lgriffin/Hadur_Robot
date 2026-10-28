package hadur117.nano;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/** Sanaro's orders for one scan at a time (SANARO-3 to SANARO-8), traced on the Probe. */
class SanaroTest {

    @BeforeEach
    void reset() {
        Probe.reset();
    }

    // name, energy, bearing, distance, heading, velocity
    static ScannedRobotEvent scan(String name, double energy, double bearing, double distance, double heading, double velocity) {
        return new ScannedRobotEvent(name, energy, bearing, distance, heading, velocity);
    }

    @Test
    @Tag("SANARO-3")
    @DisplayName("one scan of a still robot turns the drive SPIRAL off the push away from it")
    void spiralOffTheField() {
        Probe p = new Probe();
        p.onScannedRobot(scan("a", 100, 0, 300, 0, 0));
        // Robot due north at 300 px of the centre, still: the push is due south (atan2(-0, -1/300)).
        double push = Math.atan2(-Math.sin(0) / 300 + Sanaro.wall(500), -Math.cos(0) / 300 + Sanaro.wall(500));
        assertEquals(Utils.normalRelativeAngle(push + Sanaro.SPIRAL), p.turn, 1e-12);
        assertEquals(Math.PI - Sanaro.SPIRAL, Math.abs(p.turn), 1e-9, "a still robot due north: south, turned by the spiral");
    }

    @Test
    @Tag("SANARO-3")
    @DisplayName("the field decays by DECAY and adds the push from where the robot is about to be")
    void fieldDecaysAndLeads() {
        Probe p = new Probe();
        Sanaro.fx = 1;
        Sanaro.fy = -2;
        p.onScannedRobot(scan("a", 100, 0.5, 200, 2.0, 8));
        double bearing = 0.5;
        double aim = bearing + 8 / (Sanaro.LEAD + Math.pow(Sanaro.LEAD_GROWTH, 200)) * Math.sin(2.0 - bearing);
        assertEquals(1 * Sanaro.DECAY - Math.sin(aim) / 200, Sanaro.fx, 1e-12);
        assertEquals(-2 * Sanaro.DECAY - Math.cos(aim) / 200, Sanaro.fy, 1e-12);
    }

    @Test
    @Tag("SANARO-4")
    @DisplayName("the drive is AHEAD less the turn still to make, so past AHEAD degrees it backs")
    void drivesBackOnBigTurns() {
        Probe p = new Probe();
        p.onScannedRobot(scan("a", 100, 0, 300, 0, 0));
        double degrees = Math.abs(Math.toDegrees(p.turn));
        assertEquals(Sanaro.AHEAD - degrees, p.ahead, 1e-9);
        assertTrue(degrees > Sanaro.AHEAD == p.ahead < 0);
    }

    @Test
    @Tag("SANARO-5")
    @DisplayName("a robot inside the creeping threshold is the target, and the threshold snaps to it")
    void creepingNearest() {
        Probe p = new Probe();
        p.onScannedRobot(scan("a", 100, 0, 300, 0, 0));
        assertNull(p.fire, "the first scan: 300 is not inside 25");
        Sanaro.range = 400;
        p.onScannedRobot(scan("a", 100, 0, 300, 0, 0));
        assertEquals(300, Sanaro.range);
        p.fire = null;
        p.onScannedRobot(scan("b", 100, 1, 340, 0, 0));
        assertNull(p.fire, "340 is not inside 300 + 25");
        assertEquals(325, Sanaro.range);
        p.onScannedRobot(scan("b", 100, 1, 340, 0, 0));
        assertTrue(p.fire != null && Sanaro.range == 340, "the threshold crept out to 350 and took b");
    }

    @Test
    @Tag("SANARO-6")
    @DisplayName("the radar keeps sweeping while the gun is hot and flips on the target below LOCK")
    void radarFlip() {
        Probe p = new Probe();
        Sanaro.range = 1000;
        p.gunHeat = 1.6;
        p.onScannedRobot(scan("a", 100, 0, 300, 0, 0));
        assertEquals(Double.POSITIVE_INFINITY, p.radar);
        Sanaro.range = 1000;
        p.gunHeat = 0.5;
        p.onScannedRobot(scan("a", 100, 0, 300, 0, 0));
        assertEquals(Double.NEGATIVE_INFINITY, p.radar);
    }

    @Test
    @Tag("SANARO-7")
    @DisplayName("the gun turns to the hedged lead, and the shot is ordered before the turn")
    void aimsTheHedge() {
        Probe p = new Probe();
        Sanaro.range = 1000;
        p.gunHeading = 0.2;
        p.onScannedRobot(scan("a", 100, 0.5, 250, 1.0, -8));
        double aim = 0.5 + -8 / (Sanaro.LEAD + Math.pow(Sanaro.LEAD_GROWTH, 250)) * Math.sin(1.0 - 0.5);
        assertEquals(Utils.normalRelativeAngle(aim - 0.2), p.gun, 1e-12);
        assertEquals("[turn, ahead, radar, fire, gun]", p.orders.toString());
    }

    @Test
    @Tag("SANARO-8")
    @DisplayName("the shot is the table's power times the integer band 640 / distance")
    void powerBands() {
        for (int d : new int[] {100, 200, 300, 500, 700}) {
            Probe.reset();
            Probe p = new Probe();
            Sanaro.range = 1000;
            p.onScannedRobot(scan("a", 50, 0, d, 0, 0));
            double table = Sanaro.POWER.charAt(100 * 128 + 50) / 40.0;
            assertEquals(640 / d * table, p.fire, 1e-12, "at " + d + " px");
        }
    }
}
