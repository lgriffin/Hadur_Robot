package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import hadur2.core.memory.Estimate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/** The distance controller: DIST-1, END-1 and the DIAL-1 margin rule. */
class DistancePolicyTest {

    /** A rate of {@code rate} over {@code n} shots. */
    static Estimate rate(double rate, int n) {
        return Estimate.of(rate * n, n);
    }

    @Test
    @Tag("DIST-1")
    @DisplayName("DIST-1: a certain lead of 5 points or more brings the target in 25 px a wave, not below the floor")
    void closesInOnALead() {
        DistancePolicy d = new DistancePolicy(650);
        Estimate ours = rate(0.40, 100);
        Estimate theirs = rate(0.05, 100);
        assertEquals(DistancePolicy.Step.IN, d.onWave(ours, theirs));
        assertEquals(625, d.controllerTarget());
        for (int i = 0; i < 40; i++) d.onWave(ours, theirs);
        assertEquals(DistancePolicy.FLOOR, d.controllerTarget());
        assertEquals(DistancePolicy.Step.HOLD, d.onWave(ours, theirs), "at the floor it holds");
    }

    @ParameterizedTest(name = "ours {0}, theirs {1}")
    @CsvSource({"0.14,0.10", "0.10,0.10", "0.12,0.09"})
    @Tag("DIST-1")
    @DisplayName("DIST-1: a gap under 5 points holds the target")
    void smallGapHolds(double ours, double theirs) {
        DistancePolicy d = new DistancePolicy(500);
        assertEquals(DistancePolicy.Step.HOLD, d.onWave(rate(ours, 100_000), rate(theirs, 100_000)));
        assertEquals(500, d.controllerTarget());
    }

    @Test
    @Tag("DIAL-1")
    @DisplayName("DIAL-1: a 5-point lead within its margin of error keeps the conservative distance")
    void uncertainLeadHolds() {
        DistancePolicy d = new DistancePolicy(650);
        // 3 hits in 10 against 1 in 10: a 20-point gap, but either could be luck.
        assertEquals(DistancePolicy.Step.HOLD, d.onWave(rate(0.3, 10), rate(0.1, 10)));
        assertEquals(DistancePolicy.Step.HOLD, d.onWave(Estimate.NONE, rate(0.1, 100)));
        assertEquals(650, d.controllerTarget());
    }

    @Test
    @Tag("DIST-1")
    @DisplayName("DIST-1: when they out-hit us by 5 points the target goes back out, not beyond 650")
    void backsOffWhenBehind() {
        DistancePolicy d = new DistancePolicy(400);
        // Going out is the conservative setting: an uncertain deficit is enough.
        assertEquals(DistancePolicy.Step.OUT, d.onWave(rate(0.1, 10), rate(0.3, 10)));
        assertEquals(425, d.controllerTarget());
        for (int i = 0; i < 40; i++) d.onWave(rate(0.05, 100), rate(0.2, 100));
        assertEquals(DistancePolicy.CEILING, d.controllerTarget());
    }

    @Test
    @Tag("END-1")
    @DisplayName("END-1: finishing sets the target to 150 and gives the controller's back after")
    void finishingOverrides() {
        DistancePolicy d = new DistancePolicy(550);
        assertEquals(150, d.target(true));
        assertEquals(550, d.target(false));
        assertEquals(550, d.opening());
    }

    @Test
    @DisplayName("the opening distance must be inside the controller's range")
    void openingInRange() {
        assertEquals(400, DistancePolicy.FLOOR);
        assertThrows(IllegalArgumentException.class, () -> new DistancePolicy(399));
        assertThrows(IllegalArgumentException.class, () -> new DistancePolicy(700));
        assertThrows(IllegalArgumentException.class, () -> new DistancePolicy(Double.NaN));
    }
}
