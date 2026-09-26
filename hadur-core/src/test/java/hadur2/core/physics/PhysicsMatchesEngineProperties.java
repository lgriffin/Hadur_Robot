package hadur2.core.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import net.jqwik.api.Example;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;

/**
 * CORE-1 moved the core off {@code robocode.util.Utils} and {@code robocode.Rules}. These
 * properties check the core's own {@link Angles} and {@link Rules} give the engine's answers
 * bit for bit, so dropping the import changed nothing (the engine API is a test-only
 * dependency of hadur-core).
 */
@Tag("CORE-1")
class PhysicsMatchesEngineProperties {

    @Property(tries = 5000)
    void normalAbsoluteAngleMatchesEngine(@ForAll @DoubleRange(min = -1e4, max = 1e4) double a) {
        assertEquals(robocode.util.Utils.normalAbsoluteAngle(a), Angles.normalAbsoluteAngle(a));
    }

    @Property(tries = 5000)
    void normalRelativeAngleMatchesEngine(@ForAll @DoubleRange(min = -1e4, max = 1e4) double a) {
        assertEquals(robocode.util.Utils.normalRelativeAngle(a), Angles.normalRelativeAngle(a));
    }

    @Example
    void anglesMatchEngineAtEdges() {
        for (double a : new double[] {0, -0.0, Math.PI, -Math.PI, 2 * Math.PI, -2 * Math.PI,
                Double.MIN_VALUE, -Double.MIN_VALUE, Math.nextUp(Math.PI), Math.nextDown(-Math.PI),
                Double.POSITIVE_INFINITY, Double.NaN}) {
            assertEquals(robocode.util.Utils.normalAbsoluteAngle(a), Angles.normalAbsoluteAngle(a));
            assertEquals(robocode.util.Utils.normalRelativeAngle(a), Angles.normalRelativeAngle(a));
        }
    }

    @Property
    void velocityRulesMatchEngine(@ForAll @DoubleRange(min = -8, max = 8) double v) {
        assertEquals(robocode.Rules.getTurnRate(v), Rules.getTurnRate(v));
        assertEquals(robocode.Rules.getTurnRateRadians(v), Rules.getTurnRateRadians(v));
        assertEquals(robocode.Rules.getWallHitDamage(v), Rules.getWallHitDamage(v));
    }

    @Property
    void bulletRulesMatchEngine(@ForAll @DoubleRange(min = -1, max = 5) double power) {
        assertEquals(robocode.Rules.getBulletSpeed(power), Rules.getBulletSpeed(power));
        assertEquals(robocode.Rules.getBulletDamage(power), Rules.getBulletDamage(power));
        assertEquals(robocode.Rules.getBulletHitBonus(power), Rules.getBulletHitBonus(power));
        assertEquals(robocode.Rules.getGunHeat(power), Rules.getGunHeat(power));
    }

    @Example
    void constantsMatchEngine() {
        assertEquals(robocode.Rules.ACCELERATION, Rules.ACCELERATION);
        assertEquals(robocode.Rules.DECELERATION, Rules.DECELERATION);
        assertEquals(robocode.Rules.MAX_VELOCITY, Rules.MAX_VELOCITY);
        assertEquals(robocode.Rules.MAX_TURN_RATE, Rules.MAX_TURN_RATE);
        assertEquals(robocode.Rules.GUN_TURN_RATE, Rules.GUN_TURN_RATE);
        assertEquals(robocode.Rules.RADAR_TURN_RATE, Rules.RADAR_TURN_RATE);
        assertEquals(robocode.Rules.MIN_BULLET_POWER, Rules.MIN_BULLET_POWER);
        assertEquals(robocode.Rules.MAX_BULLET_POWER, Rules.MAX_BULLET_POWER);
        assertEquals(robocode.Rules.ROBOT_HIT_DAMAGE, Rules.ROBOT_HIT_DAMAGE);
    }
}
