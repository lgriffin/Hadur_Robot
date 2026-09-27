package hadur2.core;

import hadur2.core.melee.MeleeProfile;
import hadur2.core.melee.MeleeProfileCodec;
import hadur2.core.melee.MeleeProfileFolder;
import hadur2.core.melee.MeleeProfileFormatException;
import hadur2.core.memory.LineageKey;
import hadur2.core.port.ProfileStore;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Loads and saves the opponents' melee profile blocks (MMEM-1) in the same
 * {@link ProfileStore} as the 1v1 profiles. Each block is its own file beside the
 * opponent's 1v1 profile: the same {@link LineageKey#fileStem} with {@link #SUFFIX} for
 * {@code .hp}. The 1v1 {@code ProfileLibrary} only ever reads, evicts or deletes {@code .hp}
 * files (and their temporary copies), so the two never touch each other's data, and this
 * class never deletes anything but a {@code .hm} file.
 *
 * <ul>
 * <li>A block is loaded once per opponent per battle, on its first scan. A missing block
 *     reads as a stranger; a damaged one, or a store that throws, also reads as a stranger
 *     and counts a load failure, as MEM-4 does for the 1v1 profile.</li>
 * <li>A save writes {@code <file>.tmp} first, then the block, then deletes the copy, and a
 *     load falls back to a complete copy, as RES-3 does for the 1v1 profile.</li>
 * <li>All blocks together stay under {@link #CAP} bytes: before a write that would pass it,
 *     the least recently fought other blocks are deleted, never one fought this battle. A
 *     write that would still pass the cap, or would take the store past {@link #EVICT_AT} of
 *     its quota, is skipped and counted instead, deleting nothing, so melee memory never
 *     costs a 1v1 profile its room; the block stays pending for the next checkpoint.</li>
 * <li>A file that holds another opponent's block (two keys on one file name) is never
 *     overwritten: the later opponent goes unsaved and reads as a stranger.</li>
 * <li>Blocks are stamped with a melee battle number: one more than the highest stamp in the
 *     store when the battle starts.</li>
 * </ul>
 *
 * <p>Nothing here throws: every failure becomes a counter and a note. It lives in the root
 * package because it is the one place that joins the melee's blocks to the memory's
 * lineage keys and the storage port.</p>
 */
final class MeleeMemory {

    static final String SUFFIX = ".hm";
    static final String TMP_SUFFIX = ".tmp";
    /** All melee blocks together take at most this many bytes. */
    static final long CAP = 16 * 1024;
    static final double EVICT_AT = 0.9;
    /** More opponents than any rumble melee; RES-2. */
    static final int MAX_BLOCKS = 64;

    /** A loaded block and whether it came from the store. */
    static final class Loaded {
        final MeleeProfile profile;
        final boolean found;

        Loaded(MeleeProfile profile, boolean found) {
            this.profile = profile;
            this.found = found;
        }
    }

    private final ProfileStore store;
    /** Blocks loaded this battle, by lineage key. */
    private final Map<String, Loaded> loaded = new LinkedHashMap<>();
    /** Keys folded since the last save. */
    private final Set<String> dirty = new TreeSet<>();
    private long battle = -1;
    private int loadFailures;
    private int saveFailures;
    private int skippedWrites;
    private int evicted;
    private int collisions;
    private String lastNote = "";

    MeleeMemory(ProfileStore store) {
        this.store = store;
    }

    int loadFailures() { return loadFailures; }
    int saveFailures() { return saveFailures; }
    int skippedWrites() { return skippedWrites; }
    /** Blocks deleted to keep all blocks under {@link #CAP}. */
    int evicted() { return evicted; }
    /** Saves refused because the file held another opponent's block (a file-name collision). */
    int collisions() { return collisions; }
    String lastNote() { return lastNote; }

    static String fileName(String key) {
        return LineageKey.fileStem(key) + SUFFIX;
    }

    /** Reads the battle stamp before the first tick, so a first scan reads one file. Never throws. */
    void prepare() {
        battle();
    }

    /** This battle's stamp: one more than any block in the store. */
    long battle() {
        if (battle < 0) {
            long max = 0;
            try {
                for (String name : store.names()) {
                    if (!name.endsWith(SUFFIX)) continue;
                    max = Math.max(max, MeleeProfileCodec.stampOf(store.read(name)));
                }
            } catch (RuntimeException e) {
                // No listing: count from zero.
            }
            battle = max + 1;
        }
        return battle;
    }

    /** Whether {@code exactName}'s block has been loaded this battle. */
    boolean isLoaded(String exactName) {
        return loaded.containsKey(LineageKey.of(exactName));
    }

    /** The block for {@code exactName}, loading it on the first call of the battle. Never throws. */
    Loaded load(String exactName) {
        String key = LineageKey.of(exactName);
        Loaded l = loaded.get(key);
        if (l != null) return l;
        MeleeProfile p = null;
        try {
            p = read(fileName(key), key);
        } catch (RuntimeException e) {
            loadFailures++;
            lastNote = "melee load " + key + ": " + describe(e);
        }
        l = new Loaded(p == null ? new MeleeProfile(key) : p, p != null);
        if (loaded.size() < MAX_BLOCKS) loaded.put(key, l);
        return l;
    }

    /**
     * The stored block: the main file if it checks out, else a complete temporary copy,
     * else null if neither exists. Throws when something exists but none of it is valid.
     */
    private MeleeProfile read(String file, String key) {
        byte[] main = store.read(file);
        byte[] tmp = store.read(file + TMP_SUFFIX);
        if (main == null && tmp == null) return null;
        RuntimeException damage = null;
        for (byte[] bytes : new byte[][] {main, tmp}) {
            if (bytes == null) continue;
            try {
                MeleeProfile p = MeleeProfileCodec.decode(bytes);
                // Another key that hashes to the same file: not ours, so a stranger.
                return p.key().equals(key) ? p : null;
            } catch (MeleeProfileFormatException e) {
                if (damage == null) damage = e;
            }
        }
        throw damage;
    }

    /**
     * MMEM-1: folds the round's observations of every opponent scanned in it into its
     * block, loading any not yet loaded. {@code opponents} is the battle's opponent count.
     */
    void foldRound(MeleeProfileFolder round, int opponents) {
        for (String name : round.scannedNames()) {
            Loaded l = load(name);
            round.foldInto(name, l.profile, opponents, battle());
            dirty.add(l.profile.key());
        }
    }

    /**
     * MMEM-1: writes every block folded since the last save. Never throws. A block that
     * failed or was skipped for room stays pending, and the next checkpoint tries it again.
     */
    void saveAll() {
        for (String key : new ArrayList<>(dirty)) {
            Loaded l = loaded.get(key);
            if (l == null || save(l.profile)) dirty.remove(key);
        }
    }

    /**
     * Writes one block. Returns true when it is done with (written, or refused because
     * another opponent's block holds the file), false when it should be tried again (a
     * failure, or no room). Nothing is deleted unless the write then goes ahead.
     */
    private boolean save(MeleeProfile p) {
        String file = fileName(p.key());
        try {
            if (heldByAnother(file, p.key())) {
                collisions++;
                lastNote = "melee kept " + file + ": it holds another opponent's block";
                return true;
            }
            byte[] bytes = MeleeProfileCodec.encode(p);
            List<String> evict = new ArrayList<>();
            long freed = planRoom(file, bytes.length, evict);
            if (freed < 0) {
                skippedWrites++;
                lastNote = "melee skipped " + p.key() + ": over the " + CAP + "-byte cap";
                return false;
            }
            long others = store.bytesUsed() - size(file) - size(file + TMP_SUFFIX) - freed;
            // While saving, the temporary copy and the block exist side by side.
            if (others + 2L * bytes.length > (long) Math.floor(store.quota() * EVICT_AT)) {
                skippedWrites++;
                lastNote = "melee skipped " + p.key() + ": " + bytes.length + " bytes do not fit";
                return false;
            }
            for (String block : evict) {
                store.delete(block);
                store.delete(block + TMP_SUFFIX);
                evicted++;
                lastNote = "melee evicted " + block;
            }
            store.write(file + TMP_SUFFIX, bytes);
            store.write(file, bytes);
            store.delete(file + TMP_SUFFIX);
            return true;
        } catch (RuntimeException e) {
            saveFailures++;
            lastNote = "melee save " + p.key() + ": " + describe(e);
            return false;
        }
    }

    /** Whether {@code file} holds a valid block of a key other than {@code key}: a stem collision. */
    private boolean heldByAnother(String file, String key) {
        byte[] main = store.read(file);
        if (main == null) return false;
        try {
            return !MeleeProfileCodec.decode(main).key().equals(key);
        } catch (MeleeProfileFormatException e) {
            // Damaged: ours to replace.
            return false;
        }
    }

    /**
     * Plans the room for {@code file} at {@code bytes} under {@link #CAP}: adds to
     * {@code evict} the least recently fought other blocks to delete (damaged ones first),
     * never one fought in this battle, and returns the bytes they free; -1 when even those
     * evictions would leave the blocks over the cap. Deletes nothing.
     */
    private long planRoom(String file, int bytes, List<String> evict) {
        List<String> others = new ArrayList<>();
        Map<String, Long> stamps = new LinkedHashMap<>();
        long total = bytes;
        for (String name : store.names()) {
            boolean main = name.endsWith(SUFFIX);
            if (!main && !name.endsWith(SUFFIX + TMP_SUFFIX)) continue;
            String block = main ? name : name.substring(0, name.length() - TMP_SUFFIX.length());
            if (block.equals(file)) continue;
            byte[] b = store.read(name);
            if (b == null) continue;
            total += b.length;
            if (!stamps.containsKey(block)) {
                stamps.put(block, MeleeProfileCodec.stampOf(store.read(block)));
                others.add(block);
            }
        }
        if (total <= CAP) return 0;
        others.sort(Comparator.comparingLong((String n) -> stamps.get(n)).thenComparing(n -> n));
        long freed = 0;
        for (String block : others) {
            if (total <= CAP) break;
            if (stamps.get(block) >= battle()) continue;
            long size = size(block) + size(block + TMP_SUFFIX);
            total -= size;
            freed += size;
            evict.add(block);
        }
        return total <= CAP ? freed : -1;
    }

    private long size(String name) {
        byte[] b = store.read(name);
        return b == null ? 0 : b.length;
    }

    private static String describe(RuntimeException e) {
        String m = e.getMessage();
        return e.getClass().getSimpleName() + (m == null ? "" : ": " + m);
    }
}
