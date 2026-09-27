package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

public class TimestampedGuessFactor extends Timestamped {
    public double guessFactor;

    public TimestampedGuessFactor(int round, long time, double guessFactor) {
        this(round, time, guessFactor, null);
    }

    public TimestampedGuessFactor(int round, long time, double guessFactor, SeedWeight seed) {
        super(round, time, seed);
        this.guessFactor = guessFactor;
    }
}
