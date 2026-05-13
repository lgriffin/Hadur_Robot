package hadur117.movement.danger;

import hadur117.movement.EnemyWave;

public class HeadOnDangerModel implements DangerModel {

    private static final int BINS = 47;
    private static final int CENTER_BIN = 23;
    private static final double SIGMA = 0.05;
    private static final double TWO_SIGMA_SQ = 2.0 * SIGMA * SIGMA;

    private double avgDanger = 0.1;
    private int hitCount = 0;

    @Override
    public double danger(EnemyWave wave, int bin) {
        double gf = (double) (bin - CENTER_BIN) / CENTER_BIN;
        return Math.exp(-(gf * gf) / TWO_SIGMA_SQ);
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
        return "HOT";
    }
}
