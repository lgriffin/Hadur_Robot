package hadurling.core.policy;

/**
 * How much to trust the samples a profile seeded the gun with. They were learned in an earlier
 * battle, perhaps against an older version of the robot, perhaps against a different robot
 * that shared the name. If this battle's evidence says the profile is wrong, the seed should
 * fade, not stay forever (HL-29). If the evidence is thin, or agrees, it must not (HL-30).
 *
 * <p>The rule: after each wave, if the live estimate is narrow enough to judge
 * ({@link #MAX_LIVE_MARGIN}) and differs from the profile's rate by more than the wider of the
 * two margins, the weight falls by a twentieth of its starting value. After
 * {@link #DECAY_WAVES} such waves it is 0. Waves on which they agree change nothing, and the
 * weight never grows back within a battle. It counts waves, never ticks or rounds.</p>
 *
 * <p>The bound on the live margin is a number to check, not to guess. A window of 100 shots
 * has an Agresti-Coull margin of about 8 points at best at a 20% rate, so a bound of 0.05
 * would be a rule that can never fire; the unit test plays a full window to prove this one can.
 * Hadur's review of PR #61 caught the same mistake in one of its power rules, whose margin was
 * set tighter than a full window could ever reach (see {@code docs/strategy-evolution.md}).</p>
 */
public final class SeedTrust {

    /** Diverging waves from full weight to none. */
    public static final int DECAY_WAVES = 20;
    /** The live estimate's margin must be at most this before it can contradict the profile. */
    public static final double MAX_LIVE_MARGIN = 0.10;

    private final Estimate profile;
    private int decayedWaves;
    private int divergedWaves;

    /**
     * A trust that starts at full weight.
     *
     * @param profile the profile's estimate of the rate the live data will be compared with
     */
    public SeedTrust(Estimate profile) {
        this.profile = profile;
    }

    /** @return the weight of the seeded samples, from 1 down to 0 */
    public double weight() {
        return decayedWaves >= DECAY_WAVES ? 0 : (DECAY_WAVES - decayedWaves) / (double) DECAY_WAVES;
    }

    /** @return whether the live data has disagreed with the profile on any wave */
    public boolean distrusted() {
        return divergedWaves > 0;
    }

    /**
     * Whether {@code live}, once certain enough to judge, disagrees with the profile.
     *
     * @param live the live estimate of the same rate
     * @return false while the live margin is over {@link #MAX_LIVE_MARGIN}, or when the profile
     *     has no value
     */
    public boolean diverges(Estimate live) {
        if (!live.within(MAX_LIVE_MARGIN) || Double.isNaN(profile.value())) return false;
        double margin = Math.max(live.margin(), profile.margin());
        return Math.abs(live.value() - profile.value()) > margin;
    }

    /**
     * One more wave has been seen.
     *
     * @param live the live estimate after this wave
     * @return whether the weight fell
     */
    public boolean observe(Estimate live) {
        if (!diverges(live)) return false;
        divergedWaves++;
        if (decayedWaves >= DECAY_WAVES) return false;
        decayedWaves++;
        return true;
    }
}
