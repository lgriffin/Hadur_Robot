package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.RobotState;
import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import hadur2.core.physics.Rules;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** DODGE-6: the shot-dodge planner's costs and its choice of path. The enemy fires from 300 px north. */
class ShotDodgePlannerTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final MovementPredictor PREDICTOR = new MovementPredictor(FIELD);
    static final Point2D.Double SOURCE = new Point2D.Double(400, 500);
    static final Point2D.Double ME = new Point2D.Double(400, 200);

    private static Wave wave() {
        return new Wave("enemy", SOURCE, ME, 0, 0, 2, 0, 0, 1, FIELD, PREDICTOR);
    }

    private static RobotState me() {
        return RobotState.newBuilder().setLocation(ME).setHeading(Math.PI / 2).setVelocity(0).setTime(1).build();
    }

    private static ShotDodgePlanner planner() {
        return new ShotDodgePlanner(FIELD, PREDICTOR);
    }

    @Test
    @Tag("DODGE-6")
    @DisplayName("a path the expert's bullet crosses costs a hit; a miss costs damage over clearance squared")
    void waveCost() {
        Wave w = wave();
        Wave.Intersection x = new Wave.Intersection(Math.PI, 0.06);
        double damage = Rules.getBulletDamage(2);
        assertEquals(ShotDodgePlanner.HIT_COST * damage, ShotDodgePlanner.waveCost(w, x, Math.PI + 0.05), 1e-3);
        double near = ShotDodgePlanner.waveCost(w, x, Math.PI + 0.1);
        double far = ShotDodgePlanner.waveCost(w, x, Math.PI + 0.3);
        assertEquals(damage / (0.04 * 0.04), near, 1e-6);
        assertTrue(far < near, "a wider miss is cheaper");
        assertTrue(near < ShotDodgePlanner.HIT_COST, "any miss is below a hit");
    }

    @Test
    @Tag("DODGE-6")
    @DisplayName("against a head-on gun the planner leaves the line of fire; standing still would be hit")
    void leavesHeadOn() {
        ShotDodgePlanner p = planner();
        Wave w = wave();
        List<Wave> waves = List.of(w);
        List<Double> bullets = List.of(Math.PI);
        double still = p.cost(p.path(me(), ME, waves), waves, bullets, null);
        assertTrue(still >= ShotDodgePlanner.HIT_COST, "standing still is hit");
        p.plan(me(), waves, bullets, null, 500);
        List<RobotState> chosen = p.path(me(), p.planPoint(), waves);
        assertTrue(p.cost(chosen, waves, bullets, null) < ShotDodgePlanner.HIT_COST, "the chosen path misses");
        assertTrue(Math.abs(p.planPoint().x - ME.x) > 20, "moved off the line: " + p.planPoint());
    }

    @Test
    @Tag("DODGE-6")
    @DisplayName("points cover standing still, every heading and both orbits; paths run until the wave has passed")
    void pointsAndPaths() {
        ShotDodgePlanner p = planner();
        List<Wave> waves = List.of(wave());
        List<Point2D.Double> points = p.points(me(), waves, 500);
        assertEquals(ME, points.get(0));
        assertTrue(points.size() > ShotDodgePlanner.HEADINGS * 3, "too few points: " + points.size());
        List<RobotState> path = p.path(me(), points.get(5), waves);
        RobotState last = path.get(path.size() - 1);
        assertEquals(Wave.WavePosition.GONE, waves.get(0).checkWavePosition(last, true));
    }

    @Test
    @Tag("DODGE-6")
    @DisplayName("the enemy term prefers paths that keep away from where the enemy is driving")
    void enemyTerm() {
        ShotDodgePlanner p = planner();
        RobotState enemy = RobotState.newBuilder().setLocation(new Point2D.Double(400, 260))
            .setHeading(Math.PI).setVelocity(8).setTime(1).build();
        Point2D.Double held = p.enemyAt(enemy, 1000);
        assertEquals(400, held.x, 1e-9);
        assertEquals(18, held.y, 1e-9, "held inside the field");
        List<Wave> none = List.of(wave());
        List<Double> miss = List.of(0.0);
        double toward = p.cost(p.path(me(), new Point2D.Double(400, 300), none), none, miss, enemy);
        double away = p.cost(p.path(me(), new Point2D.Double(700, 200), none), none, miss, enemy);
        assertTrue(away < toward, away + " vs " + toward);
    }
}
