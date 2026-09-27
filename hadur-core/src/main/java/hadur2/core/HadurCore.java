package hadur2.core;

import hadur2.core.gun.GunController;
import hadur2.core.ledger.EnergyLedger;
import hadur2.core.melee.BattleMode;
import hadur2.core.melee.MeleeController;
import hadur2.core.memory.LineageKey;
import hadur2.core.memory.ProfileFolder;
import hadur2.core.memory.ProfileLibrary;
import hadur2.core.memory.Tiers;
import hadur2.core.model.*;
import hadur2.core.move.MoveController;
import hadur2.core.move.SurfMover;
import hadur2.core.physics.*;
import hadur2.core.port.ProfileStore;
import hadur2.core.port.Telemetry;
import hadur2.core.shield.AimJitter;
import hadur2.core.shield.ShieldDetector;
import java.awt.geom.Point2D;
import java.util.Locale;

/**
 * Hadur's brain. One instance lives for a whole battle; {@link #tick} turns each
 * {@link BotInput} into {@link BotOrders}. It never touches the Robocode API (CORE-1) and
 * holds no randomness, threads, reflection or I/O (RES-6), so the same inputs always
 * give the same orders (CORE-2).
 *
 * <p>Per tick it handles the tick's events first, then runs the main loop body, the same
 * order in which Robocode runs event handlers and then {@code run()}.</p>
 *
 * <p>While two or more opponents are alive the {@link MeleeController} drives (MELEE-1);
 * once one is left, the duel machinery below takes over from a clean slate (MELEE-2).</p>
 *
 * <p>In a duel with a {@link ProfileStore}, the first scan loads the opponent's profile
 * (MEM-1), each round's observations are folded into it when the round ends (MEM-2), and
 * {@link #saveProfile} persists it (MEM-3). In S3 the profile is only recorded: nothing it
 * holds changes an order. Melee battles neither load nor save profiles.</p>
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

    public HadurCore(double fieldWidth, double fieldHeight, int enemiesTotal, Telemetry telemetry) {
        this(fieldWidth, fieldHeight, enemiesTotal, telemetry, null);
    }

    /** A core that remembers opponents in {@code store} (null for none). */
    public HadurCore(double fieldWidth, double fieldHeight, int enemiesTotal, Telemetry telemetry,
                     ProfileStore store) {
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
        this.melee = new MeleeController(battleField);
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
        // MELEE-1: melee while more than one opponent is alive, a duel otherwise.
        boolean melee = BattleMode.fromOthers(in.others()) == BattleMode.MELEE;
        if (inMelee && !melee) {
            // MELEE-2: the survivor was never tracked as a duel opponent; start fresh.
            resetDuelTracking();
            orders.maxVelocity(Rules.MAX_VELOCITY);
        }
        inMelee = melee;

        for (BotEvent e : in.events()) {
            if (e instanceof BotEvent.Scan) onScan(in, (BotEvent.Scan) e, orders);
            else if (e instanceof BotEvent.HitByBullet) onHitByBullet(in, (BotEvent.HitByBullet) e);
            else if (e instanceof BotEvent.BulletHitBullet) onBulletHitBullet(in, (BotEvent.BulletHitBullet) e);
            else if (e instanceof BotEvent.BulletHit) onBulletHit((BotEvent.BulletHit) e);
            else if (e instanceof BotEvent.BulletMissed) onBulletMissed();
            else if (e instanceof BotEvent.HitRobot) ledger.robotsCollided();
            else if (e instanceof BotEvent.RobotDeath) this.melee.onRobotDeath(((BotEvent.RobotDeath) e).name());
            else if (e instanceof BotEvent.SkippedTurn) onSkippedTurn(in);
        }

        if (melee) {
            meleeTick(in, orders);
        } else if (lastGunWave != null) {
            aimAndFire(in, orders);
            moveController.checkWaves(in.time(), in.location());
            surfMover.move(orders, currentState(in), moveController, lastEnemyLocation, 2);
            if (in.time() - lastScanTime > 1) reacquire(in, orders);
        } else {
            orders.turnRadarRight(Double.POSITIVE_INFINITY);
        }
        return orders.build();
    }

    /**
     * MELEE-3..8: one tick of melee. The shot aimed last tick goes out first if the gun got
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
            in.others()));
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
        foldRound(tick, "win".equals(result));
        if (library != null) {
            stats.profileLoadFailures = library.loadFailures();
            stats.profileSaveFailures = library.saveFailures() + library.skippedWrites();
            stats.seedsEvicted = library.seedsEvicted();
        }
        telemetry.emit(stats.toRecord(round, tick, result, myEnergy, lastEnemyEnergy));
        return stats;
    }

    /** MEM-2: the round's observations join the profile. A failure here is counted, never thrown. */
    private void foldRound(long tick, boolean won) {
        if (folder == null) return;
        try {
            double[] v = gunController.virtualGunScores(opponentName);
            folder.virtualGuns(v[0], v[1], v[2], v[3]);
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

    private static String clean(String s) {
        return s.replace(',', ';').replace('\n', ' ');
    }

    private void aimAndFire(BotInput in, BotOrders.Builder orders) {
        Point2D.Double myNext = predictor.nextLocation(currentState(in));
        // In 1.20, setFireBullet heated the gun at once (the engine's proxy adds the new
        // shot's heat to getGunHeat()), so the aim below saw the hot gun.
        double gunHeat = in.gunHeat();
        if (fireIfGunTurned(in, orders, aimedBulletPower, myNext)) {
            double firedPower = Math.min(in.energy(), Math.min(
                Math.max(aimedBulletPower, Rules.MIN_BULLET_POWER), Rules.MAX_BULLET_POWER));
            gunHeat += Rules.getGunHeat(firedPower);
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
    }

    /** Fires if the gun is cool and on target; returns whether it fired. */
    private boolean fireIfGunTurned(BotInput in, BotOrders.Builder orders, double bulletPower,
                                    Point2D.Double myNext) {
        // 1.20 compared getGunTurnRemaining(), which is in degrees, with 0.05, so the gun
        // has to be within 0.05 degrees. Kept exactly as it was; S1 changes no behaviour.
        // SHIELD-2: once a shielder is found, hold the shot the gun settled on before, since
        // that aim is the predictable one.
        boolean predictable = shieldDetector.shielded() && !aimCarriesJitter;
        if (in.gunHeat() == 0 && Math.abs(Math.toDegrees(in.gunTurnRemaining())) < 0.05
                && in.energy() > bulletPower && lastGunWave != null && !predictable) {
            orders.fire(bulletPower);
            lastGunWave.firingWave = true;
            gunController.fireVirtualBullets(lastGunWave, myNext, in.time());
            lastRealBulletFireTime = in.time();
            stats.shotsFired++;
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
        melee.onScan(e.name(), enemyPos, e.distance(), e.energy(), e.heading(), e.velocity(), time);
        if (inMelee) return;
        long previousScanTime = lastScanTime;
        lastScanTime = time;
        lastEnemyAbsBearing = absBearing;
        lastEnemyLocation = enemyPos;
        lastEnemyEnergy = e.energy();
        lastEnemyDistance = e.distance();
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
    }

    private void onBulletHit(BotEvent.BulletHit e) {
        stats.shotsHit++;
        if (duelBulletResolved()) shieldDetector.bulletHit();
        if (folder != null && !inMelee) folder.ourHit(lastEnemyDistance, Rules.getBulletDamage(e.power()));
        melee.onBulletHit(e.name(), e.power());
        ledger.ourBulletHit(e.power());
    }

    private void onHitByBullet(BotInput in, BotEvent.HitByBullet e) {
        stats.hitsTaken++;
        ledger.enemyBulletHitUs(e.power());
        melee.onHitByBullet(e.name(), e.power(), e.heading(), in.location(), in.time());
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

    private void onBulletMissed() {
        if (duelBulletResolved()) shieldDetector.bulletMissed();
    }

    private void onBulletHitBullet(BotInput in, BotEvent.BulletHitBullet e) {
        stats.bulletsIntercepted++;
        // SHIELD-1: in a duel, a bullet that meets ours may be a shield.
        if (duelBulletResolved()) shieldDetector.bulletIntercepted();
        Point2D.Double hitLoc = new Point2D.Double(e.x(), e.y());
        Wave hitWave = moveController.findBulletWave(hitLoc, in.time(), null, e.enemyPower());
        if (hitWave != null) {
            hitWave.bulletHitBullet = true;
        }
    }

    private void onSkippedTurn(BotInput in) {
        stats.skippedTurns++;
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
