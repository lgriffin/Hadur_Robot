package hadur2.core.role;

import hadur2.core.model.BattleFacts;
import java.util.EnumSet;
import java.util.Set;

/**
 * The kind of battle, fixed from the engine's facts before the first tick (ROLE-1): it names
 * the roles the battle can ever ask for. Never inferred from how the battle looks.
 */
public enum Charter {
    /** At most one opponent and no teammates: the RoboRumble's battle. */
    DUEL(EnumSet.of(RoleId.DUEL)),
    /** Two or more opponents and no teammates: the MeleeRumble's. */
    MELEE(EnumSet.of(RoleId.MELEE, RoleId.DUEL)),
    /** Teammates: the TeamRumble's. Until the Team strand exists it builds Melee and Duel. */
    TEAM(EnumSet.of(RoleId.TEAM, RoleId.MELEE, RoleId.DUEL));

    private final Set<RoleId> roles;

    Charter(Set<RoleId> roles) {
        this.roles = roles;
    }

    /** The roles this charter can ask for. */
    public Set<RoleId> roles() {
        return EnumSet.copyOf(roles);
    }

    /** Whether this charter can ask for {@code role}. */
    public boolean has(RoleId role) {
        return roles.contains(role);
    }

    /** ROLE-1: the charter the facts at tick 0 fix. */
    public static Charter of(BattleFacts facts) {
        if (!facts.teammates().isEmpty()) return TEAM;
        return facts.enemies() >= 2 ? MELEE : DUEL;
    }
}
