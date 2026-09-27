package hadur2.core.posture;

import hadur2.core.model.BotOrders;
import hadur2.core.physics.Angles;
import hadur2.core.physics.Rules;

/**
 * Treats the sentries' border as a wall for the duel's movement (GATE-3). The duel's
 * movement knows only the real walls, so its orders are checked instead: the robot is
 * simulated {@link #HORIZON} ticks ahead under them, and if it would come within
 * {@link #MARGIN} px of the border zone (or is already there), the orders are replaced by a
 * drive toward the field's centre. Gun, radar and fire orders pass through untouched.
 */
public final class SentryFence {

    /** Ticks simulated ahead: enough to turn and stop from full speed. */
    static final int HORIZON = 12;
    /** Clearance kept from the border zone, beyond the robot's half-width. */
    static final double MARGIN = 30.0;
    static final double HALF_WIDTH = 18.0;

    private final double width;
    private final double height;

    public SentryFence(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** How far in from each wall the robot's centre must stay for a sentry border. */
    public static double inset(double border) {
        return border + HALF_WIDTH + MARGIN;
    }

    /** Whether ({@code x}, {@code y}) is clear of the border zone, with the margin. */
    public boolean safe(double x, double y, double border) {
        double in = inset(border);
        return x >= in && x <= width - in && y >= in && y <= height - in;
    }

    /** Whether the border leaves a safe area at all; without one the fence stands aside. */
    public boolean enforceable(double border) {
        double in = inset(border);
        return border > 0 && width - 2 * in > 0 && height - 2 * in > 0;
    }

    /**
     * The duel's orders {@code o} for a robot at ({@code x}, {@code y}) with {@code heading}
     * and {@code velocity}, kept if they stay clear of a {@code border} px sentry zone, else
     * replaced by a drive to the centre.
     */
    public BotOrders apply(double x, double y, double heading, double velocity, BotOrders o,
                           double border) {
        if (!enforceable(border) || staysSafe(x, y, heading, velocity, o, border)) return o;
        double cx = width / 2, cy = height / 2;
        double turn = Angles.normalRelativeAngle(Math.atan2(cx - x, cy - y) - heading);
        double distance = Math.hypot(cx - x, cy - y);
        if (Math.abs(turn) > Math.PI / 2) {
            // Backing up is the shorter turn.
            turn = Angles.normalRelativeAngle(turn + Math.PI);
            distance = -distance;
        }
        return new BotOrders(turn, distance, Rules.MAX_VELOCITY, o.gunTurn(), o.radarTurn(),
            o.firePower());
    }

    /** Simulates the orders {@link #HORIZON} ticks ahead with the engine's movement rules. */
    public boolean staysSafe(double x, double y, double heading, double velocity, BotOrders o,
                      double border) {
        if (!safe(x, y, border)) return false;
        double turnLeft = Double.isNaN(o.bodyTurn()) ? 0 : o.bodyTurn();
        // Without an ahead order the robot keeps going the way it is going.
        double distLeft = Double.isNaN(o.ahead())
            ? (velocity < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY) : o.ahead();
        double maxV = Double.isNaN(o.maxVelocity()) ? Rules.MAX_VELOCITY
            : Math.min(Math.abs(o.maxVelocity()), Rules.MAX_VELOCITY);
        double v = velocity;
        for (int t = 0; t < HORIZON; t++) {
            double rate = Rules.getTurnRateRadians(Math.abs(v));
            double turn = Math.max(-rate, Math.min(rate, turnLeft));
            heading += turn;
            turnLeft -= turn;
            v = nextVelocity(v, distLeft, maxV);
            x += Math.sin(heading) * v;
            y += Math.cos(heading) * v;
            if (!Double.isInfinite(distLeft)) distLeft -= v;
            if (!safe(x, y, border)) return false;
        }
        return true;
    }

    /** One tick of the engine's acceleration toward the remaining distance, simplified. */
    static double nextVelocity(double v, double distLeft, double maxV) {
        double want = distLeft > 0 ? Math.min(maxV, distLeft) : distLeft < 0 ? -Math.min(maxV, -distLeft) : 0;
        if (v * want < 0 || Math.abs(want) < Math.abs(v)) {
            // Braking.
            return v > want ? Math.max(want, v - Rules.DECELERATION) : Math.min(want, v + Rules.DECELERATION);
        }
        return want > v ? Math.min(want, v + Rules.ACCELERATION) : Math.max(want, v - Rules.ACCELERATION);
    }
}
