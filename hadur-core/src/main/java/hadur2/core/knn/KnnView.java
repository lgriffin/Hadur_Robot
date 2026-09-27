package hadur2.core.knn;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.util.*;

public class KnnView<T> {

    public double weight;
    public DistanceFormula formula;
    public int kSize;
    public int kDivisor;
    public int maxDataPoints;
    public boolean logBulletHits;
    public boolean logVisits;
    public boolean logVirtual;
    public boolean logMelee;
    public double hitThreshold;
    public double paddedHitThreshold;
    public double decayRate;
    public String name;
    public Map<Integer, List<KdTree.Entry<T>>> cachedNeighbors;

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

    private void initTree() {
        tree = new KdTree<>(formula.weights.length,
            maxDataPoints == 0 ? DEFAULT_MAX_DATA_POINTS : maxDataPoints);
        tree.setWeights(formula.weights);
        added = 0;
        seeds = 0;
        seedWeight = null;
    }

    public KnnView<T> setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public KnnView<T> setK(int kSize) {
        this.kSize = kSize;
        return this;
    }

    public KnnView<T> setKDivisor(int kDivisor) {
        this.kDivisor = kDivisor;
        return this;
    }

    public KnnView<T> bulletHitsOn() {
        this.logBulletHits = true;
        return this;
    }

    public KnnView<T> visitsOn() {
        this.logVisits = true;
        return this;
    }

    public KnnView<T> virtualWavesOn() {
        this.logVirtual = true;
        return this;
    }

    public KnnView<T> meleeOn() {
        this.logMelee = true;
        return this;
    }

    public KnnView<T> setHitThreshold(double hitThreshold) {
        this.hitThreshold = hitThreshold;
        return this;
    }

    public KnnView<T> setPaddedHitThreshold(double paddedHitThreshold) {
        this.paddedHitThreshold = paddedHitThreshold;
        return this;
    }

    public KnnView<T> setMaxDataPoints(int maxDataPoints) {
        this.maxDataPoints = maxDataPoints;
        this.initTree();
        return this;
    }

    public KnnView<T> setDecayRate(double decayRate) {
        this.decayRate = decayRate;
        return this;
    }

    public KnnView<T> setName(String name) {
        this.name = name;
        return this;
    }

    public double[] logWave(Wave w, T value) {
        double[] dataPoint = formula.dataPointFromWave(w);
        return logDataPoint(dataPoint, value);
    }

    /**
     * Adds a sample replayed from an opponent profile (ADAPT-3). The point must already be
     * in this view's formula space; the value carries the seed's weight.
     */
    public void logSeed(double[] dataPoint, T value, SeedWeight weight) {
        if (dataPoint.length != formula.weights.length) {
            throw new IllegalArgumentException(name + " takes " + formula.weights.length + " dimensions");
        }
        seeds++;
        seedWeight = weight;
        logDataPoint(dataPoint.clone(), value);
    }

    public double[] logDataPoint(double[] dataPoint, T value) {
        added++;
        tree.addPoint(dataPoint, value);
        return dataPoint;
    }

    public void clearCache() {
        cachedNeighbors.clear();
    }

    public boolean enabled(double hitPercentage, double marginOfError) {
        return size() > 0 && thresholdsMet(hitPercentage, marginOfError);
    }

    /** Whether an enemy hit percentage and its margin clear this view's thresholds. */
    public boolean thresholdsMet(double hitPercentage, double marginOfError) {
        return hitPercentage >= hitThreshold
            && Math.max(0, hitPercentage - marginOfError) >= paddedHitThreshold;
    }

    public int size() {
        return tree.size();
    }

    /**
     * Samples that still carry weight: {@link #size()} less the seeds once their weight has
     * fallen to zero (RES-4). The tree evicts oldest first and seeds go in first, so evicted
     * points are counted against the seeds.
     */
    public int effectiveSize() {
        if (seedWeight == null || seedWeight.value() > 0) return size();
        long evicted = added - size();
        long deadSeeds = Math.max(0, seeds - evicted);
        return (int) Math.max(0, size() - deadSeeds);
    }

    public List<KdTree.Entry<T>> nearestNeighbors(Wave w, boolean aiming) {
        return nearestNeighbors(w, aiming,
            DiaUtils.limit(1, size() / kDivisor, kSize));
    }

    public List<KdTree.Entry<T>> nearestNeighbors(Wave w, boolean aiming, int k) {
        double[] wavePoint = formula.dataPointFromWave(w, aiming);
        return tree.nearestNeighbor(wavePoint, k, false);
    }

    public void setWeights(double[] weights) {
        formula.weights = weights;
        tree.setWeights(weights);
    }

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
