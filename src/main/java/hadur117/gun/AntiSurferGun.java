package hadur117.gun;

import hadur117.utils.*;
import java.awt.geom.Point2D;
import java.util.*;
import robocode.util.Utils;

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

    public double aim(Wave w, Map<String, KnnView<TimestampedFiringAngle>> views) {
        List<KdTree.Entry<TimestampedFiringAngle>> allNeighbors = null;
        double[] neighborWeights = null;

        for (String viewName : VIEW_NAMES) {
            KnnView<TimestampedFiringAngle> view = views.get(viewName);
            if (view == null || view.size() < view.kDivisor) continue;

            List<KdTree.Entry<TimestampedFiringAngle>> thisNeighbors =
                view.nearestNeighbors(w, true);
            double[] thisWeights = new double[thisNeighbors.size()];
            Arrays.fill(thisWeights, view.weight);

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

        int numScans = allNeighbors.size();
        Double[] firingAngles = new Double[numScans];

        for (int i = 0; i < numScans; i++) {
            TimestampedFiringAngle tfa = allNeighbors.get(i).value;
            if (is1v1) {
                double gf = tfa.guessFactor;
                firingAngles[i] = Utils.normalRelativeAngle(
                    gf * w.orbitDirection * w.preciseEscapeAngle(gf >= 0));
            } else {
                Point2D.Double projected =
                    w.projectLocationFromDisplacementVector(tfa.displacementVector);
                if (battleField.rectangle.contains(projected)) {
                    firingAngles[i] = Utils.normalRelativeAngle(
                        w.firingAngleFromTargetLocation(projected) - w.absBearing);
                }
            }
        }

        Double bestAngle = null;
        double bestDensity = Double.NEGATIVE_INFINITY;
        double bandwidth = 2.0 * DiaUtils.botWidthAimAngle(
            w.sourceLocation.distance(w.targetLocation));
        double[] testAngles = DiaUtils.generateFiringAngles(FIRING_ANGLES, w.maxEscapeAngle());

        for (int x = 0; x < FIRING_ANGLES; x++) {
            double xAngle = testAngles[x];
            double density = 0;
            for (int y = 0; y < numScans; y++) {
                if (firingAngles[y] != null) {
                    double ux = (xAngle - firingAngles[y]) / bandwidth;
                    density += Math.exp(-0.5 * ux * ux) * neighborWeights[y];
                }
            }
            if (density > bestDensity) {
                bestAngle = xAngle;
                bestDensity = density;
            }
        }

        if (bestAngle == null) return w.absBearing;
        return Utils.normalAbsoluteAngle(w.absBearing + bestAngle);
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
