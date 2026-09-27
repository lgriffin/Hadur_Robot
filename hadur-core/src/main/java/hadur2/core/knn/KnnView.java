package hadur2.core.knn;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.util.*;

/**
 * One KNN "view" of an opponent: a feature space (its {@link DistanceFormula}), a bounded
 * {@link KdTree} of past wave outcomes in that space, and the settings that say which waves
 * it learns from and how many neighbours it returns.
 *
 * <p>The gun keeps a main view and four anti-surfer views per opponent
 * ({@code hadur2.core.gun.GunController}); the surf keeps its danger and flattener views
 * ({@code hadur2.core.move.MoveController}). When a wave breaks, the owner calls
 * {@link #logWave(Wave, Object)} with where the target went; when it aims or surfs, it calls
 * {@link #nearestNeighbors(Wave, boolean)} and combines the neighbours' values into a
 * density. Views are built with the fluent setters, which return the view.</p>
 *
 * <p>Invariants: the tree's dimension is {@code formula.weights.length}, and the tree never
 * holds more than {@link #maxDataPoints} points, or {@link #DEFAULT_MAX_DATA_POINTS} when that
 * is 0 (RES-2). Samples replayed from an opponent profile go in through
 * {@link #logSeed(double[], Object, SeedWeight)} and carry a shared {@link SeedWeight}
 * (ADAPT-3); {@link #effectiveSize()} stops counting them once that weight reaches 0
 * (RES-4).</p>
 *
 * @param <T> the value logged with each point: a firing angle for the gun, a guess factor
 *     for the surf
 */
public class KnnView<T> {

    /**
     * This view's weight when several views' neighbours are combined (the anti-surfer gun's
     * density, the surf's danger). 1 unless set.
     */
    public double weight;
    /** The feature space; its weights are the tree's weights. */
    public DistanceFormula formula;
    /** The most neighbours a search returns. */
    public int kSize;
    /**
     * Data points per neighbour: a search returns {@code size() / kDivisor} neighbours,
     * clamped to [1, {@link #kSize}], so k grows as the view fills. The anti-surfer gun also
     * reads it as the fewest effective points before a view is used.
     */
    public int kDivisor;
    /** TIME-1, TIME-2: the share of k used while the tick budget is short; 1 is all of it. */
    private double kShare = 1.0;
    /**
     * The most points the tree keeps, oldest evicted first (RES-2); 0 means
     * {@link #DEFAULT_MAX_DATA_POINTS}. Set only through {@link #setMaxDataPoints(int)}.
     */
    public int maxDataPoints;
    /** Whether the surf logs enemy bullet hits on us (and seeded hits) into this view. */
    public boolean logBulletHits;
    /** Whether this view learns from every wave as it breaks (visits), not only from hits. */
    public boolean logVisits;
    /** Whether this view also learns from virtual waves (waves no real bullet rode). */
    public boolean logVirtual;
    /** Whether this view also learns in battles with more than one opponent. */
    public boolean logMelee;
    /**
     * The enemy hit percentage (0 to 100) at or above which the surf switches this view on;
     * see {@link #thresholdsMet(double, double)}.
     */
    public double hitThreshold;
    /**
     * The same threshold, compared against the hit percentage less its margin of error, so
     * the view comes on only once the rate is certainly that high (DIAL-1).
     */
    public double paddedHitThreshold;
    /**
     * How fast older neighbours lose weight in {@link #getDecayWeights(List)}: each step
     * back in time divides the weight by this. {@link #NO_DECAY} (0) weighs all alike.
     */
    public double decayRate;
    /** The view's name: the key it is stored under, and its label in the logs. */
    public String name;
    /**
     * The surf's neighbour lists by surf wave index (0 for the first wave it surfs), so a
     * wave's neighbours are searched once while the surf scores many candidate positions
     * against it. The surf clears it through {@link #clearCache()} whenever the wave it
     * surfs changes, and both owners clear it at each round's start, which bounds it (RES-2).
     */
    public Map<Integer, List<KdTree.Entry<T>>> cachedNeighbors;

    /** A {@link #decayRate} that gives every neighbour weight 1. */
    public static final double NO_DECAY = 0.0;

    /**
     * Cap for views that set no limit of their own (RES-2). It sits above what a 35-round
     * battle collects, so normal battles behave exactly as if unbounded.
     */
    public static final int DEFAULT_MAX_DATA_POINTS = 50_000;

    private KdTree<T> tree;
    /** Points ever added, and how many of them were seeds (ADAPT-3), since the tree was made. */
    private long added;
    private int seeds;
    /** The weight the seeds share; null while there are none. */
    private SeedWeight seedWeight;

    /**
     * An empty view in {@code formula}'s space with weight 1, k 1, no logging switched on,
     * no thresholds, no decay and the default size cap.
     *
     * @param formula the feature space; its weights become the tree's
     */
    public KnnView(DistanceFormula formula) {
        this.formula = formula;
        this.weight = 1.0;
        this.kSize = 1;
        this.kDivisor = 1;
        this.logBulletHits = false;
        this.logVisits = false;
        this.logVirtual = false;
        this.logMelee = false;
        this.hitThreshold = 0.0;
        this.paddedHitThreshold = 0.0;
        this.maxDataPoints = 0;
        this.decayRate = 0.0;
        this.name = "view";
        this.initTree();
        this.cachedNeighbors = new HashMap<>();
    }

    /**
     * Starts a new, empty tree with the current size cap (RES-2) and forgets the seed
     * counts. The tree holds the formula's weight array by reference.
     */
    private void initTree() {
        tree = new KdTree<>(formula.weights.length,
            maxDataPoints == 0 ? DEFAULT_MAX_DATA_POINTS : maxDataPoints);
        tree.setWeights(formula.weights);
        added = 0;
        seeds = 0;
        seedWeight = null;
    }

    /**
     * Sets {@link #weight}.
     *
     * @param weight this view's weight among the owner's views
     * @return this view
     */
    public KnnView<T> setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Sets {@link #kSize}.
     *
     * @param kSize the most neighbours a search returns
     * @return this view
     */
    public KnnView<T> setK(int kSize) {
        this.kSize = kSize;
        return this;
    }

    /**
     * TIME-1, TIME-2: the share of k to use while the tick budget is short; 1 is all of it.
     *
     * @param kShare the share of k, in (0, 1]
     * @return this view
     */
    public KnnView<T> setKShare(double kShare) {
        this.kShare = kShare;
        return this;
    }

    /**
     * Sets {@link #kDivisor}.
     *
     * @param kDivisor data points per neighbour
     * @return this view
     */
    public KnnView<T> setKDivisor(int kDivisor) {
        this.kDivisor = kDivisor;
        return this;
    }

    /**
     * Switches on {@link #logBulletHits}.
     *
     * @return this view
     */
    public KnnView<T> bulletHitsOn() {
        this.logBulletHits = true;
        return this;
    }

    /**
     * Switches on {@link #logVisits}.
     *
     * @return this view
     */
    public KnnView<T> visitsOn() {
        this.logVisits = true;
        return this;
    }

    /**
     * Switches on {@link #logVirtual}.
     *
     * @return this view
     */
    public KnnView<T> virtualWavesOn() {
        this.logVirtual = true;
        return this;
    }

    /**
     * Switches on {@link #logMelee}.
     *
     * @return this view
     */
    public KnnView<T> meleeOn() {
        this.logMelee = true;
        return this;
    }

    /**
     * Sets {@link #hitThreshold}.
     *
     * @param hitThreshold the enemy hit percentage that switches the view on
     * @return this view
     */
    public KnnView<T> setHitThreshold(double hitThreshold) {
        this.hitThreshold = hitThreshold;
        return this;
    }

    /**
     * Sets {@link #paddedHitThreshold}.
     *
     * @param paddedHitThreshold the hit percentage, less its margin, that switches the view on
     * @return this view
     */
    public KnnView<T> setPaddedHitThreshold(double paddedHitThreshold) {
        this.paddedHitThreshold = paddedHitThreshold;
        return this;
    }

    /**
     * Sets the size cap (RES-2). This replaces the tree with an empty one, so it belongs in
     * the builder chain, before any point is logged.
     *
     * @param maxDataPoints the most points kept; 0 for {@link #DEFAULT_MAX_DATA_POINTS}
     * @return this view
     */
    public KnnView<T> setMaxDataPoints(int maxDataPoints) {
        this.maxDataPoints = maxDataPoints;
        this.initTree();
        return this;
    }

    /**
     * Sets {@link #decayRate}.
     *
     * @param decayRate the divisor per step back in time; {@link #NO_DECAY} for none
     * @return this view
     */
    public KnnView<T> setDecayRate(double decayRate) {
        this.decayRate = decayRate;
        return this;
    }

    /**
     * Sets {@link #name}.
     *
     * @param name the view's key and label
     * @return this view
     */
    public KnnView<T> setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Logs a broken wave: its logging point ({@code aiming = false}) with {@code value},
     * where the target went.
     *
     * @param w the wave that broke
     * @param value the outcome to store with it
     * @return the point that was logged
     */
    public double[] logWave(Wave w, T value) {
        double[] dataPoint = formula.dataPointFromWave(w);
        return logDataPoint(dataPoint, value);
    }

    /**
     * Adds a sample replayed from an opponent profile (ADAPT-3). The point must already be
     * in this view's formula space; the value carries the seed's weight.
     *
     * <p>All seeds in one view are expected to share one {@code weight}; the last one given
     * is the one {@link #effectiveSize()} reads. The point is copied, so the caller may reuse
     * its array and the tree's eviction (by array identity) still finds each point.</p>
     *
     * @param dataPoint the sample's features, {@code formula.weights.length} values
     * @param value the outcome, carrying the same weight
     * @param weight the weight the seeds share
     * @throws IllegalArgumentException if the point has the wrong number of dimensions
     */
    public void logSeed(double[] dataPoint, T value, SeedWeight weight) {
        if (dataPoint.length != formula.weights.length) {
            throw new IllegalArgumentException(name + " takes " + formula.weights.length + " dimensions");
        }
        seeds++;
        seedWeight = weight;
        logDataPoint(dataPoint.clone(), value);
    }

    /**
     * Adds a point as it is. The tree keeps the array by reference, so the caller must not
     * change it afterwards.
     *
     * @param dataPoint the features, {@code formula.weights.length} values
     * @param value the outcome to store with it
     * @return {@code dataPoint}
     */
    public double[] logDataPoint(double[] dataPoint, T value) {
        added++;
        tree.addPoint(dataPoint, value);
        return dataPoint;
    }

    /** Forgets the cached neighbour lists (see {@link #cachedNeighbors}). */
    public void clearCache() {
        cachedNeighbors.clear();
    }

    /**
     * Whether the view has data and {@link #thresholdsMet(double, double)}.
     *
     * @param hitPercentage the enemy's hit percentage, 0 to 100
     * @param marginOfError its margin of error, in percentage points
     * @return true when the view should count
     */
    public boolean enabled(double hitPercentage, double marginOfError) {
        return size() > 0 && thresholdsMet(hitPercentage, marginOfError);
    }

    /**
     * Whether an enemy hit percentage and its margin clear this view's thresholds.
     *
     * <p>The rate itself must reach {@link #hitThreshold}, and the rate less its margin
     * (floored at 0) must reach {@link #paddedHitThreshold}: a view gated on the padded
     * threshold waits until the rate is certainly high enough (DIAL-1).</p>
     *
     * @param hitPercentage the enemy's hit percentage, 0 to 100
     * @param marginOfError its margin of error, in percentage points
     * @return true when both thresholds are met
     */
    public boolean thresholdsMet(double hitPercentage, double marginOfError) {
        return hitPercentage >= hitThreshold
            && Math.max(0, hitPercentage - marginOfError) >= paddedHitThreshold;
    }

    /** The points held, seeds included, after eviction; at most the cap (RES-2). */
    public int size() {
        return tree.size();
    }

    /**
     * Samples that still carry weight: {@link #size()} less the seeds once their weight has
     * fallen to zero (RES-4). The tree evicts oldest first and seeds go in first, so evicted
     * points are counted against the seeds.
     *
     * <p>The gun reads this for its warm-up thresholds, so a faded seed leaves the gun as
     * cold as it would be without one.</p>
     *
     * @return the number of points that still count, never negative
     */
    public int effectiveSize() {
        if (seedWeight == null || seedWeight.value() > 0) return size();
        // Seeds are the oldest points, so the first evictions took seeds: whatever seeds
        // were not evicted are still in the tree, and count for nothing.
        long evicted = added - size();
        long deadSeeds = Math.max(0, seeds - evicted);
        return (int) Math.max(0, size() - deadSeeds);
    }

    /**
     * The neighbours of {@code w}'s point, k chosen from the view's size: one neighbour per
     * {@link #kDivisor} points, clamped to [1, {@link #kSize}], then scaled by the k share
     * (TIME-1, TIME-2) and never below 1.
     *
     * @param w the wave to find neighbours for
     * @param aiming passed to the formula; true for a gun query
     * @return up to k entries in no particular order, fewer when the view is small
     */
    public List<KdTree.Entry<T>> nearestNeighbors(Wave w, boolean aiming) {
        // At full share the first branch is exactly 1.20's k; only a short budget takes
        // the scaled one.
        return nearestNeighbors(w, aiming,
            kShare == 1.0 ? DiaUtils.limit(1, size() / kDivisor, kSize)
                : Math.max(1, (int) (DiaUtils.limit(1, size() / kDivisor, kSize) * kShare)));
    }

    /**
     * The {@code k} neighbours of {@code w}'s point.
     *
     * @param w the wave to find neighbours for
     * @param aiming passed to the formula; true for a gun query
     * @param k the most neighbours returned
     * @return up to {@code k} entries in no particular order
     */
    public List<KdTree.Entry<T>> nearestNeighbors(Wave w, boolean aiming, int k) {
        double[] wavePoint = formula.dataPointFromWave(w, aiming);
        return tree.nearestNeighbor(wavePoint, k, false);
    }

    /**
     * Replaces the per-axis weights in the formula and the tree. A formula shared by
     * several views (the anti-surfer gun's) gets the new array for all of them, while only
     * this view's tree does.
     *
     * @param weights one weight per dimension
     */
    public void setWeights(double[] weights) {
        formula.weights = weights;
        tree.setWeights(weights);
    }

    /**
     * Time-decay weights for a neighbour list: the newest entry weighs 1 and each older one
     * {@link #decayRate} times less than the next newer; with {@link #NO_DECAY} every entry
     * weighs 1. Entries are ordered by round, then tick, so seeds (filed under
     * {@link Timestamped#SEED_ROUND}) count as the oldest.
     *
     * @param entries the neighbours, as a search returned them
     * @return each entry's value mapped to its weight, keyed by identity
     */
    @SuppressWarnings("unchecked")
    public Map<Timestamped, Double> getDecayWeights(
            List<? extends KdTree.Entry<? extends Timestamped>> entries) {
        HashMap<Timestamped, Double> weightMap = new HashMap<>();
        int numScans = entries.size();
        if (decayRate == 0.0) {
            for (KdTree.Entry<? extends Timestamped> entry : entries) {
                weightMap.put(entry.value, 1.0);
            }
        } else {
            Timestamped[] sorted = new Timestamped[numScans];
            for (int i = 0; i < numScans; i++) {
                sorted[i] = entries.get(i).value;
            }
            Arrays.sort(sorted);
            // The newest weighs 1 and each older one decayRate times less. Walking from the
            // newest repeats 1.20's divisions in the same order, so the weights are
            // bit-identical, in linear time rather than quadratic.
            double w = 1.0;
            for (int i = numScans - 1; i >= 0; i--) {
                weightMap.put(sorted[i], w);
                w /= decayRate;
            }
        }
        return weightMap;
    }
}
