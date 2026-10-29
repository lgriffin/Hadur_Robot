package hadur117.mini;

import java.util.ArrayList;
import java.util.List;
import robocode.Bullet;
import robocode.Condition;

/**
 * JayLexi with its own state as fields and its orders recorded: what the engine would hand it, and
 * what it asks for, without an engine. Each test sets the state, resets JayLexi's statics and calls
 * the handler.
 */
class Probe extends JayLexi {
    double x = 400, y = 300, heading, velocity, gunHeading, radarHeading, energy = 100, gunTurnRemaining;
    int round;
    final List<Condition> events = new ArrayList<>();
    Double turn, ahead, gunTurn, radarRight, fired;

    Probe() {
        bot = this;
    }

    static void reset() {
        enemyEnergy = 0;
        distance = 0;
        lastBearing = 0;
        lastLateral = 0;
        vChangeTime = 0;
        enemySpeed = 0;
        next = null;
        waves = new ArrayList<>();
        surf = new double[4][5][BINS];
        JayLexi.gun = new double[6][4][4][5][BINS];
    }

    @Override public double getX() { return x; }
    @Override public double getY() { return y; }
    @Override public double getHeadingRadians() { return heading; }
    @Override public double getVelocity() { return velocity; }
    @Override public double getGunHeadingRadians() { return gunHeading; }
    @Override public double getEnergy() { return energy; }
    @Override public double getGunTurnRemaining() { return gunTurnRemaining; }
    @Override public double getRadarHeadingRadians() { return radarHeading; }
    @Override public int getRoundNum() { return round; }

    @Override public void setTurnRightRadians(double r) { turn = r; }
    @Override public void setAhead(double d) { ahead = d; }
    @Override public void setTurnGunRightRadians(double r) { gunTurn = r; }
    @Override public void setTurnRadarRightRadians(double r) { radarRight = r; }
    @Override public Bullet setFireBullet(double p) { fired = p; return null; }
    @Override public void addCustomEvent(Condition c) { events.add(c); }
    @Override public void removeCustomEvent(Condition c) { events.remove(c); }
}
