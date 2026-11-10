package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import hadur117.core.melee.MinimumRiskMovement.Wave;
import hadur117.core.physics.BattleField;
import hadur117.core.world.EnemyShot;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StepSurfTest {
    private final BattleField field = field(1000, 1000);
    private final MinimumRiskMovement move = new MinimumRiskMovement(field);

    @Test
    @Tag("MMOVE-28")
    @DisplayName("MMOVE-28: the step surf ships off; its five steps are 140 px out, the first away from the crowd")
    void candidates() {
        assertFalse(MinimumRiskMovement.STEP_SURF, "cloud arm mstep first");
        Point2D.Double me = pt(500, 500);
        List<StepSurf.Foe> foes = List.of(new StepSurf.Foe(pt(500, 900), 100));
        List<Point2D.Double> steps = StepSurf.candidates(me, null, foes, field, move::clip);
        assertEquals(5, steps.size());
        for (Point2D.Double p : steps) assertEquals(StepSurf.STEP, me.distance(p), 1e-6);
        // Away from the one opponent to the north: south, with the corner pull bending it a little.
        assertTrue(steps.get(0).y < 400, "away step " + steps.get(0));
        // The four about the heading: on (south, no move yet), back, and either side.
        assertEquals(steps.get(0), steps.get(1));
        assertEquals(2 * StepSurf.STEP, steps.get(1).distance(steps.get(2)), 1e-6);
        assertEquals(2 * StepSurf.STEP, steps.get(3).distance(steps.get(4)), 1e-6);
    }

    @Test
    @Tag("MMOVE-28")
    @DisplayName("MMOVE-28: a head-on wave from the north sends the step sideways, not along its line")
    void dodgesTheWave() {
        Point2D.Double me = pt(500, 500);
        List<StepSurf.Foe> foes = List.of(new StepSurf.Foe(pt(500, 900), 100));
        EnemyShot shot = new EnemyShot("a", pt(500, 900), 0, 2.0);
        Wave wave = new Wave(shot, 1.0, new double[] {Math.PI}, new double[] {1}, Math.PI);
        Point2D.Double step = StepSurf.choose(me, null, 100, foes, 5, List.of(wave), field, move::clip);
        assertNotNull(step);
        assertTrue(Math.abs(step.x - 500) > 100, "sideways: " + step);
        // Without the wave the crowd alone decides: straight away from the opponent.
        Point2D.Double quiet = StepSurf.choose(me, null, 100, foes, 5, List.of(), field, move::clip);
        assertTrue(quiet.y < 400 && Math.abs(quiet.x - 500) < 60, "away: " + quiet);
    }

    @Test
    @Tag("MMOVE-28")
    @DisplayName("MMOVE-28: a step into a wall slides along it at full length")
    void smooth() {
        Point2D.Double me = pt(500, 50);
        Point2D.Double p = StepSurf.smooth(me, Math.PI, field, move::clip);
        assertEquals(StepSurf.STEP, me.distance(p), 1e-6);
        assertTrue(p.y >= MinimumRiskMovement.WALL_MARGIN, "inside: " + p);
        assertTrue(Math.abs(p.x - 500) > 100, "along the wall: " + p);
    }

    @Test
    @Tag("MMOVE-28")
    @DisplayName("MMOVE-28: the soonest nine waves within 30 ticks of the first are surfed")
    void soonest() {
        Point2D.Double me = pt(500, 500);
        Wave near = new Wave(new EnemyShot("a", pt(500, 700), 0, 2.0), 1, new double[] {Math.PI}, new double[] {1}, Math.PI);
        Wave late = new Wave(new EnemyShot("b", pt(50, 50), 0, 3.0), 1, new double[] {0}, new double[] {1}, 0);
        List<Wave> soon = StepSurf.soonest(me, List.of(late, near));
        assertEquals(1, soon.size());
        assertSame(near, soon.get(0));
    }
}
