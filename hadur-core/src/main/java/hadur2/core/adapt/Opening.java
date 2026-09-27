package hadur2.core.adapt;

import hadur2.core.memory.Estimate;
import hadur2.core.memory.Tiers;
import java.util.Collections;
import java.util.List;

/**
 * What the opening book decided for one battle, read once from the profile at the first
 * scan (the artifact's "one struct"). Everything after it is live learning.
 */
public final class Opening {

    /** The gun to start with. */
    public enum Gun {
        /** No opinion: 1.20's head-on warm-up, then the better-rated virtual gun. */
        LIVE,
        /** The main KNN gun until the live ratings clearly prefer the other. */
        MAIN,
        /** ADAPT-1: the anti-surfer gun from the first firing wave. */
        ANTI_SURFER
    }

    /** The opening for a stranger: 1.20's defaults, no prior, no seeds. */
    public static final Opening STRANGER = new Opening(Tiers.Gun.UNKNOWN, Tiers.Move.UNKNOWN,
        Gun.LIVE, false, Estimate.NONE, Estimate.NONE, Estimate.NONE, 0.0,
        Collections.emptyList(), Collections.emptyList());

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

    Opening(Tiers.Gun gunTier, Tiers.Move moveTier, Gun gun, boolean flattenerFirst,
            Estimate surfPrior, Estimate theirHitRate, Estimate mainGunRating, double seedWeight,
            List<double[]> gunSeed, List<double[]> surfSeed) {
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
    }

    public Tiers.Gun gunTier() {
        return gunTier;
    }

    public Tiers.Move moveTier() {
        return moveTier;
    }

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

    /** Surf samples to replay, oldest first. */
    public List<double[]> surfSeed() {
        return surfSeed;
    }
}
