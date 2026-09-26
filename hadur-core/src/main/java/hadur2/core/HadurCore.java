package hadur2.core;

import hadur2.core.gun.GunController;
import hadur2.core.ledger.EnergyLedger;
import hadur2.core.model.*;
import hadur2.core.move.MoveController;
import hadur2.core.move.SurfMover;
import hadur2.core.physics.*;
import hadur2.core.port.Telemetry;
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

    public HadurCore(double fieldWidth, double fieldHeight, int enemiesTotal, Telemetry telemetry) {
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
        for (BotEvent e : in.events()) {
            if (e instanceof BotEvent.Scan s) onScan(in, s, orders);
            else if (e instanceof BotEvent.HitByBullet h) onHitByBullet(in, h);
            else if (e instanceof BotEvent.BulletHitBullet b) onBulletHitBullet(in, b);
            else if (e instanceof BotEvent.BulletHit b) onBulletHit(b);
            else if (e instanceof BotEvent.HitRobot r) ledger.robotsCollided();
            else if (e instanceof BotEvent.SkippedTurn s) onSkippedTurn(in);
        }

        if (in.others() <= 1 && lastGunWave != null) {
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
     * Emits the round-end record and returns this round's statistics. {@code result} is
     * {@code win}, {@code loss} or {@code draw}; {@code faults} is the number of ticks the
     * {@link Guard} had to cover for this round.
     */
    public RoundStats roundEnded(long tick, String result, double myEnergy, int faults) {
        stats.faults = faults;
        telemetry.emit(stats.toRecord(round, tick, result, myEnergy, lastEnemyEnergy));
        return stats;
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
        }

        aimedBulletPower = lastGunWave.bulletPower();
        double aimAngle;
        if (lastGunWave.targetEnergy == 0 || ticksUntilGunCool(gunHeat, in) > 3) {
            aimAngle = DiaUtils.absoluteBearing(myNext, lastGunWave.targetLocation);
        } else {
            aimAngle = gunController.aim(lastGunWave, myNext, in.time());
        }
        orders.turnGunRight(Angles.normalRelativeAngle(aimAngle - in.gunHeading()));
    }

    /** Fires if the gun is cool and on target; returns whether it fired. */
    private boolean fireIfGunTurned(BotInput in, BotOrders.Builder orders, double bulletPower,
                                    Point2D.Double myNext) {
        // 1.20 compared getGunTurnRemaining(), which is in degrees, with 0.05, so the gun
        // has to be within 0.05 degrees. Kept exactly as it was; S1 changes no behaviour.
        if (in.gunHeat() == 0 && Math.abs(Math.toDegrees(in.gunTurnRemaining())) < 0.05
                && in.energy() > bulletPower && lastGunWave != null) {
            orders.fire(bulletPower);
            lastGunWave.firingWave = true;
            gunController.fireVirtualBullets(lastGunWave, myNext, in.time());
            lastRealBulletFireTime = in.time();
            stats.shotsFired++;
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
        long previousScanTime = lastScanTime;
        lastScanTime = time;
        lastEnemyAbsBearing = absBearing;
        Point2D.Double enemyPos = DiaUtils.project(myPos, absBearing, e.distance());
        lastEnemyLocation = enemyPos;
        lastEnemyEnergy = e.energy();
        if (!announced) {
            // Opponent memory arrives in S3; for now B records the name only.
            telemetry.emit("B," + round + "," + time + ",-," + e.name() + "," + e.name()
                + ",0,-,0,0," + stats.computationLevel);
            announced = true;
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
            telemetry.emit(String.format(Locale.ROOT,
                "EW,%d,%d,%d,%d,%.4f,%.4f,%.4f,%.1f", round, time, fireTime, fireTime,
                reading.raw(), reading.corrected(), reading.corrected(), e.distance()));
        }

        orders.turnRadarRight(Angles.normalRelativeAngle(absBearing - in.radarHeading()) * 2.0);

        prevEnemyVelocity = enemyVel;
        prevMyVelocity = myVel;
    }

    private void onBulletHit(BotEvent.BulletHit e) {
        stats.shotsHit++;
        ledger.ourBulletHit(e.power());
    }

    private void onHitByBullet(BotInput in, BotEvent.HitByBullet e) {
        stats.hitsTaken++;
        ledger.enemyBulletHitUs(e.power());
        Point2D.Double bulletLoc = new Point2D.Double(e.x(), e.y());
        Wave hitWave = moveController.findBulletWave(bulletLoc, in.time(), e.name(), e.power());
        if (hitWave != null) {
            hitWave.hitByBullet = true;
            moveController.logBulletHit(hitWave, bulletLoc, round, in.time());
        }
    }

    private void onBulletHitBullet(BotInput in, BotEvent.BulletHitBullet e) {
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
