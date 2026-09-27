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
 */
public final class SeedTrust {

    public static final int DECAY_WAVES = 20;
    /**
     * The live estimate's margin must be at most this before it can contradict the profile.
     * A weighted hit is not a coin flip (one close hit can weigh more than a whole wave), so
     * the first few waves' margins understate how little they know; the S4 bench saw one hit
     * in the first wave "disprove" a 2000-wave profile.
     */
    public static final double MAX_LIVE_MARGIN = 0.05;

    private final SeedWeight weight;
    private final double start;
    private final Estimate profile;
    private int decayedWaves;
    private int divergedWaves;

    public SeedTrust(SeedWeight weight, Estimate profile) {
        this.weight = weight;
        this.start = weight.value();
        this.profile = profile;
    }

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
     */
    public boolean diverges(Estimate live) {
        if (!live.within(MAX_LIVE_MARGIN) || Double.isNaN(profile.value())) return false;
        return Math.abs(live.value() - profile.value()) > Math.max(live.margin(), profile.margin());
    }

    /** One more wave seen with {@code live} as the estimate; returns whether the weight fell. */
    public boolean observe(Estimate live) {
        if (!diverges(live)) return false;
        divergedWaves++;
        if (weight.value() == 0) return false;
        decayedWaves++;
        weight.set(decayedWaves >= DECAY_WAVES ? 0 : start * (DECAY_WAVES - decayedWaves) / DECAY_WAVES);
        return true;
    }
}
