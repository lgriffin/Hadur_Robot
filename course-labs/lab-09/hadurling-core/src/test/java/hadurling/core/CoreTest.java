package hadurling.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadurling.core.gun.HeadOnGun;
import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
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

    @Tag("HL-4")
    @DisplayName("a hot gun does not fire")
    void hotGunHoldsFire() {
        assertEquals(0, new Core().tick(input(1, 0.4, enemyAhead())).firePower());
    }

    @Test

    @Tag("HL-3")
    @DisplayName("the radar overshoots the enemy to keep it in view")
    void radarOvershoots() {
        Event.Scan right = new Event.Scan("foe", Math.PI / 4, 200, 100, 0, 0);
        Orders o = new Core().tick(input(1, 0, right));
        assertEquals(Math.PI / 2, o.radarTurn(), 1e-12);
    }

    @Test

    @Tag("HL-5")
    @DisplayName("a wall hit reverses the direction of travel")
    void wallHitReverses() {
        Core core = new Core();
        assertTrue(core.tick(input(1, 0)).ahead() > 0);
        assertTrue(core.tick(input(2, 0, new Event.HitWall(0))).ahead() < 0);
    }

    private static Input scanned(long time, double enemyEnergy) {
        return input(time, 0.4, new Event.Scan("foe", 0, 200, enemyEnergy, 0, 0));
    }

    @Test
    @Tag("HL-13")
    @DisplayName("an energy drop the ledger cannot explain gives the surfer a wave")
    void energyDropIsAShot() {
        Core core = new Core();
        core.tick(scanned(1, 100));
        assertEquals(0, core.enemyWaves());
        core.tick(scanned(2, 98.5));
        assertEquals(1, core.enemyWaves());
    }

    @Test
    @Tag("HL-13")
    @DisplayName("a drop smaller than 0.1 or bigger than 3.0 is not a bullet")
    void otherDropsAreNot() {
        Core core = new Core();
        core.tick(scanned(1, 100));
        core.tick(scanned(2, 99.95));
        core.tick(scanned(3, 96.0));
        assertEquals(0, core.enemyWaves());
    }

    @Test
    @DisplayName("an enemy seen again after a long gap is not compared with a stale energy")
    void staleScanIsIgnored() {
        Core core = new Core();
        core.tick(scanned(1, 100));
        core.tick(scanned(50, 98));
        assertEquals(0, core.enemyWaves());
    }

    @Test
    @Tag("HL-16")
    @DisplayName("our own hit explains the drop: no wave")
    void ourHitIsNotAShot() {
        Core core = new Core();
        core.tick(scanned(1, 100));
        core.tick(input(2, 0.4, new Event.BulletHit("foe", 0.5), new Event.Scan("foe", 0, 200, 98, 0, 0)));
        assertEquals(0, core.enemyWaves());
    }

    @Test
    @Tag("HL-16")
    @DisplayName("our hit and its shot in one interval: the shot still makes a wave")
    void shotBehindOurHit() {
        Core core = new Core();
        core.tick(scanned(1, 100));
        core.tick(input(2, 0.4, new Event.BulletHit("foe", 0.5), new Event.Scan("foe", 0, 200, 96.5, 0, 0)));
        assertEquals(1, core.enemyWaves());
    }

    @Test
    @Tag("HL-16")
    @DisplayName("its bullet hitting us refunds energy, which must not hide its shot")
    void refundDoesNotHideAShot() {
        Core core = new Core();
        core.tick(scanned(1, 100));
        core.tick(input(2, 0.4, new Event.HitByBullet("foe", 2.0), new Event.Scan("foe", 0, 200, 104, 0, 0)));
        assertEquals(1, core.enemyWaves());
    }
}
