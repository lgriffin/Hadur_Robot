package hadur2.core.policy;

/**
 * MIR-1: recognising a robot that moves as a mirror image of us.
 *
 * <p>Some simple robots (the RoboRumble's {@code stelo.MirrorNano} and {@code MirrorMicro}
 * among them) drive, every tick, toward the reflection of our position through the
 * battlefield's centre. Against them Hadur's gun hit about 8% on the 3.4 bench: their path
 * follows ours, which none of the gun's features describe. A robot that mirrors us is,
 * though, exactly predictable from our own path, which Hadur decides.</p>
 *
 * <p>Each scan, the detector is given the enemy's position and our own position over the
 * last {@link #MAX_LAG} ticks. For each lag it keeps a running error: how far the enemy is
 * from the reflection of where we were that many ticks ago, an exponential average with
 * weight {@link #ALPHA}. The response is active once the best of those errors has stayed
 * under {@link #ON_ERROR} px for {@link #ON_SCANS} scans running ({@link #PRIMED_SCANS} once
 * a mirror has been confirmed this battle), and clears as soon as it goes over
 * {@link #OFF_ERROR}.</p>
 *
 * <p>The run is long because two surfers orbiting each other about a point near the centre
 * look like a mirror for a while: on the top-19 benches the longest such run under 30 px was
 * 80 scans, while MirrorNano's and MirrorMicro's shortest was 152 (they mirror from the first
 * tick to the last). Scans while either robot has {@link #MIN_ENERGY} energy or less do not
 * count: two nearly disabled robots crawling about stayed at each other's reflection for 335
 * scans in one round against Neuromancer. Only the reflection through the centre is checked:
 * the axis mirrors, which no RoboRumble robot is known to use, matched surfers far more
 * often.</p>
 *
 * <p>Plain values in, plain values out: positions in px, the field's size, no engine
 * types (DIAL-2). {@link #newRound()} forgets the run; the errors and the confirmation are
 * kept, since a mirror bot mirrors in every round.</p>
 */
public final class MirrorDetector {

    /** The longest lag, in ticks, between our position and the enemy's copy of it. */
    public static final int MAX_LAG = 8;
    /** The averaged error, in px, under which a reflection counts as followed. */
    public static final double ON_ERROR = 30;
    /** The averaged error, in px, over which an active response clears. */
    public static final double OFF_ERROR = 80;
    /** The scans running the error must stay under {@link #ON_ERROR} before activating. */
    public static final int ON_SCANS = 120;
    /** Ditto, once a mirror has been confirmed this battle. */
    public static final int PRIMED_SCANS = 30;
    /** The energy, for both robots, above which a close scan counts toward the run. */
    public static final double MIN_ENERGY = 10;
    /** The weight of each new error in the running average. */
    static final double ALPHA = 0.1;

    private final double width;
    private final double height;
    /** Running error per lag; NaN before the first reading. */
    private final double[] error = new double[MAX_LAG + 1];
    private int closeScans;
    private boolean active;
    private boolean confirmed;
    private int lag;

    /**
     * @param width the battlefield's width, in px
     * @param height the battlefield's height, in px
     */
    public MirrorDetector(double width, double height) {
        this.width = width;
        this.height = height;
        forget();
    }

    /** A new round: the run and the active state are forgotten; the errors and the confirmation are kept. */
    public void newRound() {
        closeScans = 0;
        active = false;
    }

    /** A different opponent: everything is forgotten. */
    public void forget() {
        newRound();
        confirmed = false;
        java.util.Arrays.fill(error, Double.NaN);
    }

    /**
     * One scan.
     *
     * @param enemyX the enemy's x this scan, in px
     * @param enemyY the enemy's y this scan, in px
     * @param ourX our x over the last ticks, newest first: {@code ourX[i]} is i ticks ago;
     *     shorter than {@link #MAX_LAG} + 1 early in a round
     * @param ourY our y, likewise
     * @param ourEnergy our energy
     * @param enemyEnergy the enemy's energy
     * @return whether the response is active after this scan
     */
    public boolean tick(double enemyX, double enemyY, double[] ourX, double[] ourY,
                        double ourEnergy, double enemyEnergy) {
        double best = Double.POSITIVE_INFINITY;
        int lags = Math.min(MAX_LAG + 1, Math.min(ourX.length, ourY.length));
        for (int l = 0; l < lags; l++) {
            double e = Math.hypot(enemyX - mirrorX(ourX[l], width),
                enemyY - mirrorY(ourY[l], height));
            error[l] = Double.isNaN(error[l]) ? e : error[l] + ALPHA * (e - error[l]);
            if (error[l] < best) {
                best = error[l];
                lag = l;
            }
        }
        // Two nearly disabled robots crawling still can sit at each other's reflection for
        // hundreds of ticks; such scans neither extend the run nor break it.
        boolean counts = ourEnergy > MIN_ENERGY && enemyEnergy > MIN_ENERGY;
        if (best >= ON_ERROR) closeScans = 0;
        else if (counts) closeScans++;
        if (closeScans >= (confirmed ? PRIMED_SCANS : ON_SCANS)) {
            active = true;
            confirmed = true;
        } else if (best > OFF_ERROR) {
            active = false;
        }
        return active;
    }

    /** Whether the response is active, as of the last {@link #tick}. */
    public boolean active() {
        return active;
    }

    /** Whether a mirror has been confirmed this battle, so later rounds activate sooner. */
    public boolean confirmed() {
        return confirmed;
    }

    /** The lag, in ticks, at which it follows best. */
    public int lag() {
        return lag;
    }

    /** The x of the reflection of {@code x} through the centre of a field {@code width} wide. */
    public static double mirrorX(double x, double width) {
        return width - x;
    }

    /** The y of the reflection of {@code y} through the centre of a field {@code height} high. */
    public static double mirrorY(double y, double height) {
        return height - y;
    }
}
