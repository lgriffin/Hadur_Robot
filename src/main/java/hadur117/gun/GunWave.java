package hadur117.gun;

import java.awt.geom.Point2D;

/**
 * Data carrier for an outgoing bullet wave used by the virtual gun array.
 *
 * <p>Records the fire position, timing, bullet speed, segmentation indices, and
 * each gun's aim angle so the wave can be resolved when it reaches the enemy.</p>
 */
public class GunWave {
    public Point2D.Double firePosition;
    public long fireTime;
    public double bulletSpeed;
    public double absBearing;
    public double latDir;
    public double mea;
    public double[] stats;
    public int distSeg, latvelSeg, wallSeg, accelSeg;
    public boolean realBullet;
    public double[] aimAngles;
    public double[] features;
}
