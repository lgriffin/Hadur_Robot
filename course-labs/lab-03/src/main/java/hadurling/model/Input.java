package hadurling.model;

import java.util.List;
import java.util.Objects;

/**
 * Everything the brain may know at the start of one tick: our own state and the events since
 * the last tick. It is a snapshot. Nothing in it changes after construction, so the brain
 * can keep it, compare it or replay it without surprises.
 *
 * <p>Angles are radians, 0 north, clockwise; positions are px from the bottom left corner.</p>
 */
public final class Input {

    private final long time;
    private final double x;
    private final double y;
    private final double heading;
    private final double velocity;
    private final double energy;
    private final double gunHeat;
    private final double gunHeading;
    private final double radarHeading;
    private final List<Event> events;

    /**
     * A snapshot of one tick.
     *
     * @param time the tick number
     * @param x our x in px
     * @param y our y in px
     * @param heading our body's heading in radians
     * @param velocity our velocity in px/tick
     * @param energy our energy
     * @param gunHeat the gun's heat; it can fire at 0
     * @param gunHeading the gun's heading in radians
     * @param radarHeading the radar's heading in radians
     * @param events what happened since the last tick, in order; copied, so the caller may
     *     go on changing its own list
     */
    public Input(long time, double x, double y, double heading, double velocity, double energy,
            double gunHeat, double gunHeading, double radarHeading, List<Event> events) {
        this.time = time;
        this.x = x;
        this.y = y;
        this.heading = heading;
        this.velocity = velocity;
        this.energy = energy;
        this.gunHeat = gunHeat;
        this.gunHeading = gunHeading;
        this.radarHeading = radarHeading;
        // List.copyOf is a defensive copy and is also unmodifiable (and rejects nulls).
        this.events = List.copyOf(events);
    }

    /** @return the tick number */
    public long time() { return time; }
    /** @return our x in px */
    public double x() { return x; }
    /** @return our y in px */
    public double y() { return y; }
    /** @return our body's heading in radians */
    public double heading() { return heading; }
    /** @return our velocity in px/tick */
    public double velocity() { return velocity; }
    /** @return our energy */
    public double energy() { return energy; }
    /** @return the gun's heat */
    public double gunHeat() { return gunHeat; }
    /** @return the gun's heading in radians */
    public double gunHeading() { return gunHeading; }
    /** @return the radar's heading in radians */
    public double radarHeading() { return radarHeading; }
    /** @return the events since the last tick; unmodifiable */
    public List<Event> events() { return events; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Input)) return false;
        Input i = (Input) o;
        return time == i.time && Event.same(x, i.x) && Event.same(y, i.y)
            && Event.same(heading, i.heading) && Event.same(velocity, i.velocity)
            && Event.same(energy, i.energy) && Event.same(gunHeat, i.gunHeat)
            && Event.same(gunHeading, i.gunHeading) && Event.same(radarHeading, i.radarHeading)
            && events.equals(i.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, x, y, heading, velocity, energy, gunHeat, gunHeading,
            radarHeading, events);
    }

    @Override
    public String toString() {
        return "Input[t=" + time + ", x=" + x + ", y=" + y + ", events=" + events + "]";
    }
}
