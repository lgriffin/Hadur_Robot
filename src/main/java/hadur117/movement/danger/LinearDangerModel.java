package hadur117.movement.danger;

import hadur117.movement.EnemyWave;

public class LinearDangerModel implements DangerModel {

    private static final int BINS = 47;
    private static final int CENTER_BIN = 23;
    private static final double SIGMA = 0.08;
    private static final double TWO_SIGMA_SQ = 2.0 * SIGMA * SIGMA;
    private static final double MAX_VELOCITY = 8.0;

    private double avgDanger = 0.1;
    private int hitCount = 0;

    @Override
    public double danger(EnemyWave wave, int bin) {
        double predictedGF = predictLinearGF(wave);
        double gf = (double) (bin - CENTER_BIN) / CENTER_BIN;
        double diff = gf - predictedGF;
        return Math.exp(-(diff * diff) / TWO_SIGMA_SQ);
    }

    @Override
    public void logHit(EnemyWave wave, int bin) {
        double dangerAtHit = danger(wave, bin);
        hitCount++;
        avgDanger = avgDanger * 0.95 + dangerAtHit * 0.05;
    }

    @Override
    public void decay(EnemyWave wave) {
        // stateless — no decay needed
    }

    @Override
    public double getWeight() {
        return Math.pow(Math.max(0.001, avgDanger), 3);
    }

    @Override
    public String name() {
        return "Linear";
    }

    private double predictLinearGF(EnemyWave wave) {
        double latVel = wave.myLateralVelocity;
        double dist = estimateDistance(wave);
        if (dist < 1) return 0;
        double bft = dist / wave.bulletSpeed;

        double displacement = latVel * bft;
        double mea = Math.asin(MAX_VELOCITY / wave.bulletSpeed);
        double angle = Math.atan2(displacement, dist);
        double gf = angle / mea;
        return Math.max(-1.0, Math.min(1.0, gf));
    }

    private double estimateDistance(EnemyWave wave) {
        if (wave.dangerFeatures != null && wave.dangerFeatures.length >= 1) {
            return wave.dangerFeatures[0] * 800.0;
        }
        return 400;
    }
}
