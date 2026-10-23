package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.field;
import static hadur2.core.melee.Fixtures.pt;
import static hadur2.core.melee.Fixtures.scan;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.RobotState;
import hadur2.core.model.RobotStateLog;
import hadur2.core.world.EnemyInfo;
import hadur2.core.world.EnemyShot;
import hadur2.core.world.EnemyTracker;
import hadur2.core.world.Roster;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** T7: the team's mode table and its modes (TMODE-1 to TMODE-4). */
class TeamModesTest {

    private static final Set<TeamModes.Mode> ALL = EnumSet.allOf(TeamModes.Mode.class);

    /** Living teammates at the points given, known on tick 100. */
    private static List<Roster.Mate> mates(Point2D.Double... at) {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < at.length; i++) names.add("m" + i);
        Roster r = new Roster(names, at.length + 2);
        r.newRound();
        for (int i = 0; i < at.length; i++) r.scanned("m" + i, at[i].x, at[i].y, 0, 0, 100);
        return r.living(100);
    }

    private static EnemyTracker enemies(Point2D.Double... at) {
        EnemyTracker t = new EnemyTracker(field(1200, 1200));
        for (int i = 0; i < at.length; i++) scan(t, "e" + i + " 1.0", at[i].x, at[i].y, 100, 100);
        return t;
    }

    @Test
    @Tag("TMODE-1")
    @DisplayName("TMODE-1: a team's modes are its first member's entry, by class without version or duplicate marker; else the default, none in the shipped build")
    void tableLookup() {
        EnemyTracker t = new EnemyTracker(field(1200, 1200));
        scan(t, "x.Other 2.0 (1)", 100, 100, 100, 1);
        scan(t, "cz.libors.Ogi 1.0 (2)", 200, 200, 100, 1);
        Set<TeamModes.Mode> gang = EnumSet.of(TeamModes.Mode.GANG);
        Map<String, Set<TeamModes.Mode>> table = Map.of("cz.libors.Ogi", gang);
        assertSame(gang, TeamModes.against(t.alive(), table, TeamModes.NONE));
        assertSame(TeamModes.NONE, TeamModes.against(List.of(t.get("x.Other 2.0 (1)")), table, TeamModes.NONE));
        assertTrue(TeamModes.DEFAULT.isEmpty());
        assertTrue(TeamModes.TABLE.isEmpty());
    }

    @Test
    @Tag("TMODE-2")
    @DisplayName("TMODE-2: a shot weighs 1/(1+k)^2 for the k teammates nearer its shooter than Hadur")
    void softWeight() {
        EnemyShot shot = new EnemyShot("e", pt(600, 200), 10, 2.0);
        Point2D.Double me = pt(600, 600);
        assertEquals(1.0, MinimumRiskMovement.softWeight(shot, me, List.of()), 0);
        assertEquals(1.0, MinimumRiskMovement.softWeight(shot, me, List.of(pt(600, 1000))), 0);
        assertEquals(0.25, MinimumRiskMovement.softWeight(shot, me, List.of(pt(600, 300), pt(600, 1000))), 0);
        assertEquals(1.0 / 9, MinimumRiskMovement.softWeight(shot, me, List.of(pt(600, 300), pt(500, 300))), 1e-12);
    }

    private static RobotStateLog path() {
        RobotStateLog log = new RobotStateLog();
        for (long t = 0; t <= 12; t++) {
            log.addState(RobotState.newBuilder().setLocation(pt(600, 600)).setHeading(Math.PI / 2)
                .setVelocity(8).setTime(t).build());
        }
        return log;
    }

    @Test
    @Tag("TMODE-2")
    @DisplayName("TMODE-2: with SOFT the shot's head-on and linear bullets carry its weight; under the floor it makes none")
    void softBullets() {
        EnemyShot shot = new EnemyShot("e", pt(600, 200), 10, 2.0);
        TeamDanger danger = new TeamDanger(field(1200, 1200));
        MinimumRiskMovement one = new MinimumRiskMovement(field(1200, 1200));
        one.newRound();
        one.updateBullets(List.of(shot), path(), pt(600, 600), 12, List.of(pt(600, 300)), danger, false, false, true);
        assertEquals(2, one.bullets().size());
        for (VirtualBullet b : one.bullets()) assertEquals(0.25, b.weight, 0);

        MinimumRiskMovement three = new MinimumRiskMovement(field(1200, 1200));
        three.newRound();
        three.updateBullets(List.of(shot), path(), pt(600, 600), 12,
            List.of(pt(600, 300), pt(500, 300), pt(700, 300)), danger, false, false, true);
        assertTrue(three.bullets().isEmpty());
    }

    @Test
    @Tag("TMODE-3")
    @DisplayName("TMODE-3: with two enemies within 250 px Hadur is drawn to its nearest teammate; else to a ganged teammate, to 300 px; else nothing")
    void gangPull() {
        Set<TeamModes.Mode> gang = EnumSet.of(TeamModes.Mode.GANG);
        Point2D.Double me = pt(600, 600);
        // Ganged: two enemies near Hadur.
        List<EnemyInfo> near = enemies(pt(700, 600), pt(600, 750)).alive();
        MinimumRiskMovement.Pull p = MinimumRiskMovement.pull(me, 100, 3, near, 100,
            mates(pt(200, 600), pt(1000, 1000)), gang);
        assertEquals(pt(200, 600), p.at);
        assertEquals(0, p.floor, 0);
        // Not ganged, a teammate is: help it, to HELP_FLOOR.
        List<EnemyInfo> onMate = enemies(pt(200, 700), pt(300, 600)).alive();
        p = MinimumRiskMovement.pull(me, 100, 3, onMate, 100, mates(pt(200, 600), pt(1000, 1000)), gang);
        assertEquals(pt(200, 600), p.at);
        assertEquals(MinimumRiskMovement.HELP_FLOOR, p.floor, 0);
        // Nobody ganged.
        List<EnemyInfo> apart = enemies(pt(100, 1100), pt(1100, 100)).alive();
        assertNull(MinimumRiskMovement.pull(me, 100, 3, apart, 100, mates(pt(200, 600)), gang));
        // Without the mode, nothing.
        assertNull(MinimumRiskMovement.pull(me, 100, 3, near, 100, mates(pt(200, 600)), TeamModes.NONE));
    }

    @Test
    @Tag("TMODE-3")
    @DisplayName("TMODE-3: the pull scales the risk by e^(strength (to - from) / 100), flat inside its floor")
    void pullFactor() {
        MinimumRiskMovement.Pull p = new MinimumRiskMovement.Pull(pt(0, 0), 300, 0.5);
        Point2D.Double me = pt(500, 0);
        assertEquals(Math.exp(-0.5), p.factor(me, pt(400, 0)), 1e-12);
        assertEquals(Math.exp(0.5), p.factor(me, pt(600, 0)), 1e-12);
        assertEquals(Math.exp(-1.0), p.factor(me, pt(100, 0)), 1e-12);
    }

    @Test
    @Tag("TMODE-4")
    @DisplayName("TMODE-4: with FINISH, one enemy left by the engine's count, seen lately, and 30 energy, Hadur is drawn to it, to 350 px")
    void finishPull() {
        Set<TeamModes.Mode> finish = EnumSet.of(TeamModes.Mode.FINISH);
        List<EnemyInfo> last = enemies(pt(1000, 600)).alive();
        MinimumRiskMovement.Pull p = MinimumRiskMovement.pull(pt(600, 600), 30, 2, last, 100, mates(pt(200, 600)), finish);
        assertEquals(pt(1000, 600), p.at);
        assertEquals(MinimumRiskMovement.FINISH_FLOOR, p.floor, 0);
        assertNull(MinimumRiskMovement.pull(pt(600, 600), 29.9, 2, last, 100, mates(pt(200, 600)), finish));
        assertNull(MinimumRiskMovement.pull(pt(600, 600), 100, 3, enemies(pt(1000, 600), pt(100, 100)).alive(), 100,
            mates(pt(200, 600)), finish));
        // Early in a round only one enemy is scanned, but the engine counts more alive.
        assertNull(MinimumRiskMovement.pull(pt(600, 600), 100, 4, last, 100, mates(pt(200, 600)), finish));
        // The last enemy's sighting has gone stale.
        assertNull(MinimumRiskMovement.pull(pt(600, 600), 100, 2, last, 100 + MinimumRiskMovement.CAP_MAX_AGE,
            mates(pt(200, 600)), finish));
    }

    @Test
    @Tag("TMODE-3")
    @DisplayName("TMODE-3: a ganged member's destination moves toward its teammate")
    void gangedMovesToMate() {
        List<EnemyInfo> near = enemies(pt(700, 600), pt(650, 720)).alive();
        List<Roster.Mate> m = mates(pt(200, 600));
        MinimumRiskMovement plain = new MinimumRiskMovement(field(1200, 1200));
        plain.newRound();
        Point2D.Double a = plain.chooseDestination(pt(600, 600), 100, 3, near, 100, MeleeStrategy.Plan.normal(), m);
        MinimumRiskMovement ganged = new MinimumRiskMovement(field(1200, 1200));
        ganged.newRound();
        Point2D.Double b = ganged.chooseDestination(pt(600, 600), 100, 3, near, 100, MeleeStrategy.Plan.normal(), m,
            EnumSet.of(TeamModes.Mode.GANG));
        assertTrue(b.distance(200, 600) < a.distance(200, 600), a + " vs " + b);
    }

    @Test
    @Tag("TMODE-1")
    @DisplayName("TMODE-1: with no teammate every mode changes nothing: the same bullets and the same destination")
    void soloUntouched() {
        EnemyShot shot = new EnemyShot("e", pt(600, 200), 10, 2.0);
        MinimumRiskMovement alone = new MinimumRiskMovement(field(1200, 1200));
        alone.newRound();
        alone.updateBullets(List.of(shot), path(), pt(600, 600), 12, List.of(),
            new TeamDanger(field(1200, 1200)), true, true, true);
        MinimumRiskMovement solo = new MinimumRiskMovement(field(1200, 1200));
        solo.newRound();
        solo.updateBullets(List.of(shot), path(), pt(600, 600), 12);
        assertEquals(solo.bullets().size(), alone.bullets().size());
        for (int i = 0; i < solo.bullets().size(); i++) {
            assertEquals(solo.bullets().get(i).heading, alone.bullets().get(i).heading, 0.0);
            assertEquals(1.0, alone.bullets().get(i).weight, 0.0);
        }
        List<EnemyInfo> near = enemies(pt(700, 600), pt(650, 720)).alive();
        Point2D.Double d1 = alone.chooseDestination(pt(600, 600), 100, 2, near, 12, MeleeStrategy.Plan.normal(),
            List.of(), ALL);
        Point2D.Double d2 = solo.chooseDestination(pt(600, 600), 100, 2, near, 12, MeleeStrategy.Plan.normal());
        assertEquals(d2, d1);
    }

    @Test
    @Tag("TMODE-5")
    @DisplayName("TMODE-5: the prey is the fresh enemy nearest the team's centre, its energy weighing 1.2 a point")
    void preyChoice() {
        EnemyTracker t = new EnemyTracker(field(1200, 1200));
        scan(t, "near 1.0", 600, 800, 100, 100);
        scan(t, "weak 1.0", 600, 900, 10, 100);
        // near: 200 + 120 = 320; weak: 300 + 12 = 312.
        assertEquals("weak 1.0", MinimumRiskMovement.prey(pt(600, 600), t.alive(), 100).name);
        assertNull(MinimumRiskMovement.prey(pt(600, 600), t.alive(), 100 + MinimumRiskMovement.CAP_MAX_AGE));
    }

    @Test
    @Tag("TMODE-5")
    @DisplayName("TMODE-5: two members on one side of the prey take places either side of it, 70 degrees apart, at 0.74 of the nearer one's distance")
    void pincerSlots() {
        List<EnemyInfo> prey = enemies(pt(600, 900)).alive();
        Point2D.Double me = pt(550, 500);
        Point2D.Double mate = pt(650, 500);
        Point2D.Double a = MinimumRiskMovement.pincerSlot(me, prey, 100, mates(mate));
        Point2D.Double b = MinimumRiskMovement.pincerSlot(mate, prey, 100, mates(me));
        double r = 0.74 * pt(600, 900).distance(me);
        assertEquals(r, a.distance(600, 900), 1e-6);
        assertEquals(r, b.distance(600, 900), 1e-6);
        double ba = Math.atan2(a.x - 600, a.y - 900);
        double bb = Math.atan2(b.x - 600, b.y - 900);
        assertEquals(Math.toRadians(70), Math.abs(hadur2.core.physics.Angles.normalRelativeAngle(ba - bb)), 1e-9);
        // Each keeps its own side: Hadur, west of the mate, takes the western place.
        assertTrue(a.x < 600 && b.x > 600, a + " " + b);
    }

    @Test
    @Tag("TMODE-5")
    @DisplayName("TMODE-5: with PACK Hadur is drawn to its pincer place; ganged, GANG's regroup comes first; under 20 energy, no hunt")
    void packPull() {
        List<EnemyInfo> prey = enemies(pt(600, 1000)).alive();
        Set<TeamModes.Mode> pack = EnumSet.of(TeamModes.Mode.PACK);
        MinimumRiskMovement.Pull p = MinimumRiskMovement.pull(pt(600, 400), 100, 3, prey, 100, mates(pt(700, 400)), pack);
        assertEquals(MinimumRiskMovement.pincerSlot(pt(600, 400), prey, 100, mates(pt(700, 400))), p.at);
        assertEquals(MinimumRiskMovement.PACK_FLOOR, p.floor, 0);
        assertNull(MinimumRiskMovement.pull(pt(600, 400), 19, 3, prey, 100, mates(pt(700, 400)), pack));
        List<EnemyInfo> two = enemies(pt(700, 600), pt(600, 750)).alive();
        p = MinimumRiskMovement.pull(pt(600, 600), 100, 3, two, 100, mates(pt(200, 600)),
            EnumSet.of(TeamModes.Mode.PACK, TeamModes.Mode.GANG));
        assertEquals(pt(200, 600), p.at);
    }

    @Test
    @Tag("TMODE-6")
    @DisplayName("TMODE-6: with SCREEN a teammate nearer an enemy than a point keeps Hadur from counting as that enemy's closest robot")
    void screenedByMate() {
        List<EnemyInfo> one = enemies(pt(600, 900), pt(100, 100)).alive();
        MinimumRiskMovement move = new MinimumRiskMovement(field(1200, 1200));
        move.newRound();
        List<Roster.Mate> m = mates(pt(600, 1000));
        MinimumRiskMovement.View v = move.view(pt(600, 600), 100, 100, 4, one, MeleeStrategy.Plan.normal(), m);
        Point2D.Double p = pt(600, 700);
        double plain = move.enemyRisk(p, v, 0);
        MinimumRiskMovement.screen(v, 100);
        // The teammate is 100 px from the enemy, the point 200: Hadur there is no longer its closest.
        assertEquals(plain / MinimumRiskMovement.CLOSEST_FACTOR, move.enemyRisk(p, v, 0), 1e-9);
    }

    @Test
    @Tag("TMODE-7")
    @DisplayName("TMODE-7: pooled, every copy of an enemy class feeds and reads one log")
    void pooledLogs() {
        TeamDanger d = new TeamDanger(field(1200, 1200));
        d.pool(true);
        d.add(new TeamDanger.Sample("cz.libors.Ogi 1.0 (1)", new double[4], 0.5));
        d.add(new TeamDanger.Sample("cz.libors.Ogi 1.0 (3)", new double[4], 0.5));
        assertEquals(2, d.size("cz.libors.Ogi 1.0 (2)"));
        TeamDanger apart = new TeamDanger(field(1200, 1200));
        apart.add(new TeamDanger.Sample("cz.libors.Ogi 1.0 (1)", new double[4], 0.5));
        assertEquals(0, apart.size("cz.libors.Ogi 1.0 (2)"));
    }
}
