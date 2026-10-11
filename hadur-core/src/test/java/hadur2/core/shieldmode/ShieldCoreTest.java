package hadur2.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.model.BattleFacts;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * SHIELD-5 and SHIELD-6 through the whole core, on the seams a listed opponent's duel crosses:
 * the shot the gun fires, the duress the budget hears through, and the waves that break while
 * the shield drives. We stand at (200, 300) facing north; the enemy is 400 px due east.
 */
class ShieldCoreTest {

    private static final String ENEMY = "list.Target 1.0";
    private static final double MY_X = 200;
    private static final double MY_Y = 300;

    private final List<String> records = new ArrayList<>();
    private HadurCore core;
    private long time;

    @BeforeEach
    void setUp() {
        start(0);
    }

    private void start(int rounds) {
        BattleFacts facts = new BattleFacts(800, 600, 1, List.of(), "", 100, 0, rounds);
        core = new HadurCore(facts, records::add, null, null, ShieldList.parse(List.of("list.Target")));
        core.newRound(0);
        time = 0;
    }

    /** One tick with the enemy scanned due east; the gun is cool, at {@code gunHeading}. */
    private BotOrders tick(double gunHeading, double enemyEnergy, double distance, BotEvent... extra) {
        List<BotEvent> events = new ArrayList<>(List.of(extra));
        events.add(new BotEvent.Scan(ENEMY, Math.PI / 2, distance, enemyEnergy, 0, 0));
        BotInput in = new BotInput(++time, 0, MY_X, MY_Y, 0, 0, 100, 0, 0.1, gunHeading, 0,
            Math.PI / 2, 1, events);
        return core.tick(in);
    }

    // ---- SHIELD-5: the attack shot is for the aim the gun is on

    @Test
    @Tag("SHIELD-5")
    @DisplayName("a gun that finished some other turn is not on target: no attack shot goes out from it")
    void gunOffTheAimDoesNotFire() {
        // The gun stays pointed north while the enemy is east: its turn remaining is 0 each tick,
        // which the old check took for 'on target'.
        for (int i = 0; i < 80; i++) {
            BotOrders o = tick(0, 100, 400);
            assertEquals(0.0, o.firePower(), 0, "tick " + time + " fired off the aim");
        }
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("a gun that follows its orders onto the aim fires from it, as the main gun does")
    void gunOnTheAimFires() {
        double gun = 0;
        boolean fired = false;
        for (int i = 0; i < 80 && !fired; i++) {
            BotOrders o = tick(gun, 100, 400);
            fired = o.firePower() > 0;
            // The engine turns the gun by the order; the next tick sees it settled on the aim.
            gun += o.gunTurn();
        }
        assertTrue(fired, "a settled aim gets its shot");
    }

    // ---- SHIELD-6: hits taken after skipped turns count against the budget

    @Test
    @Tag("SHIELD-6")
    @DisplayName("a bullet that hits us after three skipped turns still counts against the shield's budget")
    void hitAfterSkipsReachesTheBudget() {
        start(1);
        tick(0, 100, 400);
        // Three skipped turns shed levels for the rest of the round (TIME-2); no duress since 3.11.
        tick(0, 100, 400, new BotEvent.SkippedTurn(1), new BotEvent.SkippedTurn(2),
            new BotEvent.SkippedTurn(3));
        // A one-round battle allows about 10.6; a full-power hit is 16.
        tick(0, 100, 400, new BotEvent.HitByBullet(ENEMY, 3.0, MY_X, MY_Y, Math.PI * 1.5));
        assertTrue(records.stream().anyMatch(r -> r.matches("SH,0,\\d+,off,budget")), records.toString());
    }

    // ---- SHIELD-5: waves that break while the shield drives

    /** The enemy's energy falls by 1.0 at tick 10: a bullet of power 1.0 leaves, and misses us. */
    private void runOneMissedShot() {
        for (int i = 0; i < 60; i++) tick(0, i < 10 ? 100 : 99, 400);
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("an enemy shot that misses while the shield drives is counted in their battle hit rate")
    void missesAreCountedUnderShield() {
        runOneMissedShot();
        assertTrue(core.duel().theirBattleRates().shots() >= 1,
            "the miss is a fact about their gun: " + records);
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("shield-time outcomes do not teach the distance controller or the rolling window, and leave no backlog")
    void shieldOutcomesAreNotMovementEvidence() {
        runOneMissedShot();
        assertEquals(0, core.duel().theirRollingHitRate().samples(), 0,
            "the window learns from our surfing, not from sitting still");
        // Leaving the mode (an enemy at 50 px) hands the next ticks to the duel's own drive: no
        // backlog of shield-time outcomes reaches the policies then.
        for (int i = 0; i < 5; i++) tick(0, 99, 50);
        assertEquals(0, core.duel().theirRollingHitRate().samples(), 0, "nothing was dumped on exit");
        assertFalse(records.stream().anyMatch(r -> r.startsWith("P,0,") && r.contains(",distance,")),
            records.toString());
    }
}
