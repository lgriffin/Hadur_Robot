package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.BotOrders;
import hadur117.core.model.SeedWeight;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** SKEY-1 and SKEY-2: the surf-key record, and an opponent's surf key in the views. */
class SurfKeyTest {

    private static final Point2D.Double SOURCE = new Point2D.Double(400, 450);
    private static final Point2D.Double ME = new Point2D.Double(400, 100);
    private static final double[] DEFAULTS = new MoveFormula().weights;

    /** A controller whose views hold seven hits spread over guess factors, and one wave in the air. */
    private static MoveController world() {
        MoveController m = SurfOpeningTest.controller();
        for (int i = 0; i < 7; i++) {
            double[] s = new double[MoveController.SAMPLE_WIDTH];
            for (int d = 0; d < 9; d++) s[d] = ((i + 1) * (d + 3) % 7) / 7.0;
            s[12] = -0.6 + 0.2 * i;
            m.seed(s, new SeedWeight(0.5));
        }
        m.addWave(PlanPublishTest.firingWave(SOURCE, ME));
        return m;
    }

    private static BotOrders drive(SurfMover surf, MoveController m) {
        BotOrders.Builder b = BotOrders.builder();
        surf.move(b, PlanPublishTest.at(ME, 40), m, SOURCE, 2);
        return b.build();
    }

    @Test
    @Tag("SKEY-1")
    @DisplayName("recording the surf key changes nothing the surf drives, and writes one line per wave")
    void recordChangesNothing() {
        SurfMover plain = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        SurfMover recording = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        recording.setSurfKeyRecord(true);
        MoveController a = world();
        MoveController b = world();
        assertEquals(drive(plain, a), drive(recording, b));
        assertEquals(drive(plain, a), drive(recording, b));
        assertTrue(plain.drainSurfKeyRecords().isEmpty(), "off: no record");
        List<String> lines = recording.drainSurfKeyRecords();
        assertEquals(1, lines.size(), "one record per wave, at its first rating");
        String[] p = lines.get(0).split(",");
        assertEquals(3 + new FlattenerFormula().weights.length, p.length, "fire time, power, firing, then the point");
        assertEquals("1", p[2], "a real bullet's wave");
        assertTrue(recording.drainSurfKeyRecords().isEmpty(), "drained");
    }

    @Test
    @Tag("SKEY-2")
    @DisplayName("a surf key multiplies the MoveFormula views' weights only; null restores the defaults")
    void keyWeights() {
        MoveController m = world();
        double[][] before = new double[m.viewCount()][];
        for (int i = 0; i < m.viewCount(); i++) before[i] = m.viewKeyWeights(i);
        double[] key = {2, 1, 1, 0.5, 1, 1, 1, 4, 1, 1.5};
        m.setSurfKey(key);
        assertEquals(1.5, m.keyWidth());
        int inSpace = 0;
        for (int i = 0; i < m.viewCount(); i++) {
            double[] w = m.viewKeyWeights(i);
            if (m.viewInKeySpace(i)) {
                inSpace++;
                for (int d = 0; d < DEFAULTS.length; d++) assertEquals(DEFAULTS[d] * key[d], w[d], 1e-12);
            } else {
                assertArrayEquals(before[i], w, 0, "other spaces keep their own weights");
            }
        }
        assertEquals(8, inSpace, "normal, recent1 to recent6 and the light flattener");
        m.setSurfKey(null);
        assertEquals(1.0, m.keyWidth());
        for (int i = 0; i < m.viewCount(); i++) {
            if (m.viewInKeySpace(i)) assertArrayEquals(DEFAULTS, m.viewKeyWeights(i), 0);
        }
    }

    @Test
    @Tag("SKEY-2")
    @DisplayName("the identity key plays exactly as no key; a wider kernel changes the danger")
    void identityKeyIsTheDefault() {
        MoveController none = world();
        MoveController identity = world();
        identity.setSurfKey(new double[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
        SurfMover a = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        SurfMover b = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        a.setAesRecord(true);
        b.setAesRecord(true);
        assertEquals(drive(a, none), drive(b, identity));
        assertEquals(a.drainAesRecords(), b.drainAesRecords(), "every danger term the same");
        MoveController wide = world();
        wide.setSurfKey(new double[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 3});
        SurfMover c = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        c.setAesRecord(true);
        drive(c, wide);
        MoveController plain = world();
        SurfMover d = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        d.setAesRecord(true);
        drive(d, plain);
        assertNotEquals(d.drainAesRecords(), c.drainAesRecords(), "a 3x kernel rates the options differently");
    }
}
