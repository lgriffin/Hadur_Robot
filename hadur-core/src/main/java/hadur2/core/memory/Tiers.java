package hadur2.core.memory;

/**
 * The capability tiers a profile implies (the artifact's "Recognise, then adapt" tables),
 * which the opening book turns into decisions at the first tick.
 *
 * <p>Each tier is read from an {@link Estimate}, and a tier is only named while that
 * estimate's margin of error is at most {@link #MAX_MARGIN} (DIAL-1). A wider margin leaves
 * the tier {@code UNKNOWN}, and an unknown tier gets 1.20's defaults, so Hadur is never
 * worse than 1.20 against an opponent it knows too little about.</p>
 *
 * <p>The gun tier reads their <em>normalised</em> hit rate on us: each hit weighted by how
 * small we looked from where they fired (the surf views' measure, Diamond's), so a rammer's
 * point-blank hits do not make it look like a top gun. The movement tier reads our virtual
 * guns' ratings, weighted the same way.</p>
 */
public final class Tiers {

    /** How well their gun hits us: T0 (head-on or random) to T3 (a top learning gun). */
    public enum Gun { UNKNOWN, T0, T1, T2, T3 }

    /** How their movement holds up against our guns: M0 (predictable) to M3 (flattened surfer). */
    public enum Move { UNKNOWN, M0, M1, M2, M3 }

    /** A tier is named only while its estimate's margin is at most this (DIAL-1). */
    public static final double MAX_MARGIN = 0.03;
    /**
     * Gun tier boundaries on the normalised hit rate: T0 below the first, T3 from the last.
     * The artifact's 4/9/14% were guesses; the S4 bench measured head-on sample bots under
     * 2% and Shadow, a top learning gun, at 8.2% (normalised hits are a little lower than raw
     * hits, as Hadur is usually far away). T1 and T2 are spaced between until the bench has
     * mid-tier guns to measure.
     */
    public static final double[] GUN_BOUNDS = {0.02, 0.045, 0.07};
    /** M0 from this main-gun rating. */
    public static final double M0_RATING = 0.25;
    /** M3 while both ratings, margin included, stay below this. */
    public static final double M3_RATING = 0.10;

    private Tiers() {}

    /** Their normalised hit rate on us, from every firing wave the profile remembers. */
    public static Estimate theirHitRate(OpponentProfile p) {
        return Estimate.of(p.normalisedHits(), p.normalisedWaves());
    }

    public static Estimate mainGunRating(OpponentProfile p) {
        return Estimate.of(p.virtualHits[0], p.virtualFired[0]);
    }

    public static Estimate antiSurferRating(OpponentProfile p) {
        return Estimate.of(p.virtualHits[1], p.virtualFired[1]);
    }

    /** From their normalised hit rate on us: under 2%, 2-4.5%, 4.5-7%, 7% and over. */
    public static Gun gun(OpponentProfile p) {
        Estimate e = theirHitRate(p);
        if (!e.within(MAX_MARGIN)) return Gun.UNKNOWN;
        double rate = e.value();
        if (rate < GUN_BOUNDS[0]) return Gun.T0;
        if (rate < GUN_BOUNDS[1]) return Gun.T1;
        if (rate < GUN_BOUNDS[2]) return Gun.T2;
        return Gun.T3;
    }

    /**
     * From our virtual guns' ratings: main at 25% or more is M0; both certainly under 10%
     * is M3; the anti-surfer gun ahead of the main gun by more than the margin is M2;
     * anything else M1.
     */
    public static Move move(OpponentProfile p) {
        Estimate main = mainGunRating(p);
        Estimate antiSurfer = antiSurferRating(p);
        if (!main.within(MAX_MARGIN) || !antiSurfer.within(MAX_MARGIN)) return Move.UNKNOWN;
        if (main.value() >= M0_RATING) return Move.M0;
        if (main.value() + main.margin() < M3_RATING
                && antiSurfer.value() + antiSurfer.margin() < M3_RATING) {
            return Move.M3;
        }
        if (antiSurfer.value() - main.value() > Math.max(main.margin(), antiSurfer.margin())) {
            return Move.M2;
        }
        return Move.M1;
    }

    /** "T2/M1", with "?" for an unknown tier. */
    public static String label(OpponentProfile p) {
        Gun g = gun(p);
        Move m = move(p);
        return (g == Gun.UNKNOWN ? "T?" : g.name()) + "/" + (m == Move.UNKNOWN ? "M?" : m.name());
    }
}
