package hadur117.micro.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;

class MovementTest {

    @Property
    @Tag("SAOR-1")
    void everyLegEndsWithinTwentyFivePxOfAnEdge(@ForAll @IntRange(min = 0, max = 1) int axis,
            @ForAll @DoubleRange(min = 0, max = 1415) double targetDistance,
            @ForAll @DoubleRange(min = 18, max = 982) double myX, @ForAll @DoubleRange(min = 18, max = 982) double myY) {
        int leg = Movement.leg(targetDistance);
        int x = Movement.coordinate(axis > 0, leg, myX);
        int y = Movement.coordinate(axis <= 0, leg, myY);
        int edge = Math.min(Math.min(x, y), Math.min(Movement.FIELD - x, Movement.FIELD - y));
        assertEquals(Movement.WALL, edge, "point (" + x + ", " + y + ")");
        // In the robot's own quadrant, so the shuttle stays in its nearest corner, unless the
        // target is over 1,112 px off and the leg runs past the middle.
        if (leg < 500) {
            assertEquals(myX > 500, x > 500);
            assertEquals(myY > 500, y > 500);
        }
    }

    @Property
    @Tag("SAOR-1")
    void theAxisFlipsOnlyWhenALegIsDone(@ForAll @IntRange(min = 0, max = 1) int axis, @ForAll double distanceRemaining) {
        assertEquals(distanceRemaining == 0 ? 1 - axis : axis, Movement.axis(axis, distanceRemaining));
    }

    @Property
    @Tag("SAOR-1")
    void theLegGrowsWithTheTargetsDistance(@ForAll @DoubleRange(min = 0, max = 1415) double d) {
        assertEquals(55 + (int) (d / 2.5), Movement.leg(d));
        assertTrue(Movement.leg(d) >= 55 && Movement.leg(d) < 1000 - Movement.WALL);
    }

    @Property
    @Tag("SAOR-1")
    void theOrdersHeadForThePointForwardsOrBackwards(@ForAll @DoubleRange(min = 18, max = 982) double myX,
            @ForAll @DoubleRange(min = 18, max = 982) double myY, @ForAll @DoubleRange(min = 0, max = 6.28) double heading,
            @ForAll @IntRange(min = 25, max = 975) int x, @ForAll @IntRange(min = 25, max = 975) int y) {
        double turn = Movement.turn(x, y, myX, myY, heading);
        double ahead = Movement.ahead(turn, x, y, myX, myY);
        double off = robocode.util.Utils.normalRelativeAngle(turn);
        // Forwards when the point is in front, backwards when it is behind.
        assertEquals(Math.abs(off) < Math.PI / 2, ahead > 0 || Math.hypot(x - myX, y - myY) < 1e-9);
        assertEquals(Math.hypot(x - myX, y - myY) * Math.abs(Math.cos(turn)), Math.abs(ahead), 1e-9);
        // The body turns toward the line through the point, never more than a quarter turn away.
        double facing = Math.abs(off) < Math.PI / 2 ? off : robocode.util.Utils.normalRelativeAngle(off + Math.PI);
        double bodyTurn = Movement.bodyTurn(turn);
        if (Math.abs(facing) > 1e-9) assertEquals(Math.signum(facing), Math.signum(bodyTurn));
    }
}
