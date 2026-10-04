package hadurling.core.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ModelTest {

    private static Input input(List<Event> events) {
        return new Input(5, 100, 200, 0.5, 4, 100, 0, 1.0, 1.5, events);
    }

    @Test
    @DisplayName("Input copies the event list it is given")
    void inputCopiesEvents() {
        List<Event> events = new ArrayList<>(List.of(new Event.HitWall(0.1)));
        Input in = input(events);
        events.add(new Event.RobotDeath("x"));
        assertEquals(1, in.events().size());
    }

    @Test
    @DisplayName("Input's event list cannot be changed")
    void inputEventsAreUnmodifiable() {
        Input in = input(List.of());
        assertThrows(UnsupportedOperationException.class, () -> in.events().add(new Event.HitWall(0)));
    }

    @Test
    @DisplayName("equal values are equal, and different values are not")
    void equality() {
        assertEquals(input(List.of(new Event.HitWall(0.1))), input(List.of(new Event.HitWall(0.1))));
        assertEquals(input(List.of()).hashCode(), input(List.of()).hashCode());
        assertNotEquals(input(List.of(new Event.HitWall(0.1))), input(List.of(new Event.HitWall(0.2))));
        assertNotEquals(new Event.HitWall(0.1), new Event.RobotDeath("a"));
    }

    @Test
    @DisplayName("Orders.NONE changes nothing; NaN equals NaN")
    void ordersNone() {
        assertEquals(Orders.NONE, Orders.builder().build());
        assertEquals(0, Orders.NONE.firePower());
        assertEquals(true, Double.isNaN(Orders.NONE.bodyTurn()));
    }

    @Test
    @DisplayName("the builder sets only what it is told to")
    void ordersBuilder() {
        Orders o = Orders.builder().ahead(50).fire(1).build();
        assertEquals(50, o.ahead());
        assertEquals(1, o.firePower());
        assertEquals(true, Double.isNaN(o.gunTurn()));
    }
}
