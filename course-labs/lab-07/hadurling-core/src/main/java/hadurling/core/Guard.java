package hadurling.core;

import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import hadurling.core.physics.Angles;
import hadurling.core.port.Telemetry;
import java.util.function.Function;

/**
 * Makes sure the robot gets orders every tick. If the core throws (or returns nothing), the
 * guard answers with a fixed set of safe orders for that tick: keep circling the enemy,
 * hold fire, keep the radar sweeping. It counts the fault and logs it once per round.
 *
 * <p>The guard holds no strategy of its own, so that it cannot be the thing that fails: its
 * only state is the fault count, the enemy's last bearing and the direction of travel. It
 * catches {@link Throwable}, errors included: a {@link StackOverflowError} in the core must
 * not stop the robot either.</p>
 */
public final class Guard {

    /** How far the safe orders drive, in px. Reissued each faulting tick, so we never stop. */
    static final double SAFE_DISTANCE = 100;

    private final Function<Input, Orders> core;
    private final Telemetry telemetry;
    private int faultsThisRound;
    /** The enemy's last bearing relative to our heading, in radians, or NaN if never seen. */
    private double lastBearing = Double.NaN;

    /**
     * A guard around {@code core}.
     *
     * @param core the core's tick function, which may throw or return null; in the robot,
     *     {@code core::tick}
     * @param telemetry where the one fault line per round goes
     */
    public Guard(Function<Input, Orders> core, Telemetry telemetry) {
        this.core = core;
        this.telemetry = telemetry;
    }

    /** Starts a round: clears the fault count so the next fault is logged again. */
    public void newRound() {
        faultsThisRound = 0;
        lastBearing = Double.NaN;
    }

    /** @return the ticks this round on which the guard had to issue safe orders */
    public int faultsThisRound() {
        return faultsThisRound;
    }

    /**
     * Runs one tick of the core, or answers with safe orders if it fails.
     *
     * @param in this tick's input
     * @return the core's orders, or the safe orders; never null
     */
    public Orders tick(Input in) {
        // Note the enemy's bearing before calling the core, so the safe orders still know
        // where the enemy is if the core throws on this very tick.
        for (Event e : in.events()) {
            if (e instanceof Event.Scan) lastBearing = ((Event.Scan) e).bearing();
        }
        try {
            Orders orders = core.apply(in);
            if (orders == null) throw new IllegalStateException("core returned no orders");
            return orders;
        } catch (Throwable t) {
            faultsThisRound++;
            if (faultsThisRound == 1) {
                // One line per round: a core that fails every tick must not flood the console.
                telemetry.emit("FAULT," + in.time() + "," + t.getClass().getSimpleName());
            }
            return safeOrders(in);
        }
    }

    private Orders safeOrders(Input in) {
        // A robot at rest counts as going forwards.
        double direction = in.velocity() < 0 ? -1 : 1;
        Orders.Builder b = Orders.builder().ahead(direction * SAFE_DISTANCE);
        if (Double.isNaN(lastBearing)) {
            b.radarTurn(Double.POSITIVE_INFINITY);
        } else {
            // Keep the radar on the enemy's last bearing, and stay side-on to it.
            double enemyDirection = Angles.normalAbsoluteAngle(in.heading() + lastBearing);
            b.radarTurn(2 * Angles.normalRelativeAngle(enemyDirection - in.radarHeading()));
            b.bodyTurn(Angles.normalRelativeAngle(lastBearing + Math.PI / 2));
        }
        return b.build();
    }
}
