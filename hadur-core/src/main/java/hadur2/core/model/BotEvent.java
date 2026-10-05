package hadur2.core.model;

/**
 * Engine events delivered to the robot during a tick, as plain immutable values. Angles are
 * radians; bearings are relative to the robot's heading, headings are absolute (0 = north,
 * clockwise). The set of event types is closed: these eleven are all there are.
 *
 * <p>The adapter ({@code hadur2.Hadur}, outside the core) turns each Robocode event into one
 * of these in its event handlers, in the engine's own priority order, and hands the list to
 * the core inside the next {@link BotInput}. {@code HadurCore} then walks the list in that
 * order before it runs the main loop body. Because an event is only data, a battle can be
 * recorded as a transcript of inputs and replayed with no engine: the {@code equals} of
 * every event compares each field (doubles through {@link Double#compare}, so two
 * {@code NaN}s are equal), which is what lets the replay check that identical inputs gave
 * identical orders (CORE-2). This interface lives in the core, so the core never needs
 * {@code robocode.*} (CORE-1).</p>
 *
 * <p>The adapt and policy packages may not see this type (DIAL-2): events carry the
 * clock, and those policies must decide from evidence, not elapsed time.</p>
 *
 * <p>Written as final classes rather than records so the robot runs on Java 11, which
 * RoboRumble clients may still use (REL-1).</p>
 */
public interface BotEvent {

    /**
     * The radar saw a robot. {@code sentry} marks a Robocode 1.9 border sentry.
     *
     * <p>The duel builds almost everything from scans: the enemy's position (projected from
     * our position along our heading plus {@link #bearing()}, at {@link #distance()}), the
     * gun and movement waves, and the energy reading that the ledger turns into enemy shots
     * (WAVE-1, WAVE-2). A scan whose {@link #sentry()} is set is never tracked, targeted or
     * profiled (GATE-5), and it vetoes melee for the rest of the round (GATE-3).</p>
     */
    public static final class Scan implements BotEvent {
        private final String name;
        private final double bearing;
        private final double distance;
        private final double energy;
        private final double heading;
        private final double velocity;
        private final boolean sentry;

        /**
         * A scan of a robot that is not a sentry.
         *
         * @param name the scanned robot's full name, as the engine reports it
         * @param bearing radians from our body heading to the robot, clockwise positive
         * @param distance pixels from our centre to the robot's centre
         * @param energy the robot's energy when scanned
         * @param heading the robot's absolute body heading, radians (0 = north, clockwise)
         * @param velocity the robot's velocity in pixels per tick, negative when it drives
         *     backwards
         */
        public Scan(String name, double bearing, double distance, double energy, double heading, double velocity) {
            this(name, bearing, distance, energy, heading, velocity, false);
        }

        /**
         * A scan, saying whether the robot is a border sentry.
         *
         * @param name the scanned robot's full name, as the engine reports it
         * @param bearing radians from our body heading to the robot, clockwise positive
         * @param distance pixels from our centre to the robot's centre
         * @param energy the robot's energy when scanned
         * @param heading the robot's absolute body heading, radians (0 = north, clockwise)
         * @param velocity the robot's velocity in pixels per tick, negative when it drives
         *     backwards
         * @param sentry whether the engine reports the robot as a sentry (GATE-3, GATE-5)
         */
        public Scan(String name, double bearing, double distance, double energy, double heading, double velocity, boolean sentry) {
            this.name = name;
            this.bearing = bearing;
            this.distance = distance;
            this.energy = energy;
            this.heading = heading;
            this.velocity = velocity;
            this.sentry = sentry;
        }

        /** The scanned robot's full name (with version), as the engine reports it. */
        public String name() {
            return name;
        }

        /** Radians from our body heading to the scanned robot, clockwise positive. */
        public double bearing() {
            return bearing;
        }

        /** Pixels between our centre and the scanned robot's centre. */
        public double distance() {
            return distance;
        }

        /** The scanned robot's energy at the time of the scan. */
        public double energy() {
            return energy;
        }

        /** The scanned robot's absolute body heading, radians (0 = north, clockwise). */
        public double heading() {
            return heading;
        }

        /** The scanned robot's velocity, pixels per tick; negative while it drives backwards. */
        public double velocity() {
            return velocity;
        }

        /** Whether the scanned robot is a border sentry, which is never an opponent (GATE-5). */
        public boolean sentry() {
            return sentry;
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
                && Double.compare(velocity, that.velocity) == 0
                && sentry == that.sentry;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(name, bearing, distance, energy, heading, velocity, sentry);
        }

        @Override
        public String toString() {
            return "Scan[name=" + name + ", bearing=" + bearing + ", distance=" + distance + ", energy=" + energy + ", heading=" + heading + ", velocity=" + velocity + (sentry ? ", sentry" : "") + "]";
        }
    }

    /**
     * An enemy bullet hit us. {@code x}, {@code y} are where the bullet was.
     *
     * <p>The core uses it three ways: the enemy regains 3 &times; power, which the energy
     * ledger must subtract before it reads the next drop as a shot (WAVE-1); the bullet's
     * position and power pick out the enemy wave that carried it, so the surf learns the
     * guess factor it was fired at; and that wave, marked as a hit, reports a hit to their
     * rolling hit rate when it breaks.</p>
     */
    public static final class HitByBullet implements BotEvent {
        private final String name;
        private final double power;
        private final double x;
        private final double y;
        private final double heading;

        /**
         * An enemy bullet that hit us.
         *
         * @param name the name of the robot that fired it
         * @param power the bullet's power, in [0.1, 3.0]
         * @param x the bullet's x when it hit, pixels
         * @param y the bullet's y when it hit, pixels
         * @param heading the bullet's absolute heading, radians (0 = north, clockwise)
         */
        public HitByBullet(String name, double power, double x, double y, double heading) {
            this.name = name;
            this.power = power;
            this.x = x;
            this.y = y;
            this.heading = heading;
        }

        /** The name of the robot that fired the bullet. */
        public String name() {
            return name;
        }

        /** The bullet's power, in [0.1, 3.0]. */
        public double power() {
            return power;
        }

        /** The bullet's x when it hit us, pixels. */
        public double x() {
            return x;
        }

        /** The bullet's y when it hit us, pixels. */
        public double y() {
            return y;
        }

        /** The bullet's absolute heading, radians (0 = north, clockwise). */
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
     *
     * <p>The damage it did is part of the enemy's energy drop that the ledger explains away
     * before looking for a shot (WAVE-1). The bullet also leaves our bullets in flight, so it
     * no longer casts a shadow on the enemy's waves (MOVE-1).</p>
     */
    public static final class BulletHit implements BotEvent {
        private final String name;
        private final double power;
        private final double energy;
        private final double bulletHeading;

        /**
         * A hit whose bullet heading is unknown (older transcripts); the core then drops the
         * first bullet in flight of the same power.
         *
         * @param name the robot our bullet hit
         * @param power our bullet's power, in [0.1, 3.0]
         * @param energy the robot's energy after the hit
         */
        public BulletHit(String name, double power, double energy) {
            this(name, power, energy, Double.NaN);
        }

        /**
         * A hit by one of our bullets.
         *
         * @param name the robot our bullet hit
         * @param power our bullet's power, in [0.1, 3.0]
         * @param energy the robot's energy after the hit
         * @param bulletHeading our bullet's absolute heading, radians, or NaN when unknown
         */
        public BulletHit(String name, double power, double energy, double bulletHeading) {
            this.name = name;
            this.power = power;
            this.energy = energy;
            this.bulletHeading = bulletHeading;
        }

        /** Our bullet's absolute heading, radians (0 = north, clockwise); NaN when unknown. */
        public double bulletHeading() {
            return bulletHeading;
        }

        /** The name of the robot our bullet hit. */
        public String name() {
            return name;
        }

        /** Our bullet's power, in [0.1, 3.0]. */
        public double power() {
            return power;
        }

        /** The hit robot's energy after the hit. */
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
     *
     * <p>In a duel this is the evidence the shield detector counts (SHIELD-1). The enemy
     * bullet's position and power find the enemy wave it belonged to, which is then marked
     * as resolved so the surf stops dodging it, and the core checks that the collision fell
     * inside that wave's computed bullet shadow (MOVE-1).</p>
     */
    public static final class BulletHitBullet implements BotEvent {
        private final double power;
        private final double x;
        private final double y;
        private final double enemyPower;
        private final double bulletHeading;
        private final String owner;

        /**
         * A collision whose bullet heading is unknown (older transcripts).
         *
         * @param power our bullet's power
         * @param x the enemy bullet's x at the collision, pixels
         * @param y the enemy bullet's y at the collision, pixels
         * @param enemyPower the enemy bullet's power
         */
        public BulletHitBullet(double power, double x, double y, double enemyPower) {
            this(power, x, y, enemyPower, Double.NaN);
        }

        /**
         * A collision between one of our bullets and an enemy bullet.
         *
         * @param power our bullet's power
         * @param x the enemy bullet's x at the collision, pixels
         * @param y the enemy bullet's y at the collision, pixels
         * @param enemyPower the enemy bullet's power
         * @param bulletHeading our bullet's absolute heading, radians, or NaN when unknown
         */
        public BulletHitBullet(double power, double x, double y, double enemyPower,
                               double bulletHeading) {
            this(power, x, y, enemyPower, bulletHeading, null);
        }

        /**
         * A collision between one of our bullets and another robot's (A4).
         *
         * @param power our bullet's power
         * @param x the other bullet's x at the collision, pixels
         * @param y the other bullet's y at the collision, pixels
         * @param enemyPower the other bullet's power
         * @param bulletHeading our bullet's absolute heading, radians, or NaN when unknown
         * @param owner the robot that fired the other bullet, or null when unknown
         */
        public BulletHitBullet(double power, double x, double y, double enemyPower,
                               double bulletHeading, String owner) {
            this.power = power;
            this.x = x;
            this.y = y;
            this.enemyPower = enemyPower;
            this.bulletHeading = bulletHeading;
            this.owner = owner;
        }

        /**
         * The robot that fired the other bullet, so a teammate's can be told from an enemy's
         * (WORLD-6); null when unknown (older transcripts).
         */
        public String owner() {
            return owner;
        }

        /** Our bullet's absolute heading, radians (0 = north, clockwise); NaN when unknown. */
        public double bulletHeading() {
            return bulletHeading;
        }

        /** Our bullet's power. */
        public double power() {
            return power;
        }

        /** The enemy bullet's x at the collision, pixels. */
        public double x() {
            return x;
        }

        /** The enemy bullet's y at the collision, pixels. */
        public double y() {
            return y;
        }

        /** The enemy bullet's power, which picks out the enemy wave it came from. */
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
                && Double.compare(bulletHeading, that.bulletHeading) == 0
                && java.util.Objects.equals(owner, that.owner);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(power, x, y, enemyPower, bulletHeading, owner);
        }

        @Override
        public String toString() {
            return "BulletHitBullet[power=" + power + ", x=" + x + ", y=" + y + ", enemyPower="
                + enemyPower + ", bulletHeading=" + bulletHeading + ", owner=" + owner + "]";
        }
    }

    /**
     * One of our bullets left the field; {@code bulletHeading} as for {@link BulletHit}.
     * It counts as a miss in our rolling hit rate and removes the bullet from the shadows
     * it cast (MOVE-1).
     */
    public static final class BulletMissed implements BotEvent {
        private final double power;
        private final double bulletHeading;

        /**
         * A miss whose bullet heading is unknown (older transcripts).
         *
         * @param power our bullet's power
         */
        public BulletMissed(double power) {
            this(power, Double.NaN);
        }

        /**
         * A miss by one of our bullets.
         *
         * @param power our bullet's power
         * @param bulletHeading our bullet's absolute heading, radians, or NaN when unknown
         */
        public BulletMissed(double power, double bulletHeading) {
            this.power = power;
            this.bulletHeading = bulletHeading;
        }

        /** Our bullet's absolute heading, radians (0 = north, clockwise); NaN when unknown. */
        public double bulletHeading() {
            return bulletHeading;
        }

        /** Our bullet's power. */
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

    /**
     * We drove into a wall. Carried so a transcript holds every engine event; the core's
     * tick does not act on it (the enemy's own wall hits are inferred by the energy ledger
     * from its scans, not reported by the engine).
     */
    public static final class HitWall implements BotEvent {
        private final double bearing;

        /**
         * A wall hit.
         *
         * @param bearing radians from our body heading to the wall, clockwise positive
         */
        public HitWall(double bearing) {
            this.bearing = bearing;
        }

        /** Radians from our body heading to the wall we hit, clockwise positive. */
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

    /**
     * We collided with another robot. Both robots lose collision damage, so the energy ledger
     * books it against the duel opponent's next drop, which must not be read as a shot
     * (WAVE-1).
     */
    public static final class HitRobot implements BotEvent {
        private final String name;
        private final double bearing;
        private final double energy;
        private final boolean myFault;

        /**
         * A collision with another robot.
         *
         * @param name the robot we collided with
         * @param bearing radians from our body heading to that robot, clockwise positive
         * @param energy that robot's energy after the collision
         * @param myFault whether we drove into it (the engine's "at fault" flag)
         */
        public HitRobot(String name, double bearing, double energy, boolean myFault) {
            this.name = name;
            this.bearing = bearing;
            this.energy = energy;
            this.myFault = myFault;
        }

        /** The name of the robot we collided with. */
        public String name() {
            return name;
        }

        /** Radians from our body heading to the robot we collided with, clockwise positive. */
        public double bearing() {
            return bearing;
        }

        /** The other robot's energy after the collision. */
        public double energy() {
            return energy;
        }

        /** Whether we were moving into the other robot (the engine's "at fault" flag). */
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

    /**
     * A robot died. In melee it leaves the movement's risk and the gun's targets on the same
     * tick (MSENSE-1); when the duel is fighting one of several opponents, a dead focus
     * is replaced by another.
     */
    public static final class RobotDeath implements BotEvent {
        private final String name;

        /**
         * A death.
         *
         * @param name the robot that died
         */
        public RobotDeath(String name) {
            this.name = name;
        }

        /** The name of the robot that died. */
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

    /**
     * The engine skipped one of our turns because the previous tick ran too long. The core
     * drops one computation level for the rest of the round and records it (TIME-2).
     */
    public static final class SkippedTurn implements BotEvent {
        private final long skippedTime;

        /**
         * A skipped turn.
         *
         * @param skippedTime the tick that was skipped
         */
        public SkippedTurn(long skippedTime) {
            this.skippedTime = skippedTime;
        }

        /** The tick the engine skipped. */
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
     *
     * <p>The adapter assumes an allowance of 3 ms (the bench machine's CPU constant; a robot
     * cannot read the engine's). The policy package's tick budget compares the two numbers
     * and sheds work on the next tick when the previous one ran slow (TIME-1). The core's
     * ban on clocks (RES-6) stays intact because the time arrives as data.</p>
     */
    public static final class TickTime implements BotEvent {
        private final long usedNanos;
        private final long allowanceNanos;

        /**
         * A measurement of the previous tick.
         *
         * @param usedNanos nanoseconds the previous tick took
         * @param allowanceNanos nanoseconds the adapter assumes a tick may take
         */
        public TickTime(long usedNanos, long allowanceNanos) {
            this.usedNanos = usedNanos;
            this.allowanceNanos = allowanceNanos;
        }

        /** Nanoseconds the core's previous tick took, as the adapter measured it. */
        public long usedNanos() {
            return usedNanos;
        }

        /** Nanoseconds the adapter assumes one tick may take. */
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

    /**
     * A teammate's message (A4): its sender and the bytes it broadcast on the tick before.
     * The core reads them with its own link codec (LINK-1); a message that fails it is
     * ignored and counted (LINK-2). Off a team none ever arrives.
     */
    public static final class Message implements BotEvent {
        private final String sender;
        private final byte[] bytes;

        /**
         * A message.
         *
         * @param sender the teammate that sent it
         * @param bytes what it sent; copied
         */
        public Message(String sender, byte[] bytes) {
            this.sender = sender;
            this.bytes = bytes.clone();
        }

        /** The teammate that sent it. */
        public String sender() {
            return sender;
        }

        /** What it sent, as a copy. */
        public byte[] bytes() {
            return bytes.clone();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Message)) return false;
            Message that = (Message) o;
            return java.util.Objects.equals(sender, that.sender) && java.util.Arrays.equals(bytes, that.bytes);
        }

        @Override
        public int hashCode() {
            return 31 * java.util.Objects.hashCode(sender) + java.util.Arrays.hashCode(bytes);
        }

        @Override
        public String toString() {
            return "Message[sender=" + sender + ", bytes=" + bytes.length + "]";
        }
    }
}
