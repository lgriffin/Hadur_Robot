package hadurling.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Combinators;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;

/**
 * Properties of the file format. The first is the round trip; the others are about
 * <em>damage</em>: a stored file can be cut short, have a bit changed, or be anything at all,
 * and the codec must say "no" with its own exception every time.
 */
class ProfileCodecProperties {

    @Provide
    Arbitrary<Profile> profiles() {
        Arbitrary<String> keys = Arbitraries.strings().alpha().numeric().withChars('.', ' ', '-', 'é', '中')
            .ofMinLength(1).ofMaxLength(40);
        Arbitrary<float[]> sample = Arbitraries.floats().between(-2f, 2f).list().ofSize(Profile.SEED_WIDTH)
            .map(l -> new float[] {l.get(0), l.get(1), l.get(2)});
        Arbitrary<List<float[]>> seed = sample.list().ofMaxSize(Profile.MAX_SEED);
        Arbitrary<Integer> counts = Arbitraries.integers().between(0, 1_000_000);
        return Combinators.combine(keys, counts, counts, counts, counts, seed).as(
            (key, rounds, theirShots, ourShots, extra, s) -> new Profile(key, rounds, theirShots,
                theirShots / 3, ourShots, ourShots / 2, s));
    }

    @Property
    @Tag("HL-17")
    void decodingWhatWasEncodedGivesTheSameProfile(@ForAll("profiles") Profile p) throws Exception {
        assertEquals(p, ProfileCodec.decode(ProfileCodec.encode(p)));
    }

    @Property
    @Tag("HL-18")
    void everyCutShortFileIsRejected(@ForAll("profiles") Profile p, @ForAll("fractions") double where) {
        byte[] bytes = ProfileCodec.encode(p);
        int keep = (int) (where * (bytes.length - 1));
        assertThrows(ProfileFormatException.class, () -> ProfileCodec.decode(Arrays.copyOf(bytes, keep)));
    }

    @Property
    @Tag("HL-18")
    void everyChangedBitIsRejected(@ForAll("profiles") Profile p, @ForAll("fractions") double where,
            @ForAll("bits") int bit) {
        byte[] bytes = ProfileCodec.encode(p);
        int at = (int) (where * (bytes.length - 1));
        bytes[at] ^= (byte) (1 << bit);
        // CRC-32 detects every single-bit error, so no flipped bit may get through.
        assertThrows(ProfileFormatException.class, () -> ProfileCodec.decode(bytes));
    }

    @Property
    @Tag("HL-18")
    void anyBytesAtAllGiveAProfileOrTheCodecsOwnException(@ForAll byte[] anything) {
        try {
            ProfileCodec.decode(anything);
        } catch (ProfileFormatException expected) {
            // Fine. Any other exception type would escape and fail the property.
        }
    }

    @Property
    @Tag("HL-19")
    void aVersionOneFileLoadsWithTheNewFieldsAtDefaults(@ForAll("profiles") Profile p) throws Exception {
        Profile expected = new Profile(p.key(), p.rounds(), p.theirShots(), p.theirHits(), 0, 0, new ArrayList<>());
        assertEquals(expected, ProfileCodec.decode(ProfileCodec.encode(p, 1)));
    }

    @Provide
    Arbitrary<Double> fractions() {
        return Arbitraries.doubles().between(0, 1);
    }

    @Provide
    Arbitrary<Integer> bits() {
        return Arbitraries.integers().between(0, 7);
    }
}
