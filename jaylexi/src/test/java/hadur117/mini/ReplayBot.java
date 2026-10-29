package hadur117.mini;

import robocode.Bullet;
import robocode.Condition;

/** The shipped JayLexi on a Replay body. */
public class ReplayBot extends JayLexi {
    final ReplayBody b;

    public ReplayBot(ReplayBody b) {
        this.b = b;
    }

    @Override public double getX() { return b.x; }
    @Override public double getY() { return b.y; }
    @Override public double getHeadingRadians() { return b.heading; }
    @Override public double getVelocity() { return b.velocity; }
    @Override public double getGunHeadingRadians() { return b.gunHeading; }
    @Override public double getEnergy() { return b.energy; }
    @Override public double getGunTurnRemaining() { return b.gunTurnRemaining; }
    @Override public double getRadarHeadingRadians() { return b.radarHeading; }
    @Override public void setTurnRightRadians(double v) { b.turn(v); }
    @Override public void setAhead(double v) { b.ahead(v); }
    @Override public void setTurnGunRightRadians(double v) { b.gun(v); }
    @Override public void setTurnRadarRightRadians(double v) { b.radar(v); }
    @Override public Bullet setFireBullet(double p) { return b.fire(p); }
    @Override public void addCustomEvent(Condition c) { b.add(c); }
    @Override public void removeCustomEvent(Condition c) { b.remove(c); }
}
