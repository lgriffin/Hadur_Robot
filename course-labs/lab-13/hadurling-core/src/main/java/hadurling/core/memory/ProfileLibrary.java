package hadurling.core.memory;

import hadurling.core.port.ProfileStore;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Loads and saves opponent profiles in a {@link ProfileStore}. It owns everything that makes
 * persistence safe, so the store adapters stay thin:
 *
 * <ul>
 * <li>HL-21: a profile that is missing reads as a stranger; one that is damaged, or a store
 *     that throws, also reads as a stranger and is counted. Nothing here throws.</li>
 * <li>HL-20: a save writes the new bytes to {@code <file>.tmp} first, then over the profile,
 *     then deletes the temporary copy. A robot killed during the first write leaves the old
 *     profile intact; one killed during the second leaves a complete temporary copy, which
 *     the next load uses. (Robocode forbids renaming files, so the copy stands in for the
 *     usual write-then-rename.) The checksum tells a complete copy from a torn one.</li>
 * <li>Room: before writing, if the store would pass its quota, the least recently written
 *     other profiles are forgotten until it would not.</li>
 * <li>HL-40: no save does work proportional to the files in the store. Labs 10 to 12 listed the
 *     store, and asked for every file's size, on <em>every</em> save: free with ten opponents,
 *     a directory scan per save with hundreds. That is "the slide" (Topic 13) in miniature.
 *     Now the library lists the store <em>once</em> per battle, the first time it needs to
 *     know, into an index of each file's size and age. Saves and evictions keep the index
 *     current, so asking for room costs a lookup, never a listing. Only this battle's robot
 *     writes into its own data folder, so the index cannot go stale; if a store call fails
 *     part way, the library drops the index and lists again next time, because after a failure
 *     it no longer knows what is on disk.</li>
 * </ul>
 */
public final class ProfileLibrary {

    /** The suffix of a profile file. */
    public static final String SUFFIX = ".hp";
    /** Appended to a profile's file name for its temporary copy. */
    public static final String TMP_SUFFIX = ".tmp";

    private final ProfileStore store;
    /** Name to {size, age}; null until the one listing, and again after a failure. */
    private Map<String, long[]> index;
    /** The names in the index, oldest first: the order of eviction. */
    private TreeSet<String> byAge;
    /** The total size of everything in the index. */
    private long used;
    /** The latest age handed out, so that every write this battle is newer than anything listed. */
    private long clock;
    private int loadFailures;
    private int saveFailures;
    private String lastNote = "";

    /**
     * A library over a store.
     *
     * @param store where the files live
     */
    public ProfileLibrary(ProfileStore store) {
        this.store = store;
    }

    /** @return profiles that existed but could not be read, or loads where the store threw */
    public int loadFailures() { return loadFailures; }
    /** @return saves that failed */
    public int saveFailures() { return saveFailures; }
    /** @return a line about the last failure, or an empty string */
    public String lastNote() { return lastNote; }

    static String fileFor(String key) {
        return LineageKey.fileStem(key) + SUFFIX;
    }

    /**
     * The stored profile for {@code key}: the main file if it checks out, else a complete
     * temporary copy left by an interrupted save, else a stranger. Never throws.
     *
     * @param key a lineage key
     * @return the profile, or {@link Profile#stranger} if there is none that can be read
     */
    public Profile load(String key) {
        String file = fileFor(key);
        try {
            byte[] main = store.read(file);
            byte[] copy = store.read(file + TMP_SUFFIX);
            if (main == null && copy == null) return Profile.stranger(key);
            // The main file first: after a complete save it is the newest. If a save was cut
            // during its second write, the main file fails its checksum and the copy is used.
            for (byte[] bytes : new byte[][] {main, copy}) {
                if (bytes == null) continue;
                try {
                    Profile p = ProfileCodec.decode(bytes);
                    // Another key that hashes to the same file name: not ours.
                    return p.key().equals(key) ? p : Profile.stranger(key);
                } catch (ProfileFormatException e) {
                    lastNote = "load " + key + ": " + e.getMessage();
                }
            }
            loadFailures++;
            return Profile.stranger(key);
        } catch (RuntimeException e) {
            loadFailures++;
            lastNote = "load " + key + ": " + e;
            return Profile.stranger(key);
        }
    }

    /**
     * Saves a profile: room first, then copy, profile, drop the copy. Never throws.
     *
     * @param profile the profile to keep
     * @return whether it was saved
     */
    public boolean save(Profile profile) {
        try {
            byte[] bytes = ProfileCodec.encode(profile);
            String file = fileFor(profile.key());
            makeRoom(file, bytes.length);
            store.write(file + TMP_SUFFIX, bytes);
            put(file + TMP_SUFFIX, bytes.length);
            store.write(file, bytes);
            put(file, bytes.length);
            store.delete(file + TMP_SUFFIX);
            remove(file + TMP_SUFFIX);
            return true;
        } catch (RuntimeException e) {
            // We no longer know what is on disk: list again next time.
            index = null;
            saveFailures++;
            lastNote = "save " + profile.key() + ": " + e;
            return false;
        }
    }

    /**
     * Forgets the least recently written other profiles until a save of {@code needed} bytes
     * fits. At its peak a save holds the copy and the profile at once, so it needs twice that.
     */
    private void makeRoom(String own, int needed) {
        index();
        long others = used - sizeOf(own) - sizeOf(own + TMP_SUFFIX);
        while (others + 2L * needed > store.quota()) {
            String oldest = null;
            for (String name : byAge) {
                if (!name.equals(own) && !name.equals(own + TMP_SUFFIX)) {
                    oldest = name;
                    break;
                }
            }
            if (oldest == null) throw new IllegalStateException("a profile of " + needed + " bytes does not fit");
            others -= sizeOf(oldest);
            store.delete(oldest);
            remove(oldest);
        }
    }

    /** The one listing of the battle: the first time it is needed, and after a failure. */
    private void index() {
        if (index != null) return;
        index = new TreeMap<>();
        byAge = new TreeSet<>((a, b) -> {
            int byTime = Long.compare(index.get(a)[1], index.get(b)[1]);
            return byTime != 0 ? byTime : a.compareTo(b);
        });
        used = 0;
        for (String name : store.names()) {
            long age = store.lastModified(name);
            clock = Math.max(clock, age);
            put(name, store.size(name), age);
        }
    }

    /** Records that {@code name} now holds {@code size} bytes and is the newest file. */
    private void put(String name, long size) {
        put(name, size, ++clock);
    }

    private void put(String name, long size, long age) {
        remove(name);
        index.put(name, new long[] {size, age});
        byAge.add(name);
        used += size;
    }

    private void remove(String name) {
        long[] old = index.get(name);
        if (old == null) return;
        // Take the name out of the ordered set while its age is still in the map: the set
        // finds it by comparing ages.
        byAge.remove(name);
        index.remove(name);
        used -= old[0];
    }

    private long sizeOf(String name) {
        long[] e = index.get(name);
        return e == null ? 0 : e[0];
    }
}
