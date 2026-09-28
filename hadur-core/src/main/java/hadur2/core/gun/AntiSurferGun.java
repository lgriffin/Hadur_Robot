package hadur2.core.gun;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;

import java.awt.geom.Point2D;
import java.util.*;

/**
 * The anti-surfer gun: four small, fast-forgetting KNN views whose neighbours are pooled
 * and scored on a fixed grid of firing angles.
 *
 * <p>A wave surfer learns where our bullets go and moves away from them, so old data about
 * it goes stale. The four views keep only the latest 125, 400, 1,500 and 4,000 waves (the
 * FIFO caps also bound them, RES-2) and return at most three neighbours each, so the aim
 * leans on what the target did recently. In a duel each neighbour gives a guess factor,
 * scaled by the precise escape angle on its side; with several opponents it would give a
 * displacement vector, projected as the main gun does. The chosen angle is the one of 59
 * evenly spaced offsets across the maximum escape angle where the pooled neighbours are
 * densest.</p>
 *
 * <p>{@link GunController} uses it in duels only: when the virtual guns rate it above the
 * main gun, or from the first wave when the opening book picks it (ADAPT-1). Angles are
 * Robocode bearings in radians, 0 north and clockwise; a guess factor is in [-1, 1],
 * positive in the target's orbit direction.</p>
 */
public class AntiSurferGun {

    /** Candidate offsets across the escape angle; odd, so head-on is one of them. */
    private static final int FIRING_ANGLES = 59;
    private static final String[] VIEW_NAMES = {"asView1", "asView2", "asView3", "asView4"};
    /** Each view's FIFO cap, in the order of {@link #VIEW_NAMES} (RES-2). */
    private static final int[] MAX_DATA_POINTS = {125, 400, 1500, 4000};

    /** For the field test on projected points in melee. */
    private final BattleField battleField;
    /** One opponent at the battle's start: aim by guess factor rather than displacement. */
    private final boolean is1v1;

    /**
     * The anti-surfer gun.
     *
     * @param battleField the battle field
     * @param is1v1 whether the battle started with one opponent
     */
    public AntiSurferGun(BattleField battleField, boolean is1v1) {
        this.battleField = battleField;
        this.is1v1 = is1v1;
    }

    /** The gun's name in the logs. */
    public String getLabel() {
        return "Anti-Surfer Gun";
    }

    /**
     * The absolute bearing to fire along, in radians.
     *
     * @param w the gun wave for the shot
     * @param views the target's gun views; the anti-surfer ones are read by name
     * @param myNextLocation where we will be when the bullet leaves, the next tick
     * @param currentTime the present tick
     * @return the densest bearing in [0, 2pi), or {@code w.absBearing} (head-on from the
     *     wave's source) while no view holds at least its {@code kDivisor} (10) points that
     *     still count
     */
    public double aim(Wave w, Map<String, KnnView<TimestampedFiringAngle>> views,
                      Point2D.Double myNextLocation, long currentTime) {
        List<KdTree.Entry<TimestampedFiringAngle>> allNeighbors = null;
        double[] neighborWeights = null;

        // Pool every ready view's neighbours into one list with parallel weights.
        for (String viewName : VIEW_NAMES) {
            KnnView<TimestampedFiringAngle> view = views.get(viewName);
            // A view joins once it holds ten points that still count (RES-4: faded seeds don't).
            if (view == null || view.effectiveSize() < view.kDivisor) continue;

            List<KdTree.Entry<TimestampedFiringAngle>> thisNeighbors =
                view.nearestNeighbors(w, true);
            double[] thisWeights = new double[thisNeighbors.size()];
            for (int i = 0; i < thisWeights.length; i++) {
                // ADAPT-3: a seeded neighbour counts for its seed's weight, a live one for 1.
                thisWeights[i] = view.weight * thisNeighbors.get(i).value.weight();
            }

            if (allNeighbors == null) {
                allNeighbors = new ArrayList<>(thisNeighbors);
                neighborWeights = thisWeights;
            } else {
                int oldLen = neighborWeights.length;
                allNeighbors.addAll(thisNeighbors);
                neighborWeights = Arrays.copyOf(neighborWeights, allNeighbors.size());
                for (int i = oldLen; i < neighborWeights.length; i++) {
                    neighborWeights[i] = thisWeights[i - oldLen];
                }
            }
        }

        if (allNeighbors == null || allNeighbors.isEmpty()) return w.absBearing;

        // Offsets below are relative to head-on from where the bullet will leave.
        double nextAbsBearing = DiaUtils.absoluteBearing(myNextLocation, w.targetLocation);
        int numScans = allNeighbors.size();
        double[] firingAngles = new double[numScans];
        boolean[] valid = new boolean[numScans];

        for (int i = 0; i < numScans; i++) {
            TimestampedFiringAngle tfa = allNeighbors.get(i).value;
            if (is1v1) {
                // Guess factor to angle offset. The precise escape angle differs on the two
                // sides (walls, and the target's present heading and speed), so a positive
                // factor scales by the forward side's and a negative one by the reverse
                // side's; orbitDirection turns "forward" into clockwise or anticlockwise.
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
        // About one robot width at this distance, as in the main gun; GUN-3 floors it at the
        // target's own angular half-width, so the kernel is never narrower than the target
        // itself, whatever distance-based bandwidth would otherwise give.
        double bandwidth = Math.max(2.0 * DiaUtils.botWidthAimAngle(distance),
            DiaUtils.botWidthAimAngle(distance));
        // GUN-3: 59 offsets across the target's actual (precise) escape angle on each side,
        // not the smaller, symmetric classic one. The classic grid could leave the true best
        // angle - a neighbour's precise firing angle beyond the classic bound - off the grid
        // entirely, so two narrow, real peaks either side of it were never tested between.
        double[] testAngles = DiaUtils.generateFiringAngles(FIRING_ANGLES,
            w.preciseEscapeAngle(false), w.preciseEscapeAngle(true));

        // Kernel density at each grid offset: a Gaussian of the gap to every pooled
        // neighbour, times that neighbour's weight. The first offset on a tie wins.
        for (int x = 0; x < FIRING_ANGLES; x++) {
            double xAngle = testAngles[x];
            double density = 0;
            for (int y = 0; y < numScans; y++) {
                if (!valid[y]) continue;
                double ux = (xAngle - firingAngles[y]) / bandwidth;
                density += Math.exp(-0.5 * ux * ux) * neighborWeights[y];
            }
            if (density > bestDensity) {
                bestAngle = xAngle;
                bestDensity = density;
            }
        }

        return Angles.normalAbsoluteAngle(nextAbsBearing + bestAngle);
    }

    /**
     * The four anti-surfer views, sharing one {@link AntiSurferFormula}: k 3 at one neighbour
     * per ten points, capped at 125, 400, 1,500 and 4,000 points (RES-2), learning from every
     * wave including virtual ones, but not in melee.
     *
     * @return the views, in the order of {@link #viewNames()}
     */
    public List<KnnView<TimestampedFiringAngle>> createViews() {
        AntiSurferFormula formula = new AntiSurferFormula();
        List<KnnView<TimestampedFiringAngle>> views = new ArrayList<>();
        for (int i = 0; i < VIEW_NAMES.length; i++) {
            views.add(new KnnView<TimestampedFiringAngle>(formula)
                .setK(3).setMaxDataPoints(MAX_DATA_POINTS[i])
                .setKDivisor(10).visitsOn().virtualWavesOn()
                .setName(VIEW_NAMES[i]));
        }
        return views;
    }

    /**
     * The anti-surfer views' keys in a {@link GunController} view map. The array itself is
     * returned, not a copy, so callers must not change it.
     */
    public static String[] viewNames() {
        return VIEW_NAMES;
    }
}
