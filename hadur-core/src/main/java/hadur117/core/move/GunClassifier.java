package hadur117.core.move;

/**
 * MOVE-15: tells whether the enemy's gun is a learning one, from the HF classes
 * ({@link HitForensics#classify}) of the bullets that hit us in the duel this battle. The count
 * runs across the rounds of one battle and is cleared by {@link #reset} for the next.
 *
 * <p>Pure: no engine types, no clock, no randomness.</p>
 */
public final class GunClassifier {

    /** The fewest hits counted before the gun may be called learning. */
    static final int MIN_HITS = 6;
    /** The least share of the counted hits that are of the learned class for a learning gun. */
    static final double LEARNED_SHARE = 0.6;
    /** The class name {@link HitForensics#classify} gives a hit neither head-on nor linear. */
    static final String LEARNED = "learned";

    private int hits;
    private int learned;

    /**
     * Counts one hit.
     *
     * @param hitClass the hit's HF class ("headon", "linear" or "learned")
     */
    public void record(String hitClass) {
        hits++;
        if (LEARNED.equals(hitClass)) learned++;
    }

    /** Whether at least {@value #MIN_HITS} hits are counted and {@value #LEARNED_SHARE} of them are learned. */
    public boolean learning() {
        return hits >= MIN_HITS && learned >= LEARNED_SHARE * hits;
    }

    /** Forgets the count, for a new battle. */
    public void reset() {
        hits = 0;
        learned = 0;
    }
}
