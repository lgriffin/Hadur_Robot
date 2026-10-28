package hadur117.nano;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The bullet-power table (SANARO-2, SANARO-8), held to sanaro/table.py's formula. */
class SanaroTableTest {

    static double base(int energy) {
        return energy >= 120 ? 3.0 : Math.min(2.5, 0.1 + energy / 16.0);
    }

    static double kill(int enemy) {
        double p = enemy < 4 ? enemy / 4.0 : (enemy + 2) / 6.0;
        return Math.max(0.1, p + 0.025);
    }

    static double damage(double power) {
        return 4 * power + Math.max(0, 2 * (power - 1));
    }

    @Test
    @Tag("SANARO-2")
    @DisplayName("every index the bot can reach, own and enemy energy 0 to 400, is in the table")
    void noIndexOffTheEnd() {
        int top = (400 << 7) + 400;
        assertTrue(Sanaro.POWER.length() > top, "table " + Sanaro.POWER.length() + " cells, index up to " + top);
    }

    @Test
    @Tag("SANARO-8")
    @DisplayName("each cell is the lesser of the base power and the kill power, in fortieths")
    void cellsAreTheFormula() {
        for (int i = 0; i < Sanaro.POWER.length(); i++) {
            double p = Math.min(base(i >> 7), kill(i & 127));
            int want = Math.max(1, Math.min(120, (int) Math.ceil(p * 40 - 1e-9)));
            assertEquals(want, Sanaro.POWER.charAt(i), "cell " + i);
        }
    }

    @Test
    @Tag("SANARO-8")
    @DisplayName("at 321-640 px, with energy to spare, the shot is the least power that kills a weak enemy")
    void exactKillShots() {
        for (int enemy = 0; enemy <= 12; enemy++) {  // 2.5, the base at 100 energy, kills 12
            double power = Sanaro.POWER.charAt((100 << 7) + enemy) / 40.0;
            assertTrue(damage(power) > enemy, "enemy " + enemy + ": power " + power + " does not kill");
            assertTrue(power == 0.1 || damage(power - 0.05) <= enemy + 0.3, "enemy " + enemy + ": power " + power + " wastes energy");
        }
    }
}
