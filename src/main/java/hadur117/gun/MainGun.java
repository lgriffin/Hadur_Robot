package hadur117.gun;

import hadur117.utils.*;
import java.awt.geom.Point2D;
import java.util.List;
import robocode.util.Utils;

public class MainGun {

    private static final String VIEW_NAME = "Main";
    private static final int K_SIZE = 100;
    private static final int K_DIVISOR = 10;

    private final BattleField battleField;

    public MainGun(BattleField battleField) {
        this.battleField = battleField;
    }

    public String getLabel() {
        return "Main Gun";
    }

    public double aim(Wave w, KnnView<TimestampedFiringAngle> view) {
        if (view.size() == 0) return w.absBearing;

        List<KdTree.Entry<TimestampedFiringAngle>> neighbors = view.nearestNeighbors(w, true);
        int numScans = neighbors.size();
        Double[] firingAngles = new Double[numScans];

        for (int i = 0; i < numScans; i++) {
            Point2D.Double dispVector = neighbors.get(i).value.displacementVector;
            Point2D.Double projected = w.projectLocationFromDisplacementVector(dispVector);
            if (battleField.rectangle.contains(projected)) {
                firingAngles[i] = Utils.normalRelativeAngle(
                    w.firingAngleFromTargetLocation(projected) - w.absBearing);
            }
        }

        Double bestAngle = null;
        double bestDensity = Double.NEGATIVE_INFINITY;
        double bandwidth = 2.0 * DiaUtils.botWidthAimAngle(
            w.sourceLocation.distance(w.targetLocation));

        for (int x = 0; x < numScans; x++) {
            if (firingAngles[x] == null) continue;
            double xAngle = firingAngles[x];
            double density = 0;
            for (int y = 0; y < numScans; y++) {
                if (x != y && firingAngles[y] != null) {
                    double ux = (xAngle - firingAngles[y]) / bandwidth;
                    density += Math.exp(-0.5 * ux * ux);
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

    public KnnView<TimestampedFiringAngle> createView(int enemiesTotal) {
        return new KnnView<TimestampedFiringAngle>(new GunFormula(enemiesTotal))
            .setK(K_SIZE).setKDivisor(K_DIVISOR)
            .visitsOn().virtualWavesOn().meleeOn()
            .setName(VIEW_NAME);
    }

    public static String viewName() {
        return VIEW_NAME;
    }
}
