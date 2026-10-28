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
    @DisplayName("one record per wave, whose neighbours rebuild the views' score the AES record gives each option")
    void recordRebuildsTheViewScore() {
        MoveController m = world();
        SurfMover surf = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        surf.setOracleRecord(true);
        surf.setAesRecord(true);
        drive(surf, m);
        List<String> first = surf.drainOracleRecords();
        List<String> aes = surf.drainAesRecords();
        assertEquals(1, first.size());
        assertEquals(1, aes.size());
        drive(surf, m);
        assertTrue(surf.drainOracleRecords().isEmpty(), "the second rating of the same wave is not recorded");

        String[] f = first.get(0).split(",");
        assertEquals("30", f[0], "fire time");
        assertEquals("1", f[2], "a firing wave");
        double bearing = Double.parseDouble(f[5]);
        int dir = Integer.parseInt(f[6]);
        double mea = Double.parseDouble(f[7]);
        int views = Integer.parseInt(f[16]);
        assertEquals(m.viewCount(), views);
        double[] weight = new double[views];
        double[][] gf = new double[views][];
        double[][] scan = new double[views][];
        int at = 17;
        int on = 0;
        for (int v = 0; v < views; v++) {
            boolean isOn = Double.parseDouble(f[at++]) == 1;
            weight[v] = Double.parseDouble(f[at++]);
            int count = (int) Double.parseDouble(f[at++]);
            gf[v] = new double[count];
            scan[v] = new double[count];
            for (int k = 0; k < count; k++) {
                gf[v][k] = Double.parseDouble(f[at++]);
                scan[v][k] = Double.parseDouble(f[at++]);
                assertEquals(0.3, gf[v][k], 1e-9, "the neighbours are the hits");
            }
            if (isOn) on++;
        }
        assertEquals(at, f.length, "no trailing fields");
        assertTrue(on > 0, "some view is on");

        String[] a = aes.get(0).split(",");
        int width = AesRecord.FIXED + 2 * views + 1;
        int ai = 7;
        int rebuilt = 0;
        for (int o = 0; o < 3; o++) {
            if (a[ai++].equals("0")) continue;
            ai++;
            double[] t = new double[width];
            for (int k = 0; k < width; k++) t[k] = parse(a[ai++]);
            assertEquals(t[AesRecord.LOW], Double.parseDouble(f[10 + 2 * o]), 1e-5, "the same plan interval");
            if (t[AesRecord.SHADOWED] != 0 || !Double.isNaN(t[AesRecord.FIXED + 2 * views])) continue;
            double low = t[AesRecord.LOW];
            double high = t[AesRecord.HIGH];
            double centre = (low + high) / 2;
            double bandwidth = (high - low) / 2;
            List<double[]> whole = List.of(new double[] {low, high, 1.0});
            double num = 0;
            double den = 0;
            for (int v = 0; v < views; v++) {
                for (int k = 0; k < gf[v].length; k++) {
                    double angle = hadur117.core.physics.DiaUtils.normalizeAngle(bearing + gf[v][k] * dir * mea, centre);
                    num += weight[v] * scan[v][k] * MoveController.kernelMass(angle, bandwidth, whole);
                    den += weight[v] * scan[v][k];
                }
            }
            assertEquals(t[AesRecord.VIEW_SCORE], num / den, 1e-4 * Math.max(1e-3, num / den), "view score, option " + o);
            rebuilt++;
        }
        assertTrue(rebuilt > 0, "some option was rebuilt");
    }

    private static double parse(String s) {
        return s.equals("nan") ? Double.NaN : Double.parseDouble(s);
    }
}
