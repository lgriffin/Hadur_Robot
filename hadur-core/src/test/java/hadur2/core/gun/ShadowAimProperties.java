package hadur2.core.gun;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.physics.Angles;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Scale;

/** GUN-7 holds for any gun angle, any width, any shadow term. */
class ShadowAimProperties {

    @Property
    @Tag("GUN-7")
    void withNoShadowTheChoiceIsTheGunsOwn(
            @ForAll @DoubleRange(min = 0, max = 6.28) @Scale(3) double angle,
            @ForAll @DoubleRange(min = 0.01, max = 0.2) @Scale(3) double half,
            @ForAll @DoubleRange(min = 0.1, max = 3.0) @Scale(2) double power) {
        ShadowAim.Mass mass = ShadowAim.Mass.around(angle, 2 * half);
        assertEquals(angle, ShadowAim.choose(angle, mass, half, power, null), 0.0);
        assertEquals(angle, ShadowAim.choose(angle, mass, half, power,
            ShadowAimTest.shadow(false, 9, a -> 9)), 0.0);
        // A shadow that is worth nothing anywhere keeps it too.
        assertEquals(Angles.normalAbsoluteAngle(angle), ShadowAim.choose(angle, mass, half, power,
            ShadowAimTest.shadow(true, 0, a -> 0)), 1e-12);
    }

    @Property
    @Tag("GUN-7")
    void theChoiceIsAlwaysWithinReachOfTheGunsAngle(
            @ForAll @DoubleRange(min = 0, max = 6.28) @Scale(3) double angle,
            @ForAll @DoubleRange(min = 0.01, max = 0.2) @Scale(3) double half,
            @ForAll @DoubleRange(min = -1, max = 1) @Scale(3) double slope) {
        ShadowAim.Mass mass = ShadowAim.Mass.around(angle, 2 * half);
        double chosen = ShadowAim.choose(angle, mass, half, 1.95,
            ShadowAimTest.shadow(true, 10, a -> 10 * Math.max(0, slope * Angles.normalRelativeAngle(a - angle))));
        double d = Math.abs(Angles.normalRelativeAngle(chosen - angle));
        assertTrue(d <= ShadowAim.SAMPLE_REACH * half + 1e-9, "moved " + d);
    }

    @Property
    @Tag("GUN-7")
    void atEqualHitValueTheLargestShadowWins(
            @ForAll @IntRange(min = 2, max = 8) int n,
            @ForAll @IntRange(min = 0, max = 7) int favourite,
            @ForAll @DoubleRange(min = 0.01, max = 5) @Scale(3) double value) {
        int fav = favourite % n;
        double[] angles = new double[n];
        double[] hits = new double[n];
        for (int i = 0; i < n; i++) {
            angles[i] = 1.0 + 0.01 * i;
            hits[i] = 0.1;
        }
        // Only the favourite's path crosses the dangerous interval.
        double favAngle = angles[fav];
        int picked = ShadowAim.pick(angles, hits, n, 1.95,
            ShadowAimTest.shadow(true, value, a -> a == favAngle ? value : 0));
        assertEquals(fav, picked);
    }

    @Property
    @Tag("GUN-7")
    void theBestValueIsNeverBelowTheGunsOwn(
            @ForAll @IntRange(min = 1, max = 10) int n,
            @ForAll @DoubleRange(min = 0, max = 1) @Scale(3) double h0,
            @ForAll @DoubleRange(min = 0, max = 1) @Scale(3) double h1,
            @ForAll @DoubleRange(min = 0, max = 4) @Scale(3) double s0,
            @ForAll @DoubleRange(min = 0, max = 4) @Scale(3) double s1) {
        double[] angles = new double[n];
        double[] hits = new double[n];
        for (int i = 0; i < n; i++) {
            angles[i] = i;
            hits[i] = i == 0 ? h0 : h1;
        }
        ShadowValue s = ShadowAimTest.shadow(true, 4, a -> a == 0 ? s0 : s1);
        int p = ShadowAim.pick(angles, hits, n, 1.0, s);
        double damage = 4.0;
        double own = h0 * damage + s0;
        double chosen = (p == 0 ? h0 : h1) * damage + (p == 0 ? s0 : s1);
        assertTrue(chosen >= own - 1e-12);
    }
}
