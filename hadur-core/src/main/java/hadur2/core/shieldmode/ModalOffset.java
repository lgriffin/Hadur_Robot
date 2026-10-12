package hadur2.core.shieldmode;

/**
 * SHIELD-10: the value that recurs most often among the last {@code capacity} added, two
 * values counting as the same when they are within {@code tolerance}. A tie goes to the value
 * added most recently. Each add is linear in the capacity: every kept value carries how many
 * kept values lie within the tolerance of it, and the add and the eviction update those counts.
 * Bounded (RES-2) and deterministic (CORE-2).
 */
final class ModalOffset {

    private final double[] values;
    private final int[] counts;
    private final long[] added;
    private final double tolerance;
    private int size;
    private int next;
    private long serial;

    /**
     * An empty set.
     *
     * @param capacity the values kept, at least 1
     * @param tolerance how close two values must be to count as the same
     */
    ModalOffset(int capacity, double tolerance) {
        if (capacity < 1) throw new IllegalArgumentException("capacity " + capacity);
        values = new double[capacity];
        counts = new int[capacity];
        added = new long[capacity];
        this.tolerance = tolerance;
    }

    /**
     * Adds a value, evicting the oldest when full, and returns the most frequent value now kept.
     *
     * @param v the value
     * @return the mode
     */
    double add(double v) {
        int slot = next;
        if (size == values.length) {
            double old = values[slot];
            for (int j = 0; j < size; j++) {
                if (j != slot && Math.abs(values[j] - old) < tolerance) counts[j]--;
            }
        } else {
            size++;
        }
        values[slot] = v;
        added[slot] = serial++;
        counts[slot] = 1;
        for (int j = 0; j < size; j++) {
            if (j != slot && Math.abs(values[j] - v) < tolerance) {
                counts[j]++;
                counts[slot]++;
            }
        }
        next = (next + 1) % values.length;
        return mode();
    }

    /**
     * The most frequent value kept, the latest on a tie; 0 when empty.
     *
     * @return the mode
     */
    double mode() {
        int best = -1;
        for (int j = 0; j < size; j++) {
            if (best < 0 || counts[j] > counts[best]
                    || (counts[j] == counts[best] && added[j] > added[best])) {
                best = j;
            }
        }
        return best < 0 ? 0 : values[best];
    }

    /**
     * How many values are kept.
     *
     * @return at most the capacity
     */
    int size() {
        return size;
    }
}
