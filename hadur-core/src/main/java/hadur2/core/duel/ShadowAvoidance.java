package hadur2.core.duel;

import hadur2.core.gun.ShadowValue;
import hadur2.core.move.OurBullet;
import hadur2.core.move.PlanInterval;
import hadur2.core.move.ShadowGain;
import hadur2.core.physics.Rules;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * The duel's seam between movement and gun for GUN-7: what a firing angle's bullet would
 * save us, from the intervals movement publishes (MOVE-8). The gun and movement may not see
 * each other, so the duel, which owns both, builds the gun's {@link ShadowValue} from
 * movement's {@link PlanInterval}s and our bullets' shadow geometry ({@link ShadowGain}).
 *
 * <p>For each wave in the air with a published interval, a candidate bullet is fired from
 * where the gun will be, along the angle, at the tick the shot would leave; the share of the
 * interval it newly stops, taken of what was not stopped already, times the chance a bullet
 * fired inside the interval hits us ({@link PlanInterval#danger}, which the surf computed
 * with the shadows then in place), times the enemy bullet's damage, is what it saves. The
 * danger is taken as spread evenly over the part of the interval nothing yet stops. A wave
 * whose power came from an ambiguous split counts half, as the surf counts it (WAVE-3).</p>
 *
 * <p>One instance is reused: {@link #prepare} points it at the tick's plan. Work is bounded
 * by the number of published intervals, at most the surf's look-ahead (two waves).</p>
 */
final class ShadowAvoidance implements ShadowValue {

    private final double fieldWidth;
    private final double fieldHeight;
    private final List<PlanInterval> plan = new ArrayList<>();
    private Point2D.Double source = new Point2D.Double();
    private long fireTime;

    /**
     * A seam for a battle field.
     *
     * @param fieldWidth the field's width, in px
     * @param fieldHeight the field's height, in px
     */
    ShadowAvoidance(double fieldWidth, double fieldHeight) {
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
    }

    /**
     * Points the seam at this tick's plan. Intervals on waves that have already passed the
     * place the shot would leave from are dropped: a bullet fired now cannot meet them.
     *
     * @param published movement's published intervals
     * @param from where the gun will be when the shot leaves, in px
     * @param now the present tick; the shot leaves on the next
     * @return this
     */
    ShadowAvoidance prepare(List<PlanInterval> published, Point2D.Double from, long now) {
        plan.clear();
        this.source = from;
        this.fireTime = now + 1;
        for (PlanInterval p : published) {
            // The wave's front has passed us: nothing of ours can meet it any more.
            if (p.wave.distanceTraveled(fireTime) > p.wave.sourceLocation.distance(from) + 18) continue;
            plan.add(p);
        }
        return this;
    }

    @Override
    public boolean active() {
        return !plan.isEmpty();
    }

    @Override
    public double ceiling(double power) {
        double sum = 0;
        for (PlanInterval p : plan) sum += weight(p);
        return sum;
    }

    @Override
    public double avoided(double angle, double power) {
        OurBullet candidate = new OurBullet(fireTime, source, angle, power);
        double sum = 0;
        for (PlanInterval p : plan) {
            double[] shares = ShadowGain.shares(p, candidate, fieldWidth, fieldHeight);
            double remaining = 1 - shares[0];
            if (!(remaining > 1e-9) || !(shares[1] > 0)) continue;
            sum += weight(p) * Math.min(1.0, shares[1] / remaining);
        }
        return sum;
    }

    /** The damage the enemy bullet would do us if the whole interval were its aim, with its chance. */
    private static double weight(PlanInterval p) {
        double damage = Rules.getBulletDamage(p.wave.bulletPower());
        return p.danger * damage * (p.wave.uncertain ? 0.5 : 1.0);
    }
}
