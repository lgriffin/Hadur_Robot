package hadur117.utils;

public class TimestampedGuessFactor extends Timestamped {
    public double guessFactor;

    public TimestampedGuessFactor(int round, long time, double guessFactor) {
        super(round, time);
        this.guessFactor = guessFactor;
    }
}
