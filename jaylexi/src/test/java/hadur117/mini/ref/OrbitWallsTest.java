package hadur117.mini.ref;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.geom.Point2D;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * JAYLEXI-20: the surf segments each enemy wave on how much of our orbit ahead is still in the
 * field, read by the readable reference's {@code clear}. JayLexiReplayTest (JAYLEXI-11) holds the
 * shipped build to the reference's orders bit for bit, so this rule is the shipped one too.
 */
class OrbitWallsTest {

    @AfterEach
    void resetDistance() {
        JayLexi.distance = 0;
    }

    static int clear(double x, double y, double bearing, double dir, double distance) {
        JayLexi.distance = distance;
        return JayLexi.clear(new Point2D.Double(x, y), bearing, dir);
    }

    @Test
    @Tag("JAYLEXI-20")
    @DisplayName("the three orbit points sit 0.18, 0.36 and 0.64 rad round, at the current distance")
    void fractions() {
        assertEquals(0.18, JayLexi.FRACTIONS[0]);
        assertEquals(0.36, JayLexi.FRACTIONS[1]);
        assertEquals(0.64, JayLexi.FRACTIONS[2]);
    }

    @Test
    @Tag("JAYLEXI-20")
    @DisplayName("in mid-field every point is clear, either way round")
    void midField() {
        assertEquals(3, clear(400, 300, 0, 1, 100));
        assertEquals(3, clear(400, 300, 0, -1, 100));
    }

    @Test
    @Tag("JAYLEXI-20")
    @DisplayName("an orbit running into the wall counts the points before the first one outside")
    void runningIntoTheWall() {
        // Points at (693, 536), (735, 525), (793, 492): the third is past the right wall (782).
        assertEquals(2, clear(650, 300, 0, 1, 240));
        assertEquals(1, clear(690, 300, 0, 1, 270));
    }

    @Test
    @Tag("JAYLEXI-20")
    @DisplayName("counting stops at the first point outside, even when a later one is back inside")
    void stopsAtTheFirstOutside() {
        // Points at (798, 282) and (794, 265) are outside; (780, 240) is inside but not counted.
        assertEquals(0, clear(700, 300, Math.PI / 2, 1, 100));
    }
}
