package hadur2.core.policy;

import hadur2.core.memory.Estimate;
import java.util.Arrays;

/**
 * A rolling hit rate: the last {@code capacity} shot outcomes and their estimate (DIST-1's
 * "rolling hit rate"). A window, not the battle's total, because the rate moves with the
 * distance the policy chooses. Bounded by construction (RES-2).
 *
 * <p>{@code HadurCore} keeps two: ours (each of our duel bullets that hit, missed or was
 * shot down) and theirs (each enemy firing wave that broke on us, hit or not, in the order
 * the waves break). They feed {@link DistancePolicy} (DIST-1) and {@link PowerPolicy}
 * (POW-2), and are cleared when a different robot becomes the duel opponent. They carry
 * across rounds against the same one. {@link MoveFlavour} keeps its own, cleared at each
 * change of flavour (MOVE-2).</p>
 *
 * <p>The outcomes live in a ring buffer: {@code next} is the slot the next outcome goes
 * in, which once the window is full is also the oldest outcome, and {@code hits} is kept as
 * a running count so the estimate costs nothing to read.</p>
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
     * @throws IllegalArgumentException if {@code capacity} is below 1
     */
    public HitWindow(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("capacity " + capacity);
        this.outcomes = new boolean[capacity];
    }

    /**
     * Adds one shot's outcome, dropping the oldest once the window is full.
     *
     * @param hit whether the shot hit
     */
    public void record(boolean hit) {
        if (size == outcomes.length) {
            // Full: the slot about to be overwritten holds the oldest outcome.
            if (outcomes[next]) hits--;
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

    /**
     * The window's rate and its 95% margin; {@link Estimate#NONE} while it is empty.
     * The margin is Agresti-Coull's (DIAL-1), so over a few outcomes it stays wide instead
     * of collapsing to 0 at a rate of 0 or 1.
     *
     * @return the hit rate over the outcomes held, with its margin of error
     */
    public Estimate estimate() {
        return size == 0 ? Estimate.NONE : Estimate.of(hits, size);
    }

    /** How many outcomes the window holds now, from 0 to {@link #capacity()}. */
    public int size() {
        return size;
    }

    /** The most outcomes the window holds. */
    public int capacity() {
        return outcomes.length;
    }
}
