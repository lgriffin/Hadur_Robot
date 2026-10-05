package hadur2.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * SHIELD-5 and SHIELD-6 on the mode itself: when it is on, which exits it takes and for how
 * long, and what it writes. The opponent stands still 400 px north of us.
 */
class ShieldModeTest {

    private static final String ENEMY = "list.Target 1.0";
    private static final double MY_X = 400, MY_Y = 100, ENEMY_X = 400, ENEMY_Y = 500;

    private final List<String> records = new ArrayList<>();
    private ShieldMode mode;

    @BeforeEach
    void setUp() {
        mode = new ShieldMode(ShieldList.parse(List.of("list.Target")), records::add);
    }

    private void scan(String name, long time, double enemyY) {
        mode.onScan(name, time, MY_X, MY_Y, 0, 0, ENEMY_X, enemyY, Math.PI, 0);
    }

    private void scan(long time) {
        scan(ENEMY, time, ENEMY_Y);
    }

    private ShieldMode.Situation situation(long time, double enemyY, double gunHeat) {
        return new ShieldMode.Situation(time, MY_X, MY_Y, 0, 0, gunHeat, 0.1, 100, ENEMY_X, enemyY,
            100, 0, 1.9, false, true);
    }

    private ShieldMode.Command tick(long time) {
        return mode.tick(situation(time, ENEMY_Y, 0));
    }

    private long count(String prefix) {
        return records.stream().filter(r -> r.startsWith(prefix)).count();
    }

    // ---- SHIELD-5: when the mode is on

    @Test
    @Tag("SHIELD-5")
    @DisplayName("an opponent not on the list never starts shield mode and nothing is written")
    void unlistedOpponent() {
        scan("other.Robot 1.0", 1, ENEMY_Y);
        assertFalse(mode.listed());
        assertFalse(mode.active());
        mode.onEnemyShot(5, 1.9);
        mode.onHitByBullet(20, 1.9, MY_X, MY_Y, Math.PI);
        mode.onIntercepted(21, 1.0, 400, 300);
        mode.onRammed();
        mode.onDuress(30);
        mode.onRoundEnded(100, false);
        assertFalse(mode.active());
        assertEquals(List.of(), records);
        assertEquals(0, mode.budget().taken(), 0, "an unlisted opponent's damage is not tracked");
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("an empty list never starts it either")
    void emptyList() {
        ShieldMode none = new ShieldMode(ShieldList.NONE, records::add);
        none.onScan(ENEMY, 1, MY_X, MY_Y, 0, 0, ENEMY_X, ENEMY_Y, Math.PI, 0);
        assertFalse(none.active());
        assertEquals(List.of(), records);
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("a listed opponent's first scan turns it on, once, and says so")
    void listedOpponent() {
        assertFalse(mode.active(), "nobody has been scanned yet");
        scan(1);
        scan(2);
        assertTrue(mode.listed());
        assertTrue(mode.active());
        assertEquals(List.of("SH,0,1,on"), records);
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("each round opens in shield mode again")
    void everyRoundOpensInIt() {
        scan(1);
        mode.onRammed();
        assertFalse(mode.active());
        mode.newRound(1);
        assertTrue(mode.active(), "the exit was for round 0 only");
        scan(1);
        assertEquals("SH,1,1,on", records.get(records.size() - 1));
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("standing still with no threat, a tick only keeps still and holds fire")
    void quietTick() {
        scan(1);
        ShieldMode.Command c = tick(2);
        assertNotNull(c);
        assertEquals(0, c.firePower, 0);
        assertFalse(c.attack);
        assertEquals(0, c.ahead, 0);
    }

    // ---- SHIELD-5: the round's exits

    @Test
    @Tag("SHIELD-5")
    @DisplayName("an enemy within 100 px ends shield mode for the round, and that tick is the duel's")
    void closeExit() {
        scan(1);
        assertNull(mode.tick(situation(2, MY_Y + 99, 0)));
        assertFalse(mode.active());
        assertEquals("SH,0,2,exit,close", records.get(records.size() - 1));
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("a ram ends it for the round")
    void rammedExit() {
        scan(1);
        mode.onRammed();
        assertFalse(mode.active());
        assertEquals("SH,0,1,exit,rammed", records.get(records.size() - 1));
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("duress ends it for the round")
    void duressExit() {
        scan(1);
        mode.onDuress(10);
        assertFalse(mode.active());
        assertEquals("SH,0,10,exit,duress", records.get(records.size() - 1));
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("120 ticks without an enemy shot end it for the round; a shot restarts the count")
    void quietExit() {
        scan(1);
        assertNotNull(tick(119));
        mode.onEnemyShot(100, 1.0);
        assertNotNull(tick(219), "a shot at 100 keeps it on to 219");
        assertNull(tick(220));
        assertFalse(mode.active());
        assertEquals("SH,0,220,exit,quiet", records.get(records.size() - 1));
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("two bullets that no predictor foresaw end it for the round")
    void unpredictedExit() {
        scan(1);
        mode.onHitByBullet(30, 0.5, MY_X, MY_Y + 18, Math.PI);
        assertTrue(mode.active(), "one is not yet a pattern");
        mode.onHitByBullet(60, 0.5, MY_X, MY_Y + 18, Math.PI);
        assertFalse(mode.active());
        assertEquals("SH,0,60,exit,unpredicted", records.get(records.size() - 1));
    }

    /** Feeds a still enemy's scans and a head-on shot of power 0.1 fired at {@code fireTime}, hits us at {@code hitTime}. */
    private void predictedHit(long fireTime, long hitTime) {
        for (long t = fireTime - 1; t <= fireTime + 1; t++) scan(t);
        mode.onEnemyShot(fireTime, 0.1);
        double speed = 20 - 3 * 0.1;
        double travelled = speed * (hitTime - fireTime);
        // Head-on from the enemy at (400, 500) to us at (400, 100): straight south.
        mode.onHitByBullet(hitTime, 0.1, ENEMY_X, ENEMY_Y - travelled, Math.PI);
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("a bullet fired head-on at us is foreseen by the head-on predictor, so it is no unpredicted hit")
    void headOnIsPredicted() {
        scan(1);
        predictedHit(10, 10 + 21);
        predictedHit(40, 40 + 21);
        assertTrue(mode.active(), "two foreseen hits of 0.1 end nothing");
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("three hits taken, more than we shot down, end it for the round")
    void outhitExit() {
        scan(1);
        predictedHit(10, 31);
        predictedHit(40, 61);
        assertTrue(mode.active());
        predictedHit(70, 91);
        assertFalse(mode.active());
        assertEquals("SH,0,91,exit,outhit", records.get(records.size() - 1));
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("hits are weighed against the bullets we shot down")
    void interceptsCountAgainstHits() {
        scan(1);
        for (long t = 5; t < 9; t++) scan(t);
        mode.onEnemyShot(6, 0.1);
        mode.onIntercepted(20, 0.1, ENEMY_X, ENEMY_Y - 14);
        mode.onIntercepted(25, 0.1, ENEMY_X, ENEMY_Y - 14);
        mode.onIntercepted(30, 0.1, ENEMY_X, ENEMY_Y - 14);
        assertEquals(3, mode.intercepts());
        predictedHit(40, 61);
        predictedHit(70, 91);
        predictedHit(100, 121);
        assertTrue(mode.active(), "three hits against three interceptions is not 'outhit'");
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("a round's exit lasts that round only")
    void exitIsPerRound() {
        scan(1);
        mode.onRammed();
        mode.newRound(1);
        scan(1);
        assertTrue(mode.active());
        assertFalse(mode.battleOff());
    }

    // ---- SHIELD-6: the battle's budget

    @Test
    @Tag("SHIELD-6")
    @DisplayName("damage past what holds the share at 85% leaves shield mode for the battle")
    void budgetExit() {
        // A one-round battle allows 60 * 15/85, about 10.6 damage: one hit of 1.95 (9.7) is within, two (19.4) are over.
        mode = new ShieldMode(ShieldList.parse(List.of("list.Target")), records::add, 1);
        scan(1);
        mode.onHitByBullet(30, 1.95, MY_X, MY_Y, Math.PI);
        assertFalse(mode.battleOff(), "9.7 damage is within 10.6");
        mode.onHitByBullet(60, 1.95, MY_X, MY_Y, Math.PI);
        assertTrue(mode.battleOff());
        assertFalse(mode.active());
        assertEquals("SH,0,60,off,budget", records.get(records.size() - 1));
    }

    @Test
    @Tag("SHIELD-6")
    @DisplayName("once left for the battle it stays left at every later round")
    void budgetExitLastsTheBattle() {
        mode = new ShieldMode(ShieldList.parse(List.of("list.Target")), records::add, 1);
        scan(1);
        mode.onHitByBullet(30, 3.0, MY_X, MY_Y, Math.PI);
        assertTrue(mode.battleOff());
        mode.newRound(1);
        scan(1);
        mode.newRound(2);
        scan(1);
        assertFalse(mode.active());
        assertEquals(0, count("SH,1,") + count("SH,2,"), "no further SH record");
    }

    @Test
    @Tag("SHIELD-6")
    @DisplayName("the allowance is the whole battle's: a 35-round battle affords twenty full-power hits in round 0")
    void theWholeBattleIsAffordedFromTheStart() {
        scan(1);
        // 35 rounds allow about 370 damage; twenty hits of 3.0 are 320.
        for (int i = 0; i < 20; i++) mode.onHitByBullet(30 + 20 * i, 3.0, MY_X, MY_Y, Math.PI);
        assertFalse(mode.battleOff());
        assertEquals(370.6, mode.budget().allowed(), 0.1);
        for (int i = 20; i < 24; i++) mode.onHitByBullet(30 + 20 * i, 3.0, MY_X, MY_Y, Math.PI);
        assertTrue(mode.battleOff(), "twenty-four hits (384) are past it");
    }

    @Test
    @Tag("SHIELD-6")
    @DisplayName("rounds won or lost do not move the allowance: a loss shows in the damage taken")
    void roundResultsDoNotMoveIt() {
        scan(1);
        double before = mode.budget().allowed();
        mode.onRoundEnded(500, true);
        mode.newRound(1);
        scan(1);
        mode.onRoundEnded(500, false);
        assertEquals(before, mode.budget().allowed(), 1e-12);
    }

    @Test
    @Tag("SHIELD-6")
    @DisplayName("our own hits on the enemy are counted in our favour")
    void ourDamageRaisesIt() {
        scan(1);
        double before = mode.budget().allowed();
        mode.onOurBulletHit(1.0);
        assertTrue(mode.budget().allowed() > before);
    }

    @Test
    @Tag("SHIELD-6")
    @DisplayName("the round record gives the counts and the budget")
    void roundRecord() {
        scan(1);
        mode.onHitByBullet(30, 0.5, MY_X, MY_Y, Math.PI);
        mode.onRoundEnded(200, true);
        String sr = records.stream().filter(r -> r.startsWith("SR,")).findFirst().orElseThrow();
        assertEquals("SR,0,200,0,0,1,1,0,2.0,370.6,-", sr);
    }

    // ---- shield bullets are told from attack bullets

    @Test
    @Tag("SHIELD-5")
    @DisplayName("a bullet of ours that was not shot at an enemy bullet is not a shield bullet")
    void notAShieldBullet() {
        scan(1);
        assertFalse(mode.ownBulletResolved(1.9));
    }
}
