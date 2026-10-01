package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.SeedWeight;
import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** R6: the danger kernel integrated over the intersection and the shadows (MOVE-3, MOVE-4), the flattener threshold (MOVE-5), the neighbour cache (MOVE-7), wall room (WAVE-4). */
class DangerIntegrationTest {

    private static final BattleField FIELD = new BattleField(800, 600);

    static Wave wave(double power, double sourceX, double sourceY) {
        Point2D.Double enemy = new Point2D.Double(sourceX, sourceY);
        Point2D.Double me = new Point2D.Double(400, 100);
        Wave w = new Wave("abc.Shadow 3.83c", enemy, me, 0, 30, power, 3 * Math.PI / 2, 8, 1, FIELD,
            new MovementPredictor(FIELD));
        w.setAccel(0).setDistance(me.distance(enemy)).setVchangeTime(10).setTargetEnergy(100)
            .setSourceEnergy(100).setGunHeat(0).setEnemiesAlive(1).setLastBulletFiredTime(0);
        w.setWallDistances();
        return w;
    }

    private static List<double[]> one(double from, double to, double t) {
        return List.of(new double[] {from, to, t});
    }

    @Test
    @Tag("MOVE-4")
    @DisplayName("a kernel centred on an unshadowed intersection scores 1, a distant one close to 0")
    void kernelMassNormalised() {
        List<double[]> seg = one(-0.1, 0.1, 1);
        assertEquals(1.0, MoveController.kernelMass(0, 0.1, seg), 1e-12);
        assertTrue(MoveController.kernelMass(1.0, 0.1, seg) < 0.01);
        // Symmetric about the centre.
        assertEquals(MoveController.kernelMass(0.05, 0.1, seg), MoveController.kernelMass(-0.05, 0.1, seg), 1e-12);
    }

    @Test
    @Tag("MOVE-4")
    @DisplayName("a neighbour at the intersection's edge scores its share of the range, not the centre's value")
    void edgeNeighbourScoresTheIntegral() {
        double edge = MoveController.kernelMass(0.1, 0.1, one(-0.1, 0.1, 1));
        // The integral of 2^-x over [0, 2] against the normaliser's [0, 1] twice.
        double expected = (1 - Math.pow(2, -2)) / (2 * (1 - 0.5));
        assertEquals(expected, edge, 1e-12);
    }

    @Test
    @Tag("MOVE-3")
    @DisplayName("a certain shadow takes its part of the kernel away, a possible one half of it")
    void shadowedPartsScoreLess() {
        List<double[]> half = List.of(new double[] {-0.1, 0, 1}, new double[] {0, 0.1, 0});
        assertEquals(0.5, MoveController.kernelMass(0, 0.1, half), 1e-12);
        List<double[]> possible = List.of(new double[] {-0.1, 0, 1}, new double[] {0, 0.1, 0.5});
        assertEquals(0.75, MoveController.kernelMass(0, 0.1, possible), 1e-12);
    }

    @Test
    @Tag("MOVE-3")
    @DisplayName("a wave's transmission segments cut the intersection at the shadow edges")
    void transmissionSegments() {
        Wave w = wave(1.95, 400, 450);
        double c = w.absBearing;
        w.setShadows(List.of(new double[] {c + 0.02, c + 0.04}), List.of(new double[] {c + 0.01, c + 0.05}));
        List<double[]> segs = w.transmission(new Wave.Intersection(c, 0.1));
        assertEquals(5, segs.size());
        assertEquals(c - 0.1, segs.get(0)[0], 1e-12);
        assertEquals(c + 0.1, segs.get(4)[1], 1e-12);
        assertEquals(1.0, segs.get(0)[2], 1e-12);
        assertEquals(0.5, segs.get(1)[2], 1e-12, "possible only");
        assertEquals(0.0, segs.get(2)[2], 1e-12, "certain");
        assertEquals(0.5, segs.get(3)[2], 1e-12);
        assertEquals(1.0, segs.get(4)[2], 1e-12);
        for (int i = 1; i < segs.size(); i++) assertEquals(segs.get(i - 1)[1], segs.get(i)[0], 1e-12);
    }

    @Test
    @Tag("MOVE-3")
    @DisplayName("with no shadows the intersection is one segment at full transmission")
    void noShadowsOneSegment() {
        Wave w = wave(1.95, 400, 450);
        List<double[]> segs = w.transmission(new Wave.Intersection(1.0, 0.2));
        assertEquals(1, segs.size());
        assertEquals(1.0, segs.get(0)[2], 1e-12);
    }

    @Test
    @Tag("MOVE-3")
    @DisplayName("a shadow over the whole intersection leaves the views' danger at zero")
    void fullyShadowedIsSafe() {
        MoveController m = SurfOpeningTest.controller();
        double[] s = new double[MoveController.SAMPLE_WIDTH];
        s[12] = 0.3;
        for (int i = 0; i < 7; i++) m.seed(s, new SeedWeight(0.5));
        Wave w = wave(1.95, 400, 450);
        double c = w.absBearing;
        Wave.Intersection at = new Wave.Intersection(c, 0.1);
        double open = m.getDangerScore(w, at, 0);
        w.setShadows(List.of(new double[] {c - 0.5, c + 0.5}));
        double shut = m.getDangerScore(w, at, 0);
        assertTrue(open > 0, "open " + open);
        assertEquals(0.0, shut, 1e-12);
    }

    @Test
    @Tag("MOVE-5")
    @DisplayName("the flattener views switch on at a padded hit rate of 4.5%")
    void flattenerThreshold() {
        assertEquals(4.5, MoveController.FLATTENER_THRESHOLD, 0);
        MoveController m = SurfOpeningTest.controller();
        m.setPrior(0.05, 0.004);
        assertTrue(m.viewsOn().contains("flattener"), m.viewsOn().toString());
        MoveController low = SurfOpeningTest.controller();
        low.setPrior(0.05, 0.01);
        assertTrue(!low.viewsOn().contains("flattener"), low.viewsOn().toString());
    }

    @Test
    @Tag("MOVE-7")
    @DisplayName("a different wave arriving at a surf index never reads the neighbours cached for the old one")
    void cacheFollowsTheWave() {
        MoveController used = SurfOpeningTest.controller();
        MoveController fresh = SurfOpeningTest.controller();
        for (MoveController m : List.of(used, fresh)) {
            for (int i = 0; i < 30; i++) {
                double[] s = new double[MoveController.SAMPLE_WIDTH];
                for (int k = 0; k < s.length; k++) s[k] = ((i * 7 + k * 3) % 11) / 11.0;
                m.seed(s, new SeedWeight(0.5));
            }
        }
        Wave a = wave(1.95, 400, 450);
        Wave b = wave(1.0, 150, 550);
        Wave.Intersection at = new Wave.Intersection(a.absBearing, 0.1);
        used.getDangerScore(a, at, 1);
        Wave.Intersection atB = new Wave.Intersection(b.absBearing, 0.1);
        assertEquals(fresh.getDangerScore(b, atB, 1), used.getDangerScore(b, atB, 1), 1e-12);
    }

    @Test
    @Tag("WAVE-4")
    @DisplayName("correcting a firing wave's power recomputes its wall distances")
    void powerUpdateRecomputesWallRoom() {
        MoveController m = SurfOpeningTest.controller();
        Wave w = wave(3.0, 100, 500);
        double before = w.targetWallDistance;
        m.addWave(w);
        long fire = w.fireTime;
        m.updateFiringWave(fire, fire + 1, 0.1, false);
        Wave expected = wave(0.1, 100, 500);
        assertEquals(expected.targetWallDistance, w.targetWallDistance, 1e-12);
        assertTrue(w.targetWallDistance != before, "the power changed the room: " + before);
    }
}
