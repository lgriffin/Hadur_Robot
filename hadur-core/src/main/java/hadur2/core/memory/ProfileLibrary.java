package hadur2.core.memory;

import hadur2.core.port.ProfileStore;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Loads and saves opponent profiles in a {@link ProfileStore}. It owns everything that
 * makes persistence safe, so the store adapters stay thin:
 *
 * <ul>
 * <li>MEM-4: a profile that is missing reads as a stranger; one that is damaged, or a store
 *     that throws, also reads as a stranger and counts a load failure.</li>
 * <li>RES-3: a save writes the new bytes to {@code <file>.tmp} first, then over the profile,
 *     then deletes the temporary copy. A robot killed during the first write leaves the old
 *     profile intact; one killed during the second leaves a complete temporary copy, which
 *     the next load uses. (Robocode's sandbox forbids renaming files, so the copy stands in
 *     for the usual rename.) Checksums tell a complete copy from a torn one.</li>
 * <li>MEM-5: before writing, if the store would pass {@link #EVICT_AT} of its quota, the
 *     seeds of the least recently fought other profiles are dropped until it would not. If
 *     the write still would not fit, this profile's own seeds go; if even the stats alone do
 *     not fit, the write is skipped and counted.</li>
 * <li>A battle counter in {@link #CLOCK} stamps each profile with when it was last fought,
 *     which is what "least recently fought" means.</li>
 * </ul>
 *
 * <p>Nothing here throws: every failure becomes a counter and a note.</p>
 */
public final class ProfileLibrary {

    public static final String PROFILE_SUFFIX = ".hp";
    public static final String TMP_SUFFIX = ".tmp";
    public static final String CLOCK = "battles.hc";
    public static final double EVICT_AT = 0.9;
    static final int CLOCK_SIZE = 15;

    /** The result of a load. */
    public static final class Loaded {
        private final OpponentProfile profile;
        private final boolean found;
        private final String failure;

        Loaded(OpponentProfile profile, boolean found, String failure) {
            this.profile = profile;
            this.found = found;
            this.failure = failure;
        }

        public OpponentProfile profile() {
            return profile;
        }

        /** Whether a stored profile was read, as opposed to a fresh one made. */
        public boolean found() {
            return found;
        }

        /** Why loading failed, or null. A failed load still returns a fresh profile. */
        public String failure() {
            return failure;
        }
    }

    /** What a save did. */
    public enum Saved { WRITTEN, WRITTEN_WITHOUT_SEEDS, SKIPPED, FAILED }

    private final ProfileStore store;
    private int loadFailures;
    private int saveFailures;
    private int skippedWrites;
    private int seedsEvicted;
    private long battleNumber = -1;
    private String lastNote = "";

    public ProfileLibrary(ProfileStore store) {
        this.store = store;
    }

    public int loadFailures() {
        return loadFailures;
    }

    public int saveFailures() {
        return saveFailures;
    }

    public int skippedWrites() {
        return skippedWrites;
    }

    /** Profiles whose seeds were dropped to make room (MEM-5). */
    public int seedsEvicted() {
        return seedsEvicted;
    }

    /** A short description of the last failure or eviction, for telemetry. */
    public String lastNote() {
        return lastNote;
    }

    /**
     * Does the loading work that does not need the opponent's name: reads the battle clock
     * and exercises the codec once. The robot calls this before its first tick, so the
     * first scan (MEM-1) only has to read one small file. Never throws.
     */
    public void prepare() {
        try {
            nextBattle(new OpponentProfile(LineageKey.UNKNOWN));
            OpponentProfile warmUp = new OpponentProfile(LineageKey.UNKNOWN);
            new ProfileFolder(warmUp, 800, 600).fold(false);
            Tiers.label(ProfileCodec.decode(ProfileCodec.encode(warmUp)));
        } catch (RuntimeException e) {
            // The first scan tries again and counts any failure.
        }
    }

    public static String fileName(String key) {
        return LineageKey.fileStem(key) + PROFILE_SUFFIX;
    }

    /**
     * MEM-1: the profile for the opponent the radar named, stamped as fought in this
     * battle. Never throws and never returns null (MEM-4).
     */
    public Loaded load(String exactName) {
        String key = LineageKey.of(exactName);
        OpponentProfile profile = null;
        String failure = null;
        try {
            profile = read(fileName(key), key);
        } catch (RuntimeException e) {
            failure = describe(e);
            loadFailures++;
            lastNote = "load " + key + ": " + failure;
        }
        boolean found = profile != null;
        if (profile == null) profile = new OpponentProfile(key);
        profile.startBattle(exactName, nextBattle(profile));
        return new Loaded(profile, found, failure);
    }

    /**
     * The stored profile for {@code key}: the main file if it checks out, else a complete
     * temporary copy left by an interrupted save, else null if neither exists. Throws
     * when something exists but none of it is a valid profile for this key.
     */
    private OpponentProfile read(String file, String key) {
        byte[] main = store.read(file);
        byte[] tmp = store.read(file + TMP_SUFFIX);
        if (main == null && tmp == null) return null;
        RuntimeException damage = null;
        for (byte[] bytes : new byte[][] {main, tmp}) {
            if (bytes == null) continue;
            try {
                OpponentProfile p = ProfileCodec.decode(bytes);
                // Another key that hashes to the same file: not ours, so a stranger.
                return p.key().equals(key) ? p : null;
            } catch (ProfileFormatException e) {
                if (damage == null) damage = e;
            }
        }
        throw damage;
    }

    /** One more than the last battle stamped anywhere in the store. */
    private long nextBattle(OpponentProfile own) {
        if (battleNumber < 0) {
            long last = readClock();
            if (last < 0) last = maxLastFought();
            battleNumber = Math.max(last, own.lastFought()) + 1;
        }
        return battleNumber;
    }

    private long readClock() {
        try {
            byte[] b = store.read(CLOCK);
            if (b == null || b.length != CLOCK_SIZE || b[0] != 'H' || b[1] != 'C' || b[2] != 1) return -1;
            Bytes.Reader r = new Bytes.Reader(b, 3, CLOCK_SIZE);
            long value = r.i64();
            return r.i32() == ProfileCodec.crc(b, 11) && value >= 0 ? value : -1;
        } catch (RuntimeException e) {
            return -1;
        }
    }

    private static byte[] clockBytes(long value) {
        Bytes.Writer w = new Bytes.Writer().u8('H').u8('C').u8(1).i64(value);
        return w.i32(ProfileCodec.crc(w.toArray(), w.size())).toArray();
    }

    /** The clock was lost: recover it from the profiles themselves. */
    private long maxLastFought() {
        long max = 0;
        try {
            for (String name : store.names()) {
                if (!name.endsWith(PROFILE_SUFFIX)) continue;
                try {
                    max = Math.max(max, ProfileCodec.decode(store.read(name)).lastFought());
                } catch (RuntimeException e) {
                    // A damaged profile says nothing about the clock.
                }
            }
        } catch (RuntimeException e) {
            // No listing, no recovery; count from zero.
        }
        return max;
    }

    /** MEM-3: persists {@code profile} atomically within the quota. Never throws. */
    public Saved save(OpponentProfile profile) {
        String file = fileName(profile.key());
        try {
            byte[] bytes = ProfileCodec.encode(profile);
            long others = store.bytesUsed() - size(file) - size(file + TMP_SUFFIX) - size(CLOCK);
            long limit = (long) Math.floor(store.quota() * EVICT_AT);
            // While saving, the temporary copy and the profile exist side by side.
            if (others + 2L * bytes.length + CLOCK_SIZE > limit) {
                others -= evictSeeds(file, others + 2L * bytes.length + CLOCK_SIZE - limit);
            }
            Saved outcome = Saved.WRITTEN;
            if (others + 2L * bytes.length + CLOCK_SIZE > store.quota()) {
                OpponentProfile stripped = ProfileCodec.decode(bytes);
                if (stripped.dropSeeds()) {
                    seedsEvicted++;
                    bytes = ProfileCodec.encode(stripped);
                    outcome = Saved.WRITTEN_WITHOUT_SEEDS;
                }
                if (others + 2L * bytes.length + CLOCK_SIZE > store.quota()) {
                    skippedWrites++;
                    lastNote = "skipped " + profile.key() + ": " + bytes.length + " bytes do not fit";
                    return Saved.SKIPPED;
                }
            }
            writeAtomically(file, bytes);
            store.write(CLOCK, clockBytes(Math.max(battleNumber, profile.lastFought())));
            return outcome;
        } catch (RuntimeException e) {
            saveFailures++;
            lastNote = "save " + profile.key() + ": " + describe(e);
            return Saved.FAILED;
        }
    }

    /** RES-3: temporary copy first, then the profile, then drop the copy. */
    private void writeAtomically(String file, byte[] bytes) {
        store.write(file + TMP_SUFFIX, bytes);
        store.write(file, bytes);
        store.delete(file + TMP_SUFFIX);
    }

    /**
     * MEM-5: drops seeds from other profiles, least recently fought first, until at least
     * {@code needed} bytes are freed or none are left. Damaged profiles are deleted, since
     * they can never be read. Returns the bytes freed.
     */
    private long evictSeeds(String ownFile, long needed) {
        List<OpponentProfile> candidates = new ArrayList<>();
        long freed = 0;
        for (String name : store.names()) {
            if (name.equals(ownFile) || name.equals(ownFile + TMP_SUFFIX) || name.equals(CLOCK)) continue;
            byte[] bytes = store.read(name);
            if (bytes == null) continue;
            if (!name.endsWith(PROFILE_SUFFIX)) {
                // A temporary copy whose profile is intact, or stray data: reclaim it.
                if (name.endsWith(PROFILE_SUFFIX + TMP_SUFFIX) && isValid(store.read(name.substring(
                        0, name.length() - TMP_SUFFIX.length())))) {
                    store.delete(name);
                    freed += bytes.length;
                }
                continue;
            }
            try {
                OpponentProfile p = ProfileCodec.decode(bytes);
                if (p.gunSeedSize() + p.surfSeedSize() > 0) candidates.add(p);
            } catch (ProfileFormatException e) {
                store.delete(name);
                freed += bytes.length;
            }
        }
        candidates.sort(Comparator.comparingLong(OpponentProfile::lastFought)
            .thenComparing(OpponentProfile::key));
        for (OpponentProfile p : candidates) {
            if (freed >= needed) break;
            String name = fileName(p.key());
            long before = size(name);
            p.dropSeeds();
            byte[] stripped = ProfileCodec.encode(p);
            writeAtomically(name, stripped);
            freed += before - stripped.length;
            seedsEvicted++;
            lastNote = "evicted seeds of " + p.key();
        }
        return freed;
    }

    private static boolean isValid(byte[] bytes) {
        if (bytes == null) return false;
        try {
            ProfileCodec.decode(bytes);
            return true;
        } catch (ProfileFormatException e) {
            return false;
        }
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
