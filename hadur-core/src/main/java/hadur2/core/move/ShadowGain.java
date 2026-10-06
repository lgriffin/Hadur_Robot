package hadur2.core.move;

import hadur2.core.model.Wave;
import hadur2.core.physics.DiaUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * GUN-7's geometry: how much more of the angles that would hit us one more bullet of ours
 * would stop. {@link BulletShadows} already says where a bullet's path meets an enemy bullet's;
 * this adds that shadow to the ones our bullets in flight cast on the wave and measures what
 * it takes of a published {@link PlanInterval}, over and above what was already stopped.
 *
 * <p>The duel gives the gun the result through a function (the gun package may not see this
 * one). Shares are fractions of the interval's width in [0, 1], counted as the surf counts
 * them (MOVE-1): an angle in a certain shadow stops the enemy bullet, an angle in a possible
 * shadow only about half the time, so a share is {@code (certain + possible) / 2}. The class
 * is stateless.</p>
 */
public final class ShadowGain {

    /** Not instantiated: the class is a set of pure functions. */
    private ShadowGain() {}

    /**
     * What the wave's shadows stop of the interval now, and what {@code candidate} would add.
     *
     * @param plan the interval our plan occupies on one enemy wave
     * @param candidate a bullet we might fire, with its fire time, source, heading and power
     * @param fieldWidth the battle field's width, in px
     * @param fieldHeight the battle field's height, in px
     * @return {@code {existing, added}}: the share of the interval the wave's current shadows
     *     stop, and the further share the candidate's shadow stops where nothing already did;
     *     both in [0, 1], {@code existing + added <= 1}
     */
    public static double[] shares(PlanInterval plan, OurBullet candidate, double fieldWidth,
                                  double fieldHeight) {
        Wave wave = plan.wave;
        double width = plan.width();
        if (!(width > 0)) return new double[] {0, 0};
        double before = share(wave.shadows(), wave.possibleShadows(), plan);
        List<List<double[]>> cast = BulletShadows.of(wave, List.of(candidate), fieldWidth, fieldHeight);
        if (cast.get(1).isEmpty()) return new double[] {before, 0};
        double after = share(union(wave.shadows(), cast.get(0)),
            union(wave.possibleShadows(), cast.get(1)), plan);
        return new double[] {before, Math.max(0, after - before)};
    }

    /** The union of two interval lists, merged into disjoint ones. */
    private static List<double[]> union(List<double[]> a, List<double[]> b) {
        if (a.isEmpty()) return BulletShadows.merge(b);
        List<double[]> all = new ArrayList<>(a.size() + b.size());
        all.addAll(a);
        all.addAll(b);
        return BulletShadows.merge(all);
    }

    /**
     * {@code (certain + possible) / 2}, each the share of the plan interval its disjoint
     * intervals cover (the possible list includes the certain one).
     */
    private static double share(List<double[]> certain, List<double[]> possible, PlanInterval plan) {
        return (covered(certain, plan) + covered(possible, plan)) / 2;
    }

    private static double covered(List<double[]> intervals, PlanInterval plan) {
        double covered = 0;
        double mid = (plan.low + plan.high) / 2;
        for (double[] s : intervals) {
            // Shifted by whole turns to start within pi of the interval, the width unchanged.
            double from = DiaUtils.normalizeAngle(s[0], mid);
            double to = from + (s[1] - s[0]);
            covered += Math.max(0, Math.min(plan.high, to) - Math.max(plan.low, from));
        }
        return Math.min(1.0, covered / plan.width());
    }
}
