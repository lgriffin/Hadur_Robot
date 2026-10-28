package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.BotOrders;
import hadur117.core.model.SeedWeight;
import hadur117.core.model.Wave;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** AES-1: the decision record of each wave's first three-option rating. */
class AesRecordTest {

    private static final Point2D.Double SOURCE = new Point2D.Double(400, 450);
    private static final Point2D.Double ME = new Point2D.Double(400, 100);

    /** A controller whose views hold seven hits at guess factor 0.3, and one wave in the air. */
    private static MoveController world() {
        MoveController m = SurfOpeningTest.controller();
        double[] s = new double[MoveController.SAMPLE_WIDTH];
        s[12] = 0.3;
        for (int i = 0; i < 7; i++) m.seed(s, new SeedWeight(0.5));
        m.addWave(PlanPublishTest.firingWave(SOURCE, ME));
        return m;
    }

    private static BotOrders drive(SurfMover surf, MoveController m) {
        BotOrders.Builder b = BotOrders.builder();
        surf.move(b, PlanPublishTest.at(ME, 40), m, SOURCE, 2);
        return b.build();
    }

    @Test
    @Tag("AES-1")
    @DisplayName("recording does not change what the surf drives")
    void recordingChangesNothing() {
        SurfMover plain = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        SurfMover recording = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        recording.setAesRecord(true);
        assertEquals(drive(plain, world()), drive(recording, world()));
        assertTrue(plain.drainAesRecords().isEmpty(), "off: no record");
    }

    @Test
    @Tag("AES-1")
    @DisplayName("one record per wave, at its first rating, whose terms rebuild each option's danger")
    void recordRebuildsTheDanger() {
        MoveController m = world();
        SurfMover surf = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        surf.setAesRecord(true);
        drive(surf, m);
        List<String> first = surf.drainAesRecords();
        assertEquals(1, first.size());
        drive(surf, m);
        assertTrue(surf.drainAesRecords().isEmpty(), "the second rating of the same wave is not recorded");

        String[] f = first.get(0).split(",");
        assertEquals("30", f[0], "fire time");
        assertEquals("1", f[2], "a firing wave");
        int chosen = Integer.parseInt(f[5]);
        int views = Integer.parseInt(f[6]);
        assertEquals(m.viewCount(), views);
        int width = AesRecord.FIXED + 2 * views + 1;
        int at = 7;
        double best = Double.POSITIVE_INFINITY;
        int argmin = -1;
        for (int o = 0; o < 3; o++) {
            if (f[at++].equals("0")) continue;
            double total = Double.parseDouble(f[at++]);
            double[] t = new double[width];
            for (int k = 0; k < width; k++) t[k] = parse(f[at++]);
            double score = Double.isNaN(t[AesRecord.FIXED + 2 * views]) ? sum(t, views, 0) / sum(t, views, views)
                : t[AesRecord.FIXED + 2 * views];
            assertEquals(t[AesRecord.VIEW_SCORE], score, 1e-4 * Math.max(1, score), "view score");
            double rebuilt = (t[AesRecord.HIT_RATE] * (1 - t[AesRecord.SHADOWED]) + t[AesRecord.VIEW_SCORE])
                * t[AesRecord.DAMAGE] * (t[AesRecord.UNCERTAIN] > 0 ? 0.5 : 1) / t[AesRecord.TIME_TO_IMPACT]
                * Math.pow(2.5, t[AesRecord.DISTANCE_QUOTIENT]) / 2.5 * t[AesRecord.ESCAPE];
            assertEquals(t[AesRecord.FIRST], rebuilt, 1e-4 * rebuilt, "first wave's danger");
            assertTrue(total >= t[AesRecord.FIRST] * (1 - 1e-5), "the total adds the next wave");
            if (total < best) {
                best = total;
                argmin = o;
            }
        }
        assertEquals(at, f.length, "no trailing fields");
        // Ties go to the stop, then counter-clockwise; with distinct totals the least is taken.
        assertTrue(chosen == argmin || chosen == 1, "chosen " + chosen + " least " + argmin);
    }

    private static double parse(String s) {
        return s.equals("nan") ? Double.NaN : Double.parseDouble(s);
    }

    private static double sum(double[] t, int views, int offset) {
        double s = 0;
        for (int i = 0; i < views; i++) s += t[AesRecord.FIXED + offset + i];
        return s;
    }
}
