package hadur2.core.move;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;

import java.awt.geom.Point2D;
import java.util.*;

/**
 * The duel's wave surfing: each tick, decides where to drive so that the enemy's next
 * bullets are least likely to hit us, and writes the body's turn, distance and speed into
 * the orders.
 *
 * <p><b>Where it sits in the tick.</b> {@code HadurCore} calls {@link #move} once a duel
 * tick, after {@link MoveController} has broken passed waves and updated the bullet shadows,
 * or {@link #ram} instead while the enemy is disabled (END-2). The distance policy sets
 * {@link #setDesiredDistance} every tick (DIST-1, END-1) and the movement flavour sets
 * {@link #setMode} (MOVE-2). With no firing wave in the air it orbits the enemy.</p>
 *
 * <p><b>How a wave is surfed.</b> For the first surfable wave, each option (orbit
 * counter-clockwise, stop, orbit clockwise, or in go-to mode a spread of stop points) is
 * simulated tick by tick with the engine's own movement rules ({@link MovementPredictor})
 * until the wave passes our centre. The states in which the wave is crossing us give the
 * precise intersection: the firing angles that would hit us. Its danger is the views'
 * score there ({@link MoveController#getDangerScore}), less the part our bullets shadow
 * (MOVE-1), times the bullet's damage, over the ticks until impact, and scaled by whether
 * the move takes us closer to the enemy. With two waves to surf, the second wave's best
 * option from where the first leaves us is added, so the choice for the first wave does not
 * corner us for the next. The cheapest option wins.</p>
 *
 * <p><b>Orbit and distance.</b> Each orbit heads perpendicular to the line from the enemy,
 * bent by an attack angle toward the enemy when we are further than the desired distance
 * and away when nearer, capped at 0.45 pi. Near a wall the heading is wall-smoothed: turned
 * along the wall, keeping the orbit's direction, so neither the prediction nor the drive
 * heads into it.</p>
 *
 * <p>Angles are radians on Robocode's compass (0 north, clockwise); distances in px; times
 * in ticks. {@link SurfOption#direction} is +1 for clockwise, -1 for counter-clockwise, as
 * seen from above with y up. State kept between ticks is the option and destination
 * chosen for the wave being surfed, so the choice does not flicker; it resets when a new wave
 * is surfed and at each round.</p>
 */
public class SurfMover {

    /** 1.20's fixed distance; the distance policy moves it from S5 (DIST-1, END-1). */
    public static final double DEFAULT_DISTANCE = 650.0;
    /**
     * Wall smoothing's reach, in px, for the surf's and the orbit's heading: the heading is
     * turned until a point this far along it stays 18 px (half a robot) inside the field.
     */
    private static final double WALL_STICK = 160.0;
    /** Wall smoothing's reach, in px, when predicting an orbit's escape point. */
    private static final double MEA_WALL_STICK = 100.0;
    /**
     * The base of the distancing factor {@code base^(d0 / d1) / base}: 1 when a move keeps
     * the distance to the source, above 1 when it closes in, below 1 when it backs off.
     */
    private static final double DISTANCING_DANGER_BASE = 2.5;
    /** The largest attack angle, in radians: 0.45 pi, 81 degrees off perpendicular. */
    private static final double MAX_ATTACK_ANGLE = Math.PI * 0.45;

    private final BattleField battleField;
    private final MovementPredictor predictor;

    /** The way round the three-option surf went last; a stop keeps it, for its smoothing side. */
    private SurfOption lastSurfOption = SurfOption.CLOCKWISE;
    /** The orbit destination chosen for the wave being surfed; null while stopped or unset. */
    private Point2D.Double lastSurfDestination;
    /** The point a stop steers toward, fixed from the first tick the stop was chosen. */
    private Point2D.Double stopDestination;
    /** This tick's danger for each of the three options. */
    private final Map<SurfOption, Double> surfOptionDangers = new HashMap<>();
    /** This tick's destination for each of the three options, on the first wave. */
    private final Map<SurfOption, Point2D.Double> surfOptionDestinations = new HashMap<>();
    /** The wave surfed last tick; a different one resets the destinations and the cache. */
    private Wave lastWaveSurfed;
    /** The distance, in px, the attack angles steer toward. */
    private double desiredDistance = DEFAULT_DISTANCE;
    /** The surf mode for the wave being surfed, and the one the next wave starts with (MOVE-2). */
    private Mode mode = Mode.OPTIONS;
    private Mode nextMode = Mode.OPTIONS;
    /** Go-to surfing: the point chosen on the last tick, for the SD record. */
    private Point2D.Double goToPoint;
    /** RAM-1: while true, the no-wave orbit takes the side it would otherwise not have. */
    private boolean rammerActive;

    /**
     * A surf on {@code battleField}, in the three-option mode, at {@link #DEFAULT_DISTANCE}.
     *
     * @param battleField the field, for wall smoothing
     * @param predictor the engine's movement rules, for predicting each option
     */
    public SurfMover(BattleField battleField, MovementPredictor predictor) {
        this.battleField = battleField;
        this.predictor = predictor;
    }

    /**
     * The distance the surf's and the orbit's attack angles steer toward. The distance
     * policy keeps it in [400, 650] px (DIST-1) and sets 150 px to finish (END-1); this
     * class takes whatever it is given.
     *
     * @param desiredDistance the target distance, in px
     */
    public void setDesiredDistance(double desiredDistance) {
        this.desiredDistance = desiredDistance;
    }

    /** The target distance, in px, last set. */
    public double desiredDistance() {
        return desiredDistance;
    }

    /**
     * How to pick where to be when a wave breaks. The mode changes only when a new wave is
     * surfed (MOVE-2's "at the next surfable wave"), never under a wave half-dodged.
     */
    public enum Mode {
        /** 1.20's three options: orbit counter-clockwise, stop, orbit clockwise. */
        OPTIONS,
        /** Go-to surfing: a spread of stop points along both orbits; drive to the safest. */
        GO_TO
    }

    /**
     * The mode for the next wave surfed (MOVE-2's "at the next surfable wave"); the wave
     * being surfed keeps its mode.
     *
     * @param mode the new mode
     */
    public void setMode(Mode mode) {
        this.nextMode = mode;
    }

    /** The mode surfing the current wave. */
    public Mode mode() {
        return mode;
    }

    /**
     * RAM-1: while active, the no-wave orbit ({@link #orbit}) picks the side it would
     * otherwise reject, rather than whichever wall-smoothed heading points more directly
     * away from the enemy. A charging rammer rarely leaves a real firing wave to surf, so
     * only the plain orbit is affected.
     *
     * @param active whether the rammer response is active this tick
     */
    public void setRammerActive(boolean active) {
        this.rammerActive = active;
    }

    /**
     * END-2: drive straight at the enemy at full speed, front or back first, whichever needs
     * less turning. A disabled robot cannot shoot, so there is nothing to surf.
     *
     * @param orders the orders to write the drive into
     * @param myState our state this tick
     * @param enemyLocation the enemy's last known position, in px
     */
    public void ram(BotOrders.Builder orders, RobotState myState, Point2D.Double enemyLocation) {
        orders.maxVelocity(8.0);
        DiaUtils.setBackAsFront(orders, myState.heading,
            DiaUtils.absoluteBearing(myState.location, enemyLocation));
        // A surf resumed after ramming starts fresh.
        lastSurfDestination = null;
        stopDestination = null;
    }

    /** Forgets the wave surfed and its destinations; the mode and distance are kept. */
    public void initRound() {
        lastSurfDestination = null;
        stopDestination = null;
        lastWaveSurfed = null;
        goToPoint = null;
        rammerActive = false;
    }

    /**
     * Surfs the first surfable wave (and {@code wavesToSurf - 1} behind it), or orbits when
     * there is none. {@code goToAllowed} is false while the tick budget is short (TIME-1):
     * go-to surfing then falls back to the three options.
     *
     * @param orders the orders to write the drive into
     * @param myState our state this tick
     * @param moveCtrl the waves and danger views
     * @param enemyLocation the enemy's last known position, in px, for orbiting
     * @param wavesToSurf how many waves to look ahead: 2 at full computation, 1 when the
     *     tick budget is short (TIME-1, TIME-2)
     * @param goToAllowed whether go-to surfing may run this tick
     */
    public void move(BotOrders.Builder orders, RobotState myState,
                     MoveController moveCtrl, Point2D.Double enemyLocation,
                     int wavesToSurf, boolean goToAllowed) {
        Wave surfWave = moveCtrl.findSurfableWave(0, myState);
        if (surfWave == null) {
            orbit(orders, myState.heading, myState.location, enemyLocation);
            return;
        }
        // The mode changes only between waves, never under a wave half-dodged (MOVE-2).
        if (surfWave != lastWaveSurfed) mode = nextMode;
        if (mode == Mode.GO_TO && goToAllowed) {
            goToSurf(orders, myState, moveCtrl, surfWave, wavesToSurf);
        } else {
            surf(orders, myState, moveCtrl, surfWave, wavesToSurf);
        }
    }

    /**
     * {@link #move(BotOrders.Builder, RobotState, MoveController, Point2D.Double, int, boolean)}
     * with go-to surfing allowed.
     *
     * @param orders the orders to write the drive into
     * @param myState our state this tick
     * @param moveCtrl the waves and danger views
     * @param enemyLocation the enemy's last known position, in px
     * @param wavesToSurf how many waves to look ahead
     */
    public void move(BotOrders.Builder orders, RobotState myState,
                     MoveController moveCtrl, Point2D.Double enemyLocation,
                     int wavesToSurf) {
        move(orders, myState, moveCtrl, enemyLocation, wavesToSurf, true);
    }

    /**
     * With no wave to surf: full speed round the enemy, on whichever side's wall-smoothed
     * heading points more directly away from it.
     */
    private void orbit(BotOrders.Builder orders, double heading, Point2D.Double myLocation,
                       Point2D.Double enemyLocation) {
        orders.maxVelocity(8.0);
        // The bearing from the enemy to us: the "straight away" direction.
        double orbitAbsBearing = DiaUtils.absoluteBearing(enemyLocation, myLocation);
        double retreatAngle = orbitAttackAngle(myLocation.distance(enemyLocation));

        // Perpendicular to that bearing plus the attack angle, on each side. A positive attack
        // angle (too far) turns both headings toward the enemy, a negative one away from it.

        double ccwAngle = orbitAbsBearing + SurfOption.COUNTER_CLOCKWISE.direction
            * (Math.PI / 2 + retreatAngle);
        ccwAngle = battleField.wallSmoothing(myLocation, ccwAngle,
            SurfOption.COUNTER_CLOCKWISE.direction, WALL_STICK);

        double cwAngle = orbitAbsBearing + SurfOption.CLOCKWISE.direction
            * (Math.PI / 2 + retreatAngle);
        cwAngle = battleField.wallSmoothing(myLocation, cwAngle,
            SurfOption.CLOCKWISE.direction, WALL_STICK);

        // Take the side whose heading, after wall smoothing, stays closer to straight away
        // from the enemy (a wall bends a heading toward it); ties go counter-clockwise.
        // RAM-1: while the rammer response is active, take the other side instead, so a
        // charging enemy meets a less predictable path than the same side every tick.
        boolean clockwise = Math.abs(Angles.normalRelativeAngle(cwAngle - orbitAbsBearing))
            < Math.abs(Angles.normalRelativeAngle(ccwAngle - orbitAbsBearing));
        if (rammerActive) clockwise = !clockwise;
        if (clockwise) {
            lastSurfOption = SurfOption.CLOCKWISE;
            DiaUtils.setBackAsFront(orders, heading, cwAngle);
        } else {
            lastSurfOption = SurfOption.COUNTER_CLOCKWISE;
            DiaUtils.setBackAsFront(orders, heading, ccwAngle);
        }
    }

    /**
     * The three-option surf: rates orbiting counter-clockwise, stopping and orbiting
     * clockwise against the waves ahead, and drives the cheapest. A stop wins ties, then
     * counter-clockwise over clockwise.
     */
    private void surf(BotOrders.Builder orders, RobotState myState,
                      MoveController moveCtrl, Wave surfWave, int wavesToSurf) {
        // A new wave: its neighbours differ and last wave's destinations no longer apply.
        if (surfWave != lastWaveSurfed) {
            moveCtrl.clearNeighborCache();
            lastWaveSurfed = surfWave;
            lastSurfDestination = null;
            stopDestination = null;
        }

        boolean goingClockwise = lastSurfOption == SurfOption.CLOCKWISE;
        updateSurfDangers(myState, moveCtrl, wavesToSurf, goingClockwise);

        double ccwDanger = surfOptionDangers.getOrDefault(SurfOption.COUNTER_CLOCKWISE, 0.0);
        double stopDanger = surfOptionDangers.getOrDefault(SurfOption.STOP, 0.0);
        double cwDanger = surfOptionDangers.getOrDefault(SurfOption.CLOCKWISE, 0.0);

        Point2D.Double surfDest;
        if (stopDanger <= ccwDanger && stopDanger <= cwDanger) {
            // Stop: speed 0, still turned toward the last orbit's destination. The point is
            // fixed while the stop lasts, so the stop predicted next tick is the same stop.
            if (stopDestination == null) {
                stopDestination = surfOptionDestinations.get(lastSurfOption);
            }
            surfDest = stopDestination;
            orders.maxVelocity(0.0);
            lastSurfDestination = null;
        } else {
            orders.maxVelocity(8.0);
            lastSurfOption = cwDanger < ccwDanger
                ? SurfOption.CLOCKWISE : SurfOption.COUNTER_CLOCKWISE;
            lastSurfDestination = surfOptionDestinations.get(lastSurfOption);
            surfDest = lastSurfDestination;
            stopDestination = null;
        }

        // Drive the same way the prediction did: toward the destination, wall-smoothed on
        // the orbit's side, reversing rather than turning more than 90 degrees.
        double goAngle = DiaUtils.absoluteBearing(myState.location, surfDest);
        goAngle = battleField.wallSmoothing(myState.location, goAngle,
            lastSurfOption.direction, WALL_STICK);
        DiaUtils.setBackAsFront(orders, myState.heading, goAngle);
    }

    /**
     * Rates the three options from where we stand. Each option's total is passed on as the
     * cutoff for the next, so an option already worse than the best so far is not looked
     * at beyond its first wave.
     */
    private void updateSurfDangers(RobotState myState, MoveController moveCtrl,
                                    int wavesToSurf, boolean goingClockwise) {
        double bestDanger = Double.POSITIVE_INFINITY;
        for (SurfOption option : SurfOption.values()) {
            double danger = checkDanger(myState, moveCtrl, myState, option,
                goingClockwise, 0, wavesToSurf, bestDanger, new RobotStateLog());
            surfOptionDangers.put(option, danger);
            bestDanger = Math.min(bestDanger, danger);
        }
    }

    /**
     * The danger of taking {@code option} against the {@code surfWaveIndex}-th surfable wave
     * from {@code startState}, plus (while {@code surfWaveIndex + 1 < numWaves} and this
     * wave's danger is under {@code cutoff}) the least danger of the three options against
     * the next wave from where this one leaves us.
     *
     * <p>The drive is simulated tick by tick toward the option's destination, at full speed
     * (or 0 for a stop), until the wave reaches our centre. From the first tick the wave's
     * front touches our hit box, the states are also played forward as if we braked there,
     * until the wave has wholly passed: those are the states the wave can hit, and their
     * precise intersection is what {@link #waveDanger} scores.</p>
     *
     * @param myState our real state now, which fixes which waves are surfable and their
     *     time to impact
     * @param moveCtrl the waves and danger views
     * @param startState where this leg of the prediction starts
     * @param option the option to simulate
     * @param prevClockwise the orbit side a stop is smoothed along
     * @param surfWaveIndex which surfable wave, 0 the first
     * @param numWaves how many waves to look ahead in all
     * @param cutoff the best total so far; the next wave is skipped when this one alone is
     *     not below it
     * @param predictedLog the states predicted on earlier legs, to replay against a later
     *     wave that was already crossing us during them; this leg's states are added to it
     * @return the danger, 0 when there is no such wave or it has already passed
     */
    double checkDanger(RobotState myState, MoveController moveCtrl,
                       RobotState startState, SurfOption option,
                       boolean prevClockwise, int surfWaveIndex,
                       int numWaves, double cutoff, RobotStateLog predictedLog) {
        Wave surfWave = moveCtrl.findSurfableWave(surfWaveIndex, myState);
        if (surfWave == null) return 0;

        List<RobotState> dangerStates = new ArrayList<>();
        Wave.WavePosition startPos = surfWave.checkWavePosition(startState);

        // A later wave may already be crossing us before this leg starts: the states from
        // the earlier legs in which it was breaking count against it too.
        if (surfWaveIndex > 0 && startPos != Wave.WavePosition.MIDAIR) {
            dangerStates.addAll(replaySurfStates(surfWave, predictedLog));
        }
        if (startPos == Wave.WavePosition.GONE && dangerStates.isEmpty()) {
            return 0;
        }

        // A stop keeps the side it was on (for wall smoothing and its destination); an
        // orbit takes its own.
        boolean predictClockwise = option == SurfOption.STOP
            ? prevClockwise : (option == SurfOption.CLOCKWISE);
        SurfOption smoothOption = option == SurfOption.STOP
            ? (predictClockwise ? SurfOption.CLOCKWISE : SurfOption.COUNTER_CLOCKWISE)
            : option;
        double maxVelocity = option == SurfOption.STOP ? 0 : 8.0;

        // The destination: a stop already under way keeps its point; otherwise the precise
        // escape point for this side (see surfDestination).
        Point2D.Double surfDest;
        if (surfWaveIndex == 0 && option == SurfOption.STOP && stopDestination != null) {
            surfDest = stopDestination;
        } else {
            surfDest = surfDestination(surfWave, surfWaveIndex, startState, smoothOption);
        }
        if (surfWaveIndex == 0) {
            surfOptionDestinations.put(option, surfDest);
        }

        RobotState predicted = startState;
        RobotState passedState = startState;
        boolean wavePassed = false;
        boolean waveHit = false;

        do {
            // The first tick the wave will reach our hit box within the tick (capping the test
            // at BREAKING_FRONT makes it answer "reaching us or not"): collect every state
            // from here until the wave is wholly past, predicted as if we brake to a stop
            // from this tick. Those states give the intersection the wave is scored at.
            if (!waveHit && surfWave.checkWavePosition(predicted,
                    Wave.WavePosition.BREAKING_FRONT) == Wave.WavePosition.BREAKING_FRONT) {
                RobotState ds = predicted;
                do {
                    dangerStates.add(ds);
                    ds = predictSurfLocation(ds, surfDest, 0, smoothOption);
                } while (surfWave.checkWavePosition(ds, true) != Wave.WavePosition.GONE);
                waveHit = true;
            }

            // Stop the leg once the wave reaches our centre: the next wave's leg starts here.
            Wave.WavePosition pos = surfWave.checkWavePosition(predicted, true);
            if (pos == Wave.WavePosition.BREAKING_CENTER
                    || pos == Wave.WavePosition.GONE) {
                passedState = predicted;
                wavePassed = true;
                continue;
            }
            predictedLog.addState(predicted);
            predicted = predictSurfLocation(predicted, surfDest, maxVelocity, smoothOption);
        } while (!wavePassed);

        double danger = waveDanger(myState, moveCtrl, surfWave, surfWaveIndex, dangerStates,
            startState.location, passedState.location);

        // Look one wave further, from where this leg ends. Each branch gets its own copy of
        // the log, so the options do not see each other's states.
        if (surfWaveIndex + 1 < numWaves && danger < cutoff) {
            double nextCcw = checkDanger(myState, moveCtrl, passedState,
                SurfOption.COUNTER_CLOCKWISE, predictClockwise, surfWaveIndex + 1,
                numWaves, cutoff, (RobotStateLog) predictedLog.clone());
            double nextStop = checkDanger(myState, moveCtrl, passedState,
                SurfOption.STOP, predictClockwise, surfWaveIndex + 1,
                numWaves, cutoff, (RobotStateLog) predictedLog.clone());
            double nextCw = checkDanger(myState, moveCtrl, passedState,
                SurfOption.CLOCKWISE, predictClockwise, surfWaveIndex + 1,
                numWaves, cutoff, (RobotStateLog) predictedLog.clone());
            danger += Math.min(nextCcw, Math.min(nextStop, nextCw));
        }
        return danger;
    }

    /**
     * The danger of being where {@code dangerStates} say when {@code surfWave} breaks: the
     * views' score at that intersection, less the share our bullets shadow (MOVE-1), scaled
     * by the bullet's damage, how soon it arrives and how much closer the move takes us.
     *
     * @param myState our real state now, for the time to impact
     * @param moveCtrl the danger views and hit rate
     * @param surfWave the wave
     * @param surfWaveIndex its index among the surfable waves, for the neighbour cache
     * @param dangerStates the predicted states in which the wave crosses us
     * @param start where the move starts, in px
     * @param passed where the move is when the wave reaches our centre, in px
     * @return the danger, 0 or more
     */
    private double waveDanger(RobotState myState, MoveController moveCtrl, Wave surfWave,
                              int surfWaveIndex, List<RobotState> dangerStates,
                              Point2D.Double start, Point2D.Double passed) {
        Wave.Intersection intersection = surfWave.preciseIntersection(dangerStates);
        // The enemy's normalised hit rate is added to the views' score, so every wave from a
        // gun that hits us often weighs more, even where the views see no danger.
        double hitRate = moveCtrl.normalizedEnemyHitRate();
        // MOVE-1: a bullet fired into a shadow dies on one of ours before it reaches us. The
        // views' score already counts only what the shadows let through (MOVE-3); the hit-rate
        // term, which has no angle, keeps 1 - (certain + possible / 2) of its weight.
        double shadowed = surfWave.shadowedFraction(intersection);
        double danger = hitRate * (1 - shadowed)
            + moveCtrl.getDangerScore(surfWave, intersection, surfWaveIndex);
        // Robocode's damage: 4 * power, plus 2 * (power - 1) above power 1.
        danger *= Rules.getBulletDamage(surfWave.bulletPower());
        // WAVE-3: a wave whose power came from an ambiguous wall-hit split is trusted at half.
        if (surfWave.uncertain) danger *= 0.5;

        // Ticks until the wave reaches our centre as we stand now, at least 1: a wave about
        // to arrive weighs more than one far off.
        double currentDist = myState.location.distance(surfWave.sourceLocation);
        double currentWaveDist = currentDist - surfWave.distanceTraveled(myState.time);
        double timeToImpact = Math.max(1.0, currentWaveDist / surfWave.bulletSpeed());
        danger /= timeToImpact;

        danger *= distancingDanger(start, passed, surfWave.sourceLocation);
        return danger;
    }

    // Go-to surfing (S6's A/B against the three options).

    /*
     * Go-to surfing picks a point and drives to it and stops, instead of committing to an
     * orbit direction or a stop. It is MOVE-2's second flavour, not the default: in S6's A/B
     * it lost to the three options (docs/strategy-evolution.md). It costs the most, so the
     * tick budget turns it off from computation level 1 (TIME-1, TIME-2).
     */

    /** Candidate stop points are taken every this many ticks along each orbit. */
    static final int GO_TO_SPACING = 2;
    /** Candidates whose first-wave danger is lowest get the second wave's danger added. */
    static final int GO_TO_SECOND_WAVE = 3;
    /**
     * The most ticks any go-to prediction runs, a bound on its loops. At
     * the slowest bullet speed, 11 px a tick, 150 ticks is 1,650 px, more than a
     * 1,000 x 1,000 field's diagonal.
     */
    private static final int MAX_PREDICTION = 150;

    /**
     * Go-to surfing: rates every candidate point against the first wave, adds the second
     * wave's best danger for the {@link #GO_TO_SECOND_WAVE} best of them when surfing two
     * waves, and drives to the cheapest.
     */
    private void goToSurf(BotOrders.Builder orders, RobotState myState, MoveController moveCtrl,
                          Wave surfWave, int wavesToSurf) {
        if (surfWave != lastWaveSurfed) {
            moveCtrl.clearNeighborCache();
            lastWaveSurfed = surfWave;
            lastSurfDestination = null;
            stopDestination = null;
        }
        // The candidate list always holds our own position, so options is never empty.
        List<Point2D.Double> candidates = goToCandidates(myState, surfWave);
        List<GoToOption> options = new ArrayList<>();
        for (Point2D.Double c : candidates) {
            options.add(goToDanger(myState, moveCtrl, surfWave, c));
        }
        options.sort(Comparator.comparingDouble(o -> o.danger));
        GoToOption best = options.get(0);
        if (wavesToSurf > 1) {
            double bestTotal = Double.POSITIVE_INFINITY;
            for (int i = 0; i < Math.min(GO_TO_SECOND_WAVE, options.size()); i++) {
                GoToOption o = options.get(i);
                // A candidate is judged on the second wave from where it leaves us when the
                // first passes, along its own way round (GoToSurfTest, MOVE-2).
                double total = o.danger + secondWaveDanger(myState, moveCtrl, o,
                    orbitSide(surfWave, myState, o.point), bestTotal);
                if (total < bestTotal) {
                    bestTotal = total;
                    best = o;
                }
            }
        }
        goToPoint = best.point;
        // Recorded so a later three-option wave, or a stop, starts on this side.
        lastSurfOption = orbitSide(surfWave, myState, best.point);
        goTo(orders, myState, best.point);
    }

    /**
     * The way round the wave's source that driving to {@code point} goes: clockwise when the
     * point's bearing from the source is clockwise of ours, counter-clockwise otherwise
     * (our own position counts as clockwise).
     *
     * @param surfWave the wave, for its source
     * @param myState our state, for our bearing from the source
     * @param point the candidate
     * @return {@link SurfOption#CLOCKWISE} or {@link SurfOption#COUNTER_CLOCKWISE}, never STOP
     */
    static SurfOption orbitSide(Wave surfWave, RobotState myState, Point2D.Double point) {
        double side = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(surfWave.sourceLocation, point)
                - DiaUtils.absoluteBearing(surfWave.sourceLocation, myState.location));
        return side < 0 ? SurfOption.COUNTER_CLOCKWISE : SurfOption.CLOCKWISE;
    }

    /**
     * The stop points: where we stand, and every few ticks along both orbits until the wave passes.
     *
     * <p>Each orbit is predicted at full speed toward that side's precise escape point (the
     * furthest round the source we could get before the wave arrives, with the attack angle
     * toward the desired distance), wall-smoothed; a point is taken every
     * {@link #GO_TO_SPACING} ticks and at the tick the wave reaches our centre, which is
     * where the orbit ends. So the candidates span everything from standing still to going
     * all out either way.</p>
     *
     * @param myState our state now
     * @param surfWave the wave being surfed
     * @return the candidates, our own position first
     */
    List<Point2D.Double> goToCandidates(RobotState myState, Wave surfWave) {
        List<Point2D.Double> candidates = new ArrayList<>();
        candidates.add(myState.location);
        for (SurfOption option : new SurfOption[] {SurfOption.COUNTER_CLOCKWISE, SurfOption.CLOCKWISE}) {
            double attackAngle = surfAttackAngle(surfWave.sourceLocation.distance(myState.location));
            Point2D.Double dest = predictor.preciseEscapeAngle(option.direction,
                surfWave.sourceLocation, surfWave.fireTime, surfWave.bulletSpeed(), myState,
                attackAngle, MEA_WALL_STICK).location;
            RobotState state = myState;
            for (int t = 1; t <= MAX_PREDICTION; t++) {
                state = predictSurfLocation(state, dest, 8.0, option);
                Wave.WavePosition pos = surfWave.checkWavePosition(state, true);
                boolean passed = pos == Wave.WavePosition.BREAKING_CENTER
                    || pos == Wave.WavePosition.GONE;
                if (t % GO_TO_SPACING == 0 || passed) candidates.add(state.location);
                if (passed) break;
            }
        }
        return candidates;
    }

    /**
     * The first wave's danger for driving to {@code point} and stopping there: the same
     * scoring as {@link #checkDanger}, but the states the wave crosses keep driving to the
     * point rather than braking where the wave first touches us. Also keeps where we are
     * when the wave reaches our centre, and the states before, for the second wave.
     */
    private GoToOption goToDanger(RobotState myState, MoveController moveCtrl, Wave surfWave,
                                  Point2D.Double point) {
        RobotStateLog log = new RobotStateLog();
        List<RobotState> dangerStates = new ArrayList<>();
        RobotState predicted = myState;
        RobotState passed = myState;
        boolean waveHit = false;
        for (int t = 0; t < MAX_PREDICTION; t++) {
            if (!waveHit && surfWave.checkWavePosition(predicted,
                    Wave.WavePosition.BREAKING_FRONT) == Wave.WavePosition.BREAKING_FRONT) {
                RobotState ds = predicted;
                for (int u = 0; u < MAX_PREDICTION
                        && surfWave.checkWavePosition(ds, true) != Wave.WavePosition.GONE; u++) {
                    dangerStates.add(ds);
                    ds = goToStep(ds, point);
                }
                waveHit = true;
            }
            Wave.WavePosition pos = surfWave.checkWavePosition(predicted, true);
            passed = predicted;
            if (pos == Wave.WavePosition.BREAKING_CENTER || pos == Wave.WavePosition.GONE) break;
            log.addState(predicted);
            predicted = goToStep(predicted, point);
        }
        // No state met the wave within MAX_PREDICTION ticks: nothing to score.
        double danger = dangerStates.isEmpty() ? 0
            : waveDanger(myState, moveCtrl, surfWave, 0, dangerStates, myState.location,
                passed.location);
        return new GoToOption(point, danger, passed, log);
    }

    /**
     * The second wave's danger after reaching {@code o}; a STOP there is predicted along
     * {@code side}, the way this candidate goes round, not the last surf's.
     *
     * @param myState our real state now
     * @param moveCtrl the waves and danger views
     * @param o the candidate, with its state when the first wave passes and its log
     * @param side the candidate's way round
     * @param cutoff passed on to {@link #checkDanger}
     * @return the least danger of the three options against the second wave
     */
    private double secondWaveDanger(RobotState myState, MoveController moveCtrl, GoToOption o,
                                    SurfOption side, double cutoff) {
        boolean clockwise = side == SurfOption.CLOCKWISE;
        double best = Double.POSITIVE_INFINITY;
        for (SurfOption option : SurfOption.values()) {
            best = Math.min(best, checkDanger(myState, moveCtrl, o.passed, option, clockwise, 1, 2,
                cutoff, (RobotStateLog) o.log.clone()));
        }
        return best;
    }

    /**
     * One tick of driving to {@code point} and stopping there, front or back first.
     *
     * @param state the state before the tick
     * @param point where to stop, in px
     * @return the state after the tick, by the engine's movement rules
     */
    RobotState goToStep(RobotState state, Point2D.Double point) {
        double dist = state.location.distance(point);
        // Within half a pixel: there already, just brake.
        if (dist < 0.5) return predictor.predict(state, 0, 0, 8.0, 1, false);
        double turn = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(state.location, point) - state.heading);
        double distance = dist;
        // Back as front: a point behind us is reached reversing, with less than 90 degrees
        // of turn, since Robocode robots drive as well backward as forward.
        if (Math.abs(turn) > Math.PI / 2) {
            turn -= Math.signum(turn) * Math.PI;
            distance = -dist;
        }
        return predictor.predict(state, distance, turn, 8.0, 1, false);
    }

    /**
     * The orders that drive to {@code point} and stop there, matching {@link #goToStep}: the
     * engine brakes so as to stop on the given distance.
     */
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

    /**
     * Go-to surfing's pick on the last tick; null in the three-option mode.
     *
     * @return the point, in px, or null
     */
    public Point2D.Double goToPoint() {
        return mode == Mode.GO_TO ? goToPoint : null;
    }

    /** A go-to candidate with its first-wave danger and what the second wave needs from it. */
    private static final class GoToOption {
        final Point2D.Double point;
        final double danger;
        final RobotState passed;
        final RobotStateLog log;

        GoToOption(Point2D.Double point, double danger, RobotState passed, RobotStateLog log) {
            this.point = point;
            this.danger = danger;
            this.passed = passed;
            this.log = log;
        }
    }

    /** The logged predicted states in which {@code surfWave} is crossing our hit box. */
    private List<RobotState> replaySurfStates(Wave surfWave, RobotStateLog log) {
        List<RobotState> dangerStates = new ArrayList<>();
        log.forAllStates(state -> {
            if (surfWave.checkWavePosition(state).isBreaking()) {
                dangerStates.add(state);
            }
        });
        return dangerStates;
    }

    /**
     * Where an orbit option drives: the precise maximum escape point on that side, the
     * furthest round the wave's source we could reach before the wave does, orbiting at
     * the surf's attack angle and wall-smoothed. For the first wave, the orbit already being
     * driven keeps its destination for the rest of that wave, so it does not drift.
     */
    private Point2D.Double surfDestination(Wave surfWave, int surfWaveIndex,
                                            RobotState startState, SurfOption option) {
        if (surfWaveIndex == 0 && lastSurfOption == option && lastSurfDestination != null) {
            return lastSurfDestination;
        }
        double attackAngle = surfAttackAngle(
            surfWave.sourceLocation.distance(startState.location));
        MaxEscapeTarget meaTarget = predictor.preciseEscapeAngle(
            option.direction, surfWave.sourceLocation, surfWave.fireTime,
            surfWave.bulletSpeed(), startState, attackAngle, MEA_WALL_STICK);
        return meaTarget.location;
    }

    /**
     * One predicted tick of the surf's drive: toward {@code surfDest}, wall-smoothed on
     * {@code smoothOption}'s side, at up to {@code maxVelocity}, as {@link #surf} orders it.
     *
     * @param state the state before the tick
     * @param surfDest the destination, in px
     * @param maxVelocity 8 to drive, 0 to brake
     * @param smoothOption the side to wall-smooth along (not STOP)
     * @return the state after the tick
     */
    RobotState predictSurfLocation(RobotState state, Point2D.Double surfDest,
                                    double maxVelocity, SurfOption smoothOption) {
        double goAngle = battleField.wallSmoothing(state.location,
            DiaUtils.absoluteBearing(state.location, surfDest),
            smoothOption.direction, WALL_STICK);
        return predictor.nextLocation(state, maxVelocity, goAngle, false);
    }

    /**
     * How much a move from {@code start} to {@code predicted} scales a wave's danger for
     * its change in distance to {@code enemy}: {@code 2.5^(d0 / d1) / 2.5}, where d0 is the
     * distance before and d1 after. Holding the distance gives 1; halving it gives 2.5;
     * doubling it about 0.63. So among equally safe moves the surf prefers the ones that do
     * not close in.
     *
     * @param start where the move starts, in px
     * @param predicted where it ends, in px
     * @param enemy the wave's source, in px
     * @return the factor, above 0
     */
    double distancingDanger(Point2D.Double start, Point2D.Double predicted,
                            Point2D.Double enemy) {
        double distToEnemy = enemy.distance(start);
        double predictedDist = enemy.distance(predicted);
        double quotient = distToEnemy / predictedDist;
        return Math.pow(DISTANCING_DANGER_BASE, quotient) / DISTANCING_DANGER_BASE;
    }

    /**
     * The surf's attack angle at {@code distance}: 0.6 times the relative error
     * {@code (distance - desired) / desired}, in radians, capped at
     * {@link #MAX_ATTACK_ANGLE} either way. Positive (too far) turns the orbit toward the
     * source, negative away.
     */
    private double surfAttackAngle(double distance) {
        double factor = (distance - desiredDistance) / desiredDistance;
        return DiaUtils.limit(-MAX_ATTACK_ANGLE, factor * 0.6, MAX_ATTACK_ANGLE);
    }

    /**
     * The orbit's attack angle: as {@link #surfAttackAngle}, but 1.65 times the relative
     * error, so with no wave to dodge the distance is corrected faster.
     */
    private double orbitAttackAngle(double distance) {
        double factor = (distance - desiredDistance) / desiredDistance;
        return DiaUtils.limit(-MAX_ATTACK_ANGLE, factor * 1.65, MAX_ATTACK_ANGLE);
    }

    /** The three-option surf's choices; {@link #direction} is the orbit sign. */
    public enum SurfOption {
        /** Orbit counter-clockwise round the source at full speed. */
        COUNTER_CLOCKWISE(-1),
        /** Brake and stay. */
        STOP(0),
        /** Orbit clockwise round the source at full speed. */
        CLOCKWISE(1);

        /**
         * +1 clockwise, -1 counter-clockwise, 0 for a stop: the sign that turns the bearing
         * from the source into the orbit's heading ({@code bearing + direction * pi / 2}),
         * and the side wall smoothing turns to.
         */
        public final int direction;

        SurfOption(int direction) {
            this.direction = direction;
        }
    }
}
