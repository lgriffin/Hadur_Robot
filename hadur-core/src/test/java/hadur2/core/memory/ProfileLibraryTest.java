package hadur2.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.port.MemoryProfileStore;
import hadur2.core.port.ProfileStore;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProfileLibraryTest {

    static final long QUOTA = 200_000;

    /** Plays one battle against {@code name}: load, fold one round, save. */
    static OpponentProfile battle(ProfileStore store, String name) {
        ProfileLibrary lib = new ProfileLibrary(store);
        OpponentProfile p = lib.load(name).profile();
        ProfileFolder f = new ProfileFolder(p, 800, 600);
        f.enemyShot(300, 2, true);
        f.fold(true);
        lib.save(p);
        return p;
    }

    @Test
    @Tag("MEM-1")
    @DisplayName("a stranger gets a fresh profile; the next battle finds the saved one")
    void strangerThenRemembered() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        ProfileLibrary first = new ProfileLibrary(store);
        ProfileLibrary.Loaded a = first.load("abc.Shadow 3.83c");
        assertFalse(a.found());
        assertNull(a.failure());
        assertEquals(1, a.profile().battles());
        first.save(a.profile());

        ProfileLibrary.Loaded b = new ProfileLibrary(store).load("abc.Shadow 3.84 (1)");
        assertTrue(b.found(), "a new version shares the lineage's profile");
        assertEquals(2, b.profile().battles());
        assertEquals("abc.Shadow 3.84 (1)", b.profile().lastName(), "the exact name is kept");
        assertTrue(b.profile().lastFought() > a.profile().lastFought());
    }

    @Test
    @Tag("MEM-3")
    @DisplayName("a save persists the profile byte for byte, with no temporary copy left")
    void savePersists() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        OpponentProfile p = Profiles.sample("sample.Crazy", 5, 10, 10);
        assertEquals(ProfileLibrary.Saved.WRITTEN, new ProfileLibrary(store).save(p));
        String file = ProfileLibrary.fileName("sample.Crazy");
        assertEquals(p, ProfileCodec.decode(store.read(file)));
        assertNull(store.read(file + ProfileLibrary.TMP_SUFFIX));
        assertTrue(store.bytesUsed() <= QUOTA);
    }

    @Test
    @Tag("MEM-4")
    @DisplayName("a damaged profile loads as a stranger and counts a failure")
    void damagedProfileIsAStranger() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        battle(store, "sample.Walls");
        String file = ProfileLibrary.fileName("sample.Walls");
        byte[] bytes = store.read(file);
        bytes[bytes.length / 2] ^= 0x10;
        store.write(file, bytes);

        ProfileLibrary lib = new ProfileLibrary(store);
        ProfileLibrary.Loaded loaded = lib.load("sample.Walls");
        assertFalse(loaded.found());
        assertNotNull(loaded.failure());
        assertEquals(1, lib.loadFailures());
        assertEquals(1, loaded.profile().battles(), "fresh, not the damaged one");
        // The next save replaces the damaged file.
        lib.save(loaded.profile());
        assertTrue(new ProfileLibrary(store).load("sample.Walls").found());
    }

    @Test
    @Tag("MEM-4")
    @DisplayName("a store that throws gives a stranger and failure counts, never an exception")
    void failingStore() {
        ProfileStore broken = new ProfileStore() {
            public byte[] read(String name) { throw new IllegalStateException("disk gone"); }
            public void write(String name, byte[] bytes) { throw new IllegalStateException("disk gone"); }
            public void delete(String name) { throw new IllegalStateException("disk gone"); }
            public List<String> names() { throw new IllegalStateException("disk gone"); }
            public long bytesUsed() { throw new IllegalStateException("disk gone"); }
            public long quota() { return QUOTA; }
        };
        ProfileLibrary lib = new ProfileLibrary(broken);
        ProfileLibrary.Loaded loaded = lib.load("sample.Tracker");
        assertFalse(loaded.found());
        assertEquals(1, lib.loadFailures());
        assertEquals(ProfileLibrary.Saved.FAILED, lib.save(loaded.profile()));
        assertEquals(1, lib.saveFailures());
        assertTrue(lib.lastNote().contains("disk gone"), lib.lastNote());
    }

    @Test
    @Tag("RES-3")
    @DisplayName("a save killed at any byte leaves a loadable profile, old or new")
    void killedAtEveryByte() {
        OpponentProfile old = Profiles.sample("abc.Shadow 3.83c", 3, 20, 5);
        OpponentProfile next = Profiles.sample("abc.Shadow 3.83c", 4, 25, 6);
        int size = ProfileCodec.encode(next).length;
        // Writes in one save: the temporary copy, then the profile. Kill each at every byte.
        for (int write = 0; write < 2; write++) {
            for (int at = 0; at <= size; at++) {
                MemoryProfileStore store = new MemoryProfileStore(QUOTA);
                new ProfileLibrary(store).save(old);
                int before = store.writes();
                MemoryProfileStore crashing = store;
                ProfileStore killer = new DelegatingStore(store) {
                    @Override
                    public void write(String name, byte[] bytes) {
                        if (crashing.writes() == before + targetWrite) crashing.crashAfter(cut);
                        super.write(name, bytes);
                    }
                }.at(write, at);
                assertEquals(ProfileLibrary.Saved.FAILED, new ProfileLibrary(killer).save(next));

                ProfileLibrary.Loaded loaded = new ProfileLibrary(store).load("abc.Shadow");
                assertTrue(loaded.found(), "write " + write + " cut at " + at);
                assertNull(loaded.failure(), "write " + write + " cut at " + at);
                OpponentProfile got = loaded.profile();
                long fought = got.lastFought();
                // The loaded profile is one of the two, stamped for the new battle.
                assertTrue(got.gunSeedSize() == 20 || got.gunSeedSize() == 25);
                assertEquals(write == 0 ? 20 : 25, got.gunSeedSize(),
                    "killed in the temporary copy keeps the old profile; killed in the profile uses the copy");
                assertTrue(fought > 0);
            }
        }
    }

    /** A store that forwards everything; tests override a method to inject a crash. */
    static class DelegatingStore implements ProfileStore {
        final ProfileStore inner;
        int targetWrite;
        int cut;

        DelegatingStore(ProfileStore inner) {
            this.inner = inner;
        }

        DelegatingStore at(int write, int cut) {
            this.targetWrite = write;
            this.cut = cut;
            return this;
        }

        public byte[] read(String name) { return inner.read(name); }
        public void write(String name, byte[] bytes) { inner.write(name, bytes); }
        public void delete(String name) { inner.delete(name); }
        public List<String> names() { return inner.names(); }
        public long bytesUsed() { return inner.bytesUsed(); }
        public long quota() { return inner.quota(); }
    }

    @Test
    @Tag("MEM-5")
    @DisplayName("near the quota, seeds of the least recently fought profiles go first")
    void evictsLeastRecentlyFoughtSeeds() {
        OpponentProfile oldest = Profiles.sample("a.Oldest", 1, 600, 300);
        OpponentProfile middle = Profiles.sample("b.Middle", 2, 600, 300);
        OpponentProfile newest = Profiles.sample("c.Newest", 3, 600, 300);
        int full = ProfileCodec.encode(oldest).length;
        // Room for three seeded profiles while saving, but not a fourth.
        MemoryProfileStore store = new MemoryProfileStore((long) ((4 * full + 200) / ProfileLibrary.EVICT_AT));
        ProfileLibrary lib = new ProfileLibrary(store);
        lib.save(newest);
        lib.save(oldest);
        lib.save(middle);
        assertEquals(0, lib.seedsEvicted());

        OpponentProfile incoming = Profiles.sample("d.Incoming", 4, 600, 300);
        assertEquals(ProfileLibrary.Saved.WRITTEN, lib.save(incoming));
        assertTrue(lib.seedsEvicted() >= 1);
        assertEquals(0, stored(store, "a.Oldest").gunSeedSize(), "least recently fought loses its seeds");
        assertEquals(600, stored(store, "c.Newest").gunSeedSize(), "most recent keeps them");
        assertEquals(600, stored(store, "d.Incoming").gunSeedSize());
        assertEquals(1, stored(store, "a.Oldest").rounds(), "stats are kept");
        assertTrue(store.bytesUsed() <= store.quota() * ProfileLibrary.EVICT_AT);
    }

    @Test
    @Tag("MEM-5")
    @DisplayName("a 2 KB store keeps stats only, then skips writes it cannot fit")
    void tinyQuota() {
        MemoryProfileStore store = new MemoryProfileStore(2048);
        ProfileLibrary lib = new ProfileLibrary(store);
        assertEquals(ProfileLibrary.Saved.WRITTEN_WITHOUT_SEEDS,
            lib.save(Profiles.sample("a.Seeded", 1, 50, 50)));
        assertEquals(0, stored(store, "a.Seeded").gunSeedSize());
        ProfileLibrary.Saved s = ProfileLibrary.Saved.WRITTEN;
        for (int i = 0; i < 10 && s != ProfileLibrary.Saved.SKIPPED; i++) {
            s = lib.save(Profiles.sample("b.Bot" + i, 2 + i, 0, 0));
        }
        assertEquals(ProfileLibrary.Saved.SKIPPED, s);
        assertEquals(1, lib.skippedWrites());
        assertTrue(store.bytesUsed() <= 2048);
    }

    @Test
    @Tag("MEM-6")
    @DisplayName("MEM-6: filling the quota with plain profiles empties every seed before any write is skipped")
    void skipOnlyAfterEveryonesSeedsAreGone() {
        OpponentProfile seeded = Profiles.sample("z.Sample", 1, 600, 300);
        int full = ProfileCodec.encode(seeded).length;
        // Room for two seeded profiles, generously, while nothing else competes for it.
        MemoryProfileStore store = new MemoryProfileStore((long) Math.ceil((3L * full + 200) / ProfileLibrary.EVICT_AT));
        ProfileLibrary lib = new ProfileLibrary(store);
        lib.save(Profiles.sample("a.First", 1, 600, 300));
        lib.save(Profiles.sample("b.Second", 2, 600, 300));
        // Room for both, with no eviction forced yet.
        assertTrue(stored(store, "a.First").gunSeedSize() > 0 || stored(store, "b.Second").gunSeedSize() > 0,
            "at least one still has seeds before the store is crowded");

        // Crowd the store with plain, seedless profiles until a write is finally skipped.
        ProfileLibrary.Saved s = ProfileLibrary.Saved.WRITTEN;
        for (int i = 0; i < 20_000 && s != ProfileLibrary.Saved.SKIPPED; i++) {
            s = lib.save(Profiles.sample("c.Bot" + i, 3 + i, 0, 0));
        }
        assertEquals(ProfileLibrary.Saved.SKIPPED, s, "the quota should eventually run out");

        // MEM-6: by the time a write is skipped, eviction has already taken every seed
        // there was to take, from both of the profiles that started with any.
        assertEquals(0, stored(store, "a.First").gunSeedSize(), "nobody keeps seeds before a skip");
        assertEquals(0, stored(store, "b.Second").gunSeedSize());
    }

    @Test
    @DisplayName("a lost battle clock is rebuilt from the profiles")
    void clockRecovers() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        for (int i = 0; i < 3; i++) battle(store, "sample.SpinBot");
        store.delete(ProfileLibrary.CLOCK);
        OpponentProfile p = new ProfileLibrary(store).load("sample.Other").profile();
        assertEquals(4, p.lastFought(), "one past the highest stamp in the store");
    }

    @Test
    @Tag("MEM-1")
    @DisplayName("preparing before the first tick writes nothing and changes no load")
    void prepareIsInvisible() {
        MemoryProfileStore plain = new MemoryProfileStore(QUOTA);
        MemoryProfileStore prepared = new MemoryProfileStore(QUOTA);
        for (int i = 0; i < 3; i++) {
            battle(plain, "abc.Shadow 3.83c");
            battle(prepared, "abc.Shadow 3.83c");
        }
        prepared.delete(ProfileLibrary.CLOCK);
        plain.delete(ProfileLibrary.CLOCK);
        int writes = prepared.writes();
        ProfileLibrary lib = new ProfileLibrary(prepared);
        lib.prepare();
        assertEquals(writes, prepared.writes(), "prepare only reads");
        ProfileLibrary.Loaded a = new ProfileLibrary(plain).load("abc.Shadow 3.83c");
        ProfileLibrary.Loaded b = lib.load("abc.Shadow 3.83c");
        assertEquals(a.profile(), b.profile(), "same battle number, even with the clock lost");
        assertTrue(b.found());
    }

    static OpponentProfile stored(MemoryProfileStore store, String key) {
        return ProfileCodec.decode(store.read(ProfileLibrary.fileName(key)));
    }
}
