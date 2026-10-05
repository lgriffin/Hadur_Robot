package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.melee.MeleeProfile;
import hadur2.core.melee.MeleeProfileCodec;
import hadur2.core.melee.MeleeProfileFolder;
import hadur2.core.memory.LineageKey;
import hadur2.core.memory.ProfileLibrary;
import hadur2.core.port.MemoryProfileStore;
import hadur2.core.port.ProfileStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The melee blocks in the profile store (MMEM-1): beside the 1v1 profiles, safe and bounded. */
class MeleeMemoryTest {

    static final String SHADOW = "abc.Shadow 3.83c";

    /** One round in which {@code names} were each scanned and fired {@code shots} times. */
    static MeleeProfileFolder round(int shots, String... names) {
        MeleeProfileFolder f = new MeleeProfileFolder();
        for (String n : names) {
            f.scanned(n, 400);
            for (int i = 0; i < shots; i++) f.shotInferred(n, 2.0);
        }
        return f;
    }

    /** A block for {@code key} last fought in battle {@code stamp}, as bytes. */
    static byte[] block(String key, long stamp) {
        MeleeProfile p = new MeleeProfile(key);
        round(1, key).foldInto(key, p, 3, stamp);
        return MeleeProfileCodec.encode(p);
    }

    static long hmBytes(MemoryProfileStore store) {
        long total = 0;
        for (String n : store.names()) {
            if (n.endsWith(".hm")) total += store.read(n).length;
        }
        return total;
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("a block is written beside the opponent's 1v1 profile and found next battle")
    void besideTheProfile() {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        ProfileLibrary library = new ProfileLibrary(store);
        library.save(library.load(SHADOW).profile());
        byte[] hp = store.read(ProfileLibrary.fileName("abc.Shadow"));

        MeleeMemory first = new MeleeMemory(store);
        first.prepare();
        assertEquals(1, first.battle());
        assertFalse(first.load("abc.Shadow 3.84").found);
        first.foldRound(round(4, "abc.Shadow 3.84", "x.Other 1"), 5);
        first.saveAll();

        // MEM-9 namespaces 1v1 profiles by format version; melee blocks are not versioned
        // and keep the plain stem, so the two names share a stem but not a naming scheme.
        String hm = LineageKey.fileStem("abc.Shadow") + ".hm";
        assertTrue(ProfileLibrary.fileName("abc.Shadow").startsWith(LineageKey.fileStem("abc.Shadow")));
        assertNotNull(store.read(hm));
        assertNotNull(store.read(LineageKey.fileStem("x.Other") + ".hm"));
        assertArrayEquals(hp, store.read(ProfileLibrary.fileName("abc.Shadow")), "the 1v1 profile is untouched");
        assertTrue(store.names().stream().noneMatch(n -> n.endsWith(".tmp")), store.names().toString());

        MeleeMemory next = new MeleeMemory(store);
        assertEquals(2, next.battle());
        MeleeMemory.Loaded l = next.load(SHADOW);
        assertTrue(l.found);
        assertEquals(4, l.profile.shotsInferred(), 1e-9);
        assertEquals(1, l.profile.lastFought());
        assertTrue(l == next.load("abc.Shadow 9"), "loaded once a battle");
        assertEquals(0, next.loadFailures());
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("a write cut short leaves the old block or the complete new one")
    void tornWrites() {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        MeleeMemory first = new MeleeMemory(store);
        first.foldRound(round(1, "a.A"), 3);
        first.saveAll();
        String file = MeleeMemory.fileName("a.A");

        // Killed while writing the temporary copy: the old block stands.
        MeleeMemory second = new MeleeMemory(store);
        second.foldRound(round(5, "a.A"), 3);
        store.crashAfter(10);
        second.saveAll();
        assertEquals(1, second.saveFailures());
        assertEquals(1, new MeleeMemory(store).load("a.A").profile.shotsInferred(), 1e-9);

        // Killed while writing the block itself: the complete copy is read.
        byte[] newer = block("a.A", 9);
        store.write(file + ".tmp", newer);
        store.write(file, Arrays.copyOf(newer, 12));
        MeleeMemory third = new MeleeMemory(store);
        MeleeMemory.Loaded l = third.load("a.A");
        assertTrue(l.found);
        assertEquals(9, l.profile.lastFought());
        assertEquals(0, third.loadFailures());

        // Both damaged: a stranger, and the failure counted.
        store.write(file + ".tmp", Arrays.copyOf(newer, 5));
        MeleeMemory fourth = new MeleeMemory(store);
        assertFalse(fourth.load("a.A").found);
        assertEquals(1, fourth.loadFailures());
    }

    @Test
    @Tag("MMEM-1")
    @Tag("SHELF-4")
    @DisplayName("all blocks stay under 16 KB: the least recently fought go first, 1v1 data never")
    void capEvictsOldestBlocks() {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        store.write("keep.hp", new byte[3000]);
        String pad = "p".repeat(100);
        for (int i = 1; i <= 70; i++) {
            String key = "old" + i + "." + pad;
            store.write(MeleeMemory.fileName(key), block(key, i));
        }
        store.write(MeleeMemory.fileName("junk"), new byte[] {1, 2, 3});
        assertTrue(hmBytes(store) > MeleeMemory.CAP);

        MeleeMemory m = new MeleeMemory(store);
        assertEquals(71, m.battle());
        m.foldRound(round(2, "new.Robot"), 3);
        m.saveAll();
        assertTrue(hmBytes(store) <= MeleeMemory.CAP, "hm bytes " + hmBytes(store));
        assertTrue(m.evicted() > 0);
        assertNotNull(store.read(MeleeMemory.fileName("new.Robot")));
        assertNotNull(store.read(MeleeMemory.fileName("old70." + pad)), "the newest old block stays");
        assertEquals(null, store.read(MeleeMemory.fileName("old1." + pad)), "the oldest goes");
        assertEquals(null, store.read(MeleeMemory.fileName("junk")), "a damaged block goes first");
        assertEquals(3000, store.read("keep.hp").length);
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("a write that would pass 90% of the quota is skipped and counted")
    void quotaSkips() {
        MemoryProfileStore store = new MemoryProfileStore(1000);
        store.write("big.hp", new byte[850]);
        MeleeMemory m = new MeleeMemory(store);
        m.foldRound(round(1, "a.A"), 3);
        m.saveAll();
        assertEquals(1, m.skippedWrites());
        assertEquals(0, m.saveFailures());
        assertEquals(List.of("big.hp"), store.names());
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("a store that throws costs counts, never an exception")
    void throwingStore() {
        ProfileStore broken = new ProfileStore() {
            @Override public byte[] read(String name) { throw new IllegalStateException("read"); }
            @Override public void write(String name, byte[] bytes) { throw new IllegalStateException("write"); }
            @Override public void delete(String name) { throw new IllegalStateException("delete"); }
            @Override public List<String> names() { throw new IllegalStateException("names"); }
            @Override public long bytesUsed() { throw new IllegalStateException("bytesUsed"); }
            @Override public long quota() { throw new IllegalStateException("quota"); }
        };
        MeleeMemory m = new MeleeMemory(broken);
        m.prepare();
        assertFalse(m.load("a.A").found);
        assertEquals(1, m.loadFailures());
        m.foldRound(round(1, "a.A", "b.B"), 3);
        m.saveAll();
        assertEquals(2, m.saveFailures());
        m.saveAll();
        assertEquals(4, m.saveFailures(), "a failed block is tried again");
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("a save skipped for quota deletes nothing, and goes through once there is room")
    void skipDeletesNothingAndRetries() {
        // Old blocks just over the cap, in a store all but full: evicting to the cap would
        // free too little for the write to stay under 90% of the quota.
        String pad = "p".repeat(100);
        List<byte[]> blocks = new ArrayList<>();
        List<String> keys = new ArrayList<>();
        long h = 0;
        for (int i = 1; h <= MeleeMemory.CAP + 500; i++) {
            String key = "old" + i + "." + pad;
            byte[] b = block(key, i);
            keys.add(key);
            blocks.add(b);
            h += b.length;
        }
        long quota = h + 2000;
        MemoryProfileStore store = new MemoryProfileStore(quota);
        for (int i = 0; i < keys.size(); i++) store.write(MeleeMemory.fileName(keys.get(i)), blocks.get(i));
        store.write("big.hp", new byte[(int) (quota - h - 100)]);
        long hmBefore = hmBytes(store);

        MeleeMemory m = new MeleeMemory(store);
        m.foldRound(round(2, "new.Robot"), 3);
        m.saveAll();
        assertEquals(1, m.skippedWrites());
        assertEquals(0, m.evicted(), "nothing evicted for a write that did not happen");
        assertEquals(hmBefore, hmBytes(store));
        assertNull(store.read(MeleeMemory.fileName("new.Robot")));

        // Room again: the block was kept pending, so the next checkpoint writes it.
        store.delete("big.hp");
        m.saveAll();
        assertNotNull(store.read(MeleeMemory.fileName("new.Robot")));
        assertTrue(hmBytes(store) <= MeleeMemory.CAP, "hm bytes " + hmBytes(store));
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("blocks fought this battle are never evicted, and never pass the cap together")
    void thisBattleNeverPassesTheCap() {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        String pad = "q".repeat(120);
        String[] names = new String[MeleeMemory.MAX_BLOCKS];
        for (int i = 0; i < names.length; i++) names[i] = "bot" + i + "." + pad;
        MeleeMemory m = new MeleeMemory(store);
        m.foldRound(round(3, names), names.length);
        m.saveAll();
        assertTrue(hmBytes(store) <= MeleeMemory.CAP, "hm bytes " + hmBytes(store));
        assertTrue(m.skippedWrites() > 0, "the blocks that do not fit are skipped");
        assertEquals(0, m.evicted());
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("a file holding another opponent's block is never overwritten")
    void collisionKeepsTheOtherBlock() {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        // As if "z.Z" and "a.A" shared a file name: the file holds z.Z's block.
        byte[] theirs = block("z.Z", 1);
        store.write(MeleeMemory.fileName("a.A"), theirs);
        MeleeMemory m = new MeleeMemory(store);
        assertFalse(m.load("a.A").found, "another key's block reads as a stranger");
        m.foldRound(round(1, "a.A"), 3);
        m.saveAll();
        assertEquals(1, m.collisions());
        assertArrayEquals(theirs, store.read(MeleeMemory.fileName("a.A")));
        m.saveAll();
        assertEquals(1, m.collisions(), "refused once, not retried");
    }
}
