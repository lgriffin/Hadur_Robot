package hadurling.core.memory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.zip.CRC32;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProfileCodecTest {

    private static final Profile P = new Profile("abc.Foe", 12, 40, 6, 90, 30,
        List.of(new float[] {0.5f, 0.25f, -0.75f}, new float[] {-1f, 0.5f, 1f}));

    /** Replaces the version byte and repairs the checksum, so only the version is wrong. */
    private static byte[] withVersion(byte[] good, int version) {
        byte[] b = good.clone();
        b[2] = (byte) version;
        CRC32 crc = new CRC32();
        crc.update(b, 0, b.length - 4);
        ByteBuffer.wrap(b, b.length - 4, 4).putInt((int) crc.getValue());
        return b;
    }

    @Test
    @Tag("HL-17")
    @DisplayName("what is encoded is decoded")
    void roundTrip() throws Exception {
        assertEquals(P, ProfileCodec.decode(ProfileCodec.encode(P)));
    }

    @Test
    @DisplayName("the file starts with the magic and the version, and encoding is deterministic")
    void layout() {
        byte[] bytes = ProfileCodec.encode(P);
        assertEquals('H', bytes[0]);
        assertEquals('P', bytes[1]);
        assertEquals(ProfileCodec.VERSION, bytes[2]);
        assertArrayEquals(bytes, ProfileCodec.encode(P));
    }

    @Test
    @Tag("HL-19")
    @DisplayName("a version 1 file loads with the version 2 fields at their defaults")
    void versionOne() throws Exception {
        byte[] old = ProfileCodec.encode(P, 1);
        assertEquals(1, old[2]);
        Profile loaded = ProfileCodec.decode(old);
        assertEquals(new Profile("abc.Foe", 12, 40, 6, 0, 0, List.of()), loaded);
        assertEquals(0, loaded.ourShots());
        assertEquals(0, loaded.seed().size());
    }

    @Test
    @Tag("HL-18")
    @DisplayName("an unknown version is rejected, even with a good checksum")
    void unknownVersion() {
        byte[] good = ProfileCodec.encode(P);
        assertThrows(ProfileFormatException.class, () -> ProfileCodec.decode(withVersion(good, 3)));
        assertThrows(ProfileFormatException.class, () -> ProfileCodec.decode(withVersion(good, 0)));
    }

    @Test
    @Tag("HL-18")
    @DisplayName("a cut-short file and an empty one are rejected")
    void truncated() {
        byte[] good = ProfileCodec.encode(P);
        assertThrows(ProfileFormatException.class, () -> ProfileCodec.decode(new byte[0]));
        assertThrows(ProfileFormatException.class, () -> ProfileCodec.decode(java.util.Arrays.copyOf(good, good.length - 1)));
    }

    @Test
    @Tag("HL-18")
    @DisplayName("a changed byte fails the checksum")
    void flipped() {
        byte[] bad = ProfileCodec.encode(P);
        bad[12] ^= 0x01;
        assertThrows(ProfileFormatException.class, () -> ProfileCodec.decode(bad));
    }

    @Test
    @DisplayName("a profile that makes no sense is refused by the Profile constructor, not stored")
    void nonsenseIsRefused() {
        assertThrows(IllegalArgumentException.class, () -> new Profile("k", 1, 5, 6, 0, 0, List.of()));
        assertThrows(IllegalArgumentException.class, () -> new Profile("", 1, 0, 0, 0, 0, List.of()));
        assertThrows(IllegalArgumentException.class,
            () -> new Profile("k", 1, 0, 0, 0, 0, List.of(new float[] {Float.NaN, 0, 0})));
    }

    @Test
    @DisplayName("an unsupported version cannot be written")
    void cannotWriteTheFuture() {
        assertThrows(IllegalArgumentException.class, () -> ProfileCodec.encode(P, 3));
        assertThrows(IllegalArgumentException.class, () -> ProfileCodec.encode(P, 0));
    }
}
