package hadur2.core.policy;

import hadur2.core.memory.Estimate;

/**
 * MOVE-2: when the enemy hits us more than its profile says it does, beyond the margin of
 * error, the movement changes flavour at the next surfable wave. Each change adds one more
 * step, in {@link Step}'s order, and then needs fresh evidence (a window started at the
 * change) before the next: a gun that has learned the new movement too shows it again.
 * With no profile there is no baseline, so a stranger never changes flavour (DIAL-1).
 *
 * <p>{@code HadurCore} makes one per opponent, with the profile's raw hit rate on us as the
 * baseline, and calls {@link #onWave(boolean)} for every enemy wave that breaks. When a step
 * is returned it applies it through the movement's own setters (the flattener views, the
 * surf's go-to mode, {@link DistancePolicy#shiftOut}); this class only decides. After
 * {@link Step#FAR} there is nothing left to add and the flavour stays where it is.</p>
 */
public final class MoveFlavour {

    /** The flavours in the order they are added; each keeps the ones before it. */
    public enum Step {
        /** As the opening set it. */
        BASE,
        /** The flattener views on, whatever their thresholds say. */
        FLATTENER,
        /** Go-to surfing instead of the three options. */
        GO_TO,
        /** The distance band moved out by {@link #FAR_SHIFT}. */
        FAR
    }

    /**
     * DIAL-1: the live rate's margin must be at most this before it can change anything.
     * Agresti-Coull is generous with a handful of waves (one hit in one wave already clears a
     * 10% baseline), so a change waits for about 40 waves of evidence.
     */
    public static final double MAX_MARGIN = 0.15;

    /** How far {@link Step#FAR} moves the distance band out, in px. */
    public static final double FAR_SHIFT = 100;

    /** Their hit rate on us as the profile remembers it; {@link Estimate#NONE} for a stranger. */
    private final Estimate baseline;
    /** Their waves since the last change, hit or not. */
    private final HitWindow window = new HitWindow();
    private Step step = Step.BASE;
    /** The live rate that made the last change. */
    private Estimate trigger = Estimate.NONE;

    /**
     * A flavour at {@link Step#BASE} for an opponent the profile knows.
     *
     * @param baseline their hit rate on us over the waves the profile remembers
     */
    public MoveFlavour(Estimate baseline) {
        this.baseline = baseline;
    }

    /**
     * A stranger's: no baseline, so no change.
     *
     * @return a flavour that stays at {@link Step#BASE}
     */
    public static MoveFlavour stranger() {
        return new MoveFlavour(Estimate.NONE);
    }

    /**
     * One enemy wave broke, a hit or a miss. Returns the step added, or null when the
     * flavour stays.
     *
     * <p>The outcome is always recorded, so {@link #live()} keeps reporting. A change needs
     * the live estimate to be certain enough ({@link #MAX_MARGIN}) and certainly above the
     * baseline ({@link #above}); it then moves one step on and clears the window, so the
     * next change is judged only on waves against the new flavour.</p>
     *
     * @param hit whether the wave's bullet hit us
     * @return the step just added, or null for no change
     */
    public Step onWave(boolean hit) {
        window.record(hit);
        if (step == Step.FAR || Double.isNaN(baseline.value())) return null;
        Estimate live = window.estimate();
        if (!live.within(MAX_MARGIN) || !above(live, baseline)) return null;
        step = Step.values()[step.ordinal() + 1];
        trigger = live;
        window.clear();
        return step;
    }

    /**
     * DIAL-1: whether {@code live} exceeds {@code baseline} by more than the margin of
     * error of the difference (both at their Agresti-Coull centres).
     *
     * <p>As in {@link DistancePolicy#certainLead}, the margin of the difference of two
     * independent estimates is the root of the sum of their squared margins. Either rate
     * unknown means no.</p>
     *
     * @param live their hit rate on us since the last change
     * @param baseline their hit rate on us in the profile
     * @return whether {@code live} is certainly the higher
     */
    public static boolean above(Estimate live, Estimate baseline) {
        if (Double.isNaN(live.value()) || Double.isNaN(baseline.value())) return false;
        return live.center() - baseline.center() > Math.hypot(live.margin(), baseline.margin());
    }

    /** The flavour now: the last step added, or {@link Step#BASE}. */
    public Step step() {
        return step;
    }

    /** Their hit rate on us from the profile, which the live rate is compared with. */
    public Estimate baseline() {
        return baseline;
    }

    /** The live rate that made the last change, or {@link Estimate#NONE} before any. */
    public Estimate trigger() {
        return trigger;
    }

    /** The rate since the last change, over at most the last {@link HitWindow#DEFAULT_CAPACITY} waves. */
    public Estimate live() {
        return window.estimate();
    }
}
