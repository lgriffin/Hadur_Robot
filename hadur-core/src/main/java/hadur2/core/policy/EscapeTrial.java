package hadur2.core.policy;

/**
 * RAM-3: whether running from a confirmed rammer (RAM-2) pays against this opponent, decided by
 * the battle's own rounds.
 *
 * <p>RAM-2 (3.5) won rounds back from pure rammers, which hit Hadur hard at point-blank range.
 * It also escaped from close-range fighters that 3.4 beat by standing its ground (TopGun,
 * Silver, Ice, Predator and others, docs/bench/local/2026-10-07_live-loser-bisect.md): running,
 * Hadur was hit two to seven times as often and lost 6 to 28 points a pairing. Both kinds
 * confirm as rammers, so the confirmation cannot tell them apart; the rounds can.</p>
 *
 * <p>Each round of a battle in which the enemy rammed is a sample for one of two arms, scored
 * by the round's energy margin: our energy at its end less the enemy's (a dead robot's is 0).
 * Rounds with a ram before the rammer was confirmed were fought as 3.4 fights, so they are
 * {@link Arm#FIGHT} samples. Once confirmed, each round plays one arm from its start: the
 * escape until it has {@value #MIN_SAMPLES} rounds of its own, then whichever arm's mean margin
 * is higher, the escape on a tie. So against a pure rammer the battle plays as 3.5 played it
 * after two trial rounds, and against a fighter Hadur goes back to fighting after two.</p>
 *
 * <p>Battle-long, forgotten with the opponent. Pure and stateless apart from the samples
 * (DIAL-2).</p>
 */
public final class EscapeTrial {

    /** The two ways to play a confirmed rammer. */
    public enum Arm {
        /** RAM-1 only, as 3.4 plays: surf, orbit and fire full power at a close charger. */
        FIGHT,
        /** RAM-2: drive the heading that keeps the pursuer furthest away. */
        ESCAPE
    }

    /** Rounds each arm must have played before the other can be preferred to it. */
    public static final int MIN_SAMPLES = 2;

    private final double[] sum = new double[2];
    private final int[] count = new int[2];

    /**
     * RAM-3: the arm a round with a confirmed rammer plays, chosen at its start.
     *
     * @return {@link Arm#ESCAPE} until it has {@value #MIN_SAMPLES} rounds, then the arm with
     *     the higher mean margin, the escape on a tie or while the fight has fewer rounds
     */
    public Arm choose() {
        int esc = Arm.ESCAPE.ordinal();
        int fight = Arm.FIGHT.ordinal();
        if (count[esc] < MIN_SAMPLES || count[fight] < MIN_SAMPLES) return Arm.ESCAPE;
        return mean(Arm.FIGHT) > mean(Arm.ESCAPE) ? Arm.FIGHT : Arm.ESCAPE;
    }

    /**
     * RAM-3: one round's result for the arm it was played with.
     *
     * @param arm the arm the round played
     * @param margin our energy at the round's end less the enemy's
     */
    public void record(Arm arm, double margin) {
        if (Double.isNaN(margin)) return;
        sum[arm.ordinal()] += margin;
        count[arm.ordinal()]++;
    }

    /** The rounds recorded for {@code arm}. */
    public int rounds(Arm arm) {
        return count[arm.ordinal()];
    }

    /** The mean margin of {@code arm}'s rounds; NaN before it has one. */
    public double mean(Arm arm) {
        int n = count[arm.ordinal()];
        return n == 0 ? Double.NaN : sum[arm.ordinal()] / n;
    }

    /** A different opponent: the samples go. */
    public void forget() {
        sum[0] = sum[1] = 0;
        count[0] = count[1] = 0;
    }
}
