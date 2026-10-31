package hadur117.core.move;

/**
 * MOVE-29 (K1 of the road to king, docs/bench/gun-oracle.md): the simple aims as members of the
 * danger, beside the views. Three members, the head-on, linear and circular aims of
 * {@link hadur117.core.physics.SimpleAims} one tick back, each put the surf's kernel on its angle,
 * and the danger becomes the members' weighted mean with the views' score as member 0.
 *
 * <p>Each member keeps a rolling score of how well it predicted the bullets that hit us: a
 * decaying mean ({@value #DECAY} kept a bullet) of log2 of its probability at the bullet's angle
 * over a uniform guess's, mixed with {@value #EPS} of the uniform so a miss is not minus infinity.
 * Its weight is its standing weight (1 for the views, {@value #AIM_PRIOR} for an aim) times
 * 2^({@value #POWER} x score): a member counts for more once it has out-predicted the others on
 * real bullets. Scores start at 0 and run across the rounds of a battle. The oracle's read on the
 * 36 learning guns on flat movers: bullets from the safest third 8.1% to 7.6% (docs/bench/gun-oracle.md).</p>
 *
 * <p>Pure: no engine types, no clock, no randomness. Duel only, off unless the duel turns it on.</p>
 */
public final class AimMembers {

    /**
     * MOVE-31: the wide set, every simple angle {@link hadur117.core.physics.SimpleAims} gives
     * (head-on, linear, circular, averaged linear and the two one-line linear aims) at each of
     * its three lags, in place of the three aims one tick back. Off unless an ablation turns it on.
     */
    static final boolean WIDE = false;
    /** The members: the views, then the aims. */
    public static final int MEMBERS;
    /** Each new bullet's share of a member's rolling score is 1 - DECAY. */
    static final double DECAY = 0.8;
    /** The power of 2 on the score in a member's weight. */
    static final double POWER = 2.0;
    /** An aim's standing weight against the views' 1, for the three narrow aims. */
    static final double AIM_PRIOR = 0.1;
    /** The uniform mixed into every member's probability when it is scored. */
    static final double EPS = 0.05;
    /** The simple aims the members read: head-on, linear, circular, one tick back. */
    static final int[] AIMS;
    /**
     * Each aim's standing weight: {@value #AIM_PRIOR} for the three narrow aims, and the same
     * total (0.3) shared out over the wide set, so the views' head start is the same.
     */
    static final double PRIOR;

    static {
        int[] narrow = {
            hadur117.core.physics.SimpleAims.TYPES + hadur117.core.physics.SimpleAims.HEAD_ON,
            hadur117.core.physics.SimpleAims.TYPES + hadur117.core.physics.SimpleAims.LINEAR,
            hadur117.core.physics.SimpleAims.TYPES + hadur117.core.physics.SimpleAims.CIRCULAR,
        };
        AIMS = WIDE ? wideAims() : narrow;
        MEMBERS = AIMS.length + 1;
        PRIOR = AIM_PRIOR * narrow.length / AIMS.length;
    }

    /** MOVE-31: every angle type at every lag, lag-major. */
    static int[] wideAims() {
        int types = hadur117.core.physics.SimpleAims.ANGLES;
        int[] out = new int[hadur117.core.physics.SimpleAims.LAGS * types];
        for (int lag = 0; lag < hadur117.core.physics.SimpleAims.LAGS; lag++) {
            for (int t = 0; t < types; t++) out[lag * types + t] = lag * hadur117.core.physics.SimpleAims.TYPES + t;
        }
        return out;
    }

    private final double[] score = new double[MEMBERS];
    private int bullets;

    /** Each member's weight now: its standing weight times 2^(POWER x score). */
    public double weight(int member) {
        return (member == 0 ? 1.0 : PRIOR) * Math.pow(2.0, POWER * score[member]);
    }

    /**
     * The danger: the members' weighted mean of their scores at an intersection, the views'
     * {@code viewScore} as member 0 and each aim's {@code aimScore}; an aim that is NaN (no
     * angle on this wave) is left out.
     */
    public double danger(double viewScore, double[] aimScore) {
        double sum = weight(0) * viewScore;
        double total = weight(0);
        for (int a = 0; a < aimScore.length; a++) {
            if (Double.isNaN(aimScore[a])) continue;
            double wt = weight(a + 1);
            sum += wt * aimScore[a];
            total += wt;
        }
        return sum / total;
    }

    /**
     * Learns a bullet that hit us: {@code scores[m]} is member m's score over a window at the
     * bullet's angle (in the units where a kernel centred on the window scores 1, so its
     * probability there is half that), NaN when the member had no say; {@code uniform} is a
     * uniform guess's probability for the same window.
     */
    public void learn(double[] scores, double uniform) {
        if (!(uniform > 0)) return;
        for (int m = 0; m < MEMBERS && m < scores.length; m++) {
            if (Double.isNaN(scores[m])) continue;
            double ratio = (1 - EPS) * Math.max(0.0, scores[m]) / 2.0 / uniform + EPS;
            score[m] = DECAY * score[m] + (1 - DECAY) * (Math.log(ratio) / Math.log(2.0));
        }
        bullets++;
    }

    /** Member m's rolling score. */
    public double score(int member) {
        return score[member];
    }

    /** The bullets learnt this battle. */
    public int bullets() {
        return bullets;
    }
}
