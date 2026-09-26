package hadur2.core;

import hadur2.core.physics.DiaUtils;
import java.util.Locale;

/**
 * Per-round counters. Every fault and degradation counter lands here and in the
 * {@code R} telemetry record, so the bench report can show it (RES-5).
 */
public final class RoundStats {

    public int shotsFired;
    public int shotsHit;
    public int enemyShotsDetected;
    public int hitsTaken;
    public int faults;
    public int skippedTurns;
    /** Energy drops read as shots that the S2 ledger will show were not; 0 until S2. */
    public int phantomWaves;
    /** Tick-budget computation level; 0 (full) until S6. */
    public int computationLevel;

    public double ourHitRate() {
        return shotsFired == 0 ? 0 : (double) shotsHit / shotsFired;
    }

    public double theirHitRate() {
        return enemyShotsDetected == 0 ? 0 : (double) hitsTaken / enemyShotsDetected;
    }

    /**
     * The round-end record: {@code R,round,tick,result,ourEnergy,enemyEnergy,ourHitRate,
     * ourMargin,theirHitRate,theirMargin,phantomWaves,skippedTurns,faults,computationLevel}.
     */
    public String toRecord(int round, long tick, String result, double ourEnergy,
                           double enemyEnergy) {
        return String.format(Locale.ROOT, "R,%d,%d,%s,%.2f,%.2f,%.4f,%.4f,%.4f,%.4f,%d,%d,%d,%d",
            round, tick, result, ourEnergy, enemyEnergy,
            ourHitRate(), margin(ourHitRate(), shotsFired),
            theirHitRate(), margin(theirHitRate(), enemyShotsDetected),
            phantomWaves, skippedTurns, faults, computationLevel);
    }

    private static double margin(double p, int n) {
        return n == 0 ? 1.0 : DiaUtils.marginOfError(p, n);
    }
}
