package hadur117.model;

public class Snapshot {
    public final long tick;
    public final double heading;
    public final double velocity;
    public final double energy;
    public final double x;
    public final double y;

    public Snapshot(long tick, double heading, double velocity,
                    double energy, double x, double y) {
        this.tick = tick;
        this.heading = heading;
        this.velocity = velocity;
        this.energy = energy;
        this.x = x;
        this.y = y;
    }
}
