package hadur2.core.duel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.physics.BattleField;
import hadur2.core.policy.TickBudget;
import hadur2.core.port.Telemetry;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RES-9 (retired), RES-14: after three skipped turns in a round the core orbits, fires head-on and learns nothing. */
@Tag("RES-14")
class DuressTest {

    private static final Point2D.Double ENEMY = new Point2D.Double(400, 500);

    private static BotInput input(long time, double x, double y, double heading, double gunHeat,
                                  double gunHeading, double energy) {
        return new BotInput(time, 0, x, y, heading, 0, energy, gunHeat, 0.1, gunHeading, 0, 0, 1, List.of());
    }

    @Test
    @DisplayName("the budget goes into duress on the third skipped turn of a round and leaves it with the round")
    void budgetThirdSkip() {
        TickBudget b = new TickBudget();
        b.newRound();
        b.skippedTurn(0);
        b.skippedTurn(0);
        assertFalse(b.duress());
        b.skippedTurn(0);
        assertTrue(b.duress());
        b.newRound();
        assertFalse(b.duress());
    }

    @Test
    @DisplayName("RES-14: duress ends 300 ticks after the last skipped turn, and only then")
    void budgetDuressEndsAfterQuietTicks() {
        TickBudget b = new TickBudget();
        b.newRound();
        b.tickBegan(10);
        b.skippedTurn(10);
        b.tickBegan(20);
        b.skippedTurn(20);
        b.tickBegan(142);
        b.skippedTurn(142);
        assertTrue(b.duress(), "the third skip of the round");
        b.tickBegan(142 + 299);
        assertTrue(b.duress(), "299 ticks after the last skip");
        b.tickBegan(142 + 300);
        assertFalse(b.duress(), "300 ticks without a skipped turn");
        b.tickBegan(142 + 301);
        assertFalse(b.duress());
    }

    @Test
    @DisplayName("RES-14: the 300 ticks count from the last skipped turn, not the round's clock or the first skip")
    void budgetQuietCountsFromTheLastSkip() {
        TickBudget b = new TickBudget();
        b.newRound();
        for (long t : new long[] {8, 34, 142}) {
            b.tickBegan(t);
            b.skippedTurn(t);
        }
        b.tickBegan(400);
        assertTrue(b.duress(), "tick 400 is past 300 from the first skip but only 258 from the last");
        b.tickBegan(442);
        assertFalse(b.duress());
    }

    @Test
    @DisplayName("RES-14: a skipped turn after duress has ended starts it again, with the round's three already counted")
    void budgetSkipRestartsDuress() {
        TickBudget b = new TickBudget();
        b.newRound();
        for (long t : new long[] {5, 6, 7}) {
            b.tickBegan(t);
            b.skippedTurn(t);
        }
        b.tickBegan(400);
        assertFalse(b.duress());
        b.skippedTurn(400);
        assertTrue(b.duress(), "a fourth skip, no new triple needed");
        b.tickBegan(700);
        assertFalse(b.duress());
    }

    @Test
    @DisplayName("RES-14: a skip delivered late counts from the tick the engine skipped, not the tick it arrives on")
    void budgetQuietCountsFromTheSkippedTickOfALateEvent() {
        TickBudget b = new TickBudget();
        b.newRound();
        b.tickBegan(100);
        b.skippedTurn(100);
        b.skippedTurn(101);
        b.tickBegan(250);
        b.skippedTurn(102); // delivered 148 ticks after the tick it names
        b.tickBegan(401);
        assertTrue(b.duress(), "299 ticks after tick 102");
        b.tickBegan(402);
        assertFalse(b.duress(), "300 ticks after tick 102, though only 152 after the delivery");
    }

    @Test
    @DisplayName("RES-14: the trigger is unchanged: two skips, however recent, are not duress")
    void budgetTwoSkipsAreNotDuress() {
        TickBudget b = new TickBudget();
        b.newRound();
        b.tickBegan(30);
        b.skippedTurn(30);
        b.tickBegan(31);
        b.skippedTurn(31);
        assertFalse(b.duress());
    }

    @Test
    @DisplayName("a cool gun on the enemy fires power 1.0, a hot gun does not")
    void firesWhenCoolAndAimed() {
        Duress d = new Duress(new BattleField(800, 600));
        BotOrders.Builder b = BotOrders.builder();
        // Enemy due north of us, the gun already pointing north.
        assertTrue(d.orders(input(1, 400, 200, 0, 0, 0, 100), ENEMY, b));
        assertEquals(1.0, b.build().firePower(), 1e-9);
        b = BotOrders.builder();
        assertFalse(d.orders(input(2, 400, 200, 0, 1.2, 0, 100), ENEMY, b));
        assertEquals(0.0, b.build().firePower(), 1e-9);
    }

    @Test
    @DisplayName("a stale enemy position sweeps the radar and holds fire")
    void staleSpotSweepsAndHoldsFire() {
        Duress d = new Duress(new BattleField(800, 600));
        BotOrders.Builder b = BotOrders.builder();
        assertFalse(d.orders(input(1, 400, 200, 0, 0, 0, 100), ENEMY, true, b));
        BotOrders o = b.build();
        assertTrue(Double.isInfinite(o.radarTurn()), "a sweep, not a lock on an empty spot");
        assertEquals(0.0, o.firePower(), 1e-9);
    }

    @Test
    @DisplayName("a gun far off the enemy turns toward it without firing")
    void turnsBeforeFiring() {
        Duress d = new Duress(new BattleField(800, 600));
        BotOrders.Builder b = BotOrders.builder();
        assertFalse(d.orders(input(1, 400, 200, 0, 0, Math.PI / 2, 100), ENEMY, b));
        BotOrders o = b.build();
        assertTrue(o.gunTurn() < 0, "the enemy is anticlockwise of a gun pointing east");
        assertEquals(0.0, o.firePower(), 1e-9);
    }

    @Test
    @DisplayName("power is held under the robot's own energy")
    void powerNeverSpendsTheLastEnergy() {
        Duress d = new Duress(new BattleField(800, 600));
        BotOrders.Builder b = BotOrders.builder();
        assertTrue(d.orders(input(1, 400, 200, 0, 0, 0, 0.5), ENEMY, b));
        assertEquals(0.4, b.build().firePower(), 1e-9);
        b = BotOrders.builder();
        assertFalse(d.orders(input(2, 400, 200, 0, 0, 0, 0.1), ENEMY, b));
    }

    @Test
    @DisplayName("the orbit moves side-on to the enemy, and reverses within the longest run")
    void orbitsAndReverses() {
        Duress d = new Duress(new BattleField(2000, 2000));
        Point2D.Double enemy = new Point2D.Double(1000, 1400);
        List<Double> turns = new ArrayList<>();
        int reversals = 0;
        double last = 0;
        for (long t = 0; t < 200; t++) {
            BotOrders.Builder b = BotOrders.builder();
            // Always facing east, 400 px south of the enemy: tangent is east or west.
            d.orders(input(t, 1000, 1000, Math.PI / 2, 5, 0, 100), enemy, b);
            BotOrders o = b.build();
            double dir = Math.signum(o.ahead());
            if (last != 0 && dir != last) reversals++;
            if (dir != 0) last = dir;
            turns.add(o.bodyTurn());
        }
        assertTrue(reversals >= 200 / (15 + 30) - 1, "a reversal at least every 45 ticks, saw " + reversals);
        assertTrue(reversals <= 200 / 15, "no reversal faster than every 15 ticks, saw " + reversals);
    }

    @Test
    @DisplayName("the same round makes the same orders, and a different round reverses on other ticks")
    void deterministic() {
        assertEquals(trace(3), trace(3));
        assertNotEquals(trace(3), trace(4));
    }

    private static List<Double> trace(int round) {
        Duress d = new Duress(new BattleField(2000, 2000));
        d.newRound(round);
        List<Double> out = new ArrayList<>();
        for (long t = 0; t < 120; t++) {
            BotOrders.Builder b = BotOrders.builder();
            d.orders(input(t, 1000, 1000, Math.PI / 2, 5, 0, 100), new Point2D.Double(1000, 1400), b);
            out.add(b.build().ahead());
        }
        return out;
    }

    @Test
    @DisplayName("near a wall the smoothed heading never drives into it")
    void staysOffTheWall() {
        Duress d = new Duress(new BattleField(800, 600));
        // 20 px from the south wall, enemy to the north: tangent runs along the wall.
        Point2D.Double me = new Point2D.Double(400, 40);
        for (long t = 0; t < 60; t++) {
            BotOrders.Builder b = BotOrders.builder();
            d.orders(new BotInput(t, 0, me.x, me.y, Math.PI / 2, 0, 100, 5, 0.1, 0, 0, 0, 1, List.of()),
                new Point2D.Double(400, 400), b);
            BotOrders o = b.build();
            assertFalse(Double.isNaN(o.bodyTurn()) || Double.isNaN(o.ahead()));
        }
    }

    @Test
    @DisplayName("the core runs three skipped turns' worth of round in duress and a new round out of it")
    void coreEntersDuressAfterThreeSkips() {
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE);
        core.newRound(0);
        long t = 1;
        BotEvent scan = new BotEvent.Scan("enemy 1.0", 0, 300, 100, 0, 0);
        core.tick(new BotInput(t++, 0, 400, 200, 0, 0, 100, 3, 0.1, 0, 0, 0, 1, List.of(scan)));
        for (int i = 0; i < 3; i++) {
            core.tick(new BotInput(t++, 0, 400, 200, 0, 0, 100, 3, 0.1, 0, 0, 0, 1,
                List.of(new BotEvent.SkippedTurn(t), scan)));
        }
        assertEquals(0, core.stats().duressTicks);
        BotOrders o = core.tick(new BotInput(t++, 0, 400, 200, 0, 0, 100, 0, 0.1, 0, 0, 0, 1, List.of(scan)));
        assertEquals(1, core.stats().duressTicks);
        assertEquals(1.0, o.firePower(), 1e-9);
        core.newRound(1);
        core.tick(new BotInput(t++, 1, 400, 200, 0, 0, 100, 0, 0.1, 0, 0, 0, 1, List.of(scan)));
        assertEquals(0, core.stats().duressTicks);
    }
}
