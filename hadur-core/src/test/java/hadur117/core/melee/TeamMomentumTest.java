package hadur117.core.melee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** T7: momentum (TMODE-49): a member's drive simulated from its real heading and velocity. */
class TeamMomentumTest {

    private static final double W = 1200, H = 1200;

    @Test
    @Tag("TMODE-49")
    @DisplayName("TMODE-49: from rest pointed at the spot the drive accelerates 1 px a tick to 8 and stops on the spot")
    void fromRest() {
        double[][] p = Momentum.drive(600, 600, 0, 0, 600, 700, 30, true, W, H);
        assertEquals(601, p[0][1], 1e-9);
        assertEquals(603, p[1][1], 1e-9);
        assertEquals(600, p[0][0], 1e-9);
        assertEquals(700, p[29][1], 1e-6);
    }

    @Test
    @Tag("TMODE-49")
    @DisplayName("TMODE-49: driving north at 8, a spot due south is reached backwards: the member brakes 2 a tick before it gains ground")
    void turnBackBrakes() {
        double[][] p = Momentum.drive(600, 600, 0, 8, 600, 400, 30, true, W, H);
        // Still going north for the first ticks (8 -> 6 -> 4 -> 2 -> 0).
        assertTrue(p[0][1] > 600 && p[2][1] > p[0][1], "carried on north");
        // It gets there in the end, later than a standing start would.
        double[][] rest = Momentum.drive(600, 600, Math.PI, 0, 600, 400, 30, true, W, H);
        assertTrue(p[15][1] > rest[15][1], "the turn back costs ground");
    }

    @Test
    @Tag("TMODE-49")
    @DisplayName("TMODE-49: a sideways spot turns the body at most 10 - 0.75|v| degrees a tick; without full speed the drive caps at 4 through the sharp turn")
    void turnRateAndCap() {
        double[][] fast = Momentum.drive(600, 600, 0, 8, 800, 600, 3, true, W, H);
        double[][] slow = Momentum.drive(600, 600, 0, 8, 800, 600, 3, false, W, H);
        // At 8 px a tick the body turns 4 degrees; capped at 4, the member covers less ground.
        double fastStep = Math.hypot(fast[0][0] - 600, fast[0][1] - 600);
        double slowStep = Math.hypot(slow[0][0] - 600, slow[0][1] - 600);
        assertEquals(8, fastStep, 1e-9);
        assertEquals(6, slowStep, 1e-9);
        assertEquals(Math.sin(Math.toRadians(4)) * 8, fast[0][0] - 600, 1e-9);
    }

    @Test
    @Tag("TMODE-49")
    @DisplayName("TMODE-49: a wall stops the member on the field's edge")
    void wall() {
        double[][] p = Momentum.drive(30, 600, -Math.PI / 2, 8, -200, 600, 10, true, W, H);
        assertEquals(Momentum.HALF_BOT, p[9][0], 1e-9);
        // Diagonally into a corner's wall: the member stops on its heading's line, not slid along the wall.
        double[][] d = Momentum.drive(30, 600, -Math.PI / 4, 8, -300, 930, 3, true, W, H);
        assertEquals(Momentum.HALF_BOT, d[2][0], 1e-9);
        assertEquals(600 + (30 - d[2][0]), d[2][1], 1e-6);
    }

    @Test
    @Tag("TMODE-49")
    @DisplayName("TMODE-49: the engine's velocity rules: 1 up, 2 down, crossing zero mixes the two, and the speed that still stops in the distance left")
    void velocityRules() {
        assertEquals(1, Momentum.newVelocity(0, 100, 8), 1e-9);
        assertEquals(6, Momentum.newVelocity(8, -100, 8), 1e-9);
        assertEquals(-0.5, Momentum.newVelocity(1, -100, 8), 1e-9);
        assertEquals(6, Momentum.newVelocity(8, 100, 4), 1e-9);
        assertEquals(4, Momentum.newVelocity(4, 100, 4), 1e-9);
        assertEquals(2, Momentum.maxSpeedFor(2), 1e-9);
        assertEquals(8, Math.min(8, Momentum.maxSpeedFor(1000)), 1e-9);
    }

    @Test
    @Tag("TMODE-49")
    @DisplayName("TMODE-49: MOMENTUM is not in the default and on no shipped entry; both parts are on when it plays")
    void shippedOff() {
        assertFalse(TeamModes.FORCE_MOMENTUM);
        assertFalse(TeamModes.DEFAULT.contains(TeamModes.Mode.MOMENTUM));
        for (Map.Entry<String, Set<TeamModes.Mode>> e : TeamModes.TABLE.entrySet()) {
            assertFalse(e.getValue().contains(TeamModes.Mode.MOMENTUM), e.getKey());
        }
        assertTrue(TeamModes.MOMENTUM_SPEED);
        assertTrue(TeamModes.MOMENTUM_DRIVE);
    }
}
