package hadur2.core.model;

import java.util.List;

/**
 * Everything the core sees in one tick: the robot's own state and the events that
 * arrived with it. Immutable, so a battle is just a list of these. Angles are radians
 * (headings absolute, 0 = north, clockwise), as from the engine's {@code ...Radians()} getters.
 *
 * <p>The adapter builds one per tick from the robot's getters and the events its handlers
 * queued since the last one, and passes it to {@code Guard.tick}, which hands it to
 * {@code HadurCore.tick}; the core answers with a {@link BotOrders}. Positions are the
 * engine's: pixels, origin at the bottom-left corner of the field, y growing upward.
 * Distances are pixels, velocities pixels per tick, times ticks within the round.</p>
 *
 * <p>Because this value is all the core sees, identical sequences of it (with identical
 * profile state) must give identical orders (CORE-2); {@link #equals} compares every field
 * and the event list, so recorded and replayed inputs can be checked exactly. The adapt
 * and policy packages may not see this type (DIAL-2), since it carries the tick and the
 * round number.</p>
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
    /** Sentry robots still alive, which {@link #others()} leaves out (Robocode 1.9). */
    private final int numSentries;
    /** How far in from each wall the sentries guard; 0 without sentries. */
    private final double sentryBorderSize;

    /**
     * An input for a battle without sentries.
     *
     * @param time the tick within the round
     * @param round the round number, from 0
     * @param x our centre's x, pixels
     * @param y our centre's y, pixels
     * @param heading our body heading, radians (0 = north, clockwise)
     * @param velocity our velocity, pixels per tick, negative when driving backwards
     * @param energy our energy
     * @param gunHeat our gun heat; the gun can fire only at 0
     * @param gunCoolingRate gun heat lost per tick
     * @param gunHeading our gun heading, radians (0 = north, clockwise)
     * @param gunTurnRemaining radians the gun still has to turn, clockwise positive
     * @param radarHeading our radar heading, radians (0 = north, clockwise)
     * @param others opponents still alive, not counting sentries
     * @param events the events that arrived with this tick, in the engine's order
     */
    public BotInput(long time, int round, double x, double y, double heading, double velocity, double energy, double gunHeat, double gunCoolingRate, double gunHeading, double gunTurnRemaining, double radarHeading, int others, List<BotEvent> events) {
        this(time, round, x, y, heading, velocity, energy, gunHeat, gunCoolingRate, gunHeading,
            gunTurnRemaining, radarHeading, others, events, 0, 0);
    }

    /**
     * An input, with the border sentries Robocode 1.9 can add to a battle.
     *
     * @param time the tick within the round
     * @param round the round number, from 0
     * @param x our centre's x, pixels
     * @param y our centre's y, pixels
     * @param heading our body heading, radians (0 = north, clockwise)
     * @param velocity our velocity, pixels per tick, negative when driving backwards
     * @param energy our energy
     * @param gunHeat our gun heat; the gun can fire only at 0
     * @param gunCoolingRate gun heat lost per tick
     * @param gunHeading our gun heading, radians (0 = north, clockwise)
     * @param gunTurnRemaining radians the gun still has to turn, clockwise positive
     * @param radarHeading our radar heading, radians (0 = north, clockwise)
     * @param others opponents still alive, not counting sentries
     * @param events the events that arrived with this tick, in the engine's order; copied
     * @param numSentries sentry robots still alive (GATE-1 needs none for melee)
     * @param sentryBorderSize how far in from each wall the sentries guard, pixels; 0
     *     without sentries
     */
    public BotInput(long time, int round, double x, double y, double heading, double velocity, double energy, double gunHeat, double gunCoolingRate, double gunHeading, double gunTurnRemaining, double radarHeading, int others, List<BotEvent> events, int numSentries, double sentryBorderSize) {
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
        // An unmodifiable copy, so the caller's queue can be reused without changing a
        // recorded input. List.copyOf also rejects null events.
        this.events = List.copyOf(events);
        this.numSentries = numSentries;
        this.sentryBorderSize = sentryBorderSize;
    }

    /** The tick within the round; the engine restarts it at 0 each round. */
    public long time() {
        return time;
    }

    /** The round number, from 0. */
    public int round() {
        return round;
    }

    /** Our centre's x, pixels from the left wall. */
    public double x() {
        return x;
    }

    /** Our centre's y, pixels from the bottom wall. */
    public double y() {
        return y;
    }

    /** Our body heading, radians (0 = north, clockwise). */
    public double heading() {
        return heading;
    }

    /** Our velocity, pixels per tick; negative while driving backwards. */
    public double velocity() {
        return velocity;
    }

    /** Our energy. */
    public double energy() {
        return energy;
    }

    /** Our gun heat; the gun can fire only when it is 0. */
    public double gunHeat() {
        return gunHeat;
    }

    /** Gun heat lost per tick, set by the battle (0.1 by default). */
    public double gunCoolingRate() {
        return gunCoolingRate;
    }

    /** Our gun heading, radians (0 = north, clockwise). */
    public double gunHeading() {
        return gunHeading;
    }

    /** Radians the gun still has to turn, clockwise positive. */
    public double gunTurnRemaining() {
        return gunTurnRemaining;
    }

    /** Our radar heading, radians (0 = north, clockwise). */
    public double radarHeading() {
        return radarHeading;
    }

    /**
     * Opponents still alive, not counting sentries (Robocode leaves them out). GATE-1 and
     * GATE-2 read it directly: two or more may mean melee, fewer is always the duel.
     */
    public int others() {
        return others;
    }

    /** The events that arrived with this tick, in the engine's order; unmodifiable. */
    public List<BotEvent> events() {
        return events;
    }

    /** Sentry robots still alive, which {@link #others()} leaves out; melee needs none (GATE-1). */
    public int numSentries() {
        return numSentries;
    }

    /** How far in from each wall the sentries guard, pixels; 0 without sentries. */
    public double sentryBorderSize() {
        return sentryBorderSize;
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
            && java.util.Objects.equals(events, that.events)
            && numSentries == that.numSentries
            && Double.compare(sentryBorderSize, that.sentryBorderSize) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(time, round, x, y, heading, velocity, energy, gunHeat, gunCoolingRate, gunHeading, gunTurnRemaining, radarHeading, others, events, numSentries, sentryBorderSize);
    }

    @Override
    public String toString() {
        return "BotInput[time=" + time + ", round=" + round + ", x=" + x + ", y=" + y + ", heading=" + heading + ", velocity=" + velocity + ", energy=" + energy + ", gunHeat=" + gunHeat + ", gunCoolingRate=" + gunCoolingRate + ", gunHeading=" + gunHeading + ", gunTurnRemaining=" + gunTurnRemaining + ", radarHeading=" + radarHeading + ", others=" + others + ", events=" + events + ", numSentries=" + numSentries + ", sentryBorderSize=" + sentryBorderSize + "]";
    }

    /** Our centre as a new point, pixels; the caller may change it. */
    public java.awt.geom.Point2D.Double location() {
        return new java.awt.geom.Point2D.Double(x, y);
    }
}
