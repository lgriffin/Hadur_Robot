package hadur2.core.policy;

import hadur2.core.memory.Estimate;

/**
 * The distance Hadur tries to fight at (the artifact's distance controller). 1.20 held a
 * fixed 650 px, which on an 800x600 field is a retreat: bullets take 33-45 ticks to arrive
 * and our own gun's escape angle is at its widest.
 *
 * <ul>
 * <li>The target starts at the opening's distance ({@link #CEILING} for a stranger, so a
 *     stranger meets 1.20's distance until this battle's evidence says otherwise).</li>
 * <li>DIST-1: on each enemy wave, while our rolling hit rate exceeds theirs by
 *     {@link #GAP} or more, the target comes in {@link #STEP} px, not below {@link #FLOOR}
 *     (400 px; the artifact's 150 px cost score share, see the constant).
 *     While theirs exceeds ours by as much, it goes back out a step, not beyond
 *     {@link #CEILING}.</li>
 * <li>DIAL-1: coming in is the aggressive setting, so the lead must be certain: the gap
 *     between the two estimates' centres, less its 95% margin (the two margins combined),
 *     must still be {@link #GAP} or more. Going out is the conservative one and needs no
 *     certainty. (With only "a lead of any size is certain", the S5 bench saw a cold battle
 *     against Shadow, where the two rates are equal, walk in to 175 px on noise: 100-shot
 *     windows checked on every wave of 35 rounds find a false lead sooner or later.)</li>
 * <li>END-1: while finishing, the target is {@link #FINISH} whatever the controller holds;
 *     the controller's own target is kept for when the endgame ends.</li>
 * </ul>
 *
 * <p>Where it sits in the tick: {@code HadurCore} makes one per opponent from the opening
 * book's distance, calls {@link #onWave} once for each enemy wave that broke this tick, with
 * the two {@link HitWindow} estimates, and hands {@link #target(boolean)} to the surf as its
 * desired distance. MOVE-2's last flavour moves the band out through {@link #shiftOut}. The
 * target is a centre-to-centre distance in px and always lies in [{@link #FLOOR},
 * {@link #CEILING}], apart from END-1's {@link #FINISH}.</p>
 */
public final class DistancePolicy {

    /**
     * The closest the controller goes. The artifact said 150; the S5 bench put it at 400:
     * at 150 px the sample bots' head-on and linear guns hit Hadur often enough to cost a
     * point or two of score share, and 300 still cost a little, while 400 kept every sample
     * bot's share at its S4 level and still ended rounds sooner. END-1 still closes to 150
     * to finish, where the enemy is nearly dead and its gun is the hotter one.
     */
    public static final double FLOOR = 400;
    /** 1.20's fixed distance, and the furthest the controller goes. */
    public static final double CEILING = 650;
    /** DIST-1: how far one wave moves the target, in px, in or out. */
    public static final double STEP = 25;
    /** The hit-rate gap, as a rate, that moves the target. */
    public static final double GAP = 0.05;
    /** END-1's target: at 150 px a 36 px robot spans 14 degrees and any gun hits. */
    public static final double FINISH = 150;

    /**
     * How a wave moved the target: {@code IN} a step on a certain lead of ours, {@code OUT}
     * a step on their lead, or {@code HOLD} with no clear lead either way, no rates yet, or
     * the target already at the bound it would move toward.
     */
    public enum Step { IN, OUT, HOLD }

    /** Where this controller started, in px: the opening book's distance for this opponent. */
    private final double opening;
    /** The controller's own target, in px, in [FLOOR, CEILING]. */
    private double target;

    /**
     * A controller starting at the opening's distance.
     *
     * @param opening the starting target, in px: {@link #CEILING} for a stranger, 400 to 550
     *     for a known gun tier (T0 to T3)
     * @throws IllegalArgumentException if {@code opening} is outside [{@link #FLOOR},
     *     {@link #CEILING}] or NaN
     */
    public DistancePolicy(double opening) {
        if (!(opening >= FLOOR && opening <= CEILING)) throw new IllegalArgumentException("opening " + opening);
        this.opening = opening;
        this.target = opening;
    }

    /**
     * DIST-1: one enemy wave's step, from both rolling hit rates.
     *
     * <p>The 5-point test reads the raw rates, and the step in also needs
     * {@link #certainLead} (DIAL-1). The step out needs only the raw gap, since further is
     * the conservative side. An empty window (NaN rate) holds the target.</p>
     *
     * @param ours our rolling hit rate on them
     * @param theirs their rolling hit rate on us
     * @return which way the target moved
     */
    public Step onWave(Estimate ours, Estimate theirs) {
        if (Double.isNaN(ours.value()) || Double.isNaN(theirs.value())) return Step.HOLD;
        double gap = ours.value() - theirs.value();
        if (gap >= GAP && certainLead(ours, theirs) && target > FLOOR) {
            target = Math.max(FLOOR, target - STEP);
            return Step.IN;
        }
        if (gap <= -GAP && target < CEILING) {
            target = Math.min(CEILING, target + STEP);
            return Step.OUT;
        }
        return Step.HOLD;
    }

    /**
     * DIAL-1: whether our rate leads theirs by at least {@link #GAP} beyond the 95% margin of the difference.
     *
     * <p>For two independent estimates the margin of their difference is the root of the
     * sum of their squared margins ({@code Math.hypot}). The gap is taken between the
     * Agresti-Coull centres ({@link Estimate#center()}), which the margins are measured from,
     * so a window of 0 hits in 3 shots does not read as a certain 0%.</p>
     *
     * @param ours our rolling hit rate on them
     * @param theirs their rolling hit rate on us
     * @return whether the lead is at least {@link #GAP} with 95% confidence
     */
    public static boolean certainLead(Estimate ours, Estimate theirs) {
        return ours.center() - theirs.center() - Math.hypot(ours.margin(), theirs.margin()) >= GAP;
    }

    /**
     * MOVE-2: moves the band out by {@code px}, not past {@link #CEILING}; returns the new target.
     * DIST-1 keeps stepping from the new target on later waves.
     *
     * @param px how far to move the target out, in px
     * @return the controller's new target, in px
     */
    public double shiftOut(double px) {
        target = Math.min(CEILING, target + px);
        return target;
    }

    /**
     * The target to steer to: {@link #FINISH} while finishing (END-1), else the controller's.
     *
     * @param finishing whether the endgame is in its END-1 finishing state
     * @return the distance to keep from the enemy, in px
     */
    public double target(boolean finishing) {
        return finishing ? FINISH : target;
    }

    /** The controller's own target, the endgame aside, in px. */
    public double controllerTarget() {
        return target;
    }

    /** The distance this controller started at, in px (the opening book's for this opponent). */
    public double opening() {
        return opening;
    }
}
