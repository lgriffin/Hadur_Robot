package hadur2.core.gun;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.RobotState;
import hadur2.core.model.SeedWeight;
import hadur2.core.model.Wave;
import hadur2.core.policy.BattleHitRates;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * GUN-5: the virtual guns are rated apart for bullets under 0.2 and the gun fired is the one
 * rated highest for the class of the shot.
 */
class LightClassGunTest {

    static final String BOT = GunOpeningTest.wave().botName;
    static final Point2D.Double ME = GunOpeningTest.ME;

    private static void rate(GunController g, GunController.Opening gun, double score, boolean light, int n) {
        for (int i = 0; i < n; i++) g.recordVirtualShotForTest(BOT, gun, score, light);
    }

    /** Seeds that say "GF 0.8" with no displacement: the main gun aims head-on, the others 0.8 across. */
    private static GunController seeded() {
        GunController g = new GunController(GunOpeningTest.FIELD, 1);
        Wave w = GunOpeningTest.wave();
        for (int i = 0; i < 100; i++) {
            g.seed(w.botName, GunOpeningTest.sample(w, 0.8, 0, 0), new SeedWeight(0.5));
        }
        return g;
    }

    private static Wave waveOfPower(double power) {
        Wave w = GunOpeningTest.wave();
        w.setBulletPower(power);
        return w;
    }

    @Test
    @Tag("GUN-5")
    @DisplayName("the light class is bullets under 0.2, the same line as POW-11's lightest class")
    void lightClassBoundary() {
        assertEquals(BattleHitRates.LIGHT_BELOW, GunController.LIGHT_BELOW);
        assertTrue(GunController.isLight(0.1));
        assertTrue(GunController.isLight(0.1999));
        assertFalse(GunController.isLight(0.2));
        assertFalse(GunController.isLight(1.95));
    }

    @Test
    @Tag("GUN-5")
    @DisplayName("light and heavy bullets are rated apart: each class names its own best gun")
    void classesAreRatedApart() {
        GunController g = new GunController(GunOpeningTest.FIELD, 1);
        rate(g, GunController.Opening.MAIN, 0.0, true, 200);
        rate(g, GunController.Opening.ANTI_SURFER, 1.0, true, 200);
        rate(g, GunController.Opening.MAIN, 1.0, false, 200);
        rate(g, GunController.Opening.ANTI_SURFER, 0.0, false, 200);
        assertEquals(GunController.Opening.ANTI_SURFER, g.liveVerdict(BOT, true));
        assertEquals(GunController.Opening.MAIN, g.liveVerdict(BOT, false));
    }

    @Test
    @Tag("GUN-5")
    @DisplayName("ratings of one class say nothing about the other")
    void oneClassLeavesTheOtherUntouched() {
        GunController g = new GunController(GunOpeningTest.FIELD, 1);
        rate(g, GunController.Opening.MAIN, 0.0, true, 200);
        rate(g, GunController.Opening.ANTI_SURFER, 1.0, true, 200);
        assertEquals(GunController.Opening.ANTI_SURFER, g.liveVerdict(BOT, true));
        assertNull(g.liveVerdict(BOT, false), "no heavy shot has been rated");
        assertNull(g.liveVerdict(BOT), "the plain verdict is the rest class's");
    }

    @Test
    @Tag("GUN-5")
    @DisplayName("the sampled gun is a candidate for light bullets only")
    void sampledGunIsLightOnly() {
        GunController g = new GunController(GunOpeningTest.FIELD, 1);
        for (boolean light : new boolean[] {true, false}) {
            rate(g, GunController.Opening.MAIN, 0.0, light, 200);
            rate(g, GunController.Opening.ANTI_SURFER, 0.0, light, 200);
            rate(g, GunController.Opening.SAMPLED, 1.0, light, 200);
        }
        assertEquals(GunController.Opening.SAMPLED, g.liveVerdict(BOT, true));
        assertNotEquals(GunController.Opening.SAMPLED, g.liveVerdict(BOT, false));
    }

    @Test
    @Tag("GUN-5")
    @DisplayName("a verdict that is within the margin names no gun, so the main gun fires (GUN-1's margin)")
    void closeRatingsStayNull() {
        GunController g = new GunController(GunOpeningTest.FIELD, 1);
        rate(g, GunController.Opening.MAIN, 1.0, true, 3);
        rate(g, GunController.Opening.SAMPLED, 0.9, true, 3);
        assertNull(g.liveVerdict(BOT, true));
    }

    @Test
    @Tag("GUN-5")
    @DisplayName("the gun that aims is read from the class the wave's power falls in")
    void aimFollowsTheWavesClass() {
        GunController g = seeded();
        rate(g, GunController.Opening.MAIN, 0.0, true, 200);
        rate(g, GunController.Opening.ANTI_SURFER, 1.0, true, 200);
        rate(g, GunController.Opening.MAIN, 1.0, false, 200);
        rate(g, GunController.Opening.ANTI_SURFER, 0.0, false, 200);

        double light = g.aim(waveOfPower(0.1), ME, 30);
        double heavy = g.aim(waveOfPower(1.95), ME, 30);
        assertTrue(GunOpeningTest.offsetFromHeadOn(light) > 0.2, "light: the anti-surfer gun, GF 0.8");
        assertTrue(GunOpeningTest.offsetFromHeadOn(heavy) < 0.05, "heavy: the main gun, head-on");
    }

    @Test
    @Tag("GUN-5")
    @DisplayName("the class is the wave's power's: 0.19 is light, 0.2 is not")
    void classBoundaryInAim() {
        GunController g = seeded();
        rate(g, GunController.Opening.MAIN, 0.0, true, 200);
        rate(g, GunController.Opening.ANTI_SURFER, 1.0, true, 200);
        assertTrue(GunOpeningTest.offsetFromHeadOn(g.aim(waveOfPower(0.19), ME, 30)) > 0.2);
        assertTrue(GunOpeningTest.offsetFromHeadOn(g.aim(waveOfPower(0.2), ME, 30)) < 0.05,
            "0.2 is in the rest class, which has no verdict: the main gun");
    }

    @Test
    @Tag("GUN-5")
    @DisplayName("a sampled-gun verdict aims at a neighbour's guess factor")
    void sampledVerdictAims() {
        GunController g = seeded();
        for (boolean light : new boolean[] {true}) {
            rate(g, GunController.Opening.MAIN, 0.0, light, 200);
            rate(g, GunController.Opening.ANTI_SURFER, 0.0, light, 200);
            rate(g, GunController.Opening.SAMPLED, 1.0, light, 200);
        }
        double aim = g.aim(waveOfPower(0.1), ME, 30);
        assertTrue(GunOpeningTest.offsetFromHeadOn(aim) > 0.2, "every neighbour says GF 0.8");
    }

    @Test
    @Tag("GUN-5")
    @DisplayName("a virtual bullet is rated in the class of the real shot's power, not the other's")
    void virtualBulletIsRatedInItsClass() {
        GunController g = seeded();
        Wave w = GunOpeningTest.wave();
        w.setBulletPower(0.1);
        g.fireVirtualBullets(w, ME, 30, 0.1);
        w.firingWave = true;
        g.onWaveBreak(w, statesAcross(w));
        assertEquals(1, g.ratedShotsForTest(BOT, true));
        assertEquals(0, g.ratedShotsForTest(BOT, false));

        Wave heavy = GunOpeningTest.wave();
        g.fireVirtualBullets(heavy, ME, 30, 1.95);
        heavy.firingWave = true;
        g.onWaveBreak(heavy, statesAcross(heavy));
        assertEquals(1, g.ratedShotsForTest(BOT, true));
        assertEquals(1, g.ratedShotsForTest(BOT, false));
        assertEquals(2, g.virtualGunScores(BOT)[0], "the profile's totals add up both classes");
    }

    /** The target standing still where the wave was aimed, over the ticks the wave crosses it. */
    private static List<RobotState> statesAcross(Wave w) {
        List<RobotState> states = new ArrayList<>();
        double distance = ME.distance(GunOpeningTest.ENEMY);
        long arrival = w.fireTime + (long) Math.floor(distance / w.bulletSpeed());
        for (long t = arrival - 2; t <= arrival + 2; t++) {
            states.add(RobotState.newBuilder().setLocation(GunOpeningTest.ENEMY).setTime(t).build());
        }
        return states;
    }

    @Test
    @Tag("GUN-5")
    @DisplayName("the sampled gun's phase moves on with real shots only, and starts the same in every core")
    void phaseMovesWithRealShots() {
        GunController a = seeded();
        GunController b = seeded();
        assertEquals(a.samplePhaseForTest(), b.samplePhaseForTest(), 0.0);
        double start = a.samplePhaseForTest();

        a.fireVirtualBullets(GunOpeningTest.wave(), ME, 30, 0.1);
        a.aim(waveOfPower(0.1), ME, 30);
        assertEquals(start, a.samplePhaseForTest(), 0.0, "aiming and virtual bullets do not move it");

        a.shotFired();
        b.shotFired();
        assertNotEquals(start, a.samplePhaseForTest());
        assertEquals(a.samplePhaseForTest(), b.samplePhaseForTest(), 0.0, "deterministic: a replay repeats it");
    }

    @Test
    @Tag("GUN-5")
    @DisplayName("melee guns rate nothing: the duel's virtual bullets are not fired")
    void meleeRatesNothing() {
        GunController g = new GunController(GunOpeningTest.FIELD, 5);
        g.fireVirtualBullets(GunOpeningTest.wave(), ME, 30, 0.1);
        assertEquals(0, g.ratedShotsForTest(BOT, true));
        assertEquals(0, g.ratedShotsForTest(BOT, false));
    }
}
