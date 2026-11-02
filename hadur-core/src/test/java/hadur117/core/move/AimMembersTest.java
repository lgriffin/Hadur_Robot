package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.Wave;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-29: the simple aims as danger members. */
class AimMembersTest {

    static final BattleField FIELD = new BattleField(800, 600);

    @Test
    @Tag("MOVE-29")
    @DisplayName("before any bullet each aim counts its standing share of the views' weight")
    void freshWeights() {
        AimMembers m = new AimMembers();
        assertEquals(1.0, m.weight(0), 1e-12);
        assertEquals(AimMembers.PRIOR, m.weight(1), 1e-12);
        double[] one = nans(AimMembers.AIMS.length);
        one[0] = 1.0;
        assertEquals((0.4 + AimMembers.PRIOR * 1.0) / (1 + AimMembers.PRIOR), m.danger(0.4, one), 1e-12);
        assertEquals(0.4, m.danger(0.4, nans(AimMembers.AIMS.length)), 1e-12,
            "an aim with no angle is left out");
    }

    @Test
    @Tag("MOVE-29")
    @DisplayName("a member that put the bullet where it went gains weight, one that missed loses it")
    void learning() {
        AimMembers m = new AimMembers();
        // Window probability 0.05 by a uniform guess; the views had half of it, the head-on aim
        // a kernel on the window (score 1, probability 0.5), the linear aim nothing.
        double[] say = nans(AimMembers.MEMBERS);
        say[0] = 0.05;
        say[1] = 1.0;
        say[2] = 0.0;
        m.learn(say, 0.05);
        assertTrue(m.score(1) > 0 && m.score(2) < 0 && m.score(0) < 0);
        assertEquals(0.0, m.score(3), 1e-12, "a member with no say keeps its score");
        double ratio = (1 - AimMembers.EPS) * 0.5 / 0.05 + AimMembers.EPS;
        assertEquals((1 - AimMembers.DECAY) * Math.log(ratio) / Math.log(2), m.score(1), 1e-12);
        assertTrue(m.weight(1) > AimMembers.PRIOR);
        assertEquals(1, m.bullets());
    }

    static double[] nans(int n) {
        double[] a = new double[n];
        java.util.Arrays.fill(a, Double.NaN);
        return a;
    }

    @Test
    @Tag("MOVE-29")
    @DisplayName("a hit on the head-on angle teaches the controller's aim members, with no view data yet")
    void controllerLearnsAHit() {
        MoveController mc = new MoveController(FIELD, new MovementPredictor(FIELD));
        AimMembers members = new AimMembers();
        mc.setAimMembers(members);
        Point2D.Double enemy = new Point2D.Double(400, 100);
        Point2D.Double me = new Point2D.Double(400, 500);
        Wave w = new Wave("enemy", enemy, me, 0, 10, 2.0, 0, 0, 1, FIELD, new MovementPredictor(FIELD));
        double[] still = {me.x, me.y, 0, 0, 0, 0, enemy.x, enemy.y, 0};
        w.aimStates = new double[][] {still, still, still};
        w.targetDistance = 400;
        // Straight at us: head-on, and as we stand still, linear and circular too.
        mc.logBulletHit(w, new Point2D.Double(400, 480), 0, 40);
        assertEquals(1, members.bullets());
        assertTrue(Double.compare(members.score(0), 0.0) == 0, "no view data: the views have no say");
        for (int a = 1; a < AimMembers.MEMBERS; a++) {
            assertTrue(members.score(a) > 0, "aim " + a + " predicted it: " + members.score(a));
        }
    }

    @Test
    @Tag("MOVE-29")
    @DisplayName("an aim on the escape angle keeps half its kernel, one in the middle all of it")
    void reachableShareAtTheEdge() {
        Wave w = new Wave("enemy", new Point2D.Double(400, 100), new Point2D.Double(400, 500),
            0, 10, 2.0, 0, 0, 1, FIELD, new MovementPredictor(FIELD));
        double b = 0.045;
        assertTrue(w.maxEscapeAngle() > 10 * b);
        assertEquals(1.0, MoveController.reachableShare(w, w.firingAngle(0), b), 1e-3);
        assertEquals(0.5, MoveController.reachableShare(w, w.firingAngle(1), b), 1e-3);
        assertEquals(0.5, MoveController.reachableShare(w, w.firingAngle(-1), b), 1e-3);
        assertEquals(0.25, MoveController.reachableShare(w, w.firingAngle(3), b), 1e-12,
            "an aim far outside is floored");
    }

    @Test
    @Tag("MOVE-31")
    @DisplayName("the wide set reads every simple angle at every lag, sharing the narrow set's standing weight")
    void wideSet() {
        int[] wide = AimMembers.wideAims();
        assertEquals(hadur117.core.physics.SimpleAims.LAGS * hadur117.core.physics.SimpleAims.ANGLES, wide.length);
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        for (int a : wide) {
            assertTrue(a % hadur117.core.physics.SimpleAims.TYPES < hadur117.core.physics.SimpleAims.ANGLES,
                "an angle, not a helper entry: " + a);
            assertTrue(seen.add(a), "no aim twice: " + a);
        }
        assertEquals(AimMembers.AIMS.length + 1, AimMembers.MEMBERS);
        assertEquals(0.3, AimMembers.PRIOR * AimMembers.AIMS.length, 1e-12, "aims' total standing weight");
    }

    @Test
    @Tag("MOVE-30")
    @DisplayName("an intercepted bullet on the head-on angle scores the aim members and teaches no view")
    void interceptScoresMembers() {
        MoveController mc = new MoveController(FIELD, new MovementPredictor(FIELD));
        AimMembers members = new AimMembers();
        mc.setAimMembers(members);
        Point2D.Double enemy = new Point2D.Double(400, 100);
        Point2D.Double me = new Point2D.Double(400, 500);
        Wave w = new Wave("enemy", enemy, me, 0, 10, 2.0, 0, 0, 1, FIELD, new MovementPredictor(FIELD));
        double[] still = {me.x, me.y, 0, 0, 0, 0, enemy.x, enemy.y, 0};
        w.aimStates = new double[][] {still, still, still};
        w.targetDistance = 400;
        mc.scoreInterceptAims(w, new Point2D.Double(400, 300));
        assertEquals(1, members.bullets());
        for (int a = 1; a < AimMembers.MEMBERS; a++) {
            assertTrue(members.score(a) > 0, "aim " + a + " predicted it: " + members.score(a));
        }
        mc.scoreInterceptAims(null, new Point2D.Double(400, 300));
        assertEquals(1, members.bullets(), "no wave, nothing learnt");
        MoveController off = new MoveController(FIELD, new MovementPredictor(FIELD));
        off.scoreInterceptAims(w, new Point2D.Double(400, 300));
    }

    @Test
    @Tag("MOVE-33")
    @DisplayName("mimic members follow the aims, share a 0.3 standing weight and learn like the aims")
    void mimicMembers() {
        AimMembers m = new AimMembers(6);
        assertEquals(AimMembers.MEMBERS + 6, m.members());
        assertEquals(6, m.mimics());
        double total = 0;
        for (int i = AimMembers.MEMBERS; i < m.members(); i++) total += m.weight(i);
        assertEquals(AimMembers.MIMIC_PRIOR, total, 1e-12);
        assertEquals(AimMembers.PRIOR, m.weight(1), 1e-12, "the aims keep their weight");
        double[] say = nans(m.members());
        say[0] = 0.05;
        say[AimMembers.MEMBERS] = 1.0;
        m.learn(say, 0.05);
        assertTrue(m.score(AimMembers.MEMBERS) > 0 && m.score(0) < 0);
        assertTrue(m.weight(AimMembers.MEMBERS) > AimMembers.MIMIC_PRIOR / 6);
        double[] scores = nans(m.members() - 1);
        scores[AimMembers.MEMBERS - 1] = 0.0;
        assertTrue(m.danger(1.0, scores) < 1.0, "a mimic that says the window is safe pulls the danger down");
        assertEquals(AimMembers.MEMBERS, new AimMembers().members(), "without mimics as before");
    }
}
