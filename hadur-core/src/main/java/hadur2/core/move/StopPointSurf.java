package hadur2.core.move;

import hadur2.core.model.*;
import hadur2.core.physics.*;

import java.awt.geom.Point2D;
import java.util.*;

/**
 * MOVE-25: a second duel surf, built from how DrussGT and BeepBoop plan
 * (docs/bench/surf-b-rivals-read.md). Off by default; {@link SurfMover} hands it the tick only
 * when the duel switches it on.
 *
 * <p><b>What it changes, and why.</b> The three-option surf re-rates orbit either way or stop
 * every tick, each against a danger that is a sum of narrow kernels (one bot width) round the
 * views' neighbours. Go-to surfing on that surface lost (-0.36 APS, 2026-10-15): with dozens of
 * stop points, the cheapest one is mostly a gap between neighbours, a low estimate by chance.
 * Both rivals that plan over many points smooth first: DrussGT with a Cauchy kernel about 0.12
 * of a guess factor wide, BeepBoop with an exponential one about 0.08 wide, each over a
 * histogram normalised to a probability. This surf does the same on Hadur's own views
 * ({@link MoveController#dangerProfile}), so the information is unchanged and only the planner
 * differs:</p>
 *
 * <ul>
 * <li><b>Options.</b> Every stop point along both orbits until the wave passes, thinned to 7 px
 * apart, plus standing still (DrussGT's predictPositions and filterPlaceTimes).</li>
 * <li><b>Danger.</b> The probability mass of the smoothed histogram over the precise
 * intersection of driving to the point, counting only what our bullet shadows let through,
 * times the bullet's damage, over {@code sqrt(4 + t)} for the ticks {@code t} until the wave
 * breaks (BeepBoop's time weight; Hadur's 1/t made the second wave nearly weightless), times
 * the surf's distancing factor.</li>
 * <li><b>Two waves.</b> The cheapest first-wave points, in order, get the second wave's
 * cheapest stop point from where they leave us added, with pruning once a first-wave danger
 * alone is not below the best total.</li>
 * <li><b>Commitment.</b> The point is kept until the waves surfed change, a bullet is logged to
 * the views, or we are more than {@value #DRIFT} px off the predicted path (DrussGT replans
 * only when its stats change).</li>
 * </ul>
 *
 * <p>Angles are radians on Robocode's compass; distances in px; times in ticks.</p>
 */
public class StopPointSurf {

    /** Bins over guess factors [-1, 1] (BeepBoop uses 151). */
    static final int BINS = 151;
    /** The Cauchy kernel's half width at half height, in guess factor. */
    static final double KERNEL_HALF_WIDTH = 0.1;
    /** Stop points closer than this to a kept one are dropped, px (DrussGT's 7). */
    static final double POINT_SPACING = 7.0;
    /** How many of the cheapest first-wave points get the second wave looked at. */
    static final int SECOND_WAVE_POINTS = 10;
    /** A replan is forced when we are this far from where the plan put us this tick, px. */
    static final double DRIFT = 2.0;
    /** The distance at which DrussGT's closeness term is 1, px. */
    static final double CLOSE_REFERENCE = 650.0;
    /** The most ticks any prediction runs (as go-to surfing). */
    private static final int MAX_PREDICTION = 150;
    /** Wall smoothing's reach for the orbit the stop points are taken along, px. */
    private static final double WALL_STICK = 160.0;
    /** The base of the distancing factor, as the three-option surf's. */
    private static final double DISTANCING_DANGER_BASE = 2.5;
    /** The largest attack angle, radians, as the three-option surf's. */
    private static final double MAX_ATTACK_ANGLE = Math.PI * 0.45;

    private final BattleField battleField;
    private final MovementPredictor predictor;
    /** The Cauchy kernel by bin offset, index {@code BINS - 1} is offset 0. */
    private final double[] kernel = new double[2 * BINS - 1];

    /** The waves the plan was made for, and the views' state then. */
    private Wave planWave1, planWave2;
    private long planHits = -1;
    /** The point being driven to, and the predicted path to it, one state a tick from the plan's start. */
    private Point2D.Double planPoint;
    private List<RobotState> planPath = List.of();
    /** The intervals the plan scored, nearest wave first, for the gun (MOVE-8). */
    private List<PlanInterval> planIntervals = List.of();
    /** Smoothed, shadow-free histograms, by wave, for this plan. */
    private final Map<Wave, double[]> profiles = new HashMap<>();
    /** Replans this round, for tests and telemetry. */
    private int replans;

    /**
     * @param battleField the field, for wall smoothing
     * @param predictor the engine's movement rules
     */
    public StopPointSurf(BattleField battleField, MovementPredictor predictor) {
        this.battleField = battleField;
        this.predictor = predictor;
        double binWidth = 2.0 / BINS;
        for (int d = -(BINS - 1); d <= BINS - 1; d++) {
            double u = d * binWidth / KERNEL_HALF_WIDTH;
            kernel[d + BINS - 1] = 1.0 / (1.0 + u * u);
        }
    }

    /** Forgets the plan, at each round and after anything else drove. */
    public void reset() {
        planWave1 = planWave2 = null;
        planPoint = null;
        planPath = List.of();
        planIntervals = List.of();
        profiles.clear();
        planHits = -1;
    }

    /** Replans made over the battle; for tests. */
    int replans() {
        return replans;
    }

    /** The point driven to; null before the first plan. */
    Point2D.Double planPoint() {
        return planPoint;
    }

    /**
     * Surfs {@code surfWave} (and the next surfable wave when {@code wavesToSurf} is 2 or more):
     * keeps or remakes the plan, publishes its intervals and writes the drive.
     *
     * @param orders the orders to write the drive into
     * @param myState our state now
     * @param moveCtrl the waves and danger views
     * @param surfWave the first surfable wave, not null
     * @param wavesToSurf how many waves to look at, 1 or 2
     * @param desiredDistance the distance the orbit's attack angle steers toward, px
     * @param distancingFrom where the distancing factor measures to (the wave's source, or the
     *     enemy with MOVE-18)
     * @return the orbit side of the point taken, +1 clockwise or -1 counter-clockwise, as seen
     *     from the wave's source
     */
    public int surf(BotOrders.Builder orders, RobotState myState, MoveController moveCtrl,
                    Wave surfWave, int wavesToSurf, double desiredDistance,
                    Point2D.Double distancingFrom) {
        Wave wave2 = wavesToSurf > 1 ? moveCtrl.findSurfableWave(1, myState) : null;
        if (needsPlan(myState, moveCtrl, surfWave, wave2)) {
            plan(myState, moveCtrl, surfWave, wave2, desiredDistance, distancingFrom);
        }
        moveCtrl.publishPlan(planIntervals);
        goTo(orders, myState, planPoint);
        double side = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(surfWave.sourceLocation, planPoint)
                - DiaUtils.absoluteBearing(surfWave.sourceLocation, myState.location));
        return side < 0 ? -1 : 1;
    }

    /** Whether the plan must be remade this tick (see the class comment). */
    private boolean needsPlan(RobotState myState, MoveController moveCtrl, Wave wave1, Wave wave2) {
        if (planPoint == null || wave1 != planWave1 || wave2 != planWave2) return true;
        if (moveCtrl.hitsLogged() != planHits) return true;
        RobotState expected = expectedNow(myState.time);
        return expected == null || expected.location.distance(myState.location) > DRIFT;
    }

    /** The planned state for {@code time}; the last one once the path is done; null with no path. */
    private RobotState expectedNow(long time) {
        if (planPath.isEmpty()) return null;
        long offset = time - planPath.get(0).time;
        if (offset < 0) return null;
        return planPath.get((int) Math.min(offset, planPath.size() - 1));
    }

    private void plan(RobotState myState, MoveController moveCtrl, Wave wave1, Wave wave2,
                      double desiredDistance, Point2D.Double distancingFrom) {
        replans++;
        planWave1 = wave1;
        planWave2 = wave2;
        planHits = moveCtrl.hitsLogged();
        // A logged hit, or a new wave, changes what the views find: search afresh.
        moveCtrl.clearNeighborCache();
        profiles.clear();

        List<Point2D.Double> points = stopPoints(myState, wave1, desiredDistance);
        List<Leg> legs = new ArrayList<>(points.size());
        for (Point2D.Double p : points) {
            Leg leg = leg(myState, myState, moveCtrl, wave1, 0, p, distancingFrom, List.of());
            if (leg != null) legs.add(leg);
        }
        if (legs.isEmpty()) {
            // Nothing meets the wave (it has as good as passed): hold still.
            planPoint = myState.location;
            planPath = List.of(myState);
            planIntervals = List.of();
            return;
        }
        legs.sort(Comparator.comparingDouble(l -> l.danger));
        Leg best = legs.get(0);
        Leg bestNext = null;
        double bestTotal = best.danger;
        if (wave2 != null) {
            bestTotal = Double.POSITIVE_INFINITY;
            for (int i = 0; i < Math.min(SECOND_WAVE_POINTS, legs.size()); i++) {
                Leg first = legs.get(i);
                // Sorted: once the first wave alone is not below the best, none further can be.
                if (first.danger >= bestTotal) break;
                Leg next = bestSecondLeg(myState, moveCtrl, wave2, first, desiredDistance,
                    distancingFrom, bestTotal - first.danger);
                double total = first.danger + (next == null ? 0 : next.danger);
                if (total < bestTotal) {
                    bestTotal = total;
                    best = first;
                    bestNext = next;
                }
            }
        }
        planPoint = best.point;
        planPath = best.path;
        List<PlanInterval> intervals = new ArrayList<>(2);
        if (best.interval != null) intervals.add(best.interval);
        if (bestNext != null && bestNext.interval != null) intervals.add(bestNext.interval);
        planIntervals = intervals;
    }

    /**
     * The second wave's cheapest stop point from where {@code first} leaves us, or null when no
     * point meets it. Points are rated in no order; the search stops at the first that is free.
     */
    private Leg bestSecondLeg(RobotState myState, MoveController moveCtrl, Wave wave2, Leg first,
                              double desiredDistance, Point2D.Double distancingFrom, double cap) {
        Leg best = null;
        for (Point2D.Double p : stopPoints(first.passed, wave2, desiredDistance)) {
            Leg leg = leg(myState, first.passed, moveCtrl, wave2, 1, p, distancingFrom, first.path);
            if (leg == null) continue;
            if (best == null || leg.danger < best.danger) best = leg;
            if (best.danger <= 0) break;
        }
        return best;
    }

    /**
     * The stop points for {@code wave} from {@code start}: where we stand, and every tick along
     * each orbit (full speed, the surf's attack angle toward the desired distance, wall-smoothed)
     * until the wave reaches our centre, thinned to {@link #POINT_SPACING} apart.
     */
    List<Point2D.Double> stopPoints(RobotState start, Wave wave, double desiredDistance) {
        List<Point2D.Double> raw = new ArrayList<>();
        raw.add(start.location);
        for (int direction : new int[] {-1, 1}) {
            RobotState state = start;
            for (int t = 1; t <= MAX_PREDICTION; t++) {
                double bearing = DiaUtils.absoluteBearing(wave.sourceLocation, state.location);
                double attack = attackAngle(wave.sourceLocation.distance(state.location), desiredDistance);
                double goAngle = battleField.wallSmoothing(state.location,
                    bearing + direction * (Math.PI / 2 + attack), direction, WALL_STICK);
                state = predictor.nextLocation(state, 8.0, goAngle, false);
                raw.add(state.location);
                Wave.WavePosition pos = wave.checkWavePosition(state, true);
                if (pos == Wave.WavePosition.BREAKING_CENTER || pos == Wave.WavePosition.GONE) break;
            }
        }
        List<Point2D.Double> kept = new ArrayList<>(raw.size());
        double minSq = POINT_SPACING * POINT_SPACING;
        for (Point2D.Double p : raw) {
            boolean near = false;
            for (Point2D.Double k : kept) {
                if (k.distanceSq(p) < minSq) { near = true; break; }
            }
            if (!near) kept.add(p);
        }
        return kept;
    }

    /**
     * Driving from {@code start} to {@code point} and stopping there, against {@code wave}: the
     * states the wave crosses, its precise intersection, and the danger (see the class comment).
     * {@code earlier} are the states of a leg before this one, for a wave already crossing us
     * during it. Null when the wave never meets us within {@link #MAX_PREDICTION} ticks.
     */
    private Leg leg(RobotState myState, RobotState start, MoveController moveCtrl, Wave wave,
                    int waveIndex, Point2D.Double point, Point2D.Double distancingFrom,
                    List<RobotState> earlier) {
        List<RobotState> path = new ArrayList<>();
        List<RobotState> dangerStates = new ArrayList<>();
        for (RobotState s : earlier) {
            if (wave.checkWavePosition(s).isBreaking()) dangerStates.add(s);
        }
        RobotState predicted = start;
        RobotState passed = start;
        boolean waveHit = false;
        for (int t = 0; t < MAX_PREDICTION; t++) {
            if (!waveHit && wave.checkWavePosition(predicted,
                    Wave.WavePosition.BREAKING_FRONT) == Wave.WavePosition.BREAKING_FRONT) {
                RobotState ds = predicted;
                for (int u = 0; u < MAX_PREDICTION
                        && wave.checkWavePosition(ds, true) != Wave.WavePosition.GONE; u++) {
                    dangerStates.add(ds);
                    ds = goToStep(ds, point);
                }
                waveHit = true;
            }
            Wave.WavePosition pos = wave.checkWavePosition(predicted, true);
            passed = predicted;
            if (pos == Wave.WavePosition.BREAKING_CENTER || pos == Wave.WavePosition.GONE) break;
            path.add(predicted);
            predicted = goToStep(predicted, point);
        }
        path.add(passed);
        if (dangerStates.isEmpty()) return null;
        Wave.Intersection x = wave.preciseIntersection(dangerStates);
        if (x == null) return null;
        double mass = mass(moveCtrl, wave, waveIndex, x);
        double danger = mass * Rules.getBulletDamage(wave.bulletPower());
        if (wave.uncertain) danger *= 0.5;
        double ticks = Math.max(1.0, (myState.location.distance(wave.sourceLocation)
            - wave.distanceTraveled(myState.time)) / wave.bulletSpeed());
        danger /= Math.sqrt(4 + ticks);
        danger *= distancing(start.location, passed.location, distancingFrom);
        // DrussGT's closeness term: danger over (distance - 34) where the leg ends, scaled to 1 at
        // 650 px. The first smokes fought about 30 px closer than the three-option surf (a straight
        // drive to a point on the orbit cuts inside it) and were hit more often.
        danger *= closeness(Math.min(passed.location.distance(wave.sourceLocation),
            passed.location.distance(distancingFrom)));
        List<RobotState> fullPath = new ArrayList<>(earlier.size() + path.size());
        // The earlier leg ends on the state this one starts from: keep one of the two.
        fullPath.addAll(earlier.isEmpty() ? earlier : earlier.subList(0, earlier.size() - 1));
        fullPath.addAll(path);
        return new Leg(point, danger, passed, fullPath, PlanInterval.of(wave, x, mass));
    }

    /**
     * The smoothed histogram's mass over {@code x}, each part counted at the share our bullet
     * shadows let through.
     */
    double mass(MoveController moveCtrl, Wave wave, int waveIndex, Wave.Intersection x) {
        double[] profile = profiles.computeIfAbsent(wave,
            w -> smooth(moveCtrl.dangerProfile(w, waveIndex, BINS)));
        double total = 0;
        for (double[] seg : wave.transmission(x)) {
            if (seg[2] <= 0) continue;
            double g0 = wave.guessFactor(seg[0]);
            double g1 = wave.guessFactor(seg[1]);
            total += seg[2] * integrate(profile, Math.min(g0, g1), Math.max(g0, g1));
        }
        ShotDodger dodger = aimMix ? moveCtrl.shotDodger() : null;
        if (dodger == null) return total;
        double share = simpleAimShare(dodger);
        if (share <= 0) return total;
        double[] aims = wave.simpleAims();
        double a = aims == null ? Double.NaN : dodger.expert(aims, dodger.best());
        if (Double.isNaN(a)) return total;
        // MOVE-26: the simple aim's bullet, where it would cross us, counted at what the shadows let through.
        double hit = 0;
        for (double[] seg : wave.transmission(x)) {
            double lo = seg[0] - ShotDodger.MARGIN, hi = seg[1] + ShotDodger.MARGIN;
            double at = DiaUtils.normalizeAngle(a, (lo + hi) / 2);
            if (at >= lo && at <= hi) hit = Math.max(hit, seg[2]);
        }
        return (1 - share) * total + share * hit;
    }

    /**
     * MOVE-26: the chance the enemy's next bullet is its most-matched simple aim, as the bullets
     * read so far say: that aim's matches over the bullets read plus two (so two of two is a half,
     * not certainty), and 0 until it has matched twice.
     */
    static double simpleAimShare(ShotDodger dodger) {
        int best = dodger.best();
        if (best < 0) return 0;
        int m = dodger.matches(best);
        return m < 2 ? 0 : m / (dodger.read() + 2.0);
    }

    /** MOVE-26: whether the simple-aim expert is mixed into the danger (needs the duel's dodger on). */
    private boolean aimMix;

    /**
     * MOVE-26: mixes the enemy's most-matched simple aim into the danger at the share of its
     * bullets it has matched (BeepBoop's and Ogi's mixture of experts, in its simplest form). Off by
     * default; the duel turns the shot dodger's reading on with it.
     *
     * @param on whether to mix
     */
    public void setAimMix(boolean on) {
        this.aimMix = on;
    }

    /** The histogram convolved with the Cauchy kernel and normalised to sum to 1. */
    double[] smooth(double[] raw) {
        double[] out = new double[BINS];
        double sum = 0;
        for (int i = 0; i < BINS; i++) {
            if (raw[i] == 0) continue;
            for (int j = 0; j < BINS; j++) out[j] += raw[i] * kernel[j - i + BINS - 1];
        }
        for (double v : out) sum += v;
        if (sum > 0) for (int j = 0; j < BINS; j++) out[j] /= sum;
        return out;
    }

    /** The mass of {@code profile} between guess factors {@code lo} and {@code hi}, bins split pro rata. */
    static double integrate(double[] profile, double lo, double hi) {
        int n = profile.length;
        double width = 2.0 / n;
        double a = Math.max(-1, lo), b = Math.min(1, hi);
        if (!(b > a)) return 0;
        double total = 0;
        int first = Math.max(0, (int) Math.floor((a + 1) / width));
        int last = Math.min(n - 1, (int) Math.floor((b + 1) / width));
        for (int i = first; i <= last; i++) {
            double binLo = -1 + i * width, binHi = binLo + width;
            double overlap = Math.min(b, binHi) - Math.max(a, binLo);
            if (overlap > 0) total += profile[i] * overlap / width;
        }
        return total;
    }

    /** As the three-option surf's distancing factor: 2.5^(d0 / d1) / 2.5. */
    static double distancing(Point2D.Double start, Point2D.Double end, Point2D.Double from) {
        double q = from.distance(start) / Math.max(1.0, from.distance(end));
        return Math.pow(DISTANCING_DANGER_BASE, q) / DISTANCING_DANGER_BASE;
    }

    /** DrussGT's closeness term, {@code (650 - 34) / (d - 34)}: 1 at 650 px, larger nearer (d floored at 35 px). */
    static double closeness(double distance) {
        return (CLOSE_REFERENCE - 34) / (Math.max(35.0, distance) - 34);
    }

    /** As the three-option surf's attack angle: 0.6 times the relative distance error, capped. */
    static double attackAngle(double distance, double desiredDistance) {
        double factor = (distance - desiredDistance) / desiredDistance;
        return DiaUtils.limit(-MAX_ATTACK_ANGLE, factor * 0.6, MAX_ATTACK_ANGLE);
    }

    /** One tick of driving to {@code point} and stopping there, as go-to surfing's. */
    RobotState goToStep(RobotState state, Point2D.Double point) {
        double dist = state.location.distance(point);
        if (dist < 0.5) return predictor.predict(state, 0, 0, 8.0, 1, false);
        double turn = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(state.location, point) - state.heading);
        double distance = dist;
        if (Math.abs(turn) > Math.PI / 2) {
            turn -= Math.signum(turn) * Math.PI;
            distance = -dist;
        }
        return predictor.predict(state, distance, turn, 8.0, 1, false);
    }

    /** The orders that match {@link #goToStep}. */
    private static void goTo(BotOrders.Builder orders, RobotState state, Point2D.Double point) {
        orders.maxVelocity(8.0);
        double dist = state.location.distance(point);
        if (dist < 0.5) {
            orders.turnRight(0);
            orders.ahead(0);
            return;
        }
        double turn = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(state.location, point) - state.heading);
        double distance = dist;
        if (Math.abs(turn) > Math.PI / 2) {
            turn -= Math.signum(turn) * Math.PI;
            distance = -dist;
        }
        orders.turnRight(turn);
        orders.ahead(distance);
    }

    /** A stop point rated against one wave. */
    private static final class Leg {
        final Point2D.Double point;
        final double danger;
        /** Where we are when the wave reaches our centre: the next wave's leg starts here. */
        final RobotState passed;
        /** The states from the plan's start through this leg, one a tick. */
        final List<RobotState> path;
        final PlanInterval interval;

        Leg(Point2D.Double point, double danger, RobotState passed, List<RobotState> path,
            PlanInterval interval) {
            this.point = point;
            this.danger = danger;
            this.passed = passed;
            this.path = path;
            this.interval = interval;
        }
    }
}
