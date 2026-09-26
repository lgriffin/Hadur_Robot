package hadur2.core.gun;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;

import java.awt.geom.Point2D;
import java.util.List;

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

    public double aim(Wave w, KnnView<TimestampedFiringAngle> view,
                      Point2D.Double myNextLocation, long currentTime) {
        if (view.size() == 0) return w.absBearing;

        List<KdTree.Entry<TimestampedFiringAngle>> neighbors = view.nearestNeighbors(w, true);
        int numScans = neighbors.size();
        double[] firingAngles = new double[numScans];
        boolean[] valid = new boolean[numScans];

        for (int i = 0; i < numScans; i++) {
            Point2D.Double dispVector = neighbors.get(i).value.displacementVector;
            Point2D.Double projected = w.projectLocationBlind(
                myNextLocation, dispVector, currentTime);
            if (battleField.rectangle.contains(projected)) {
                firingAngles[i] = DiaUtils.absoluteBearing(myNextLocation, projected);
                valid[i] = true;
            }
        }

        double bestAngle = 0;
        double bestDensity = Double.NEGATIVE_INFINITY;
        double bandwidth = 2.0 * DiaUtils.botWidthAimAngle(
            myNextLocation.distance(w.targetLocation));

        for (int x = 0; x < numScans; x++) {
            if (!valid[x]) continue;
            double xAngle = firingAngles[x];
            double density = 0;
            for (int y = 0; y < numScans; y++) {
                if (x != y && valid[y]) {
                    double ux = Angles.normalRelativeAngle(
                        xAngle - firingAngles[y]) / bandwidth;
                    density += Math.exp(-0.5 * ux * ux);
                }
            }
            if (density > bestDensity) {
                bestAngle = xAngle;
                bestDensity = density;
            }
        }

        if (bestDensity == Double.NEGATIVE_INFINITY) return w.absBearing;
        return Angles.normalAbsoluteAngle(bestAngle);
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
