package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

public abstract class Timestamped implements Comparable<Timestamped> {
    /** The round a seeded sample is filed under: before any round of this battle. */
    public static final int SEED_ROUND = -1;

    public final int round;
    public final long time;
    /** Null for a sample observed in this battle; the seed's shared weight otherwise (ADAPT-3). */
    public final SeedWeight seed;

    public Timestamped(int round, long time) {
        this(round, time, null);
    }

    public Timestamped(int round, long time, SeedWeight seed) {
        this.round = round;
        this.time = time;
        this.seed = seed;
    }

    /** 1 for a live sample, the seed's current weight for a seeded one. */
    public double weight() {
        return seed == null ? 1.0 : seed.value();
    }

    @Override
    public int compareTo(Timestamped that) {
        if (this.round != that.round) return Integer.compare(this.round, that.round);
        return Long.compare(this.time, that.time);
    }
}
