package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.BotOrders;
import hadur117.core.model.SeedWeight;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** ORACLE-1: the views' surfaces at each wave's first three-option rating. */
class OracleRecordTest {

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
    @Tag("ORACLE-1")
    @DisplayName("recording the surfaces does not change what the surf drives, this tick or the next")
    void recordingChangesNothing() {
        SurfMover plain = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        SurfMover recording = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        recording.setOracleRecord(true);
        MoveController a = world();
        MoveController b = world();
        assertEquals(drive(plain, a), drive(recording, b));
        assertEquals(drive(plain, a), drive(recording, b), "the surf's cached neighbours are untouched");
        assertTrue(plain.drainOracleRecords().isEmpty(), "off: no record");
    }

    @Test
    @Tag("ORACLE-1")
    @DisplayName("one record per wave, whose surfaces peak where the views' hits are")
    void recordHoldsTheSurfaces() {
        MoveController m = world();
        SurfMover surf = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        surf.setOracleRecord(true);
        drive(surf, m);
        List<String> first = surf.drainOracleRecords();
        assertEquals(1, first.size());
        drive(surf, m);
        assertTrue(surf.drainOracleRecords().isEmpty(), "the second rating of the same wave is not recorded");

        String[] f = first.get(0).split(",");
        assertEquals("30", f[0], "fire time");
        assertEquals("1", f[2], "a firing wave");
        int views = Integer.parseInt(f[16]);
        int samples = Integer.parseInt(f[17]);
        assertEquals(m.viewCount(), views);
        assertEquals(HitForensics.SAMPLES, samples);
        assertEquals(18 + views * (OracleRecord.VIEW_HEAD + samples), f.length, "no trailing fields");
        int on = 0;
        for (int v = 0; v < views; v++) {
            int at = 18 + v * (OracleRecord.VIEW_HEAD + samples);
            if (Double.parseDouble(f[at]) != 1) continue;
            on++;
            assertTrue(Double.parseDouble(f[at + 2]) > 0, "a view on has scan weight");
            int peak = 0;
            for (int g = 1; g < samples; g++) {
                if (Double.parseDouble(f[at + 3 + g]) > Double.parseDouble(f[at + 3 + peak])) peak = g;
            }
            assertEquals(0.3, HitForensics.sampleGuessFactor(peak), 0.051, "view " + v + " peaks at its hits");
        }
        assertTrue(on > 0, "some view is on");
    }
}
