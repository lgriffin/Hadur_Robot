package hadur2.core.shield;

/**
 * SHIELD-1: watches how our bullets end and says when the enemy is shooting them down.
 *
 * <p>Keeps the fate of our last {@link #WINDOW} bullets (hit, missed, or destroyed by an
 * enemy bullet). The enemy is a shielder once at least {@link #MIN_INTERCEPTS} of them, and
 * at least {@link #MIN_SHARE} of them, were destroyed. Two bullets meet by accident a few
 * times a battle; a shielder meets most of ours. Once found, the verdict holds for the rest
 * of the battle: the counter makes intercepts rare, and dropping it would let the shield
 * back in. SHIELD-3 adds two ways in: a bullet destroyed by an enemy that has not moved since the
 * round began latches it at once, and a profile that records a shielder latches it from the
 * first shot.</p>
 *
 * <p>{@code HadurCore} reports each of our duel bullets' fate from the engine's bullet
 * events: hit, missed (left the field) or intercepted (met an enemy bullet). Bullets fired
 * in a melee are skipped. The window is a ring buffer, so memory is fixed (RES-2).</p>
 */
public final class ShieldDetector {

    /** SHIELD-1: the bullets judged, the latest 20 resolved ones. */
    public static final int WINDOW = 20;
    /** SHIELD-1: the fewest intercepted bullets in the window that make a shielder. */
    public static final int MIN_INTERCEPTS = 4;
    /** SHIELD-1: the smallest share of the window's bullets that must have been intercepted. */
    public static final double MIN_SHARE = 0.25;

    /** Ring buffer of the latest fates: true where the bullet was intercepted. */
    private final boolean[] intercepted = new boolean[WINDOW];
    /** Bullets in the window so far, up to {@link #WINDOW}. */
    private int size;
    /** The ring slot the next fate goes in; once full, the oldest fate's slot. */
    private int next;
    /** Intercepts among the fates now in the window, kept as they enter and leave. */
    private int interceptsInWindow;
    /** Latched: once true it stays true for the battle. */
    private boolean shielded;
    private int totalIntercepts;

    /** One of our bullets hit the enemy. */
    public void bulletHit() {
        record(false);
    }

    /** One of our bullets left the field. */
    public void bulletMissed() {
        record(false);
    }

    /** One of our bullets was destroyed by an enemy bullet. */
    public void bulletIntercepted() {
        bulletIntercepted(false);
    }

    /**
     * One of our bullets was destroyed by an enemy bullet.
     *
     * @param enemyStill SHIELD-3: the enemy has not moved since the round began, so this is a
     *     shield and not two robots that happened to fire at once: the enemy is a shielder
     *     from the next shot, without waiting for SHIELD-1's four in twenty
     * @return whether the still-enemy rule is what made the enemy a shielder on this bullet
     *     (not an earlier verdict, and not SHIELD-1's window latching on the same bullet)
     */
    public boolean bulletIntercepted(boolean enemyStill) {
        boolean was = shielded;
        totalIntercepts++;
        record(true);
        boolean byWindow = !was && shielded;
        if (enemyStill && !shielded) shielded = true;
        return enemyStill && !was && !byWindow;
    }

    /** SHIELD-3: a profile records the enemy as a shielder from an earlier battle; it is one from the first shot. */
    public void knownShielder() {
        shielded = true;
    }

    /** Whether the enemy has been found to shoot our bullets down in this battle. */
    public boolean shielded() {
        return shielded;
    }

    /** Our bullets destroyed by enemy bullets over the battle. */
    public int totalIntercepts() {
        return totalIntercepts;
    }

    /** Adds one fate to the window, dropping the oldest once full, and checks SHIELD-1. */
    private void record(boolean wasIntercepted) {
        // A full window overwrites its oldest fate: take it out of the count first.
        if (size == WINDOW && intercepted[next]) interceptsInWindow--;
        intercepted[next] = wasIntercepted;
        if (wasIntercepted) interceptsInWindow++;
        next = (next + 1) % WINDOW;
        if (size < WINDOW) size++;
        // Both thresholds must hold: a count, so the first few bullets can't trip it on
        // a single accident, and a share of the bullets seen so far (all 20 once full).
        if (interceptsInWindow >= MIN_INTERCEPTS && interceptsInWindow >= MIN_SHARE * size) {
            shielded = true;
        }
    }
}
