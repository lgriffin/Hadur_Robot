package hadurling.core.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FieldTest {

    private final Field field = new Field(800, 600);

    @Test
    void centreIsInside() {
        assertTrue(field.contains(400, 300));
        assertEquals(282, field.distanceToWall(400, 300), 1e-12);
    }

    @Test
    void nearestWallWins() {
        assertEquals(32, field.distanceToWall(50, 300), 1e-12);
        assertEquals(2, field.distanceToWall(400, 580), 1e-12);
    }

    @Test
    void insideTheMarginIsOutside() {
        assertFalse(field.contains(10, 300));
        assertTrue(field.distanceToWall(10, 300) < 0);
    }
}
