package hadur2.core.physics;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Tick-by-tick prediction of a robot's movement under Robocode's physics, and the precise
 * maximum escape angle built on it.
 *
 * <p>Wave surfing and guess-factor targeting both ask "where can this robot get to before
 * the bullet arrives?". The classic answer, {@code asin(8 / bulletSpeed)}, assumes the
 * robot is already at full speed, perpendicular to the shooter, with no walls. This class
 * answers it by simulation instead: {@link #predict} applies the engine's own turn,
 * acceleration and braking rules one tick at a time, and
 * {@link #preciseEscapeAngle(int, Point2D.Double, long, double, RobotState, double, double)}
 * drives the robot flat out sideways (smoothing along walls where it has to) until the wave
 * reaches it. {@code hadur2.core.model.Wave} uses the result to scale guess factors, and the
 * surf uses the end points as the destinations it compares.</p>
 *
 * <p>Conventions: angles in radians, 0 north and clockwise; positions in px in field
 * coordinates; velocity in px/tick, negative when reversing; time in ticks. An "orientation"
 * or "direction" of +1 is clockwise round the wave's source, -1 counter-clockwise. The
 * predictor is stateless apart from the field it was built with, so the same inputs always
 * give the same prediction (CORE-2).</p>
 */
public class MovementPredictor {

    private static final double HALF_PI = Math.PI / 2;
    private static final double QUARTER_PI = Math.PI / 4;
    /** Passes of the wall-smoothed escape search; each aims at where the last one ended. */
    private static final int PRECISE_MEA_ITERATIONS = 3;

    private final BattleField battleField;
    /** The field's legal-centre rectangle, cached from {@link BattleField#rectangle}. */
    private final Rectangle2D.Double rect;

    /**
     * A predictor for one battle field.
     *
     * @param battleField the field whose walls stop or smooth the predicted robot
     */
    public MovementPredictor(BattleField battleField) {
        this.battleField = battleField;
        this.rect = battleField.rectangle;
    }

    /**
     * Simulates a robot for {@code ticks} ticks as the engine would move it under
     * {@code setTurnRightRadians(turn)}, {@code setAhead(distance)} and
     * {@code setMaxVelocity(maxVelocity)}.
     *
     * <p>Each tick follows the engine's order: first the body turns, by at most the turn rate
     * allowed at the velocity it had coming into the tick
     * ({@link Rules#getTurnRateRadians(double)}); then the velocity changes by at most +1 or
     * -2 px/tick toward what the remaining distance allows ({@code getNewVelocity}); then
     * the robot moves that far along its new heading. The remaining turn and distance are
     * used up as it goes.</p>
     *
     * <p>If the robot would end a tick outside the field it is pulled back onto the wall
     * along its heading (unless {@code ignoreWalls}). As the engine does, it is
     * also stopped dead (PHYS-1): the next tick starts from velocity 0.</p>
     *
     * @param startState where the robot starts, with its heading, velocity and time
     * @param distance how far it is still told to move, in px: negative to reverse,
     *     {@link Double#POSITIVE_INFINITY} to never brake for a stop
     * @param turn how far it is still told to turn, in radians, positive clockwise
     * @param maxVelocity the speed cap it was given, in px/tick
     * @param ticks how many ticks to simulate
     * @param ignoreWalls true to let the robot drive through walls (for a hypothetical path
     *     whose wall crossing the caller checks itself)
     * @return the state after {@code ticks} ticks, with its time advanced by {@code ticks}
     */
    public RobotState predict(RobotState startState, double distance, double turn,
                              double maxVelocity, long ticks, boolean ignoreWalls) {
        RobotState state = startState;
        for (long t = 0; t < ticks; t++) {
            double nextHeading = state.heading;
            // Turn first, limited by the rate at this tick's starting speed: 10 deg/tick
            // standing, 4 at full speed.
            double maxTurnRate = Math.abs(Rules.getTurnRateRadians(state.velocity));
            if (Math.abs(turn) < maxTurnRate) {
                nextHeading += turn;
                turn = 0;
            } else {
                double turnAmount = maxTurnRate * Math.signum(turn);
                nextHeading += turnAmount;
                turn -= turnAmount;
            }

            // Then accelerate or brake, and move along the new heading.
            double nextVelocity = getNewVelocity(state.velocity, distance, maxVelocity);
            distance -= nextVelocity;
            Point2D.Double nextLocation = DiaUtils.project(state.location, nextHeading, nextVelocity);

            if (!ignoreWalls && !rect.contains(nextLocation)) {
                adjustForWalls(nextLocation, nextHeading);
                // PHYS-1: the engine stops a robot that meets a wall dead.
                nextVelocity = 0;
            }

            state = RobotState.newBuilder()
                .setLocation(nextLocation).setHeading(nextHeading)
                .setVelocity(nextVelocity).setTime(state.time + 1)
                .build();
        }
        return state;
    }

    /**
     * Pulls a location that has run past the field's legal-centre rectangle back onto its
     * edge, moving it backwards along {@code heading} so the robot ends where its path met
     * the wall rather than simply clamped sideways.
     *
     * <p>{@code xOut} and {@code yOut} are the corrections each axis needs on its own
     * (negative past the right or top edge, positive past the left or bottom, 0 inside).
     * Moving along heading h changes x and y in the ratio sin h : cos h, so a correction of
     * {@code xOut} on x goes with {@code xOut / tan h} on y, and {@code yOut} on y with
     * {@code yOut × tan h} on x. Each axis then takes the larger of its own correction and
     * the one carried over from the other axis, which also handles a corner, where both are
     * out. At an exact multiple of 45 degrees (where {@code tan} is 0 or infinite at the
     * right angles) the location is just moved by the two corrections.</p>
     *
     * @param location the predicted location, modified in place
     * @param heading the heading the robot moved along, in radians
     */
    private void adjustForWalls(Point2D.Double location, double heading) {
        double xOut = Math.min(0, rect.getMaxX() - location.x);
        double yOut = Math.min(0, rect.getMaxY() - location.y);
        if (xOut == 0) xOut = Math.max(0, rect.getMinX() - location.x);
        if (yOut == 0) yOut = Math.max(0, rect.getMinY() - location.y);

        double xOffset = xOut;
        double yOffset = yOut;

        double h = heading;
        while (h < 0) h += Math.PI * 2;

        if (h % QUARTER_PI != 0) {
            double tanH = Math.tan(h);
            if (Math.abs(xOut) > 0) yOffset = xOut / tanH;
            if (Math.abs(yOut) > 0) xOffset = yOut * tanH;
            if (Math.abs(yOut) > Math.abs(yOffset)) yOffset = yOut;
            if (Math.abs(xOut) > Math.abs(xOffset)) xOffset = xOut;
        }
        location.x += xOffset;
        location.y += yOffset;
    }

    /**
     * The velocity after one tick, by the engine's rule: speed up by at
     * most {@link Rules#ACCELERATION}, slow down by at most {@link Rules#DECELERATION}, never
     * past {@code maxVelocity}, and never so fast that the robot could not stop within the
     * remaining {@code distance}.
     *
     * <p>A robot told to reverse is handled by mirroring: with a negative distance, the
     * answer is the negated answer for the negated velocity and distance. A robot moving
     * backwards that is told to go forwards (velocity &lt; 0) first brakes and then, in the
     * same tick, may start accelerating: see {@code maxDecel}.</p>
     *
     * @param velocity the velocity coming into the tick, in px/tick
     * @param distance the distance still to go, in px (negative to reverse, infinite for no stop)
     * @param maxVelocity the speed cap, in px/tick
     * @return the new velocity, in px/tick
     */
    double getNewVelocity(double velocity, double distance, double maxVelocity) {
        if (distance < 0) {
            return -getNewVelocity(-velocity, -distance, maxVelocity);
        }
        double goalVel = (distance == Double.POSITIVE_INFINITY)
            ? maxVelocity
            : Math.min(getMaxVelocity(distance), maxVelocity);
        if (velocity >= 0) {
            // Moving the right way: brake by up to 2, speed up by up to 1.
            return DiaUtils.limit(velocity - 2.0, goalVel, velocity + 1.0);
        }
        // Moving the wrong way: it may reverse harder (accelerate backwards by 1) or come
        // forwards by up to maxDecel.
        return DiaUtils.limit(velocity - 1.0, goalVel, velocity + maxDecel(-velocity));
    }

    /**
     * The highest speed from which a robot can still stop within {@code distance}, braking
     * by 2 px/tick: the engine's formula.
     *
     * <p>{@code decelTime} is the number of ticks the stop takes, the smallest t with
     * t (t + 1) &ge; distance. Braking by 2 a tick from 2 (t - 1) px/tick to rest covers
     * {@code decelDist} = t (t - 1) px. The answer is that speed, 2 (t - 1), plus the
     * leftover distance ({@code distance - decelDist}) shared evenly over the t ticks.</p>
     *
     * @param distance the distance still to go, in px, not negative
     * @return the speed cap it implies, in px/tick
     */
    private double getMaxVelocity(double distance) {
        double decelTime = Math.max(1, Math.ceil((Math.sqrt(4.0 * distance + 1.0) - 1.0) / 2.0));
        double decelDist = decelTime / 2.0 * (decelTime - 1.0) * 2.0;
        return (decelTime - 1.0) * 2.0 + (distance - decelDist) / decelTime;
    }

    /**
     * How much a robot moving at {@code velocity} can change toward the opposite direction
     * in one tick. Above 2 px/tick it can only brake, by 2. At 2 or below it reaches 0 part
     * way through the tick (after {@code velocity / 2} of it, braking at 2) and accelerates
     * the other way at 1 for the rest, so the total change is {@code 1 + velocity / 2}.
     *
     * @param velocity the speed in the wrong direction, in px/tick (the sign is ignored)
     * @return the largest change in one tick, in px/tick, from 1 (standing) to 2
     */
    private double maxDecel(double velocity) {
        velocity = Math.abs(velocity);
        if (velocity > 2.0) return 2.0;
        double tickFractionDecel = velocity / 2.0;
        double tickFractionAccel = 1.0 - tickFractionDecel;
        return tickFractionDecel * 2.0 + tickFractionAccel * 1.0;
    }

    /**
     * Where the robot will be next tick if it keeps its heading and velocity: a straight-line
     * guess without acceleration, turning or walls. The core aims from here, since that is
     * where the gun will be when the shot it is aiming leaves.
     *
     * @param robotState the robot now
     * @return its location one tick on, in px
     */
    public Point2D.Double nextLocation(RobotState robotState) {
        return new Point2D.Double(
            robotState.location.x + Math.sin(robotState.heading) * robotState.velocity,
            robotState.location.y + Math.cos(robotState.heading) * robotState.velocity);
    }

    /**
     * One tick of driving at full speed (8 px/tick) perpendicular to the line from a wave's
     * source, without wall smoothing.
     *
     * @param robotState the robot now
     * @param absBearing the bearing from the source to the robot, in radians
     * @param orientation +1 to drive clockwise round the source, -1 counter-clockwise
     * @param attackAngle how far to tilt the path off perpendicular, in radians: positive
     *     tilts it toward the source, negative away
     * @param ignoreWallHits true to let the robot drive through walls
     * @return the robot one tick on
     */
    public RobotState nextPerpendicularLocation(RobotState robotState, double absBearing,
            int orientation, double attackAngle, boolean ignoreWallHits) {
        return nextPerpendicularWallSmoothedLocation(robotState, absBearing,
            8.0, attackAngle, orientation, 0, ignoreWallHits);
    }

    /**
     * One tick of driving perpendicular to the line from a wave's source, smoothed along
     * walls. The desired heading is {@code absBearing + orientation × (π/2 + attackAngle)}:
     * a quarter turn off the bearing is a pure orbit, and since {@code absBearing} points away
     * from the source, a positive attack angle turns the heading further round, toward the
     * source.
     *
     * @param robotState the robot now
     * @param absBearing the bearing from the source to the robot, in radians
     * @param maxVelocity the speed cap, in px/tick
     * @param attackAngle how far to tilt the path off perpendicular, in radians: positive
     *     toward the source, negative away
     * @param orientation +1 to drive clockwise round the source, -1 counter-clockwise
     * @param wallStick the wall-smoothing stick length, in px; 0 turns smoothing off
     * @param ignoreWallHits true to let the robot drive through walls
     * @return the robot one tick on
     */
    public RobotState nextPerpendicularWallSmoothedLocation(RobotState robotState,
            double absBearing, double maxVelocity, double attackAngle,
            int orientation, double wallStick, boolean ignoreWallHits) {
        double goAngle = Angles.normalRelativeAngle(
            absBearing + orientation * (HALF_PI + attackAngle));
        if (wallStick != 0) {
            goAngle = battleField.wallSmoothing(robotState.location, goAngle, orientation, wallStick);
        }
        return nextLocation(robotState, maxVelocity, goAngle, ignoreWallHits);
    }

    /**
     * One tick of driving toward {@code goAngle}, back-as-front: if the heading is more than
     * a quarter turn from it, the robot turns the short way and drives in reverse, as
     * {@link DiaUtils#setBackAsFront} orders it to. The distance is a nominal 1000 px either
     * way, far enough that the braking rule never slows the robot in the one tick simulated.
     *
     * @param robotState the robot now
     * @param maxVelocity the speed cap, in px/tick
     * @param goAngle the direction to move in, in radians
     * @param ignoreWallHits true to let the robot drive through walls
     * @return the robot one tick on
     */
    public RobotState nextLocation(RobotState robotState, double maxVelocity,
                                    double goAngle, boolean ignoreWallHits) {
        double futureTurn = Angles.normalRelativeAngle(goAngle - robotState.heading);
        double futureDistance;
        if (Math.abs(futureTurn) > HALF_PI) {
            futureTurn -= Math.signum(futureTurn) * Math.PI;
            futureDistance = -1000;
        } else {
            futureDistance = 1000;
        }
        return predict(robotState, futureDistance, futureTurn, maxVelocity, 1, ignoreWallHits);
    }

    /**
     * {@link #preciseEscapeAngle(int, Point2D.Double, long, double, RobotState, double, double)}
     * with no attack angle: the robot drives purely perpendicular to the source. This is the
     * form {@code Wave} uses to scale its guess factors.
     *
     * @param predictDirection +1 to escape clockwise round the source, -1 counter-clockwise
     * @param sourceLocation where the wave was fired from
     * @param fireTime the tick the wave was fired
     * @param bulletSpeed the wave's speed, in px/tick; must exceed 8 so the wave catches the robot
     * @param startState the robot when the wave was fired
     * @param wallStick the wall-smoothing stick length, in px
     * @return the widest escape found, with where and when it ends
     */
    public MaxEscapeTarget preciseEscapeAngle(int predictDirection,
            Point2D.Double sourceLocation, long fireTime, double bulletSpeed,
            RobotState startState, double wallStick) {
        return preciseEscapeAngle(predictDirection, sourceLocation, fireTime,
            bulletSpeed, startState, 0, wallStick);
    }

    /**
     * The precise maximum escape angle in one direction: how far round the source, seen
     * from it, the robot can get before the wave reaches it, if it drives flat out sideways.
     *
     * <p>First the robot drives in a straight line perpendicular to its bearing at fire time
     * (a line, not an orbit: the bearing is not updated) until the wave passes it or it
     * leaves the field. If it stays in the field, that is the answer: nothing gets further in
     * the time. If it hits a wall, the wall-smoothed search is tried too, and whichever gets
     * the wider angle wins. The surf takes the end location as the destination of that
     * direction's option; the guns and waves take the angle as the escape angle a guess
     * factor of ±1 stands for.</p>
     *
     * @param predictDirection +1 to escape clockwise round the source, -1 counter-clockwise
     * @param sourceLocation where the wave was fired from
     * @param fireTime the tick the wave was fired
     * @param bulletSpeed the wave's speed, in px/tick; must exceed 8 so the wave catches the robot
     * @param startState the robot at the start of the prediction
     * @param attackAngle how far to tilt the path off perpendicular, in radians: positive
     *     toward the source, negative away
     * @param wallStick the wall-smoothing stick length, in px
     * @return the widest escape found: its angle in radians (positive in
     *     {@code predictDirection}), the robot's end location (inside the field), the tick it
     *     gets there, and {@code hitWall} true only when the straight run is returned and it
     *     met a wall
     */
    public MaxEscapeTarget preciseEscapeAngle(int predictDirection,
            Point2D.Double sourceLocation, long fireTime, double bulletSpeed,
            RobotState startState, double attackAngle, double wallStick) {
        double absBearing = DiaUtils.absoluteBearing(sourceLocation, startState.location);
        MaxEscapeTarget straightTarget = straightPreciseEscapeAngle(
            predictDirection, absBearing, sourceLocation, fireTime,
            bulletSpeed, startState, attackAngle);

        MaxEscapeTarget smoothTarget = null;
        if (straightTarget.hitWall) {
            smoothTarget = smoothingPreciseEscapeAngle(
                predictDirection, absBearing, sourceLocation, fireTime,
                bulletSpeed, startState, attackAngle, wallStick, PRECISE_MEA_ITERATIONS);
        }
        if (smoothTarget != null && smoothTarget.angle > straightTarget.angle) {
            return smoothTarget;
        }
        return straightTarget;
    }

    /**
     * The straight run of the precise escape angle: drive at full speed along the fixed
     * perpendicular heading (walls ignored) until the robot leaves the field or the wave
     * passes it. It always ends, since the robot leaves the field eventually. The end point
     * is clamped into the field, so a run that hit a wall reports the angle to the wall.
     *
     * @param predictDirection +1 clockwise round the source, -1 counter-clockwise
     * @param absBearing the bearing from the source to the robot at the start, in radians
     * @param sourceLocation where the wave was fired from
     * @param fireTime the tick the wave was fired
     * @param bulletSpeed the wave's speed, in px/tick
     * @param startState the robot at the start
     * @param attackAngle the tilt off perpendicular, in radians, positive toward the source
     * @return the angle reached (positive in {@code predictDirection}), where and when, and
     *     whether the run left the field
     */
    MaxEscapeTarget straightPreciseEscapeAngle(int predictDirection, double absBearing,
            Point2D.Double sourceLocation, long fireTime, double bulletSpeed,
            RobotState startState, double attackAngle) {
        RobotState predictedState = startState;
        boolean hitWall = false;
        boolean wavePassed = false;
        do {
            predictedState = nextPerpendicularLocation(
                predictedState, absBearing, predictDirection, attackAngle, true);
            if (!rect.contains(predictedState.location)) {
                hitWall = true;
            } else if (wavePassed(sourceLocation, fireTime, bulletSpeed, predictedState)) {
                wavePassed = true;
            }
        } while (!hitWall && !wavePassed);

        Point2D.Double meaLocation = battleField.translateToField(predictedState.location);
        // The escape angle is the bearing's change seen from the source, signed so that
        // moving in predictDirection is positive.
        double escapeAngle = predictDirection * Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(sourceLocation, meaLocation) - absBearing);
        return new MaxEscapeTarget(escapeAngle, meaLocation, predictedState.time, hitWall);
    }

    /**
     * The wall-smoothed run of the precise escape angle, for when the straight run meets a
     * wall. Each pass drives at full speed from {@code startState}, back-as-front, re-smoothing
     * the heading against the walls every tick, until the wave passes the robot. The first
     * pass starts from the smoothed perpendicular heading; each later pass starts by heading
     * straight at the point the previous pass reached, then smooths from there. The widest
     * angle over all passes is kept, so an extra pass can only widen the answer.
     *
     * <p>Only the wave's passing ends a pass, so this relies on the wave outrunning the robot
     * ({@code bulletSpeed} above 8 px/tick, true of every legal bullet, whose speed is 11 or
     * more).</p>
     *
     * @param predictDirection +1 clockwise round the source, -1 counter-clockwise
     * @param absBearing the bearing from the source to the robot at the start, in radians
     * @param sourceLocation where the wave was fired from
     * @param fireTime the tick the wave was fired
     * @param bulletSpeed the wave's speed, in px/tick
     * @param startState the robot at the start
     * @param attackAngle the tilt off perpendicular, in radians, positive toward the source
     * @param wallStick the wall-smoothing stick length, in px
     * @param iterations how many passes to make
     * @return the widest angle reached (0 at the start location if none was positive), where
     *     and when; {@code hitWall} is always false
     */
    MaxEscapeTarget smoothingPreciseEscapeAngle(int predictDirection, double absBearing,
            Point2D.Double sourceLocation, long fireTime, double bulletSpeed,
            RobotState startState, double attackAngle, double wallStick, int iterations) {
        MaxEscapeTarget best = new MaxEscapeTarget(0, startState.location, startState.time, false);
        double goAngle = absBearing + predictDirection * (HALF_PI + attackAngle);
        goAngle = battleField.wallSmoothing(startState.location, goAngle, predictDirection, wallStick);

        for (int x = 0; x < iterations; x++) {
            RobotState predictedState = startState;
            boolean wavePassed = false;
            do {
                predictedState = nextLocation(predictedState, 8.0, goAngle, true);
                if (wavePassed(sourceLocation, fireTime, bulletSpeed, predictedState)) {
                    wavePassed = true;
                } else {
                    // Keep sliding along the wall: smooth the current heading from the new spot.
                    goAngle = battleField.wallSmoothing(
                        predictedState.location, goAngle, predictDirection, wallStick);
                }
            } while (!wavePassed);

            Point2D.Double loc = battleField.translateToField(predictedState.location);
            double thisAngle = predictDirection * Angles.normalRelativeAngle(
                DiaUtils.absoluteBearing(sourceLocation, loc) - absBearing);
            if (thisAngle > best.angle) {
                best = new MaxEscapeTarget(thisAngle, loc, predictedState.time, false);
            }
            if (x + 1 < iterations) {
                // Next pass: set off straight for where this one ended.
                goAngle = DiaUtils.absoluteBearing(startState.location, loc);
            }
        }
        return best;
    }

    /**
     * Whether the wave has passed the robot by the tick after {@code enemyState.time}: the
     * robot's centre is inside the circle the wave will have reached then, of radius
     * {@code bulletSpeed × (time - fireTime + 1)}.
     *
     * <p>Comparing squared distances avoids a square root. Squaring would turn a negative
     * radius (a state from before the wave existed) into a positive one, so the squared
     * radius takes the radius's sign back, and such a wave never counts as passed.</p>
     *
     * @param sourceLocation where the wave was fired from
     * @param fireTime the tick the wave was fired
     * @param bulletSpeed the wave's speed, in px/tick
     * @param enemyState the robot's predicted state; its time is the tick tested
     * @return true once the wave has passed the robot's centre
     */
    private boolean wavePassed(Point2D.Double sourceLocation, long fireTime,
                               double bulletSpeed, RobotState enemyState) {
        double threshold = bulletSpeed * (enemyState.time - fireTime) + bulletSpeed;
        return enemyState.location.distanceSq(sourceLocation) <
            DiaUtils.square(threshold) * Math.signum(threshold);
    }
}
