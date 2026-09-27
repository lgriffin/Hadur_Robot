package hadur2.core.melee;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The melee block's file format (MMEM-1): round trip, and every kind of damage refused. */
class MeleeProfileCodecTest {

    /** A block with every count set, as a few rounds against {@code key} would leave it. */
    static MeleeProfile sample(String key, long stamp) {
        MeleeProfile p = new MeleeProfile(key);
        p.fold(stamp, 12, 3, 2, 1, 22.5, 12, 40, 10, 2);
        p.fold(stamp, 8, 1, 0, 1, 12, 8, 5, 0, 4);
        return p;
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("a block survives a round trip, byte for byte")
    void roundTrips() {
        MeleeProfile p = sample("abc.Shadow", 7);
        byte[] bytes = MeleeProfileCodec.encode(p);
        MeleeProfile back = MeleeProfileCodec.decode(bytes);
        assertEquals(p, back);
        assertEquals(2, back.rounds());
        assertEquals(7, back.lastFought());
        assertEquals(0.2, back.meleeHitRateOnHadur(), 1e-6);
        assertArrayEquals(bytes, MeleeProfileCodec.encode(back));
        assertEquals(7, MeleeProfileCodec.stampOf(bytes));
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("the wrong magic is refused")
    void badMagic() {
        byte[] bytes = MeleeProfileCodec.encode(sample("a", 1));
        bytes[1] = 'P';
        assertThrows(MeleeProfileFormatException.class, () -> MeleeProfileCodec.decode(bytes));
        assertEquals(-1, MeleeProfileCodec.stampOf(bytes));
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("a changed byte fails the checksum")
    void badChecksum() {
        byte[] bytes = MeleeProfileCodec.encode(sample("a", 1));
        bytes[MeleeProfileCodec.HEADER + 4] ^= 0x10;
        MeleeProfileFormatException e = assertThrows(MeleeProfileFormatException.class,
            () -> MeleeProfileCodec.decode(bytes));
        assertEquals("checksum mismatch", e.getMessage());
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("only version 1 is read, even with a valid checksum")
    void unknownVersion() {
        byte[] bytes = MeleeProfileCodec.encode(sample("a", 1));
        bytes[2] = 2;
        int length = bytes.length - MeleeProfileCodec.TRAILER;
        int crc = MeleeProfileCodec.crc(bytes, length);
        for (int i = 0; i < 4; i++) bytes[length + i] = (byte) (crc >>> (24 - 8 * i));
        MeleeProfileFormatException e = assertThrows(MeleeProfileFormatException.class,
            () -> MeleeProfileCodec.decode(bytes));
        assertEquals("unknown version 2", e.getMessage());
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("every truncation is refused")
    void truncated() {
        byte[] bytes = MeleeProfileCodec.encode(sample("abc.Shadow", 3));
        for (int n = 0; n < bytes.length; n++) {
            byte[] cut = Arrays.copyOf(bytes, n);
            assertThrows(MeleeProfileFormatException.class, () -> MeleeProfileCodec.decode(cut), "length " + n);
        }
        assertThrows(MeleeProfileFormatException.class, () -> MeleeProfileCodec.decode(null));
    }
}
