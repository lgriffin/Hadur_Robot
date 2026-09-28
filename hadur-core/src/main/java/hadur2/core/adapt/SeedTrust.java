package hadur2.core.adapt;

import hadur2.core.memory.Estimate;
import hadur2.core.model.SeedWeight;

/**
 * RES-4: watches one seed against the live evidence, a wave at a time. While the live
 * estimate is certain enough to judge and differs from the profile's by more than the wider
 * of their margins of error, each
 * wave takes a twentieth of the starting weight off the seed, so a poisoned seed (a new
 * version, a different bot under an old name) weighs nothing within {@link #DECAY_WAVES}
 * waves. While they agree, the weight holds; it never grows back within a battle.
 *
 * <p>It counts waves, never ticks or rounds (DIAL-2).</p>
 *
 * <p>The core keeps two per battle: the gun seed's, judged against our main gun's live
 * virtual rating once per virtual wave, and the surf seed's, judged against their live
 * normalised hit rate once per enemy firing wave that breaks. Each is built with the
 * profile's own estimate of the same rate ({@link Opening#mainGunRating()} or
 * {@link Opening#theirHitRate()}), which is what the seed was learned under.</p>
 *
 * <p>The decay is linear in diverging waves: after {@code k} of them the weight is
 * {@code start * (20 - k) / 20}, and 0 from the twentieth on. Waves on which the two
 * estimates agree neither lower nor restore it, so "within 20 waves" counts diverging
 * waves.</p>
 */
public final class SeedTrust {

    /** RES-4: diverging waves from the starting weight to zero. */
    public static final int DECAY_WAVES = 20;
    /**
     * The live estimate's margin must be at most this before it can contradict the profile.
     * A weighted hit is not a coin flip (one close hit can weigh more than a whole wave), so
     * the first few waves' margins understate how little they know; the S4 bench saw one hit
     * in the first wave "disprove" a 2000-wave profile. 5 points, as a fraction.
     */
    public static final double MAX_LIVE_MARGIN = 0.05;

    private final SeedWeight weight;
    /** The weight at construction: the opening's seed weight, or 0 without a seed. */
    private final double start;
    private final Estimate profile;
    /** Diverging waves on which the weight actually fell. */
    private int decayedWaves;
    /** Every diverging wave, including those after the weight reached 0. */
    private int divergedWaves;

    /**
     * A trust watching {@code weight}, starting from its current value.
     *
     * @param weight the weight the seed's samples share in the KNN views; this trust lowers it
     * @param profile the profile's estimate the seed was learned under
     */
    public SeedTrust(SeedWeight weight, Estimate profile) {
        this.weight = weight;
        this.start = weight.value();
        this.profile = profile;
    }

    /** The weight this trust controls. */
    public SeedWeight weight() {
        return weight;
    }

    /** Waves on which the weight was lowered. */
    public int decayedWaves() {
        return decayedWaves;
    }

    /**
     * Whether the live data has disagreed with the profile on any wave this battle. The
     * core then also stops following the profile's opening, whether or not there was a seed.
     */
    public boolean distrusted() {
        return divergedWaves > 0;
    }

    /**
     * Whether {@code live}, once certain enough to judge ({@link #MAX_LIVE_MARGIN}), disagrees
     * with the profile by more than either margin.
     *
     * @param live the live estimate of the same rate as the profile's
     * @return false while the live margin is over {@link #MAX_LIVE_MARGIN}, or when the
     *     profile has no value
     */
    public boolean diverges(Estimate live) {
        // RES-4's "more than the margin of error": the raw values must differ by more
        // than the wider margin, so neither estimate's noise alone can trigger it.
        if (!live.within(MAX_LIVE_MARGIN) || Double.isNaN(profile.value())) return false;
        double margin = Math.max(live.margin(), profile.margin());
        // DIAL-3: a margin this comparison cannot trust is not "no divergence" (an Estimate
        // in practice never carries one, but a silent NaN comparison would fail that way by
        // accident); the conservative reading for a seed is to stop trusting it.
        if (!Double.isFinite(margin)) return true;
        return Math.abs(live.value() - profile.value()) > margin;
    }

    /**
     * One more wave seen with {@code live} as the estimate.
     *
     * @param live the live estimate after this wave
     * @return whether the weight fell
     */
    public boolean observe(Estimate live) {
        if (!diverges(live)) return false;
        divergedWaves++;
        if (weight.value() == 0) return false;
        decayedWaves++;
        // Linear from the starting weight: a twentieth of it per diverging wave, exactly 0
        // on the twentieth (not a float residue).
        weight.set(decayedWaves >= DECAY_WAVES ? 0 : start * (DECAY_WAVES - decayedWaves) / DECAY_WAVES);
        return true;
    }
}
