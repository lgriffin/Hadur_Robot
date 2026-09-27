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
 */
public final class HadurCore {

    private final BattleField battleField;
    private final MovementPredictor predictor;
    private final GunController gunController;
    private final MoveController moveController;
    private final SurfMover surfMover;
    private final WaveManager gunWaveManager;
    private final RobotStateLog myStateLog;
    private final RobotStateLog enemyStateLog;
    private final EnergyLedger ledger;
    private final Telemetry telemetry;
    private final MeleeController melee;
    private final ShieldDetector shieldDetector = new ShieldDetector();
    private final AimJitter aimJitter = new AimJitter();
    /** Whether the aim the gun is turning to carries the anti-shield offset (SHIELD-2). */
    private boolean aimCarriesJitter;
    /** Our melee bullets not yet resolved; their outcomes are no evidence about a duel (SHIELD-1). */
    private int meleeBulletsInFlight;
    /** Null when the battle keeps no memory (no store, or a melee battle). */
    private final ProfileLibrary library;
    private final double fieldWidth;
    private final double fieldHeight;
    private ProfileFolder folder;
    private boolean profileFound;
    private String opponentName;
    private double lastEnemyDistance;
    private Opening opening = Opening.STRANGER;
    private SeedLoader seedLoader;
    private int seedsReplayed;
    /** RES-4: null until a profile is opened. */
    private SeedTrust gunSeedTrust;
    private SeedTrust surfSeedTrust;
    /** Waves already checked against the profile: our virtual main-gun waves, their firing waves. */
    private double gunWavesChecked;
    private int surfWavesChecked;
    /** Waves on which a seed's weight was lowered, battle total (RES-5). */
    private int seedDecays;
    /**
     * S5: our duel bullets' outcomes and their waves' outcomes, rolling, across rounds while
     * the duel opponent stays the same one.
     */
    private final HitWindow ourWindow = new HitWindow();
    private final HitWindow theirWindow = new HitWindow();
    private DistancePolicy distance = new DistancePolicy(OpeningBook.STRANGER_DISTANCE);
    /** Null until the first duel tick tells the cooling rate. */
    private EnemyGunHeat enemyGunHeat;
    private Endgame.State endgame = Endgame.State.NONE;
    private PowerPolicy.Reason powerReason = PowerPolicy.Reason.GUN;
    /** The robot the windows and the distance controller are about; null before a duel scan. */
    private String duelOpponent;
    /** S6: the tick budget (TIME-1, TIME-2) and the movement's flavour (MOVE-2). */
    private final TickBudget budget = new TickBudget();
    private MoveFlavour flavour = MoveFlavour.stranger();
    /** The tick being processed, for records written from event handlers. */
    private long lastTickTime;

    private int round;
    private RoundStats stats = new RoundStats();
    private Wave lastGunWave;
    private Point2D.Double lastEnemyLocation;
    private double lastEnemyEnergy;
    private int enemyVelocitySign;
    private int myVelocitySign;
    private double prevEnemyVelocity;
    private double prevMyVelocity;
    private long enemyVchangeTime;
    private long myVchangeTime;
    private double aimedBulletPower;
    private long lastRealBulletFireTime;
    private long lastScanTime;
    private double lastEnemyAbsBearing;
    private boolean announced;
    private boolean inMelee;
    private MeleeController.Command lastMeleeCommand;

    /** M1: the posture gate, the duel's focus among several opponents, and the sentry fence. */
    private final PostureGate gate = new PostureGate();
    private final DuelFocus focus = new DuelFocus();
    private final SentryFence fence;
    private final int enemiesTotal;
    /** The duel is driving while two or more opponents are alive (a vetoed melee). */
    private boolean focusing;
    private Posture posture = Posture.DUEL;
    /** Opponents that died this round, to catch the melee aiming at a dead robot (M2's gate). */
    private final Set<String> deadThisRound = new LinkedHashSet<>();
    /** The first exception a melee event handler threw this tick (GATE-4). */
    private RuntimeException meleeEventFault;
    /** Per-round counters for the M record. */
    private int meleeTicks, duelTicks, focusTicks, meleeFaults, ghostTicks, sentryHits, maxScanGap,
        sweepGap;
    private long ghostsAtRoundStart;

    public HadurCore(double fieldWidth, double fieldHeight, int enemiesTotal, Telemetry telemetry) {
        this(fieldWidth, fieldHeight, enemiesTotal, telemetry, null);
    }

    /** A core that remembers opponents in {@code store} (null for none). */
    public HadurCore(double fieldWidth, double fieldHeight, int enemiesTotal, Telemetry telemetry,
                     ProfileStore store) {
        this(fieldWidth, fieldHeight, enemiesTotal, telemetry, store,
            new MeleeController(new BattleField(fieldWidth, fieldHeight)));
    }

    /** A core with the given melee brain; tests use it to make the melee fail (GATE-4). */
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
        this.library = store != null && enemiesTotal == 1 ? new ProfileLibrary(store) : null;
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
        telemetry.emit("V,1");
    }

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
        aimedBulletPower = 1.9;
        lastRealBulletFireTime = 0;
        lastScanTime = 0;
        lastEnemyAbsBearing = 0;
    }

    public RoundStats stats() {
        return stats;
    }

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
        if (inMelee && !melee) {
            // MELEE-2: the survivor was never tracked as a duel opponent; start fresh.
            resetDuelTracking();
            orders.maxVelocity(Rules.MAX_VELOCITY);
        }
        inMelee = melee;
        boolean wasFocusing = focusing;
        focusing = !melee && in.others() >= 2;
        if (wasFocusing && !focusing) focus.clear();

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
                if (!foreign(((BotEvent.HitRobot) e).name())) ledger.robotsCollided();
            }
            else if (e instanceof BotEvent.RobotDeath) onRobotDeath(((BotEvent.RobotDeath) e).name());
            else if (e instanceof BotEvent.SkippedTurn) onSkippedTurn(in);
            else if (e instanceof BotEvent.TickTime) onTickTime((BotEvent.TickTime) e);
        }

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
            int level = budget.level();
            gunController.setKShare(TickBudget.kShare(level));
            moveController.setKShare(TickBudget.kShare(level));
            double gunHeat = aimAndFire(in, orders, TickBudget.virtualGuns(level));
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
            if (in.time() - lastScanTime > 1) reacquire(in, orders);
        } else {
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

    private void onRobotDeath(String name) {
        meleeEvent(() -> melee.onRobotDeath(name));
        focus.died(name);
        if (deadThisRound.size() < 64) deadThisRound.add(name);
    }

    /** M2's gate: the longest any living opponent has gone unscanned in melee this round. */
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

    /** The subsystems that drove the last tick (GATE-1, GATE-2). */
    public Posture posture() {
        return posture;
    }

    /** Why melee is off for the rest of the round, if it is (GATE-3, GATE-4). */
    public PostureGate.Veto veto() {
        return gate.veto();
    }

    /** The opponent the duel fights while several are alive, or null. */
    public String duelFocus() {
        return focusing ? focus.target() : null;
    }

    /** The melee brain, for tests of what it tracks. */
    public MeleeController melee() {
        return melee;
    }

    /**
     * MELEE-4..8, MRADAR-1..2: one tick of melee. The shot aimed last tick goes out first if the gun got
     * there, as in 1.x; then the melee brain picks the radar sweep, destination and aim.
     */
    private void meleeTick(BotInput in, BotOrders.Builder orders) {
        MeleeController.Command previous = lastMeleeCommand;
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
        if (c.target != null && deadThisRound.contains(c.target)) ghostTicks++;
        orders.turnRadarRight(c.radarTurn);
        orders.turnGunRight(c.gunTurn);
        if (c.destination != null) goTo(in, c.destination, orders);
        lastMeleeCommand = c;
    }

    /** Drives toward {@code destination}, backwards if that is the shorter turn. */
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
        orders.maxVelocity(Math.abs(turn) > Math.PI / 4 ? 4.0 : Rules.MAX_VELOCITY);
        orders.ahead(distance);
    }

    /**
     * Emits the round-end record and returns this round's statistics. {@code result} is
     * {@code win}, {@code loss} or {@code draw}; {@code faults} is the number of ticks the
     * {@link Guard} had to cover for this round.
     */
    public RoundStats roundEnded(long tick, String result, double myEnergy, int faults) {
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

    /** The battle is over: the last save (MEM-3). */
    public void battleEnded(long tick) {
        saveProfile(tick);
    }

    /** The profile of this battle's opponent, or null before the first scan or without memory. */
    public hadur2.core.memory.OpponentProfile profile() {
        return folder == null ? null : folder.profile();
    }

    /** The battle's opening (S4); {@link Opening#STRANGER} before the first scan or without memory. */
    public Opening opening() {
        return opening;
    }

    /** The surf's danger views whose thresholds are met now (ADAPT-2, DIAL-1). */
    public java.util.List<String> dangerViewsOn() {
        return moveController.viewsOn();
    }

    /** The gun seed's weight now (ADAPT-3, RES-4), or NaN without a profile. */
    public double gunSeedWeight() {
        return gunSeedTrust == null ? Double.NaN : gunSeedTrust.weight().value();
    }

    /** The surf seed's weight now, or NaN without a profile. */
    public double surfSeedWeight() {
        return surfSeedTrust == null ? Double.NaN : surfSeedTrust.weight().value();
    }

    /** Whether seeds are still being replayed into the views. */
    public boolean seedsLoading() {
        return seedLoader != null;
    }

    /** Seed samples replayed into the views so far this battle (ADAPT-3). */
    public int seedsReplayed() {
        return seedsReplayed;
    }

    private static String clean(String s) {
        return s.replace(',', ';').replace('\n', ' ');
    }

    /** Aims, fires last tick's aimed shot if the gun got there, and returns the gun's heat after. */
    private double aimAndFire(BotInput in, BotOrders.Builder orders, boolean virtualGuns) {
        Point2D.Double myNext = predictor.nextLocation(currentState(in));
        // In 1.20, setFireBullet heated the gun at once (the engine's proxy adds the new
        // shot's heat to getGunHeat()), so the aim below saw the hot gun.
        double gunHeat = in.gunHeat();
        if (fireIfGunTurned(in, orders, aimedBulletPower, myNext, virtualGuns)) {
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
        if (lastGunWave.targetEnergy == 0 || ticksUntilGunCool(gunHeat, in) > 3) {
            aimAngle = DiaUtils.absoluteBearing(myNext, lastGunWave.targetLocation);
        } else {
            aimAngle = gunController.aim(lastGunWave, myNext, in.time());
        }
        aimCarriesJitter = shieldDetector.shielded();
        if (aimCarriesJitter) {
            // SHIELD-2: a shielder predicts our heading exactly; move it by an amount it can't.
            aimAngle += aimJitter.offset(myNext.distance(lastGunWave.targetLocation));
        }
        orders.turnGunRight(Angles.normalRelativeAngle(aimAngle - in.gunHeading()));
        return gunHeat;
    }

    /** Fires if the gun is cool and on target; returns whether it fired. */
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
     */
    private void reacquire(BotInput in, BotOrders.Builder orders) {
        double toEnemy = Angles.normalRelativeAngle(lastEnemyAbsBearing - in.radarHeading());
        orders.turnRadarRight(toEnemy < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
        stats.radarReacquired++;
    }

    private void onScan(BotInput in, BotEvent.Scan e, BotOrders.Builder orders) {
        long time = in.time();
        Point2D.Double myPos = in.location();
        double absBearing = Angles.normalAbsoluteAngle(in.heading() + e.bearing());
        Point2D.Double enemyPos = DiaUtils.project(myPos, absBearing, e.distance());
        meleeEvent(() -> melee.onScan(e.name(), enemyPos, e.distance(), e.energy(), e.heading(),
            e.velocity(), time));
        if (inMelee) return;
        // With several opponents alive the duel fights one and ignores the others.
        if (focusing && !e.name().equals(focusTarget(myPos))) return;
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
        if (!announced) {
            announced = true;
            announce(round, time, e.name());
        }
        if (folder != null) {
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

        if (enemyVel != 0) enemyVelocitySign = enemyVel > 0 ? 1 : -1;
        if (myVel != 0) myVelocitySign = myVel > 0 ? 1 : -1;

        double enemyAccel = DiaUtils.accel(enemyVel, prevEnemyVelocity);
        double myAccel = DiaUtils.accel(myVel, prevMyVelocity);

        if (Math.abs(enemyVel - prevEnemyVelocity) > 0.5) enemyVchangeTime = 0;
        else enemyVchangeTime++;
        if (Math.abs(myVel - prevMyVelocity) > 0.5) myVchangeTime = 0;
        else myVchangeTime++;

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
            long fireTime = moveController.updateFiringWave(previousScanTime, time,
                reading.corrected());
            stats.enemyShotsDetected++;
            enemyGunHeat(in).shot(fireTime, reading.corrected());
            if (folder != null) folder.enemyShot(e.distance(), reading.corrected(), myVel != 0);
            telemetry.emit(String.format(Locale.ROOT,
                "EW,%d,%d,%d,%d,%.4f,%.4f,%.4f,%.1f", round, time, fireTime, fireTime,
                reading.raw(), reading.corrected(), reading.corrected(), e.distance()));
        }

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
        if (library != null) {
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
        distance = new DistancePolicy(opening.distance());
        emitPolicy(round, time, "distance", Double.NaN, Double.NaN,
            opening.gunTier() + ":" + Math.round(opening.distance()));
        gunController.setSampleSink(folder::gunSample);
        moveController.setSampleSink(folder::surfSample);
        if (opening.gun() != Opening.Gun.LIVE) {
            gunController.setOpening(opening.gun() == Opening.Gun.ANTI_SURFER
                ? GunController.Opening.ANTI_SURFER : GunController.Opening.MAIN);
        }
        Estimate prior = opening.surfPrior();
        if (!Double.isNaN(prior.value())) moveController.setPrior(prior.value(), prior.margin());
        moveController.setFlattenerFirst(opening.flattenerFirst());
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
        double[] v = gunController.virtualGunScores(opponentName);
        Estimate live = Estimate.of(v[1], v[0]);
        boolean trusted = !gunSeedTrust.distrusted();
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
        for (boolean hit : moveController.takeBrokenWaveOutcomes()) {
            theirWindow.record(hit);
            MoveFlavour.Step added = flavour.onWave(hit);
            if (added != null) changeFlavour(in, added);
            Estimate ours = ourWindow.estimate();
            Estimate theirs = theirWindow.estimate();
            if (distance.onWave(ours, theirs) != DistancePolicy.Step.HOLD) {
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

    /** TIME-1: the adapter's measure of the previous tick. */
    private void onTickTime(BotEvent.TickTime e) {
        int before = budget.level();
        budget.tickTook(e.usedNanos(), e.allowanceNanos());
        stats.computationLevel = budget.maxLevel();
        stats.slowTicks = budget.slowTicks();
        if (budget.level() != before) emitBudget();
    }

    private void emitBudget() {
        emitPolicy(round, lastTickTime, "budget", budget.level(), Double.NaN,
            "level-" + budget.level());
    }

    private EnemyGunHeat enemyGunHeat(BotInput in) {
        if (enemyGunHeat == null) enemyGunHeat = new EnemyGunHeat(in.gunCoolingRate());
        return enemyGunHeat;
    }

    /** S5: the distance the surf is steering to now. */
    public double targetDistance() {
        return surfMover.desiredDistance();
    }

    /** S6: the tick budget's computation level for the next tick (TIME-1, TIME-2). */
    public int computationLevel() {
        return budget.level();
    }

    /** S6: the movement flavour reached (MOVE-2). */
    public MoveFlavour.Step moveFlavour() {
        return flavour.step();
    }

    /** S6: how the surf picks its spot for the wave being surfed. */
    public SurfMover.Mode surfMode() {
        return surfMover.mode();
    }

    /** S6: enemy firing waves one of our bullets has shadowed this round (MOVE-1). */
    public int shadowedWaves() {
        return moveController.shadowedWaves();
    }

    /** MOVE-1: how many times a wave's shadows were computed this round. */
    public int shadowComputations() {
        return moveController.shadowComputations();
    }

    /** S5: the endgame state as of the last duel tick. */
    public Endgame.State endgame() {
        return endgame;
    }

    /** S5: our and their rolling hit rates. */
    public Estimate ourRollingHitRate() {
        return ourWindow.estimate();
    }

    public Estimate theirRollingHitRate() {
        return theirWindow.estimate();
    }

    private void emitPolicy(int round, long time, String policy, double value, double margin,
                            String setting) {
        telemetry.emit(String.format(Locale.ROOT, "P,%d,%d,%s,%s,%s,%s", round, time, policy,
            Double.isNaN(value) ? "-" : String.format(Locale.ROOT, "%.4f", value),
            Double.isNaN(margin) ? "-" : String.format(Locale.ROOT, "%.4f", margin), setting));
    }

    private void onBulletHit(BotEvent.BulletHit e) {
        stats.shotsHit++;
        moveController.ourBulletGone(e.bulletHeading(), e.power());
        if (gate.isSentry(e.name())) sentryHits++;
        boolean foreign = foreign(e.name());
        if (duelBulletResolved() && !foreign) {
            shieldDetector.bulletHit();
            ourWindow.record(true);
        }
        if (foreign) return;
        if (folder != null && !inMelee) folder.ourHit(lastEnemyDistance, Rules.getBulletDamage(e.power()));
        meleeEvent(() -> melee.onBulletHit(e.name(), e.power()));
        ledger.ourBulletHit(e.power());
    }

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
        Point2D.Double bulletLoc = new Point2D.Double(e.x(), e.y());
        Wave hitWave = moveController.findBulletWave(bulletLoc, in.time(), e.name(), e.power());
        if (hitWave != null) {
            hitWave.hitByBullet = true;
            moveController.logBulletHit(hitWave, bulletLoc, round, in.time());
        }
        if (folder != null && !inMelee) {
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

    private void onBulletMissed(BotEvent.BulletMissed e) {
        moveController.ourBulletGone(e.bulletHeading(), e.power());
        if (duelBulletResolved()) {
            shieldDetector.bulletMissed();
            ourWindow.record(false);
        }
    }

    private void onBulletHitBullet(BotInput in, BotEvent.BulletHitBullet e) {
        stats.bulletsIntercepted++;
        moveController.ourBulletGone(e.bulletHeading(), e.power());
        // SHIELD-1: in a duel, a bullet that meets ours may be a shield.
        if (duelBulletResolved()) {
            shieldDetector.bulletIntercepted();
            ourWindow.record(false);
        }
        Point2D.Double hitLoc = new Point2D.Double(e.x(), e.y());
        Wave hitWave = moveController.findBulletWave(hitLoc, in.time(), null, e.enemyPower());
        if (hitWave != null) {
            // MOVE-1's check on itself: the bullet ours destroyed should have been in a shadow.
            if (hitWave.inShadow(DiaUtils.absoluteBearing(hitWave.sourceLocation, hitLoc), 1e-3)) {
                stats.interceptsShadowed++;
            }
            hitWave.bulletHitBullet = true;
        }
    }

    private void onSkippedTurn(BotInput in) {
        stats.skippedTurns++;
        // TIME-2: one level down for the rest of the round.
        budget.skippedTurn();
        stats.computationLevel = budget.maxLevel();
        emitBudget();
        telemetry.emit("WARNING: Turn skipped at " + in.time());
    }

    private static long ticksUntilGunCool(double gunHeat, BotInput in) {
        return Math.round(Math.ceil(gunHeat / in.gunCoolingRate()));
    }

    private static RobotState currentState(BotInput in) {
        return RobotState.newBuilder()
            .setLocation(in.location())
            .setHeading(in.heading())
            .setVelocity(in.velocity())
            .setTime(in.time()).build();
    }
}
