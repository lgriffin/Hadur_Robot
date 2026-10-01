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
 * <p>Nothing here throws: every failure becomes a counter and a note. The core copies the
 * counters into each round's R record (RES-5) and writes the note as a {@code MEM} line.</p>
 *
 * <p>One library lives for the whole battle, created by {@code HadurCore} only for a duel
 * with a store. The robot calls {@link #prepare()} before the first tick, the core calls
 * {@link #load} at the first scan (MEM-1), and {@link #save} at the end of each round Hadur
 * survives and at the battle's end (MEM-3).</p>
 *
 * <p>Store files: {@code <stem>.hp} for each profile (the stem from
 * {@link LineageKey#fileStem}), {@code <stem>.hp.tmp} for the temporary copy while a save
 * is in progress, and {@link #CLOCK}.</p>
 */
public final class ProfileLibrary {

    /** The suffix of a profile file. */
    public static final String PROFILE_SUFFIX = ".hp";
    /** Appended to a profile's file name for its temporary copy (RES-3). */
    public static final String TMP_SUFFIX = ".tmp";
    /** The battle counter's file. */
    public static final String CLOCK = "battles.hc";
    /** MEM-5's threshold: seeds are evicted before a save would take the store past 90% of its quota. */
    public static final double EVICT_AT = 0.9;
    /** MEM-8: seeds are kept for at most this many opponents, regardless of quota pressure. */
    public static final int MAX_SEEDED = 5;
    /** MEM-8: an opponent's seeds are worth keeping only once it has been fought this often. */
    public static final int SEED_WORTHY_BATTLES = 2;
    /** MEM-8: and only while its recorded score share stays under this. */
    public static final double SEED_WORTHY_SCORE_SHARE = 0.6;
    /** MEM-9: the separator between a file's format-version prefix and its stem. The store
     * is a flat namespace (RES-6 keeps file I/O out of the core, and the robot adapter's
     * sandbox forbids path separators), so a version's files share the store's one
     * directory under a name prefix rather than a real subdirectory. */
    private static final String VERSION_SEPARATOR = "-v";
    /** The clock file's size: {@code 'H' 'C'}, version 1, an i64 battle number and an i32 CRC. */
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

        /** The profile to use: the stored one, or a fresh one for a stranger; never null. */
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

    /**
     * What a save did: {@code WRITTEN} in full; {@code WRITTEN_WITHOUT_SEEDS} when only the
     * stats fitted (MEM-5); {@code SKIPPED} when even they did not, leaving the old file;
     * {@code FAILED} when the store or codec threw.
     */
    public enum Saved { WRITTEN, WRITTEN_WITHOUT_SEEDS, SKIPPED, FAILED }

    private final ProfileStore store;
    /** The format version every write this library makes uses (MEM-7). */
    private final int writeVersion;
    private int loadFailures;
    private int saveFailures;
    private int skippedWrites;
    private int seedsEvicted;
    /** This battle's number on the clock; -1 until {@link #nextBattle} first runs. */
    private long battleNumber = -1;
    private String lastNote = "";

    /**
     * A library over {@code store}, writing at the codec's current version.
     *
     * @param store where the profiles live; the robot's data directory or an in-memory map
     */
    public ProfileLibrary(ProfileStore store) {
        this(store, ProfileCodec.VERSION);
    }

    /**
     * MEM-7: a library that writes every profile — regular saves, eviction rewrites and
     * stats-only checkpoints alike — at {@code writeVersion} instead of the codec's current
     * one, so a client still on a previous release can go on reading what this one writes.
     * {@link ProfileCodec#decode} reads any version back to {@link ProfileCodec#OLDEST_VERSION},
     * whatever this library writes, so nothing here needs to change to read older files.
     *
     * @param store where the profiles live; the robot's data directory or an in-memory map
     * @param writeVersion the format version to write, {@code ProfileCodec.OLDEST_VERSION}
     *     to {@code ProfileCodec.VERSION}
     */
    public ProfileLibrary(ProfileStore store, int writeVersion) {
        this.store = store;
        this.writeVersion = writeVersion;
    }

    /** Loads that found something but could not read it, this battle (MEM-4). */
    public int loadFailures() {
        return loadFailures;
    }

    /** Saves that threw, this battle. */
    public int saveFailures() {
        return saveFailures;
    }

    /** Saves skipped because even the profile without seeds did not fit the quota. */
    public int skippedWrites() {
        return skippedWrites;
    }

    /** Profiles whose seeds were dropped to make room (MEM-5), this one's own included. */
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
            // Fixes this battle's number now, so load() does no clock work. The throwaway
            // profile has lastFought 0, so the clock (or its recovery) alone decides.
            nextBattle(new OpponentProfile(LineageKey.UNKNOWN));
            // Run the folder, codec and tiers once so their classes are loaded and their
            // code is warm before the first scan; the results are discarded.
            OpponentProfile warmUp = new OpponentProfile(LineageKey.UNKNOWN);
            new ProfileFolder(warmUp, 800, 600).fold(false);
            Tiers.label(ProfileCodec.decode(ProfileCodec.encode(warmUp)));
        } catch (RuntimeException e) {
            // The first scan tries again and counts any failure.
        }
        try {
            cleanupOtherVersions();
        } catch (RuntimeException e) {
            // Cleanup is an optimisation; a failure here costs space, never the battle.
        }
    }

    /**
     * MEM-9: while the store is short of quota, deletes other format versions' files —
     * this version's own are never touched — oldest fought first, until it is not or none
     * of them are left. A version no client on this build ever writes again only ever
     * shrinks, so this reclaims the space other versions hold without touching anything
     * {@link #readOtherVersion} might still carry forward from them.
     */
    private void cleanupOtherVersions() {
        long limit = (long) Math.floor(store.quota() * EVICT_AT);
        if (store.bytesUsed() <= limit) return;
        List<String> others = new ArrayList<>();
        for (String name : store.names()) {
            if (name.equals(CLOCK) || isOwnVersion(name)) continue;
            if (name.endsWith(PROFILE_SUFFIX) || name.endsWith(PROFILE_SUFFIX + TMP_SUFFIX)) others.add(name);
        }
        others.sort(Comparator.comparingLong(this::lastFoughtOf).thenComparing(n -> n));
        for (String name : others) {
            if (store.bytesUsed() <= limit) break;
            store.delete(name);
        }
    }

    /** The battle a stored profile file was last fought in, or -1 if it cannot be read. */
    private long lastFoughtOf(String name) {
        try {
            byte[] b = store.read(name);
            return b == null ? -1 : ProfileCodec.decode(b).lastFought();
        } catch (RuntimeException e) {
            return -1;
        }
    }

    /**
     * The store name of a key's profile at the codec's current version.
     *
     * @param key a lineage key
     * @return the stem from {@link LineageKey#fileStem} plus {@link #PROFILE_SUFFIX}
     */
    public static String fileName(String key) {
        return fileName(key, ProfileCodec.VERSION);
    }

    /**
     * MEM-9: the store name of a key's profile at format {@code version}. Different
     * versions never share a name, so a Hadur release on an older or newer format never
     * reads or overwrites another version's file.
     *
     * @param key a lineage key
     * @param version a profile format version
     */
    static String fileName(String key, int version) {
        return LineageKey.fileStem(key) + VERSION_SEPARATOR + version + PROFILE_SUFFIX;
    }

    /** Whether {@code name} is one of this library's own {@link #writeVersion}'s files. */
    private boolean isOwnVersion(String name) {
        return name.endsWith(VERSION_SEPARATOR + writeVersion + PROFILE_SUFFIX)
            || name.endsWith(VERSION_SEPARATOR + writeVersion + PROFILE_SUFFIX + TMP_SUFFIX);
    }

    /**
     * MEM-1: the profile for the opponent the radar named, stamped as fought in this
     * battle. Never throws and never returns null (MEM-4).
     *
     * @param exactName the name the radar reported
     * @return the profile, whether one was found, and why loading failed if it did
     */
    public Loaded load(String exactName) {
        String key = LineageKey.of(exactName);
        OpponentProfile profile = null;
        String failure = null;
        try {
            profile = read(fileName(key, writeVersion), key);
            // MEM-9: nothing of this version yet; an older or newer release's file still
            // carries tiers forward, once, stats only — its seeds mean nothing to a format
            // this library did not write and are dropped rather than trusted.
            if (profile == null) profile = readOtherVersion(key);
        } catch (RuntimeException e) {
            failure = describe(e);
            loadFailures++;
            lastNote = "load " + key + ": " + failure;
        }
        // A stranger and a damaged profile both start from nothing; only the failure count
        // tells them apart.
        boolean found = profile != null;
        if (profile == null) profile = new OpponentProfile(key);
        profile.startBattle(exactName, nextBattle(profile));
        return new Loaded(profile, found, failure);
    }

    /**
     * MEM-9: the nearest other format version's profile for {@code key}, newest version
     * first, stats only. Returns null when none of the other versions have one.
     */
    private OpponentProfile readOtherVersion(String key) {
        for (int v = ProfileCodec.VERSION; v >= ProfileCodec.OLDEST_VERSION; v--) {
            if (v == writeVersion) continue;
            OpponentProfile p = readQuietly(fileName(key, v), key);
            if (p != null) {
                p.dropSeeds();
                return p;
            }
        }
        // Files written before MEM-9 had no version in their name.
        OpponentProfile legacy = readQuietly(LineageKey.fileStem(key) + PROFILE_SUFFIX, key);
        if (legacy != null) legacy.dropSeeds();
        return legacy;
    }

    /**
     * {@link #read} for another version's file: damage there means this version simply has
     * nothing to carry forward, not a failed load, so it is skipped rather than counted.
     */
    private OpponentProfile readQuietly(String file, String key) {
        try {
            return read(file, key);
        } catch (RuntimeException e) {
            return null;
        }
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
        // The main file first: after a complete save it is the newest. If a save was cut
        // during the second write, the main file fails its checksum and the complete
        // temporary copy is used instead (RES-3).
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

    /**
     * One more than the last battle stamped anywhere in the store. Computed once per
     * library, so every profile loaded in this battle gets the same number.
     */
    private long nextBattle(OpponentProfile own) {
        if (battleNumber < 0) {
            long last = readClock();
            if (last < 0) last = maxLastFought();
            battleNumber = Math.max(last, own.lastFought()) + 1;
        }
        return battleNumber;
    }

    /** The battle number in {@link #CLOCK}, or -1 if it is missing, damaged or unreadable. */
    private long readClock() {
        try {
            byte[] b = store.read(CLOCK);
            if (b == null || b.length != CLOCK_SIZE || b[0] != 'H' || b[1] != 'C' || b[2] != 1) return -1;
            Bytes.Reader r = new Bytes.Reader(b, 3, CLOCK_SIZE);
            long value = r.i64();
            // The CRC covers the 11 bytes before it: magic, version and value.
            return r.i32() == ProfileCodec.crc(b, 11) && value >= 0 ? value : -1;
        } catch (RuntimeException e) {
            return -1;
        }
    }

    /** The {@link #CLOCK} file's content for {@code value}. */
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

    /**
     * MEM-3: persists {@code profile} atomically within the quota. Never throws.
     *
     * <p>The space check assumes the worst moment of a save: the temporary copy and the
     * profile both on disk, plus the clock. If that would pass {@link #EVICT_AT} of the
     * quota, other profiles' seeds go first (MEM-5); if it would still pass the whole quota,
     * this profile's own seeds go; if even that does not fit, nothing is written. MEM-6:
     * that last case cannot happen while any other profile still has seeds, because
     * {@link #evictSeeds} never stops short of freeing what {@link #EVICT_AT}'s threshold
     * needs unless it has already taken every seed there was to take (its target is always
     * at or under the hard quota checked here) — so a write is only ever skipped once
     * nothing more can be evicted from anyone.</p>
     *
     * @param profile the profile to save
     * @return what was done
     */
    public Saved save(OpponentProfile profile) {
        String file = fileName(profile.key(), writeVersion);
        try {
            OpponentProfile toWrite = profile;
            boolean hadSeeds = profile.gunSeedSize() + profile.surfSeedSize() > 0;
            boolean seeded = hadSeeds;
            if (hadSeeds && !seedWorthy(profile)) {
                // MEM-8: not worth the space; write the stats, not the seeds. A copy, so the
                // caller's own profile keeps its seeds in memory for the rest of the battle.
                toWrite = ProfileCodec.decode(ProfileCodec.encodeStatsOnly(profile));
                seeded = false;
            }
            byte[] bytes = ProfileCodec.encode(toWrite, writeVersion);
            // Bytes held by everything this save does not replace.
            long others = store.bytesUsed() - size(file) - size(file + TMP_SUFFIX) - size(CLOCK);
            long limit = (long) Math.floor(store.quota() * EVICT_AT);
            // While saving, the temporary copy and the profile exist side by side.
            if (others + 2L * bytes.length + CLOCK_SIZE > limit) {
                others -= evictSeeds(file, others + 2L * bytes.length + CLOCK_SIZE - limit);
            }
            // A profile that never had seeds is simply WRITTEN; one whose seeds were
            // dropped, by MEM-8 above or by quota eviction below, is WRITTEN_WITHOUT_SEEDS.
            Saved outcome = hadSeeds && !seeded ? Saved.WRITTEN_WITHOUT_SEEDS : Saved.WRITTEN;
            if (others + 2L * bytes.length + CLOCK_SIZE > store.quota()) {
                // Strip a copy (decoded from the bytes), not the caller's profile, which keeps
                // its seeds for the rest of the battle.
                OpponentProfile stripped = ProfileCodec.decode(bytes);
                if (stripped.dropSeeds()) {
                    seeded = false;
                    seedsEvicted++;
                    bytes = ProfileCodec.encode(stripped, writeVersion);
                    outcome = Saved.WRITTEN_WITHOUT_SEEDS;
                }
                if (others + 2L * bytes.length + CLOCK_SIZE > store.quota()) {
                    skippedWrites++;
                    lastNote = "skipped " + profile.key() + ": " + bytes.length + " bytes do not fit";
                    return Saved.SKIPPED;
                }
            }
            // MEM-8's cap comes after the write, so a save that is skipped or fails has not
            // stripped anyone else. It only runs when this file is a new holder: one that
            // already held seeds cannot raise the count, so the common checkpoint of an
            // already-seeded opponent never scans the store.
            boolean newHolder = seeded && !holdsSeeds(file);
            writeAtomically(file, bytes);
            if (newHolder) enforceSeedCap(file);
            // The clock goes after the profile. If its write is lost or torn, the next
            // battle recovers the number from the profiles (maxLastFought).
            store.write(CLOCK, clockBytes(Math.max(battleNumber, profile.lastFought())));
            return outcome;
        } catch (RuntimeException e) {
            saveFailures++;
            lastNote = "save " + profile.key() + ": " + describe(e);
            return Saved.FAILED;
        }
    }

    /**
     * TIME-4: writes {@code profile}'s statistics without re-writing its seeds from
     * scratch. Round-end checkpoints use this so the frequent write costs only what the
     * stats need: it never serialises the caller's own (possibly large) seed lists, and
     * never touches them in memory either. Whatever seeds are already safely on disk for
     * this profile are carried over unchanged, so a checkpoint never erases what an earlier
     * save already committed (MEM-3) — it only leaves them stale until the next full save,
     * which MEM-10 limits to the battle's one checkpoint and its end (see
     * {@code HadurCore#checkpoint}), never gone.
     *
     * @param profile the profile to save
     * @return what was done
     */
    public Saved saveStatsOnly(OpponentProfile profile) {
        try {
            // A cheap, independent copy of just the stats: never the caller's own profile
            // (whose seeds must stay in memory for the rest of the battle untouched), and
            // never an encode of the caller's own seed lists either (TIME-4's whole point).
            OpponentProfile copy = ProfileCodec.decode(ProfileCodec.encodeStatsOnly(profile));
            byte[] stored = store.read(fileName(profile.key(), writeVersion));
            if (stored != null) {
                try {
                    OpponentProfile onDisk = ProfileCodec.decode(stored);
                    copy.gunSeed.addAll(onDisk.gunSeed);
                    copy.surfSeed.addAll(onDisk.surfSeed);
                } catch (RuntimeException e) {
                    // Nothing valid on disk to carry over; the copy keeps no seeds, as if
                    // this were the profile's first save.
                }
            }
            return save(copy);
        } catch (RuntimeException e) {
            saveFailures++;
            lastNote = "save " + profile.key() + ": " + describe(e);
            return Saved.FAILED;
        }
    }

    /**
     * RES-3: temporary copy first, then the profile, then drop the copy. Robocode's sandbox
     * forbids renaming, so a copy stands in for the usual write-then-rename. At every
     * moment at least one of the two files holds a complete profile: the old main file
     * (if there was one) until the copy is complete, then the copy until the main file is
     * complete.
     */
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
        List<SeededFile> candidates = new ArrayList<>();
        long freed = 0;
        // Pass 1: reclaim what can never be read, and collect profiles that still have
        // seeds. MEM-9: only this version's own files, never another version's.
        for (String name : store.names()) {
            if (name.equals(ownFile) || name.equals(ownFile + TMP_SUFFIX) || name.equals(CLOCK)) continue;
            if (!isOwnVersion(name)) continue;
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
                if (p.gunSeedSize() + p.surfSeedSize() > 0) candidates.add(new SeededFile(name, p));
            } catch (ProfileFormatException e) {
                store.delete(name);
                freed += bytes.length;
            }
        }
        // Pass 2: least recently fought first; the key breaks ties so the order is
        // deterministic (CORE-2).
        candidates.sort(Comparator.<SeededFile>comparingLong(c -> c.profile.lastFought())
            .thenComparing(c -> c.profile.key()));
        for (SeededFile c : candidates) {
            if (freed >= needed) break;
            long before = size(c.name);
            c.profile.dropSeeds();
            byte[] stripped = ProfileCodec.encode(c.profile, writeVersion);
            writeAtomically(c.name, stripped);
            freed += before - stripped.length;
            seedsEvicted++;
            lastNote = "evicted seeds of " + c.profile.key();
        }
        return freed;
    }

    /** A stored profile, paired with the exact store name it was read from. */
    private static final class SeededFile {
        final String name;
        final OpponentProfile profile;

        SeededFile(String name, OpponentProfile profile) {
            this.name = name;
            this.profile = profile;
        }
    }

    /** MEM-8: an opponent's seeds are worth the space once it has been fought at least
     * {@link #SEED_WORTHY_BATTLES} times and scored under {@link #SEED_WORTHY_SCORE_SHARE}. */
    static boolean seedWorthy(OpponentProfile profile) {
        return profile.battles() >= SEED_WORTHY_BATTLES
            && profile.recordedScoreShare() < SEED_WORTHY_SCORE_SHARE;
    }

    /**
     * MEM-8: keeps at most {@link #MAX_SEEDED} profiles (this version's own) holding seeds
     * at a time. Called just before {@code ownFile} is written with seeds of its own: if
     * that would be the {@code MAX_SEEDED + 1}th, the least recently fought of the others
     * loses its seeds first, so the newest and most relevant opponents are what a thin
     * quota can still replay from (ADAPT-3).
     */
    private void enforceSeedCap(String ownFile) {
        List<SeededFile> holders = new ArrayList<>();
        for (String name : store.names()) {
            if (name.equals(ownFile) || !isOwnVersion(name) || !name.endsWith(PROFILE_SUFFIX)) continue;
            byte[] bytes = store.read(name);
            if (bytes == null) continue;
            try {
                OpponentProfile p = ProfileCodec.decode(bytes);
                if (p.gunSeedSize() + p.surfSeedSize() > 0) holders.add(new SeededFile(name, p));
            } catch (ProfileFormatException e) {
                // MEM-5's own eviction path reclaims a damaged file; nothing to do here.
            }
        }
        int excess = holders.size() - (MAX_SEEDED - 1);
        if (excess <= 0) return;
        holders.sort(Comparator.<SeededFile>comparingLong(c -> c.profile.lastFought())
            .thenComparing(c -> c.profile.key()));
        for (int i = 0; i < excess; i++) {
            SeededFile c = holders.get(i);
            c.profile.dropSeeds();
            byte[] stripped = ProfileCodec.encode(c.profile, writeVersion);
            writeAtomically(c.name, stripped);
            seedsEvicted++;
            lastNote = "evicted seeds of " + c.profile.key() + " (MEM-8 cap)";
        }
    }

    /** Whether the stored profile {@code name} exists, decodes and holds seeds. */
    private boolean holdsSeeds(String name) {
        byte[] bytes = store.read(name);
        if (bytes == null) return false;
        try {
            OpponentProfile p = ProfileCodec.decode(bytes);
            return p.gunSeedSize() + p.surfSeedSize() > 0;
        } catch (RuntimeException e) {
            return false;
        }
    }

    /** Whether {@code bytes} decode as a profile. */
    private static boolean isValid(byte[] bytes) {
        if (bytes == null) return false;
        try {
            ProfileCodec.decode(bytes);
            return true;
        } catch (ProfileFormatException e) {
            return false;
        }
    }

    /** The size of a store entry in bytes, 0 when it does not exist. */
    private long size(String name) {
        byte[] b = store.read(name);
        return b == null ? 0 : b.length;
    }

    /** An exception as {@code "Type: message"} for a note. */
    private static String describe(RuntimeException e) {
        String m = e.getMessage();
        return e.getClass().getSimpleName() + (m == null ? "" : ": " + m);
    }
}
