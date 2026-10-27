package hadur117.mini.core;

/**
 * Deise's movement (DEISE-1 to DEISE-5): a least-risk point each tick from a ring of candidates.
 * The risk of a point adds, for each live opponent, a push away from it, a cost for heading
 * straight at or away from an opponent that is likely aiming at Deise, and the danger of the
 * waves it was seen to fire (weighed by {@link #WAVES}); while the field is crowded, the distance to the nearest corner, so
 * Deise holds Saor's corners early and comes out of them as the field thins. Pure: opponents are
 * rows {x, y, energy} (null when unseen or dead), waves rows {x, y, fire time, speed, head-on
 * angle, linear angle, weight} (null when free).
 */
public final class Move {

    /** Opponent row fields. */
    public static final int X = 0;
    public static final int Y = 1;
    public static final int ENERGY = 2;
    /** Wave row fields. */
    public static final int TIME = 2;
    public static final int SPEED = 3;
    public static final int HEAD_ON = 4;
    public static final int LINEAR = 5;
    public static final int WEIGHT = 6;
    /** Candidate headings in the ring. */
    public static final int CANDIDATES = 36;
    /** Opponents left at or above which the corners pull (DEISE-4). */
    public static final int CROWD = 4;
    /**
     * How much the seen-shot waves count (DEISE-5): 0 since stage E0's smoke, where they cost
     * about 13 APS at full weight and 3 at 0.3 (docs/deise.md section 4). Kept for arm W.
     */
    public static final double WAVES = 0;

    private Move() {
    }

    /** How far the ring reaches: 0.45 of the target's distance, within 36 to 160 px (DEISE-1). */
    public static double reach(double targetDistance) {
        return Math.max(36, Math.min(160, targetDistance * 0.45));
    }

    /**
     * The least-risk point of the ring around (myX, myY), as {x, y, risk} (DEISE-1). Points closer
     * than Gun.MARGIN to a wall are not candidates; when every point is, Deise's own place wins.
     */
    public static double[] best(double myX, double myY, double reach, double[][] bots, double[][] waves,
                                double time, int others) {
        double[] best = {myX, myY, Double.POSITIVE_INFINITY};
        for (int i = 0; i < CANDIDATES; i++) {
            double heading = i * 2 * Math.PI / CANDIDATES;
            double px = myX + Math.sin(heading) * reach;
            double py = myY + Math.cos(heading) * reach;
            if (Math.min(Math.min(px, py), Gun.FIELD - Math.max(px, py)) >= Gun.MARGIN) {
                double r = risk(px, py, heading, myX, myY, bots, waves, time, others);
                if (r < best[2]) {
                    best = new double[] {px, py, r};
                }
            }
        }
        return best;
    }

    /** The risk of moving on {@code heading} to (px, py) (DEISE-2 to DEISE-5). */
    public static double risk(double px, double py, double heading, double myX, double myY, double[][] bots,
                              double[][] waves, double time, int others) {
        double r = 0;
        for (double[] bot : bots) {
            if (bot != null) {
                // Away from every opponent, harder from strong ones (DEISE-2).
                r += (50000 + bot[ENERGY] * 500) / sq(px - bot[X], py - bot[Y]);
                // Across, not along, the line of an opponent likely aiming at us (DEISE-3).
                if (aimsAtUs(bot, myX, myY, bots)) {
                    r += Math.abs(Math.cos(Math.atan2(bot[X] - px, bot[Y] - py) - heading));
                }
            }
        }
        for (double[] wave : waves) {
            if (wave != null) {
                r += WAVES * danger(wave, px, py, time);
            }
        }
        if (others >= CROWD) {
            // To the nearest corner while crowded (DEISE-4).
            r += others * Math.hypot(Math.min(px, Gun.FIELD - px), Math.min(py, Gun.FIELD - py)) / 5000;
        }
        return r;
    }

    /**
     * Whether an opponent likely aims at Deise: no other opponent is within 0.9 of Deise's distance
     * from it, so Deise is, or is nearly, its nearest robot (DEISE-3, DEISE-5).
     */
    public static boolean aimsAtUs(double[] bot, double myX, double myY, double[][] bots) {
        double mine = 0.81 * sq(bot[X] - myX, bot[Y] - myY);
        for (double[] other : bots) {
            if (other != null && other != bot && sq(bot[X] - other[X], bot[Y] - other[Y]) < mine) {
                return false;
            }
        }
        return true;
    }

    /**
     * A wave fired at Deise from (ox, oy) at {@code time} with {@code power}, its bullet on Deise's
     * head-on line or on the line that leads Deise's present motion (DEISE-5). Its weight is 1
     * when the shooter likely aims at Deise and 0.25 otherwise.
     */
    public static double[] wave(double ox, double oy, double time, double power, double myX, double myY,
                                double myHeading, double myVelocity, double weight) {
        double speed = 20 - 3 * power;
        double headOn = Math.atan2(myX - ox, myY - oy);
        return new double[] {ox, oy, time, speed, headOn,
            headOn + Math.asin(myVelocity * Math.sin(myHeading - headOn) / speed), weight};
    }

    /**
     * The danger of (px, py) from a wave: for each of its two lines, where the bullet will be when
     * it has come as far as the point, near the point is dangerous; a wave already past the point
     * is not (DEISE-5).
     */
    public static double danger(double[] wave, double px, double py, double time) {
        double reach = Math.hypot(px - wave[X], py - wave[Y]);
        if ((time - wave[TIME]) * wave[SPEED] > reach + 30) {
            return 0;
        }
        double d = 0;
        for (int line = HEAD_ON; line <= LINEAR; line++) {
            d += 4000 / (800 + sq(px - wave[X] - Math.sin(wave[line]) * reach, py - wave[Y] - Math.cos(wave[line]) * reach));
        }
        return d * wave[WEIGHT];
    }

    /** Whether a wave has passed every point Deise can reach, so its slot is free. */
    public static boolean spent(double[] wave, double myX, double myY, double time) {
        return (time - wave[TIME]) * wave[SPEED] > Math.hypot(myX - wave[X], myY - wave[Y]) + 200;
    }

    static double sq(double dx, double dy) {
        return dx * dx + dy * dy;
    }
}
