package hadur117.twin.core;

/**
 * TwinSaor's gun: Saor's per-opponent Markov chain (docs/saor.md, SAOR-6 and SAOR-7) on the
 * Twin Duel's 800 x 800 field, aimed from a scan that may be a tick or two old because the
 * partner made it (TWIN-5, TWIN-6).
 *
 * <p>A state packs acceleration sign (3 values), integer speed (17) and turn in half steps of
 * the engine's largest turn at the last speed (5), as Saor's does. A row is a {@code char[]} of
 * {@link #ROW} + 1: successors, then the count. A playout from a state with no sample holds the
 * state, which is circular projection; a playout through a row of fewer than {@link #WARM}
 * samples votes at most {@link #HELD_WEIGHT} + {@link #TRUST} a sample.</p>
 */
public final class Gun {

    /** Packed states. */
    public static final int STATES = 579;
    /** Successor slots in a row; the slot after them holds the count. */
    public static final int ROW = 126;
    /** Samples a row needs before a playout through it keeps its full vote. */
    public static final int WARM = 8;
    /** Monte-Carlo playouts an aim. */
    public static final int PLAYOUTS = 64;
    /** Angle bins in a full circle. */
    public static final int BINS = 1024;
    /** A playout's vote while every step was drawn from a warm row. */
    public static final int WEIGHT = 100;
    /** The vote of a playout that held a state with no sample. */
    public static final int HELD_WEIGHT = 5;
    /** The vote a sample of a thin row adds. */
    public static final int TRUST = 12;
    /** Half the Twin Duel field. */
    public static final double HALF = 400;
    /** A playout point further than this from the centre on either axis is off the field. */
    public static final double MARGIN = 382.5;

    private Gun() {
    }

    /**
     * An angle brought into [-pi, pi], as {@code Utils.normalRelativeAngle} does, in fewer bytes.
     *
     * @param angle radians
     * @return the same direction in [-pi, pi]
     */
    public static double normalRelativeAngle(double angle) {
        return Math.atan2(Math.sin(angle), Math.cos(angle));
    }

    /**
     * {@code Rules.getTurnRateRadians} written out.
     *
     * @param velocity the speed, either sign
     * @return radians a tick
     */
    public static double turnRate(double velocity) {
        return Math.toRadians(10 - 0.75 * Math.abs(velocity));
    }

    /**
     * A bullet's speed. The engine raises a power under 0.1 to 0.1; TwinSaor's powers fall
     * below it only past 2,000 px or under 1.1 energy, where the 0.3 px a tick does not matter.
     *
     * @param power the power asked for, at most 3
     * @return px a tick
     */
    public static double bulletSpeed(double power) {
        return 20 - 3 * power;
    }

    /**
     * Packs two consecutive scans of one robot into a state.
     *
     * @param velocity its velocity this scan
     * @param lastVelocity its velocity at the scan a tick before
     * @param lastHeading its heading then, radians
     * @param heading its heading now, radians
     * @return the state, below {@link #STATES}
     */
    public static int state(double velocity, double lastVelocity, double lastHeading, double heading) {
        return (int) Math.signum(velocity - lastVelocity) + 1
            + ((int) (8.5 + velocity) << 2)
            + ((int) (-2 * normalRelativeAngle(lastHeading - heading) / turnRate(lastVelocity) + 2.5) << 7);
    }

    /**
     * Records that {@code state} followed the row's state: a ring, so once the row is full the
     * newest sample replaces the oldest. The count in the last slot keeps counting.
     *
     * @param row the row of the earlier state
     * @param state the state that followed
     */
    public static void record(char[] row, int state) {
        // The count runs on; a char holds 65,535 transitions of one row, more than a battle makes.
        row[row[ROW]++ % ROW] = (char) state;
    }

    /**
     * Aims: {@link #PLAYOUTS} playouts of the chain from the scanned state until a bullet of
     * {@code power} fired from ({@code x}, {@code y}) on the next tick would reach the robot,
     * each voted into nine bins with one more vote at its centre.
     *
     * @param table the robot's rows
     * @param state its state at the scan
     * @param age ticks since the scan: 0 for our own scan this tick, 1 or more for a relayed one
     * @param x our x
     * @param y our y
     * @param tx its x at the scan
     * @param ty its y at the scan
     * @param heading its heading at the scan, radians
     * @param velocity its velocity at the scan
     * @param power the bullet's power
     * @return the absolute gun heading to aim at, radians
     */
    public static double aim(char[][] table, int state, int age, double x, double y, double tx, double ty,
                             double heading, double velocity, double power) {
        int[] bins = new int[BINS];
        int best = 0;
        double speed = bulletSpeed(power);
        for (int i = 0; i < PLAYOUTS; i++) {
            double px = tx;
            double py = ty;
            double h = heading;
            double v = velocity;
            int id = state;
            int weight = WEIGHT;
            // The playout first catches up the scan's age, then runs until the bullet arrives.
            int ticks = 1 - age;
            do {
                int n = table[id][ROW];
                if (n > 0) {
                    id = table[id][(int) (Math.random() * Math.min(n, ROW))];
                }
                if (n < WARM) {
                    weight = Math.min(weight, n * TRUST + HELD_WEIGHT);
                }
                px += Math.sin(h += ((id >> 7) - 2) * turnRate(v) / 2) * (v = ((id >> 2) & 31) - 8);
                py += Math.cos(h) * v;
                if (Math.max(Math.abs(px - HALF), Math.abs(py - HALF)) > MARGIN) {
                    weight = 1;
                }
            } while (++ticks * speed < Math.hypot(px - x, py - y));
            int centre = (int) Math.floor(Math.atan2(px - x, py - y) * (BINS / 2 / Math.PI));
            for (int k = -4; k <= 4; k++) {
                int b = centre + k & (BINS - 1);
                if ((bins[b] += weight + (k == 0 ? 1 : 0)) > bins[best]) {
                    best = b;
                }
            }
        }
        return best * (Math.PI / (BINS / 2));
    }
}
