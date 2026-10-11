package hadurling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadurling.core.memory.Profile;
import hadurling.core.memory.ProfileCodec;
import hadurling.core.memory.ProfileLibrary;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** The same count as the core's scale test, but against real files in a real folder. */
class FileProfileStoreScaleTest {

    @TempDir
    File dir;

    @Test
    @Tag("HL-40")
    @DisplayName("300 saves into a folder that already holds 300 profiles scan the folder once")
    void oneScanForHundredsOfSaves() throws Exception {
        for (int i = 0; i < 300; i++) {
            String key = "old.Bot" + i;
            Files.write(new File(dir, ProfileCodecNames.file(key)).toPath(),
                ProfileCodec.encode(Profile.stranger(key)));
        }
        FileProfileStore store = new FileProfileStore(dir, 50_000_000L, FileOutputStream::new);
        ProfileLibrary library = new ProfileLibrary(store);
        for (int i = 0; i < 300; i++) {
            library.save(new Profile("new.Bot" + i, 1, 4, 1, 8, 2, List.of(new float[] {0.1f, 0.2f, 0.3f})));
        }
        assertEquals(1, store.listings());
        assertEquals(0, library.saveFailures());
        assertEquals(600, dir.list().length);
    }
}
