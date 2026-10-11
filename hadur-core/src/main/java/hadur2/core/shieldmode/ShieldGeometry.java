package hadur2.core.shieldmode;

import hadur2.core.physics.Angles;

/**
 * Where to fire so that our bullet meets an enemy bullet in mid-air (SHIELD-5).
 *
 * <p>The engine moves every bullet once per turn and destroys two bullets whose paths for
 * that turn cross. A bullet fired in the tick {@code t} code leaves from where the robot
 * stood at that tick and ends turn {@code k} at distance {@code speed * (k - t)}. So in
 * turn {@code k} our bullet sweeps a ring around the firing point, and it meets the enemy
 * bullet if it crosses the part of the enemy bullet's path for that turn that lies inside
 * the ring. That part, seen from the firing point, is an angular interval: the "shadow".
 * Firing at its middle meets the bullet with the most room for error.</p>
 *
 * <p>The engine checks robot hits before bullet hits, so the meeting has to happen before
 * the enemy bullet can first touch our body. If the firing point lies on the enemy bullet's
 * line the paths are collinear and never cross, which is why the shield steps aside first.</p>
 */
public final class ShieldGeometry {

    /** Half the diagonal of a robot's 36 px body, the farthest a bullet can hit from its centre. */
    public static final double BODY_HALF_DIAGONAL = 18 * Math.sqrt(2);
    private static final double MIN_WIDTH = 1e-8;

    private ShieldGeometry() {
    }

    /** An angle to fire at, how much room it has, and the turn in which the bullets meet. */
    public static final class Shadow {
        public final double fireAngle;
        public final double width;
        public final long interceptTurn;

        Shadow(double fireAngle, double width, long interceptTurn) {
            this.fireAngle = fireAngle;
            this.width = width;
            this.interceptTurn = interceptTurn;
        }
    }

    /**
     * The widest shadow of an enemy bullet fired in the tick {@code waveTime} code from
     * ({@code ox}, {@code oy}) at {@code enemyHeading}, for our bullet of speed
     * {@code mySpeed} fired in the tick {@code fireTime} code from ({@code px}, {@code py}),
     * meeting no later than turn {@code lastTurn}; null if there is none.
     */
    public static Shadow solve(double ox, double oy, long waveTime, double enemySpeed,
                               double enemyHeading, double px, double py, long fireTime,
                               double mySpeed, long lastTurn) {
        double dx = Math.sin(enemyHeading);
        double dy = Math.cos(enemyHeading);
        Shadow best = null;
        for (long k = Math.max(fireTime, waveTime) + 1; k <= lastTurn; k++) {
            double ax = ox + dx * enemySpeed * (k - 1 - waveTime);
            double ay = oy + dy * enemySpeed * (k - 1 - waveTime);
            double bx = ox + dx * enemySpeed * (k - waveTime);
            double by = oy + dy * enemySpeed * (k - waveTime);
            double dA = Math.hypot(ax - px, ay - py);
            double dB = Math.hypot(bx - px, by - py);
            double rIn = mySpeed * (k - 1 - fireTime);
            double rOut = mySpeed * (k - fireTime);
            // Past us, or moving away: no later turn can do better.
            if (dA < rIn || dB > dA) break;
            if (dB > rOut) continue;
            double[] start = dA <= rOut ? new double[] {ax, ay} : entry(px, py, ax, ay, bx, by, rOut);
            double[] end = dB >= rIn ? new double[] {bx, by} : entry(px, py, ax, ay, bx, by, rIn);
            if (start == null || end == null) continue;
            double a1 = bearing(px, py, start[0], start[1]);
            double a2 = bearing(px, py, end[0], end[1]);
            double span = Angles.normalRelativeAngle(a1 - a2);
            double width = Math.abs(span);
            if (width > MIN_WIDTH && (best == null || width > best.width)) {
                best = new Shadow(Angles.normalAbsoluteAngle(a2 + span / 2), width, k);
            }
        }
        return best;
    }

    /** The last turn before an enemy bullet could touch a body centred at ({@code x}, {@code y}). */
    public static long lastTurnBeforeContact(double ox, double oy, long waveTime, double enemySpeed,
                                             double x, double y) {
        double reach = Math.max(0, Math.hypot(x - ox, y - oy) - BODY_HALF_DIAGONAL);
        return waveTime + (long) Math.ceil(reach / enemySpeed) - 1;
    }

    /** Absolute bearing from the first point to the second, Robocode style (0 is north). */
    public static double bearing(double x1, double y1, double x2, double y2) {
        return Math.atan2(x2 - x1, y2 - y1);
    }

    /** Where the segment A to B first comes within {@code r} of P, or null. */
    private static double[] entry(double px, double py, double ax, double ay, double bx, double by,
                                  double r) {
        double sx = bx - ax;
        double sy = by - ay;
        double fx = ax - px;
        double fy = ay - py;
        double a = sx * sx + sy * sy;
        if (a < 1e-12) return null;
        double b = 2 * (fx * sx + fy * sy);
        double c = fx * fx + fy * fy - r * r;
        double disc = b * b - 4 * a * c;
        if (disc < 0) return null;
        double t = (-b - Math.sqrt(disc)) / (2 * a);
        if (t < -1e-9 || t > 1 + 1e-9) return null;
        t = Math.max(0, Math.min(1, t));
        return new double[] {ax + t * sx, ay + t * sy};
    }
}
