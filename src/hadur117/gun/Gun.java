package hadur117.gun;

import robocode.*;
import robocode.util.Utils;
import java.awt.geom.*;
import java.util.*;

public class Gun {

    private static final int GF_BINS = 31;
    private static final int GF_CENTER = GF_BINS / 2;

    private static final int SEG_DIST = 5;
    private static final int SEG_VEL = 5;
    private static final int SEG_LATVEL = 5;
    private static final int SEG_ACCEL = 3;
    private static final int SEG_WALL = 3;

    private static final double DECAY = 0.95;
    private static final int VG_WINDOW = 30;
    private static final double BOT_WIDTH = 18.0;
    private static final double WALL_THRESHOLD = 120.0;

    private static final int GUN_GF = 0;
    private static final int GUN_PATTERN = 1;
    private static final int GUN_CIRCULAR = 2;
    private static final int GUN_LINEAR = 3;
    private static final int GUN_HEADON = 4;
    private static final int NUM_GUNS = 5;

    private static final int PATTERN_HISTORY = 1000;
    private static final int PATTERN_MIN_MATCH = 5;
    private static final int PATTERN_MAX_MATCH = 30;

    private double bfWidth, bfHeight;

    private static double[][][][][][] gfStats =
            new double[SEG_DIST][SEG_VEL][SEG_LATVEL][SEG_ACCEL][SEG_WALL][GF_BINS];

    private final ArrayList<GunWave> waves = new ArrayList<>();
    private final LinkedList<boolean[]> vgResults = new LinkedList<>();
    private final int[] vgHits = new int[NUM_GUNS];

    private int activeGun = GUN_GF;
    private int shotsFired = 0;
    private int shotsHit = 0;

    private double prevEnemyVelocity = 0;
    private double prevEnemyHeading = 0;
    private double enemyLatDir = 1.0;

    private final double[] headingHist = new double[PATTERN_HISTORY];
    private final double[] velocityHist = new double[PATTERN_HISTORY];
    private int histIndex = 0;
    private int histSize = 0;

    public void init(double bfWidth, double bfHeight) {
        this.bfWidth = bfWidth;
        this.bfHeight = bfHeight;
    }

    public void onScannedRobot(AdvancedRobot robot, ScannedRobotEvent e) {
        Point2D.Double myPos = new Point2D.Double(robot.getX(), robot.getY());
        double absBearing = robot.getHeadingRadians() + e.getBearingRadians();
        double enemyDist = e.getDistance();
        Point2D.Double enemyPos = project(myPos, absBearing, enemyDist);

        double enemyVel = e.getVelocity();
        double enemyHeading = e.getHeadingRadians();
        double latVel = enemyVel * Math.sin(enemyHeading - absBearing);
        double absLatVel = Math.abs(latVel);
        double absVel = Math.abs(enemyVel);

        if (latVel > 0) enemyLatDir = 1.0;
        else if (latVel < 0) enemyLatDir = -1.0;

        double accelDelta = absVel - Math.abs(prevEnemyVelocity);
        int accelSeg = accelDelta > 0.5 ? 0 : (accelDelta < -0.5 ? 1 : 2);

        double turnRate = Utils.normalRelativeAngle(enemyHeading - prevEnemyHeading);

        double edgeDist = Math.min(
                Math.min(enemyPos.x - BOT_WIDTH, bfWidth - enemyPos.x - BOT_WIDTH),
                Math.min(enemyPos.y - BOT_WIDTH, bfHeight - enemyPos.y - BOT_WIDTH));
        int wallSeg = edgeDist < 80 ? 0 : (edgeDist < WALL_THRESHOLD ? 1 : 2);

        int distSeg = Math.min(SEG_DIST - 1, (int) (enemyDist / 180.0));
        int velSeg = Math.min(SEG_VEL - 1, (int) (absVel / 2.0));
        int latvelSeg = Math.min(SEG_LATVEL - 1, (int) (absLatVel / 2.0));

        headingHist[histIndex] = turnRate;
        velocityHist[histIndex] = enemyVel;
        histIndex = (histIndex + 1) % PATTERN_HISTORY;
        if (histSize < PATTERN_HISTORY) histSize++;

        updateWaves(enemyPos, robot.getTime());

        double firePower = smartFirePower(enemyDist, robot.getEnergy(), e.getEnergy());
        if (firePower < 0.1) {
            prevEnemyVelocity = enemyVel;
            prevEnemyHeading = enemyHeading;
            return;
        }

        double bulletSpeed = Rules.getBulletSpeed(firePower);
        double mea = maxEscapeAngle(bulletSpeed);

        double[] segStats = gfStats[distSeg][velSeg][latvelSeg][accelSeg][wallSeg];
        int bestBin = bestGFBin(segStats);
        double gfAngle = absBearing + enemyLatDir * mea
                * ((double) (bestBin - GF_CENTER) / GF_CENTER);

        double patternAngle = patternPrediction(myPos, enemyPos, enemyHeading,
                enemyVel, bulletSpeed);
        double circularAngle = circularPrediction(myPos, enemyPos, enemyHeading,
                enemyVel, turnRate, bulletSpeed);
        double linearAngle = linearPrediction(myPos, enemyPos, enemyHeading,
                enemyVel, bulletSpeed);
        double headOnAngle = absBearing;

        activeGun = selectBestGun();

        double aimAngle;
        switch (activeGun) {
            case GUN_PATTERN:  aimAngle = patternAngle;  break;
            case GUN_CIRCULAR: aimAngle = circularAngle; break;
            case GUN_LINEAR:   aimAngle = linearAngle;   break;
            case GUN_HEADON:   aimAngle = headOnAngle;   break;
            default:           aimAngle = gfAngle;       break;
        }

        robot.setTurnGunRightRadians(Utils.normalRelativeAngle(
                aimAngle - robot.getGunHeadingRadians()));

        if (robot.getGunHeat() == 0 && robot.getEnergy() > 0.1) {
            Bullet b = robot.setFireBullet(firePower);
            if (b != null) {
                shotsFired++;
                waves.add(createWave(myPos, robot.getTime(), bulletSpeed,
                        absBearing, mea, segStats, distSeg, velSeg, latvelSeg,
                        accelSeg, wallSeg, true,
                        new double[]{gfAngle, patternAngle, circularAngle,
                                     linearAngle, headOnAngle}));
            }
        } else {
            waves.add(createWave(myPos, robot.getTime(), bulletSpeed,
                    absBearing, mea, segStats, distSeg, velSeg, latvelSeg,
                    accelSeg, wallSeg, false,
                    new double[]{gfAngle, patternAngle, circularAngle,
                                 linearAngle, headOnAngle}));
        }

        prevEnemyVelocity = enemyVel;
        prevEnemyHeading = enemyHeading;
    }

    public void onScannedRobotMelee(AdvancedRobot robot, ScannedRobotEvent e,
                                     String targetName, String scannedName) {
        if (!scannedName.equals(targetName)) return;

        Point2D.Double myPos = new Point2D.Double(robot.getX(), robot.getY());
        double absBearing = robot.getHeadingRadians() + e.getBearingRadians();
        Point2D.Double enemyPos = project(myPos, absBearing, e.getDistance());

        double enemyVel = e.getVelocity();
        double enemyHeading = e.getHeadingRadians();
        double turnRate = Utils.normalRelativeAngle(enemyHeading - prevEnemyHeading);

        double firePower = smartFirePower(e.getDistance(), robot.getEnergy(), e.getEnergy());
        if (firePower < 0.1) {
            prevEnemyVelocity = enemyVel;
            prevEnemyHeading = enemyHeading;
            return;
        }

        double bulletSpeed = Rules.getBulletSpeed(firePower);
        double aimAngle = circularPrediction(myPos, enemyPos, enemyHeading,
                enemyVel, turnRate, bulletSpeed);

        robot.setTurnGunRightRadians(Utils.normalRelativeAngle(
                aimAngle - robot.getGunHeadingRadians()));

        if (robot.getGunHeat() == 0 && robot.getEnergy() > 0.1) {
            Bullet b = robot.setFireBullet(firePower);
            if (b != null) shotsFired++;
        }

        prevEnemyVelocity = enemyVel;
        prevEnemyHeading = enemyHeading;
    }

    public void onBulletHit(BulletHitEvent e) { shotsHit++; }
    public void onBulletMissed(BulletMissedEvent e) {}

    public int getShotsFired() { return shotsFired; }
    public int getShotsHit() { return shotsHit; }
    public double getAccuracy() {
        return shotsFired > 0 ? (double) shotsHit / shotsFired : 0;
    }

    public String getActiveGunName() {
        switch (activeGun) {
            case GUN_GF: return "GuessFactor";
            case GUN_PATTERN: return "PatternMatch";
            case GUN_CIRCULAR: return "Circular";
            case GUN_LINEAR: return "Linear";
            case GUN_HEADON: return "HeadOn";
            default: return "Unknown";
        }
    }

    // ── Wave management ─────────────────────────────────────────────────

    private void updateWaves(Point2D.Double enemyPos, long currentTime) {
        Iterator<GunWave> it = waves.iterator();
        while (it.hasNext()) {
            GunWave w = it.next();
            double distTravelled = w.bulletSpeed * (currentTime - w.fireTime);
            double distToEnemy = w.firePosition.distance(enemyPos);

            if (distTravelled >= distToEnemy - BOT_WIDTH) {
                double actualBearing = Math.atan2(
                        enemyPos.x - w.firePosition.x,
                        enemyPos.y - w.firePosition.y);
                double offset = Utils.normalRelativeAngle(actualBearing - w.absBearing);
                double gf = offset / (w.latDir * w.mea);
                int bin = clamp((int) Math.round(gf * GF_CENTER + GF_CENTER),
                                0, GF_BINS - 1);

                double[] stats = gfStats[w.distSeg][w.velSeg][w.latvelSeg]
                                        [w.accelSeg][w.wallSeg];
                for (int i = 0; i < GF_BINS; i++) stats[i] *= DECAY;
                stats[bin] += 1.0;

                boolean[] gunHits = new boolean[NUM_GUNS];
                for (int g = 0; g < NUM_GUNS; g++) {
                    double angErr = Math.abs(Utils.normalRelativeAngle(
                            w.aimAngles[g] - actualBearing));
                    gunHits[g] = distToEnemy * Math.sin(angErr) < BOT_WIDTH;
                }

                vgResults.addLast(gunHits);
                for (int g = 0; g < NUM_GUNS; g++)
                    if (gunHits[g]) vgHits[g]++;
                while (vgResults.size() > VG_WINDOW) {
                    boolean[] old = vgResults.removeFirst();
                    for (int g = 0; g < NUM_GUNS; g++)
                        if (old[g]) vgHits[g]--;
                }

                it.remove();
            }
        }
    }

    private int selectBestGun() {
        if (vgResults.size() < 5) return GUN_GF;
        int best = GUN_GF;
        int bestHits = vgHits[GUN_GF];
        for (int g = 1; g < NUM_GUNS; g++) {
            if (vgHits[g] > bestHits) { bestHits = vgHits[g]; best = g; }
        }
        return best;
    }

    private int bestGFBin(double[] stats) {
        int best = GF_CENTER;
        double bestVal = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < GF_BINS; i++) {
            double v = stats[i];
            if (i > 0) v += stats[i - 1] * 0.5;
            if (i < GF_BINS - 1) v += stats[i + 1] * 0.5;
            if (v > bestVal) { bestVal = v; best = i; }
        }
        return best;
    }

    // ── Pattern matching ────────────────────────────────────────────────

    private double patternPrediction(Point2D.Double myPos, Point2D.Double enemyPos,
                                      double enemyHeading, double enemyVel,
                                      double bulletSpeed) {
        if (histSize < PATTERN_MIN_MATCH + 5) {
            return linearPrediction(myPos, enemyPos, enemyHeading, enemyVel, bulletSpeed);
        }

        int bestMatchStart = -1;
        int bestMatchLen = 0;
        double bestError = Double.MAX_VALUE;
        int currentEnd = (histIndex - 1 + PATTERN_HISTORY) % PATTERN_HISTORY;

        for (int len = PATTERN_MAX_MATCH; len >= PATTERN_MIN_MATCH; len--) {
            if (len > histSize - 5) continue;
            for (int start = 0; start < histSize - len - 1; start++) {
                int searchStart = (histIndex - histSize + start + PATTERN_HISTORY) % PATTERN_HISTORY;
                int patStart = (currentEnd - len + 1 + PATTERN_HISTORY) % PATTERN_HISTORY;
                if (searchStart == patStart) continue;

                double error = 0;
                boolean valid = true;
                for (int k = 0; k < len; k++) {
                    int si = (searchStart + k) % PATTERN_HISTORY;
                    int pi = (patStart + k) % PATTERN_HISTORY;
                    double hdiff = headingHist[si] - headingHist[pi];
                    error += hdiff * hdiff;
                    if (error > bestError) { valid = false; break; }
                }
                if (valid && error < bestError) {
                    bestError = error;
                    bestMatchStart = (searchStart + len) % PATTERN_HISTORY;
                    bestMatchLen = len;
                }
            }
            if (bestMatchLen >= len && bestError < 0.01 * len) break;
        }

        if (bestMatchStart < 0) {
            return circularPrediction(myPos, enemyPos, enemyHeading, enemyVel,
                    headingHist[(histIndex - 1 + PATTERN_HISTORY) % PATTERN_HISTORY],
                    bulletSpeed);
        }

        double px = enemyPos.x, py = enemyPos.y;
        double ph = enemyHeading, pv = enemyVel;
        for (int t = 0; t < 150; t++) {
            int hi = (bestMatchStart + t) % PATTERN_HISTORY;
            if (t >= histSize - bestMatchLen) break;
            ph += headingHist[hi];
            pv = velocityHist[hi];
            px += pv * Math.sin(ph);
            py += pv * Math.cos(ph);
            px = clampD(px, BOT_WIDTH, bfWidth - BOT_WIDTH);
            py = clampD(py, BOT_WIDTH, bfHeight - BOT_WIDTH);
            if (myPos.distance(px, py) <= bulletSpeed * (t + 1))
                return Math.atan2(px - myPos.x, py - myPos.y);
        }
        return Math.atan2(enemyPos.x - myPos.x, enemyPos.y - myPos.y);
    }

    // ── Predictive targeting ────────────────────────────────────────────

    private double linearPrediction(Point2D.Double myPos, Point2D.Double enemyPos,
                                     double heading, double vel, double bulletSpeed) {
        double px = enemyPos.x, py = enemyPos.y;
        double dx = vel * Math.sin(heading), dy = vel * Math.cos(heading);
        for (int t = 0; t < 150; t++) {
            px += dx; py += dy;
            px = clampD(px, BOT_WIDTH, bfWidth - BOT_WIDTH);
            py = clampD(py, BOT_WIDTH, bfHeight - BOT_WIDTH);
            if (myPos.distance(px, py) <= bulletSpeed * (t + 1))
                return Math.atan2(px - myPos.x, py - myPos.y);
        }
        return Math.atan2(enemyPos.x - myPos.x, enemyPos.y - myPos.y);
    }

    private double circularPrediction(Point2D.Double myPos, Point2D.Double enemyPos,
                                       double heading, double vel, double turnRate,
                                       double bulletSpeed) {
        double px = enemyPos.x, py = enemyPos.y;
        double h = heading, v = vel;
        for (int t = 0; t < 150; t++) {
            h += turnRate;
            px += v * Math.sin(h); py += v * Math.cos(h);
            px = clampD(px, BOT_WIDTH, bfWidth - BOT_WIDTH);
            py = clampD(py, BOT_WIDTH, bfHeight - BOT_WIDTH);
            if (myPos.distance(px, py) <= bulletSpeed * (t + 1))
                return Math.atan2(px - myPos.x, py - myPos.y);
        }
        return Math.atan2(enemyPos.x - myPos.x, enemyPos.y - myPos.y);
    }

    // ── Fire power ──────────────────────────────────────────────────────

    public double smartFirePower(double distance, double myEnergy, double enemyEnergy) {
        if (myEnergy < 0.2) return 0.0;
        if (enemyEnergy <= 4.0 && myEnergy > 30.0 && distance < 300) {
            return Math.min(3.0, Math.max(0.1, enemyEnergy / 4.0 + 0.1));
        }

        double power;
        if (distance < 150)      power = 3.0;
        else if (distance < 250) power = 2.5;
        else if (distance < 400) power = 2.0;
        else if (distance < 600) power = 1.5;
        else                     power = 1.0;

        if (myEnergy < 10)       power = Math.min(power, 0.5);
        else if (myEnergy < 20)  power = Math.min(power, 1.0);
        else if (myEnergy < 35)  power = Math.min(power, 1.5);

        if (enemyEnergy > myEnergy + 30) power = Math.min(power, 1.5);

        if (shotsFired > 15 && getAccuracy() < 0.12) power = Math.min(power, 0.8);
        else if (shotsFired > 10 && getAccuracy() < 0.18) power = Math.min(power, 1.2);

        if (distance > 200) power = Math.min(power, myEnergy / 4.0);
        power = Math.min(power, Math.max(0.1, enemyEnergy / 4.0 + 0.2));
        return Math.max(0.1, Math.min(3.0, power));
    }

    // ── Utilities ───────────────────────────────────────────────────────

    private GunWave createWave(Point2D.Double pos, long time, double bulletSpeed,
                                double absBearing, double mea, double[] stats,
                                int distSeg, int velSeg, int latvelSeg,
                                int accelSeg, int wallSeg, boolean real,
                                double[] aimAngles) {
        GunWave w = new GunWave();
        w.firePosition = pos;
        w.fireTime = time;
        w.bulletSpeed = bulletSpeed;
        w.absBearing = absBearing;
        w.latDir = enemyLatDir;
        w.mea = mea;
        w.stats = stats;
        w.distSeg = distSeg;
        w.velSeg = velSeg;
        w.latvelSeg = latvelSeg;
        w.accelSeg = accelSeg;
        w.wallSeg = wallSeg;
        w.realBullet = real;
        w.aimAngles = aimAngles;
        return w;
    }

    private static double maxEscapeAngle(double bulletSpeed) {
        return Math.asin(8.0 / bulletSpeed);
    }

    private static Point2D.Double project(Point2D.Double src, double heading, double dist) {
        return new Point2D.Double(src.x + dist * Math.sin(heading),
                                   src.y + dist * Math.cos(heading));
    }

    private static int clamp(int val, int min, int max) {
        return Math.max(min, Math.min(max, val));
    }

    private static double clampD(double val, double min, double max) {
        return Math.max(min, Math.min(max, val));
    }
}
