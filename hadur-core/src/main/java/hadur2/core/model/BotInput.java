package hadur2.core.model;

import java.util.List;

/**
 * Everything the core sees in one tick: the robot's own state and the events that
 * arrived with it. Immutable, so a battle is just a list of these. Angles are radians
 * (headings absolute, 0 = north, clockwise), as from the engine's {@code ...Radians()} getters.
 */
public final class BotInput {
    private final long time;
    private final int round;
    private final double x;
    private final double y;
    private final double heading;
    private final double velocity;
    private final double energy;
    private final double gunHeat;
    private final double gunCoolingRate;
    private final double gunHeading;
    private final double gunTurnRemaining;
    private final double radarHeading;
    private final int others;
    private final List<BotEvent> events;

    public BotInput(long time, int round, double x, double y, double heading, double velocity, double energy, double gunHeat, double gunCoolingRate, double gunHeading, double gunTurnRemaining, double radarHeading, int others, List<BotEvent> events) {
        this.time = time;
        this.round = round;
        this.x = x;
        this.y = y;
        this.heading = heading;
        this.velocity = velocity;
        this.energy = energy;
        this.gunHeat = gunHeat;
        this.gunCoolingRate = gunCoolingRate;
        this.gunHeading = gunHeading;
        this.gunTurnRemaining = gunTurnRemaining;
        this.radarHeading = radarHeading;
        this.others = others;
        this.events = List.copyOf(events);
    }

    public long time() {
        return time;
    }

    public int round() {
        return round;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double heading() {
        return heading;
    }

    public double velocity() {
        return velocity;
    }

    public double energy() {
        return energy;
    }

    public double gunHeat() {
        return gunHeat;
    }

    public double gunCoolingRate() {
        return gunCoolingRate;
    }

    public double gunHeading() {
        return gunHeading;
    }

    public double gunTurnRemaining() {
        return gunTurnRemaining;
    }

    public double radarHeading() {
        return radarHeading;
    }

    public int others() {
        return others;
    }

    public List<BotEvent> events() {
        return events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BotInput)) return false;
        BotInput that = (BotInput) o;
        return time == that.time
            && round == that.round
            && Double.compare(x, that.x) == 0
            && Double.compare(y, that.y) == 0
            && Double.compare(heading, that.heading) == 0
            && Double.compare(velocity, that.velocity) == 0
            && Double.compare(energy, that.energy) == 0
            && Double.compare(gunHeat, that.gunHeat) == 0
            && Double.compare(gunCoolingRate, that.gunCoolingRate) == 0
            && Double.compare(gunHeading, that.gunHeading) == 0
            && Double.compare(gunTurnRemaining, that.gunTurnRemaining) == 0
            && Double.compare(radarHeading, that.radarHeading) == 0
            && others == that.others
            && java.util.Objects.equals(events, that.events);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(time, round, x, y, heading, velocity, energy, gunHeat, gunCoolingRate, gunHeading, gunTurnRemaining, radarHeading, others, events);
    }

    @Override
    public String toString() {
        return "BotInput[time=" + time + ", round=" + round + ", x=" + x + ", y=" + y + ", heading=" + heading + ", velocity=" + velocity + ", energy=" + energy + ", gunHeat=" + gunHeat + ", gunCoolingRate=" + gunCoolingRate + ", gunHeading=" + gunHeading + ", gunTurnRemaining=" + gunTurnRemaining + ", radarHeading=" + radarHeading + ", others=" + others + ", events=" + events + "]";
    }

    public java.awt.geom.Point2D.Double location() {
        return new java.awt.geom.Point2D.Double(x, y);
    }
}
