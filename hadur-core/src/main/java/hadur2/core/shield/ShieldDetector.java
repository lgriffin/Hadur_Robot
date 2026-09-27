package hadur2.core.shield;

/**
 * SHIELD-1: watches how our bullets end and says when the enemy is shooting them down.
 *
 * <p>Keeps the fate of our last {@link #WINDOW} bullets (hit, missed, or destroyed by an
 * enemy bullet). The enemy is a shielder once at least {@link #MIN_INTERCEPTS} of them, and
 * at least {@link #MIN_SHARE} of them, were destroyed. Two bullets meet by accident a few
 * times a battle; a shielder meets most of ours. Once found, the verdict holds for the rest
 * of the battle: the counter makes intercepts rare, and dropping it would let the shield
 * back in.</p>
 */
public final class ShieldDetector {

    public static final int WINDOW = 20;
    public static final int MIN_INTERCEPTS = 4;
    public static final double MIN_SHARE = 0.25;

    private final boolean[] intercepted = new boolean[WINDOW];
    private int size;
    private int next;
    private int interceptsInWindow;
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
        totalIntercepts++;
        record(true);
    }

    /** Whether the enemy has been found to shoot our bullets down in this battle. */
    public boolean shielded() {
        return shielded;
    }

    /** Our bullets destroyed by enemy bullets over the battle. */
    public int totalIntercepts() {
        return totalIntercepts;
    }

    private void record(boolean wasIntercepted) {
        if (size == WINDOW && intercepted[next]) interceptsInWindow--;
        intercepted[next] = wasIntercepted;
        if (wasIntercepted) interceptsInWindow++;
        next = (next + 1) % WINDOW;
        if (size < WINDOW) size++;
        if (interceptsInWindow >= MIN_INTERCEPTS && interceptsInWindow >= MIN_SHARE * size) {
            shielded = true;
        }
    }
}
