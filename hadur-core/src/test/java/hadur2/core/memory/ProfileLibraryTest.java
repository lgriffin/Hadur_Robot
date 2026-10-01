package hadur2.core.memory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
        OpponentProfile p = Profiles.seedWorthy("sample.Crazy", 5, 10, 10);
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
        OpponentProfile old = Profiles.seedWorthy("abc.Shadow 3.83c", 3, 20, 5);
        OpponentProfile next = Profiles.seedWorthy("abc.Shadow 3.83c", 4, 25, 6);
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
        public long size(String name) { return inner.size(name); }
        public long lastModified(String name) { return inner.lastModified(name); }
    }

    @Test
    @Tag("MEM-5")
    @DisplayName("near the quota, seeds of the least recently fought profiles go first")
    void evictsLeastRecentlyFoughtSeeds() {
        OpponentProfile oldest = Profiles.seedWorthy("a.Oldest", 1, 600, 300);
        OpponentProfile middle = Profiles.seedWorthy("b.Middle", 2, 600, 300);
        OpponentProfile newest = Profiles.seedWorthy("c.Newest", 3, 600, 300);
        int full = ProfileCodec.encode(oldest).length;
        // Room for three seeded profiles while saving, but not a fourth. Four is still
        // within MEM-8's five-opponent cap, so only the quota (MEM-5) forces this eviction.
        MemoryProfileStore store = new MemoryProfileStore((long) ((4 * full + 200) / ProfileLibrary.EVICT_AT));
        ProfileLibrary lib = new ProfileLibrary(store);
        lib.save(newest);
        lib.save(oldest);
        lib.save(middle);
        assertEquals(0, lib.seedsEvicted());

        OpponentProfile incoming = Profiles.seedWorthy("d.Incoming", 4, 600, 300);
        assertEquals(ProfileLibrary.Saved.WRITTEN, lib.save(incoming));
        assertTrue(lib.seedsEvicted() >= 1);
        assertEquals(0, stored(store, "a.Oldest").gunSeedSize(), "least recently fought loses its seeds");
        assertEquals(600, stored(store, "c.Newest").gunSeedSize(), "most recent keeps them");
        assertEquals(600, stored(store, "d.Incoming").gunSeedSize());
        assertEquals(2, stored(store, "a.Oldest").rounds(), "stats are kept");
        assertTrue(store.bytesUsed() <= store.quota() * ProfileLibrary.EVICT_AT);
    }

    @Test
    @Tag("MEM-5")
    @Tag("MEM-13")
    @DisplayName("a 2 KB store keeps stats only, and forgets old opponents rather than skip a write")
    void tinyQuota() {
        MemoryProfileStore store = new MemoryProfileStore(2048);
        ProfileLibrary lib = new ProfileLibrary(store);
        assertEquals(ProfileLibrary.Saved.WRITTEN_WITHOUT_SEEDS,
            lib.save(Profiles.sample("a.Seeded", 1, 50, 50)));
        assertEquals(0, stored(store, "a.Seeded").gunSeedSize());
        for (int i = 0; i < 10; i++) {
            assertEquals(ProfileLibrary.Saved.WRITTEN, lib.save(Profiles.sample("b.Bot" + i, 2 + i, 0, 0)));
        }
        assertEquals(0, lib.skippedWrites());
        assertTrue(lib.profilesForgotten() > 0, "the oldest went to make room");
        assertNull(store.read(ProfileLibrary.fileName("a.Seeded")), "the first written is the first forgotten");
        assertNotNull(store.read(ProfileLibrary.fileName("b.Bot9")), "the newest is kept");
        assertTrue(store.bytesUsed() <= 2048 * ProfileLibrary.EVICT_AT);
    }

    @Test
    @Tag("MEM-5")
    @DisplayName("a store too small for even one profile's stats skips the write")
    void quotaBelowOneProfile() {
        MemoryProfileStore store = new MemoryProfileStore(300);
        ProfileLibrary lib = new ProfileLibrary(store);
        assertEquals(ProfileLibrary.Saved.SKIPPED, lib.save(Profiles.sample("a.Bot", 1, 0, 0)));
        assertEquals(1, lib.skippedWrites());
        assertEquals(0, store.bytesUsed());
    }

    @Test
    @Tag("TIME-4")
    @DisplayName("TIME-4: a stats-only save carries over whatever seeds are already on disk, never erasing them")
    void statsOnlySaveKeepsStoredSeeds() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        ProfileLibrary lib = new ProfileLibrary(store);
        lib.save(Profiles.seedWorthy("a.Seeded", 1, 50, 30));
        assertEquals(50, stored(store, "a.Seeded").gunSeedSize());

        // A checkpoint's profile object carries no seeds of its own here (as a freshly
        // loaded one would, before any seed replay); the seeds already on disk from the
        // earlier full save must still be there afterward, not erased.
        OpponentProfile checkpointProfile = Profiles.seedWorthy("a.Seeded", 2, 0, 0);
        assertEquals(ProfileLibrary.Saved.WRITTEN, lib.saveStatsOnly(checkpointProfile));
        assertEquals(50, stored(store, "a.Seeded").gunSeedSize(),
            "the stats-only save must not erase stored seeds");
        assertEquals(30, stored(store, "a.Seeded").surfSeedSize());
        assertEquals(0, checkpointProfile.gunSeedSize(), "the caller's own profile is untouched");
    }

    @Test
    @Tag("TIME-4")
    @DisplayName("TIME-4: a stats-only save of a profile with nothing stored yet writes no seeds")
    void statsOnlySaveOfNewProfileHasNoSeeds() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        ProfileLibrary lib = new ProfileLibrary(store);
        OpponentProfile fresh = Profiles.sample("b.Fresh", 1, 40, 20);
        assertEquals(ProfileLibrary.Saved.WRITTEN, lib.saveStatsOnly(fresh));
        assertEquals(0, stored(store, "b.Fresh").gunSeedSize());
        assertEquals(0, stored(store, "b.Fresh").surfSeedSize());
        assertEquals(40, fresh.gunSeedSize(), "the caller's own profile keeps its seeds in memory");
    }

    @Test
    @Tag("MEM-7")
    @DisplayName("MEM-7: a library built with an older write version writes every save, eviction included, at it")
    void writeVersionAppliesToEverySave() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        ProfileLibrary lib = new ProfileLibrary(store, ProfileCodec.OLDEST_VERSION);
        lib.save(Profiles.sample("a.Old", 1, 4, 2));
        byte[] bytes = store.read(ProfileLibrary.fileName("a.Old", ProfileCodec.OLDEST_VERSION));
        assertEquals((byte) ProfileCodec.OLDEST_VERSION, bytes[2]);
        // The oldest version has no defined seed layout, so a plain decode drops them,
        // exactly as it would for a real version-1 file.
        assertEquals(0, ProfileCodec.decode(bytes).gunSeedSize());
    }

    @Test
    @Tag("MEM-6")
    @DisplayName("MEM-6: filling the quota with plain profiles empties every seed before any write is skipped")
    void skipOnlyAfterEveryonesSeedsAreGone() {
        OpponentProfile seeded = Profiles.seedWorthy("z.Sample", 1, 600, 300);
        int full = ProfileCodec.encode(seeded).length;
        // Room for two seeded profiles, generously, while nothing else competes for it.
        MemoryProfileStore store = new MemoryProfileStore((long) Math.ceil((3L * full + 200) / ProfileLibrary.EVICT_AT));
        ProfileLibrary lib = new ProfileLibrary(store);
        lib.save(Profiles.seedWorthy("a.First", 1, 600, 300));
        lib.save(Profiles.seedWorthy("b.Second", 2, 600, 300));
        // Room for both, with no eviction forced yet.
        assertTrue(stored(store, "a.First").gunSeedSize() > 0 || stored(store, "b.Second").gunSeedSize() > 0,
            "at least one still has seeds before the store is crowded");

        // Crowd the store with plain, seedless profiles until a profile is first forgotten
        // (MEM-13, which since R8 stands where a skipped write used to).
        for (int i = 0; i < 20_000 && lib.profilesForgotten() == 0; i++) {
            assertEquals(ProfileLibrary.Saved.WRITTEN, lib.save(Profiles.sample("c.Bot" + i, 3 + i, 0, 0)));
        }
        assertTrue(lib.profilesForgotten() > 0, "the quota should eventually run out");
        assertEquals(0, lib.skippedWrites());

        // MEM-6: by the time anything is forgotten, eviction has already taken every seed
        // there was to take, from both of the profiles that started with any.
        for (String key : List.of("a.First", "b.Second")) {
            byte[] b = store.read(ProfileLibrary.fileName(key));
            assertTrue(b == null || ProfileCodec.decode(b).gunSeedSize() == 0, key + " keeps no seeds");
        }
    }

    @Test
    @Tag("MEM-8")
    @DisplayName("MEM-8: a decisively won profile keeps its stats but never its seeds")
    void oneSidedProfileKeepsNoSeeds() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        ProfileLibrary lib = new ProfileLibrary(store);
        // Profiles.sample is a single, decisively-won battle: not seed-worthy either way.
        assertEquals(ProfileLibrary.Saved.WRITTEN_WITHOUT_SEEDS, lib.save(Profiles.sample("a.Easy", 1, 50, 50)));
        assertEquals(0, stored(store, "a.Easy").gunSeedSize());
        assertTrue(stored(store, "a.Easy").rounds() > 0, "the stats are still kept");
    }

    @Test
    @Tag("MEM-8")
    @DisplayName("MEM-8: a profile met only once is not worth seeding yet, even a losing one")
    void metOnceIsNotYetSeedWorthy() {
        // One battle, lost outright (all their damage, none of ours): a score share of 0,
        // well under 60%, but still only one battle.
        OpponentProfile metOnce = new OpponentProfile(LineageKey.of("b.OnceOnly"));
        metOnce.startBattle("b.OnceOnly", 1);
        ProfileFolder folder = new ProfileFolder(metOnce, 800, 600);
        folder.hitByEnemy(200, true, 10);
        folder.fold(false);
        metOnce.addGunSample(Profiles.sampleValues(1));
        metOnce.addSurfSample(Profiles.sampleValues(2));
        assertEquals(1, metOnce.battles());

        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        assertEquals(ProfileLibrary.Saved.WRITTEN_WITHOUT_SEEDS, new ProfileLibrary(store).save(metOnce));
    }

    @Test
    @Tag("MEM-8")
    @DisplayName("MEM-8: a profile never had seeds still just WRITES, not WRITTEN_WITHOUT_SEEDS")
    void seedlessProfileIsPlainlyWritten() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        assertEquals(ProfileLibrary.Saved.WRITTEN,
            new ProfileLibrary(store).save(Profiles.sample("a.NoSeeds", 1, 0, 0)));
    }

    @Test
    @Tag("MEM-8")
    @DisplayName("MEM-8: seeds are kept for at most five opponents, quota aside")
    void atMostFiveSeededOpponents() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        ProfileLibrary lib = new ProfileLibrary(store);
        for (int i = 0; i < ProfileLibrary.MAX_SEEDED; i++) {
            lib.save(Profiles.seedWorthy("a.Bot" + i, i + 1, 50, 50));
        }
        long withSeeds = 0;
        for (int i = 0; i < ProfileLibrary.MAX_SEEDED; i++) {
            if (stored(store, "a.Bot" + i).gunSeedSize() > 0) withSeeds++;
        }
        assertEquals(ProfileLibrary.MAX_SEEDED, withSeeds, "room for all five, well within quota");

        // A sixth, more recent seed-worthy opponent bumps the least recently fought one.
        lib.save(Profiles.seedWorthy("a.Bot" + ProfileLibrary.MAX_SEEDED, ProfileLibrary.MAX_SEEDED + 1, 50, 50));
        withSeeds = 0;
        for (int i = 0; i <= ProfileLibrary.MAX_SEEDED; i++) {
            if (stored(store, "a.Bot" + i).gunSeedSize() > 0) withSeeds++;
        }
        assertEquals(ProfileLibrary.MAX_SEEDED, withSeeds, "still at most five, not six");
        assertEquals(0, stored(store, "a.Bot0").gunSeedSize(), "the least recently fought lost its seeds");
        assertTrue(stored(store, "a.Bot" + ProfileLibrary.MAX_SEEDED).gunSeedSize() > 0, "the newest keeps them");
    }

    @Test
    @Tag("MEM-9")
    @DisplayName("MEM-9: a save never overwrites another version's file, each keeps its own")
    void versionsAreNamespaced() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        new ProfileLibrary(store, ProfileCodec.OLDEST_VERSION).save(Profiles.sample("a.Bot", 1, 5, 5));
        byte[] oldFile = store.read(ProfileLibrary.fileName("a.Bot", ProfileCodec.OLDEST_VERSION));
        assertNotNull(oldFile);

        // The current version's library carries the older one's stats forward (once, no
        // seeds), then saves — its own save must not touch the older version's file.
        ProfileLibrary current = new ProfileLibrary(store);
        ProfileLibrary.Loaded loaded = current.load("a.Bot");
        assertTrue(loaded.found(), "the older version's stats carry forward");
        assertEquals(0, current.loadFailures());
        current.save(loaded.profile());
        assertArrayEquals(oldFile, store.read(ProfileLibrary.fileName("a.Bot", ProfileCodec.OLDEST_VERSION)),
            "the older version's own file is untouched");
        assertNotNull(store.read(ProfileLibrary.fileName("a.Bot", ProfileCodec.VERSION)),
            "the current version now has its own file too");
    }

    @Test
    @Tag("MEM-9")
    @DisplayName("MEM-9: a newer version carries an older version's stats forward once, seeds dropped")
    void carriesStatsForwardAcrossVersions() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        OpponentProfile old = Profiles.seedWorthy("a.Bot", 3, 50, 50);
        new ProfileLibrary(store, ProfileCodec.OLDEST_VERSION).save(old);

        ProfileLibrary.Loaded loaded = new ProfileLibrary(store).load("a.Bot");
        assertTrue(loaded.found(), "the older version's stats carry forward");
        assertEquals(old.rounds(), loaded.profile().rounds(), "rounds carried over");
        assertEquals(0, loaded.profile().gunSeedSize(), "seeds do not carry across a format version");
        assertEquals(0, loaded.profile().surfSeedSize());
    }

    @Test
    @Tag("MEM-9")
    @DisplayName("MEM-9: short of quota, another version's files are deleted, oldest fought first")
    void cleansUpOtherVersionsWhenShort() {
        // Written directly, at the older version, so the store starts already short of
        // quota — MEM-5's own eviction inside a save() is a different mechanism.
        OpponentProfile older = Profiles.sample("a.Old", 1, 0, 0);
        OpponentProfile newer = Profiles.sample("b.Newer", 2, 0, 0);
        byte[] olderBytes = ProfileCodec.encode(older, ProfileCodec.OLDEST_VERSION);
        byte[] newerBytes = ProfileCodec.encode(newer, ProfileCodec.OLDEST_VERSION);
        MemoryProfileStore store = new MemoryProfileStore(olderBytes.length + newerBytes.length + 20);
        store.write(ProfileLibrary.fileName("a.Old", ProfileCodec.OLDEST_VERSION), olderBytes);
        store.write(ProfileLibrary.fileName("b.Newer", ProfileCodec.OLDEST_VERSION), newerBytes);
        assertTrue(store.bytesUsed() > store.quota() * ProfileLibrary.EVICT_AT);

        // A current-version library preparing for its first battle, short of quota, cleans
        // up the older version's files before writing anything of its own.
        new ProfileLibrary(store).prepare();
        assertNull(store.read(ProfileLibrary.fileName("a.Old", ProfileCodec.OLDEST_VERSION)),
            "the least recently fought old-version file is gone");
        assertNotNull(store.read(ProfileLibrary.fileName("b.Newer", ProfileCodec.OLDEST_VERSION)),
            "the more recently fought one is not touched unless it too must go");
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

    @Test
    @Tag("MEM-13")
    @DisplayName("MEM-13: a full store forgets the least recently written opponents, whole, and always writes")
    void fullStoreForgetsOldest() {
        MemoryProfileStore store = new MemoryProfileStore(20_000);
        ProfileLibrary lib = new ProfileLibrary(store);
        int n = 0;
        while (store.bytesUsed() < 20_000 * ProfileLibrary.EVICT_AT - 600) {
            lib.save(Profiles.sample("a.Bot" + n, n + 1, 0, 0));
            n++;
        }
        // Make a late one look oldest: the order is the store's write time, not the name.
        String late = ProfileLibrary.fileName("a.Bot" + (n - 1));
        store.touch(late, 0);
        int before = store.names().size();
        for (int i = 0; i < 5; i++) {
            assertEquals(ProfileLibrary.Saved.WRITTEN, lib.save(Profiles.sample("b.New" + i, 1000 + i, 0, 0)));
        }
        assertTrue(lib.profilesForgotten() >= 3, "forgot " + lib.profilesForgotten());
        assertNull(store.read(late), "the least recently written goes first");
        assertNull(store.read(ProfileLibrary.fileName("a.Bot0")));
        assertTrue(store.read(ProfileLibrary.fileName("a.Bot" + (n - 2))) != null, "recent ones stay");
        assertTrue(store.bytesUsed() <= 20_000 * ProfileLibrary.EVICT_AT);
        assertTrue(store.names().size() <= before + 5);
        assertTrue(lib.lastNote().startsWith("forgot "), lib.lastNote());
    }

    @Test
    @Tag("MEM-12")
    @Tag("MEM-11")
    @DisplayName("MEM-11/12: saves into a store of hundreds of stats-only profiles read no other profile")
    void savesDoNotReadEveryProfile() {
        MemoryProfileStore inner = new MemoryProfileStore(100_000);
        ProfileLibrary filler = new ProfileLibrary(inner);
        for (int i = 0; i < 300; i++) filler.save(Profiles.sample("a.Bot" + i, i + 1, 0, 0));
        assertTrue(inner.bytesUsed() > 0.6 * 100_000, "a crowded store: " + inner.bytesUsed());
        int[] reads = {0};
        ProfileStore counting = new DelegatingStore(inner) {
            @Override public byte[] read(String name) { reads[0]++; return inner.read(name); }
        };
        ProfileLibrary lib = new ProfileLibrary(counting);
        lib.prepare();
        reads[0] = 0;
        // A new seed holder (runs MEM-8's cap) and a plain save, then a full store's save
        // (runs MEM-5's eviction and MEM-13's forgetting).
        lib.save(Profiles.seedWorthy("b.Hard", 400, 600, 300));
        lib.save(Profiles.sample("c.Plain", 401, 0, 0));
        assertTrue(reads[0] <= 4, "reads " + reads[0]);
        for (int i = 0; i < 300; i++) lib.save(Profiles.seedWorthy("d.Hard" + i, 500 + i, 600, 300));
        assertTrue(lib.profilesForgotten() > 0);
        assertEquals(0, lib.skippedWrites());
        assertTrue(reads[0] < 300 * 12, "reads " + reads[0] + " grew with the store");
    }

    static OpponentProfile stored(MemoryProfileStore store, String key) {
        return ProfileCodec.decode(store.read(ProfileLibrary.fileName(key)));
    }

    @Test
    @Tag("MEM-9")
    @DisplayName("MEM-9: a profile written before versioned names carries forward, seeds dropped")
    void carriesForwardAnUnversionedProfile() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        OpponentProfile old = Profiles.seedWorthy("a.Legacy", 3, 50, 50);
        store.write(LineageKey.fileStem(old.key()) + ProfileLibrary.PROFILE_SUFFIX, ProfileCodec.encode(old));

        ProfileLibrary lib = new ProfileLibrary(store);
        ProfileLibrary.Loaded loaded = lib.load("a.Legacy");
        assertTrue(loaded.found(), "the pre-R5 file's stats carry forward");
        assertEquals(old.rounds(), loaded.profile().rounds());
        assertEquals(0, loaded.profile().gunSeedSize());
        assertEquals(0, lib.loadFailures());
    }

    @Test
    @Tag("MEM-9")
    @DisplayName("MEM-9: a damaged file from another version is no failed load")
    void damagedOtherVersionIsNotAFailure() {
        MemoryProfileStore store = new MemoryProfileStore(QUOTA);
        store.write(ProfileLibrary.fileName("a.Bot", ProfileCodec.OLDEST_VERSION), new byte[] {1, 2, 3});
        ProfileLibrary lib = new ProfileLibrary(store);
        ProfileLibrary.Loaded loaded = lib.load("a.Bot");
        assertFalse(loaded.found());
        assertNull(loaded.failure());
        assertEquals(0, lib.loadFailures());
    }

    @Test
    @Tag("MEM-8")
    @DisplayName("MEM-8: a save that fails leaves the other opponents' seeds where they were")
    void failedSaveStripsNobody() {
        MemoryProfileStore inner = new MemoryProfileStore(QUOTA);
        ProfileLibrary lib = new ProfileLibrary(inner);
        for (int i = 0; i < ProfileLibrary.MAX_SEEDED; i++) {
            lib.save(Profiles.seedWorthy("a.Bot" + i, i + 1, 50, 50));
        }
        String sixth = ProfileLibrary.fileName(Profiles.seedWorthy("a.Sixth", 9, 50, 50).key());
        ProfileStore failing = new ProfileStore() {
            public byte[] read(String name) { return inner.read(name); }
            public void write(String name, byte[] bytes) {
                if (name.startsWith(sixth)) throw new IllegalStateException("disk full");
                inner.write(name, bytes);
            }
            public void delete(String name) { inner.delete(name); }
            public List<String> names() { return inner.names(); }
            public long bytesUsed() { return inner.bytesUsed(); }
            public long quota() { return inner.quota(); }
        };
        ProfileLibrary second = new ProfileLibrary(failing);
        assertEquals(ProfileLibrary.Saved.FAILED, second.save(Profiles.seedWorthy("a.Sixth", 9, 50, 50)));
        for (int i = 0; i < ProfileLibrary.MAX_SEEDED; i++) {
            assertTrue(stored(inner, "a.Bot" + i).gunSeedSize() > 0, "a.Bot" + i + " keeps its seeds");
        }
    }
}
