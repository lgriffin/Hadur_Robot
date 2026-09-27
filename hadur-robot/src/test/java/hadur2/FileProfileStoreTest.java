package hadur2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.OpponentProfile;
import hadur2.core.memory.ProfileCodec;
import hadur2.core.memory.ProfileFolder;
import hadur2.core.memory.ProfileLibrary;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * The data-directory store, with a plain file stream standing in for Robocode's (which
 * needs a running engine). The bench runs the real one under the security manager.
 */
class FileProfileStoreTest {

    @TempDir
    Path dir;

    FileProfileStore store(long quota) {
        return new FileProfileStore(dir.toFile(), quota, FileOutputStream::new);
    }

    static OpponentProfile profile(String name, int rounds) {
        ProfileLibrary scratch = new ProfileLibrary(new hadur2.core.port.MemoryProfileStore(1 << 20));
        OpponentProfile p = scratch.load(name).profile();
        ProfileFolder f = new ProfileFolder(p, 800, 600);
        for (int r = 0; r < rounds; r++) {
            f.enemyShot(300, 2, true);
            f.fold(r % 2 == 0);
        }
        for (int i = 0; i < 40; i++) p.addGunSample(new short[OpponentProfile.SAMPLE_WIDTH]);
        return p;
    }

    @Test
    @DisplayName("bytes go in and come out; sizes, listing and deletion work")
    void basics() {
        FileProfileStore s = store(10_000);
        assertNull(s.read("a.hp"));
        s.write("a.hp", new byte[] {1, 2, 3});
        s.write("b.hp", new byte[] {4});
        assertArrayEquals(new byte[] {1, 2, 3}, s.read("a.hp"));
        assertEquals(4, s.bytesUsed());
        assertEquals(List.of("a.hp", "b.hp"), s.names().stream().sorted().toList());
        s.write("a.hp", new byte[] {9});
        assertArrayEquals(new byte[] {9}, s.read("a.hp"), "a write replaces, not appends");
        s.delete("a.hp");
        s.delete("missing.hp");
        assertNull(s.read("a.hp"));
        assertEquals(10_000, s.quota());
    }

    @Test
    @DisplayName("names can never leave the data directory")
    void namesStayInside() {
        FileProfileStore s = store(10_000);
        assertThrows(IllegalArgumentException.class, () -> s.write("../x", new byte[1]));
        assertThrows(IllegalArgumentException.class, () -> s.read("a/b"));
        assertThrows(IllegalArgumentException.class, () -> s.delete(".hidden"));
    }

    @Test
    @Tag("MEM-3")
    @DisplayName("the library saves and reloads a profile through real files")
    void libraryRoundTrip() {
        OpponentProfile p = profile("abc.Shadow 3.83c", 5);
        assertEquals(ProfileLibrary.Saved.WRITTEN, new ProfileLibrary(store(200_000)).save(p));
        ProfileLibrary.Loaded loaded = new ProfileLibrary(store(200_000)).load("abc.Shadow 3.84");
        assertTrue(loaded.found());
        assertEquals(5, loaded.profile().rounds());
        assertEquals(40, loaded.profile().gunSeedSize());
        assertTrue(new File(dir.toFile(), ProfileLibrary.CLOCK).isFile());
    }

    @Test
    @Tag("RES-3")
    @DisplayName("a JVM killed at any byte of either write leaves the profile loadable")
    void killedAtEveryByte() {
        OpponentProfile old = profile("abc.Shadow 3.83c", 3);
        OpponentProfile next = profile("abc.Shadow 3.83c", 4);
        int size = ProfileCodec.encode(next).length;
        for (int write = 0; write < 2; write++) {
            for (int at = 0; at < size; at += (at < 16 || at > size - 16) ? 1 : 7) {
                for (File f : dir.toFile().listFiles()) f.delete();
                new ProfileLibrary(store(200_000)).save(old);
                int[] writes = {0};
                int target = write;
                int cut = at;
                FileProfileStore dying = new FileProfileStore(dir.toFile(), 200_000,
                    f -> writes[0]++ == target ? new Dying(new FileOutputStream(f), cut)
                                                : new FileOutputStream(f));
                assertEquals(ProfileLibrary.Saved.FAILED, new ProfileLibrary(dying).save(next));

                ProfileLibrary.Loaded loaded = new ProfileLibrary(store(200_000)).load("abc.Shadow");
                assertTrue(loaded.found(), "write " + write + " killed at " + at);
                assertNull(loaded.failure(), "write " + write + " killed at " + at);
                assertEquals(write == 0 ? 3 : 4, loaded.profile().rounds(),
                    "write " + write + " killed at " + at);
            }
        }
    }

    /** A stream that writes {@code limit} bytes and then dies, as a killed JVM would. */
    static final class Dying extends FilterOutputStream {
        private int left;

        Dying(OutputStream out, int limit) {
            super(out);
            this.left = limit;
        }

        @Override
        public void write(int b) throws IOException {
            if (left-- <= 0) {
                out.close();
                throw new IOException("killed");
            }
            out.write(b);
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            for (int i = 0; i < len; i++) write(b[off + i]);
        }
    }
}
