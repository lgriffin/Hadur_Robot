package hadur2.core.gun;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Scale;

/** GUN-5 holds for every power, every phase and every number of shots. */
class LightClassGunProperties {

    @Property
    @Tag("GUN-5")
    void everyPowerIsInExactlyOneClass(@ForAll @DoubleRange(min = 0.1, max = 3.0) @Scale(4) double power) {
        assertEquals(power < 0.2, GunController.isLight(power));
    }

    @Property
    @Tag("GUN-5")
    void theSamplePickIsAlwaysANeighbour(@ForAll @DoubleRange(min = 0, max = 1, maxIncluded = false) double phase,
                                         @ForAll @IntRange(min = 1, max = 200) int n) {
        int i = SampledGun.pick(phase, n);
        assertTrue(i >= 0 && i < n);
    }

    @Property
    @Tag("GUN-5")
    void aLaterPhasePicksNoEarlierNeighbour(@ForAll @DoubleRange(min = 0, max = 1, maxIncluded = false) double a,
                                            @ForAll @DoubleRange(min = 0, max = 1, maxIncluded = false) double b,
                                            @ForAll @IntRange(min = 1, max = 200) int n) {
        assertTrue(SampledGun.pick(Math.min(a, b), n) <= SampledGun.pick(Math.max(a, b), n));
    }

    @Property
    @Tag("GUN-5")
    void thePhaseStaysInUnitIntervalAndNeverRepeatsSoon(@ForAll @IntRange(min = 1, max = 500) int shots) {
        SampledGun gun = new SampledGun();
        java.util.Set<Double> seen = new java.util.HashSet<>();
        for (int i = 0; i < shots; i++) {
            double p = gun.phase();
            assertTrue(p >= 0 && p < 1, "phase " + p);
            assertTrue(seen.add(p), "no phase repeats within 500 shots");
            gun.shotFired();
        }
    }

    @Property
    @Tag("GUN-5")
    void everyCoreFollowsTheSameSequence(@ForAll @IntRange(min = 0, max = 300) int shots) {
        SampledGun a = new SampledGun();
        SampledGun b = new SampledGun();
        for (int i = 0; i < shots; i++) {
            a.shotFired();
            b.shotFired();
        }
        assertEquals(a.phase(), b.phase(), 0.0);
    }

    @Property
    @Tag("GUN-5")
    void anyWindowOfShotsSamplesBothHalvesOfTheNeighbours(@ForAll @IntRange(min = 0, max = 200) int skip) {
        // Low discrepancy: five shots in a row never all pick from one half of ten neighbours.
        SampledGun gun = new SampledGun();
        for (int i = 0; i < skip; i++) gun.shotFired();
        boolean low = false;
        boolean high = false;
        for (int i = 0; i < 5; i++) {
            if (SampledGun.pick(gun.phase(), 10) < 5) low = true; else high = true;
            gun.shotFired();
        }
        assertTrue(low && high);
    }

    @Property
    @Tag("GUN-5")
    void aClassWithoutRatingsHasNoVerdict(@ForAll boolean light) {
        GunController g = new GunController(GunOpeningTest.FIELD, 1);
        assertEquals(null, g.liveVerdict("x", light));
    }

    @Property
    @Tag("GUN-5")
    void ratingsInOneClassNeverMoveTheOther(@ForAll boolean light, @ForAll @IntRange(min = 1, max = 120) int shots,
                                            @ForAll @DoubleRange(min = 0, max = 1) double score) {
        GunController g = new GunController(GunOpeningTest.FIELD, 1);
        for (int i = 0; i < shots; i++) {
            g.recordVirtualShotForTest("x", GunController.Opening.MAIN, score, light);
            g.recordVirtualShotForTest("x", GunController.Opening.ANTI_SURFER, 1 - score, light);
            g.recordVirtualShotForTest("x", GunController.Opening.SAMPLED, 1.0, light);
        }
        assertEquals(null, g.liveVerdict("x", !light));
        assertFalse(g.ratedShotsForTest("x", !light) > 0);
        assertNotEquals(0, g.ratedShotsForTest("x", light));
    }
}
