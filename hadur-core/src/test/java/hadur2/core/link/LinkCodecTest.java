package hadur2.core.link;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** LINK-1 and LINK-2: the team report's byte format. */
public class LinkCodecTest {

    public static Report sample() {
        return new Report(3, 1234, 100.5, 200.25, 1.0, -8, 87.5,
            List.of(new Report.Sighting("sample.Walls", 1233, 50, 60, 0.5, 8, 99.9),
                new Report.Sighting("Hadur (2)", 1234, 700, 650, -1, 0, Double.NaN)),
            List.of("sample.Crazy", "sample.Fire"),
            List.of(new Report.Shot(1234, 100.5, 200.25, 2.5, 1.9)));
    }

    @Test
    @Tag("LINK-1")
    @DisplayName("LINK-1: a report reads back exactly, NaN included")
    void roundTrip() {
        Report r = sample();
        byte[] bytes = LinkCodec.encode(r);
        assertEquals(r, LinkCodec.decode(bytes));
        assertEquals('H', bytes[0]);
        assertEquals(LinkCodec.VERSION, bytes[2]);
    }

    @Test
    @Tag("MMOVE-10")
    @DisplayName("MMOVE-10: a report with dodges reads back exactly as version 2; one without is still version 1, byte for byte")
    void dodgesRoundTrip() {
        Report plain = sample();
        Report r = new Report(plain.round(), plain.tick(), plain.x(), plain.y(), plain.heading(), plain.velocity(),
            plain.energy(), plain.sightings(), plain.deaths(), plain.shots(),
            List.of(new Report.Dodge("sample.Fire", 0.5, 0.75, -0.25, 1.0, 0.42),
                new Report.Dodge("abc.Shadow 3.83 (2)", 1.1, 0, 0.1, 0.3, -1.2)));
        byte[] bytes = LinkCodec.encode(r);
        assertEquals(LinkCodec.VERSION_DODGES, bytes[2]);
        assertEquals(r, LinkCodec.decode(bytes));
        byte[] old = LinkCodec.encode(plain);
        assertEquals(LinkCodec.VERSION, old[2]);
        // The plain report's bytes are the v1 body: the dodged report's start the same way.
        for (int i = 3; i < old.length - 4; i++) assertEquals(old[i], bytes[i], "byte " + i);
    }

    @Test
    @Tag("TMODE-19")
    @DisplayName("TMODE-19: a report with an aim reads back exactly as version 3, dodges or none; one without is unchanged")
    void aimRoundTrip() {
        Report plain = sample();
        Report r = new Report(plain.round(), plain.tick(), plain.x(), plain.y(), plain.heading(), plain.velocity(),
            plain.energy(), plain.sightings(), plain.deaths(), plain.shots(), List.of(), new Report.Aim(1.25, 0.4));
        byte[] bytes = LinkCodec.encode(r);
        assertEquals(LinkCodec.VERSION_AIM, bytes[2]);
        assertEquals(r, LinkCodec.decode(bytes));
        Report both = new Report(plain.round(), plain.tick(), plain.x(), plain.y(), plain.heading(), plain.velocity(),
            plain.energy(), plain.sightings(), plain.deaths(), plain.shots(),
            List.of(new Report.Dodge("sample.Fire", 0.5, 0.75, -0.25, 1.0, 0.42)), new Report.Aim(0, 0));
        assertEquals(both, LinkCodec.decode(LinkCodec.encode(both)));
        assertEquals(LinkCodec.VERSION, LinkCodec.encode(plain)[2]);
        assertEquals(null, LinkCodec.decode(LinkCodec.encode(plain)).aim());
    }

    @Test
    @Tag("LINK-1")
    @DisplayName("LINK-1: a report's round is what the wire's 16 bits carry, 0 to 65535, and no more")
    void roundFitsTheWire() {
        for (int round : new int[] {0, Report.MAX_ROUND}) {
            Report r = new Report(round, 1, 0, 0, 0, 0, 100, List.of(), List.of(), List.of());
            assertEquals(round, LinkCodec.decode(LinkCodec.encode(r)).round());
        }
        for (int round : new int[] {-1, Report.MAX_ROUND + 1}) {
            assertThrows(IllegalArgumentException.class,
                () -> new Report(round, 1, 0, 0, 0, 0, 100, List.of(), List.of(), List.of()));
        }
    }

    @Test
    @Tag("LINK-2")
    @DisplayName("LINK-2: an unknown version, a cut message, a long one and stray bytes are all refused")
    void refusesWhatItCannotRead() {
        byte[] good = LinkCodec.encode(sample());
        byte[] future = good.clone();
        future[2] = 4;
        reseal(future);
        assertTrue(assertThrows(LinkFormatException.class, () -> LinkCodec.decode(future)).getMessage()
            .startsWith("version"));
        byte[] cut = java.util.Arrays.copyOf(good, good.length - 9);
        reseal(cut);
        assertThrows(LinkFormatException.class, () -> LinkCodec.decode(cut));
        byte[] longer = java.util.Arrays.copyOf(good, good.length + 3);
        reseal(longer);
        assertThrows(LinkFormatException.class, () -> LinkCodec.decode(longer));
        assertThrows(LinkFormatException.class, () -> LinkCodec.decode(new byte[0]));
        assertThrows(LinkFormatException.class, () -> LinkCodec.decode(null));
        assertThrows(LinkFormatException.class, () -> LinkCodec.decode("hello, team".getBytes()));
    }

    @Test
    @Tag("LINK-1")
    @DisplayName("LINK-1: a full report of a ten-robot battle fits one engine message")
    void fitsOneMessage() {
        List<Report.Sighting> s = new ArrayList<>();
        List<String> deaths = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name = "some.LongPackageName.RobotName" + i + " 1.2.3";
            s.add(new Report.Sighting(name, 1, 1, 1, 1, 1, 1));
            deaths.add(name);
        }
        byte[] b = LinkCodec.encode(new Report(0, 1, 1, 1, 1, 1, 1, s, deaths, List.of()));
        assertTrue(b.length < LinkCodec.MAX_BYTES / 10, b.length + " bytes");
    }

    /** Rewrites the trailing CRC so only the change under test can fail. */
    private static void reseal(byte[] b) {
        CRC32 c = new CRC32();
        c.update(b, 0, b.length - 4);
        int crc = (int) c.getValue();
        for (int i = 0; i < 4; i++) b[b.length - 4 + i] = (byte) (crc >>> (24 - 8 * i));
    }
}
