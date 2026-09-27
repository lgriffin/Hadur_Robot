package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

/**
 * A sample stored in a KNN view, stamped with when it was observed. The KNN views hold one
 * subclass each: the gun's {@link TimestampedFiringAngle}s and the surf's
 * {@link TimestampedGuessFactor}s.
 *
 * <p>The stamp does two jobs. The natural order (round, then tick) is what
 * {@code KnnView.getDecayWeights} sorts by to give recent neighbours more say than old ones.
 * Seeded samples, replayed from an opponent profile, are filed under {@link #SEED_ROUND}
 * with a running count as their "tick", so they sort before every live sample and count as
 * the oldest. And {@link #weight()} gives the seed's shared weight (ADAPT-3), which the guns
 * and the surf multiply into each neighbour's contribution.</p>
 *
 * <p>The order is not consistent with {@code equals}: two samples with the same stamp
 * compare as equal but are different objects. That is harmless here: samples do not
 * override {@code equals}, so the map that holds the decay weights keys them by identity.</p>
 */
public abstract class Timestamped implements Comparable<Timestamped> {
    /** The round a seeded sample is filed under: before any round of this battle. */
    public static final int SEED_ROUND = -1;

    /** The round the sample was observed in, from 0; {@link #SEED_ROUND} for a seed. */
    public final int round;
    /** The tick it was observed at; for a seed, its position in the order it was loaded. */
    public final long time;
    /** Null for a sample observed in this battle; the seed's shared weight otherwise (ADAPT-3). */
    public final SeedWeight seed;

    /**
     * A sample observed in this battle, which weighs 1.
     *
     * @param round the round it was observed in
     * @param time the tick it was observed at
     */
    public Timestamped(int round, long time) {
        this(round, time, null);
    }

    /**
     * A sample, seeded when {@code seed} is not null.
     *
     * @param round the round it was observed in, or {@link #SEED_ROUND}
     * @param time the tick it was observed at, or its load order for a seed
     * @param seed the seed's shared weight, or null for a sample observed in this battle
     */
    public Timestamped(int round, long time, SeedWeight seed) {
        this.round = round;
        this.time = time;
        this.seed = seed;
    }

    /** 1 for a live sample, the seed's current weight for a seeded one. */
    public double weight() {
        return seed == null ? 1.0 : seed.value();
    }

    /** Orders by round, then by tick: older samples first, seeds before all live ones. */
    @Override
    public int compareTo(Timestamped that) {
        if (this.round != that.round) return Integer.compare(this.round, that.round);
        return Long.compare(this.time, that.time);
    }
}
