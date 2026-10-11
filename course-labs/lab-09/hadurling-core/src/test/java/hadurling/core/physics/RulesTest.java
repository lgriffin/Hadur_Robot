package hadurling.core.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RulesTest {

    private static final double EPS = 1e-12;

    @Test
    @DisplayName("bullet speed is 20 - 3 * power")
    void speed() {
        assertEquals(11.0, Rules.bulletSpeed(3.0), EPS);
        assertEquals(17.0, Rules.bulletSpeed(1.0), EPS);
    }

    @Test
    @DisplayName("power outside [0.1, 3] is clamped")
    void clamped() {
        assertEquals(Rules.bulletSpeed(3.0), Rules.bulletSpeed(10), EPS);
        assertEquals(Rules.bulletSpeed(0.1), Rules.bulletSpeed(-1), EPS);
    }

    @Test
    @DisplayName("damage: 4p, plus 2(p-1) above power 1")
    void damage() {
        assertEquals(4.0, Rules.bulletDamage(1.0), EPS);
        assertEquals(16.0, Rules.bulletDamage(3.0), EPS);
    }

    @Test
    @DisplayName("a slower bullet leaves the enemy more room to escape")
    void escapeAngleGrowsWithPower() {
        assertTrue(Rules.maxEscapeAngle(3.0) > Rules.maxEscapeAngle(1.0));
        assertEquals(Math.asin(8.0 / 11.0), Rules.maxEscapeAngle(3.0), EPS);
    }
}
