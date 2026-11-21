package hybridmini;

import robocode.AdvancedRobot;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
import robocode.ScannedRobotEvent;
import robocode.StatusEvent;

/**
 * Bench-only MiniRumble reference robot (hadur-bench/hybrid/README.md): one donor robot's
 * movement and radar with another's gun and fire power. Each donor runs its own unchanged code in
 * its own instance (with its own statics) and sees every event; only its own channel's orders
 * reach the body. Codesize is not limited: this is a measuring stick, never released or uploaded.
 */
public abstract class MiniHybrid extends AdvancedRobot {
    /** Event order: the movement donor first, as each donor runs its movement before its gun. */
    private AdvancedRobot[] parts;

    /**
     * The movement donor (body and radar) and the gun donor (gun and fire), in that order; one
     * donor alone owns both (the plumbing control). A donor class appears once: its statics are
     * its state.
     */
    protected abstract AdvancedRobot[] makeParts();

    @Override
    public void run() {
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        parts = makeParts();
        for (AdvancedRobot p : parts) ((Donor) p).setUp();
        while (true) {
            // Until the first scan, sweep for the enemy; the movement donor's lock takes over then.
            if (getRadarTurnRemainingRadians() == 0) setTurnRadarRightRadians(1);
            execute();
        }
    }

    @Override
    public void onStatus(StatusEvent e) {
        if (parts != null) for (AdvancedRobot p : parts) {
            try {
                p.onStatus(e);
            } catch (RuntimeException ex) {
                // A donor's own exception ends only its own handler, as it would alone.
                ex.printStackTrace(out);
            }
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        if (parts != null) for (AdvancedRobot p : parts) {
            try {
                p.onScannedRobot(e);
            } catch (RuntimeException ex) {
                // A donor's own exception ends only its own handler, as it would alone.
                ex.printStackTrace(out);
            }
        }
    }

    @Override
    public void onHitByBullet(HitByBulletEvent e) {
        if (parts != null) for (AdvancedRobot p : parts) {
            try {
                p.onHitByBullet(e);
            } catch (RuntimeException ex) {
                // A donor's own exception ends only its own handler, as it would alone.
                ex.printStackTrace(out);
            }
        }
    }

    @Override
    public void onBulletHit(BulletHitEvent e) {
        if (parts != null) for (AdvancedRobot p : parts) {
            try {
                p.onBulletHit(e);
            } catch (RuntimeException ex) {
                // A donor's own exception ends only its own handler, as it would alone.
                ex.printStackTrace(out);
            }
        }
    }

    @Override
    public void onBulletHitBullet(BulletHitBulletEvent e) {
        if (parts != null) for (AdvancedRobot p : parts) {
            try {
                p.onBulletHitBullet(e);
            } catch (RuntimeException ex) {
                // A donor's own exception ends only its own handler, as it would alone.
                ex.printStackTrace(out);
            }
        }
    }
}
