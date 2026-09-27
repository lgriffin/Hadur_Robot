package hadur2.core.gun;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;

import java.awt.geom.Point2D;
import java.util.List;

/**
 * The main gun: a KNN displacement-vector gun with a kernel-density choice of angle.
 *
 * <p>Each past wave in its view stores where the target went as a displacement vector: its
 * average movement per tick while the wave was in flight, in a frame turned to the target's
 * heading and mirrored by its orbit direction (see {@link Wave#displacementVector}). To
 * aim, the gun finds the waves most like the present one, replays each neighbour's vector
 * from the target's position and heading when the wave was made (normally this tick's
 * scan) until a bullet fired from our next position would reach it, and takes the bearing
 * to each projected point. It fires at the neighbour
 * angle with the most other neighbour angles near it.</p>
 *
 * <p>Replaying movement rather than a guess factor keeps the field's walls in the
 * picture: a projected point outside the field is an impossible outcome and is dropped.
 * The same view learns in melee ({@code meleeOn}), which is why it is the only gun used
 * with several opponents.</p>
 *
 * <p>Angles are absolute Robocode bearings in radians: 0 is north (+y), increasing
 * clockwise. {@link GunController} calls {@link #aim} on the aiming tick and for the
 * main gun's virtual bullet.</p>
 */
public class MainGun {

    private static final String VIEW_NAME = "Main";
    /** The most neighbours one aim uses. */
    private static final int K_SIZE = 100;
    /** One neighbour per ten points in the view, up to {@link #K_SIZE}. */
    private static final int K_DIVISOR = 10;

    /** For the field test on projected points (the rectangle is inset 18 px, half a robot). */
    private final BattleField battleField;

    /**
     * The main gun for a field.
     *
     * @param battleField the battle field, whose inset rectangle bounds where a robot can be
     */
    public MainGun(BattleField battleField) {
        this.battleField = battleField;
    }

    /** The gun's name in the logs. */
    public String getLabel() {
        return "Main Gun";
    }

    /**
     * The absolute bearing to fire along, in radians.
     *
     * <p>Each neighbour's projected angle is a candidate. A candidate's score is the sum over
     * the other valid neighbours of {@code weight * exp(-u^2 / 2)}, a Gaussian kernel with
     * {@code u} the angle between them in units of the bandwidth; the bandwidth is twice
     * {@code 18 / distance}, about the target's angular width. The best-scoring candidate
     * wins; the first on a tie.</p>
     *
     * @param w the gun wave for the shot, fired from our present position
     * @param view the main view for the target
     * @param myNextLocation where we will be when the bullet leaves, the next tick
     * @param currentTime the present tick
     * @return the winning bearing in [0, 2pi), or {@code w.absBearing} (head-on from the
     *     wave's source, as {@code atan2} gives it) when the view is empty or no neighbour
     *     gives a usable angle
     */
    public double aim(Wave w, KnnView<TimestampedFiringAngle> view,
                      Point2D.Double myNextLocation, long currentTime) {
        if (view.size() == 0) return w.absBearing;

        List<KdTree.Entry<TimestampedFiringAngle>> neighbors = view.nearestNeighbors(w, true);
        int numScans = neighbors.size();
        double[] firingAngles = new double[numScans];
        boolean[] valid = new boolean[numScans];
        // ADAPT-3: a seeded neighbour counts for its seed's weight, a live one for 1.
        double[] weights = new double[numScans];
        boolean seeded = false;

        for (int i = 0; i < numScans; i++) {
            weights[i] = neighbors.get(i).value.weight();
            seeded |= weights[i] != 1.0;
            // RES-4: a faded seed is no longer a candidate angle.
            if (!(weights[i] > 0)) continue;
            Point2D.Double dispVector = neighbors.get(i).value.displacementVector;
            // Play the neighbour's movement forward from the target's state at the wave's
            // fire time, plus the ticks since then and the one until our bullet leaves,
            // until a bullet from our next position meets it. "Blind": the replay is a
            // straight line and ignores walls, hence the field test below.
            Point2D.Double projected = w.projectLocationBlind(
                myNextLocation, dispVector, currentTime);
            // A robot's centre stays 18 px inside the walls; a point outside can't happen.
            if (battleField.rectangle.contains(projected)) {
                firingAngles[i] = DiaUtils.absoluteBearing(myNextLocation, projected);
                valid[i] = true;
            }
        }

        double bestAngle = 0;
        double bestDensity = Double.NEGATIVE_INFINITY;
        // Twice the target's angular half-width (18 px over the distance): about one robot
        // width, so angles that would hit the same robot support each other.
        double bandwidth = 2.0 * DiaUtils.botWidthAimAngle(
            myNextLocation.distance(w.targetLocation));

        for (int x = 0; x < numScans; x++) {
            if (!valid[x]) continue;
            double xAngle = firingAngles[x];
            // With seeds in play a candidate also counts its own weight, so a half-weight seed
            // never outranks the live sample it agrees with. All-live views skip this, and
            // score exactly as 1.20 did.
            double density = seeded ? weights[x] : 0;
            for (int y = 0; y < numScans; y++) {
                if (x != y && valid[y]) {
                    // Candidates are absolute bearings; take the short way round.
                    double ux = Angles.normalRelativeAngle(
                        xAngle - firingAngles[y]) / bandwidth;
                    density += weights[y] * Math.exp(-0.5 * ux * ux);
                }
            }
            if (density > bestDensity) {
                bestAngle = xAngle;
                bestDensity = density;
            }
        }

        // No candidate was valid: every neighbour faded or projected off the field.
        if (bestDensity == Double.NEGATIVE_INFINITY) return w.absBearing;
        return Angles.normalAbsoluteAngle(bestAngle);
    }

    /**
     * A new main view: the {@link GunFormula} space, k up to 100 at one neighbour per ten
     * points, learning from every wave, virtual waves and melee waves included. It sets no
     * size cap of its own, so it keeps {@link KnnView#DEFAULT_MAX_DATA_POINTS} (RES-2).
     *
     * @param enemiesTotal the opponents at the start of the battle, for the crowd feature
     * @return the view, named {@link #viewName()}
     */
    public KnnView<TimestampedFiringAngle> createView(int enemiesTotal) {
        return new KnnView<TimestampedFiringAngle>(new GunFormula(enemiesTotal))
            .setK(K_SIZE).setKDivisor(K_DIVISOR)
            .visitsOn().virtualWavesOn().meleeOn()
            .setName(VIEW_NAME);
    }

    /** The main view's key in a {@link GunController} view map. */
    public static String viewName() {
        return VIEW_NAME;
    }
}
