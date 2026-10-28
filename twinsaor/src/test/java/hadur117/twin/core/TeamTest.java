package hadur117.twin.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TeamTest {

    @Test
    @Tag("TWIN-7")
    @DisplayName("the twins take the enemy with least energy, and switch only on a 20-point lead")
    void killOrder() {
        assertTrue(Team.switchTo(100, Double.NaN), "no live target: take any");
        assertTrue(Team.switchTo(100, 200), "the 100-energy member over the 200-energy leader");
        assertTrue(Team.switchTo(80, 100));
        assertFalse(Team.switchTo(81, 100), "a lead under 20 keeps the target");
        assertFalse(Team.switchTo(200, 100));
    }

    @Test
    @Tag("TWIN-9")
    @DisplayName("the two stations stand 90 degrees apart around the target")
    void stationsAreAtRightAngles() {
        double tx = 400, ty = 400, midX = 400, midY = 100;
        double a = Team.stationBearing(tx, ty, midX, midY, true);
        double b = Team.stationBearing(tx, ty, midX, midY, false);
        assertEquals(Math.PI / 2, Math.abs(Gun.normalRelativeAngle(a - b)), 1e-9);
        // Both lean toward the team's side of the target (south here, bearing pi).
        assertEquals(Math.PI / 4, Math.abs(Gun.normalRelativeAngle(a - Math.PI)), 1e-9);
        assertEquals(Math.PI / 4, Math.abs(Gun.normalRelativeAngle(b - Math.PI)), 1e-9);
    }

    @Test
    @Tag("TWIN-9")
    @DisplayName("range closes from 250 to 160 once one enemy is left, and mode bit 2 closes 250 to 180")
    void range() {
        assertEquals(250, Team.range(2, 0));
        assertEquals(160, Team.range(1, 0));
        assertEquals(180, Team.range(2, 2), "mode bit 2 closes the two-enemy range");
        assertEquals(160, Team.range(1, 2), "but not the one-enemy range");
        assertEquals(250, Team.range(2, 1), "the flip bit leaves the range alone");
    }

    @Test
    @Tag("TWIN-9")
    @DisplayName("a station point sits on its bearing at range, a leg across, and inside the walls")
    void point() {
        double[] p = Team.point(400, 400, 0, 250, 1);
        assertEquals(460, p[0], 1e-9);
        assertEquals(650, p[1], 1e-9);
        double[] q = Team.point(780, 780, Math.PI / 4, 250, -1);
        assertTrue(q[0] <= 770 && q[1] <= 770 && q[0] >= 30 && q[1] >= 30);
    }

    @Test
    @Tag("TWIN-10")
    @DisplayName("an energy drop of 0.1 to 3 is a shot")
    void fired() {
        assertTrue(Team.fired(100, 99.9));
        assertTrue(Team.fired(100, 97));
        assertFalse(Team.fired(100, 100));
        assertFalse(Team.fired(100, 96.9));
        assertFalse(Team.fired(100, 100.5));
    }

    @Test
    @Tag("TWIN-11")
    @DisplayName("fire is held when the partner is nearer than the target and on the gun line")
    void hold() {
        assertTrue(Team.hold(100, 100, 0, 300, 105, 200));
        assertFalse(Team.hold(100, 100, 0, 50, 105, 200), "partner beyond the target");
        assertFalse(Team.hold(100, 100, 0, 300, 200, 100), "partner off the line");
    }

    @Test
    @DisplayName("power: 2.9 cap against two, 3 against one, Saor's 1.9 alone")
    void power() {
        assertEquals(2.9, Team.power(100, 50, true, 2), 1e-9);
        assertEquals(3, Team.power(100, 50, true, 1), 1e-9);
        assertEquals(1.9, Team.power(100, 50, false, 2), 1e-9);
        assertEquals(Math.log10(100) * 325 / 650, Team.power(100, 650, true, 2), 1e-9);
    }

    @Test
    @Tag("TWIN-12")
    @DisplayName("the last twin's corner points mirror into its own half of the 800 field")
    void corner() {
        assertEquals(25, Team.corner(true, 300, 100));
        assertEquals(775, Team.corner(true, 300, 700));
        assertEquals(175, Team.corner(false, 300, 100));
        assertEquals(500, Team.corner(false, 2000, 700), "the leg is capped at 300");
    }
}
