package hadurling.core;

import hadurling.core.gun.HeadOnGun;
import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import hadurling.core.move.Orbit;
import hadurling.core.physics.Angles;

/**
 * Hadurling's decisions, with no Robocode in it: an {@link Input} goes in, {@link Orders}
 * come out. It lines up three small parts: the radar lock (here), a {@link HeadOnGun} and an
 * {@link Orbit}. It remembers a little between ticks, so make one per round.
 *
 * <p>It may throw, like any code. The {@link Guard} around it makes sure the robot still gets
 * orders when it does.</p>
 */
public final class Core {

    private final HeadOnGun gun = new HeadOnGun();
    private final Orbit orbit = new Orbit();
    /** The tick of the last scan, or a long time ago before the first. */
    private long lastScanTime = -100;

    /**
     * Decides what to do this tick.
     *
     * @param in what the robot knows now
     * @return the orders for this tick, never null
     */
    public Orders tick(Input in) {
        Event.Scan scan = null;
        for (Event e : in.events()) {
            if (e instanceof Event.HitWall) orbit.reverse();
            if (e instanceof Event.Scan) scan = (Event.Scan) e;
        }

        Orders.Builder orders = Orders.builder().ahead(orbit.ahead());
        if (scan == null) {
            // Nothing seen this tick. Sweep if we have lost the enemy; otherwise the radar is
            // already turning toward where it was, so leave it alone (NaN).
            if (in.time() - lastScanTime > 2) orders.radarTurn(Double.POSITIVE_INFINITY);
            return orders.build();
        }
        lastScanTime = in.time();

        double enemyDirection = Angles.normalAbsoluteAngle(in.heading() + scan.bearing());
        // Radar lock: turn twice as far as needed so the radar overshoots and sweeps back.
        orders.radarTurn(2 * Angles.normalRelativeAngle(enemyDirection - in.radarHeading()));
        orders.bodyTurn(orbit.bodyTurn(scan.bearing()));
        double gunTurn = gun.turn(in, enemyDirection);
        orders.gunTurn(gunTurn);
        orders.fire(gun.power(in, gunTurn));
        return orders.build();
    }
}
