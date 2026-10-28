package hadur117.micro.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import robocode.Rules;

class EnergyTest {

    @Property
    @Tag("SAOR-17")
    void powerIsFigmentsByRangeWithNoCap(@ForAll @DoubleRange(min = 0.01, max = 200) double energy,
            @ForAll @DoubleRange(min = 36, max = 1415) double distance) {
        assertEquals(Math.log10(energy) * 325 / distance, Energy.power(energy, distance));
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
