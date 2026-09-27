package hadur2.core.knn;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

/**
 * Turns a {@link Wave} into a point in a KNN feature space, and says how much each axis of
 * that space counts.
 *
 * <p>Each gun or surf view owns one formula (the anti-surfer gun's four views share one
 * instance). The view calls {@link #dataPointFromWave(Wave)} when a wave breaks, to log
 * where the target went, and {@link #dataPointFromWave(Wave, boolean)} when it looks for
 * neighbours (the guns pass {@code aiming = true}, the surf {@code false}). The formulas in
 * this code base scale every feature to roughly [0, 1], so the {@link #weights} alone set
 * the axes' relative importance.</p>
 *
 * <p>The point's length must equal {@code weights.length}: the view sizes its
 * {@link KdTree} from the weights, and the tree reads the weights by index when it measures
 * distances and picks split axes.</p>
 */
public abstract class DistanceFormula {
    /**
     * One weight per dimension. The KD-tree multiplies each coordinate difference by its
     * weight before squaring, so doubling a weight quadruples that axis's share of the
     * squared distance. The array is shared by reference with the view's tree (see
     * {@link KnnView#setWeights(double[])}), so it must not be edited in place while the
     * tree holds points.
     */
    public double[] weights;

    /**
     * The feature point for {@code w}.
     *
     * @param w the wave whose firing-time situation is described
     * @param aiming true when the point is a query for neighbours (the gun formulas then
     *     describe it as a real bullet, virtuality 0; the surf formulas ignore it); false
     *     when logging a wave that has broken
     * @return a new array of {@code weights.length} values
     */
    public abstract double[] dataPointFromWave(Wave w, boolean aiming);

    /**
     * The feature point for logging a broken wave: {@code dataPointFromWave(w, false)}.
     *
     * @param w the wave whose firing-time situation is described
     * @return a new array of {@code weights.length} values
     */
    public double[] dataPointFromWave(Wave w) {
        return dataPointFromWave(w, false);
    }
}
