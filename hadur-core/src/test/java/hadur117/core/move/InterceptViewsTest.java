package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.Wave;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-52: an enemy bullet our bullet met teaches the danger views, as a hit does. */
class InterceptViewsTest {

    static final BattleField FIELD = new BattleField(800, 600);

    private static Wave wave() {
        Point2D.Double enemy = new Point2D.Double(400, 100);
        Point2D.Double me = new Point2D.Double(400, 500);
        Wave w = new Wave("enemy", enemy, me, 0, 10, 2.0, 0, 0, 1, FIELD, new MovementPredictor(FIELD));
        double[] still = {me.x, me.y, 0, 0, 0, 0, enemy.x, enemy.y, 0};
        w.aimStates = new double[][] {still, still, still};
        w.targetDistance = 400;
        return w;
    }

    @Test
    @Tag("MOVE-52")
    @DisplayName("an intercepted bullet adds one point to each view that learns hits, as a hit does")
    void interceptTeachesTheViews() {
        MoveController hit = new MoveController(FIELD, new MovementPredictor(FIELD));
        MoveController met = new MoveController(FIELD, new MovementPredictor(FIELD));
        int before = met.viewSize("normal");
        assertTrue(before >= 0, "the normal view exists");
        hit.logBulletHit(wave(), new Point2D.Double(400, 480), 0, 40);
        met.learnInterceptViews(wave(), new Point2D.Double(400, 300), 0, 40);
        assertEquals(hit.viewSize("normal"), met.viewSize("normal"));
        assertEquals(before + 1, met.viewSize("normal"));
        met.learnInterceptViews(null, new Point2D.Double(400, 300), 0, 41);
        assertEquals(before + 1, met.viewSize("normal"), "no wave, nothing learnt");
    }
}
