package hadur2.core.melee;

/**
 * Melee bullet power (MGUN-2, MGUN-3), the plan's energy table:
 *
 * <ul>
 * <li>a finisher (target energy at most {@link #FINISHER_ENERGY}) gets the power that kills
 *     it exactly, at most 3;</li>
 * <li>with two opponents or fewer left, the duel's own table (1.95, 2.95 inside 150 px,
 *     powering down beyond 325 px as energy runs low);</li>
 * <li>otherwise 1.0 beyond 500 px or below 20 energy (0.5 below 10), 1.5 at 300-500 px, and
 *     2.0 inside 300 px rising to 3.0 at 150 px.</li>
 * </ul>
 *
 * <p>Nothing is fired below {@link #MIN_OWN_ENERGY}, a shot never costs more than what kills
 * the target, and while Hadur leads the target on energy a shot never drops it below the
 * target's.</p>
 */
public final class MeleeEnergyPolicy {

    public static final double FINISHER_ENERGY = 16.0;
    public static final double MIN_OWN_ENERGY = 1.0;
    static final double MIN_POWER = 0.1;
    static final double MAX_POWER = 3.0;

    private MeleeEnergyPolicy() {}

    /** The power to fire at a target {@code distance} away with {@code targetEnergy}, or 0 to hold. */
    public static double power(double distance, double ownEnergy, double targetEnergy, int others) {
        if (ownEnergy < MIN_OWN_ENERGY) return 0;
        double p;
        if (targetEnergy <= FINISHER_ENERGY) {
            p = Math.min(MAX_POWER, killPower(targetEnergy));
        } else if (others <= 2) {
            p = duelPower(distance, ownEnergy, targetEnergy);
        } else if (distance > 500 || ownEnergy < 20) {
            p = ownEnergy < 10 ? 0.5 : 1.0;
        } else if (distance >= 300) {
            p = 1.5;
        } else if (distance <= 150) {
            p = 3.0;
        } else {
            p = 2.0 + (300 - distance) / 150.0;
        }
        p = Math.min(p, killPower(targetEnergy));
        if (ownEnergy > targetEnergy) {
            double lead = ownEnergy - targetEnergy;
            // A lead too small for the lightest shot is kept by holding fire.
            if (lead < MIN_POWER) return 0;
            p = Math.min(p, lead);
        }
        p = Math.max(p, MIN_POWER);
        return Math.min(p, ownEnergy);
    }

    /** The duel gun's 1v1 table, mirrored here: melee code does not reach into the duel. */
    static double duelPower(double distance, double ownEnergy, double targetEnergy) {
        double p = distance < 150 ? 2.95 : 1.95;
        if (distance > 325) {
            double powerDownPoint = Math.max(35.0, Math.min(63.0, 63.0 + (targetEnergy - ownEnergy) * 4.0));
            if (ownEnergy < powerDownPoint) p = Math.min(p, Math.pow(ownEnergy / powerDownPoint, 3) * 1.95);
        }
        return p;
    }

    /**
     * The least power whose damage finishes a robot with {@code energy} left: e/4 below
     * power 1, else (e + 2)/6, with a hair more so rounding cannot leave it alive.
     */
    public static double killPower(double energy) {
        double p = energy <= 4.0 ? energy / 4.0 : (energy + 2.0) / 6.0;
        return Math.max(MIN_POWER, p + 0.01);
    }
}
