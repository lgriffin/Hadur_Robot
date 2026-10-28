package hadur117.core.move;

import hadur117.core.physics.DiaUtils;
import java.util.Locale;

/**
 * MOVE-9: why an enemy bullet that hit us got through, for the HF record (plan-top3 stage 0,
 * docs/plan-top3.md). Measurement only: nothing here changes where we drive.
 *
 * <p>A hit is classed by the guess factor it came from. {@code headon} when it lies within our
 * half-width of guess factor 0, {@code linear} when it lies within our half-width of where a
 * linear gun would have aimed from our lateral velocity at fire time, {@code learned}
 * otherwise; {@code nowave} when no firing wave carried it. The danger percentile says how
 * the surf's own views rated the angle the bullet came from: the share of the wave's guess
 * factors in [-1, 1] that they scored less dangerous. Near 0 the views thought the angle
 * safe (a learning miss); near 1 they knew it was dangerous (a reach or choice miss).</p>
 *
 * <p>Angles are radians and guess factors on the classic scale ({@code Wave#guessFactor}).
 * The class is stateless.</p>
 */
public final class HitForensics {

    /** Half a robot's width, px: the tolerance a hit is matched to an aim with. */
    public static final double HALF_WIDTH = 18.0;
    /** Guess factors sampled across [-1, 1] for the danger percentile. */
    public static final int SAMPLES = 41;

    /** Not instantiated: the class is a set of pure functions. */
    private HitForensics() {}

    /**
     * Where a linear gun aims, as a guess factor: {@code asin(v / s) / mea}, positive in the
     * orbit direction.
     *
     * @param lateralVelocity our speed square to the line of fire at fire time, px/tick, not negative
     * @param bulletSpeed the bullet's speed, px/tick
     * @param maxEscapeAngle the wave's classic escape angle, radians
     */
    public static double linearGuessFactor(double lateralVelocity, double bulletSpeed,
                                           double maxEscapeAngle) {
        return Math.asin(Math.min(1.0, Math.abs(lateralVelocity) / bulletSpeed)) / maxEscapeAngle;
    }

    /**
     * Our half-width seen from {@code distance} px, as a guess-factor span.
     *
     * @param distance the distance from the wave's source at fire time, px
     * @param maxEscapeAngle the wave's classic escape angle, radians
     */
    public static double tolerance(double distance, double maxEscapeAngle) {
        return Math.atan(HALF_WIDTH / Math.max(distance, HALF_WIDTH)) / maxEscapeAngle;
    }

    /**
     * The hit's class: {@code linear} when the linear aim is distinguishable from head-on and
     * the hit lies within {@code tol} of it, else {@code headon} within {@code tol} of 0, else
     * {@code learned}.
     */
    public static String classify(double gf, double linearGf, double tol) {
        if (Math.abs(linearGf) > tol && Math.abs(gf - linearGf) <= tol) return "linear";
        if (Math.abs(gf) <= tol) return "headon";
        return "learned";
    }

    /** The guess factor of sample {@code i} of {@link #SAMPLES}, evenly over [-1, 1]. */
    public static double sampleGuessFactor(int i) {
        return -1.0 + 2.0 * i / (SAMPLES - 1);
    }

    /**
     * The share of {@code samples} strictly below {@code at}, in [0, 1]; NaN for none.
     */
    public static double percentile(double[] samples, double at) {
        if (samples.length == 0 || Double.isNaN(at)) return Double.NaN;
        int below = 0;
        for (double s : samples) if (s < at) below++;
        return (double) below / samples.length;
    }

    /**
     * How far the hit lies from the surf's last plan on its wave, in the plan interval's
     * half-widths from its centre: at most 1 inside the plan. NaN with no plan.
     *
     * @param plan the last interval the surf published for the wave, or null
     * @param hitAngle the absolute bearing the bullet was fired at, radians
     */
    public static double planOffset(PlanInterval plan, double hitAngle) {
        if (plan == null) return Double.NaN;
        double centre = (plan.low + plan.high) / 2;
        double half = Math.max(plan.width() / 2, 1e-9);
        return Math.abs(DiaUtils.normalizeAngle(hitAngle, centre) - centre) / half;
    }

    /**
     * MOVE-10: whether the hit would also have hit each option's plan, one character per
     * option in ordinal order (counter-clockwise, stop, clockwise): {@code h} inside the
     * option's plan interval, {@code m} outside it, {@code -} no plan; upper case for the
     * option taken. {@code ---} with no options.
     *
     * @param options the options' intervals by ordinal, or null
     * @param chosen the ordinal of the option taken, or -1
     * @param hitAngle the absolute bearing the bullet was fired at, radians
     */
    public static String optionFlags(PlanInterval[] options, int chosen, double hitAngle) {
        StringBuilder b = new StringBuilder(3);
        for (int i = 0; i < 3; i++) {
            PlanInterval p = options == null || i >= options.length ? null : options[i];
            char c = p == null ? '-' : planOffset(p, hitAngle) <= 1 ? 'h' : 'm';
            b.append(i == chosen ? Character.toUpperCase(c) : c);
        }
        return b.toString();
    }

    /**
     * The HF record: {@code HF,round,tick,class,gf,linearGf,dangerPct,distance,power,driving,
     * planOffset,planDanger,planAge,options,optionsAge}, NaN (or -1 for the age) for what a hit cannot know.
     * The plan fields read the surf's last plan on the hit's wave: how far off it the hit was
     * ({@link #planOffset}), the danger the surf gave it, and how many ticks before the hit it
     * was published. {@code options} is {@link #optionFlags} on the wave's first options, published
     * {@code optionsAge} ticks before the hit (MOVE-10).
     */
    public static String record(int round, long tick, String cls, double gf, double linearGf,
                                double dangerPct, double distance, double power, boolean driving,
                                double planOffset, double planDanger, long planAge,
                                String options, long optionsAge) {
        return String.format(Locale.ROOT, "HF,%d,%d,%s,%.3f,%.3f,%.3f,%.1f,%.2f,%d,%.2f,%.3f,%d,%s,%d",
            round, tick, cls, gf, linearGf, dangerPct, distance, power, driving ? 1 : 0,
            planOffset, planDanger, planAge, options, optionsAge);
    }
}
