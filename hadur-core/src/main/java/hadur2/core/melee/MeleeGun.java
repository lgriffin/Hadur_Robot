package hadur2.core.melee;

import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;

/**
 * Melee targeting: circular prediction, falling back to linear prediction when the
 * opponent's turn rate is unknown. Cheap enough to aim at a new target every tick.
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

    /** Distance- and energy-based bullet power, never more than needed to kill. */
    public static double basePower(double distance, double myEnergy,
                                   double enemyEnergy, int enemiesAlive) {
        double power = 2.999;
        if (enemiesAlive <= 3) power = 1.999;
        if (enemiesAlive <= 5 && distance > 500.0) power = 1.499;
        if ((myEnergy < enemyEnergy && enemiesAlive <= 5 && distance > 300.0)
                || distance > 700.0) {
            power = 0.999;
        }
        if (myEnergy < 20.0 && myEnergy < enemyEnergy) {
            power = Math.min(power, 2.0 - (20.0 - myEnergy) / 11.0);
        }
        power = Math.min(power, killPower(enemyEnergy));
        power = Math.max(power, 0.1);
        return Math.min(power, myEnergy);
    }

    /** Smallest bullet power whose damage finishes a robot with {@code energy} left. */
    public static double killPower(double energy) {
        // Bullet damage is 4p, plus 2(p - 1) above power 1.
        double p = energy <= 4.0 ? energy / 4.0 : (energy + 2.0) / 6.0;
        return Math.max(0.1, p + 0.01);
    }
}
