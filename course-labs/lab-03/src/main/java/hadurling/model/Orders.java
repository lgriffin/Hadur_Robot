package hadurling.model;

import java.util.Objects;

/**
 * What the brain wants the robot to do this tick. A field left as {@code NaN} means "leave
 * that setting as it was", exactly as if the robot had not called that setter. {@link #NONE}
 * leaves everything alone, and a fire power of 0 holds fire.
 *
 * <p>Angles are radians, clockwise positive; {@code ahead} is px, negative to reverse.</p>
 */
public final class Orders {

    /** Change nothing and hold fire. */
    public static final Orders NONE = new Orders(Double.NaN, Double.NaN, Double.NaN, Double.NaN, 0);

    private final double bodyTurn;
    private final double ahead;
    private final double gunTurn;
    private final double radarTurn;
    private final double firePower;

    private Orders(double bodyTurn, double ahead, double gunTurn, double radarTurn,
            double firePower) {
        this.bodyTurn = bodyTurn;
        this.ahead = ahead;
        this.gunTurn = gunTurn;
        this.radarTurn = radarTurn;
        this.firePower = firePower;
    }

    /** @return a builder that starts from {@link #NONE} */
    public static Builder builder() {
        return new Builder();
    }

    /** @return radians to turn the body, NaN to leave as it was */
    public double bodyTurn() { return bodyTurn; }
    /** @return px to drive, NaN to leave as it was */
    public double ahead() { return ahead; }
    /** @return radians to turn the gun, NaN to leave as it was */
    public double gunTurn() { return gunTurn; }
    /** @return radians to turn the radar (may be infinite), NaN to leave as it was */
    public double radarTurn() { return radarTurn; }
    /** @return the bullet power to fire; 0 holds fire */
    public double firePower() { return firePower; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Orders)) return false;
        Orders r = (Orders) o;
        return Event.same(bodyTurn, r.bodyTurn) && Event.same(ahead, r.ahead)
            && Event.same(gunTurn, r.gunTurn) && Event.same(radarTurn, r.radarTurn)
            && Event.same(firePower, r.firePower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyTurn, ahead, gunTurn, radarTurn, firePower);
    }

    @Override
    public String toString() {
        return "Orders[body=" + bodyTurn + ", ahead=" + ahead + ", gun=" + gunTurn
            + ", radar=" + radarTurn + ", fire=" + firePower + "]";
    }

    /** Builds {@link Orders} one field at a time; fields not set stay as in {@link #NONE}. */
    public static final class Builder {
        private double bodyTurn = Double.NaN;
        private double ahead = Double.NaN;
        private double gunTurn = Double.NaN;
        private double radarTurn = Double.NaN;
        private double firePower;

        private Builder() {}

        /**
         * @param radians the body turn, clockwise positive
         * @return this builder
         */
        public Builder bodyTurn(double radians) { this.bodyTurn = radians; return this; }

        /**
         * @param px the distance to drive, negative to reverse
         * @return this builder
         */
        public Builder ahead(double px) { this.ahead = px; return this; }

        /**
         * @param radians the gun turn, clockwise positive
         * @return this builder
         */
        public Builder gunTurn(double radians) { this.gunTurn = radians; return this; }

        /**
         * @param radians the radar turn, clockwise positive, may be infinite
         * @return this builder
         */
        public Builder radarTurn(double radians) { this.radarTurn = radians; return this; }

        /**
         * @param power the bullet power; 0 holds fire
         * @return this builder
         */
        public Builder fire(double power) { this.firePower = power; return this; }

        /** @return the finished, immutable orders */
        public Orders build() {
            return new Orders(bodyTurn, ahead, gunTurn, radarTurn, firePower);
        }
    }
}
