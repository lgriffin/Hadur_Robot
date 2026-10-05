package hadur2;

import hadur2.core.Guard;
import hadur2.core.HadurCore;
import hadur2.core.model.BattleFacts;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.port.ProfileStore;
import hadur2.core.role.Charter;
import hadur2.core.role.RoleId;
import hadur2.core.shieldmode.ShieldList;
import java.awt.Color;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import robocode.*;

/**
 * The Robocode adapter. It turns engine events and getters into a {@link BotInput},
 * hands it to the core through the {@link Guard}, and applies the {@link BotOrders} that
 * come back. All strategy lives in {@code hadur2.core}; this class only translates.
 *
 * <p>The core is static so what it learns survives from round to round, as Robocode
 * creates a new robot instance each round.</p>
 *
 * <p>From A4 the adapter is a {@code TeamRobot}, so one class plays all three ladders and
 * one memory serves them: it passes the roster into the battle's facts, hands teammates'
 * messages to the core and broadcasts the core's. Off a team {@code getTeammates()} is null,
 * no message arrives and none is sent, so it behaves as the {@code AdvancedRobot} it was.</p>
 *
 * <p>One turn, as the engine runs it:</p>
 * <ol>
 * <li>During {@code execute()} the engine delivers the turn's events, in its own priority
 *     order, to the handlers below; each becomes a {@link BotEvent} in {@code pending}.</li>
 * <li>The run loop puts the last core tick's duration first, as a
 *     {@link BotEvent.TickTime} (TIME-1), then builds a {@link BotInput} from the getters
 *     and the pending events.</li>
 * <li>{@link Guard#tick} runs the core. If the core throws, the guard returns the safe
 *     order set for this tick and records the fault (RES-1), so this loop always has
 *     orders to apply.</li>
 * <li>{@code apply} turns the orders into setter calls, and {@code execute()} ends the
 *     turn.</li>
 * </ol>
 *
 * <p>Round and battle ends go to the core too: {@code roundEnded} once per round for the
 * R record (RES-5), a profile checkpoint when the round ends with Hadur alive and a final
 * save at the battle's end (MEM-3). The three {@code protected} hooks exist for
 * {@link HadurRecorder}; the robot itself does nothing in them.</p>
 *
 * <p>The adapter holds mutable statics ({@code core}, {@code guard}, {@code console}).
 * CORE-2's ban on them covers {@code hadur2.core} only, and here they are the point: a
 * static survives the new robot instance Robocode creates each round.</p>
 */
public class Hadur extends TeamRobot {

    /** The brain for the whole battle; built on the first round's {@code run()}. */
    private static HadurCore core;
    /** Wraps every core tick (RES-1); lives as long as the core. */
    private static Guard guard;
    /** This round's console; telemetry goes to whichever round is running. */
    private static PrintStream console;
    /** Whether this battle is a team's (A5): fixed with the core on the first round. */
    private static boolean team;
    /** RES-8: rounds fought this battle, for the health record. */
    private static int battleRounds;
    /** RES-8: rounds this battle that were not a loss. */
    private static int battleRoundsSurvived;
    /** RES-8: faults this battle, summed over every round's {@link Guard#faultsThisRound()}. */
    private static int battleFaults;
    /** RES-8: engine-skipped-turn events this battle. */
    private static int battleSkippedTurns;
    /**
     * The per-turn time the tick budget assumes (TIME-1). A robot cannot read the engine's
     * CPU constant, so this is a fixed guess: the bench machine's constant is about 3 ms.
     * The core's tick budget drops a computation level after a tick that used more than 70%
     * of it.
     */
    static final long TICK_ALLOWANCE_NANOS = 3_000_000L;

    /** Events delivered since the last tick, in delivery order; cleared as each input is built. */
    private final List<BotEvent> pending = new ArrayList<>();
    /** Whether this round's R record has been emitted; the round's end can arrive by several events. */
    private boolean roundReported;
    /** How long the core's last tick took; negative before the round's first. */
    private long lastTickNanos = -1;

    /**
     * The robot's main loop: sets up the battle on the first round, starts the round, then
     * runs one core tick per turn until the engine stops the thread.
     */
    @Override
    public void run() {
        // Each round's robot has its own console stream; telemetry closures read the static.
        console = out;
        if (core == null) {
            // RES-8: fresh battle totals for the health record.
            battleRounds = 0;
            battleRoundsSurvived = 0;
            battleFaults = 0;
            battleSkippedTurns = 0;
            // TIME-5: warm up class loading and JIT compilation on a throwaway core before
            // the real one's first tick pays for it.
            warmUp(getBattleFieldWidth(), getBattleFieldHeight(), getOthers());
            // First round of the battle. The telemetry lambdas go through the static
            // console rather than capturing this round's `out`.
            // ROLE-1: the battle's facts before the first tick fix its charter. As a
            // TeamRobot (A4) Hadur can ask for its teammates; off a team there are none.
            BattleFacts facts = facts();
            core = new HadurCore(facts, line -> console.println(line), profileStore(), null, shieldList());
            // File I/O and class loading now, not in the first scan's turn.
            core.prepareMemory();
            // WEAVE-5: on a team the guard's safe orders hold fire.
            team = core.charter() == Charter.TEAM;
            guard = new Guard(core::tick, core::recover, line -> console.println(line), team);
            battleStarted(facts);
        }
        core.newRound(getRoundNum());
        guard.newRound();
        roundStarted(getRoundNum());

        setBodyColor(new Color(139, 0, 0));
        setGunColor(new Color(218, 165, 32));
        setRadarColor(new Color(178, 34, 34));
        setBulletColor(new Color(255, 69, 0));
        setScanColor(new Color(255, 140, 0));

        // Turn gun, radar and body independently: the core computes each turn separately,
        // so a body turn must not drag the gun, nor a gun turn the radar.
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);

        while (true) {
            // TIME-1: the last tick's duration goes in first, ahead of the engine's events.
            // The core never reads a clock (RES-6), so a replay sees the same time (CORE-2).
            if (lastTickNanos >= 0) pending.add(0, new BotEvent.TickTime(lastTickNanos, TICK_ALLOWANCE_NANOS));
            BotInput in = input();
            // Only the guarded core call is timed: that is what the budget can change.
            long start = System.nanoTime();
            BotOrders orders = guard.tick(in);
            lastTickNanos = System.nanoTime() - start;
            ticked(in, orders);
            apply(orders);
            execute();
        }
    }

    /**
     * TIME-5: runs one tick for each role of the charter through a throwaway core and guard
     * before the real battle begins, so that class loading and JIT warm-up land here rather
     * than on the first real tick a role drives. No store (nothing is read or written) and no
     * telemetry from the throwaway core itself; the core, guard and result are all discarded,
     * and nothing they do reaches the real core.
     *
     * <p>Each tick carries a synthetic scan, not just a bare one: a tick with no scan takes
     * only the "enemy not seen yet" branch, which never reaches the aiming, movement and
     * memory-adjacent code the real first scan will actually run, so it would warm little
     * of what needs it. In a melee the Melee drives the first tick with every opponent
     * alive, and the Duel the second with one left, the hand-off included (A3). A failure
     * here is logged, not silent: it never stops the battle (a cold real tick still runs
     * correctly), but it is worth knowing about.</p>
     *
     * @return the roles that drove a warm-up tick
     */
    static Set<RoleId> warmUp(double width, double height, int others) {
        Set<RoleId> driven = EnumSet.noneOf(RoleId.class);
        try {
            List<String> lines = new ArrayList<>();
            HadurCore warm = new HadurCore(width, height, others, lines::add, null);
            warm.newRound(0);
            Guard warmGuard = new Guard(warm::tick, warm::recover, line -> {});
            List<Integer> counts = new ArrayList<>();
            if (warm.charter().has(RoleId.MELEE)) counts.add(others);
            counts.add(1);
            long time = 0;
            for (int left : counts) {
                // The engine's cooling rate: a rate of 0 is refused, and faults the tick.
                warmGuard.tick(new BotInput(time++, 0, width / 2, height / 2, 0, 0, 100, 0, 0.1, 0, 0, 0, left,
                    List.of(new BotEvent.Scan("warmup.Enemy", 0, width / 4, 100, 0, 0))));
            }
            for (String line : lines) {
                if (line.startsWith("ROLE,")) driven.add(RoleId.valueOf(line.split(",")[3]));
            }
            if (warmGuard.faultsThisRound() > 0 && console != null) {
                console.println("WARM,0,0,fault," + warmGuard.faultsThisRound());
            }
        } catch (RuntimeException e) {
            if (console != null) console.println("WARM,0,0,exception," + e);
        }
        return driven;
    }

    /**
     * SHIELD-5: Hadur's own shield list, from {@link ShieldListData} in the robot jar. It is a
     * class, not a text resource, because Robocode's sandbox refuses a robot the read of its
     * own jar (a resource stream raises a security violation and the robot is killed); class
     * loading is the one way a robot's jar content reaches it. The core does no I/O and takes
     * only the lines. A list that cannot be read is an empty list, with a {@code SH} line:
     * shield mode then never starts and Hadur fights as it did before the list existed.
     */
    private ShieldList shieldList() {
        try {
            return ShieldList.parse(Arrays.asList(ShieldListData.lines()));
        } catch (RuntimeException | LinkageError e) {
            out.println("SH," + getRoundNum() + "," + getTime() + ",list-failed," + e);
            return ShieldList.NONE;
        }
    }

    /**
     * Opponent memory lives in the data directory; without one, Hadur fights as a stranger.
     * A failure here is printed as a {@code MEM} line and leaves the core without a store,
     * never stops the robot (MEM-4).
     */
    private ProfileStore profileStore() {
        try {
            return FileProfileStore.forRobot(this);
        } catch (RuntimeException e) {
            out.println("MEM," + getRoundNum() + "," + getTime() + ",no-store," + e);
            return null;
        }
    }

    // Hooks for the bench's recorder, which captures replay fixtures (CORE-2).
    // The robot itself does nothing in them.

    /**
     * The engine's facts before the first tick (ROLE-1): the field, the others, the roster
     * ({@code getTeammates()} is null off a team), our name, our starting energy, which says
     * whether we lead, and the sentry border.
     */
    private BattleFacts facts() {
        String[] teammates = getTeammates();
        return new BattleFacts(getBattleFieldWidth(), getBattleFieldHeight(), getOthers(),
            teammates == null ? List.of() : Arrays.asList(teammates), getName(), getEnergy(),
            getNumSentries() > 0 ? getSentryBorderSize() : 0);
    }

    /**
     * Called once per battle, after the core is built.
     *
     * @param facts the facts the core was built from: the field, the others at the start
     *     (sentries excluded, as {@code getOthers()} counts), and on a team the roster, our
     *     name, our starting energy and the sentry border
     */
    protected void battleStarted(BattleFacts facts) {}

    /**
     * Called at the start of every round, after the core's and guard's {@code newRound}.
     *
     * @param round the round number, from 0
     */
    protected void roundStarted(int round) {}

    /**
     * Called every turn after the core's tick, before the orders are applied.
     *
     * @param in the input the core was given
     * @param orders the orders it returned (or the guard's safe orders)
     */
    protected void ticked(BotInput in, BotOrders orders) {}

    /**
     * This turn's {@link BotInput}: the getters (headings in radians, 0 = north, clockwise;
     * position in px from the bottom-left corner) and the events queued since the last
     * turn, which are then cleared.
     */
    private BotInput input() {
        BotInput in = new BotInput(getTime(), getRoundNum(), getX(), getY(),
            getHeadingRadians(), getVelocity(), getEnergy(), getGunHeat(),
            getGunCoolingRate(), getGunHeadingRadians(), getGunTurnRemainingRadians(),
            getRadarHeadingRadians(), getOthers(), pending, getNumSentries(),
            // The border size has a default even without sentries; it only matters with them.
            getNumSentries() > 0 ? getSentryBorderSize() : 0);
        pending.clear();
        return in;
    }

    /**
     * Turns the core's orders into Robocode setter calls. A NaN field means "leave the
     * previous setting in place", exactly as not calling that setter; a fire power of 0 (or
     * less) holds fire. The setters only queue the orders; {@code execute()} carries them
     * out.
     */
    private void apply(BotOrders o) {
        if (!Double.isNaN(o.maxVelocity())) setMaxVelocity(o.maxVelocity());
        if (!Double.isNaN(o.bodyTurn())) setTurnRightRadians(o.bodyTurn());
        if (!Double.isNaN(o.ahead())) setAhead(o.ahead());
        if (!Double.isNaN(o.gunTurn())) setTurnGunRightRadians(o.gunTurn());
        if (!Double.isNaN(o.radarTurn())) setTurnRadarRightRadians(o.radarTurn());
        if (o.firePower() > 0) setFire(o.firePower());
        // A4: the tick's reports to teammates; the engine delivers them on the next tick.
        for (byte[] message : o.messages()) {
            try {
                broadcastMessage(message);
            } catch (IOException | RuntimeException e) {
                if (console != null) console.println("LINK," + getRoundNum() + "," + getTime() + ",send-failed," + e);
            }
        }
    }

    // Events arrive during execute(), in the engine's priority order, and are handed to
    // the core with the next tick's input.

    /** A scan: bearing relative to our heading (radians), distance (px), and the robot's state. */
    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        pending.add(new BotEvent.Scan(e.getName(), e.getBearingRadians(), e.getDistance(),
            e.getEnergy(), e.getHeadingRadians(), e.getVelocity(), e.isSentryRobot()));
    }

    /** An enemy bullet hit us: the shooter, its power, where it hit and its heading. */
    @Override
    public void onHitByBullet(HitByBulletEvent e) {
        Bullet b = e.getBullet();
        pending.add(new BotEvent.HitByBullet(e.getName(), e.getPower(), b.getX(), b.getY(),
            e.getHeadingRadians()));
    }

    /**
     * One of our bullets hit a robot. The victim's energy and our bullet's power let the
     * ledger subtract our damage from the enemy's next energy drop (WAVE-1); the heading
     * names the bullet for the shadows (MOVE-1).
     */
    @Override
    public void onBulletHit(BulletHitEvent e) {
        pending.add(new BotEvent.BulletHit(e.getName(), e.getBullet().getPower(), e.getEnergy(),
            e.getBullet().getHeadingRadians()));
    }

    /**
     * One of our bullets met an enemy bullet: our power, where they met, the enemy
     * bullet's power, and our bullet's heading (SHIELD-1, MOVE-1).
     */
    @Override
    public void onBulletHitBullet(BulletHitBulletEvent e) {
        Bullet hit = e.getHitBullet();
        pending.add(new BotEvent.BulletHitBullet(e.getBullet().getPower(), hit.getX(), hit.getY(),
            hit.getPower(), e.getBullet().getHeadingRadians(), hit.getName()));
    }

    /**
     * A teammate's message (A4). Hadur's reports are byte arrays; anything else is passed on
     * as no bytes, which the core's link codec refuses and counts (LINK-2).
     */
    @Override
    public void onMessageReceived(MessageEvent e) {
        Object message = e.getMessage();
        pending.add(new BotEvent.Message(e.getSender(),
            message instanceof byte[] ? (byte[]) message : new byte[0]));
    }

    /** One of our bullets reached a wall. */
    @Override
    public void onBulletMissed(BulletMissedEvent e) {
        pending.add(new BotEvent.BulletMissed(e.getBullet().getPower(),
            e.getBullet().getHeadingRadians()));
    }

    /** We drove into a wall; the bearing is relative to our heading. */
    @Override
    public void onHitWall(HitWallEvent e) {
        pending.add(new BotEvent.HitWall(e.getBearingRadians()));
    }

    /**
     * We collided with a robot: the energy ledger takes the collision damage out of the
     * enemy's next energy drop before classifying it as a shot (WAVE-1).
     */
    @Override
    public void onHitRobot(HitRobotEvent e) {
        pending.add(new BotEvent.HitRobot(e.getName(), e.getBearingRadians(), e.getEnergy(),
            e.isMyFault()));
    }

    /** A robot died; melee drops it within the tick (MSENSE-1). */
    @Override
    public void onRobotDeath(RobotDeathEvent e) {
        pending.add(new BotEvent.RobotDeath(e.getName()));
    }

    /** The engine skipped one of our turns: the core drops a computation level for the round (TIME-2). */
    @Override
    public void onSkippedTurn(SkippedTurnEvent e) {
        pending.add(new BotEvent.SkippedTurn(e.getSkippedTurn()));
        battleSkippedTurns++;
    }

    /** We won the round. No file I/O here; the save waits for {@link #onRoundEnded}. */
    @Override
    public void onWin(WinEvent e) {
        reportRound("win");
    }

    /** We died. No file I/O here, and no save for a dead robot (see {@link #onRoundEnded}). */
    @Override
    public void onDeath(DeathEvent e) {
        reportRound("loss");
    }

    /** The round is over: report it if nothing else has, then checkpoint the profile. */
    @Override
    public void onRoundEnded(RoundEndedEvent e) {
        // The engine can deliver this before WinEvent in the round's last batch.
        if (!team) {
            reportRound(getEnergy() <= 0 ? "loss" : getOthers() == 0 ? "win" : "draw");
        } else if (getEnergy() > 0) {
            // A5: a living teammate keeps getOthers() above 0, so on a team a member alive
            // at the round's end is on the winning side. At energy 0 the win or death event
            // that follows in the same batch says which it was.
            reportRound("win");
        }
        // A checkpoint: the robot may not get to the battle's end (MEM-3), and TIME-4
        // caps what each one writes. File I/O is safe here, unlike in onWin and onDeath.
        // Only when alive: a dead robot's thread that stops to write keeps it in the
        // round, where the enemy goes on shooting it and its last bullets still refund it
        // energy (the S3 bench saw this).
        if (core != null && getEnergy() > 0) core.checkpoint(getTime());
    }

    /** The battle is over: the final profile save (MEM-3) and the health record (RES-8). */
    @Override
    public void onBattleEnded(BattleEndedEvent e) {
        if (core == null) return;
        core.battleEnded(getTime());
        core.writeBattleHealth(battleRounds, battleRoundsSurvived, battleFaults, battleSkippedTurns);
    }

    /** One R record per round (RES-5), from whichever end-of-round event comes first. */
    private void reportRound(String result) {
        if (roundReported || core == null) return;
        roundReported = true;
        // RES-8: battle totals for the health record; a draw counts as survived, only a
        // loss does not.
        battleRounds++;
        if (!"loss".equals(result)) battleRoundsSurvived++;
        battleFaults += guard.faultsThisRound();
        core.roundEnded(getTime(), result, getEnergy(), guard.faultsThisRound());
    }
}
