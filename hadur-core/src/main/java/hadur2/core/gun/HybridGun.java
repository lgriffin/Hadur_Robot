package hadur2.core.gun;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;

import java.awt.geom.Point2D;
import java.util.List;

/**
 * GUN-4: a third gun, rated alongside the main and anti-surfer guns and fired when it rates
 * highest. It uses the GUN-2/GUN-3 anti-surfer feature space and aim mechanics (guess factor,
 * scaled by the precise escape angle, found by kernel density over a grid that spans the
 * target's actual escape angle), but as one long-memory view rather than the anti-surfer
 * gun's four fast-forgetting ones, and it learns from both real and virtual waves alike, the
 * same way the anti-surfer gun's views already do (see {@link #createView()}).
 *
 * <p>{@link GunController} rates this gun only while GUN-4's gate is open (the live movement
 * tier is M2 or M3, or the live main/anti-surfer verdict already names a switch) and fires it
 * only once it holds enough data and rates above the other two by more than the margin of
 * error, so an idle third gun costs nothing and never flips the choice on noise.</p>
 */
public class HybridGun {

    private static final int FIRING_ANGLES = 59;
    private static final String VIEW_NAME = "hybridView";
    /** More memory than any one anti-surfer view (RES-2), since it stands in for all of them. */
    private static final int MAX_DATA_POINTS = 6000;

    private final BattleField battleField;
    private final boolean is1v1;

    /**
     * The hybrid gun.
     *
     * @param battleField the battle field
     * @param is1v1 whether the battle started with one opponent
     */
    public HybridGun(BattleField battleField, boolean is1v1) {
        this.battleField = battleField;
        this.is1v1 = is1v1;
    }

    /** The gun's name in the logs. */
    public String getLabel() {
        return "Hybrid Gun";
    }

    /** The view's key in a {@link GunController} view map. */
    public static String viewName() {
        return VIEW_NAME;
    }

    /**
     * A new hybrid view: the {@link AntiSurferFormula} space (GUN-2's features included), k 5
     * at one neighbour per eight points up to 30, capped at {@link #MAX_DATA_POINTS} points,
     * learning from every wave including virtual ones (never in melee: GUN-4 is a duel-only
     * gate, mirroring the anti-surfer gun's own melee restriction).
     *
     * @return the view, named {@link #viewName()}
     */
    public KnnView<TimestampedFiringAngle> createView() {
        return new KnnView<TimestampedFiringAngle>(new AntiSurferFormula())
            .setK(30).setKDivisor(8).setMaxDataPoints(MAX_DATA_POINTS)
            .setKDivisor(8).visitsOn().virtualWavesOn()
            .setName(VIEW_NAME);
    }

    /**
     * The absolute bearing to fire along, in radians; same aim mechanics as
     * {@link AntiSurferGun#aim}, over this gun's single view.
     *
     * @param w the gun wave for the shot
     * @param view this gun's view for the target
     * @param myNextLocation where we will be when the bullet leaves, the next tick
     * @param currentTime the present tick
     * @return the densest bearing in [0, 2pi), or {@code w.absBearing} while the view has no
     *     neighbours
     */
    public double aim(Wave w, KnnView<TimestampedFiringAngle> view, Point2D.Double myNextLocation,
                      long currentTime) {
        if (view.effectiveSize() == 0) return w.absBearing;
        List<KdTree.Entry<TimestampedFiringAngle>> neighbors = view.nearestNeighbors(w, true);
        if (neighbors.isEmpty()) return w.absBearing;

        double nextAbsBearing = DiaUtils.absoluteBearing(myNextLocation, w.targetLocation);
        int numScans = neighbors.size();
        double[] firingAngles = new double[numScans];
        boolean[] valid = new boolean[numScans];
        double[] weights = new double[numScans];

        for (int i = 0; i < numScans; i++) {
            TimestampedFiringAngle tfa = neighbors.get(i).value;
            weights[i] = view.weight * tfa.weight();
            if (is1v1) {
                double gf = tfa.guessFactor;
                firingAngles[i] = gf * w.orbitDirection * w.preciseEscapeAngle(gf >= 0);
                valid[i] = true;
            } else {
                Point2D.Double projected = w.projectLocationBlind(
                    myNextLocation, tfa.displacementVector, currentTime);
                if (battleField.rectangle.contains(projected)) {
                    firingAngles[i] = Angles.normalRelativeAngle(
                        DiaUtils.absoluteBearing(myNextLocation, projected) - nextAbsBearing);
                    valid[i] = true;
                }
            }
        }

        double bestAngle = 0;
        double bestDensity = Double.NEGATIVE_INFINITY;
        double distance = myNextLocation.distance(w.targetLocation);
        // GUN-3: the same widened kernel and precise-escape-angle grid as the anti-surfer gun.
        double bandwidth = Math.max(2.0 * DiaUtils.botWidthAimAngle(distance),
            DiaUtils.botWidthAimAngle(distance));
        double[] testAngles = DiaUtils.generateFiringAngles(FIRING_ANGLES,
            w.preciseEscapeAngle(false), w.preciseEscapeAngle(true));

        for (int x = 0; x < FIRING_ANGLES; x++) {
            double xAngle = testAngles[x];
            double density = 0;
            for (int y = 0; y < numScans; y++) {
                if (!valid[y]) continue;
                double ux = (xAngle - firingAngles[y]) / bandwidth;
                density += Math.exp(-0.5 * ux * ux) * weights[y];
            }
            if (density > bestDensity) {
                bestAngle = xAngle;
                bestDensity = density;
            }
        }

        return Angles.normalAbsoluteAngle(nextAbsBearing + bestAngle);
    }
}
