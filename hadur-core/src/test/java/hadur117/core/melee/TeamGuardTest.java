package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.pt;
import static hadur117.core.melee.Fixtures.scan;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyShot;
import hadur117.core.world.EnemyTracker;
import hadur117.core.world.Roster;
import java.awt.geom.Point2D;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** T7: the team safety guard last enemy (TMODE-47). */
class TeamGuardTest {

    private static final Point2D.Double ME = pt(500, 500);
    private static final long NOW = 100;

    private static List<Roster.Mate> mates(Point2D.Double... at) {
        List<String> names = new java.util.ArrayList<>();
        for (int i = 0; i < at.length; i++) names.add("m" + i);
        Roster r = new Roster(names, at.length + 2);
        r.newRound();
        for (int i = 0; i < at.length; i++) r.scanned("m" + i, at[i].x, at[i].y, 0, 0, NOW);
        return r.living(NOW);
    }

    /** One still enemy 200 px north of Hadur. */
    private static List<EnemyInfo> north(double energy) {
        EnemyTracker t = new EnemyTracker(Fixtures.field(1000, 1000));
        scan(t, "e 1.0", 500, 700, energy, NOW);
        return t.alive();
    }

    @Test
    @Tag("TMODE-47")
    @DisplayName("TMODE-47: under LAST, one enemy left by the filtered count draws the member to it at FINISH's floor; never with two left, a stale scan or low energy")
    void lastPull() {
        Set<TeamModes.Mode> last = EnumSet.of(TeamModes.Mode.HUNT, TeamModes.Mode.LAST);
        List<EnemyInfo> one = north(100);
        List<Roster.Mate> m = mates(pt(850, 150));
        TeamRisk.Pull p = TeamRisk.pull(ME, 100, 1, one, NOW, m, last);
        assertNotNull(p);
        assertEquals(one.get(0).location, p.at);
        assertEquals(TeamRisk.FINISH_FLOOR, p.floor, 0);
        TeamRisk.Pull hunt = TeamRisk.pull(ME, 100, 1, one, NOW, m, EnumSet.of(TeamModes.Mode.HUNT));
        assertFalse(hunt != null && hunt.floor == TeamRisk.FINISH_FLOOR && hunt.at.equals(one.get(0).location), "without LAST no finish pull");
        assertNull(TeamRisk.pull(ME, 100, 1, one, NOW + 1000, m, EnumSet.of(TeamModes.Mode.LAST)), "stale");
        assertNull(TeamRisk.pull(ME, 10, 1, one, NOW, m, EnumSet.of(TeamModes.Mode.LAST)), "low energy");
        assertNull(TeamRisk.pull(ME, 100, 2, one, NOW, m, EnumSet.of(TeamModes.Mode.LAST)), "two left");
    }

    @Test
    @Tag("TMODE-47")
    @DisplayName("TMODE-47: LAST is in the default and on every shipped entry (PR #790)")
    void shipped() {
        assertTrue(TeamModes.FORCE_LAST);
        assertTrue(TeamModes.DEFAULT.contains(TeamModes.Mode.LAST));
        for (Map.Entry<String, Set<TeamModes.Mode>> e : TeamModes.TABLE.entrySet()) {
            assertTrue(e.getValue().contains(TeamModes.Mode.LAST), e.getKey());
        }
    }
}
