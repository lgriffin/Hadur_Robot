package hybrid;

import hadur117.Hadur;
import hadur117.core.HybridHooks;
import kc.mega.aim.Aimer;
import kc.mega.aim.wave.AimWave;
import kc.mega.game.BattleField;
import kc.mega.game.GameState;
import kc.mega.move.Mover;
import kc.mega.shared.Strategy;
import kc.mega.shared.WaveManager;
import kc.mega.shield.Shielder;
import kc.mega.wave.Bullet;

import java.awt.geom.Point2D;

import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.DeathEvent;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;
import robocode.SkippedTurnEvent;

/**
 * Bench-only reference robot: Hadur's shell and core with BeepBoop 2.0's subsystems (by Kevin
 * Clark, https://robowiki.net/wiki/BeepBoop) beside it, each owning one channel. Never released,
 * uploaded or entered in a rumble; see hadur-bench/hybrid/README.md.
 *
 * <p>Hadur's core ticks first and its orders are applied; the setter overrides below drop the
 * orders for the channel BeepBoop owns. Then, inside {@link #execute()}, BeepBoop's turn runs as
 * in BeepBoop.doTurn (state update, strategy, then its mover, aimer or shielder), and its orders
 * pass for the channels it owns. Hadur's radar is the one radar.</p>
 */
public abstract class HybridBase extends Hadur {
    /** True: BeepBoop drives the body (and may shield). False: Hadur's movement drives it. */
    protected abstract boolean beepMoves();

    private static GameState gs;
    private static WaveManager waveManager;
    private static Strategy strategy;
    private static Mover mover;
    private static Aimer aimer;
    private static Shielder shielder;

    /** Whether BeepBoop's code is the caller of the setters right now. */
    private boolean inBeep;
    private boolean hasWon;
    private boolean hasDied;
    private ScannedRobotEvent lastScanEvent;

    @Override
    public void run() {
        HybridHooks.externalMove = beepMoves();
        HybridHooks.externalGun = !beepMoves();
        if (gs == null) {
            BattleField.INSTANCE.onBattleStart(this);
            gs = new GameState(this);
            waveManager = new WaveManager();
            // BeepBoop shields only where it owns the body.
            strategy = new Strategy(this, gs, waveManager, beepMoves());
            mover = new Mover(this, strategy);
            aimer = beepMoves() ? null : new Aimer(this, strategy, mover, false);
            shielder = beepMoves() ? new Shielder(this, gs, waveManager.movementWaves) : null;
        }
        gs.onRoundStart();
        waveManager.onRoundStart();
        mover.onRoundStart();
        if (aimer != null) aimer.onRoundStart();
        if (shielder != null && strategy.shield) shielder.onRoundStart();
        HybridHooks.FIRED.clear();
        super.run();
    }

    // ---- channel ownership -------------------------------------------------------------

    private boolean beepOwnsBody() {
        return beepMoves();
    }

    private boolean beepOwnsGun() {
        // Hybrid 1: Hadur's gun, except while BeepBoop shields (its shield is body and gun).
        // Hybrid 2: BeepBoop's gun, except while Hadur's shield drives (likewise).
        return beepMoves() ? strategy != null && strategy.shield : !HybridHooks.shieldDriving;
    }

    private boolean bodyPass() {
        return inBeep == beepOwnsBody();
    }

    private boolean gunPass() {
        return inBeep == beepOwnsGun();
    }

    @Override
    public void setAhead(double distance) {
        if (bodyPass()) super.setAhead(distance);
    }

    @Override
    public void setBack(double distance) {
        if (bodyPass()) super.setBack(distance);
    }

    @Override
    public void setTurnRightRadians(double radians) {
        if (bodyPass()) super.setTurnRightRadians(radians);
    }

    @Override
    public void setTurnLeftRadians(double radians) {
        if (bodyPass()) super.setTurnLeftRadians(radians);
    }

    @Override
    public void setMaxVelocity(double v) {
        if (bodyPass()) super.setMaxVelocity(v);
    }

    @Override
    public void setTurnGunRightRadians(double radians) {
        if (gunPass()) super.setTurnGunRightRadians(radians);
    }

    @Override
    public void setTurnRadarRightRadians(double radians) {
        // Hadur's radar only.
        if (!inBeep) super.setTurnRadarRightRadians(radians);
    }

    @Override
    public void setFire(double power) {
        if (!gunPass()) return;
        double x = getX(), y = getY(), heading = getGunHeadingRadians();
        robocode.Bullet b = setFireBullet(power);
        if (b == null) return;
        double[] shot = {getTime(), x, y, heading, b.getPower()};
        if (inBeep) {
            registerShot(shot);
        } else {
            // Hadur fired from its orders, before BeepBoop's state took this tick's scan:
            // registered in BeepBoop's turn, after the update, as BeepBoop's Aimer would.
            pendingShot = shot;
        }
    }

    /** Hybrid 1: Hadur's shot of this tick, waiting for BeepBoop's turn. */
    private double[] pendingShot;

    private void registerShot(double[] shot) {
        double heading = shot[3], fired = shot[4];
        if (gs == null) return;
        gs.onFire(fired);
        boolean shieldShot = beepMoves() ? strategy.shield : HybridHooks.shieldDriving;
        if (shieldShot) return;
        // BeepBoop's own setFire: the bullet's shadows on the enemy waves in the air.
        waveManager.onFire(new Bullet(new Point2D.Double(shot[1], shot[2]), heading,
            robocode.Rules.getBulletSpeed(fired), (long) shot[0]));
        if (beepMoves()) {
            // Hybrid 1: Hadur's shot becomes a BeepBoop aim wave, so later enemy waves get its
            // shadow too (BeepBoop's Aimer adds the same wave when it fires).
            if (gs.myHistory.size() > 0 && gs.enemyHistory.size() > 0) {
                waveManager.aimWaves.add((AimWave) new AimWave.Builder()
                    .gunHeading(heading)
                    .waves(waveManager.aimWaves)
                    .myHistory(gs.myHistory)
                    .enemyHistory(gs.enemyHistory)
                    .power(fired)
                    .hasBullet(true)
                    .build());
            }
        } else {
            // Hybrid 2: the real bullet goes to Hadur's shadows (the duel drains it next tick).
            HybridHooks.FIRED.add(shot);
        }
    }

    // ---- BeepBoop's turn -----------------------------------------------------------------

    @Override
    public void execute() {
        beepTurn();
        super.execute();
    }

    private void beepTurn() {
        if (gs == null || lastScanEvent == null || hasDied) {
            pendingShot = null;
            return;
        }
        inBeep = true;
        try {
            if (getOthers() == 0 && !hasWon) {
                hasWon = true;
                gs.onRoundEnd(true);
            }
            if (lastScanEvent.getTime() == getTime()) {
                gs.update(lastScanEvent);
            } else {
                gs.updateWithoutScan();
            }
            strategy.strategize();
            if (beepMoves()) {
                if (strategy.shield) {
                    shielder.shield();
                } else {
                    mover.move();
                    // Hadur fires; BeepBoop's aim waves (its shadows' source) still age and break.
                    waveManager.aimWaves.update(gs.enemyState);
                    if (pendingShot != null) registerShot(pendingShot);
                }
            } else if (!HybridHooks.shieldDriving) {
                aimer.aim();
            }
        } catch (RuntimeException ex) {
            out.println("HYBRID,beep-turn," + getRoundNum() + "," + getTime() + "," + ex);
        } finally {
            inBeep = false;
            pendingShot = null;
        }
    }

    // ---- events, as BeepBoop handles them, after Hadur's own --------------------------------

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        super.onScannedRobot(e);
        lastScanEvent = e;
    }

    @Override
    public void onBulletHit(BulletHitEvent e) {
        super.onBulletHit(e);
        if (gs == null) return;
        gs.onBulletHit(e);
        if (aimer != null && !HybridHooks.shieldDriving) aimer.onBulletHit(e);
    }

    @Override
    public void onHitByBullet(HitByBulletEvent e) {
        super.onHitByBullet(e);
        if (gs == null) return;
        gs.onHitByBullet(e);
        if (beepMoves()) {
            if (strategy.shield) shielder.onHitByBullet(e);
            else mover.onHitByBullet(e);
        }
    }

    @Override
    public void onBulletHitBullet(BulletHitBulletEvent e) {
        super.onBulletHitBullet(e);
        if (gs == null) return;
        if (beepMoves() && strategy.shield) {
            shielder.onBulletHitBullet(e);
            return;
        }
        waveManager.onBulletHitBullet();
        if (beepMoves()) mover.onBulletHitBullet(e);
        else if (!HybridHooks.shieldDriving) aimer.onBulletHitBullet(e);
    }

    @Override
    public void onHitRobot(HitRobotEvent e) {
        super.onHitRobot(e);
        if (gs != null) gs.onHitRobot(e);
    }

    @Override
    public void onSkippedTurn(SkippedTurnEvent e) {
        super.onSkippedTurn(e);
        if (gs != null) gs.updateWithoutScan();
    }

    @Override
    public void onDeath(DeathEvent e) {
        super.onDeath(e);
        hasDied = true;
        if (gs != null && !hasWon) gs.onRoundEnd(false);
    }
}
