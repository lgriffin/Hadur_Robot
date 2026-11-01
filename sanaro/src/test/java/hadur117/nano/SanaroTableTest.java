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
        int e = enemy + 1;
        double p = e <= 4 ? e / 4.0 : (e + 2) / 6.0;
        return Math.max(0.1, p);
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

    static int formula(int i) {
        double p = Math.min(base(i >> 7), kill(i & 127));
        return Math.max(1, Math.min(120, (int) Math.ceil(p * 40 - 1e-9)));
    }

    @Test
    @Tag("SANARO-8")
    @DisplayName("each cell is 0.2's formula, or Hadur's power over a whole 2 x 2 block it taught (0.3, HL)")
    void cellsAreTheFormulaOrATaughtBlock() {
        int taught = 0;
        for (int i = 0; i < Sanaro.POWER.length(); i++) {
            int c = Sanaro.POWER.charAt(i);
            assertTrue(c >= 1 && c <= 120, "cell " + i + " is " + c + " fortieths");
            if (c == formula(i)) continue;
            taught++;
            // tools/distill.py --own-step 2 --enemy-step 2: a taught block holds one power.
            int r0 = (i >> 7) & ~1, c0 = (i & 127) & ~1;
            for (int r = r0; r < r0 + 2; r++) {
                for (int e = c0; e < c0 + 2; e++) {
                    assertEquals(c, Sanaro.POWER.charAt((r << 7) + e), "cell " + i + "'s block at " + r + ", " + e);
                }
            }
        }
        // pc-sanaro-n07's HL table (PR #548): 9,529 cells taught from Hadur 3.20's shots in the
        // live-shaped fields; a different table needs a bench before it ships.
        assertEquals(9529, taught, "cells that differ from the formula");
    }
}
