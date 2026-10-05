package hadur2.core.role;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import hadur2.core.model.BotOrders;
import hadur2.core.physics.Rules;
import hadur2.core.world.Roster;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** WEAVE-8: the teammate fence replaces a drive that runs into a living teammate. */
class TeammateFenceTest {

    private final TeammateFence fence = new TeammateFence();

    /** One living teammate at (x, y), heading and velocity as given, known on tick 100. */
    static List<Point2D.Double[]> mate(double x, double y, double heading, double velocity) {
        Roster r = new Roster(List.of("m"), 3);
        r.newRound();
        r.scanned("m", x, y, heading, velocity, 100);
        Roster.Mate m = r.living(100).get(0);
        Point2D.Double[] track = new Point2D.Double[TeammateFence.HORIZON + 1];
        for (int t = 0; t < track.length; t++) track[t] = m.at(100 + t);
        return java.util.Collections.singletonList(track);
    }

    private static BotOrders drive(double ahead) {
        return new BotOrders(0, ahead, Rules.MAX_VELOCITY, 0.3, 0.4, 1.5).send(new byte[] {1, 2, 3});
    }

    @Test
    @Tag("WEAVE-8")
    @DisplayName("WEAVE-8: a drive that runs into a teammate 60 px ahead is replaced by a brake")
    void driveIntoAMateIsBraked() {
        BotOrders given = drive(300);
        BotOrders out = fence.apply(500, 500, 0, 8, given, mate(500, 560, 0, 0));
        assertEquals(0, out.ahead(), 0);
    }

    @Test
    @Tag("WEAVE-8")
    @DisplayName("WEAVE-8: when braking cannot stay clear but reversing can, the drive is reversed")
    void reversalWhenBrakingIsNotEnough() {
        // The teammate comes down the same line at 8 px a tick: standing still is not enough.
        BotOrders out = fence.apply(500, 500, 0, 0, drive(300), mate(500, 590, Math.PI, 8));
        assertEquals(-300, out.ahead(), 0);
    }

    @Test
    @Tag("WEAVE-8")
    @DisplayName("WEAVE-8: a drive that stays clear comes back as the same object")
    void clearDriveIsKept() {
        BotOrders given = drive(300);
        // A teammate wide of the path, and one far ahead.
        assertSame(given, fence.apply(500, 500, 0, 8, given, mate(700, 520, 0, 0)));
        assertSame(given, fence.apply(500, 500, 0, 8, given, mate(500, 900, 0, 0)));
        // A teammate behind, with the robot driving away from it.
        assertSame(given, fence.apply(500, 500, 0, 8, given, mate(500, 470, 0, 0)));
        assertSame(given, fence.apply(500, 500, 0, 8, given, List.of()));
    }

    @Test
    @Tag("WEAVE-8")
    @DisplayName("WEAVE-8: the gun, radar, fire and message orders are kept bit for bit")
    void onlyTheDriveIsReplaced() {
        BotOrders given = drive(300);
        BotOrders out = fence.apply(500, 500, 0, 8, given, mate(500, 560, 0, 0));
        assertEquals(Double.doubleToLongBits(given.gunTurn()), Double.doubleToLongBits(out.gunTurn()));
        assertEquals(Double.doubleToLongBits(given.radarTurn()), Double.doubleToLongBits(out.radarTurn()));
        assertEquals(Double.doubleToLongBits(given.firePower()), Double.doubleToLongBits(out.firePower()));
        assertEquals(1, out.messages().size());
        assertArrayEquals(given.messages().get(0), out.messages().get(0));
    }

    @Test
    @Tag("WEAVE-8")
    @DisplayName("WEAVE-8: two robots driving head on at each other both brake")
    void aHeadOnPairBothBrake() {
        // A at (500, 500) facing north, B at (500, 600) facing south, each at 4 px a tick.
        BotOrders a = fence.apply(500, 500, 0, 4, drive(300), mate(500, 600, Math.PI, 4));
        BotOrders b = fence.apply(500, 600, Math.PI, 4, drive(300), mate(500, 500, 0, 4));
        assertEquals(0, a.ahead(), 0);
        assertEquals(0, b.ahead(), 0);
    }

    @Test
    @Tag("WEAVE-8")
    @DisplayName("WEAVE-8: a robot already close is not fenced for driving away, only for driving closer")
    void closeButLeavingIsAllowed() {
        BotOrders away = drive(-200);
        assertSame(away, fence.apply(500, 500, 0, -4, away, mate(500, 530, 0, 0)));
        BotOrders closer = drive(200);
        assertEquals(0, fence.apply(500, 500, 0, 0, closer, mate(500, 530, 0, 0)).ahead(), 0);
    }

    @Test
    @Tag("WEAVE-8")
    @DisplayName("WEAVE-8: orders that name no distance still keep the robot off the teammate")
    void unsetDriveIsFenced() {
        BotOrders unset = new BotOrders(Double.NaN, Double.NaN, Double.NaN, 0, 0, 0);
        BotOrders out = fence.apply(500, 500, 0, 8, unset, mate(500, 560, 0, 0));
        assertEquals(0, out.ahead(), 0);
    }
}
