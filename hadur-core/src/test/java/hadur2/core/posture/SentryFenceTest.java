package hadur2.core.posture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BotOrders;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SentryFenceTest {

    private final SentryFence fence = new SentryFence(1000, 1000);

    @Test
    @Tag("GATE-3")
    @DisplayName("GATE-3: orders that stay clear of the border pass untouched")
    void clearOrdersPass() {
        BotOrders o = new BotOrders(0.1, 50, 8, 0.2, 0.3, 1.5);
        assertSame(o, fence.apply(500, 500, 0, 0, o, 100));
    }

    @Test
    @Tag("GATE-3")
    @DisplayName("GATE-3: orders heading into the border zone turn toward the centre")
    void ordersIntoTheZoneAreReplaced() {
        // Near the north border (inset 148 px: safe up to y = 852), going north at full speed.
        BotOrders o = new BotOrders(0, 400, 8, 0.2, 0.3, 1.5);
        BotOrders f = fence.apply(500, 800, 0, 8, o, 100);
        assertNotEquals(o, f);
        // Backing up south is the drive to the centre, keeping the gun, radar and shot.
        assertTrue(f.ahead() < 0, "ahead " + f.ahead());
        assertEquals(0.2, f.gunTurn());
        assertEquals(0.3, f.radarTurn());
        assertEquals(1.5, f.firePower());
    }

    @Test
    @Tag("GATE-3")
    @DisplayName("GATE-3: a robot already inside the zone heads for the centre")
    void insideTheZoneLeaves() {
        BotOrders f = fence.apply(60, 500, Math.PI / 2, 0, new BotOrders(0, 0, 8, 0, 0, 0), 100);
        assertTrue(f.ahead() > 0, "ahead " + f.ahead());
        assertEquals(0, f.bodyTurn(), 1e-9);
    }

    @Test
    @Tag("GATE-3")
    @DisplayName("GATE-3: no border, or one leaving no room, fences nothing")
    void noBorderNoFence() {
        BotOrders o = new BotOrders(0, 400, 8, 0, 0, 0);
        assertSame(o, fence.apply(500, 800, 0, 8, o, 0));
        assertFalse(new SentryFence(200, 200).enforceable(100));
        assertSame(o, new SentryFence(200, 200).apply(100, 180, 0, 8, o, 100));
    }

    @Test
    @DisplayName("the simulated speed follows the engine's acceleration and braking")
    void velocityModel() {
        assertEquals(1, SentryFence.nextVelocity(0, 100, 8));
        assertEquals(8, SentryFence.nextVelocity(8, 100, 8));
        assertEquals(6, SentryFence.nextVelocity(8, -100, 8));
        assertEquals(6, SentryFence.nextVelocity(8, 100, 4), 1e-9);
        assertEquals(3, SentryFence.nextVelocity(4, 3, 8));
        assertEquals(0, SentryFence.nextVelocity(1, 0, 8));
    }
}
