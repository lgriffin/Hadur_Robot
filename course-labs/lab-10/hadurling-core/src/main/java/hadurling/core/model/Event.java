package hadurling.core.model;

import java.util.Objects;

/**
 * Something that happened to the robot during a tick. The set of events is <em>closed</em>:
 * the constructor is private, so the only subclasses are the ones nested below, and code that
 * handles events can list all of them.
 *
 * <p>(Java 17 has {@code sealed} classes for this. Hadurling's main code targets Java 11, so
 * we get the same effect by hand.)</p>
 *
 * <p>Angles are radians, distances px. A bearing is relative to our own heading.</p>
 */
public abstract class Event {

    private Event() {}

    /** The radar saw a robot. */
    public static final class Scan extends Event {
        private final String name;
        private final double bearing;
        private final double distance;
        private final double energy;
        private final double heading;
        private final double velocity;

        /**
         * A scan.
         *
         * @param name the robot's name
         * @param bearing the angle to it, relative to our heading, in radians
         * @param distance how far away it is, in px
         * @param energy its energy
         * @param heading its heading in radians, 0 north
         * @param velocity its velocity in px/tick, negative when reversing
         */
        public Scan(String name, double bearing, double distance, double energy, double heading,
                double velocity) {
            this.name = Objects.requireNonNull(name);
            this.bearing = bearing;
            this.distance = distance;
            this.energy = energy;
            this.heading = heading;
            this.velocity = velocity;
        }

        /** @return the robot's name */
        public String name() { return name; }
        /** @return the angle to it relative to our heading, in radians */
        public double bearing() { return bearing; }
        /** @return the distance to it in px */
        public double distance() { return distance; }
        /** @return its energy */
        public double energy() { return energy; }
        /** @return its heading in radians */
        public double heading() { return heading; }
        /** @return its velocity in px/tick */
        public double velocity() { return velocity; }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Scan)) return false;
            Scan s = (Scan) o;
            return name.equals(s.name) && same(bearing, s.bearing) && same(distance, s.distance)
                && same(energy, s.energy) && same(heading, s.heading) && same(velocity, s.velocity);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, bearing, distance, energy, heading, velocity);
        }

        @Override
        public String toString() {
            return "Scan[" + name + ", bearing=" + bearing + ", distance=" + distance + "]";
        }
    }

    /** An enemy bullet hit us. */
    public static final class HitByBullet extends Event {
        private final String shooter;
        private final double power;

        /**
         * A hit on us.
         *
         * @param shooter the name of the robot that fired
         * @param power the bullet's power
         */
        public HitByBullet(String shooter, double power) {
            this.shooter = Objects.requireNonNull(shooter);
            this.power = power;
        }

        /** @return the shooter's name */
        public String shooter() { return shooter; }
        /** @return the bullet's power */
        public double power() { return power; }

        @Override
        public boolean equals(Object o) {
            return o instanceof HitByBullet && shooter.equals(((HitByBullet) o).shooter)
                && same(power, ((HitByBullet) o).power);
        }

        @Override
        public int hashCode() { return Objects.hash(shooter, power); }

        @Override
        public String toString() { return "HitByBullet[" + shooter + ", power=" + power + "]"; }
    }

    /** One of our bullets hit a robot. */
    public static final class BulletHit extends Event {
        private final String victim;
        private final double power;

        /**
         * A hit by us.
         *
         * @param victim the name of the robot we hit
         * @param power our bullet's power
         */
        public BulletHit(String victim, double power) {
            this.victim = Objects.requireNonNull(victim);
            this.power = power;
        }

        /** @return the victim's name */
        public String victim() { return victim; }
        /** @return our bullet's power */
        public double power() { return power; }

        @Override
        public boolean equals(Object o) {
            return o instanceof BulletHit && victim.equals(((BulletHit) o).victim)
                && same(power, ((BulletHit) o).power);
        }

        @Override
        public int hashCode() { return Objects.hash(victim, power); }

        @Override
        public String toString() { return "BulletHit[" + victim + ", power=" + power + "]"; }
    }

    /** We drove into a wall. */
    public static final class HitWall extends Event {
        private final double bearing;

        /**
         * A wall hit.
         *
         * @param bearing the angle to the wall relative to our heading, in radians
         */
        public HitWall(double bearing) {
            this.bearing = bearing;
        }

        /** @return the angle to the wall relative to our heading, in radians */
        public double bearing() { return bearing; }

        @Override
        public boolean equals(Object o) {
            return o instanceof HitWall && same(bearing, ((HitWall) o).bearing);
        }

        @Override
        public int hashCode() { return Double.hashCode(bearing); }

        @Override
        public String toString() { return "HitWall[bearing=" + bearing + "]"; }
    }

    /** Another robot was destroyed. */
    public static final class RobotDeath extends Event {
        private final String name;

        /**
         * A death.
         *
         * @param name the name of the robot that died
         */
        public RobotDeath(String name) {
            this.name = Objects.requireNonNull(name);
        }

        /** @return the dead robot's name */
        public String name() { return name; }

        @Override
        public boolean equals(Object o) {
            return o instanceof RobotDeath && name.equals(((RobotDeath) o).name);
        }

        @Override
        public int hashCode() { return name.hashCode(); }

        @Override
        public String toString() { return "RobotDeath[" + name + "]"; }
    }

    /**
     * Whether two doubles are the same value. Unlike {@code ==}, this treats NaN as equal to
     * NaN, which is what a value class wants.
     */
    static boolean same(double a, double b) {
        return Double.compare(a, b) == 0;
    }
}
