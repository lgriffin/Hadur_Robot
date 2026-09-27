package hadur2.core.model;

/**
 * Engine events delivered to the robot during a tick, as plain immutable values. Angles are
 * radians; bearings are relative to the robot's heading, headings are absolute (0 = north,
 * clockwise). The set of event types is closed: these ten are all there are.
 *
 * <p>Written as final classes rather than records so the robot runs on Java 11, which
 * RoboRumble clients may still use.</p>
 */
public interface BotEvent {

    /** The radar saw a robot. */
    public static final class Scan implements BotEvent {
        private final String name;
        private final double bearing;
        private final double distance;
        private final double energy;
        private final double heading;
        private final double velocity;

        public Scan(String name, double bearing, double distance, double energy, double heading, double velocity) {
            this.name = name;
            this.bearing = bearing;
            this.distance = distance;
            this.energy = energy;
            this.heading = heading;
            this.velocity = velocity;
        }

        public String name() {
            return name;
        }

        public double bearing() {
            return bearing;
        }

        public double distance() {
            return distance;
        }

        public double energy() {
            return energy;
        }

        public double heading() {
            return heading;
        }

        public double velocity() {
            return velocity;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Scan)) return false;
            Scan that = (Scan) o;
            return java.util.Objects.equals(name, that.name)
                && Double.compare(bearing, that.bearing) == 0
                && Double.compare(distance, that.distance) == 0
                && Double.compare(energy, that.energy) == 0
                && Double.compare(heading, that.heading) == 0
                && Double.compare(velocity, that.velocity) == 0;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(name, bearing, distance, energy, heading, velocity);
        }

        @Override
        public String toString() {
            return "Scan[name=" + name + ", bearing=" + bearing + ", distance=" + distance + ", energy=" + energy + ", heading=" + heading + ", velocity=" + velocity + "]";
        }
    }

    /** An enemy bullet hit us. {@code x}, {@code y} are where the bullet was. */
    public static final class HitByBullet implements BotEvent {
        private final String name;
        private final double power;
        private final double x;
        private final double y;
        private final double heading;

        public HitByBullet(String name, double power, double x, double y, double heading) {
            this.name = name;
            this.power = power;
            this.x = x;
            this.y = y;
            this.heading = heading;
        }

        public String name() {
            return name;
        }

        public double power() {
            return power;
        }

        public double x() {
            return x;
        }

        public double y() {
            return y;
        }

        public double heading() {
            return heading;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof HitByBullet)) return false;
            HitByBullet that = (HitByBullet) o;
            return java.util.Objects.equals(name, that.name)
                && Double.compare(power, that.power) == 0
                && Double.compare(x, that.x) == 0
                && Double.compare(y, that.y) == 0
                && Double.compare(heading, that.heading) == 0;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(name, power, x, y, heading);
        }

        @Override
        public String toString() {
            return "HitByBullet[name=" + name + ", power=" + power + ", x=" + x + ", y=" + y + ", heading=" + heading + "]";
        }
    }

    /**
     * One of our bullets hit {@code name}, leaving it with {@code energy}. The bullet's
     * heading names which of ours it was (MOVE-1); NaN when the source did not give it.
     */
    public static final class BulletHit implements BotEvent {
        private final String name;
        private final double power;
        private final double energy;
        private final double bulletHeading;

        public BulletHit(String name, double power, double energy) {
            this(name, power, energy, Double.NaN);
        }

        public BulletHit(String name, double power, double energy, double bulletHeading) {
            this.name = name;
            this.power = power;
            this.energy = energy;
            this.bulletHeading = bulletHeading;
        }

        public double bulletHeading() {
            return bulletHeading;
        }

        public String name() {
            return name;
        }

        public double power() {
            return power;
        }

        public double energy() {
            return energy;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof BulletHit)) return false;
            BulletHit that = (BulletHit) o;
            return java.util.Objects.equals(name, that.name)
                && Double.compare(power, that.power) == 0
                && Double.compare(energy, that.energy) == 0
                && Double.compare(bulletHeading, that.bulletHeading) == 0;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(name, power, energy, bulletHeading);
        }

        @Override
        public String toString() {
            return "BulletHit[name=" + name + ", power=" + power + ", energy=" + energy
                + ", bulletHeading=" + bulletHeading + "]";
        }
    }

    /**
     * One of our bullets collided with an enemy bullet, which was at {@code x}, {@code y}.
     * {@code bulletHeading} is our bullet's (MOVE-1), NaN when the source did not give it.
     */
    public static final class BulletHitBullet implements BotEvent {
        private final double power;
        private final double x;
        private final double y;
        private final double enemyPower;
        private final double bulletHeading;

        public BulletHitBullet(double power, double x, double y, double enemyPower) {
            this(power, x, y, enemyPower, Double.NaN);
        }

        public BulletHitBullet(double power, double x, double y, double enemyPower,
                               double bulletHeading) {
            this.power = power;
            this.x = x;
            this.y = y;
            this.enemyPower = enemyPower;
            this.bulletHeading = bulletHeading;
        }

        public double bulletHeading() {
            return bulletHeading;
        }

        public double power() {
            return power;
        }

        public double x() {
            return x;
        }

        public double y() {
            return y;
        }

        public double enemyPower() {
            return enemyPower;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof BulletHitBullet)) return false;
            BulletHitBullet that = (BulletHitBullet) o;
            return Double.compare(power, that.power) == 0
                && Double.compare(x, that.x) == 0
                && Double.compare(y, that.y) == 0
                && Double.compare(enemyPower, that.enemyPower) == 0
                && Double.compare(bulletHeading, that.bulletHeading) == 0;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(power, x, y, enemyPower, bulletHeading);
        }

        @Override
        public String toString() {
            return "BulletHitBullet[power=" + power + ", x=" + x + ", y=" + y + ", enemyPower="
                + enemyPower + ", bulletHeading=" + bulletHeading + "]";
        }
    }

    /** One of our bullets left the field; {@code bulletHeading} as for {@link BulletHit}. */
    public static final class BulletMissed implements BotEvent {
        private final double power;
        private final double bulletHeading;

        public BulletMissed(double power) {
            this(power, Double.NaN);
        }

        public BulletMissed(double power, double bulletHeading) {
            this.power = power;
            this.bulletHeading = bulletHeading;
        }

        public double bulletHeading() {
            return bulletHeading;
        }

        public double power() {
            return power;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof BulletMissed)) return false;
            BulletMissed that = (BulletMissed) o;
            return Double.compare(power, that.power) == 0
                && Double.compare(bulletHeading, that.bulletHeading) == 0;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(power, bulletHeading);
        }

        @Override
        public String toString() {
            return "BulletMissed[power=" + power + ", bulletHeading=" + bulletHeading + "]";
        }
    }

    public static final class HitWall implements BotEvent {
        private final double bearing;

        public HitWall(double bearing) {
            this.bearing = bearing;
        }

        public double bearing() {
            return bearing;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof HitWall)) return false;
            HitWall that = (HitWall) o;
            return Double.compare(bearing, that.bearing) == 0;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(bearing);
        }

        @Override
        public String toString() {
            return "HitWall[bearing=" + bearing + "]";
        }
    }

    public static final class HitRobot implements BotEvent {
        private final String name;
        private final double bearing;
        private final double energy;
        private final boolean myFault;

        public HitRobot(String name, double bearing, double energy, boolean myFault) {
            this.name = name;
            this.bearing = bearing;
            this.energy = energy;
            this.myFault = myFault;
        }

        public String name() {
            return name;
        }

        public double bearing() {
            return bearing;
        }

        public double energy() {
            return energy;
        }

        public boolean myFault() {
            return myFault;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof HitRobot)) return false;
            HitRobot that = (HitRobot) o;
            return java.util.Objects.equals(name, that.name)
                && Double.compare(bearing, that.bearing) == 0
                && Double.compare(energy, that.energy) == 0
                && myFault == that.myFault;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(name, bearing, energy, myFault);
        }

        @Override
        public String toString() {
            return "HitRobot[name=" + name + ", bearing=" + bearing + ", energy=" + energy + ", myFault=" + myFault + "]";
        }
    }

    public static final class RobotDeath implements BotEvent {
        private final String name;

        public RobotDeath(String name) {
            this.name = name;
        }

        public String name() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof RobotDeath)) return false;
            RobotDeath that = (RobotDeath) o;
            return java.util.Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(name);
        }

        @Override
        public String toString() {
            return "RobotDeath[name=" + name + "]";
        }
    }

    /** The engine skipped one of our turns because the previous tick ran too long. */
    public static final class SkippedTurn implements BotEvent {
        private final long skippedTime;

        public SkippedTurn(long skippedTime) {
            this.skippedTime = skippedTime;
        }

        public long skippedTime() {
            return skippedTime;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof SkippedTurn)) return false;
            SkippedTurn that = (SkippedTurn) o;
            return skippedTime == that.skippedTime;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(skippedTime);
        }

        @Override
        public String toString() {
            return "SkippedTurn[skippedTime=" + skippedTime + "]";
        }
    }

    /**
     * How long the core's previous tick took, measured by the adapter, and the allowance it
     * assumes per turn (TIME-1). An event, not a clock the core reads, so a replay of the
     * same inputs makes the same decisions (CORE-2).
     */
    public static final class TickTime implements BotEvent {
        private final long usedNanos;
        private final long allowanceNanos;

        public TickTime(long usedNanos, long allowanceNanos) {
            this.usedNanos = usedNanos;
            this.allowanceNanos = allowanceNanos;
        }

        public long usedNanos() {
            return usedNanos;
        }

        public long allowanceNanos() {
            return allowanceNanos;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TickTime)) return false;
            TickTime that = (TickTime) o;
            return usedNanos == that.usedNanos && allowanceNanos == that.allowanceNanos;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(usedNanos, allowanceNanos);
        }

        @Override
        public String toString() {
            return "TickTime[usedNanos=" + usedNanos + ", allowanceNanos=" + allowanceNanos + "]";
        }
    }
}
