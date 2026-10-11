package hadurling.core.replay;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import java.util.List;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Combinators;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;

/**
 * Round trips: whatever we write, we read back equal. The generators are the interesting part:
 * they include NaN, infinities, negative zero and names full of separators, which is exactly
 * what a hand-written example would forget.
 */
@Tag("HL-8")
class LineCodecProperties {

    /** Mostly ordinary numbers, but also the awkward ones. */
    @Provide
    Arbitrary<Double> doubles() {
        return Arbitraries.oneOf(
            Arbitraries.doubles().between(-1e6, 1e6),
            Arbitraries.of(Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, 0.0, -0.0));
    }

    /** Names that contain every character the codec must escape. */
    @Provide
    Arbitrary<String> names() {
        return Arbitraries.strings().withChars("abcXYZ019 .()-%,;:\n").ofMinLength(1).ofMaxLength(12);
    }

    @Provide
    Arbitrary<Event> events() {
        Arbitrary<Event> scan = Combinators.combine(names(), doubles(), doubles(), doubles(), doubles(), doubles())
            .as(Event.Scan::new);
        Arbitrary<Event> hitBy = Combinators.combine(names(), doubles()).as(Event.HitByBullet::new);
        Arbitrary<Event> bulletHit = Combinators.combine(names(), doubles()).as(Event.BulletHit::new);
        Arbitrary<Event> wall = doubles().map(Event.HitWall::new);
        Arbitrary<Event> death = names().map(Event.RobotDeath::new);
        return Arbitraries.oneOf(scan, hitBy, bulletHit, wall, death);
    }

    @Provide
    Arbitrary<Input> inputs() {
        return Combinators.combine(
                Arbitraries.longs().between(0, 100_000),
                doubles().list().ofSize(8),
                events().list().ofMaxSize(4))
            .as((t, d, ev) -> new Input(t, d.get(0), d.get(1), d.get(2), d.get(3), d.get(4),
                d.get(5), d.get(6), d.get(7), ev));
    }

    @Provide
    Arbitrary<Orders> orders() {
        return Combinators.combine(doubles(), doubles(), doubles(), doubles(), doubles())
            .as((a, b, c, d, e) -> Orders.builder().bodyTurn(a).ahead(b).gunTurn(c).radarTurn(d).fire(e).build());
    }

    @Property
    void inputRoundTrips(@ForAll("inputs") Input in) {
        assertEquals(in, LineCodec.decodeInput(LineCodec.encode(in)));
    }

    @Property
    void ordersRoundTrip(@ForAll("orders") Orders o) {
        assertEquals(o, LineCodec.decodeOrders(LineCodec.encode(o)));
    }

    @Property
    void namesRoundTrip(@ForAll("names") String name) {
        assertEquals(name, LineCodec.unescape(LineCodec.escape(name)));
    }

    @Property
    void anEncodedLineIsOneLine(@ForAll("inputs") Input in) {
        String line = LineCodec.encode(in);
        assertEquals(List.of(line), List.of(line.split("\\R")));
    }
}
