package hadurling.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.DoubleRange;
import robocode.util.Utils;

/**
 * Our angle helpers must equal the engine's for every input, not just the ones we thought
 * of. jqwik generates thousands of angles (and edge cases such as 0 and PI) per property.
 */
class AnglesMatchEngineProperties {

    @Property
    void relativeAngleMatchesEngine(@ForAll @DoubleRange(min = -100, max = 100) double angle) {
        assertEquals(Utils.normalRelativeAngle(angle), Angles.normalRelativeAngle(angle), 0.0);
    }

    @Property
    void absoluteAngleMatchesEngine(@ForAll @DoubleRange(min = -100, max = 100) double angle) {
        assertEquals(Utils.normalAbsoluteAngle(angle), Angles.normalAbsoluteAngle(angle), 0.0);
    }

    @Property
    void bulletSpeedMatchesEngine(@ForAll @DoubleRange(min = 0.1, max = 3.0) double power) {
        assertEquals(robocode.Rules.getBulletSpeed(power), Rules.bulletSpeed(power), 1e-12);
    }

    @Property
    void bulletDamageMatchesEngine(@ForAll @DoubleRange(min = 0.1, max = 3.0) double power) {
        assertEquals(robocode.Rules.getBulletDamage(power), Rules.bulletDamage(power), 1e-12);
    }
}
