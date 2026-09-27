package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Point2D;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * A robot's {@link RobotState}s keyed by tick, with linear interpolation across the ticks
 * that were not observed.
 *
 * <p>Several parts of the core keep one. {@code HadurCore} logs our state and the duel
 * enemy's at every scan and asks how far each robot has moved over the last 8, 20 and 40
 * ticks, which become wave attributes for the KNN views. Each active {@link Wave} in a
 * {@link WaveManager} has a log of its target's states, from which the ticks the wave was
 * crossing the target are recovered when it breaks. The surf fills logs with predicted
 * states and clones them to branch on each option, and the melee brain keeps our own
 * path.</p>
 *
 * <p>Interpolation exists because states do not arrive every tick: the radar can miss a
 * tick, and a skipped turn loses one, yet a wave's break is checked tick by tick. An
 * interpolated state is marked {@link RobotState#interpolated}, is never used as an end
 * point for another interpolation, and is stored so the next request for that tick is a
 * lookup.</p>
 *
 * <p>The log is bounded (RES-2): past {@link #MAX_STATES} it drops the oldest tick. Its
 * owners clear it or drop it at the start of each round, since ticks restart at 0.</p>
 */
public class RobotStateLog implements Cloneable {

    /**
     * States by tick. A hash map, so iteration is not in time order; for identical inputs
     * it is still the same order every run (Long keys hash to themselves), so replays stay
     * identical (CORE-2).
     */
    private Map<Long, RobotState> robotStates = new HashMap<>();

    /** Forgets every state, as at the start of a round. */
    public void clear() {
        robotStates.clear();
    }

    /** Most states kept (RES-2); far more than any lookback the core uses. */
    public static final int MAX_STATES = 5_000;

    /**
     * Records {@code state} under its tick, replacing any state (interpolated or not) already
     * held for that tick, then drops the oldest if the log is over its bound.
     */
    public void addState(RobotState state) {
        robotStates.put(state.time, state);
        trim();
    }

    /**
     * RES-2: removes the state with the smallest tick once the log holds more than
     * {@link #MAX_STATES}. States arrive one at a time, so one removal keeps the bound.
     */
    private void trim() {
        if (robotStates.size() > MAX_STATES) {
            // A linear scan for the smallest tick; it runs only once the log is full.
            robotStates.remove(Collections.min(robotStates.keySet()));
        }
    }

    /**
     * The state at {@code time}, interpolating when that tick was not observed; null when it
     * cannot be (see {@link #getState(long, boolean)}).
     */
    public RobotState getState(long time) {
        return getState(time, true);
    }

    /**
     * The state at {@code time}.
     *
     * <p>A state held for that tick is returned as it is, unless it was interpolated and
     * {@code interpolate} is false. Otherwise, with {@code interpolate}, the nearest observed
     * states before and after it are blended linearly: location and velocity directly, and
     * heading along the shorter way round. The result is stored in the log.</p>
     *
     * @param time the tick wanted
     * @param interpolate whether a state may be made up from its neighbours
     * @return the state, or null when there is none for that tick and it cannot be
     *     interpolated (no observed state on one side of it: the log never extrapolates)
     */
    public RobotState getState(long time, boolean interpolate) {
        if (robotStates.containsKey(time)) {
            RobotState state = robotStates.get(time);
            return (interpolate || !state.interpolated) ? state : null;
        }
        if (!interpolate) return null;

        // The closest observed states on either side. Interpolated states are skipped, so a
        // made-up state never becomes the basis of another one.
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

        // How far through the gap the tick lies, in (0, 1); before and after differ in time,
        // so the division is safe.
        double ratio = (double) (time - before.time) / (after.time - before.time);
        Point2D.Double loc = new Point2D.Double(
            before.location.x + (after.location.x - before.location.x) * ratio,
            before.location.y + (after.location.y - before.location.y) * ratio);
        // Headings wrap at 2 pi: turning through the relative angle in [-pi, pi) blends a
        // heading of 350 degrees and one of 10 degrees through 0, not through 180.
        double heading = before.heading + Angles.normalRelativeAngle(
            after.heading - before.heading) * ratio;
        double velocity = before.velocity + (after.velocity - before.velocity) * ratio;

        RobotState interpolated = RobotState.newBuilder()
            .setLocation(loc).setHeading(heading).setVelocity(velocity)
            .setTime(time).setInterpolated(true).build();
        // Kept, so the next request for this tick is a lookup; it counts towards the bound.
        robotStates.put(time, interpolated);
        trim();
        return interpolated;
    }

    /**
     * Pixels between {@code location} and where the robot was {@code ticksAgo} ticks before
     * {@code currentTime} (interpolated if need be). Early in a round, when the log does not
     * reach that far back, the oldest state stands in, so the result is the distance moved
     * so far. The log must hold at least one state.
     *
     * @param location the robot's location now, pixels
     * @param currentTime the current tick
     * @param ticksAgo how far back to look, ticks
     * @return the straight-line distance, pixels
     */
    public double getDisplacementDistance(Point2D.Double location, long currentTime, long ticksAgo) {
        RobotState pastState = getState(currentTime - ticksAgo);
        if (pastState == null) pastState = getOldestState();
        return location.distance(pastState.location);
    }

    /** The state with the smallest tick; the log must not be empty. */
    private RobotState getOldestState() {
        return robotStates.get(Collections.min(robotStates.keySet()));
    }

    /**
     * Calls {@code listener} with every state held, interpolated ones included, in the map's
     * order, which is not time order.
     */
    public void forAllStates(AllStateListener listener) {
        for (RobotState state : robotStates.values()) {
            listener.onRobotState(state);
        }
    }

    /** States held, interpolated ones included; at most {@link #MAX_STATES}. */
    public int size() {
        return robotStates.size();
    }

    /**
     * A new log holding the same states. The states themselves are shared, which is safe
     * because they are immutable apart from their cached geometry; the surf clones a
     * predicted log to explore each surf option from the same start.
     */
    @Override
    public Object clone() {
        RobotStateLog copy = new RobotStateLog();
        for (Map.Entry<Long, RobotState> entry : robotStates.entrySet()) {
            copy.robotStates.put(entry.getKey(), entry.getValue());
        }
        return copy;
    }

    /** Receives each state from {@link #forAllStates}. */
    public interface AllStateListener {
        /**
         * Called once per state held.
         *
         * @param state one of the log's states
         */
        void onRobotState(RobotState state);
    }
}
