package hadur117;

import hadur117.gun.GunController;
import hadur117.move.MoveController;
import hadur117.move.SurfMover;
import hadur117.utils.*;
import java.awt.Color;
import java.awt.geom.Point2D;
import robocode.*;
import robocode.util.Utils;

public class Hadur extends AdvancedRobot {

    private static BattleField battleField;
    private static MovementPredictor predictor;
    private static GunController gunController;
    private static MoveController moveController;
    private static SurfMover surfMover;
    private static WaveManager gunWaveManager;
    private static RobotStateLog myStateLog;
    private static RobotStateLog enemyStateLog;
    private static int roundsWon, roundsPlayed;

    private Wave lastGunWave;
    private Point2D.Double lastEnemyLocation;
    private double prevEnemyEnergy;
    private int enemyVelocitySign;
    private int myVelocitySign;
    private double prevEnemyVelocity;
    private double prevMyVelocity;
    private long enemyVchangeTime;
    private long myVchangeTime;
    private boolean firstScan;
    private double aimedBulletPower;
    private long lastRealBulletFireTime;

    @Override
    public void run() {
        initComponents();
        initRound();

        setBodyColor(new Color(139, 0, 0));
        setGunColor(new Color(218, 165, 32));
        setRadarColor(new Color(178, 34, 34));
        setBulletColor(new Color(255, 69, 0));
        setScanColor(new Color(255, 140, 0));

        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);

        while (true) {
            if (is1v1() && lastGunWave != null) {
                aimAndFire();
                moveController.checkWaves(getTime(), myLocation());
                surfMover.move(this, currentRobotState(), moveController,
                    lastEnemyLocation, 2);
            } else {
                setTurnRadarRightRadians(Double.POSITIVE_INFINITY);
            }
            execute();
        }
    }

    private void initComponents() {
        if (battleField == null) {
            battleField = new BattleField(getBattleFieldWidth(), getBattleFieldHeight());
            predictor = new MovementPredictor(battleField);
            gunController = new GunController(battleField, getOthers());
            moveController = new MoveController(battleField, predictor);
            surfMover = new SurfMover(battleField, predictor);
            gunWaveManager = new WaveManager();
            myStateLog = new RobotStateLog();
            enemyStateLog = new RobotStateLog();
        }
    }

    private void initRound() {
        gunController.initRound();
        moveController.initRound();
        surfMover.initRound();
        gunWaveManager.initRound();
        myStateLog.clear();
        enemyStateLog.clear();

        lastGunWave = null;
        lastEnemyLocation = null;
        prevEnemyEnergy = 100;
        enemyVelocitySign = 1;
        myVelocitySign = 1;
        prevEnemyVelocity = 0;
        prevMyVelocity = 0;
        enemyVchangeTime = 0;
        myVchangeTime = 0;
        firstScan = true;
        aimedBulletPower = 1.9;
        lastRealBulletFireTime = 0;
    }

    private void aimAndFire() {
        Point2D.Double myNext = predictor.nextLocation(currentRobotState());
        fireIfGunTurned(aimedBulletPower, myNext);

        aimedBulletPower = lastGunWave.bulletPower();
        double aimAngle;

        if (lastGunWave.targetEnergy == 0 || ticksUntilGunCool() > 3) {
            aimAngle = DiaUtils.absoluteBearing(myNext, lastGunWave.targetLocation);
        } else {
            aimAngle = gunController.aim(lastGunWave, myNext, getTime());
        }

        setTurnGunRightRadians(Utils.normalRelativeAngle(
            aimAngle - getGunHeadingRadians()));
    }

    private void fireIfGunTurned(double bulletPower, Point2D.Double myNext) {
        if (getGunHeat() == 0 && Math.abs(getGunTurnRemaining()) < 0.05
                && getEnergy() > bulletPower && lastGunWave != null) {
            Bullet bullet = setFireBullet(bulletPower);
            if (bullet != null) {
                lastGunWave.firingWave = true;
                gunController.fireVirtualBullets(lastGunWave, myNext, getTime());
                lastRealBulletFireTime = getTime();
            }
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        Point2D.Double myPos = myLocation();
        double absBearing = Utils.normalAbsoluteAngle(
            getHeadingRadians() + e.getBearingRadians());
        Point2D.Double enemyPos = DiaUtils.project(myPos, absBearing, e.getDistance());
        lastEnemyLocation = enemyPos;

        double enemyVel = e.getVelocity();
        double enemyHead = e.getHeadingRadians();
        double myVel = getVelocity();
        double myHead = getHeadingRadians();

        RobotState myState = RobotState.newBuilder()
            .setLocation(myPos).setHeading(myHead)
            .setVelocity(myVel).setTime(getTime()).build();
        myStateLog.addState(myState);

        RobotState enemyState = RobotState.newBuilder()
            .setLocation(enemyPos).setHeading(enemyHead)
            .setVelocity(enemyVel).setTime(getTime()).build();
        enemyStateLog.addState(enemyState);

        if (enemyVel != 0) enemyVelocitySign = enemyVel > 0 ? 1 : -1;
        if (myVel != 0) myVelocitySign = myVel > 0 ? 1 : -1;

        double enemyAccel = DiaUtils.accel(enemyVel, prevEnemyVelocity);
        double myAccel = DiaUtils.accel(myVel, prevMyVelocity);

        if (Math.abs(enemyVel - prevEnemyVelocity) > 0.5) enemyVchangeTime = 0;
        else enemyVchangeTime++;
        if (Math.abs(myVel - prevMyVelocity) > 0.5) myVchangeTime = 0;
        else myVchangeTime++;

        double eDl8 = enemyStateLog.getDisplacementDistance(enemyPos, getTime(), 8);
        double eDl20 = enemyStateLog.getDisplacementDistance(enemyPos, getTime(), 20);
        double eDl40 = enemyStateLog.getDisplacementDistance(enemyPos, getTime(), 40);
        double mDl8 = myStateLog.getDisplacementDistance(myPos, getTime(), 8);
        double mDl20 = myStateLog.getDisplacementDistance(myPos, getTime(), 20);
        double mDl40 = myStateLog.getDisplacementDistance(myPos, getTime(), 40);

        double bulletPower = gunController.calculateBulletPower(
            e.getDistance(), getEnergy(), e.getEnergy(), getOthers());

        lastGunWave = new Wave(e.getName(), myPos, enemyPos,
            getRoundNum(), getTime(), bulletPower,
            enemyHead, enemyVel, enemyVelocitySign,
            battleField, predictor);
        lastGunWave.setAccel(enemyAccel)
            .setDistance(e.getDistance())
            .setVchangeTime(enemyVchangeTime)
            .setDistanceLast8Ticks(eDl8)
            .setDistanceLast20Ticks(eDl20)
            .setDistanceLast40Ticks(eDl40)
            .setTargetEnergy(e.getEnergy())
            .setSourceEnergy(getEnergy())
            .setGunHeat(getGunHeat())
            .setEnemiesAlive(getOthers())
            .setLastBulletFiredTime(lastRealBulletFireTime);
        lastGunWave.setWallDistances();
        gunWaveManager.addWave(lastGunWave);

        gunWaveManager.checkActiveWaves(getTime(), enemyState,
            (w, bs) -> gunController.onWaveBreak(w, bs));

        double guessPower = moveController.guessBulletPower();
        Wave moveWave = new Wave(e.getName(), enemyPos, myPos,
            getRoundNum(), getTime(), guessPower,
            myHead, myVel, myVelocitySign,
            battleField, predictor);
        moveWave.setAccel(myAccel)
            .setDistance(e.getDistance())
            .setVchangeTime(myVchangeTime)
            .setDistanceLast8Ticks(mDl8)
            .setDistanceLast20Ticks(mDl20)
            .setDistanceLast40Ticks(mDl40)
            .setTargetEnergy(getEnergy())
            .setSourceEnergy(e.getEnergy());
        moveWave.setWallDistances();
        moveController.addWave(moveWave);

        if (!firstScan) {
            double energyDelta = prevEnemyEnergy - e.getEnergy();
            if (energyDelta >= 0.1 && energyDelta <= 3.0) {
                moveController.updateFiringWave(getTime(), energyDelta);
            }
        }

        setTurnRadarRightRadians(Utils.normalRelativeAngle(
            absBearing - getRadarHeadingRadians()) * 2.0);

        prevEnemyVelocity = enemyVel;
        prevMyVelocity = myVel;
        prevEnemyEnergy = e.getEnergy();
        firstScan = false;
    }

    @Override
    public void onHitByBullet(HitByBulletEvent e) {
        Point2D.Double bulletLoc = new Point2D.Double(
            e.getBullet().getX(), e.getBullet().getY());
        Wave hitWave = moveController.findBulletWave(
            bulletLoc, getTime(), e.getName(), e.getPower());
        if (hitWave != null) {
            hitWave.hitByBullet = true;
            moveController.logBulletHit(hitWave, bulletLoc,
                getRoundNum(), getTime());
        }
    }

    @Override
    public void onBulletHitBullet(BulletHitBulletEvent e) {
        Point2D.Double hitLoc = new Point2D.Double(
            e.getHitBullet().getX(), e.getHitBullet().getY());
        Wave hitWave = moveController.findBulletWave(
            hitLoc, getTime(), null, e.getHitBullet().getPower());
        if (hitWave != null) {
            hitWave.bulletHitBullet = true;
        }
    }

    @Override
    public void onRobotDeath(RobotDeathEvent e) {}

    @Override
    public void onWin(WinEvent e) {
        roundsWon++;
        roundsPlayed++;
    }

    @Override
    public void onDeath(DeathEvent e) {
        roundsPlayed++;
    }

    @Override
    public void onSkippedTurn(SkippedTurnEvent e) {
        out.println("WARNING: Turn skipped at " + e.getTime());
    }

    private boolean is1v1() {
        return getOthers() <= 1;
    }

    private Point2D.Double myLocation() {
        return new Point2D.Double(getX(), getY());
    }

    private long ticksUntilGunCool() {
        return Math.round(Math.ceil(getGunHeat() / getGunCoolingRate()));
    }

    private RobotState currentRobotState() {
        return RobotState.newBuilder()
            .setLocation(myLocation())
            .setHeading(getHeadingRadians())
            .setVelocity(getVelocity())
            .setTime(getTime()).build();
    }
}
