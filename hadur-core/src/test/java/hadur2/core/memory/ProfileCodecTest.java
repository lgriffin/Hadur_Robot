package hadur2.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProfileCodecTest {

    static final Path GOLDEN_V1 = Path.of("src/test/resources/profiles/v1.hp");
    static final Path GOLDEN_V2 = Path.of("src/test/resources/profiles/v2.hp");

    @Test
    @Tag("MEM-4")
    @DisplayName("a profile written by version 1 still loads, keeping its stats and dropping its seeds")
    void goldenV1Loads() throws Exception {
        // Written once by S3's Profiles.sample("abc.Shadow 3.83c", 42, 4, 2). Version 1 has
        // no normalised counts, and its seeds had no layout, so they are dropped.
        OpponentProfile p = ProfileCodec.decode(Files.readAllBytes(GOLDEN_V1));
        OpponentProfile expected = Profiles.sample("abc.Shadow 3.83c", 42, 0, 0);
        java.util.Arrays.fill(expected.normalised, 0);
        assertEquals(expected, p);
        assertEquals("abc.Shadow", p.key());
        assertEquals(0, p.gunSeedSize());
        assertEquals(40, p.theirShots(), 1e-6);
    }

    @Test
    @Tag("MEM-4")
    @DisplayName("a profile written by version 2 still loads (golden file)")
    void goldenV2Loads() throws Exception {
        // Written once by Profiles.sample("abc.Shadow 3.83c", 42, 4, 2). If the format
        // changes, bump VERSION and keep this file loading (migrate or keep stats).
        OpponentProfile p = ProfileCodec.decode(Files.readAllBytes(GOLDEN_V2));
        assertEquals(Profiles.sample("abc.Shadow 3.83c", 42, 4, 2), p);
        assertEquals(4, p.gunSeedSize());
        assertEquals(40, p.normalisedWaves(), 1e-6);
    }

    @Test
    @Tag("MEM-4")
    @DisplayName("an unknown version is rejected, not misread")
    void unknownVersionRejected() {
        byte[] bytes = ProfileCodec.encode(Profiles.sample("a.B", 1, 0, 0));
        bytes[2] = (byte) (ProfileCodec.VERSION + 1);
        ProfileFormatException e = assertThrows(ProfileFormatException.class,
            () -> ProfileCodec.decode(bytes));
        assertTrue(e.getMessage().contains("version"), e.getMessage());
    }

    @Test
    @Tag("MEM-7")
    @DisplayName("MEM-7: encoding at the oldest version drops what that version never had, and it still decodes")
    void downLevelEncodeDecodes() {
        OpponentProfile p = Profiles.sample("abc.Shadow 3.83c", 42, 4, 2);
        byte[] atOldest = ProfileCodec.encode(p, ProfileCodec.OLDEST_VERSION);
        assertEquals((byte) ProfileCodec.OLDEST_VERSION, atOldest[2], "the version byte matches");
        OpponentProfile back = ProfileCodec.decode(atOldest);
        // The oldest version has no normalised group and no defined seed layout: both are
        // gone, exactly as a real version-1 file would decode (see goldenV1Loads).
        OpponentProfile expected = Profiles.sample("abc.Shadow 3.83c", 42, 0, 0);
        java.util.Arrays.fill(expected.normalised, 0);
        assertEquals(expected, back);
        assertEquals(0, back.gunSeedSize());
    }

    @Test
    @Tag("MEM-7")
    @DisplayName("MEM-7: encoding at the current version keeps everything, same as plain encode")
    void currentVersionEncodeMatchesPlainEncode() {
        OpponentProfile p = Profiles.sample("abc.Shadow 3.83c", 42, 4, 2);
        assertEquals(java.util.Arrays.toString(ProfileCodec.encode(p)),
            java.util.Arrays.toString(ProfileCodec.encode(p, ProfileCodec.VERSION)));
    }

    @Test
    @Tag("MEM-7")
    @DisplayName("MEM-7: a version outside the supported range is refused, not silently clamped")
    void outOfRangeVersionRejected() {
        OpponentProfile p = Profiles.sample("a.B", 1, 0, 0);
        assertThrows(IllegalArgumentException.class,
            () -> ProfileCodec.encode(p, ProfileCodec.OLDEST_VERSION - 1));
        assertThrows(IllegalArgumentException.class,
            () -> ProfileCodec.encode(p, ProfileCodec.VERSION + 1));
    }

    @Test
    @Tag("MEM-5")
    @DisplayName("stats alone stay under 1 KB, so every opponent can keep them")
    void statsAreSmall() {
        OpponentProfile p = Profiles.sample("abc.Shadow 3.83c", 1, 0, 0);
        assertTrue(ProfileCodec.encode(p).length < 1024);
        OpponentProfile full = Profiles.sample("abc.Shadow 3.83c", 1, 600, 300);
        int size = ProfileCodec.encode(full).length;
        // The artifact's budget: 26 bytes a sample, about 24 KB for full seeds.
        assertTrue(size < 25 * 1024, "full profile " + size);
    }
}
