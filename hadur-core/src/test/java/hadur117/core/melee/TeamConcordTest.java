package hadur117.core.melee;

import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyTracker;
import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.Point2D;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TeamConcordTest {

    @Test
    @Tag("TMODE-33")
    @DisplayName("TMODE-33: the team brain drops the pack hunt and its ranges, and plays FINISH")
    void modes() {
        Set<TeamModes.Mode> m = new TeamConcord().modes(TeamModes.of(TeamModes.Mode.MATEFIRE, TeamModes.Mode.HUNT,
            TeamModes.Mode.FAR, TeamModes.Mode.PATH, TeamModes.Mode.DODGE, TeamModes.Mode.CONCORD));
        assertEquals(TeamModes.of(TeamModes.Mode.MATEFIRE, TeamModes.Mode.PATH, TeamModes.Mode.DODGE,
            TeamModes.Mode.CONCORD, TeamModes.Mode.FINISH), m);
    }

    @Test
    @Tag("TMODE-33")
    @DisplayName("TMODE-33: GANG plays once 200 member-turns show 4% or more ganged, and not before")
    void gangWatch() {
        EnemyTracker tracker = new EnemyTracker();
        scan(tracker, "a", 100, 100, 100, 0);
        scan(tracker, "b", 150, 100, 100, 0);
        List<EnemyInfo> enemies = tracker.alive();
        Point2D.Double ganged = pt(120, 120), free = pt(800, 800);
        List<Point2D.Double> mates = List.of(free, free, free);

        TeamConcord spread = new TeamConcord();
        for (int t = 0; t < 100; t++) spread.watch(free, mates, enemies, 0);
        assertFalse(spread.gangOn());
        assertFalse(spread.modes(TeamModes.of(TeamModes.Mode.CONCORD)).contains(TeamModes.Mode.GANG));

        TeamConcord gang = new TeamConcord();
        // 4 member-turns a tick, one of them ganged: 25%, but under 200 turns until tick 50.
        for (int t = 0; t < 49; t++) gang.watch(ganged, mates, enemies, 0);
        assertFalse(gang.gangOn());
        gang.watch(ganged, mates, enemies, 0);
        assertTrue(gang.gangOn());
        assertTrue(gang.modes(TeamModes.of(TeamModes.Mode.CONCORD)).contains(TeamModes.Mode.GANG));
    }

    @Test
    @Tag("TMODE-33")
    @DisplayName("TMODE-33: each enemy belongs to the member nearest it, a tie to Hadur")
    void groups() {
        EnemyTracker tracker = new EnemyTracker();
        scan(tracker, "near", 150, 100, 100, 0);
        scan(tracker, "mate", 850, 100, 100, 0);
        scan(tracker, "tie", 500, 100, 100, 0);
        List<EnemyInfo> mine = TeamConcord.group(pt(100, 100), List.of(pt(900, 100)), tracker.alive());
        assertEquals(2, mine.size());
        assertTrue(mine.stream().anyMatch(e -> e.name.equals("near")));
        assertTrue(mine.stream().anyMatch(e -> e.name.equals("tie")));
    }

    @Test
    @Tag("TMODE-33")
    @DisplayName("TMODE-33: the radar turns toward the stalest enemy of its group, and spins while any is overdue")
    void groupRadar() {
        EnemyTracker tracker = new EnemyTracker();
        scan(tracker, "west", 100, 300, 100, 4);
        scan(tracker, "east", 700, 300, 100, 6);
        MeleeRadar radar = new MeleeRadar();
        // Facing north, the group's stalest enemy to the west: turn left.
        assertEquals(Double.NEGATIVE_INFINITY, radar.groupTurn(pt(400, 300), 0, tracker, 2, null, 6,
            List.of(tracker.get("west"), tracker.get("east"))));
        // Only the east enemy is ours: turn right.
        assertEquals(Double.POSITIVE_INFINITY, new MeleeRadar().groupTurn(pt(400, 300), 0, tracker, 2, null, 6,
            List.of(tracker.get("east"))));
        // The west enemy's scan is eight ticks old: everyone sweeps.
        MeleeRadar late = new MeleeRadar();
        assertEquals(Double.POSITIVE_INFINITY, late.groupTurn(pt(400, 300), 0, tracker, 2, null, 12,
            List.of(tracker.get("west"))));
        // An empty group sweeps too.
        assertEquals(Double.POSITIVE_INFINITY, new MeleeRadar().groupTurn(pt(400, 300), 0, tracker, 2, null, 6, List.of()));
    }

    @Test
    @Tag("TMODE-33")
    @DisplayName("TMODE-33: an enemy's risk falls by 1/(1 + robots nearer it), teammates counted")
    void concordFactor() {
        EnemyTracker tracker = new EnemyTracker();
        scan(tracker, "e", 500, 500, 100, 10);
        scan(tracker, "o", 500, 560, 100, 10);
        List<EnemyInfo> enemies = tracker.alive();
        MinimumRiskMovement.View alone = new MinimumRiskMovement.View(pt(500, 800), 100, 10, 2, enemies,
            List.of(), MeleeStrategy.Plan.normal());
        int i = enemies.indexOf(tracker.get("e"));
        // The other enemy stands between e and the point: half.
        assertEquals(0.5, MinimumRiskMovement.concordFactor(pt(500, 800), tracker.get("e"), alone, i), 1e-9);
        // Nothing nearer e than a point beside it: one.
        assertEquals(1.0, MinimumRiskMovement.concordFactor(pt(540, 500), tracker.get("e"), alone, i), 1e-9);
    }
}
