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

    @Property
    @Tag("GATE-3")
    void sentryInputsRoundTrip(@ForAll("inputs") BotInput in,
                               @ForAll("sentries") int sentries, @ForAll("anyDouble") double border) {
        BotInput withSentries = new BotInput(in.time(), in.round(), in.x(), in.y(), in.heading(),
            in.velocity(), in.energy(), in.gunHeat(), in.gunCoolingRate(), in.gunHeading(),
            in.gunTurnRemaining(), in.radarHeading(), in.others(), in.events(), sentries, border);
        assertEquals(withSentries, LineCodec.decodeInput(LineCodec.encode(withSentries)));
    }

    @Example
    @Tag("GATE-3")
    void linesWithoutSentriesReadAsBefore() {
        // The fixtures recorded before M1 have 15 fields and no sentry flags.
        String old = "I,3,0,1.0,2.0,0.0,0.0,100.0,0.0,0.1,0.0,0.0,0.0,1,S:a:0.5:300.0:100.0:0.0:8.0";
        BotInput in = LineCodec.decodeInput(old);
        assertEquals(0, in.numSentries());
        assertEquals(0.0, in.sentryBorderSize());
        assertEquals(false, ((BotEvent.Scan) in.events().get(0)).sentry());
        assertEquals(old, LineCodec.encode(in));
        BotEvent.Scan sentry = new BotEvent.Scan("s", 0, 1, 2, 3, 4, true);
        assertEquals(sentry, LineCodec.decodeEvent(LineCodec.encode(sentry)));
    }

    @Property
    @Tag("LINK-1")
    void messagesRoundTrip(@ForAll("bytes") List<byte[]> messages, @ForAll("bytes") List<byte[]> received) {
        BotOrders o = new BotOrders(1, 2, 8, 0.5, Double.POSITIVE_INFINITY, 1.5, messages);
        assertEquals(o, LineCodec.decodeOrders(LineCodec.encode(o)));
        for (byte[] r : received) {
            BotEvent m = new BotEvent.Message("team.Mate (2)", r);
            assertEquals(m, LineCodec.decodeEvent(LineCodec.encode(m)));
        }
    }

    @Provide
    Arbitrary<List<byte[]>> bytes() {
        return Arbitraries.bytes().array(byte[].class).ofMaxSize(300).list().ofMaxSize(4);
    }

    @Example
    @Tag("LINK-1")
    void linesWithoutMessagesOrOwnersReadAsBefore() {
        // Lines written before A4: an O line of 7 fields, an X event without its owner.
        String old = "O,0.1,NaN,8.0,NaN,Infinity,0.0";
        assertEquals(old, LineCodec.encode(LineCodec.decodeOrders(old)));
        assertEquals(0, LineCodec.decodeOrders(old).messages().size());
        BotEvent.BulletHitBullet x = (BotEvent.BulletHitBullet) LineCodec.decodeEvent("X:1.0:2.0:3.0:1.5:0.5");
        assertEquals(null, x.owner());
        assertEquals("X:1.0:2.0:3.0:1.5:0.5", LineCodec.encode(x));
        BotEvent.BulletHitBullet owned = new BotEvent.BulletHitBullet(1, 2, 3, 1.5, Double.NaN, "a,b:c");
        assertEquals(owned, LineCodec.decodeEvent(LineCodec.encode(owned)));
    }

    @Provide
    Arbitrary<Integer> sentries() {
        return Arbitraries.integers().between(0, 3);
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
            // M1: a scan's sentry flag.
            Combinators.combine(name, d, d, d, d, d).as((n, b, di, en, h, v) ->
                new BotEvent.Scan(n, b, di, en, h, v, true)),
            Combinators.combine(name, d, d, d, d).as(BotEvent.HitByBullet::new),
            Combinators.combine(name, d, d).as(BotEvent.BulletHit::new),
            Combinators.combine(d, d, d, d).as(BotEvent.BulletHitBullet::new),
            d.map(BotEvent.BulletMissed::new),
            d.map(BotEvent.HitWall::new),
            Combinators.combine(name, d, d, Arbitraries.of(true, false)).as(BotEvent.HitRobot::new),
            name.map(BotEvent.RobotDeath::new),
            Arbitraries.longs().map(BotEvent.SkippedTurn::new),
            // S6: our bullet's heading on the bullet events, and the tick time (MOVE-1, TIME-1).
            Combinators.combine(name, d, d, d).as(BotEvent.BulletHit::new),
            Combinators.combine(d, d, d, d, d).as(BotEvent.BulletHitBullet::new),
            Combinators.combine(d, d).as(BotEvent.BulletMissed::new),
            Combinators.combine(Arbitraries.longs(), Arbitraries.longs()).as(BotEvent.TickTime::new));
    }
}
