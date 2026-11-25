package hadur117.core.duel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.Wave;
import hadur117.core.move.PlanInterval;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import hadur117.core.physics.MovementPredictor;
import hadur117.core.physics.Rules;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** GUN-13: ink aimed where an enemy bullet on the surf's plan will be. */
class InkShotTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final Point2D.Double ENEMY = new Point2D.Double(400, 550);
    static final Point2D.Double ME = new Point2D.Double(400, 100);
    /** Where the plan lands us: 80 px east of where the shot leaves, so the ink crosses the rays. */
    static final Point2D.Double LANDING = new Point2D.Double(480, 120);

    static Wave wave() {
        Wave w = new Wave("enemy", ENEMY, ME, 0, 30, 1.95, 0, 0, 1, FIELD, new MovementPredictor(FIELD));
        w.firingWave = true;
        return w;
    }

    static PlanInterval plan(Wave w) {
        double b = DiaUtils.absoluteBearing(ENEMY, LANDING);
        double half = Math.atan(18 / ENEMY.distance(LANDING));
        return new PlanInterval(w, b - half, b + half, 0.6);
    }

    @Test
    @Tag("GUN-13")
    @DisplayName("each candidate meets the bearing's bullet: our bullet can just reach that point by then")
    void meetSolvesTheCrossing() {
        Wave w = wave();
        double bearing = DiaUtils.absoluteBearing(ENEMY, LANDING);
        double speed = Rules.getBulletSpeed(InkShot.POWER);
        List<Double> aims = InkShot.meet(w, bearing, ME, 34, speed);
        assertEquals(2, aims.size());
        // The first aim points at the bullet's position at a time t where ours has flown as far.
        double aim = aims.get(0);
        boolean found = false;
        for (double t = 35; t < 80; t += 0.01) {
            double r = w.bulletSpeed() * (t - w.fireTime);
            Point2D.Double p = new Point2D.Double(ENEMY.x + Math.sin(bearing) * r, ENEMY.y + Math.cos(bearing) * r);
            if (Math.abs(DiaUtils.absoluteBearing(ME, p) - aim) < 1e-3
                    && Math.abs(ME.distance(p) - speed * (t - 34)) < 1.0) {
                found = true;
                break;
            }
        }
        assertTrue(found, "the aim is where the two bullets are on the same turn");
    }

    @Test
    @Tag("GUN-13")
    @DisplayName("the best ink saves a share of the plan, more than a shot straight at the enemy")
    void bestInkSavesMoreThanHeadOn() {
        PlanInterval p = plan(wave());
        ShadowAvoidance seam = new ShadowAvoidance(800, 600).prepare(List.of(p), ME, 33);
        InkShot.Aim best = InkShot.best(List.of(p), seam, ME, 34);
        assertNotNull(best);
        double headOn = seam.avoided(DiaUtils.absoluteBearing(ME, ENEMY), InkShot.POWER);
        assertTrue(best.saved > headOn, best.saved + " vs " + headOn);
        assertTrue(best.saved <= seam.ceiling(InkShot.POWER) + 1e-9);
        assertTrue(InkShot.candidates(List.of(p, p, p, p, p), ME, 34).size() <= InkShot.MAX_CANDIDATES);
    }

    @Test
    @Tag("GUN-13")
    @DisplayName("ink against the gun's shot, per tick of reload")
    void inkAgainstTheShot() {
        // A third of a 1.95 bullet's damage saved beats a 10% gun; a tiny saving loses to a 30% one.
        assertTrue(InkShot.worthMore(Rules.getBulletDamage(1.95) / 3, 0.10, 1.95));
        assertFalse(InkShot.worthMore(0.05, 0.30, 1.95));
        assertEquals(10.2, InkShot.reload(InkShot.POWER), 1e-9);
    }
}
