package hadurling.core.move;

import hadurling.core.model.Input;
import hadurling.core.model.Wave;
import hadurling.core.physics.Angles;
import hadurling.core.physics.Rules;
import java.util.ArrayList;
import java.util.List;

/**
 * Wave surfing in its smallest form. Every enemy shot is a {@link Wave}. We remember the
 * guess factors at which we were hit, because a gun that learns will keep aiming there. When
 * a wave is on its way, the surfer asks: if I go clockwise round the enemy, where in the
 * wave will I be when it arrives, and how dangerous is that guess factor? And if I go
 * anticlockwise? It picks the safer of the two (HL-12).
 *
 * <p>The danger of a guess factor is the number of past hits near it, each counted with a
 * bell-shaped weight. The prediction is crude: it assumes we drive at full speed along the
 * tangent for the whole flight. Hadur's {@code SurfMover} simulates the real turning and
 * braking, stays off the walls and compares more than two options.</p>
 */
public final class Surfer {

    /** How close two guess factors must be to count as "the same place". */
    static final double BANDWIDTH = 0.15;
    /** The hits remembered, oldest forgotten first. */
    static final int MAX_HITS = 100;
    /** A wave that has gone this far (px) past us is over. */
    static final double PASSED = 50;

    private static final class Tracked {
        final Wave wave;
        boolean hit;

        Tracked(Wave wave) {
            this.wave = wave;
        }
    }

    private final List<Tracked> waves = new ArrayList<>();
    private final List<Double> hits = new ArrayList<>();

    /**
     * The enemy fired.
     *
     * @param wave the wave its bullet makes; its origin is the enemy, its target is us
     */
    public void enemyFired(Wave wave) {
        waves.add(new Tracked(wave));
    }

    /** @return the enemy waves still travelling */
    public int waves() {
        return waves.size();
    }

    /** @return the guess factors at which we have been hit, oldest first */
    public List<Double> hits() {
        return List.copyOf(hits);
    }

    /**
     * An enemy bullet has hit us: file the guess factor under the wave that is arriving now.
     *
     * @param in this tick's input, which says where we are
     */
    public void hitBy(Input in) {
        Tracked arriving = null;
        double gap = Double.MAX_VALUE;
        for (Tracked t : waves) {
            if (t.hit) continue;
            double g = Math.abs(t.wave.radius(in.time()) - t.wave.distanceTo(in.x(), in.y()));
            if (g < gap) {
                gap = g;
                arriving = t;
            }
        }
        // A bullet moves up to one speed per tick, and our body is 36 px across.
        if (arriving == null || gap > arriving.wave.speed() + 18) return;
        arriving.hit = true;
        hits.add(arriving.wave.guessFactor(in.x(), in.y()));
        if (hits.size() > MAX_HITS) hits.remove(0);
    }

    /**
     * Drops the waves that have gone past us.
     *
     * @param in this tick's input
     * @return for each wave that ended, whether it hit us
     */
    public List<Boolean> advance(Input in) {
        List<Boolean> outcomes = new ArrayList<>();
        for (int i = waves.size() - 1; i >= 0; i--) {
            Tracked t = waves.get(i);
            if (t.wave.radius(in.time()) > t.wave.distanceTo(in.x(), in.y()) + PASSED) {
                outcomes.add(0, t.hit);
                waves.remove(i);
            }
        }
        return outcomes;
    }

    /**
     * Chooses which way to circle the enemy.
     *
     * @param in this tick's input
     * @param current the direction we are going now: +1 clockwise, -1 anticlockwise
     * @return +1 or -1; {@code current} when no wave is coming or both ways are equally safe
     */
    public int choose(Input in, int current) {
        Wave wave = soonest(in);
        if (wave == null) return current;
        double clockwise = danger(predictedFactor(wave, in, +1));
        double anticlockwise = danger(predictedFactor(wave, in, -1));
        if (Math.abs(clockwise - anticlockwise) < 1e-9) return current;
        return clockwise < anticlockwise ? +1 : -1;
    }

    /** The wave that will reach us first, or null. */
    private Wave soonest(Input in) {
        Wave best = null;
        double least = Double.MAX_VALUE;
        for (Tracked t : waves) {
            double remaining = t.wave.distanceTo(in.x(), in.y()) - t.wave.radius(in.time());
            if (remaining >= 0 && remaining < least) {
                least = remaining;
                best = t.wave;
            }
        }
        return best;
    }

    /** The guess factor we would have when the wave arrives if we went {@code direction} all the way. */
    private static double predictedFactor(Wave wave, Input in, int direction) {
        double remaining = wave.distanceTo(in.x(), in.y()) - wave.radius(in.time());
        double ticks = Math.max(0, remaining / wave.speed());
        double toUs = Angles.absoluteBearing(wave.originX(), wave.originY(), in.x(), in.y());
        // Clockwise round the enemy is a quarter turn further round the compass than the line to us.
        double heading = toUs + direction * Math.PI / 2;
        double travel = Rules.MAX_VELOCITY * ticks;
        return wave.guessFactor(Angles.projectX(in.x(), heading, travel), Angles.projectY(in.y(), heading, travel));
    }

    /** @return how many past hits lie near {@code factor}, each weighted by closeness */
    double danger(double factor) {
        double sum = 0;
        for (double h : hits) {
            double z = (factor - h) / BANDWIDTH;
            sum += Math.exp(-z * z);
        }
        return sum;
    }
}
