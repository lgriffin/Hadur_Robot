package hadur2.core.policy;

/**
 * The tick budget (TIME-1, TIME-2): how much work the core may do this tick, as a
 * computation level from 0 (everything) to {@link #MAX_LEVEL}. Each level sheds more:
 *
 * <ol>
 * <li>surf only the nearest wave, with the three options (no second wave, no go-to);</li>
 * <li>also halve k in every KNN view the gun and the surf read;</li>
 * <li>also stop scoring the virtual guns (their ratings hold where they were).</li>
 * </ol>
 *
 * <p>A skipped turn drops one level for the rest of the round (TIME-2); a tick that used
 * more than 70% of the allowance drops one more for the next tick only (TIME-1). Both are
 * driven by what happened, never by the clock or the round number (DIAL-2).</p>
 *
 * <p>The core never reads a clock (RES-6, CORE-2). The adapter times each call into the
 * core and hands the measurement in with the next tick's events as a {@code TickTime}
 * event, which {@code HadurCore} passes to {@link #tickTook}; the allowance is the adapter's
 * constant (3 ms, the bench machine's CPU constant, since Robocode does not tell a robot
 * its own). A {@code SkippedTurn} event goes to {@link #skippedTurn()}. The core then reads
 * {@link #level()} and asks the static methods what that level allows.</p>
 *
 * <p>{@link #maxLevel()} and {@link #slowTicks()} are this round's degradation counters,
 * which the core copies into the round statistics.</p>
 */
public final class TickBudget {

    /** TIME-1: the share of the allowance past which the next tick sheds a level. */
    public static final double THRESHOLD = 0.70;
    /** The deepest level: everything that can be shed is shed. Levels are capped here. */
    public static final int MAX_LEVEL = 3;

    /** Levels held for the rest of the round by skipped turns (TIME-2). */
    private int roundLevel;
    /** Whether the last measured tick went over the threshold: one more level (TIME-1). */
    private boolean slow;
    private int maxLevel;
    private int slowTicks;

    /** A new round starts at full computation (TIME-2's "for the remainder of the round"). */
    public void newRound() {
        roundLevel = 0;
        slow = false;
        maxLevel = 0;
        slowTicks = 0;
    }

    /**
     * TIME-1: the previous tick took {@code usedNanos} of {@code allowanceNanos}.
     *
     * <p>Each measurement replaces the last, so a slow tick costs a level only until the
     * next measurement arrives, one tick later. An allowance of 0 or less means it is
     * unknown, and an unknown allowance never sheds.</p>
     *
     * @param usedNanos how long the core took on the previous tick, in nanoseconds
     * @param allowanceNanos the time a tick may take, in nanoseconds
     */
    public void tickTook(long usedNanos, long allowanceNanos) {
        slow = allowanceNanos > 0 && usedNanos > THRESHOLD * allowanceNanos;
        if (slow) slowTicks++;
        maxLevel = Math.max(maxLevel, level());
    }

    /** TIME-2: the engine skipped a turn. The round's level drops one, down to {@link #MAX_LEVEL}. */
    public void skippedTurn() {
        roundLevel = Math.min(MAX_LEVEL, roundLevel + 1);
        maxLevel = Math.max(maxLevel, level());
    }

    /** The level for this tick: the round's level, one more after a slow tick, at most {@link #MAX_LEVEL}. */
    public int level() {
        return Math.min(MAX_LEVEL, roundLevel + (slow ? 1 : 0));
    }

    /** The level the round is held at by skipped turns alone. */
    public int roundLevel() {
        return roundLevel;
    }

    /** The highest level this round has used. */
    public int maxLevel() {
        return maxLevel;
    }

    /** Ticks this round that went over the threshold. */
    public int slowTicks() {
        return slowTicks;
    }

    /**
     * Level 1 and up surf one wave; level 0 surfs two.
     *
     * @param level a computation level
     * @return how many waves the surf scores
     */
    public static int wavesToSurf(int level) {
        return level >= 1 ? 1 : 2;
    }

    /**
     * Go-to surfing only at full computation; it costs the most.
     *
     * @param level a computation level
     * @return whether go-to surfing may run
     */
    public static boolean goToAllowed(int level) {
        return level == 0;
    }

    /**
     * The share of each view's k to use: half from level 2.
     *
     * @param level a computation level
     * @return the factor on each KNN view's k, 1.0 or 0.5
     */
    public static double kShare(int level) {
        return level >= 2 ? 0.5 : 1.0;
    }

    /**
     * Whether the virtual guns are scored; not at level 3.
     *
     * @param level a computation level
     * @return whether to score the virtual guns this tick
     */
    public static boolean virtualGuns(int level) {
        return level < 3;
    }
}
