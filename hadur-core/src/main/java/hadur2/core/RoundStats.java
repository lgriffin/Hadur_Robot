package hadur2.core;

import hadur2.core.physics.DiaUtils;
import java.util.Locale;

/**
 * Per-round counters. Every fault and degradation counter lands here and in the
 * {@code R} telemetry record, so the bench report can show it (RES-5).
 *
 * <p>{@link HadurCore} creates a fresh instance in {@code newRound} and writes the fields
 * as the round runs (the fields are public for exactly that, and for tests); at the round's
 * end {@link HadurCore#roundEnded} fills in the fields it reads from its subsystems and
 * emits {@link #toRecord}. Most counters are this round's; the memory fields and
 * {@link #seedDecays} are battle totals so far, and {@link #flavourStep} is the step
 * reached in the battle. Nothing here grows: it is a fixed set of numbers (RES-2).</p>
 */
public final class RoundStats {

    /**
     * Bullets we fired this round, duel and melee alike (the core counts the fire order it
     * issues).
     */
    public int shotsFired;
    /** Our bullets that hit a robot this round, any robot, sentries included. */
    public int shotsHit;
    /** Enemy shots the duel's energy ledger found this round (WAVE-1, WAVE-2); melee shots are not counted. */
    public int enemyShotsDetected;
    /** Bullets that hit us this round, from any robot, sentries included. */
    public int hitsTaken;
    /**
     * Faults this round. {@link HadurCore#roundEnded} sets it to the ticks the {@link Guard}
     * covered (RES-1); melee faults (GATE-4) are counted here during the round but that
     * assignment replaces them, and they reach the report through the {@code M} record.
     */
    public int faults;
    /** Skipped-turn events this round (TIME-2). */
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
    /** The highest tick-budget computation level this round used, 0 (full) to 3 (TIME-1, TIME-2). */
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
    /** S5: the duel scans summed into {@link #distanceSum}. */
    public int distanceScans;
    /** S5: the distance controller's target at the round's end (DIST-1). */
    public double targetDistance = Double.NaN;
    /** S5: duel ticks spent finishing a weak enemy at close range (END-1). */
    public int finishTicks;
    /** S5: duel ticks spent ramming a disabled enemy (END-2). */
    public int ramTicks;
    /** S5: shots fired at full power (POW-1, POW-2; the gun's own choice never reaches 3.0). */
    public int fullPowerShots;
    /** S6: ticks that used more than 70% of the allowance (TIME-1). */
    public int slowTicks;
    /** S6: enemy firing waves one of our bullets shadowed (MOVE-1). */
    public int shadowedWaves;
    /** S6: enemy bullets ours destroyed that were inside a shadow Hadur had computed (MOVE-1's fidelity). */
    public int interceptsShadowed;
    /** S6: movement flavour changes made this round (MOVE-2). */
    public int flavourChanges;
    /**
     * S6: the ordinal of the movement flavour step reached in the battle so far (MOVE-2):
     * 0 for the opening's movement ({@code BASE}), 1 flattener, 2 go-to surfing, 3 the band
     * moved out.
     */
    public int flavourStep;
    /** RES-9: ticks this round that ran at the duress level. */
    public int duressTicks;

    /**
     * The round's mean distance to the duel opponent over the scans the duel handled.
     *
     * @return the mean in px, or NaN if the duel handled no scan this round
     */
    public double meanDistance() {
        return distanceScans == 0 ? Double.NaN : distanceSum / distanceScans;
    }

    /**
     * Our hit rate over the whole round: {@link #shotsHit} over {@link #shotsFired}. Unlike
     * the policies' rolling windows, this is the round's plain total, for the report.
     *
     * @return a fraction in [0, 1], 0 with no shots
     */
    public double ourHitRate() {
        return shotsFired == 0 ? 0 : (double) shotsHit / shotsFired;
    }

    /**
     * Their hit rate over the whole round: {@link #hitsTaken} over
     * {@link #enemyShotsDetected}. The two counts come from different places (every hit on
     * us, only the shots the ledger found), so the ratio can exceed 1 when shots go unseen.
     *
     * @return a non-negative fraction, 0 with no detected shots
     */
    public double theirHitRate() {
        return enemyShotsDetected == 0 ? 0 : (double) hitsTaken / enemyShotsDetected;
    }

    /**
     * The round-end record: {@code R,round,tick,result,ourEnergy,enemyEnergy,ourHitRate,
     * ourMargin,theirHitRate,theirMargin,phantomWaves,skippedTurns,faults,computationLevel,
     * radarReacquired,hiddenShots,profileLoadFailures,profileSaveFailures,seedsEvicted,
     * bulletsIntercepted,jitteredShots,shotsFired,seedDecays,meanDistance,targetDistance,
     * finishTicks,ramTicks,fullPowerShots,slowTicks,shadowedWaves,flavourChanges,flavourStep,interceptsShadowed,duressTicks}. The memory fields are battle totals so
     * far, not this round's. Fields are only ever appended, so older readers still work.
     *
     * <p>Numbers are formatted with {@link Locale#ROOT}, so the decimal separator is always
     * a dot whatever the machine's locale, and the record stays a valid CSV line.</p>
     *
     * @param round the round number, from 0
     * @param tick the tick the round ended on
     * @param result {@code win}, {@code loss} or {@code draw}
     * @param ourEnergy our energy at the round's end
     * @param enemyEnergy the duel opponent's energy at its last scan
     * @return the {@code R} line, without a line break
     */
    public String toRecord(int round, long tick, String result, double ourEnergy,
                           double enemyEnergy) {
        return String.format(Locale.ROOT, "R,%d,%d,%s,%.2f,%.2f,%.4f,%.4f,%.4f,%.4f,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%.1f,%.1f,%d,%d,%d,%d,%d,%d,%d,%d,%d",
            round, tick, result, ourEnergy, enemyEnergy,
            ourHitRate(), margin(ourHitRate(), shotsFired),
            theirHitRate(), margin(theirHitRate(), enemyShotsDetected),
            phantomWaves, skippedTurns, faults, computationLevel, radarReacquired, hiddenShots,
            profileLoadFailures, profileSaveFailures, seedsEvicted,
            bulletsIntercepted, jitteredShots, shotsFired, seedDecays,
            meanDistance(), targetDistance, finishTicks, ramTicks, fullPowerShots,
            slowTicks, shadowedWaves, flavourChanges, flavourStep, interceptsShadowed, duressTicks);
    }

    /**
     * The 95% margin of error of a rate {@code p} over {@code n} samples, for the report.
     * This is the plain Wald interval, {@code 1.96 * sqrt(p (1 - p) / n)} (see
     * {@link DiaUtils#marginOfError}), not the Agresti-Coull margin the policies use, so it
     * reads 0 for a rate of exactly 0 or 1. With no samples at all the margin is 1: nothing
     * is known.
     */
    private static double margin(double p, int n) {
        return n == 0 ? 1.0 : DiaUtils.marginOfError(p, n);
    }
}
