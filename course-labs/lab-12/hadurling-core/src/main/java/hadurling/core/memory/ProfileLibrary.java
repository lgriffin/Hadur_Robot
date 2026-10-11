package hadurling.core.memory;

import hadurling.core.port.ProfileStore;
import java.util.List;

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
 * </ul>
 *
 * <p>The room check is the simplest thing that works: it lists the store and adds up the
 * sizes on <em>every</em> save. With ten opponents that is nothing. With hundreds it is a
 * directory listing per save, and Lab 13 shows what that costs.</p>
 */
public final class ProfileLibrary {

    /** The suffix of a profile file. */
    public static final String SUFFIX = ".hp";
    /** Appended to a profile's file name for its temporary copy. */
    public static final String TMP_SUFFIX = ".tmp";

    private final ProfileStore store;
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
            store.write(file, bytes);
            store.delete(file + TMP_SUFFIX);
            return true;
        } catch (RuntimeException e) {
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
        List<String> names = store.names();
        long others = 0;
        for (String name : names) {
            if (!name.equals(own) && !name.equals(own + TMP_SUFFIX)) others += store.size(name);
        }
        while (others + 2L * needed > store.quota()) {
            String oldest = null;
            for (String name : names) {
                if (!isProfileFile(name) || name.equals(own) || name.equals(own + TMP_SUFFIX)) continue;
                if (oldest == null || store.lastModified(name) < store.lastModified(oldest)) oldest = name;
            }
            if (oldest == null) throw new IllegalStateException("a profile of " + needed + " bytes does not fit");
            others -= store.size(oldest);
            store.delete(oldest);
            names.remove(oldest);
        }
    }

    /** Only the library's own files may be forgotten; anything else in the directory is left alone. */
    private static boolean isProfileFile(String name) {
        return name.endsWith(SUFFIX) || name.endsWith(SUFFIX + TMP_SUFFIX);
    }
}
