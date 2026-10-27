package hadur117.mini.core;

import java.util.Random;

/**
 * Deise's gun: Saor's per-opponent Markov play-it-forward with its graded vote (DEISE-6 to
 * DEISE-9). A state packs one tick of an opponent's movement: acceleration sign, speed, and turn
 * as a fraction of its turn rate. Each opponent has a row of up to {@link #ROW} successors per
 * state; an aim plays the target forward from its state by sampling successors until the bullet
 * reaches it, and votes for the angle it ends at. Pure: the robot passes its Random.
 */
public final class Gun {

    /** Successors kept per state; a row's count is at index ROW. */
    public static final int ROW = 126;
    /** Packed states: acceleration 0-2, speed 0-16 shifted 2, turn 0-4 shifted 7. */
    public static final int STATES = 579;
    /** Aim bins over the circle. */
    public static final int BINS = 1024;
    /** A row with fewer samples than this votes less (DEISE-8). */
    public static final int WARM = 8;
    /** Battlefield size and the margin a robot's centre keeps from a wall. */
    public static final double FIELD = 1000;
    public static final double MARGIN = 18;

    private Gun() {
    }

    /** The packed state of one tick: speed now, speed a tick ago, and the turn in that tick. */
    public static int state(double velocity, double lastVelocity, double turn) {
        return (int) Math.signum(velocity - lastVelocity) + 1
            + ((int) (8.5 + velocity) << 2)
            + (Math.max(0, Math.min(4, (int) (2 * turn / turnRate(lastVelocity) + 2.5))) << 7);
    }

    /** Robocode's turn rate at a speed, radians a tick. */
    public static double turnRate(double velocity) {
        return Math.toRadians(10 - 0.75 * Math.abs(velocity));
    }

    /** Records that {@code next} followed {@code from}; a full row replaces a random sample (DEISE-6). */
    public static void learn(char[][] table, int from, int next, Random random) {
        char[] row = table[from];
        row[row[ROW] < ROW ? row[ROW]++ : random.nextInt(ROW)] = (char) next;
    }

    /**
     * The absolute bearing to fire at (DEISE-7, DEISE-8, DEISE-9). Each playout starts at the target
     * with its state, heading and speed. A row with a sample moves the state to a random successor;
     * an empty row holds it, which plays the target on as a circle. A playout through a row of
     * fewer than WARM samples votes at most 5 + 12 a sample of that row; one that leaves the field
     * votes 1. A vote spreads over the bins the target's width covers at its distance.
     */
    public static double aim(char[][] table, int state, double x, double y, double heading, double velocity,
                             double myX, double myY, double power, int playouts, Random random) {
        int[] bins = new int[BINS];
        int best = 0;
        double speed = 20 - 3 * power;
        double distance = Math.hypot(x - myX, y - myY);
        int width = Math.max(1, (int) (Math.atan(18 / distance) * BINS / (2 * Math.PI)));
        for (int i = 0; i < playouts; i++) {
            double px = x;
            double py = y;
            double h = heading;
            double v = velocity;
            int id = state;
            int weight = 100;
            int ticks = 0;
            while (++ticks * speed < Math.hypot(px - myX, py - myY)) {
                int n = table[id][ROW];
                if (n > 0) {
                    id = table[id][random.nextInt(n)];
                }
                if (n < WARM) {
                    weight = Math.min(weight, n * 12 + 5);
                }
                h += ((id >> 7) - 2) * turnRate(v) / 2;
                v = ((id >> 2) & 31) - 8;
                px += Math.sin(h) * v;
                py += Math.cos(h) * v;
                if (Math.min(Math.min(px, py), FIELD - Math.max(px, py)) < MARGIN) {
                    weight = 1;
                }
            }
            int centre = (int) (Math.atan2(px - myX, py - myY) * BINS / (2 * Math.PI));
            for (int k = -width; k <= width; k++) {
                int b = (centre + k) & (BINS - 1);
                if ((bins[b] += weight + (k == 0 ? 1 : 0)) > bins[best]) {
                    best = b;
                }
            }
        }
        return best * 2 * Math.PI / BINS;
    }

    /**
     * Bullet power (DEISE-10): Saor's range power, log10(energy) * 325 / distance, capped at 1.9
     * plus one for every three opponents left, at what kills the target, and at 0.1 below.
     */
    public static double power(double energy, double targetEnergy, double distance, int others) {
        return Math.max(0.1, Math.min(Math.min(others / 3 + 1.9, Math.log10(energy) * 325 / distance),
            targetEnergy > 4 ? (targetEnergy + 2) / 6 : targetEnergy / 4));
    }
}
