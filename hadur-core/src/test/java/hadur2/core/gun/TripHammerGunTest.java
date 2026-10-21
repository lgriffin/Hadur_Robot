package hadur2.core.gun;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.knn.KnnView;
import hadur2.core.model.TimestampedFiringAngle;
import hadur2.core.model.Wave;
import hadur2.core.physics.Angles;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * GUN-8, GUN-9, GUN-10: the three duel-only gun switches. The TripHammer's formula, weight
 * schedule, k, firing angle and kernel are checked against values worked out by hand from
 * Diamond 1.8.22's {@code TripHammerFormula} and {@code TripHammerKnnGun}; the switches are
 * checked off (the old behaviour) and on (the new).
 */
class TripHammerGunTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final MovementPredictor PREDICTOR = new MovementPredictor(FIELD);
    static final Point2D.Double ME = new Point2D.Double(400, 100);
    static final Point2D.Double ENEMY = new Point2D.Double(400, 450);
    static final String BOT = "abc.Shadow 3.83c";

    /** The target 350 px due north, heading east at 8: orbit +1, square to the line. */
    static Wave wave(double power, double speed) {
        Wave w = new Wave(BOT, ME, ENEMY, 0, 30, power, Math.PI / 2, speed, 1, FIELD, PREDICTOR);
        w.setAccel(0).setDistance(ME.distance(ENEMY)).setVchangeTime(10).setTargetEnergy(100)
            .setSourceEnergy(100).setGunHeat(0).setEnemiesAlive(1).setLastBulletFiredTime(0);
        w.setWallDistances();
        w.firingWave = true;
        return w;
    }

    // ---- GUN-8: the formula

    @Test
    @Tag("GUN-8")
    @DisplayName("the formula's ten features are Diamond's: power/3, flight, speed, sin, cos, (a+2)/3, capped walls, vchange, virtuality")
    void formulaMatchesDiamond() {
        Wave w = wave(1.95, 8);
        w.setAccel(-1);
        w.targetWallDistance = 1.4;     // capped at 1.25
        w.targetRevWallDistance = 1.3;  // capped at 1.15
        double flight = 350.0 / (20 - 3 * 1.95);
        double[] expected = {
            1.95 / 3.0,
            flight / 91.0,
            8.1 / 8.1,
            1.0,
            0.5,
            (-1 + 2.0) / 3.0,
            1.25,
            1.15,
            10.0 / flight,
            0.0
        };
        assertArrayEquals(expected, new TripHammerFormula().dataPointFromWave(w, true), 1e-12);
        // Power is capped at 3, wall values under their caps pass through, a query has no virtuality.
        Wave heavy = wave(3.0, 4);
        heavy.targetWallDistance = 0.6;
        heavy.targetRevWallDistance = 0.9;
        double[] p = new TripHammerFormula().dataPointFromWave(heavy, true);
        assertEquals(1.0, p[0], 1e-12);
        assertEquals(0.6, p[6], 1e-12);
        assertEquals(0.9, p[7], 1e-12);
        assertEquals(10, new TripHammerFormula().weights.length);
        assertEquals(0.34, new TripHammerFormula().weights[0], 0);
    }

    @Test
    @Tag("GUN-8")
    @DisplayName("a virtual wave carries its virtuality as the last feature; a firing wave and a query carry 0")
    void virtualityFeature() {
        Wave w = wave(1.95, 8);
        w.firingWave = false;
        w.lastBulletFiredTime = 0;
        w.gunHeat = 0.4;  // 4 ticks to cool; no bullet yet: min(1, 4/8)
        assertEquals(0.5, new TripHammerFormula().dataPointFromWave(w, false)[9], 1e-12);
        assertEquals(0.0, new TripHammerFormula().dataPointFromWave(w, true)[9], 1e-12);
    }

    // ---- GUN-8: the weight schedule

    @Test
    @Tag("GUN-8")
    @DisplayName("weights start at INITIAL, end at FINAL, slide by (size-1)/FINAL_TIMES, and a zero time is final at once")
    void weightSchedule() {
        double[] one = TripHammerGun.weightsFor(1);
        for (int i = 0; i < 10; i++) {
            double expected = i == 6 ? 4.41 : TripHammerGun.INITIAL_WEIGHTS[i];
            assertEquals(expected, one[i], 1e-12, "weight " + i + " at one point");
        }
        assertEquals(10.0, one[1], 0);
        // Index 3 has time 1740: 871 points is exactly half way from 3.7 to 4.25.
        assertEquals((3.7 + 4.25) / 2, TripHammerGun.weightsFor(871)[3], 1e-12);
        // Index 9 has time 1920: 961 points is half way from 5.51 to 4.41.
        assertEquals((5.51 + 4.41) / 2, TripHammerGun.weightsFor(961)[9], 1e-12);
        // Past every time (28920 is the longest) every weight is final.
        assertArrayEquals(TripHammerGun.FINAL_WEIGHTS, TripHammerGun.weightsFor(30000), 1e-12);
        assertArrayEquals(TripHammerGun.FINAL_WEIGHTS, TripHammerGun.weightsFor(1_000_000), 1e-12);
    }

    // ---- GUN-8: k, angle, kernel

    private static void fill(KnnView<TimestampedFiringAngle> view, int n) {
        java.util.Random r = new java.util.Random(7);
        for (int i = 0; i < n; i++) {
            double[] p = new double[10];
            for (int d = 0; d < 10; d++) p[d] = r.nextDouble();
            view.logDataPoint(p, new TimestampedFiringAngle(0, i, 0.0, new Point2D.Double()));
        }
    }

    @Test
    @Tag("GUN-8")
    @DisplayName("k is size/9 up to 225, one neighbour at the least")
    void kIsSizeOverNine() {
        TripHammerGun gun = new TripHammerGun();
        Wave w = wave(1.95, 8);
        KnnView<TimestampedFiringAngle> v = gun.createView();
        assertEquals(9, v.kDivisor);
        assertEquals(225, v.kSize);
        fill(v, 4);
        assertEquals(1, v.nearestNeighbors(w, true).size());
        fill(v, 896);  // 900 points
        assertEquals(100, v.nearestNeighbors(w, true).size());
        fill(v, 3000);  // 3,900 points: 433 would be the share, capped at 225
        assertEquals(225, v.nearestNeighbors(w, true).size());
    }

    @Test
    @Tag("GUN-8")
    @DisplayName("a neighbour fires at gf * orbit * the precise escape angle on the gf's side")
    void firingAngleFromGuessFactor() {
        Wave w = wave(1.95, 8);
        assertEquals(0.5 * w.preciseEscapeAngle(true), TripHammerGun.offsetOf(w, 0.5), 1e-12);
        assertEquals(-0.5 * w.preciseEscapeAngle(false), TripHammerGun.offsetOf(w, -0.5), 1e-12);
        assertEquals(0.0, TripHammerGun.offsetOf(w, 0.0), 0);
        // The orbit direction turns "forward" the other way.
        Wave back = new Wave(BOT, ME, ENEMY, 0, 30, 1.95, -Math.PI / 2, 8, 1, FIELD, PREDICTOR);
        back.setAccel(0).setDistance(350).setVchangeTime(10);
        assertEquals(-1, back.orbitDirection);
        assertEquals(-0.5 * back.preciseEscapeAngle(true), TripHammerGun.offsetOf(back, 0.5), 1e-12);
    }

    @Test
    @Tag("GUN-8")
    @DisplayName("the cube kernel is 1 - |u|^3 inside a bandwidth and nothing outside, times the neighbour's weight")
    void cubeKernel() {
        double bw = 0.1;
        // One neighbour of weight 2 at 0: at half a bandwidth, 2 * (1 - 0.125).
        assertEquals(2 * (1 - 0.125), TripHammerGun.density(0.05, new double[] {0}, new double[] {2}, bw), 1e-12);
        assertEquals(2.0, TripHammerGun.density(0.0, new double[] {0}, new double[] {2}, bw), 1e-12);
        // At and beyond one bandwidth: nothing.
        assertEquals(0.0, TripHammerGun.density(0.1, new double[] {0}, new double[] {2}, bw), 0);
        assertEquals(0.0, TripHammerGun.density(-0.3, new double[] {0}, new double[] {2}, bw), 0);
        // Two neighbours sum; the second is on the other side.
        assertEquals(2 * (1 - Math.pow(0.5, 3)) + 1 * (1 - Math.pow(0.7, 3)),
            TripHammerGun.density(0.05, new double[] {0, 0.12}, new double[] {2, 1}, bw), 1e-12);
    }

    @Test
    @Tag("GUN-8")
    @DisplayName("the bandwidth is twice the bot width's aim angle at the wave's own distance: 36/350")
    void bandwidthIsTwiceBotWidth() {
        assertEquals(36.0 / 350.0, 2.0 * DiaUtils.botWidthAimAngle(ME.distance(ENEMY)), 1e-12);
    }

    @Test
    @Tag("GUN-8")
    @DisplayName("an empty view fires head-on from the wave's source; a learned guess factor is fired at, on the 59-angle grid")
    void aimsAtTheLearnedGuessFactor() {
        TripHammerGun gun = new TripHammerGun();
        KnnView<TimestampedFiringAngle> view = gun.createView();
        Wave w = wave(1.95, 8);
        assertEquals(w.absBearing, gun.aim(w, view), 0);
        assertNull(gun.aimWithMass(w, view).mass);

        // Twenty visits at guess factor 0.5, logged by a slightly different wave so the
        // neighbours' distance is above zero (a zero distance is an infinite weight, as Diamond's).
        for (int i = 0; i < 20; i++) {
            view.logWave(wave(1.95, 7), new TimestampedFiringAngle(0, i, 0.5, new Point2D.Double()));
        }
        double expected = 0.5 * w.preciseEscapeAngle(true);
        double step = w.maxEscapeAngle() / 29;
        assertTrue(expected < w.maxEscapeAngle(), "the learned angle is on the grid");
        TripHammerGun.Aimed aimed = gun.aimWithMass(w, view);
        double offset = Angles.normalRelativeAngle(aimed.angle - w.absBearing);
        assertEquals(expected, offset, step / 2 + 1e-9, "the nearest of the 59 candidates to the neighbours' angle");
        assertEquals(aimed.angle, gun.aim(w, view), 0);
        assertNotNull(aimed.mass);
        // The weights were slid for a 20-point view before the query.
        assertArrayEquals(TripHammerGun.weightsFor(20), view.formula.weights, 1e-12);
    }

    @Test
    @Tag("GUN-8")
    @DisplayName("the densest candidate wins: two neighbours at the same angle beat one elsewhere")
    void densestWins() {
        TripHammerGun gun = new TripHammerGun();
        KnnView<TimestampedFiringAngle> view = gun.createView();
        Wave w = wave(1.95, 8);
        for (int i = 0; i < 6; i++) {
            view.logWave(wave(1.95, 7), new TimestampedFiringAngle(0, i, -0.6, new Point2D.Double()));
        }
        for (int i = 0; i < 3; i++) {
            view.logWave(wave(1.95, 7), new TimestampedFiringAngle(0, 10 + i, 0.6, new Point2D.Double()));
        }
        double offset = Angles.normalRelativeAngle(gun.aim(w, view) - w.absBearing);
        assertTrue(offset < 0, "the six at -0.6 outweigh the three at +0.6: " + offset);
    }

    // ---- GUN-8: the switch

    @Test
    @Tag("GUN-8")
    @DisplayName("off, a duel's views are the old five; on, a TripHammer view joins them and is never seeded")
    void switchAddsTheView() {
        GunController off = new GunController(FIELD, 1);
        assertFalse(off.getOrCreateViews(BOT).containsKey(TripHammerGun.viewName()));
        assertEquals(6, off.getOrCreateViews(BOT).size());

        GunController on = new GunController(FIELD, 1);
        on.setTripHammer(true);
        Map<String, KnnView<TimestampedFiringAngle>> views = on.getOrCreateViews(BOT);
        assertTrue(views.containsKey(TripHammerGun.viewName()));
        assertEquals(7, views.size());
        on.seed(BOT, new double[13], new hadur2.core.model.SeedWeight(1.0));
        assertEquals(0, views.get(TripHammerGun.viewName()).size(), "a seed holds the main view's features");
        assertEquals(1, views.get("Main").size());
    }

    @Test
    @Tag("GUN-8")
    @DisplayName("a switch set after the views exist still adds the view")
    void lateSwitchAddsTheView() {
        GunController g = new GunController(FIELD, 1);
        Map<String, KnnView<TimestampedFiringAngle>> views = g.getOrCreateViews(BOT);
        g.setTripHammer(true);
        assertTrue(views.containsKey(TripHammerGun.viewName()));
    }

    @Test
    @Tag("GUN-8")
    @DisplayName("in a melee battle the switch does nothing: no view, the displacement gun alone")
    void meleeIgnoresTheSwitch() {
        GunController melee = new GunController(FIELD, 5);
        melee.setTripHammer(true);
        assertFalse(melee.getOrCreateViews(BOT).containsKey(TripHammerGun.viewName()));
        assertEquals(6, melee.getOrCreateViews(BOT).size());
    }

    @Test
    @Tag("GUN-8")
    @DisplayName("on, the main candidate aims from the TripHammer view; off, from the displacement view")
    void mainCandidateIsTheTripHammer() {
        for (boolean on : new boolean[] {false, true}) {
            GunController g = new GunController(FIELD, 1);
            g.setTripHammer(on);
            Map<String, KnnView<TimestampedFiringAngle>> views = g.getOrCreateViews(BOT);
            // Learn guess factor 0.5 (displacement 0) into every view that logs, 12 times.
            for (int i = 0; i < 12; i++) {
                Wave learn = wave(1.95, 7);
                for (KnnView<TimestampedFiringAngle> view : views.values()) {
                    if (view.logVisits) {
                        view.logWave(learn, new TimestampedFiringAngle(0, i, 0.5, new Point2D.Double(0, 150)));
                    }
                }
            }
            Wave w = wave(1.95, 8);
            double angle = g.aim(w, ME, 40);
            double offset = Angles.normalRelativeAngle(angle - w.absBearing);
            if (on) {
                assertEquals(0.5 * w.preciseEscapeAngle(true), offset, w.maxEscapeAngle() / 29 / 2 + 1e-9,
                    "the TripHammer fires at the guess factor");
            } else {
                // The displacement vector (0, 150) from the target projects almost straight on: near head-on.
                assertTrue(Math.abs(offset) < 0.15, "the displacement gun fires at the vector: " + offset);
            }
        }
    }

    // ---- GUN-9, GUN-10

    private static void rate(GunController g, GunController.Opening which, int shots, double score) {
        for (int i = 0; i < shots; i++) g.recordVirtualShotForTest(BOT, which, score);
    }

    @Test
    @Tag("GUN-9")
    @DisplayName("off, a small lead is within margin and the verdict is null; on, the best rating is named")
    void freeGunDropsTheMargin() {
        for (boolean light : new boolean[] {false, true}) {
            for (boolean free : new boolean[] {false, true}) {
                GunController g = new GunController(FIELD, 1);
                g.setFreeGun(free);
                for (int i = 0; i < 3; i++) {
                    g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 0.9, light);
                    g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 1.0, light);
                }
                GunController.Opening v = g.liveVerdict(BOT, light);
                if (free) {
                    assertEquals(GunController.Opening.ANTI_SURFER, v, "the highest rating, light=" + light);
                } else {
                    assertNull(v, "three shots each is within margin, light=" + light);
                }
            }
        }
    }

    @Test
    @Tag("GUN-9")
    @DisplayName("free, a tie goes to the first candidate (main) and no rated shot means no verdict; the hybrid gate still applies")
    void freeGunTiesAndGate() {
        GunController g = new GunController(FIELD, 1);
        g.setFreeGun(true);
        assertNull(g.liveVerdict(BOT));
        rate(g, GunController.Opening.MAIN, 5, 1.0);
        rate(g, GunController.Opening.ANTI_SURFER, 5, 1.0);
        assertEquals(GunController.Opening.MAIN, g.liveVerdict(BOT));
        // A hybrid gun rated far higher stays out while its gate is closed (main rates well: M0).
        GunController h = new GunController(FIELD, 1);
        h.setFreeGun(true);
        for (int i = 0; i < 300; i++) {
            h.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 1.0);
            h.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 1.0);
            h.recordVirtualShotForTest(BOT, GunController.Opening.HYBRID, 5.0);
        }
        assertTrue(h.liveVerdict(BOT) != GunController.Opening.HYBRID);
    }

    @Test
    @Tag("GUN-9")
    @DisplayName("melee: the switch is ignored")
    void freeGunMelee() {
        GunController g = new GunController(FIELD, 4);
        g.setFreeGun(true);
        for (int i = 0; i < 3; i++) {
            g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 0.9);
            g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 1.0);
        }
        assertNull(g.liveVerdict(BOT));
    }

    @Test
    @Tag("GUN-10")
    @DisplayName("off, 600 recent shots outweigh 300 old ones (half-life); on, the lifetime rate decides and the old lead stands")
    void undecayedRatings() {
        for (boolean undecayed : new boolean[] {false, true}) {
            GunController g = new GunController(FIELD, 1);
            g.setUndecayed(undecayed);
            for (int i = 0; i < 300; i++) {
                g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 0.0);
                g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 1.0);
            }
            for (int i = 0; i < 150; i++) {
                g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 1.0);
                g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 0.0);
            }
            GunController.Opening v = g.liveVerdict(BOT);
            if (undecayed) {
                // Lifetime: anti-surfer 300/450, main 150/450.
                assertEquals(GunController.Opening.ANTI_SURFER, v);
            } else {
                assertTrue(v != GunController.Opening.ANTI_SURFER, "the half-life has forgotten most of the old lead: " + v);
            }
        }
    }

    @Test
    @Tag("GUN-10")
    @DisplayName("the profile's lifetime totals are the same either way")
    void lifetimeTotalsUnchanged() {
        for (boolean undecayed : new boolean[] {false, true}) {
            GunController g = new GunController(FIELD, 1);
            g.setUndecayed(undecayed);
            for (int i = 0; i < 250; i++) g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 1.0);
            assertEquals(250.0, g.virtualGunScores(BOT)[0], 1e-9);
            assertEquals(250.0, g.virtualGunScores(BOT)[1], 1e-9);
        }
    }

    @Test
    @Tag("GUN-8")
    @DisplayName("with the TripHammer on, the main rating is not folded or seed-checked; the anti-surfer pair still is")
    void mainTotalsLeftOutUnderTripHammer() {
        GunController g = new GunController(FIELD, 1);
        g.setTripHammer(true);
        for (int i = 0; i < 20; i++) {
            g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 1.0);
            g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 1.0);
        }
        double[] v = g.virtualGunScores(BOT);
        assertEquals(0.0, v[0], 1e-9);
        assertEquals(0.0, v[1], 1e-9);
        assertEquals(20.0, v[2], 1e-9);
        assertEquals(20.0, v[3], 1e-9);
    }

    @Test
    @Tag("GUN-10")
    @DisplayName("melee: the switch is ignored")
    void undecayedMelee() {
        GunController g = new GunController(FIELD, 4);
        g.setUndecayed(true);
        for (int i = 0; i < 300; i++) {
            g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 0.0);
            g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 1.0);
        }
        for (int i = 0; i < 150; i++) {
            g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 1.0);
            g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 0.0);
        }
        assertTrue(g.liveVerdict(BOT) != GunController.Opening.ANTI_SURFER, "the old half-life is still in force");
    }
}
