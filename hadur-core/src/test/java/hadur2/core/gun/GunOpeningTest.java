package hadur2.core.gun;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.knn.KnnView;
import hadur2.core.model.SeedWeight;
import hadur2.core.model.TimestampedFiringAngle;
import hadur2.core.model.Wave;
import hadur2.core.physics.Angles;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The gun's side of the opening: which gun aims (ADAPT-1) and how much a seed counts (ADAPT-3). */
class GunOpeningTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final MovementPredictor PREDICTOR = new MovementPredictor(FIELD);
    static final Point2D.Double ME = new Point2D.Double(400, 100);
    static final Point2D.Double ENEMY = new Point2D.Double(400, 450);

    static Wave wave() {
        Wave w = new Wave("abc.Shadow 3.83c", ME, ENEMY, 0, 30, 1.95, Math.PI / 2, 8, 1, FIELD, PREDICTOR);
        w.setAccel(0).setDistance(ME.distance(ENEMY)).setVchangeTime(10).setTargetEnergy(100)
            .setSourceEnergy(100).setGunHeat(0).setEnemiesAlive(1).setLastBulletFiredTime(0);
        w.setWallDistances();
        return w;
    }

    /** Gun samples that all say "it went to GF 0.8" but whose displacement says "it stayed put". */
    static double[] sample(Wave w, double gf, double dx, double dy) {
        double[] point = new GunFormula(1).dataPointFromWave(w, true);
        double[] s = java.util.Arrays.copyOf(point, GunController.SAMPLE_WIDTH);
        s[10] = gf;
        s[11] = dx;
        s[12] = dy;
        return s;
    }

    static double offsetFromHeadOn(double aim) {
        return Math.abs(Angles.normalRelativeAngle(aim - DiaUtils.absoluteBearing(ME, ENEMY)));
    }

    GunController seeded(GunController.Opening opening) {
        GunController g = new GunController(FIELD, 1);
        Wave w = wave();
        SeedWeight weight = new SeedWeight(0.5);
        for (int i = 0; i < 100; i++) g.seed(w.botName, sample(w, 0.8, 0, 0), weight);
        g.setOpening(opening);
        return g;
    }

    @Test
    @Tag("ADAPT-1")
    @DisplayName("an anti-surfer opening aims with the anti-surfer gun from the first wave")
    void antiSurferOpening() {
        double aim = seeded(GunController.Opening.ANTI_SURFER).aim(wave(), ME, 30);
        assertTrue(offsetFromHeadOn(aim) > 0.2, "GF 0.8 is well off head-on: " + offsetFromHeadOn(aim));
    }

    @Test
    @Tag("ADAPT-1")
    @DisplayName("a main-gun opening, or none, aims with the main gun")
    void mainOpening() {
        assertTrue(offsetFromHeadOn(seeded(GunController.Opening.MAIN).aim(wave(), ME, 30)) < 0.05);
        assertTrue(offsetFromHeadOn(seeded(null).aim(wave(), ME, 30)) < 0.05,
            "1.20's rule: with no virtual-gun record, the main gun");
    }

    @Test
    @DisplayName("without an opening, the first nine waves are head-on, as in 1.20")
    void noOpeningWarmsUpHeadOn() {
        GunController g = new GunController(FIELD, 1);
        Wave w = wave();
        for (int i = 0; i < 8; i++) g.seed(w.botName, sample(w, 0.8, 5, 0), new SeedWeight(1));
        assertEquals(DiaUtils.absoluteBearing(ME, ENEMY), g.aim(w, ME, 30), 1e-12);
    }

    @Test
    @DisplayName("the live ratings override the opening only once they differ beyond the margin")
    void liveVerdictNeedsMargin() {
        assertTrue(GunController.margin(1, 3) > 0.3);
        assertTrue(GunController.margin(200, 1000) < 0.03);
    }

    @Test
    @Tag("ADAPT-3")
    @DisplayName("a seeded neighbour counts for its seed's weight in the main gun's density")
    void seedWeightCounts() {
        Wave w = wave();
        double[] point = new GunFormula(1).dataPointFromWave(w, true);
        Point2D.Double left = new Point2D.Double(0, 3);
        Point2D.Double right = new Point2D.Double(0, -3);
        double leftAim = aimWith(w, point, left, right, new SeedWeight(1.0));
        double rightAim = aimWith(w, point, left, right, new SeedWeight(0.5));
        assertTrue(Math.abs(Angles.normalRelativeAngle(leftAim - rightAim)) > 0.05,
            "six seeded samples at weight 1 outvote four live ones; at weight 0.5 they do not");
        double liveOnly = aimWith(w, point, left, right, new SeedWeight(0));
        assertEquals(rightAim, liveOnly, 1e-12, "the live cluster wins alone");
    }

    /** Six seeded samples at {@code seeded}, four live ones at {@code live}; every neighbour in play. */
    static double aimWith(Wave w, double[] point, Point2D.Double seeded, Point2D.Double live,
                          SeedWeight weight) {
        KnnView<TimestampedFiringAngle> view = new KnnView<TimestampedFiringAngle>(new GunFormula(1))
            .setK(100).setKDivisor(1);
        for (int i = 0; i < 6; i++) {
            view.logSeed(point, new TimestampedFiringAngle(-1, i, 0, seeded, weight), weight);
        }
        for (int i = 0; i < 4; i++) {
            view.logDataPoint(point, new TimestampedFiringAngle(0, i, 0, live));
        }
        return new MainGun(FIELD).aim(w, view, ME, 30);
    }

    @Test
    @Tag("RES-4")
    @DisplayName("a seed never outranks the live sample it competes with, and a faded one is no candidate")
    void seedNeverOutranksLive() {
        Wave w = wave();
        double[] point = new GunFormula(1).dataPointFromWave(w, true);
        Point2D.Double seeded = new Point2D.Double(0, 3);
        Point2D.Double live = new Point2D.Double(0, -3);
        for (double weight : new double[] {0.5, 0.0}) {
            SeedWeight sw = new SeedWeight(weight);
            KnnView<TimestampedFiringAngle> view = new KnnView<TimestampedFiringAngle>(new GunFormula(1))
                .setK(100).setKDivisor(1);
            view.logSeed(point, new TimestampedFiringAngle(-1, 0, 0, seeded, sw), sw);
            view.logDataPoint(point, new TimestampedFiringAngle(0, 0, 0, live));
            double aim = new MainGun(FIELD).aim(w, view, ME, 30);
            double liveAim = aimAt(w, point, live);
            double seedAim = aimAt(w, point, seeded);
            assertTrue(Math.abs(Angles.normalRelativeAngle(liveAim - seedAim)) > 0.05);
            assertTrue(Math.abs(Angles.normalRelativeAngle(aim - seedAim))
                    > Math.abs(Angles.normalRelativeAngle(aim - liveAim)),
                "at seed weight " + weight + " the live sample's angle wins");
        }
    }

    @Test
    @Tag("RES-4")
    @DisplayName("once the gun seed has faded to nothing, the gun warms up head-on again")
    void fadedSeedsCountAsNoData() {
        GunController g = new GunController(FIELD, 1);
        Wave w = wave();
        SeedWeight weight = new SeedWeight(0.5);
        for (int i = 0; i < 100; i++) g.seed(w.botName, sample(w, 0.8, 0, 3), weight);
        assertTrue(offsetFromHeadOn(g.aim(w, ME, 30)) > 0.01, "the seed aims while it has weight");
        weight.set(0);
        assertEquals(DiaUtils.absoluteBearing(ME, ENEMY), g.aim(w, ME, 30), 1e-12);
    }

    @Test
    @Tag("RES-4")
    @DisplayName("a view counts its faded seeds out of its effective size, evicted ones first")
    void effectiveSize() {
        KnnView<TimestampedFiringAngle> view = new KnnView<TimestampedFiringAngle>(new GunFormula(1))
            .setK(100).setKDivisor(1).setMaxDataPoints(5);
        double[] point = new GunFormula(1).dataPointFromWave(wave(), true);
        SeedWeight sw = new SeedWeight(0.5);
        Point2D.Double d = new Point2D.Double(0, 0);
        for (int i = 0; i < 3; i++) view.logSeed(point, new TimestampedFiringAngle(-1, i, 0, d, sw), sw);
        view.logDataPoint(point, new TimestampedFiringAngle(0, 0, 0, d));
        assertEquals(4, view.effectiveSize());
        sw.set(0);
        assertEquals(1, view.effectiveSize());
        for (int i = 1; i < 4; i++) view.logDataPoint(point, new TimestampedFiringAngle(0, i, 0, d));
        assertEquals(5, view.size());
        assertEquals(4, view.effectiveSize(), "two seeds were evicted, one faded seed is left");
    }

    /** Where the main gun aims with one live sample at {@code displacement}. */
    static double aimAt(Wave w, double[] point, Point2D.Double displacement) {
        KnnView<TimestampedFiringAngle> view = new KnnView<TimestampedFiringAngle>(new GunFormula(1))
            .setK(100).setKDivisor(1);
        view.logDataPoint(point, new TimestampedFiringAngle(0, 0, 0, displacement));
        view.logDataPoint(point, new TimestampedFiringAngle(0, 1, 0, displacement));
        return new MainGun(FIELD).aim(w, view, ME, 30);
    }
}
