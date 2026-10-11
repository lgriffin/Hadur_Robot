package hadur2.core.gun;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur2.core.physics.BattleField;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * The lead-aware regime's hold on the duel gun's power (POW-7 to POW-9): it replaces 1.20's
 * cubic power-down and nothing else.
 */
class GunStakesTest {

    static GunController duel() {
        return new GunController(new BattleField(800, 600), 1);
    }

    @Test
    @Tag("POW-7")
    @DisplayName("POW-7: chaff fires the minimum power, whatever the distance or the energies")
    void chaffIsTheMinimum() {
        GunController g = duel();
        assertEquals(0.1, g.calculateBulletPower(400, 80, 80, 1, GunController.Stakes.CHAFF), 1e-12);
        assertEquals(0.1, g.calculateBulletPower(100, 80, 80, 1, GunController.Stakes.CHAFF), 1e-12,
            "even inside 150 px, where the gun's base is 2.95");
        assertEquals(0.1, g.calculateBulletPower(500, 20, 90, 1, GunController.Stakes.CHAFF), 1e-12);
    }

    @Test
    @Tag("POW-8")
    @DisplayName("POW-8, POW-9: the default skips the cubic power-down: 1.95 where 1.20 would have cut it")
    void defaultSkipsThePowerDown() {
        GunController g = duel();
        // 40 energy against 100 beyond 325 px: 1.20's threshold is 63, so it cuts to 1.95 (40/63)^3.
        double normal = g.calculateBulletPower(400, 40, 100, 1, GunController.Stakes.NORMAL);
        assertEquals(1.95 * Math.pow(40.0 / 63.0, 3), normal, 1e-9);
        assertEquals(1.95, g.calculateBulletPower(400, 40, 100, 1, GunController.Stakes.DEFAULT), 1e-12);
        assertEquals(normal, g.calculateBulletPower(400, 40, 100, 1), 1e-12,
            "the four-argument form is the normal one");
    }

    @Test
    @Tag("POW-8")
    @DisplayName("POW-8: the default keeps 1.20's close-range 2.95 and its quarter-of-their-energy cap")
    void defaultKeepsTheOtherCaps() {
        GunController g = duel();
        assertEquals(2.95, g.calculateBulletPower(120, 80, 100, 1, GunController.Stakes.DEFAULT), 1e-12);
        assertEquals(1.0, g.calculateBulletPower(400, 80, 4, 1, GunController.Stakes.DEFAULT), 1e-12,
            "a quarter of 4 energy kills");
        assertEquals(1.5, g.calculateBulletPower(400, 1.5, 100, 1, GunController.Stakes.DEFAULT), 1e-12,
            "and never past our own energy (POW-10 then lowers the shot to what we can pay for)");
    }

    @Test
    @Tag("POW-7")
    @DisplayName("POW-7: the regime leaves a melee battle's power alone")
    void meleeIgnoresStakes() {
        GunController melee = new GunController(new BattleField(1000, 1000), 5);
        assertEquals(melee.calculateBulletPower(400, 80, 80, 5),
            melee.calculateBulletPower(400, 80, 80, 5, GunController.Stakes.CHAFF), 0.0);
    }
}
