package hadur117;

import hadur117.model.BattleMode;
import hadur117.intel.Brain;
import hadur117.intel.MeleeTargetSelector;
import hadur117.gun.Gun;
import hadur117.movement.WaveSurfer;
import hadur117.movement.MinimumRiskMovement;
import hadur117.radar.Radar;
import robocode.*;
import java.awt.Color;

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

        battleMode = getOthers() > 1 ? BattleMode.MELEE : BattleMode.DUEL;
        brain.setBattleMode(getOthers());

        out.println("=== HADUR - God of War === Mode: " + battleMode);

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
            waveSurfer.doSurfing(this);
        }
    }

    private void runMeleeTick() {
        if (getOthers() == 1 && battleMode == BattleMode.MELEE) {
            battleMode = BattleMode.DUEL;
            brain.setBattleMode(1);
            out.println(">> Transition to DUEL mode");
        }

        if (battleMode == BattleMode.DUEL) {
            runDuelTick();
            return;
        }

        radar.doMeleeRadarWithGunLock(this, brain, getGunHeat());
        minimumRisk.doMinimumRisk(this, brain);
    }

    // ── Events ──────────────────────────────────────────────────────────

    public void onScannedRobot(ScannedRobotEvent e) {
        scanTimer = 0;
        enemyDetected = true;

        brain.update(e, getX(), getY(), getHeadingRadians(), getTime());

        if (battleMode == BattleMode.DUEL) {
            gun.onScannedRobot(this, e);
            waveSurfer.onScannedRobot(this, e);
            radar.doDuelRadar(this,
                    getHeadingRadians() + e.getBearingRadians());

            if (getGunHeat() == 0) brain.recordOurFire(getTime());
        } else {
            String target = targetSelector.selectTarget(this, brain);
            if (target != null) {
                gun.onScannedRobotMelee(this, e, target, e.getName());
            }
            radar.doMeleeRadar(this, brain);
        }
    }

    public void onBulletHit(BulletHitEvent e) {
        gun.onBulletHit(e);
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
            battleMode = BattleMode.DUEL;
            brain.setBattleMode(1);
            out.println(">> Transition to DUEL mode");
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
        double accuracy = gun.getAccuracy();
        double winRate = roundsPlayed > 0 ? (roundsWon * 100.0 / roundsPlayed) : 0;

        out.println("");
        out.println("=== HADUR ROUND " + getRoundNum() + " === " + result);
        out.println("Accuracy: " + String.format("%.1f%%", accuracy * 100)
                + " | Shots: " + gun.getShotsFired() + "/" + gun.getShotsHit());
        out.println("Gun: " + gun.getActiveGunName() + " | Wall Hits: " + wallHits);
        out.println("Win Rate: " + String.format("%.1f%%", winRate)
                + " (" + roundsWon + "/" + roundsPlayed + ")");
        out.println("========================");
    }

    private void printAggregateSummary() {
        double winRate = roundsPlayed > 0 ? (roundsWon * 100.0 / roundsPlayed) : 0;

        out.println("");
        out.println("============================================");
        out.println("  HADUR - BATTLE AGGREGATE");
        out.println("============================================");
        out.println("Rounds: " + roundsPlayed + " | Wins: " + roundsWon
                + " | Win Rate: " + String.format("%.1f%%", winRate));
        out.println("Accuracy: " + String.format("%.1f%%", gun.getAccuracy() * 100));
        out.println("Wall Hits: " + wallHits
                + " (Damage: " + String.format("%.1f", wallDamage) + ")");
        out.println("============================================");
    }
}
