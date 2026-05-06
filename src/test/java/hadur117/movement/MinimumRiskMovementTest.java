package hadur117.movement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("MinimumRiskMovement")
class MinimumRiskMovementTest {

    private MinimumRiskMovement mrm;

    @BeforeEach
    void setUp() {
        mrm = new MinimumRiskMovement();
    }

    @Test
    @DisplayName("init sets field dimensions")
    void initSetsDimensions() throws Exception {
        mrm.init(800, 600);

        Field widthField = MinimumRiskMovement.class.getDeclaredField("fieldWidth");
        widthField.setAccessible(true);
        assertEquals(800.0, widthField.getDouble(mrm), 1e-9);

        Field heightField = MinimumRiskMovement.class.getDeclaredField("fieldHeight");
        heightField.setAccessible(true);
        assertEquals(600.0, heightField.getDouble(mrm), 1e-9);
    }

    @Test
    @DisplayName("init creates fieldRect with WALL_MARGIN=18")
    void initCreatesFieldRect() throws Exception {
        mrm.init(800, 600);

        Field rectField = MinimumRiskMovement.class.getDeclaredField("fieldRect");
        rectField.setAccessible(true);
        Rectangle2D.Double rect = (Rectangle2D.Double) rectField.get(mrm);

        assertNotNull(rect);
        assertEquals(18.0, rect.x, 1e-9);
        assertEquals(18.0, rect.y, 1e-9);
        assertEquals(800.0 - 36.0, rect.width, 1e-9);
        assertEquals(600.0 - 36.0, rect.height, 1e-9);
    }

    @Test
    @DisplayName("init resets destination to null")
    void initResetsDestination() throws Exception {
        mrm.init(800, 600);

        Field destField = MinimumRiskMovement.class.getDeclaredField("destination");
        destField.setAccessible(true);
        assertNull(destField.get(mrm));
    }

    @Test
    @DisplayName("init with different dimensions")
    void initDifferentDimensions() throws Exception {
        mrm.init(1200, 900);

        Field rectField = MinimumRiskMovement.class.getDeclaredField("fieldRect");
        rectField.setAccessible(true);
        Rectangle2D.Double rect = (Rectangle2D.Double) rectField.get(mrm);

        assertEquals(1164.0, rect.width, 1e-9);
        assertEquals(864.0, rect.height, 1e-9);
    }

    @Test
    @DisplayName("WALL_MARGIN constant is 18")
    void wallMarginConstant() throws Exception {
        Field marginField = MinimumRiskMovement.class.getDeclaredField("WALL_MARGIN");
        marginField.setAccessible(true);
        assertEquals(18.0, marginField.getDouble(null), 1e-9);
    }

    @Test
    @DisplayName("fieldRect contains center of battlefield")
    void fieldRectContainsCenter() throws Exception {
        mrm.init(800, 600);

        Field rectField = MinimumRiskMovement.class.getDeclaredField("fieldRect");
        rectField.setAccessible(true);
        Rectangle2D.Double rect = (Rectangle2D.Double) rectField.get(mrm);

        assertTrue(rect.contains(400, 300), "Center should be inside fieldRect");
    }

    @Test
    @DisplayName("fieldRect excludes corners")
    void fieldRectExcludesCorners() throws Exception {
        mrm.init(800, 600);

        Field rectField = MinimumRiskMovement.class.getDeclaredField("fieldRect");
        rectField.setAccessible(true);
        Rectangle2D.Double rect = (Rectangle2D.Double) rectField.get(mrm);

        assertFalse(rect.contains(0, 0), "Corner (0,0) should be outside");
        assertFalse(rect.contains(800, 600), "Corner (800,600) should be outside");
        assertFalse(rect.contains(10, 10), "Point within margin should be outside");
    }

    @Test
    @DisplayName("fieldRect includes point just inside margin")
    void fieldRectIncludesJustInside() throws Exception {
        mrm.init(800, 600);

        Field rectField = MinimumRiskMovement.class.getDeclaredField("fieldRect");
        rectField.setAccessible(true);
        Rectangle2D.Double rect = (Rectangle2D.Double) rectField.get(mrm);

        assertTrue(rect.contains(19, 19), "Point just inside margin should be inside");
    }

    @Test
    @DisplayName("init can be called multiple times")
    void initMultipleTimes() throws Exception {
        mrm.init(800, 600);
        mrm.init(1000, 800);

        Field widthField = MinimumRiskMovement.class.getDeclaredField("fieldWidth");
        widthField.setAccessible(true);
        assertEquals(1000.0, widthField.getDouble(mrm), 1e-9);
    }
}
