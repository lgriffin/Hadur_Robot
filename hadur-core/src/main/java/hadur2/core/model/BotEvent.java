package hadur2.core.model;

/**
 * Engine events delivered to the robot during a tick, as plain records. Angles are radians;
 * bearings are relative to the robot's heading, headings are absolute (0 = north, clockwise).
 */
public sealed interface BotEvent {

    /** The radar saw a robot. */
    record Scan(String name, double bearing, double distance, double energy,
                double heading, double velocity) implements BotEvent {}

    /** An enemy bullet hit us. {@code x}, {@code y} are where the bullet was. */
    record HitByBullet(String name, double power, double x, double y,
                       double heading) implements BotEvent {}

    /** One of our bullets hit {@code name}, leaving it with {@code energy}. */
    record BulletHit(String name, double power, double energy) implements BotEvent {}

    /** One of our bullets collided with an enemy bullet, which was at {@code x}, {@code y}. */
    record BulletHitBullet(double power, double x, double y, double enemyPower)
        implements BotEvent {}

    /** One of our bullets left the field. */
    record BulletMissed(double power) implements BotEvent {}

    record HitWall(double bearing) implements BotEvent {}

    record HitRobot(String name, double bearing, double energy, boolean myFault)
        implements BotEvent {}

    record RobotDeath(String name) implements BotEvent {}

    /** The engine skipped one of our turns because the previous tick ran too long. */
    record SkippedTurn(long skippedTime) implements BotEvent {}
}
