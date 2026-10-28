package hadur117.micro;

import java.util.ArrayList;
import java.util.List;
import robocode.Condition;

/**
 * Eveimear with its own state as fields and its orders recorded: what the engine would hand it, and
 * what it asks for, without an engine. Each test sets the state, resets Eveimear's statics and
 * calls the handler.
 */
class Probe extends Eveimear {
    double x = 400, y = 300, heading, gunHeading, energy = 100, radarRemaining = 1;
    int round;
    final List<Condition> events = new ArrayList<>();
    Double turn, ahead, gunTurn, radarLeft, fired;

    static void reset() {
        enemyEnergy = 0;
        direction = 1;
        won = 0;
        mode = 0;
        lastSpeed = 0;
        since = 0;
        stats = new int[5][5][5][2 * MID + 1];
    }

    @Override public double getX() { return x; }
    @Override public double getY() { return y; }
    @Override public double getHeadingRadians() { return heading; }
    @Override public double getGunHeadingRadians() { return gunHeading; }
    @Override public double getEnergy() { return energy; }
    @Override public double getRadarTurnRemainingRadians() { return radarRemaining; }
    @Override public int getRoundNum() { return round; }

    @Override public void setTurnRightRadians(double r) { turn = r; }
    @Override public void setAhead(double d) { ahead = d; }
    @Override public void setTurnGunRightRadians(double r) { gunTurn = r; }
    @Override public void setTurnRadarLeftRadians(double r) { radarLeft = r; }
    @Override public void setFire(double p) { fired = p; }
    @Override public void addCustomEvent(Condition c) { events.add(c); }
    @Override public void removeCustomEvent(Condition c) { events.remove(c); }
}
