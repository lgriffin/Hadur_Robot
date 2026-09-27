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
 *
 * <p>{@code hadur2.core.adapt.OpeningBook} reads both tiers once, at the first scan: the
 * movement tier picks the first gun (ADAPT-1), gun tier T3 turns on the flattener
 * (ADAPT-2), and the gun tier sets the starting distance. The power policy reads the gun
 * tier too (POW-1 fires 3.0 against T0). All rates here are fractions, not percentages.</p>
 */
public final class Tiers {

    /**
     * How well their gun hits us: T0 (head-on or random) to T3 (a top learning gun).
     * {@code UNKNOWN} while the estimate's margin exceeds {@link #MAX_MARGIN}.
     */
    public enum Gun { UNKNOWN, T0, T1, T2, T3 }

    /**
     * How their movement holds up against our guns: M0 (predictable) to M3 (flattened surfer).
     * {@code UNKNOWN} while either virtual gun's margin exceeds {@link #MAX_MARGIN}.
     */
    public enum Move { UNKNOWN, M0, M1, M2, M3 }

    /**
     * A tier is named only while its estimate's margin is at most this (DIAL-1): 3 points,
     * the threshold docs/requirements.md gives for the S4 readings.
     */
    public static final double MAX_MARGIN = 0.03;
    /**
     * Gun tier boundaries on the normalised hit rate: T0 below the first, T3 from the last.
     * The artifact's 4/9/14% were guesses; the S4 bench measured head-on sample bots under
     * 2% and Shadow, a top learning gun, at 8.2% (normalised hits are a little lower than raw
     * hits, as Hadur is usually far away). T1 and T2 are spaced between until the bench has
     * mid-tier guns to measure.
     */
    public static final double[] GUN_BOUNDS = {0.02, 0.045, 0.07};
    /** M0 from this main-gun rating (weighted virtual hits per wave): our main gun hits them a quarter of the time. */
    public static final double M0_RATING = 0.25;
    /** M3 while both ratings, margin included, stay below this: neither gun can find them. */
    public static final double M3_RATING = 0.10;

    private Tiers() {}

    /**
     * Their normalised hit rate on us, from every firing wave the profile remembers.
     *
     * @param p the profile
     * @return weighted hits over firing waves that broke on us; {@link Estimate#NONE} before any wave
     */
    public static Estimate theirHitRate(OpponentProfile p) {
        return Estimate.of(p.normalisedHits(), p.normalisedWaves());
    }

    /**
     * Our main KNN gun's virtual rating against them: weighted virtual hits per virtual wave.
     *
     * @param p the profile
     * @return the rating, or {@link Estimate#NONE} before any virtual wave
     */
    public static Estimate mainGunRating(OpponentProfile p) {
        return Estimate.of(p.virtualHits[0], p.virtualFired[0]);
    }

    /**
     * Our anti-surfer gun's virtual rating against them, measured the same way as
     * {@link #mainGunRating}.
     *
     * @param p the profile
     * @return the rating, or {@link Estimate#NONE} before any virtual wave
     */
    public static Estimate antiSurferRating(OpponentProfile p) {
        return Estimate.of(p.virtualHits[1], p.virtualFired[1]);
    }

    /**
     * From their normalised hit rate on us: under 2%, 2-4.5%, 4.5-7%, 7% and over.
     *
     * @param p the profile
     * @return the gun tier, or {@link Gun#UNKNOWN} while the rate's margin is over 3 points
     */
    public static Gun gun(OpponentProfile p) {
        Estimate e = theirHitRate(p);
        // DIAL-1: too uncertain to name a tier, so the opening stays conservative (1.20's).
        if (!e.within(MAX_MARGIN)) return Gun.UNKNOWN;
        // The bounds compare the raw rate, not the Agresti-Coull centre; with a margin of
        // at most 3 points the two are close.
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
     *
     * <p>The order matters: a robot our main gun hits often is predictable (M0) whatever the
     * anti-surfer gun does, and one neither gun can hit is a flattened surfer (M3) before
     * the M2 comparison is made. M2 means the anti-surfer gun clearly does better than the
     * main gun, the sign of a movement that adapts to where it has been shot at (a surfer,
     * which ADAPT-1 answers with the anti-surfer gun).</p>
     *
     * @param p the profile
     * @return the movement tier, or {@link Move#UNKNOWN} while either rating's margin is over 3 points
     */
    public static Move move(OpponentProfile p) {
        Estimate main = mainGunRating(p);
        Estimate antiSurfer = antiSurferRating(p);
        // DIAL-1: both ratings must be certain enough before a tier is named.
        if (!main.within(MAX_MARGIN) || !antiSurfer.within(MAX_MARGIN)) return Move.UNKNOWN;
        if (main.value() >= M0_RATING) return Move.M0;
        // "Certainly under": the upper end of each interval (raw value plus margin) is below 10%.
        if (main.value() + main.margin() < M3_RATING
                && antiSurfer.value() + antiSurfer.margin() < M3_RATING) {
            return Move.M3;
        }
        // The anti-surfer gun leads by more than the wider of the two margins.
        if (antiSurfer.value() - main.value() > Math.max(main.margin(), antiSurfer.margin())) {
            return Move.M2;
        }
        return Move.M1;
    }

    /**
     * The two tiers as telemetry prints them, e.g. {@code "T2/M1"}, with {@code "?"} for an
     * unknown tier ({@code "T?/M?"} for a stranger).
     *
     * @param p the profile
     * @return the label
     */
    public static String label(OpponentProfile p) {
        Gun g = gun(p);
        Move m = move(p);
        return (g == Gun.UNKNOWN ? "T?" : g.name()) + "/" + (m == Move.UNKNOWN ? "M?" : m.name());
    }
}
