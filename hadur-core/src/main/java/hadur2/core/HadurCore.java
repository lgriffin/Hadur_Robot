package hadur2.core;

import hadur2.core.adapt.Opening;
import hadur2.core.adapt.OpeningBook;
import hadur2.core.adapt.SeedLoader;
import hadur2.core.adapt.SeedTrust;
import hadur2.core.gun.GunController;
import hadur2.core.ledger.EnergyLedger;
import hadur2.core.melee.EnemyInfo;
import hadur2.core.melee.MeleeController;
import hadur2.core.melee.MeleeRadar;
import hadur2.core.memory.Estimate;
import hadur2.core.memory.LineageKey;
import hadur2.core.memory.OpponentProfile;
import hadur2.core.memory.ProfileFolder;
import hadur2.core.memory.ProfileLibrary;
import hadur2.core.memory.Tiers;
import hadur2.core.model.*;
import hadur2.core.move.MoveController;
import hadur2.core.move.OurBullet;
import hadur2.core.move.SurfMover;
import hadur2.core.physics.*;
import hadur2.core.port.ProfileStore;
import hadur2.core.port.Telemetry;
import hadur2.core.policy.DistancePolicy;
import hadur2.core.policy.Endgame;
import hadur2.core.policy.EnemyGunHeat;
import hadur2.core.policy.HitWindow;
import hadur2.core.policy.MoveFlavour;
import hadur2.core.policy.PowerPolicy;
import hadur2.core.policy.TickBudget;
import hadur2.core.posture.DuelFocus;
import hadur2.core.posture.Posture;
import hadur2.core.posture.PostureGate;
import hadur2.core.posture.SentryFence;
import hadur2.core.shield.AimJitter;
import hadur2.core.shield.ShieldDetector;
import java.awt.geom.Point2D;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * Hadur's brain. One instance lives for a whole battle; {@link #tick} turns each
 * {@link BotInput} into {@link BotOrders}. It never touches the Robocode API (CORE-1) and
 * holds no randomness, threads, reflection or I/O (RES-6), so the same inputs always
 * give the same orders (CORE-2).
 *
 * <p>Per tick it handles the tick's events first, then runs the main loop body, the same
 * order in which Robocode runs event handlers and then {@code run()}.</p>
 *
 * <p>The {@link PostureGate} picks the subsystems each tick, failing closed to the duel: the
 * {@link MeleeController} drives while two or more opponents are alive, no sentry is on the
 * field or has been scanned this round, and melee has not thrown this round (GATE-1 to
 * GATE-4). Once one opponent is left, the duel machinery below takes over from a clean slate
 * (MELEE-2). When the duel drives with several opponents alive it fights one, the
 * {@link DuelFocus}, and ignores the rest; with sentries about, the {@link SentryFence} keeps
 * its movement out of their border. Sentries are never tracked, targeted or profiled (GATE-5).
 * The melee extension adds this routing and leaves the duel's packages untouched.</p>
 *
 * <p>In a duel with a {@link ProfileStore}, the first scan loads the opponent's profile
 * (MEM-1), each round's observations are folded into it when the round ends (MEM-2), and
 * {@link #saveProfile} persists it (MEM-3). Melee battles neither load nor save profiles.</p>
 *
 * <p>The loaded profile also decides the battle's opening (S4): the {@link OpeningBook}
 * reads its tiers once and picks the first gun (ADAPT-1) and the surf's prior (ADAPT-2),
 * and its seeds are replayed into the KNN views at half a live sample's weight over the
 * next ticks (ADAPT-3). Each wave then checks the live estimates against the profile's,
 * and a seed the opponent no longer matches fades out (RES-4). A stranger, or a profile
 * too thin to trust, opens exactly as 1.20 did (DIAL-1).</p>
 *
 * <p>S5 makes it aggressive. The {@link DistancePolicy} starts at the opening's distance
 * and moves a step a wave on the gap between the rolling hit rates (DIST-1); the
 * {@link PowerPolicy} fires full power against a gun that cannot hit us (POW-1, POW-2); and
 * the {@link Endgame} closes in to finish a weak enemy (END-1) and rams a disabled one
 * (END-2).</p>
 *
 * <p>S6 makes it harder to hit and keeps it inside its turn: each of our bullets in flight
 * shadows part of the enemy's waves (MOVE-1), the movement changes flavour when their gun
 * beats its profile (MOVE-2), and the {@link TickBudget} sheds work after a slow tick or a
 * skipped turn (TIME-1, TIME-2). Against a bullet shielder the {@link ShieldDetector} and
 * {@link AimJitter} move each shot's aim off the predictable line (SHIELD-1, SHIELD-2).</p>
 *
 * <p>One {@link #tick}, in order:</p>
 * <ol>
 * <li>Sentry scans are reported to the gate, which then picks this tick's {@link Posture}
 *     from the opponent and sentry counts (GATE-1 to GATE-3). If melee has just ended, the
 *     duel's tracking is reset and full speed restored before any scan is handled
 *     (MELEE-2).</li>
 * <li>The tick's events, in the order the adapter queued them (the engine's own). Every
 *     non-sentry scan updates the melee tracker; in the duel posture the scan of the duel's
 *     opponent also logs both robots' states, creates a gun wave and a movement wave, and
 *     runs the energy ledger (WAVE-1, WAVE-2). Bullet and collision events feed the ledger,
 *     the hit windows, the shield detector and the shadows; {@code TickTime} and
 *     {@code SkippedTurn} feed the tick budget.</li>
 * <li>In a duel, a few seed samples are replayed into the KNN views (ADAPT-3).</li>
 * <li>The driving posture's main body. Melee: fire last tick's aim if the gun got there,
 *     then ask the {@link MeleeController} for radar, destination and aim. Duel: fire and
 *     aim, break the movement's waves, check the seeds (RES-4), step the distance and
 *     endgame policies, update the shadows, surf (or ram), and sweep the radar if the enemy
 *     was lost (RADAR-1). Before the duel's first scan it only spins the radar.</li>
 * <li>With sentries on the field, the duel's orders pass through the {@link SentryFence}
 *     (GATE-3).</li>
 * </ol>
 *
 * <p>Units and conventions follow Robocode: positions in px with x growing east and y north,
 * angles in radians with headings absolute (0 = north, clockwise) and bearings relative to
 * our heading, time in ticks, energy and bullet power in the engine's units. A wave's guess
 * factor is in [-1, 1], the fraction of the maximum escape angle on the side the target was
 * moving. The core writes line records to {@link Telemetry}: {@code V} (once, when the core is made),
 * {@code B} (battle and opponent, at the first duel scan), {@code P} (a policy decision),
 * {@code EW} (an enemy wave the ledger found), {@code MEM} (a memory failure),
 * {@code FAULT}, {@code R} (round end, see {@link RoundStats}) and {@code M} (the melee
 * extension's round end).</p>
 *
 * <p>Nothing grows without bound (RES-2): the subsystems cap their own logs, trees and
 * windows, and the only collection held here, the round's dead robots, stops at 64
 * names.</p>
 */
public final class HadurCore {

    /** The field's walls, shared by every subsystem that predicts movement. */
    private final BattleField battleField;
    /** Robocode's movement rules, run forward for precise prediction. */
    private final MovementPredictor predictor;
    /** The duel's guns: the main KNN gun, the anti-surfer gun and the virtual guns that rate them. */
    private final GunController gunController;
    /** The duel's enemy waves, their danger views, and our bullets' shadows on them (MOVE-1). */
    private final MoveController moveController;
    /** Turns the enemy waves' danger into movement orders, or rams (END-2). */
    private final SurfMover surfMover;
    /** Our gun waves, one per duel scan, broken as the enemy crosses them to teach the gun. */
    private final WaveManager gunWaveManager;
    /** Our own states at each duel scan, for the movement waves' features. */
    private final RobotStateLog myStateLog;
    /** The duel opponent's states at each scan, for the gun waves' features. */
    private final RobotStateLog enemyStateLog;
    /** Explains the enemy's energy changes so only bullets become waves (WAVE-1, WAVE-2). */
    private final EnergyLedger ledger;
    /** Where the line records go; the core does no I/O itself (RES-6). */
    private final Telemetry telemetry;
    /** The melee brain; it sees every non-sentry scan and death, whichever posture drives. */
    private final MeleeController melee;
    /** Watches how our duel bullets end, for a bullet shielder (SHIELD-1). */
    private final ShieldDetector shieldDetector = new ShieldDetector();
    /** The deterministic anti-shield aim offset (SHIELD-2). */
    private final AimJitter aimJitter = new AimJitter();
    /** Whether the aim the gun is turning to carries the anti-shield offset (SHIELD-2). */
    private boolean aimCarriesJitter;
    /** Our melee bullets not yet resolved; their outcomes are no evidence about a duel (SHIELD-1). */
    private int meleeBulletsInFlight;
    /** Null when the battle keeps no memory (no store, or a melee battle). */
    private final ProfileLibrary library;
    /** The battle field's width in px. */
    private final double fieldWidth;
    /** The battle field's height in px. */
    private final double fieldHeight;
    /** This battle's round observations for the profile (MEM-2); null without memory or before the first scan. */
    private ProfileFolder folder;
    /** Whether the store held a profile for this opponent's lineage (MEM-1). */
    private boolean profileFound;
    /** The exact name of the battle's first duel opponent, the one the profile is about. */
    private String opponentName;
    /** The distance to the duel opponent at its last scan, in px. */
    private double lastEnemyDistance;
    /** What the opening book chose (S4); {@link Opening#STRANGER} until a profile is read. */
    private Opening opening = Opening.STRANGER;
    /** Replays the profile's seeds a few a tick (ADAPT-3); null when there is nothing left to replay. */
    private SeedLoader seedLoader;
    /** Seed samples replayed so far this battle. */
    private int seedsReplayed;
    /** RES-4: null until a profile is opened. */
    private SeedTrust gunSeedTrust;
    /** RES-4: the surf seed's trust; null until a profile is opened. */
    private SeedTrust surfSeedTrust;
    /** Waves already checked against the profile: our virtual main-gun waves, their firing waves. */
    private double gunWavesChecked;
    /** Enemy firing waves already checked against the profile's hit rate (RES-4). */
    private int surfWavesChecked;
    /** Waves on which a seed's weight was lowered, battle total (RES-5). */
    private int seedDecays;
    /**
     * S5: our duel bullets' outcomes and their waves' outcomes, rolling, across rounds while
     * the duel opponent stays the same one.
     */
    private final HitWindow ourWindow = new HitWindow();
    /** S5: the outcomes of their firing waves as they break on us, rolling (DIST-1, POW-2). */
    private final HitWindow theirWindow = new HitWindow();
    /** S5: the distance controller (DIST-1, END-1); a stranger starts at 650 px. */
    private DistancePolicy distance = new DistancePolicy(OpeningBook.STRANGER_DISTANCE);
    /** Null until the first duel tick tells the cooling rate. */
    private EnemyGunHeat enemyGunHeat;
    /** S5: the endgame state as of the last duel tick (END-1, END-2). */
    private Endgame.State endgame = Endgame.State.NONE;
    /** S5: why the last scan's bullet power was chosen, so a P record marks each change (POW-1, POW-2). */
    private PowerPolicy.Reason powerReason = PowerPolicy.Reason.GUN;
    /** The robot the windows and the distance controller are about; null before a duel scan. */
    private String duelOpponent;
    /** S6: the tick budget (TIME-1, TIME-2) and the movement's flavour (MOVE-2). */
    private final TickBudget budget = new TickBudget();
    /** S6: the movement flavour and the evidence for the next change (MOVE-2). */
    private MoveFlavour flavour = MoveFlavour.stranger();
    /** The tick being processed, for records written from event handlers. */
    private long lastTickTime;

    /** The current round, from 0. */
    private int round;
    /** This round's counters; replaced at each round's start. */
    private RoundStats stats = new RoundStats();
    /**
     * The gun wave made at the latest duel scan: where the enemy was, the power the gun would
     * fire, and the features the gun aims from. Null until the duel has scanned its opponent,
     * which is what tells the duel's main body it has something to work on.
     */
    private Wave lastGunWave;
    /** Where the duel opponent was at its last scan, in field px. */
    private Point2D.Double lastEnemyLocation;
    /** The duel opponent's energy at its last scan. */
    private double lastEnemyEnergy;
    /**
     * The sign of the enemy's and our last non-zero velocity: which way along its heading
     * each robot was going, kept through a stop so a guess factor's sign stays meaningful.
     */
    private int enemyVelocitySign;
    private int myVelocitySign;
    /** The enemy's and our velocity at the previous duel scan, in px/tick, for acceleration. */
    private double prevEnemyVelocity;
    private double prevMyVelocity;
    /**
     * Scans since the enemy's, and our, velocity last changed by more than 0.5 px/tick: a
     * KNN feature that tells steady movement from a robot that keeps changing speed.
     */
    private long enemyVchangeTime;
    private long myVchangeTime;
    /**
     * The power of the shot the gun is turning to aim, taken from the previous tick's gun
     * wave. The aim depends on bullet speed, so the shot fired is the one that was aimed.
     */
    private double aimedBulletPower;
    /** The tick of our last real duel shot, a gun-wave feature. */
    private long lastRealBulletFireTime;
    /** The tick of the duel opponent's last scan (RADAR-1 reads its age). */
    private long lastScanTime;
    /** The duel opponent's absolute bearing at its last scan, radians. */
    private double lastEnemyAbsBearing;
    /** Whether the battle's first duel scan has been announced (MEM-1); never reset. */
    private boolean announced;
    /** Whether melee drove the previous tick; its fall to false is MELEE-2's moment. */
    private boolean inMelee;
    /** What the melee brain asked for last tick; its fire power goes out this tick if the gun is there. */
    private MeleeController.Command lastMeleeCommand;

    /** M1: the posture gate, the duel's focus among several opponents, and the sentry fence. */
    private final PostureGate gate = new PostureGate();
    private final DuelFocus focus = new DuelFocus();
    private final SentryFence fence;
    /** Opponents at the battle's start; 1 is a duel battle, the only kind with memory. */
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
    /** The first exception a melee event handler threw this tick (GATE-4). */
    private RuntimeException meleeEventFault;
    /** Per-round counters for the M record. */
    private int meleeTicks, duelTicks, focusTicks, meleeFaults, ghostTicks, sentryHits, maxScanGap,
        sweepGap;
    /** The melee tracker's battle count of ghosts at the round's start, so the M record shows this round's. */
    private long ghostsAtRoundStart;

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
        this.battleField = new BattleField(fieldWidth, fieldHeight);
        this.predictor = new MovementPredictor(battleField);
        this.gunController = new GunController(battleField, enemiesTotal);
        this.moveController = new MoveController(battleField, predictor);
        this.surfMover = new SurfMover(battleField, predictor);
        this.gunWaveManager = new WaveManager();
        this.myStateLog = new RobotStateLog();
        this.enemyStateLog = new RobotStateLog();
        this.ledger = new EnergyLedger(fieldWidth, fieldHeight);
        this.telemetry = telemetry;
        this.melee = melee;
        this.fence = new SentryFence(fieldWidth, fieldHeight);
        this.enemiesTotal = enemiesTotal;
        // Opponent memory is for duels: a battle that starts with several opponents neither
        // loads nor saves profiles (MEM-1 to MEM-5 read "duel"; see docs/requirements.md).
        this.library = store != null && enemiesTotal == 1 ? new ProfileLibrary(store) : null;
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
        // The V record opens every battle's log.
        telemetry.emit("V,1");
    }

    /**
     * Starts a round. Transient state (waves, logs, the melee tracker, the gate's veto, the
     * tick budget's round level) is cleared; what was learned (KNN views, virtual-gun
     * ratings, the profile, the hit windows, the distance controller, the shield verdict)
     * carries on, because the core lives for the whole battle.
     *
     * @param round the round number, from 0
     */
    public void newRound(int round) {
        this.round = round;
        this.stats = new RoundStats();
        gunController.initRound();
        moveController.initRound();
        surfMover.initRound();
        gunWaveManager.initRound();
        resetRoundState();
        if (enemyGunHeat != null) enemyGunHeat.newRound();
        budget.newRound();
        gate.newRound();
        meleeTicks = duelTicks = focusTicks = meleeFaults = ghostTicks = sentryHits = maxScanGap = sweepGap = 0;
        ghostsAtRoundStart = melee.ghostsDropped();
        deadThisRound.clear();
    }

    /**
     * Forgets this round's transient state (waves, logs, the last scan) but keeps
     * everything learned. Used after a fault, so a bad state can't fault every tick.
     */
    public void recover() {
        gunController.initRound();
        moveController.initRound();
        surfMover.initRound();
        gunWaveManager.initRound();
        resetRoundState();
    }

    /** The transient state shared by a new round and a recovery. */
    private void resetRoundState() {
        melee.newRound();
        meleeBulletsInFlight = 0;
        aimCarriesJitter = false;
        inMelee = false;
        focusing = false;
        focus.clear();
        lastMeleeCommand = null;
        resetDuelTracking();
    }

    /** Forgets the duel's view of the enemy, at a round's start and when a melee ends. */
    private void resetDuelTracking() {
        ledger.newRound();
        myStateLog.clear();
        enemyStateLog.clear();
        lastGunWave = null;
        lastEnemyLocation = null;
        enemyVelocitySign = 1;
        myVelocitySign = 1;
        prevEnemyVelocity = 0;
        prevMyVelocity = 0;
        enemyVchangeTime = 0;
        myVchangeTime = 0;
        // The power the gun aims for before its first wave says otherwise.
        aimedBulletPower = 1.9;
        lastRealBulletFireTime = 0;
        lastScanTime = 0;
        lastEnemyAbsBearing = 0;
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
     * Turns one tick's input into orders: events first, then the driving posture's main
     * body (see the class comment for the order). May throw; the {@link Guard} covers it
     * (RES-1).
     *
     * @param in the robot's state and the events that arrived this tick
     * @return the tick's orders; fields left NaN keep the previous setting
     */
    public BotOrders tick(BotInput in) {
        BotOrders.Builder orders = BotOrders.builder();
        lastTickTime = in.time();
        // GATE-3: a sentry scanned this tick vetoes melee before this tick's orders.
        for (BotEvent e : in.events()) {
            if (e instanceof BotEvent.Scan && ((BotEvent.Scan) e).sentry()) {
                gate.sentryScanned(((BotEvent.Scan) e).name());
            }
        }
        // GATE-1, GATE-2: melee only while the gate allows it, the duel otherwise.
        posture = gate.evaluate(in.others(), in.numSentries());
        boolean melee = posture == Posture.MELEE;
        if (melee) measureScanGap(in.time(), in.others());
        // Checked before this tick's scans are handled, so the survivor's scan on this tick
        // already goes to a clean duel.
        if (inMelee && !melee) {
            // MELEE-2: the survivor was never tracked as a duel opponent; start fresh.
            resetDuelTracking();
            orders.maxVelocity(Rules.MAX_VELOCITY);
        }
        inMelee = melee;
        // A duel with several opponents alive fights one of them (GATE-3, GATE-4); the focus
        // is dropped once that stops, so the next focusing starts from the closest robot.
        boolean wasFocusing = focusing;
        focusing = !melee && in.others() >= 2;
        if (wasFocusing && !focusing) focus.clear();

        // The events in the order the adapter queued them, which is the engine's own. HitWall
        // needs no handling: the ledger infers the enemy's wall hits, and our own wall damage
        // does not change what the enemy's energy says.
        for (BotEvent e : in.events()) {
            if (e instanceof BotEvent.Scan) {
                BotEvent.Scan scan = (BotEvent.Scan) e;
                // GATE-5: a sentry is never tracked, targeted or profiled.
                if (!scan.sentry() && !gate.isSentry(scan.name())) onScan(in, scan, orders);
            }
            else if (e instanceof BotEvent.HitByBullet) onHitByBullet(in, (BotEvent.HitByBullet) e);
            else if (e instanceof BotEvent.BulletHitBullet) onBulletHitBullet(in, (BotEvent.BulletHitBullet) e);
            else if (e instanceof BotEvent.BulletHit) onBulletHit((BotEvent.BulletHit) e);
            else if (e instanceof BotEvent.BulletMissed) onBulletMissed((BotEvent.BulletMissed) e);
            else if (e instanceof BotEvent.HitRobot) {
                // WAVE-1: a collision costs the enemy energy too; only the duel's enemy counts.
                if (!foreign(((BotEvent.HitRobot) e).name())) ledger.robotsCollided();
            }
            else if (e instanceof BotEvent.RobotDeath) onRobotDeath(((BotEvent.RobotDeath) e).name());
            else if (e instanceof BotEvent.SkippedTurn) onSkippedTurn(in);
            else if (e instanceof BotEvent.TickTime) onTickTime((BotEvent.TickTime) e);
        }

        // ADAPT-3: a few seed samples a tick, so no one tick pays for the whole seed.
        if (seedLoader != null && !melee) {
            seedsReplayed += seedLoader.step();
            if (seedLoader.done()) seedLoader = null;
        }

        RuntimeException eventFault = meleeEventFault;
        meleeEventFault = null;
        if (eventFault != null) {
            // GATE-4: the melee brain threw handling this tick's events. Fail closed now,
            // whichever subsystems were about to drive.
            if (melee) orders = meleeFailed(in, eventFault);
            else recordMeleeFault(in, eventFault);
            melee = false;
        }
        if (melee) {
            try {
                meleeTick(in, orders);
            } catch (RuntimeException ex) {
                // GATE-4: fail closed. The duel takes this tick and the rest of the round.
                orders = meleeFailed(in, ex);
            }
        } else if (lastGunWave != null) {
            // The duel's main body, once its opponent has been scanned. TIME-1, TIME-2: the
            // computation level sets how much of it runs (k shared out, virtual guns, waves
            // surfed and go-to surfing).
            int level = budget.level();
            gunController.setKShare(TickBudget.kShare(level));
            moveController.setKShare(TickBudget.kShare(level));
            double gunHeat = aimAndFire(in, orders, TickBudget.virtualGuns(level));
            // Break the enemy waves that have passed us, before the policies read their outcomes.
            moveController.checkWaves(in.time(), in.location());
            checkSurfSeed(in.time());
            checkDistance(in, gunHeat);
            moveController.updateShadows(in.time());
            if (endgame == Endgame.State.RAM) {
                surfMover.ram(orders, currentState(in), lastEnemyLocation);
            } else {
                surfMover.move(orders, currentState(in), moveController, lastEnemyLocation,
                    TickBudget.wavesToSurf(level), TickBudget.goToAllowed(level));
            }
            // RADAR-1: no scan this tick or the one before, so the lock has lost it.
            if (in.time() - lastScanTime > 1) reacquire(in, orders);
        } else {
            // Nothing scanned yet (or duel tracking just reset): spin the radar to find it.
            orders.turnRadarRight(Double.POSITIVE_INFINITY);
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
        return built;
    }

    /**
     * Runs a melee event handler, keeping the first exception for the tick to fail closed on
     * (GATE-4) instead of letting it past the posture gate.
     */
    private void meleeEvent(Runnable handler) {
        try {
            handler.run();
        } catch (RuntimeException ex) {
            if (meleeEventFault == null) meleeEventFault = ex;
        }
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
        lastMeleeCommand = null;
        resetDuelTracking();
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
     * Whether an event naming {@code name} is outside the duel: a sentry, or, while the duel
     * fights one of several opponents, anyone but that one.
     */
    private boolean foreign(String name) {
        if (gate.isSentry(name)) return true;
        return focusing && !name.equals(focus.target());
    }

    /**
     * A robot died: the melee brain drops it at once (MSENSE-1), the duel's focus is re-chosen
     * at the next scan, and the name is kept to catch the melee aiming at a dead robot.
     */
    private void onRobotDeath(String name) {
        meleeEvent(() -> melee.onRobotDeath(name));
        focus.died(name);
        if (deadThisRound.size() < 64) deadThisRound.add(name);
    }

    /**
     * M2's gate: the longest any living opponent has gone unscanned in melee this round, and
     * the longest while four or more were alive, the spinning radar's case (MRADAR-1). An
     * opponent never scanned (last scan tick below 0) is skipped.
     */
    private void measureScanGap(long now, int others) {
        for (EnemyInfo e : melee.tracker.alive()) {
            if (e.lastScanTime < 0) continue;
            int gap = (int) (now - e.lastScanTime);
            maxScanGap = Math.max(maxScanGap, gap);
            if (others >= MeleeRadar.SPIN_OTHERS) sweepGap = Math.max(sweepGap, gap);
        }
    }

    /** The duel's focus among the living opponents, re-chosen when it dies (GATE-3, GATE-4). */
    private String focusTarget(Point2D.Double me) {
        Map<String, Double> alive = new LinkedHashMap<>();
        for (EnemyInfo e : melee.tracker.alive()) alive.put(e.name, e.distance(me));
        return focus.update(alive);
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
    public PostureGate.Veto veto() {
        return gate.veto();
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
        return melee;
    }

    /**
     * MELEE-5..8, MRADAR, MMOVE: one tick of melee. The shot aimed last tick goes out first if the gun got
     * there, as in 1.x; then the melee brain picks the radar sweep, destination and aim.
     *
     * <p>Target choice, aim, power and the decision to hold fire are all the melee brain's
     * (it sets a fire power of 0 to hold); this method only carries them out. A shot counts
     * toward {@link RoundStats#shotsFired} and toward the melee bullets whose outcomes the
     * duel must not read as its own (SHIELD-1, the hit windows).</p>
     */
    private void meleeTick(BotInput in, BotOrders.Builder orders) {
        MeleeController.Command previous = lastMeleeCommand;
        // Fire only with a cool gun that has finished turning to last tick's aim (the engine
        // reports the remaining turn in radians; 0.05 degrees is the duel gun's tolerance
        // too), and only with energy to spare, since a shot that uses our last energy
        // disables us.
        if (previous != null && previous.firePower > 0 && in.gunHeat() == 0
                && Math.abs(Math.toDegrees(in.gunTurnRemaining())) < 0.05
                && in.energy() > previous.firePower) {
            orders.fire(previous.firePower);
            stats.shotsFired++;
            meleeBulletsInFlight++;
        }

        MeleeController.Command c = melee.tick(new MeleeController.Situation(
            in.location(), in.gunHeading(), in.radarHeading(), in.energy(), in.time(),
            in.others(), in.heading(), in.velocity()));
        // M2's check: a tick aimed at a robot that has died is a ghost tick.
        if (c.target != null && deadThisRound.contains(c.target)) ghostTicks++;
        orders.turnRadarRight(c.radarTurn);
        orders.turnGunRight(c.gunTurn);
        if (c.destination != null) goTo(in, c.destination, orders);
        lastMeleeCommand = c;
    }

    /**
     * Drives toward {@code destination}, backwards if that is the shorter turn. A robot can
     * drive either way at the same speed, so it never needs to turn more than 90 degrees.
     * This is where melee lowers the speed limit that MELEE-2 lifts on hand-over.
     */
    private static void goTo(BotInput in, Point2D.Double destination, BotOrders.Builder orders) {
        Point2D.Double me = in.location();
        double turn = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(me, destination) - in.heading());
        double distance = me.distance(destination);
        if (Math.abs(turn) > Math.PI / 2) {
            turn = Angles.normalRelativeAngle(turn + Math.PI);
            distance = -distance;
        }
        orders.turnRight(turn);
        // Slow down for sharp turns so the robot doesn't swing wide.
        // (Robocode turns a body slower the faster it goes: 10 - 0.75 * |velocity| degrees a tick.)
        orders.maxVelocity(Math.abs(turn) > Math.PI / 4 ? 4.0 : Rules.MAX_VELOCITY);
        orders.ahead(distance);
    }

    /**
     * Emits the round-end record and returns this round's statistics. {@code result} is
     * {@code win}, {@code loss} or {@code draw}; {@code faults} is the number of ticks the
     * {@link Guard} had to cover for this round.
     *
     * <p>Also folds the round into the opponent's profile (MEM-2) and copies the memory
     * library's battle totals into the record (MEM-3 to MEM-5, RES-5). A battle with several
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
        stats.targetDistance = distance.controllerTarget();
        stats.shadowedWaves = moveController.shadowedWaves();
        stats.flavourStep = flavour.step().ordinal();
        stats.seedDecays = seedDecays;
        foldRound(tick, "win".equals(result));
        if (library != null) {
            stats.profileLoadFailures = library.loadFailures();
            stats.profileSaveFailures = library.saveFailures() + library.skippedWrites();
            stats.seedsEvicted = library.seedsEvicted();
        }
        telemetry.emit(stats.toRecord(round, tick, result, myEnergy, lastEnemyEnergy));
        if (enemiesTotal >= 2 || gate.sentriesSeen()) telemetry.emit(meleeRecord(tick));
        return stats;
    }

    /**
     * The melee extension's round record, for battles with several opponents or sentries:
     * {@code M,round,tick,meleeTicks,duelTicks,focusTicks,veto,meleeFaults,maxScanGap,
     * ghostTicks,sentryHits,sweepGap,ghostsDropped}. The veto is {@code -}, {@code sentry} or {@code fault};
     * sentryHits counts our bullets that hit a sentry. Fields are only ever appended.
     */
    String meleeRecord(long tick) {
        return "M," + round + "," + tick + "," + meleeTicks + "," + duelTicks + "," + focusTicks
            + "," + (gate.veto() == PostureGate.Veto.NONE ? "-" : gate.veto().name().toLowerCase(Locale.ROOT))
            + "," + meleeFaults + "," + maxScanGap + "," + ghostTicks + "," + sentryHits
            + "," + sweepGap + "," + (melee.ghostsDropped() - ghostsAtRoundStart);
    }

    /** MEM-2: the round's observations join the profile. A failure here is counted, never thrown. */
    private void foldRound(long tick, boolean won) {
        if (folder == null) return;
        try {
            // The virtual guns' ratings of this opponent's movement (the movement tier's
            // evidence) and their normalised hit rate on us (the gun tier's).
            double[] v = gunController.virtualGunScores(opponentName);
            folder.virtualGuns(v[0], v[1], v[2], v[3]);
            folder.normalised(moveController.enemyFiringWaves(), moveController.enemyWeightedHits());
            folder.fold(won);
        } catch (RuntimeException e) {
            stats.profileSaveFailures++;
            telemetry.emit("MEM," + round + "," + tick + ",fold-failed," + clean(e.toString()));
        }
    }

    /**
     * MEM-3: writes the profile to the store. The adapter calls this when a round ends, as
     * a checkpoint, and when the battle ends. Does nothing when the battle keeps no memory.
     *
     * <p>The library does the atomic write (RES-3) and any eviction (MEM-5) and never
     * throws; anything but a clean write is logged as a {@code MEM} record.</p>
     *
     * @param tick the tick of the save, for the record
     */
    public void saveProfile(long tick) {
        if (library == null || folder == null) return;
        ProfileLibrary.Saved saved = library.save(folder.profile());
        if (saved != ProfileLibrary.Saved.WRITTEN) {
            telemetry.emit("MEM," + round + "," + tick + "," + saved.name().toLowerCase(Locale.ROOT)
                + "," + clean(library.lastNote()));
        }
    }

    /**
     * Gets opponent memory ready before the battle's first tick (reads the battle clock,
     * loads the codec), so the first scan's load is quick. Does nothing without memory.
     */
    public void prepareMemory() {
        if (library != null) library.prepare();
    }

    /**
     * The battle is over: the last save (MEM-3).
     *
     * @param tick the battle's last tick, for the record
     */
    public void battleEnded(long tick) {
        saveProfile(tick);
    }

    /**
     * The profile of this battle's opponent, or null before the first scan or without memory.
     *
     * @return the profile being folded into, including the rounds folded so far
     */
    public hadur2.core.memory.OpponentProfile profile() {
        return folder == null ? null : folder.profile();
    }

    /**
     * The battle's opening (S4); {@link Opening#STRANGER} before the first scan or without memory.
     *
     * @return what the opening book chose
     */
    public Opening opening() {
        return opening;
    }

    /**
     * The surf's danger views whose thresholds are met now (ADAPT-2, DIAL-1).
     *
     * @return the names of the views switched on
     */
    public java.util.List<String> dangerViewsOn() {
        return moveController.viewsOn();
    }

    /**
     * The gun seed's weight now (ADAPT-3, RES-4), or NaN without a profile.
     *
     * @return the weight of each seeded gun sample relative to a live one (1)
     */
    public double gunSeedWeight() {
        return gunSeedTrust == null ? Double.NaN : gunSeedTrust.weight().value();
    }

    /**
     * The surf seed's weight now, or NaN without a profile (ADAPT-3, RES-4).
     *
     * @return the weight of each seeded surf sample relative to a live one (1)
     */
    public double surfSeedWeight() {
        return surfSeedTrust == null ? Double.NaN : surfSeedTrust.weight().value();
    }

    /**
     * Whether seeds are still being replayed into the views.
     *
     * @return true while the seed loader has samples left
     */
    public boolean seedsLoading() {
        return seedLoader != null;
    }

    /**
     * Seed samples replayed into the views so far this battle (ADAPT-3).
     *
     * @return the count, gun and surf together
     */
    public int seedsReplayed() {
        return seedsReplayed;
    }

    /** Makes free text safe inside a CSV record: commas become ';' and line breaks spaces. */
    private static String clean(String s) {
        return s.replace(',', ';').replace('\n', ' ');
    }

    /**
     * Aims, fires last tick's aimed shot if the gun got there, and returns the gun's heat after.
     *
     * <p>Robocode turns the gun during the tick and fires on a later one, so each tick fires
     * the shot aimed on the tick before (at the power that aim assumed) and then aims the
     * next. The aim is taken from where we will be next tick, since that is where a bullet
     * fired then would leave from.</p>
     */
    private double aimAndFire(BotInput in, BotOrders.Builder orders, boolean virtualGuns) {
        // Where our current velocity carries us in one tick.
        Point2D.Double myNext = predictor.nextLocation(currentState(in));
        // In 1.20, setFireBullet heated the gun at once (the engine's proxy adds the new
        // shot's heat to getGunHeat()), so the aim below saw the hot gun.
        double gunHeat = in.gunHeat();
        if (fireIfGunTurned(in, orders, aimedBulletPower, myNext, virtualGuns)) {
            // The power the engine will actually fire: clamped to [0.1, 3.0] and to our
            // energy, as Robocode clamps it. Its heat is 1 + power / 5.
            double firedPower = Math.min(in.energy(), Math.min(
                Math.max(aimedBulletPower, Rules.MIN_BULLET_POWER), Rules.MAX_BULLET_POWER));
            gunHeat += Rules.getGunHeat(firedPower);
            // MOVE-1: it leaves from here along the gun's heading this tick.
            moveController.ourBulletFired(new OurBullet(in.time(), in.location(), in.gunHeading(),
                firedPower));
            if (aimCarriesJitter) aimJitter.shotFired();
        }

        aimedBulletPower = lastGunWave.bulletPower();
        double aimAngle;
        // Head-on at a disabled enemy (it cannot move, so head-on is exact), and while the gun
        // is more than 3 ticks from cool, when no shot can use the real aim: the KNN search is
        // the gun's costly part and is run only for the aims that may be fired.
        if (lastGunWave.targetEnergy == 0 || ticksUntilGunCool(gunHeat, in) > 3) {
            aimAngle = DiaUtils.absoluteBearing(myNext, lastGunWave.targetLocation);
        } else {
            aimAngle = gunController.aim(lastGunWave, myNext, in.time());
        }
        // Recorded with the aim, so the shot fired from it next tick knows whether it carries
        // the offset (the shielded check in fireIfGunTurned).
        aimCarriesJitter = shieldDetector.shielded();
        if (aimCarriesJitter) {
            // SHIELD-2: a shielder predicts our heading exactly; move it by an amount it can't.
            aimAngle += aimJitter.offset(myNext.distance(lastGunWave.targetLocation));
        }
        orders.turnGunRight(Angles.normalRelativeAngle(aimAngle - in.gunHeading()));
        return gunHeat;
    }

    /**
     * Fires if the gun is cool and on target; returns whether it fired. A shot marks the gun
     * wave it was aimed from as a firing wave (which is what the main gun learns from), fires
     * the virtual guns' bullets from the same wave unless the tick budget forbids it, and is
     * counted in the round's statistics and the profile's shot log.
     */
    private boolean fireIfGunTurned(BotInput in, BotOrders.Builder orders, double bulletPower,
                                    Point2D.Double myNext, boolean virtualGuns) {
        // 1.20 compared getGunTurnRemaining(), which is in degrees, with 0.05, so the gun
        // has to be within 0.05 degrees. Kept exactly as it was; S1 changes no behaviour.
        // SHIELD-2: once a shielder is found, hold the shot the gun settled on before, since
        // that aim is the predictable one.
        boolean predictable = shieldDetector.shielded() && !aimCarriesJitter;
        if (in.gunHeat() == 0 && Math.abs(Math.toDegrees(in.gunTurnRemaining())) < 0.05
                && in.energy() > bulletPower && lastGunWave != null && !predictable) {
            orders.fire(bulletPower);
            lastGunWave.firingWave = true;
            // TIME-1: at the lowest computation level the virtual guns are not scored.
            if (virtualGuns) gunController.fireVirtualBullets(lastGunWave, myNext, in.time());
            lastRealBulletFireTime = in.time();
            stats.shotsFired++;
            if (bulletPower >= PowerPolicy.FULL_POWER) stats.fullPowerShots++;
            if (aimCarriesJitter) stats.jitteredShots++;
            if (folder != null) folder.ourShot(lastEnemyDistance);
            return true;
        }
        return false;
    }

    /**
     * RADAR-1: the lock only turns the radar when a scan arrives, so a missed scan (after a
     * skipped turn, say) could leave it still for the rest of the round, blind to every
     * shot. Sweep toward where the enemy was last seen until a scan comes back.
     *
     * <p>An infinite turn keeps the radar going at its full 45 degrees a tick, in the
     * shorter direction toward the last bearing, and the next scan's lock replaces it.</p>
     */
    private void reacquire(BotInput in, BotOrders.Builder orders) {
        double toEnemy = Angles.normalRelativeAngle(lastEnemyAbsBearing - in.radarHeading());
        orders.turnRadarRight(toEnemy < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
        stats.radarReacquired++;
    }

    /**
     * Handles a scan of a non-sentry robot. The melee tracker always hears of it; in the duel
     * posture, the scan of the duel's opponent then drives the duel for this tick:
     *
     * <ul>
     * <li>both robots' states are logged, with the KNN features they feed (acceleration,
     *     time since the last velocity change, distance moved over the last 8, 20 and 40
     *     ticks);</li>
     * <li>the bullet power is chosen (the gun's rule, raised by POW-1 or POW-2), and a gun
     *     wave from us toward the enemy is made at that power, and the gun waves the enemy has
     *     crossed are broken to teach the gun;</li>
     * <li>a movement wave from the enemy toward us is made at a guessed power, a candidate
     *     for the enemy's next shot;</li>
     * <li>the energy ledger reads the enemy's energy; a corrected drop in [0.1, 3.0] marks
     *     the matching movement wave as a real, surfable one (WAVE-1, WAVE-2);</li>
     * <li>the radar is locked on the enemy.</li>
     * </ul>
     */
    private void onScan(BotInput in, BotEvent.Scan e, BotOrders.Builder orders) {
        long time = in.time();
        Point2D.Double myPos = in.location();
        // The engine gives a bearing relative to our heading; add the heading for the absolute
        // one (0 = north, clockwise) and project the distance along it for the enemy's spot.
        double absBearing = Angles.normalAbsoluteAngle(in.heading() + e.bearing());
        Point2D.Double enemyPos = DiaUtils.project(myPos, absBearing, e.distance());
        meleeEvent(() -> melee.onScan(e.name(), enemyPos, e.distance(), e.energy(), e.heading(),
            e.velocity(), time));
        // In melee the tracker is all; the duel's model is not fed (GATE-1).
        if (inMelee) return;
        // With several opponents alive the duel fights one and ignores the others.
        if (focusing && !e.name().equals(focusTarget(myPos))) return;
        // S5: the windows and the distance controller are about one robot's gun.
        if (duelOpponent != null && !duelOpponent.equals(e.name())) forgetDuelOpponent();
        duelOpponent = e.name();
        long previousScanTime = lastScanTime;
        lastScanTime = time;
        lastEnemyAbsBearing = absBearing;
        lastEnemyLocation = enemyPos;
        lastEnemyEnergy = e.energy();
        lastEnemyDistance = e.distance();
        stats.distanceSum += e.distance();
        stats.distanceScans++;
        // MEM-1: the battle's first duel scan loads the profile before this tick's orders.
        if (!announced) {
            announced = true;
            announce(round, time, e.name());
        }
        if (folder != null) {
            // The enemy's lateral velocity, velocity * sin(heading - bearing): its speed across
            // the line from us to it, which is what a gun must predict.
            folder.enemyScanned(e.velocity(), e.velocity() * Math.sin(e.heading() - absBearing),
                enemyPos.x, enemyPos.y);
        }

        double enemyVel = e.velocity();
        double enemyHead = e.heading();
        double myVel = in.velocity();
        double myHead = in.heading();

        RobotState myState = RobotState.newBuilder()
            .setLocation(myPos).setHeading(myHead)
            .setVelocity(myVel).setTime(time).build();
        myStateLog.addState(myState);

        RobotState enemyState = RobotState.newBuilder()
            .setLocation(enemyPos).setHeading(enemyHead)
            .setVelocity(enemyVel).setTime(time).build();
        enemyStateLog.addState(enemyState);

        // A stopped robot keeps the direction it had, so its guess factors keep their side.
        if (enemyVel != 0) enemyVelocitySign = enemyVel > 0 ? 1 : -1;
        if (myVel != 0) myVelocitySign = myVel > 0 ? 1 : -1;

        double enemyAccel = DiaUtils.accel(enemyVel, prevEnemyVelocity);
        double myAccel = DiaUtils.accel(myVel, prevMyVelocity);

        // Counted in scans, which in a duel with a working lock are ticks.
        if (Math.abs(enemyVel - prevEnemyVelocity) > 0.5) enemyVchangeTime = 0;
        else enemyVchangeTime++;
        if (Math.abs(myVel - prevMyVelocity) > 0.5) myVchangeTime = 0;
        else myVchangeTime++;

        // How far each robot has got from where it was 8, 20 and 40 ticks ago: a small
        // displacement over a long time means an oscillating or stop-and-go movement.
        double eDl8 = enemyStateLog.getDisplacementDistance(enemyPos, time, 8);
        double eDl20 = enemyStateLog.getDisplacementDistance(enemyPos, time, 20);
        double eDl40 = enemyStateLog.getDisplacementDistance(enemyPos, time, 40);
        double mDl8 = myStateLog.getDisplacementDistance(myPos, time, 8);
        double mDl20 = myStateLog.getDisplacementDistance(myPos, time, 20);
        double mDl40 = myStateLog.getDisplacementDistance(myPos, time, 40);

        double bulletPower = gunController.calculateBulletPower(
            e.distance(), in.energy(), e.energy(), in.others());
        // POW-1, POW-2: full power where the profile or this battle says their gun can't hit us.
        PowerPolicy.Reason why = PowerPolicy.reason(opening.gunTier(), e.energy(), in.energy(),
            ourWindow.estimate(), theirWindow.estimate());
        if (why != powerReason) {
            powerReason = why;
            Estimate ours = ourWindow.estimate();
            emitPolicy(round, time, "power", ours.value(), ours.margin(), why.name().toLowerCase(Locale.ROOT));
        }
        bulletPower = PowerPolicy.power(why, bulletPower, e.energy());

        // Our gun wave: from us to the enemy at the power we would fire. Every scan makes
        // one; only those a real shot left from become firing waves, but all of them teach
        // the gun where the enemy went.
        lastGunWave = new Wave(e.name(), myPos, enemyPos,
            round, time, bulletPower,
            enemyHead, enemyVel, enemyVelocitySign,
            battleField, predictor);
        lastGunWave.setAccel(enemyAccel)
            .setDistance(e.distance())
            .setVchangeTime(enemyVchangeTime)
            .setDistanceLast8Ticks(eDl8)
            .setDistanceLast20Ticks(eDl20)
            .setDistanceLast40Ticks(eDl40)
            .setTargetEnergy(e.energy())
            .setSourceEnergy(in.energy())
            .setGunHeat(in.gunHeat())
            .setEnemiesAlive(in.others())
            .setLastBulletFiredTime(lastRealBulletFireTime);
        lastGunWave.setWallDistances();
        gunWaveManager.addWave(lastGunWave);

        gunWaveManager.checkActiveWaves(time, enemyState,
            (w, bs) -> gunController.onWaveBreak(w, bs));
        checkGunSeed(time);

        // The enemy's possible wave: from the enemy to us, one per scan. Until a later scan's
        // energy drop says a bullet left from it, it is only a candidate, at the power of the
        // enemy's last detected shot (1.9 before the first).
        double guessPower = moveController.guessBulletPower();
        Wave moveWave = new Wave(e.name(), enemyPos, myPos,
            round, time, guessPower,
            myHead, myVel, myVelocitySign,
            battleField, predictor);
        moveWave.setAccel(myAccel)
            .setDistance(e.distance())
            .setVchangeTime(myVchangeTime)
            .setDistanceLast8Ticks(mDl8)
            .setDistanceLast20Ticks(mDl20)
            .setDistanceLast40Ticks(mDl40)
            .setTargetEnergy(in.energy())
            .setSourceEnergy(e.energy());
        moveWave.setWallDistances();
        moveController.addWave(moveWave);

        // WAVE-1, WAVE-2: only the part of the drop the ledger can't explain is a shot.
        EnergyLedger.Reading reading = ledger.scan(time, e.energy(), enemyVel, enemyPos.x, enemyPos.y);
        if (reading.phantom()) stats.phantomWaves++;
        if (reading.hidden()) stats.hiddenShots++;
        if (reading.shot()) {
            // The drop shows on the scan after the shot, so the bullet left on an earlier
            // tick: the latest movement wave from before this scan, back to the previous one,
            // becomes the firing wave, at the drop's power (which sets its speed).
            long fireTime = moveController.updateFiringWave(previousScanTime, time,
                reading.corrected());
            stats.enemyShotsDetected++;
            enemyGunHeat(in).shot(fireTime, reading.corrected());
            if (folder != null) folder.enemyShot(e.distance(), reading.corrected(), myVel != 0);
            // EW,round,tick,waveId,fireTick,rawDrop,correctedDrop,power,distance: the wave is
            // named by its fire tick, and its power is the corrected drop.
            telemetry.emit(String.format(Locale.ROOT,
                "EW,%d,%d,%d,%d,%.4f,%.4f,%.4f,%.1f", round, time, fireTime, fireTime,
                reading.raw(), reading.corrected(), reading.corrected(), e.distance()));
        }

        // The radar lock: turn twice the angle to the enemy, so the radar overshoots and its
        // sweep crosses the enemy again next tick wherever it has moved.
        orders.turnRadarRight(Angles.normalRelativeAngle(absBearing - in.radarHeading()) * 2.0);

        prevEnemyVelocity = enemyVel;
        prevMyVelocity = myVel;
    }

    /**
     * MEM-1: the first scan of the battle loads the opponent's profile before this tick's
     * orders are made. B records who it is and what memory said:
     * {@code B,round,tick,battle,exactName,lineageKey,found,tiers,gunSeed,surfSeed,level}.
     */
    private void announce(int round, long time, String name) {
        String battle = "-";
        String key = LineageKey.of(name);
        String tiers = "-";
        int gunSeed = 0;
        int surfSeed = 0;
        opponentName = name;
        // Without memory the B record still goes out, with '-' for what memory would say.
        if (library != null) {
            // MEM-4: a missing or damaged profile loads as a stranger; load never throws.
            ProfileLibrary.Loaded loaded = library.load(name);
            folder = new ProfileFolder(loaded.profile(), fieldWidth, fieldHeight);
            profileFound = loaded.found();
            battle = String.valueOf(loaded.profile().lastFought());
            tiers = Tiers.label(loaded.profile());
            gunSeed = loaded.profile().gunSeedSize();
            surfSeed = loaded.profile().surfSeedSize();
            stats.profileLoadFailures = library.loadFailures();
            if (loaded.failure() != null) {
                telemetry.emit("MEM," + round + "," + time + ",load-failed," + clean(loaded.failure()));
            }
        }
        telemetry.emit("B," + round + "," + time + "," + battle + "," + clean(name) + ","
            + clean(key) + "," + (profileFound ? 1 : 0) + "," + tiers + "," + gunSeed + ","
            + surfSeed + "," + stats.computationLevel);
        if (folder != null) open(round, time, name);
    }

    /**
     * S4: the opening book reads the profile once, and its decisions go to the gun and the
     * surf through their own setters. P records say what it chose and on what evidence:
     * {@code P,round,tick,policy,value,margin,setting}.
     */
    private void open(int round, long time, String name) {
        opening = OpeningBook.read(folder.profile());
        // S5: a known gun tier starts closer than a stranger's 650 px.
        distance = new DistancePolicy(opening.distance());
        emitPolicy(round, time, "distance", Double.NaN, Double.NaN,
            opening.gunTier() + ":" + Math.round(opening.distance()));
        gunController.setSampleSink(folder::gunSample);
        moveController.setSampleSink(folder::surfSample);
        // This battle's gun waves and hits on us go to the folder as samples, the profile's
        // next seeds (MEM-2).
        // ADAPT-1: a known movement tier picks the first gun; LIVE leaves it to the ratings.
        if (opening.gun() != Opening.Gun.LIVE) {
            gunController.setOpening(opening.gun() == Opening.Gun.ANTI_SURFER
                ? GunController.Opening.ANTI_SURFER : GunController.Opening.MAIN);
        }
        // ADAPT-2: the profile's hit rate stands in for the live one while it is more certain,
        // and a T3 gun turns the flattener on from the first surfable wave.
        Estimate prior = opening.surfPrior();
        if (!Double.isNaN(prior.value())) moveController.setPrior(prior.value(), prior.margin());
        moveController.setFlattenerFirst(opening.flattenerFirst());
        // MOVE-2's baseline: the profile's raw hit rate on us, as hits over shots.
        OpponentProfile p = folder.profile();
        flavour = new MoveFlavour(p.theirShots() > 0
            ? Estimate.of(p.theirHitRate() * p.theirShots(), p.theirShots()) : Estimate.NONE);
        emitPolicy(round, time, "opening-gun", Double.NaN, Double.NaN,
            opening.moveTier() + ":" + opening.gun().name().toLowerCase(Locale.ROOT));
        emitPolicy(round, time, "surf-prior", prior.value(), prior.margin(),
            opening.gunTier() + ":" + (opening.flattenerFirst() ? "flattener" : Double.isNaN(prior.value()) ? "live" : "profile"));
        // Without a seed the weights start at 0; the trusts still watch the opening's evidence.
        SeedWeight gunWeight = new SeedWeight(opening.gunSeed().isEmpty() ? 0 : opening.seedWeight());
        SeedWeight surfWeight = new SeedWeight(opening.surfSeed().isEmpty() ? 0 : opening.seedWeight());
        gunSeedTrust = new SeedTrust(gunWeight, opening.mainGunRating());
        surfSeedTrust = new SeedTrust(surfWeight, opening.theirHitRate());
        // ADAPT-3: the seeds share one weight each, so a trust lowering it (RES-4) lowers every
        // seeded sample at once without touching the KNN trees.
        if (opening.gunSeed().isEmpty() && opening.surfSeed().isEmpty()) return;
        seedLoader = new SeedLoader(opening.gunSeed(), opening.surfSeed(),
            sample -> gunController.seed(name, sample, gunWeight),
            sample -> moveController.seed(sample, surfWeight));
    }

    /**
     * RES-4: each of our virtual main-gun waves checks the gun seed against the live rating.
     * Once they disagree, the opening's gun choice goes too and live ratings pick the gun.
     */
    private void checkGunSeed(long time) {
        if (gunSeedTrust == null) return;
        // v[0] counts the main gun's virtual waves and v[1] its weighted hits, so the live
        // rating is an Estimate with its own margin (DIAL-1).
        double[] v = gunController.virtualGunScores(opponentName);
        Estimate live = Estimate.of(v[1], v[0]);
        boolean trusted = !gunSeedTrust.distrusted();
        // One observation per new wave: RES-4's decay is counted in waves (DIAL-2).
        for (; gunWavesChecked < v[0]; gunWavesChecked++) {
            if (gunSeedTrust.observe(live)) {
                seedDecays++;
                emitPolicy(round, time, "gun-seed", live.value() - opening.mainGunRating().value(),
                    Math.max(live.margin(), opening.mainGunRating().margin()),
                    String.format(Locale.ROOT, "%.2f", gunSeedTrust.weight().value()));
            }
        }
        if (trusted && gunSeedTrust.distrusted() && gunController.opening() != null) {
            gunController.setOpening(null);
            emitPolicy(round, time, "opening-gun", live.value(), live.margin(), "live");
        }
    }

    /**
     * RES-4: each enemy firing wave that breaks on us checks the surf seed against the live
     * normalised hit rate. Once they disagree, the surf's prior goes too.
     */
    private void checkSurfSeed(long time) {
        if (surfSeedTrust == null) return;
        int waves = moveController.enemyFiringWaves();
        Estimate live = Estimate.of(moveController.enemyWeightedHits(), waves);
        boolean trusted = !surfSeedTrust.distrusted();
        for (; surfWavesChecked < waves; surfWavesChecked++) {
            if (surfSeedTrust.observe(live)) {
                seedDecays++;
                emitPolicy(round, time, "surf-seed", live.value() - opening.theirHitRate().value(),
                    Math.max(live.margin(), opening.theirHitRate().margin()),
                    String.format(Locale.ROOT, "%.2f", surfSeedTrust.weight().value()));
            }
        }
        if (trusted && surfSeedTrust.distrusted() && !Double.isNaN(opening.surfPrior().value())) {
            moveController.clearPrior();
            emitPolicy(round, time, "surf-prior", live.value(), live.margin(), "live");
        }
    }

    /**
     * S5, once a duel tick: feeds the enemy waves that broke this tick into their rolling
     * hit rate, steps the distance controller once for each (DIST-1), then reads the endgame
     * (END-1, END-2) and hands the surf its target distance. P records mark each change.
     */
    private void checkDistance(BotInput in, double gunHeat) {
        // Each wave's outcome in the order they broke; each one also counts toward MOVE-2.
        for (boolean hit : moveController.takeBrokenWaveOutcomes()) {
            theirWindow.record(hit);
            MoveFlavour.Step added = flavour.onWave(hit);
            if (added != null) changeFlavour(in, added);
            Estimate ours = ourWindow.estimate();
            Estimate theirs = theirWindow.estimate();
            if (distance.onWave(ours, theirs) != DistancePolicy.Step.HOLD) {
                // The gap's margin: the two estimates' margins combined in quadrature.
                emitPolicy(round, in.time(), "distance", ours.value() - theirs.value(),
                    Math.hypot(ours.margin(), theirs.margin()),
                    String.valueOf(Math.round(distance.controllerTarget())));
            }
        }

        // Our heat counts a shot fired this tick: that gun can't answer before theirs.
        Endgame.State now = Endgame.of(lastEnemyEnergy, in.energy(),
            enemyGunHeat(in).at(in.time()), gunHeat);
        if (now != endgame) {
            endgame = now;
            emitPolicy(round, in.time(), "endgame", lastEnemyEnergy, Double.NaN,
                now.name().toLowerCase(Locale.ROOT));
        }
        if (now == Endgame.State.FINISH) stats.finishTicks++;
        if (now == Endgame.State.RAM) stats.ramTicks++;
        // END-1 overrides the controller's target with the finishing distance, 150 px.
        surfMover.setDesiredDistance(distance.target(now == Endgame.State.FINISH));
    }

    /**
     * A different robot is now the duel opponent (a melee's survivor can change from round
     * to round): what the windows and the distance controller learned was about another gun.
     */
    private void forgetDuelOpponent() {
        ourWindow.clear();
        theirWindow.clear();
        distance = new DistancePolicy(opening.distance());
        flavour = MoveFlavour.stranger();
        surfMover.setMode(SurfMover.Mode.OPTIONS);
    }

    /**
     * MOVE-2: their gun is doing better than the profile says; add the next flavour. The
     * surf takes a new mode at the next wave it surfs; the views and the band change now,
     * and the next surfable wave is the first scored with them.
     */
    private void changeFlavour(BotInput in, MoveFlavour.Step step) {
        stats.flavourChanges++;
        switch (step) {
            case FLATTENER:
                moveController.setFlattenerFirst(true);
                break;
            case GO_TO:
                surfMover.setMode(SurfMover.Mode.GO_TO);
                break;
            case FAR:
                distance.shiftOut(MoveFlavour.FAR_SHIFT);
                break;
            default:
                break;
        }
        Estimate live = flavour.trigger();
        emitPolicy(round, in.time(), "move-flavour", live.value(), live.margin(),
            step.name().toLowerCase(Locale.ROOT));
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
        emitPolicy(round, lastTickTime, "budget", budget.level(), Double.NaN,
            "level-" + budget.level());
    }

    /**
     * The enemy's gun-heat estimate (END-1), made on first use because the cooling rate is
     * only known from a tick's input. It lasts the battle and restarts each round.
     */
    private EnemyGunHeat enemyGunHeat(BotInput in) {
        if (enemyGunHeat == null) enemyGunHeat = new EnemyGunHeat(in.gunCoolingRate());
        return enemyGunHeat;
    }

    /**
     * S5: the distance the surf is steering to now.
     *
     * @return the target distance in px (DIST-1, END-1)
     */
    public double targetDistance() {
        return surfMover.desiredDistance();
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
        return flavour.step();
    }

    /**
     * S6: how the surf picks its spot for the wave being surfed.
     *
     * @return the three options, or go-to surfing (MOVE-2)
     */
    public SurfMover.Mode surfMode() {
        return surfMover.mode();
    }

    /**
     * S6: enemy firing waves one of our bullets has shadowed this round (MOVE-1).
     *
     * @return the number of shadowed waves
     */
    public int shadowedWaves() {
        return moveController.shadowedWaves();
    }

    /**
     * MOVE-1: how many times a wave's shadows were computed this round.
     *
     * @return the number of shadow computations, a cost measure
     */
    public int shadowComputations() {
        return moveController.shadowComputations();
    }

    /**
     * S5: the endgame state as of the last duel tick.
     *
     * @return none, finishing (END-1) or ramming (END-2)
     */
    public Endgame.State endgame() {
        return endgame;
    }

    /**
     * S5: our rolling hit rate, over our last duel bullets (DIST-1, POW-2).
     *
     * @return the rate with its margin of error
     */
    public Estimate ourRollingHitRate() {
        return ourWindow.estimate();
    }

    /**
     * S5: their rolling hit rate, over their last firing waves to break on us (DIST-1, POW-2).
     *
     * @return the rate with its margin of error
     */
    public Estimate theirRollingHitRate() {
        return theirWindow.estimate();
    }

    /**
     * Writes a {@code P,round,tick,policy,value,margin,setting} record; a NaN value or margin
     * is written as {@code -}.
     */
    private void emitPolicy(int round, long time, String policy, double value, double margin,
                            String setting) {
        telemetry.emit(String.format(Locale.ROOT, "P,%d,%d,%s,%s,%s,%s", round, time, policy,
            Double.isNaN(value) ? "-" : String.format(Locale.ROOT, "%.4f", value),
            Double.isNaN(margin) ? "-" : String.format(Locale.ROOT, "%.4f", margin), setting));
    }

    /**
     * One of our bullets hit a robot. Its shadow goes (MOVE-1); a duel bullet's outcome goes
     * to the shield detector and our window; and, if it hit the duel's enemy, the ledger is
     * told the damage it did so that drop is not read as a shot (WAVE-1).
     */
    private void onBulletHit(BotEvent.BulletHit e) {
        stats.shotsHit++;
        moveController.ourBulletGone(e.bulletHeading(), e.power());
        if (gate.isSentry(e.name())) sentryHits++;
        boolean foreign = foreign(e.name());
        // duelBulletResolved() runs first on purpose: every outcome must pass through it
        // once, to keep its count of melee bullets in flight right.
        if (duelBulletResolved() && !foreign) {
            shieldDetector.bulletHit();
            ourWindow.record(true);
        }
        if (foreign) return;
        if (folder != null && !inMelee) folder.ourHit(lastEnemyDistance, Rules.getBulletDamage(e.power()));
        meleeEvent(() -> melee.onBulletHit(e.name(), e.power()));
        ledger.ourBulletHit(e.power());
    }

    /**
     * An enemy bullet hit us. For the duel's enemy the ledger books its refund of 3 x power
     * (WAVE-1), the wave that carried the bullet is found and logged as a hit for the surf's
     * danger views, and the profile records the hit.
     */
    private void onHitByBullet(BotInput in, BotEvent.HitByBullet e) {
        stats.hitsTaken++;
        if (gate.isSentry(e.name())) return;
        if (focusing && !e.name().equals(focus.target())) {
            // Not the duel's enemy: the melee brain still learns who hurts us.
            meleeEvent(() -> melee.onHitByBullet(e.name(), e.power(), e.heading(), in.location(),
                in.time()));
            return;
        }
        ledger.enemyBulletHitUs(e.power());
        meleeEvent(() -> melee.onHitByBullet(e.name(), e.power(), e.heading(), in.location(),
            in.time()));
        // The firing wave of this robot and power whose front is closest to the bullet.
        Point2D.Double bulletLoc = new Point2D.Double(e.x(), e.y());
        Wave hitWave = moveController.findBulletWave(bulletLoc, in.time(), e.name(), e.power());
        if (hitWave != null) {
            hitWave.hitByBullet = true;
            moveController.logBulletHit(hitWave, bulletLoc, round, in.time());
        }
        if (folder != null && !inMelee) {
            // File the hit under the distance and movement at the wave's fire time when known.
            boolean found = hitWave != null;
            folder.hitByEnemy(found ? hitWave.targetDistance : lastEnemyDistance,
                (found ? hitWave.targetVelocity : in.velocity()) != 0,
                Rules.getBulletDamage(e.power()));
        }
    }

    /**
     * Whether a bullet outcome is from a duel shot. Outcomes come one per bullet, so the
     * first ones after a melee ends belong to bullets fired in it and are skipped.
     */
    private boolean duelBulletResolved() {
        if (meleeBulletsInFlight > 0) {
            meleeBulletsInFlight--;
            return false;
        }
        return !inMelee;
    }

    /** One of our bullets left the field: its shadow goes, and a duel bullet counts as a miss. */
    private void onBulletMissed(BotEvent.BulletMissed e) {
        moveController.ourBulletGone(e.bulletHeading(), e.power());
        if (duelBulletResolved()) {
            shieldDetector.bulletMissed();
            ourWindow.record(false);
        }
    }

    /**
     * One of our bullets met an enemy bullet: both are gone. Ours counts as a miss in our
     * window and as an intercept for the shield detector (SHIELD-1); the enemy's wave is
     * marked, so when it breaks it is left out of their hit rate and their rolling window: its
     * bullet never reached us, hit or miss.
     */
    private void onBulletHitBullet(BotInput in, BotEvent.BulletHitBullet e) {
        stats.bulletsIntercepted++;
        moveController.ourBulletGone(e.bulletHeading(), e.power());
        // SHIELD-1: in a duel, a bullet that meets ours may be a shield.
        if (duelBulletResolved()) {
            shieldDetector.bulletIntercepted();
            ourWindow.record(false);
        }
        Point2D.Double hitLoc = new Point2D.Double(e.x(), e.y());
        // No name: the event does not say whose bullet ours met, so the firing wave of that
        // power whose front is closest to the point is taken.
        Wave hitWave = moveController.findBulletWave(hitLoc, in.time(), null, e.enemyPower());
        if (hitWave != null) {
            // MOVE-1's check on itself: the bullet ours destroyed should have been in a shadow.
            if (hitWave.inShadow(DiaUtils.absoluteBearing(hitWave.sourceLocation, hitLoc), 1e-3)) {
                stats.interceptsShadowed++;
            }
            hitWave.bulletHitBullet = true;
        }
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

    /** Ticks until a gun at {@code gunHeat} can fire, at the battle's cooling rate. */
    private static long ticksUntilGunCool(double gunHeat, BotInput in) {
        return Math.round(Math.ceil(gunHeat / in.gunCoolingRate()));
    }

    /** Our state now, as the predictor and the surf take it. */
    private static RobotState currentState(BotInput in) {
        return RobotState.newBuilder()
            .setLocation(in.location())
            .setHeading(in.heading())
            .setVelocity(in.velocity())
            .setTime(in.time()).build();
    }
}
