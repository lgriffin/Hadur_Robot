package hadur2.core.model;

import java.util.List;

/**
 * Everything the core sees in one tick: the robot's own state and the events that
 * arrived with it. Immutable, so a battle is just a list of these.
 */
public record BotInput(long time, int round, double x, double y, double heading,
                       double velocity, double energy, double gunHeat,
                       double gunCoolingRate, double gunHeading, double gunTurnRemaining,
                       double radarHeading, int others, List<BotEvent> events) {

    public BotInput {
        events = List.copyOf(events);
    }

    public java.awt.geom.Point2D.Double location() {
        return new java.awt.geom.Point2D.Double(x, y);
    }
}
