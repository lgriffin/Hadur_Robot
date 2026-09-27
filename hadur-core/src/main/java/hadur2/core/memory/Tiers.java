package hadur2.core.memory;

/**
 * The capability tiers a profile implies (the artifact's "Recognise, then adapt" tables).
 * S3 only derives and reports them; S4 turns them into the opening book, and the
 * thresholds are provisional until the bench logs tune them.
 *
 * <p>A tier needs {@link #MIN_SAMPLES} observations behind it; with fewer it is
 * {@code UNKNOWN}, and an unknown opponent gets today's defaults.</p>
 */
public final class Tiers {

    /** How well their gun hits us: T0 (head-on or random) to T3 (a top learning gun). */
    public enum Gun { UNKNOWN, T0, T1, T2, T3 }

    /** How their movement holds up against our guns: M0 (predictable) to M3 (flattened surfer). */
    public enum Move { UNKNOWN, M0, M1, M2, M3 }

    public static final int MIN_SAMPLES = 30;

    private Tiers() {}

    /** From their hit rate on us: under 4%, 4-9%, 9-14%, over 14%. */
    public static Gun gun(OpponentProfile p) {
        if (p.theirShots() < MIN_SAMPLES) return Gun.UNKNOWN;
        double rate = p.theirHitRate();
        if (rate < 0.04) return Gun.T0;
        if (rate < 0.09) return Gun.T1;
        if (rate < 0.14) return Gun.T2;
        return Gun.T3;
    }

    /**
     * From our virtual guns' ratings: main above 25% is M0; both under 10% after three
     * battles is M3; the anti-surfer gun ahead is M2; anything else M1.
     */
    public static Move move(OpponentProfile p) {
        if (p.virtualWaves() < MIN_SAMPLES) return Move.UNKNOWN;
        double main = p.mainGunRating();
        double antiSurfer = p.antiSurferRating();
        if (main > 0.25) return Move.M0;
        if (p.battles() >= 3 && main < 0.10 && antiSurfer < 0.10) return Move.M3;
        if (antiSurfer > main) return Move.M2;
        return Move.M1;
    }

    /** "T2/M1", with "?" for an unknown tier. */
    public static String label(OpponentProfile p) {
        Gun g = gun(p);
        Move m = move(p);
        return (g == Gun.UNKNOWN ? "T?" : g.name()) + "/" + (m == Move.UNKNOWN ? "M?" : m.name());
    }
}
