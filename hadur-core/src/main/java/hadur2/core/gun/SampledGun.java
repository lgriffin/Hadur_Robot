package hadur2.core.gun;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Point2D;
import java.util.List;

/**
 * GUN-5: the light bullets' fourth virtual gun. It aims at one neighbour's guess factor,
 * chosen by a quasi-random phase, instead of at the density peak of all of them.
 *
 * <p>Why it exists. A bullet of power 0.1 is nearly free, so the aim that pays is not always the
 * single most likely angle: a surfer that dodges the peak is shot at it, and a flattener that
 * answers a peak-seeking gun is not. The 4 and 5 October 2026 probe against DrussGT
 * (docs/druss-route-plan.md, decision 3) fired this aim in place of the density peak and raised
 * the light-bullet hit rate from 7.9% to 9.3%. Here it is one candidate among four, rated
 * separately for light bullets, so the gun uses it only against opponents it works on.</p>
 *
 * <p>The neighbours are the hybrid view's (the anti-surfer feature space, one long-memory
 * view, learning from real and virtual waves). The phase is the golden-ratio sequence, as
 * {@code shield.AimJitter}'s and {@code move.MirrorDrive}'s are: no randomness (RES-6), the same
 * start in every core (CORE-2), so a replay aims exactly as the recorded battle did. It lives
 * in the core's state, in this object, and moves on only when a real shot goes out
 * ({@link #shotFired}); the virtual bullet scored for a shot is aimed at the same phase as the
 * shot itself, so a rating compares like with like.</p>
 *
 * <p>Duel only: a guess factor needs one target.</p>
 */
public final class SampledGun {

    /** The golden ratio's fractional part, (sqrt(5) - 1) / 2: the low-discrepancy step. */
    static final double GOLDEN = 0.6180339887498949;

    /** Position in the golden-ratio sequence, in [0, 1); the same start in every core. */
    private double phase = GOLDEN;

    /** The gun's name in the logs. */
    public String getLabel() {
        return "Sampled Gun";
    }

    /** The current phase, in [0, 1). */
    public double phase() {
        return phase;
    }

    /** A real shot went out: the next one samples at the next term of the sequence. */
    public void shotFired() {
        phase += GOLDEN;
        if (phase >= 1) phase -= 1;
    }

    /**
     * Which of {@code n} neighbours the phase picks: {@code floor(phase * n)}, the last at most.
     *
     * @param phase a phase in [0, 1)
     * @param n the neighbour count, at least 1
     * @return an index in [0, n)
     */
    static int pick(double phase, int n) {
        return Math.min(n - 1, (int) (phase * n));
    }

    /**
     * The absolute bearing to fire along, in radians: the picked neighbour's guess factor,
     * scaled by the precise escape angle on its side, from where the bullet will leave.
     *
     * @param w the gun wave for the shot
     * @param view the hybrid view for the target (this gun reads {@link HybridGun#viewName()})
     * @param myNextLocation where we will be when the bullet leaves, the next tick
     * @return the bearing in [0, 2pi), or {@code w.absBearing} while the view has no neighbours
     */
    public double aim(Wave w, KnnView<TimestampedFiringAngle> view, Point2D.Double myNextLocation) {
        if (view.effectiveSize() == 0) return w.absBearing;
        List<KdTree.Entry<TimestampedFiringAngle>> neighbors = view.nearestNeighbors(w, true);
        if (neighbors.isEmpty()) return w.absBearing;
        double gf = neighbors.get(pick(phase, neighbors.size())).value.guessFactor;
        gf = Math.max(-1.0, Math.min(1.0, gf));
        double nextAbsBearing = DiaUtils.absoluteBearing(myNextLocation, w.targetLocation);
        return Angles.normalAbsoluteAngle(
            nextAbsBearing + gf * w.orbitDirection * w.preciseEscapeAngle(gf >= 0));
    }
}
