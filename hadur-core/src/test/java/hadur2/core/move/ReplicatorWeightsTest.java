package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-16: the replicator weights of the danger views. */
class ReplicatorWeightsTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final double[] W = {3, 40, 100, 500};
    static final boolean[] ALL = {true, true, true, true};

    static double sum(double[] a) {
        return Arrays.stream(a).sum();
    }

    @Test
    @Tag("MOVE-16")
    @DisplayName("a view that predicted the hit gains share, one that missed loses it, and the shares sum to 1")
    void predictorGainsShare() {
        ReplicatorWeights r = new ReplicatorWeights(4);
        double[] before = r.shares(W, ALL);
        r.update(W, ALL, new double[] {2.0, 0.1, 0.1, 0.1});
        double[] after = r.shares(W, ALL);
        assertTrue(after[0] > before[0], "the predicting view gains");
        assertTrue(after[3] < before[3], "a view that fell short loses");
        assertEquals(1.0, sum(after), 1e-12);
    }

    @Test
    @Tag("MOVE-16")
    @DisplayName("a view that is not on keeps its multiplier and has no share")
    void viewsOffAreLeftAlone() {
        ReplicatorWeights r = new ReplicatorWeights(4);
        boolean[] on = {true, true, false, false};
        r.update(W, on, new double[] {1.0, 0.1, 5.0, 5.0});
        assertEquals(1.0, r.multiplier(2), 0);
        assertEquals(1.0, r.multiplier(3), 0);
        assertEquals(0.0, r.shares(W, on)[2], 0);
    }

    @Test
    @Tag("MOVE-16")
    @DisplayName("the floor holds: after many adverse updates no view's share is under 2%")
    void floorHolds() {
        ReplicatorWeights r = new ReplicatorWeights(4);
        for (int i = 0; i < 500; i++) {
            r.update(W, ALL, new double[] {0, 0, 0, 3.0});
            for (double s : r.shares(W, ALL)) assertTrue(s >= ReplicatorWeights.FLOOR - 1e-9, "share " + s);
        }
        assertEquals(1.0, sum(r.shares(W, ALL)), 1e-12);
        assertTrue(r.shares(W, ALL)[3] > 0.9, "the best view dominates");
    }

    @Test
    @Tag("MOVE-16")
    @DisplayName("repeated identical updates converge toward the best-predicting view")
    void convergesToTheBest() {
        ReplicatorWeights r = new ReplicatorWeights(4);
        double last = r.shares(W, ALL)[0];
        for (int i = 0; i < 30; i++) {
            r.update(W, ALL, new double[] {1.5, 0.8, 0.4, 0.2});
            double now = r.shares(W, ALL)[0];
            assertTrue(now >= last - 1e-12, "monotone");
            last = now;
        }
        assertTrue(last > 0.9, "share " + last);
        for (double m : r.multipliers()) assertTrue(m <= ReplicatorWeights.MAX + 1e-12);
    }

    @Test
    @Tag("MOVE-16")
    @DisplayName("a flat or empty kernel gives density 0 and a uniform grid gives 1/2 over [-1, 1]")
    void densityNormalised() {
        assertEquals(0.0, ReplicatorWeights.density(0, new double[41]), 0);
        double[] flat = new double[41];
        Arrays.fill(flat, 7.0);
        assertEquals(0.5, ReplicatorWeights.density(7.0, flat), 1e-12);
        assertEquals(0.05 * 0.5, ReplicatorWeights.probability(0), 1e-12);
    }

    static Wave wave() {
        Point2D.Double enemy = new Point2D.Double(400, 500);
        Point2D.Double me = new Point2D.Double(400, 100);
        Wave w = new Wave("abc.Gun 1", enemy, me, 0, 30, 2, Math.PI, 8, 1, FIELD, new MovementPredictor(FIELD));
        w.setAccel(0).setDistance(400).setVchangeTime(10).setTargetEnergy(100)
            .setSourceEnergy(100).setGunHeat(0).setEnemiesAlive(1).setLastBulletFiredTime(0);
        w.setWallDistances();
        return w;
    }

    static MoveController controller(boolean replicator) {
        MoveController m = new MoveController(FIELD, new MovementPredictor(FIELD));
        // A prior the live margin cannot beat: every hit view is on from the first hit.
        m.setPrior(0.1, 0.001);
        m.setReplicator(replicator);
        return m;
    }

    static void hit(MoveController m, double gf, int round) {
        Wave w = wave();
        Point2D.Double at = new Point2D.Double(
            w.sourceLocation.x + 300 * Math.sin(w.firingAngle(gf)),
            w.sourceLocation.y + 300 * Math.cos(w.firingAngle(gf)));
        m.logBulletHit(w, at, round, round * 100L);
    }

    @Test
    @Tag("MOVE-16")
    @DisplayName("off: the multipliers are never touched and the danger is the fixed-weight average")
    void offIsUnchanged() {
        MoveController off = controller(false);
        MoveController on = controller(true);
        for (int i = 0; i < 6; i++) {
            hit(off, 0.6, 0);
            hit(on, 0.6, 0);
        }
        assertTrue(Arrays.stream(off.replicatorMultipliers()).allMatch(m -> m == 1.0));
        Wave w = wave();
        Wave.Intersection x = new Wave.Intersection(w.firingAngle(0.6), 0.05);
        MoveController fresh = controller(false);
        for (int i = 0; i < 6; i++) hit(fresh, 0.6, 0);
        assertEquals(fresh.getDangerScore(w, x, 0), off.getDangerScore(wave(), x, 0), 0);
        assertTrue(Arrays.stream(on.replicatorMultipliers()).anyMatch(m -> m != 1.0), "on: they learn");
    }

    @Test
    @Tag("MOVE-16")
    @DisplayName("through the controller: multipliers move, keep the floor, and a new round does not reset them")
    void multipliersSurviveARound() {
        MoveController m = controller(true);
        for (int i = 0; i < 8; i++) hit(m, 0.6, 0);
        for (int i = 0; i < 8; i++) hit(m, -0.7, 0);
        double[] learned = m.replicatorMultipliers();
        assertTrue(Arrays.stream(learned).anyMatch(v -> v != 1.0));
        assertEquals(m.viewCount(), learned.length);
        m.initRound();
        assertTrue(Arrays.equals(learned, m.replicatorMultipliers()), "a new round keeps them");
    }
}
