package hadur2.core.melee;

import java.awt.geom.Point2D;

/**
 * A shot an opponent fired, inferred from an energy drop the core could not explain as
 * damage (MSENSE-2): who fired, from where, when, and at what power. Nobody sees where it
 * was aimed; the melee movement simulates the likely aims (MMOVE-3).
 */
public final class EnemyShot {

    public final String shooter;
    public final Point2D.Double source;
    /**
     * The tick the bullet left the gun: the tick before the scan that showed the drop when
     * the scans were consecutive, else the middle of the ticks it could have fired in.
     */
    public final long fireTime;
    public final double power;
    /** How many ticks either side of {@link #fireTime} it could have fired; 0 when exact. */
    public final long window;

    public EnemyShot(String shooter, Point2D.Double source, long fireTime, double power) {
        this(shooter, source, fireTime, power, 0);
    }

    public EnemyShot(String shooter, Point2D.Double source, long fireTime, double power, long window) {
        this.shooter = shooter;
        this.source = source;
        this.fireTime = fireTime;
        this.power = power;
        this.window = window;
    }

    public double speed() {
        return 20.0 - 3.0 * power;
    }

    /** How far the bullet has flown by tick {@code time}. */
    public double travelled(long time) {
        return Math.max(0, time - fireTime) * speed();
    }

    @Override
    public String toString() {
        return "EnemyShot[" + shooter + " at " + fireTime + ", power " + power + "]";
    }
}
