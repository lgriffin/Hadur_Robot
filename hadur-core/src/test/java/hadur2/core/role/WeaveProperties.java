package hadur2.core.role;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur2.core.model.BotOrders;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;

/**
 * WEAVE-2 as a property: a fence only replaces a drive. Whatever the driving role ordered and
 * wherever Hadur stands, the sentry fence's orders keep the gun turn, the radar turn and the
 * fire order exactly as the role gave them (a NaN stays NaN).
 */
class WeaveProperties {

    static final double SIZE = 1000;

    @Provide
    Arbitrary<BotOrders> orders() {
        Arbitrary<Double> turn = Arbitraries.doubles().between(-3.14, 3.14).injectNull(0.1)
            .map(d -> d == null ? Double.NaN : d);
        Arbitrary<Double> ahead = Arbitraries.doubles().between(-600, 600).injectNull(0.1)
            .map(d -> d == null ? Double.NaN : d);
        Arbitrary<Double> radar = Arbitraries.doubles().between(-7, 7).injectNull(0.1)
            .map(d -> d == null ? Double.POSITIVE_INFINITY : d);
        Arbitrary<Double> fire = Arbitraries.of(0.0, 0.1, 1.0, 1.9, 3.0);
        return net.jqwik.api.Combinators.combine(turn, ahead, turn, radar, fire)
            .as((t, a, g, r, f) -> new BotOrders(t, a, 8, g, r, f));
    }

    @Property(tries = 2000)
    @Tag("WEAVE-2")
    void fenceNeverTouchesGunRadarOrFire(@ForAll("orders") BotOrders drive,
                                         @ForAll @DoubleRange(min = 18, max = 982) double x,
                                         @ForAll @DoubleRange(min = 18, max = 982) double y,
                                         @ForAll @DoubleRange(min = -3.2, max = 3.2) double heading,
                                         @ForAll @DoubleRange(min = -8, max = 8) double velocity,
                                         @ForAll @DoubleRange(min = 0, max = 200) double border) {
        BotOrders fenced = new SentryFence(SIZE, SIZE).apply(x, y, heading, velocity, drive, border);
        assertEquals(drive.gunTurn(), fenced.gunTurn());
        assertEquals(drive.radarTurn(), fenced.radarTurn());
        assertEquals(drive.firePower(), fenced.firePower());
    }
}
