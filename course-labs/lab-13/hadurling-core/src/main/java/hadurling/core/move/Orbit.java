package hadurling.core.move;

import hadurling.core.physics.Angles;

/**
 * Circling the enemy: stay side-on to it (a right angle to the line between us), so we keep
 * moving across its aim, and keep driving. Reverses when told it hit a wall.
 */
public final class Orbit {

    /** How far to drive each tick, in px. A new order each tick keeps the robot moving. */
    public static final double STEP = 100;

    /** 1 drives forwards, -1 backwards. */
    private int direction = 1;

    /** Turns the orbit around; call when the robot hits a wall. */
    public void reverse() {
        direction = -direction;
    }

    /** @return +1 when driving forwards (clockwise round an enemy on our right), -1 backwards */
    public int direction() {
        return direction;
    }

    /**
     * Sets the direction, for a mover that has chosen one.
     *
     * @param direction +1 for forwards (clockwise round the enemy), -1 for backwards
     */
    public void face(int direction) {
        this.direction = direction < 0 ? -1 : 1;
    }

    /**
     * How far to turn the body to be side-on to the enemy.
     *
     * @param bearing the enemy's bearing relative to our heading, in radians
     * @return the body turn in radians, clockwise positive
     */
    public double bodyTurn(double bearing) {
        return Angles.normalRelativeAngle(bearing + Math.PI / 2);
    }

    /** @return the distance to order this tick, negative when going backwards */
    public double ahead() {
        return STEP * direction;
    }
}
