package hadur117.micro.replay;
import robocode.*;
/** Stands in for AdvancedRobot under any build of a robot class: every read comes from the Body, every order is recorded. */
public class Fake extends AdvancedRobot {
    public static Body cur;
    final Body b = cur;
    @Override public double getX() { return b.x; }
    @Override public double getY() { return b.y; }
    @Override public double getHeadingRadians() { return b.heading; }
    @Override public double getGunHeadingRadians() { return b.gunHeading; }
    @Override public double getRadarHeadingRadians() { return b.gunHeading; }
    @Override public double getVelocity() { return b.velocity; }
    @Override public double getEnergy() { return Math.max(0, b.energy); }
    @Override public int getRoundNum() { return b.round; }
    @Override public int getOthers() { return 1; }
    @Override public double getGunHeat() { return Math.abs(b.radarRemaining); }
    @Override public double getBattleFieldWidth() { return 800; }
    @Override public double getBattleFieldHeight() { return 600; }
    @Override public double getRadarTurnRemainingRadians() { return b.radarRemaining; }
    @Override public double getGunTurnRemainingRadians() { return 0; }
    @Override public double getGunTurnRemaining() { return 0; }
    @Override public double getDistanceRemaining() { return b.ahead; }
    @Override public void setTurnRightRadians(double v) { b.put("t", b.turn = v); }
    @Override public void setTurnLeftRadians(double v) { b.put("t", b.turn = -v); }
    @Override public void setAhead(double v) { b.put("a", b.ahead = v); }
    @Override public void setBack(double v) { b.put("a", b.ahead = -v); }
    @Override public void setMaxVelocity(double v) { b.put("v", v); }
    @Override public void setTurnGunRightRadians(double v) { b.put("g", b.gun = v); }
    @Override public void setTurnGunLeftRadians(double v) { b.put("g", b.gun = -v); }
    @Override public void setTurnRadarRightRadians(double v) { b.put("r", v); }
    @Override public void setTurnRadarLeftRadians(double v) { b.put("l", v); }
    @Override public void setFire(double p) { b.put("f", p); b.shots++; }
    @Override public Bullet setFireBullet(double p) { b.put("f", p); b.shots++; return new Bullet(0, b.x, b.y, p, "me", null, true, b.shots); }
    @Override public void setAdjustGunForRobotTurn(boolean v) { b.put("ag", v ? 1 : 0); }
    @Override public void setAdjustRadarForGunTurn(boolean v) { b.put("ar", v ? 1 : 0); }
    @Override public void setAdjustRadarForRobotTurn(boolean v) { b.put("arr", v ? 1 : 0); }
    @Override public void addCustomEvent(Condition c) { b.conditions.add(c); b.out.append("+c "); }
    @Override public void removeCustomEvent(Condition c) { b.conditions.remove(c); b.out.append("-c "); }
    @Override public void execute() { }
    @Override public void setTurnRadarRight(double v) { b.put("R", v); }
    @Override public double getTurnRemaining() { return Math.toDegrees(b.turn); }
    @Override public double getRadarTurnRemaining() { return Math.toDegrees(b.radarRemaining); }
    public static class Stop extends RuntimeException { }
    @Override public void turnRadarRightRadians(double a) { throw new Stop(); }
    @Override public void turnRadarRight(double a) { throw new Stop(); }
    @Override public void setColors(java.awt.Color a, java.awt.Color g, java.awt.Color r) { }
}
