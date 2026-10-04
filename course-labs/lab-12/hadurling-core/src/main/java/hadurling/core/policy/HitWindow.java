package hadurling.core.policy;

import java.util.Arrays;

/**
 * A rolling hit rate: the last {@code capacity} shot outcomes and their {@link Estimate}
 * (HL-26). A window rather than the battle's total, because the rate moves as the fight
 * does. Bounded by construction, so it cannot grow over a long battle.
 *
 * <p>The outcomes live in a ring buffer: {@code next} is the slot the next outcome goes in,
 * which, once the window is full, is also the oldest outcome. {@code hits} is a running count,
 * so reading the estimate costs nothing.</p>
 */
public final class HitWindow {

    /** The outcomes a rolling rate reads: about three rounds of fire. */
    public static final int DEFAULT_CAPACITY = 100;

    private final boolean[] outcomes;
    private int next;
    private int size;
    private int hits;

    /** A window of {@link #DEFAULT_CAPACITY} outcomes. */
    public HitWindow() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * A window of {@code capacity} outcomes.
     *
     * @param capacity how many of the latest outcomes to keep, at least 1
     */
    public HitWindow(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("capacity " + capacity);
        this.outcomes = new boolean[capacity];
    }

    /**
     * Adds one outcome, dropping the oldest once the window is full.
     *
     * @param hit whether the shot hit
     */
    public void record(boolean hit) {
        if (size == outcomes.length) {
            if (outcomes[next]) hits--; // the slot about to be overwritten holds the oldest
        } else {
            size++;
        }
        outcomes[next] = hit;
        if (hit) hits++;
        next = (next + 1) % outcomes.length;
    }

    /** Forgets every outcome. */
    public void clear() {
        Arrays.fill(outcomes, false);
        next = 0;
        size = 0;
        hits = 0;
    }

    /** @return the rate over the outcomes held and its margin; {@link Estimate#NONE} while empty */
    public Estimate estimate() {
        return size == 0 ? Estimate.NONE : Estimate.of(hits, size);
    }

    /** @return how many outcomes the window holds now */
    public int size() { return size; }

    /** @return the most outcomes the window holds */
    public int capacity() { return outcomes.length; }
}
