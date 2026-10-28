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

/** MOVE-27: the enemy-gun ensemble. */
class GunMimicsTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final int BINS = StopPointSurf.BINS;

    static Wave wave() {
        return new Wave("enemy", new Point2D.Double(400, 500), new Point2D.Double(400, 200),
            0, 0, 2, 0, 0, 1, FIELD, new MovementPredictor(FIELD));
    }

    static double[] uniform() {
        double[] p = new double[BINS];
        java.util.Arrays.fill(p, 1.0 / BINS);
        return p;
    }

    static double sum(double[] p) {
        double s = 0;
        for (double v : p) s += v;
        return s;
    }

    @Test
    @Tag("MOVE-27")
    @DisplayName("with no visits learned the blend is the views' profile")
    void freshBlendIsTheViews() {
        GunMimics g = new GunMimics();
        double[] views = new double[BINS];
        views[GunMimics.gfBin(0.3, BINS)] = 1.0;
        double[] out = g.blend(wave(), views);
        for (int j = 0; j < BINS; j++) assertEquals(views[j], out[j], 1e-12);
    }

    @Test
    @Tag("MOVE-27")
    @DisplayName("the views start far ahead: one visit barely moves the blend")
    void viewsLeadAtTheStart() {
        GunMimics g = new GunMimics();
        Wave w = wave();
        g.learnVisit(w, -0.6);
        double[] views = new double[BINS];
        views[GunMimics.gfBin(0.3, BINS)] = 1.0;
        double[] out = g.blend(w, views);
        assertEquals(1.0, sum(out), 1e-9);
        assertTrue(out[GunMimics.gfBin(0.3, BINS)] > 0.85, "views should dominate at first");
    }

    @Test
    @Tag("MOVE-27")
    @DisplayName("a mimic that predicts the real bullets takes over the blend")
    void predictiveMimicTakesOver() {
        GunMimics g = new GunMimics();
        Wave w = wave();
        // We keep going to GF -0.6 and the enemy keeps hitting us there; the views look elsewhere.
        double[] views = new double[BINS];
        views[GunMimics.gfBin(0.5, BINS)] = 1.0;
        for (int i = 0; i < 60; i++) {
            g.learnVisit(w, -0.6);
            g.scoreBullet(w, -0.6, views);
        }
        double[] s = g.scores();
        assertTrue(s[0] < 0.5, "views score should fall: " + s[0]);
        for (int m = 1; m < s.length; m++) assertTrue(s[m] > s[0], "mimic " + m + " should beat the views");
        double[] out = g.blend(w, views);
        assertTrue(out[GunMimics.gfBin(-0.6, BINS)] > out[GunMimics.gfBin(0.5, BINS)]);
    }

    @Test
    @Tag("MOVE-27")
    @DisplayName("a uniform profile scores 1 at any bullet")
    void uniformDensityIsOne() {
        assertEquals(1.0, GunMimics.density(uniform(), 0.2), 1e-9);
        assertEquals(1.0, GunMimics.density(uniform(), -1.0), 1e-9);
    }

    @Test
    @Tag("MOVE-27")
    @DisplayName("a rolling buffer peaks at the visits and forgets at its depth")
    void rollingBuffer() {
        double[] b = new double[GunMimics.GF_BINS];
        int n = 0;
        for (int i = 0; i < 10; i++) n = GunMimics.roll(b, n, 0.5, 3);
        for (int i = 0; i < 10; i++) n = GunMimics.roll(b, n, -0.5, 3);
        assertTrue(b[GunMimics.gfBin(-0.5, b.length)] > 10 * b[GunMimics.gfBin(0.5, b.length)]);
    }

    @Test
    @Tag("MOVE-27")
    @DisplayName("segments split waves by the shooter's view of us")
    void segmentsSplitWaves() {
        Wave slow = wave();
        slow.targetVelocity = 0;
        Wave fast = wave();
        fast.targetVelocity = 8;
        fast.targetVelocitySign = 1;
        fast.targetRelativeHeading = Math.PI / 2;
        GunMimics.Mimic m = new GunMimics.Mimic(10, GunMimics.Feature.LATERAL);
        assertTrue(m.segment(slow) != m.segment(fast));
    }

    @Test
    @Tag("MOVE-27")
    @DisplayName("a flat buffer gives a flat profile at the surf's bins")
    void flatBufferFlatProfile() {
        GunMimics.Mimic m = new GunMimics.Mimic(10);
        java.util.Arrays.fill(m.flat, 1.0);
        m.flatCount = 1;
        java.util.Arrays.fill(m.buffers[0], 1.0);
        double[] p = m.profile(wave(), BINS);
        for (double v : p) assertEquals(1.0 / BINS, v, 1e-12);
    }
}
