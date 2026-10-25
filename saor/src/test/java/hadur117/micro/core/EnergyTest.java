package hadur117.micro.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;
import robocode.Rules;

class EnergyTest {

    @Property
    @Tag("SAOR-8")
    void belowThreeOpponentsPowerNeverExceeds1point9(@ForAll @DoubleRange(min = 0.01, max = 200) double energy,
            @ForAll @DoubleRange(min = 36, max = 1415) double distance, @ForAll @IntRange(min = 1, max = 2) int others) {
        assertTrue(Energy.power(energy, distance, others) <= Energy.END_GAME_POWER);
    }

    @Property
    @Tag("SAOR-8")
    void withThreeOrMorePowerIsFigmentsByRange(@ForAll @DoubleRange(min = 0.01, max = 200) double energy,
            @ForAll @DoubleRange(min = 36, max = 1415) double distance, @ForAll @IntRange(min = 3, max = 9) int others) {
        double figment = Math.log10(energy) * 325 / distance;
        double p = Energy.power(energy, distance, others);
        assertEquals(Math.min(figment, others / 3 + 1.9), p);
        assertTrue(p >= Math.min(figment, 2.9), "the cap is 2.9 at three to five opponents");
    }

    @Property
    @Tag("SAOR-10")
    void theGunFiresOnlyOnceItHasTurned(@ForAll double gunTurnRemaining) {
        assertEquals(gunTurnRemaining == 0, Energy.fire(gunTurnRemaining));
    }

    @Property
    void bulletSpeedIsTheEngines(@ForAll @DoubleRange(min = -5, max = 10) double power) {
        assertEquals(Rules.getBulletSpeed(power), Energy.bulletSpeed(power));
    }
}
