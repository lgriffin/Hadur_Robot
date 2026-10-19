package hadur2.core.move;

import hadur2.core.physics.Angles;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * MOVE-12: how much of its escape angle a robot keeps inside the field.
 *
 * <p>A bullet of speed {@code v} fired from {@code source} at a robot at {@code target} can be
 * escaped, at speed 8, to exactly the points P where {@code |PT| / 8 <= |PS| / v}: the disc of
 * an Apollonius circle (diameter from {@code 8d/(v+8)} short of the target to {@code 8d/(v-8)}
 * beyond it, d the distance). The widest angle the target can get from the source's line of
 * fire on either side is where that disc, cut to the area a robot's centre can occupy, is
 * widest as seen from the source. That is the exact "precise positional" escape angle, found
 * in constant time (no sampling) among the candidates: the tangent points from the source
 * (when they lie in the field), where the circle crosses the four walls, and the field's
 * corners inside the circle.</p>
 *
 * <p>The restriction is the in-field escape angles summed over twice the open-field one
 * ({@code asin(8/v)}): 1 in the open, falling toward 0 as walls take that side's room away.
 * Each side is floored at 0.001 rad so the ratio never divides by zero. Cost: four line/circle
 * solves, four corner tests and one small array, three or four times per surf option.</p>
 */
public final class EscapeRoom {
    /** Each side's escape angle is at least this, in rad. */
    private static final double MIN_ANGLE = 0.001;

    private EscapeRoom() { }

    /**
     * The in-field escape angles of a target from a source's bullets.
     *
     * @param source where the bullet is fired from, in px
     * @param target the robot escaping, in px
     * @param bulletSpeed the bullet's speed, in px per tick
     * @param field the field, for the area a robot's centre can occupy
     * @return {negative side, positive side} in rad, each at least 0.001 and at most
     *     {@code asin(8 / bulletSpeed)}
     */
    public static double[] inFieldAngles(Point2D.Double source, Point2D.Double target,
                                         double bulletSpeed, BattleField field) {
        double open = Math.asin(Math.min(1.0, 8.0 / bulletSpeed));
        double d = source.distance(target);
        if (bulletSpeed <= 8.0 || d < 1e-9) return new double[] {open, open};
        double r1 = 8 * d / (bulletSpeed + 8);
        double r2 = 8 * d / (bulletSpeed - 8);
        double radius = (r1 + r2) / 2;
        double bearing = DiaUtils.absoluteBearing(source, target);
        // The centre lies (radius - r1) beyond the target, along the line of fire.
        Point2D.Double c = DiaUtils.project(target, bearing, radius - r1);
        double[] range = {0, 0}; // lowest and highest offset, the line of fire itself included
        double dc = source.distance(c);
        Rectangle2D.Double rect = field.rectangle;
        double x0 = rect.x, x1 = rect.x + rect.width, y0 = rect.y, y1 = rect.y + rect.height;
        if (dc > radius) {
            double tangentAngle = Math.asin(radius / dc);
            double tangentLength = Math.sqrt(dc * dc - radius * radius);
            double toCentre = DiaUtils.absoluteBearing(source, c);
            for (int s = -1; s <= 1; s += 2) {
                Point2D.Double p = DiaUtils.project(source, toCentre + s * tangentAngle, tangentLength);
                if (p.x >= x0 && p.x <= x1 && p.y >= y0 && p.y <= y1) update(range, source, p, bearing);
            }
        }
        for (int i = 0; i < 2; i++) {
            double wallX = i == 0 ? x0 : x1;
            double dx = wallX - c.x;
            if (Math.abs(dx) <= radius) {
                double dy = Math.sqrt(radius * radius - dx * dx);
                for (int s = -1; s <= 1; s += 2) {
                    double y = c.y + s * dy;
                    if (y >= y0 && y <= y1) update(range, source, new Point2D.Double(wallX, y), bearing);
                }
            }
            double wallY = i == 0 ? y0 : y1;
            double dy = wallY - c.y;
            if (Math.abs(dy) <= radius) {
                double dx2 = Math.sqrt(radius * radius - dy * dy);
                for (int s = -1; s <= 1; s += 2) {
                    double x = c.x + s * dx2;
                    if (x >= x0 && x <= x1) update(range, source, new Point2D.Double(x, wallY), bearing);
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            Point2D.Double corner = new Point2D.Double((i & 1) == 0 ? x0 : x1, (i & 2) == 0 ? y0 : y1);
            if (corner.distance(c) <= radius) update(range, source, corner, bearing);
        }
        return new double[] {
            Math.min(open, Math.max(-range[0], MIN_ANGLE)),
            Math.min(open, Math.max(range[1], MIN_ANGLE))};
    }

    private static void update(double[] range, Point2D.Double source, Point2D.Double p, double bearing) {
        double off = Angles.normalRelativeAngle(DiaUtils.absoluteBearing(source, p) - bearing);
        if (off < range[0]) range[0] = off;
        if (off > range[1]) range[1] = off;
    }

    /**
     * How much of the open-field escape angle {@code target} keeps against {@code source}'s
     * bullets: the two in-field angles summed over twice {@code asin(8 / bulletSpeed)}.
     *
     * @param source where the bullet comes from, in px
     * @param target the robot escaping, in px
     * @param bulletSpeed the bullet's speed, in px per tick
     * @param field the field
     * @return the share, in (0, 1]; 1 when no wall is in the way
     */
    public static double restriction(Point2D.Double source, Point2D.Double target,
                                     double bulletSpeed, BattleField field) {
        double open = Math.asin(Math.min(1.0, 8.0 / bulletSpeed));
        double[] a = inFieldAngles(source, target, bulletSpeed, field);
        return Math.min(1.0, (a[0] + a[1]) / (2 * open));
    }

    /**
     * The position term: {@code restriction(ourEnd, enemy)} over {@code restriction(enemy,
     * ourEnd)} squared. Above 1 when the enemy has room to escape our bullets from where we
     * end, below 1 when we have room to escape his; a danger multiplied by it prefers ends
     * that keep our escape angle and cost him his.
     *
     * @param ourEnd where we would be when the wave passes, in px
     * @param enemy the wave's source, in px
     * @param bulletSpeed the wave's bullet speed, in px per tick
     * @param field the field
     * @return the factor, above 0
     */
    public static double multiplier(Point2D.Double ourEnd, Point2D.Double enemy,
                                    double bulletSpeed, BattleField field) {
        double enemyRoom = restriction(ourEnd, enemy, bulletSpeed, field);
        double ourRoom = restriction(enemy, ourEnd, bulletSpeed, field);
        return enemyRoom / (ourRoom * ourRoom);
    }
}
