package hadurling;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadurling.core.memory.Profile;
import hadurling.core.memory.ProfileLibrary;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Robocode's own stream refuses to run outside a battle, so the tests give the store a plain
 * {@link FileOutputStream} as its opener; the store does not care which it gets.
 */
class FileProfileStoreTest {

    @TempDir
    File dir;

    private FileProfileStore store() {
        return new FileProfileStore(dir, 100_000, FileOutputStream::new);
    }

    /** A stream that writes only its first {@code keep} bytes and then fails, like a killed robot. */
    private static final class CutOff extends OutputStream {
        private final OutputStream inner;
        private int left;

        CutOff(OutputStream inner, int keep) {
            this.inner = inner;
            this.left = keep;
        }

        @Override
        public void write(int b) throws IOException {
            if (left-- <= 0) throw new IOException("killed");
            inner.write(b);
        }

        @Override
        public void close() throws IOException {
            inner.close();
        }
    }

    @Test
    @DisplayName("bytes written are read back, listed, sized and deleted")
    void basics() {
        FileProfileStore store = store();
        assertNull(store.read("a.hp"));
        store.write("a.hp", new byte[] {1, 2, 3});
        store.write("b.hp", new byte[] {4});
        assertArrayEquals(new byte[] {1, 2, 3}, store.read("a.hp"));
        assertEquals(List.of("a.hp", "b.hp"), store.names());
        assertEquals(3, store.size("a.hp"));
        assertEquals(0, store.size("zzz"));
        store.delete("a.hp");
        assertEquals(List.of("b.hp"), store.names());
        store.delete("a.hp"); // deleting what is not there is not an error
    }

    @Test
    @Tag("HL-22")
    @DisplayName("a name that could leave the data directory is refused")
    void namesStayInside() {
        FileProfileStore store = store();
        for (String bad : new String[] {"", "../x", "a/b", "a\\b", ".hidden", "/etc/passwd"}) {
            assertThrows(IllegalArgumentException.class, () -> store.write(bad, new byte[1]), bad);
            assertThrows(IllegalArgumentException.class, () -> store.read(bad), bad);
        }
        assertEquals(List.of(), store.names());
    }

    @Test
    @DisplayName("a directory that does not exist is an empty store")
    void missingDirectory() {
        FileProfileStore store = new FileProfileStore(new File(dir, "nope"), 10, FileOutputStream::new);
        assertEquals(List.of(), store.names());
        assertNull(store.read("a"));
    }

    @Test
    @DisplayName("a write that is cut short leaves a prefix on disk and an exception")
    void cutWrite() throws IOException {
        FileProfileStore store = new FileProfileStore(dir, 1000, f -> new CutOff(new FileOutputStream(f), 2));
        assertThrows(UncheckedIOException.class, () -> store.write("a.hp", new byte[] {1, 2, 3, 4}));
        assertArrayEquals(new byte[] {1, 2}, Files.readAllBytes(new File(dir, "a.hp").toPath()));
    }

    @Test
    @DisplayName("a save killed during the second write still loads the old profile through the library")
    void libraryOverFiles() {
        Profile old = new Profile("a.Foe", 1, 4, 1, 8, 2, List.of());
        Profile fresh = new Profile("a.Foe", 2, 9, 2, 20, 6, List.of());
        assertTrue(new ProfileLibrary(store()).save(old));

        // The first write of the next save (the copy) succeeds; the second (the profile) is cut.
        int[] opened = {0};
        FileProfileStore killed = new FileProfileStore(dir, 100_000, f -> {
            OutputStream out = new FileOutputStream(f);
            return ++opened[0] == 2 ? new CutOff(out, 10) : out;
        });
        assertFalse(new ProfileLibrary(killed).save(fresh));

        assertEquals(fresh, new ProfileLibrary(store()).load("a.Foe"));
    }
}
