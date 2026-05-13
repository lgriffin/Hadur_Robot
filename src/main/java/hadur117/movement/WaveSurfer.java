package hadur117.movement;

import robocode.*;
import robocode.util.Utils;
import java.awt.geom.*;
import java.util.*;

import hadur117.movement.danger.*;

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
    private static final double PROFILE_DECAY = 0.993;

    private static final DangerEnsemble dangerEnsemble = new DangerEnsemble(
            Arrays.asList(new GFDangerModel(), new HeadOnDangerModel(),
                    new LinearDangerModel(), new CircularDangerModel(),
                    new KNNDangerModel()));
    private static double[] moveProfile = new double[BINS];
    private static int totalHitsTaken = 0;
    private static int totalWavesPassed = 0;

    private double fieldWidth, fieldHeight;
    private Rectangle2D.Double fieldRect;

    private final ArrayList<EnemyWave> waves = new ArrayList<>();
    private final ArrayList<OurBullet> ourBullets = new ArrayList<>();
    private double lastEnemyEnergy = 100.0;
    private Point2D.Double enemyLocation;
    private int orbitDirection = 1;
    private double lateralVelocity;
    private double prevLateralVelocity = 0;
    private int roundHitsTaken = 0;
    private static int velChangeTimer = 0;
    private static double prevAbsLatVel = 0;
    private double prevHeading = 0;
    private int prevSurfDirection = 0;
    private double enemyGunHeat = 3.0;
    private static double avgEnemyBulletPower = 1.5;
    private static int enemyFireCount = 0;
    private static double enemyFirePowerSum = 0;

    public WaveSurfer() {
    }

    public void init(double bfWidth, double bfHeight) {
        fieldWidth = bfWidth;
        fieldHeight = bfHeight;
        fieldRect = new Rectangle2D.Double(WALL_MARGIN, WALL_MARGIN,
                bfWidth - 2 * WALL_MARGIN, bfHeight - 2 * WALL_MARGIN);
        lastEnemyEnergy = 100.0;
        waves.clear();
        ourBullets.clear();
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

        double absLat = Math.abs(lateralVelocity);
        if (Math.abs(absLat - prevAbsLatVel) > 0.5) {
            velChangeTimer = 0;
        } else {
            velChangeTimer++;
        }
        prevAbsLatVel = absLat;

        double energyDelta = lastEnemyEnergy - e.getEnergy();
        if (energyDelta > 0.09 && energyDelta <= 3.01) {
            double bulletSpeed = 20.0 - 3.0 * energyDelta;

            removeVirtualWaves();

            enemyFireCount++;
            enemyFirePowerSum += energyDelta;
            avgEnemyBulletPower = enemyFirePowerSum / enemyFireCount;
            enemyGunHeat = 1.0 + energyDelta / 5.0;

            EnemyWave w = buildWave(myPos, enemyLocation, robot, bulletSpeed,
                    absLat, absBearing);
            waves.add(w);
        } else {
            enemyGunHeat = Math.max(0, enemyGunHeat - 0.1);
            if (enemyGunHeat <= 0 && !hasVirtualWave()) {
                double vPower = avgEnemyBulletPower;
                double vBulletSpeed = 20.0 - 3.0 * vPower;

                EnemyWave vw = buildWave(myPos, enemyLocation, robot, vBulletSpeed,
                        absLat, absBearing);
                vw.virtual = true;
                vw.dangerWeight = 0.2;
                waves.add(vw);
            }
        }
        lastEnemyEnergy = e.getEnergy();
        prevLateralVelocity = lateralVelocity;
        prevHeading = robot.getHeadingRadians();
        pruneWaves(robot);
    }

    public void doSurfing(AdvancedRobot robot) {
        doSurfing(robot, "UNKNOWN");
    }

    public void doSurfing(AdvancedRobot robot, String opponentGunType) {
        Point2D.Double myPos = new Point2D.Double(robot.getX(), robot.getY());

        for (EnemyWave w : waves) w.distanceTraveled += w.bulletSpeed;
        pruneWaves(robot);
        pruneOurBullets(robot.getTime());

        EnemyWave wave1 = closestWave(myPos);
        if (wave1 == null) { defaultOrbit(robot); return; }

        EnemyWave wave2 = secondClosestWave(myPos, wave1);

        double dangerCW = evaluateDanger(robot, -1, wave1, wave2, opponentGunType);
        double dangerCCW = evaluateDanger(robot, 1, wave1, wave2, opponentGunType);

        if (prevSurfDirection == -1) dangerCW *= 0.95;
        else if (prevSurfDirection == 1) dangerCCW *= 0.95;
        int direction = dangerCW < dangerCCW ? -1 : 1;
        prevSurfDirection = direction;
        goDirection(robot, direction, wave1);
    }

    private EnemyWave buildWave(Point2D.Double myPos, Point2D.Double enemyLoc,
                                AdvancedRobot robot, double bulletSpeed,
                                double absLat, double absBearing) {
        EnemyWave w = new EnemyWave();
        w.fireLocation = new Point2D.Double(enemyLoc.x, enemyLoc.y);
        w.fireTime = robot.getTime() - 1;
        w.bulletSpeed = bulletSpeed;
        w.directAngle = Math.atan2(myPos.x - enemyLoc.x, myPos.y - enemyLoc.y);
        w.distanceTraveled = bulletSpeed;
        w.lateralDirection = orbitDirection;
        w.distSeg = distSeg(myPos.distance(enemyLoc));
        w.velSeg = velSeg(absLat);
        double absPrevLat = Math.abs(prevLateralVelocity);
        w.accelSeg = absLat > absPrevLat ? 2 : (absLat < absPrevLat ? 0 : 1);
        double wallDist = Math.min(
                Math.min(myPos.x - WALL_MARGIN, fieldWidth - myPos.x - WALL_MARGIN),
                Math.min(myPos.y - WALL_MARGIN, fieldHeight - myPos.y - WALL_MARGIN));
        w.wallSeg = wallDist < 100 ? 0 : 1;
        w.myLateralVelocity = lateralVelocity;
        w.myTurnRate = Utils.normalRelativeAngle(robot.getHeadingRadians() - prevHeading);
        double myVel = robot.getVelocity();
        w.myAdvancingVelocity = myVel * Math.cos(robot.getHeadingRadians() - absBearing);
        double dist = myPos.distance(enemyLoc);
        w.dangerFeatures = new double[]{
                dist / 800.0, absLat / 8.0,
                (absLat - absPrevLat) / 2.0,
                wallDist / 200.0, velChangeTimer / 100.0,
                dist / (bulletSpeed * 50.0),
                w.myAdvancingVelocity / 8.0
        };
        return w;
    }

    private double evaluateDanger(AdvancedRobot robot, int direction,
                                   EnemyWave wave1, EnemyWave wave2,
                                   String opponentGunType) {
        Point2D.Double pred = predictPosition(robot, direction, wave1);

        int[] range = getGFBinRange(wave1, pred);
        double danger = 0;
        for (int b = range[0]; b <= range[1]; b++) {
            danger += dangerEnsemble.blendedDanger(wave1, b);
        }
        danger /= (range[1] - range[0] + 1);
        danger *= wave1.dangerWeight;

        double predDist = pred.distance(wave1.fireLocation);
        double hitRate = totalWavesPassed > 20
                ? (double) totalHitsTaken / totalWavesPassed : 0.07;
        double desiredDist = hitRate > 0.10 ? 550.0 : 700.0;
        double distancingDanger = Math.pow(2.5, desiredDist / Math.max(100, predDist)) / 2.5;
        danger *= distancingDanger;

        double shadowMultiplier = 1.0;
        for (OurBullet bullet : ourBullets) {
            int shadowBin = getShadowBin(bullet, wave1);
            if (shadowBin >= 0) {
                for (int b = range[0]; b <= range[1]; b++) {
                    if (Math.abs(b - shadowBin) <= 1) {
                        shadowMultiplier = Math.min(shadowMultiplier, 0.5);
                        break;
                    }
                }
            }
        }
        danger *= shadowMultiplier;

        if (totalWavesPassed > 10 && totalHitsTaken > 0) {
            if (hitRate > 0.059) {
                double flatProfile = 0;
                for (int b = range[0]; b <= range[1]; b++)
                    flatProfile += moveProfile[clampBin(b)];
                flatProfile /= (range[1] - range[0] + 1);

                double flatWeight = 0.35;
                switch (opponentGunType) {
                    case "HEAD_ON":    flatWeight *= 0.2; break;
                    case "LINEAR":     flatWeight *= 0.4; break;
                }
                double tickDanger = 0.075 * (1.0 + hitRate * 5);
                danger = 0.50 * danger + flatWeight * flatProfile + tickDanger;
            }
        }

        if (wave2 != null) {
            Point2D.Double pred2 = predictPositionFrom(pred, robot.getHeadingRadians(),
                    robot.getVelocity(), direction, wave2);
            int[] range2 = getGFBinRange(wave2, pred2);
            double danger2 = 0;
            for (int b = range2[0]; b <= range2[1]; b++) {
                danger2 += dangerEnsemble.blendedDanger(wave2, b);
            }
            danger2 /= (range2[1] - range2[0] + 1);
            danger += danger2 * 0.35 * wave2.dangerWeight;
        }

        return danger;
    }

    // ── Events ──────────────────────────────────────────────────────────

    public void onHitByBullet(AdvancedRobot robot, HitByBulletEvent e) {
        roundHitsTaken++;
        totalHitsTaken++;

        double hitBulletSpeed = Rules.getBulletSpeed(e.getBullet().getPower());
        Point2D.Double myPos = new Point2D.Double(robot.getX(), robot.getY());
        if (!waves.isEmpty()) {
            EnemyWave hitWave = null;
            double bestMatch = Double.MAX_VALUE;
            for (EnemyWave w : waves) {
                if (w.virtual) continue;
                double tti = Math.abs(
                        (myPos.distance(w.fireLocation) - w.distanceTraveled) / w.bulletSpeed);
                double speedErr = Math.abs(w.bulletSpeed - hitBulletSpeed);
                double score = tti + speedErr * 10;
                if (score < bestMatch) { bestMatch = score; hitWave = w; }
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
    public static int getTotalHitsTaken() { return totalHitsTaken; }
    public static int getTotalWavesPassed() { return totalWavesPassed; }

    // ── Private helpers ─────────────────────────────────────────────────

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
        dangerEnsemble.logHitAll(wave, bin);
        moveProfile[clampBin(bin)] += 1.0;
    }

    private void goDirection(AdvancedRobot robot, int direction, EnemyWave wave) {
        Point2D.Double myPos = new Point2D.Double(robot.getX(), robot.getY());
        double angleToWave = Math.atan2(wave.fireLocation.x - myPos.x,
                                         wave.fireLocation.y - myPos.y);
        double stick = adaptiveStick(wave.bulletSpeed);
        double desired = wallSmooth(myPos, angleToWave + direction * (Math.PI / 2), direction, stick);

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

        double stick = adaptiveStick(wave.bulletSpeed);
        for (int ticks = 0; ticks < 500; ticks++) {
            double angleToWave = Math.atan2(wave.fireLocation.x - predX,
                                             wave.fireLocation.y - predY);
            double desired = wallSmooth(new Point2D.Double(predX, predY),
                    angleToWave + direction * (Math.PI / 2), direction, stick);

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
        double stick2 = adaptiveStick(wave.bulletSpeed);

        for (int ticks = 0; ticks < 200; ticks++) {
            double angleToWave = Math.atan2(wave.fireLocation.x - predX,
                                             wave.fireLocation.y - predY);
            double desired = wallSmooth(new Point2D.Double(predX, predY),
                    angleToWave + direction * (Math.PI / 2), direction, stick2);

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
        return wallSmooth(pos, angle, direction, STICK);
    }

    private double wallSmooth(Point2D.Double pos, double angle, int direction, double stick) {
        for (int i = 0; i < 200; i++) {
            double testX = pos.x + Math.sin(angle) * stick;
            double testY = pos.y + Math.cos(angle) * stick;
            if (fieldRect.contains(testX, testY)) return angle;
            angle += direction * 0.05;
        }
        return angle;
    }

    private static double adaptiveStick(double bulletSpeed) {
        return Math.max(100, Math.min(200, bulletSpeed * 12));
    }

    private void pruneWaves(AdvancedRobot robot) {
        Point2D.Double me = new Point2D.Double(robot.getX(), robot.getY());
        Iterator<EnemyWave> it = waves.iterator();
        while (it.hasNext()) {
            EnemyWave w = it.next();
            if (w.distanceTraveled > me.distance(w.fireLocation) + 50) {
                totalWavesPassed++;
                for (int i = 0; i < BINS; i++) moveProfile[i] *= PROFILE_DECAY;
                moveProfile[clampBin(getGFBin(w, me))] += 0.2;
                decayStats(w);
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

    private void removeVirtualWaves() {
        waves.removeIf(w -> w.virtual);
    }

    private boolean hasVirtualWave() {
        for (EnemyWave w : waves) {
            if (w.virtual) return true;
        }
        return false;
    }

    private static void decayStats(EnemyWave w) {
        dangerEnsemble.decayAll(w);
    }

    private static int distSeg(double distance) {
        if (distance < 300) return 0;
        if (distance < 600) return 1;
        return 2;
    }

    private static int velSeg(double absVel) {
        return Math.min((int) (absVel / 3.0), 2);
    }

    private int[] getGFBinRange(EnemyWave wave, Point2D.Double botCenter) {
        double dist = botCenter.distance(wave.fireLocation);
        double angularWidth = Math.atan2(18.0 * Math.sqrt(2), Math.max(1, dist));
        double mea = Math.asin(MAX_VELOCITY / wave.bulletSpeed);
        int halfBins = Math.max(0, (int) Math.ceil(angularWidth / mea * CENTER_BIN));
        int centerBin = getGFBin(wave, botCenter);
        return new int[]{clampBin(centerBin - halfBins), clampBin(centerBin + halfBins)};
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

    public static java.util.Map<String, Double> getDangerModelWeights() {
        return dangerEnsemble.getWeights();
    }

    // ── Bullet shadows ─────────────────────────────────────────────────

    public void addBullet(double x, double y, double gunHeading, double firePower, long fireTime) {
        OurBullet b = new OurBullet();
        b.firePosition = new Point2D.Double(x, y);
        b.heading = gunHeading;
        b.bulletSpeed = 20.0 - 3.0 * firePower;
        b.fireTime = fireTime;
        ourBullets.add(b);
    }

    int getShadowBin(OurBullet bullet, EnemyWave wave) {
        double dx = bullet.firePosition.x - wave.fireLocation.x;
        double dy = bullet.firePosition.y - wave.fireLocation.y;
        double bvx = Math.sin(bullet.heading) * bullet.bulletSpeed;
        double bvy = Math.cos(bullet.heading) * bullet.bulletSpeed;
        double ws = wave.bulletSpeed;
        long dt = bullet.fireTime - wave.fireTime;

        double a = bvx * bvx + bvy * bvy - ws * ws;
        double b = 2.0 * (dx * bvx + dy * bvy - ws * ws * dt);
        double c = dx * dx + dy * dy - ws * ws * dt * dt;

        double u;
        if (Math.abs(a) < 1e-10) {
            if (Math.abs(b) < 1e-10) return -1;
            u = -c / b;
            if (u <= 0) return -1;
        } else {
            double disc = b * b - 4.0 * a * c;
            if (disc < 0) return -1;

            double sqrtDisc = Math.sqrt(disc);
            double u1 = (-b - sqrtDisc) / (2.0 * a);
            double u2 = (-b + sqrtDisc) / (2.0 * a);

            u = -1;
            if (u1 > 0) u = u1;
            else if (u2 > 0) u = u2;
            if (u < 0) return -1;
        }

        double hitX = bullet.firePosition.x + bvx * u;
        double hitY = bullet.firePosition.y + bvy * u;

        if (hitX < 0 || hitX > fieldWidth || hitY < 0 || hitY > fieldHeight) return -1;

        return getGFBin(wave, new Point2D.Double(hitX, hitY));
    }

    private void pruneOurBullets(long currentTime) {
        ourBullets.removeIf(b -> {
            double elapsed = currentTime - b.fireTime;
            double dist = b.bulletSpeed * elapsed;
            double bx = b.firePosition.x + Math.sin(b.heading) * dist;
            double by = b.firePosition.y + Math.cos(b.heading) * dist;
            return bx < 0 || bx > fieldWidth || by < 0 || by > fieldHeight;
        });
    }

    static class OurBullet {
        Point2D.Double firePosition;
        double heading;
        double bulletSpeed;
        long fireTime;
    }
}
