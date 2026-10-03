package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MIR-1: recognising a robot that drives to the mirror image of our position. */
class MirrorDetectorTest {

    static final double W = 800;
    static final double H = 600;

    /** Our path: a slow figure on the left half of the field, x and y at tick t. */
    static double ourX(long t) {
        return 200 + 120 * Math.sin(t * 0.05);
    }

    static double ourY(long t) {
        return 300 + 200 * Math.cos(t * 0.031);
    }

    /** Our positions at t, t-1, ..., t-MAX_LAG (newest first), as HadurCore passes them. */
    static double[][] history(long t) {
        int n = MirrorDetector.MAX_LAG + 1;
        double[] xs = new double[n];
        double[] ys = new double[n];
        for (int l = 0; l < n; l++) {
            xs[l] = ourX(t - l);
            ys[l] = ourY(t - l);
        }
        return new double[][] {xs, ys};
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: an enemy at the point mirror of where we were three ticks ago activates it, with that lag")
    void pointMirrorWithLagActivates() {
        MirrorDetector d = new MirrorDetector(W, H);
        boolean active = false;
        for (long t = 10; t < 10 + MirrorDetector.ON_SCANS + 20; t++) {
            double[][] h = history(t);
            active = d.tick(W - ourX(t - 3), H - ourY(t - 3), h[0], h[1], 100, 100);
        }
        assertTrue(active);
        assertEquals(3, d.lag());
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: an axis mirror is not taken for one (no RoboRumble robot uses it; surfers matched it)")
    void axisMirrorIgnored() {
        MirrorDetector d = new MirrorDetector(W, H);
        for (long t = 10; t < 2000; t++) {
            double[][] h = history(t);
            assertFalse(d.tick(W - ourX(t - 1), ourY(t - 1), h[0], h[1], 100, 100), "tick " + t);
        }
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: two robots orbiting a point near the centre for 100 scans (the top-19 benches' longest was 80) do not activate it")
    void orbitAboutTheCentreForAWhileDoesNotActivate() {
        MirrorDetector d = new MirrorDetector(W, H);
        for (long t = 10; t < 10 + 100; t++) {
            double a = t * 0.03;
            double ux = 400 + 220 * Math.sin(a);
            double uy = 300 + 220 * Math.cos(a);
            double[] xs = new double[MirrorDetector.MAX_LAG + 1];
            double[] ys = new double[MirrorDetector.MAX_LAG + 1];
            for (int l = 0; l < xs.length; l++) {
                xs[l] = 400 + 220 * Math.sin((t - l) * 0.03);
                ys[l] = 300 + 220 * Math.cos((t - l) * 0.03);
            }
            assertFalse(d.tick(800 - ux + 5, 600 - uy - 5, xs, ys, 100, 100), "tick " + t);
        }
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: once confirmed in a battle, a later round activates after 30 scans")
    void primedAfterConfirmation() {
        MirrorDetector d = new MirrorDetector(W, H);
        long t = 10;
        for (; t < 10 + MirrorDetector.ON_SCANS + 5; t++) {
            double[][] h = history(t);
            d.tick(W - ourX(t), H - ourY(t), h[0], h[1], 100, 100);
        }
        assertTrue(d.confirmed());
        d.newRound();
        boolean active = false;
        int scans = 0;
        while (!active && scans < 100) {
            double[][] h = history(t);
            active = d.tick(W - ourX(t), H - ourY(t), h[0], h[1], 100, 100);
            t++;
            scans++;
        }
        assertEquals(MirrorDetector.PRIMED_SCANS, scans);
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: it needs a whole run of close scans, not one")
    void needsAWholeRun() {
        MirrorDetector d = new MirrorDetector(W, H);
        for (long t = 10; t < 10 + MirrorDetector.ON_SCANS - 1; t++) {
            double[][] h = history(t);
            assertFalse(d.tick(W - ourX(t), H - ourY(t), h[0], h[1], 100, 100), "scan " + t);
        }
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: an enemy orbiting us at 450 px (a surfer's path) never activates it")
    void orbitingEnemyNeverActivates() {
        MirrorDetector d = new MirrorDetector(W, H);
        for (long t = 10; t < 2000; t++) {
            double[][] h = history(t);
            double a = t * 0.02;
            double ex = Math.max(18, Math.min(W - 18, ourX(t) + 450 * Math.sin(a)));
            double ey = Math.max(18, Math.min(H - 18, ourY(t) + 450 * Math.cos(a)));
            assertFalse(d.tick(ex, ey, h[0], h[1], 100, 100), "tick " + t);
        }
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: an enemy sitting still at the centre never activates it")
    void stillEnemyAtTheCentreNeverActivates() {
        MirrorDetector d = new MirrorDetector(W, H);
        for (long t = 10; t < 2000; t++) {
            double[][] h = history(t);
            assertFalse(d.tick(W / 2, H / 2, h[0], h[1], 100, 100), "tick " + t);
        }
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: it clears once the enemy stops following the mirror")
    void clearsWhenTheMirrorStops() {
        MirrorDetector d = new MirrorDetector(W, H);
        long t = 10;
        for (; t < 10 + MirrorDetector.ON_SCANS + 20; t++) {
            double[][] h = history(t);
            d.tick(W - ourX(t), H - ourY(t), h[0], h[1], 100, 100);
        }
        assertTrue(d.active());
        boolean cleared = false;
        for (int i = 0; i < 60 && !cleared; i++, t++) {
            double[][] h = history(t);
            cleared = !d.tick(100, 100, h[0], h[1], 100, 100);
        }
        assertTrue(cleared, "a still enemy in a corner is no mirror");
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: a new round needs a new run; a new opponent forgets everything")
    void newRoundAndForget() {
        MirrorDetector d = new MirrorDetector(W, H);
        for (long t = 10; t < 10 + MirrorDetector.ON_SCANS + 5; t++) {
            double[][] h = history(t);
            d.tick(W - ourX(t), H - ourY(t), h[0], h[1], 100, 100);
        }
        assertTrue(d.active());
        d.newRound();
        assertFalse(d.active());
        assertTrue(d.confirmed(), "a new round keeps the confirmation");
        d.forget();
        assertFalse(d.active());
        assertFalse(d.confirmed(), "a new opponent does not");
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: early in a round, with fewer past positions than the longest lag, it still reads them")
    void shortHistory() {
        MirrorDetector d = new MirrorDetector(W, H);
        assertFalse(d.tick(W - 100, H - 100, new double[] {100}, new double[] {100}, 100, 100));
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: a close scan while either robot is nearly disabled neither extends nor breaks the run")
    void lowEnergyScansDoNotCount() {
        MirrorDetector d = new MirrorDetector(W, H);
        long t = 10;
        for (; t < 10 + 2000; t++) {
            double[][] h = history(t);
            assertFalse(d.tick(W - ourX(t), H - ourY(t), h[0], h[1], 5, 100), "tick " + t);
        }
        for (int i = 0; i < MirrorDetector.ON_SCANS - 1; i++, t++) {
            double[][] h = history(t);
            assertFalse(d.tick(W - ourX(t), H - ourY(t), h[0], h[1], 100, 100));
        }
        double[][] h = history(t);
        d.tick(W - ourX(t), H - ourY(t), h[0], h[1], 0.5, 0.5);
        h = history(++t);
        assertTrue(d.tick(W - ourX(t), H - ourY(t), h[0], h[1], 100, 100),
            "the low-energy scan did not break the run");
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: a scan off the reflection breaks the run even while nearly disabled")
    void lowEnergyScanOffTheReflectionStillBreaksTheRun() {
        MirrorDetector d = new MirrorDetector(W, H);
        long t = 10;
        for (int i = 0; i < MirrorDetector.ON_SCANS - 1; i++, t++) {
            double[][] h = history(t);
            assertFalse(d.tick(W - ourX(t), H - ourY(t), h[0], h[1], 100, 100));
        }
        // Far enough off for long enough that the averaged error passes ON_ERROR.
        for (int i = 0; i < 20; i++, t++) {
            double[][] h = history(t);
            d.tick(ourX(t), ourY(t), h[0], h[1], 5, 5);
        }
        double[][] h = history(t);
        assertFalse(d.tick(W - ourX(t), H - ourY(t), h[0], h[1], 100, 100),
            "the stricter reading: low energy never shields a broken run");
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: the reflection through the centre")
    void reflections() {
        assertEquals(700, MirrorDetector.mirrorX(100, W));
        assertEquals(500, MirrorDetector.mirrorY(100, H));
    }
}
