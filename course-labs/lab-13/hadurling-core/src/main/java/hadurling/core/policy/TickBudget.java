package hadurling.core.policy;

/**
 * How much work the core may do this tick, as a computation level from 0 (everything) to
 * {@link #MAX_LEVEL}. Each level sheds more:
 *
 * <ol>
 * <li>the gun asks the tree for half as many neighbours;</li>
 * <li>also, the surfer stops predicting and the robot keeps its direction;</li>
 * <li>also, the gun stops using the tree and aims head-on.</li>
 * </ol>
 *
 * <p>Two things lower the level, and both are things that <em>happened</em>, never the clock or
 * the round number:</p>
 * <ul>
 * <li>HL-36: a tick that used more than {@link #THRESHOLD} of the allowance drops one level for
 *     the next tick only. Each measurement replaces the last, so a slow tick costs one level
 *     until the next measurement arrives.</li>
 * <li>HL-37: a skipped turn (the engine gave up waiting for us) drops one level for the rest of
 *     the round.</li>
 * </ul>
 *
 * <p>The core never reads a clock (HL-39). The adapter times each call into the core and hands
 * the measurement in with the next tick's events, as an {@code Event.TickTime}. The
 * {@link #ALLOWANCE_NANOS} is a guess, because Robocode does not tell a robot how long its turn
 * is. Hadur's {@code TickBudget} learns the real allowance from the first skipped turn;
 * Exercise 2 asks you to.</p>
 *
 * <p>Make one per round: a new round starts at full computation.</p>
 */
public final class TickBudget {

    /** The time a tick may take, in nanoseconds: a guess of 3 ms. */
    public static final long ALLOWANCE_NANOS = 3_000_000L;
    /** The share of the allowance past which the next tick sheds a level. */
    public static final double THRESHOLD = 0.70;
    /** The deepest level: everything that can be shed is shed. */
    public static final int MAX_LEVEL = 3;

    private int roundLevel;
    private boolean slow;
    private int slowTicks;
    private int maxLevel;

    /**
     * The previous tick took {@code usedNanos}.
     *
     * @param usedNanos how long the core took on the previous tick, in nanoseconds
     */
    public void tickTook(long usedNanos) {
        slow = usedNanos > THRESHOLD * ALLOWANCE_NANOS;
        if (slow) slowTicks++;
        maxLevel = Math.max(maxLevel, level());
    }

    /** The engine skipped a turn: the round's level drops one, down to {@link #MAX_LEVEL}. */
    public void skippedTurn() {
        roundLevel = Math.min(MAX_LEVEL, roundLevel + 1);
        maxLevel = Math.max(maxLevel, level());
    }

    /** @return the level for this tick: the round's level, one more after a slow tick, at most {@link #MAX_LEVEL} */
    public int level() {
        return Math.min(MAX_LEVEL, roundLevel + (slow ? 1 : 0));
    }

    /** @return the ticks this round that followed a slow measurement */
    public int slowTicks() { return slowTicks; }

    /** @return the highest level this round has used */
    public int maxLevel() { return maxLevel; }

    /**
     * How many neighbours the gun may ask the tree for.
     *
     * @param level a computation level
     * @param full the number at level 0
     * @return {@code full}, half of it at levels 1 and 2, and 0 (no tree) at level 3
     */
    public static int neighbours(int level, int full) {
        if (level >= 3) return 0;
        return level >= 1 ? Math.max(1, full / 2) : full;
    }

    /**
     * @param level a computation level
     * @return whether the surfer may predict (levels 0 and 1)
     */
    public static boolean surfs(int level) {
        return level < 2;
    }
}
