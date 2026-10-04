package hadurling.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/** The guard is tested with a core that fails on purpose: a test double. */
class GuardTest {

    private static Input input(long time, double velocity, Event... events) {
        return new Input(time, 400, 300, 0, velocity, 100, 0, 0, 0, List.of(events));
    }

    private static final Function<Input, Orders> THROWS = in -> {
        throw new IllegalStateException("boom");
    };

    @Test
    @DisplayName("a healthy core's orders pass through untouched")
    void passesThrough() {
        Orders expected = Orders.builder().ahead(7).build();
        Guard guard = new Guard(in -> expected, line -> { });
        assertEquals(expected, guard.tick(input(1, 0)));
        assertEquals(0, guard.faultsThisRound());
    }

    @Test
    @DisplayName("when the core throws, the guard returns safe orders: drive, no fire")
    void safeOrdersOnThrow() {
        Guard guard = new Guard(THROWS, line -> { });
        Orders o = guard.tick(input(1, 0));
        assertEquals(Guard.SAFE_DISTANCE, o.ahead());
        assertEquals(0, o.firePower());
        assertEquals(Double.POSITIVE_INFINITY, o.radarTurn());
    }

    @Test
    @DisplayName("safe orders keep the direction of travel")
    void keepsDirection() {
        Guard guard = new Guard(THROWS, line -> { });
        assertEquals(-Guard.SAFE_DISTANCE, guard.tick(input(1, -4)).ahead());
    }

    @Test
    @DisplayName("a null result counts as a fault")
    void nullIsAFault() {
        Guard guard = new Guard(in -> null, line -> { });
        assertEquals(Guard.SAFE_DISTANCE, guard.tick(input(1, 0)).ahead());
        assertEquals(1, guard.faultsThisRound());
    }

    @Test
    @DisplayName("an Error is caught too, not only exceptions")
    void errorsAreCaught() {
        Guard guard = new Guard(in -> { throw new StackOverflowError(); }, line -> { });
        assertEquals(Guard.SAFE_DISTANCE, guard.tick(input(1, 0)).ahead());
    }

    @Test
    @DisplayName("faults are counted every tick but logged once per round")
    void loggedOncePerRound() {
        List<String> log = new ArrayList<>();
        Guard guard = new Guard(THROWS, log::add);
        guard.tick(input(1, 0));
        guard.tick(input(2, 0));
        guard.tick(input(3, 0));
        assertEquals(3, guard.faultsThisRound());
        assertEquals(1, log.size());
        assertTrue(log.get(0).startsWith("FAULT,1,IllegalStateException"));

        guard.newRound();
        assertEquals(0, guard.faultsThisRound());
        guard.tick(input(4, 0));
        assertEquals(2, log.size());
    }

    @Test
    @DisplayName("safe orders still lock onto the enemy seen on the tick the core failed")
    void remembersEnemy() {
        Guard guard = new Guard(THROWS, line -> { });
        Orders o = guard.tick(input(1, 0, new Event.Scan("foe", 0.5, 200, 100, 0, 0)));
        assertFalse(Double.isInfinite(o.radarTurn()));
        assertEquals(1.0, o.radarTurn(), 1e-12);
        assertEquals(0.5 + Math.PI / 2, o.bodyTurn(), 1e-12);
    }
}
