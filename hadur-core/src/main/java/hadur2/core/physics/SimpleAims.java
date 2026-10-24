package hadur2.core.physics;

/**
 * DODGE-1: where the simple guns would have aimed a wave's bullet at us, as Saguaro's
 * ShotDodger reads them (docs/bench/rivals-source-read.md): head-on, linear, circular and
 * averaged linear, each aimed on the wave's tick or one or two ticks before it (the enemy reads
 * our scan a tick late, and its gun turns a tick after it aims), from where the enemy stood on
 * that tick at where we stood. The predicted paths stop at the walls, where a robot's centre
 * stays 18 px in.
 *
 * <p>An aim is indexed {@code lag * TYPES + type}. A state is {@code {x, y, heading, velocity,
 * turn, averageVelocity, enemyX, enemyY}}: ours, then the enemy's position, in px, radians on
 * Robocode's compass, px/tick and radians per tick. Pure: no engine types, no clock, no
 * randomness.</p>
 */
public final class SimpleAims {

    /** Head-on: straight at where we stood. */
    public static final int HEAD_ON = 0;
    /** Linear: along our heading at our velocity, until the bullet catches us. */
    public static final int LINEAR = 1;
    /** Circular: as linear, turning by our last turn every tick. */
    public static final int CIRCULAR = 2;
    /** Averaged linear: as linear, at our average velocity of the last ticks. */
    public static final int AVERAGE_LINEAR = 3;
    /** Aim types per lag. */
    public static final int TYPES = 4;
    /** Lags: the wave's tick and the two ticks before. */
    public static final int LAGS = 3;
    /** A state's length. */
    public static final int STATE = 8;
    /** All the aims, {@code LAGS * TYPES}. */
    public static final int COUNT = LAGS * TYPES;
    /** Ticks a prediction may run; a bullet slower than us never catches us otherwise. */
    static final int MAX_TICKS = 200;
    /** A robot's half width, px: how far inside the walls its centre stays. */
    static final double HALF = 18.0;

    private SimpleAims() {}

    /**
     * Every aim's absolute angle, from the enemy's position in its lag's state; NaN for a lag
     * with no state.
     *
     * @param states the state on the wave's tick ({@code states[0]}) and the ticks before, any
     *     may be null
     * @param bulletSpeed the bullet's speed, px/tick
     * @param width the field's width, px
     * @param height the field's height, px
     */
    public static double[] angles(double[][] states, double bulletSpeed,
                                  double width, double height) {
        double[] out = new double[COUNT];
        for (int lag = 0; lag < LAGS; lag++) {
            double[] s = states == null || lag >= states.length ? null : states[lag];
            for (int type = 0; type < TYPES; type++) {
                out[lag * TYPES + type] = s == null ? Double.NaN
                    : angle(type, s[6], s[7], s, bulletSpeed, width, height);
            }
        }
        return out;
    }

    /** One aim's absolute angle from the source, radians in [0, 2 pi). */
    static double angle(int type, double sx, double sy, double[] s, double bulletSpeed,
                        double width, double height) {
        double x = s[0];
        double y = s[1];
        if (type == HEAD_ON) return bearing(sx, sy, x, y);
        double heading = s[2];
        double v = type == AVERAGE_LINEAR ? s[5] : s[3];
        double turn = type == CIRCULAR ? s[4] : 0;
        for (int t = 1; t <= MAX_TICKS; t++) {
            heading += turn;
            x = Math.max(HALF, Math.min(width - HALF, x + Math.sin(heading) * v));
            y = Math.max(HALF, Math.min(height - HALF, y + Math.cos(heading) * v));
            double reach = bulletSpeed * t;
            if (reach * reach >= (x - sx) * (x - sx) + (y - sy) * (y - sy)) break;
        }
        return bearing(sx, sy, x, y);
    }

    /** Absolute bearing from the first point to the second, radians in [0, 2 pi), 0 north. */
    static double bearing(double x1, double y1, double x2, double y2) {
        double a = Math.atan2(x2 - x1, y2 - y1);
        return a < 0 ? a + 2 * Math.PI : a;
    }
}
