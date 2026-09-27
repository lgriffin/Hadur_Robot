package hadur2.core.policy;

import hadur2.core.memory.Estimate;

/**
 * A rolling hit rate: the last {@code capacity} shot outcomes and their estimate (DIST-1's
 * "rolling hit rate"). A window, not the battle's total, because the rate moves with the
 * distance the policy chooses. Bounded by construction (RES-2).
 */
public final class HitWindow {

    /** The outcomes a rolling rate reads: about three rounds of fire. */
    public static final int DEFAULT_CAPACITY = 100;

    private final boolean[] outcomes;
    private int next;
    private int size;
    private int hits;

    public HitWindow() {
        this(DEFAULT_CAPACITY);
    }

    public HitWindow(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("capacity " + capacity);
        this.outcomes = new boolean[capacity];
    }

    /** Adds one shot's outcome, dropping the oldest once the window is full. */
    public void record(boolean hit) {
        if (size == outcomes.length) {
            if (outcomes[next]) hits--;
        } else {
            size++;
        }
        outcomes[next] = hit;
        if (hit) hits++;
        next = (next + 1) % outcomes.length;
    }

    /** The window's rate and its 95% margin; {@link Estimate#NONE} while it is empty. */
    public Estimate estimate() {
        return size == 0 ? Estimate.NONE : Estimate.of(hits, size);
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return outcomes.length;
    }
}
