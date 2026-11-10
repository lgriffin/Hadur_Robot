package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.field;
import static hadur117.core.melee.Fixtures.pt;
import static hadur117.core.melee.Fixtures.scan;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyShot;
import hadur117.core.world.EnemyTracker;
import hadur117.core.world.Roster;
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
    @Tag("TMODE-12")
    @Tag("TMODE-14")
    @Tag("TMODE-28")
    @Tag("TMODE-30")
    @Tag("TMODE-34")
    @Tag("TMODE-35")
    @Tag("TMODE-42")
    @DisplayName("TMODE-1: a team's modes are its first member's entry, by class without version or duplicate marker; else the default, MATEFIRE, HUNT, PATH, DODGE, CONCORD and CLOSE in the shipped build (TMODE-12, TMODE-14, TMODE-28, TMODE-30, TMODE-34, TMODE-42), every named team plays PATH, DODGE unless it lost there (PR #465), and CONCORD unless it lost there (PR #538, TMODE-35)")
    void tableLookup() {
        EnemyTracker t = new EnemyTracker(field(1200, 1200));
        scan(t, "x.Other 2.0 (1)", 100, 100, 100, 1);
        scan(t, "cz.libors.Ogi 1.0 (2)", 200, 200, 100, 1);
        Set<TeamModes.Mode> gang = EnumSet.of(TeamModes.Mode.GANG);
        Map<String, Set<TeamModes.Mode>> table = Map.of("cz.libors.Ogi", gang);
        assertSame(gang, TeamModes.against(t.alive(), table, TeamModes.NONE));
        assertSame(TeamModes.NONE, TeamModes.against(List.of(t.get("x.Other 2.0 (1)")), table, TeamModes.NONE));
        assertEquals(EnumSet.of(TeamModes.Mode.MATEFIRE, TeamModes.Mode.HUNT, TeamModes.Mode.PATH, TeamModes.Mode.DODGE,
            TeamModes.Mode.CONCORD, TeamModes.Mode.CLOSE), TeamModes.DEFAULT);
        // The table names only the teams whose counters passed on fresh seeds (PR #370), and the two
        // teams DODGE lost to, confirmed on fresh seeds (PR #465).
        Set<String> dodgeOff = Set.of("ustimaw.Nightmare", "ustimaw.NigitmareDroid", "mn.nano.perceptual.Impact");
        // and the four teams CONCORD lost to, confirmed on fresh seeds (PR #538).
        Set<String> concordOff = Set.of("ustimaw.Nightmare", "ustimaw.NigitmareDroid", "cz.libors.Ogi", "mn.Combat",
            "cb.fire.Firestarter");
        assertEquals(java.util.Set.of("gh.nano.GrofGroupMember", "myl.micro.Troodon", "myl.micro.TroodonDroid",
                "ustimaw.Nightmare", "ustimaw.NigitmareDroid", "mn.nano.perceptual.Impact", "cz.libors.Ogi",
                "mn.Combat", "cb.fire.Firestarter"),
            TeamModes.TABLE.keySet());
        for (Map.Entry<String, Set<TeamModes.Mode>> entry : TeamModes.TABLE.entrySet()) {
            assertTrue(entry.getValue().contains(TeamModes.Mode.PATH), entry.getKey());
            assertEquals(!concordOff.contains(entry.getKey()), entry.getValue().contains(TeamModes.Mode.CONCORD), entry.getKey());
            assertEquals(!dodgeOff.contains(entry.getKey()), entry.getValue().contains(TeamModes.Mode.DODGE), entry.getKey());
        }
    }

    @Test
    @Tag("TMODE-2")
    @DisplayName("TMODE-2: a shot weighs 1/(1+k)^2 for the k teammates nearer its shooter than Hadur")
    void softWeight() {
        EnemyShot shot = new EnemyShot("e", pt(600, 200), 10, 2.0);
        Point2D.Double me = pt(600, 600);
        assertEquals(1.0, TeamRisk.softWeight(shot, me, List.of()), 0);
        assertEquals(1.0, TeamRisk.softWeight(shot, me, List.of(pt(600, 1000))), 0);
        assertEquals(0.25, TeamRisk.softWeight(shot, me, List.of(pt(600, 300), pt(600, 1000))), 0);
        assertEquals(1.0 / 9, TeamRisk.softWeight(shot, me, List.of(pt(600, 300), pt(500, 300))), 1e-12);
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
    @Tag("TMODE-3")
    @DisplayName("TMODE-3: with two enemies within 250 px Hadur is drawn to its nearest teammate; else to a ganged teammate, to 300 px; else nothing")
    void gangPull() {
        Set<TeamModes.Mode> gang = EnumSet.of(TeamModes.Mode.GANG);
        Point2D.Double me = pt(600, 600);
        // Ganged: two enemies near Hadur.
        List<EnemyInfo> near = enemies(pt(700, 600), pt(600, 750)).alive();
        TeamRisk.Pull p = TeamRisk.pull(me, 100, 3, near, 100,
            mates(pt(200, 600), pt(1000, 1000)), gang);
        assertEquals(pt(200, 600), p.at);
        assertEquals(0, p.floor, 0);
        // Not ganged, a teammate is: help it, to HELP_FLOOR.
        List<EnemyInfo> onMate = enemies(pt(200, 700), pt(300, 600)).alive();
        p = TeamRisk.pull(me, 100, 3, onMate, 100, mates(pt(200, 600), pt(1000, 1000)), gang);
        assertEquals(pt(200, 600), p.at);
        assertEquals(TeamRisk.HELP_FLOOR, p.floor, 0);
        // Nobody ganged.
        List<EnemyInfo> apart = enemies(pt(100, 1100), pt(1100, 100)).alive();
        assertNull(TeamRisk.pull(me, 100, 3, apart, 100, mates(pt(200, 600)), gang));
        // Without the mode, nothing.
        assertNull(TeamRisk.pull(me, 100, 3, near, 100, mates(pt(200, 600)), TeamModes.NONE));
    }

    @Test
    @Tag("TMODE-3")
    @DisplayName("TMODE-3: the pull scales the risk by e^(strength (to - from) / 100), flat inside its floor")
    void pullFactor() {
        TeamRisk.Pull p = new TeamRisk.Pull(pt(0, 0), 300, 0.5);
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
        TeamRisk.Pull p = TeamRisk.pull(pt(600, 600), 30, 2, last, 100, mates(pt(200, 600)), finish);
        assertEquals(pt(1000, 600), p.at);
        assertEquals(TeamRisk.FINISH_FLOOR, p.floor, 0);
        assertNull(TeamRisk.pull(pt(600, 600), 29.9, 2, last, 100, mates(pt(200, 600)), finish));
        assertNull(TeamRisk.pull(pt(600, 600), 100, 3, enemies(pt(1000, 600), pt(100, 100)).alive(), 100,
            mates(pt(200, 600)), finish));
        // Early in a round only one enemy is scanned, but the engine counts more alive.
        assertNull(TeamRisk.pull(pt(600, 600), 100, 4, last, 100, mates(pt(200, 600)), finish));
        // The last enemy's sighting has gone stale.
        assertNull(TeamRisk.pull(pt(600, 600), 100, 2, last, 100 + MinimumRiskMovement.CAP_MAX_AGE,
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
        alone.updateBullets(List.of(shot), path(), pt(600, 600), 12, List.of(), true, VirtualBullet.Aim.LINEAR);
        // TMODE-9: a teammate's bullet is kept but never read alone.
        alone.mateShot("m0", pt(600, 500), 11, 0, 3.0);
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
    @Tag("TMODE-13")
    @DisplayName("TMODE-13: members take the enemy of least (distance + 1.2 energy) squared, a fourth on one enemy costing 1.6 times")
    void huntAssignment() {
        List<EnemyInfo> two = enemies(pt(600, 800), pt(600, 350)).alive();
        List<Point2D.Double> pack = new ArrayList<>();
        for (int i = 0; i < 5; i++) pack.add(pt(600, 600));
        // e0: (200 + 120)^2 = 102,400; e1: (250 + 120)^2 = 136,900. Three take e0; then e0 costs
        // 163,840 and the last two take e1.
        assertArrayEquals(new int[] {0, 0, 0, 1, 1}, TeamRisk.huntAssign(pack, two, 100));
        assertArrayEquals(new int[] {-1, -1, -1, -1, -1},
            TeamRisk.huntAssign(pack, two, 100 + MinimumRiskMovement.CAP_MAX_AGE));
    }

    @Test
    @Tag("TMODE-13")
    @DisplayName("TMODE-13: a member's place is 350 px from its prey whatever its distance, and members on one prey take places either side")
    void huntSlots() {
        List<EnemyInfo> prey = enemies(pt(600, 900)).alive();
        // Hadur sorts after m0 and holds the eastern place; the mate the western.
        Point2D.Double me = pt(650, 300);
        Point2D.Double mate = pt(550, 300);
        Point2D.Double a = TeamRisk.huntSlot(me, "n", prey, 100, mates(mate));
        assertEquals(TeamRisk.HUNT_RADIUS, a.distance(600, 900), 1e-6);
        assertTrue(a.x > 600, a.toString());
        // Closer in, the radius does not shrink.
        Point2D.Double near = TeamRisk.huntSlot(pt(620, 750), "n", prey, 100, mates(pt(580, 750)));
        assertEquals(TeamRisk.HUNT_RADIUS, near.distance(600, 900), 1e-6);
        // On one ray from the prey, name order breaks the tie: the two take mirrored places.
        Point2D.Double after = TeamRisk.huntSlot(pt(600, 500), "n", prey, 100, mates(pt(600, 300)));
        Point2D.Double before = TeamRisk.huntSlot(pt(600, 500), "a", prey, 100, mates(pt(600, 300)));
        assertEquals(1200, after.x + before.x, 1e-6);
        assertTrue(Math.abs(after.x - before.x) > 100, after + " " + before);
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
        // Samples logged before the switch flips are not lost either way.
        apart.pool(true);
        assertEquals(1, apart.size("cz.libors.Ogi 1.0 (2)"));
        d.pool(false);
        assertEquals(1, d.size("cz.libors.Ogi 1.0 (1)"));
    }

    @Test
    @Tag("TMODE-9")
    @DisplayName("TMODE-9: with MATEFIRE a teammate's bullet in flight adds danger on its line, and is dropped once past")
    void mateFire() {
        List<EnemyInfo> far = enemies(pt(100, 1100)).alive();
        MinimumRiskMovement move = new MinimumRiskMovement(field(1200, 1200));
        move.newRound();
        // A teammate at (600, 300) fired north (heading 0) at tick 75 at 11 px a tick: at (600, 575) on tick 100.
        move.mateShot("m0", pt(600, 300), 75, 0, 3.0);
        List<Roster.Mate> m = mates(pt(600, 300));
        MinimumRiskMovement.View plain = move.view(pt(560, 600), 100, 100, 3, far, MeleeStrategy.Plan.normal(), m);
        MinimumRiskMovement.View fire = move.view(pt(560, 600), 100, 100, 3, far, MeleeStrategy.Plan.normal(), m);
        fire.mateBullets = move.mateBullets(pt(560, 600), 100);
        assertEquals(1, fire.mateBullets.size());
        Point2D.Double onLine = pt(600, 620);
        assertTrue(move.risk(onLine, fire) > move.risk(onLine, plain));
        Point2D.Double aside = pt(300, 620);
        assertEquals(move.risk(aside, plain), move.risk(aside, fire), 1e-9);
        // Long past Hadur: dropped.
        assertTrue(move.mateBullets(pt(560, 600), 400).isEmpty());
    }

    @Test
    @Tag("TMODE-11")
    @DisplayName("TMODE-11: a wave counts its aimed share where the drive crosses its heading, and only the even spread aside")
    void waveDamage() {
        // Fired north from (600, 200) on tick 0 at power 3 (11 px a tick): it reaches y = 600 near tick 35.
        EnemyShot shot = new EnemyShot("e", pt(600, 200), 0, 3.0);
        VirtualBullet head = new VirtualBullet(shot, VirtualBullet.Aim.HEAD_ON, 0.0);
        VirtualBullet lin = new VirtualBullet(shot, VirtualBullet.Aim.LINEAR, 0.0);
        List<MinimumRiskMovement.Wave> waves = MinimumRiskMovement.Wave.of(List.of(head, lin));
        assertEquals(1, waves.size());
        double full = 4 * 3.0 + 2 * 2.0;
        double stay = MinimumRiskMovement.waveDamage(pt(600, 600), pt(600, 600), 20, waves);
        double aside = MinimumRiskMovement.waveDamage(pt(600, 600), pt(800, 600), 20, waves);
        assertTrue(stay > 0.6 * full && stay <= full, "stay " + stay);
        assertTrue(aside > 0 && aside < 0.1 * full, "aside " + aside);
        // A wave the drive never meets in 30 ticks does nothing.
        assertEquals(0.0, MinimumRiskMovement.waveDamage(pt(600, 600), pt(600, 600), 0, waves), 0.0);
        // A weight under one (TMODE-2) scales it.
        List<MinimumRiskMovement.Wave> soft = MinimumRiskMovement.Wave.of(List.of(
            new VirtualBullet(shot, VirtualBullet.Aim.HEAD_ON, 0.0, 0.25)));
        assertEquals(0.25 * stay, MinimumRiskMovement.waveDamage(pt(600, 600), pt(600, 600), 20, soft), 1e-6);
    }

    @Test
    @Tag("TMODE-11")
    @DisplayName("TMODE-11: negative risks (the posture term) keep a positive scale, so wave damage still decides")
    void waveScoresSigned() {
        double[] risk = {-3.0, -2.9, -2.8, -2.7};
        double[] damage = {16.0, 0.0, 1.0, 1.0};
        double[] score = MinimumRiskMovement.waveScores(risk, damage);
        int best = 0;
        for (int k = 1; k < score.length; k++) if (score[k] < score[best]) best = k;
        assertEquals(1, best);
        assertTrue(Double.isFinite(score[0]) && score[0] < 1e6);
    }

    @Test
    @Tag("TMODE-20")
    @Tag("TMODE-21")
    @Tag("TMODE-22")
    @DisplayName("TMODE-20: OWN plays the nearest rule: a shot whose source a teammate stood nearer makes no bullets; HEADON or LINEAR names the one aim")
    void shotOwnership() {
        assertTrue(TeamModes.owns(EnumSet.of(TeamModes.Mode.OWN, TeamModes.Mode.HUNT)));
        assertFalse(TeamModes.owns(TeamModes.DEFAULT));
        assertNull(TeamModes.onlyAim(TeamModes.DEFAULT));
        assertSame(VirtualBullet.Aim.HEAD_ON, TeamModes.onlyAim(EnumSet.of(TeamModes.Mode.OWN, TeamModes.Mode.HEADON)));
        assertSame(VirtualBullet.Aim.LINEAR, TeamModes.onlyAim(EnumSet.of(TeamModes.Mode.LINEAR)));
        EnemyShot shot = new EnemyShot("e", pt(600, 200), 10, 2.0);
        TeamDanger danger = new TeamDanger(field(1200, 1200));
        MinimumRiskMovement theirs = new MinimumRiskMovement(field(1200, 1200));
        theirs.newRound();
        theirs.updateBullets(List.of(shot), path(), pt(600, 600), 12, List.of(pt(600, 300)), TeamModes.owns(EnumSet.of(TeamModes.Mode.OWN)), null);
        assertTrue(theirs.bullets().isEmpty());
        MinimumRiskMovement mine = new MinimumRiskMovement(field(1200, 1200));
        mine.newRound();
        mine.updateBullets(List.of(shot), path(), pt(600, 600), 12, List.of(pt(600, 1000)), TeamModes.owns(EnumSet.of(TeamModes.Mode.OWN)), null);
        assertEquals(2, mine.bullets().size());
    }

    @Test
    @Tag("TMODE-21")
    @Tag("TMODE-22")
    @DisplayName("TMODE-21/22: against a head-on-only or linear-only team each shot makes one bullet on that aim, weighing both guesses' total")
    void oneAim() {
        EnemyShot shot = new EnemyShot("e", pt(600, 200), 10, 2.0);
        TeamDanger danger = new TeamDanger(field(1200, 1200));
        MinimumRiskMovement both = new MinimumRiskMovement(field(1200, 1200));
        both.newRound();
        both.updateBullets(List.of(shot), path(), pt(600, 600), 12, List.of(pt(100, 1100)), false, null);
        assertEquals(2, both.bullets().size());
        for (VirtualBullet.Aim aim : new VirtualBullet.Aim[] {VirtualBullet.Aim.HEAD_ON, VirtualBullet.Aim.LINEAR}) {
            MinimumRiskMovement one = new MinimumRiskMovement(field(1200, 1200));
            one.newRound();
            one.updateBullets(List.of(shot), path(), pt(600, 600), 12, List.of(pt(100, 1100)), false, aim);
            assertEquals(1, one.bullets().size());
            VirtualBullet b = one.bullets().get(0);
            assertEquals(aim, b.aim);
            assertEquals(TeamRisk.ONE_AIM_WEIGHT, b.weight, 0);
            VirtualBullet same = both.bullets().get(aim == VirtualBullet.Aim.HEAD_ON ? 0 : 1);
            assertEquals(same.heading, b.heading, 0);
        }
        // Off a team (no living teammate) the shot makes both guesses as ever.
        MinimumRiskMovement alone = new MinimumRiskMovement(field(1200, 1200));
        alone.newRound();
        alone.updateBullets(List.of(shot), path(), pt(600, 600), 12, List.of(), false, VirtualBullet.Aim.HEAD_ON);
        assertEquals(2, alone.bullets().size());
    }

    @Test
    @Tag("TMODE-25")
    @DisplayName("TMODE-25: a teammate's bullet is counted, at its damage, on a drive that meets it and not on one that leaves its line")
    void pathCheck() {
        assertTrue(TeamRisk.crossesBox(pt(600, 560), pt(600, 571), 600, 580, 18));
        assertFalse(TeamRisk.crossesBox(pt(600, 560), pt(600, 571), 620, 580, 18));
        assertTrue(TeamRisk.crossesBox(pt(570, 600), pt(630, 600), 600, 610, 18));
        MinimumRiskMovement move = new MinimumRiskMovement(field(1200, 1200));
        move.newRound();
        // A teammate at (600, 300) fired north at tick 75, power 3 (11 px a tick): at (600, 575) on tick 100.
        move.mateShot("m0", pt(600, 300), 75, 0, 3.0);
        List<VirtualBullet> b = move.mateBullets(pt(600, 700), 100);
        assertEquals(1, b.size());
        double dmg = 4 * 3 + 2 * (3 - 1);
        // Staying, or driving into it, it lands on tick 110; driving aside or away, it misses.
        assertEquals(dmg, TeamRisk.pathDamage(pt(600, 700), pt(600, 700), 100, b), 0);
        assertEquals(dmg, TeamRisk.pathDamage(pt(600, 700), pt(600, 400), 100, b), 0);
        assertEquals(0, TeamRisk.pathDamage(pt(600, 700), pt(300, 700), 100, b), 0);
        assertEquals(0, TeamRisk.pathDamage(pt(600, 700), pt(600, 1000), 100, b), 0);
        assertEquals(0, TeamRisk.pathDamage(pt(600, 700), pt(600, 700), 100, List.of()), 0);
        // The pick is a candidate whose drive leaves the line; Hadur's own spot is never one (its
        // risk counts only bullets due now, so it would under-score standing under fire).
        List<EnemyInfo> far = enemies(pt(100, 1100)).alive();
        MinimumRiskMovement.View v = move.view(pt(600, 700), 100, 100, 3, far, MeleeStrategy.Plan.normal(), mates(pt(600, 300)));
        v.pathBullets = b;
        List<Point2D.Double> candidates = List.of(pt(600, 400), pt(300, 700));
        Point2D.Double pick = TeamRisk.pathBest(move, null, candidates, v);
        assertTrue(candidates.contains(pick));
        assertEquals(pt(300, 700), pick);
    }

    @Test
    @Tag("TMODE-29")
    @Tag("TMODE-30")
    @DisplayName("TMODE-29: DODGE's re-rank with its own-fire switch adds the teammates' bullets to the risk and drives out of their line")
    void dodgeOwnFire() {
        MinimumRiskMovement move = new MinimumRiskMovement(field(1200, 1200));
        move.newRound();
        move.mateShot("m0", pt(600, 300), 75, 0, 3.0);
        List<VirtualBullet> b = move.mateBullets(pt(600, 700), 100);
        List<EnemyInfo> far = enemies(pt(100, 1100)).alive();
        MinimumRiskMovement.View v = move.view(pt(600, 700), 100, 100, 3, far, MeleeStrategy.Plan.normal(), mates(pt(600, 300)));
        List<Point2D.Double> candidates = List.of(pt(600, 400), pt(300, 700));
        assertEquals(pt(300, 700), move.rerankBest(candidates, v, 12, List.of(), b, true));
        assertEquals(pt(300, 700), move.rerankBest(candidates, v, 12, List.of(), b, false));
        assertTrue(TeamDodge.OWN_FIRE, "on in the shipped build since TMODE-30");
    }

    @Test
    @Tag("TMODE-13")
    @DisplayName("TMODE-13: with HUNT the pull is 0.3 strong and leaves the bullets' risk unscaled; under 20 energy, no hunt")
    void huntPull() {
        List<EnemyInfo> prey = enemies(pt(600, 1000)).alive();
        Set<TeamModes.Mode> hunt = EnumSet.of(TeamModes.Mode.HUNT);
        TeamRisk.Pull p = TeamRisk.pull(pt(600, 400), "n", 100, 3, prey, 100,
            mates(pt(700, 400)), hunt);
        assertEquals(TeamRisk.huntSlot(pt(600, 400), "n", prey, 100, mates(pt(700, 400))), p.at);
        assertEquals(TeamRisk.HUNT_PULL, p.strength, 0);
        assertFalse(p.scalesBullets);
        assertNull(TeamRisk.pull(pt(600, 400), "n", 19, 3, prey, 100, mates(pt(700, 400)), hunt));
        // The other pulls still scale every term but the posture's.
        assertTrue(TeamRisk.pull(pt(600, 400), 100, 2, prey, 100, mates(pt(700, 400)),
            EnumSet.of(TeamModes.Mode.FINISH)).scalesBullets);
    }

    @Test
    @Tag("TMODE-42")
    @DisplayName("TMODE-42: CLOSE puts the hunt place 250 px from the prey instead of 350, means nothing without HUNT, and ships on every team (FORCE_CLOSE on, every table entry)")
    void closeHunt() {
        assertTrue(TeamModes.FORCE_CLOSE);
        assertTrue(TeamModes.DEFAULT.contains(TeamModes.Mode.CLOSE));
        for (Set<TeamModes.Mode> entry : TeamModes.TABLE.values()) assertTrue(entry.contains(TeamModes.Mode.CLOSE));
        List<EnemyInfo> prey = enemies(pt(600, 1000)).alive();
        TeamRisk.Pull far = TeamRisk.pull(pt(600, 400), "n", 100, 3, prey, 100, mates(pt(700, 400)),
            EnumSet.of(TeamModes.Mode.HUNT));
        assertEquals(TeamRisk.HUNT_RADIUS, far.at.distance(600, 1000), 1e-6);
        TeamRisk.Pull close = TeamRisk.pull(pt(600, 400), "n", 100, 3, prey, 100, mates(pt(700, 400)),
            EnumSet.of(TeamModes.Mode.HUNT, TeamModes.Mode.CLOSE));
        assertEquals(TeamRisk.HUNT_CLOSE, close.at.distance(600, 1000), 1e-6);
        assertEquals(250, TeamRisk.HUNT_CLOSE, 0);
        assertNull(TeamRisk.pull(pt(600, 400), "n", 100, 3, prey, 100, mates(pt(700, 400)), EnumSet.of(TeamModes.Mode.CLOSE)));
    }
}
