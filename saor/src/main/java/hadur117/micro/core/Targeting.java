package hadur117.micro.core;

/**
 * The gun: a per-opponent Markov chain over the target's movement state (Figment), played
 * forward by Monte-Carlo to bullet arrival and voted into angle bins. Saor's own part is its
 * confidence in a thin row: a row with any sample is drawn from, but a playout through a row of
 * fewer than {@link #WARM} samples votes at most {@link #HELD_WEIGHT} + {@link #TRUST} a sample
 * of that row (SAOR-7). A row with no sample holds the state, so the playout continues at the
 * scan's speed and turn rate, which is circular projection (SAOR-6).
 *
 * <p>A state packs acceleration sign (3 values), integer speed (17) and turn in half steps of
 * the engine's largest turn at the last speed (5) into one int below {@link #STATES}. A row is
 * a {@code char[]} of {@link #ROW} + 1: successors in the first {@link #ROW} slots, the count
 * of transitions seen in the last. Chars rather than Figment's ints keep 512 opponents' tables
 * at Figment's 75 MB for 256.</p>
 */
public final class Targeting {

    /** Packed states: acceleration 0-2, speed index 0-16 from bit 2, turn index 0-4 from bit 7. */
    public static final int STATES = 579;
    /** Successor slots in a row; the slot after them holds the count. */
    public static final int ROW = 126;
    /** Samples a row needs before a playout through it keeps its full vote (SAOR-7). */
    public static final int WARM = 8;
    /** Monte-Carlo playouts an aim (Figment runs 128). */
    public static final int PLAYOUTS = 64;
    /** Opponent tables; a name's hash picks one, so 155 opponents collide half as often as Figment's 256. */
    public static final int OPPONENTS = 512;
    /** Angle bins in a full circle; a power of two so a bin wraps with a mask. */
    public static final int BINS = 1024;
    /** A playout's vote while every step was drawn from a warm row. */
    public static final int WEIGHT = 100;
    /** Its vote once any step held a state with no sample (SAOR-6). */
    public static final int HELD_WEIGHT = 5;
    /** The vote a sample of a thin row adds, on {@link #HELD_WEIGHT}: 1 sample votes 17, 7 vote 89. */
    public static final int TRUST = 12;
    /** Its vote once any step left the field less the aim margin of 17.5 px. */
    public static final int OUT_WEIGHT = 1;

    private Targeting() {
    }

    /**
     * {@code Utils.normalRelativeAngle} written out, as the core imports nothing from the
     * engine, branch for branch so the two agree to the bit: the angle in [-pi, pi).
     *
     * @param angle radians
     * @return the same direction in [-pi, pi)
     */
    public static double normalRelativeAngle(double angle) {
        double a = angle % (2 * Math.PI);
        return a >= 0 ? (a < Math.PI ? a : a - 2 * Math.PI) : (a >= -Math.PI ? a : a + 2 * Math.PI);
    }

    /**
     * {@code Rules.getTurnRateRadians} written out: the largest turn a tick at a speed.
     *
     * @param velocity the speed, either sign
     * @return radians
     */
    public static double turnRate(double velocity) {
        return Math.toRadians(10 - 0.75 * Math.abs(velocity));
    }

    /**
     * The table for an opponent, by name hash (SAOR-7).
     *
     * @param tables every opponent's table
     * @param hash the opponent name's {@code hashCode}
     * @return that opponent's rows
     */
    public static char[][] table(char[][][] tables, int hash) {
        return tables[hash & (OPPONENTS - 1)];
    }

    /**
     * Packs a scan into a state.
     *
     * @param velocity the target's velocity this scan
     * @param lastVelocity its velocity at the target's scan before
     * @param lastHeading its heading then, radians
     * @param heading its heading now, radians
     * @return the state, below {@link #STATES} for any turn the engine allows a tick
     */
    public static int state(double velocity, double lastVelocity, double lastHeading, double heading) {
        return (int) Math.signum(velocity - lastVelocity) + 1
            + ((int) (8.5 + velocity) << 2)
            + ((int) (-2 * normalRelativeAngle(lastHeading - heading) / turnRate(lastVelocity) + 2.5) << 7);
    }

    /**
     * Records that {@code state} followed the row's state. Figment's idiom, quirk included: no
     * bounds check, so the sample after the {@link #ROW}th lands on the count slot and the
     * count becomes that state's value. A count past the row then makes the store throw, the
     * adapter's catch absorbs it and the count runs on; a count below it resumes writing over
     * old samples. Reads take the count modulo {@link #ROW}.
     *
     * @param row the row of the state the target was in at its scan before
     * @param state the state it is in now
     */
    public static void record(char[] row, int state) {
        row[row[ROW]++] = (char) state;
    }

    /**
     * Aims: {@link #PLAYOUTS} playouts of the chain from the target's state until a bullet of
     * {@code power} would reach it, each voted into nine bins with one more vote at its centre,
     * so a plateau of tied bins resolves to a playout's own bin rather than to its left edge.
     *
     * @param table the target's rows
     * @param state the target's state now
     * @param x our x
     * @param y our y
     * @param bearing absolute bearing to the target, radians
     * @param distance the target's distance
     * @param heading the target's heading, radians
     * @param velocity the target's velocity
     * @param power the bullet's power
     * @return the bin to aim at; {@link #angle} turns it into a heading
     */
    public static int aim(char[][] table, int state, double x, double y, double bearing,
                          double distance, double heading, double velocity, double power) {
        int[] bins = new int[BINS];
        int best = 0;
        int i = 0;
        do {
            double px = x + Math.sin(bearing) * distance;
            double py = y + Math.cos(bearing) * distance;
            double h = heading;
            double v = velocity;
            int id = state;
            // From 1, as Figment: the aim is for the next shot, a tick after this scan at best.
            int ticks = 1;
            int weight = WEIGHT;
            int n;
            do {
                if ((n = table[id][ROW]) > 0) {
                    id = table[id][(int) (Math.random() * n) % ROW];
                }
                if (n < WARM) {
                    weight = Math.min(weight, n * TRUST + HELD_WEIGHT);
                }
                px += Math.sin(h += ((id >> 7) - 2) * turnRate(v) / 2) * (v = ((id >> 2) & 31) - 8);
                py += Math.cos(h) * v;
                if (Math.max(Math.abs(px - 500), Math.abs(py - 500)) > 482.5) {
                    weight = OUT_WEIGHT;
                }
            } while (++ticks * Energy.bulletSpeed(power) < Math.hypot(px - x, py - y));
            int k = -4;
            int b;
            do {
                if ((bins[b = (int) (Math.atan2(px - x, py - y) * (BINS / 2 / Math.PI)) + k & (BINS - 1)]
                        += weight + 1 / (Math.abs(k) + 1)) > bins[best]) {
                    best = b;
                }
            } while (++k <= 4);
        } while (++i < PLAYOUTS);
        return best;
    }

    /**
     * A bin's absolute heading.
     *
     * @param bin from {@link #aim}
     * @return radians
     */
    public static double angle(int bin) {
        return bin * (Math.PI / (BINS / 2));
    }
}
