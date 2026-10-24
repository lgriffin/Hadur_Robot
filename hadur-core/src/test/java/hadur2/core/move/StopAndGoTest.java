package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BotOrders;
import hadur2.core.model.RobotState;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import hadur2.core.shieldmode.ShieldList;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * POISON-1's stop-and-go and POISON-2's table entries. The enemy stands at the middle of an
 * 800 x 600 field and fires power 3 (heat 1.6, cooling 0.1 a tick) whenever its gun is cool.
 */
class StopAndGoTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final MovementPredictor PREDICTOR = new MovementPredictor(FIELD);
    static final Point2D.Double ENEMY = new Point2D.Double(400, 300);

    private static RobotState state(double x, double y, double heading, double velocity) {
        return RobotState.newBuilder().setLocation(new Point2D.Double(x, y))
            .setHeading(heading).setVelocity(velocity).setTime(0).build();
    }

    @Test
    @Tag("POISON-1")
    @DisplayName("crawl while the gun cools, crawl back just before it is ready, go once it has fired")
    void phases() {
        StopAndGo s = new StopAndGo(FIELD, StopAndGo.PREFIRE_TICKS);
        s.initRound();
        RobotState me = state(400, 100, Math.PI / 2, 0);
        BotOrders.Builder o = BotOrders.builder();
        assertEquals(StopAndGo.Phase.STOP, s.move(o, me, ENEMY, 3.0, 0.1, Long.MIN_VALUE), "no shot yet");
        double crawl = o.build().ahead();
        assertEquals(StopAndGo.CRAWL, Math.abs(crawl), 1e-12);
        o = BotOrders.builder();
        assertEquals(StopAndGo.Phase.REVERSE, s.move(o, me, ENEMY, 0.1, 0.1, Long.MIN_VALUE), "one tick to ready");
        assertEquals(-crawl, o.build().ahead(), 1e-12, "the other way");
        o = BotOrders.builder();
        assertEquals(StopAndGo.Phase.GO, s.move(o, me, ENEMY, 1.5, 0.1, 10), "it fired at tick 10");
        assertTrue(Math.abs(o.build().ahead()) > 50, "full drive, not a crawl");
        assertEquals(8.0, o.build().maxVelocity(), 1e-12);
        // At full speed the brake needs 5 ticks: 3 ticks to ready is time to stop, not go.
        o = BotOrders.builder();
        assertEquals(StopAndGo.Phase.STOP, s.move(o, state(400, 100, Math.PI / 2, 8), ENEMY, 0.3, 0.1, 10));
        StopAndGo shift = new StopAndGo(FIELD, StopAndGo.PREFIRE_TICKS_SHIFT);
        shift.initRound();
        assertEquals(StopAndGo.Phase.REVERSE, shift.move(BotOrders.builder(), me, ENEMY, 0.2, 0.1, 10),
            "the shift variant turns round two ticks early");
    }

    @Test
    @Tag("POISON-1")
    @DisplayName("over 400 ticks the enemy always fires at a robot all but stopped, and we keep our distance")
    void firesAtAStillRobot() {
        StopAndGo s = new StopAndGo(FIELD, StopAndGo.PREFIRE_TICKS);
        s.initRound();
        RobotState me = state(400, 120, 0, 0);
        double heat = 1.6;
        long lastShot = Long.MIN_VALUE;
        int shots = 0;
        double fastest = 0;
        double travelled = 0;
        for (long t = 0; t < 400; t++) {
            if (heat <= 1e-9) {
                // The enemy fires now, aiming from where we are and how fast we go.
                shots++;
                fastest = Math.max(fastest, Math.abs(me.velocity));
                lastShot = t;
                heat = 1.6;
            }
            BotOrders.Builder o = BotOrders.builder();
            s.move(o, me, ENEMY, heat, 0.1, lastShot);
            BotOrders b = o.build();
            RobotState next = PREDICTOR.predict(me, b.ahead(), b.bodyTurn(), b.maxVelocity(), 1, false);
            travelled += next.location.distance(me.location);
            me = RobotState.newBuilder().setLocation(next.location).setHeading(next.heading)
                .setVelocity(next.velocity).setTime(t + 1).build();
            heat = Math.max(0, heat - 0.1);
            double d = me.location.distance(ENEMY);
            assertTrue(d > 120, "tick " + t + ": " + d + " px from the enemy");
        }
        assertTrue(shots >= 20, shots + " shots");
        assertTrue(fastest <= 1.0, "fastest at a shot " + fastest);
        assertTrue(travelled > 400 * 3, "we went somewhere: " + travelled + " px");
    }

    @Test
    @Tag("POISON-2")
    @DisplayName("the table's stop-go: and stop-go2: lines name the variant; others get none")
    void tableEntries() {
        ShieldList list = ShieldList.parse(List.of(ShieldList.STOP_GO_PREFIX + " a.Surfer 1.0",
            ShieldList.STOP_GO_SHIFT_PREFIX + " b.Shifter"));
        assertEquals(1, list.stopGo("a.Surfer 1.0"));
        assertEquals(2, list.stopGo("b.Shifter 2.3"), "matched without its version");
        assertEquals(0, list.stopGo("c.Other 1.0"));
        assertEquals(0, ShieldList.NONE.stopGo("a.Surfer 1.0"));
    }
}
