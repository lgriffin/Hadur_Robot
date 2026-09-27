package hadur2.core.melee;

import java.util.Arrays;

/**
 * What Hadur remembers about one opponent from melee battles (MMEM-1): how often its
 * inferred shots hit Hadur, whether those hits were aimed head-on or led, how hard it
 * fires, how often it comes in to ram, and where it usually finishes. It is kept apart
 * from the 1v1 profile, in its own file, so a melee never changes a duel's opening.
 *
 * <p>The counts are floats so they can decay: like the 1v1 profile, each group is halved
 * once it passes its limit, which keeps the block small and weighted toward recent battles.
 * A {@link MeleeProfileFolder} adds one round at a time; {@link MeleeProfileCodec} writes
 * it. Every count is finite and not negative.</p>
 */
public final class MeleeProfile {

    /** Aim classes of the hits on Hadur, the index into {@link #aimHits}. */
    public enum AimClass { HEAD_ON, LINEAR }

    /** A style needs this many classified hits before it is named. */
    static final int MIN_AIM_HITS = 3;
    /** Shots (and their hits, aims and powers) are halved past this. */
    static final float SHOT_LIMIT = 2000f;
    /** Close scans (and ram scans) are halved past this. */
    static final float SCAN_LIMIT = 20000f;
    /** Ranked rounds are halved past this. */
    static final float RANK_LIMIT = 200f;

    private final String key;
    int rounds;
    /** The melee battle stamp this opponent was last fought in; newer battles stamp higher. */
    long lastFought;
    float shotsInferred;
    float hitsOnHadur;
    final float[] aimHits = new float[AimClass.values().length];
    float powerSum;
    float powerCount;
    float closeScans;
    float ramScans;
    float rankSum;
    float rankRounds;

    public MeleeProfile(String key) {
        this.key = key;
    }

    public String key() { return key; }
    public int rounds() { return rounds; }
    public long lastFought() { return lastFought; }
    public double shotsInferred() { return shotsInferred; }
    public double hitsOnHadur() { return hitsOnHadur; }
    public double aimHits(AimClass c) { return aimHits[c.ordinal()]; }

    /** Its hits on Hadur per shot inferred, or NaN before any shot. */
    public double meleeHitRateOnHadur() {
        return shotsInferred <= 0 ? Double.NaN : Math.min(1.0, hitsOnHadur / shotsInferred);
    }

    /** How its hits on Hadur were aimed, or null until {@link #MIN_AIM_HITS} are classified. */
    public AimClass aimStyle() {
        float headOn = aimHits[AimClass.HEAD_ON.ordinal()];
        float linear = aimHits[AimClass.LINEAR.ordinal()];
        if (headOn + linear < MIN_AIM_HITS) return null;
        return headOn >= linear ? AimClass.HEAD_ON : AimClass.LINEAR;
    }

    /** The mean power of its inferred shots, or NaN before any. */
    public double avgBulletPower() {
        return powerCount <= 0 ? Double.NaN : powerSum / powerCount;
    }

    /** The share of its close scans that were at ramming range, or NaN before any. */
    public double rams() {
        return closeScans <= 0 ? Double.NaN : Math.min(1.0, ramScans / closeScans);
    }

    /** Its mean finishing place among the opponents (1 is last alive), or NaN before any. */
    public double typicalSurvivalRank() {
        return rankRounds <= 0 ? Double.NaN : rankSum / rankRounds;
    }

    /**
     * Adds one round's observations, stamped {@code stamp}. {@code rank} is its finishing
     * place, or 0 when the round did not rank it.
     */
    void fold(long stamp, double shots, double hits, double headOnHits, double linearHits,
              double powers, double powerShots, double close, double ram, int rank) {
        rounds = rounds == Integer.MAX_VALUE ? rounds : rounds + 1;
        lastFought = Math.max(lastFought, stamp);
        shotsInferred += shots;
        hitsOnHadur += hits;
        aimHits[AimClass.HEAD_ON.ordinal()] += headOnHits;
        aimHits[AimClass.LINEAR.ordinal()] += linearHits;
        powerSum += powers;
        powerCount += powerShots;
        closeScans += close;
        ramScans += ram;
        if (rank > 0) {
            rankSum += rank;
            rankRounds++;
        }
        decay();
    }

    /** Marks the block as fought in battle {@code stamp}, without adding a round. */
    void stamp(long stamp) {
        lastFought = Math.max(lastFought, stamp);
    }

    /** Halves each group of counts that has grown past its limit. */
    void decay() {
        if (shotsInferred > SHOT_LIMIT || powerCount > SHOT_LIMIT) {
            shotsInferred /= 2;
            hitsOnHadur /= 2;
            aimHits[0] /= 2;
            aimHits[1] /= 2;
            powerSum /= 2;
            powerCount /= 2;
        }
        if (closeScans > SCAN_LIMIT) {
            closeScans /= 2;
            ramScans /= 2;
        }
        if (rankRounds > RANK_LIMIT) {
            rankSum /= 2;
            rankRounds /= 2;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MeleeProfile)) return false;
        MeleeProfile p = (MeleeProfile) o;
        return key.equals(p.key) && rounds == p.rounds && lastFought == p.lastFought
            && Float.compare(shotsInferred, p.shotsInferred) == 0
            && Float.compare(hitsOnHadur, p.hitsOnHadur) == 0 && Arrays.equals(aimHits, p.aimHits)
            && Float.compare(powerSum, p.powerSum) == 0 && Float.compare(powerCount, p.powerCount) == 0
            && Float.compare(closeScans, p.closeScans) == 0 && Float.compare(ramScans, p.ramScans) == 0
            && Float.compare(rankSum, p.rankSum) == 0 && Float.compare(rankRounds, p.rankRounds) == 0;
    }

    @Override
    public int hashCode() {
        return key.hashCode() * 31 + rounds;
    }

    @Override
    public String toString() {
        return "MeleeProfile[" + key + ", rounds=" + rounds + ", lastFought=" + lastFought
            + ", shots=" + shotsInferred + ", hits=" + hitsOnHadur + "]";
    }
}
