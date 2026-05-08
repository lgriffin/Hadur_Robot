package hadur117;

import hadur117.model.BattleMode;
import hadur117.model.OpponentData;
import hadur117.intel.Brain;
import hadur117.intel.MeleeTargetSelector;
import hadur117.intel.TargetProfile;
import hadur117.gun.Gun;
import hadur117.movement.WaveSurfer;
import hadur117.movement.MinimumRiskMovement;
import hadur117.radar.Radar;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;
import java.io.IOException;

/**
 * Main robot class — orchestrates radar, gun, movement, and intelligence subsystems.
 *
 * <p>Automatically detects battle mode ({@link BattleMode#DUEL DUEL} vs
 * {@link BattleMode#MELEE MELEE}) based on the number of opponents and transitions
 * from melee to duel when only one opponent remains. Wall-hit counters and per-round
 * win tracking are maintained here for analytics output.</p>
 *
 * @author lgriffin
 * @version 1.17
 */
public class Hadur extends AdvancedRobot {

    private Radar radar;
    private Gun gun;
    private WaveSurfer waveSurfer;
    private MinimumRiskMovement minimumRisk;
    private Brain brain;
    private MeleeTargetSelector targetSelector;

    private BattleMode battleMode = BattleMode.DUEL;
    private boolean enemyDetected = false;
    private int scanTimer = 0;
    private String duelOpponentName;

    private int wallHits = 0;
    private double wallDamage = 0;

    static int roundsPlayed = 0;
    static int roundsWon = 0;

    public void run() {
        setBodyColor(new Color(139, 0, 0));
        setGunColor(new Color(218, 165, 32));
        setRadarColor(new Color(178, 34, 34));
        setBulletColor(new Color(255, 69, 0));
        setScanColor(new Color(255, 140, 0));

        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);

        radar = new Radar();
        gun = new Gun();
        waveSurfer = new WaveSurfer();
        minimumRisk = new MinimumRiskMovement();
        brain = new Brain();
        targetSelector = new MeleeTargetSelector();

        double bfW = getBattleFieldWidth();
        double bfH = getBattleFieldHeight();
        gun.init(bfW, bfH);
        waveSurfer.init(bfW, bfH);
        minimumRisk.init(bfW, bfH);

        brain.resetRound();
        targetSelector.resetRound();
        radar.resetRound();
        gun.clearMeleeState();

        battleMode = getOthers() > 1 ? BattleMode.MELEE : BattleMode.DUEL;
        brain.setBattleMode(getOthers());

        if (getRoundNum() == 0) {
            try {
                String timestamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss")
                        .format(new java.util.Date());
                java.io.File logFile = getDataFile("hadur_battle_" + timestamp + ".log");
                out.println("[Hadur] Log file: " + logFile.getAbsolutePath());
                BattleLogger.init(new RobocodeFileOutputStream(logFile));
            } catch (IOException e) {
                out.println("[Hadur] Failed to init logger: " + e.getMessage());
            }
        }
        BattleLogger.logRoundStart(getRoundNum(), battleMode.name(), getOthers());

        do {
            scanTimer++;

            if (battleMode == BattleMode.DUEL) {
                runDuelTick();
            } else {
                runMeleeTick();
            }

            execute();
        } while (true);
    }

    private void runDuelTick() {
        if (!enemyDetected || scanTimer > 2) {
            radar.spinRadar(this);
            if (!enemyDetected) {
                setAhead(100);
                setTurnRight(10);
            }
        }
        if (enemyDetected) {
            String gunType = "UNKNOWN";
            if (duelOpponentName != null) {
                gunType = brain.getProfile(duelOpponentName).gunType;
            }
            waveSurfer.doSurfing(this, gunType);
        }
    }

    private void runMeleeTick() {
        if (getOthers() == 1 && battleMode == BattleMode.MELEE) {
            BattleLogger.logModeTransition(getTime(), "MELEE", "DUEL");
            battleMode = BattleMode.DUEL;
            brain.setBattleMode(1);
        }

        if (battleMode == BattleMode.DUEL) {
            runDuelTick();
            return;
        }

        radar.spinRadar(this);
        minimumRisk.doMinimumRisk(this, brain);
    }

    // ── Events ──────────────────────────────────────────────────────────

    public void onScannedRobot(ScannedRobotEvent e) {
        scanTimer = 0;
        enemyDetected = true;

        brain.update(e, getX(), getY(), getHeadingRadians(), getTime());

        if (battleMode == BattleMode.DUEL) {
            duelOpponentName = e.getName();
            TargetProfile profile = brain.getProfile(e.getName());
            boolean fired = gun.onScannedRobot(this, e, profile);
            if (fired) {
                brain.recordOurFire(getTime());
                brain.recordShotFiredAt(e.getName());
                BattleLogger.logFire(getTime(), e.getName(),
                        gun.getLastFirePower(), gun.getActiveGunName());
            }
            waveSurfer.onScannedRobot(this, e);
            radar.doDuelRadar(this,
                    getHeadingRadians() + e.getBearingRadians());
        } else {
            String oldTarget = targetSelector.getCurrentTarget();
            String target = targetSelector.selectTarget(this, brain);
            if (target != null && !target.equals(oldTarget) && oldTarget != null) {
                BattleLogger.logTargetSwitch(getTime(), oldTarget, target);
            }
            if (target != null) {
                TargetProfile profile = brain.getProfile(target);
                boolean fired = gun.onScannedRobotMelee(this, e, target,
                        e.getName(), profile);
                if (fired) {
                    brain.recordOurFire(getTime());
                    brain.recordShotFiredAt(target);
                    BattleLogger.logFire(getTime(), target,
                            gun.getLastFirePower(), gun.getActiveGunName());
                }
            }
        }
    }

    public void onBulletHit(BulletHitEvent e) {
        gun.onBulletHit(e);
        brain.recordShotHitOn(e.getName());
        brain.recordDamageDealt(e.getName(),
                Rules.getBulletDamage(e.getBullet().getPower()));
    }

    public void onBulletMissed(BulletMissedEvent e) {
        gun.onBulletMissed(e);
    }

    public void onHitByBullet(HitByBulletEvent e) {
        if (battleMode == BattleMode.DUEL) {
            waveSurfer.onHitByBullet(this, e);
        }
        brain.recordDamageReceived(e.getName(),
                Rules.getBulletDamage(e.getBullet().getPower()));

        OpponentData attacker = brain.getOpponent(e.getName());
        if (attacker != null && attacker.lastScanTick >= 0) {
            double directBearing = Math.atan2(
                    getX() - attacker.x, getY() - attacker.y);
            double bulletHeading = e.getHeadingRadians();
            double error = Utils.normalRelativeAngle(
                    bulletHeading - directBearing);
            brain.recordHitBearingError(e.getName(), error);
        }
    }

    public void onHitWall(HitWallEvent e) {
        wallHits++;
        wallDamage += Math.max(0, Math.abs(getVelocity()) * 0.5 - 1);
        waveSurfer.onHitWall();
    }

    public void onRobotDeath(RobotDeathEvent e) {
        brain.removeOpponent(e.getName());
        targetSelector.onRobotDeath(e.getName());

        if (getOthers() == 1 && battleMode == BattleMode.MELEE) {
            BattleLogger.logModeTransition(getTime(), "MELEE", "DUEL");
            battleMode = BattleMode.DUEL;
            brain.setBattleMode(1);
        }
    }

    public void onWin(WinEvent e) {
        roundsPlayed++;
        roundsWon++;
        printRoundSummary("WIN");
        if (getRoundNum() == getNumRounds() - 1) printAggregateSummary();
    }

    public void onDeath(DeathEvent e) {
        roundsPlayed++;
        printRoundSummary("LOSS");
        if (getRoundNum() == getNumRounds() - 1) printAggregateSummary();
    }

    // ── Analytics ───────────────────────────────────────────────────────

    private void printRoundSummary(String result) {
        BattleLogger.logGunSelection(gun.getActiveGunName(),
                gun.getShotsFired(), gun.getShotsHit(), gun.getAccuracy());

        if (battleMode == BattleMode.DUEL) {
            BattleLogger.logWaveSurferStats(waveSurfer.getRoundHitsTaken(),
                    WaveSurfer.getTotalHitsTaken(), WaveSurfer.getTotalWavesPassed());
        }

        for (OpponentData od : brain.getAllOpponents()) {
            TargetProfile profile = brain.getProfile(od.name);
            BattleLogger.logOpponentProfile(od.name,
                    profile.movementType.name(), profile.gunType,
                    od.threatLevel, profile.ourAccuracy, profile.firePowerMult);
        }

        double winRate = roundsPlayed > 0 ? (roundsWon * 100.0 / roundsPlayed) : 0;
        BattleLogger.logRoundEnd(getRoundNum(), result, getEnergy(),
                gun.getAccuracy(), winRate, roundsWon, roundsPlayed);
        BattleLogger.flush();
    }

    private void printAggregateSummary() {
        double winRate = roundsPlayed > 0 ? (roundsWon * 100.0 / roundsPlayed) : 0;
        BattleLogger.logAggregate(roundsPlayed, roundsWon, winRate,
                gun.getAccuracy(), wallHits, wallDamage);
        BattleLogger.destroy();
    }
}
