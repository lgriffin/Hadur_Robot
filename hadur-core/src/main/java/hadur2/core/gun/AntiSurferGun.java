package hadur2.core.gun;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;

import java.awt.geom.Point2D;
import java.util.*;

public class AntiSurferGun {

    private static final int FIRING_ANGLES = 59;
    private static final String[] VIEW_NAMES = {"asView1", "asView2", "asView3", "asView4"};
    private static final int[] MAX_DATA_POINTS = {125, 400, 1500, 4000};

    private final BattleField battleField;
    private final boolean is1v1;

    public AntiSurferGun(BattleField battleField, boolean is1v1) {
        this.battleField = battleField;
        this.is1v1 = is1v1;
    }

    public String getLabel() {
        return "Anti-Surfer Gun";
    }

    public double aim(Wave w, Map<String, KnnView<TimestampedFiringAngle>> views,
                      Point2D.Double myNextLocation, long currentTime) {
        List<KdTree.Entry<TimestampedFiringAngle>> allNeighbors = null;
        double[] neighborWeights = null;

        for (String viewName : VIEW_NAMES) {
            KnnView<TimestampedFiringAngle> view = views.get(viewName);
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

        double nextAbsBearing = DiaUtils.absoluteBearing(myNextLocation, w.targetLocation);
        int numScans = allNeighbors.size();
        double[] firingAngles = new double[numScans];
        boolean[] valid = new boolean[numScans];

        for (int i = 0; i < numScans; i++) {
            TimestampedFiringAngle tfa = allNeighbors.get(i).value;
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
        double bandwidth = 2.0 * DiaUtils.botWidthAimAngle(
            myNextLocation.distance(w.targetLocation));
        double[] testAngles = DiaUtils.generateFiringAngles(FIRING_ANGLES, w.maxEscapeAngle());

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

    public static String[] viewNames() {
        return VIEW_NAMES;
    }
}
