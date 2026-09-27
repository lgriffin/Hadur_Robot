package hadur2.core.posture;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Decides each tick whether the melee subsystems may drive (GATE-1). It fails closed: any
 * doubt gives the duel.
 *
 * <ul>
 * <li>Two or more opponents alive, or it is a duel within the same tick (GATE-2).</li>
 * <li>No sentry robot alive, and none scanned this round; a scanned sentry vetoes melee
 *     for the rest of the round (GATE-3).</li>
 * <li>No melee fault this round; the first one vetoes melee for the rest of it (GATE-4).</li>
 * </ul>
 *
 * <p>Sentry names are remembered for the whole battle, so a sentry is never taken for an
 * opponent once seen (GATE-5), even in a later round before it is scanned again. Robocode
 * already leaves sentries out of the opponent count it gives.</p>
 */
public final class PostureGate {

    /** Why melee is off for the rest of the round, or {@link #NONE}. */
    public enum Veto { NONE, SENTRY, FAULT }

    /** Far more sentries than any battle holds; RES-2. */
    static final int MAX_SENTRIES = 32;

    private final Set<String> sentries = new LinkedHashSet<>();
    private Veto veto = Veto.NONE;

    public void newRound() {
        veto = Veto.NONE;
    }

    /** The radar saw {@code name}, which the engine marked a sentry: melee is off this round. */
    public void sentryScanned(String name) {
        if (sentries.size() < MAX_SENTRIES) sentries.add(name);
        if (veto == Veto.NONE) veto = Veto.SENTRY;
    }

    /** The melee subsystems threw: melee is off this round (GATE-4). */
    public void meleeFailed() {
        veto = Veto.FAULT;
    }

    /** Whether {@code name} is a sentry seen this battle. */
    public boolean isSentry(String name) {
        return name != null && sentries.contains(name);
    }

    public boolean sentriesSeen() {
        return !sentries.isEmpty();
    }

    public Veto veto() {
        return veto;
    }

    /**
     * This tick's posture, from the opponents alive ({@code others}, sentries excluded) and
     * the sentries alive.
     */
    public Posture evaluate(int others, int numSentries) {
        return others >= 2 && numSentries == 0 && veto == Veto.NONE ? Posture.MELEE : Posture.DUEL;
    }
}
