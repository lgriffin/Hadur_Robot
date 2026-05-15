package hadur117.gun;

import hadur117.intel.TargetProfile;
import hadur117.model.MovementType;
import robocode.*;
import robocode.util.Utils;
import java.awt.geom.*;
import java.util.*;

/**
 * Five-gun virtual gun array with adaptive selection.
 *
 * <p>Maintains GuessFactor, pattern-matching, circular, linear, and head-on guns.
 * A rolling 30-wave virtual gun window tracks each gun's hit rate and selects the
 * best performer each tick. GuessFactor statistics use 5-dimensional segmentation
 * (distance, velocity, lateral velocity, acceleration, wall proximity) and persist
 * across rounds via a static array with 0.95 decay.</p>
 *
 * @see GunWave
 */
public class Gun {

    private static final int GF_BINS = 91;
    private static final int GF_CENTER = GF_BINS / 2;

    private static final int SEG_DIST = 3;
    private static final int SEG_LATVEL = 3;
    private static final int SEG_WALL = 2;
    private static final int SEG_ACCEL = 3;

    private static final double DECAY = 0.95;
    private static final int VG_WINDOW = 100;
    private static final double BOT_WIDTH = 18.0;
    private static final double WALL_THRESHOLD = 120.0;

    private static final int GUN_GF = 0;
    private static final int GUN_PATTERN = 1;
    private static final int GUN_CIRCULAR = 2;
    private static final int GUN_LINEAR = 3;
    private static final int GUN_HEADON = 4;
    private static final int GUN_KNN = 5;
    private static final int GUN_ANTISURFER = 6;
    private static final int NUM_GUNS = 7;

    private static final double[] ANTISURFER_WEIGHTS =
            {2, 3, 2, 3, 1, 4, 4, 4, 3, 4, 4, 3, 3};

    private static final int MIN_GUN_WAVES = 30;
    private static final int GUN_SWITCH_MARGIN = 2;
    private static final int MIN_WAVES_BETWEEN_SWITCH = 25;

    private static final int PATTERN_HISTORY = 1000;
    private static final int PATTERN_MIN_MATCH = 5;
    private static final int PATTERN_MAX_MATCH = 30;

    private static final int KNN_BUFFER_SIZE = 5000;
    private static final int KNN_DIMENSIONS = 13;
    private static final int KNN_MIN_DATA = 30;
    private static final double[] FEATURE_WEIGHTS =
            {3, 4, 2, 3, 2, 3, 3, 3, 2, 3, 3, 2, 3};

    private static final int LAT_VEL_HISTORY = 128;

    private double bfWidth, bfHeight;

    private static double[][][][][] gfStats =
            new double[SEG_DIST][SEG_LATVEL][SEG_WALL][SEG_ACCEL][GF_BINS];

    private static final double[][] knnFeatures = new double[KNN_BUFFER_SIZE][KNN_DIMENSIONS];
    private static final double[] knnGFs = new double[KNN_BUFFER_SIZE];
    private static int knnSize = 0;
    private static int knnIndex = 0;

    private final ArrayList<GunWave> waves = new ArrayList<>();
    private final LinkedList<double[]> vgResults = new LinkedList<>();
    private final double[] vgScores = new double[NUM_GUNS];

    private int activeGun = GUN_GF;
    private int recommendedGun = GUN_GF;
    private int shotsFired = 0;
    private int shotsHit = 0;
    private double lastFirePower = 0;

    private int waveCount = 0;
    private int lastGunSwitchWave = 0;

    private double prevEnemyVelocity = 0;
    private double prevEnemyHeading = 0;
    private double enemyLatDir = 1.0;

    private static int velocityChangeTime = 0;
    private static int directionChangeTime = 0;
    private static double prevAbsVel = 0;
    private static int prevMoveDirection = 0;

    private static final double[] latVelHistory = new double[LAT_VEL_HISTORY];
    private static int latVelHistIndex = 0;
    private static int latVelHistSize = 0;

    private static final double[] enemyPosXHistory = new double[32];
    private static final double[] enemyPosYHistory = new double[32];
    private static int posHistIndex = 0;
    private static int posHistSize = 0;

    private MovementType currentMovementType = MovementType.RANDOM;
    private boolean duelMode = false;

    private final Map<String, double[]> meleeState = new HashMap<>();

    private final double[] headingHist = new double[PATTERN_HISTORY];
    private final double[] velocityHist = new double[PATTERN_HISTORY];
    private int histIndex = 0;
    private int histSize = 0;

    public void init(double bfWidth, double bfHeight) {
        this.bfWidth = bfWidth;
        this.bfHeight = bfHeight;
    }

    public boolean onScannedRobot(AdvancedRobot robot, ScannedRobotEvent e,
                                    TargetProfile profile) {
        recommendedGun = gunForMovementType(profile.movementType);
        currentMovementType = profile.movementType;
        duelMode = true;
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

        double turnRate = Utils.normalRelativeAngle(enemyHeading - prevEnemyHeading);

        double edgeDist = Math.min(
                Math.min(enemyPos.x - BOT_WIDTH, bfWidth - enemyPos.x - BOT_WIDTH),
                Math.min(enemyPos.y - BOT_WIDTH, bfHeight - enemyPos.y - BOT_WIDTH));
        int wallSeg = edgeDist < 100 ? 0 : 1;

        int distSeg = enemyDist < 300 ? 0 : (enemyDist < 600 ? 1 : 2);
        int latvelSeg = absLatVel < 3 ? 0 : (absLatVel < 6 ? 1 : 2);

        headingHist[histIndex] = turnRate;
        velocityHist[histIndex] = enemyVel;
        histIndex = (histIndex + 1) % PATTERN_HISTORY;
        if (histSize < PATTERN_HISTORY) histSize++;

        updateWaves(enemyPos, robot.getTime());

        double accel = Math.abs(enemyVel) - Math.abs(prevEnemyVelocity);
        int accelSeg = accel < -0.5 ? 0 : (accel > 0.5 ? 2 : 1);

        double curAbsVel = Math.abs(enemyVel);
        if (Math.abs(curAbsVel - prevAbsVel) > 0.5
                || (enemyVel > 0) != (prevEnemyVelocity > 0) && prevEnemyVelocity != 0) {
            velocityChangeTime = 0;
        } else {
            velocityChangeTime++;
        }
        prevAbsVel = curAbsVel;

        int curMoveDir = enemyVel > 0.1 ? 1 : (enemyVel < -0.1 ? -1 : 0);
        if (curMoveDir != 0 && prevMoveDirection != 0 && curMoveDir != prevMoveDirection) {
            directionChangeTime = 0;
        } else {
            directionChangeTime++;
        }
        if (curMoveDir != 0) prevMoveDirection = curMoveDir;

        latVelHistory[latVelHistIndex] = latVel;
        latVelHistIndex = (latVelHistIndex + 1) % LAT_VEL_HISTORY;
        if (latVelHistSize < LAT_VEL_HISTORY) latVelHistSize++;

        enemyPosXHistory[posHistIndex] = enemyPos.x;
        enemyPosYHistory[posHistIndex] = enemyPos.y;
        posHistIndex = (posHistIndex + 1) % 32;
        if (posHistSize < 32) posHistSize++;

        double advancingVel = enemyVel * Math.cos(enemyHeading - absBearing);
        double fwdWallMEA = wallMEARatio(enemyPos, enemyHeading, absBearing, true);
        double revWallMEA = wallMEARatio(enemyPos, enemyHeading, absBearing, false);
        double latVel8 = getHistoricalLatVel(8);
        double latVel32 = getHistoricalLatVel(32);
        double distLast10 = getDistanceLast(10);

        double relHeading = enemyHeading - absBearing;
        double estBulletSpeed = 20.0 - 3.0 * 1.9;
        double bft = enemyDist / estBulletSpeed;
        double[] features = computeFeatures(enemyDist, latVel, advancingVel, accel,
                fwdWallMEA, revWallMEA, bft, latVel8, latVel32, distLast10);

        double firePower = smartFirePower(enemyDist, robot.getEnergy(), e.getEnergy(),
                profile.ourAccuracy, profile.shotsFiredAt);
        if (firePower < 0.1) {
            prevEnemyVelocity = enemyVel;
            prevEnemyHeading = enemyHeading;
            return false;
        }

        double bulletSpeed = Rules.getBulletSpeed(firePower);
        double mea = maxEscapeAngle(bulletSpeed);

        double[] segStats = gfStats[distSeg][latvelSeg][wallSeg][accelSeg];
        int gfBin = bestGFBin(segStats);
        double gfAngle = absBearing + enemyLatDir * mea
                * ((double) (gfBin - GF_CENTER) / GF_CENTER);

        double knnAngle = gfAngle;
        double antiSurferAngle = gfAngle;
        if (knnSize >= KNN_MIN_DATA) {
            int knnBin = knnBestBin(features);
            knnAngle = absBearing + enemyLatDir * mea
                    * ((double) (knnBin - GF_CENTER) / GF_CENTER);
            int asBin = antiSurferMultiScale(features);
            antiSurferAngle = absBearing + enemyLatDir * mea
                    * ((double) (asBin - GF_CENTER) / GF_CENTER);
        }

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
            case GUN_PATTERN:     aimAngle = patternAngle;     break;
            case GUN_CIRCULAR:    aimAngle = circularAngle;    break;
            case GUN_LINEAR:      aimAngle = linearAngle;      break;
            case GUN_HEADON:      aimAngle = headOnAngle;      break;
            case GUN_KNN:         aimAngle = knnAngle;         break;
            case GUN_ANTISURFER:  aimAngle = antiSurferAngle;  break;
            default:              aimAngle = gfAngle;          break;
        }

        double gunTurn = Utils.normalRelativeAngle(aimAngle - robot.getGunHeadingRadians());
        robot.setTurnGunRightRadians(gunTurn);

        boolean fired = false;
        if (robot.getGunHeat() == 0 && robot.getEnergy() > 0.1
                && Math.abs(gunTurn) < Math.toRadians(18)) {
            lastFirePower = firePower;
            Bullet b = robot.setFireBullet(firePower);
            if (b != null) {
                shotsFired++;
                fired = true;
                waves.add(createWave(myPos, robot.getTime(), bulletSpeed,
                        absBearing, mea, segStats, distSeg, latvelSeg,
                        wallSeg, accelSeg, true,
                        new double[]{gfAngle, patternAngle, circularAngle,
                                     linearAngle, headOnAngle, knnAngle,
                                     antiSurferAngle},
                        features));
            }
        } else {
            waves.add(createWave(myPos, robot.getTime(), bulletSpeed,
                    absBearing, mea, segStats, distSeg, latvelSeg,
                    wallSeg, accelSeg, false,
                    new double[]{gfAngle, patternAngle, circularAngle,
                                 linearAngle, headOnAngle, knnAngle,
                                 antiSurferAngle},
                    features));
        }

        prevEnemyVelocity = enemyVel;
        prevEnemyHeading = enemyHeading;
        return fired;
    }

    public boolean onScannedRobotMelee(AdvancedRobot robot, ScannedRobotEvent e,
                                        String targetName, String scannedName,
                                        TargetProfile profile) {
        double[] prev = meleeState.computeIfAbsent(scannedName, k -> new double[]{0, 0});

        Point2D.Double myPos = new Point2D.Double(robot.getX(), robot.getY());
        double absBearing = robot.getHeadingRadians() + e.getBearingRadians();
        Point2D.Double enemyPos = project(myPos, absBearing, e.getDistance());

        double enemyVel = e.getVelocity();
        double enemyHeading = e.getHeadingRadians();
        double turnRate = prev[1] != 0
                ? Utils.normalRelativeAngle(enemyHeading - prev[1]) : 0;

        prev[0] = enemyVel;
        prev[1] = enemyHeading;

        if (!scannedName.equals(targetName)) return false;

        double firePower = smartFirePower(e.getDistance(), robot.getEnergy(), e.getEnergy(),
                profile.ourAccuracy, profile.shotsFiredAt);
        firePower = Math.max(0.1, Math.min(3.0, firePower * profile.firePowerMult));
        firePower = applyMeleeCap(firePower, robot.getOthers());
        if (firePower < 0.1) return false;

        double bulletSpeed = Rules.getBulletSpeed(firePower);
        double circAngle = circularPrediction(myPos, enemyPos, enemyHeading,
                enemyVel, turnRate, bulletSpeed);
        double linAngle = linearPrediction(myPos, enemyPos, enemyHeading,
                enemyVel, bulletSpeed);
        double headOnAngle = absBearing;

        double aimAngle;
        switch (profile.movementType) {
            case STOPPED:  aimAngle = headOnAngle; break;
            case LINEAR:   aimAngle = linAngle; break;
            case CIRCULAR: aimAngle = circAngle; break;
            default:       aimAngle = circAngle; break;
        }

        robot.setTurnGunRightRadians(Utils.normalRelativeAngle(
                aimAngle - robot.getGunHeadingRadians()));

        if (robot.getGunHeat() == 0 && robot.getEnergy() > 0.1) {
            double gunErr = Math.abs(Utils.normalRelativeAngle(
                    robot.getGunHeadingRadians() - aimAngle));
            if (gunErr < Math.toRadians(3)) {
                lastFirePower = firePower;
                Bullet b = robot.setFireBullet(firePower);
                if (b != null) {
                    shotsFired++;
                    return true;
                }
            }
        }
        return false;
    }

    public void clearMeleeState() {
        meleeState.clear();
    }

    public void onBulletHit(BulletHitEvent e) { shotsHit++; }
    public void onBulletMissed(BulletMissedEvent e) { }
    public double getLastFirePower() { return lastFirePower; }

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
            case GUN_KNN: return "KNN";
            case GUN_ANTISURFER: return "AntiSurfer";
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

                double[] stats = gfStats[w.distSeg][w.latvelSeg][w.wallSeg][w.accelSeg];
                for (int i = 0; i < GF_BINS; i++) stats[i] *= DECAY;
                stats[bin] += 1.0;

                if (w.features != null) {
                    knnRecord(w.features, gf);
                }

                double[] gunScores = new double[NUM_GUNS];
                for (int g = 0; g < NUM_GUNS; g++) {
                    if (g >= w.aimAngles.length) continue;
                    double angErr = Math.abs(Utils.normalRelativeAngle(
                            w.aimAngles[g] - actualBearing));
                    double linearDist = distToEnemy * Math.sin(angErr);
                    gunScores[g] = Math.max(0, 1.0 - linearDist / BOT_WIDTH);
                }

                vgResults.addLast(gunScores);
                for (int g = 0; g < NUM_GUNS; g++)
                    vgScores[g] += gunScores[g];
                while (vgResults.size() > VG_WINDOW) {
                    double[] old = vgResults.removeFirst();
                    for (int g = 0; g < NUM_GUNS; g++)
                        vgScores[g] -= old[g];
                }
                waveCount++;

                it.remove();
            }
        }
    }

    private int selectBestGun() {
        if (waveCount < MIN_GUN_WAVES) return GUN_GF;

        double[] adjusted = new double[NUM_GUNS];
        System.arraycopy(vgScores, 0, adjusted, 0, NUM_GUNS);

        int[] candidates;
        if (duelMode) {
            candidates = new int[]{GUN_GF, GUN_KNN, GUN_ANTISURFER};
        } else {
            candidates = new int[]{GUN_GF, GUN_PATTERN, GUN_CIRCULAR,
                    GUN_LINEAR, GUN_HEADON, GUN_KNN, GUN_ANTISURFER};
        }

        int best = GUN_GF;
        double bestScore = adjusted[GUN_GF];
        for (int g : candidates) {
            if (adjusted[g] > bestScore) { bestScore = adjusted[g]; best = g; }
        }
        if (best != activeGun) {
            double activeScore = adjusted[activeGun] + 1.5;
            double dynamicMargin = Math.min(3.0, Math.max(GUN_SWITCH_MARGIN, waveCount / 30.0));
            if (bestScore - activeScore < dynamicMargin) return activeGun;
            if (waveCount - lastGunSwitchWave < MIN_WAVES_BETWEEN_SWITCH) return activeGun;
            lastGunSwitchWave = waveCount;
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
            if (i > 1) v += stats[i - 2] * 0.25;
            if (i < GF_BINS - 2) v += stats[i + 2] * 0.25;
            if (v > bestVal) { bestVal = v; best = i; }
        }
        return best;
    }

    private double[] computeFeatures(double dist, double latVel, double advVel,
                                      double accel, double fwdWallMEA,
                                      double revWallMEA, double bft,
                                      double latVel8, double latVel32,
                                      double distLast10) {
        double[] f = new double[KNN_DIMENSIONS];
        f[0] = Math.min(91, bft) / 91.0;
        f[1] = Math.abs(latVel) / 8.0;
        f[2] = advVel / 8.0;
        f[3] = Math.min(dist, 900) / 900.0;
        f[4] = (accel + 2.0) / 4.0;
        f[5] = fwdWallMEA;
        f[6] = revWallMEA;
        f[7] = Math.min(1.0, velocityChangeTime / Math.max(1.0, bft));
        f[8] = Math.min(1.0, directionChangeTime / Math.max(1.0, bft));
        f[9] = Math.abs(latVel8) / 8.0;
        f[10] = Math.abs(latVel32) / 8.0;
        f[11] = Math.abs(latVel8) / (Math.abs(latVel32) + 0.001);
        f[12] = Math.min(distLast10, 80) / 80.0;
        return f;
    }

    private double wallDistance(double x, double y, double heading) {
        double sinH = Math.sin(heading);
        double cosH = Math.cos(heading);
        double dist = Double.MAX_VALUE;
        if (cosH > 0.001) dist = Math.min(dist, (bfHeight - BOT_WIDTH - y) / cosH);
        if (cosH < -0.001) dist = Math.min(dist, (BOT_WIDTH - y) / cosH);
        if (sinH > 0.001) dist = Math.min(dist, (bfWidth - BOT_WIDTH - x) / sinH);
        if (sinH < -0.001) dist = Math.min(dist, (BOT_WIDTH - x) / sinH);
        return Math.max(0, dist);
    }

    private static void knnRecord(double[] features, double gf) {
        System.arraycopy(features, 0, knnFeatures[knnIndex], 0, KNN_DIMENSIONS);
        knnGFs[knnIndex] = gf;
        knnIndex = (knnIndex + 1) % KNN_BUFFER_SIZE;
        if (knnSize < KNN_BUFFER_SIZE) knnSize++;
    }

    private int knnBestBin(double[] features) {
        return knnBestBin(features, FEATURE_WEIGHTS);
    }

    private int knnBestBin(double[] features, double[] weights) {
        return bestGFBin(knnGFDistribution(features, weights, knnSize));
    }

    private double[] knnGFDistribution(double[] features, double[] weights, int maxK) {
        int k = Math.min(Math.max(10, (int) Math.sqrt(knnSize)), maxK);
        double[] dists = new double[k];
        int[] indices = new int[k];
        Arrays.fill(dists, Double.MAX_VALUE);

        for (int i = 0; i < knnSize; i++) {
            double d = 0;
            for (int j = 0; j < KNN_DIMENSIONS; j++) {
                double diff = (features[j] - knnFeatures[i][j]) * weights[j];
                d += diff * diff;
            }
            if (d < dists[k - 1]) {
                int pos = k - 1;
                while (pos > 0 && d < dists[pos - 1]) {
                    dists[pos] = dists[pos - 1];
                    indices[pos] = indices[pos - 1];
                    pos--;
                }
                dists[pos] = d;
                indices[pos] = i;
            }
        }

        double[] gfDist = new double[GF_BINS];
        int neighbors = Math.min(k, knnSize);
        for (int i = 0; i < neighbors; i++) {
            if (dists[i] >= Double.MAX_VALUE) break;
            double weight = 1.0 / (Math.sqrt(dists[i]) + 0.001);
            double gf = knnGFs[indices[i]];
            int bin = clamp((int) Math.round(gf * GF_CENTER + GF_CENTER),
                            0, GF_BINS - 1);
            gfDist[bin] += weight;
        }

        return gfDist;
    }

    private int antiSurferMultiScale(double[] features) {
        int[] scales = {125, 400, 1500, knnSize};
        double[] combined = new double[GF_BINS];
        for (int scale : scales) {
            int k = Math.min(scale, knnSize);
            if (k < KNN_MIN_DATA) continue;
            double[] dist = knnGFDistribution(features, ANTISURFER_WEIGHTS, k);
            double w = 1.0 / Math.sqrt(k);
            for (int i = 0; i < GF_BINS; i++) combined[i] += dist[i] * w;
        }
        return bestGFBin(combined);
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
        return smartFirePower(distance, myEnergy, enemyEnergy, 0.15, 0);
    }

    public double smartFirePower(double distance, double myEnergy,
                                  double enemyEnergy, double perOpponentAccuracy,
                                  int perOpponentShotsFired) {
        if (myEnergy < 0.2) return 0.0;

        double ratio = myEnergy / Math.max(0.1, enemyEnergy);
        double power;
        if (distance < 150) {
            power = 3.0;
        } else if (ratio >= 2.0) {
            power = 2.5;
        } else if (ratio >= 1.0) {
            power = 1.9;
        } else if (ratio >= 0.5) {
            power = 1.5;
        } else {
            power = 1.0;
        }

        if (distance > 400) {
            double distFactor = Math.max(0.6, 1.0 - (distance - 400) / 1000.0);
            power *= distFactor;
        }
        if (perOpponentShotsFired >= 30 && perOpponentAccuracy < 0.08 && distance > 300) {
            power = Math.min(power, 1.0);
        }

        double killPower = (enemyEnergy + 2) / 6.0;
        if (enemyEnergy <= 4 * power && killPower >= 0.1) {
            power = Math.min(3.0, Math.max(killPower, 0.1));
        }

        power = Math.min(power, (enemyEnergy + 0.1) / 4.0);
        if (power * 6.0 >= myEnergy) power = myEnergy / 6.0;
        if (power >= myEnergy - 0.1) power = myEnergy - 0.1;

        return Math.max(0.1, Math.min(3.0, power));
    }

    double applyMeleeCap(double firePower, int aliveCount) {
        if (aliveCount >= 4) {
            firePower = Math.min(firePower, 0.5);
        } else if (aliveCount >= 3) {
            firePower = Math.min(firePower, 1.0);
        }
        return firePower;
    }

    // ── Utilities ───────────────────────────────────────────────────────

    private GunWave createWave(Point2D.Double pos, long time, double bulletSpeed,
                                double absBearing, double mea, double[] stats,
                                int distSeg, int latvelSeg, int wallSeg,
                                int accelSeg, boolean real, double[] aimAngles,
                                double[] features) {
        GunWave w = new GunWave();
        w.firePosition = pos;
        w.fireTime = time;
        w.bulletSpeed = bulletSpeed;
        w.absBearing = absBearing;
        w.latDir = enemyLatDir;
        w.mea = mea;
        w.stats = stats;
        w.distSeg = distSeg;
        w.latvelSeg = latvelSeg;
        w.wallSeg = wallSeg;
        w.accelSeg = accelSeg;
        w.realBullet = real;
        w.aimAngles = aimAngles;
        w.features = features;
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

    private double getHistoricalLatVel(int ticksBack) {
        if (latVelHistSize < ticksBack) return 0;
        int idx = (latVelHistIndex - ticksBack + LAT_VEL_HISTORY) % LAT_VEL_HISTORY;
        return latVelHistory[idx];
    }

    private double getDistanceLast(int ticks) {
        if (posHistSize < ticks + 1) return 0;
        int curIdx = (posHistIndex - 1 + 32) % 32;
        int oldIdx = (posHistIndex - ticks - 1 + 32) % 32;
        double dx = enemyPosXHistory[curIdx] - enemyPosXHistory[oldIdx];
        double dy = enemyPosYHistory[curIdx] - enemyPosYHistory[oldIdx];
        return Math.sqrt(dx * dx + dy * dy);
    }

    private double wallMEARatio(Point2D.Double enemyPos, double enemyHeading,
                                 double absBearing, boolean forward) {
        double mea = maxEscapeAngle(20.0 - 3.0 * 1.9);
        double orbitAngle = forward
                ? absBearing + Math.PI / 2
                : absBearing - Math.PI / 2;
        double fwdDist = wallDistance(enemyPos.x, enemyPos.y, orbitAngle);
        double maxDist = 160.0;
        return Math.min(1.0, fwdDist / maxDist);
    }

    private static int gunForMovementType(MovementType mt) {
        switch (mt) {
            case STOPPED:     return GUN_HEADON;
            case LINEAR:      return GUN_LINEAR;
            case CIRCULAR:    return GUN_CIRCULAR;
            case WAVE_SURFER: return GUN_PATTERN;
            default:          return GUN_GF;
        }
    }

}
