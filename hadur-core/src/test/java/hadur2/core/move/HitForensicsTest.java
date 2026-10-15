package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.SeedWeight;
import hadur2.core.model.Wave;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-9: the HF record of a bullet that hit us (plan-top3 stage 0). */
class HitForensicsTest {

    @Test
    @Tag("MOVE-9")
    @DisplayName("a linear gun aims at asin(v / s) over the escape angle, a full-speed orbit near guess factor 1")
    void linearGuessFactor() {
        double speed = 20 - 3 * 1.95;
        double mea = Math.asin(8 / speed);
        assertEquals(1.0, HitForensics.linearGuessFactor(8, speed, mea), 1e-12);
        assertEquals(0.0, HitForensics.linearGuessFactor(0, speed, mea), 1e-12);
        assertEquals(Math.asin(4 / speed) / mea, HitForensics.linearGuessFactor(4, speed, mea), 1e-12);
    }

    @Test
    @Tag("MOVE-9")
    @DisplayName("a hit is linear near the linear aim, head-on near 0, learned elsewhere")
    void classify() {
        assertEquals("linear", HitForensics.classify(0.62, 0.6, 0.05));
        assertEquals("headon", HitForensics.classify(0.02, 0.6, 0.05));
        assertEquals("learned", HitForensics.classify(-0.5, 0.6, 0.05));
        // A standing target: the linear aim is head-on, so the hit counts as head-on.
        assertEquals("headon", HitForensics.classify(0.01, 0.0, 0.05));
        // The tolerance is our half-width seen from the source: wider close in.
        double mea = Math.asin(8 / 14.15);
        assertTrue(HitForensics.tolerance(100, mea) > HitForensics.tolerance(500, mea));
    }

    @Test
    @Tag("MOVE-9")
    @DisplayName("the percentile is the share of samples strictly less dangerous")
    void percentile() {
        double[] s = {0.1, 0.2, 0.3, 0.4};
        assertEquals(0.0, HitForensics.percentile(s, 0.1), 1e-12);
        assertEquals(0.5, HitForensics.percentile(s, 0.25), 1e-12);
        assertEquals(1.0, HitForensics.percentile(s, 0.9), 1e-12);
        assertTrue(Double.isNaN(HitForensics.percentile(new double[0], 0.5)));
        assertEquals(-1.0, HitForensics.sampleGuessFactor(0), 1e-12);
        assertEquals(1.0, HitForensics.sampleGuessFactor(HitForensics.SAMPLES - 1), 1e-12);
    }

    @Test
    @Tag("MOVE-9")
    @DisplayName("the record names class, guess factors, percentile, distance, power and who drove")
    void record() {
        assertEquals("HF,3,250,linear,0.620,0.600,0.150,412.0,1.95,1",
            HitForensics.record(3, 250, "linear", 0.62, 0.6, 0.15, 412, 1.95, true));
        assertEquals("HF,0,40,nowave,NaN,NaN,NaN,300.0,3.00,0",
            HitForensics.record(0, 40, "nowave", Double.NaN, Double.NaN, Double.NaN, 300, 3, false));
    }

    @Test
    @Tag("MOVE-9")
    @DisplayName("the views rate the angle they learned as dangerous and leave the surf's cache as it was")
    void dangerPercentileReadsTheViews() {
        MoveController m = SurfOpeningTest.controller();
        double[] s = new double[MoveController.SAMPLE_WIDTH];
        s[12] = 0.5;
        for (int i = 0; i < 7; i++) m.seed(s, new SeedWeight(0.5));
        Wave w = DangerIntegrationTest.wave(1.95, 400, 450);
        Wave.Intersection at = new Wave.Intersection(w.firingAngle(0.5), 0.1);
        double before = m.getDangerScore(w, at, 0);
        assertTrue(m.dangerPercentile(w, 0.5) > 0.9, "learned angle");
        assertTrue(m.dangerPercentile(w, -0.8) < 0.5, "far from it");
        assertEquals(before, m.getDangerScore(w, at, 0), 1e-12);
    }
}
