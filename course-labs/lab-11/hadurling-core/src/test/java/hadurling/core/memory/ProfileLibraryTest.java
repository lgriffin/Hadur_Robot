package hadurling.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadurling.core.port.MemoryProfileStore;
import hadurling.core.port.ProfileStore;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProfileLibraryTest {

    private static Profile profile(String key, int rounds) {
        return new Profile(key, rounds, 10, 1, 20, 5, List.of(new float[] {0.1f, 0.2f, 0.3f}));
    }

    @Test
    @DisplayName("a saved profile is loaded back, and the temporary copy is gone")
    void saveThenLoad() {
        MemoryProfileStore store = new MemoryProfileStore(10_000);
        ProfileLibrary library = new ProfileLibrary(store);
        assertTrue(library.save(profile("a.Foe", 3)));
        assertEquals(profile("a.Foe", 3), library.load("a.Foe"));
        assertEquals(1, store.names().size());
        assertFalse(store.names().get(0).endsWith(ProfileLibrary.TMP_SUFFIX));
    }

    @Test
    @Tag("HL-21")
    @DisplayName("an opponent never met is a stranger, and that is not a failure")
    void stranger() {
        ProfileLibrary library = new ProfileLibrary(new MemoryProfileStore(1000));
        assertEquals(Profile.stranger("a.Foe"), library.load("a.Foe"));
        assertEquals(0, library.loadFailures());
    }

    @Test
    @Tag("HL-21")
    @DisplayName("a damaged file is a stranger and is counted")
    void damaged() {
        MemoryProfileStore store = new MemoryProfileStore(10_000);
        store.write(ProfileLibrary.fileFor("a.Foe"), new byte[] {1, 2, 3});
        ProfileLibrary library = new ProfileLibrary(store);
        assertEquals(Profile.stranger("a.Foe"), library.load("a.Foe"));
        assertEquals(1, library.loadFailures());
        assertFalse(library.lastNote().isEmpty());
    }

    @Test
    @Tag("HL-21")
    @DisplayName("a store that throws costs a lesson, not the robot")
    void brokenStore() {
        ProfileStore broken = new ProfileStore() {
            private IllegalStateException fire() {
                return new IllegalStateException("disk on fire");
            }

            @Override public byte[] read(String name) { throw fire(); }
            @Override public void write(String name, byte[] bytes) { throw fire(); }
            @Override public void delete(String name) { throw fire(); }
            @Override public List<String> names() { throw fire(); }
            @Override public long size(String name) { throw fire(); }
            @Override public long lastModified(String name) { throw fire(); }
            @Override public long quota() { return 1000; }
        };
        ProfileLibrary library = new ProfileLibrary(broken);
        assertEquals(Profile.stranger("a.Foe"), library.load("a.Foe"));
        assertFalse(library.save(profile("a.Foe", 1)));
        assertEquals(1, library.loadFailures());
        assertEquals(1, library.saveFailures());
    }

    @Test
    @DisplayName("a file that belongs to another robot with the same file name is not used")
    void keyMismatch() {
        MemoryProfileStore store = new MemoryProfileStore(10_000);
        store.write(ProfileLibrary.fileFor("a.Foe"), ProfileCodec.encode(profile("b.Other", 7)));
        assertEquals(Profile.stranger("a.Foe"), new ProfileLibrary(store).load("a.Foe"));
    }

    @Test
    @DisplayName("when the store is full, the least recently written other profile is forgotten")
    void evictsTheOldest() {
        int size = ProfileCodec.encode(profile("a.One", 1)).length;
        // Room for the three files of two saves at once: 2 profiles and one copy, not more.
        MemoryProfileStore store = new MemoryProfileStore(3L * size + 8);
        ProfileLibrary library = new ProfileLibrary(store);
        assertTrue(library.save(profile("a.One", 1)));
        assertTrue(library.save(profile("a.Two", 1)));
        assertTrue(library.save(profile("a.Six", 1)));
        assertEquals(Profile.stranger("a.One"), library.load("a.One"));
        assertEquals(profile("a.Six", 1), library.load("a.Six"));
        assertEquals(profile("a.Two", 1), library.load("a.Two"));
        assertEquals(0, library.saveFailures());
    }

    @Test
    @DisplayName("a profile too big for the quota fails to save and the others survive")
    void tooBig() {
        MemoryProfileStore store = new MemoryProfileStore(200);
        ProfileLibrary library = new ProfileLibrary(store);
        assertTrue(library.save(new Profile("a.Small", 1, 0, 0, 0, 0, List.of())));
        float[] sample = {0.1f, 0.2f, 0.3f};
        assertFalse(library.save(new Profile("a.Big", 1, 0, 0, 0, 0, java.util.Collections.nCopies(30, sample))));
        assertEquals(1, library.saveFailures());
    }
}
