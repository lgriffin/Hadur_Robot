package hadur117.model;

/**
 * Immutable snapshot of an opponent's state at a single tick.
 *
 * <p>Used by {@link hadur117.intel.Brain} in a sliding window for movement
 * classification (heading-change analysis, reversal detection, etc.).</p>
 */
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
