package hadur117.core.melee;

import hadur117.core.model.RobotState;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import hadur117.core.world.EnemyShot;
import java.awt.geom.Point2D;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * T6, learned team danger (MMOVE-9, MMOVE-10): what the team has learnt of each enemy's gun.
 *
 * <p>Each enemy bullet that hits a member becomes a {@link Sample}: the member's situation
 * when the bullet left the gun, as the shooter saw it, and the guess factor the bullet took
 * (0 head-on, +1 the furthest the member could have got the way it was going). The member
 * keeps the sample and sends it to its teammates over the link, so each member's log of an
 * enemy's gun holds the hits on all five. A shot that member detects is then dodged where
 * the nearest samples say the enemy aims, in place of MMOVE-3's head-on and linear guesses,
 * once the log holds {@link #MIN_SAMPLES}.</p>
 *
 * <p>Two switches, both off in the shipped build: {@link #NEAREST} (MMOVE-9, a shot is aimed
 * at the member nearest the shooter, so the others leave it alone) and {@link #LEARNED}
 * (MMOVE-10, the learned aims). Either acts only while Hadur has a living teammate: off a
 * team, or as the last member alive, nothing here is reached.</p>
 */
public final class TeamDanger {

    /** MMOVE-9 switch: a shot is taken as aimed at the member nearest the shooter. */
    public static final boolean NEAREST = false;
    /** MMOVE-10 switch: detected shots are dodged at the team's learned aims. */
    public static final boolean LEARNED = false;

    /** Samples a log needs before its aims replace head-on and linear. */
    static final int MIN_SAMPLES = 5;
    /** Neighbours a shot's aims are taken from. */
    static final int K = 12;
    /** Samples kept per enemy, oldest dropped first. */
    static final int MAX_SAMPLES = 1000;
    /** Number of features in a situation. */
    public static final int FEATURES = 4;
    /** A guess factor is kept within this, so a stray match cannot throw a bullet off the field. */
    static final double MAX_GF = 1.2;
    /** The total weight a shot's learned bullets carry: the two MMOVE-3 guesses carried 1 each. */
    static final double SHOT_WEIGHT = 2.0;
    /**
     * MMOVE-9: a teammate takes the shot only when nearer the shooter than this share of
     * Hadur's distance, so a near tie still counts as aimed at Hadur.
     */
    static final double NEAREST_MARGIN = 0.9;

    /** One enemy bullet that hit a member: the situation it was fired in and where it went. */
    public static final class Sample {
        public final String shooter;
        public final double[] features;
        public final double gf;
        /** TMODE-27: how far off each aim expert was, in bot widths ({@link AimExperts}); empty when not scored. */
        public final double[] experts;

        public Sample(String shooter, double[] features, double gf) {
            this(shooter, features, gf, new double[0]);
        }

        public Sample(String shooter, double[] features, double gf, double[] experts) {
            if (features.length != FEATURES) throw new IllegalArgumentException(features.length + " features");
            this.shooter = shooter;
            this.features = features.clone();
            this.gf = gf;
            this.experts = experts.clone();
        }

        /** This sample with the experts' errors attached (TMODE-27). */
        public Sample withExperts(double[] errors) {
            return new Sample(shooter, features, gf, errors);
        }
    }

    /** One learned aim at a shot: the heading and its share of the shot's weight. */
    public static final class Aim {
        public final double heading;
        public final double weight;

        Aim(double heading, double weight) {
            this.heading = heading;
            this.weight = weight;
        }
    }

    private final BattleField field;
    private final Map<String, Deque<Sample>> logs = new HashMap<>();
    /** TMODE-7: the same samples kept per enemy class, always, so switching POOL loses none. */
    private final Map<String, Deque<Sample>> classLogs = new HashMap<>();
    /** TMODE-7: whether the class logs are read rather than the per-robot ones. */
    private boolean pooled;
    /** Hadur's own samples since the last report took them. */
    private final List<Sample> outgoing = new ArrayList<>();

    public TeamDanger(BattleField field) {
        this.field = field;
    }

    /**
     * TMODE-7: read one log per enemy class ({@link TeamModes#key}), fed by every copy of it,
     * in place of one per robot. Both are always kept, so the switch can flip at any tick.
     */
    public void pool(boolean on) {
        pooled = on;
    }

    private Deque<Sample> log(String shooter) {
        return pooled ? classLogs.get(TeamModes.key(shooter)) : logs.get(shooter);
    }

    /** The samples logged for {@code shooter}. */
    public int size(String shooter) {
        Deque<Sample> log = log(shooter);
        return log == null ? 0 : log.size();
    }

    /** Adds a sample, Hadur's own or a teammate's, to its shooter's log and its class's. */
    public void add(Sample s) {
        append(logs.computeIfAbsent(s.shooter, k -> new ArrayDeque<>()), s);
        append(classLogs.computeIfAbsent(TeamModes.key(s.shooter), k -> new ArrayDeque<>()), s);
    }

    private static void append(Deque<Sample> log, Sample s) {
        if (log.size() >= MAX_SAMPLES) log.removeFirst();
        log.addLast(s);
    }

    /** Hadur's own sample: logged here and kept for the next report. */
    public void own(Sample s) {
        add(s);
        outgoing.add(s);
    }

    /** The samples Hadur has learnt since the last call, for its report; the list is emptied. */
    public List<Sample> takeOutgoing() {
        if (outgoing.isEmpty()) return List.of();
        List<Sample> out = new ArrayList<>(outgoing);
        outgoing.clear();
        return out;
    }

    /**
     * The sample a bullet of {@code shot} that hit Hadur makes: Hadur's state at the shot's
     * fire tick ({@code target}) and the bullet's {@code heading}.
     */
    public Sample sample(EnemyShot shot, RobotState target, double heading) {
        double[] f = features(shot, target);
        double hot = DiaUtils.absoluteBearing(shot.source, target.location);
        double gf = Angles.normalRelativeAngle(heading - hot) / maxEscape(shot) * direction(shot, target);
        return new Sample(shot.shooter, f, Math.max(-MAX_GF, Math.min(MAX_GF, gf)));
    }

    /**
     * The aims at Hadur, in state {@code target} when {@code shot} was fired, that the
     * {@link #K} nearest samples of its shooter's log give, weighted by nearness; null while
     * the log holds fewer than {@link #MIN_SAMPLES}.
     */
    public List<Aim> aims(EnemyShot shot, RobotState target) {
        Deque<Sample> log = log(shot.shooter);
        if (log == null || log.size() < MIN_SAMPLES) return null;
        double[] f = features(shot, target);
        List<double[]> scored = new ArrayList<>(log.size());
        for (Sample s : log) {
            double d = 0;
            for (int i = 0; i < FEATURES; i++) {
                double x = s.features[i] - f[i];
                d += x * x;
            }
            scored.add(new double[] {d, s.gf});
        }
        Collections.sort(scored, (a, b) -> Double.compare(a[0], b[0]));
        int k = Math.min(K, scored.size());
        double hot = DiaUtils.absoluteBearing(shot.source, target.location);
        double mea = maxEscape(shot);
        double dir = direction(shot, target);
        // A Gaussian kernel on the distance, its width the k-th neighbour's distance.
        double width = Math.max(1e-3, scored.get(k - 1)[0]);
        double[] w = new double[k];
        double total = 0;
        for (int i = 0; i < k; i++) {
            w[i] = Math.exp(-scored.get(i)[0] / width);
            total += w[i];
        }
        List<Aim> out = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            double heading = hot + scored.get(i)[1] * mea * dir;
            out.add(new Aim(heading, SHOT_WEIGHT * w[i] / total));
        }
        return out;
    }

    /**
     * MMOVE-9: whether {@code shot} was aimed at Hadur, standing at {@code me} when it was
     * fired, rather than at the teammate nearest its source: a teammate takes it only when
     * {@link #NEAREST_MARGIN} times nearer.
     */
    public static boolean aimedAtMe(EnemyShot shot, Point2D.Double me, List<Point2D.Double> mates) {
        double mine = shot.source.distance(me);
        for (Point2D.Double m : mates) {
            if (shot.source.distance(m) < NEAREST_MARGIN * mine) return false;
        }
        return true;
    }

    /**
     * The situation: distance, the speed across and towards the shooter, and how much of the
     * escape angle ahead is clear of the walls.
     */
    double[] features(EnemyShot shot, RobotState t) {
        double bearing = DiaUtils.absoluteBearing(shot.source, t.location);
        double lateral = t.velocity * Math.sin(t.heading - bearing);
        double advancing = -t.velocity * Math.cos(t.heading - bearing);
        double distance = shot.source.distance(t.location);
        return new double[] {
            distance / 800.0,
            Math.abs(lateral) / 8.0,
            advancing / 16.0,
            wallAhead(shot, t, bearing, distance)
        };
    }

    /** The share of the escape angle ahead, along the circle round the shooter, inside the field. */
    double wallAhead(EnemyShot shot, RobotState t, double bearing, double distance) {
        double mea = maxEscape(shot);
        double dir = direction(shot, t);
        int steps = 10;
        for (int i = 1; i <= steps; i++) {
            Point2D.Double p = DiaUtils.project(shot.source, bearing + dir * mea * i / steps, distance);
            if (p.x < 18 || p.y < 18 || p.x > field.width - 18 || p.y > field.height - 18) {
                return (i - 1) / (double) steps;
            }
        }
        return 1.0;
    }

    static double maxEscape(EnemyShot shot) {
        return Math.asin(8.0 / shot.speed());
    }

    /** +1 when the target moved clockwise round the shooter, -1 counter-clockwise; +1 when still. */
    static double direction(EnemyShot shot, RobotState t) {
        double bearing = DiaUtils.absoluteBearing(shot.source, t.location);
        double lateral = t.velocity * Math.sin(t.heading - bearing);
        return lateral < 0 ? -1 : 1;
    }
}
