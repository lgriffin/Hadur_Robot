package hadur2.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Combinators;
import net.jqwik.api.Example;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;

/**
 * SHIELD-5: the intercept arithmetic over the input space. The engine moves every bullet
 * once a turn and destroys two bullets whose paths for that turn cross, so a shield bullet
 * fired where {@link ShieldGeometry#solve} says must cross the enemy bullet's path inside the
 * turn the solution names, and so must any bullet fired within the shadow's width.
 */
class ShieldGeometryProperties {

    /** One case: an enemy bullet heading roughly at us, and our bullet's firing time and power. */
    static final class Case {
        final double ox, oy, px, py, heading, enemySpeed, mySpeed;
        final long waveTime, fireTime, lastTurn;

        /** The enemy at (ox, oy) fired at tick 0 at a target {@code distance} px away on {@code angle}, off by {@code headingError}. */
        Case(double ox, double oy, double distance, double angle, double headingError,
             double enemyPower, double myPower, long fireDelay) {
            this.ox = ox;
            this.oy = oy;
            this.px = ox + Math.sin(angle) * distance;
            this.py = oy + Math.cos(angle) * distance;
            this.heading = ShieldGeometry.bearing(ox, oy, px, py) + headingError;
            this.enemySpeed = 20 - 3 * enemyPower;
            this.mySpeed = 20 - 3 * myPower;
            this.waveTime = 0;
            this.fireTime = fireDelay;
            this.lastTurn = ShieldGeometry.lastTurnBeforeContact(ox, oy, waveTime, enemySpeed, px, py);
        }

        ShieldGeometry.Shadow solve() {
            return ShieldGeometry.solve(ox, oy, waveTime, enemySpeed, heading, px, py, fireTime,
                mySpeed, lastTurn);
        }

        @Override
        public String toString() {
            return String.format("enemy (%.1f, %.1f) at %d heading %.4f speed %.2f; us (%.1f, %.1f) "
                + "fire %d speed %.2f last %d", ox, oy, waveTime, heading, enemySpeed, px, py,
                fireTime, mySpeed, lastTurn);
        }
    }

    @Provide
    Arbitrary<Case> cases() {
        return Combinators.combine(
            Arbitraries.doubles().between(0, 800), Arbitraries.doubles().between(0, 600),
            Arbitraries.doubles().between(120, 700), Arbitraries.doubles().between(0, 6.28).ofScale(2),
            Arbitraries.doubles().between(-0.05, 0.05).ofScale(4), Arbitraries.doubles().between(0.1, 3.0),
            Arbitraries.doubles().between(0.1, 3.0), Arbitraries.longs().between(-3, 25))
            .as(Case::new);
    }

    @Provide
    Arbitrary<Double> fractions() {
        return Arbitraries.doubles().between(-0.45, 0.45).ofScale(3);
    }

    /** Where a bullet of {@code speed} fired at {@code time0} from (x, y) along {@code heading} is at the end of turn {@code k}. */
    private static double[] at(double x, double y, double heading, double speed, long time0, long k) {
        double d = speed * (k - time0);
        return new double[] {x + Math.sin(heading) * d, y + Math.cos(heading) * d};
    }

    /** Whether segment P1-P2 crosses segment Q1-Q2, as the engine tests two bullets' paths. */
    static boolean crosses(double[] p1, double[] p2, double[] q1, double[] q2) {
        double rx = p2[0] - p1[0], ry = p2[1] - p1[1];
        double sx = q2[0] - q1[0], sy = q2[1] - q1[1];
        double denom = rx * sy - ry * sx;
        if (Math.abs(denom) < 1e-12) return false;
        double t = ((q1[0] - p1[0]) * sy - (q1[1] - p1[1]) * sx) / denom;
        double u = ((q1[0] - p1[0]) * ry - (q1[1] - p1[1]) * rx) / denom;
        double eps = 1e-6;
        return t >= -eps && t <= 1 + eps && u >= -eps && u <= 1 + eps;
    }

    /** Whether our bullet fired along {@code angle} crosses the enemy's in turn {@code k}. */
    private static boolean meets(Case c, double angle, long k) {
        double[] a = at(c.ox, c.oy, c.heading, c.enemySpeed, c.waveTime, k - 1);
        double[] b = at(c.ox, c.oy, c.heading, c.enemySpeed, c.waveTime, k);
        double[] m1 = at(c.px, c.py, angle, c.mySpeed, c.fireTime, k - 1);
        double[] m2 = at(c.px, c.py, angle, c.mySpeed, c.fireTime, k);
        return crosses(m1, m2, a, b);
    }

    @Property(tries = 2000)
    @Tag("SHIELD-5")
    void aBulletFiredAtTheShadowsMiddleMeetsTheEnemyBulletInTheNamedTurn(@ForAll("cases") Case c) {
        ShieldGeometry.Shadow s = c.solve();
        if (s == null) return;
        assertTrue(s.interceptTurn > c.fireTime && s.interceptTurn > c.waveTime, "meets after both left");
        assertTrue(s.interceptTurn <= c.lastTurn, "meets before the enemy bullet can touch our body");
        assertTrue(s.width > 0, "has room");
        assertTrue(meets(c, s.fireAngle, s.interceptTurn),
            "no crossing in turn " + s.interceptTurn + " at " + s.fireAngle + " for " + c);
    }

    @Property(tries = 2000)
    @Tag("SHIELD-5")
    void anyAngleInsideTheShadowMeetsItToo(@ForAll("cases") Case c, @ForAll("fractions") double fraction) {
        ShieldGeometry.Shadow s = c.solve();
        if (s == null) return;
        // Up to 0.45 of the width either side: inside the shadow with a margin for the arithmetic.
        double angle = s.fireAngle + fraction * s.width;
        assertTrue(meets(c, angle, s.interceptTurn),
            "no crossing at " + fraction + " of the width for " + c);
    }

    @Example
    @Tag("SHIELD-5")
    void someCasesHaveAShadowSoThePropertiesAreNotVacuous() {
        // A mid-field head-on shot of power 1.9, our bullet fired 5 ticks after: a shadow exists.
        Case c = new Case(400, 500, 400, Math.PI, 0.0003, 1.9, 0.5, 5);
        assertNotNull(c.solve());
    }

    @Example
    @Tag("SHIELD-5")
    void aGoodShareOfTheGeneratedCasesHaveAShadow() {
        long withShadow = cases().sampleStream().limit(1000).filter(c -> c.solve() != null).count();
        assertTrue(withShadow > 150, "only " + withShadow + " of 1000 cases had a shadow");
    }

    @Example
    @Tag("SHIELD-5")
    void anEnemyBulletHeadingAwayFromUsCannotBeMet() {
        // Fired from 300 px north of us, heading north, away from us.
        ShieldGeometry.Shadow s = ShieldGeometry.solve(400, 400, 0, 14.15, 0, 400, 100, 1, 19.7, 100);
        assertNull(s);
    }

    @Example
    @Tag("SHIELD-5")
    void aHeadOnShotFromTheSameLineIsMetOnlyByASteppedAsidePlan() {
        // Enemy 400 px north, bullet head-on at us (heading south, pi). Our bullet fired from where
        // we stand runs along its line, so the paths are collinear: no crossing is reported.
        double heading = Math.PI;
        long last = ShieldGeometry.lastTurnBeforeContact(400, 500, 0, 14.15, 400, 100);
        assertNull(ShieldGeometry.solve(400, 500, 0, 14.15, heading, 400, 100, 5, 19.7, last),
            "collinear paths never cross");
        ShieldGeometry.Shadow stepped =
            ShieldGeometry.solve(400, 500, 0, 14.15, heading, 400.1, 100, 5, 19.7, last);
        assertNotNull(stepped, "0.1 px aside gives a shadow");
        assertEquals(0, hadur2.core.physics.Angles.normalRelativeAngle(stepped.fireAngle), 0.01, "still aimed at the enemy, 400 px north");
    }

    @Example
    @Tag("SHIELD-5")
    void lastTurnBeforeContactIsTheTurnBeforeTheBulletCanTouchTheBody() {
        long last = ShieldGeometry.lastTurnBeforeContact(0, 300, 10, 14.15, 0, 0);
        double reach = 300 - ShieldGeometry.BODY_HALF_DIAGONAL;
        assertEquals(10 + (long) Math.ceil(reach / 14.15) - 1, last);
        assertTrue(14.15 * (last + 1 - 10) >= reach, "the next turn it can touch");
        assertTrue(14.15 * (last - 10) < reach, "this turn it cannot");
    }
}
