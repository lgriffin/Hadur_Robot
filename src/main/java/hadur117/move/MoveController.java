package hadur117.move;

import hadur117.utils.*;
import java.awt.geom.Point2D;
import java.util.*;

public class MoveController {

    private static final double TYPICAL_ESCAPE_RANGE = 0.98;
    private static final double DECAY_RATE = 1.8;

    private final List<KnnView<TimestampedGuessFactor>> views = new ArrayList<>();
    private final BattleField battleField;
    private final MovementPredictor predictor;
    private final WaveManager waveManager;

    private int raw1v1ShotsFired;
    private int raw1v1ShotsHit;
    private double weighted1v1ShotsHit;
    private double lastBulletPower;
    private long lastBulletFireTime;

    public MoveController(BattleField battleField, MovementPredictor predictor) {
        this.battleField = battleField;
        this.predictor = predictor;
        this.waveManager = new WaveManager();
        initSurfViews();
    }

    private void initSurfViews() {
        views.add(new KnnView<TimestampedGuessFactor>(new SimpleFormula())
            .setWeight(3).setK(25).setKDivisor(5).bulletHitsOn()
            .setName("simple"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(40).setK(20).setKDivisor(5).setHitThreshold(3.0).bulletHitsOn()
            .setName("normal"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(100).setK(1).setMaxDataPoints(1).setHitThreshold(2.5).bulletHitsOn()
            .setName("recent1"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(100).setK(1).setMaxDataPoints(5).setHitThreshold(2.5).bulletHitsOn()
            .setName("recent2"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(100).setK(1).setHitThreshold(2.5).setDecayRate(DECAY_RATE).bulletHitsOn()
            .setName("recent3"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(100).setK(7).setKDivisor(4).setHitThreshold(2.5).setDecayRate(DECAY_RATE).bulletHitsOn()
            .setName("recent4"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(100).setK(35).setKDivisor(3).setHitThreshold(2.5).setDecayRate(DECAY_RATE).bulletHitsOn()
            .setName("recent5"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(100).setK(100).setKDivisor(2).setHitThreshold(2.5).setDecayRate(DECAY_RATE).bulletHitsOn()
            .setName("recent6"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(10).setK(50).setMaxDataPoints(1000).setKDivisor(5)
            .setPaddedHitThreshold(3.0).visitsOn()
            .setName("lightFlattener"));
        views.add(new KnnView<TimestampedGuessFactor>(new FlattenerFormula())
            .setWeight(50).setK(25).setMaxDataPoints(300).setKDivisor(12)
            .setPaddedHitThreshold(5.9).visitsOn()
            .setName("flattener"));
        views.add(new KnnView<TimestampedGuessFactor>(new FlattenerFormula())
            .setWeight(500).setK(50).setMaxDataPoints(2000).setKDivisor(14)
            .setPaddedHitThreshold(5.9).setDecayRate(DECAY_RATE).visitsOn()
            .setName("flattener2"));
    }

    public void initRound() {
        waveManager.initRound();
        raw1v1ShotsFiredThisRound = 0;
        raw1v1ShotsHitThisRound = 0;
        weighted1v1ShotsHitThisRound = 0;
        lastBulletPower = 0;
        clearNeighborCache();
    }

    private int raw1v1ShotsFiredThisRound;
    private int raw1v1ShotsHitThisRound;
    private double weighted1v1ShotsHitThisRound;

    public void clearNeighborCache() {
        for (KnnView<TimestampedGuessFactor> view : views) {
            view.clearCache();
        }
    }

    public WaveManager getWaveManager() {
        return waveManager;
    }

    public double getLastBulletPower() {
        return lastBulletPower;
    }

    public long getLastBulletFireTime() {
        return lastBulletFireTime;
    }

    public void checkWaves(long currentTime, Point2D.Double myLocation) {
        RobotState myState = RobotState.newBuilder()
            .setLocation(myLocation).setTime(currentTime).build();
        waveManager.checkActiveWaves(currentTime, myState, (w, breakStates) -> {
            if (w.firingWave) {
                onFiringWaveBreak(w, breakStates, currentTime);
            }
        });
    }

    private void onFiringWaveBreak(Wave w, List<RobotState> breakStates,
                                    long currentTime) {
        Wave.Intersection intersection = w.preciseIntersection(breakStates);
        if (intersection == null) return;

        int currentRound = w.fireRound;
        for (KnnView<TimestampedGuessFactor> view : views) {
            if (!view.logVisits) continue;
            double gf = w.guessFactor(intersection.angle);
            view.logWave(w, new TimestampedGuessFactor(currentRound, currentTime, gf));
        }

        if (!w.bulletHitBullet) {
            raw1v1ShotsFired++;
            raw1v1ShotsFiredThisRound++;
            if (w.hitByBullet) {
                double angularBotWidth = intersection.bandwidth * 2.0;
                double thisHit = 0.1 / angularBotWidth
                    * (w.escapeAngleRange() / TYPICAL_ESCAPE_RANGE);
                weighted1v1ShotsHit += thisHit;
                weighted1v1ShotsHitThisRound += thisHit;
                raw1v1ShotsHit++;
                raw1v1ShotsHitThisRound++;
            }
        }
    }

    public void logBulletHit(Wave hitWave, Point2D.Double bulletLocation,
                              int currentRound, long currentTime) {
        if (hitWave == null) return;
        double hitGF = hitWave.guessFactor(bulletLocation);
        for (KnnView<TimestampedGuessFactor> view : views) {
            if (!view.logBulletHits) continue;
            view.logWave(hitWave, new TimestampedGuessFactor(
                currentRound, currentTime, hitGF));
        }
    }

    public Wave findBulletWave(Point2D.Double bulletLocation, long currentTime,
                                String botName, double bulletPower) {
        return waveManager.findClosestWave(bulletLocation, currentTime,
            true, botName, bulletPower);
    }

    public void addWave(Wave w) {
        waveManager.addWave(w);
    }

    public void updateFiringWave(long currentTime, double bulletPower) {
        long fireTime = currentTime - 1;
        Wave w = waveManager.getWaveByFireTime(fireTime);
        if (w != null) {
            w.firingWave = true;
            w.setBulletPower(bulletPower);
            lastBulletPower = bulletPower;
            lastBulletFireTime = fireTime;
        }
    }

    public Wave findSurfableWave(int surfIndex, RobotState myState) {
        return waveManager.findSurfableWave(surfIndex, myState,
            Wave.WavePosition.BREAKING_CENTER);
    }

    public double getDangerScore(Wave w, Wave.Intersection intersection,
                                  int surfWaveIndex) {
        double dangerAngle = intersection.angle;
        double bandwidth = intersection.bandwidth;
        double totalDanger = 0;
        double totalScanWeight = 0;
        int enabledSize = 0;
        double hitPercentage = normalizedEnemyHitPercentage();
        double marginOfError = hitPercentageMarginOfError();

        for (KnnView<TimestampedGuessFactor> view : views) {
            if (!view.enabled(hitPercentage, marginOfError)) continue;
            enabledSize += view.size();

            List<KdTree.Entry<TimestampedGuessFactor>> neighbors =
                getNearestNeighbors(view, w, surfWaveIndex);
            Map<Timestamped, Double> weightMap = view.getDecayWeights(neighbors);

            double density = 0;
            double viewScanWeight = 0;
            for (KdTree.Entry<TimestampedGuessFactor> entry : neighbors) {
                TimestampedGuessFactor tsgf = entry.value;
                double scanWeight = weightMap.get(tsgf)
                    / Math.sqrt(entry.distance);
                double xFiringAngle = DiaUtils.normalizeAngle(
                    w.firingAngle(tsgf.guessFactor), dangerAngle);
                double ux = (xFiringAngle - dangerAngle) / bandwidth;
                density += scanWeight * Math.pow(2.0, -Math.abs(ux));
                viewScanWeight += scanWeight;
            }
            totalScanWeight += viewScanWeight * view.weight;
            totalDanger += view.weight * density;
        }

        if (enabledSize == 0) {
            return defaultDanger(w, intersection);
        }
        return totalDanger / totalScanWeight;
    }

    @SuppressWarnings("unchecked")
    private List<KdTree.Entry<TimestampedGuessFactor>> getNearestNeighbors(
            KnnView<TimestampedGuessFactor> view, Wave w, int surfWaveIndex) {
        if (!view.cachedNeighbors.containsKey(surfWaveIndex)) {
            view.cachedNeighbors.put(surfWaveIndex,
                (List) view.nearestNeighbors(w, false));
        }
        return (List<KdTree.Entry<TimestampedGuessFactor>>)
            (List<?>) view.cachedNeighbors.get(surfWaveIndex);
    }

    private static double defaultDanger(Wave w, Wave.Intersection intersection) {
        double[] guessFactors = {0.0, 0.85};
        double[] weights = {3.0, 1.0};
        double danger = 0;
        for (int i = 0; i < guessFactors.length; i++) {
            double firingAngle = w.firingAngle(guessFactors[i]);
            double ux = (firingAngle - DiaUtils.normalizeAngle(
                intersection.angle, firingAngle)) / intersection.bandwidth;
            danger += weights[i] * Math.pow(2.0, -Math.abs(ux));
        }
        return danger;
    }

    public double normalizedEnemyHitRate() {
        return raw1v1ShotsFired == 0 ? 0.0
            : weighted1v1ShotsHit / (double) raw1v1ShotsFired;
    }

    public double normalizedEnemyHitPercentage() {
        return 100.0 * normalizedEnemyHitRate();
    }

    public double hitPercentageMarginOfError() {
        if (raw1v1ShotsFired == 0) return 100.0;
        return 100.0 * DiaUtils.marginOfError(normalizedEnemyHitRate(), raw1v1ShotsFired);
    }

    public double guessBulletPower() {
        return lastBulletPower > 0 ? lastBulletPower : 1.9;
    }
}
