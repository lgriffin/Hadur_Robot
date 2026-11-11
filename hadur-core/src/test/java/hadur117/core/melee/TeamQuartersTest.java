package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.field;
import static hadur117.core.melee.Fixtures.pt;
import static hadur117.core.melee.Fixtures.scan;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.world.EnemyInfo;
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

/** T7: close quarters (TMODE-45): a member with an armed enemy closing inside 200 px gets room and speed to leave. */
class TeamQuartersTest {

    private static final Point2D.Double ME = pt(500, 500);
    private final MeleeStrategy.Plan normal = MeleeStrategy.Plan.normal();

    private static List<Roster.Mate> mate(double x, double y) {
        Roster r = new Roster(List.of("m"), 3);
        r.newRound();
        r.scanned("m", x, y, 0, 0, 100);
        return r.living(100);
    }

    /** One far enemy, and a second 100 px north of Hadur with the heading and velocity given (0 = north). */
    private static EnemyTracker field(double heading, double velocity, double energy) {
        EnemyTracker t = new EnemyTracker(Fixtures.field(1000, 1000));
        scan(t, "far 1.0", 150, 150, 100, 100);
        scan(t, "near 1.0", 500, 600, energy, heading, velocity, 100);
        return t;
    }

    private static MinimumRiskMovement mover() {
        MinimumRiskMovement m = new MinimumRiskMovement(Fixtures.field(1000, 1000));
        m.newRound();
        return m;
    }

    @Test
    @Tag("TMODE-45")
    @DisplayName("TMODE-45: the chaser is the nearest armed, freshly scanned enemy inside 200 px that drives toward the member; none when it stands, backs off, is disabled, stale or further out")
    void chaser() {
        // South is heading pi: the enemy north of Hadur drives at it.
        EnemyTracker t = field(Math.PI, 8, 100);
        assertSame(t.get("near 1.0"), MinimumRiskMovement.chaser(ME, t.alive(), 100));
        // Reversing along a heading that points away closes just the same.
        EnemyTracker reversing = field(0, -8, 100);
        assertSame(reversing.get("near 1.0"), MinimumRiskMovement.chaser(ME, reversing.alive(), 100));
        assertNull(MinimumRiskMovement.chaser(ME, field(Math.PI, 0, 100).alive(), 100), "standing");
        assertNull(MinimumRiskMovement.chaser(ME, field(0, 8, 100).alive(), 100), "leaving");
        assertNull(MinimumRiskMovement.chaser(ME, field(Math.PI, 8, 0).alive(), 100), "disabled");
        assertNull(MinimumRiskMovement.chaser(ME, t.alive(), 100 + EnemyInfo.STALE_TICKS), "stale");
        assertNull(MinimumRiskMovement.chaser(pt(500, 390), t.alive(), 100), "210 px off");
        EnemyTracker two = field(Math.PI, 8, 100);
        scan(two, "nearer 1.0", 560, 500, 100, -Math.PI / 2, 8, 100);
        assertSame(two.get("nearer 1.0"), MinimumRiskMovement.chaser(ME, two.alive(), 100));
    }

    @Test
    @Tag("TMODE-45")
    @DisplayName("TMODE-45: a destination pays 10 on the chaser, falling in a line to nothing at 150 px")
    void quartersRisk() {
        EnemyInfo e = field(Math.PI, 8, 100).get("near 1.0");
        assertEquals(MinimumRiskMovement.QUARTERS_K, MinimumRiskMovement.quartersRisk(pt(500, 600), e), 1e-12);
        assertEquals(MinimumRiskMovement.QUARTERS_K / 3, MinimumRiskMovement.quartersRisk(pt(500, 500), e), 1e-12);
        assertEquals(0, MinimumRiskMovement.quartersRisk(pt(500, 450), e), 0);
        assertEquals(0, MinimumRiskMovement.quartersRisk(pt(500, 300), e), 0);
    }

    @Test
    @Tag("TMODE-45")
    @DisplayName("TMODE-45: under QUARTERS a chaser no longer caps the ring and the member leaves it at full ring length; without the mode, or with nothing closing, the decision is today's")
    void destination() {
        EnemyTracker t = field(Math.PI, 8, 100);
        Set<TeamModes.Mode> base = EnumSet.of(TeamModes.Mode.MATEFIRE, TeamModes.Mode.HUNT);
        Set<TeamModes.Mode> quarters = EnumSet.of(TeamModes.Mode.MATEFIRE, TeamModes.Mode.HUNT, TeamModes.Mode.QUARTERS);
        List<Roster.Mate> mates = mate(850, 150);

        MinimumRiskMovement plain = mover();
        Point2D.Double today = plain.chooseDestination(ME, 100, 2, t.alive(), 100, normal, mates, base);
        assertFalse(plain.quartered());
        assertTrue(today.distance(ME) <= MinimumRiskMovement.NEAREST_FRACTION * 100 + 1e-9, "today's hop is capped at 80 px: " + today);

        MinimumRiskMovement q = mover();
        Point2D.Double away = q.chooseDestination(ME, 100, 2, t.alive(), 100, normal, mates, quarters);
        assertTrue(q.quartered());
        assertTrue(away.distance(ME) > MinimumRiskMovement.NEAREST_FRACTION * 100, "the ring is open: " + away);
        assertTrue(away.distance(t.get("near 1.0").location) >= MinimumRiskMovement.QUARTERS_KEEP, "clear of the chaser: " + away);

        // Nothing closing: QUARTERS changes nothing.
        EnemyTracker still = field(Math.PI, 0, 100);
        MinimumRiskMovement a = mover(), b = mover();
        assertEquals(a.chooseDestination(ME, 100, 2, still.alive(), 100, normal, mates, base),
            b.chooseDestination(ME, 100, 2, still.alive(), 100, normal, mates, quarters));
        assertFalse(b.quartered());

        // Off a team the mode is never read.
        MinimumRiskMovement alone = mover(), aloneQ = mover();
        assertEquals(alone.chooseDestination(ME, 100, 2, t.alive(), 100, normal, List.of(), base),
            aloneQ.chooseDestination(ME, 100, 2, t.alive(), 100, normal, List.of(), quarters));
        assertFalse(aloneQ.quartered());
    }

    @Test
    @Tag("TMODE-45")
    @DisplayName("TMODE-45: QUARTERS is in no shipped entry and not in the default: only a table entry or ablation tmquarters plays it")
    void notShipped() {
        assertFalse(TeamModes.FORCE_QUARTERS);
        assertFalse(TeamModes.DEFAULT.contains(TeamModes.Mode.QUARTERS));
        for (Map.Entry<String, Set<TeamModes.Mode>> entry : TeamModes.TABLE.entrySet()) {
            assertFalse(entry.getValue().contains(TeamModes.Mode.QUARTERS), entry.getKey());
        }
    }
}
