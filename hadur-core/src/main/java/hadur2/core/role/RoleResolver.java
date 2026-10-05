package hadur2.core.role;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Picks the role that drives each tick (ROLE-2 to ROLE-4), in place of the melee extension's
 * posture gate. The choice itself is one pure function, {@link #resolve}: the first row that
 * holds wins.
 *
 * <ol>
 * <li>Team: the Team role is built and not vetoed, a teammate and an enemy are alive, and
 *     neither Melee nor Duel has driven this round. Until the Team strand exists the Team
 *     role is never built, so this row never holds.</li>
 * <li>Melee (ROLE-3): the charter has the Melee role, it has not been vetoed this round, two
 *     or more enemies are alive, no sentry is, and the Duel has not driven this round.</li>
 * <li>Duel: otherwise. The Duel is the floor and is never vetoed.</li>
 * </ol>
 *
 * <p>Once a role has driven in a round no role above it drives again that round (ROLE-4):
 * that latch, not the counts, makes the role move only down, at most twice a round. Only a
 * new round clears it, and a tick the Guard covers leaves it as it stands, because the core
 * records the role that drove only when the tick completes ({@link #drove}).</p>
 *
 * <p>The instance keeps what the function reads across ticks: the round's Melee veto (a
 * scanned sentry, GATE-3, or a melee fault, GATE-4), the latch, and the sentry names, which
 * are remembered for the whole battle so a sentry is never taken for an opponent once seen
 * (GATE-5). Robocode already leaves sentries out of the count of others.</p>
 */
public final class RoleResolver {

    /** Far more sentries than any battle holds; RES-2. */
    static final int MAX_SENTRIES = 32;

    private final Charter charter;
    private final Set<String> sentries = new LinkedHashSet<>();
    private Veto veto = Veto.NONE;
    /** The lowest role that has driven this round, or null before the round's first tick. */
    private RoleId driven;

    /** A resolver for a battle of {@code charter} (ROLE-1). */
    public RoleResolver(Charter charter) {
        this.charter = charter;
    }

    /** The battle's charter. */
    public Charter charter() {
        return charter;
    }

    /** A new round: the veto and the latch go; the sentry names stay. */
    public void newRound() {
        veto = Veto.NONE;
        driven = null;
    }

    /** The radar saw {@code name}, which the engine marked a sentry: Melee is off this round. */
    public void sentryScanned(String name) {
        if (sentries.size() < MAX_SENTRIES) sentries.add(name);
        if (veto == Veto.NONE) veto = Veto.SENTRY;
    }

    /** The Melee role threw: it is off this round (GATE-4). */
    public void meleeFailed() {
        veto = Veto.FAULT;
    }

    /** Whether {@code name} is a sentry seen this battle. */
    public boolean isSentry(String name) {
        return name != null && sentries.contains(name);
    }

    /** Whether any sentry has been seen this battle. */
    public boolean sentriesSeen() {
        return !sentries.isEmpty();
    }

    /** Why the Melee role is off for the rest of the round, if it is. */
    public Veto veto() {
        return veto;
    }

    /** The lowest role that has driven this round, or null before any has. */
    public RoleId driven() {
        return driven;
    }

    /**
     * The role completed a tick: the latch moves down to it if it is lower (ROLE-4).
     *
     * @param role the role that drove the tick
     */
    public void drove(RoleId role) {
        if (driven == null || driven.above(role)) driven = role;
    }

    /**
     * This tick's role (ROLE-2), from the counts alive. Off a team the enemies are the
     * engine's count of others.
     *
     * @param enemies enemies alive
     * @param teammates teammates alive
     * @param sentriesAlive sentries alive
     * @return the role that drives this tick
     */
    public RoleId resolve(int enemies, int teammates, int sentriesAlive) {
        return resolve(charter, enemies, teammates, sentriesAlive, veto, false, driven);
    }

    /**
     * ROLE-2: the role, from the charter, the counts of enemies, teammates and sentries
     * alive, the round's vetoes and the lowest role that has driven this round, and from
     * nothing else. Always answers; never answers a role above {@code driven}.
     *
     * @param charter the battle's charter
     * @param enemies enemies alive
     * @param teammates teammates alive
     * @param sentriesAlive sentries alive
     * @param meleeVeto the round's Melee veto
     * @param teamVetoed whether the Team role has faulted this round
     * @param driven the lowest role that has driven this round, or null
     * @return the role that drives this tick
     */
    public static RoleId resolve(Charter charter, int enemies, int teammates, int sentriesAlive,
                                 Veto meleeVeto, boolean teamVetoed, RoleId driven) {
        // Row 1: the Team role is built only by the Team plan; no strand holds it yet.
        if (TEAM_BUILT && charter.has(RoleId.TEAM) && !teamVetoed && teammates > 0 && enemies > 0
                && (driven == null || driven == RoleId.TEAM)) {
            return RoleId.TEAM;
        }
        // Row 2, ROLE-3.
        if (charter.has(RoleId.MELEE) && meleeVeto == Veto.NONE && enemies >= 2
                && sentriesAlive == 0 && driven != RoleId.DUEL) {
            return RoleId.MELEE;
        }
        // Row 3: the floor.
        return RoleId.DUEL;
    }

    /** Whether a Team strand exists to build; false until the Team plan adds one. */
    static final boolean TEAM_BUILT = false;

    /** The melee extension's two postures, for the core's {@code posture()} accessor. */
    public static Posture posture(RoleId role) {
        return role == RoleId.MELEE ? Posture.MELEE : Posture.DUEL;
    }
}
