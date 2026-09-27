package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class Wave implements Cloneable {

    public static final double PRECISE_MEA_WALL_STICK = 120.0;
    public static final Point2D.Double ORIGIN = new Point2D.Double(0, 0);
    public static final double MAX_BOT_RADIUS = 18.0 / Math.cos(Math.PI / 4);

    public String botName;
    public Point2D.Double sourceLocation;
    public Point2D.Double targetLocation;
    public double absBearing;
    public int fireRound;
    public long fireTime;
    public int orbitDirection;
    public double targetHeading;
    public double targetRelativeHeading;
    public double targetVelocity;
    public int targetVelocitySign;
    public double targetAccel;
    public double targetDistance;
    public long targetDchangeTime;
    public long targetVchangeTime;
    public double targetWallDistance;
    public double targetRevWallDistance;
    public double targetDl8t;
    public double targetDl20t;
    public double targetDl40t;
    public double targetEnergy;
    public double sourceEnergy;
    public double gunHeat;
    public int enemiesAlive;
    public long lastBulletFiredTime;
    public boolean hitByBullet;
    public boolean bulletHitBullet;
    public boolean firingWave;
    public boolean altWave;

    private double bulletPower;
    private double bulletSpeed;
    private double maxEscapeAngle;

    private BattleField battleField;
    private MovementPredictor predictor;

    private Double cachedPositiveEscapeAngle;
    private Double cachedNegativeEscapeAngle;

    /**
     * MOVE-1: firing angles (absolute, from the source) where one of our bullets meets this
     * wave's bullet, as disjoint {@code [low, high]} pairs; empty when none of ours crosses it.
     */
    private List<double[]> shadows = new ArrayList<>();
    /** MOVE-1: the angles that may meet one of ours, depending on the engine's bullet order. */
    private List<double[]> possibleShadows = new ArrayList<>();
    /** MOVE-1: whether this wave has ever had a shadow, for the round's count. */
    public boolean everShadowed;

    protected Wave() {}

    public Wave(String botName, Point2D.Double sourceLocation, Point2D.Double targetLocation,
                int fireRound, long fireTime, double bulletPower,
                double targetHeading, double targetVelocity, int targetVelocitySign,
                BattleField battleField, MovementPredictor predictor) {
        this.botName = botName;
        this.sourceLocation = sourceLocation;
        this.targetLocation = targetLocation;
        this.fireRound = fireRound;
        this.fireTime = fireTime;
        setBulletPower(bulletPower);
        this.targetHeading = targetHeading;
        this.targetVelocity = targetVelocity;
        this.targetVelocitySign = targetVelocitySign;
        this.battleField = battleField;
        this.predictor = predictor;
        this.absBearing = DiaUtils.absoluteBearing(sourceLocation, targetLocation);
        double relativeHeading = Angles.normalRelativeAngle(
            effectiveHeading() - absBearing);
        this.orbitDirection = relativeHeading < 0 ? -1 : 1;
        this.targetRelativeHeading = Math.abs(relativeHeading);
        this.hitByBullet = false;
        this.bulletHitBullet = false;
        this.firingWave = false;
        this.altWave = false;
    }

    /** MOVE-1: replaces the wave's bullet shadows (see {@link #shadows()}); the possible ones are the certain ones. */
    public Wave setShadows(List<double[]> shadows) {
        return setShadows(shadows, shadows);
    }

    /**
     * MOVE-1: replaces the wave's certain shadows and the possible ones (which include the
     * certain ones): angles a bullet of ours meets whatever order the engine moves them in,
     * and angles it meets in one order of the two.
     */
    public Wave setShadows(List<double[]> certain, List<double[]> possible) {
        this.shadows = certain;
        this.possibleShadows = possible;
        return this;
    }

    public List<double[]> possibleShadows() {
        return possibleShadows;
    }

    public List<double[]> shadows() {
        return shadows;
    }

    /**
     * MOVE-1: the share of the firing angles that would hit a robot at {@code intersection}
     * that fall in a bullet shadow, in [0, 1]. A bullet fired at a shadowed angle meets one
     * of ours first and never arrives.
     */
    public double shadowedFraction(Intersection intersection) {
        if (possibleShadows.isEmpty() || intersection == null || !(intersection.bandwidth > 0)) return 0;
        // A possible shadow stops the bullet about half the time.
        return (covered(shadows, intersection) + covered(possibleShadows, intersection)) / 2;
    }

    private static double covered(List<double[]> intervals, Intersection intersection) {
        double low = intersection.angle - intersection.bandwidth;
        double high = intersection.angle + intersection.bandwidth;
        double covered = 0;
        for (double[] shadow : intervals) {
            double from = DiaUtils.normalizeAngle(shadow[0], intersection.angle);
            double to = from + (shadow[1] - shadow[0]);
            covered += Math.max(0, Math.min(high, to) - Math.max(low, from));
        }
        return Math.min(1.0, covered / (high - low));
    }

    /** MOVE-1: whether a bullet fired along {@code angle} from the source may meet one of ours. */
    public boolean inShadow(double angle, double tolerance) {
        for (double[] shadow : possibleShadows) {
            double a = DiaUtils.normalizeAngle(angle, (shadow[0] + shadow[1]) / 2);
            if (a >= shadow[0] - tolerance && a <= shadow[1] + tolerance) return true;
        }
        return false;
    }

    public Wave setBulletPower(double power) {
        this.bulletPower = power;
        this.bulletSpeed = 20.0 - 3.0 * power;
        this.maxEscapeAngle = Math.asin(8.0 / bulletSpeed);
        cachedPositiveEscapeAngle = null;
        cachedNegativeEscapeAngle = null;
        return this;
    }

    public Wave setAbsBearing(double absBearing) {
        this.absBearing = absBearing;
        return this;
    }

    public Wave setAccel(double accel) { this.targetAccel = accel; return this; }
    public Wave setDistance(double d) { this.targetDistance = d; return this; }
    public Wave setDchangeTime(long t) { this.targetDchangeTime = t; return this; }
    public Wave setVchangeTime(long t) { this.targetVchangeTime = t; return this; }
    public Wave setDistanceLast8Ticks(double d) { this.targetDl8t = d; return this; }
    public Wave setDistanceLast20Ticks(double d) { this.targetDl20t = d; return this; }
    public Wave setDistanceLast40Ticks(double d) { this.targetDl40t = d; return this; }
    public Wave setTargetEnergy(double e) { this.targetEnergy = e; return this; }
    public Wave setSourceEnergy(double e) { this.sourceEnergy = e; return this; }
    public Wave setGunHeat(double h) { this.gunHeat = h; return this; }
    public Wave setEnemiesAlive(int n) { this.enemiesAlive = n; return this; }
    public Wave setLastBulletFiredTime(long t) { this.lastBulletFiredTime = t; return this; }
    public Wave setAltWave(boolean b) { this.altWave = b; return this; }
    public Wave setFiringWave(boolean b) { this.firingWave = b; return this; }
    public Wave setHitByBullet(boolean b) { this.hitByBullet = b; return this; }
    public Wave setBulletHitBullet(boolean b) { this.bulletHitBullet = b; return this; }

    public double bulletPower() { return bulletPower; }
    public double bulletSpeed() { return bulletSpeed; }
    public double maxEscapeAngle() { return maxEscapeAngle; }

    public double effectiveHeading() {
        return Angles.normalAbsoluteAngle(
            targetHeading + (targetVelocitySign == 1 ? 0 : Math.PI));
    }

    public double distanceTraveled(long currentTime) {
        return (currentTime - fireTime) * bulletSpeed;
    }

    public double lateralVelocity() {
        return Math.sin(targetRelativeHeading) * (targetVelocitySign * targetVelocity);
    }

    public boolean processedBulletHit() {
        return hitByBullet || bulletHitBullet;
    }

    public double virtuality() {
        long timeSinceLastBullet = fireTime - lastBulletFiredTime;
        long timeToNextBullet = Math.round(Math.ceil(gunHeat * 10.0));
        if (firingWave) return 0.0;
        if (lastBulletFiredTime > 0) {
            return Math.min(timeSinceLastBullet, timeToNextBullet) / 8.0;
        }
        return Math.min(1.0, timeToNextBullet / 8.0);
    }

    public void setWallDistances() {
        targetWallDistance = Math.min(1.5,
            battleField.orbitalWallDistance(sourceLocation, targetLocation, bulletPower, orbitDirection));
        targetRevWallDistance = Math.min(1.5,
            battleField.orbitalWallDistance(sourceLocation, targetLocation, bulletPower, -orbitDirection));
    }

    public double firingAngle(double guessFactor) {
        return absBearing + guessFactor * orbitDirection * maxEscapeAngle;
    }

    public double firingAngleFromTargetLocation(Point2D.Double firingTarget) {
        return Angles.normalAbsoluteAngle(
            DiaUtils.absoluteBearing(sourceLocation, firingTarget));
    }

    // Displacement vector: encode enemy's movement relative to orbit direction
    public Point2D.Double displacementVector(RobotState waveBreakState) {
        return displacementVector(waveBreakState.location, waveBreakState.time);
    }

    public Point2D.Double displacementVector(Point2D.Double botLocation, long time) {
        double vectorBearing = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(targetLocation, botLocation) - effectiveHeading());
        double vectorDistance = targetLocation.distance(botLocation) / (time - fireTime);
        return DiaUtils.project(ORIGIN, vectorBearing * orbitDirection, vectorDistance);
    }

    // Project a displacement vector to a firing location
    public Point2D.Double projectLocationFromDisplacementVector(Point2D.Double dispVector) {
        return projectLocation(sourceLocation, dispVector, 0);
    }

    public Point2D.Double projectLocationBlind(Point2D.Double myNextLocation,
            Point2D.Double dispVector, long currentTime) {
        return projectLocation(myNextLocation, dispVector, currentTime - fireTime + 1);
    }

    Point2D.Double projectLocation(Point2D.Double firingLocation,
            Point2D.Double dispVector, long extraTicks) {
        double dispAngle = effectiveHeading()
            + DiaUtils.absoluteBearing(ORIGIN, dispVector) * orbitDirection;
        double dispDistance = ORIGIN.distance(dispVector);
        Point2D.Double projectedLocation = targetLocation;
        long bulletTicks = -1;
        long prevBulletTicks = -1;
        long prevPrevBulletTicks;
        double daSin = Math.sin(dispAngle);
        double daCos = Math.cos(dispAngle);
        do {
            prevPrevBulletTicks = prevBulletTicks;
            prevBulletTicks = bulletTicks;
            bulletTicks = DiaUtils.bulletTicksFromSpeed(
                firingLocation.distance(projectedLocation), bulletSpeed) - 1;
            projectedLocation = DiaUtils.project(targetLocation, daSin, daCos,
                (bulletTicks + extraTicks) * dispDistance);
        } while (bulletTicks != prevBulletTicks && bulletTicks != prevPrevBulletTicks);
        return projectedLocation;
    }

    // Guess factor from a target location
    public double guessFactor(Point2D.Double targetLoc) {
        return guessFactor(DiaUtils.absoluteBearing(sourceLocation, targetLoc));
    }

    public double guessFactor(double bearingToTarget) {
        return guessAngle(bearingToTarget) / maxEscapeAngle;
    }

    public double guessAngle(double bearingToTarget) {
        return orbitDirection * Angles.normalRelativeAngle(bearingToTarget - absBearing);
    }

    public double guessFactorPrecise(Point2D.Double targetLoc) {
        double bearing = DiaUtils.absoluteBearing(sourceLocation, targetLoc);
        double guessAngle = orbitDirection * Angles.normalRelativeAngle(bearing - absBearing);
        double mea = preciseEscapeAngle(guessAngle >= 0);
        return guessAngle / mea;
    }

    public double preciseEscapeAngle(boolean positiveGF) {
        if (positiveGF) {
            if (cachedPositiveEscapeAngle == null) {
                cachedPositiveEscapeAngle = calculatePreciseEscapeAngle(true).angle;
            }
            return cachedPositiveEscapeAngle;
        }
        if (cachedNegativeEscapeAngle == null) {
            cachedNegativeEscapeAngle = calculatePreciseEscapeAngle(false).angle;
        }
        return cachedNegativeEscapeAngle;
    }

    public double escapeAngleRange() {
        return preciseEscapeAngle(true) + preciseEscapeAngle(false);
    }

    public MaxEscapeTarget calculatePreciseEscapeAngle(boolean positiveGF) {
        RobotState startState = RobotState.newBuilder()
            .setLocation((Point2D.Double) targetLocation.clone())
            .setHeading(targetHeading).setVelocity(targetVelocity)
            .setTime(fireTime).build();
        return predictor.preciseEscapeAngle(
            orbitDirection * (positiveGF ? 1 : -1),
            sourceLocation, fireTime, bulletSpeed, startState, PRECISE_MEA_WALL_STICK);
    }

    // Wave position checking
    public WavePosition checkWavePosition(RobotState currentState) {
        return checkWavePosition(currentState, false, null);
    }

    public WavePosition checkWavePosition(RobotState currentState, boolean skipMidair) {
        return checkWavePosition(currentState, skipMidair, null);
    }

    public WavePosition checkWavePosition(RobotState currentState, WavePosition maxPosition) {
        return checkWavePosition(currentState, false, maxPosition);
    }

    public WavePosition checkWavePosition(RobotState currentState,
            boolean skipMidair, WavePosition maxPosition) {
        Point2D.Double location = currentState.location;
        double enemyDistSq = sourceLocation.distanceSq(location);
        double endBulletDistance = distanceTraveled(currentState.time + 1);

        if (!skipMidair && (maxPosition == WavePosition.MIDAIR
                || enemyDistSq > DiaUtils.square(endBulletDistance + MAX_BOT_RADIUS)
                || distancePointToBot(sourceLocation, currentState) > endBulletDistance)) {
            return WavePosition.MIDAIR;
        }
        if (maxPosition == WavePosition.BREAKING_FRONT
                || enemyDistSq > DiaUtils.square(endBulletDistance)) {
            return WavePosition.BREAKING_FRONT;
        }
        if (maxPosition == WavePosition.BREAKING_CENTER) {
            return WavePosition.BREAKING_CENTER;
        }

        double startBulletDistance = distanceTraveled(currentState.time);
        for (Point2D.Double corner : currentState.botCorners()) {
            if (corner.distanceSq(sourceLocation) > DiaUtils.square(startBulletDistance)) {
                return WavePosition.BREAKING_CENTER;
            }
        }
        return WavePosition.GONE;
    }

    private static double distancePointToBot(Point2D.Double point, RobotState state) {
        double x = state.location.x, y = state.location.y;
        if (point.x > x - 18 && point.x < x + 18 && point.y > y - 18 && point.y < y + 18) {
            return 0;
        }
        double distance = Double.POSITIVE_INFINITY;
        for (Line2D.Double side : state.botSides()) {
            distance = Math.min(distance, side.ptSegDist(point));
        }
        return distance;
    }

    // Precise intersection for VG scoring and movement danger
    public Intersection preciseIntersection(List<RobotState> waveBreakStates) {
        if (waveBreakStates == null || waveBreakStates.isEmpty()) return null;

        List<Double> aimAngles = new ArrayList<>();
        for (RobotState state : waveBreakStates) {
            double waveStartR = bulletSpeed * (state.time - fireTime);
            double waveEndR = bulletSpeed * (state.time - fireTime + 1);
            for (Point2D.Double corner : state.botCorners()) {
                double cornerDist = corner.distance(sourceLocation);
                if (cornerDist <= waveEndR && cornerDist >= waveStartR) {
                    aimAngles.add(DiaUtils.absoluteBearing(sourceLocation, corner));
                }
            }
            for (Line2D.Double side : state.botSides()) {
                addCircleLineIntersections(aimAngles, sourceLocation, waveStartR, side);
                addCircleLineIntersections(aimAngles, sourceLocation, waveEndR, side);
            }
        }
        if (aimAngles.isEmpty()) return null;

        double ref = aimAngles.get(0);
        double minAngle = ref, maxAngle = ref;
        for (double angle : aimAngles) {
            double norm = DiaUtils.normalizeAngle(angle, ref);
            minAngle = Math.min(minAngle, norm);
            maxAngle = Math.max(maxAngle, norm);
        }
        double center = (minAngle + maxAngle) / 2;
        double bandwidth = maxAngle - center;
        return new Intersection(center, bandwidth);
    }

    private static void addCircleLineIntersections(List<Double> angles,
            Point2D.Double center, double radius, Line2D.Double line) {
        double dx = line.x2 - line.x1;
        double dy = line.y2 - line.y1;
        double fx = line.x1 - center.x;
        double fy = line.y1 - center.y;
        double a = dx * dx + dy * dy;
        double b = 2 * (fx * dx + fy * dy);
        double c = fx * fx + fy * fy - radius * radius;
        double disc = b * b - 4 * a * c;
        if (disc < 0) return;
        disc = Math.sqrt(disc);
        double t1 = (-b - disc) / (2 * a);
        double t2 = (-b + disc) / (2 * a);
        if (t1 >= 0 && t1 <= 1) {
            angles.add(DiaUtils.absoluteBearing(center,
                new Point2D.Double(line.x1 + t1 * dx, line.y1 + t1 * dy)));
        }
        if (t2 >= 0 && t2 <= 1 && Math.abs(t2 - t1) > 1e-10) {
            angles.add(DiaUtils.absoluteBearing(center,
                new Point2D.Double(line.x1 + t2 * dx, line.y1 + t2 * dy)));
        }
    }

    @Override
    public Object clone() {
        Wave w = new Wave(botName, sourceLocation, targetLocation, fireRound, fireTime,
            bulletPower, targetHeading, targetVelocity, targetVelocitySign,
            battleField, predictor);
        w.absBearing = absBearing;
        w.targetAccel = targetAccel;
        w.targetDistance = targetDistance;
        w.targetDchangeTime = targetDchangeTime;
        w.targetVchangeTime = targetVchangeTime;
        w.targetDl8t = targetDl8t;
        w.targetDl20t = targetDl20t;
        w.targetDl40t = targetDl40t;
        w.targetEnergy = targetEnergy;
        w.sourceEnergy = sourceEnergy;
        w.altWave = altWave;
        w.firingWave = firingWave;
        w.hitByBullet = hitByBullet;
        w.bulletHitBullet = bulletHitBullet;
        w.enemiesAlive = enemiesAlive;
        w.lastBulletFiredTime = lastBulletFiredTime;
        w.gunHeat = gunHeat;
        w.targetWallDistance = targetWallDistance;
        w.targetRevWallDistance = targetRevWallDistance;
        return w;
    }

    public static class Intersection {
        public final double angle;
        public final double bandwidth;

        public Intersection(double angle, double bandwidth) {
            this.angle = angle;
            this.bandwidth = bandwidth;
        }
    }

    public enum WavePosition {
        MIDAIR(0, false),
        BREAKING_FRONT(1, true),
        BREAKING_CENTER(2, true),
        GONE(3, false);

        private final int index;
        private final boolean breaking;

        WavePosition(int index, boolean breaking) {
            this.index = index;
            this.breaking = breaking;
        }

        public int getIndex() { return index; }
        public boolean isBreaking() { return breaking; }
    }
}
