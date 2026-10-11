package hadur2.core.adapt;

import hadur2.core.memory.Estimate;
import hadur2.core.memory.Tiers;
import java.util.Collections;
import java.util.List;

/**
 * What the opening book decided for one battle, read once from the profile at the first
 * scan (the artifact's "one struct"). Everything after it is live learning.
 *
 * <p>Built only by {@link OpeningBook#read} (or {@link #STRANGER}) and immutable. The core
 * applies it at the first scan: the gun choice through the gun controller's
 * {@code setOpening} (ADAPT-1), {@link #flattenerFirst()} and {@link #surfPrior()} through
 * the movement controller (ADAPT-2), the seeds through a {@link SeedLoader} at
 * {@link #seedWeight()} (ADAPT-3), and {@link #distance()} as the distance policy's
 * starting target. {@link #theirHitRate()} and {@link #mainGunRating()} are kept so the
 * two {@link SeedTrust}s can judge the seeds against the evidence they came from
 * (RES-4).</p>
 */
public final class Opening {

    /** The gun to start with (ADAPT-1), from the movement tier. */
    public enum Gun {
        /** No opinion: 1.20's head-on warm-up, then the better-rated virtual gun. */
        LIVE,
        /** Movement tier M0 or M1: the main KNN gun until the live ratings clearly prefer the other. */
        MAIN,
        /** ADAPT-1: movement tier M2 or M3, the anti-surfer gun from the first firing wave. */
        ANTI_SURFER
    }

    /**
     * The opening for a stranger: 1.20's defaults, no prior, no seeds, seed weight 0 and
     * 1.20's 650 px. Also what the core uses before the first scan and without memory.
     */
    public static final Opening STRANGER = new Opening(Tiers.Gun.UNKNOWN, Tiers.Move.UNKNOWN,
        Gun.LIVE, false, Estimate.NONE, Estimate.NONE, Estimate.NONE, 0.0,
        Collections.emptyList(), Collections.emptyList(), OpeningBook.STRANGER_DISTANCE, false, false);

    private final Tiers.Gun gunTier;
    private final Tiers.Move moveTier;
    private final Gun gun;
    private final boolean flattenerFirst;
    private final Estimate surfPrior;
    private final Estimate theirHitRate;
    private final Estimate mainGunRating;
    private final double seedWeight;
    private final List<double[]> gunSeed;
    private final List<double[]> surfSeed;
    private final double distance;
    private final boolean leadAware;
    private final boolean shielder;

    /** Every decision, as {@link OpeningBook#read} computed it; the seed lists are wrapped read-only. */
    Opening(Tiers.Gun gunTier, Tiers.Move moveTier, Gun gun, boolean flattenerFirst,
            Estimate surfPrior, Estimate theirHitRate, Estimate mainGunRating, double seedWeight,
            List<double[]> gunSeed, List<double[]> surfSeed, double distance, boolean leadAware,
            boolean shielder) {
        this.gunTier = gunTier;
        this.moveTier = moveTier;
        this.gun = gun;
        this.flattenerFirst = flattenerFirst;
        this.surfPrior = surfPrior;
        this.theirHitRate = theirHitRate;
        this.mainGunRating = mainGunRating;
        this.seedWeight = seedWeight;
        this.gunSeed = Collections.unmodifiableList(gunSeed);
        this.surfSeed = Collections.unmodifiableList(surfSeed);
        this.distance = distance;
        this.leadAware = leadAware;
        this.shielder = shielder;
    }

    /**
     * S5: the distance the battle starts at, in px; the distance policy moves it from there
     * (DIST-1). 650 for a stranger, 400 to 550 for gun tiers T0 to T3.
     */
    public double distance() {
        return distance;
    }

    /**
     * ADAPT-5: whether the profile records POW-7's hit-rate condition as standing at the last
     * battle's end, so the lead-aware power rule applies from the first shot until this
     * battle's own rates contradict it. False for a stranger.
     */
    public boolean leadAware() {
        return leadAware;
    }

    /**
     * SHIELD-3: whether the profile records the enemy as a bullet shielder, so the core treats
     * it as one from the first shot. False for a stranger.
     */
    public boolean shielder() {
        return shielder;
    }

    /** Their gun's tier from the profile, {@code UNKNOWN} while its margin is too wide (DIAL-1). */
    public Tiers.Gun gunTier() {
        return gunTier;
    }

    /** Their movement's tier from the profile, {@code UNKNOWN} while its margin is too wide (DIAL-1). */
    public Tiers.Move moveTier() {
        return moveTier;
    }

    /** The gun to start with (ADAPT-1). */
    public Gun gun() {
        return gun;
    }

    /** ADAPT-2: whether the flattener views are on from the first surfable wave. */
    public boolean flattenerFirst() {
        return flattenerFirst;
    }

    /**
     * Their normalised hit rate as the surf's view thresholds should read it until the live
     * estimate is narrower, or {@link Estimate#NONE} to leave them to live data (DIAL-1).
     */
    public Estimate surfPrior() {
        return surfPrior;
    }

    /** The profile's estimate of their normalised hit rate, which the surf seeds are trusted on. */
    public Estimate theirHitRate() {
        return theirHitRate;
    }

    /** The profile's main-gun rating, which the gun seeds are trusted on. */
    public Estimate mainGunRating() {
        return mainGunRating;
    }

    /** ADAPT-3: the weight the seeds start at; live samples weigh 1. */
    public double seedWeight() {
        return seedWeight;
    }

    /** Gun samples to replay, oldest first, as {@link hadur2.core.memory.Seeds#gun(short[])} gives them. */
    public List<double[]> gunSeed() {
        return gunSeed;
    }

    /** Surf samples to replay, oldest first, as {@link hadur2.core.memory.Seeds#surf(short[])} gives them. */
    public List<double[]> surfSeed() {
        return surfSeed;
    }
}
