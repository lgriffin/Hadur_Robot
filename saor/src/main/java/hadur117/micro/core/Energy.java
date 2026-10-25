package hadur117.micro.core;

/**
 * Bullet power and the fire gate: Figment's {@code log10(energy) * 325 / distance} (about 3 at
 * 200 px, 1 at 650 px), capped at {@code others / 3 + 1.9}: 1.9 while fewer than three
 * opponents remain (SAOR-8), where the end game is scored on survival and 1.9 keeps two shots
 * of margin against a 3-power hit; 2.9 with three to five; no cap the engine does not apply
 * itself above that. The gun fires only once it has finished turning (SAOR-10).
 */
public final class Energy {

    /** The end-game cap (SAOR-8). */
    public static final double END_GAME_POWER = 1.9;

    private Energy() {
    }

    /**
     * The power to fire at the target. Below 0.1 the engine fires 0.1, so a robot under 1
     * energy still fires; Figment's {@code power > 0} check cost 6 bytes (docs/saor.md).
     *
     * @param energy our energy
     * @param distance the target's distance
     * @param others opponents alive
     * @return the power
     */
    public static double power(double energy, double distance, int others) {
        return Math.min(others / 3 + END_GAME_POWER, Math.log10(energy) * 325 / distance);
    }

    /**
     * The fire gate (SAOR-10).
     *
     * @param gunTurnRemaining the gun turn still to go, radians
     * @return true only when the gun is on its aim
     */
    public static boolean fire(double gunTurnRemaining) {
        return gunTurnRemaining == 0;
    }

    /**
     * A bullet's speed, as {@code Rules.getBulletSpeed} computes it: power clamped to
     * [0.1, 3], then {@code 20 - 3 power}.
     *
     * @param power the power asked for
     * @return px a tick
     */
    public static double bulletSpeed(double power) {
        return 20 - 3 * Math.min(Math.max(power, 0.1), 3);
    }
}
