package hadur2.core.melee;

import hadur2.core.world.EnemyTracker;
import hadur2.core.world.EnemyInfo;
import hadur2.core.physics.BattleField;
import java.awt.geom.Point2D;

/** Builders shared by the melee tests. */
public final class Fixtures {

    private Fixtures() {}

    public static BattleField field(double w, double h) {
        return new BattleField(w, h);
    }

    public static Point2D.Double pt(double x, double y) {
        return new Point2D.Double(x, y);
    }

    /** Scans a stationary opponent into the tracker. */
    public static EnemyInfo scan(EnemyTracker t, String name, double x, double y,
                                 double energy, long time) {
        return t.onScan(name, pt(x, y), energy, 0, 0, time);
    }

    /** Scans a moving opponent into the tracker. */
    public static EnemyInfo scan(EnemyTracker t, String name, double x, double y,
                                 double energy, double heading, double velocity, long time) {
        return t.onScan(name, pt(x, y), energy, heading, velocity, time);
    }

    /** Position at {@code bearingDeg} (Robocode convention: 0 = north, clockwise) and distance from {@code from}. */
    public static Point2D.Double at(Point2D.Double from, double bearingDeg, double distance) {
        double a = Math.toRadians(bearingDeg);
        return pt(from.x + Math.sin(a) * distance, from.y + Math.cos(a) * distance);
    }
}
