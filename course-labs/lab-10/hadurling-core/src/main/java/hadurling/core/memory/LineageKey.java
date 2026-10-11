package hadurling.core.memory;

/**
 * Turns the name the radar reports into the key a profile is filed under, so that every
 * version of a robot shares one profile (HL-24): {@code "abc.Shadow 3.84"} and
 * {@code "abc.Shadow 3.83c (2)"} are both {@code "abc.Shadow"}.
 *
 * <p>Robocode names a robot {@code package.Class version}, and adds {@code (n)} when the same
 * robot is in a battle more than once. The key drops both. A name that does not look like that
 * (no package before the first space) is kept whole, so an odd name never throws.</p>
 */
public final class LineageKey {

    /** The longest key, in characters; longer names are cut first. */
    public static final int MAX_LENGTH = 120;
    /** The key for a null or blank name. */
    public static final String UNKNOWN = "unknown";

    private LineageKey() {}

    /**
     * The lineage key for a robot name.
     *
     * @param name the scanned name, such as {@code "abc.Shadow 3.84 (2)"}; may be null
     * @return the key, such as {@code "abc.Shadow"}; never null or empty
     */
    public static String of(String name) {
        if (name == null) return UNKNOWN;
        String s = name.length() > MAX_LENGTH ? name.substring(0, MAX_LENGTH) : name;
        s = stripDuplicateMarkers(s.trim());
        int space = s.indexOf(' ');
        // Drop the version only when what comes before it looks like package.Class.
        if (space > 0 && s.substring(0, space).indexOf('.') > 0) s = s.substring(0, space);
        return s.isEmpty() ? UNKNOWN : s;
    }

    /** "x (1) (2)" to "x": only a trailing " (digits)" group is removed, repeatedly. */
    private static String stripDuplicateMarkers(String s) {
        while (true) {
            int open = s.lastIndexOf(" (");
            if (open < 0 || !s.endsWith(")") || open + 2 >= s.length() - 1) return s;
            for (int i = open + 2; i < s.length() - 1; i++) {
                if (!Character.isDigit(s.charAt(i))) return s;
            }
            s = s.substring(0, open).trim();
        }
    }

    /**
     * A file name for a key: its safe characters, then its hash, so two keys that differ only
     * in unsafe characters still get different files.
     *
     * <p>At most 60 characters of the key are kept, each outside {@code [A-Za-z0-9._-]}
     * replaced by {@code _}, then {@code -} and {@code String.hashCode()} in hex. The result
     * has no separators and does not start with a dot, so it can never leave the data
     * directory. Two different keys can still collide; the library checks the key stored
     * inside the file.</p>
     *
     * @param key a lineage key from {@link #of}
     * @return a safe file name stem
     */
    public static String fileStem(String key) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < key.length() && b.length() < 60; i++) {
            char c = key.charAt(i);
            boolean safe = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                || (c >= '0' && c <= '9') || c == '.' || c == '-' || c == '_';
            b.append(safe && !(c == '.' && b.length() == 0) ? c : '_');
        }
        return b.append('-').append(Integer.toHexString(key.hashCode())).toString();
    }
}
