package hadur117.core.gun;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur117.core.physics.BattleField;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** POW-13: the duel's close-range power band, shipped as 3.17's (2.95 inside 150 px). */
class ClosePowerTest {

    @Test
    @Tag("POW-13")
    @DisplayName("the duel fires 2.95 inside the close range and 1.95 beyond it; the shipped band is 150 px")
    void shippedBand() {
        GunController g = new GunController(new BattleField(800, 600), 1);
        assertEquals(150.0, GunController.CLOSE_RANGE, 1e-12);
        assertEquals(2.95, GunController.CLOSE_POWER, 1e-12);
        assertEquals(2.95, g.calculateBulletPower(140, 80, 80, 1), 1e-12);
        assertEquals(1.95, g.calculateBulletPower(175, 80, 80, 1), 1e-12, "150 to 200 px stays 1.95 until close200");
    }
}
