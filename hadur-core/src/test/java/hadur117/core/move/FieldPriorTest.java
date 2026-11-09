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

/** MOVE-35: the field prior as the last aim member. */
class FieldPriorTest {

    static final BattleField FIELD = new BattleField(800, 600);

    /** An enemy at (400, 500) firing power 2 at us at (400, 200), heading {@code heading}, velocity {@code v}. */
    static Wave wave(double heading, double v, double accel) {
        Wave w = new Wave("enemy", new Point2D.Double(400, 500), new Point2D.Double(400, 200),
            0, 0, 2, heading, v, v < 0 ? -1 : 1, FIELD, new MovementPredictor(FIELD));
        w.setAccel(accel);
        w.setDistance(300);
        w.setWallDistances();
        return w;
    }

    static double sum(double[] p) {
        double s = 0;
        for (double v : p) s += v;
        return s;
    }

    @Test
    @Tag("MOVE-35")
    @DisplayName("the shipped table has 144 cells of 41 bins, each cell's profile a probability")
    void shippedTable() {
        FieldPrior prior = new FieldPrior();
        assertEquals(144, prior.cells());
        assertEquals(41, prior.bins());
        assertEquals(-1.0, prior.centre(0), 1e-12);
        assertEquals(1.0, prior.centre(40), 1e-12);
        assertEquals(0.0, prior.centre(20), 1e-12);
        long bullets = 0;
        for (String row : FieldPriorData.ROWS) for (String c : row.split(",")) bullets += Long.parseLong(c.trim());
        assertEquals(FieldPriorData.BULLETS, bullets, "every bullet counted once");
        for (double heading : new double[] {0, Math.PI / 2, Math.PI / 4}) {
            for (double v : new double[] {0, 3, 8, -8}) {
                double[] p = prior.profile(wave(heading, v, 0.0));
                assertEquals(1.0, sum(p), 1e-9);
                for (double x : p) assertTrue(x >= 0);
            }
        }
    }

    @Test
    @Tag("MOVE-35")
    @DisplayName("the cell follows lateral speed, acceleration, wall room and flight time, lateral fastest")
    void cells() {
        FieldPrior prior = new FieldPrior();
        // Square to the line of fire at 8 px/tick: lateral 8 (last bin, 3); steady (accel bin 1);
        // flight 300 / 14 = 21.4 ticks (first bin); wall room is whatever the field gives.
        Wave w = wave(Math.PI / 2, 8, 0.0);
        int wall = FieldPrior.bin(w.targetWallDistance, FieldPriorData.WALL);
        assertEquals(3 + 4 * (1 + 3 * (wall + 3 * 0)), prior.cell(w));
        // Straight at the enemy: lateral 0 (bin 0); braking hard (accel bin 0).
        assertEquals(0 + 4 * (0 + 3 * (FieldPrior.bin(wave(0, 8, -2).targetWallDistance, FieldPriorData.WALL) + 3 * 0)),
            prior.cell(wave(0, 8, -2)));
        // Backing up square to the line still reads as lateral 8.
        assertEquals(prior.cell(wave(Math.PI / 2, 8, 0.0)), prior.cell(wave(-Math.PI / 2, -8, 0.0)));
        assertEquals(0, FieldPrior.bin(1.9, FieldPriorData.LAT));
        assertEquals(1, FieldPrior.bin(2.0, FieldPriorData.LAT));
        assertEquals(3, FieldPrior.bin(7.5, FieldPriorData.LAT));
    }

    @Test
    @Tag("MOVE-35")
    @DisplayName("a thin cell reads as the whole table's profile; a full one is smoothed a tenth toward it")
    void smoothing() {
        String[] rows = new String[FieldPriorData.ROWS.length];
        StringBuilder thin = new StringBuilder();
        StringBuilder full = new StringBuilder();
        for (int b = 0; b < FieldPriorData.GF_BINS; b++) {
            thin.append(b == 0 ? "" : ",").append(b == 20 ? "5" : "0");
            full.append(b == 0 ? "" : ",").append(b == 30 ? "1000" : "0");
        }
        rows[0] = thin.toString();
        for (int c = 1; c < rows.length; c++) rows[c] = full.toString();
        FieldPrior prior = new FieldPrior(rows);
        // Still, steady, short flight, with the thin cell put where the wave falls.
        Wave w = wave(0, 0, 0.0);
        int cell = prior.cell(w);
        assertEquals(0, cell % 4, "still is lateral bin 0");
        rows[0] = full.toString();
        rows[cell] = thin.toString();
        prior = new FieldPrior(rows);
        double[] p = prior.profile(w);
        // The flat profile: 143,000 bullets at bin 30 and 5 at bin 20.
        assertEquals(143000.0 / 143005.0, p[30], 1e-9);
        assertEquals(5.0 / 143005.0, p[20], 1e-9);
        w = wave(Math.PI / 2, 8, 0.0);
        assertTrue(prior.cell(w) != cell);
        double[] q = prior.profile(w);
        assertEquals(0.9 + 0.1 * 143000.0 / 143005.0, q[30], 1e-9, "a full cell keeps nine tenths of its own");
        assertEquals(1.0, sum(q), 1e-9);
    }

    @Test
    @Tag("MOVE-35")
    @DisplayName("as the last aim member the prior stands at weight 2 and learns like the others")
    void member() {
        AimMembers m = new AimMembers(0, true);
        assertEquals(AimMembers.MEMBERS + 1, m.members());
        assertTrue(m.fieldPrior());
        assertEquals(FieldPrior.WEIGHT, m.weight(m.members() - 1), 1e-12);
        AimMembers plain = new AimMembers(6);
        assertEquals(AimMembers.MEMBERS + 6, plain.members());
        assertTrue(!plain.fieldPrior());
        // A sure prior (score 1 over a window a uniform guess gives 0.05) gains weight.
        double[] say = new double[m.members()];
        java.util.Arrays.fill(say, Double.NaN);
        say[m.members() - 1] = 1.0;
        m.learn(say, 0.05);
        assertTrue(m.weight(m.members() - 1) > FieldPrior.WEIGHT);
        double[] scores = new double[m.members() - 1];
        java.util.Arrays.fill(scores, Double.NaN);
        scores[scores.length - 1] = 1.0;
        assertTrue(m.danger(0.0, scores) > 0.5, "the prior carries the danger when the aims are silent");
    }
    @Test
    @Tag("MOVE-35")
    @DisplayName("with no view data the prior still shapes the danger; without the prior the fallback stands")
    void emptyViews() {
        Wave w = wave(Math.PI / 2, 8, 0.0);
        Wave.Intersection at = new Wave.Intersection(w.firingAngle(0.0), 0.1);
        Wave.Intersection side = new Wave.Intersection(w.firingAngle(0.6), 0.1);
        MoveController plain = SurfOpeningTest.controller();
        MoveController withAims = SurfOpeningTest.controller();
        withAims.setAimMembers(new AimMembers(0, false));
        MoveController withPrior = SurfOpeningTest.controller();
        withPrior.setAimMembers(new AimMembers(0, true));
        withPrior.setFieldPrior(new FieldPrior());
        // Aim members alone leave the empty-view fallback untouched.
        assertEquals(plain.getDangerScore(w, at, 0), withAims.getDangerScore(w, at, 0), 1e-12);
        assertEquals(plain.getDangerScore(w, side, 0), withAims.getDangerScore(w, side, 0), 1e-12);
        // The prior changes the ratio between two windows: it is in the blend.
        double plainRatio = plain.getDangerScore(w, side, 0) / plain.getDangerScore(w, at, 0);
        double priorRatio = withPrior.getDangerScore(w, side, 0) / withPrior.getDangerScore(w, at, 0);
        assertTrue(Math.abs(plainRatio - priorRatio) > 1e-6, plainRatio + " vs " + priorRatio);
        assertTrue(withPrior.getDangerScore(w, at, 0) > 0);
    }
    @Test
    @Tag("MOVE-35")
    @DisplayName("the wall room is read on the oracle's 0.05 grid: 0.46 to 0.50 share the table's cell")
    void wallGrid() {
        FieldPrior prior = new FieldPrior();
        Wave w = wave(Math.PI / 2, 8, 0.0);
        w.targetWallDistance = 0.45;
        int below = prior.cell(w);
        w.targetWallDistance = 0.46;
        int rounded = prior.cell(w);
        w.targetWallDistance = 0.50;
        int edge = prior.cell(w);
        assertEquals(edge, rounded, "0.46 rounds up to the oracle's 0.50 sample");
        assertTrue(below != edge, "0.45 is its own sample, below the edge");
        w.targetWallDistance = 1.5;
        assertEquals(2, (prior.cell(w) / 12) % 3, "the cap sits in the top wall bin");
    }
}
