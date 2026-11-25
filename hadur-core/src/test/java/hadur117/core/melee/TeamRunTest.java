package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.pt;
import static hadur117.core.melee.Fixtures.scan;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

/** T7: the running dodge (TMODE-62): a member flies a curve round the next shot's source and keeps it. */
class TeamRunTest {

    private static final Point2D.Double ME = pt(600, 600);
    private static final Point2D.Double NORTH = pt(600, 1000);
    private final MeleeStrategy.Plan normal = MeleeStrategy.Plan.normal();

    private static List<Roster.Mate> mate(double x, double y) {
        Roster r = new Roster(List.of("m"), 3);
        r.newRound();
        r.scanned("m", x, y, 0, 0, 100);
        return r.living(100);
    }

    private static EnemyTracker enemies() {
        EnemyTracker t = new EnemyTracker(Fixtures.field(1200, 1200));
        scan(t, "north 1.0", 600, 1000, 100, 100);
        scan(t, "far 1.0", 150, 150, 100, 100);
        return t;
    }

    private static MinimumRiskMovement.Wave wave(Point2D.Double source, long fireTime, double heading) {
        return new MinimumRiskMovement.Wave(new EnemyShot("north 1.0", source, fireTime, 2.0), 1.0,
            new double[] {heading}, new double[] {1.0}, heading);
    }

    @Test
    @Tag("TMODE-62")
    @DisplayName("TMODE-62: the curves run round the source of the profile that arrives first, or the nearest enemy with none to come")
    void reference() {
        EnemyTracker t = enemies();
        assertEquals(NORTH, TeamRun.reference(ME, 100, List.of(), t.alive()));
        Point2D.Double west = pt(100, 600);
        // The western shot is older and lands first; a profile already past the member is not followed.
        List<MinimumRiskMovement.Wave> waves = List.of(wave(NORTH, 95, 0), wave(west, 70, 0), wave(pt(600, 700), 60, 0));
        assertEquals(west, TeamRun.reference(ME, 100, waves, t.alive()));
    }

    @Test
    @Tag("TMODE-62")
    @DisplayName("TMODE-62: six drive points 160 px off, three each way round the reference, leaning on, out and in; near a wall they swing inward")
    void candidates() {
        TeamRun run = new TeamRun(Fixtures.field(1200, 1200));
        List<Point2D.Double> c = run.candidates(ME, NORTH);
        assertEquals(6, c.size());
        for (Point2D.Double p : c) assertEquals(TeamRun.REACH, p.distance(ME), 1e-9);
        // Clockwise seen from above with the reference north: west first, then east.
        assertEquals(440, c.get(0).x, 1e-9);
        assertEquals(600, c.get(0).y, 1e-9);
        assertEquals(760, c.get(3).x, 1e-9);
        assertTrue(c.get(1).distance(NORTH) > c.get(0).distance(NORTH), "leaning out");
        assertTrue(c.get(2).distance(NORTH) < c.get(0).distance(NORTH), "leaning in");
        // Against the west wall, circling a reference to the east: every point stays clear of the wall.
        for (Point2D.Double p : run.candidates(pt(45, 100), pt(600, 600))) {
            assertTrue(p.x >= TeamRun.WALL && p.y >= TeamRun.WALL, p.toString());
        }
    }

    @Test
    @Tag("TMODE-62")
    @DisplayName("TMODE-62: the held curve is kept unless another scores better by the margin, a wider one while a profile is in the air")
    void commitment() {
        TeamRun run = new TeamRun(Fixtures.field(1200, 1200));
        double[] none = new double[6];
        assertEquals(0, run.pick(new double[] {0, 1, 2, 3, 4, 5}, none, false));
        // A little better elsewhere: kept, in the air or not.
        assertEquals(0, run.pick(new double[] {0.2, 0, 2, 3, 4, 5}, none, false));
        assertEquals(0, run.pick(new double[] {1.2, 0, 2, 3, 4, 5}, none, true));
        // The same lead with nothing in the air is enough to change.
        assertEquals(1, run.pick(new double[] {1.2, 0, 2, 3, 4, 5}, none, false));
        // The held curve is the one predicted to be hit: it is left, even in the air.
        assertEquals(3, run.pick(new double[] {1, 0, 1, 0.5, 1, 1}, new double[] {1, 1, 0.2, 0, 0.2, 0.2}, true));
        assertEquals(3, run.held());
        run.newRound();
        assertEquals(-1, run.held());
    }

    @Test
    @Tag("TMODE-62")
    @DisplayName("TMODE-62: under DODGE with RUN on a team the member turns away from the curve a shot profile covers and drives at full speed; without RUN, or off a team, the decision is today's")
    void runsFromTheProfile() {
        EnemyTracker t = enemies();
        Set<TeamModes.Mode> modes = EnumSet.of(TeamModes.Mode.DODGE, TeamModes.Mode.MOMENTUM, TeamModes.Mode.RUN);
        MinimumRiskMovement m = new MinimumRiskMovement(Fixtures.field(1200, 1200));
        m.newRound();
        // Driving west at full speed; the shot from the north is aimed where that curve will be when it lands.
        MinimumRiskMovement.View v = new MinimumRiskMovement.View(ME, 100, 100, 3, t.alive(), List.of(), normal, mate(900, 300));
        v.heading = 3 * Math.PI / 2;
        v.velocity = 8;
        v.fullSpeed = true;
        double heading = hadur117.core.physics.DiaUtils.absoluteBearing(NORTH, pt(470, 610));
        TeamRun run = new TeamRun(Fixtures.field(1200, 1200));
        Point2D.Double clear = run.choose(m, v, List.of(), t.alive());
        Point2D.Double dodged = run.choose(m, v, List.of(wave(NORTH, 90, heading)), t.alive());
        assertEquals(TeamRun.REACH, dodged.distance(ME), 1e-9);
        assertTrue(dodged.x > ME.x, "turns back east: " + dodged + " from " + clear);

        m.motion(3 * Math.PI / 2, 8);
        Point2D.Double to = m.chooseDestination(ME, 100, 3, t.alive(), 100, normal, mate(900, 300), modes);
        assertTrue(m.running());
        assertEquals(TeamRun.REACH, to.distance(ME), 1e-9);

        MinimumRiskMovement plain = new MinimumRiskMovement(Fixtures.field(1200, 1200));
        plain.newRound();
        plain.motion(3 * Math.PI / 2, 8);
        plain.chooseDestination(ME, 100, 3, t.alive(), 100, normal, mate(900, 300),
            EnumSet.of(TeamModes.Mode.DODGE, TeamModes.Mode.MOMENTUM));
        assertFalse(plain.running(), "without RUN");
        plain.chooseDestination(ME, 100, 2, t.alive(), 100, normal, List.of(), modes);
        assertFalse(plain.running(), "off a team");
    }

    @Test
    @Tag("TMODE-62")
    @DisplayName("TMODE-62: RUN is off in the shipped build: not in the default modes and in no table entry")
    void shippedOff() {
        assertFalse(TeamModes.FORCE_RUN);
        assertFalse(TeamModes.DEFAULT.contains(TeamModes.Mode.RUN));
        for (Map.Entry<String, Set<TeamModes.Mode>> entry : TeamModes.TABLE.entrySet()) {
            assertFalse(entry.getValue().contains(TeamModes.Mode.RUN), entry.getKey());
        }
    }
}
