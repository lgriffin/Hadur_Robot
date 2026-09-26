package hadur2.core.model;

/**
 * What the robot should do this tick. A field left as {@code NaN} means "leave the
 * previous setting in place", as when an {@code AdvancedRobot} does not call the setter.
 * A {@code firePower} of 0 means do not fire.
 */
public final class BotOrders {
    private final double bodyTurn;
    private final double ahead;
    private final double maxVelocity;
    private final double gunTurn;
    private final double radarTurn;
    private final double firePower;

    public BotOrders(double bodyTurn, double ahead, double maxVelocity, double gunTurn, double radarTurn, double firePower) {
        this.bodyTurn = bodyTurn;
        this.ahead = ahead;
        this.maxVelocity = maxVelocity;
        this.gunTurn = gunTurn;
        this.radarTurn = radarTurn;
        this.firePower = firePower;
    }

    public double bodyTurn() {
        return bodyTurn;
    }

    public double ahead() {
        return ahead;
    }

    public double maxVelocity() {
        return maxVelocity;
    }

    public double gunTurn() {
        return gunTurn;
    }

    public double radarTurn() {
        return radarTurn;
    }

    public double firePower() {
        return firePower;
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
            && Double.compare(firePower, that.firePower) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bodyTurn, ahead, maxVelocity, gunTurn, radarTurn, firePower);
    }

    @Override
    public String toString() {
        return "BotOrders[bodyTurn=" + bodyTurn + ", ahead=" + ahead + ", maxVelocity=" + maxVelocity + ", gunTurn=" + gunTurn + ", radarTurn=" + radarTurn + ", firePower=" + firePower + "]";
    }

    public static final BotOrders NONE = new Builder().build();

    public static Builder builder() {
        return new Builder();
    }

    /** Collects orders as the core decides them; later calls in a tick win, like Robocode setters. */
    public static final class Builder {
        private double bodyTurn = Double.NaN;
        private double ahead = Double.NaN;
        private double maxVelocity = Double.NaN;
        private double gunTurn = Double.NaN;
        private double radarTurn = Double.NaN;
        private double firePower;

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

        public Builder maxVelocity(double velocity) {
            maxVelocity = velocity;
            return this;
        }

        public Builder turnGunRight(double radians) {
            gunTurn = radians;
            return this;
        }

        public Builder turnRadarRight(double radians) {
            radarTurn = radians;
            return this;
        }

        public Builder fire(double power) {
            firePower = power;
            return this;
        }

        public BotOrders build() {
            return new BotOrders(bodyTurn, ahead, maxVelocity, gunTurn, radarTurn, firePower);
        }
    }
}
