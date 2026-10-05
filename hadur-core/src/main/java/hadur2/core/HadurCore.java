package hadur2.core;

import hadur2.core.adapt.Opening;
import hadur2.core.duel.DuelController;
import hadur2.core.melee.EnemyInfo;
import hadur2.core.melee.MeleeController;
import hadur2.core.memory.Estimate;
import hadur2.core.memory.ProfileLibrary;
import hadur2.core.model.Baton;
import hadur2.core.model.BattleFacts;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.model.RoundStats;
import hadur2.core.move.SurfMover;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.Rules;
import hadur2.core.policy.Endgame;
import hadur2.core.policy.MoveFlavour;
import hadur2.core.policy.TickBudget;
import hadur2.core.port.ProfileStore;
import hadur2.core.port.Telemetry;
import hadur2.core.role.Charter;
import hadur2.core.role.DuelFocus;
import hadur2.core.role.Posture;
import hadur2.core.role.RoleId;
import hadur2.core.role.RoleResolver;
import hadur2.core.role.RoundFacts;
import hadur2.core.role.RoundResult;
import hadur2.core.role.SentryFence;
import hadur2.core.role.Tick;
import hadur2.core.role.Veto;
import java.awt.geom.Point2D;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Hadur's conductor. One instance lives for a whole battle; {@link #tick} turns each
 * {@link BotInput} into {@link BotOrders}. It never touches the Robocode API (CORE-1) and
 * holds no randomness, threads, reflection or I/O (RES-6), so the same inputs always give
 * the same orders (CORE-2).
 *
 * <p>A2 lifted the duel out of this class into {@link DuelController}, beside the
 * {@link MeleeController}. Each brain sits behind the {@link hadur2.core.role.Role} contract
 * through the conductor's seam for it ({@link DuelSeam}, {@link MeleeSeam}), which hands it
 * its shelf by charter, or none. What stays here is the conductor's: the charter and the
 * {@link RoleResolver}, the Duel's {@link DuelFocus} and the {@link SentryFence}, the robots
 * dead this round, the count of melee bullets in flight (WORLD-5), the hand-off, the
 * {@link TickBudget}, the fire permission (WEAVE-3), the round's {@code R} and {@code M}
 * records and the health record. Its public methods and accessors are those it had before
 * A2, and the duel's delegate to the Duel.</p>
 *
 * <p>The battle's {@link Charter} is fixed from its {@link BattleFacts} when the core is made
 * (ROLE-1), and the resolver picks the role each tick, failing closed to the Duel: Melee
 * drives while two or more opponents are alive, no sentry is on the field or has been
 * scanned this round, melee has not thrown this round and the Duel has not yet driven this
 * round (ROLE-2 to ROLE-4, GATE-2 to GATE-4). Once one opponent is left, the Duel takes over
 * from a clean slate (MELEE-2). When the Duel drives with several opponents alive it fights
 * one, the focus, and ignores the rest; with sentries about, the fence keeps its movement out
 * of their border. Sentries are never tracked, targeted or profiled (GATE-5).</p>
 *
 * <p>When a melee's opponents fall to one, the survivor's first scan hands it to the Duel
 * (MMEM-2): the Melee seam gives a {@link Baton} of the shots the melee saw and Hadur's path,
 * the Duel takes the survivor's shots still short of Hadur as firing waves and reads its 1v1
 * profile for the opening, and an H record says what was handed over.</p>
 *
 * <p>One {@link #tick}, in order:</p>
 * <ol>
 * <li>Resolve. Sentry scans are noted, then the resolver picks this tick's role from the
 *     charter, the counts, the vetoes and the latch. If Melee has just stopped driving, the
 *     Duel is reset and full speed ordered before any event is handled (MELEE-2). Whether
 *     the tick runs in duress (RES-9) is settled here.</li>
 * <li>Observe. Each event, in the engine's order, is offered to the charter's roles, Melee
 *     before Duel (ROLE-5). In duress a scan only moves the Duel's fix on its opponent.</li>
 * <li>Drive. The Duel replays a few seed samples; a melee event fault takes effect; the
 *     conductor gives the fire permission, and the driving role fills the orders (WEAVE-1,
 *     WEAVE-3). A shot without the permission is that role's fault (WEAVE-6).</li>
 * <li>Fence. With sentries on the field, the Duel's drive passes through the fence, which
 *     never touches the gun, the radar or the fire order (WEAVE-2).</li>
 * <li>The role that completed the tick latches the round (ROLE-4).</li>
 * </ol>
 *
 * <p>Units and conventions follow Robocode: positions in px with x growing east and y north,
 * angles in radians with headings absolute (0 = north, clockwise) and bearings relative to
 * our heading, time in ticks, energy and bullet power in the engine's units. The core writes
 * line records to {@link Telemetry}: {@code V} (once, when the core is made), {@code B}
 * (battle and opponent, at the first duel scan), {@code P} (a policy decision), {@code EW}
 * (an enemy wave the ledger found), {@code MEM} (a memory failure), {@code FAULT}, {@code H}
 * (a hand-off), {@code ROLE} (a change of role), {@code R} (round end, see
 * {@link RoundStats}) and {@code M} (the melee extension's round end).</p>
 *
 * <p>Nothing grows without bound (RES-2): the brains cap their own logs, trees and windows,
 * and the only collection held here, the round's dead robots, stops at 64 names.</p>
 */
public final class HadurCore {

    /** Where the line records go; the core does no I/O itself (RES-6). */
    private final Telemetry telemetry;
    /** RES-8: kept only to write the battle-health record; the core does no other I/O with it. */
    private final ProfileStore store;
    /** The Duel's brain, and the seam the conductor drives it through. */
    private final DuelController duel;
    private final DuelSeam duelSeam;
    /** The melee brain's seam; the brain sees every non-sentry scan and death, whichever role drives. */
    private final MeleeSeam meleeSeam;
    /** WORLD-5: our melee bullets not yet resolved; their outcomes are no evidence about a duel. */
    private int meleeBulletsInFlight;
    /** MMEM-2: the melee has just ended; the next duel scan hands its survivor over. */
    private boolean handOffPending;
    /** S6: the tick budget (TIME-1, TIME-2), the conductor's; its level goes to the driving role. */
    private final TickBudget budget = new TickBudget();
    /** WEAVE-3: whether a shot may leave this tick; until A5 always. */
    private Predicate<BotInput> firePermission = in -> true;
    /** The tick being processed, for records written from event handlers. */
    private long lastTickTime;

    /** The current round, from 0. */
    private int round;
    /** This round's counters; replaced at each round's start. */
    private RoundStats stats = new RoundStats();
    /** Whether melee drove the previous tick; its fall to false is MELEE-2's moment. */
    private boolean inMelee;

    /** A1: the battle's facts at tick 0 and the role resolver they set up (ROLE-1). */
    private final BattleFacts facts;
    /** ROLE-2 to ROLE-4: the role each tick, its vetoes, the latch and the sentry names. */
    private final RoleResolver gate;
    /** The role whose ROLE record went out last, or null at a round's start. */
    private RoleId lastRole;
    /** M1: the duel's focus among several opponents, and the sentry fence. */
    private final DuelFocus focus = new DuelFocus();
    private final SentryFence fence;
    /** Opponents at the battle's start, sentries excluded. */
    private final int enemiesTotal;
    /** The duel is driving while two or more opponents are alive (a vetoed melee). */
    private boolean focusing;
    /** The subsystems driving this tick (GATE-1, GATE-2). */
    private Posture posture = Posture.DUEL;
    /**
     * Opponents that died this round, to catch the melee aiming at a dead robot (M2's gate).
     * At most 64 names are kept (RES-2).
     */
    private final Set<String> deadThisRound = new LinkedHashSet<>();
    /** Per-round counters for the M record. */
    private int meleeTicks, duelTicks, focusTicks, meleeFaults, sentryHits;
    /** Whether this battle's one round-end checkpoint has already been written (MEM-10). */
    private boolean checkpointed;

    /**
     * A core without opponent memory.
     *
     * @param fieldWidth the battle field's width in px
     * @param fieldHeight the battle field's height in px
     * @param enemiesTotal opponents at the battle's start, sentries excluded
     * @param telemetry where the line records go
     */
    public HadurCore(double fieldWidth, double fieldHeight, int enemiesTotal, Telemetry telemetry) {
        this(fieldWidth, fieldHeight, enemiesTotal, telemetry, null);
    }

    /**
     * A core that remembers opponents in {@code store} (null for none). Memory is kept only
     * in a duel battle: with two or more opponents at the start, the store is ignored.
     *
     * @param fieldWidth the battle field's width in px
     * @param fieldHeight the battle field's height in px
     * @param enemiesTotal opponents at the battle's start, sentries excluded
     * @param telemetry where the line records go
     * @param store where profiles are kept between battles, or null
     */
    public HadurCore(double fieldWidth, double fieldHeight, int enemiesTotal, Telemetry telemetry,
                     ProfileStore store) {
        this(fieldWidth, fieldHeight, enemiesTotal, telemetry, store,
            new MeleeController(new BattleField(fieldWidth, fieldHeight)));
    }

    /**
     * A core with the given melee brain; tests use it to make the melee fail (GATE-4).
     *
     * @param fieldWidth the battle field's width in px
     * @param fieldHeight the battle field's height in px
     * @param enemiesTotal opponents at the battle's start, sentries excluded
     * @param telemetry where the line records go
     * @param store where profiles are kept between battles, or null
     * @param melee the melee brain
     */
    public HadurCore(double fieldWidth, double fieldHeight, int enemiesTotal, Telemetry telemetry,
                     ProfileStore store, MeleeController melee) {
        this(BattleFacts.solo(fieldWidth, fieldHeight, enemiesTotal), telemetry, store, melee);
    }

    /**
     * A core for the battle {@code facts} describe (ROLE-1), remembering opponents in
     * {@code store} (null for none). This is the adapter's constructor.
     *
     * @param facts the engine's facts before the first tick
     * @param telemetry where the line records go
     * @param store where profiles are kept between battles, or null
     */
    public HadurCore(BattleFacts facts, Telemetry telemetry, ProfileStore store) {
        this(facts, telemetry, store, new MeleeController(new BattleField(facts.width(), facts.height())));
    }

    /**
     * A core for {@code facts} with the given melee brain; tests use it to make the melee fail.
     *
     * @param facts the engine's facts before the first tick
     * @param telemetry where the line records go
     * @param store where profiles are kept between battles, or null
     * @param melee the melee brain
     */
    public HadurCore(BattleFacts facts, Telemetry telemetry, ProfileStore store, MeleeController melee) {
        this.facts = facts;
        // ROLE-1: the charter is fixed here, before the first tick.
        Charter charter = Charter.of(facts);
        this.gate = new RoleResolver(charter);
        this.enemiesTotal = facts.enemies();
        this.telemetry = telemetry;
        this.fence = new SentryFence(facts.width(), facts.height());
        this.store = store;
        // Each seam hands its brain its shelf, or none, by charter: the Duel's .hp library in
        // a duel, the melee blocks and the survivors' 1v1 profiles (read, never written) in a
        // melee (MEM-1 to MEM-5 read "duel"; see docs/requirements.md).
        ProfileLibrary library = store != null && charter == Charter.DUEL ? new ProfileLibrary(store) : null;
        boolean meleeShelf = store != null && charter.has(RoleId.MELEE);
        MeleeMemory meleeMemory = meleeShelf ? new MeleeMemory(store) : null;
        ProfileLibrary survivorLibrary = meleeShelf ? new ProfileLibrary(store) : null;
        this.duel = new DuelController(facts.width(), facts.height(), enemiesTotal, telemetry,
            library, survivorLibrary, stats);
        this.duelSeam = new DuelSeam(this, duel);
        this.meleeSeam = new MeleeSeam(this, melee, meleeMemory, stats);
        // The V record opens every battle's log.
        telemetry.emit("V,1");
    }

    /**
     * Starts a round. Transient state (waves, logs, the melee tracker, the resolver's veto
     * and latch, the tick budget's round level) is cleared; what was learned (KNN views,
     * virtual-gun ratings, the profile, the hit windows, the distance controller, the shield
     * verdict) carries on, because the core lives for the whole battle.
     *
     * @param round the round number, from 0
     */
    public void newRound(int round) {
        this.round = round;
        this.stats = new RoundStats();
        RoundFacts facts = new RoundFacts(round, stats);
        duelSeam.newRound(facts);
        meleeSeam.newRound(facts);
        resetConductor();
        budget.newRound();
        gate.newRound();
        lastRole = null;
        meleeTicks = duelTicks = focusTicks = meleeFaults = sentryHits = 0;
        deadThisRound.clear();
        handOffPending = false;
    }

    /**
     * Forgets this round's transient state (waves, logs, the last scan) but keeps
     * everything learned. Used after a fault, so a bad state can't fault every tick. A
     * recovery is core-wide and is not a change of role: the vetoes, the latch and a pending
     * hand-off stay.
     */
    public void recover() {
        duelSeam.recover();
        meleeSeam.recover();
        resetConductor();
    }

    /** The conductor's transient state, shared by a new round and a recovery. */
    private void resetConductor() {
        meleeBulletsInFlight = 0;
        inMelee = false;
        focusing = false;
        focus.clear();
    }

    /**
     * This round's counters so far.
     *
     * @return the live statistics object, replaced at the next round's start
     */
    public RoundStats stats() {
        return stats;
    }

    /**
     * Turns one tick's input into orders: resolve, observe, drive, fence (see the class
     * comment). May throw; the {@link Guard} covers it (RES-1).
     *
     * @param in the robot's state and the events that arrived this tick
     * @return the tick's orders; fields left NaN keep the previous setting
     */
    public BotOrders tick(BotInput in) {
        BotOrders.Builder orders = BotOrders.builder();
        lastTickTime = in.time();
        duel.beginTick();
        // GATE-3: a sentry scanned this tick vetoes melee before this tick's orders.
        for (BotEvent e : in.events()) {
            if (e instanceof BotEvent.Scan && ((BotEvent.Scan) e).sentry()) {
                gate.sentryScanned(((BotEvent.Scan) e).name());
            }
        }
        // ROLE-2 to ROLE-4: the role from the charter, the counts, the vetoes and the latch.
        // Off a team the enemies are the engine's others. No adapter supplies a roster before
        // A4, so there are no teammates yet; A5 brings the team's count (WORLD-2, WORLD-8).
        posture = RoleResolver.posture(gate.resolve(in.others(), 0, in.numSentries()));
        boolean melee = posture == Posture.MELEE;
        if (melee) meleeSeam.measureScanGap(in.time(), in.others());
        // Checked before this tick's scans are handled, so the survivor's scan on this tick
        // already goes to a clean duel.
        if (inMelee && !melee) {
            // MELEE-2: the survivor was never tracked as a duel opponent; start fresh.
            duelSeam.reset();
            orders.maxVelocity(Rules.MAX_VELOCITY);
            // MMEM-2: what the melee knows about the survivor goes over on its first scan.
            handOffPending = in.others() == 1;
        }
        inMelee = melee;
        // A duel with several opponents alive fights one of them (GATE-3, GATE-4); the focus
        // is dropped once that stops, so the next focusing starts from the closest robot.
        boolean wasFocusing = focusing;
        focusing = !melee && in.others() >= 2;
        if (wasFocusing && !focusing) focus.clear();

        // RES-9: three skipped turns in a round put the rest of it in duress, which runs
        // none of the learning below: no samples, no waves, no tree. Only a duel's known
        // opponent is fought this way; before its first scan there is nothing to orbit.
        boolean inDuress = !melee && duel.canFightInDuress() && budget.duress();
        Tick tick = new Tick(in, melee ? RoleId.MELEE : RoleId.DUEL, focusing, focus, gate::isSentry,
            inDuress);

        // The events in the order the adapter queued them, which is the engine's own. HitWall
        // needs no handling: the ledger infers the enemy's wall hits, and our own wall damage
        // does not change what the enemy's energy says.
        for (BotEvent e : in.events()) {
            if (inDuress) observeInDuress(e, tick);
            else observe(e, tick);
        }

        // ADAPT-3: a few seed samples a tick, so no one tick pays for the whole seed.
        if (!melee && !inDuress) duel.replaySeeds();

        RuntimeException eventFault = meleeSeam.takeFault();
        if (eventFault != null) {
            // GATE-4: the melee brain threw handling this tick's events. Fail closed now,
            // whichever role was about to drive.
            if (melee) orders = meleeFailed(in, eventFault);
            else recordMeleeFault(in, eventFault);
            melee = false;
        }
        // WEAVE-3: the permission is given before the role drives, from where Hadur is now.
        Tick drive = tick.forDrive(melee ? RoleId.MELEE : RoleId.DUEL, focusing, budget.level(),
            firePermission.test(in));
        if (melee) {
            try {
                meleeSeam.drive(drive, orders);
                checkFirePermission(drive, orders);
            } catch (RuntimeException ex) {
                // GATE-4: fail closed. The duel takes this tick and the rest of the round.
                orders = meleeFailed(in, ex);
            }
        } else {
            duelSeam.drive(drive, orders);
            checkFirePermission(drive, orders);
        }
        if (inMelee) meleeTicks++;
        else if (focusing) focusTicks++;
        else duelTicks++;
        BotOrders built = orders.build();
        // GATE-3: with sentries about, their border is a wall for the duel's movement.
        if (!inMelee && in.numSentries() > 0) {
            built = fence.apply(in.x(), in.y(), in.heading(), in.velocity(), built,
                in.sentryBorderSize());
        }
        // ROLE-4: the role that completed this tick latches the round. This is the tick's
        // last step, so a tick the Guard covers leaves the latch as it stands.
        RoleId drove = inMelee ? RoleId.MELEE : RoleId.DUEL;
        gate.drove(drove);
        if (drove != lastRole) {
            emitRole(in, drove);
            lastRole = drove;
        }
        return built;
    }

    /**
     * ROLE-5: one event, offered to the charter's roles, Melee before Duel. A sentry's scan
     * and a sentry's bullet are offered to no role (GATE-5). The conductor's own bookkeeping
     * (the round's counters, deaths, the budget's events) comes first.
     */
    private void observe(BotEvent e, Tick tick) {
        if (e instanceof BotEvent.Scan) {
            BotEvent.Scan scan = (BotEvent.Scan) e;
            // GATE-5: a sentry is never tracked, targeted or profiled.
            if (scan.sentry() || gate.isSentry(scan.name())) return;
        } else if (e instanceof BotEvent.HitByBullet) {
            stats.hitsTaken++;
            if (gate.isSentry(((BotEvent.HitByBullet) e).name())) return;
        } else if (e instanceof BotEvent.BulletHitBullet) {
            stats.bulletsIntercepted++;
        } else if (e instanceof BotEvent.BulletHit) {
            stats.shotsHit++;
            if (gate.isSentry(((BotEvent.BulletHit) e).name())) sentryHits++;
        } else if (e instanceof BotEvent.RobotDeath) {
            robotDied(((BotEvent.RobotDeath) e).name());
        } else if (e instanceof BotEvent.SkippedTurn) {
            onSkippedTurn(tick.in());
            return;
        } else if (e instanceof BotEvent.TickTime) {
            onTickTime((BotEvent.TickTime) e);
            return;
        }
        meleeSeam.observe(e, tick);
        duelSeam.observe(e, tick);
    }

    /**
     * RES-9: in duress a scan only moves the Duel's fix on its opponent, and a bullet's
     * outcome is only counted in the round's statistics. Deaths and the budget's events are
     * handled as usual; nothing else reaches a brain or the count of bullets in flight.
     */
    private void observeInDuress(BotEvent e, Tick tick) {
        if (e instanceof BotEvent.Scan) {
            BotEvent.Scan scan = (BotEvent.Scan) e;
            if (scan.sentry() || gate.isSentry(scan.name())) return;
            duelSeam.observeInDuress(scan, tick);
        }
        else if (e instanceof BotEvent.BulletHit) stats.shotsHit++;
        else if (e instanceof BotEvent.HitByBullet) stats.hitsTaken++;
        else if (e instanceof BotEvent.BulletHitBullet) stats.bulletsIntercepted++;
        else if (e instanceof BotEvent.SkippedTurn) onSkippedTurn(tick.in());
        else if (e instanceof BotEvent.TickTime) onTickTime((BotEvent.TickTime) e);
        else if (e instanceof BotEvent.RobotDeath) {
            robotDied(((BotEvent.RobotDeath) e).name());
            meleeSeam.observe(e, tick);
        }
    }

    /**
     * WEAVE-6: a role that orders a shot on a tick without the fire permission has faulted.
     * In Melee that is a melee fault (GATE-4); in the Duel the Guard covers the tick.
     */
    static void checkFirePermission(Tick tick, BotOrders.Builder orders) {
        if (tick.mayFire()) return;
        if (orders.build().firePower() > 0) {
            throw new IllegalStateException("WEAVE-6: " + tick.driving() + " fired without the permission");
        }
    }

    /**
     * WEAVE-3: who decides whether a shot may leave each tick. Until A5's fire lane the
     * permission is always given; tests use this to withhold it.
     *
     * @param permission whether a shot may leave, from the tick's input
     */
    public void firePermission(Predicate<BotInput> permission) {
        this.firePermission = permission;
    }

    /**
     * GATE-4: the melee subsystems threw. Records the fault, vetoes melee for the rest of the
     * round and hands the tick to the duel, from a clean slate, with a fresh set of orders.
     */
    private BotOrders.Builder meleeFailed(BotInput in, RuntimeException ex) {
        recordMeleeFault(in, ex);
        posture = Posture.DUEL;
        inMelee = false;
        focusing = in.others() >= 2;
        meleeSeam.stopDriving();
        duelSeam.reset();
        return BotOrders.builder().maxVelocity(Rules.MAX_VELOCITY)
            .turnRadarRight(Double.POSITIVE_INFINITY);
    }

    /** Counts and logs a melee fault and vetoes melee for the rest of the round (GATE-4). */
    private void recordMeleeFault(BotInput in, RuntimeException ex) {
        gate.meleeFailed();
        meleeFaults++;
        stats.faults++;
        telemetry.emit("FAULT," + round + "," + in.time() + ",melee," + clean(ex.toString()));
    }

    /**
     * A robot died: the duel's focus is re-chosen at the next scan, and the name is kept to
     * catch the melee aiming at a dead robot. The melee brain is told by its seam.
     */
    private void robotDied(String name) {
        focus.died(name);
        if (deadThisRound.size() < 64) deadThisRound.add(name);
    }

    /** Whether {@code name} died earlier this round. */
    boolean diedThisRound(String name) {
        return deadThisRound.contains(name);
    }

    /** The duel's focus among the living opponents, re-chosen when it dies (GATE-3, GATE-4). */
    String focusTarget(Point2D.Double me) {
        Map<String, Double> alive = new LinkedHashMap<>();
        for (EnemyInfo e : meleeSeam.melee.tracker.alive()) alive.put(e.name, e.distance(me));
        return focus.update(alive);
    }

    /**
     * WORLD-5: whether a bullet outcome is from a duel shot. Outcomes come one per bullet, so
     * the first ones after a melee ends belong to bullets fired in it and are skipped.
     */
    boolean duelBulletResolved() {
        if (meleeBulletsInFlight > 0) {
            meleeBulletsInFlight--;
            return false;
        }
        return !inMelee;
    }

    /** WORLD-5: a melee shot left; its outcome is the melee's, not the duel's. */
    void meleeShotFired() {
        meleeBulletsInFlight++;
    }

    /** MMEM-2: whether the next duel scan hands a melee's survivor over. */
    boolean handOffPending() {
        return handOffPending;
    }

    /**
     * MMEM-2: the melee's survivor, scanned by the duel for the first time, after the Duel
     * has switched to it and before it logs the scan. The Melee seam gives the baton and the
     * Duel takes it; an H record says what was handed over:
     * {@code H,round,tick,survivor,found1v1,foundMelee,wavesInjected}.
     */
    void handOff(Tick tick, BotEvent.Scan e) {
        handOffPending = false;
        Baton baton;
        try {
            baton = meleeSeam.give(tick);
        } catch (RuntimeException ex) {
            duel.batonFailed(tick.in().time(), ex);
            baton = null;
        }
        duelSeam.take(baton, tick);
        boolean foundMelee = meleeSeam.knows(e.name());
        telemetry.emit("H," + round + "," + tick.in().time() + "," + clean(e.name()) + ","
            + (duel.found1v1() ? 1 : 0) + "," + (foundMelee ? 1 : 0) + "," + duel.injected());
    }

    /** The current round, for records the seams write. */
    int round() {
        return round;
    }

    /** Opponents at the battle's start. */
    int enemiesTotal() {
        return enemiesTotal;
    }

    /** Writes a line record. */
    void emit(String record) {
        telemetry.emit(record);
    }

    /**
     * The subsystems that drove the last tick (GATE-1, GATE-2).
     *
     * @return melee or duel
     */
    public Posture posture() {
        return posture;
    }

    /**
     * Why melee is off for the rest of the round, if it is (GATE-3, GATE-4).
     *
     * @return the gate's veto, {@code NONE} while melee is allowed
     */
    public Veto veto() {
        return gate.veto();
    }

    /**
     * The battle's charter, fixed from its facts before the first tick (ROLE-1).
     *
     * @return duel, melee or team
     */
    public Charter charter() {
        return gate.charter();
    }

    /**
     * The facts the core was made with (ROLE-1).
     *
     * @return the field, the others at the start and the roster
     */
    public BattleFacts facts() {
        return facts;
    }

    /**
     * A1: the {@code ROLE} record, at a round's first completed tick and at each change of
     * role: {@code ROLE,round,tick,role,charter,enemies,sentries,veto}. Replay comparisons
     * set it aside, since it is the only telemetry A1 adds.
     */
    private void emitRole(BotInput in, RoleId role) {
        telemetry.emit("ROLE," + round + "," + in.time() + "," + role + "," + gate.charter() + ","
            + in.others() + "," + in.numSentries() + "," + gate.veto());
    }

    /**
     * The opponent the duel fights while several are alive, or null.
     *
     * @return the focus's name, or null when the duel is not focusing
     */
    public String duelFocus() {
        return focusing ? focus.target() : null;
    }

    /**
     * The melee brain, for tests of what it tracks.
     *
     * @return the melee controller this core drives
     */
    public MeleeController melee() {
        return meleeSeam.melee;
    }

    /**
     * The Duel's brain, for tests of what it holds.
     *
     * @return the duel controller this core drives
     */
    public DuelController duel() {
        return duel;
    }

    /**
     * Emits the round-end record and returns this round's statistics. {@code result} is
     * {@code win}, {@code loss} or {@code draw}; {@code faults} is the number of ticks the
     * {@link Guard} had to cover for this round.
     *
     * <p>Each role folds the round onto its own shelf first: the Duel into the opponent's
     * profile (MEM-2), with the memory library's battle totals copied into the record
     * (MEM-3 to MEM-5, RES-5), and Melee into the melee blocks (MMEM-1). A battle with several
     * opponents, or with sentries, gets an {@code M} record as well.</p>
     *
     * @param tick the tick the round ended on
     * @param result {@code win}, {@code loss} or {@code draw}
     * @param myEnergy our energy at the round's end
     * @param faults ticks the guard covered this round
     * @return this round's statistics, complete
     */
    public RoundStats roundEnded(long tick, String result, double myEnergy, int faults) {
        // The guard's count replaces any melee faults counted during the round; those are in
        // the M record's meleeFaults.
        stats.faults = faults;
        RoundResult ended = new RoundResult(tick, result);
        duelSeam.roundEnded(ended);
        meleeSeam.roundEnded(ended);
        telemetry.emit(stats.toRecord(round, tick, result, myEnergy, duel.lastEnemyEnergy()));
        if (enemiesTotal >= 2 || gate.sentriesSeen()) telemetry.emit(meleeRecord(tick));
        return stats;
    }

    /**
     * The melee extension's round record, for battles with several opponents or sentries:
     * {@code M,round,tick,meleeTicks,duelTicks,focusTicks,veto,meleeFaults,maxScanGap,
     * ghostTicks,sentryHits,sweepGap,ghostsDropped,wavesSent,wavesResolved,virtualHits,
     * memFailures}; the
     * wave counts are the round's targeting waves (MGUN-4) and how many the field gun's aim
     * would have hit. The veto is {@code -}, {@code sentry} or {@code fault}; sentryHits counts
     * our bullets that hit a sentry. M5 appends {@code memFailures}, the battle's melee memory
     * failures so far (RES-5). Fields are only ever appended.
     */
    String meleeRecord(long tick) {
        return "M," + round + "," + tick + "," + meleeTicks + "," + duelTicks + "," + focusTicks
            + "," + (gate.veto() == Veto.NONE ? "-" : gate.veto().name().toLowerCase(Locale.ROOT))
            + "," + meleeFaults + "," + meleeSeam.maxScanGap + "," + meleeSeam.ghostTicks + "," + sentryHits
            + "," + meleeSeam.sweepGap + "," + meleeSeam.roundCounts()
            + "," + meleeMemoryFailures();
    }

    /** Melee memory failures this battle, the survivors' 1v1 reads included (RES-5). */
    private int meleeMemoryFailures() {
        return meleeSeam.memoryFailures() + duel.survivorFailures();
    }

    /**
     * MEM-3: writes the profile to the store in full, seeds included. The adapter calls
     * this when the battle ends; round-end checkpoints while the battle continues go
     * through {@link #checkpoint} instead (TIME-4), which never writes seeds fresh
     * (MEM-10). Does nothing when the battle keeps no memory. In a melee battle it writes
     * the melee blocks instead (MMEM-1); the adapter only checkpoints while Hadur is
     * alive, so a round Hadur died in is written at the next checkpoint or at the battle's
     * end.
     *
     * <p>The library does the atomic write (RES-3) and any eviction (MEM-5) and never
     * throws; anything but a clean write is logged as a {@code MEM} record.</p>
     *
     * @param tick the tick of the save, for the record
     */
    public void saveProfile(long tick) {
        meleeSeam.battleEnded(tick);
        duelSeam.battleEnded(tick);
    }

    /**
     * TIME-4, tightened by MEM-10: at most one round-end checkpoint a battle, so together
     * with the save at the battle's end ({@link #battleEnded}) memory does at most two
     * writes a battle (seed-worthy profiles' larger writes excepted, MEM-8). It always
     * writes the profile's statistics only ({@code saveStatsOnly}), carrying over whatever
     * seeds are already on disk (TIME-4); the seeds themselves only ever get written fresh
     * by the final save.
     *
     * @param tick the tick of the save, for the record
     */
    public void checkpoint(long tick) {
        if (checkpointed) return;
        checkpointed = true;
        meleeSeam.checkpoint(tick);
        duelSeam.checkpoint(tick);
    }

    /**
     * Gets opponent memory ready before the battle's first tick (reads the battle clock,
     * loads the codec), so the first scan's load is quick. Does nothing without memory.
     */
    public void prepareMemory() {
        duelSeam.prepare();
        meleeSeam.prepare();
    }

    /**
     * The battle is over: the last save (MEM-3), and in a melee battle with a store a
     * closing count of melee memory failures, which the last M record cannot carry.
     *
     * @param tick the battle's last tick, for the record
     */
    public void battleEnded(long tick) {
        saveProfile(tick);
        // The last round's M record went out before its checkpoint save: close the count here.
        if (meleeSeam.hasShelf()) {
            telemetry.emit("MEM," + round + "," + tick + ",melee-battle-failures," + meleeMemoryFailures());
        }
    }

    /**
     * RES-8: writes a small, plain-text battle-health record (at most 64 bytes, overwritten
     * every battle) so a client-side reproduction of a live-rumble problem is
     * self-describing even without the console log. Does nothing without a store, and
     * never throws: a health record is a diagnostic, not something a battle can fail over.
     *
     * @param rounds rounds fought this battle
     * @param roundsSurvived rounds this battle that were not a loss
     * @param faults ticks the guard covered this battle, summed over every round
     * @param skippedTurns engine-skipped-turn events this battle
     */
    public void writeBattleHealth(int rounds, int roundsSurvived, int faults, int skippedTurns) {
        if (store == null) return;
        int memoryFailures = meleeMemoryFailures() + duel.memoryFailures();
        String record = "HEALTH," + rounds + "," + roundsSurvived + "," + faults + ","
            + skippedTurns + "," + memoryFailures + "," + budget.learnedAllowanceNanos();
        try {
            // RES-6: no java.nio (Charset included), so the ASCII record is encoded by hand.
            byte[] bytes = new byte[record.length()];
            for (int i = 0; i < record.length(); i++) bytes[i] = (byte) record.charAt(i);
            store.write("health.hc", bytes);
        } catch (RuntimeException e) {
            // Best effort, as the class doc says; nothing reads this record but a human.
        }
    }

    /**
     * The profile of this battle's opponent, or null before the first scan or without memory.
     *
     * @return the profile being folded into, including the rounds folded so far
     */
    public hadur2.core.memory.OpponentProfile profile() {
        return duel.profile();
    }

    /**
     * The battle's opening (S4); {@link Opening#STRANGER} before the first scan or without memory.
     *
     * @return what the opening book chose
     */
    public Opening opening() {
        return duel.opening();
    }

    /**
     * The surf's danger views whose thresholds are met now (ADAPT-2, DIAL-1).
     *
     * @return the names of the views switched on
     */
    public java.util.List<String> dangerViewsOn() {
        return duel.dangerViewsOn();
    }

    /**
     * The gun seed's weight now (ADAPT-3, RES-4), or NaN without a profile.
     *
     * @return the weight of each seeded gun sample relative to a live one (1)
     */
    public double gunSeedWeight() {
        return duel.gunSeedWeight();
    }

    /**
     * The surf seed's weight now, or NaN without a profile (ADAPT-3, RES-4).
     *
     * @return the weight of each seeded surf sample relative to a live one (1)
     */
    public double surfSeedWeight() {
        return duel.surfSeedWeight();
    }

    /**
     * Whether seeds are still being replayed into the views.
     *
     * @return true while the seed loader has samples left
     */
    public boolean seedsLoading() {
        return duel.seedsLoading();
    }

    /**
     * Seed samples replayed into the views so far this battle (ADAPT-3).
     *
     * @return the count, gun and surf together
     */
    public int seedsReplayed() {
        return duel.seedsReplayed();
    }

    /** Makes free text safe inside a CSV record: commas become ';' and line breaks spaces. */
    static String clean(String s) {
        return s.replace(',', ';').replace('\n', ' ');
    }

    /**
     * TIME-1: the adapter's measure of the previous tick. A tick over 70% of the allowance
     * raises the level for the next tick only (the threshold lives in {@link TickBudget}).
     */
    private void onTickTime(BotEvent.TickTime e) {
        int before = budget.level();
        budget.tickTook(e.usedNanos(), e.allowanceNanos());
        stats.computationLevel = budget.maxLevel();
        stats.slowTicks = budget.slowTicks();
        if (budget.level() != before) emitBudget();
    }

    /** P record for a change of computation level (TIME-1, TIME-2). */
    private void emitBudget() {
        telemetry.emit(String.format(Locale.ROOT, "P,%d,%d,%s,%s,%s,%s", round, lastTickTime, "budget",
            String.format(Locale.ROOT, "%.4f", (double) budget.level()), "-", "level-" + budget.level()));
    }

    /** TIME-2: the engine skipped one of our turns because a tick ran over its time. */
    private void onSkippedTurn(BotInput in) {
        stats.skippedTurns++;
        // TIME-2: one level down for the rest of the round.
        budget.skippedTurn();
        stats.computationLevel = budget.maxLevel();
        emitBudget();
        telemetry.emit("WARNING: Turn skipped at " + in.time());
    }

    /**
     * S5: the distance the surf is steering to now.
     *
     * @return the target distance in px (DIST-1, END-1)
     */
    public double targetDistance() {
        return duel.targetDistance();
    }

    /**
     * S6: the tick budget's computation level for the next tick (TIME-1, TIME-2).
     *
     * @return 0 (everything) to 3 (least work)
     */
    public int computationLevel() {
        return budget.level();
    }

    /**
     * S6: the movement flavour reached (MOVE-2).
     *
     * @return the last step added, {@code BASE} before any
     */
    public MoveFlavour.Step moveFlavour() {
        return duel.moveFlavour();
    }

    /**
     * S6: how the surf picks its spot for the wave being surfed.
     *
     * @return the three options, or go-to surfing (MOVE-2)
     */
    public SurfMover.Mode surfMode() {
        return duel.surfMode();
    }

    /**
     * S6: enemy firing waves one of our bullets has shadowed this round (MOVE-1).
     *
     * @return the number of shadowed waves
     */
    public int shadowedWaves() {
        return duel.shadowedWaves();
    }

    /**
     * MOVE-1: how many times a wave's shadows were computed this round.
     *
     * @return the number of shadow computations, a cost measure
     */
    public int shadowComputations() {
        return duel.shadowComputations();
    }

    /**
     * S5: the endgame state as of the last duel tick.
     *
     * @return none, finishing (END-1) or ramming (END-2)
     */
    public Endgame.State endgame() {
        return duel.endgame();
    }

    /**
     * S5: our rolling hit rate, over our last duel bullets (DIST-1, POW-2).
     *
     * @return the rate with its margin of error
     */
    public Estimate ourRollingHitRate() {
        return duel.ourRollingHitRate();
    }

    /**
     * S5: their rolling hit rate, over their last firing waves to break on us (DIST-1, POW-2).
     *
     * @return the rate with its margin of error
     */
    public Estimate theirRollingHitRate() {
        return duel.theirRollingHitRate();
    }
}
