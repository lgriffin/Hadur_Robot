package hadur2.core.policy;

/**
 * The two endgame states. They are driven by energies and gun heats, never by time
 * (DIAL-2): the artifact's point is that these are the only real phase changes in a duel.
 *
 * <p>{@code HadurCore} reads the state once a duel tick, after the distance controller has
 * stepped, from the enemy's energy at the last scan, our energy, the
 * {@link EnemyGunHeat} estimate and our own gun heat (counting a shot fired this tick, so a
 * gun that has just fired is never the cooler one). {@link State#FINISH} sets the
 * {@link DistancePolicy} target to {@link DistancePolicy#FINISH}; {@link State#RAM} hands
 * the movement to a straight drive at the enemy in place of the surf.</p>
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
     *
     * <p>A disabled robot's energy is reported as exactly 0, so END-2 tests for equality.
     * END-1 needs all three of its conditions, each strict: enemy energy below
     * {@link #FINISH_ENEMY_ENERGY}, ours above {@link #FINISH_OUR_ENERGY}, and their gun
     * hotter than ours, so that we can fire before they can answer.</p>
     *
     * @param enemyEnergy the enemy's energy at the last scan
     * @param ourEnergy our energy this tick
     * @param enemyGunHeat the enemy's estimated gun heat this tick
     * @param ourGunHeat our gun heat this tick, including a shot fired on it
     * @return the state for this tick
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
