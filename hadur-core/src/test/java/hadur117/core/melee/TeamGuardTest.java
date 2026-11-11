package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.pt;
import static hadur117.core.melee.Fixtures.scan;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

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

/** T7: the team safety guards, keep moving (TMODE-46) and last enemy (TMODE-47). */
class TeamGuardTest {

    private static final Point2D.Double ME = pt(500, 500);
    private static final long NOW = 100;
    private static final double FULL = MinimumRiskMovement.MOVING_HIT * MinimumRiskMovement.MOVING_SHOT;

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
    @Tag("TMODE-46")
    @DisplayName("TMODE-46: a drive along a cool gun's line pays a full share, across it only the ticks under 3 px a tick; a hot gun, a disabled enemy and a nearer teammate pay less or nothing")
    void creeping() {
        List<EnemyInfo> e = north(100);
        // Straight at the enemy: never any lateral speed.
        assertEquals(FULL, MinimumRiskMovement.movingDamage(ME, pt(500, 600), NOW, e, List.of(), List.of(), n -> Long.MIN_VALUE), 1e-12);
        // Across its line, 240 px: only the first three ticks creep (at speed 3 the tilting line leaves a hair under 3 px across).
        assertEquals(FULL * 3 / 30, MinimumRiskMovement.movingDamage(ME, pt(740, 500), NOW, e, List.of(), List.of(), n -> Long.MIN_VALUE), 1e-12);
        // Standing still is creeping.
        assertEquals(FULL, MinimumRiskMovement.movingDamage(ME, ME, NOW, e, List.of(), List.of(), n -> Long.MIN_VALUE), 1e-12);
        // A gun hot past the drive pays nothing; one cool half way pays on the ticks it is cool.
        assertEquals(0, MinimumRiskMovement.movingDamage(ME, ME, NOW, e, List.of(), List.of(), n -> NOW + 100), 0);
        assertEquals(FULL, MinimumRiskMovement.movingDamage(ME, ME, NOW, e, List.of(), List.of(), n -> NOW + 15), 1e-12);
        assertEquals(0, MinimumRiskMovement.movingDamage(ME, ME, NOW, north(0), List.of(), List.of(), n -> Long.MIN_VALUE), 0);
        // One teammate nearer the enemy: a quarter.
        assertEquals(FULL / 4, MinimumRiskMovement.movingDamage(ME, ME, NOW, e, mates(pt(500, 650)), List.of(), n -> Long.MIN_VALUE), 1e-12);
        // A stale enemy pays nothing.
        assertEquals(0, MinimumRiskMovement.movingDamage(ME, ME, NOW + EnemyInfo.STALE_TICKS, e, List.of(), List.of(), n -> Long.MIN_VALUE), 0);
    }

    @Test
    @Tag("TMODE-46")
    @DisplayName("TMODE-46: a wave whose front meets the member back within 30 px of where it was fired at pays half its aimed damage; one met further off pays nothing")
    void goingBack() {
        // Power 2 (14 px a tick) from 400 px north, fired 20 ticks ago: the front meets Hadur about 9 ticks on.
        EnemyShot s = new EnemyShot("e 1.0", pt(500, 900), NOW - 20, 2);
        MinimumRiskMovement.Wave w = new MinimumRiskMovement.Wave(s, 0.8, new double[] {Math.PI}, new double[] {1}, Math.PI);
        w.target = ME;
        assertEquals(0.5 * 0.8 * w.damage, MinimumRiskMovement.movingDamage(ME, ME, NOW, List.of(), List.of(), List.of(w), n -> 0), 1e-12);
        assertEquals(0, MinimumRiskMovement.movingDamage(ME, pt(740, 500), NOW, List.of(), List.of(), List.of(w), n -> 0), 0);
        w.target = null;
        assertEquals(0, MinimumRiskMovement.movingDamage(ME, ME, NOW, List.of(), List.of(), List.of(w), n -> 0), 0);
        // A wave the dodge still holds whose front went past Hadur before the drive starts pays nothing.
        MinimumRiskMovement.Wave past = new MinimumRiskMovement.Wave(new EnemyShot("e 1.0", pt(500, 900), NOW - 32, 2),
            0.8, new double[] {Math.PI}, new double[] {1}, Math.PI);
        past.target = ME;
        assertEquals(0, MinimumRiskMovement.movingDamage(ME, ME, NOW, List.of(), List.of(), List.of(past), n -> 0), 0);
    }

    @Test
    @Tag("TMODE-46")
    @DisplayName("TMODE-46: the dodge knows each shooter's next cool tick from its latest shot, and every wave where its target stood")
    void readyAtAndTarget() {
        TeamDodge d = new TeamDodge(Fixtures.field(1000, 1000));
        d.newRound();
        RobotStateLog path = new RobotStateLog();
        for (long t = 0; t <= NOW; t++) {
            path.addState(RobotState.newBuilder().setLocation(ME).setHeading(0).setVelocity(0).setTime(t).build());
        }
        assertEquals(Long.MIN_VALUE, d.readyAt("e 1.0"));
        EnemyShot early = new EnemyShot("e 1.0", pt(500, 900), NOW - 30, 3);
        EnemyShot late = new EnemyShot("e 1.0", pt(500, 900), NOW - 2, 2);
        d.update(List.of(late, early), path, ME, NOW, List.of(), new TeamDanger(Fixtures.field(1000, 1000)), false, null);
        assertEquals(NOW - 2 + 14, d.readyAt("e 1.0"));
        for (MinimumRiskMovement.Wave w : d.waves()) assertEquals(ME, w.target);
        d.newRound();
        assertEquals(Long.MIN_VALUE, d.readyAt("e 1.0"));
    }

    @Test
    @Tag("TMODE-46")
    @DisplayName("TMODE-46: off a team, or with no armed enemy and no wave, MOVING changes nothing")
    void movingInert() {
        Set<TeamModes.Mode> base = EnumSet.of(TeamModes.Mode.MATEFIRE, TeamModes.Mode.HUNT, TeamModes.Mode.PATH, TeamModes.Mode.DODGE);
        Set<TeamModes.Mode> moving = EnumSet.copyOf(base);
        moving.add(TeamModes.Mode.MOVING);
        EnemyTracker t = new EnemyTracker(Fixtures.field(1000, 1000));
        scan(t, "a 1.0", 150, 150, 100, NOW);
        scan(t, "b 1.0", 850, 850, 100, NOW);
        MinimumRiskMovement a = mover(), b = mover();
        assertEquals(a.chooseDestination(ME, 100, 2, t.alive(), NOW, MeleeStrategy.Plan.normal(), List.of(), base),
            b.chooseDestination(ME, 100, 2, t.alive(), NOW, MeleeStrategy.Plan.normal(), List.of(), moving));
        EnemyTracker dead = new EnemyTracker(Fixtures.field(1000, 1000));
        scan(dead, "a 1.0", 150, 150, 0, NOW);
        scan(dead, "b 1.0", 850, 850, 0, NOW);
        List<Roster.Mate> m = mates(pt(850, 150));
        MinimumRiskMovement c = mover(), d = mover();
        assertEquals(c.chooseDestination(ME, 100, 2, dead.alive(), NOW, MeleeStrategy.Plan.normal(), m, base),
            d.chooseDestination(ME, 100, 2, dead.alive(), NOW, MeleeStrategy.Plan.normal(), m, moving));
    }

    private static MinimumRiskMovement mover() {
        MinimumRiskMovement m = new MinimumRiskMovement(Fixtures.field(1000, 1000));
        m.newRound();
        return m;
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
    @DisplayName("TMODE-46, TMODE-47: neither guard is in the default nor on any shipped entry")
    void notShipped() {
        assertFalse(TeamModes.FORCE_MOVING);
        assertFalse(TeamModes.FORCE_LAST);
        assertFalse(TeamModes.DEFAULT.contains(TeamModes.Mode.MOVING) || TeamModes.DEFAULT.contains(TeamModes.Mode.LAST));
        for (Map.Entry<String, Set<TeamModes.Mode>> e : TeamModes.TABLE.entrySet()) {
            assertFalse(e.getValue().contains(TeamModes.Mode.MOVING) || e.getValue().contains(TeamModes.Mode.LAST), e.getKey());
        }
    }
}
