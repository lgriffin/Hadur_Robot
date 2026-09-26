package hadur2.core.model;

/**
 * Engine events delivered to the robot during a tick, as plain immutable values. Angles are
 * radians; bearings are relative to the robot's heading, headings are absolute (0 = north,
 * clockwise). The set of event types is closed: these nine are all there are.
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

    /** One of our bullets hit {@code name}, leaving it with {@code energy}. */
    public static final class BulletHit implements BotEvent {
        private final String name;
        private final double power;
        private final double energy;

        public BulletHit(String name, double power, double energy) {
            this.name = name;
            this.power = power;
            this.energy = energy;
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
                && Double.compare(energy, that.energy) == 0;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(name, power, energy);
        }

        @Override
        public String toString() {
            return "BulletHit[name=" + name + ", power=" + power + ", energy=" + energy + "]";
        }
    }

    /** One of our bullets collided with an enemy bullet, which was at {@code x}, {@code y}. */
    public static final class BulletHitBullet implements BotEvent {
        private final double power;
        private final double x;
        private final double y;
        private final double enemyPower;

        public BulletHitBullet(double power, double x, double y, double enemyPower) {
            this.power = power;
            this.x = x;
            this.y = y;
            this.enemyPower = enemyPower;
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
                && Double.compare(enemyPower, that.enemyPower) == 0;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(power, x, y, enemyPower);
        }

        @Override
        public String toString() {
            return "BulletHitBullet[power=" + power + ", x=" + x + ", y=" + y + ", enemyPower=" + enemyPower + "]";
        }
    }

    /** One of our bullets left the field. */
    public static final class BulletMissed implements BotEvent {
        private final double power;

        public BulletMissed(double power) {
            this.power = power;
        }

        public double power() {
            return power;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof BulletMissed)) return false;
            BulletMissed that = (BulletMissed) o;
            return Double.compare(power, that.power) == 0;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(power);
        }

        @Override
        public String toString() {
            return "BulletMissed[power=" + power + "]";
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
}
