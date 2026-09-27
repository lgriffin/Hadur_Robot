package hadur2.core.policy;

import hadur2.core.memory.Estimate;

/**
 * MOVE-2: when the enemy hits us more than its profile says it does, beyond the margin of
 * error, the movement changes flavour at the next surfable wave. Each change adds one more
 * step, in {@link Step}'s order, and then needs fresh evidence (a window started at the
 * change) before the next: a gun that has learned the new movement too shows it again.
 * With no profile there is no baseline, so a stranger never changes flavour (DIAL-1).
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

    /** How far {@link Step#FAR} moves the distance band out. */
    public static final double FAR_SHIFT = 100;

    private final Estimate baseline;
    private final HitWindow window = new HitWindow();
    private Step step = Step.BASE;
    private Estimate trigger = Estimate.NONE;

    /** {@code baseline}: their hit rate on us over the waves the profile remembers. */
    public MoveFlavour(Estimate baseline) {
        this.baseline = baseline;
    }

    /** A stranger's: no baseline, so no change. */
    public static MoveFlavour stranger() {
        return new MoveFlavour(Estimate.NONE);
    }

    /**
     * One enemy wave broke, a hit or a miss. Returns the step added, or null when the
     * flavour stays.
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
     */
    public static boolean above(Estimate live, Estimate baseline) {
        if (Double.isNaN(live.value()) || Double.isNaN(baseline.value())) return false;
        return live.center() - baseline.center() > Math.hypot(live.margin(), baseline.margin());
    }

    public Step step() {
        return step;
    }

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
