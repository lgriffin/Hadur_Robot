package hadurling.core.gun;

import hadurling.core.knn.KdTree;
import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Wave;
import hadurling.core.physics.Angles;
import java.util.ArrayList;
import java.util.List;

/**
 * A gun that learns where the enemy goes. Every shot we fire is a {@link Wave}. When the
 * wave reaches the enemy we look where it is, work out the guess factor and file it in a
 * {@link KdTree} under what the enemy was doing at fire time (its sideways speed and how far
 * away it was). To aim, we ask the tree for the shots that were fired in the most similar
 * situations and fire where the enemy most often went (HL-10).
 *
 * <p>Until the tree holds {@link #MIN_SAMPLES} samples there is nothing to learn from, so
 * the gun aims head-on, like {@link HeadOnGun} (HL-11).</p>
 *
 * <p>"Where it most often went" is the neighbour whose guess factor is closest to the most
 * other neighbours' (a kernel density estimate with a fixed bandwidth), so a few odd shots
 * do not pull the aim off a clear favourite. Everything here is deterministic.</p>
 *
 * <p>One gun per round, like the {@link hadurling.core.Core} that owns it.</p>
 */
public final class GuessFactorGun {

    /** The bullet power the gun asks for by itself; a policy may ask for more. */
    public static final double POWER = HeadOnGun.POWER;
    /** The samples needed before the gun trusts the tree (HL-11). */
    public static final int MIN_SAMPLES = 5;
    /** How many neighbours vote on the aim. */
    public static final int NEIGHBOURS = 10;
    /** The most samples kept, so memory cannot grow without limit. */
    public static final int CAPACITY = 2000;
    /** How close two guess factors must be to count as "the same place". */
    static final double BANDWIDTH = 0.1;
    /** A shot is a virtual hit if it was aimed within this half-width (a robot is 36 px wide). */
    static final double ROBOT_HALF_WIDTH = 18;
    /** Waves older than this many ticks are dropped: the enemy was out of sight when they broke. */
    static final int MAX_WAVE_AGE = 200;

    /** What the gun decided: how far to turn and what to fire. */
    public static final class Aim {
        private final double turn;
        private final double power;

        Aim(double turn, double power) {
            this.turn = turn;
            this.power = power;
        }

        /** @return the gun turn in radians, clockwise positive */
        public double turn() { return turn; }
        /** @return the bullet power, 0 to hold fire */
        public double power() { return power; }
    }

    /** What the tree stores with each point: a guess factor, and whether a profile supplied it. */
    private static final class Sample {
        final double factor;
        final boolean seeded;

        Sample(double factor, boolean seeded) {
            this.factor = factor;
            this.seeded = seeded;
        }
    }

    /** A wave in flight, with what the enemy was doing when we fired it. */
    private static final class Shot {
        final Wave wave;
        final double[] features;
        final double aimedFactor;

        Shot(Wave wave, double[] features, double aimedFactor) {
            this.wave = wave;
            this.features = features;
            this.aimedFactor = aimedFactor;
        }
    }

    private final HeadOnGun headOn = new HeadOnGun();
    private final KdTree<Sample> tree = new KdTree<>(2, CAPACITY);
    private final List<Shot> inFlight = new ArrayList<>();
    /** How much seeded samples count, from 1 (as much as a sample learned now) to 0 (not at all). */
    private double seedWeight = 1;
    private int seeded;
    /** Every sample in the tree, as {sideways speed, distance, guess factor}, for saving. */
    private final List<float[]> learned = new ArrayList<>();

    /** @return how many guess factors the gun holds, seeded or learned */
    public int samples() {
        return tree.size();
    }

    /**
     * Sets how much the samples a profile seeded count (HL-31). At 0 the gun behaves as if it
     * had never been seeded. Call it as the trust in the profile changes.
     *
     * @param weight from 0 to 1; values outside are clamped
     */
    public void seedWeight(double weight) {
        this.seedWeight = Math.max(0, Math.min(1, weight));
    }

    /**
     * Fills the tree with samples from an earlier battle against this opponent, so the gun
     * starts the round knowing something. Samples that do not fit are dropped.
     *
     * @param samples each {@code {sideways speed, distance, guess factor}}, as {@link #learned()} wrote them
     */
    public void seed(List<float[]> samples) {
        for (float[] s : samples) {
            if (s.length == 3 && tree.add(new double[] {s[0], s[1]}, new Sample(s[2], true))) {
                learned.add(s.clone());
                seeded++;
            }
        }
    }

    /**
     * @return a copy of every sample the gun holds, seeded or learned, oldest first, each
     *     {@code {sideways speed, distance, guess factor}}
     */
    public List<float[]> learned() {
        List<float[]> out = new ArrayList<>();
        for (float[] s : learned) out.add(s.clone());
        return out;
    }

    /** @return how many of our waves are still travelling */
    public int wavesInFlight() {
        return inFlight.size();
    }

    /**
     * Learns from every wave that has just reached the enemy (HL-10). Call once per scan,
     * before {@link #aim}.
     *
     * @param in this tick's input
     * @param scan this tick's scan of the enemy
     * @return for each wave that reached the enemy, whether we had aimed at it: true if the
     *     enemy was found within a robot's width of where the shot was aimed (a "virtual
     *     hit", counted whether or not a real bullet was fired that way)
     */
    public List<Boolean> observe(Input in, Event.Scan scan) {
        double angle = Angles.normalAbsoluteAngle(in.heading() + scan.bearing());
        double ex = Angles.projectX(in.x(), angle, scan.distance());
        double ey = Angles.projectY(in.y(), angle, scan.distance());
        List<Boolean> outcomes = new ArrayList<>();
        for (int i = inFlight.size() - 1; i >= 0; i--) {
            Shot shot = inFlight.get(i);
            Wave w = shot.wave;
            if (in.time() - w.fireTime() > MAX_WAVE_AGE) {
                inFlight.remove(i);
            } else if (w.hasReached(in.time(), ex, ey)) {
                double gf = w.guessFactor(ex, ey);
                if (tree.add(shot.features, new Sample(gf, false))) {
                    learned.add(new float[] {(float) shot.features[0], (float) shot.features[1], (float) gf});
                }
                double halfWidth = Math.atan(ROBOT_HALF_WIDTH / w.distanceTo(ex, ey)) / w.maxEscapeAngle();
                outcomes.add(0, Math.abs(gf - shot.aimedFactor) <= halfWidth);
                inFlight.remove(i);
            }
        }
        return outcomes;
    }

    /**
     * Aims at the enemy and says whether to fire. If it fires, the shot becomes a wave.
     *
     * @param in this tick's input
     * @param scan this tick's scan of the enemy
     * @param power the bullet power to fire when the gun is cool and on target
     * @return the gun turn and the power to fire, 0 while the gun is hot or not yet on target
     */
    public Aim aim(Input in, Event.Scan scan, double power) {
        double toEnemy = Angles.normalAbsoluteAngle(in.heading() + scan.bearing());
        double lateralVelocity = scan.velocity() * Math.sin(scan.heading() - toEnemy);
        double[] features = {lateralVelocity / 8.0, scan.distance() / 800.0};
        Wave wave = new Wave(in.x(), in.y(), in.time(), power, toEnemy, Wave.direction(lateralVelocity));

        double factor = 0;
        double aimAngle = toEnemy;
        // Seeded samples that no longer count are not samples at all.
        int usable = tree.size() - (seedWeight == 0 ? seeded : 0);
        if (usable >= MIN_SAMPLES) {
            factor = densest(tree.nearest(features, NEIGHBOURS), seedWeight);
            aimAngle = wave.firingAngle(factor);
        }
        double turn = headOn.turn(in, aimAngle);
        double fire = headOn.power(in, turn) > 0 ? power : 0;
        if (fire > 0) inFlight.add(new Shot(wave, features, factor));
        return new Aim(turn, fire);
    }

    /** The guess factor with the most weight of neighbours near it (ties go to the nearer neighbour). */
    private static double densest(List<KdTree.Entry<Sample>> neighbours, double seedWeight) {
        double best = 0;
        double bestDensity = -1;
        for (KdTree.Entry<Sample> a : neighbours) {
            if (a.value().seeded && seedWeight == 0) continue;
            double density = 0;
            for (KdTree.Entry<Sample> b : neighbours) {
                double weight = b.value().seeded ? seedWeight : 1;
                double z = (a.value().factor - b.value().factor) / BANDWIDTH;
                density += weight * Math.exp(-z * z);
            }
            if (density > bestDensity) {
                bestDensity = density;
                best = a.value().factor;
            }
        }
        return best;
    }
}
