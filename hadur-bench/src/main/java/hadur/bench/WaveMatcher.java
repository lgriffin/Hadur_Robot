package hadur.bench;

import java.util.List;

/**
 * Scores the waves Hadur inferred against the bullets the enemy really fired (S2's wave
 * fidelity). Both lists hold {@code {round, tick, power}}. Hadur's fire tick is robot
 * time, which runs one behind the engine's turn number, and a drop is seen a tick or two
 * after the shot, so a match allows a small window.
 */
final class WaveMatcher {

    static final int TICK_WINDOW = 3;
    static final double POWER_TOLERANCE = 0.15;

    private WaveMatcher() {}

    /** How many inferred waves pair with a distinct real shot. */
    static int match(List<double[]> shots, List<double[]> waves) {
        int matched = 0;
        for (boolean m : matchedShots(shots, waves)) if (m) matched++;
        return matched;
    }

    /** Which real shots an inferred wave pairs with, by index into {@code shots}. */
    static boolean[] matchedShots(List<double[]> shots, List<double[]> waves) {
        boolean[] used = new boolean[shots.size()];
        for (double[] w : waves) {
            int best = -1;
            double bestGap = Double.MAX_VALUE;
            for (int i = 0; i < shots.size(); i++) {
                double[] s = shots.get(i);
                if (used[i] || s[0] != w[0]) continue;
                double gap = Math.abs(s[1] - (w[1] + 1));
                if (gap <= TICK_WINDOW && Math.abs(s[2] - w[2]) <= POWER_TOLERANCE && gap < bestGap) {
                    best = i;
                    bestGap = gap;
                }
            }
            if (best >= 0) used[best] = true;
        }
        return used;
    }
}
