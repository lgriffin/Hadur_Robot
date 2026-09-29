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
 *
 * <p>The guard sits between the Robocode adapter and {@link HadurCore}: the adapter calls
 * {@link #tick} once per turn with the tick's {@link BotInput}, and the guard calls the core
 * through the {@code core} function it was built with (in the robot, {@code core::tick}).
 * It holds no strategy of its own, so that it cannot itself be the thing that fails: its
 * only state is the fault count, the recover flag and the enemy's last absolute bearing.</p>
 *
 * <p>Anything the core throws is caught, {@link Error}s included (a
 * {@link StackOverflowError} deep in a KNN search must not stop the robot either), and a
 * {@code null} result counts as a fault too. The fault count feeds the round's {@code R}
 * record through {@link HadurCore#roundEnded} (RES-5).</p>
 *
 * <p>Angles are radians, as everywhere in the core: headings absolute (0 = north,
 * clockwise), bearings relative to our heading.</p>
 */
public final class Guard {

    /**
     * How far the robot keeps driving while the core is down, in px. Reissued every faulting
     * tick, so the robot never runs out of distance and stops, which would make it an easy
     * target; the sign follows the current direction of travel.
     */
    static final double SAFE_DISTANCE = 100.0;

    /** The core's tick; in the robot, {@link HadurCore#tick}. */
    private final Function<BotInput, BotOrders> core;
    /** Asks the core to drop its transient round state; in the robot, {@link HadurCore#recover}. */
    private final Runnable recover;
    /** Where the one {@code FAULT} record per round goes. */
    private final Telemetry telemetry;
    /** Ticks this round on which the core threw or returned nothing. */
    private int faultsThisRound;
    /** Set by a fault; the next tick with a scan runs {@code recover} before the core. */
    private boolean recoverOnNextScan;
    /**
     * The absolute bearing (radians, 0 = north, clockwise) of the robot in the latest scan,
     * or NaN before this round's first scan. Kept here rather than read from the core, so the
     * safe orders do not depend on the state of a core that has just failed.
     */
    private double lastEnemyAbsBearing = Double.NaN;

    /**
     * A guard around {@code core}.
     *
     * @param core the core's tick function, which may throw or return null
     * @param recover what to run on the first scan after a fault, to clear the core's
     *     transient state
     * @param telemetry where the {@code FAULT} record goes
     */
    public Guard(Function<BotInput, BotOrders> core, Runnable recover, Telemetry telemetry) {
        this.core = core;
        this.recover = recover;
        this.telemetry = telemetry;
    }

    /**
     * Starts a round: clears the fault count (so the next fault is logged again), any pending
     * recovery (the core's own {@code newRound} has already reset its state) and the enemy's
     * last bearing, which is meaningless in a new round's positions.
     */
    public void newRound() {
        faultsThisRound = 0;
        recoverOnNextScan = false;
        lastEnemyAbsBearing = Double.NaN;
    }

    /**
     * Ticks this round on which the guard had to issue safe orders. The adapter passes it to
     * {@link HadurCore#roundEnded}, which writes it as the {@code R} record's faults field
     * (RES-5).
     *
     * @return the number of faulting ticks this round
     */
    public int faultsThisRound() {
        return faultsThisRound;
    }

    /**
     * Runs one tick of the core and returns its orders, or the safe orders if it fails
     * (RES-1).
     *
     * @param in the tick's input, as the adapter built it
     * @return the core's orders, never null
     */
    public BotOrders tick(BotInput in) {
        // Remember the bearing of the tick's last scan before calling the core, so the safe
        // orders still know where the enemy is if the core throws on this very tick. This
        // reads every scan, sentries and melee opponents included: the guard has no gate.
        BotEvent.Scan scan = null;
        for (BotEvent e : in.events()) {
            if (e instanceof BotEvent.Scan) scan = (BotEvent.Scan) e;
        }
        if (scan != null) {
            lastEnemyAbsBearing = Angles.normalAbsoluteAngle(in.heading() + scan.bearing());
        }
        try {
            // Recover only on a scan: the core's duel state rebuilds from scans, so clearing
            // it on a tick without one would leave it with nothing to aim or surf from.
            // Recovery runs inside the try, so a recover that throws is one more fault.
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
            // One record per round: a core that faults every tick would otherwise flood the
            // console. Commas in the message would break the CSV record, so they become ';'.
            if (faultsThisRound == 1) {
                telemetry.emit("FAULT," + in.round() + "," + in.time() + ","
                    + t.getClass().getSimpleName() + ":" + String.valueOf(t.getMessage()).replace(',', ';'));
            }
            return safeOrders(in, lastEnemyAbsBearing, faultsThisRound);
        }
    }

    /**
     * Orbit the enemy in the current direction of travel, don't fire, and lock the radar
     * on the enemy's last bearing (or sweep if it has not been seen).
     *
     * <p>Every order is set explicitly except the gun turn, which is left as it was: fire
     * power 0 holds fire, and the maximum velocity goes back to the engine's 8 px/tick in
     * case the core had lowered it. Moving side-on to the enemy is the cheapest dodge there
     * is: it keeps the robot's lateral velocity, which is what a gun has to predict, at its
     * highest.</p>
     *
     * <p>After three faulting ticks this round, and whenever the enemy's last bearing is
     * known and the gun is cool, these orders also turn the gun to it and fire power 1.0
     * (RES-7): a core that faults every tick would otherwise never return fire.</p>
     *
     * @param in the tick's input
     * @param enemyAbsBearing the enemy's last absolute bearing in radians, or NaN if unknown
     * @param faultsThisRound the number of faulting ticks this round, this one included
     * @return the safe orders for this tick
     */
    static BotOrders safeOrders(BotInput in, double enemyAbsBearing, int faultsThisRound) {
        BotOrders.Builder b = BotOrders.builder().maxVelocity(8.0);
        if (faultsThisRound >= 3 && !Double.isNaN(enemyAbsBearing) && in.gunHeat() == 0.0) {
            b.turnGunRight(Angles.normalRelativeAngle(enemyAbsBearing - in.gunHeading()));
            b.fire(1.0);
        }
        // A robot at rest counts as going forwards.
        double direction = in.velocity() < 0 ? -1 : 1;
        if (Double.isNaN(enemyAbsBearing)) {
            // Never seen: spin the radar to find it, and keep moving.
            b.turnRadarRight(Double.POSITIVE_INFINITY);
            b.ahead(direction * SAFE_DISTANCE);
        } else {
            // Turn the radar twice the angle to the enemy's last bearing, so it overshoots and
            // sweeps back across the enemy rather than stopping short of it (the same lock
            // the core uses).
            b.turnRadarRight(Angles.normalRelativeAngle(enemyAbsBearing - in.radarHeading()) * 2.0);
            // Face perpendicular to the enemy and keep going the way we were going.
            double perpendicular = Angles.normalRelativeAngle(enemyAbsBearing + Math.PI / 2 - in.heading());
            // Either perpendicular will do; take the one within a quarter turn, so the body
            // turns at most 90 degrees and the direction of travel is kept.
            if (Math.abs(perpendicular) > Math.PI / 2) {
                perpendicular = Angles.normalRelativeAngle(perpendicular + Math.PI);
            }
            b.turnRight(perpendicular);
            b.ahead(direction * SAFE_DISTANCE);
        }
        return b.build();
    }
}
