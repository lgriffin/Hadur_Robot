package hadur117.gun;

import hadur117.utils.*;
import java.awt.geom.Point2D;
import java.util.*;
import robocode.util.Utils;

public class GunController {

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

    public GunController(BattleField battleField, int enemiesTotal) {
        this.battleField = battleField;
        this.enemiesTotal = enemiesTotal;
        this.is1v1 = (enemiesTotal <= 1);
        this.mainGun = new MainGun(battleField);
        this.antiSurferGun = new AntiSurferGun(battleField, is1v1);
    }

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
            views.put(MainGun.viewName(), mainGun.createView(enemiesTotal));
            for (KnnView<TimestampedFiringAngle> asView : antiSurferGun.createViews()) {
                views.put(asView.name, asView);
            }
            return views;
        });
    }

    public double aim(Wave w, Point2D.Double myNextLocation, long currentTime) {
        Map<String, KnnView<TimestampedFiringAngle>> views = getOrCreateViews(w.botName);
        KnnView<TimestampedFiringAngle> mainView = views.get(MainGun.viewName());

        if (mainView.size() < DATA_THRESHOLD) {
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
            double ux = Math.abs(Utils.normalRelativeAngle(
                vbAngles[0] - hitAngle)) / tolerance;
            mStats.shotsHit += hitWeight * Math.pow(1.6, -ux);
            mStats.shotsFired++;
        }
        if (aStats != null) {
            double ux = Math.abs(Utils.normalRelativeAngle(
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
        return hadur117.melee.MeleeGun.basePower(distance, myEnergy, enemyEnergy, enemiesAlive);
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
