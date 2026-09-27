package hadur2.core.shield;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.jqwik.api.Example;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;

/**
 * SHIELD-2 over the input space: every offset stays on a still target's body and off the
 * head-on line, holds until a shot goes out, and follows the same sequence in every core.
 */
class AimJitterProperties {

    private static double halfWidth(double distance) {
        return Math.atan(18 / distance);
    }

    private static AimJitter after(int shots) {
        AimJitter j = new AimJitter();
        for (int i = 0; i < shots; i++) j.shotFired();
        return j;
    }

    @Property
    @Tag("SHIELD-2")
    void offsetIsBetweenFifteenAndFiftyPercentOfTheHalfWidth(
            @ForAll @DoubleRange(min = 36, max = 1300) double distance,
            @ForAll @IntRange(min = 0, max = 2000) int shots) {
        double off = Math.abs(after(shots).offset(distance)) / halfWidth(distance);
        assertTrue(off >= 0.15 - 1e-12 && off <= 0.5 + 1e-12, "fraction " + off);
    }

    @Property
    @Tag("SHIELD-2")
    void offsetHoldsUntilAShotGoesOut(
            @ForAll @DoubleRange(min = 36, max = 1300) double distance,
            @ForAll @IntRange(min = 0, max = 500) int shots) {
        AimJitter j = after(shots);
        double first = j.offset(distance);
        assertEquals(first, j.offset(distance), "asking again changes nothing");
        j.shotFired();
        assertNotEquals(first, j.offset(distance), "the next shot gets a new offset");
    }

    @Property
    @Tag("SHIELD-2")
    void sameShotsGiveTheSameOffset(
            @ForAll @DoubleRange(min = 36, max = 1300) double distance,
            @ForAll @IntRange(min = 0, max = 500) int shots) {
        assertEquals(after(shots).offset(distance), after(shots).offset(distance));
    }

    @Example
    @Tag("SHIELD-2")
    void offsetsHaveNoBiasToLearn() {
        // A shielder that learns a mean offset (Saguaro does) must learn nothing useful.
        AimJitter j = new AimJitter();
        double sum = 0;
        int left = 0;
        for (int i = 0; i < 1000; i++) {
            double f = j.offset(400) / halfWidth(400);
            sum += f;
            if (f < 0) left++;
            j.shotFired();
        }
        assertTrue(Math.abs(sum / 1000) < 0.01, "mean fraction " + sum / 1000);
        assertTrue(left > 450 && left < 550, left + " of 1000 to the left");
    }
}
