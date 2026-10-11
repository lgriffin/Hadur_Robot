package hadur2.core.duel;

import hadur2.core.gun.GunController;
import hadur2.core.gun.GunFormula;
import hadur2.core.model.SeedWeight;
import hadur2.core.model.Wave;
import hadur2.core.move.BulletShadows;
import hadur2.core.move.OurBullet;
import hadur2.core.move.PlanInterval;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.List;

/**
 * GUN-7's cost, measured: the time of one {@link GunController#aim} tick with and without the
 * shadow term, on a gun holding 400 learned samples (the main view's k is then 40) with two
 * enemy waves in the air and two of our bullets in flight. Not a test; run it by hand after
 * {@code mvn test-compile}:
 *
 * <pre>nice -n 19 java -cp hadur-core/target/classes:hadur-core/target/test-classes \
 *     hadur2.core.duel.ShadowAimBench</pre>
 *
 * <p>It prints microseconds per aim: the plain aim, the aim with the shadow term (the seam
 * built and the candidates scored), and the seam alone for the head-on candidate set.</p>
 */
public final class ShadowAimBench {

    static final BattleField FIELD = new BattleField(800, 600);
    static final MovementPredictor PREDICTOR = new MovementPredictor(FIELD);
    static final Point2D.Double ME = new Point2D.Double(400, 100);
    static final Point2D.Double ENEMY = new Point2D.Double(400, 450);

    private ShadowAimBench() {}

    static Wave wave(Point2D.Double source, long fireTime, double power) {
        Wave w = new Wave("abc.Shadow 3.83c", source, ME, 0, fireTime, power, Math.PI / 2, 8, 1, FIELD, PREDICTOR);
        w.setAccel(0).setDistance(ME.distance(source)).setVchangeTime(10).setTargetEnergy(100)
            .setSourceEnergy(100).setGunHeat(0).setEnemiesAlive(1).setLastBulletFiredTime(0);
        w.setWallDistances();
        return w;
    }

    /** Runs the measurement and prints it. */
    public static void main(String[] args) {
        GunController gun = new GunController(FIELD, 1);
        Wave gw = new Wave("abc.Shadow 3.83c", ME, ENEMY, 0, 30, 1.95, Math.PI / 2, 8, 1, FIELD, PREDICTOR);
        gw.setAccel(0).setDistance(ME.distance(ENEMY)).setVchangeTime(10).setTargetEnergy(100)
            .setSourceEnergy(100).setGunHeat(0).setEnemiesAlive(1).setLastBulletFiredTime(0);
        gw.setWallDistances();
        double[] point = new GunFormula(1).dataPointFromWave(gw, true);
        for (int i = 0; i < 400; i++) {
            double[] s = java.util.Arrays.copyOf(point, GunController.SAMPLE_WIDTH);
            // Neighbours spread over about +-0.2 rad around head-on, deterministic.
            s[10] = ((i * 37) % 41 - 20) / 50.0;
            s[11] = ((i * 13) % 17 - 8) * 1.5;
            s[12] = ((i * 29) % 23 - 11) * 1.5;
            gun.seed(gw.botName, s, new SeedWeight(1.0));
        }
        // Two enemy waves in the air at us, each shadowed by two of our bullets in flight.
        Wave e1 = wave(ENEMY, 20, 1.95);
        Wave e2 = wave(new Point2D.Double(420, 460), 28, 0.5);
        e1.firingWave = true;
        e2.firingWave = true;
        List<OurBullet> flying = List.of(
            new OurBullet(25, ME, DiaUtils.absoluteBearing(ME, ENEMY) + 0.03, 1.0),
            new OurBullet(29, ME, DiaUtils.absoluteBearing(ME, ENEMY) - 0.04, 0.1));
        for (Wave w : List.of(e1, e2)) {
            List<List<double[]>> sh = BulletShadows.of(w, flying, 800, 600);
            w.setShadows(sh.get(0), sh.get(1));
        }
        double toMe1 = DiaUtils.absoluteBearing(e1.sourceLocation, ME);
        double toMe2 = DiaUtils.absoluteBearing(e2.sourceLocation, ME);
        List<PlanInterval> plan = List.of(
            new PlanInterval(e1, toMe1 - 0.05, toMe1 + 0.05, 0.25),
            new PlanInterval(e2, toMe2 - 0.05, toMe2 + 0.05, 0.25));
        ShadowAvoidance seam = new ShadowAvoidance(800, 600);
        Point2D.Double myNext = new Point2D.Double(ME.x + 8, ME.y);

        double sink = 0;
        int warm = 3000;
        int runs = 20000;
        for (int round = 0; round < 3; round++) {
            long t0 = System.nanoTime();
            for (int i = 0; i < (round == 0 ? warm : runs); i++) {
                sink += gun.aim(gw, myNext, 31 + (i & 1), null);
            }
            long t1 = System.nanoTime();
            for (int i = 0; i < (round == 0 ? warm : runs); i++) {
                seam.prepare(plan, myNext, 30 + (i & 1));
                sink += gun.aim(gw, myNext, 31 + (i & 1), seam);
            }
            long t2 = System.nanoTime();
            if (round > 0) {
                int n = runs;
                System.out.printf("plain aim %.1f us, aim with shadows %.1f us, extra %.1f us (pass %d)%n",
                    (t1 - t0) / 1e3 / n, (t2 - t1) / 1e3 / n, ((t2 - t1) - (t1 - t0)) / 1e3 / n, round);
            }
        }
        System.out.println("sink " + sink);
    }
}
