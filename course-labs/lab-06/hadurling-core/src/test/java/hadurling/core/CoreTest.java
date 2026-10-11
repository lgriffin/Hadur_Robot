package hadurling.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadurling.core.gun.HeadOnGun;
import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/** The core needs no engine: build an Input by hand and read the Orders. */
class CoreTest {

    private static Input input(long time, double gunHeat, Event... events) {
        return new Input(time, 400, 300, 0, 0, 100, gunHeat, 0, 0, List.of(events));
    }

    private static Event.Scan enemyAhead() {
        return new Event.Scan("foe", 0, 200, 100, 0, 0);
    }

    @Test
    @DisplayName("before it has seen the enemy, the core sweeps the radar")
    void sweepsWhenBlind() {
        Orders o = new Core().tick(input(1, 0));
        assertEquals(Double.POSITIVE_INFINITY, o.radarTurn());
        assertEquals(0, o.firePower());
    }

    @Test
    @DisplayName("with the enemy dead ahead it turns side-on and fires when the gun is cool")
    void firesAtEnemyAhead() {
        Orders o = new Core().tick(input(1, 0, enemyAhead()));
        assertEquals(Math.PI / 2, o.bodyTurn(), 1e-12);
        assertEquals(HeadOnGun.POWER, o.firePower());
        assertEquals(0, o.gunTurn(), 1e-12);
    }

    @Test
    @DisplayName("a hot gun does not fire")
    void hotGunHoldsFire() {
        assertEquals(0, new Core().tick(input(1, 0.4, enemyAhead())).firePower());
    }

    @Test
    @DisplayName("the radar overshoots the enemy to keep it in view")
    void radarOvershoots() {
        Event.Scan right = new Event.Scan("foe", Math.PI / 4, 200, 100, 0, 0);
        Orders o = new Core().tick(input(1, 0, right));
        assertEquals(Math.PI / 2, o.radarTurn(), 1e-12);
    }

    @Test
    @DisplayName("a wall hit reverses the direction of travel")
    void wallHitReverses() {
        Core core = new Core();
        assertTrue(core.tick(input(1, 0)).ahead() > 0);
        assertTrue(core.tick(input(2, 0, new Event.HitWall(0))).ahead() < 0);
    }
}
