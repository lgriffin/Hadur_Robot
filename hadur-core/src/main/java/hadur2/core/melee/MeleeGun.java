package hadur2.core.melee;

import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;

/**
 * The field gun's fallback for an opponent with too little history (MGUN-1): circular
 * prediction, or linear while the opponent's turn rate is unknown.
 */
public class MeleeGun {

    public enum Strategy { CIRCULAR, LINEAR }

    public static final class Aim {
        public final double angle;
        public final Strategy strategy;
        public final Point2D.Double predicted;

        Aim(double angle, Strategy strategy, Point2D.Double predicted) {
            this.angle = angle;
            this.strategy = strategy;
            this.predicted = predicted;
        }
    }

    private static final int MAX_PREDICTION_TICKS = 150;

    private final BattleField field;

    public MeleeGun(BattleField field) {
        this.field = field;
    }

    public Aim aim(Point2D.Double me, EnemyInfo e, double power, long now) {
        double turnRate = e.turnRate();
        Strategy strategy = Double.isNaN(turnRate) ? Strategy.LINEAR : Strategy.CIRCULAR;
        Point2D.Double predicted = predict(me, e, power, now,
            strategy == Strategy.CIRCULAR ? turnRate : 0.0);
        return new Aim(DiaUtils.absoluteBearing(me, predicted), strategy, predicted);
    }

    /**
     * Where {@code e} will be when a bullet of {@code power} fired from {@code me} now
     * reaches it, assuming constant velocity and turn rate. Robots stop at walls.
     */
    public Point2D.Double predict(Point2D.Double me, EnemyInfo e, double power,
                                  long now, double turnRate) {
        double speed = 20.0 - 3.0 * power;
        long elapsed = Math.max(0, now - e.lastScanTime);
        double x = e.location.x, y = e.location.y;
        double heading = e.heading, velocity = e.velocity;
        for (int t = 1; t <= MAX_PREDICTION_TICKS; t++) {
            heading += turnRate;
            double nx = x + Math.sin(heading) * velocity;
            double ny = y + Math.cos(heading) * velocity;
            if (!field.rectangle.contains(nx, ny)) {
                velocity = 0;
            } else {
                x = nx;
                y = ny;
            }
            if (t > elapsed && (t - elapsed) * speed >= me.distance(x, y)) break;
        }
        return new Point2D.Double(x, y);
    }
}
