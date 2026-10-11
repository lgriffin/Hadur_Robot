package hadur2.core.policy;

import hadur2.core.memory.Estimate;

/**
 * MATCH-1: whether this battle's duel is one Hadur is already winning on the guns, read from
 * the two battle-long hit rates {@code DuelController} keeps (POW-11).
 *
 * <p>The DrussGT route (D1 to D5) was built for the opponents 3.7 lost to, whose guns hit
 * Hadur at least as often as Hadur hits them. Live, 3.8 gained on those and lost about 1.5
 * points a pairing on the field below the top 20 ({@code docs/bench/live-3.8.md},
 * {@code docs/leak-38-plan.md}). A won matchup is one where our rate's lower bound is above
 * theirs' upper bound, each over at least {@value #MIN_BULLETS} bullets. Against the top 10
 * our gun hits 5% to 8% and theirs 9% to 14%, so they never read as won; against the field
 * below, ours is well above theirs within a round or two.</p>
 *
 * <p>Once won, the reading holds until our lower bound falls to their raw rate, not just
 * to their upper bound, so it does not flicker on each bullet near the line.</p>
 *
 * <p>Before both sides have fired {@value #MIN_BULLETS} bullets nothing is known and the
 * matchup reads as open, so the route keeps its first-round behaviour (SHIELD-3's opening
 * latch against DrussGT). Pure and stateless (DIAL-2).</p>
 */
public final class Matchup {

    /** Bullets each side must have resolved before the matchup can read as won. */
    public static final int MIN_BULLETS = 30;

    private Matchup() {
    }

    /**
     * MATCH-1: whether the guns already favour us by more than both margins.
     *
     * @param ours our battle-long hit rate over all bullets
     * @param theirs the enemy's battle-long hit rate over all bullets
     * @param wasWon the reading before this one
     * @return true when both rest on {@value #MIN_BULLETS} bullets or more and our lower
     *     bound is above their upper bound (or, while already won, above their raw rate);
     *     false while either is unknown
     */
    public static boolean won(Estimate ours, Estimate theirs, boolean wasWon) {
        if (ours.samples() < MIN_BULLETS || theirs.samples() < MIN_BULLETS) return false;
        if (Double.isNaN(ours.value()) || Double.isNaN(theirs.value())) return false;
        double line = wasWon ? theirs.value() : theirs.value() + theirs.margin();
        return ours.value() - ours.margin() > line;
    }
}
