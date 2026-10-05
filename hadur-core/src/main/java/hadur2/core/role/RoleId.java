package hadur2.core.role;

/**
 * The strand driving a tick. The order is the ladder, top first: within a round the role
 * only moves down it (ROLE-4), and the Duel is its floor.
 */
public enum RoleId {
    /** Teammates' tactics; built only by the Team plan. */
    TEAM,
    /** The melee strand: sweep radar, minimum-risk movement, the field gun. */
    MELEE,
    /** The duel strand: wave surfing, the duel gun, the lock radar, opponent memory. */
    DUEL;

    /** Whether this role sits above {@code other} on the ladder. */
    public boolean above(RoleId other) {
        return ordinal() < other.ordinal();
    }
}
