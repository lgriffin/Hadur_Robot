package hadurling;

import hadurling.core.Core;
import hadurling.core.Guard;
import hadurling.core.memory.ProfileLibrary;
import hadurling.core.policy.Evidence;
import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import java.util.ArrayList;
import java.util.List;
import robocode.AdvancedRobot;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.RoundEndedEvent;
import robocode.SkippedTurnEvent;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;

/**
 * Hadurling, lab 13: the Robocode adapter, now in its own module. It only translates.
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

    /**
     * Opponent profiles, shared by every round of the battle (static, like the round counter).
     * Null if the data directory cannot be used, in which case the robot plays without memory.
     */
    private static ProfileLibrary library;

    /** What this battle has shown about the opponent's hit rates; static so rounds share it. */
    private static final Evidence evidence = new Evidence();

    /** This round's core, kept so the round's end can save what it learned. */
    private Core core;

    /** How long the core took on the last tick, in nanoseconds; -1 before the first tick. */
    private long lastTickNanos = -1;

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

        if (library == null) library = openLibrary();
        core = new Core(library, evidence);
        guard = new Guard(core::tick, line -> out.println(line));
        guard.newRound();
        roundStarted(getRoundNum());

        while (true) {
            Input in = input();
            // The core may not read a clock (HL-39), so the adapter times it and reports the
            // measurement with the next tick's events.
            long started = System.nanoTime();
            Orders orders = guard.tick(in);
            lastTickNanos = System.nanoTime() - started;
            ticked(in, orders);
            apply(orders);
            execute();
        }
    }

    /** The profile library on this robot's data directory, or null if that is not possible. */
    private ProfileLibrary openLibrary() {
        try {
            return new ProfileLibrary(FileProfileStore.forRobot(this));
        } catch (RuntimeException e) {
            out.println("MEM,no data directory," + e);
            return null;
        }
    }

    /**
     * The round is over, whoever won: save what it taught about the opponent (HL-23). Robocode
     * lets a robot write to its data directory here.
     *
     * @param e the engine's report
     */
    @Override
    public void onRoundEnded(RoundEndedEvent e) {
        try {
            if (core != null) core.roundEnded();
        } catch (RuntimeException ex) {
            out.println("MEM,save," + ex);
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
        if (lastTickNanos >= 0) pending.add(new Event.TickTime(lastTickNanos));
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
     * The engine skipped one of our turns: the core took too long (HL-37).
     *
     * @param e the engine's report
     */
    @Override
    public void onSkippedTurn(SkippedTurnEvent e) {
        pending.add(new Event.SkippedTurn());
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
