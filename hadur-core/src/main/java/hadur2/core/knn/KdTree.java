package hadur2.core.knn;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Weighted squared-Euclidean KD-tree with optional FIFO size limit.
 * Ported from Diamond's ags.utils.KdTree (WeightedSqrEuclid variant).
 *
 * <p>The distance between two points is {@code sum(((a[i] - b[i]) * w[i])^2)}: each axis is
 * scaled by its weight, then squared, and no square root is taken. {@link Entry#distance}
 * is that squared value. A NaN difference on an axis (a NaN coordinate) adds nothing, so a
 * point with a missing feature is compared on the others.</p>
 *
 * <p>Every node, the root included, is a {@code KdTree}. A leaf holds up to a bucket of
 * points in {@code locations} and {@code data}; when a bucket fills, the leaf splits at the
 * midpoint of its widest weighted axis into two children and becomes an internal node
 * (its arrays set to null). Every node keeps the count of points below it and the bounding
 * box of every point ever added below it, which the search uses to skip whole subtrees.</p>
 *
 * <p>With a size limit (the root's {@code sizeLimit}) the tree is a FIFO: once it holds more
 * than the limit, each insert evicts the oldest point. This is how every KNN view stays
 * bounded during a battle (RES-2); see {@link KnnView#DEFAULT_MAX_DATA_POINTS}. Eviction
 * finds the point by array identity, so each inserted location must be its own array.</p>
 *
 * <p>A search stores its progress in the nodes ({@code status}), so a tree must not be
 * searched by two callers at once. The core is single-threaded (RES-6), and the results
 * depend only on the points and their insertion order (CORE-2).</p>
 *
 * @param <T> the value stored with each point, such as a firing angle or guess factor
 */
public class KdTree<T> {

    /** Points a leaf holds before it splits. */
    private static final int BUCKET_SIZE = 24;

    private final int dimensions;
    private final KdTree<T> root;
    /** Null at the root. */
    private final KdTree<T> parent;
    /** Root only, and only with a size limit: every point's location, oldest first. */
    private final LinkedList<double[]> locationStack;
    /** Root only: the most points kept, or null for no limit. */
    private final Integer sizeLimit;
    /** Root only (children read {@code root.weights}): one weight per dimension. */
    private double[] weights;

    /** A leaf's points; null once the node has split. */
    private double[][] locations;
    /** A leaf's values, parallel to {@link #locations}. */
    private Object[] data;
    /** Points in this node's subtree (in its bucket, for a leaf). */
    private int locationCount;
    private KdTree<T> left;
    private KdTree<T> right;
    /** The axis an internal node splits on: points above {@link #splitValue} go right. */
    private int splitDimension;
    private double splitValue;
    /**
     * The bounding box of every point added below this node. Eviction does not shrink it,
     * so it may be larger than the points still held, which only makes pruning cautious.
     */
    private double[] minLimit;
    private double[] maxLimit;
    /** True while every point added below this node has had the same location. */
    private boolean singularity;
    /** Search progress at this node; see {@link Status}. */
    private Status status;

    /**
     * An empty tree with every weight 1.
     *
     * @param dimensions the length of every point
     * @param sizeLimit the most points kept, the oldest evicted first; null for no limit
     */
    public KdTree(int dimensions, Integer sizeLimit) {
        this.dimensions = dimensions;
        this.locations = new double[BUCKET_SIZE][];
        this.data = new Object[BUCKET_SIZE];
        this.locationCount = 0;
        this.singularity = true;
        this.root = this;
        this.parent = null;
        this.sizeLimit = sizeLimit;
        this.locationStack = sizeLimit != null ? new LinkedList<>() : null;
        this.weights = new double[dimensions];
        Arrays.fill(this.weights, 1.0);
    }

    /**
     * A child made by a split. Its bucket is sized to take all of the parent's points, in
     * case they all fall on one side.
     */
    private KdTree(KdTree<T> parent) {
        this.dimensions = parent.dimensions;
        this.locations = new double[Math.max(BUCKET_SIZE, parent.locationCount)][];
        this.data = new Object[Math.max(BUCKET_SIZE, parent.locationCount)];
        this.locationCount = 0;
        this.singularity = true;
        this.root = parent.root;
        this.parent = parent;
        this.locationStack = null;
        this.sizeLimit = null;
        this.weights = null;
    }

    /**
     * Sets the per-axis weights, held by reference. Call on the root. Existing splits are
     * kept, so changing weights after points are in changes distances but not the tree's
     * shape (the search stays exact, only less efficient).
     *
     * @param weights one weight per dimension
     */
    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    /** The number of points held, after any eviction. */
    public int size() {
        return this.locationCount;
    }

    /**
     * Adds a point, splitting full leaves on the way down, and evicts the oldest point if the
     * tree is then over its size limit.
     *
     * @param location the point; kept by reference, so it must not be changed or reused
     * @param value the value returned with the point by a search
     */
    @SuppressWarnings("unchecked")
    public void addPoint(double[] location, T value) {
        KdTree<T> cursor = this;
        // Walk down to a leaf with room. A full leaf met on the way is split first and
        // then walked through like any internal node.
        while (cursor.locations == null || cursor.locationCount >= cursor.locations.length) {
            if (cursor.locations != null) {
                // A full leaf: split at the middle of its widest weighted axis.
                cursor.splitDimension = cursor.findWidestAxis();
                cursor.splitValue = (cursor.minLimit[cursor.splitDimension]
                        + cursor.maxLimit[cursor.splitDimension]) * 0.5;
                // Infinite or NaN bounds give an infinite or NaN midpoint; pull it back to a
                // finite value so the comparisons below still divide the points.
                if (cursor.splitValue == Double.POSITIVE_INFINITY) {
                    cursor.splitValue = Double.MAX_VALUE;
                } else if (cursor.splitValue == Double.NEGATIVE_INFINITY) {
                    cursor.splitValue = -Double.MAX_VALUE;
                } else if (Double.isNaN(cursor.splitValue)) {
                    cursor.splitValue = 0.0;
                }
                // The widest axis has no width, so every point is the same on it, and as it
                // is the widest no other axis has any weighted width either: no split would
                // separate the points. Double the bucket instead and stop here.
                if (cursor.minLimit[cursor.splitDimension]
                        == cursor.maxLimit[cursor.splitDimension]) {
                    double[][] newLoc = new double[cursor.locations.length * 2][];
                    System.arraycopy(cursor.locations, 0, newLoc, 0, cursor.locationCount);
                    cursor.locations = newLoc;
                    Object[] newData = new Object[newLoc.length];
                    System.arraycopy(cursor.data, 0, newData, 0, cursor.locationCount);
                    cursor.data = newData;
                    break;
                }
                // When min and max are adjacent doubles the midpoint can round up to max,
                // which would put every point on the left. Splitting at min instead leaves
                // the points equal to min on the left and the rest on the right.
                if (cursor.splitValue == cursor.maxLimit[cursor.splitDimension]) {
                    cursor.splitValue = cursor.minLimit[cursor.splitDimension];
                }
                KdTree<T> newLeft = new KdTree<>(cursor);
                KdTree<T> newRight = new KdTree<>(cursor);
                for (int i = 0; i < cursor.locationCount; i++) {
                    double[] oldLoc = cursor.locations[i];
                    Object oldData = cursor.data[i];
                    if (oldLoc[cursor.splitDimension] > cursor.splitValue) {
                        newRight.locations[newRight.locationCount] = oldLoc;
                        newRight.data[newRight.locationCount] = oldData;
                        newRight.locationCount++;
                        newRight.extendBounds(oldLoc);
                    } else {
                        newLeft.locations[newLeft.locationCount] = oldLoc;
                        newLeft.data[newLeft.locationCount] = oldData;
                        newLeft.locationCount++;
                        newLeft.extendBounds(oldLoc);
                    }
                }
                cursor.left = newLeft;
                cursor.right = newRight;
                cursor.locations = null;
                cursor.data = null;
            }
            // An internal node counts and bounds the new point, then passes it down.
            cursor.locationCount++;
            cursor.extendBounds(location);
            cursor = location[cursor.splitDimension] > cursor.splitValue
                    ? cursor.right : cursor.left;
        }
        cursor.locations[cursor.locationCount] = location;
        cursor.data[cursor.locationCount] = value;
        cursor.locationCount++;
        cursor.extendBounds(location);
        // RES-2: over the limit, the oldest point goes.
        if (this.sizeLimit != null) {
            this.locationStack.add(location);
            if (this.locationCount > this.sizeLimit) {
                this.removeOld();
            }
        }
    }

    /**
     * Grows this node's bounding box to take {@code location}, and clears
     * {@link #singularity} once two different locations have been seen. A NaN coordinate
     * makes that axis's bounds NaN, which {@link #findWidestAxis()} then reads as no width.
     */
    private void extendBounds(double[] location) {
        if (this.minLimit == null) {
            this.minLimit = new double[this.dimensions];
            System.arraycopy(location, 0, this.minLimit, 0, this.dimensions);
            this.maxLimit = new double[this.dimensions];
            System.arraycopy(location, 0, this.maxLimit, 0, this.dimensions);
            return;
        }
        for (int i = 0; i < this.dimensions; i++) {
            if (Double.isNaN(location[i])) {
                this.minLimit[i] = Double.NaN;
                this.maxLimit[i] = Double.NaN;
                this.singularity = false;
            } else if (this.minLimit[i] > location[i]) {
                this.minLimit[i] = location[i];
                this.singularity = false;
            } else if (this.maxLimit[i] < location[i]) {
                this.maxLimit[i] = location[i];
                this.singularity = false;
            }
        }
    }

    /**
     * The axis with the largest weighted extent, {@code (max - min) * weight}; the first such
     * axis on a tie. Splitting there divides the points where distances vary most.
     */
    private int findWidestAxis() {
        double[] w = root.weights;
        int widest = 0;
        double width = (this.maxLimit[0] - this.minLimit[0]) * w[0];
        if (Double.isNaN(width)) width = 0.0;
        for (int i = 1; i < this.dimensions; i++) {
            double nw = (this.maxLimit[i] - this.minLimit[i]) * w[i];
            if (Double.isNaN(nw)) nw = 0.0;
            if (nw > width) {
                widest = i;
                width = nw;
            }
        }
        return widest;
    }

    /**
     * Evicts the oldest point (RES-2): follows it down by the same split rule
     * {@link #addPoint} used, removes it from its leaf by array identity, and takes one off
     * the count of every node above. Bounds are left as they are (see {@link #minLimit}).
     */
    private void removeOld() {
        double[] location = this.locationStack.removeFirst();
        KdTree<T> cursor = this;
        while (cursor.locations == null) {
            cursor = location[cursor.splitDimension] > cursor.splitValue
                    ? cursor.right : cursor.left;
        }
        for (int i = 0; i < cursor.locationCount; i++) {
            if (cursor.locations[i] == location) {
                // Close the gap so the bucket stays packed from index 0.
                System.arraycopy(cursor.locations, i + 1, cursor.locations, i,
                        cursor.locationCount - i - 1);
                cursor.locations[cursor.locationCount - 1] = null;
                System.arraycopy(cursor.data, i + 1, cursor.data, i,
                        cursor.locationCount - i - 1);
                cursor.data[cursor.locationCount - 1] = null;
                cursor.locationCount--;
                while (cursor.parent != null) {
                    cursor = cursor.parent;
                    cursor.locationCount--;
                }
                return;
            }
        }
    }

    /** The weighted squared distance between two points; NaN axes are skipped. */
    private double pointDist(double[] p1, double[] p2) {
        double[] w = root.weights;
        double d = 0.0;
        for (int i = 0; i < p1.length; i++) {
            double diff = (p1[i] - p2[i]) * w[i];
            if (!Double.isNaN(diff)) {
                d += diff * diff;
            }
        }
        return d;
    }

    /**
     * The weighted squared distance from {@code point} to the nearest point of the box
     * {@code [min, max]}: zero on an axis where the point lies within the box. No point in
     * the box can be closer, so a box further than the current k-th best is skipped.
     */
    private double pointRegionDist(double[] point, double[] min, double[] max) {
        double[] w = root.weights;
        double d = 0.0;
        for (int i = 0; i < point.length; i++) {
            double diff = 0.0;
            if (point[i] > max[i]) {
                diff = (point[i] - max[i]) * w[i];
            } else if (point[i] < min[i]) {
                diff = (point[i] - min[i]) * w[i];
            }
            if (!Double.isNaN(diff)) {
                d += diff * diff;
            }
        }
        return d;
    }

    /**
     * The {@code count} points nearest {@code location}; see
     * {@link #nearestNeighbor(double[], int, boolean)}.
     *
     * @param location the query point
     * @param count the most neighbours returned
     * @return up to {@code count} entries, fewer when the tree holds fewer points
     */
    @SuppressWarnings("unchecked")
    public List<Entry<T>> nearestNeighbor(double[] location, int count) {
        return nearestNeighbor(location, count, false);
    }

    /**
     * The {@code count} points nearest {@code location} by weighted squared distance.
     *
     * <p>The search is depth-first without recursion: it goes down the side of each split
     * the query falls on, scans the leaf, and on the way back up visits a node's other child
     * only if that child's bounding box could hold a point nearer than the current k-th
     * best. The k best so far are kept in a max-heap, so the worst of them is at hand.</p>
     *
     * <p>The entries come back in the heap's array order, not sorted by distance. Ties
     * between equal distances are settled by the tree's layout, which depends only on
     * insertion order, so the result is deterministic (CORE-2).</p>
     *
     * @param location the query point
     * @param count the most neighbours returned
     * @param ordered not read: the result is never sorted, whatever its value
     * @return up to {@code count} entries, fewer when the tree holds fewer points
     */
    @SuppressWarnings("unchecked")
    public List<Entry<T>> nearestNeighbor(double[] location, int count, boolean ordered) {
        KdTree<T> cursor = this;
        cursor.status = Status.NONE;
        // The k-th best distance so far; infinite until the heap holds count points.
        double range = Double.POSITIVE_INFINITY;
        ResultHeap resultHeap = new ResultHeap(count);

        do {
            // Both children done: back up.
            if (cursor.status == Status.ALLVISITED) {
                cursor = cursor.parent;
                continue;
            }
            // A leaf just reached: scan its bucket, then back up.
            if (cursor.status == Status.NONE && cursor.locations != null) {
                if (cursor.locationCount > 0) {
                    if (cursor.singularity) {
                        // Every point here is at the same location: one distance serves all.
                        double dist = root.pointDist(cursor.locations[0], location);
                        if (dist <= range) {
                            for (int i = 0; i < cursor.locationCount; i++) {
                                resultHeap.addValue(dist, cursor.data[i]);
                            }
                        }
                    } else {
                        for (int i = 0; i < cursor.locationCount; i++) {
                            double dist = root.pointDist(cursor.locations[i], location);
                            resultHeap.addValue(dist, cursor.data[i]);
                        }
                    }
                    range = resultHeap.getMaxDist();
                }
                // The whole tree is one leaf.
                if (cursor.parent == null) break;
                cursor = cursor.parent;
                continue;
            }
            // An internal node: first visit goes to the query's side, the second to the
            // other side.
            KdTree<T> nextCursor = null;
            if (cursor.status == Status.NONE) {
                if (location[cursor.splitDimension] > cursor.splitValue) {
                    nextCursor = cursor.right;
                    cursor.status = Status.RIGHTVISITED;
                } else {
                    nextCursor = cursor.left;
                    cursor.status = Status.LEFTVISITED;
                }
            } else if (cursor.status == Status.LEFTVISITED) {
                nextCursor = cursor.right;
                cursor.status = Status.ALLVISITED;
            } else if (cursor.status == Status.RIGHTVISITED) {
                nextCursor = cursor.left;
                cursor.status = Status.ALLVISITED;
            }
            // Prune the far side when it is empty or its box lies beyond the k-th best. A
            // singular subtree is not pruned here; its leaf compares the one distance.
            if (cursor.status == Status.ALLVISITED
                    && (nextCursor.locationCount == 0
                    || (!nextCursor.singularity
                    && root.pointRegionDist(location, nextCursor.minLimit,
                    nextCursor.maxLimit) > range))) {
                continue;
            }
            cursor = nextCursor;
            cursor.status = Status.NONE;
        } while (cursor.parent != null || cursor.status != Status.ALLVISITED);

        ArrayList<Entry<T>> results = new ArrayList<>(resultHeap.values);
        for (int i = 0; i < resultHeap.values; i++) {
            results.add(new Entry<>((double) resultHeap.distance[i],
                    (T) resultHeap.data[i]));
        }
        return results;
    }

    /**
     * One search result.
     *
     * @param <T> the stored value's type
     */
    public static class Entry<T> {
        /** The weighted squared distance from the query (no square root taken). */
        public final double distance;
        /** The value stored with the point. */
        public final T value;

        /**
         * A result.
         *
         * @param distance the weighted squared distance from the query
         * @param value the value stored with the point
         */
        public Entry(double distance, T value) {
            this.distance = distance;
            this.value = value;
        }
    }

    /**
     * A node's progress in the current search: not entered, one child (the query's side)
     * visited, or both visited.
     */
    private enum Status {
        NONE, LEFTVISITED, RIGHTVISITED, ALLVISITED
    }

    /**
     * A fixed-size binary max-heap on distance holding the best {@code size} candidates
     * seen: the root (index 0) is the worst of them, so a new candidate either fills a free
     * slot or replaces the root when it is strictly nearer.
     */
    private static class ResultHeap {
        final Object[] data;
        final double[] distance;
        final int size;
        int values;

        ResultHeap(int size) {
            this.data = new Object[size];
            this.distance = new double[size];
            this.size = size;
            this.values = 0;
        }

        void addValue(double dist, Object value) {
            if (this.values < this.size) {
                this.data[this.values] = value;
                this.distance[this.values] = dist;
                upHeapify(this.values);
                this.values++;
            } else if (dist < this.distance[0]) {
                this.data[0] = value;
                this.distance[0] = dist;
                downHeapify(0);
            }
        }

        /** The worst distance kept, or infinity while the heap still has room. */
        double getMaxDist() {
            if (this.values < this.size) return Double.POSITIVE_INFINITY;
            return this.distance[0];
        }

        /** Moves the entry at {@code c} up while it is further than its parent. */
        private void upHeapify(int c) {
            int p = (c - 1) / 2;
            while (c != 0 && this.distance[c] > this.distance[p]) {
                Object pd = this.data[p]; double dd = this.distance[p];
                this.data[p] = this.data[c]; this.distance[p] = this.distance[c];
                this.data[c] = pd; this.distance[c] = dd;
                c = p;
                p = (c - 1) / 2;
            }
        }

        /** Moves the entry at {@code p} down below any child further than it. */
        private void downHeapify(int p) {
            int c = p * 2 + 1;
            while (c < this.values) {
                if (c + 1 < this.values && this.distance[c] < this.distance[c + 1]) c++;
                if (this.distance[p] >= this.distance[c]) break;
                Object pd = this.data[p]; double dd = this.distance[p];
                this.data[p] = this.data[c]; this.distance[p] = this.distance[c];
                this.data[c] = pd; this.distance[c] = dd;
                p = c;
                c = p * 2 + 1;
            }
        }
    }
}
