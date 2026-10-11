package hadur2.core.gun;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.SeedWeight;
import hadur2.core.model.Wave;
import hadur2.core.physics.Angles;
import hadur2.core.physics.DiaUtils;
import java.util.function.DoubleUnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** GUN-7: the angle is chosen by the damage of a hit plus the damage the bullet's shadows avoid. */
class ShadowAimTest {

    static final double HALF = 0.04;
    static final double BAND = 2 * HALF;

    /** A shadow term made of a function of the angle; its ceiling is {@code max}. */
    static ShadowValue shadow(boolean active, double max, DoubleUnaryOperator avoided) {
        return new ShadowValue() {
            @Override public boolean active() { return active; }
            @Override public double ceiling(double power) { return max; }
            @Override public double avoided(double angle, double power) { return avoided.applyAsDouble(angle); }
        };
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("with nothing to shadow the gun's own angle is fired, exactly")
    void inactiveShadowKeepsTheGunsAngle() {
        ShadowAim.Mass mass = ShadowAim.Mass.around(1.0, BAND);
        assertEquals(1.0, ShadowAim.choose(1.0, mass, HALF, 1.95, null), 0.0);
        assertEquals(1.0, ShadowAim.choose(1.0, mass, HALF, 1.95, shadow(false, 5, a -> 5)), 0.0);
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("a shadow worth nothing keeps the gun's angle, which wins every tie")
    void tiesKeepTheGunsAngle() {
        // Hit values equal at every candidate (a flat mass) and no shadow anywhere.
        double[] angles = {1.0, 1.01, 0.99, 1.02};
        double[] hits = {0.1, 0.1, 0.1, 0.1};
        assertEquals(0, ShadowAim.pick(angles, hits, 4, 1.95, shadow(true, 1, a -> 0)));
        assertEquals(0, ShadowAim.pick(angles, hits, 4, 1.95, shadow(true, 1, a -> 0.3)),
            "equal shadow value at every candidate is a tie too");
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("when hit values tie, the candidate that shadows more of a dangerous interval wins")
    void theBiggerShadowWinsAtEqualHitValue() {
        double[] angles = {1.0, 1.01, 0.99};
        double[] hits = {0.1, 0.1, 0.1};
        // The third candidate shadows most of the interval, the second some.
        ShadowValue s = shadow(true, 2, a -> a < 0.995 ? 1.5 : a > 1.005 ? 0.6 : 0.1);
        assertEquals(2, ShadowAim.pick(angles, hits, 3, 1.95, s));
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("a shadow does not buy a worse shot than it is worth")
    void aBigHitLossIsNotBoughtBackBySmallShadows() {
        double[] angles = {1.0, 1.02};
        double[] hits = {0.20, 0.02};
        // Hit values 0.2 * 7.8 = 1.56 against 0.02 * 7.8 = 0.156; the shadow is worth 0.5 only.
        assertEquals(0, ShadowAim.pick(angles, hits, 2, 1.95, shadow(true, 0.5, a -> a > 1.01 ? 0.5 : 0)));
        // Worth 2, it is.
        assertEquals(1, ShadowAim.pick(angles, hits, 2, 1.95, shadow(true, 2, a -> a > 1.01 ? 2 : 0)));
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("hit value is the probability mass times the damage of the power")
    void hitValueIsMassTimesDamage() {
        // Candidate 1's mass is half of candidate 0's, and the shadow term favours 1 by exactly
        // half of 0's hit value: a tie, which the gun's angle wins; a hair more and 1 wins.
        double[] angles = {1.0, 1.02};
        double[] hits = {0.2, 0.1};
        double damage = 4 * 1.95 + 2 * 0.95;
        double gap = 0.1 * damage;
        assertEquals(0, ShadowAim.pick(angles, hits, 2, 1.95, shadow(true, 9, a -> a > 1.01 ? gap : 0)));
        assertEquals(1, ShadowAim.pick(angles, hits, 2, 1.95, shadow(true, 9, a -> a > 1.01 ? gap + 1e-6 : 0)));
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("candidates are the gun's angle, four offsets inside the bot's width and kernel samples nearby")
    void candidatesAreBounded() {
        // Neighbours spread over two bot widths: 40 samples. The shadow likes a far angle, which is
        // no candidate, so the gun's angle stays; and it likes everything the offsets reach.
        double[] pool = new double[40];
        double[] weights = new double[40];
        for (int i = 0; i < 40; i++) {
            pool[i] = 1.0 + (i - 20) * 0.01;
            weights[i] = 1;
        }
        ShadowAim.Mass mass = ShadowAim.Mass.kernel(pool, weights, BAND);
        int[] calls = {0};
        ShadowValue count = shadow(true, 100, a -> {
            calls[0]++;
            return 0;
        });
        ShadowAim.choose(1.0, mass, HALF, 1.95, count);
        assertTrue(calls[0] <= 1 + ShadowAim.OFFSETS.length + ShadowAim.MAX_SAMPLES, "calls " + calls[0]);
        double chosen = ShadowAim.choose(1.0, mass, HALF, 1.95, shadow(true, 100, a -> a > 1.3 ? 50 : 0));
        assertEquals(1.0, chosen, 0.0);
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("an offset candidate shifts the aim by less than a bot width, keeping a hit")
    void offsetStaysWithinTheBotsWidth() {
        ShadowAim.Mass mass = ShadowAim.Mass.around(1.0, BAND);
        double chosen = ShadowAim.choose(1.0, mass, HALF, 1.95, shadow(true, 100, a -> a > 1.0 ? 50 : 0));
        assertTrue(chosen > 1.0 && chosen <= 1.0 + 0.9 * HALF + 1e-12, "chosen " + chosen);
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("the mass is a probability: at most 1, at its peak over the points, nothing without weight")
    void massIsAProbability() {
        ShadowAim.Mass one = ShadowAim.Mass.around(2.0, BAND);
        assertEquals(ShadowAim.FALLBACK_PEAK, one.at(2.0), 1e-12);
        assertTrue(one.at(2.0 + BAND) < one.at(2.0));
        assertEquals(one.at(2.0 + 0.3), one.at(2.0 - 0.3), 1e-12);
        ShadowAim.Mass none = ShadowAim.Mass.kernel(new double[] {1.0}, new double[] {0.0}, BAND);
        assertEquals(0.0, none.at(1.0), 0.0);
        ShadowAim.Mass dense = ShadowAim.Mass.kernel(new double[] {1.0, 1.0}, new double[] {1, 1}, BAND);
        assertEquals(ShadowAim.KERNEL_SCALE, dense.at(1.0), 1e-12);
    }

    // The controller, with a seeded main gun.

    private static GunController seeded() {
        GunController g = new GunController(GunOpeningTest.FIELD, 1);
        Wave w = GunOpeningTest.wave();
        for (int i = 0; i < 100; i++) {
            g.seed(w.botName, GunOpeningTest.sample(w, 0.5, 0, 0), new SeedWeight(0.5));
        }
        return g;
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("with no enemy wave to shadow the gun aims exactly as before D4")
    void noWavesIsD3sAim() {
        GunController g = seeded();
        Wave w = GunOpeningTest.wave();
        double plain = g.aim(w, GunOpeningTest.ME, 30);
        assertEquals(plain, g.aim(w, GunOpeningTest.ME, 30, null), 0.0);
        assertEquals(plain, g.aim(w, GunOpeningTest.ME, 30, shadow(false, 9, a -> 9)), 0.0);
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("with a shadow term the gun's choice moves only within about a bot width of its own aim")
    void controllerAimStaysNearTheGun() {
        GunController g = seeded();
        Wave w = GunOpeningTest.wave();
        double plain = g.aim(w, GunOpeningTest.ME, 30);
        double half = DiaUtils.botWidthAimAngle(GunOpeningTest.ME.distance(w.targetLocation));
        // The shadow prizes angles clockwise of the gun's: the aim moves that way, inside two half-widths.
        double shifted = g.aim(w, GunOpeningTest.ME, 30,
            shadow(true, 100, a -> Angles.normalRelativeAngle(a - plain) > 0 ? 50 : 0));
        double d = Angles.normalRelativeAngle(shifted - plain);
        assertTrue(d > 0 && d <= ShadowAim.SAMPLE_REACH * half + 1e-9, "shift " + d + " half-width " + half);
        // A shadow worth nothing leaves it where it was.
        assertEquals(plain, g.aim(w, GunOpeningTest.ME, 30, shadow(true, 0, a -> 0)), 0.0);
    }

    @Test
    @Tag("GUN-7")
    @DisplayName("the shadow term can be switched off by a constant, and ships on")
    void shippedOn() {
        assertTrue(GunController.SHADOW_AIM);
    }
}
