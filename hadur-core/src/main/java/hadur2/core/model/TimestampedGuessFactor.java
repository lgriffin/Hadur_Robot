package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

/**
 * One of the surf's KNN samples: the guess factor at which an enemy wave met us, or at
 * which one of its bullets hit us, logged by {@code MoveController} (or replayed from a surf
 * seed). The surf's danger for a candidate position is a kernel density over these guess
 * factors, turned back into firing angles on the wave being surfed with
 * {@link Wave#firingAngle}.
 */
public class TimestampedGuessFactor extends Timestamped {
    /**
     * The guess factor, from {@link Wave#guessFactor(double)}: the classic bound
     * {@code asin(8 / bulletSpeed)} is the unit, so values stay near [-1, 1] but are not
     * clamped.
     */
    public double guessFactor;

    /**
     * A sample observed in this battle.
     *
     * @param round the round of the wave
     * @param time the tick it was logged
     * @param guessFactor the guess factor
     */
    public TimestampedGuessFactor(int round, long time, double guessFactor) {
        this(round, time, guessFactor, null);
    }

    /**
     * A sample, seeded when {@code seed} is not null (ADAPT-3).
     *
     * @param round the round of the wave, or {@link Timestamped#SEED_ROUND}
     * @param time the tick it was logged, or the seed's load order
     * @param guessFactor the guess factor
     * @param seed the seed's shared weight, or null for a live sample
     */
    public TimestampedGuessFactor(int round, long time, double guessFactor, SeedWeight seed) {
        super(round, time, seed);
        this.guessFactor = guessFactor;
    }
}
