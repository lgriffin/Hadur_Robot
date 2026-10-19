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

    private PowerDesign() {}

    /** The gun's reading of the pressure gate. */
    static hadur2.core.gun.GunController.Stakes pressureStakes() {
        return PRESSURE_BASE_ONLY_POWERDOWN
            ? hadur2.core.gun.GunController.Stakes.PRESSURE_DOWN
            : hadur2.core.gun.GunController.Stakes.PRESSURE;
    }
}
