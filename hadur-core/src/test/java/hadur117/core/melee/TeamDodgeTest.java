package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.field;
import static hadur117.core.melee.Fixtures.pt;
import static hadur117.core.melee.Fixtures.scan;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyShot;
import hadur117.core.world.EnemyTracker;
import hadur117.core.world.Roster;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** TMODE-27: Ogi's dodge, its aim experts, its shot profiles and its pick. */
class TeamDodgeTest {

    private static final BattleField FIELD = field(1200, 1200);
    private static final int H = AimExperts.Expert.HEAD_ON.ordinal();
    private static final int L = AimExperts.Expert.LINEAR.ordinal();
    private static final int C = AimExperts.Expert.CIRCULAR.ordinal();
    private static final int HALF = AimExperts.Expert.HALF.ordinal();
    private static final int LEARNED = AimExperts.Expert.LEARNED.ordinal();

    /** Hadur's track: at {@code at} from tick 0 to {@code to}, heading {@code heading} at {@code velocity}. */
    private static RobotStateLog path(Point2D.Double at, double heading, double velocity, long to) {
        RobotStateLog log = new RobotStateLog();
        for (long t = 0; t <= to; t++) {
            log.addState(RobotState.newBuilder().setLocation(at).setHeading(heading)
                .setVelocity(velocity).setTime(t).build());
        }
        return log;
    }

    private static List<Roster.Mate> mates(Point2D.Double... at) {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < at.length; i++) names.add("m" + i);
        Roster r = new Roster(names, at.length + 2);
        r.newRound();
        for (int i = 0; i < at.length; i++) r.scanned("m" + i, at[i].x, at[i].y, 0, 0, 100);
        return r.living(100);
    }

    private static boolean[] simple() {
        boolean[] a = new boolean[AimExperts.COUNT];
        for (int e = 0; e < AimExperts.COUNT; e++) a[e] = e != LEARNED;
        return a;
    }

    @Test
    @Tag("TMODE-27")
    @DisplayName("TMODE-27: experts share evenly before any hit; the one that keeps calling the bullets takes the weight, pooled by class")
    void expertsLearn() {
        AimExperts x = new AimExperts();
        double[] w = x.weights("x.Foo 1.0 (1)", simple());
        for (int e = 0; e < AimExperts.COUNT; e++) assertEquals(e == LEARNED ? 0 : 0.2, w[e], 1e-12);
        double[] errors = {3.0, 0.2, 3.0, 2.0, 1.5, Double.NaN};
        for (int i = 0; i < 10; i++) x.observe("x.Foo 1.0 (" + (1 + i % 2) + ")", errors);
        w = x.weights("x.Foo 1.0 (3)", simple());
        assertTrue(w[L] > 0.5, "linear leads: " + w[L]);
        assertTrue(w[L] > w[HALF] && w[HALF] > w[H], "nearer misses keep more weight");
        double sum = 0;
        for (double v : w) sum += v;
        assertEquals(1.0, sum, 1e-12);
        // A NaN error leaves the learned expert's loss where it was.
        assertEquals(0, x.losses("x.Foo")[LEARNED], 0);
        assertEquals(0, AimExperts.loss(0.9), 0);
        assertEquals(0.5, AimExperts.loss(-2.0), 1e-12);
        assertEquals(1, AimExperts.loss(7), 0);
    }

    @Test
    @Tag("TMODE-27")
    @DisplayName("TMODE-27: the simple experts agree on a still target, split on a moving one, and circular without a turn is linear")
    void expertHeadings() {
        EnemyShot shot = new EnemyShot("e", pt(600, 100), 50, 2.0);
        RobotStateLog still = path(pt(600, 700), 0, 0, 50);
        double[] h = AimExperts.headings(shot, still.getState(50), still, FIELD);
        for (int e = 0; e < AimExperts.COUNT; e++) {
            if (e != LEARNED) assertEquals(h[H], h[e], 1e-9, "expert " + e);
        }
        assertTrue(Double.isNaN(h[LEARNED]));
        RobotStateLog moving = path(pt(600, 700), Math.PI / 2, 8, 50);
        h = AimExperts.headings(shot, moving.getState(50), moving, FIELD);
        assertNotEquals(h[H], h[L], 1e-3);
        assertEquals(h[L], h[C], 1e-9);
        assertTrue(h[HALF] > h[H] && h[HALF] < h[L], "half speed aims between");
        double[] err = AimExperts.errors(shot, moving.getState(50), h, h[L]);
        assertEquals(0, err[L], 1e-9);
        assertTrue(Math.abs(err[H]) > 1);
    }

    @Test
    @Tag("TMODE-27")
    @DisplayName("TMODE-27: a shot's profile is made once, sums to its share for Hadur, and keeps to one aim for a team that has one")
    void profiles() {
        TeamDodge d = new TeamDodge(FIELD);
        TeamDanger danger = new TeamDanger(FIELD);
        EnemyShot shot = new EnemyShot("e", pt(600, 100), 50, 2.0);
        RobotStateLog log = path(pt(600, 700), Math.PI / 2, 8, 60);
        MinimumRiskMovement.Wave alone = d.profile(shot, log, pt(600, 700), List.of(), danger, false, null);
        assertEquals(1.0, alone.aimed, 0);
        assertEquals(AimExperts.COUNT - 1, alone.headings.length);
        double sum = 0;
        for (double s : alone.shares) sum += s;
        assertEquals(1.0, sum, 1e-12);
        // A teammate nearer the shooter takes three quarters of it (TMODE-2), or all of it under OWN.
        List<Point2D.Double> nearer = List.of(pt(600, 300));
        assertEquals(0.25, d.profile(shot, log, pt(600, 700), nearer, danger, false, null).aimed, 1e-12);
        assertNull(d.profile(shot, log, pt(600, 700), nearer, danger, true, null));
        MinimumRiskMovement.Wave one = d.profile(shot, log, pt(600, 700), List.of(), danger, false, VirtualBullet.Aim.HEAD_ON);
        assertEquals(1, one.headings.length);
        assertEquals(DiaUtils.absoluteBearing(pt(600, 100), pt(600, 700)), one.headings[0], 1e-12);
        d.update(List.of(shot), log, pt(600, 700), 60, List.of(), danger, false, null);
        assertEquals(1, d.waves().size());
        MinimumRiskMovement.Wave first = d.waves().get(0);
        d.update(List.of(shot), log, pt(600, 700), 61, List.of(), danger, false, null);
        assertTrue(first == d.waves().get(0), "profiled once");
        d.update(List.of(), log, pt(600, 700), 62, List.of(), danger, false, null);
        assertTrue(d.waves().isEmpty(), "a shot no longer tracked is dropped");
    }

    @Test
    @Tag("TMODE-27")
    @DisplayName("TMODE-27: of the safest candidates, the dodge drives out of a shot's line rather than along it")
    void dodgesTheLine() {
        MinimumRiskMovement move = new MinimumRiskMovement(FIELD);
        move.newRound();
        // Fired head-on from (600, 100) at tick 60, power 3: it reaches Hadur at (600, 700) about tick 115.
        EnemyShot shot = new EnemyShot("e", pt(600, 100), 60, 3.0);
        RobotStateLog log = path(pt(600, 700), 0, 0, 100);
        move.dodge().update(List.of(shot), log, pt(600, 700), 100, List.of(), new TeamDanger(FIELD), false,
            VirtualBullet.Aim.HEAD_ON);
        EnemyTracker t = new EnemyTracker(FIELD);
        scan(t, "e 1.0", 100, 1100, 100, 100);
        List<EnemyInfo> far = t.alive();
        MinimumRiskMovement.View v = move.view(pt(600, 700), 100, 100, 3, far, MeleeStrategy.Plan.normal(),
            mates(pt(1000, 1000)));
        List<Point2D.Double> candidates = List.of(pt(600, 690), pt(450, 700));
        double inLine = MinimumRiskMovement.waveDamage(pt(600, 700), pt(600, 690), 100, move.dodge().waves());
        double aside = MinimumRiskMovement.waveDamage(pt(600, 700), pt(450, 700), 100, move.dodge().waves());
        assertTrue(inLine > 5 * aside, inLine + " vs " + aside);
        assertEquals(pt(450, 700), move.dodgeBest(candidates, v, move.dodge().waves()));
    }
}
