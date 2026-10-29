package hadur117.mini;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Function;
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
 * Drives a JayLexi without an engine through a seeded script of scans, hits and shots, with rough
 * physics, and records every order it gives bit for bit. Two builds that record the same text play
 * the same.
 */
final class Replay {

    private Replay() {
    }

    static double clamp(double v, double m) {
        return Math.max(-m, Math.min(m, v));
    }

    /** Every static of the robot class back to zero, as a fresh JVM has it. */
    static void zeroStatics(Class<?> robot) throws Exception {
        for (Field f : robot.getDeclaredFields()) {
            if (Modifier.isStatic(f.getModifiers()) && !Modifier.isFinal(f.getModifiers())) {
                f.setAccessible(true);
                if (f.getType() == double.class) {
                    f.setDouble(null, 0);
                } else if (f.getType().isArray()) {
                    zero(f.get(null));
                } else {
                    f.set(null, null);
                }
            }
        }
    }

    static void zero(Object array) {
        for (int i = 0; i < Array.getLength(array); i++) {
            Object e = Array.get(array, i);
            if (e.getClass().isArray()) {
                zero(e);
            } else {
                Array.setDouble(array, i, 0);
            }
        }
    }

    static void setStatic(Class<?> robot, String name, Object value) throws Exception {
        Field f = robot.getDeclaredField(name);
        f.setAccessible(true);
        f.set(null, value);
    }

    /** The orders of a robot class over rounds of ticks, on the script that seed draws. */
    static String run(Class<?> robot, Function<ReplayBody, AdvancedRobot> make, long seed, int rounds, int ticks)
            throws Exception {
        zeroStatics(robot);
        Random r = new Random(seed);
        StringBuilder out = new StringBuilder();
        for (int round = 0; round < rounds; round++) {
            ReplayBody b = new ReplayBody(out, r);
            AdvancedRobot s = make.apply(b);
            // What run() does before its radar loop.
            setStatic(robot, "waves", new ArrayList<>());
            try {
                setStatic(robot, "bot", s);
            } catch (NoSuchFieldException none) {
                // the readable build keeps the prediction an instance method
            }
            b.x = 50 + r.nextDouble() * 700;
            b.y = 50 + r.nextDouble() * 500;
            b.gunHeading = b.radarHeading = b.heading = r.nextDouble() * 6.28;
            double ex = 50 + r.nextDouble() * 700, ey = 50 + r.nextDouble() * 500, eh = r.nextDouble() * 6.28;
            double ev = 0, ee = 100;
            for (int t = 0; t < ticks; t++) {
                for (Condition c : new ArrayList<>(b.conditions)) {
                    if (c.test()) {
                        out.append("ce ");
                        s.onCustomEvent(new CustomEvent(c));
                    }
                }
                int k = r.nextInt(40);
                if (k == 0) {
                    b.energy -= 4;
                    ee += 6;
                    s.onHitByBullet(new HitByBulletEvent(r.nextDouble(),
                            new Bullet(0, b.x, b.y, 1 + r.nextDouble() * 2, "e", "me", false, 2)));
                }
                if (k == 1) {
                    s.onBulletHitBullet(new BulletHitBulletEvent(
                            new Bullet(0, 100 + r.nextDouble() * 600, 100 + r.nextDouble() * 400, 2, "me", null, false, 1),
                            new Bullet(0, 0, 0, 2, "e", null, false, 2)));
                }
                if (k == 2) {
                    double p = 0.5 + r.nextDouble() * 2.5;
                    ee -= Rules.getBulletDamage(p);
                    s.onBulletHit(new BulletHitEvent("e", ee, new Bullet(0, ex, ey, p, "me", "e", false, 1)));
                }
                if (r.nextInt(14) == 0) {
                    ee -= 0.1 + r.nextDouble() * 2.9;
                }
                if (r.nextInt(300) == 0) {
                    ee -= 5 + r.nextDouble() * 10;
                }
                if (ee < 0.5) {
                    ee = 100;
                }
                double ab = Math.atan2(ex - b.x, ey - b.y);
                s.onScannedRobot(new ScannedRobotEvent("e", ee, Utils.normalRelativeAngle(ab - b.heading),
                        Math.hypot(ex - b.x, ey - b.y), eh, ev));
                out.append('\n');
                // Our physics, roughly.
                b.heading += clamp(b.turn, Rules.getTurnRateRadians(Math.abs(b.velocity)));
                b.velocity = clamp(b.velocity + (Math.signum(b.ahead) * b.velocity < 0 ? 2 : 1) * Math.signum(b.ahead), 8);
                b.x = Math.max(18, Math.min(782, b.x + Math.sin(b.heading) * b.velocity));
                b.y = Math.max(18, Math.min(582, b.y + Math.cos(b.heading) * b.velocity));
                double g = clamp(b.gun, Rules.GUN_TURN_RATE_RADIANS);
                b.gunHeading += g;
                b.gunTurnRemaining = b.gun - g;
                b.radarHeading = ab + (r.nextDouble() - 0.5) * 0.1;
                // The enemy: a jittery orbit that fires now and then.
                if (r.nextInt(20) == 0) {
                    ev = -ev;
                }
                ev = clamp(ev + (r.nextInt(3) - 1) * 1.5 + (ev == 0 ? 1 : 0), 8);
                eh += (r.nextDouble() - 0.5) * 0.3;
                ex = Math.max(18, Math.min(782, ex + Math.sin(eh) * ev));
                ey = Math.max(18, Math.min(582, ey + Math.cos(eh) * ev));
                if (b.energy < 1) {
                    b.energy = 100;
                }
            }
        }
        return out.toString();
    }
}
