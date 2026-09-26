package hadur2.core.move;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;

import java.awt.geom.Point2D;
import java.util.*;

public class SurfMover {

    private static final double DESIRED_DISTANCE = 650.0;
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

    public SurfMover(BattleField battleField, MovementPredictor predictor) {
        this.battleField = battleField;
        this.predictor = predictor;
    }

    public void initRound() {
        lastSurfDestination = null;
        stopDestination = null;
        lastWaveSurfed = null;
    }

    public void move(BotOrders.Builder orders, RobotState myState,
                     MoveController moveCtrl, Point2D.Double enemyLocation,
                     int wavesToSurf) {
        Wave surfWave = moveCtrl.findSurfableWave(0, myState);
        if (surfWave == null) {
            orbit(orders, myState.heading, myState.location, enemyLocation);
        } else {
            surf(orders, myState, moveCtrl, surfWave, wavesToSurf);
        }
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

        Wave.Intersection intersection = surfWave.preciseIntersection(dangerStates);
        double hitRate = moveCtrl.normalizedEnemyHitRate();
        double danger = hitRate + moveCtrl.getDangerScore(surfWave, intersection, surfWaveIndex);
        danger *= Rules.getBulletDamage(surfWave.bulletPower());

        double currentDist = myState.location.distance(surfWave.sourceLocation);
        double currentWaveDist = currentDist - surfWave.distanceTraveled(myState.time);
        double timeToImpact = Math.max(1.0, currentWaveDist / surfWave.bulletSpeed());
        danger /= timeToImpact;

        danger *= distancingDanger(startState.location, passedState.location,
            surfWave.sourceLocation);

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
        double factor = (distance - DESIRED_DISTANCE) / DESIRED_DISTANCE;
        return DiaUtils.limit(-MAX_ATTACK_ANGLE, factor * 0.6, MAX_ATTACK_ANGLE);
    }

    private double orbitAttackAngle(double distance) {
        double factor = (distance - DESIRED_DISTANCE) / DESIRED_DISTANCE;
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
