package hadur2.core.link;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Combinators;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;

/** LINK-1 and LINK-2 as properties: any report reads back, any damage is refused. */
class LinkCodecProperties {

    @Provide
    Arbitrary<Report> reports() {
        Arbitrary<String> names = Arbitraries.strings().ofMaxLength(40);
        Arbitrary<Double> d = Arbitraries.doubles();
        Arbitrary<Report.Sighting> sighting = Combinators.combine(names, Arbitraries.longs(), d, d, d, d, d)
            .as(Report.Sighting::new);
        Arbitrary<Report.Shot> shot = Combinators.combine(Arbitraries.longs(), d, d, d, d).as(Report.Shot::new);
        return Combinators.combine(Arbitraries.integers().between(0, 65535), Arbitraries.longs(), d, d,
            sighting.list().ofMaxSize(12), names.list().ofMaxSize(12), shot.list().ofMaxSize(4))
            .as((round, tick, x, e, s, deaths, shots) -> new Report(round, tick, x, x, x, e, e, s, deaths, shots));
    }

    @Property(tries = 300)
    @Tag("LINK-1")
    void anyReportRoundTrips(@ForAll("reports") Report r) {
        assertEquals(r, LinkCodec.decode(LinkCodec.encode(r)));
    }

    @Property(tries = 300)
    @Tag("LINK-2")
    void anyDamageIsRefused(@ForAll("reports") Report r, @ForAll int where, @ForAll byte flip) {
        byte[] bytes = LinkCodec.encode(r);
        int i = Math.floorMod(where, bytes.length);
        byte b = (byte) (flip == 0 ? 1 : flip);
        bytes[i] ^= b;
        assertThrows(LinkFormatException.class, () -> LinkCodec.decode(bytes));
    }
}
