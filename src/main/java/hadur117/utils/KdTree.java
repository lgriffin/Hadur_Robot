package hadur117.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Weighted squared-Euclidean KD-tree with optional FIFO size limit.
 * Ported from Diamond's ags.utils.KdTree (WeightedSqrEuclid variant).
 */
public class KdTree<T> {

    private static final int BUCKET_SIZE = 24;

    private final int dimensions;
    private final KdTree<T> root;
    private final KdTree<T> parent;
    private final LinkedList<double[]> locationStack;
    private final Integer sizeLimit;
    private double[] weights;

    private double[][] locations;
    private Object[] data;
    private int locationCount;
    private KdTree<T> left;
    private KdTree<T> right;
    private int splitDimension;
    private double splitValue;
    private double[] minLimit;
    private double[] maxLimit;
    private boolean singularity;
    private Status status;

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

    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    public int size() {
        return this.locationCount;
    }

    @SuppressWarnings("unchecked")
    public void addPoint(double[] location, T value) {
        KdTree<T> cursor = this;
        while (cursor.locations == null || cursor.locationCount >= cursor.locations.length) {
            if (cursor.locations != null) {
                cursor.splitDimension = cursor.findWidestAxis();
                cursor.splitValue = (cursor.minLimit[cursor.splitDimension]
                        + cursor.maxLimit[cursor.splitDimension]) * 0.5;
                if (cursor.splitValue == Double.POSITIVE_INFINITY) {
                    cursor.splitValue = Double.MAX_VALUE;
                } else if (cursor.splitValue == Double.NEGATIVE_INFINITY) {
                    cursor.splitValue = -Double.MAX_VALUE;
                } else if (Double.isNaN(cursor.splitValue)) {
                    cursor.splitValue = 0.0;
                }
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
            cursor.locationCount++;
            cursor.extendBounds(location);
            cursor = location[cursor.splitDimension] > cursor.splitValue
                    ? cursor.right : cursor.left;
        }
        cursor.locations[cursor.locationCount] = location;
        cursor.data[cursor.locationCount] = value;
        cursor.locationCount++;
        cursor.extendBounds(location);
        if (this.sizeLimit != null) {
            this.locationStack.add(location);
            if (this.locationCount > this.sizeLimit) {
                this.removeOld();
            }
        }
    }

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

    private void removeOld() {
        double[] location = this.locationStack.removeFirst();
        KdTree<T> cursor = this;
        while (cursor.locations == null) {
            cursor = location[cursor.splitDimension] > cursor.splitValue
                    ? cursor.right : cursor.left;
        }
        for (int i = 0; i < cursor.locationCount; i++) {
            if (cursor.locations[i] == location) {
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

    @SuppressWarnings("unchecked")
    public List<Entry<T>> nearestNeighbor(double[] location, int count) {
        return nearestNeighbor(location, count, false);
    }

    @SuppressWarnings("unchecked")
    public List<Entry<T>> nearestNeighbor(double[] location, int count, boolean ordered) {
        KdTree<T> cursor = this;
        cursor.status = Status.NONE;
        double range = Double.POSITIVE_INFINITY;
        ResultHeap resultHeap = new ResultHeap(count);

        do {
            if (cursor.status == Status.ALLVISITED) {
                cursor = cursor.parent;
                continue;
            }
            if (cursor.status == Status.NONE && cursor.locations != null) {
                if (cursor.locationCount > 0) {
                    if (cursor.singularity) {
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
                if (cursor.parent == null) break;
                cursor = cursor.parent;
                continue;
            }
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

    public static class Entry<T> {
        public final double distance;
        public final T value;

        public Entry(double distance, T value) {
            this.distance = distance;
            this.value = value;
        }
    }

    private enum Status {
        NONE, LEFTVISITED, RIGHTVISITED, ALLVISITED
    }

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

        double getMaxDist() {
            if (this.values < this.size) return Double.POSITIVE_INFINITY;
            return this.distance[0];
        }

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
