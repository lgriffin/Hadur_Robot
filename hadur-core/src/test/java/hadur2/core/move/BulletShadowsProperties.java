package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import hadur2.core.physics.MovementPredictor;
import hadur2.core.physics.Rules;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;

/**
 * MOVE-1 against brute force: fly an enemy bullet at each of many firing angles and our
 * bullet turn by turn, as the engine does (straight segments, destroyed when they cross),
 * and check that the angles that collide are the ones the shadows say.
 */
class BulletShadowsProperties {

    static final BattleField FIELD = new BattleField(800, 600);
    static final MovementPredictor PREDICTOR = new MovementPredictor(FIELD);

    static Wave wave(Point2D.Double source, long fireTime, double power) {
        Wave w = new Wave("enemy", source, new Point2D.Double(400, 300), 0, fireTime, power, 0, 0, 1,
            FIELD, PREDICTOR);
        w.firingWave = true;
        return w;
    }

    /**
     * Whether an enemy bullet fired along {@code angle} meets {@code b}, as the engine checks
     * a pair of bullets each turn: both segments of the turn always; with {@code eitherOrder},
     * also each one's move against the other's last segment, which meets when the engine
     * happens to move that bullet first.
     */
    static boolean collides(Wave w, OurBullet b, double angle, boolean eitherOrder) {
        long first = Math.max(b.fireTime + 1, w.fireTime + 1);
        for (long k = first; k < first + BulletShadows.MAX_TURNS; k++) {
            Point2D.Double from = b.at(k - 1);
            Point2D.Double to = b.at(k);
            if (from.x < 0 || from.y < 0 || from.x > 800 || from.y > 600) return false;
            Point2D.Double e0 = DiaUtils.project(w.sourceLocation, angle, w.distanceTraveled(k - 1));
            Point2D.Double e1 = DiaUtils.project(w.sourceLocation, angle, w.distanceTraveled(k));
            if (Line2D.linesIntersect(from.x, from.y, to.x, to.y, e0.x, e0.y, e1.x, e1.y)) return true;
            if (!eitherOrder) continue;
            if (k - 2 >= b.fireTime) {
                Point2D.Double p = b.at(k - 2);
                if (Line2D.linesIntersect(p.x, p.y, from.x, from.y, e0.x, e0.y, e1.x, e1.y)) return true;
            }
            if (k - 2 >= w.fireTime) {
                Point2D.Double f0 = DiaUtils.project(w.sourceLocation, angle, w.distanceTraveled(k - 2));
                if (Line2D.linesIntersect(from.x, from.y, to.x, to.y, f0.x, f0.y, e0.x, e0.y)) return true;
            }
        }
        return false;
    }

    static boolean inShadow(List<double[]> shadows, double angle) {
        for (double[] s : shadows) {
            double a = DiaUtils.normalizeAngle(angle, (s[0] + s[1]) / 2);
            if (a >= s[0] && a <= s[1]) return true;
        }
        return false;
    }

    static boolean nearEdge(List<double[]> shadows, double angle, double tolerance) {
        for (double[] s : shadows) {
            for (double edge : s) {
                if (Math.abs(DiaUtils.normalizeAngle(angle, edge) - edge) < tolerance) return true;
            }
        }
        return false;
    }

    @Property(tries = 300)
    @Tag("MOVE-1")
    void shadowsAreExactlyTheAnglesThatCollide(
            @ForAll @DoubleRange(min = 100, max = 700) double sx,
            @ForAll @DoubleRange(min = 100, max = 500) double sy,
            @ForAll @DoubleRange(min = 100, max = 700) double bx,
            @ForAll @DoubleRange(min = 100, max = 500) double by,
            @ForAll @DoubleRange(min = -1.2, max = 1.2) double aimError,
            @ForAll @DoubleRange(min = 0.1, max = 3.0) double enemyPower,
            @ForAll @DoubleRange(min = 0.1, max = 3.0) double ourPower,
            @ForAll @IntRange(min = 0, max = 20) int fireGap) {
        Point2D.Double s = new Point2D.Double(sx, sy);
        Point2D.Double me = new Point2D.Double(bx, by);
        if (s.distance(me) < 100) return;
        Wave w = wave(s, 100, enemyPower);
        // Our bullet aims roughly at the enemy, fired up to 20 turns after its shot.
        OurBullet b = new OurBullet(100 + fireGap, me, DiaUtils.absoluteBearing(me, s) + aimError, ourPower);
        List<List<double[]>> shadows = BulletShadows.of(w, List.of(b), 800, 600);
        List<double[]> certain = shadows.get(0);
        List<double[]> possible = shadows.get(1);
        double step = 0.0005;
        for (double a = 0; a < 2 * Math.PI; a += step) {
            if (!nearEdge(certain, a, 1e-6)) {
                assertEquals(collides(w, b, a, false), inShadow(certain, a),
                    "certain, angle " + a + " shadows " + describe(certain));
            }
            if (!nearEdge(possible, a, 1e-6)) {
                assertEquals(collides(w, b, a, true), inShadow(possible, a),
                    "possible, angle " + a + " shadows " + describe(possible));
            }
        }
    }

    @Property(tries = 100)
    @Tag("MOVE-1")
    void mergedShadowsAreDisjointAndOrdered(
            @ForAll @DoubleRange(min = 100, max = 700) double sx,
            @ForAll @DoubleRange(min = 100, max = 500) double sy,
            @ForAll @DoubleRange(min = -0.5, max = 0.5) double spread) {
        Point2D.Double s = new Point2D.Double(sx, sy);
        Point2D.Double me = new Point2D.Double(800 - sx, 600 - sy);
        if (s.distance(me) < 100) return;
        Wave w = wave(s, 100, 2.0);
        List<OurBullet> bullets = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            bullets.add(new OurBullet(96 + 4 * i, me, DiaUtils.absoluteBearing(me, s) + spread * (i - 1.5) / 2, 1.5));
        }
        List<double[]> shadows = BulletShadows.of(w, bullets, 800, 600).get(1);
        for (int i = 0; i < shadows.size(); i++) {
            assertTrue(shadows.get(i)[0] <= shadows.get(i)[1]);
            if (i > 0) assertTrue(shadows.get(i)[0] > shadows.get(i - 1)[1], describe(shadows));
        }
    }

    static String describe(List<double[]> shadows) {
        StringBuilder b = new StringBuilder();
        for (double[] s : shadows) b.append(String.format("[%.5f, %.5f] ", s[0], s[1]));
        return b.toString();
    }

    static double speed(double power) {
        return Rules.getBulletSpeed(power);
    }
}
