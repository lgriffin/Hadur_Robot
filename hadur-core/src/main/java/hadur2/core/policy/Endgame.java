package hadur2.core.policy;

/**
 * The two endgame states. They are driven by energies and gun heats, never by time
 * (DIAL-2): the artifact's point is that these are the only real phase changes in a duel.
 */
public final class Endgame {

    /** END-1: enemy energy below this ... */
    public static final double FINISH_ENEMY_ENERGY = 16;
    /** ... and ours above this. */
    public static final double FINISH_OUR_ENERGY = 40;

    /** The endgame state for one tick. */
    public enum State {
        /** Neither: the distance controller and the surf decide. */
        NONE,
        /** END-1: close to {@link DistancePolicy#FINISH} while they are low and we are safe. */
        FINISH,
        /** END-2: they are disabled; drive straight at them. */
        RAM
    }

    private Endgame() {}

    /**
     * END-1 and END-2 from the last scan's enemy energy, our energy, and both gun heats.
     * RAM wins over FINISH: a disabled enemy cannot shoot back, whatever the heats.
     */
    public static State of(double enemyEnergy, double ourEnergy, double enemyGunHeat, double ourGunHeat) {
        if (enemyEnergy == 0) return State.RAM;
        if (enemyEnergy < FINISH_ENEMY_ENERGY && ourEnergy > FINISH_OUR_ENERGY
                && enemyGunHeat > ourGunHeat) {
            return State.FINISH;
        }
        return State.NONE;
    }
}
