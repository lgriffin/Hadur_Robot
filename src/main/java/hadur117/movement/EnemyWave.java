package hadur117.movement;

import java.awt.geom.Point2D;

/**
 * Data carrier for an incoming enemy bullet wave tracked by {@link WaveSurfer}.
 *
 * <p>Records the fire location, timing, bullet speed, direct angle, and segmentation
 * indices so the surfer can evaluate danger and log hits when the wave passes.</p>
 */
public class EnemyWave {
    public Point2D.Double fireLocation;
    public long fireTime;
    public double bulletSpeed;
    public double directAngle;
    public double distanceTraveled;
    public int lateralDirection;
    public int distSeg, velSeg, accelSeg;
}
