package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.Wave;
import hadur117.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-43: a gone bullet keeps the shadows it cast before it died. */
class KeepShadowsTest {

    private static double width(List<double[]> intervals) {
        double w = 0;
        for (double[] i : intervals) w += i[1] - i[0];
        return w;
    }

    @Test
    @Tag("MOVE-43")
    @DisplayName("a bullet walked only before its death turn casts a part of its full shadow, none before it meets the wave")
    void deathTurnCutsTheWalk() {
        Point2D.Double s = new Point2D.Double(400, 100);
        Point2D.Double me = new Point2D.Double(400, 500);
        Wave w = BulletShadowsProperties.wave(s, 100, 2.0);
        OurBullet b = new OurBullet(100, me, DiaUtils.absoluteBearing(me, s) + 0.3, 2.0);
        double full = width(BulletShadows.of(w, List.of(b), 800, 600).get(1));
        assertTrue(full > 0, "the bullet crosses the wave");
        assertEquals(full, width(BulletShadows.of(w, List.of(b), x -> Long.MAX_VALUE, 800, 600).get(1)), 1e-12);
        assertEquals(0.0, width(BulletShadows.of(w, List.of(b), x -> 101L, 800, 600).get(1)), 1e-12,
            "dead before both bullets moved");
        // The bullets are 400 px apart and close at up to 28 px a turn; by turn 160 ours is off the field.
        assertEquals(full, width(BulletShadows.of(w, List.of(b), x -> 160L, 800, 600).get(1)), 1e-12);
        double part = width(BulletShadows.of(w, List.of(b), x -> 114L, 800, 600).get(1));
        assertTrue(part <= full + 1e-12);
    }
}
