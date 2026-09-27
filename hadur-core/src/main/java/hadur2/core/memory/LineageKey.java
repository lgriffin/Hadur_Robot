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
 */
public final class LineageKey {

    public static final int MAX_LENGTH = 120;
    static final String UNKNOWN = "unknown";

    private LineageKey() {}

    public static String of(String name) {
        if (name == null) return UNKNOWN;
        String s = name.length() > MAX_LENGTH ? name.substring(0, MAX_LENGTH) : name;
        s = stripDuplicateMarkers(s.trim());
        int space = s.indexOf(' ');
        if (space > 0 && s.substring(0, space).indexOf('.') > 0) {
            s = s.substring(0, space);
        }
        return s.isEmpty() ? UNKNOWN : s;
    }

    /** "x (1) (2)" to "x": the engine's markers for a robot entered twice. */
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
     * A file name for a key: the key's safe characters, then its hash, so two keys that
     * differ only in unsafe characters still get different files.
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
