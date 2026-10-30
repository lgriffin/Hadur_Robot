package hadur117.mini;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import robocode.AdvancedRobot;
import robocode.Bullet;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.Condition;
import robocode.CustomEvent;
import robocode.HitByBulletEvent;
import robocode.Rules;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * JayLexi, a MiniRumble 1v1 robot (docs/kitlab.md): a true wave surfer that weighs back and forward
 * with precise prediction on the two nearest waves and flees straight away while no wave is in
 * flight, over a GuessFactor gun segmented on velocity history, lateral velocity, walls and
 * distance. One wave class serves the gun and the surfing. The code is written tight to stay under
 * the 1,500 byte MiniRumble limit (docs/bench/kitlab-0.2-arms.md).
 *
 * Ideas taken, with thanks, from open RoboWiki bots: Komarious (Voidious, RWPCL) for the mini
 * precise prediction, the danger weighting and the gun's segments; RaikoMicro (Jamougha) for the
 * gun; PEZ's iterative wall smoothing; Iiley's back-as-front drive. The code is JayLexi's own and
 * ships with its source.
 */
public class JayLexi extends AdvancedRobot {
    // Bins either side of guess factor zero, and the whole width (JAYLEXI-4, JAYLEXI-6).
    static final int MID = 23, BINS = 47;
    // Orbit angle off the wave's bearing: a little under PI/2, so the orbit drifts outward (JAYLEXI-5).
    static final double ORBIT = 1.15;
    // Wall smoothing: the stick that must stay inside the field (JAYLEXI-7).
    static final double STICK = 140;
    static final Rectangle2D.Double FIELD = new Rectangle2D.Double(18, 18, 764, 564);

    static Point2D.Double me, enemy;
    static double lastAdvancing, enemyEnergy, distance, lastBearing, lastLateral, vChangeTime, enemySpeed;
    static ArrayList<Wave> waves;
    static Wave next;
    // The robot, for the static prediction (static methods take fewer bytes).
    static JayLexi bot;
    // Every enemy bullet that hit us or our bullets: {lateral, advancing, distance, gf} (k-NN surf).
    static ArrayList<Wave> hits = new ArrayList<Wave>();
    // Gun stats [velocity history][lateral speed][walls ahead][distance][bin] (JAYLEXI-4).
    static double[][][][] gun = new double[6][4][4][BINS];

    public void run() {
        waves = new ArrayList<Wave>();
        bot = this;
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        do {
            turnRadarRightRadians(1);
        } while (true);
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        Wave w;
        double absBearing, direction, angle, drop;

        // An enemy shot (JAYLEXI-3): last tick's wave, from where the enemy was, at the bullet's speed.
        if ((drop = enemyEnergy - (enemyEnergy = e.getEnergy())) <= 3 && drop > 0.09) {
            (w = next).speed = Rules.getBulletSpeed(drop);
            addCustomEvent(w);
            waves.add(w);
        }
        (next = w = new Wave()).bearing = lastBearing;
        w.lat = Math.abs(lastLateral);
        w.adv = lastAdvancing / 2;
        w.dist = distance / 100;
        direction = w.dir = Math.signum(lastLateral + 1e-9);
        w.source = enemy = project(me = new Point2D.Double(getX(), getY()),
                absBearing = getHeadingRadians() + e.getBearingRadians(), distance = e.getDistance());

        // Radar: twice the turn to the enemy, so it never slips off (JAYLEXI-2).
        setTurnRadarRightRadians(2 * Utils.normalRelativeAngle(absBearing - getRadarHeadingRadians()));

        // Surfing (JAYLEXI-5): the less dangerous of back and forward on the two nearest waves; with
        // no wave in flight, straight away from the enemy (a stop option measured 2 APS worse).
        angle = lastBearing = absBearing + Math.PI;
        try {
            angle = wave(0).angle(me) + ORBIT * (direction = Math.signum(both(-1) - both(1)));
        } catch (Exception ex) {
        }
        setTurnRightRadians(Math.tan(angle = smooth(me, angle, direction) - getHeadingRadians()));
        setAhead(Math.cos(angle) * 1000);

        // Gun (JAYLEXI-4): a wave every scan, aimed at the most visited bin of its segment; walls
        // ahead count 0 to 3, each fraction only while the ones before it are clear.
        double lateral = e.getVelocity() * Math.sin(e.getHeadingRadians() - absBearing);
        (w = new Wave()).source = me;
        w.bearing = absBearing;
        w.dir = Math.signum(lateral + 1e-9);
        int history = (int) Math.min(3, Math.pow(280 * vChangeTime++ / distance, .7));
        if (enemySpeed != (lateral = (int) Math.abs(lateral))) {
            history = enemySpeed > lateral ? 5 : 4;
            vChangeTime = 0;
        }
        enemySpeed = lateral;
        double[] b = w.bins = gun[history][(int) (1.4427 * Math.log(lateral + 1.5))]
                [wall(w, 0.18) * (1 + wall(w, 0.36) * (1 + wall(w, 0.64)))];
        int best = MID;
        for (int i = BINS - 1; i >= 0; i--) {
            if (b[i] > b[best]) {
                best = i;
            }
        }
        // Power (JAYLEXI-8): 3 close in, else 2; a fifteenth of our energy at most, so we never disable
        // ourselves; no more than finishes the enemy.
        double power = Math.min(distance < 150 ? 3 : 2, getEnergy() / 15);
        drop = w.speed = Rules.getBulletSpeed(power);
        addCustomEvent(w);
        setTurnGunRightRadians(Utils.normalRelativeAngle(absBearing - getGunHeadingRadians()
                + w.dir * (best - MID) * Math.asin(8 / drop) / MID));
        if (Math.abs(getGunTurnRemaining()) < 3 && setFireBullet(power) != null) {
            w.weight = 4;
        }

        lastLateral = (drop = getVelocity()) * Math.sin(absBearing = e.getBearingRadians());
        lastAdvancing = drop * Math.cos(absBearing);
    }

    /** Where the robot would be when wave s reaches it, orbiting dir, and how dangerous that is. */
    static double danger(Wave s, double dir) {
        Point2D.Double p = me;
        double heading = bot.getHeadingRadians(), v = bot.getVelocity(), turn, angle, move;
        int tick = 3;
        do {
            move = 1;
            if (Math.cos(angle = smooth(p, s.angle(p) + dir * ORBIT, dir) - heading) < 0) {
                angle += Math.PI;
                move = -1;
            }
            p = project(p, heading = Utils.normalRelativeAngle(heading
                            + Math.max(-(turn = Rules.getTurnRateRadians(Math.abs(v))), Math.min(Utils.normalRelativeAngle(angle), turn))),
                    v = Math.max(-8, Math.min(8, v + (v * move < 0 ? 2 * move : move))));
        } while (s.source.distance(p) >= s.travelled + ++tick * s.speed);
        double g = s.gf(p), d = .002 / (.02 + g * g), n = 1, f;
        for (Wave h : hits) {
            d += (n *= 1.05) / ((1 + (f = Math.abs(h.lat - s.lat) + Math.abs(h.adv - s.adv) + Math.abs(h.dist - s.dist)) * f)
                    * (.02 + (f = g - h.hit) * f));
        }
        return d / Math.pow(enemy.distance(p), 4);
    }

    /** The k-th nearest enemy wave; throws when there are fewer. */
    static Wave wave(int k) {
        return waves.get(k);
    }

    /** The danger of orbiting dir: the nearest wave in full, the next one at a quarter (JAYLEXI-5). */
    static double both(double dir) {
        double r = danger(wave(0), dir);
        try {
            return r + danger(wave(1), dir) / 4;
        } catch (Exception ex) {
            return r;
        }
    }

    public void onHitByBullet(HitByBulletEvent e) {
        log(me);
    }

    public void onBulletHitBullet(BulletHitBulletEvent e) {
        Bullet b;
        log(new Point2D.Double((b = e.getBullet()).getX(), b.getY()));
    }

    /** Log a hit at p on the enemy wave that was passing it (JAYLEXI-6), and drop that wave. */
    void log(Point2D.Double p) {
        Wave w;
        for (int i = waves.size(); --i >= 0; ) {
            if (Math.abs((w = wave(i)).source.distance(p) - w.travelled) < 100) {
                w.hit = w.gf(p);
                hits.add(w);
            }
        }
    }

    public void onBulletHit(BulletHitEvent e) {
        enemyEnergy -= Rules.getBulletDamage(e.getBullet().getPower());
    }

    public void onCustomEvent(CustomEvent e) {
        removeCustomEvent(e.getCondition());
    }

    static Point2D.Double project(Point2D.Double p, double angle, double length) {
        return new Point2D.Double(p.x + Math.sin(angle) * length, p.y + Math.cos(angle) * length);
    }

    /**
     * Turn the angle away from the wall until a STICK ahead stays inside the field (JAYLEXI-7). The
     * step takes only dir's sign, so a tie of the two dangers (dir 0) still turns and ends the loop.
     */
    static double smooth(Point2D.Double p, double angle, double dir) {
        while (!FIELD.contains(project(p, angle, STICK))) {
            angle += Math.copySign(0.05, dir);
        }
        return angle;
    }

    /** 1 if the point a fraction of the escape angle along the enemy's way is still in the field. */
    static int wall(Wave w, double fraction) {
        return FIELD.contains(project(me, w.bearing + w.dir * fraction, distance)) ? 1 : 0;
    }

    /** A wave: ours at the enemy (gun), or the enemy's at us (surfing). */
    static class Wave extends Condition {
        Point2D.Double source;
        double[] bins;
        double bearing, dir, speed, travelled, weight, lat, adv, dist, hit;

        double angle(Point2D.Double p) {
            return Math.atan2(p.x - source.x, p.y - source.y);
        }

        double gf(Point2D.Double p) {
            return Utils.normalRelativeAngle(angle(p) - bearing) * dir / Math.asin(8 / speed);
        }

        public boolean test() {
            boolean theirs = waves.contains(this);
            if (source.distance(theirs ? me : enemy) > (travelled += speed) + 2 * speed) {
                return false;
            }
            if (!theirs) {
                // The gun's log: the bin the enemy is in, as a wave of ours passes it (JAYLEXI-4).
                int at = (int) Math.max(0, Math.min(BINS - 1, gf(enemy) * MID + MID));
                for (int i = BINS - 1; i >= 0; i--) {
                    bins[i] = (bins[i] * 600 + (1 + weight) / ((i - at) * (i - at) + 1)) / (601 + weight);
                }
            }
            waves.remove(this);
            return true;
        }
    }
}
