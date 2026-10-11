package hadurling.core.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadurling.core.physics.Angles;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WaveTest {

    /** Fired from (400, 500) straight at a target 400 px south, which was circling clockwise. */
    private final Wave wave = new Wave(400, 500, 10, 3.0, Math.PI, 1);

    @Test
    @DisplayName("the wave grows by the bullet's speed each tick")
    void grows() {
        assertEquals(0, wave.radius(10), 0);
        assertEquals(11 * 5, wave.radius(15), 1e-12);
    }

    @Test
    @DisplayName("it has reached a point once it is as big as the distance to it")
    void reaches() {
        assertFalse(wave.hasReached(45, 400, 100)); // radius 385 < 400
        assertTrue(wave.hasReached(47, 400, 100));  // radius 407
    }

    @Test
    @DisplayName("a target still on the bearing has guess factor 0")
    void straightAhead() {
        assertEquals(0, wave.guessFactor(400, 100), 1e-12);
    }

    @Test
    @DisplayName("running the full escape angle on the wave's side is +1, the other side -1")
    void extremes() {
        double mea = wave.maxEscapeAngle();
        double cw = Angles.normalAbsoluteAngle(Math.PI + mea);
        double ccw = Angles.normalAbsoluteAngle(Math.PI - mea);
        assertEquals(1, wave.guessFactor(Angles.projectX(400, cw, 400), Angles.projectY(500, cw, 400)), 1e-9);
        assertEquals(-1, wave.guessFactor(Angles.projectX(400, ccw, 400), Angles.projectY(500, ccw, 400)), 1e-9);
    }

    @Test
    @DisplayName("a guess factor beyond what is physically possible is clamped to 1")
    void clamped() {
        assertEquals(1, wave.guessFactor(0, 500), 0);
    }

    @Test
    @DisplayName("an anticlockwise wave flips the sign: the same place is the other guess factor")
    void directionFlipsTheSign() {
        Wave other = new Wave(400, 500, 10, 3.0, Math.PI, -1);
        double angle = Angles.normalAbsoluteAngle(Math.PI + 0.3);
        double x = Angles.projectX(400, angle, 400);
        double y = Angles.projectY(500, angle, 400);
        assertEquals(-other.guessFactor(x, y), wave.guessFactor(x, y), 1e-12);
    }

    @Test
    @DisplayName("firingAngle is the inverse of guessFactor")
    void roundTrip() {
        for (double gf = -1; gf <= 1; gf += 0.25) {
            double angle = wave.firingAngle(gf);
            double x = Angles.projectX(400, angle, 400);
            double y = Angles.projectY(500, angle, 400);
            assertEquals(gf, wave.guessFactor(x, y), 1e-9);
        }
    }

    @Test
    @DisplayName("direction follows the sign of the sideways velocity, and defaults to clockwise")
    void direction() {
        assertEquals(1, Wave.direction(3));
        assertEquals(-1, Wave.direction(-3));
        assertEquals(1, Wave.direction(0));
    }
}
