package hadur117.sepia;

import hadur117.core.model.RobotState;
import hadur117.core.model.Wave;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import hadur117.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Sepia's movement: one fixed landing per enemy shot, chosen for how little of it the enemy's aim
 * and our ink leave exposed.
 *
 * <p>When a shot is read, the gait plays each option forward with the kernel's
 * {@link MovementPredictor}, walls included, from where the path already committed to earlier waves
 * ends, until the new wave has passed the body (JET-1, SURF-2). Each option ends in a hit set: the
 * bearings from the wave's source that would meet the body there. The caller rates each by
 * exposure (JET-2, SURF-4) and the gait fixes the least exposed (JET-3). The path then holds that
 * option until the wave has passed, so the landing is known while the wave is in flight and the ink
 * can be laid across it.</p>
 *
 * <p>Two gaits share the rules. The jet cycle has three options: carry on, turn back, or brake and
 * hold. The ink surf adds both directions at half speed, and lets go of a fixed landing when a
 * bullet learnt of later leaves another under half as exposed (SURF-3). Both orbit the wave's
 * source with the kernel's wall smoothing, hold 450 px or more, and never close range (JET-5);
 * a committed path that would strike a wall or come near the enemy is chosen again (JET-6).</p>
 */
public final class Gait {

    /** Which gait: the jet cycle, or the ink surf. */
    public enum Kind {
        /** Carry on, turn back or hold: one of three landings per shot. */
        JET,
        /** The jet cycle's options plus half speed both ways, with SURF-3's let-go. */
        SURF,
        /** SURF-5: the ink surf's options, each new landing chosen jointly with the one still in flight. */
        JOINT
    }

    /** One choice for a wave's stretch of path: which way round the source, and how fast. */
    public static final class Option {
        /** The option's name, for records. */
        public final String name;
        /** +1 to carry on the way the path is going, -1 to turn back. */
        public final int turn;
        /** The speed cap, px a tick: 8 full, 4 half, 0 hold. */
        public final double speed;

        Option(String name, int turn, double speed) {
            this.name = name;
            this.turn = turn;
            this.speed = speed;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    /** Carry on at full speed. */
    public static final Option CARRY = new Option("carry", 1, 8.0);
    /** Turn back at full speed. */
    public static final Option BACK = new Option("back", -1, 8.0);
    /** Brake and hold. */
    public static final Option HOLD = new Option("hold", 1, 0.0);
    /** Carry on at half speed (ink surf only). */
    public static final Option HALF = new Option("half", 1, 4.0);
    /** Turn back at half speed (ink surf only). */
    public static final Option HALF_BACK = new Option("halfback", -1, 4.0);

    /** JET-1: the jet cycle's three options, in the order ties go. */
    public static final List<Option> JET_OPTIONS = List.of(CARRY, BACK, HOLD);
    /** The ink surf's five options. */
    public static final List<Option> SURF_OPTIONS = List.of(CARRY, BACK, HALF, HALF_BACK, HOLD);

    /** JET-5: below this range the path turns away from the source. */
    public static final double MIN_RANGE = 450;
    /** The kernel's wall-smoothing stick, px. */
    static final double WALL_STICK = Wave.PRECISE_MEA_WALL_STICK;
    /** The most a path turns away from the source to regain range, radians. */
    static final double MAX_RETREAT = 0.6;
    /** JET-6: ticks of committed path checked for a wall or the enemy. */
    public static final int LOOKAHEAD = 12;
    /** JET-6: a committed path that comes this close to the enemy is chosen again, px. */
    public static final double ENEMY_CLEARANCE = 100;
    /** SURF-3: a fixed landing is let go for one under this share of its exposure. */
    public static final double LET_GO = 0.5;
    /** SURF-5: how many of the wave in flight's least exposed options are tried with the new wave's. */
    static final int JOINT_PRIORS = 3;
    /** The longest a forecast runs, ticks. */
    static final int HORIZON = 150;

    /** How the caller rates a landing: its exposure, the lower the better. */
    public interface Rater {
        /**
         * The exposure of {@code wave} if it finds the body as {@code forecast} says.
         *
         * @param wave the wave
         * @param forecast the path and the landing on it
         * @return the exposure, 0 or more
         */
        double exposure(InkWave wave, Forecast forecast);
    }

    /** A stretch of committed path: an option, round a centre, until a tick. */
    static final class Segment {
        final InkWave owner;
        final Option option;
        final int orientation;
        final Point2D.Double center;
        final long until;

        Segment(InkWave owner, Option option, int orientation, Point2D.Double center, long until) {
            this.owner = owner;
            this.option = option;
            this.orientation = orientation;
            this.center = center;
            this.until = until;
        }
    }

    /** One option played forward: the states tick by tick and the landing it gives a wave. */
    public static final class Forecast {
        /** The states from now, one a tick; element 0 is now. */
        public final List<RobotState> states;
        /** The hit set's low and high bearings, radians. */
        public final double lo, hi;
        /** The distance from the wave's source to the landing, px. */
        public final double distance;
        /** The first and last ticks the wave can meet the body. */
        public final long arrival, passed;
        /** The nearest the path came to the enemy's last known place, px. */
        public final double nearestEnemy;
        /** Whether the path struck a wall. */
        public final boolean wallHit;
        /** The orientation the path ends on, +1 or -1. */
        final int orientation;
        /** The option played after the committed path. */
        public final Option option;

        Forecast(List<RobotState> states, double lo, double hi, double distance, long arrival, long passed,
                 double nearestEnemy, boolean wallHit, int orientation, Option option) {
            this.states = states;
            this.lo = lo;
            this.hi = hi;
            this.distance = distance;
            this.arrival = arrival;
            this.passed = passed;
            this.nearestEnemy = nearestEnemy;
            this.wallHit = wallHit;
            this.orientation = orientation;
            this.option = option;
        }

        /**
         * The forecast state at {@code time}, or the last one when the forecast ends sooner.
         *
         * @param time the tick
         * @return the state
         */
        public RobotState at(long time) {
            int i = (int) Math.max(0, Math.min(states.size() - 1, time - states.get(0).time));
            return states.get(i);
        }
    }

    private final Kind kind;
    private final BattleField field;
    private final MovementPredictor predictor;
    private final List<Segment> plan = new ArrayList<>();
    /** The way round the enemy Sepia drives when no stretch is committed: +1 or -1. */
    private int cruise = 1;
    /** The tick of the last JET-6 recommit, so a stuck path is not rechosen every tick. */
    private long lastRescue = -1_000_000;

    /**
     * A gait on a field of the given size.
     *
     * @param kind the jet cycle or the ink surf
     * @param fieldWidth the field's width, px
     * @param fieldHeight the field's height, px
     */
    public Gait(Kind kind, double fieldWidth, double fieldHeight) {
        this.kind = kind;
        this.field = new BattleField(fieldWidth, fieldHeight);
        this.predictor = new MovementPredictor(field);
    }

    /** The options this gait chooses among. */
    public List<Option> options() {
        return kind == Kind.JET ? JET_OPTIONS : SURF_OPTIONS;
    }

    /** Which gait this is. */
    public Kind kind() {
        return kind;
    }

    /** Forgets the committed path at a round's start. */
    public void newRound() {
        plan.clear();
        lastRescue = -1_000_000;
    }

    /** The waves with a committed stretch, oldest first. */
    List<InkWave> committedWaves() {
        List<InkWave> out = new ArrayList<>();
        for (Segment s : plan) out.add(s.owner);
        return out;
    }

    /**
     * JET-1, SURF-2: a shot has been read. Under the ink surf, an earlier landing is first let go
     * if this new knowledge leaves another of its options under half as exposed (SURF-3); then the
     * new wave's landing is fixed at the least exposed option from where the committed path ends.
     *
     * @param wave the new wave
     * @param now Sepia's state this tick
     * @param enemy the enemy's last known place
     * @param rater rates a landing
     */
    public void shotRead(InkWave wave, RobotState now, Point2D.Double enemy, Rater rater) {
        prune(now.time);
        if (kind != Kind.JET) letGo(now, enemy, rater);
        if (kind == Kind.JOINT) commitJointly(wave, now, enemy, rater);
        else commit(wave, now, enemy, rater);
    }

    /**
     * SURF-5: the new wave's landing is chosen together with that of the latest wave still in
     * flight, as the pair of options with the least summed exposure. Behind a wave in flight the
     * new wave's own stretch is only the end of its flight, so its landing is mostly set by the
     * option before it; choosing both together gives it the whole flight's reach.
     */
    void commitJointly(InkWave wave, RobotState now, Point2D.Double enemy, Rater rater) {
        int last = -1;
        for (int i = 0; i < plan.size(); i++) {
            InkWave w = plan.get(i).owner;
            if (w.arrival > now.time && !w.met && !w.hit) last = i;
        }
        if (last < 0) {
            commit(wave, now, enemy, rater);
            return;
        }
        InkWave prior = plan.get(last).owner;
        List<Segment> before = new ArrayList<>(plan.subList(0, last));
        // Stretches after it belong to waves already met or hit: kept as they are, in scoring and in the plan.
        List<Segment> later = new ArrayList<>(plan.subList(last + 1, plan.size()));
        List<Option> opts = options();
        Forecast[] fas = new Forecast[opts.size()];
        double[] eas = new double[opts.size()];
        Integer[] order = new Integer[opts.size()];
        for (int i = 0; i < opts.size(); i++) {
            fas[i] = forecast(now, before, opts.get(i), prior, enemy);
            eas[i] = rater.exposure(prior, fas[i]);
            order[i] = i;
        }
        java.util.Arrays.sort(order, (x, y) -> Double.compare(eas[x], eas[y]));
        Option bestPrior = null, bestNew = null;
        double best = Double.POSITIVE_INFINITY;
        for (int k = 0; k < Math.min(JOINT_PRIORS, order.length); k++) {
            Option a = opts.get(order[k]);
            Forecast fa = fas[order[k]];
            double ea = eas[order[k]];
            if (ea >= best) break;
            List<Segment> trial = new ArrayList<>(before);
            trial.add(new Segment(prior, a, fa.orientation, prior.wave.sourceLocation, fa.passed));
            trial.addAll(later);
            for (Option b : options()) {
                double e = ea + rater.exposure(wave, forecast(now, trial, b, wave, enemy));
                if (e < best - 1e-12) {
                    best = e;
                    bestPrior = a;
                    bestNew = b;
                }
            }
        }
        plan.subList(last, plan.size()).clear();
        fix(prior, bestPrior, now, enemy, rater);
        plan.addAll(later);
        fix(wave, bestNew, now, enemy, rater);
    }

    /**
     * SURF-3: for each wave whose landing is fixed and not yet reached, the least exposed of its
     * other options; if that is under {@link #LET_GO} of the fixed one's exposure, the landing is
     * fixed again from this tick and every later wave's landing is chosen afresh behind it.
     */
    void letGo(RobotState now, Point2D.Double enemy, Rater rater) {
        for (int i = 0; i < plan.size(); i++) {
            Segment seg = plan.get(i);
            if (seg.owner.arrival <= now.time || seg.owner.met || seg.owner.hit) continue;
            List<Segment> before = new ArrayList<>(plan.subList(0, i));
            double current = rater.exposure(seg.owner, forecast(now, before, seg.option, seg.owner, enemy));
            Option bestAlt = null;
            double bestExposure = Double.POSITIVE_INFINITY;
            for (Option o : options()) {
                if (o == seg.option) continue;
                double e = rater.exposure(seg.owner, forecast(now, before, o, seg.owner, enemy));
                if (e < bestExposure) {
                    bestExposure = e;
                    bestAlt = o;
                }
            }
            if (bestAlt != null && bestExposure < LET_GO * current) {
                List<InkWave> later = new ArrayList<>();
                for (Segment s : plan.subList(i + 1, plan.size())) later.add(s.owner);
                plan.subList(i, plan.size()).clear();
                fix(seg.owner, bestAlt, now, enemy, rater);
                for (InkWave w : later) commit(w, now, enemy, rater);
                return;
            }
        }
    }

    /** Fixes {@code wave}'s landing at its least exposed option, after the committed path. */
    void commit(InkWave wave, RobotState now, Point2D.Double enemy, Rater rater) {
        Option best = null;
        double bestExposure = Double.POSITIVE_INFINITY;
        for (Option o : options()) {
            double e = rater.exposure(wave, forecast(now, plan, o, wave, enemy));
            if (e < bestExposure - 1e-12) {
                bestExposure = e;
                best = o;
            }
        }
        fix(wave, best, now, enemy, rater);
    }

    /** Appends {@code option}'s stretch for {@code wave} and stores the landing on the wave. */
    private void fix(InkWave wave, Option option, RobotState now, Point2D.Double enemy, Rater rater) {
        Forecast f = forecast(now, plan, option, wave, enemy);
        wave.commit(f.lo, f.hi, f.distance, f.arrival, f.passed, option);
        plan.add(new Segment(wave, option, f.orientation, wave.wave.sourceLocation, f.passed));
    }

    /**
     * JET-6: if the committed path would strike a wall or come within {@link #ENEMY_CLEARANCE} of
     * the enemy in the next {@link #LOOKAHEAD} ticks, every landing not yet reached is chosen afresh
     * from this tick. At most once every {@link #LOOKAHEAD} / 2 ticks.
     *
     * @param now Sepia's state this tick
     * @param enemy the enemy's last known place
     * @param rater rates a landing
     * @return true when the path was chosen again
     */
    public boolean rescue(RobotState now, Point2D.Double enemy, Rater rater) {
        prune(now.time);
        if (plan.isEmpty() || now.time - lastRescue < LOOKAHEAD / 2) return false;
        RobotState s = now;
        boolean trouble = false;
        for (int k = 0; k < LOOKAHEAD && !trouble; k++) {
            Segment seg = segmentAt(plan, s.time);
            if (seg == null) break;
            RobotState next = step(s, seg.center, seg.orientation, seg.option.speed);
            trouble = struckWall(s, next, seg.option.speed) || next.location.distance(enemy) < ENEMY_CLEARANCE;
            s = next;
        }
        if (!trouble) return false;
        lastRescue = now.time;
        List<InkWave> open = new ArrayList<>();
        for (Segment seg : plan) {
            if (seg.owner.arrival > now.time && !seg.owner.met && !seg.owner.hit) open.add(seg.owner);
        }
        if (open.isEmpty()) return false;
        plan.removeIf(seg -> open.contains(seg.owner));
        for (InkWave w : open) commit(w, now, enemy, rater);
        return true;
    }

    /**
     * Plays the committed segments, then {@code option} round {@code wave}'s source, from
     * {@code now} until the wave has passed the body.
     */
    Forecast forecast(RobotState now, List<Segment> committed, Option option, InkWave wave, Point2D.Double enemy) {
        int lastOrientation = committed.isEmpty() ? cruise : committed.get(committed.size() - 1).orientation;
        int orientation = lastOrientation * option.turn;
        Point2D.Double src = wave.wave.sourceLocation;
        List<RobotState> states = new ArrayList<>();
        List<RobotState> crossing = new ArrayList<>();
        states.add(now);
        RobotState s = now;
        long arrival = Long.MAX_VALUE, passed = Long.MAX_VALUE;
        double nearest = s.location.distance(enemy);
        boolean wall = false;
        for (int k = 0; k <= HORIZON; k++) {
            double d = s.location.distance(src);
            double r0 = wave.wave.distanceTraveled(s.time), r1 = wave.wave.distanceTraveled(s.time + 1);
            if (r1 >= d - 26 && r0 <= d + 26) {
                crossing.add(s);
                if (arrival == Long.MAX_VALUE) arrival = s.time;
                passed = s.time;
            }
            if (r0 > d + 26) break;
            Segment seg = segmentAt(committed, s.time);
            RobotState next = seg != null
                ? step(s, seg.center, seg.orientation, seg.option.speed)
                : step(s, src, orientation, option.speed);
            wall |= struckWall(s, next, seg != null ? seg.option.speed : option.speed);
            nearest = Math.min(nearest, next.location.distance(enemy));
            states.add(next);
            s = next;
        }
        Wave.Intersection hit = wave.wave.preciseIntersection(crossing);
        double lo, hi;
        if (hit == null) {
            // The wave never crossed the body inside the horizon: an empty landing at the last state.
            double b = DiaUtils.absoluteBearing(src, s.location);
            lo = b;
            hi = b;
        } else {
            lo = hit.angle - hit.bandwidth;
            hi = hit.angle + hit.bandwidth;
        }
        if (arrival == Long.MAX_VALUE) {
            arrival = s.time;
            passed = s.time;
        }
        RobotState landing = states.get((int) Math.min(states.size() - 1, Math.max(0, arrival - now.time)));
        return new Forecast(Collections.unmodifiableList(states), lo, hi, landing.location.distance(src),
            arrival, passed, nearest, wall, orientation, option);
    }

    /**
     * This tick's drive: the heading to drive toward and the speed cap, from the stretch the
     * path is committed to, or a full-speed orbit of the enemy when none is.
     *
     * @param now Sepia's state this tick
     * @param enemy the enemy's last known place
     * @return {go angle, max velocity}
     */
    public double[] drive(RobotState now, Point2D.Double enemy) {
        prune(now.time);
        Segment seg = segmentAt(plan, now.time);
        if (seg == null) {
            if (!plan.isEmpty()) cruise = plan.get(plan.size() - 1).orientation;
            return new double[] {goAngle(now, enemy, cruise), 8.0};
        }
        cruise = seg.orientation;
        return new double[] {goAngle(now, seg.center, seg.orientation), seg.option.speed};
    }

    /**
     * Where the committed path puts Sepia {@code ticks} from now: the stretches in order, then the
     * cruise round the enemy. The gun turns toward an ink aim from that place during the reload.
     *
     * @param now Sepia's state this tick
     * @param enemy the enemy's last known place
     * @param ticks how far ahead, 0 or more
     * @return the forecast state
     */
    public RobotState ahead(RobotState now, Point2D.Double enemy, int ticks) {
        RobotState s = now;
        int orientation = cruise;
        for (int k = 0; k < ticks; k++) {
            Segment seg = segmentAt(plan, s.time);
            if (seg != null) orientation = seg.orientation;
            s = seg != null ? step(s, seg.center, seg.orientation, seg.option.speed) : step(s, enemy, orientation, 8.0);
        }
        return s;
    }

    /** The option the path is on this tick, or null when it cruises. */
    public Option current(long time) {
        Segment seg = segmentAt(plan, time);
        return seg == null ? null : seg.option;
    }

    /** One tick of the drive rule, the same in a forecast as on the field. */
    RobotState step(RobotState s, Point2D.Double center, int orientation, double maxVelocity) {
        return predictor.nextLocation(s, maxVelocity, goAngle(s, center, orientation), false);
    }

    /**
     * The heading the drive rule wants: square to the line from {@code center}, turned away from
     * it below {@link #MIN_RANGE} (JET-5: range is held and never closed), smoothed off walls.
     */
    double goAngle(RobotState s, Point2D.Double center, int orientation) {
        double bearing = DiaUtils.absoluteBearing(center, s.location);
        double d = center.distance(s.location);
        double attack = d < MIN_RANGE ? -Math.min(MAX_RETREAT, (MIN_RANGE - d) / 300.0) : 0.0;
        double go = Angles.normalRelativeAngle(bearing + orientation * (Math.PI / 2 + attack));
        return field.wallSmoothing(s.location, go, orientation, WALL_STICK);
    }

    /** Drops stretches whose wave has passed. */
    private void prune(long time) {
        plan.removeIf(seg -> seg.until < time);
    }

    /** The first stretch still running at {@code time}, or null. */
    private static Segment segmentAt(List<Segment> segments, long time) {
        for (Segment seg : segments) if (seg.until >= time) return seg;
        return null;
    }

    /** Whether a step stopped dead faster than braking allows: the predictor's wall stop. */
    private static boolean struckWall(RobotState from, RobotState to, double cap) {
        return cap > 0 && Math.abs(from.velocity) > 2.0 && Math.abs(to.velocity) < 1e-9;
    }
}
