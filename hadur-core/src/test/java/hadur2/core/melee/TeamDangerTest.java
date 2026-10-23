package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.field;
import static hadur2.core.melee.Fixtures.pt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.RobotState;
import hadur2.core.model.RobotStateLog;
import hadur2.core.world.EnemyShot;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** T6: the team's learned danger (MMOVE-9, MMOVE-10). */
class TeamDangerTest {

    private final TeamDanger danger = new TeamDanger(field(1200, 1200));
    /** A power-2 shot from due south of the target, 400 px off. */
    private final EnemyShot shot = new EnemyShot("e", pt(600, 200), 10, 2.0);
    private final double mea = Math.asin(8.0 / 14.0);

    /** The target at (600, 600) on tick 10, driving east (clockwise round the shooter) or west. */
    private static RobotState target(boolean east) {
        return RobotState.newBuilder().setLocation(pt(600, 600)).setHeading(east ? Math.PI / 2 : 3 * Math.PI / 2)
            .setVelocity(8).setTime(10).build();
    }

    @Test
    @Tag("MMOVE-10")
    @DisplayName("MMOVE-10: a hit's guess factor is 0 head-on and 1 at the full escape angle the target was going")
    void guessFactor() {
        // The shooter is due south: head-on is due north, 0.
        assertEquals(0, danger.sample(shot, target(true), 0).gf, 1e-9);
        assertEquals(1, danger.sample(shot, target(true), mea).gf, 1e-9);
        assertEquals(-0.5, danger.sample(shot, target(true), -mea / 2).gf, 1e-9);
        // Driving the other way the same bullet is behind it.
        assertEquals(-1, danger.sample(shot, target(false), mea).gf, 1e-9);
        // A stray match is kept on the field.
        assertEquals(TeamDanger.MAX_GF, danger.sample(shot, target(true), 3 * mea).gf, 1e-9);
    }

    @Test
    @Tag("MMOVE-10")
    @DisplayName("MMOVE-10: below the minimum a log gives no aims; then its neighbours' aims, mirrored with the target's direction, weigh two in all")
    void aimsFromTheLog() {
        for (int i = 0; i < TeamDanger.MIN_SAMPLES - 1; i++) danger.add(danger.sample(shot, target(true), mea / 2));
        assertNull(danger.aims(shot, target(true)));
        danger.add(danger.sample(shot, target(true), mea / 2));
        List<TeamDanger.Aim> aims = danger.aims(shot, target(true));
        assertEquals(TeamDanger.MIN_SAMPLES, aims.size());
        double total = 0;
        for (TeamDanger.Aim a : aims) {
            assertEquals(mea / 2, a.heading, 1e-9);
            total += a.weight;
        }
        assertEquals(TeamDanger.SHOT_WEIGHT, total, 1e-9);
        // The same enemy, the target going the other way: the learned lead is to the other side.
        for (TeamDanger.Aim a : danger.aims(shot, target(false))) assertEquals(-mea / 2, a.heading, 1e-9);
        // Another enemy's log is its own.
        assertNull(danger.aims(new EnemyShot("f", pt(600, 200), 10, 2.0), target(true)));
    }

    @Test
    @Tag("MMOVE-10")
    @DisplayName("MMOVE-10: of many samples the nearest situations count most, and at most K of them")
    void nearestSituationsCount() {
        RobotState still = RobotState.newBuilder().setLocation(pt(600, 600)).setHeading(Math.PI / 2)
            .setVelocity(0).setTime(10).build();
        for (int i = 0; i < 20; i++) danger.add(danger.sample(shot, still, 0));
        for (int i = 0; i < 20; i++) danger.add(danger.sample(shot, target(true), mea));
        List<TeamDanger.Aim> aims = danger.aims(shot, target(true));
        assertEquals(TeamDanger.K, aims.size());
        for (TeamDanger.Aim a : aims) assertEquals(mea, a.heading, 1e-9);
    }

    @Test
    @Tag("MMOVE-10")
    @DisplayName("MMOVE-10: Hadur's own samples go to its log and, once, to its report; a teammate's go to the log alone")
    void ownSamplesAreSent() {
        danger.own(danger.sample(shot, target(true), 0));
        danger.add(danger.sample(shot, target(true), 0));
        assertEquals(2, danger.size("e"));
        assertEquals(1, danger.takeOutgoing().size());
        assertTrue(danger.takeOutgoing().isEmpty());
    }

    @Test
    @Tag("MMOVE-9")
    @DisplayName("MMOVE-9: a shot is aimed at Hadur unless a teammate stood clearly nearer its source")
    void aimedAtTheNearest() {
        Point2D.Double me = pt(600, 600);
        assertTrue(TeamDanger.aimedAtMe(shot, me, List.of()));
        assertFalse(TeamDanger.aimedAtMe(shot, me, List.of(pt(600, 300))));
        // A near tie (390 px against 400) still counts as aimed at Hadur.
        assertTrue(TeamDanger.aimedAtMe(shot, me, List.of(pt(600, 590))));
        assertTrue(TeamDanger.aimedAtMe(shot, me, List.of(pt(600, 1000))));
    }

    /** Hadur's path: at (600, 600) driving east from tick 0 to tick 12. */
    private static RobotStateLog path() {
        RobotStateLog log = new RobotStateLog();
        for (long t = 0; t <= 12; t++) {
            log.addState(RobotState.newBuilder().setLocation(pt(600, 600)).setHeading(Math.PI / 2)
                .setVelocity(8).setTime(t).build());
        }
        return log;
    }

    @Test
    @Tag("MMOVE-9")
    @DisplayName("MMOVE-9: on a team with NEAREST, a shot at a nearer teammate makes no virtual bullets; with neither switch the bullets are MMOVE-3's")
    void nearestDropsOthersShots() {
        MinimumRiskMovement team = new MinimumRiskMovement(field(1200, 1200));
        team.newRound();
        team.updateBullets(List.of(shot), path(), pt(600, 600), 12, List.of(pt(600, 300)), danger, true, false);
        assertTrue(team.bullets().isEmpty());

        MinimumRiskMovement off = new MinimumRiskMovement(field(1200, 1200));
        off.newRound();
        off.updateBullets(List.of(shot), path(), pt(600, 600), 12, List.of(pt(600, 300)), danger, false, false);
        MinimumRiskMovement solo = new MinimumRiskMovement(field(1200, 1200));
        solo.newRound();
        solo.updateBullets(List.of(shot), path(), pt(600, 600), 12);
        assertEquals(2, off.bullets().size());
        for (int i = 0; i < 2; i++) {
            assertEquals(solo.bullets().get(i).aim, off.bullets().get(i).aim);
            assertEquals(solo.bullets().get(i).heading, off.bullets().get(i).heading, 0.0);
            assertEquals(1.0, off.bullets().get(i).weight, 0.0);
        }
    }

    @Test
    @Tag("MMOVE-10")
    @DisplayName("MMOVE-10: on a team with LEARNED, a deep enough log replaces head-on and linear with its weighted aims")
    void learnedBullets() {
        MinimumRiskMovement team = new MinimumRiskMovement(field(1200, 1200));
        team.newRound();
        // Not yet deep enough: the two guesses.
        team.updateBullets(List.of(shot), path(), pt(600, 600), 12, List.of(pt(100, 1100)), danger, false, true);
        assertEquals(2, team.bullets().size());
        for (int i = 0; i < 8; i++) danger.add(danger.sample(shot, target(true), mea));
        EnemyShot next = new EnemyShot("e", pt(600, 200), 11, 2.0);
        team.updateBullets(List.of(shot, next), path(), pt(600, 600), 12, List.of(pt(100, 1100)), danger, false, true);
        List<VirtualBullet> learned = team.bullets().subList(2, team.bullets().size());
        assertEquals(8, learned.size());
        double total = 0;
        for (VirtualBullet b : learned) {
            assertEquals(VirtualBullet.Aim.LEARNED, b.aim);
            assertEquals(mea, b.heading, 1e-9);
            total += b.weight;
        }
        assertEquals(TeamDanger.SHOT_WEIGHT, total, 1e-9);
    }

    @Test
    @Tag("MMOVE-10")
    @DisplayName("MMOVE-10: a hit is matched to the shot it ended by power and flight, and teaches the team; an unexplained hit teaches nothing")
    void hitTeaches() {
        MeleeController c = new MeleeController(field(1200, 1200));
        c.newRound();
        c.onScan("e", pt(600, 200), 400, 100, 0, 0, 9);
        c.tick(new MeleeController.Situation(pt(600, 600), 0, 0, 100, 9, 4, Math.PI / 2, 8));
        c.onScan("e", pt(600, 200), 400, 98, 0, 0, 10);
        c.tick(new MeleeController.Situation(pt(600, 600), 0, 0, 100, 10, 4, Math.PI / 2, 8));
        EnemyShot fired = c.tracker.shots(10).get(0);
        // 400 px at 14 px a tick: the bullet arrives near tick fire + 29.
        long hit = fired.fireTime + 29;
        c.learn("e", 1.0, 0, pt(600, 600), hit);
        assertEquals(0, c.danger().size("e"));
        c.learn("e", 2.0, mea, pt(600, 600), hit);
        assertEquals(1, c.danger().size("e"));
        List<TeamDanger.Sample> sent = c.takeSamples();
        assertEquals(1, sent.size());
        assertEquals(1.0, sent.get(0).gf, 1e-9);
    }
}
