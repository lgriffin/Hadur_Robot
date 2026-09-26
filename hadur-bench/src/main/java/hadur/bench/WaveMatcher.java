package hadur.bench;

import java.util.Arrays;
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

    /**
     * Which real shots an inferred wave pairs with, by index into {@code shots}: a maximum
     * one-to-one matching (augmenting paths), so the count does not depend on the order the
     * waves are listed in when their windows overlap.
     */
    static boolean[] matchedShots(List<double[]> shots, List<double[]> waves) {
        int[] waveOfShot = new int[shots.size()];
        Arrays.fill(waveOfShot, -1);
        for (int w = 0; w < waves.size(); w++) {
            augment(w, shots, waves, waveOfShot, new boolean[shots.size()]);
        }
        boolean[] matched = new boolean[shots.size()];
        for (int i = 0; i < matched.length; i++) matched[i] = waveOfShot[i] >= 0;
        return matched;
    }

    private static boolean augment(int w, List<double[]> shots, List<double[]> waves,
                                   int[] waveOfShot, boolean[] visited) {
        double[] wave = waves.get(w);
        for (int i = 0; i < shots.size(); i++) {
            if (visited[i] || !compatible(shots.get(i), wave)) continue;
            visited[i] = true;
            if (waveOfShot[i] < 0 || augment(waveOfShot[i], shots, waves, waveOfShot, visited)) {
                waveOfShot[i] = w;
                return true;
            }
        }
        return false;
    }

    static boolean compatible(double[] shot, double[] wave) {
        return shot[0] == wave[0]
            && Math.abs(shot[1] - (wave[1] + 1)) <= TICK_WINDOW
            && Math.abs(shot[2] - wave[2]) <= POWER_TOLERANCE;
    }
}
