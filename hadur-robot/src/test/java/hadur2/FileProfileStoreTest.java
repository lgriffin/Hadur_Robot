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

    /**
     * A profile fought twice (MEM-8: seeds are only kept for an opponent met at least
     * twice), losing every round so its recorded score share stays under 60%.
     */
    static OpponentProfile profile(String name, int rounds) {
        ProfileLibrary scratch = new ProfileLibrary(new hadur2.core.port.MemoryProfileStore(1 << 20));
        // A first, empty, losing battle: MEM-8 keeps seeds only for an opponent met at
        // least twice with a recorded score share under 60%.
        OpponentProfile first = scratch.load(name).profile();
        new ProfileFolder(first, 800, 600).fold(false);
        scratch.save(first);
        OpponentProfile p = scratch.load(name).profile();
        ProfileFolder f = new ProfileFolder(p, 800, 600);
        for (int r = 0; r < rounds; r++) {
            f.enemyShot(300, 2, true);
            f.fold(false);
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

    /**
     * Robocode's accounting (RobotFileSystemManager): the quota is charged for every byte
     * written, opening an existing file for writing refunds its length, and a delete
     * refunds nothing.
     */
    static final class RobocodeQuota {
        final long max;
        long used;

        RobocodeQuota(long max, File dir) {
            this.max = max;
            File[] files = dir.listFiles();
            if (files != null) for (File f : files) used += f.length();
        }

        OutputStream open(File file) throws IOException {
            if (file.exists()) used -= file.length();
            return new FilterOutputStream(new FileOutputStream(file)) {
                @Override
                public void write(int b) throws IOException {
                    if (used + 1 > max) throw new IOException("You have reached your filesystem quota");
                    used++;
                    out.write(b);
                }
            };
        }
    }

    @Test
    @Tag("MEM-3")
    @DisplayName("a round's checkpoint does not leak Robocode's write quota, however many rounds")
    void savesDoNotLeakTheWriteQuota() {
        RobocodeQuota quota = new RobocodeQuota(200_000, dir.toFile());
        FileProfileStore s = new FileProfileStore(dir.toFile(), 200_000, quota::open);
        ProfileLibrary library = new ProfileLibrary(s);
        OpponentProfile p = profile("abc.Shadow 3.83c", 3);
        for (int i = 0; i < 560; i++) p.addGunSample(new short[OpponentProfile.SAMPLE_WIDTH]);
        for (int i = 0; i < 300; i++) p.addSurfSample(new short[OpponentProfile.SAMPLE_WIDTH]);
        int size = ProfileCodec.encode(p).length;
        assertTrue(size > 20_000, "a fully seeded profile, " + size + " bytes");
        for (int round = 0; round < 35; round++) {
            assertEquals(ProfileLibrary.Saved.WRITTEN, library.save(p), "round " + round);
        }
        assertEquals(s.bytesUsed(), quota.used, "the quota charges only what is on disk");
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
        assertEquals(6, loaded.profile().rounds(), "5 folded rounds plus profile()'s own first battle");
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
                assertEquals(write == 0 ? 4 : 5, loaded.profile().rounds(),
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

    @Test
    @Tag("MEM-11")
    @DisplayName("MEM-11: the directory is listed once; later answers come from the index the store keeps")
    void listsOnce() throws IOException {
        File d = dir.toFile();
        try (FileOutputStream out = new FileOutputStream(new File(d, "old.hp"))) {
            out.write(new byte[100]);
        }
        FileProfileStore s = store(10_000);
        assertEquals(100, s.bytesUsed());
        assertEquals(100, s.size("old.hp"));
        // A file that appears behind the store's back is not seen: nothing lists again.
        try (FileOutputStream out = new FileOutputStream(new File(d, "stray.hp"))) {
            out.write(new byte[7]);
        }
        assertEquals(List.of("old.hp"), s.names());
        // The store's own writes and deletes keep the index current.
        s.write("new.hp", new byte[20]);
        assertEquals(120, s.bytesUsed());
        assertEquals(20, s.size("new.hp"));
        assertTrue(s.lastModified("new.hp") > s.lastModified("old.hp"), "a write is newer than anything listed");
        s.write("old.hp", new byte[5]);
        assertTrue(s.lastModified("old.hp") > s.lastModified("new.hp"));
        s.delete("new.hp");
        assertEquals(List.of("old.hp"), s.names());
        assertEquals(5, s.bytesUsed());
        assertEquals(0, s.size("new.hp"));
        assertEquals(0, s.lastModified("new.hp"));
    }
}
