package hadur117.utils;

public abstract class Timestamped implements Comparable<Timestamped> {
    public final int round;
    public final long time;

    public Timestamped(int round, long time) {
        this.round = round;
        this.time = time;
    }

    @Override
    public int compareTo(Timestamped that) {
        if (this.round != that.round) return Integer.compare(this.round, that.round);
        return Long.compare(this.time, that.time);
    }
}
