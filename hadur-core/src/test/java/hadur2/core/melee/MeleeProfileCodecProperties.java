package hadur2.core.melee;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.FloatRange;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.LongRange;
import net.jqwik.api.constraints.Size;
import net.jqwik.api.constraints.StringLength;

/**
 * The melee block's format as properties (MMEM-1): every block survives a round trip, and
 * no input, however random, makes the decoder throw anything but
 * {@link MeleeProfileFormatException}, which the store turns into a stranger.
 */
class MeleeProfileCodecProperties {

    @Property(tries = 300)
    @Tag("MMEM-1")
    void encodeDecodeIsIdentity(@ForAll @StringLength(min = 1, max = 120) String key,
                                @ForAll @LongRange(min = 0, max = Long.MAX_VALUE) long stamp,
                                @ForAll @IntRange(min = 1, max = 30) int rounds,
                                @ForAll @FloatRange(min = 0, max = 50) float shots,
                                @ForAll @FloatRange(min = 0, max = 1) float hitShare,
                                @ForAll @FloatRange(min = 0.1f, max = 3) float power,
                                @ForAll @IntRange(min = 0, max = 10) int rank) {
        MeleeProfile p = new MeleeProfile(key);
        for (int i = 0; i < rounds; i++) {
            p.fold(stamp, shots, shots * hitShare, shots * hitShare / 2, shots * hitShare / 3,
                shots * power, shots, 2 * shots, shots / 4, rank);
        }
        byte[] bytes = MeleeProfileCodec.encode(p);
        MeleeProfile back = MeleeProfileCodec.decode(bytes);
        assertEquals(p, back);
        assertArrayEquals(bytes, MeleeProfileCodec.encode(back), "encoding is canonical");
    }

    @Property
    @Tag("MMEM-1")
    void randomBytesOnlyThrowTheFormatException(@ForAll @Size(max = 400) byte[] bytes) {
        try {
            MeleeProfileCodec.decode(bytes);
        } catch (MeleeProfileFormatException expected) {
            // The only allowed failure.
        }
    }

    @Property(tries = 300)
    @Tag("MMEM-1")
    void damagedBlocksOnlyThrowTheFormatException(@ForAll @IntRange(min = 0, max = 1_000_000) int where,
                                                  @ForAll byte value) {
        byte[] bytes = MeleeProfileCodec.encode(MeleeProfileCodecTest.sample("abc.Shadow", 9));
        bytes[where % bytes.length] = value;
        try {
            MeleeProfile p = MeleeProfileCodec.decode(bytes);
            // Only an unchanged byte can still decode.
            assertEquals(MeleeProfileCodecTest.sample("abc.Shadow", 9), p);
        } catch (MeleeProfileFormatException expected) {
            // Refused.
        }
    }
}
