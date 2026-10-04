package hadurling.core.policy;

/**
 * When to fire full power instead of the gun's own choice. A power-3 bullet that lands deals
 * 16 damage and refunds 9 energy, so against a gun that rarely hits us it pays at any
 * distance. Against one that hits often it is a way to lose. So the policy fires 3.0 only
 * when it is <em>certain</em> of both rates (HL-27), and otherwise leaves the gun alone
 * (HL-28).
 *
 * <p>"Certain" means the whole 95% interval is on the right side of the line, not just the
 * raw rate: our rate's lower bound must be above {@link #OUR_RATE}, and theirs' upper bound
 * below {@link #THEIR_RATE}. Thirty shots at us without a hit is a raw rate of 0% but an upper
 * bound near 14%, so it is not yet certain that their gun is under 10%; it takes about fifty.
 * One hit in one shot of ours is a raw 100% but a lower bound of 17%, so that is not enough
 * either. Hadur's {@code PowerPolicy} has the same rule (its POW-2) plus four more.</p>
 *
 * <p>Every method is pure: the same numbers give the same answer.</p>
 */
public final class PowerPolicy {

    /** The power fired when the evidence is in. */
    public static final double FULL_POWER = 3.0;
    /** Our hit rate must certainly be above this. */
    public static final double OUR_RATE = 0.20;
    /** Their hit rate must certainly be below this. */
    public static final double THEIR_RATE = 0.10;
    /** At or below this much energy of our own, the gun's power-down stands: a miss could disable us. */
    public static final double MIN_OUR_ENERGY = 12;

    private PowerPolicy() {}

    /**
     * Whether both rates are certain enough for full power.
     *
     * @param ours our rolling hit rate on them
     * @param theirs their rolling hit rate on us
     * @return false when either is unknown or its interval reaches the wrong side of its line
     */
    public static boolean certain(Estimate ours, Estimate theirs) {
        if (Double.isNaN(ours.value()) || Double.isNaN(theirs.value())) return false;
        return ours.lower() > OUR_RATE && theirs.upper() < THEIR_RATE;
    }

    /**
     * The power to fire.
     *
     * <p>When the evidence is certain it is {@link #FULL_POWER}, but not more than a quarter
     * of their energy (a bullet of power p takes at least 4p, so a quarter of their energy
     * is already a killing shot), and never less than the gun's own choice.</p>
     *
     * @param gunPower the power the gun would fire
     * @param ours our rolling hit rate on them
     * @param theirs their rolling hit rate on us
     * @param ourEnergy our energy
     * @param enemyEnergy their energy
     * @return the power to fire, {@code gunPower} unless the evidence is certain
     */
    public static double power(double gunPower, Estimate ours, Estimate theirs, double ourEnergy,
            double enemyEnergy) {
        if (!(ourEnergy > MIN_OUR_ENERGY) || !certain(ours, theirs)) return gunPower;
        return Math.max(gunPower, Math.min(FULL_POWER, enemyEnergy / 4.0));
    }
}
