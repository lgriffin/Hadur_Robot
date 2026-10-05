package hadur2.core.memory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Size;

/**
 * The profile format (S3 gate: encode/decode property tests). Every profile survives a
 * round trip; no damaged or random input makes the decoder throw anything but
 * {@link ProfileFormatException}, which the library turns into a stranger (MEM-4).
 */
class ProfileCodecProperties {

    @Property(tries = 200)
    @Tag("MEM-3")
    void roundTrips(@ForAll String name, @ForAll @IntRange(min = 0, max = 100000) int battle,
                    @ForAll @IntRange(min = 0, max = 600) int gunSeed,
                    @ForAll @IntRange(min = 0, max = 300) int surfSeed,
                    @ForAll boolean leadAware) {
        OpponentProfile p = Profiles.leadAware(Profiles.sample(name, battle, gunSeed, surfSeed), leadAware);
        byte[] bytes = ProfileCodec.encode(p);
        OpponentProfile back = ProfileCodec.decode(bytes);
        assertEquals(p, back);
        assertEquals(leadAware, back.leadAware(), "ADAPT-5's verdict round-trips");
        assertArrayEquals(bytes, ProfileCodec.encode(back), "encoding is canonical");
    }

    @Property
    @Tag("MEM-4")
    void randomBytesNeverThrowAnythingElse(@ForAll @Size(max = 600) byte[] bytes) {
        try {
            ProfileCodec.decode(bytes);
        } catch (ProfileFormatException expected) {
            // The only allowed failure.
        }
    }

    @Property(tries = 300)
    @Tag("MEM-4")
    void everyTruncationIsRejected(@ForAll @IntRange(min = 0, max = 100000) int cut) {
        byte[] bytes = ProfileCodec.encode(Profiles.sample("abc.Shadow 3.83c", 7, 3, 2));
        int length = cut % bytes.length;
        assertThrows(ProfileFormatException.class,
            () -> ProfileCodec.decode(Arrays.copyOf(bytes, length)));
    }

    @Property(tries = 500)
    @Tag("MEM-4")
    void everyBitFlipIsRejected(@ForAll @IntRange(min = 0, max = 1000000) int where) {
        byte[] bytes = ProfileCodec.encode(Profiles.sample("abc.Shadow 3.83c", 7, 3, 2));
        int bit = where % (bytes.length * 8);
        bytes[bit / 8] ^= (byte) (1 << (bit % 8));
        assertThrows(ProfileFormatException.class, () -> ProfileCodec.decode(bytes));
    }

    @Property(tries = 50)
    @Tag("MEM-4")
    void aValidChecksumOverBadValuesIsStillRejected(@ForAll @IntRange(min = 0, max = 9) int field) {
        // Damage that the checksum can't see (a bug, not a torn write) must fail too.
        OpponentProfile p = Profiles.sample("x.Y 1", 3, 0, 0);
        float[][] groups = {p.shotsAtUs, p.hitsOnUs, p.shotsByMotion, p.hitsByMotion,
            p.powerHistogram, p.virtualFired, p.virtualHits, p.ourShots, p.ourHits, p.motion};
        groups[field][0] = field % 2 == 0 ? Float.NaN : -1f;
        byte[] bytes = ProfileCodec.encode(p);
        assertThrows(ProfileFormatException.class, () -> ProfileCodec.decode(bytes));
    }
}
