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
 */
public final class BulletShadows {

    /** Turns followed at most per bullet: longer than any bullet takes to cross the field. */
    static final int MAX_TURNS = 120;

    private BulletShadows() {}

    /**
     * The shadows {@code bullets} cast on {@code wave}: element 0 the certain ones, element 1
     * every angle that may meet one of ours (the certain ones included), each merged into
     * disjoint {@code [low, high]} bearing intervals sorted by {@code low}.
     */
    public static List<List<double[]>> of(Wave wave, List<OurBullet> bullets, double fieldWidth,
                                          double fieldHeight) {
        List<double[]> certain = new ArrayList<>();
        List<double[]> possible = new ArrayList<>();
        for (OurBullet b : bullets) {
            cast(wave, b, fieldWidth, fieldHeight, certain, possible);
        }
        List<double[]> all = new ArrayList<>(certain);
        all.addAll(possible);
        return List.of(merge(certain), merge(all));
    }

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
        long first = Math.max(b.fireTime + 1, wave.fireTime + 1);
        for (long k = first; k < first + MAX_TURNS; k++) {
            Point2D.Double from = b.at(k - 1);
            if (!inField(from, fieldWidth, fieldHeight)) return;
            double r = wave.distanceTraveled(k);
            double v = wave.bulletSpeed();
            pair(s, from, b.at(k), r - v, r, certain);
            if (k - 2 >= b.fireTime) pair(s, b.at(k - 2), from, r - v, r, possible);
            if (k - 2 >= wave.fireTime) pair(s, from, b.at(k), r - 2 * v, r - v, possible);
        }
    }

    private static void pair(Point2D.Double s, Point2D.Double from, Point2D.Double to,
                             double inner, double outer, List<double[]> out) {
        if (segmentDistance(s, from, to) > outer) return;
        if (inner > Math.max(s.distance(from), s.distance(to))) return;
        ring(s, from, to, inner, outer, out);
    }

    /**
     * Adds the bearings from {@code s} of the points of segment {@code a}-{@code b} whose
     * distance from {@code s} is in [inner, outer].
     */
    static void ring(Point2D.Double s, Point2D.Double a, Point2D.Double b, double inner,
                     double outer, List<double[]> out) {
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        double fx = a.x - s.x;
        double fy = a.y - s.y;
        double qa = dx * dx + dy * dy;
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
        if (under == null || under[1] <= lo || under[0] >= hi) {
            add(s, a, dx, dy, lo, hi, out);
        } else {
            if (under[0] > lo) add(s, a, dx, dy, lo, under[0], out);
            if (under[1] < hi) add(s, a, dx, dy, under[1], hi, out);
        }
    }

    /** The roots of {@code qa t^2 + qb t + qc}, in order, or null when there are none. */
    private static double[] roots(double qa, double qb, double qc) {
        double disc = qb * qb - 4 * qa * qc;
        if (disc < 0) return null;
        double r = Math.sqrt(disc);
        return new double[] {(-qb - r) / (2 * qa), (-qb + r) / (2 * qa)};
    }

    private static void add(Point2D.Double s, Point2D.Double a, double dx, double dy,
                            double t0, double t1, List<double[]> out) {
        double b0 = DiaUtils.absoluteBearing(s, new Point2D.Double(a.x + t0 * dx, a.y + t0 * dy));
        double b1 = DiaUtils.absoluteBearing(s, new Point2D.Double(a.x + t1 * dx, a.y + t1 * dy));
        b1 = DiaUtils.normalizeAngle(b1, b0);
        out.add(new double[] {Math.min(b0, b1), Math.max(b0, b1)});
    }

    /** Merges overlapping intervals; angles are made continuous around the first one. */
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

    private static double segmentDistance(Point2D.Double p, Point2D.Double a, Point2D.Double b) {
        return java.awt.geom.Line2D.ptSegDist(a.x, a.y, b.x, b.y, p.x, p.y);
    }

    private static boolean inField(Point2D.Double p, double width, double height) {
        return p.x >= 0 && p.y >= 0 && p.x <= width && p.y <= height;
    }
}
