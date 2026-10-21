package hadur2.core.shieldmode;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * The opponents shield mode applies to (SHIELD-5): Hadur's own list, read by the adapter from
 * a class in the robot jar and handed to the core as lines of text. The core does no I/O
 * (RES-6), so this class only parses and matches.
 *
 * <p>One robot per line; blank lines and lines starting with {@code #} are ignored. A line is
 * a robot's name as Robocode lists it, {@code package.Class version}, or the name alone
 * without the version. A name alone matches every version of the robot ({@code apv.test.Virus}
 * matches {@code apv.test.Virus 0.6.1} and any other); a name with a version matches that
 * version only, so a robot that changes its aim in a new release is not on the list until the
 * bench says so. Matching is exact and case-sensitive: never a prefix, so
 * {@code apv.test.Virus} does not match {@code apv.test.VirusX}. Runs of white space in a
 * line count as one space.</p>
 *
 * <p>At most {@link #MAX_ENTRIES} entries are kept (RES-2).</p>
 */
public final class ShieldList {

    /** The most entries a list keeps. DrussGT's own list has 357. */
    public static final int MAX_ENTRIES = 4096;

    /** The list with nobody on it: shield mode never starts. */
    public static final ShieldList NONE = new ShieldList(Collections.<String>emptySet(), Collections.<String>emptySet());

    /** MOVE-23: a line starting with this names an opponent on the stack off-list, not a shield-mode one. */
    public static final String STACK_OFF_PREFIX = "stack-off:";

    private final Set<String> entries;
    /** MOVE-23: the stack off-list, matched as the shield entries are. */
    private final Set<String> stackOff;

    private ShieldList(Set<String> entries, Set<String> stackOff) {
        this.entries = entries;
        this.stackOff = stackOff;
    }

    /**
     * Reads a list from its lines.
     *
     * @param lines the list's lines, comments and blanks included
     * @return the list; {@link #NONE} when no line names a robot
     */
    public static ShieldList parse(Iterable<String> lines) {
        Set<String> entries = new TreeSet<>();
        Set<String> stackOff = new TreeSet<>();
        if (lines != null) {
            for (String line : lines) {
                if (line == null) continue;
                String entry = line.trim().replaceAll("\\s+", " ");
                if (entry.isEmpty() || entry.startsWith("#")) continue;
                if (entry.startsWith(STACK_OFF_PREFIX)) {
                    // MOVE-23: carried in the same list so the adapter hands the core one object.
                    String name = entry.substring(STACK_OFF_PREFIX.length()).trim();
                    if (!name.isEmpty() && stackOff.size() < MAX_ENTRIES) stackOff.add(name);
                    continue;
                }
                if (entries.size() >= MAX_ENTRIES) continue;
                entries.add(entry);
            }
        }
        if (entries.isEmpty() && stackOff.isEmpty()) return NONE;
        return new ShieldList(Collections.unmodifiableSet(entries), Collections.unmodifiableSet(stackOff));
    }

    /**
     * Whether {@code robotName}, as the engine names a scanned robot ({@code package.Class
     * version}), is on the list: its full name is, or its name without the version is.
     *
     * @param robotName the scanned robot's name, or null
     * @return whether shield mode applies to it
     */
    public boolean matches(String robotName) {
        if (robotName == null || entries.isEmpty()) return false;
        String name = robotName.trim().replaceAll("\\s+", " ");
        return entries.contains(name) || entries.contains(withoutVersion(name));
    }

    /**
     * MOVE-23: whether {@code robotName} is on the stack off-list, by the same rule as
     * {@link #matches}: its full name is, or its name without the version is.
     *
     * @param robotName the scanned robot's name, or null
     * @return whether the stop-and-start stack stays off against it
     */
    public boolean onStackOffList(String robotName) {
        if (robotName == null || stackOff.isEmpty()) return false;
        String name = robotName.trim().replaceAll("\\s+", " ");
        return stackOff.contains(name) || stackOff.contains(withoutVersion(name));
    }

    /** Whether nobody is on the (shield) list. */
    public boolean isEmpty() {
        return entries.isEmpty();
    }

    /** How many entries the list holds. */
    public int size() {
        return entries.size();
    }

    /** The name before its first space: Robocode's class names hold none, so what follows is the version. */
    static String withoutVersion(String name) {
        int space = name.indexOf(' ');
        return space < 0 ? name : name.substring(0, space);
    }
}
