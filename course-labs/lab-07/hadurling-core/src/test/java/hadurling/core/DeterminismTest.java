package hadurling.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** Feed two fresh cores the same inputs; they must answer the same, tick by tick. */
class DeterminismTest {

    /** A made-up round: an enemy appears, circles, we hit a wall, the enemy goes quiet. */
    private static List<Input> script() {
        List<Input> ticks = new ArrayList<>();
        for (int t = 0; t < 60; t++) {
            List<Event> events = new ArrayList<>();
            if (t >= 5 && t % 3 != 0) {
                events.add(new Event.Scan("foe", 0.3 * Math.sin(t / 7.0), 250 - t, 100, t / 10.0, 3));
            }
            if (t == 30) events.add(new Event.HitWall(0.0));
            ticks.add(new Input(t, 300 + t, 200, (t / 20.0) % 6, 4, 100,
                t % 9 == 0 ? 0 : 0.3, t / 15.0, t / 12.0, events));
        }
        return ticks;
    }

    private static List<Orders> run(List<Input> inputs) {
        Core core = new Core();
        List<Orders> out = new ArrayList<>();
        for (Input in : inputs) out.add(core.tick(in));
        return out;
    }

    @Test

    @Tag("HL-2")
    @DisplayName("the same inputs twice give equal orders")
    void sameInputsSameOrders() {
        assertEquals(run(script()), run(script()));
    }

    @Test
    @DisplayName("a guard around the core does not change healthy answers")
    void guardIsTransparent() {
        Core core = new Core();
        Guard guard = new Guard(core::tick, line -> { });
        List<Orders> guarded = new ArrayList<>();
        for (Input in : script()) guarded.add(guard.tick(in));
        assertEquals(run(script()), guarded);
        assertEquals(0, guard.faultsThisRound());
    }
}
