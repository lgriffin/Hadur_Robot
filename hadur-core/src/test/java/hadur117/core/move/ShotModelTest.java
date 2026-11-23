package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.physics.SimpleAims;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RAM-20: the shot model learns which simple aim a gun fires from its bullets. */
class ShotModelTest {

    /** A wave's aims with every angle distinct, {@code step} radians apart from {@code base}; no body turn known. */
    static double[] aims(double base, double step) {
        double[] a = new double[SimpleAims.COUNT];
        for (int lag = 0; lag < SimpleAims.LAGS; lag++) {
            for (int type = 0; type < SimpleAims.ANGLES; type++) {
                a[lag * SimpleAims.TYPES + type] = base + step * (lag * SimpleAims.ANGLES + type);
            }
            a[lag * SimpleAims.TYPES + SimpleAims.LATERAL] = 0;
            a[lag * SimpleAims.TYPES + SimpleAims.TURN_AFTER] = Double.NaN;
        }
        return a;
    }

    /** The candidate index of an angle type at a lag, without the body turn. */
    static int candidate(int lag, int type) {
        return lag * ShotModel.PER_LAG + type;
    }

    @Test
    @Tag("RAM-20")
    @DisplayName("RAM-20: the model is silent until its leading aim has matched two bullets, then leads with that aim")
    void learnsTheAimThatFired() {
        ShotModel model = new ShotModel();
        double[] wave = aims(1.0, 0.2);
        int fired = candidate(1, SimpleAims.CIRCULAR);
        assertFalse(model.ready());
        assertNull(model.rays(wave));
        model.observe(wave, ShotModel.angle(wave, fired));
        assertFalse(model.ready(), "one bullet is not enough");
        model.observe(wave, ShotModel.angle(wave, fired));
        assertTrue(model.ready());
        assertEquals(fired, model.best());
        assertEquals(2, model.read());
        // A new wave: the leading ray is the learned aim's angle there, and the weights sum to 1.
        double[] next = aims(2.0, 0.3);
        double[] rays = model.rays(next);
        assertEquals(ShotModel.angle(next, fired), rays[0], 1e-12);
        double sum = 0;
        for (int i = 0; i < ShotModel.TOP; i++) sum += rays[2 * i + 1];
        assertEquals(1.0, sum, 1e-9);
        assertTrue(rays[1] > 0.99, "nothing else matched: " + rays[1]);
    }

    @Test
    @Tag("RAM-20")
    @DisplayName("RAM-20: a gun none of the simple aims explains never makes the model ready")
    void staysSilentOnAnUnexplainedGun() {
        ShotModel model = new ShotModel();
        double[] wave = aims(1.0, 0.2);
        int fired = candidate(0, SimpleAims.LINEAR);
        // One bullet in ten on the aim, the rest well off every candidate: under MIN_SHARE of the bullets read.
        for (int i = 0; i < 40; i++) {
            model.observe(wave, i % 10 == 0 ? ShotModel.angle(wave, fired) : 0.5);
        }
        assertEquals(fired, model.best());
        assertTrue(model.score(fired) >= ShotModel.MIN_SCORE);
        assertFalse(model.ready(), "share " + model.score(fired) / model.read());
        assertNull(model.rays(wave));
    }

    @Test
    @Tag("RAM-20")
    @DisplayName("RAM-20: an aim with the enemy's body turn added is a candidate of its own")
    void scoresTheTurnedAims() {
        ShotModel model = new ShotModel();
        double[] wave = aims(1.0, 0.2);
        wave[SimpleAims.TYPES + SimpleAims.TURN_AFTER] = 0.07;
        int turned = ShotModel.PER_LAG + SimpleAims.ANGLES + SimpleAims.HEAD_ON;
        double heading = wave[SimpleAims.TYPES + SimpleAims.HEAD_ON] + 0.07;
        assertEquals(heading, ShotModel.angle(wave, turned), 1e-12);
        model.observe(wave, heading);
        model.observe(wave, heading);
        assertEquals(turned, model.best());
        // A wave with no body turn known has no such ray.
        assertNull(model.rays(aims(1.0, 0.2)));
    }
}
