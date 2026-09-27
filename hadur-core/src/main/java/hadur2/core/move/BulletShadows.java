package hadur2.core.move;

import hadur2.core.model.Wave;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * MOVE-1: where our bullets shadow an enemy wave. The engine moves each bullet along a
 * straight segment every turn and destroys two bullets whose segments cross that turn. The
 * enemy's bullet lies on a ray from the wave's source, between the wave's radii at the
 * turn's start and end, so it meets our bullet's segment exactly when its firing angle is
 * the bearing (from the source) of a point of that segment inside the ring those two radii
 * bound. The union of those bearings over the turns both bullets fly is the shadow: a bullet
 * the enemy fired at any of them dies before it reaches us.
 *
 * <p>Shadows are bearings from the wave's source, in radians (Robocode's compass: 0 north,
 * clockwise), not guess factors: the surf scores bearings anyway, and a bearing interval
 * needs no assumption about the enemy's escape angle. Two lists come out, following the
 * engine's order of play (see {@code cast}): the certain shadow, angles whose bullet meets
 * one of ours whatever order the engine moves the two in, and the possible shadow, which
 * adds the angles that meet in only one of the two orders. {@link hadur2.core.model.Wave}
 * stores both and its {@code shadowedFraction} counts a possible shadow as half, so the
 * surf keeps {@code 1 - (certain + possible / 2)} of a wave's danger at an intersection.</p>
 *
 * <p>{@link MoveController#updateShadows} calls {@link #of} for each enemy firing wave when
 * the wave is new or our bullets in flight have changed. The work is bounded (RES-2): at
 * most {@code MAX_TURNS} turns per bullet, and a bullet is followed only while it is on
 * the field. The class is stateless.</p>
 */
public final class BulletShadows {

    /**
     * Turns followed at most per bullet. At the slowest bullet speed, 11 px a turn, that is
     * 1,320 px, more than the 1,000 px diagonal of the standard 800 x 600 field; a bullet
     * that leaves the field sooner stops the walk sooner.
     */
    static final int MAX_TURNS = 120;

    /** Not instantiated: the class is a set of pure functions. */
    private BulletShadows() {}

    /**
     * The shadows {@code bullets} cast on {@code wave}: element 0 the certain ones, element 1
     * every angle that may meet one of ours (the certain ones included), each merged into
     * disjoint {@code [low, high]} bearing intervals sorted by {@code low} (MOVE-1).
     *
     * @param wave the enemy wave; its source, fire time and bullet speed are read
     * @param bullets our bullets in flight
     * @param fieldWidth the battle field's width, in px
     * @param fieldHeight the battle field's height, in px
     * @return a two-element list: the certain shadows, then the possible ones; either may
     *     be empty, and the intervals are in radians, continuous around the first one
     */
    public static List<List<double[]>> of(Wave wave, List<OurBullet> bullets, double fieldWidth,
                                          double fieldHeight) {
        List<double[]> certain = new ArrayList<>();
        List<double[]> possible = new ArrayList<>();
        for (OurBullet b : bullets) {
            cast(wave, b, fieldWidth, fieldHeight, certain, possible);
        }
        // The possible shadow includes the certain one, so Wave can read "possible" as every
        // angle that might be stopped and count the certain part twice (as 1, not 1/2).
        List<double[]> all = new ArrayList<>(certain);
        all.addAll(possible);
        return List.of(merge(certain), merge(all));
    }

    /**
     * Adds to {@code certain} and {@code possible} the raw (unmerged) bearing intervals where
     * bullet {@code b} meets the bullet of {@code wave}, turn by turn from the first turn
     * both are in flight, until {@code b} leaves the field or {@link #MAX_TURNS} have passed.
     *
     * @param wave the enemy wave
     * @param b one of our bullets
     * @param fieldWidth the battle field's width, in px
     * @param fieldHeight the battle field's height, in px
     * @param certain receives the intervals that meet whatever the engine's order
     * @param possible receives the intervals that meet in one order of the two
     */
    static void cast(Wave wave, OurBullet b, double fieldWidth, double fieldHeight,
                     List<double[]> certain, List<double[]> possible) {
        Point2D.Double s = wave.sourceLocation;
        // The engine moves every bullet before any robot, so turn k moves the enemy's bullet
        // from radius r(k - 1) to r(k) and ours from at(k - 1) to at(k). (A robot at its
        // turn-k position meets the segment of turn k + 1, which is why the wave's robot
        // intersection reads r(k) to r(k + 1).) Bullets move one at a time, in a random order
        // each turn, and each checks the others' segments as they stand. Two segments of the
        // same turn meet whatever the order: that is the certain shadow. The first to move
        // also checks the other's last segment, so this turn's move of either bullet against
        // the other's last one meets in about half the turns: the possible shadow.
        // The first turn on which both bullets move: each first moves on the turn after it
        // was fired.
        long first = Math.max(b.fireTime + 1, wave.fireTime + 1);
        for (long k = first; k < first + MAX_TURNS; k++) {
            Point2D.Double from = b.at(k - 1);
            // Once ours is off the field the engine has removed it: nothing further to shadow.
            if (!inField(from, fieldWidth, fieldHeight)) return;
            // The enemy bullet is at radius r after turn k and moved out from r - v during it.
            double r = wave.distanceTraveled(k);
            double v = wave.bulletSpeed();
            // Certain: both of turn k's segments, ours from at(k - 1) to at(k), theirs the
            // ring [r - v, r].
            pair(s, from, b.at(k), r - v, r, certain);
            // Possible: their turn-k move against our turn-(k - 1) segment (ours moves second)...
            if (k - 2 >= b.fireTime) pair(s, b.at(k - 2), from, r - v, r, possible);
            // ...and our turn-k move against their turn-(k - 1) ring (theirs moves second).
            // Each guard skips a previous segment from before that bullet was fired.
            if (k - 2 >= wave.fireTime) pair(s, from, b.at(k), r - 2 * v, r - v, possible);
        }
    }

    /**
     * Adds the bearings of segment {@code from}-{@code to} inside the ring [inner, outer]
     * around {@code s}, after two cheap rejections: the whole segment lies outside the
     * outer circle, or wholly inside the inner one.
     */
    private static void pair(Point2D.Double s, Point2D.Double from, Point2D.Double to,
                             double inner, double outer, List<double[]> out) {
        // The segment's nearest point is beyond the outer radius: it never reaches the ring.
        if (segmentDistance(s, from, to) > outer) return;
        // Distance from s is convex along a segment, so its largest value is at an end: if
        // both ends are inside the inner radius, so is every point between.
        if (inner > Math.max(s.distance(from), s.distance(to))) return;
        ring(s, from, to, inner, outer, out);
    }

    /**
     * Adds the bearings from {@code s} of the points of segment {@code a}-{@code b} whose
     * distance from {@code s} is in [inner, outer].
     *
     * <p>With the segment written {@code P(t) = a + t (b - a)} for t in [0, 1], the squared
     * distance {@code |P(t) - s|^2} is the quadratic {@code qa t^2 + qb t + qc}. It is at
     * most {@code outer^2} between the roots of {@code qa t^2 + qb t + qc - outer^2}, and
     * under {@code inner^2} strictly between the roots of the inner one, so the part in the
     * ring is at most two sub-segments: [lo, hi] less the inner interval. At most two
     * intervals are added.</p>
     *
     * @param s the centre, the wave's source
     * @param a the segment's start
     * @param b the segment's end
     * @param inner the ring's inner radius, in px (0 on the wave's first turn)
     * @param outer the ring's outer radius, in px
     * @param out receives {@code [low, high]} bearing intervals, in radians
     */
    static void ring(Point2D.Double s, Point2D.Double a, Point2D.Double b, double inner,
                     double outer, List<double[]> out) {
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        double fx = a.x - s.x;
        double fy = a.y - s.y;
        double qa = dx * dx + dy * dy;
        // A zero-length segment (a bullet that did not move) covers no bearings.
        if (qa == 0) return;
        double qb = 2 * (fx * dx + fy * dy);
        double qc = fx * fx + fy * fy;
        // Parameters in [0, 1] where the distance is at most outer, less those under inner.
        double[] within = roots(qa, qb, qc - outer * outer);
        if (within == null) return;
        double lo = Math.max(0, within[0]);
        double hi = Math.min(1, within[1]);
        if (lo > hi) return;
        double[] under = roots(qa, qb, qc - inner * inner);
        // No inner crossing inside [lo, hi]: the whole part is in the ring. Otherwise keep
        // what lies before the segment enters the inner circle and after it leaves.
        if (under == null || under[1] <= lo || under[0] >= hi) {
            add(s, a, dx, dy, lo, hi, out);
        } else {
            if (under[0] > lo) add(s, a, dx, dy, lo, under[0], out);
            if (under[1] < hi) add(s, a, dx, dy, under[1], hi, out);
        }
    }

    /**
     * The roots of {@code qa t^2 + qb t + qc}, in order, or null when there are none. Only
     * called with {@code qa > 0}, so the order is smaller root first.
     */
    private static double[] roots(double qa, double qb, double qc) {
        double disc = qb * qb - 4 * qa * qc;
        if (disc < 0) return null;
        double r = Math.sqrt(disc);
        return new double[] {(-qb - r) / (2 * qa), (-qb + r) / (2 * qa)};
    }

    /**
     * Adds the bearing interval of the sub-segment {@code [t0, t1]} of {@code a + t (dx, dy)}
     * as seen from {@code s}. Along a straight segment that does not pass through {@code s}
     * the bearing changes monotonically and by less than pi, so the bearings of the two
     * ends bound every point between.
     */
    private static void add(Point2D.Double s, Point2D.Double a, double dx, double dy,
                            double t0, double t1, List<double[]> out) {
        double b0 = DiaUtils.absoluteBearing(s, new Point2D.Double(a.x + t0 * dx, a.y + t0 * dy));
        double b1 = DiaUtils.absoluteBearing(s, new Point2D.Double(a.x + t1 * dx, a.y + t1 * dy));
        // Unwrap b1 to within pi of b0, so an interval across the +-pi seam stays narrow.
        b1 = DiaUtils.normalizeAngle(b1, b0);
        out.add(new double[] {Math.min(b0, b1), Math.max(b0, b1)});
    }

    /**
     * Merges overlapping intervals; angles are made continuous around the first one.
     *
     * <p>Each interval's low end is moved by whole turns to within pi of the first interval's
     * low end, keeping its width; the intervals are then sorted and swept once, joining any
     * that overlap or touch. This assumes all of a wave's shadows lie within half a turn of
     * each other.</p>
     *
     * @param raw the intervals; returned as is when empty
     * @return a new list of disjoint {@code [low, high]} intervals sorted by {@code low}
     */
    static List<double[]> merge(List<double[]> raw) {
        if (raw.isEmpty()) return raw;
        double ref = raw.get(0)[0];
        List<double[]> norm = new ArrayList<>();
        for (double[] r : raw) {
            double lo = DiaUtils.normalizeAngle(r[0], ref);
            norm.add(new double[] {lo, lo + (r[1] - r[0])});
        }
        norm.sort(Comparator.comparingDouble(r -> r[0]));
        List<double[]> merged = new ArrayList<>();
        double[] current = norm.get(0).clone();
        for (int i = 1; i < norm.size(); i++) {
            double[] r = norm.get(i);
            if (r[0] <= current[1]) {
                current[1] = Math.max(current[1], r[1]);
            } else {
                merged.add(current);
                current = r.clone();
            }
        }
        merged.add(current);
        return merged;
    }

    /** The shortest distance, in px, from {@code p} to segment {@code a}-{@code b}. */
    private static double segmentDistance(Point2D.Double p, Point2D.Double a, Point2D.Double b) {
        return java.awt.geom.Line2D.ptSegDist(a.x, a.y, b.x, b.y, p.x, p.y);
    }

    /** Whether {@code p} is on the field, edges included (a bullet, not a robot: no 18 px margin). */
    private static boolean inField(Point2D.Double p, double width, double height) {
        return p.x >= 0 && p.y >= 0 && p.x <= width && p.y <= height;
    }
}
