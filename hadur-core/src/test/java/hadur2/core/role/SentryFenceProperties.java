package hadur2.core.role;

import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BotOrders;
import hadur2.core.physics.Rules;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import java.util.List;

/**
 * GATE-3 as a property: whatever the duel orders, a robot that starts clear of the border
 * zone and obeys the fence each tick never enters the zone. The robot is moved with the
 * engine's rules: turn, then accelerate (1) or brake (2), then move.
 */
class SentryFenceProperties {

    static final double BORDER = 100;
    static final double SIZE = 1000;

    @Provide
    Arbitrary<List<BotOrders>> orders() {
        Arbitrary<BotOrders> one = Arbitraries.doubles().between(-3.14, 3.14)
            .flatMap(turn -> Arbitraries.doubles().between(-600, 600)
                .map(ahead -> new BotOrders(turn, ahead, Rules.MAX_VELOCITY, 0, 0, 0)));
        return one.list().ofSize(300);
    }

    @Property(tries = 300)
    @Tag("GATE-3")
    void fencedRobotNeverEntersTheZone(@ForAll("orders") List<BotOrders> duelOrders,
                                       @ForAll @DoubleRange(min = 160, max = 840) double x0,
                                       @ForAll @DoubleRange(min = 160, max = 840) double y0,
                                       @ForAll @DoubleRange(min = -3.2, max = 3.2) double h0) {
        SentryFence fence = new SentryFence(SIZE, SIZE);
        double x = x0, y = y0, heading = h0, v = 0;
        double turnLeft = 0, distLeft = 0, maxV = 8;
        for (BotOrders duel : duelOrders) {
            BotOrders o = fence.apply(x, y, heading, v, duel, BORDER);
            turnLeft = o.bodyTurn();
            distLeft = o.ahead();
            maxV = o.maxVelocity();
            double rate = Rules.getTurnRateRadians(Math.abs(v));
            double turn = Math.max(-rate, Math.min(rate, turnLeft));
            heading += turn;
            v = SentryFence.nextVelocity(v, distLeft, maxV);
            x += Math.sin(heading) * v;
            y += Math.cos(heading) * v;
            assertTrue(x > BORDER + 18 && x < SIZE - BORDER - 18
                && y > BORDER + 18 && y < SIZE - BORDER - 18,
                "entered the zone at " + x + ", " + y);
        }
    }
}
