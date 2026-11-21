package hadur117.core.physics;

/**
 * MOVE-56: a mimic of a pattern matcher whose symbol is our lateral velocity truncated to a whole
 * number, as AutoBot 4.2.1's gun reads us (dzlane/G/learn6/README.md). Each scan the enemy turns our
 * lateral velocity, seen from where it stands, into one symbol and adds it to a history that lasts
 * the whole battle, beside a running arc length (the sum of the unrounded lateral velocities). To
 * aim, it looks for the latest {@value #SEARCH_DEPTH} - 1 symbols, then one fewer, and so on, in the
 * history that ends at least {@value #SEARCH_END_BUFFER} ticks back, and aims at the bearing plus the
 * arc length we travelled after the match over a bullet flight, over the distance.
 *
 * <p>Replayed offline on truth logs, this lands within half a robot's width of 64% of the bullets
 * AutoBot hits us with (39% of those it hits BeepBoop with). As a member of the danger (MOVE-29) it
 * puts the surf's kernel on that angle.</p>
 *
 * <p>Pure: no engine types, no clock, no randomness. Duel only, off unless the table names the
 * opponent.</p>
 */
public final class PatternMimic {

    /** One more than the longest match tried. */
    static final int SEARCH_DEPTH = 30;
    /** A match must start at least this many symbols before the end of the history. */
    static final int SEARCH_END_BUFFER = 102;

    /** MOVE-58: the cw.megas form's longest match. */
    static final int MEGAS_DEPTH = 30;

    /** MOVE-58: the cw.megas form (rounded symbols, flight-time gap, future rebuilt from the symbols) in place of AutoBot's. */
    private final boolean megas;

    /** AutoBot's form. */
    public PatternMimic() {
        this(false);
    }

    /** MOVE-58: with {@code megas}, the cw.megas form. */
    public PatternMimic(boolean megas) {
        this.megas = megas;
    }

    private final StringBuilder symbols = new StringBuilder();
    private double[] arc = new double[1024];
    private int size;

    /** Adds one scan: our lateral velocity seen from the enemy, px/tick, positive clockwise. */
    public void observe(double lateral) {
        int symbol = megas ? (int) Math.round(lateral) : (int) lateral;
        symbols.append((char) symbol);
        if (size + 1 >= arc.length) arc = java.util.Arrays.copyOf(arc, arc.length * 2);
        arc[size + 1] = arc[size] + (megas ? symbol : lateral);
        size++;
    }

    /** The symbols seen so far. */
    public int size() {
        return size;
    }

    /**
     * The angle the matcher adds to its bearing, radians, aiming from a history of the first
     * {@code history} symbols at {@code distance} px with a bullet of {@code bulletSpeed}: NaN
     * when no match is found (the gun's own fallback is a circular aim) or the matched path runs
     * past the history.
     */
    public double offset(int history, double distance, double bulletSpeed) {
        if (history <= 0 || history > size || !(distance > 0) || !(bulletSpeed > 0)) return Double.NaN;
        if (megas) return megasOffset(history, distance, bulletSpeed);
        int from = history - SEARCH_END_BUFFER;
        if (from < 0) return Double.NaN;
        for (int len = SEARCH_DEPTH - 1; len > 0; len--) {
            if (len > history) continue;
            int at = symbols.lastIndexOf(symbols.substring(history - len, history), from);
            if (at < 0) continue;
            int end = at + len;
            int ahead = end + (int) (distance / bulletSpeed);
            if (ahead > history) return Double.NaN;
            return (arc[ahead] - arc[end]) / distance;
        }
        return Double.NaN;
    }

    /**
     * MOVE-58: cw.megas's search: the newest match of the latest 30 symbols, then 29 and so on, that ends at least a
     * bullet flight before the scan, and the sum of the flight's symbols after it over the distance.
     */
    private double megasOffset(int history, double distance, double bulletSpeed) {
        int flight = (int) (distance / bulletSpeed);
        for (int len = MEGAS_DEPTH; len > 0; len--) {
            if (len > history) continue;
            int from = history - flight - len;
            if (from < 0) continue;
            int at = symbols.lastIndexOf(symbols.substring(history - len, history), from);
            if (at < 0) continue;
            int end = at + len;
            return (arc[end + flight] - arc[end]) / distance;
        }
        return Double.NaN;
    }
}
