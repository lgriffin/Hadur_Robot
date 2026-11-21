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
     * its three lags, in place of the three aims one tick back. On for the next census (pc-sg-wide
     * passed, PR #480); the ablation sgoff turns it off.
     */
    static final boolean WIDE = true;
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

    /** MOVE-33: the total standing weight of the learning-gun mimic members, shared out over them. */
    static final double MIMIC_PRIOR = 0.3;

    /** MOVE-56: the pattern-matcher mimic's standing weight, against the views' 1. */
    static final double PATTERN_PRIOR = 1.0;

    private double[] score;
    /** MOVE-65: the EM mixture's learnt weights (null with it off), one per member. */
    private double[] mix;
    /** MOVE-65: the flattener members after all the others (0 with the mixture off). */
    private int flats;
    /** MOVE-65: the waves learnt by the mixture this battle, hits and passes. */
    private int waves;
    /** MOVE-65: the sums of the learnt weights and of the priors. */
    private double mixSum, priorSum;
    /** MOVE-33: the mimic members after the aims (0 without them). */
    private final int mimics;
    /** MOVE-56: whether the pattern-matcher mimic is the last member. */
    private final boolean pattern;
    private int bullets;

    /** The views and the aims (MOVE-29). */
    public AimMembers() {
        this(0);
    }

    /** MOVE-33: the views, the aims, then {@code mimics} learning-gun mimics. */
    public AimMembers(int mimics) {
        this(mimics, false);
    }

    /** MOVE-56: the views, the aims, {@code mimics} learning-gun mimics, then with {@code pattern} the pattern-matcher mimic. */
    public AimMembers(int mimics, boolean pattern) {
        this.mimics = Math.max(0, mimics);
        this.pattern = pattern;
        this.score = new double[MEMBERS + this.mimics + (pattern ? 1 : 0)];
    }

    /** MOVE-56: whether the pattern-matcher mimic is a member (the last). */
    public boolean pattern() {
        return pattern;
    }

    /**
     * MOVE-65 em2: DrussGT 3.1.20's prior ratio (its two view models at 0.5 each against 0.06 for
     * all the rest) and a hit learnt once per tick of the bullet's flight, as DrussGT scores a hit at
     * every surf evaluation of its wave; off is em's views 0.5, 0.01 a member, one step a hit.
     */
    static final boolean EM2 = false;
    /** MOVE-65 em2: every member but the views shares this prior. */
    static final double EM2_OTHERS = 0.06;
    /** MOVE-65 em2: the most steps a hit is learnt in. */
    static final int EM2_MAX_STEPS = 60;
    /** MOVE-65: the views' prior in the EM mixture. */
    static final double EM_VIEW_PRIOR = EM2 ? 1.0 : 0.5;
    /** MOVE-65: every other member's prior in the EM mixture. */
    static final double EM_PRIOR = 0.01;
    /** MOVE-65: the mixture's learning rate a wave once the first {@value #EM_FIRST_HITS} hits are in (1/n before). */
    static final double EM_RATE = 0.01;
    /** MOVE-65: the hits learnt at rate 1/n. */
    static final int EM_FIRST_HITS = 5;
    /** MOVE-65: the learnt weights count n/(n + EM_TRUST) against the priors, n the hits learnt. */
    static final double EM_TRUST = 20.0;

    /**
     * MOVE-65: turns on the EM danger mixture (DrussGT 3.1.20 style) with {@code flats} flattener
     * views as members of their own after the others. Call before anything is learnt.
     */
    public void enableEm(int flats) {
        this.flats = Math.max(0, flats);
        this.score = new double[MEMBERS + mimics + (pattern ? 1 : 0) + this.flats];
        this.mix = new double[score.length];
        for (int m = 0; m < mix.length; m++) mix[m] = prior(m, mix.length);
        priorSum = 0;
        for (double p : mix) priorSum += p;
        mixSum = priorSum;
    }

    /** MOVE-65: whether the EM mixture is on. */
    public boolean em() {
        return mix != null;
    }

    /** MOVE-65: the flattener members (0 with the mixture off). */
    public int flats() {
        return flats;
    }

    /** MOVE-65: member m's prior in a mixture of {@code members}. */
    static double prior(int member, int members) {
        return member == 0 ? EM_VIEW_PRIOR : EM2 ? EM2_OTHERS / Math.max(1, members - 1) : EM_PRIOR;
    }

    /** Every member: the views, the aims, then the mimics. */
    public int members() {
        return score.length;
    }

    /** MOVE-33: the mimic members after the aims. */
    public int mimics() {
        return mimics;
    }

    /** Each member's weight now: its standing weight times 2^(POWER x score). */
    public double weight(int member) {
        if (mix != null) {
            double trust = bullets / (bullets + EM_TRUST);
            return trust * mix[member] / mixSum + (1 - trust) * prior(member, mix.length) / priorSum;
        }
        double standing = member == 0 ? 1.0 : member < MEMBERS ? PRIOR
            : member < MEMBERS + mimics ? MIMIC_PRIOR / mimics : PATTERN_PRIOR;
        return standing * Math.pow(2.0, POWER * score[member]);
    }

    /**
     * The danger: the members' weighted mean of their scores at an intersection, the views'
     * {@code viewScore} as member 0 and each aim's {@code aimScore}; an aim that is NaN (no
     * angle on this wave) is left out.
     */
    public double danger(double viewScore, double[] aimScore) {
        double sum = weight(0) * viewScore;
        double total = weight(0);
        for (int a = 0; a < aimScore.length && a + 1 < score.length; a++) {
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
        learn(scores, uniform, 1);
    }

    /**
     * As {@link #learn(double[], double)}; with the mixture on and em2, a hit is learnt in
     * {@code flightTicks} steps (at most {@value #EM2_MAX_STEPS}), the last at the hit's own rate.
     */
    public void learn(double[] scores, double uniform, int flightTicks) {
        if (!(uniform > 0)) return;
        if (mix != null) {
            bullets++;
            int steps = EM2 ? Math.max(1, Math.min(EM2_MAX_STEPS, flightTicks)) : 1;
            for (int k = 1; k < steps; k++) mixUpdate(scores, uniform, false, EM_RATE);
            mixUpdate(scores, uniform, false, bullets <= EM_FIRST_HITS ? 1.0 / bullets : EM_RATE);
            return;
        }
        for (int m = 0; m < score.length && m < scores.length; m++) {
            if (Double.isNaN(scores[m])) continue;
            double ratio = (1 - EPS) * Math.max(0.0, scores[m]) / 2.0 / uniform + EPS;
            score[m] = DECAY * score[m] + (1 - DECAY) * (Math.log(ratio) / Math.log(2.0));
        }
        bullets++;
    }

    /**
     * MOVE-65: learns a wave that passed us without hitting us: {@code scores} as {@link #learn}
     * reads them, over the angles our body covered while the wave crossed us. Each member's weight
     * scales with its share of mass NOT on our body. Does nothing with the mixture off.
     */
    public void learnPass(double[] scores, double uniform) {
        if (mix == null || !(uniform > 0) || !(uniform < 1)) return;
        mixUpdate(scores, uniform, true, EM_RATE);
    }

    /**
     * MOVE-65: one multiplicative mixture step at rate {@code rate}: the members with a say keep
     * their total weight, shared out by weight times their share on (hit) or off (pass) our body,
     * each share mixed with {@value #EPS} of a uniform guess's.
     */
    private void mixUpdate(double[] scores, double uniform, boolean pass, double rate) {
        double held = 0;
        double fit = 0;
        double[] share = new double[mix.length];
        for (int m = 0; m < mix.length && m < scores.length; m++) {
            if (Double.isNaN(scores[m])) {
                share[m] = Double.NaN;
                continue;
            }
            double on = Math.min(1.0, Math.max(0.0, scores[m] / 2.0));
            share[m] = pass ? (1 - EPS) * (1 - on) + EPS * (1 - uniform) : (1 - EPS) * on + EPS * uniform;
            held += mix[m];
            fit += mix[m] * share[m];
        }
        if (!(fit > 0)) return;
        for (int m = 0; m < mix.length && m < scores.length; m++) {
            if (Double.isNaN(share[m])) continue;
            mix[m] = (1 - rate) * mix[m] + rate * held * mix[m] * share[m] / fit;
        }
        mixSum = 0;
        for (double x : mix) mixSum += x;
        waves++;
    }

    /** MOVE-65: the waves the mixture learnt. */
    public int waves() {
        return waves;
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
