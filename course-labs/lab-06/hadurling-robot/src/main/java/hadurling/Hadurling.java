package hadurling;

import hadurling.core.Core;
import hadurling.core.Guard;
import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import java.util.ArrayList;
import java.util.List;
import robocode.AdvancedRobot;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;

/**
 * Hadurling, lab 06: the Robocode adapter, now in its own module. It only translates.
 * Engine events become {@link Event} values and the getters become an {@link Input}; the
 * {@link Guard} runs the {@link Core} and returns its {@link Orders} (or safe ones if the
 * core fails); and this class turns the orders into engine calls.
 *
 * <p>One tick: the engine delivers events during {@code execute()}, our handlers queue them
 * in {@code pending}; the loop then builds an {@code Input}, asks the guard, applies the
 * orders and calls {@code execute()} again.</p>
 */
public class Hadurling extends AdvancedRobot {

    /** Rounds started this battle; static so it survives the new robot object each round. */
    private static int roundsStarted;

    /** Events delivered since the last tick, in delivery order. */
    private final List<Event> pending = new ArrayList<>();

    /** Runs the core for this round and covers for it if it fails. */
    private Guard guard;

    /** The main loop: one guarded core decision per tick. */
    @Override
    public void run() {
        roundsStarted++;
        out.println("Round " + roundsStarted + " of this battle");
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);

        Core core = new Core();
        guard = new Guard(core::tick, line -> out.println(line));
        guard.newRound();
        roundStarted(getRoundNum());

        while (true) {
            Input in = input();
            Orders orders = guard.tick(in);
            ticked(in, orders);
            apply(orders);
            execute();
        }
    }

    /**
     * Called at the start of every round. Does nothing here; {@link HadurlingRecorder} uses it.
     *
     * @param round the round number, from 0
     */
    protected void roundStarted(int round) { }

    /**
     * Called every tick after the core has decided and before the orders are applied. Does
     * nothing here; {@link HadurlingRecorder} uses it to write the tick down.
     *
     * @param in the input the core was given
     * @param orders the orders it returned (or the guard's safe orders)
     */
    protected void ticked(Input in, Orders orders) { }

    /** This tick's input: the getters plus the queued events, which are then cleared. */
    private Input input() {
        Input in = new Input(getTime(), getX(), getY(), getHeadingRadians(), getVelocity(),
            getEnergy(), getGunHeat(), getGunHeadingRadians(), getRadarHeadingRadians(), pending);
        pending.clear();
        return in;
    }

    /** Turns orders into setter calls. NaN means "do not call the setter". */
    private void apply(Orders o) {
        if (!Double.isNaN(o.bodyTurn())) setTurnRightRadians(o.bodyTurn());
        if (!Double.isNaN(o.ahead())) setAhead(o.ahead());
        if (!Double.isNaN(o.gunTurn())) setTurnGunRightRadians(o.gunTurn());
        if (!Double.isNaN(o.radarTurn())) setTurnRadarRightRadians(o.radarTurn());
        if (o.firePower() > 0) setFire(o.firePower());
    }

    /**
     * The radar saw a robot.
     *
     * @param e the engine's scan report
     */
    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        pending.add(new Event.Scan(e.getName(), e.getBearingRadians(), e.getDistance(),
            e.getEnergy(), e.getHeadingRadians(), e.getVelocity()));
    }

    /**
     * An enemy bullet hit us.
     *
     * @param e the engine's report
     */
    @Override
    public void onHitByBullet(HitByBulletEvent e) {
        pending.add(new Event.HitByBullet(e.getName(), e.getPower()));
    }

    /**
     * One of our bullets hit a robot.
     *
     * @param e the engine's report
     */
    @Override
    public void onBulletHit(BulletHitEvent e) {
        pending.add(new Event.BulletHit(e.getName(), e.getBullet().getPower()));
    }

    /**
     * We drove into a wall.
     *
     * @param e the engine's report
     */
    @Override
    public void onHitWall(HitWallEvent e) {
        pending.add(new Event.HitWall(e.getBearingRadians()));
    }

    /**
     * Another robot died.
     *
     * @param e the engine's report
     */
    @Override
    public void onRobotDeath(RobotDeathEvent e) {
        pending.add(new Event.RobotDeath(e.getName()));
    }
}
