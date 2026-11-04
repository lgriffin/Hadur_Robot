package hadur117.micro.replay;
import java.util.*;
import java.util.function.Function;
import robocode.*;
import robocode.util.Utils;
/**
 * Drives one build of a robot class through a seeded script of scans, hits and shots and returns its orders
 * (EVEIMEAR-17). The build is loaded by {@link Load}, so Math.random is a seeded draw and the same script gives
 * the same orders from two builds exactly when they play alike.
 */
public final class Script {
    /** Waves passed in the last run, so a caller can check the script reached the gun's logging. */
    public static int passed;
    static double clamp(double v, double m) { return Math.max(-m, Math.min(m, v)); }
    /** The orders of the build at {@code path} (a jar or a class folder) against an enemy named {@code name}. */
    public static String run(String path, String className, long seed, String name) throws Exception {
        Class<?> bot = new Load(path).loadClass(className);
        R.r = new Random(seed * 31 + 5);
        Random r = new Random(seed);
        StringBuilder out = new StringBuilder();
        passed = 0;
        for (int round = 0; round < 10; round++) {
            Body b = new Body(out);
            b.round = round;
            Fake.cur = b; AdvancedRobot s = (AdvancedRobot) bot.getConstructor().newInstance();
            try { s.run(); } catch (Fake.Stop x) { }
            b.x = 50 + r.nextDouble() * 700; b.y = 50 + r.nextDouble() * 500;
            b.gunHeading = b.heading = r.nextDouble() * 6.28;
            double ex = 50 + r.nextDouble() * 700, ey = 50 + r.nextDouble() * 500, eh = r.nextDouble() * 6.28;
            double ev = 0, ee = 100;
            boolean rammer = r.nextInt(4) == 0;
            for (int t = 0; t < 1500; t++) {
                for (Condition c : new ArrayList<>(b.conditions)) {
                    if (c.test()) { out.append("ce "); passed++; s.onCustomEvent(new CustomEvent(c)); }
                }
                int k = r.nextInt(30);
                if (k == 0) {
                    double p = 0.1 + r.nextDouble() * 2.9;
                    b.energy -= Rules.getBulletDamage(p); ee += 3 * p;
                    s.onHitByBullet(new HitByBulletEvent(r.nextDouble(), new Bullet(0, b.x, b.y, p, "e", "me", false, 2)));
                }
                if (k == 1) {
                    double p = 0.5 + r.nextDouble() * 2.5;
                    ee -= Rules.getBulletDamage(p);
                    s.onBulletHit(new BulletHitEvent("e", ee, new Bullet(0, ex, ey, p, "me", "e", false, 1)));
                }
                if (r.nextInt(12) == 0) ee -= 0.1 + r.nextDouble() * 2.9;
                if (ee < 0.5) ee = 100;
                double ab = Math.atan2(ex - b.x, ey - b.y);
                try { s.onScannedRobot(new ScannedRobotEvent(name, ee, Utils.normalRelativeAngle(ab - b.heading),
                        Math.max(36, Math.hypot(ex - b.x, ey - b.y)), eh, ev)); } catch (ArithmeticException x) { out.append("ex "); }
                out.append('\n');
                b.heading += clamp(b.turn, Rules.getTurnRateRadians(Math.abs(b.velocity)));
                b.velocity = clamp(b.velocity + (Math.signum(b.ahead) * b.velocity < 0 ? 2 : 1) * Math.signum(b.ahead), 8);
                if (Math.abs(b.ahead) <= Math.abs(b.velocity)) b.velocity = b.ahead;
                b.ahead -= b.velocity;
                b.x = Math.max(18, Math.min(782, b.x + Math.sin(b.heading) * b.velocity));
                b.y = Math.max(18, Math.min(582, b.y + Math.cos(b.heading) * b.velocity));
                double g = clamp(b.gun, Rules.GUN_TURN_RATE_RADIANS);
                b.gunHeading += g;
                b.radarRemaining = (r.nextDouble() - 0.5) * 2;
                if (r.nextInt(20) == 0) ev = -ev;
                ev = clamp(ev + (r.nextInt(3) - 1) * 1.5 + (ev == 0 ? 1 : 0), 8);
                if (rammer) eh = Math.atan2(b.x - ex, b.y - ey) + (r.nextDouble() - 0.5) * 0.2; else eh += (r.nextDouble() - 0.5) * 0.3;
                ex = Math.max(18, Math.min(782, ex + Math.sin(eh) * Math.abs(ev)));
                ey = Math.max(18, Math.min(582, ey + Math.cos(eh) * Math.abs(ev)));
                if (b.energy < 1) b.energy = 100;
            }
        }
        return out.toString();
    }
}
