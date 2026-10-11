package hadur2.core.role;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BotOrders;
import hadur2.core.physics.Rules;
import hadur2.core.world.Roster;
import java.awt.geom.Point2D;
import java.util.List;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;

/**
 * WEAVE-8 and WEAVE-2 as properties: whatever the driving role orders, the fence keeps every
 * order but the drive bit for bit, hands back orders that stay clear as they are, and a robot
 * that obeys it never drives into a teammate standing still.
 */
class TeammateFenceProperties {

    static List<Point2D.Double[]> mate(double x, double y, double heading, double velocity) {
        Roster r = new Roster(List.of("m"), 3);
        r.newRound();
        r.scanned("m", x, y, heading, velocity, 100);
        Roster.Mate m = r.living(100).get(0);
        Point2D.Double[] track = new Point2D.Double[TeammateFence.HORIZON + 1];
        for (int t = 0; t < track.length; t++) track[t] = m.at(100 + t);
        return java.util.Collections.singletonList(track);
    }

    @Provide
    Arbitrary<List<BotOrders>> orders() {
        Arbitrary<BotOrders> one = Arbitraries.doubles().between(-3.14, 3.14)
            .flatMap(turn -> Arbitraries.doubles().between(-600, 600)
                .map(ahead -> new BotOrders(turn, ahead, Rules.MAX_VELOCITY, 0, 0, 0)));
        return one.list().ofSize(120);
    }

    @Property(tries = 500)
    @Tag("WEAVE-8")
    void everyOrderButTheDriveIsKept(@ForAll @DoubleRange(min = -3.14, max = 3.14) double turn,
                                     @ForAll @DoubleRange(min = -600, max = 600) double ahead,
                                     @ForAll @DoubleRange(min = -3, max = 3) double gun,
                                     @ForAll @DoubleRange(min = -3, max = 3) double radar,
                                     @ForAll @DoubleRange(min = 0, max = 3) double fire,
                                     @ForAll @DoubleRange(min = -8, max = 8) double v,
                                     @ForAll @DoubleRange(min = 450, max = 560) double mateY,
                                     @ForAll @DoubleRange(min = 470, max = 530) double mateX,
                                     @ForAll @DoubleRange(min = -3.14, max = 3.14) double mateHeading,
                                     @ForAll @DoubleRange(min = -8, max = 8) double mateV) {
        BotOrders given = new BotOrders(turn, ahead, Rules.MAX_VELOCITY, gun, radar, fire)
            .send(new byte[] {9, 8, 7});
        BotOrders out = new TeammateFence().apply(500, 500, 0, v, given, mate(mateX, mateY, mateHeading, mateV));
        assertEquals(Double.doubleToLongBits(gun), Double.doubleToLongBits(out.gunTurn()));
        assertEquals(Double.doubleToLongBits(radar), Double.doubleToLongBits(out.radarTurn()));
        assertEquals(Double.doubleToLongBits(fire), Double.doubleToLongBits(out.firePower()));
        assertEquals(given.messages().size(), out.messages().size());
        assertTrue(java.util.Arrays.equals(given.messages().get(0), out.messages().get(0)));
    }

    @Property(tries = 300)
    @Tag("WEAVE-8")
    void farTeammateLeavesTheOrdersAlone(@ForAll @DoubleRange(min = -3.14, max = 3.14) double turn,
                                         @ForAll @DoubleRange(min = -600, max = 600) double ahead,
                                         @ForAll @DoubleRange(min = -8, max = 8) double v) {
        BotOrders given = new BotOrders(turn, ahead, Rules.MAX_VELOCITY, 0, 0, 0);
        // 600 px off a robot that cannot cover more than 48 px in the horizon.
        assertSame(given, new TeammateFence().apply(500, 500, 0, v, given, mate(500, 1100, 0, 0)));
    }

    @Property(tries = 200)
    @Tag("WEAVE-8")
    void fencedRobotNeverReachesAStandingTeammate(@ForAll("orders") List<BotOrders> duelOrders,
                                                  @ForAll @DoubleRange(min = 150, max = 300) double gap,
                                                  @ForAll @DoubleRange(min = -3.14, max = 3.14) double bearing,
                                                  @ForAll @DoubleRange(min = -3.2, max = 3.2) double h0) {
        TeammateFence fence = new TeammateFence();
        double mx = 600 + Math.sin(bearing) * gap, my = 600 + Math.cos(bearing) * gap;
        List<Point2D.Double[]> mates = mate(mx, my, 0, 0);
        double x = 600, y = 600, heading = h0, v = 0;
        for (BotOrders duel : duelOrders) {
            BotOrders o = fence.apply(x, y, heading, v, duel, mates);
            double rate = Rules.getTurnRateRadians(Math.abs(v));
            heading += Math.max(-rate, Math.min(rate, o.bodyTurn()));
            v = SentryFence.nextVelocity(v, o.ahead(), o.maxVelocity());
            x += Math.sin(heading) * v;
            y += Math.cos(heading) * v;
            assertTrue(Math.hypot(x - mx, y - my) >= 36, "ran into the teammate at " + x + ", " + y);
        }
    }
}
