package hadur117.micro.core;

/**
 * Bullet power and the fire gate: Figment's {@code log10(energy) * 325 / distance} (about 3 at
 * 200 px, 1 at 650 px), with no cap but the engine's own 0.1 to 3 (SAOR-17). Saor 0.2 capped it
 * at {@code others / 3 + 1.9} (SAOR-8, retired in 0.3: stage 5 measured the cap at 0 to -0.14
 * APS, docs/plan-saor-first.md). The gun fires only once it has finished turning (SAOR-10).
 */
public final class Energy {

    private Energy() {
    }

    /**
     * The power to fire at the target. Below 0.1 the engine fires 0.1, so a robot under 1
     * energy still fires; Figment's {@code power > 0} check cost 6 bytes (docs/saor.md).
     *
     * @param energy our energy
     * @param distance the target's distance
     * @return the power
     */
    public static double power(double energy, double distance) {
        return Math.log10(energy) * 325 / distance;
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
