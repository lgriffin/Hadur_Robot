package hadur2.core.duel;

/** Duel-side switches for gun-power experiments; off by default, read by {@link DuelController} only. */
final class PowerDesign {
    /**
     * POW-12 pressure power: while {@code PowerPolicy.pressure} holds in a duel, the gun skips the
     * cubic power-down and fires a base power of 2.5 beyond 150 px.
     */
    static final boolean PRESSURE = false;

    /**
     * POW-12, weaker form (meant with {@link #PRESSURE}): under the same gate only the power-down is
     * skipped and the base power stays 1.95.
     */
    static final boolean PRESSURE_BASE_ONLY_POWERDOWN = false;

    /**
     * POW-12, gate variant "pwall" (meant with {@link #PRESSURE}): no rate gate at all; pressure power on every
     * duel aim, keeping only the energy floor and the yield to the lead-aware regime. Wins over
     * {@link #PRESSURE_CENTRES} if both are on.
     */
    static final boolean PRESSURE_ALWAYS = false;

    /**
     * POW-12, gate variant "pwc" (meant with {@link #PRESSURE}): the gate reads the window centres only (ours at
     * least 12%, theirs at most 9%, both windows holding at least 30 outcomes), no margins. Ignored if
     * {@link #PRESSURE_ALWAYS} is on.
     */
    static final boolean PRESSURE_CENTRES = false;

    private PowerDesign() {}

    /** The pressure gate in force: ALWAYS wins over CENTRES, which wins over the margin gate. */
    static boolean pressureHolds(boolean leadHolds, double ourEnergy, hadur2.core.policy.HitWindow ours,
                                 hadur2.core.policy.HitWindow theirs) {
        if (!PRESSURE) return false;
        if (PRESSURE_ALWAYS) return hadur2.core.policy.PowerPolicy.pressureAlways(leadHolds, ourEnergy);
        if (PRESSURE_CENTRES) {
            return hadur2.core.policy.PowerPolicy.pressureCentres(leadHolds, ourEnergy,
                ours.estimate(), theirs.estimate(), ours.size(), theirs.size());
        }
        return hadur2.core.policy.PowerPolicy.pressure(leadHolds, ourEnergy, ours.estimate(), theirs.estimate());
    }

    /** The gun's reading of the pressure gate. */
    static hadur2.core.gun.GunController.Stakes pressureStakes() {
        return PRESSURE_BASE_ONLY_POWERDOWN
            ? hadur2.core.gun.GunController.Stakes.PRESSURE_DOWN
            : hadur2.core.gun.GunController.Stakes.PRESSURE;
    }
}
