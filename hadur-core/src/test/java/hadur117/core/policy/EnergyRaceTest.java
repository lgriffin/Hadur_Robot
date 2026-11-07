package hadur117.core.policy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** POW-17: the energy race's power pick. */
class EnergyRaceTest {

    private static EnergyRace race(int ourShots, int ourHits, double ourPower,
                                   int theirShots, int theirHits, double theirPower) {
        EnergyRace r = new EnergyRace();
        for (int k = 0; k < ourShots; k++) r.ours(ourPower, k < ourHits);
        for (int k = 0; k < theirShots; k++) r.theirs(theirPower, k < theirHits);
        return r;
    }

    @Test
    @Tag("POW-17")
    @DisplayName("POW-17: until both sides have enough resolved shots the race does not decide")
    void notReady() {
        EnergyRace r = race(EnergyRace.MIN_SHOTS - 1, 2, 2.0, 30, 3, 2.0);
        assertTrue(Double.isNaN(r.choose(100, 100)));
        r.ours(2.0, false);
        assertTrue(!Double.isNaN(r.choose(100, 100)));
    }

    @Test
    @Tag("POW-17")
    @DisplayName("POW-17: a gun that hits far more than theirs fires heavy")
    void winningGunFiresHeavy() {
        EnergyRace r = race(200, 80, 1.95, 200, 10, 1.95);
        assertTrue(r.choose(100, 100) >= 2.5);
    }

    @Test
    @Tag("POW-17")
    @DisplayName("POW-17: against an equal gun at equal energies, choosing the power is worth at least matching theirs")
    void choosingNeverLosesToMatching() {
        EnergyRace r = race(200, 25, 1.95, 200, 25, 1.95);
        for (double e : new double[] {10, 30, 60, 100}) {
            assertTrue(r.valueAt(e, e) >= -1.0, e + ": " + r.valueAt(e, e));
        }
    }

    @Test
    @Tag("POW-17")
    @DisplayName("POW-17: the pick is always one we can pay for")
    void payable() {
        EnergyRace r = race(100, 30, 2.0, 100, 10, 2.0);
        for (double e = 0.15; e < 5; e += 0.2) {
            double p = r.choose(e, 50);
            assertTrue(Double.isNaN(p) || p < e, "energy " + e + " power " + p);
        }
        assertTrue(Double.isNaN(r.choose(0.1, 50)), "nothing payable at 0.1");
    }

    @Test
    @Tag("POW-17")
    @DisplayName("POW-17: more energy than them is worth more, and the values stay within the round's stakes")
    void values() {
        EnergyRace r = race(100, 15, 2.0, 100, 12, 2.0);
        double ahead = r.valueAt(100, 20);
        double behind = r.valueAt(20, 100);
        assertTrue(ahead > 0 && behind < 0 && ahead > behind);
        for (double eu : EnergyRace.GRID) {
            for (double et : EnergyRace.GRID) {
                double v = r.valueAt(eu, et);
                assertTrue(Math.abs(v) <= EnergyRace.ROUND_SWING + 130, eu + "/" + et + " " + v);
            }
        }
    }
}
