package hadur2.core.move;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;

import java.awt.geom.Point2D;
import java.util.*;

public class SurfMover {

    /** 1.20's fixed distance; the distance policy moves it from S5 (DIST-1, END-1). */
    public static final double DEFAULT_DISTANCE = 650.0;
    private static final double WALL_STICK = 160.0;
    private static final double MEA_WALL_STICK = 100.0;
    private static final double DISTANCING_DANGER_BASE = 2.5;
    private static final double MAX_ATTACK_ANGLE = Math.PI * 0.45;

    private final BattleField battleField;
    private final MovementPredictor predictor;

    private SurfOption lastSurfOption = SurfOption.CLOCKWISE;
    private Point2D.Double lastSurfDestination;
    private Point2D.Double stopDestination;
    private final Map<SurfOption, Double> surfOptionDangers = new HashMap<>();
    private final Map<SurfOption, Point2D.Double> surfOptionDestinations = new HashMap<>();
    private Wave lastWaveSurfed;
    private double desiredDistance = DEFAULT_DISTANCE;
    /** The surf mode for the wave being surfed, and the one the next wave starts with (MOVE-2). */
    private Mode mode = Mode.OPTIONS;
    private Mode nextMode = Mode.OPTIONS;
    /** Go-to surfing: the point chosen on the last tick, for the SD record. */
    private Point2D.Double goToPoint;

    public SurfMover(BattleField battleField, MovementPredictor predictor) {
        this.battleField = battleField;
        this.predictor = predictor;
    }

    /** The distance the surf's and the orbit's attack angles steer toward. */
    public void setDesiredDistance(double desiredDistance) {
        this.desiredDistance = desiredDistance;
    }

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

    public void setMode(Mode mode) {
        this.nextMode = mode;
    }

    /** The mode surfing the current wave. */
    public Mode mode() {
        return mode;
    }

    /**
     * END-2: drive straight at the enemy at full speed, front or back first, whichever needs
     * less turning. A disabled robot cannot shoot, so there is nothing to surf.
     */
    public void ram(BotOrders.Builder orders, RobotState myState, Point2D.Double enemyLocation) {
        orders.maxVelocity(8.0);
        DiaUtils.setBackAsFront(orders, myState.heading,
            DiaUtils.absoluteBearing(myState.location, enemyLocation));
        lastSurfDestination = null;
        stopDestination = null;
    }

    public void initRound() {
        lastSurfDestination = null;
        stopDestination = null;
        lastWaveSurfed = null;
        goToPoint = null;
    }

    /**
     * Surfs the first surfable wave (and {@code wavesToSurf - 1} behind it), or orbits when
     * there is none. {@code goToAllowed} is false while the tick budget is short (TIME-1):
     * go-to surfing then falls back to the three options.
     */
    public void move(BotOrders.Builder orders, RobotState myState,
                     MoveController moveCtrl, Point2D.Double enemyLocation,
                     int wavesToSurf, boolean goToAllowed) {
        Wave surfWave = moveCtrl.findSurfableWave(0, myState);
        if (surfWave == null) {
            orbit(orders, myState.heading, myState.location, enemyLocation);
            return;
        }
        if (surfWave != lastWaveSurfed) mode = nextMode;
        if (mode == Mode.GO_TO && goToAllowed) {
            goToSurf(orders, myState, moveCtrl, surfWave, wavesToSurf);
        } else {
            surf(orders, myState, moveCtrl, surfWave, wavesToSurf);
        }
    }

    public void move(BotOrders.Builder orders, RobotState myState,
                     MoveController moveCtrl, Point2D.Double enemyLocation,
                     int wavesToSurf) {
        move(orders, myState, moveCtrl, enemyLocation, wavesToSurf, true);
    }

    private void orbit(BotOrders.Builder orders, double heading, Point2D.Double myLocation,
                       Point2D.Double enemyLocation) {
        orders.maxVelocity(8.0);
        double orbitAbsBearing = DiaUtils.absoluteBearing(enemyLocation, myLocation);
        double retreatAngle = orbitAttackAngle(myLocation.distance(enemyLocation));

        double ccwAngle = orbitAbsBearing + SurfOption.COUNTER_CLOCKWISE.direction
            * (Math.PI / 2 + retreatAngle);
        ccwAngle = battleField.wallSmoothing(myLocation, ccwAngle,
            SurfOption.COUNTER_CLOCKWISE.direction, WALL_STICK);

        double cwAngle = orbitAbsBearing + SurfOption.CLOCKWISE.direction
            * (Math.PI / 2 + retreatAngle);
        cwAngle = battleField.wallSmoothing(myLocation, cwAngle,
            SurfOption.CLOCKWISE.direction, WALL_STICK);

        if (Math.abs(Angles.normalRelativeAngle(cwAngle - orbitAbsBearing))
                < Math.abs(Angles.normalRelativeAngle(ccwAngle - orbitAbsBearing))) {
            lastSurfOption = SurfOption.CLOCKWISE;
            DiaUtils.setBackAsFront(orders, heading, cwAngle);
        } else {
            lastSurfOption = SurfOption.COUNTER_CLOCKWISE;
            DiaUtils.setBackAsFront(orders, heading, ccwAngle);
        }
    }

    private void surf(BotOrders.Builder orders, RobotState myState,
                      MoveController moveCtrl, Wave surfWave, int wavesToSurf) {
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

        double goAngle = DiaUtils.absoluteBearing(myState.location, surfDest);
        goAngle = battleField.wallSmoothing(myState.location, goAngle,
            lastSurfOption.direction, WALL_STICK);
        DiaUtils.setBackAsFront(orders, myState.heading, goAngle);
    }

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

    double checkDanger(RobotState myState, MoveController moveCtrl,
                       RobotState startState, SurfOption option,
                       boolean prevClockwise, int surfWaveIndex,
                       int numWaves, double cutoff, RobotStateLog predictedLog) {
        Wave surfWave = moveCtrl.findSurfableWave(surfWaveIndex, myState);
        if (surfWave == null) return 0;

        List<RobotState> dangerStates = new ArrayList<>();
        Wave.WavePosition startPos = surfWave.checkWavePosition(startState);

        if (surfWaveIndex > 0 && startPos != Wave.WavePosition.MIDAIR) {
            dangerStates.addAll(replaySurfStates(surfWave, predictedLog));
        }
        if (startPos == Wave.WavePosition.GONE && dangerStates.isEmpty()) {
            return 0;
        }

        boolean predictClockwise = option == SurfOption.STOP
            ? prevClockwise : (option == SurfOption.CLOCKWISE);
        SurfOption smoothOption = option == SurfOption.STOP
            ? (predictClockwise ? SurfOption.CLOCKWISE : SurfOption.COUNTER_CLOCKWISE)
            : option;
        double maxVelocity = option == SurfOption.STOP ? 0 : 8.0;

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
            if (!waveHit && surfWave.checkWavePosition(predicted,
                    Wave.WavePosition.BREAKING_FRONT) == Wave.WavePosition.BREAKING_FRONT) {
                RobotState ds = predicted;
                do {
                    dangerStates.add(ds);
                    ds = predictSurfLocation(ds, surfDest, 0, smoothOption);
                } while (surfWave.checkWavePosition(ds, true) != Wave.WavePosition.GONE);
                waveHit = true;
            }

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
     */
    private double waveDanger(RobotState myState, MoveController moveCtrl, Wave surfWave,
                              int surfWaveIndex, List<RobotState> dangerStates,
                              Point2D.Double start, Point2D.Double passed) {
        Wave.Intersection intersection = surfWave.preciseIntersection(dangerStates);
        double hitRate = moveCtrl.normalizedEnemyHitRate();
        double danger = hitRate + moveCtrl.getDangerScore(surfWave, intersection, surfWaveIndex);
        double shadowed = surfWave.shadowedFraction(intersection);
        if (shadowed > 0) danger *= 1 - shadowed;
        danger *= Rules.getBulletDamage(surfWave.bulletPower());

        double currentDist = myState.location.distance(surfWave.sourceLocation);
        double currentWaveDist = currentDist - surfWave.distanceTraveled(myState.time);
        double timeToImpact = Math.max(1.0, currentWaveDist / surfWave.bulletSpeed());
        danger /= timeToImpact;

        danger *= distancingDanger(start, passed, surfWave.sourceLocation);
        return danger;
    }

    // Go-to surfing (S6's A/B against the three options).

    /** Candidate stop points are taken every this many ticks along each orbit. */
    static final int GO_TO_SPACING = 2;
    /** Candidates whose first-wave danger is lowest get the second wave's danger added. */
    static final int GO_TO_SECOND_WAVE = 3;
    private static final int MAX_PREDICTION = 150;

    private void goToSurf(BotOrders.Builder orders, RobotState myState, MoveController moveCtrl,
                          Wave surfWave, int wavesToSurf) {
        if (surfWave != lastWaveSurfed) {
            moveCtrl.clearNeighborCache();
            lastWaveSurfed = surfWave;
            lastSurfDestination = null;
            stopDestination = null;
        }
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
                double total = o.danger + secondWaveDanger(myState, moveCtrl, o, bestTotal);
                if (total < bestTotal) {
                    bestTotal = total;
                    best = o;
                }
            }
        }
        goToPoint = best.point;
        double orbitSide = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(surfWave.sourceLocation, best.point)
                - DiaUtils.absoluteBearing(surfWave.sourceLocation, myState.location));
        lastSurfOption = orbitSide < 0 ? SurfOption.COUNTER_CLOCKWISE : SurfOption.CLOCKWISE;
        goTo(orders, myState, best.point);
    }

    /** The stop points: where we stand, and every few ticks along both orbits until the wave passes. */
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
        double danger = dangerStates.isEmpty() ? 0
            : waveDanger(myState, moveCtrl, surfWave, 0, dangerStates, myState.location,
                passed.location);
        return new GoToOption(point, danger, passed, log);
    }

    private double secondWaveDanger(RobotState myState, MoveController moveCtrl, GoToOption o,
                                    double cutoff) {
        boolean clockwise = lastSurfOption == SurfOption.CLOCKWISE;
        double best = Double.POSITIVE_INFINITY;
        for (SurfOption option : SurfOption.values()) {
            best = Math.min(best, checkDanger(myState, moveCtrl, o.passed, option, clockwise, 1, 2,
                cutoff, (RobotStateLog) o.log.clone()));
        }
        return best;
    }

    /** One tick of driving to {@code point} and stopping there, front or back first. */
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

    /** Go-to surfing's pick on the last tick; null in the three-option mode. */
    public Point2D.Double goToPoint() {
        return mode == Mode.GO_TO ? goToPoint : null;
    }

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

    private List<RobotState> replaySurfStates(Wave surfWave, RobotStateLog log) {
        List<RobotState> dangerStates = new ArrayList<>();
        log.forAllStates(state -> {
            if (surfWave.checkWavePosition(state).isBreaking()) {
                dangerStates.add(state);
            }
        });
        return dangerStates;
    }

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

    RobotState predictSurfLocation(RobotState state, Point2D.Double surfDest,
                                    double maxVelocity, SurfOption smoothOption) {
        double goAngle = battleField.wallSmoothing(state.location,
            DiaUtils.absoluteBearing(state.location, surfDest),
            smoothOption.direction, WALL_STICK);
        return predictor.nextLocation(state, maxVelocity, goAngle, false);
    }

    double distancingDanger(Point2D.Double start, Point2D.Double predicted,
                            Point2D.Double enemy) {
        double distToEnemy = enemy.distance(start);
        double predictedDist = enemy.distance(predicted);
        double quotient = distToEnemy / predictedDist;
        return Math.pow(DISTANCING_DANGER_BASE, quotient) / DISTANCING_DANGER_BASE;
    }

    private double surfAttackAngle(double distance) {
        double factor = (distance - desiredDistance) / desiredDistance;
        return DiaUtils.limit(-MAX_ATTACK_ANGLE, factor * 0.6, MAX_ATTACK_ANGLE);
    }

    private double orbitAttackAngle(double distance) {
        double factor = (distance - desiredDistance) / desiredDistance;
        return DiaUtils.limit(-MAX_ATTACK_ANGLE, factor * 1.65, MAX_ATTACK_ANGLE);
    }

    public enum SurfOption {
        COUNTER_CLOCKWISE(-1),
        STOP(0),
        CLOCKWISE(1);

        public final int direction;

        SurfOption(int direction) {
            this.direction = direction;
        }
    }
}
