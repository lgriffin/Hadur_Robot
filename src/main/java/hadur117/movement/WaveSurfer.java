package hadur117.movement;

import robocode.*;
import robocode.util.Utils;
import java.awt.geom.*;
import java.util.*;

/**
 * True wave surfing movement for duel mode.
 *
 * <p>Detects enemy fire via energy drops, builds {@link EnemyWave} objects, and
 * evaluates clockwise vs counter-clockwise movement using segmented danger statistics
 * (distance × velocity × acceleration). Multi-wave surfing uses the second wave as a
 * 35%-weighted tiebreaker. A flattener activates when the overall hit rate exceeds 9%,
 * blending the movement profile into the danger evaluation.</p>
 *
 * <p>Prediction uses precise Robocode physics: max velocity 8, acceleration 1,
 * deceleration 2, turn rate = {@code 10 − 0.75 × |velocity|} degrees/tick. Wall
 * smoothing uses a 160-pixel stick.</p>
 *
 * @see EnemyWave
 */
public class WaveSurfer {

    private static final double MAX_VELOCITY = 8.0;
    private static final double ACCELERATION = 1.0;
    private static final double DECELERATION = 2.0;
    private static final double WALL_MARGIN = 18.0;
    private static final int BINS = 47;
    private static final int CENTER_BIN = (BINS - 1) / 2;
    private static final double STICK = 160.0;

    private static double[][][][] dangerStats = new double[5][5][3][BINS];
    private static double[] moveProfile = new double[BINS];
    private static int totalHitsTaken = 0;
    private static int totalWavesPassed = 0;

    private double fieldWidth, fieldHeight;
    private Rectangle2D.Double fieldRect;

    private final ArrayList<EnemyWave> waves = new ArrayList<>();
    private double lastEnemyEnergy = 100.0;
    private Point2D.Double enemyLocation;
    private int orbitDirection = 1;
    private double lateralVelocity;
    private int roundHitsTaken = 0;

    public WaveSurfer() {
        for (int d = 0; d < 5; d++)
            for (int v = 0; v < 5; v++)
                for (int a = 0; a < 3; a++)
                    dangerStats[d][v][a][CENTER_BIN] =
                            Math.max(dangerStats[d][v][a][CENTER_BIN], 0.001);
    }

    public void init(double bfWidth, double bfHeight) {
        fieldWidth = bfWidth;
        fieldHeight = bfHeight;
        fieldRect = new Rectangle2D.Double(WALL_MARGIN, WALL_MARGIN,
                bfWidth - 2 * WALL_MARGIN, bfHeight - 2 * WALL_MARGIN);
        lastEnemyEnergy = 100.0;
        waves.clear();
        roundHitsTaken = 0;
    }

    public void onScannedRobot(AdvancedRobot robot, ScannedRobotEvent e) {
        Point2D.Double myPos = new Point2D.Double(robot.getX(), robot.getY());
        double absBearing = robot.getHeadingRadians() + e.getBearingRadians();
        enemyLocation = project(myPos, absBearing, e.getDistance());

        double myVel = robot.getVelocity();
        lateralVelocity = myVel * Math.sin(robot.getHeadingRadians() - absBearing);
        if (lateralVelocity != 0)
            orbitDirection = lateralVelocity > 0 ? 1 : -1;

        double energyDelta = lastEnemyEnergy - e.getEnergy();
        if (energyDelta > 0.09 && energyDelta <= 3.01) {
            double bulletSpeed = 20.0 - 3.0 * energyDelta;

            EnemyWave w = new EnemyWave();
            w.fireLocation = new Point2D.Double(enemyLocation.x, enemyLocation.y);
            w.fireTime = robot.getTime() - 1;
            w.bulletSpeed = bulletSpeed;
            w.directAngle = Math.atan2(myPos.x - enemyLocation.x,
                                        myPos.y - enemyLocation.y);
            w.distanceTraveled = bulletSpeed;
            w.lateralDirection = orbitDirection;
            w.distSeg = distSeg(myPos.distance(enemyLocation));
            w.velSeg = velSeg(Math.abs(lateralVelocity));
            w.accelSeg = 2;
            waves.add(w);
        }
        lastEnemyEnergy = e.getEnergy();
        pruneWaves(robot);
    }

    public void doSurfing(AdvancedRobot robot) {
        Point2D.Double myPos = new Point2D.Double(robot.getX(), robot.getY());

        for (EnemyWave w : waves) w.distanceTraveled += w.bulletSpeed;
        pruneWaves(robot);

        EnemyWave wave1 = closestWave(myPos);
        if (wave1 == null) { defaultOrbit(robot); return; }

        EnemyWave wave2 = secondClosestWave(myPos, wave1);

        double dangerCW = evaluateDanger(robot, -1, wave1, wave2);
        double dangerCCW = evaluateDanger(robot, 1, wave1, wave2);

        goDirection(robot, dangerCW < dangerCCW ? -1 : 1, wave1);
    }

    private double evaluateDanger(AdvancedRobot robot, int direction,
                                   EnemyWave wave1, EnemyWave wave2) {
        Point2D.Double pred = predictPosition(robot, direction, wave1);
        int bin = getGFBin(wave1, pred);
        double[] stats = dangerStats[wave1.distSeg][wave1.velSeg][wave1.accelSeg];
        double danger = smoothDanger(stats, bin);

        if (totalWavesPassed > 20 && totalHitsTaken > 0) {
            double hitRate = (double) totalHitsTaken / totalWavesPassed;
            if (hitRate > 0.09) {
                danger += moveProfile[clampBin(bin)] * 0.3;
            }
        }

        if (wave2 != null) {
            Point2D.Double pred2 = predictPositionFrom(pred, robot.getHeadingRadians(),
                    robot.getVelocity(), direction, wave2);
            int bin2 = getGFBin(wave2, pred2);
            double[] stats2 = dangerStats[wave2.distSeg][wave2.velSeg][wave2.accelSeg];
            danger += smoothDanger(stats2, bin2) * 0.35;
        }

        return danger;
    }

    // ── Events ──────────────────────────────────────────────────────────

    public void onHitByBullet(AdvancedRobot robot, HitByBulletEvent e) {
        roundHitsTaken++;
        totalHitsTaken++;

        Point2D.Double myPos = new Point2D.Double(robot.getX(), robot.getY());
        if (!waves.isEmpty()) {
            EnemyWave hitWave = null;
            double closest = Double.MAX_VALUE;
            for (EnemyWave w : waves) {
                double d = Math.abs(w.distanceTraveled - myPos.distance(w.fireLocation));
                if (d < closest) { closest = d; hitWave = w; }
            }
            if (hitWave != null) {
                logHit(hitWave, myPos);
                waves.remove(hitWave);
            }
        }
        orbitDirection *= -1;
    }

    public void onHitWall() {
        orbitDirection *= -1;
    }

    public int getRoundHitsTaken() { return roundHitsTaken; }

    // ── Private helpers ─────────────────────────────────────────────────

    private double smoothDanger(double[] stats, int bin) {
        bin = clampBin(bin);
        double danger = 0;
        for (int i = -2; i <= 2; i++) {
            int idx = bin + i;
            if (idx >= 0 && idx < BINS) {
                double w = 1.0;
                if (Math.abs(i) == 1) w = 0.5;
                else if (Math.abs(i) == 2) w = 0.25;
                danger += stats[idx] * w;
            }
        }
        return danger;
    }

    private int getGFBin(EnemyWave wave, Point2D.Double pos) {
        double offset = Math.atan2(pos.x - wave.fireLocation.x,
                                    pos.y - wave.fireLocation.y)
                        - wave.directAngle;
        double mea = Math.asin(MAX_VELOCITY / wave.bulletSpeed);
        double gf = Utils.normalRelativeAngle(offset) / mea * wave.lateralDirection;
        return clampBin((int) Math.round(gf * CENTER_BIN + CENTER_BIN));
    }

    private void logHit(EnemyWave wave, Point2D.Double hitPos) {
        int bin = clampBin(getGFBin(wave, hitPos));
        double[] stats = dangerStats[wave.distSeg][wave.velSeg][wave.accelSeg];
        for (int i = -2; i <= 2; i++) {
            int idx = bin + i;
            if (idx >= 0 && idx < BINS) {
                double w = 1.0;
                if (Math.abs(i) == 1) w = 0.5;
                else if (Math.abs(i) == 2) w = 0.25;
                stats[idx] += w;
            }
        }
        moveProfile[clampBin(bin)] += 1.0;
    }

    private void goDirection(AdvancedRobot robot, int direction, EnemyWave wave) {
        Point2D.Double myPos = new Point2D.Double(robot.getX(), robot.getY());
        double angleToWave = Math.atan2(wave.fireLocation.x - myPos.x,
                                         wave.fireLocation.y - myPos.y);
        double desired = wallSmooth(myPos, angleToWave + direction * (Math.PI / 2), direction);

        double heading = robot.getHeadingRadians();
        double delta = Utils.normalRelativeAngle(desired - heading);
        double ahead;
        if (Math.abs(delta) > Math.PI / 2) {
            delta = Utils.normalRelativeAngle(delta + Math.PI);
            ahead = -100;
        } else {
            ahead = 100;
        }
        robot.setTurnRightRadians(delta);
        robot.setAhead(ahead);
        robot.setMaxVelocity(MAX_VELOCITY);
    }

    private void defaultOrbit(AdvancedRobot robot) {
        if (enemyLocation == null) {
            robot.setTurnRight(15);
            robot.setAhead(100);
            return;
        }
        Point2D.Double myPos = new Point2D.Double(robot.getX(), robot.getY());
        double angle = Math.atan2(enemyLocation.x - myPos.x,
                                   enemyLocation.y - myPos.y);
        double desired = wallSmooth(myPos, angle + orbitDirection * (Math.PI / 2),
                                     orbitDirection);
        double heading = robot.getHeadingRadians();
        double delta = Utils.normalRelativeAngle(desired - heading);
        double ahead;
        if (Math.abs(delta) > Math.PI / 2) {
            delta = Utils.normalRelativeAngle(delta + Math.PI);
            ahead = -100;
        } else {
            ahead = 100;
        }
        robot.setTurnRightRadians(delta);
        robot.setAhead(ahead);
        robot.setMaxVelocity(MAX_VELOCITY);
    }

    private Point2D.Double predictPosition(AdvancedRobot robot, int direction,
                                            EnemyWave wave) {
        double predX = robot.getX(), predY = robot.getY();
        double predVel = robot.getVelocity();
        double predHeading = robot.getHeadingRadians();

        for (int ticks = 0; ticks < 500; ticks++) {
            double angleToWave = Math.atan2(wave.fireLocation.x - predX,
                                             wave.fireLocation.y - predY);
            double desired = wallSmooth(new Point2D.Double(predX, predY),
                    angleToWave + direction * (Math.PI / 2), direction);

            double delta = Utils.normalRelativeAngle(desired - predHeading);
            int moveSign;
            if (Math.abs(delta) > Math.PI / 2) {
                delta = Utils.normalRelativeAngle(delta + Math.PI);
                moveSign = -1;
            } else {
                moveSign = 1;
            }

            double maxTurn = Math.toRadians(10.0 - 0.75 * Math.abs(predVel));
            delta = clamp(delta, -maxTurn, maxTurn);
            predHeading = Utils.normalAbsoluteAngle(predHeading + delta);

            predVel = simulateVelocity(predVel, MAX_VELOCITY * moveSign);
            predX += Math.sin(predHeading) * predVel;
            predY += Math.cos(predHeading) * predVel;
            predX = clamp(predX, WALL_MARGIN, fieldWidth - WALL_MARGIN);
            predY = clamp(predY, WALL_MARGIN, fieldHeight - WALL_MARGIN);

            double waveTravel = wave.bulletSpeed * (ticks + 1 + (robot.getTime() - wave.fireTime));
            if (waveTravel >= new Point2D.Double(predX, predY).distance(wave.fireLocation))
                break;
        }
        return new Point2D.Double(predX, predY);
    }

    private Point2D.Double predictPositionFrom(Point2D.Double startPos,
                                                double heading, double velocity,
                                                int direction, EnemyWave wave) {
        double predX = startPos.x, predY = startPos.y;
        double predVel = velocity, predHeading = heading;

        for (int ticks = 0; ticks < 200; ticks++) {
            double angleToWave = Math.atan2(wave.fireLocation.x - predX,
                                             wave.fireLocation.y - predY);
            double desired = wallSmooth(new Point2D.Double(predX, predY),
                    angleToWave + direction * (Math.PI / 2), direction);

            double delta = Utils.normalRelativeAngle(desired - predHeading);
            int moveSign;
            if (Math.abs(delta) > Math.PI / 2) {
                delta = Utils.normalRelativeAngle(delta + Math.PI);
                moveSign = -1;
            } else {
                moveSign = 1;
            }

            double maxTurn = Math.toRadians(10.0 - 0.75 * Math.abs(predVel));
            delta = clamp(delta, -maxTurn, maxTurn);
            predHeading = Utils.normalAbsoluteAngle(predHeading + delta);

            predVel = simulateVelocity(predVel, MAX_VELOCITY * moveSign);
            predX += Math.sin(predHeading) * predVel;
            predY += Math.cos(predHeading) * predVel;
            predX = clamp(predX, WALL_MARGIN, fieldWidth - WALL_MARGIN);
            predY = clamp(predY, WALL_MARGIN, fieldHeight - WALL_MARGIN);

            double waveTravel = wave.bulletSpeed * (ticks + 1);
            if (waveTravel >= new Point2D.Double(predX, predY).distance(wave.fireLocation))
                break;
        }
        return new Point2D.Double(predX, predY);
    }

    private double simulateVelocity(double current, double desired) {
        if (current >= 0) {
            if (desired >= 0) return Math.min(current + ACCELERATION, desired);
            double v = Math.max(current - DECELERATION, 0);
            return v == 0 ? Math.max(-ACCELERATION, desired) : v;
        } else {
            if (desired <= 0) return Math.max(current - ACCELERATION, desired);
            double v = Math.min(current + DECELERATION, 0);
            return v == 0 ? Math.min(ACCELERATION, desired) : v;
        }
    }

    private double wallSmooth(Point2D.Double pos, double angle, int direction) {
        for (int i = 0; i < 200; i++) {
            double testX = pos.x + Math.sin(angle) * STICK;
            double testY = pos.y + Math.cos(angle) * STICK;
            if (fieldRect.contains(testX, testY)) return angle;
            angle += direction * 0.05;
        }
        return angle;
    }

    private void pruneWaves(AdvancedRobot robot) {
        Point2D.Double me = new Point2D.Double(robot.getX(), robot.getY());
        Iterator<EnemyWave> it = waves.iterator();
        while (it.hasNext()) {
            EnemyWave w = it.next();
            if (w.distanceTraveled > me.distance(w.fireLocation) + 50) {
                totalWavesPassed++;
                moveProfile[clampBin(getGFBin(w, me))] += 0.1;
                it.remove();
            }
        }
    }

    private EnemyWave closestWave(Point2D.Double me) {
        double closest = Double.MAX_VALUE;
        EnemyWave best = null;
        for (EnemyWave w : waves) {
            double tti = (me.distance(w.fireLocation) - w.distanceTraveled) / w.bulletSpeed;
            if (tti > 0 && tti < closest) { closest = tti; best = w; }
        }
        return best;
    }

    private EnemyWave secondClosestWave(Point2D.Double me, EnemyWave first) {
        double closest = Double.MAX_VALUE;
        EnemyWave best = null;
        for (EnemyWave w : waves) {
            if (w == first) continue;
            double tti = (me.distance(w.fireLocation) - w.distanceTraveled) / w.bulletSpeed;
            if (tti > 0 && tti < closest) { closest = tti; best = w; }
        }
        return best;
    }

    private static int distSeg(double distance) {
        if (distance < 200) return 0;
        if (distance < 350) return 1;
        if (distance < 500) return 2;
        if (distance < 700) return 3;
        return 4;
    }

    private static int velSeg(double absVel) {
        return Math.min((int) (absVel / 2.0), 4);
    }

    private static int clampBin(int bin) {
        return Math.max(0, Math.min(BINS - 1, bin));
    }

    private static Point2D.Double project(Point2D.Double src, double angle, double dist) {
        return new Point2D.Double(src.x + dist * Math.sin(angle),
                                   src.y + dist * Math.cos(angle));
    }

    private static double clamp(double val, double min, double max) {
        return Math.max(min, Math.min(max, val));
    }
}
