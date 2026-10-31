package hadur117.core.melee;

import hadur117.core.world.EnemyInfo;
import java.awt.geom.Point2D;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/**
 * TMODE-33, the team brain after Ogi's design, written our own way: the parts of
 * {@link TeamModes.Mode#CONCORD} that keep state across ticks.
 *
 * <ul>
 * <li><b>Modes.</b> The pack hunt and its range variants stand down; FINISH plays; GANG plays
 *     once this battle has shown ganging ({@link #gangOn}).</li>
 * <li><b>Gang watch.</b> Every tick, each member in view (Hadur and its teammates) counts as one
 *     member-turn, ganged with {@link MinimumRiskMovement#GANG_SIZE} or more enemies within
 *     {@link MinimumRiskMovement#GANG_RANGE}. After {@link #GANG_TURNS} member-turns, GANG plays
 *     while {@link #GANG_SHARE} or more of them were ganged. A team that spreads out never turns
 *     it on; one that gangs up does within a round. Kept for the battle.</li>
 * <li><b>Radar groups.</b> Each enemy belongs to the member nearest it, so the members split the
 *     field and each sweeps only its own group ({@link #group}).</li>
 * </ul>
 *
 * <p>Team-only, like every mode: the controller reaches it only with a living teammate.</p>
 */
final class TeamConcord {

    /**
     * Its parts; the {@code tmconcord} ablation's variants change one to weigh it. The first cloud
     * smoke (top 9, 2 seeds) lost 4.8 share points with all on, own hits up 38%: the group radar
     * and the hunt standing down raised own fire against Ogi, so both are off for the second.
     */
    static final boolean MOVE = true, RADAR = false, GUN = true;
    /** Finer parts, for the same weighing: the hunt standing down, the risk's robot count, the gun's power and its pooling. */
    static final boolean NO_HUNT = false, RISK = true, POWER = true, POOL = true;

    /** Member-turns the gang watch needs before it may turn GANG on. */
    static final int GANG_TURNS = 200;
    /** The share of ganged member-turns from which GANG plays. */
    static final double GANG_SHARE = 0.04;

    private long turns, ganged;

    /** The modes this tick: {@code table}'s without the pack hunt, with FINISH, and GANG once the watch says so. */
    Set<TeamModes.Mode> modes(Set<TeamModes.Mode> table) {
        EnumSet<TeamModes.Mode> m = table.isEmpty() ? EnumSet.noneOf(TeamModes.Mode.class) : EnumSet.copyOf(table);
        if (!MOVE) return m;
        if (NO_HUNT) {
            m.remove(TeamModes.Mode.HUNT);
            m.remove(TeamModes.Mode.PACK);
        }
        m.remove(TeamModes.Mode.FAR);
        m.remove(TeamModes.Mode.FARTHER);
        m.remove(TeamModes.Mode.NEAR);
        m.add(TeamModes.Mode.FINISH);
        if (gangOn()) m.add(TeamModes.Mode.GANG);
        return m;
    }

    /** Counts this tick's member-turns: Hadur at {@code me} and each teammate at {@code mates}. */
    void watch(Point2D.Double me, List<Point2D.Double> mates, List<EnemyInfo> enemies, long now) {
        count(me, enemies, now);
        for (Point2D.Double m : mates) count(m, enemies, now);
    }

    private void count(Point2D.Double p, List<EnemyInfo> enemies, long now) {
        turns++;
        if (MinimumRiskMovement.enemiesNear(p, enemies, now) >= MinimumRiskMovement.GANG_SIZE) ganged++;
    }

    /** Whether the battle so far shows ganging. */
    boolean gangOn() {
        return turns >= GANG_TURNS && ganged >= GANG_SHARE * turns;
    }

    /**
     * The enemies seen lately whose nearest member, of Hadur at {@code me} and {@code mates}, is
     * Hadur: the group its radar keeps fresh. A tie goes to Hadur.
     */
    static List<EnemyInfo> group(Point2D.Double me, List<Point2D.Double> mates, List<EnemyInfo> enemies) {
        List<EnemyInfo> mine = new java.util.ArrayList<>();
        for (EnemyInfo e : enemies) {
            if (e.location == null) continue;
            double d = me.distance(e.location);
            boolean nearest = true;
            for (Point2D.Double m : mates) {
                if (m.distance(e.location) < d) {
                    nearest = false;
                    break;
                }
            }
            if (nearest) mine.add(e);
        }
        return mine;
    }
}
