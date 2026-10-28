package hadur117.nano;

import java.util.ArrayList;
import java.util.List;

/**
 * Sanaro with its own state as fields and its orders recorded: what the engine would hand it, and
 * what it asks for, without an engine. Each test sets the state, resets Sanaro's statics and
 * calls the handler.
 */
class Probe extends Sanaro {
    double x = 500, y = 500, heading, gunHeading, gunHeat = 3, energy = 100, radarRemaining = Double.POSITIVE_INFINITY;
    double turnRemaining;
    final List<String> orders = new ArrayList<>();
    Double turn, ahead, radar, fire, gun;

    static void reset() {
        fx = 0;
        fy = 0;
        range = 0;
    }

    @Override public double getX() { return x; }
    @Override public double getY() { return y; }
    @Override public double getHeadingRadians() { return heading; }
    @Override public double getGunHeadingRadians() { return gunHeading; }
    @Override public double getGunHeat() { return gunHeat; }
    @Override public double getEnergy() { return energy; }
    @Override public double getRadarTurnRemaining() { return radarRemaining; }
    @Override public double getTurnRemaining() { return turn == null ? turnRemaining : Math.toDegrees(turn); }

    @Override public void setTurnRightRadians(double r) { turn = r; orders.add("turn"); }
    @Override public void setAhead(double d) { ahead = d; orders.add("ahead"); }
    @Override public void setTurnRadarRight(double r) { radar = r; orders.add("radar"); }
    @Override public void setFire(double p) { fire = p; orders.add("fire"); }
    @Override public void setTurnGunRightRadians(double r) { gun = r; orders.add("gun"); }
}
