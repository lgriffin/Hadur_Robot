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

    static final Path GOLDEN = Path.of("src/test/resources/profiles/v1.hp");

    @Test
    @Tag("MEM-4")
    @DisplayName("a profile written by version 1 still loads (golden file)")
    void goldenV1Loads() throws Exception {
        // Written once by Profiles.sample("abc.Shadow 3.83c", 42, 4, 2). If the format
        // changes, bump VERSION and keep this file loading (migrate or keep stats).
        OpponentProfile p = ProfileCodec.decode(Files.readAllBytes(GOLDEN));
        assertEquals(Profiles.sample("abc.Shadow 3.83c", 42, 4, 2), p);
        assertEquals("abc.Shadow", p.key());
        assertEquals(4, p.gunSeedSize());
    }

    @Test
    @Tag("MEM-4")
    @DisplayName("an unknown version is rejected, not misread")
    void unknownVersionRejected() {
        byte[] bytes = ProfileCodec.encode(Profiles.sample("a.B", 1, 0, 0));
        bytes[2] = 2;
        ProfileFormatException e = assertThrows(ProfileFormatException.class,
            () -> ProfileCodec.decode(bytes));
        assertTrue(e.getMessage().contains("version"), e.getMessage());
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
