package hadur117;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.shieldmode.ShieldList;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * TIME-13: the allocation budget. Skipped turns come from GC pauses, and GC pauses from what
 * the core allocates a tick (TIME-11), so a change that makes the core allocate much more per
 * tick fails here before it reaches a battle. Each budget is 1.3 to 2 times what the
 * recording allocated when TIME-12 shipped (the least of three warm passes), so JIT noise does
 * not trip it, and still far under what each allocated before (60, 364 and 795 KB); a change that needs more must raise the budget on purpose and say why.
 */
class TickPerfBudgetTest {

    private static final Path REPLAY = Path.of("../hadur-core/src/test/resources/replay");

    private static void within(String fixture, double kbPerTick) throws IOException {
        List<String> lines = TickPerf.read(REPLAY.resolve(fixture));
        ShieldList shield = ShieldList.parse(Hadur.shieldListLines());
        TickPerf.run(lines, shield);
        // The least of three warm passes: how much escape analysis removes varies with JIT timing.
        double kb = Double.MAX_VALUE;
        for (int pass = 0; pass < 3; pass++) {
            TickPerf.Pass warm = TickPerf.run(lines, shield);
            assertEquals(0, warm.mismatches, fixture + ": the replay must play the recorded orders");
            kb = Math.min(kb, warm.allocBytes / 1024.0 / warm.ticks);
        }
        assertTrue(kb <= kbPerTick, String.format("%s: %.1f KB a tick, budget %.1f", fixture, kb, kbPerTick));
    }

    @Test
    @Tag("TIME-13")
    @Tag("TIME-11")
    @Tag("TIME-12")
    void duelStaysInBudget() throws IOException {
        within("sample.Walls.txt.gz", 35);
    }

    @Test
    @Tag("TIME-13")
    @Tag("TIME-11")
    @Tag("TIME-12")
    void meleeStaysInBudget() throws IOException {
        within("melee-samples.txt.gz", 70);
    }

    @Test
    @Tag("TIME-13")
    @Tag("TIME-11")
    @Tag("TIME-12")
    void teamStaysInBudget() throws IOException {
        within("team-sampleteam.MyFirstTeam-m1.txt.gz", 210);
    }
}
