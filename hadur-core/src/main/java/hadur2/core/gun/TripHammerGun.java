package hadur2.core.gun;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.util.List;

/**
 * GUN-8: Diamond 1.8.22's duel main gun, {@code TripHammerKnnGun}, ported. Off by default
 * (the {@code thgun} switch); a duel only.
 *
 * <p>The view is {@link TripHammerFormula}'s space and holds, per wave, the guess factor the
 * target was found at. An aim slides the ten weights from {@link #INITIAL_WEIGHTS} to
 * {@link #FINAL_WEIGHTS}, each by the view's size over its {@link #FINAL_TIMES} entry (a
 * zero there means the final weight at once), sets them on the view and asks for
 * {@code size / 9} neighbours up to 225. Each neighbour's firing angle is its guess factor
 * times the orbit direction times the precise escape angle on the guess factor's side, and
 * weighs {@code 1 / sqrt(distance)}, where Diamond's distance is the weighted squared one
 * (so the weight is one over the weighted Euclidean distance). The 59 candidate angles span
 * the classic maximum escape angle evenly; each is scored by the cube kernel
 * {@code 1 - |u|^3} for {@code |u| < 1} at a bandwidth of twice the bot width's aim angle
 * at the wave's own distance, and the densest wins, the first on a tie. The answer is
 * measured from the wave's absolute bearing (head-on from the wave's source), not from our
 * next position as the other guns' are, as Diamond's is.</p>
 */
public class TripHammerGun {

    private static final String VIEW_NAME = "TripHammerKNN";
    private static final int FIRING_ANGLES = 59;
    private static final int MAX_K_SIZE = 225;
    private static final int K_DIVISOR = 9;

    /** Diamond's weights for a view of one point. */
    static final double[] INITIAL_WEIGHTS =
        {0.94, 10.0, 1.73, 3.7, 3.31, 2.13, 5.51, 1.26, 1.57, 5.51};
    /** Diamond's weights once the view has grown past {@link #FINAL_TIMES}. */
    static final double[] FINAL_WEIGHTS =
        {4.25, 5.43, 0.16, 4.25, 8.74, 3.39, 4.41, 8.03, 7.24, 4.41};
    /** The view sizes at which each weight has reached its final value; 0 means from the start. */
    static final int[] FINAL_TIMES =
        {28920, 23040, 23100, 1740, 16680, 5580, 0, 11280, 21420, 1920};

    /** The gun's name in the logs. */
    public String getLabel() {
        return "Main Gun";
    }

    /**
     * The weights for a view of {@code viewSize} points: each slides from its initial to its
     * final value by {@code min(1, (viewSize - 1) / FINAL_TIMES[i])}, or is final at once when
     * that time is 0.
     *
     * @param viewSize the points in the view
     * @return a new array of ten weights
     */
    static double[] weightsFor(int viewSize) {
        double[] out = new double[INITIAL_WEIGHTS.length];
        for (int i = 0; i < out.length; i++) {
            double share = FINAL_TIMES[i] == 0 ? 1.0 : Math.min(1.0, (double) (viewSize - 1) / FINAL_TIMES[i]);
            out[i] = INITIAL_WEIGHTS[i] + share * (FINAL_WEIGHTS[i] - INITIAL_WEIGHTS[i]);
        }
        return out;
    }

    /** One neighbour's firing angle relative to head-on, from its guess factor. */
    static double offsetOf(Wave w, double guessFactor) {
        return Angles.normalRelativeAngle(
            guessFactor * w.orbitDirection * w.preciseEscapeAngle(guessFactor >= 0));
    }

    /**
     * The cube kernel's density at {@code candidate} over the offsets: the sum of
     * {@code weight * (1 - |u|^3)} for {@code |u| < 1}, {@code u} the gap over the bandwidth.
     */
    static double density(double candidate, double[] offsets, double[] weights, double bandwidth) {
        double density = 0;
        for (int y = 0; y < offsets.length; y++) {
            double ux = (candidate - offsets[y]) / bandwidth;
            if (Math.abs(ux) < 1) {
                double a = Math.abs(ux);
                density += (1 - a * a * a) * weights[y];
            }
        }
        return density;
    }

    /**
     * The absolute bearing to fire along, in radians.
     *
     * @param w the gun wave for the shot
     * @param view the TripHammer view for the target
     * @return the densest bearing in [0, 2pi), or {@code w.absBearing} while the view is empty
     */
    public double aim(Wave w, KnnView<TimestampedFiringAngle> view) {
        return aimWithMass(w, view).angle;
    }

    /** An angle and the mass behind it (null for none), see {@link #aimWithMass}. */
    public static final class Aimed {
        /** The bearing to fire along, absolute radians. */
        public final double angle;
        /** The neighbours as a probability mass, or null when the view was empty. */
        public final ShadowAim.Mass mass;

        Aimed(double angle, ShadowAim.Mass mass) {
            this.angle = angle;
            this.mass = mass;
        }
    }

    /**
     * {@link #aim} and the neighbours as GUN-7's mass (a Gaussian kernel at the same bandwidth
     * over the same absolute angles and weights), from one search.
     *
     * @param w the gun wave for the shot
     * @param view the TripHammer view for the target
     * @return the angle and the mass
     */
    public Aimed aimWithMass(Wave w, KnnView<TimestampedFiringAngle> view) {
        int viewSize = view.size();
        if (viewSize == 0) return new Aimed(w.absBearing, null);

        view.setWeights(weightsFor(viewSize));
        List<KdTree.Entry<TimestampedFiringAngle>> neighbors = view.nearestNeighbors(w, true);
        int numScans = neighbors.size();
        double[] offsets = new double[numScans];
        double[] weights = new double[numScans];
        for (int i = 0; i < numScans; i++) {
            offsets[i] = offsetOf(w, neighbors.get(i).value.guessFactor);
            weights[i] = 1.0 / Math.sqrt(neighbors.get(i).distance);
        }

        double bandwidth = 2.0 * DiaUtils.botWidthAimAngle(w.sourceLocation.distance(w.targetLocation));
        double[] candidates = DiaUtils.generateFiringAngles(FIRING_ANGLES, w.maxEscapeAngle());
        Double bestAngle = null;
        double bestDensity = Double.NEGATIVE_INFINITY;
        for (int x = 0; x < FIRING_ANGLES; x++) {
            double density = density(candidates[x], offsets, weights, bandwidth);
            if (density > bestDensity) {
                bestAngle = candidates[x];
                bestDensity = density;
            }
        }
        if (bestAngle == null) return new Aimed(w.absBearing, null);

        double angle = Angles.normalAbsoluteAngle(w.absBearing + bestAngle);
        // The mass reads the same neighbours; a zero-distance neighbour's infinite weight is
        // capped so the mass stays a number (the aim above is as Diamond's, infinity and all).
        double[] absolute = new double[numScans];
        double[] massWeights = new double[numScans];
        for (int i = 0; i < numScans; i++) {
            absolute[i] = Angles.normalAbsoluteAngle(w.absBearing + offsets[i]);
            massWeights[i] = Math.min(weights[i], 1e6);
        }
        return new Aimed(angle, numScans == 0 ? null : ShadowAim.Mass.kernel(absolute, massWeights, bandwidth));
    }

    /**
     * A new TripHammer view: {@link TripHammerFormula}'s space, k up to 225 at one neighbour
     * per nine points, learning from every wave including virtual ones, not in melee. It
     * keeps {@link KnnView#DEFAULT_MAX_DATA_POINTS} (RES-2) and is never seeded.
     *
     * @return the view, named {@link #viewName()}
     */
    public KnnView<TimestampedFiringAngle> createView() {
        return new KnnView<TimestampedFiringAngle>(new TripHammerFormula())
            .setK(MAX_K_SIZE).setKDivisor(K_DIVISOR)
            .visitsOn().virtualWavesOn()
            .setName(VIEW_NAME);
    }

    /** The view's key in a {@link GunController} view map. */
    public static String viewName() {
        return VIEW_NAME;
    }
}
