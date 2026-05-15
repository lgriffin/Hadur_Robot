package hadur117.utils;

import java.awt.geom.Point2D;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RobotStateLog implements Cloneable {

    private Map<Long, RobotState> robotStates = new HashMap<>();

    public void clear() {
        robotStates.clear();
    }

    public void addState(RobotState state) {
        robotStates.put(state.time, state);
    }

    public RobotState getState(long time) {
        return getState(time, true);
    }

    public RobotState getState(long time, boolean interpolate) {
        if (robotStates.containsKey(time)) {
            RobotState state = robotStates.get(time);
            return (interpolate || !state.interpolated) ? state : null;
        }
        if (!interpolate) return null;

        RobotState before = null, after = null;
        for (RobotState state : robotStates.values()) {
            if (state.interpolated) continue;
            if (state.time < time && (before == null || state.time > before.time)) {
                before = state;
            }
            if (state.time > time && (after == null || state.time < after.time)) {
                after = state;
            }
        }
        if (before == null || after == null) return null;

        double ratio = (double) (time - before.time) / (after.time - before.time);
        Point2D.Double loc = new Point2D.Double(
            before.location.x + (after.location.x - before.location.x) * ratio,
            before.location.y + (after.location.y - before.location.y) * ratio);
        double heading = before.heading + robocode.util.Utils.normalRelativeAngle(
            after.heading - before.heading) * ratio;
        double velocity = before.velocity + (after.velocity - before.velocity) * ratio;

        RobotState interpolated = RobotState.newBuilder()
            .setLocation(loc).setHeading(heading).setVelocity(velocity)
            .setTime(time).setInterpolated(true).build();
        robotStates.put(time, interpolated);
        return interpolated;
    }

    public double getDisplacementDistance(Point2D.Double location, long currentTime, long ticksAgo) {
        RobotState pastState = getState(currentTime - ticksAgo);
        if (pastState == null) pastState = getOldestState();
        return location.distance(pastState.location);
    }

    private RobotState getOldestState() {
        return robotStates.get(Collections.min(robotStates.keySet()));
    }

    public void forAllStates(AllStateListener listener) {
        for (RobotState state : robotStates.values()) {
            listener.onRobotState(state);
        }
    }

    public int size() {
        return robotStates.size();
    }

    @Override
    public Object clone() {
        RobotStateLog copy = new RobotStateLog();
        for (Map.Entry<Long, RobotState> entry : robotStates.entrySet()) {
            copy.robotStates.put(entry.getKey(), entry.getValue());
        }
        return copy;
    }

    public interface AllStateListener {
        void onRobotState(RobotState state);
    }
}
