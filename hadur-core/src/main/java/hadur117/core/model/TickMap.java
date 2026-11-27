package hadur117.core.model;

import java.util.Arrays;

/**
 * TIME-12: a map from tick to robot state that keeps no boxed {@code Long} and no entry
 * object per state, for {@link RobotStateLog}, which every tick fills, reads and (in the
 * surf) copies and walks.
 *
 * <p>It iterates in exactly the order a {@code java.util.HashMap<Long, RobotState>} would,
 * because the surf's danger sums read a predicted log in that order and a different order
 * would change their rounding (CORE-2: the fixtures must replay bit for bit). So it uses
 * HashMap's own scheme: the hash of a {@code Long} spread as HashMap spreads it, a power-of-two
 * table that starts at 16 and doubles past a load of 0.75, new keys appended to the end of
 * their bucket's chain, a resize splitting each chain into a low and a high chain in the same
 * relative order, a chain of 8 in a table under 64 resizing instead of growing, removal
 * unlinking in place, and {@code clear} keeping the table's size. The one part of HashMap it
 * does not copy is turning a chain of 8 or more into a tree in a table of 64 or more: tick keys
 * in one log are bounded by {@link RobotStateLog#MAX_STATES}, so a chain there holds keys
 * a table's length apart and never comes near 8.</p>
 */
final class TickMap {

    private static final int NONE = -1;

    /** Head entry of each bucket, or {@link #NONE}; null until the first put, as in HashMap. */
    private int[] table;
    private int threshold;
    private int size;

    /** Entry storage: key, value and the next entry in the same bucket. */
    private long[] keys = new long[16];
    private RobotState[] values = new RobotState[16];
    private int[] next = new int[16];
    /** Entries ever handed out; freed ones are chained from {@link #free} through {@link #next}. */
    private int used;
    private int free = NONE;

    static int hash(long key) {
        int h = (int) (key ^ (key >>> 32));
        return h ^ (h >>> 16);
    }

    int size() {
        return size;
    }

    RobotState get(long key) {
        if (table == null) return null;
        for (int e = table[hash(key) & (table.length - 1)]; e != NONE; e = next[e]) {
            if (keys[e] == key) return values[e];
        }
        return null;
    }

    void put(long key, RobotState value) {
        if (table == null) resize();
        int i = hash(key) & (table.length - 1);
        int e = table[i];
        if (e == NONE) {
            table[i] = newEntry(key, value);
        } else {
            int count = 0;
            while (true) {
                if (keys[e] == key) {
                    values[e] = value;
                    return;
                }
                if (next[e] == NONE) {
                    // newEntry may grow the arrays, so take the index before storing it.
                    int added = newEntry(key, value);
                    next[e] = added;
                    // HashMap.putVal: a chain reaching 8 sends a table under 64 to resize.
                    if (count >= 7 && table.length < 64) resize();
                    break;
                }
                e = next[e];
                count++;
            }
        }
        if (++size > threshold) resize();
    }

    void remove(long key) {
        if (table == null) return;
        int i = hash(key) & (table.length - 1);
        int prev = NONE;
        for (int e = table[i]; e != NONE; prev = e, e = next[e]) {
            if (keys[e] == key) {
                if (prev == NONE) table[i] = next[e];
                else next[prev] = next[e];
                values[e] = null;
                next[e] = free;
                free = e;
                size--;
                return;
            }
        }
    }

    void clear() {
        if (table != null && size > 0) {
            Arrays.fill(table, NONE);
            Arrays.fill(values, 0, used, null);
            size = 0;
            used = 0;
            free = NONE;
        }
    }

    /** The smallest key; the map must not be empty. */
    long minKey() {
        long min = Long.MAX_VALUE;
        for (int b : table) {
            for (int e = b; e != NONE; e = next[e]) if (keys[e] < min) min = keys[e];
        }
        return min;
    }

    /** The observed (not interpolated) state with the greatest tick before {@code time}, or null. */
    RobotState observedBefore(long time) {
        RobotState best = null;
        if (table == null) return null;
        for (int b : table) {
            for (int e = b; e != NONE; e = next[e]) {
                RobotState s = values[e];
                if (!s.interpolated && s.time < time && (best == null || s.time > best.time)) best = s;
            }
        }
        return best;
    }

    /** The observed (not interpolated) state with the smallest tick after {@code time}, or null. */
    RobotState observedAfter(long time) {
        RobotState best = null;
        if (table == null) return null;
        for (int b : table) {
            for (int e = b; e != NONE; e = next[e]) {
                RobotState s = values[e];
                if (!s.interpolated && s.time > time && (best == null || s.time < best.time)) best = s;
            }
        }
        return best;
    }

    /** Receives each entry, in HashMap's iteration order. */
    interface Visitor {
        void visit(long key, RobotState value);
    }

    void forEach(Visitor v) {
        if (table == null) return;
        for (int b : table) {
            for (int e = b; e != NONE; e = next[e]) v.visit(keys[e], values[e]);
        }
    }

    private int newEntry(long key, RobotState value) {
        int e;
        if (free != NONE) {
            e = free;
            free = next[e];
        } else {
            if (used == keys.length) {
                int n = keys.length * 2;
                keys = Arrays.copyOf(keys, n);
                values = Arrays.copyOf(values, n);
                next = Arrays.copyOf(next, n);
            }
            e = used++;
        }
        keys[e] = key;
        values[e] = value;
        next[e] = NONE;
        return e;
    }

    /** HashMap.resize: 16 first, then double, splitting each chain into low and high in order. */
    private void resize() {
        if (table == null) {
            table = new int[16];
            Arrays.fill(table, NONE);
            threshold = 12;
            return;
        }
        int oldCap = table.length;
        int newCap = oldCap << 1;
        int[] nt = new int[newCap];
        Arrays.fill(nt, NONE);
        for (int j = 0; j < oldCap; j++) {
            int loHead = NONE, loTail = NONE, hiHead = NONE, hiTail = NONE;
            for (int e = table[j]; e != NONE; ) {
                int nx = next[e];
                if ((hash(keys[e]) & oldCap) == 0) {
                    if (loTail == NONE) loHead = e;
                    else next[loTail] = e;
                    loTail = e;
                } else {
                    if (hiTail == NONE) hiHead = e;
                    else next[hiTail] = e;
                    hiTail = e;
                }
                e = nx;
            }
            if (loTail != NONE) {
                next[loTail] = NONE;
                nt[j] = loHead;
            }
            if (hiTail != NONE) {
                next[hiTail] = NONE;
                nt[j + oldCap] = hiHead;
            }
        }
        table = nt;
        threshold = newCap >= (1 << 30) ? Integer.MAX_VALUE : (int) (newCap * 0.75f);
    }
}
