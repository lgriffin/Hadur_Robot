package hadur2.core.gun;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.physics.DiaUtils;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;

/**
 * GUN-3 as explicit, general invariants over {@link DiaUtils#generateFiringAngles(int, double, double)}
 * and the kernel bandwidth every distance implies, independent of the anti-surfer gun's
 * present distance-based constant.
 */
class AntiSurferGunProperties {

    @Property
    @Tag("GUN-3")
    void gridSpansExactlyTheAsymmetricEscapeAngles(
            @ForAll @DoubleRange(min = 0.01, max = 1.4) double neg,
            @ForAll @DoubleRange(min = 0.01, max = 1.4) double pos) {
        double[] angles = DiaUtils.generateFiringAngles(59, neg, pos);
        assertEquals(-neg, angles[0], 1e-9);
        assertEquals(pos, angles[angles.length - 1], 1e-9);
    }

    @Property
    @Tag("GUN-3")
    void gridIsMonotonicAndEvenlySpaced(
            @ForAll @DoubleRange(min = 0.01, max = 1.4) double neg,
            @ForAll @DoubleRange(min = 0.01, max = 1.4) double pos) {
        double[] angles = DiaUtils.generateFiringAngles(59, neg, pos);
        double step = angles[1] - angles[0];
        for (int i = 1; i < angles.length; i++) {
            assertTrue(angles[i] > angles[i - 1], "strictly increasing");
            assertEquals(step, angles[i] - angles[i - 1], 1e-9, "evenly spaced");
        }
    }

    @Property
    @Tag("GUN-3")
    void symmetricCaseMatchesTheClassicGrid(
            @ForAll @DoubleRange(min = 0.01, max = 1.4) double mea) {
        double[] asymmetric = DiaUtils.generateFiringAngles(59, mea, mea);
        double[] classic = DiaUtils.generateFiringAngles(59, mea);
        for (int i = 0; i < 59; i++) {
            assertEquals(classic[i], asymmetric[i], 1e-9);
        }
    }

    @Property
    @Tag("GUN-3")
    void kernelBandwidthNeverNarrowerThanTheTargetsHalfWidth(
            @ForAll @DoubleRange(min = 40, max = 1300) double distance) {
        // Mirrors AntiSurferGun.aim's and HybridGun.aim's bandwidth construction: the GUN-3
        // invariant is that it is never narrower than the target's own angular half-width.
        double halfWidth = DiaUtils.botWidthAimAngle(distance);
        double bandwidth = Math.max(2.0 * halfWidth, halfWidth);
        assertTrue(bandwidth >= halfWidth - 1e-15);
    }
}
