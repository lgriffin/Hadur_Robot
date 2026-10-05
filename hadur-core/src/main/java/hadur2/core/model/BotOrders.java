package hadur2.core.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * What the robot should do this tick. A field left as {@code NaN} means "leave the
 * previous setting in place", as when an {@code AdvancedRobot} does not call the setter.
 * A {@code firePower} of 0 means do not fire.
 *
 * <p>The core's answer to one {@link BotInput}: {@code HadurCore.tick} fills a
 * {@link Builder} while it handles the tick, and {@code Guard} returns the result, or its
 * own safe orders when the core throws or returns nothing (RES-1). The adapter then calls
 * the matching {@code AdvancedRobot} setters: {@code setMaxVelocity},
 * {@code setTurnRightRadians}, {@code setAhead}, {@code setTurnGunRightRadians},
 * {@code setTurnRadarRightRadians}, and {@code setFire} only for a positive power, before
 * {@code execute()}. Angles are radians, clockwise positive; distances pixels.</p>
 *
 * <p>{@link #equals} compares fields with {@link Double#compare}, under which {@code NaN}
 * equals {@code NaN}, so "no order" matches "no order" when the replay checks that recorded
 * and replayed orders are identical (CORE-2).</p>
 *
 * <p>From A4 the orders also carry the messages to broadcast to teammates this tick
 * ({@link #messages()}), each a byte array in the core's link format (LINK-1). Off a team
 * there are none, and the adapter sends nothing.</p>
 */
public final class BotOrders {
    private final double bodyTurn;
    private final double ahead;
    private final double maxVelocity;
    private final double gunTurn;
    private final double radarTurn;
    private final double firePower;
    private final List<byte[]> messages;

    /**
     * Orders as the adapter applies them; {@code NaN} leaves a setting as it was.
     *
     * @param bodyTurn radians to turn the body, clockwise positive
     * @param ahead pixels to drive, negative for backwards
     * @param maxVelocity the speed limit, pixels per tick
     * @param gunTurn radians to turn the gun, clockwise positive
     * @param radarTurn radians to turn the radar, clockwise positive
     * @param firePower the bullet power to fire, or 0 to hold fire
     */
    public BotOrders(double bodyTurn, double ahead, double maxVelocity, double gunTurn, double radarTurn, double firePower) {
        this(bodyTurn, ahead, maxVelocity, gunTurn, radarTurn, firePower, List.of());
    }

    /**
     * Orders with messages to broadcast (A4).
     *
     * @param bodyTurn radians to turn the body, clockwise positive
     * @param ahead pixels to drive, negative for backwards
     * @param maxVelocity the speed limit, pixels per tick
     * @param gunTurn radians to turn the gun, clockwise positive
     * @param radarTurn radians to turn the radar, clockwise positive
     * @param firePower the bullet power to fire, or 0 to hold fire
     * @param messages the messages to broadcast, in order; each copied
     */
    public BotOrders(double bodyTurn, double ahead, double maxVelocity, double gunTurn, double radarTurn,
                     double firePower, List<byte[]> messages) {
        List<byte[]> copy = new ArrayList<>(messages.size());
        for (byte[] m : messages) copy.add(m.clone());
        this.messages = Collections.unmodifiableList(copy);
        this.bodyTurn = bodyTurn;
        this.ahead = ahead;
        this.maxVelocity = maxVelocity;
        this.gunTurn = gunTurn;
        this.radarTurn = radarTurn;
        this.firePower = firePower;
    }

    /** Radians to turn the body, clockwise positive; NaN leaves the previous turn. */
    public double bodyTurn() {
        return bodyTurn;
    }

    /** Pixels to drive, negative for backwards; NaN leaves the previous distance. */
    public double ahead() {
        return ahead;
    }

    /** The speed limit, pixels per tick; NaN leaves the previous limit. */
    public double maxVelocity() {
        return maxVelocity;
    }

    /** Radians to turn the gun, clockwise positive; NaN leaves the previous turn. */
    public double gunTurn() {
        return gunTurn;
    }

    /**
     * Radians to turn the radar, clockwise positive (may be infinite); NaN leaves the previous turn.
     */
    public double radarTurn() {
        return radarTurn;
    }

    /** The bullet power to fire this tick; 0 holds fire. */
    public double firePower() {
        return firePower;
    }

    /** The messages to broadcast this tick, in order (A4); empty off a team. Copies. */
    public List<byte[]> messages() {
        List<byte[]> copy = new ArrayList<>(messages.size());
        for (byte[] m : messages) copy.add(m.clone());
        return copy;
    }

    /** These orders with the drive replaced: the gun, radar, fire and messages kept (WEAVE-2). */
    public BotOrders withDrive(double bodyTurn, double ahead, double maxVelocity) {
        return new BotOrders(bodyTurn, ahead, maxVelocity, gunTurn, radarTurn, firePower, messages);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BotOrders)) return false;
        BotOrders that = (BotOrders) o;
        return Double.compare(bodyTurn, that.bodyTurn) == 0
            && Double.compare(ahead, that.ahead) == 0
            && Double.compare(maxVelocity, that.maxVelocity) == 0
            && Double.compare(gunTurn, that.gunTurn) == 0
            && Double.compare(radarTurn, that.radarTurn) == 0
            && Double.compare(firePower, that.firePower) == 0
            && sameMessages(messages, that.messages);
    }

    private static boolean sameMessages(List<byte[]> a, List<byte[]> b) {
        if (a.size() != b.size()) return false;
        for (int i = 0; i < a.size(); i++) if (!Arrays.equals(a.get(i), b.get(i))) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int h = java.util.Objects.hash(bodyTurn, ahead, maxVelocity, gunTurn, radarTurn, firePower);
        for (byte[] m : messages) h = 31 * h + Arrays.hashCode(m);
        return h;
    }

    @Override
    public String toString() {
        return "BotOrders[bodyTurn=" + bodyTurn + ", ahead=" + ahead + ", maxVelocity=" + maxVelocity + ", gunTurn=" + gunTurn + ", radarTurn=" + radarTurn + ", firePower=" + firePower
            + (messages.isEmpty() ? "" : ", messages=" + messages.size()) + "]";
    }

    /** Orders that change nothing and hold fire: every setting {@code NaN}, power 0. */
    public static final BotOrders NONE = new Builder().build();

    /** A builder with every setting left as it was and the gun holding fire. */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Collects orders as the core decides them; later calls in a tick win, like Robocode setters.
     * Settings start as {@code NaN} (leave as it was) and the fire power as 0 (hold fire).
     */
    public static final class Builder {
        private double bodyTurn = Double.NaN;
        private double ahead = Double.NaN;
        private double maxVelocity = Double.NaN;
        private double gunTurn = Double.NaN;
        private double radarTurn = Double.NaN;
        private double firePower;
        private final List<byte[]> messages = new ArrayList<>();

        /** Radians, positive is clockwise. */
        public Builder turnRight(double radians) {
            bodyTurn = radians;
            return this;
        }

        /** Pixels, negative is backwards. */
        public Builder ahead(double distance) {
            ahead = distance;
            return this;
        }

        /** Pixels per tick; the engine caps it at 8. */
        public Builder maxVelocity(double velocity) {
            maxVelocity = velocity;
            return this;
        }

        /** Radians, positive is clockwise. */
        public Builder turnGunRight(double radians) {
            gunTurn = radians;
            return this;
        }

        /**
         * Radians, positive is clockwise. An infinite turn keeps the radar spinning that way,
         * which the radar reacquire uses (RADAR-1).
         */
        public Builder turnRadarRight(double radians) {
            radarTurn = radians;
            return this;
        }

        /** Bullet power to fire this tick; 0 holds fire. */
        public Builder fire(double power) {
            firePower = power;
            return this;
        }

        /** A message to broadcast to teammates this tick, after any already added (A4). */
        public Builder send(byte[] message) {
            messages.add(message.clone());
            return this;
        }

        /** The orders collected so far. */
        public BotOrders build() {
            return new BotOrders(bodyTurn, ahead, maxVelocity, gunTurn, radarTurn, firePower, messages);
        }
    }
}
