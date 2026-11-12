package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyShot;
import hadur117.core.world.EnemyTracker;
import java.awt.geom.Point2D;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MMOVE-15 and MMOVE-22: the melee surfer and the damage memory, off a team. */
class MeleeCrowdMovementTest {

    private final MinimumRiskMovement move = new MinimumRiskMovement(field(1000, 1000));
    private final EnemyTracker tracker = new EnemyTracker(field(1000, 1000));
    private final MeleeStrategy.Plan normal = MeleeStrategy.Plan.normal();

    MeleeCrowdMovementTest() {
        move.newRound();
    }

    private static RobotStateLog still(Point2D.Double at, long... times) {
        RobotStateLog log = new RobotStateLog();
        for (long t : times) {
            log.addState(RobotState.newBuilder().setLocation(at).setHeading(0).setVelocity(0).setTime(t).build());
        }
        return log;
    }

    private static int index(List<EnemyInfo> enemies, String name) {
        for (int i = 0; i < enemies.size(); i++) if (enemies.get(i).name.equals(name)) return i;
        throw new AssertionError(name);
    }

    @Test
    @Tag("MMOVE-15")
    @DisplayName("MMOVE-15: a shot's crowd weight is 1/(1+k)^2 for the k other opponents nearer its shooter than Hadur")
    void crowdWeight() {
        Point2D.Double me = pt(500, 500);
        scan(tracker, "a", 500, 900, 100, 1);
        scan(tracker, "b", 500, 800, 100, 1);
        scan(tracker, "c", 600, 900, 100, 1);
        EnemyShot s = new EnemyShot("a", pt(500, 900), 9, 2.0);
        assertEquals(1.0 / 9, MinimumRiskMovement.crowdWeight(s, me, tracker.alive()), 1e-12);
        scan(tracker, "d", 400, 900, 100, 1);
        EnemyShot t = new EnemyShot("a", pt(500, 900), 11, 2.0);
        assertEquals(1.0 / 16, MinimumRiskMovement.crowdWeight(t, me, tracker.alive()), 1e-12);
    }

    @Test
    @Tag("MMOVE-15")
    @DisplayName("MMOVE-15: the melee surfer ships on (3.21), weighs shots by the crowd and plays a shooter's learned aims")
    void surf() {
        assertTrue(MinimumRiskMovement.MELEE_SURF, "on from 3.21 (PR #462)");
        Point2D.Double me = pt(500, 500);
        scan(tracker, "a", 500, 900, 100, 1);
        scan(tracker, "b", 500, 800, 100, 1);
        RobotStateLog log = still(me, 8, 9, 10, 20, 21, 22);
        TeamDanger danger = new TeamDanger(field(1000, 1000));
        move.surf(true);
        // Before the log is deep enough: head-on and linear, at the crowd weight (b is nearer a).
        EnemyShot first = new EnemyShot("a", pt(500, 900), 9, 2.0);
        move.updateMeleeBullets(List.of(first), log, me, 10, tracker.alive(), danger);
        assertEquals(2, move.bullets().size());
        for (VirtualBullet b : move.bullets()) assertEquals(0.25, b.weight, 1e-12);
        // Five hits logged at guess factor 0.5: the next shot's bullets are learned aims.
        for (int i = 0; i < TeamDanger.MIN_SAMPLES; i++) {
            danger.add(danger.sample(first, log.getState(9), Math.PI + 0.2));
        }
        EnemyShot next = new EnemyShot("a", pt(500, 900), 21, 2.0);
        move.updateMeleeBullets(List.of(next), log, me, 22, tracker.alive(), danger);
        double learned = move.bullets().stream().filter(b -> b.aim == VirtualBullet.Aim.LEARNED)
            .mapToDouble(b -> b.weight).sum();
        assertEquals(0.25 * TeamDanger.SHOT_WEIGHT, learned, 1e-9);
        // Five samples, but only the SURF_AIMS nearest are kept, with the shot's whole weight.
        assertEquals(MinimumRiskMovement.SURF_AIMS,
            move.bullets().stream().filter(b -> b.aim == VirtualBullet.Aim.LEARNED).count());
        // Off, or with no log given, the same shots are MMOVE-3's.
        MinimumRiskMovement off = new MinimumRiskMovement(field(1000, 1000));
        off.surf(false);
        off.newRound();
        off.updateMeleeBullets(List.of(first, next), log, me, 22, tracker.alive(), danger);
        assertEquals(4, off.bullets().size());
        for (VirtualBullet b : off.bullets()) assertEquals(1.0, b.weight, 1e-12);
    }

    @Test
    @Tag("MMOVE-30")
    @DisplayName("MMOVE-30 ships off; on, each shot is one crowd-weighted profile of the aim experts and no virtual bullet")
    void meleeDodgeProfiles() {
        assertFalse(MinimumRiskMovement.MELEE_DODGE, "an arm (mdodge) until a card passes");
        Point2D.Double me = pt(500, 500);
        scan(tracker, "a", 500, 900, 100, 1);
        scan(tracker, "b", 500, 800, 100, 1);
        RobotStateLog log = still(me, 8, 9, 10);
        TeamDanger danger = new TeamDanger(field(1000, 1000));
        move.surf(true);
        move.meleeDodge(true);
        assertTrue(move.meleeDodging());
        EnemyShot first = new EnemyShot("a", pt(500, 900), 9, 2.0);
        move.updateMeleeBullets(List.of(first), log, me, 10, tracker.alive(), danger);
        assertTrue(move.bullets().isEmpty(), "the profiles stand in for the virtual bullets");
        List<MinimumRiskMovement.Wave> waves = move.dodge().waves();
        assertEquals(1, waves.size());
        assertEquals(0.25, waves.get(0).aimed, 1e-12, "b is nearer a: the crowd weight");
        assertEquals(AimExperts.COUNT - 1, waves.get(0).headings.length, "every simple expert, no learned aims yet");
        assertEquals(0.25, move.weighed(first).weight, 1e-12, "MMOVE-26 still reads the weight");
        // A shot under the floor makes no profile.
        scan(tracker, "c", 450, 850, 100, 1);
        scan(tracker, "d", 550, 850, 100, 1);
        EnemyShot far = new EnemyShot("a", pt(500, 900), 10, 2.0);
        move.updateMeleeBullets(List.of(first, far), log, me, 11, tracker.alive(), danger);
        assertEquals(1, move.dodge().waves().size());
        Point2D.Double to = move.chooseDestination(me, 100, 4, tracker.alive(), 11, normal);
        assertNotNull(to);
        assertTrue(move.bullets().isEmpty());
    }

    @Test
    @Tag("MMOVE-15")
    @DisplayName("MMOVE-15: off a team the surfer chooses by the wave check; on a team it changes nothing")
    void surfChoosesByWaves() {
        scan(tracker, "a", 300, 300, 100, 1);
        scan(tracker, "b", 700, 700, 100, 1);
        scan(tracker, "c", 900, 100, 100, 1);
        MinimumRiskMovement plain = new MinimumRiskMovement(field(1000, 1000));
        plain.newRound();
        move.surf(true);
        Point2D.Double surfed = move.chooseDestination(pt(500, 500), 100, 3, tracker.alive(), 5, normal);
        // With no wave in the air the wave check's damage is level, so its pick is the least risk.
        assertEquals(plain.chooseDestination(pt(500, 500), 100, 3, tracker.alive(), 5, normal), surfed);
    }

    @Test
    @Tag("MMOVE-22")
    @DisplayName("MMOVE-22 ships on from 3.21")
    void diamondShip() {
        assertTrue(MinimumRiskMovement.MELEE_DAMAGE_MEMORY, "pc-melee-dia dm +0.43 ± 0.17, low end +0.26 (PR #503)");
        assertTrue(move.damageMemory());
    }

    @Test
    @Tag("MMOVE-22")
    @DisplayName("MMOVE-22: weights are (damage + 10) x mean distance, averaging 1; an unscanned opponent takes 500 px")
    void damageWeights() {
        scan(tracker, "a", 800, 500, 100, 1);
        scan(tracker, "b", 100, 100, 100, 1);
        List<EnemyInfo> alive = tracker.alive();
        Map<String, Double> w = MinimumRiskMovement.damageWeights(alive,
            n -> n.equals("a") ? 30.0 : 0.0, n -> n.equals("a") ? 400.0 : 0.0);
        // a: 40 x 400 = 16,000; b: 10 x 500 = 5,000; mean 10,500.
        assertEquals(16000.0 / 10500, w.get("a"), 1e-12);
        assertEquals(5000.0 / 10500, w.get("b"), 1e-12);
        assertEquals(1.0, (w.get("a") + w.get("b")) / 2, 1e-12, "the weights average 1");
        assertTrue(MinimumRiskMovement.damageWeights(List.of(), n -> 0, n -> 0).isEmpty());
        Map<String, Double> even = MinimumRiskMovement.damageWeights(alive, n -> 0, n -> 300);
        assertEquals(1.0, even.get("a"), 1e-12, "no damage anywhere: every opponent weighs 1");
    }

    @Test
    @Tag("MMOVE-22")
    @DisplayName("MMOVE-22: switched on, an opponent's term carries its weight; off a team only")
    void damageMemory() {
        scan(tracker, "a", 800, 500, 100, 1);
        scan(tracker, "c", 100, 100, 100, 1);
        Point2D.Double me = pt(500, 500);
        Point2D.Double p = pt(600, 500);
        List<EnemyInfo> alive = tracker.alive();
        int ia = index(alive, "a"), ic = index(alive, "c");
        MinimumRiskMovement plain = new MinimumRiskMovement(field(1000, 1000));
        MinimumRiskMovement.View v = move.view(me, 100, 5, 5, alive, normal);
        move.damageMemory(true);
        move.damageWeights(Map.of("a", 1.6, "c", 0.4));
        assertEquals(plain.enemyRisk(p, v, ia) * 1.6, move.enemyRisk(p, v, ia), 1e-12, "a has hurt Hadur: 1.6x");
        assertEquals(plain.enemyRisk(p, v, ic) * 0.4, move.enemyRisk(p, v, ic), 1e-12, "c has not: 0.4x");
        move.damageWeights(Map.of());
        assertEquals(plain.enemyRisk(p, v, ia), move.enemyRisk(p, v, ia), 1e-12, "no weights yet: unchanged");
        move.damageWeights(null);
        assertEquals(plain.enemyRisk(p, v, ic), move.enemyRisk(p, v, ic), 1e-12, "null weights: unchanged");
    }
}
