package hadurling.core.knn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * A k-d tree: a binary tree that splits space one axis at a time, so that "the k points
 * nearest to this one" does not have to look at every point (HL-9).
 *
 * <p>Distance is the squared Euclidean distance, {@code sum((a[i] - b[i])^2)}. Nobody takes
 * the square root, because the order of distances is the same without it. A point is a
 * {@code double[]} of the tree's dimension, and carries a value of type {@code T}.</p>
 *
 * <p>This is the smallest tree that works: one point per node, no rebalancing. Inserting
 * points in sorted order makes it lean into a list, and a search then costs as much as the
 * brute-force scan. Hadur's {@code KdTree} keeps buckets of points and splits them when
 * they fill, which avoids that; Hadurling's gun gets points in an unpredictable order, so
 * it can live with this. The tree holds at most {@code capacity} points, so it cannot grow
 * without limit.</p>
 *
 * @param <T> what each point carries
 */
public final class KdTree<T> {

    /** One search result: a stored point, its value and its squared distance to the query. */
    public static final class Entry<T> {
        private final double[] point;
        private final T value;
        private final double distance;

        Entry(double[] point, T value, double distance) {
            this.point = point;
            this.value = value;
            this.distance = distance;
        }

        /** @return a copy of the stored point */
        public double[] point() { return point.clone(); }
        /** @return the value stored with the point */
        public T value() { return value; }
        /** @return the squared distance from the query to the point */
        public double distance() { return distance; }
    }

    private static final class Node<T> {
        final double[] point;
        final T value;
        final int axis;
        Node<T> left;
        Node<T> right;

        Node(double[] point, T value, int axis) {
            this.point = point;
            this.value = value;
            this.axis = axis;
        }
    }

    private final int dimensions;
    private final int capacity;
    private Node<T> root;
    private int size;

    /**
     * An empty tree.
     *
     * @param dimensions how many numbers describe a point, at least 1
     * @param capacity the most points the tree will hold, at least 1
     */
    public KdTree(int dimensions, int capacity) {
        if (dimensions < 1 || capacity < 1) throw new IllegalArgumentException("dimensions and capacity must be positive");
        this.dimensions = dimensions;
        this.capacity = capacity;
    }

    /** @return how many points the tree holds */
    public int size() {
        return size;
    }

    /**
     * Adds a point. The tree keeps its own copy of the array.
     *
     * @param point the point; must have the tree's dimension and only finite numbers
     * @param value what to store with it
     * @return false, changing nothing, when the tree is already full
     * @throws IllegalArgumentException if the point has the wrong length or a NaN or infinite coordinate
     */
    public boolean add(double[] point, T value) {
        check(point);
        if (size >= capacity) return false;
        double[] copy = point.clone();
        if (root == null) {
            root = new Node<>(copy, value, 0);
        } else {
            Node<T> node = root;
            while (true) {
                boolean goLeft = copy[node.axis] < node.point[node.axis];
                Node<T> next = goLeft ? node.left : node.right;
                if (next == null) {
                    Node<T> fresh = new Node<>(copy, value, (node.axis + 1) % dimensions);
                    if (goLeft) node.left = fresh; else node.right = fresh;
                    break;
                }
                node = next;
            }
        }
        size++;
        return true;
    }

    /**
     * The {@code k} stored points nearest to {@code query}.
     *
     * @param query the point to search around
     * @param k how many neighbours to return; fewer come back if the tree holds fewer
     * @return the neighbours, nearest first; empty when the tree is empty or {@code k} is 0
     */
    public List<Entry<T>> nearest(double[] query, int k) {
        check(query);
        List<Entry<T>> result = new ArrayList<>();
        if (k <= 0 || root == null) return result;
        // A max-heap on distance: its head is the worst of the best k found so far, which is
        // exactly what a candidate has to beat.
        PriorityQueue<Entry<T>> best = new PriorityQueue<>(k + 1,
            Comparator.comparingDouble((Entry<T> e) -> e.distance).reversed());
        search(root, query, k, best);
        while (!best.isEmpty()) result.add(best.poll());
        java.util.Collections.reverse(result);
        return result;
    }

    private void search(Node<T> node, double[] query, int k, PriorityQueue<Entry<T>> best) {
        if (node == null) return;
        double d = squaredDistance(node.point, query);
        if (best.size() < k) {
            best.add(new Entry<>(node.point, node.value, d));
        } else if (d < best.peek().distance) {
            best.poll();
            best.add(new Entry<>(node.point, node.value, d));
        }
        double gap = query[node.axis] - node.point[node.axis];
        Node<T> near = gap < 0 ? node.left : node.right;
        Node<T> far = gap < 0 ? node.right : node.left;
        search(near, query, k, best);
        // The far side can only hold a closer point if the splitting plane is closer than the
        // worst point we are keeping. This test is what makes the tree faster than a scan.
        if (best.size() < k || gap * gap < best.peek().distance) search(far, query, k, best);
    }

    /**
     * The squared Euclidean distance between two points of the same dimension.
     *
     * @param a one point
     * @param b another point
     * @return {@code sum((a[i] - b[i])^2)}
     */
    public static double squaredDistance(double[] a, double[] b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            double d = a[i] - b[i];
            sum += d * d;
        }
        return sum;
    }

    private void check(double[] point) {
        if (point.length != dimensions) {
            throw new IllegalArgumentException("expected " + dimensions + " coordinates, got " + point.length);
        }
        for (double c : point) {
            if (Double.isNaN(c) || Double.isInfinite(c)) throw new IllegalArgumentException("coordinate " + c);
        }
    }
}
