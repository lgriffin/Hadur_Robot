package hadur2.core.move;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;

import java.awt.geom.Point2D;
import java.util.*;
import java.util.function.Consumer;

public class MoveController {

    /**
     * A surf seed sample: the flattener formula's 11 data-point values (the normal views use
     * the first 9), the simple view's lateral-velocity value, and the guess factor that hit us.
     */
    public static final int SAMPLE_WIDTH = 13;

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
    /** The profile's normalised hit rate and margin, in percent; NaN when there is none (ADAPT-2). */
    private double priorHitPercentage = Double.NaN;
    private double priorMarginOfError = Double.NaN;
    /** ADAPT-2: the flattener views are on while the prior stands, whatever the thresholds say. */
    private boolean flattenerFirst;
    /** Seeded samples so far; their time, so the decaying views see them oldest first. */
    private int seedsLoaded;
    private final FlattenerFormula sampleFormula = new FlattenerFormula();
    private Consumer<double[]> sampleSink;

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

    /**
     * ADAPT-2, DIAL-1: the enemy's normalised hit rate on us as the profile knows it. While
     * its margin of error is narrower than the live estimate's, it decides which danger views
     * are enabled, so a gun the profile rates T3 meets the flattener from the first wave.
     */
    public void setPrior(double hitRate, double marginOfError) {
        this.priorHitPercentage = 100.0 * hitRate;
        this.priorMarginOfError = 100.0 * marginOfError;
    }

    /**
     * ADAPT-2: while the prior stands, turn on the flattener views (the ones that learn from
     * every wave, not only hits) as soon as they hold data, whatever their thresholds say.
     */
    public void setFlattenerFirst(boolean flattenerFirst) {
        this.flattenerFirst = flattenerFirst;
    }

    /** RES-4: forget the profile's estimate and the flattener it asked for; live data decides. */
    public void clearPrior() {
        this.priorHitPercentage = Double.NaN;
        this.priorMarginOfError = Double.NaN;
        this.flattenerFirst = false;
    }

    /**
     * The views whose thresholds the current estimate meets, data or not: the policy the
     * danger score applies (a view also needs data to count).
     */
    public List<String> viewsOn() {
        List<String> on = new ArrayList<>();
        double[] estimate = viewEstimate();
        for (KnnView<TimestampedGuessFactor> view : views) {
            if (viewOn(view, estimate)) on.add(view.name);
        }
        return on;
    }

    /** DIAL-1: the hit percentage and margin that decide the views: the more certain estimate. */
    private double[] viewEstimate() {
        double hitPercentage = normalizedEnemyHitPercentage();
        double marginOfError = hitPercentageMarginOfError();
        if (!Double.isNaN(priorHitPercentage) && priorMarginOfError < marginOfError) {
            hitPercentage = priorHitPercentage;
            marginOfError = priorMarginOfError;
        }
        return new double[] {hitPercentage, marginOfError};
    }

    private boolean viewOn(KnnView<TimestampedGuessFactor> view, double[] estimate) {
        if (flattenerFirst && view.logVisits) return true;
        return view.thresholdsMet(estimate[0], estimate[1]);
    }

    /** Whether the profile's estimate is deciding the danger views right now. */
    public boolean priorInUse() {
        return !Double.isNaN(priorHitPercentage) && priorMarginOfError < hitPercentageMarginOfError();
    }

    /** Receives one {@link #SAMPLE_WIDTH}-value sample per enemy bullet that hits us. */
    public void setSampleSink(Consumer<double[]> sampleSink) {
        this.sampleSink = sampleSink;
    }

    /** ADAPT-3: adds a seeded hit to every view that learns from bullet hits. */
    public void seed(double[] sample, SeedWeight weight) {
        if (sample.length != SAMPLE_WIDTH) throw new IllegalArgumentException("a surf sample has 13 values");
        TimestampedGuessFactor tsgf = new TimestampedGuessFactor(Timestamped.SEED_ROUND,
            seedsLoaded++, sample[12], weight);
        for (KnnView<TimestampedGuessFactor> view : views) {
            if (!view.logBulletHits) continue;
            double[] point;
            if (view.formula instanceof SimpleFormula) {
                point = new double[] {sample[0], sample[11], sample[4]};
            } else {
                point = Arrays.copyOf(sample, view.formula.weights.length);
            }
            view.logSeed(point, tsgf, weight);
        }
    }

    /** Samples in the danger view called {@code name}, or -1 if there is none. */
    public int viewSize(String name) {
        for (KnnView<TimestampedGuessFactor> view : views) {
            if (view.name.equals(name)) return view.size();
        }
        return -1;
    }

    /** Firing waves that have broken on us this battle, bullet-hit-bullet ones aside. */
    public int enemyFiringWaves() {
        return raw1v1ShotsFired;
    }

    /**
     * Whether each firing wave that broke on us since the last call hit us, in the order
     * the waves broke, bullet-hit-bullet ones aside. The list is handed over and emptied.
     */
    public List<Boolean> takeBrokenWaveOutcomes() {
        List<Boolean> taken = new ArrayList<>(brokenWaveOutcomes);
        brokenWaveOutcomes.clear();
        return taken;
    }

    /** Their hits on us over those waves, each weighted by our angular width (normalised). */
    public double enemyWeightedHits() {
        return weighted1v1ShotsHit;
    }

    public void initRound() {
        waveManager.initRound();
        raw1v1ShotsFiredThisRound = 0;
        raw1v1ShotsHitThisRound = 0;
        weighted1v1ShotsHitThisRound = 0;
        lastBulletPower = 0;
        brokenWaveOutcomes.clear();
        ourBullets.clear();
        shadowedWaves = 0;
        shadowComputations = 0;
        bulletsVersion++;
        clearNeighborCache();
    }

    private int raw1v1ShotsFiredThisRound;
    private int raw1v1ShotsHitThisRound;
    private double weighted1v1ShotsHitThisRound;
    private final List<Boolean> brokenWaveOutcomes = new ArrayList<>();
    /** MOVE-1: our bullets in flight, oldest first, for the shadows they cast. */
    private final List<OurBullet> ourBullets = new ArrayList<>();
    /** MOVE-1: waves that have had a shadow this round. */
    private int shadowedWaves;
    /** Bumped whenever the bullets in flight change; a wave's shadows are current at one version. */
    private long bulletsVersion;
    private int shadowComputations;

    public void clearNeighborCache() {
        for (KnnView<TimestampedGuessFactor> view : views) {
            view.clearCache();
        }
    }

    /** TIME-1, TIME-2: the share of k every danger view uses; 1 is all of it. */
    public void setKShare(double kShare) {
        if (kShare == this.kShare) return;
        this.kShare = kShare;
        for (KnnView<TimestampedGuessFactor> view : views) view.setKShare(kShare);
        clearNeighborCache();
    }

    private double kShare = 1.0;

    /** MOVE-1: one of our bullets has left the gun. */
    public void ourBulletFired(OurBullet bullet) {
        ourBullets.add(bullet);
        bulletsVersion++;
    }

    /**
     * MOVE-1: one of our bullets hit, missed or met a bullet. The engine names it by heading
     * and power; an event without a heading (NaN) stands for the oldest bullet of that power.
     */
    public void ourBulletGone(double heading, double power) {
        for (Iterator<OurBullet> it = ourBullets.iterator(); it.hasNext(); ) {
            OurBullet b = it.next();
            if (Double.isNaN(heading) ? Math.abs(b.power - power) < 1e-6 : b.is(heading, power)) {
                it.remove();
                bulletsVersion++;
                return;
            }
        }
    }

    /** MOVE-1: our bullets still in flight. */
    public int ourBulletsInFlight() {
        return ourBullets.size();
    }

    /**
     * MOVE-1: forgets bullets that have left the field by {@code time} and computes the
     * shadow our bullets in flight cast on each firing wave. A shadow depends only on the
     * wave and the bullets, not the time, so a wave is recomputed only when it is new or the
     * bullets in flight have changed since (TIME-1: a slow tick repeats none of it).
     */
    public void updateShadows(long time) {
        if (ourBullets.removeIf(b -> {
            java.awt.geom.Point2D.Double p = b.at(time);
            return p.x < 0 || p.y < 0 || p.x > battleField.width || p.y > battleField.height;
        })) {
            bulletsVersion++;
        }
        waveManager.forAllWaves(w -> {
            if (!w.firingWave || w.shadowVersion == bulletsVersion) return;
            w.shadowVersion = bulletsVersion;
            shadowComputations++;
            if (ourBullets.isEmpty()) {
                w.setShadows(new ArrayList<>());
            } else {
                List<List<double[]>> shadows =
                    BulletShadows.of(w, ourBullets, battleField.width, battleField.height);
                w.setShadows(shadows.get(0), shadows.get(1));
            }
            if (!w.possibleShadows().isEmpty() && !w.everShadowed) {
                w.everShadowed = true;
                shadowedWaves++;
            }
        });
    }

    /** MOVE-1: how many times a wave's shadows were computed this round. */
    public int shadowComputations() {
        return shadowComputations;
    }

    /** MOVE-1: enemy firing waves one of our bullets shadowed this round. */
    public int shadowedWaves() {
        return shadowedWaves;
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
            brokenWaveOutcomes.add(w.hitByBullet);
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
        if (sampleSink != null) {
            double[] sample = Arrays.copyOf(sampleFormula.dataPointFromWave(hitWave), SAMPLE_WIDTH);
            sample[11] = (hitWave.lateralVelocity() + 0.1) / 8.1;
            sample[12] = hitGF;
            sampleSink.accept(sample);
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

    /**
     * Marks the wave the enemy fired as a real bullet of {@code bulletPower}. The shot was
     * fired between the previous scan and the tick before this one; after missed scans the
     * latest wave in that span stands in for it. Returns the fire time of the wave marked,
     * or {@code currentTime - 1} when no wave exists.
     */
    public long updateFiringWave(long previousScanTime, long currentTime, double bulletPower) {
        for (long fireTime = currentTime - 1; fireTime >= previousScanTime; fireTime--) {
            Wave w = waveManager.getWaveByFireTime(fireTime);
            if (w != null) {
                w.firingWave = true;
                w.setBulletPower(bulletPower);
                lastBulletPower = bulletPower;
                lastBulletFireTime = fireTime;
                return fireTime;
            }
        }
        return currentTime - 1;
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
        double[] estimate = viewEstimate();

        for (KnnView<TimestampedGuessFactor> view : views) {
            // RES-4: a view holding only faded seeds is as good as empty.
            if (view.effectiveSize() == 0 || !viewOn(view, estimate)) continue;
            enabledSize += view.effectiveSize();

            List<KdTree.Entry<TimestampedGuessFactor>> neighbors =
                getNearestNeighbors(view, w, surfWaveIndex);
            Map<Timestamped, Double> weightMap = view.getDecayWeights(neighbors);

            double density = 0;
            double viewScanWeight = 0;
            for (KdTree.Entry<TimestampedGuessFactor> entry : neighbors) {
                TimestampedGuessFactor tsgf = entry.value;
                // ADAPT-3: a seeded sample counts for its seed's weight, a live one for 1.
                double scanWeight = weightMap.get(tsgf)
                    / Math.sqrt(entry.distance) * tsgf.weight();
                double xFiringAngle = DiaUtils.normalizeAngle(
                    w.firingAngle(tsgf.guessFactor), dangerAngle);
                double ux = (xFiringAngle - dangerAngle) / bandwidth;
                density += scanWeight * Math.pow(2.0, -Math.abs(ux));
                viewScanWeight += scanWeight;
            }
            totalScanWeight += viewScanWeight * view.weight;
            totalDanger += view.weight * density;
        }

        if (enabledSize == 0 || !(totalScanWeight > 0)) {
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
