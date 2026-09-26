package hadur2.core.replay;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import java.util.List;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Combinators;
import net.jqwik.api.Example;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;

/**
 * The replay fixtures are only as good as the codec: whatever goes in must come back with
 * the same bits, or a replay could pass or fail for the codec's sake (CORE-2).
 */
@Tag("CORE-2")
class LineCodecProperties {

    @Property
    void ordersRoundTrip(@ForAll("anyDouble") double a, @ForAll("anyDouble") double b,
                         @ForAll("anyDouble") double c, @ForAll("anyDouble") double d,
                         @ForAll("anyDouble") double e, @ForAll("anyDouble") double f) {
        BotOrders o = new BotOrders(a, b, c, d, e, f);
        assertEquals(o, LineCodec.decodeOrders(LineCodec.encode(o)));
    }

    @Property
    void inputsRoundTrip(@ForAll("inputs") BotInput in) {
        assertEquals(in, LineCodec.decodeInput(LineCodec.encode(in)));
    }

    @Property
    void namesRoundTrip(@ForAll String name) {
        assertEquals(name, LineCodec.unesc(LineCodec.esc(name)));
    }

    @Example
    void noneOrdersKeepTheirNaNs() {
        assertEquals(BotOrders.NONE, LineCodec.decodeOrders(LineCodec.encode(BotOrders.NONE)));
    }

    @Provide
    Arbitrary<Double> anyDouble() {
        return Arbitraries.oneOf(Arbitraries.doubles(),
            Arbitraries.of(Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY,
                -0.0, 0.0, Double.MIN_VALUE, Double.MAX_VALUE));
    }

    @Provide
    Arbitrary<BotInput> inputs() {
        Arbitrary<Double> d = anyDouble();
        Arbitrary<List<BotEvent>> events = event().list().ofMaxSize(6);
        return Combinators.combine(
                Arbitraries.longs().greaterOrEqual(0), Arbitraries.integers().between(0, 99),
                d.list().ofSize(10), Arbitraries.integers().between(0, 9), events)
            .as((time, round, v, others, ev) -> new BotInput(time, round, v.get(0), v.get(1),
                v.get(2), v.get(3), v.get(4), v.get(5), v.get(6), v.get(7), v.get(8), v.get(9),
                others, ev));
    }

    Arbitrary<BotEvent> event() {
        Arbitrary<Double> d = anyDouble();
        Arbitrary<String> name = Arbitraries.strings().ofMaxLength(20);
        return Arbitraries.oneOf(
            Combinators.combine(name, d, d, d, d, d).as(BotEvent.Scan::new),
            Combinators.combine(name, d, d, d, d).as(BotEvent.HitByBullet::new),
            Combinators.combine(name, d, d).as(BotEvent.BulletHit::new),
            Combinators.combine(d, d, d, d).as(BotEvent.BulletHitBullet::new),
            d.map(BotEvent.BulletMissed::new),
            d.map(BotEvent.HitWall::new),
            Combinators.combine(name, d, d, Arbitraries.of(true, false)).as(BotEvent.HitRobot::new),
            name.map(BotEvent.RobotDeath::new),
            Arbitraries.longs().map(BotEvent.SkippedTurn::new));
    }
}
