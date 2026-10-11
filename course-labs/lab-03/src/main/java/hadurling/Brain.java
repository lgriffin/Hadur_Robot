package hadurling;

import hadurling.model.Event;
import hadurling.model.Input;
import hadurling.model.Orders;
import hadurling.physics.Angles;

/**
 * The decision-making, with no Robocode in it: an {@link Input} goes in, {@link Orders} come
 * out. Because it never touches the engine, a test can call it with a made-up {@code Input}
 * and check the answer.
 *
 * <p>The behaviour is lab 02's, moved here: lock the radar on the enemy, circle it, aim
 * straight at it and fire power 1 when the gun is cool. A {@code Brain} remembers a little
 * between ticks (which way it drives, when it last saw the enemy), so make one per round.</p>
 */
public final class Brain {

    /** How far to drive each tick, in px. */
    static final double STEP = 100;
    /** The bullet power Hadurling fires. */
    static final double FIRE_POWER = 1.0;
    /** How far off the gun may be and still fire, in radians (about 10 degrees). */
    static final double AIM_TOLERANCE = Math.toRadians(10);

    /** 1 drives forwards, -1 backwards. Flips on a wall hit. */
    private int direction = 1;
    /** The tick of the last scan, or a long time ago before the first. */
    private long lastScanTime = -100;

    /**
     * Decides what to do this tick.
     *
     * @param in what the robot knows now
     * @return the orders for this tick, never null
     */
    public Orders think(Input in) {
        Event.Scan scan = null;
        for (Event e : in.events()) {
            if (e instanceof Event.HitWall) direction = -direction;
            if (e instanceof Event.Scan) scan = (Event.Scan) e;
        }

        Orders.Builder orders = Orders.builder().ahead(STEP * direction);
        if (scan == null) {
            // Nothing seen this tick. Keep sweeping if we have lost the enemy; otherwise the
            // radar is already turning toward where it was, so leave it alone (NaN).
            if (in.time() - lastScanTime > 2) orders.radarTurn(Double.POSITIVE_INFINITY);
            return orders.build();
        }
        lastScanTime = in.time();

        double enemyDirection = Angles.normalAbsoluteAngle(in.heading() + scan.bearing());

        // Radar lock: turn twice as far as needed so the radar overshoots and sweeps back.
        orders.radarTurn(2 * Angles.normalRelativeAngle(enemyDirection - in.radarHeading()));
        // Orbit: side-on to the enemy.
        orders.bodyTurn(Angles.normalRelativeAngle(scan.bearing() + Math.PI / 2));
        // Head-on gun: aim at where the enemy is now; fire when cool and nearly aligned.
        double gunTurn = Angles.normalRelativeAngle(enemyDirection - in.gunHeading());
        orders.gunTurn(gunTurn);
        if (in.gunHeat() == 0 && Math.abs(gunTurn) < AIM_TOLERANCE) orders.fire(FIRE_POWER);
        return orders.build();
    }
}
