package hadur117.gun;

import java.awt.geom.Point2D;

public class GunWave {
    public Point2D.Double firePosition;
    public long fireTime;
    public double bulletSpeed;
    public double absBearing;
    public double latDir;
    public double mea;
    public double[] stats;
    public int distSeg, velSeg, latvelSeg, accelSeg, wallSeg;
    public boolean realBullet;
    public double[] aimAngles;
}
