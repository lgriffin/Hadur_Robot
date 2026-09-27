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
    /**
     * Energy drops 1.20 would have read as shots that the energy ledger explained as hits,
     * refunds, wall or collision damage (WAVE-1). Each one was a wave that did not exist.
     */
    public int phantomWaves;
    /** Ticks the radar spent sweeping to find the enemy again after a missed scan (RADAR-1). */
    public int radarReacquired;
    /** Shots the ledger found that the raw drop hid (for example, fired in a tick we hit them). */
    public int hiddenShots;
    /** Our bullets destroyed by enemy bullets (SHIELD-1). */
    public int bulletsIntercepted;
    /** Shots fired with an anti-shield aim offset (SHIELD-2). */
    public int jitteredShots;
    /** Tick-budget computation level; 0 (full) until S6. */
    public int computationLevel;
    /** Opponent memory, battle totals so far: profiles that failed to load (MEM-4). */
    public int profileLoadFailures;
    /** Profile saves that failed or were skipped for want of room (MEM-3). */
    public int profileSaveFailures;
    /** Profiles whose seeds were dropped to make room (MEM-5). */
    public int seedsEvicted;
    /** Waves on which a seed's weight was lowered because the opponent left its profile (RES-4), battle total. */
    public int seedDecays;

    /** S5: the sum and count of scan distances, for the round's mean fighting distance. */
    public double distanceSum;
    public int distanceScans;
    /** S5: the distance controller's target at the round's end (DIST-1). */
    public double targetDistance = Double.NaN;
    /** S5: duel ticks spent finishing (END-1) and ramming (END-2). */
    public int finishTicks;
    public int ramTicks;
    /** S5: shots fired at full power (POW-1, POW-2; the gun's own choice never reaches 3.0). */
    public int fullPowerShots;

    public double meanDistance() {
        return distanceScans == 0 ? Double.NaN : distanceSum / distanceScans;
    }

    public double ourHitRate() {
        return shotsFired == 0 ? 0 : (double) shotsHit / shotsFired;
    }

    public double theirHitRate() {
        return enemyShotsDetected == 0 ? 0 : (double) hitsTaken / enemyShotsDetected;
    }

    /**
     * The round-end record: {@code R,round,tick,result,ourEnergy,enemyEnergy,ourHitRate,
     * ourMargin,theirHitRate,theirMargin,phantomWaves,skippedTurns,faults,computationLevel,
     * radarReacquired,hiddenShots,profileLoadFailures,profileSaveFailures,seedsEvicted,
     * bulletsIntercepted,jitteredShots,shotsFired,seedDecays,meanDistance,targetDistance,
     * finishTicks,ramTicks,fullPowerShots}. The memory fields are battle totals so
     * far, not this round's. Fields are only ever appended, so older readers still work.
     */
    public String toRecord(int round, long tick, String result, double ourEnergy,
                           double enemyEnergy) {
        return String.format(Locale.ROOT, "R,%d,%d,%s,%.2f,%.2f,%.4f,%.4f,%.4f,%.4f,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%.1f,%.1f,%d,%d,%d",
            round, tick, result, ourEnergy, enemyEnergy,
            ourHitRate(), margin(ourHitRate(), shotsFired),
            theirHitRate(), margin(theirHitRate(), enemyShotsDetected),
            phantomWaves, skippedTurns, faults, computationLevel, radarReacquired, hiddenShots,
            profileLoadFailures, profileSaveFailures, seedsEvicted,
            bulletsIntercepted, jitteredShots, shotsFired, seedDecays,
            meanDistance(), targetDistance, finishTicks, ramTicks, fullPowerShots);
    }

    private static double margin(double p, int n) {
        return n == 0 ? 1.0 : DiaUtils.marginOfError(p, n);
    }
}
