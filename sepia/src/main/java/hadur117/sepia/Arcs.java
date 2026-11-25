package hadur117.sepia;

import hadur117.core.physics.DiaUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Bearing arithmetic for hit sets and shadows. A hit set is the interval {@code [lo, hi]} of
 * bearings from a wave's source whose bullet would meet the body (INK-5's "share of the hit set");
 * a shadow is a list of {@code [low, high]} bearing intervals as {@code BulletShadows} returns them.
 * Every interval is first moved by whole turns to within pi of the hit set's middle, so the seam
 * at plus or minus pi never splits one. Pure functions; nothing here holds state.
 */
public final class Arcs {

    private Arcs() {}

    /**
     * The share of {@code [lo, hi]} shaded: a bearing in a certain shadow counts 1, one only in a
     * possible shadow a half (INK-5). {@code possible} includes the certain bearings, as
     * {@code BulletShadows.of} returns it, so the share is {@code (certain + possible) / 2} of the
     * width.
     *
     * @param lo the hit set's low bearing, radians
     * @param hi the hit set's high bearing, radians ({@code hi >= lo})
     * @param certain the certain shadows
     * @param possible every bearing that may be stopped, certain ones included
     * @return a share in [0, 1]; 0 for an empty hit set
     */
    public static double shade(double lo, double hi, List<double[]> certain, List<double[]> possible) {
        double width = hi - lo;
        if (!(width > 0)) return 0;
        return (covered(lo, hi, certain) + covered(lo, hi, possible)) / (2 * width);
    }

    /**
     * The width, in radians, of the part of {@code [lo, hi]} that the union of {@code arcs} covers.
     *
     * @param lo the interval's low end
     * @param hi the interval's high end
     * @param arcs the intervals, in any order, overlapping or not
     * @return the covered width, between 0 and {@code hi - lo}
     */
    public static double covered(double lo, double hi, List<double[]> arcs) {
        double total = 0;
        for (double[] a : merged(lo, hi, arcs)) total += a[1] - a[0];
        return total;
    }

    /**
     * The part of {@code [lo, hi]} that the union of {@code arcs} covers, as disjoint intervals in
     * increasing order, each inside {@code [lo, hi]}.
     *
     * @param lo the interval's low end
     * @param hi the interval's high end
     * @param arcs the intervals, in any order, overlapping or not
     * @return the covered intervals; empty when nothing is covered
     */
    public static List<double[]> merged(double lo, double hi, List<double[]> arcs) {
        List<double[]> out = new ArrayList<>();
        if (arcs.isEmpty() || !(hi > lo)) return out;
        double mid = (lo + hi) / 2;
        List<double[]> clipped = new ArrayList<>(arcs.size());
        for (double[] a : arcs) {
            double a0 = DiaUtils.normalizeAngle(a[0], mid);
            double a1 = a0 + (a[1] - a[0]);
            double c0 = Math.max(lo, a0), c1 = Math.min(hi, a1);
            if (c1 > c0) clipped.add(new double[] {c0, c1});
        }
        if (clipped.isEmpty()) return out;
        clipped.sort(Comparator.comparingDouble(a -> a[0]));
        double start = clipped.get(0)[0], end = clipped.get(0)[1];
        for (int i = 1; i < clipped.size(); i++) {
            double[] a = clipped.get(i);
            if (a[0] <= end) {
                end = Math.max(end, a[1]);
            } else {
                out.add(new double[] {start, end});
                start = a[0];
                end = a[1];
            }
        }
        out.add(new double[] {start, end});
        return out;
    }

    /**
     * Two lists joined, for the union of the shadows already in the air and one candidate's.
     *
     * @param a the first list
     * @param b the second list
     * @return a new list holding both lists' intervals
     */
    public static List<double[]> join(List<double[]> a, List<double[]> b) {
        List<double[]> out = new ArrayList<>(a.size() + b.size());
        out.addAll(a);
        out.addAll(b);
        return out;
    }
}
