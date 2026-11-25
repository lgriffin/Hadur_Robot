package hadur117.sepia;

import hadur117.core.model.RobotState;
import hadur117.core.model.Wave;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/** Shared set-ups: waves on an 800 x 600 field, and landings fixed by hand. */
final class Fixtures {

    static final double W = 800, H = 600;
    static final BattleField FIELD = new BattleField(W, H);
    static final MovementPredictor PREDICTOR = new MovementPredictor(FIELD);

    private Fixtures() {}

    static Point2D.Double p(double x, double y) {
        return new Point2D.Double(x, y);
    }

    static RobotState state(double x, double y, double heading, double velocity, long time) {
        return RobotState.newBuilder().setLocation(p(x, y)).setHeading(heading).setVelocity(velocity).setTime(time).build();
    }

    /** A wave fired on {@code fireTime} from {@code source} at a body at {@code target} moving east at 8. */
    static InkWave wave(Point2D.Double source, Point2D.Double target, long fireTime, double power) {
        Wave w = new Wave("enemy", source, target, 0, fireTime, power, Math.PI / 2, 8, 1, FIELD, PREDICTOR);
        return new InkWave(w, fireTime + 1);
    }

    /** Fixes {@code w}'s landing on a body standing still at {@code landing}. */
    static InkWave land(InkWave w, Point2D.Double landing) {
        double d = landing.distance(w.wave.sourceLocation);
        List<RobotState> crossing = new ArrayList<>();
        long arrival = Long.MAX_VALUE, passed = 0;
        for (long t = w.wave.fireTime; t < w.wave.fireTime + 200; t++) {
            double r0 = w.wave.distanceTraveled(t), r1 = w.wave.distanceTraveled(t + 1);
            if (r1 >= d - 26 && r0 <= d + 26) {
                crossing.add(state(landing.x, landing.y, 0, 0, t));
                arrival = Math.min(arrival, t);
                passed = t;
            }
        }
        Wave.Intersection hit = w.wave.preciseIntersection(crossing);
        w.commit(hit.angle - hit.bandwidth, hit.angle + hit.bandwidth, d, arrival, passed, Gait.CARRY);
        return w;
    }
}
