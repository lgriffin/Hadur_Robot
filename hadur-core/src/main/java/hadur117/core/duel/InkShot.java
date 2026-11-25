package hadur117.core.duel;

import hadur117.core.model.Wave;
import hadur117.core.move.PlanInterval;
import hadur117.core.physics.DiaUtils;
import hadur117.core.physics.Rules;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * GUN-13: ink, the weakest bullet fired to shoot the enemy's bullets down where the surf's plan
 * puts us, in place of a shot at the enemy when it saves more than that shot would earn.
 *
 * <p>The engine destroys two bullets whose lines cross. An enemy bullet flies on a ray from its
 * wave's source, so to stop the bullets aimed at a bearing of a plan interval (MOVE-8), our
 * bullet must be where that bearing's bullet is on the same turn. For each published interval,
 * at its middle and near both ends, the candidates solve for the first turn on which a 0.1
 * bullet leaving next tick can reach that point, and aim there and half a turn later. Each is
 * valued by {@link ShadowAvoidance#avoided}: the damage its shadows save on the plan, as GUN-7
 * values a shot's shadows.</p>
 *
 * <p>The choice against the gun's own shot (STRIKE-1 of the Sepia robot, docs/sepia.md) is by
 * value per tick of reload: the ink by the damage it saves, the shot by its hit chance times its
 * damage and energy return, less its power. Pure functions; nothing here holds state.</p>
 */
final class InkShot {

    /** Every ink shot is the weakest bullet: the fastest and the quickest to reload. */
    static final double POWER = Rules.MIN_BULLET_POWER;
    /** How far inside each end of an interval the end candidates aim, as a share of its width. */
    static final double EDGE_INSET = 0.12;
    /** The most candidates scored for one shot. */
    static final int MAX_CANDIDATES = 24;
    /** The longest a candidate bullet is followed, in turns. */
    static final int HORIZON = 120;

    private InkShot() { }

    /** One ink aim and the damage it saves. */
    static final class Aim {
        final double angle;
        final double saved;

        Aim(double angle, double saved) {
            this.angle = angle;
            this.saved = saved;
        }
    }

    /**
     * The best ink aim on the plan the seam was prepared with, or null when none saves anything.
     *
     * @param plan movement's published intervals
     * @param seam the shadow seam, prepared for a shot leaving {@code from} next tick
     * @param from where the shot leaves from
     * @param fireTime the tick it leaves on
     */
    static Aim best(List<PlanInterval> plan, ShadowAvoidance seam, Point2D.Double from, long fireTime) {
        Aim best = null;
        for (double angle : candidates(plan, from, fireTime)) {
            double saved = seam.avoided(angle, POWER);
            if (saved > 0 && (best == null || saved > best.saved)) best = new Aim(angle, saved);
        }
        return best;
    }

    /**
     * Whether the ink is worth more per tick of reload than the gun's shot of {@code power}.
     *
     * @param saved the damage the ink saves
     * @param hitChance the chance the gun's shot hits
     * @param power the gun's shot's power
     */
    static boolean worthMore(double saved, double hitChance, double power) {
        double ink = saved / reload(POWER);
        double shot = (hitChance * (Rules.getBulletDamage(power) + Rules.getBulletHitBonus(power)) - power)
            / reload(power);
        return ink > shot;
    }

    /** Ticks of reload after a shot of {@code power} at the standard cooling rate. */
    static double reload(double power) {
        return Rules.getGunHeat(power) / 0.1;
    }

    /** The candidate aims, nearest interval first, at most {@link #MAX_CANDIDATES}. */
    static List<Double> candidates(List<PlanInterval> plan, Point2D.Double from, long fireTime) {
        List<PlanInterval> order = new ArrayList<>(plan);
        order.sort((a, b) -> Double.compare(remaining(a.wave, from, fireTime), remaining(b.wave, from, fireTime)));
        List<Double> out = new ArrayList<>();
        double speed = Rules.getBulletSpeed(POWER);
        for (PlanInterval p : order) {
            double width = p.high - p.low;
            double[] bearings = {p.low + EDGE_INSET * width, (p.low + p.high) / 2, p.high - EDGE_INSET * width};
            for (double bearing : bearings) {
                for (double aim : meet(p.wave, bearing, from, fireTime, speed)) {
                    out.add(aim);
                    if (out.size() >= MAX_CANDIDATES) return out;
                }
            }
        }
        return out;
    }

    /** How far the wave still has to fly to reach {@code from}, px. */
    private static double remaining(Wave w, Point2D.Double from, long time) {
        return w.sourceLocation.distance(from) - w.distanceTraveled(time);
    }

    /**
     * The aims that put a bullet of {@code speed}, leaving {@code from} on {@code fireTime}, where
     * the wave's bullet on {@code bearing} is: at the turn the two first can meet, solved between
     * whole turns, and half a turn later. Empty when ours cannot get there before the wave
     * reaches {@code from}.
     */
    static List<Double> meet(Wave w, double bearing, Point2D.Double from, long fireTime, double speed) {
        Point2D.Double s = w.sourceLocation;
        double sx = Math.sin(bearing), sy = Math.cos(bearing);
        double reach = s.distance(from) + 18;
        double prev = Double.NaN;
        List<Double> out = new ArrayList<>(2);
        for (long k = fireTime + 1; k <= fireTime + HORIZON; k++) {
            double r = w.distanceTraveled(k);
            if (r > reach) break;
            double gap = Math.hypot(s.x + sx * r - from.x, s.y + sy * r - from.y) - speed * (k - fireTime);
            if (gap <= 0) {
                double tk = Double.isNaN(prev) ? k - 0.5 : (k - 1) + prev / (prev - gap);
                out.add(aimAt(w, sx, sy, tk, from));
                out.add(aimAt(w, sx, sy, tk + 0.5, from));
                return out;
            }
            prev = gap;
        }
        return out;
    }

    private static double aimAt(Wave w, double sx, double sy, double t, Point2D.Double from) {
        Point2D.Double s = w.sourceLocation;
        double r = w.bulletSpeed() * (t - w.fireTime);
        return DiaUtils.absoluteBearing(from, new Point2D.Double(s.x + sx * r, s.y + sy * r));
    }
}
