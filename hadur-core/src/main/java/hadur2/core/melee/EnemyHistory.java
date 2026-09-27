package hadur2.core.melee;

import hadur2.core.knn.KdTree;
import hadur2.core.physics.BattleField;
import java.util.ArrayList;
import java.util.List;

/**
 * One opponent's movement for the {@link FieldGun}: the scans of this round, and a battle-long
 * kd-tree of situations (the melee attribute set) each paired with how the opponent moved
 * over the next {@link #HORIZON} ticks, relative to its heading then (MGUN-1).
 *
 * <p>A situation joins the tree once a scan {@link #HORIZON} ticks later has arrived, or at
 * the round's end with whatever followed it. Each trajectory is stored as the later scans'
 * (ticks, forward, sideways) offsets, so the gun plays it forward by interpolation. The tree
 * is the melee gun's own; the duel's trees never see melee data.</p>
 */
public final class EnemyHistory {

    /** Ticks of movement a situation records: a slow bullet's flight across 1000 px. */
    static final int HORIZON = 90;
    /** Situations kept per opponent (RES-2). */
    static final int TREE_LIMIT = 2000;
    /** Scans kept per round (RES-2). */
    static final int MAX_SCANS = 2500;
    static final int DIMENSIONS = 5;
    /** Attribute weights: distance, speed, turn rate, time since reversing, wall distance. */
    static final double[] WEIGHTS = {1.0, 1.5, 1.2, 0.8, 1.0};

    /** One scan of the opponent. */
    static final class Scan {
        final long time;
        final double x, y, heading, velocity;
        final double[] attributes;

        Scan(long time, double x, double y, double heading, double velocity, double[] attributes) {
            this.time = time;
            this.x = x;
            this.y = y;
            this.heading = heading;
            this.velocity = velocity;
            this.attributes = attributes;
        }

        /** The direction it is moving: its heading, turned round when driving backwards. */
        double motion() {
            return velocity < 0 ? heading + Math.PI : heading;
        }
    }

    private final KdTree<float[]> tree = new KdTree<>(DIMENSIONS, TREE_LIMIT);
    private final List<Scan> scans = new ArrayList<>();
    /** Index of the first scan whose situation is not yet in the tree. */
    private int pending;
    private long lastReverse = -1;
    private double lastSign;

    public EnemyHistory() {
        tree.setWeights(WEIGHTS);
    }

    /** Situations with a known future. */
    public int size() {
        return tree.size();
    }

    /**
     * Takes a scan at {@code time}; {@code distance} is to Hadur and {@code turnRate} the
     * opponent's heading change per tick (NaN while unknown).
     */
    public void onScan(long time, double x, double y, double heading, double velocity,
                       double distance, double turnRate, BattleField field) {
        double sign = Math.signum(velocity);
        if (sign != 0 && sign != lastSign) {
            if (lastSign != 0) lastReverse = time;
            lastSign = sign;
        }
        if (lastReverse < 0 && scans.isEmpty()) lastReverse = time;
        double[] a = attributes(distance, velocity, turnRate,
            lastReverse < 0 ? 0 : time - lastReverse, wallDistance(x, y, field));
        if (scans.size() >= MAX_SCANS) {
            scans.remove(0);
            pending = Math.max(0, pending - 1);
        }
        scans.add(new Scan(time, x, y, heading, velocity, a));
        while (pending < scans.size() - 1 && time - scans.get(pending).time >= HORIZON) {
            commit(pending++);
        }
    }

    /** The attributes of the latest scan, or null before any. */
    public double[] current() {
        return scans.isEmpty() ? null : scans.get(scans.size() - 1).attributes;
    }

    /** Commits every situation that has any future, and forgets the round's scans. */
    public void newRound() {
        for (; pending < scans.size() - 1; pending++) commit(pending);
        scans.clear();
        pending = 0;
        lastReverse = -1;
        lastSign = 0;
    }

    private void commit(int i) {
        Scan s = scans.get(i);
        double m = s.motion();
        double sin = Math.sin(m), cos = Math.cos(m);
        List<float[]> points = new ArrayList<>();
        for (int j = i + 1; j < scans.size(); j++) {
            Scan n = scans.get(j);
            long dt = n.time - s.time;
            if (dt > HORIZON) break;
            double dx = n.x - s.x, dy = n.y - s.y;
            // Forward along its motion, and sideways to the right of it.
            double forward = dx * sin + dy * cos;
            double side = dx * cos - dy * sin;
            points.add(new float[]{dt, (float) forward, (float) side});
        }
        if (points.isEmpty()) return;
        float[] t = new float[points.size() * 3];
        for (int k = 0; k < points.size(); k++) System.arraycopy(points.get(k), 0, t, 3 * k, 3);
        tree.addPoint(s.attributes, t);
    }

    /** The {@code k} situations most like {@code attributes}, nearest first. */
    public List<KdTree.Entry<float[]>> neighbours(double[] attributes, int k) {
        if (tree.size() == 0) return new ArrayList<>();
        return tree.nearestNeighbor(attributes, Math.min(k, tree.size()), true);
    }

    static double[] attributes(double distance, double velocity, double turnRate,
                               long sinceReverse, double wallDistance) {
        double turn = Double.isNaN(turnRate) ? 0 : Math.abs(turnRate);
        return new double[]{
            Math.min(distance, 1200) / 800.0,
            Math.abs(velocity) / 8.0,
            Math.min(turn, Math.toRadians(10)) / Math.toRadians(10),
            Math.min(sinceReverse, 100) / 100.0,
            Math.min(wallDistance, 400) / 400.0,
        };
    }

    static double wallDistance(double x, double y, BattleField field) {
        return Math.min(Math.min(x, field.width - x), Math.min(y, field.height - y));
    }

    /**
     * Offset (forward, sideways) {@code dt} ticks into trajectory {@code t}, interpolated
     * between its samples; past the last sample it holds the last offset.
     */
    static double[] offset(float[] t, double dt) {
        double pt = 0, pf = 0, ps = 0;
        for (int k = 0; k < t.length; k += 3) {
            double nt = t[k], nf = t[k + 1], ns = t[k + 2];
            if (dt <= nt) {
                double f = nt == pt ? 1 : (dt - pt) / (nt - pt);
                return new double[]{pf + f * (nf - pf), ps + f * (ns - ps)};
            }
            pt = nt;
            pf = nf;
            ps = ns;
        }
        return new double[]{pf, ps};
    }
}
