package hadur2.core.gun;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;

import java.awt.geom.Point2D;
import java.util.*;
import java.util.function.Consumer;

public class GunController {

    /** The gun an opening book asks for until the live virtual guns clearly disagree (ADAPT-1). */
    public enum Opening { MAIN, ANTI_SURFER }

    /** A gun seed sample: the main view's 10 data-point values, the guess factor, the displacement. */
    public static final int SAMPLE_WIDTH = 13;

    private static final int DATA_THRESHOLD = 9;

    private final MainGun mainGun;
    private final AntiSurferGun antiSurferGun;
    private final BattleField battleField;
    private final int enemiesTotal;
    private final boolean is1v1;

    private final Map<String, Map<String, KnnView<TimestampedFiringAngle>>> enemyViews =
        new HashMap<>();
    private final Map<String, GunStats> mainGunStats = new HashMap<>();
    private final Map<String, GunStats> antiSurferStats = new HashMap<>();
    private final Map<Wave, double[]> virtualBullets = new HashMap<>();
    private final GunFormula sampleFormula;
    private Opening opening;
    private Consumer<double[]> sampleSink;
    /** Seeded samples so far; their time, so they keep their order. */
    private int seedsLoaded;

    public GunController(BattleField battleField, int enemiesTotal) {
        this.battleField = battleField;
        this.enemiesTotal = enemiesTotal;
        this.is1v1 = (enemiesTotal <= 1);
        this.mainGun = new MainGun(battleField);
        this.antiSurferGun = new AntiSurferGun(battleField, is1v1);
        this.sampleFormula = new GunFormula(enemiesTotal);
    }

    /**
     * ADAPT-1: the gun to use from the first firing wave, until the live virtual-gun ratings
     * disagree by more than their margin of error. Null (the default) keeps 1.20's choice:
     * head-on for the first nine waves, then whichever virtual gun rates higher.
     */
    public void setOpening(Opening opening) {
        this.opening = opening;
    }

    public Opening opening() {
        return opening;
    }

    /** Receives one {@link #SAMPLE_WIDTH}-value sample per real bullet's wave as it breaks. */
    public void setSampleSink(Consumer<double[]> sampleSink) {
        this.sampleSink = sampleSink;
    }

    /**
     * ADAPT-3: adds a seeded sample (as the sample sink produced it) to every gun view for
     * {@code botName}. The main view takes all ten values, the anti-surfer views the first nine.
     */
    public void seed(String botName, double[] sample, SeedWeight weight) {
        if (sample.length != SAMPLE_WIDTH) throw new IllegalArgumentException("a gun sample has 13 values");
        TimestampedFiringAngle tfa = new TimestampedFiringAngle(Timestamped.SEED_ROUND, seedsLoaded++,
            sample[10], new Point2D.Double(sample[11], sample[12]), weight);
        for (KnnView<TimestampedFiringAngle> view : getOrCreateViews(botName).values()) {
            view.logSeed(Arrays.copyOf(sample, view.formula.weights.length), tfa, weight);
        }
    }

    private double kShare = 1.0;

    public void initRound() {
        virtualBullets.clear();
        for (Map<String, KnnView<TimestampedFiringAngle>> views : enemyViews.values()) {
            for (KnnView<TimestampedFiringAngle> view : views.values()) {
                view.clearCache();
            }
        }
    }

    public Map<String, KnnView<TimestampedFiringAngle>> getOrCreateViews(String botName) {
        return enemyViews.computeIfAbsent(botName, k -> {
            Map<String, KnnView<TimestampedFiringAngle>> views = new LinkedHashMap<>();
            views.put(MainGun.viewName(), mainGun.createView(enemiesTotal).setKShare(kShare));
            for (KnnView<TimestampedFiringAngle> asView : antiSurferGun.createViews()) {
                views.put(asView.name, asView.setKShare(kShare));
            }
            return views;
        });
    }

    /** TIME-1, TIME-2: the share of k every gun view uses; 1 is all of it. */
    public void setKShare(double kShare) {
        if (kShare == this.kShare) return;
        this.kShare = kShare;
        for (Map<String, KnnView<TimestampedFiringAngle>> views : enemyViews.values()) {
            for (KnnView<TimestampedFiringAngle> view : views.values()) view.setKShare(kShare);
        }
    }

    public double aim(Wave w, Point2D.Double myNextLocation, long currentTime) {
        Map<String, KnnView<TimestampedFiringAngle>> views = getOrCreateViews(w.botName);
        KnnView<TimestampedFiringAngle> mainView = views.get(MainGun.viewName());

        if (is1v1 && opening != null) {
            // ADAPT-1: the profile's gun from the first wave, unless the live ratings disagree.
            Opening live = liveVerdict(w.botName);
            Opening use = live != null ? live : opening;
            return use == Opening.ANTI_SURFER
                ? antiSurferGun.aim(w, views, myNextLocation, currentTime)
                : mainGun.aim(w, mainView, myNextLocation, currentTime);
        }

        if (mainView.effectiveSize() < DATA_THRESHOLD) {
            return DiaUtils.absoluteBearing(myNextLocation, w.targetLocation);
        }

        if (is1v1) {
            GunStats mStats = mainGunStats.computeIfAbsent(w.botName, k -> new GunStats());
            GunStats aStats = antiSurferStats.computeIfAbsent(w.botName, k -> new GunStats());
            if (aStats.gunRating() > mStats.gunRating()) {
                return antiSurferGun.aim(w, views, myNextLocation, currentTime);
            }
        }
        return mainGun.aim(w, mainView, myNextLocation, currentTime);
    }

    /**
     * DIAL-1: the gun the live virtual ratings pick, or null while the gap between them is
     * within the margin of error of the better one (Agresti-Coull, 95%).
     */
    Opening liveVerdict(String botName) {
        GunStats m = mainGunStats.get(botName);
        GunStats a = antiSurferStats.get(botName);
        if (m == null || a == null || m.shotsFired == 0) return null;
        double mr = m.gunRating();
        double ar = a.gunRating();
        double margin = Math.max(margin(m.shotsHit, m.shotsFired), margin(a.shotsHit, a.shotsFired));
        if (Math.abs(ar - mr) <= margin) return null;
        return ar > mr ? Opening.ANTI_SURFER : Opening.MAIN;
    }

    /** The 95% margin of error of a rate of {@code hits} in {@code n} (Agresti-Coull). */
    static double margin(double hits, double n) {
        double p = (hits + 2) / (n + 4);
        return 1.96 * Math.sqrt(p * (1 - p) / (n + 4));
    }

    public void fireVirtualBullets(Wave w, Point2D.Double myNextLocation,
                                    long currentTime) {
        if (!is1v1) return;

        Map<String, KnnView<TimestampedFiringAngle>> views = getOrCreateViews(w.botName);
        double mainAngle = mainGun.aim(w, views.get(MainGun.viewName()),
            myNextLocation, currentTime);
        double asAngle = antiSurferGun.aim(w, views, myNextLocation, currentTime);
        virtualBullets.put(w, new double[]{mainAngle, asAngle});

        mainGunStats.computeIfAbsent(w.botName, k -> new GunStats());
        antiSurferStats.computeIfAbsent(w.botName, k -> new GunStats());
    }

    public void onWaveBreak(Wave w, List<RobotState> waveBreakStates) {
        if (waveBreakStates.isEmpty()) return;

        Map<String, KnnView<TimestampedFiringAngle>> views = getOrCreateViews(w.botName);

        if (is1v1 && w.firingWave) {
            scoreVirtualGuns(w, waveBreakStates);
        }

        logWaveData(w, waveBreakStates, views);
    }

    private void scoreVirtualGuns(Wave w, List<RobotState> waveBreakStates) {
        double[] vbAngles = virtualBullets.remove(w);
        if (vbAngles == null) return;

        Wave.Intersection intersection = w.preciseIntersection(waveBreakStates);
        if (intersection == null) return;

        double hitAngle = intersection.angle;
        double tolerance = intersection.bandwidth;
        if (tolerance <= 0) return;

        double angularBotWidth = tolerance * 2.0;
        double hitWeight = 0.1 / angularBotWidth * (w.escapeAngleRange() / 0.9);

        GunStats mStats = mainGunStats.get(w.botName);
        GunStats aStats = antiSurferStats.get(w.botName);

        if (mStats != null) {
            double ux = Math.abs(Angles.normalRelativeAngle(
                vbAngles[0] - hitAngle)) / tolerance;
            mStats.shotsHit += hitWeight * Math.pow(1.6, -ux);
            mStats.shotsFired++;
        }
        if (aStats != null) {
            double ux = Math.abs(Angles.normalRelativeAngle(
                vbAngles[1] - hitAngle)) / tolerance;
            aStats.shotsHit += hitWeight * Math.pow(1.6, -ux);
            aStats.shotsFired++;
        }
    }

    private void logWaveData(Wave w, List<RobotState> waveBreakStates,
                             Map<String, KnnView<TimestampedFiringAngle>> views) {
        RobotState breakState = waveBreakStates.get(waveBreakStates.size() - 1);
        Point2D.Double dv = w.displacementVector(breakState);
        double gf = w.guessFactorPrecise(breakState.location);

        TimestampedFiringAngle tfa = new TimestampedFiringAngle(
            w.fireRound, breakState.time, gf, dv);

        for (KnnView<TimestampedFiringAngle> view : views.values()) {
            if (shouldLog(view, w)) {
                view.logWave(w, tfa);
            }
        }
        if (sampleSink != null && is1v1 && w.firingWave && !w.altWave) {
            double[] sample = Arrays.copyOf(sampleFormula.dataPointFromWave(w), SAMPLE_WIDTH);
            sample[10] = gf;
            sample[11] = dv.x;
            sample[12] = dv.y;
            sampleSink.accept(sample);
        }
    }

    private boolean shouldLog(KnnView<?> view, Wave w) {
        if (w.altWave) return false;
        if (!view.logVisits) return false;
        if (!w.firingWave && !view.logVirtual) return false;
        if (enemiesTotal > 1 && !view.logMelee) return false;
        return true;
    }

    public double calculateBulletPower(double distance, double myEnergy,
                                        double enemyEnergy, int enemiesAlive) {
        if (is1v1) {
            return calculate1v1BulletPower(distance, myEnergy, enemyEnergy);
        }
        return calculateMeleeBulletPower(distance, myEnergy, enemyEnergy, enemiesAlive);
    }

    private double calculate1v1BulletPower(double distance, double myEnergy,
                                            double enemyEnergy) {
        double bulletPower = 1.95;
        if (distance < 150.0) {
            bulletPower = 2.95;
        }
        if (distance > 325.0) {
            double powerDownPoint = DiaUtils.limit(35.0,
                63.0 + (enemyEnergy - myEnergy) * 4.0, 63.0);
            if (myEnergy < powerDownPoint) {
                bulletPower = Math.min(bulletPower,
                    Math.pow(myEnergy / powerDownPoint, 3) * 1.95);
            }
        }
        bulletPower = Math.min(bulletPower, enemyEnergy / 4.0);
        bulletPower = Math.max(bulletPower, 0.1);
        bulletPower = Math.min(bulletPower, myEnergy);
        return bulletPower;
    }

    private double calculateMeleeBulletPower(double distance, double myEnergy,
                                              double enemyEnergy, int enemiesAlive) {
        double bulletPower = 2.999;
        if (enemiesAlive <= 3) bulletPower = 1.999;
        if (enemiesAlive <= 5 && distance > 500.0) bulletPower = 1.499;
        if ((myEnergy < enemyEnergy && enemiesAlive <= 5 && distance > 300.0)
                || distance > 700.0) {
            bulletPower = 0.999;
        }
        if (myEnergy < 20.0 && myEnergy < enemyEnergy) {
            bulletPower = Math.min(bulletPower, 2.0 - (20.0 - myEnergy) / 11.0);
        }
        bulletPower = Math.max(bulletPower, 0.1);
        bulletPower = Math.min(bulletPower, myEnergy);
        return bulletPower;
    }

    /**
     * The virtual guns' battle totals against {@code botName}: main-gun waves, main weighted
     * hits, anti-surfer waves, anti-surfer weighted hits. Zeros before any virtual bullet.
     */
    public double[] virtualGunScores(String botName) {
        GunStats m = mainGunStats.get(botName);
        GunStats a = antiSurferStats.get(botName);
        return new double[] {
            m == null ? 0 : m.shotsFired, m == null ? 0 : m.shotsHit,
            a == null ? 0 : a.shotsFired, a == null ? 0 : a.shotsHit};
    }

    public String bestGunLabel(String botName) {
        if (!is1v1) return mainGun.getLabel();
        GunStats mStats = mainGunStats.get(botName);
        GunStats aStats = antiSurferStats.get(botName);
        double mainRating = mStats != null ? mStats.gunRating() : 0;
        double asRating = aStats != null ? aStats.gunRating() : 0;
        return asRating > mainRating ? antiSurferGun.getLabel() : mainGun.getLabel();
    }

    private static class GunStats {
        int shotsFired = 0;
        double shotsHit = 0.0;

        double gunRating() {
            return shotsFired == 0 ? 0.0 : shotsHit / (double) shotsFired;
        }
    }
}
