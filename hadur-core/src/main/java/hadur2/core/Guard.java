package hadur2.core;

import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.physics.Angles;
import hadur2.core.port.Telemetry;
import java.util.function.Function;

/**
 * Makes sure the robot gets orders every tick (RES-1). If the core throws, the guard
 * returns a fixed safe order set for that tick (keep orbiting in the current direction,
 * hold fire, keep the radar on the enemy), counts the fault, logs it once per round, and
 * asks the core to recover on the next scan.
 */
public final class Guard {

    /** How far the robot keeps driving while the core is down. */
    static final double SAFE_DISTANCE = 100.0;

    private final Function<BotInput, BotOrders> core;
    private final Runnable recover;
    private final Telemetry telemetry;
    private int faultsThisRound;
    private boolean recoverOnNextScan;
    private double lastEnemyAbsBearing = Double.NaN;

    public Guard(Function<BotInput, BotOrders> core, Runnable recover, Telemetry telemetry) {
        this.core = core;
        this.recover = recover;
        this.telemetry = telemetry;
    }

    public void newRound() {
        faultsThisRound = 0;
        recoverOnNextScan = false;
        lastEnemyAbsBearing = Double.NaN;
    }

    public int faultsThisRound() {
        return faultsThisRound;
    }

    public BotOrders tick(BotInput in) {
        BotEvent.Scan scan = null;
        for (BotEvent e : in.events()) {
            if (e instanceof BotEvent.Scan s) scan = s;
        }
        if (scan != null) {
            lastEnemyAbsBearing = Angles.normalAbsoluteAngle(in.heading() + scan.bearing());
        }
        try {
            if (recoverOnNextScan && scan != null) {
                recover.run();
                recoverOnNextScan = false;
            }
            BotOrders orders = core.apply(in);
            if (orders == null) throw new IllegalStateException("core returned no orders");
            return orders;
        } catch (Throwable t) {
            faultsThisRound++;
            recoverOnNextScan = true;
            if (faultsThisRound == 1) {
                telemetry.emit("FAULT," + in.round() + "," + in.time() + ","
                    + t.getClass().getSimpleName() + ":" + String.valueOf(t.getMessage()).replace(',', ';'));
            }
            return safeOrders(in, lastEnemyAbsBearing);
        }
    }

    /**
     * Orbit the enemy in the current direction of travel, don't fire, and lock the radar
     * on the enemy's last bearing (or sweep if it has not been seen).
     */
    static BotOrders safeOrders(BotInput in, double enemyAbsBearing) {
        BotOrders.Builder b = BotOrders.builder().maxVelocity(8.0);
        double direction = in.velocity() < 0 ? -1 : 1;
        if (Double.isNaN(enemyAbsBearing)) {
            b.turnRadarRight(Double.POSITIVE_INFINITY);
            b.ahead(direction * SAFE_DISTANCE);
        } else {
            b.turnRadarRight(Angles.normalRelativeAngle(enemyAbsBearing - in.radarHeading()) * 2.0);
            // Face perpendicular to the enemy and keep going the way we were going.
            double perpendicular = Angles.normalRelativeAngle(enemyAbsBearing + Math.PI / 2 - in.heading());
            if (Math.abs(perpendicular) > Math.PI / 2) {
                perpendicular = Angles.normalRelativeAngle(perpendicular + Math.PI);
            }
            b.turnRight(perpendicular);
            b.ahead(direction * SAFE_DISTANCE);
        }
        return b.build();
    }
}
