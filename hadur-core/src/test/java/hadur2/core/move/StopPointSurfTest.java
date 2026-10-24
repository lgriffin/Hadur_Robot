package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.RobotState;
import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-25: the stop-point surf's danger surface and stop points. */
class StopPointSurfTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final MovementPredictor PREDICTOR = new MovementPredictor(FIELD);

    private static StopPointSurf surf() {
        return new StopPointSurf(FIELD, PREDICTOR);
    }

    @Test
    @Tag("MOVE-25")
    @DisplayName("the smoothed histogram is a probability, peaked where the neighbours were")
    void smoothKeepsMassAndPeak() {
        double[] raw = new double[StopPointSurf.BINS];
        int peak = MoveController.profileBin(0.4, StopPointSurf.BINS);
        raw[peak] = 1.0;
        double[] smooth = surf().smooth(raw);
        double sum = 0;
        int argmax = 0;
        for (int i = 0; i < smooth.length; i++) {
            sum += smooth[i];
            if (smooth[i] > smooth[argmax]) argmax = i;
        }
        assertEquals(1.0, sum, 1e-9);
        assertEquals(peak, argmax);
        // Wide, as the rivals': a bot width (~0.06 GF) away keeps most of the height.
        int near = MoveController.profileBin(0.46, StopPointSurf.BINS);
        assertTrue(smooth[near] > 0.6 * smooth[peak], "kernel too narrow");
    }

    @Test
    @Tag("MOVE-25")
    @DisplayName("the mass over a guess-factor range splits bins pro rata and covers [-1, 1] as 1")
    void integrateIsProRata() {
        double[] flat = new double[StopPointSurf.BINS];
        java.util.Arrays.fill(flat, 1.0 / StopPointSurf.BINS);
        assertEquals(1.0, StopPointSurf.integrate(flat, -1, 1), 1e-9);
        assertEquals(0.1, StopPointSurf.integrate(flat, 0.3, 0.5), 1e-9);
        assertEquals(1.0, StopPointSurf.integrate(flat, -3, 3), 1e-9);
        assertEquals(0.0, StopPointSurf.integrate(flat, 0.5, 0.5), 0.0);
    }

    @Test
    @Tag("MOVE-25")
    @DisplayName("stop points start where we stand, reach both ways and are at least 7 px apart")
    void stopPointsSpanBothWays() {
        Wave w = new Wave("enemy", new Point2D.Double(400, 500), new Point2D.Double(400, 200), 0, 0, 2,
            0, 0, 1, FIELD, PREDICTOR);
        RobotState me = RobotState.newBuilder().setLocation(new Point2D.Double(400, 200)).setTime(1).build();
        List<Point2D.Double> points = surf().stopPoints(me, w, 650);
        assertEquals(me.location, points.get(0));
        assertTrue(points.size() > 20, "too few stop points: " + points.size());
        boolean east = false, west = false;
        for (int i = 0; i < points.size(); i++) {
            east |= points.get(i).x > 450;
            west |= points.get(i).x < 350;
            for (int j = 0; j < i; j++) {
                assertTrue(points.get(i).distance(points.get(j)) >= StopPointSurf.POINT_SPACING - 1e-9);
            }
        }
        assertTrue(east && west, "stop points should reach both ways round");
    }

    @Test
    @Tag("MOVE-25")
    @DisplayName("the distancing factor is 1 when the distance holds and above 1 when it closes")
    void distancingFactor() {
        Point2D.Double from = new Point2D.Double(0, 0);
        assertEquals(1.0, StopPointSurf.distancing(new Point2D.Double(300, 0), new Point2D.Double(0, 300), from), 1e-9);
        assertTrue(StopPointSurf.distancing(new Point2D.Double(300, 0), new Point2D.Double(150, 0), from) > 1);
    }
}
