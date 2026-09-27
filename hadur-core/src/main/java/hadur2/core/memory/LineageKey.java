package hadur2.core.memory;

/**
 * Turns the name the radar reports into the key a profile is filed under, so that every
 * version of a robot shares one profile: {@code "abc.Shadow 3.84"} and
 * {@code "abc.Shadow 3.83c (2)"} are both {@code "abc.Shadow"}.
 *
 * <p>Robocode names a robot {@code package.Class version}, and suffixes {@code (n)} when
 * the same robot is in a battle more than once. The key drops both. A name that does not
 * look like that (no package before the first space) is kept whole, so an odd name never
 * throws and never collapses into another robot's key. Keys are at most
 * {@link #MAX_LENGTH} characters and never empty.</p>
 *
 * <p>Sharing one profile across versions means a new version starts from the old one's
 * evidence; when it fights differently, RES-4's seed trust
 * ({@code hadur2.core.adapt.SeedTrust}) notices and fades the old seeds. {@link ProfileLibrary} calls {@link #of} at the first scan (MEM-1) and
 * {@link #fileStem} to name the profile's file.</p>
 */
public final class LineageKey {

    /** The longest key, in characters; longer names are cut before parsing. */
    public static final int MAX_LENGTH = 120;
    /** The key for a null or blank name, and for the library's warm-up profile. */
    static final String UNKNOWN = "unknown";

    private LineageKey() {}

    /**
     * The lineage key for a robot name as the radar reports it.
     *
     * @param name the scanned name, such as {@code "abc.Shadow 3.84 (2)"}; may be null
     * @return the key, such as {@code "abc.Shadow"}; never null or empty
     */
    public static String of(String name) {
        if (name == null) return UNKNOWN;
        // Names come from the engine; cut them to MAX_LENGTH before any other work.
        String s = name.length() > MAX_LENGTH ? name.substring(0, MAX_LENGTH) : name;
        s = stripDuplicateMarkers(s.trim());
        // Drop the version: everything from the first space, but only when what comes before
        // it has a dot after its first character, i.e. looks like "package.Class".
        int space = s.indexOf(' ');
        if (space > 0 && s.substring(0, space).indexOf('.') > 0) {
            s = s.substring(0, space);
        }
        return s.isEmpty() ? UNKNOWN : s;
    }

    /**
     * "x (1) (2)" to "x": the engine's markers for a robot entered twice. Only a trailing
     * " (digits)" group is stripped, repeatedly; anything else in brackets is kept.
     */
    private static String stripDuplicateMarkers(String s) {
        while (true) {
            // Stop unless the name ends in " (" + at least one character + ")", and every
            // character between the brackets is a digit.
            int open = s.lastIndexOf(" (");
            if (open < 0 || !s.endsWith(")") || open + 2 >= s.length() - 1) return s;
            for (int i = open + 2; i < s.length() - 1; i++) {
                if (!Character.isDigit(s.charAt(i))) return s;
            }
            s = s.substring(0, open).trim();
        }
    }

    /**
     * A file name for a key: the key's safe characters, then its hash, so two keys that
     * differ only in unsafe characters still get different files.
     *
     * <p>At most 60 characters of the key are kept, each outside {@code [A-Za-z0-9._-]}
     * replaced by {@code _}, then {@code -} and the key's {@code String.hashCode()} in hex.
     * The hash is Java's specified string hash, so the same key gives the same file on
     * every JVM. Two different keys can still collide; {@link ProfileLibrary} checks the
     * key stored inside the file and treats a mismatch as a stranger.</p>
     *
     * @param key a lineage key from {@link #of}
     * @return a file name stem safe for Robocode's data directory (no separators, no leading dot)
     */
    public static String fileStem(String key) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < key.length() && b.length() < 60; i++) {
            char c = key.charAt(i);
            boolean safe = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                || (c >= '0' && c <= '9') || c == '.' || c == '-' || c == '_';
            // A leading dot would make a hidden file.
            b.append(safe && !(c == '.' && b.length() == 0) ? c : '_');
        }
        return b.append('-').append(Integer.toHexString(key.hashCode())).toString();
    }
}
