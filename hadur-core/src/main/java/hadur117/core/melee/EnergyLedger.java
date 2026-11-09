package hadur117.core.melee;

import hadur117.core.physics.Rules;
import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyShot;
import hadur117.core.world.EnemyTracker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MSENSE-3 (arm mledger): the shots an opponent's energy hides. The World reads a shot from an
 * energy drop of 0.1 to 3 between two scans (MSENSE-2); one shot in five is lost because
 * something else moved the shooter's energy in the same gap: its own bullet landed (it gets 3 x
 * the power back), or a bullet hit it (it loses the bullet's damage). The ledger books what Hadur
 * knows of both and reads the shot from what is left:
 * <ul>
 * <li>a hit on Hadur by {@code s} of power q gives {@code s} 3q, known exactly ({@link #hitOnHadur});</li>
 * <li>a drop over 3 with one other robot's tracked shot whose wave reached {@code s} between its
 *     scans is that shot's damage plus {@code s}'s own shot;</li>
 * <li>a gain with one of {@code s}'s own tracked shots whose wave reached another living robot
 *     between {@code s}'s scans is 3 x that power less {@code s}'s own shot.</li>
 * </ul>
 * A shot is read only when exactly one power explains the drop, when it lies in [0.1, 3], and when
 * {@code s}'s gun, by its last tracked shot, could have cooled. Off a team only.
 */
final class EnergyLedger {

    /** The engine's gun cooling: 0.1 heat a tick, and a shot heats the gun 1 + power / 5. */
    static final double COOLING_RATE = 0.1;
    /** How far, px, a stale scan of a victim may be from where the wave met it: 8 px a tick, capped. */
    static final double STALE_PX_PER_TICK = 8.0, MAX_STALE_PX = 100.0;
    private static final double EPS = 1e-6;

    private final EnemyTracker tracker;
    /** Energy each shooter got back from hits on Hadur since its last scan. */
    private final Map<String, Double> gains = new HashMap<>();

    EnergyLedger(EnemyTracker tracker) {
        this.tracker = tracker;
    }

    void newRound() {
        gains.clear();
    }

    /** A bullet of {@code power} from {@code shooter} hit Hadur: the shooter has 3 x power more. */
    void hitOnHadur(String shooter, double power) {
        gains.merge(shooter, 3 * power, Double::sum);
    }

    /**
     * {@code s} was scanned at {@code now} and the World read {@code read} from it (a shot, or
     * null). The shot to book: {@code read} when there is one, else the shot the scan pair hid,
     * added to the World, or null when the drop is explained without one or cannot be read.
     * Every scan of {@code s} spends the gain booked for it, read or not. {@code alive} is the
     * living opponents, for the victims of {@code s}'s own bullets.
     */
    EnemyShot resolve(EnemyInfo s, EnemyShot read, long now, List<EnemyInfo> alive) {
        Double gain = gains.remove(s.name);
        if (read != null) return read;
        double loss = s.lastLoss();
        if (Double.isNaN(loss) || s.lastBumped()) return null;
        long a = s.previousScanTime(), b = s.lastScanTime;
        if (a < 0 || b <= a) return null;
        if (!gunCouldBeCool(s.name, b)) return null;
        if (gain != null) {
            // The exact case: the gain is known, what is left is the shot, if one fits.
            return shot(s.name, loss + gain, now);
        }
        // The shooter moved between its scans; the wave may have met it anywhere on the way.
        double moved = s.previousLocation() == null ? 0 : s.previousLocation().distance(s.location);
        if (loss > EnemyInfo.MAX_SHOT + EPS) {
            // Hit by someone's bullet: the one tracked shot whose wave reached s in the gap.
            double q = Double.NaN;
            for (EnemyShot w : tracker.shots(now)) {
                if (w.shooter.equals(s.name) || !reached(w, s, a, b, moved)) continue;
                if (!Double.isNaN(q) && Math.abs(q - w.power) > 0.005) return null;
                q = w.power;
            }
            if (Double.isNaN(q)) return null;
            return shot(s.name, loss - Rules.getBulletDamage(q), now);
        }
        if (loss < EnemyInfo.MIN_SHOT - EPS) {
            // Its own bullet landed on someone: the one of its tracked shots whose wave reached
            // another living robot in the gap.
            double q = Double.NaN;
            for (EnemyShot w : tracker.shots(now)) {
                if (!w.shooter.equals(s.name)) continue;
                for (EnemyInfo v : alive) {
                    if (v.name.equals(s.name) || v.location == null) continue;
                    double stale = Math.min(MAX_STALE_PX, STALE_PX_PER_TICK * Math.max(0, now - v.lastScanTime));
                    if (!reached(w, v, a, b, stale)) continue;
                    if (!Double.isNaN(q) && Math.abs(q - w.power) > 0.005) return null;
                    q = w.power;
                }
            }
            if (Double.isNaN(q)) return null;
            return shot(s.name, loss + 3 * q, now);
        }
        return null;
    }

    /** The shot of {@code power}, added when the power is a bullet's. */
    private EnemyShot shot(String name, double power, long now) {
        if (power < EnemyInfo.MIN_SHOT - 0.011 || power > EnemyInfo.MAX_SHOT + 0.011) return null;
        double p = Math.min(EnemyInfo.MAX_SHOT, Math.max(EnemyInfo.MIN_SHOT, power));
        return tracker.addResolvedShot(name, p, now);
    }

    /**
     * Whether {@code w}'s wave reached {@code who} between ticks {@code a} and {@code b}: its
     * distance from the source lies between the wave's radius at {@code a} and at {@code b},
     * within the matcher's slack, the shot's window and {@code stale} px for an old scan.
     */
    static boolean reached(EnemyShot w, EnemyInfo who, long a, long b, double stale) {
        double d = w.source.distance(who.location);
        double slack = MeleeController.LEARN_SLACK + w.window * w.speed() + stale;
        double far = w.travelled(b), near = w.travelled(a);
        return d >= near - slack && d <= far + slack;
    }

    /** Whether {@code name}'s gun, heated by its last tracked shot, could have fired by tick {@code b} - 1. */
    private boolean gunCouldBeCool(String name, long b) {
        EnemyShot last = null;
        for (EnemyShot w : tracker.shots(b)) {
            if (w.shooter.equals(name) && (last == null || w.fireTime > last.fireTime)) last = w;
        }
        if (last == null) return true;
        long heat = (long) Math.ceil((1 + last.power / 5) / COOLING_RATE);
        return last.fireTime - last.window + heat <= b - 1;
    }
}
