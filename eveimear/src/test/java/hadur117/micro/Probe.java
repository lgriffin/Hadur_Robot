package hadur117.micro;

/**
 * Eveimear with its own state as fields and its orders recorded: what the engine would hand it, and
 * what it asks for, without an engine. Each test sets the state, resets Eveimear's statics and
 * calls the handler.
 */
class Probe extends Eveimear {
    double x = 400, y = 300, heading, gunHeading, radarHeading, velocity, energy = 100;
    int round;
    Double turn, ahead, gunTurn, radarTurn, fired;

    static void reset() {
        searchData = new StringBuilder();
        bulletVelocity = 0;
        direction = 1;
        lastEnemyEnergy = 0;
        flat = 0;
        hits = 0;
    }

    @Override public double getX() { return x; }
    @Override public double getY() { return y; }
    @Override public double getHeadingRadians() { return heading; }
    @Override public double getGunHeadingRadians() { return gunHeading; }
    @Override public double getRadarHeadingRadians() { return radarHeading; }
    @Override public double getVelocity() { return velocity; }
    @Override public double getEnergy() { return energy; }
    @Override public int getRoundNum() { return round; }

    @Override public void setTurnRightRadians(double r) { turn = r; }
    @Override public void setAhead(double d) { ahead = d; }
    @Override public void setTurnGunRightRadians(double r) { gunTurn = r; }
    @Override public void setTurnRadarRightRadians(double r) { radarTurn = r; }
    @Override public void setFire(double p) { fired = p; }
    @Override public void setAdjustGunForRobotTurn(boolean b) { }
    @Override public void setAdjustRadarForGunTurn(boolean b) { }
}
