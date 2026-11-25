package hadur117.core.physics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * COPY-2: a copy of the enemy's gun, bred offline from truth logs by {@code data/tools/copy_breed.py}
 * (COPY-1) and named by a {@code copy:} line of the mode table. It is fed what the enemy sees of us
 * each scan and fires where that gun would: a segmented guess-factor histogram ({@code hist}), a
 * nearest-neighbour guess-factor gun ({@code knn}) or a pattern matcher on (velocity, turn) symbols
 * ({@code pm}). Each family reads the same features, waves and symbols as the breeder, so a genome
 * that reproduces a gun's bullets in the breeder reproduces them here.
 *
 * <p>Tick indices run over the whole battle; a round's start resets the orbit direction, the ticks
 * since it changed and the acceleration, as in the breeder. What the copy has learnt lasts the
 * battle. A wave's aim reads only what the copy had learnt by its aiming tick.</p>
 *
 * <p>Pure: no engine types, no clock, no randomness. Duel only, off unless the table names the
 * opponent.</p>
 */
public final class GunCopy {

    /** The breeder's six features, in its order. */
    static final int NFEAT = 6;

    private final String family;
    private final Map<String, String> genes;
    private final double width, height;

    // Per tick: features and geometry.
    private final List<double[]> ticks = new ArrayList<>();
    private int lastRound = Integer.MIN_VALUE;
    private double dir = 1, since = 0, lastV = 0;
    private double lastPower = 2.0;

    // Waves in flight and learnt, in break order.
    private final List<double[]> flying = new ArrayList<>();
    /** Learnt waves: {break tick, start tick, guess factor}. */
    private final List<double[]> broken = new ArrayList<>();

    // hist
    private int histLearnt;
    private double[][] hist;
    private int[] slices;
    private int bins;
    private double dmax, roll;
    private double[] kern;

    // pm
    private final StringBuilder symbols = new StringBuilder();
    private final List<Double> turns = new ArrayList<>();
    private double prevHeading = Double.NaN;

    private GunCopy(String family, Map<String, String> genes, double width, double height) {
        this.family = family;
        this.genes = genes;
        this.width = width;
        this.height = height;
        if (family.equals("hist")) {
            slices = new int[] {gi("s_lat"), 1, gi("s_dist"), gi("s_accel"), gi("s_since"), gi("s_wall")};
            int nseg = 1;
            for (int s : slices) nseg *= s;
            bins = gi("bins");
            hist = new double[nseg][bins];
            dmax = gd("d_max");
            roll = gd("roll");
            int sm = gi("smooth");
            kern = new double[6 * sm + 1];
            for (int i = 0; i < kern.length; i++) {
                double x = i - 3 * sm;
                kern[i] = sm > 0 ? Math.exp(-0.5 * (x / sm) * (x / sm)) : 1.0;
            }
        }
    }

    /**
     * A copy from a genome as the mode table writes it: the family, then {@code gene=value} pairs,
     * all joined by {@code ;} (a pattern matcher's rounding as {@code 2.0x2.0}).
     *
     * @param genome the genome, e.g. {@code hist;ticks=0;bins=31;...}
     * @param width the field's width, px
     * @param height the field's height, px
     * @return the copy, or null when the genome is malformed
     */
    public static GunCopy parse(String genome, double width, double height) {
        if (genome == null) return null;
        String[] parts = genome.trim().split(";");
        String family = parts[0];
        Map<String, String> genes = new HashMap<>();
        for (int i = 1; i < parts.length; i++) {
            int eq = parts[i].indexOf('=');
            if (eq <= 0) return null;
            genes.put(parts[i].substring(0, eq), parts[i].substring(eq + 1));
        }
        String[] need;
        switch (family) {
            case "hist":
                need = new String[] {"ticks", "bins", "s_lat", "s_dist", "d_max", "s_accel", "s_since", "s_wall", "roll", "smooth", "lag"};
                break;
            case "knn":
                need = new String[] {"w_lat", "w_adv", "w_dist", "w_accel", "w_since", "w_wall", "k", "width", "ticks", "cap", "lag"};
                break;
            case "pm":
                need = new String[] {"round", "longest", "least", "lag"};
                break;
            default:
                return null;
        }
        for (String n : need) if (!genes.containsKey(n)) return null;
        try {
            return new GunCopy(family, genes, width, height);
        } catch (RuntimeException e) {
            return null;
        }
    }

    /** The family: hist, knn or pm. */
    public String family() {
        return family;
    }

    /** The fire lag gene: the copy aims from this many ticks before the tick it is asked for. */
    public int lag() {
        return gi("lag");
    }

    private int gi(String k) {
        return (int) Math.round(Double.parseDouble(genes.get(k)));
    }

    private double gd(String k) {
        return Double.parseDouble(genes.get(k));
    }

    /** The number of ticks observed this battle; the index the next scan gets. */
    public int size() {
        return ticks.size();
    }

    /**
     * One scan: where we are and where the enemy is. Breaks the copy's waves that reach us now.
     *
     * @param round the round
     * @param mx our x
     * @param my our y
     * @param mh our heading, radians
     * @param mv our velocity
     * @param ex the enemy's x
     * @param ey the enemy's y
     * @param firedPower the power of a bullet the enemy is seen to fire on this scan, or 0
     */
    public void observe(int round, double mx, double my, double mh, double mv, double ex, double ey, double firedPower) {
        int i = ticks.size();
        boolean fresh = round != lastRound;
        if (fresh) {
            dir = 1;
            since = 0;
            prevHeading = Double.NaN;
            flying.clear();
            lastRound = round;
        }
        double dx = mx - ex, dy = my - ey;
        double dist = Math.hypot(dx, dy);
        double absb = Math.atan2(dx, dy);
        double rel = mh - absb;
        double lat = mv * Math.sin(rel), adv = mv * Math.cos(rel);
        if (lat > 0.1 && dir < 0) {
            dir = 1;
            since = 0;
        } else if (lat < -0.1 && dir > 0) {
            dir = -1;
            since = 0;
        } else {
            since += 1;
        }
        double accel = 0.5;
        if (!fresh) {
            double dv = Math.abs(mv) - Math.abs(lastV);
            accel = dv < -0.1 ? 0.0 : dv > 0.1 ? 1.0 : 0.5;
        }
        lastV = mv;
        double sgn = mv < 0 ? -1.0 : 1.0;
        double hx = Math.sin(mh) * sgn, hy = Math.cos(mh) * sgn;
        double big = 1e9;
        double rx = hx > 1e-9 ? (width - 18 - mx) / hx : hx < -1e-9 ? (18 - mx) / hx : big;
        double ry = hy > 1e-9 ? (height - 18 - my) / hy : hy < -1e-9 ? (18 - my) / hy : big;
        double room = Math.max(0, Math.min(400, Math.min(rx, ry))) / 400.0;
        if (firedPower > 0) lastPower = firedPower;
        double[] f = {
            Math.abs(lat) / 8.0, (adv + 8.0) / 16.0, Math.min(1.0, Math.max(0.0, dist / 900.0)), accel,
            Math.min(since, 60) / 60.0, room,
            mx, my, mh, mv, ex, ey, dist, absb, dir, lastPower, round
        };
        ticks.add(f);
        // pm symbols
        double turn = fresh || Double.isNaN(prevHeading) ? 0.0 : Angles.normalRelativeAngle(mh - prevHeading);
        prevHeading = mh;
        turns.add(turn);
        if (family.equals("pm")) {
            String[] r = genes.get("round").split("x");
            double rv = Double.parseDouble(r[0]), rt = Double.parseDouble(r[1]);
            int sv = clamp((int) Math.rint(mv / rv) + 64), st = clamp((int) Math.rint(Math.toDegrees(turn) / rt) + 64);
            symbols.append((char) (sv * 128 + st));
        }
        if (family.equals("pm")) return;
        // Waves: breaks first (a wave started this tick cannot break on it), then this tick's.
        for (int w = 0; w < flying.size(); w++) {
            double[] fw = flying.get(w);
            int t = (int) fw[0];
            double speed = 20 - 3 * fw[1];
            double[] o = ticks.get(t);
            if (speed * (i - t) >= Math.hypot(mx - o[10], my - o[11])) {
                double b = Math.atan2(mx - o[10], my - o[11]);
                double esc = Math.asin(Math.min(1.0, 8.0 / speed));
                double g = Angles.normalRelativeAngle(b - o[13]) * o[14] / esc;
                broken.add(new double[] {i, t, Math.max(-1, Math.min(1, g))});
                flying.remove(w--);
            }
        }
        if (gi("ticks") == 1) flying.add(new double[] {i, lastPower});
    }

    /**
     * A real shot left the enemy on the tick after {@code start}: the copy learns from its wave when
     * it breaks, if it learns from shots.
     *
     * @param start the index of the scan the shot was aimed on (the one before it is seen)
     * @param power its power
     */
    public void shot(int start, double power) {
        if (family.equals("pm") || gi("ticks") == 1 || start < 0 || start >= ticks.size()) return;
        // Kept in start order with the others; it breaks on a later scan.
        flying.add(new double[] {start, power});
    }

    private static int clamp(int s) {
        return Math.max(1, Math.min(127, s));
    }

    /**
     * Where the copy fires a bullet that leaves on the scan after {@code index}, aimed from
     * {@code index - lag}, absolute radians from the enemy; NaN before any history.
     *
     * @param index the index of the scan before the shot
     * @param power the shot's power
     * @return the bearing
     */
    public double aim(int index, double power) {
        int ta = index - lag();
        if (ta < 0 || ta >= ticks.size()) return Double.NaN;
        double[] q = ticks.get(ta);
        double esc = Math.asin(Math.min(1.0, 8.0 / (20 - 3 * power)));
        switch (family) {
            case "hist": return q[13] + histGf(ta) * q[14] * esc;
            case "knn": return q[13] + knnGf(ta) * q[14] * esc;
            default: return pmAim(ta, power);
        }
    }

    private int seg(int t) {
        double[] f = ticks.get(t);
        int idx = 0, mult = 1;
        for (int j = 0; j < NFEAT; j++) {
            int s = slices[j];
            if (s > 1) {
                double col = j == 2 ? Math.max(0, Math.min(0.999, f[12] / dmax)) : f[j];
                idx += Math.min((int) (col * s), s - 1) * mult;
            }
            mult *= s;
        }
        return idx;
    }

    /** hist: learns every wave broken by {@code ta}, in break order, then reads ta's segment. */
    private double histGf(int ta) {
        int half = kern.length / 2;
        while (histLearnt < broken.size() && broken.get(histLearnt)[0] <= ta) {
            double[] w = broken.get(histLearnt++);
            double[] row = hist[seg((int) w[1])];
            if (roll > 0) for (int b = 0; b < bins; b++) row[b] *= 1 - roll;
            int c = (int) Math.rint((w[2] + 1) / 2 * (bins - 1));
            c = Math.max(0, Math.min(bins - 1, c));
            for (int b = Math.max(0, c - half); b < Math.min(bins, c + half + 1); b++) row[b] += kern[b - c + half];
        }
        double[] row = hist[seg(ta)];
        int best = 0;
        for (int b = 1; b < bins; b++) if (row[b] > row[best]) best = b;
        if (row[best] <= 0) return 0;
        return best * 2.0 / (bins - 1) - 1;
    }

    /** knn: the densest guess factor among the nearest of the waves broken by {@code ta}. */
    private double knnGf(int ta) {
        int j = 0;
        while (j < broken.size() && broken.get(j)[0] <= ta) j++;
        if (j == 0) return 0;
        double[] w = {gd("w_lat"), gd("w_adv"), gd("w_dist"), gd("w_accel"), gd("w_since"), gd("w_wall")};
        int lo = Math.max(0, j - gi("cap"));
        int n = j - lo;
        double[] q = ticks.get(ta);
        double[] d = new double[n];
        for (int p = 0; p < n; p++) {
            double[] f = ticks.get((int) broken.get(lo + p)[1]);
            double s = 0;
            for (int c = 0; c < NFEAT; c++) {
                double x = (f[c] - q[c]) * w[c];
                s += x * x;
            }
            d[p] = s;
        }
        int k = Math.min(gi("k"), n);
        double cut;
        if (k < n) {
            double[] sorted = d.clone();
            Arrays.sort(sorted);
            cut = sorted[k - 1];
        } else {
            cut = Double.POSITIVE_INFINITY;
        }
        double width = gd("width");
        double[] dens = new double[81];
        int taken = 0;
        for (int p = 0; p < n && taken < k; p++) {
            if (d[p] > cut) continue;
            taken++;
            double g = broken.get(lo + p)[2];
            for (int b = 0; b < 81; b++) {
                double z = (-1 + b / 40.0 - g) / width;
                dens[b] += Math.exp(-0.5 * z * z);
            }
        }
        int best = 0;
        for (int b = 1; b < 81; b++) if (dens[b] > dens[best]) best = b;
        return -1 + best / 40.0;
    }

    /** pm: the latest earlier match of the symbols up to {@code ta}, replayed over a bullet's flight. */
    private double pmAim(int ta, double power) {
        double[] q = ticks.get(ta);
        int longest = gi("longest"), least = gi("least");
        int found = -1;
        int n = longest;
        while (n >= least) {
            int start = ta - n + 1;
            if (start < 0) {
                n -= 1;
                continue;
            }
            String key = symbols.substring(start, ta + 1);
            int at = symbols.lastIndexOf(key, ta - n);
            if (at >= 0) {
                found = at + n - 1;
                break;
            }
            n = n > 8 ? n / 2 : n - 1;
        }
        double ox = q[10], oy = q[11];
        if (found < 0) return q[13];
        double speed = 20 - 3 * power;
        double x = q[6], y = q[7], h = q[8];
        int j = found + 1;
        int steps = 0;
        while (j < ta && steps < 120) {
            h += turns.get(j);
            double v = ticks.get(j)[9];
            x = Math.min(Math.max(x + v * Math.sin(h), 18), width - 18);
            y = Math.min(Math.max(y + v * Math.cos(h), 18), height - 18);
            steps++;
            if (speed * (steps + 1) >= Math.hypot(x - ox, y - oy)) break;
            j++;
            if (j < ticks.size() && ticks.get(j)[16] != ticks.get(j - 1)[16]) break;
        }
        return Math.atan2(x - ox, y - oy);
    }
}
