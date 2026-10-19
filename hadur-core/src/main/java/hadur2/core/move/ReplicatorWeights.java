package hadur2.core.move;

import java.util.Arrays;

/**
 * MOVE-16: the per-battle multipliers that let the danger views reproduce in proportion to
 * how well each predicted the bullets that actually came (the discrete replicator equation).
 * A view's effective weight in the danger average is its fixed weight times its multiplier;
 * every multiplier starts at 1.
 *
 * <p>When an enemy bullet's true angle becomes known, each view that is on rates it with a
 * probability density {@code d_i} over the guess factors in [-1, 1] (see {@link #density}),
 * mixed with a little uniform density so a view that missed entirely is not wiped out:
 * {@code p_i = (1 - EPSILON) d_i + EPSILON / 2}. Then {@code m_i <- m_i p_i / pbar}, where
 * {@code pbar = sum_j w_j m_j p_j / sum_j w_j m_j} is the effective-weight average of the
 * predictions, so a view that beat the average gains share and one that fell short loses it.
 * Afterwards no on-view's share of the on-views' effective weight stays below {@link #FLOOR}
 * (mutation: a view can come back when the enemy changes gun), and no multiplier exceeds
 * {@link #MAX}.</p>
 *
 * <p>Only the views that are on take part; the others keep their multipliers. The class
 * holds numbers only, so it knows nothing of the views, waves or the switch.</p>
 */
final class ReplicatorWeights {

    /** The share of a uniform density mixed into every prediction. */
    static final double EPSILON = 0.05;
    /** The least share of the participating views' effective weight any one of them keeps. */
    static final double FLOOR = 0.02;
    /** The largest multiplier a view may reach. */
    static final double MAX = 20.0;

    private final double[] multipliers;

    /**
     * @param views how many danger views there are
     */
    ReplicatorWeights(int views) {
        multipliers = new double[views];
        Arrays.fill(multipliers, 1.0);
    }

    /** View {@code i}'s multiplier. */
    double multiplier(int i) {
        return multipliers[i];
    }

    /** A copy of every multiplier. */
    double[] multipliers() {
        return multipliers.clone();
    }

    /**
     * A prediction as a density over [-1, 1]: the kernel's value at the bullet's guess factor
     * over the kernel's integral across the guess-factor grid (trapezoid rule over the evenly
     * spaced samples), so a density that integrates to 1.
     *
     * @param atHit the view's raw kernel sum at the bullet's guess factor
     * @param grid the same kernel sum at evenly spaced guess factors from -1 to 1, ends included
     * @return the density, 0 when the kernel is flat zero or not finite
     */
    static double density(double atHit, double[] grid) {
        double sum = 0;
        for (int i = 0; i < grid.length; i++) {
            sum += (i == 0 || i == grid.length - 1) ? 0.5 * grid[i] : grid[i];
        }
        double integral = sum * 2.0 / (grid.length - 1);
        if (!(integral > 0) || !(atHit >= 0)) return 0;
        return atHit / integral;
    }

    /** The probability a view is credited with: its density mixed with the uniform 1/2. */
    static double probability(double density) {
        return (1 - EPSILON) * density + EPSILON * 0.5;
    }

    /**
     * The replicator update, then the floor and the cap.
     *
     * @param weights the views' fixed weights
     * @param on which views take part (those not on keep their multipliers)
     * @param densities each participating view's density at the bullet's guess factor
     */
    void update(double[] weights, boolean[] on, double[] densities) {
        int n = multipliers.length;
        double total = 0;
        double weighted = 0;
        double[] p = new double[n];
        for (int i = 0; i < n; i++) {
            if (!on[i] || !(weights[i] > 0)) continue;
            p[i] = probability(densities[i]);
            double eff = weights[i] * multipliers[i];
            total += eff;
            weighted += eff * p[i];
        }
        if (!(total > 0) || !(weighted > 0)) return;
        double mean = weighted / total;
        for (int i = 0; i < n; i++) {
            if (on[i] && weights[i] > 0) multipliers[i] *= p[i] / mean;
        }
        applyFloor(weights, on, total);
        for (int i = 0; i < n; i++) multipliers[i] = Math.min(multipliers[i], MAX);
    }

    /**
     * Raises every participating view's share to {@link #FLOOR} and takes it evenly from the
     * rest, keeping the participating views' total effective weight at {@code total}.
     */
    private void applyFloor(double[] weights, boolean[] on, double total) {
        int n = multipliers.length;
        double[] share = shares(weights, on);
        boolean[] pinned = new boolean[n];
        int pins = 0;
        boolean again = true;
        while (again) {
            again = false;
            double free = 0;
            for (int i = 0; i < n; i++) if (share[i] > 0 && !pinned[i]) free += share[i];
            double rest = 1.0 - pins * FLOOR;
            for (int i = 0; i < n; i++) {
                if (share[i] <= 0 || pinned[i]) continue;
                if (share[i] / free * rest < FLOOR) {
                    pinned[i] = true;
                    pins++;
                    again = true;
                }
            }
        }
        if (pins == 0) return;
        double free = 0;
        for (int i = 0; i < n; i++) if (share[i] > 0 && !pinned[i]) free += share[i];
        double rest = 1.0 - pins * FLOOR;
        for (int i = 0; i < n; i++) {
            if (share[i] <= 0) continue;
            double s = pinned[i] ? FLOOR : share[i] / free * rest;
            multipliers[i] = s * total / weights[i];
        }
    }

    /**
     * Each participating view's share of the participating views' effective weight, in [0, 1]
     * and summing to 1; 0 for a view that is not on.
     *
     * @param weights the views' fixed weights
     * @param on which views take part
     * @return the shares
     */
    double[] shares(double[] weights, boolean[] on) {
        int n = multipliers.length;
        double[] share = new double[n];
        double total = 0;
        for (int i = 0; i < n; i++) {
            if (!on[i] || !(weights[i] > 0)) continue;
            share[i] = weights[i] * multipliers[i];
            total += share[i];
        }
        if (!(total > 0)) return share;
        for (int i = 0; i < n; i++) share[i] /= total;
        return share;
    }
}
