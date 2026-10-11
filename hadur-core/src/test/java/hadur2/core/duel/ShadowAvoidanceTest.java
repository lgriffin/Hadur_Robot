package hadur2.core.duel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.gun.GunController;
import hadur2.core.model.Wave;
import hadur2.core.move.PlanInterval;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import hadur2.core.physics.Rules;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * GUN-7 through the duel's seam: a plan interval from movement (MOVE-8) and a candidate
 * bullet of ours give the damage the bullet's shadow would save us.
 */
class ShadowAvoidanceTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final Point2D.Double ENEMY = new Point2D.Double(400, 550);
    static final Point2D.Double ME = new Point2D.Double(400, 100);

    /** The enemy's firing wave at tick 30, power 1.95, aimed at us from straight above. */
    static Wave wave() {
        Wave w = new Wave("enemy", ENEMY, ME, 0, 30, 1.95, 0, 0, 1, FIELD, new MovementPredictor(FIELD));
        w.firingWave = true;
        return w;
    }

    /** The bearing from the enemy to us, straight south. */
    static final double DOWN = Math.PI;

    static PlanInterval interval(Wave w, double danger) {
        return new PlanInterval(w, DOWN - 0.05, DOWN + 0.05, danger);
    }

    static ShadowAvoidance seam(PlanInterval... plan) {
        // At tick 33: the wave has flown 3 turns, the shot would leave on 34 from where we are.
        return new ShadowAvoidance(800, 600).prepare(List.of(plan), ME, 33);
    }

    /**
     * The heading, scanned in 0.005 rad steps either side of straight at the enemy, whose
     * bullet saves the most. Exactly collinear bullets shadow a single bearing, which has no
     * width; a slightly oblique path sweeps a narrow range of bearings as the two close.
     */
    static double bestHeading(ShadowAvoidance s) {
        double best = 0;
        double bestSaved = -1;
        for (int i = -80; i <= 80; i++) {
            double h = i * 0.005;
            double saved = s.avoided(h, 1.95);
            if (saved > bestSaved) {
                bestSaved = saved;
                best = h;
            }
        }
        return best;
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("a bullet fired close to the line at the enemy meets the enemy's bullet on its way down")
    void nearHeadOnBulletSavesDamage() {
        ShadowAvoidance s = seam(interval(wave(), 0.2));
        double heading = bestHeading(s);
        double saved = s.avoided(heading, 1.95);
        assertTrue(saved > 0, "saved " + saved + " at " + heading);
        // At most the whole interval's danger times the bullet's damage.
        assertTrue(saved <= 0.2 * Rules.getBulletDamage(1.95) + 1e-12, "saved " + saved);
        assertEquals(0.2 * Rules.getBulletDamage(1.95), s.ceiling(1.95), 1e-12);
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("a bullet fired away from the interval saves nothing")
    void sideBulletSavesNothing() {
        ShadowAvoidance s = seam(interval(wave(), 0.2));
        assertEquals(0.0, s.avoided(Math.PI / 2, 1.95), 0.0);
        assertEquals(0.0, s.avoided(Math.PI, 1.95), 0.0, "fired away from the enemy, it never meets the wave");
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("what the wave's shadows already stop is not counted twice")
    void alreadyShadowedIsNotCountedAgain() {
        Wave w = wave();
        PlanInterval p = interval(w, 0.2);
        double heading = bestHeading(seam(p));
        double fresh = seam(p).avoided(heading, 1.95);
        assertTrue(fresh > 0);
        // A certain shadow over the whole interval: nothing is left to stop.
        w.setShadows(List.of(new double[] {DOWN - 0.1, DOWN + 0.1}));
        assertEquals(0.0, seam(p).avoided(heading, 1.95), 0.0);
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("the saving scales with the surf's chance of a hit there and the enemy bullet's damage")
    void savingScalesWithDangerAndDamage() {
        Wave w = wave();
        double heading = bestHeading(seam(interval(w, 0.1)));
        double base = seam(interval(w, 0.1)).avoided(heading, 1.95);
        assertTrue(base > 0);
        assertEquals(2 * base, seam(interval(w, 0.2)).avoided(heading, 1.95), 1e-12);
        assertEquals(0.0, seam(interval(w, 0.0)).avoided(heading, 1.95), 0.0);
        Wave light = wave();
        light.setBulletPower(0.5);
        light.firingWave = true;
        assertTrue(seam(interval(light, 0.1)).ceiling(1.95) < seam(interval(w, 0.1)).ceiling(1.95));
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("a wave of uncertain power counts half, as in the surf (WAVE-3)")
    void uncertainWaveCountsHalf() {
        Wave sure = wave();
        Wave unsure = wave();
        unsure.uncertain = true;
        double heading = bestHeading(seam(interval(sure, 0.2)));
        double full = seam(interval(sure, 0.2)).avoided(heading, 1.95);
        assertTrue(full > 0);
        assertEquals(full / 2, seam(interval(unsure, 0.2)).avoided(heading, 1.95), 1e-12);
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("a wave that has already passed us is dropped, and with no wave the seam is inactive")
    void passedWavesAreDropped() {
        Wave w = wave();
        // 500 px at 14.15 a turn: past us by tick 70.
        ShadowAvoidance late = new ShadowAvoidance(800, 600).prepare(List.of(interval(w, 0.2)), ME, 70);
        assertFalse(late.active());
        assertTrue(seam(interval(w, 0.2)).active());
        assertFalse(new ShadowAvoidance(800, 600).prepare(List.of(), ME, 33).active());
        assertEquals(0.0, late.ceiling(1.95), 0.0);
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("the shadow term is on in the release")
    void shippedOn() {
        assertTrue(GunController.SHADOW_AIM);
    }
}
