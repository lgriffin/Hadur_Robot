package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-206: the pc-race-power card (POW-17 over the whole field, per robot) is complete before it reaches the PC. */
class RacePowerFieldPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-race-power.queue");
    private static final List<String> STEPS = List.of("prep", "pilot", "screen", "pick", "prep2", "confirm", "gate", "pr");

    private static String block(String queue, String step) {
        int at = queue.indexOf("\n" + step + " |");
        assertTrue(at >= 0, step);
        int next = queue.indexOf("\n\n", at + 1);
        return queue.substring(at, next < 0 ? queue.length() : next);
    }

    @Test
    @Tag("BENCH-206")
    @DisplayName("the arms are c, aa and rp for the screen and c, aa and xr (rx jar) for the confirm")
    void arms() throws IOException {
        assertEquals(List.of("c", "aa", "rp"),
            Arms.parse(Path.of("plans/race-power-field.arms"), Path.of(".")).stream().map(Arms.Arm::label).toList());
        List<Arms.Arm> confirm = Arms.parse(Path.of("plans/race-power-confirm.arms"), Path.of("."));
        assertEquals(List.of("c", "aa", "xr"), confirm.stream().map(Arms.Arm::label).toList());
        assertTrue(confirm.get(2).robot().endsWith("rx"));
    }

    @Test
    @Tag("BENCH-206")
    @DisplayName("the steps chain to a results PR; the screen is the whole census; a pilot under its bar skips every later step")
    void stepsChain() throws IOException {
        String q = Files.readString(QUEUE);
        for (int i = 1; i < STEPS.size(); i++) {
            assertTrue(block(q, STEPS.get(i)).contains("after: " + STEPS.get(i - 1)), STEPS.get(i) + " after " + STEPS.get(i - 1));
        }
        assertTrue(block(q, "prep").contains("RACE_POWER=work/field.list bash ./build-ablation.sh rplist"));
        assertTrue(block(q, "prep").contains("rm -f work/rpf.stop"), "a rerun never carries an old stop");
        assertTrue(block(q, "pilot").contains("--check rp=panel-race-confirm.txt@3 --ref c,aa") && block(q, "pilot").contains("--stop-file work/rpf.stop"));
        assertTrue(block(q, "screen").contains("--set census-312.txt --seeds 2 --seed-base 10200 --arms plans/race-power-field.arms"));
        for (String s : List.of("screen", "pick", "prep2", "confirm", "gate")) {
            assertTrue(block(q, s).contains("if [ -f work/rpf.stop ]; then"), s + " skips after a pilot stop");
        }
        assertTrue(block(q, "prep2").contains("RACE_POWER=work/rpf-picks.list RACE_POWER_SUFFIX=rx bash ./build-ablation.sh rplist"));
        assertTrue(block(q, "confirm").contains("--seeds 4 --seed-base 10300 --arms plans/race-power-confirm.arms"));
        assertTrue(block(q, "gate").contains("gate ${W2}/arms.tsv --arm xr --panel work/panel-rpf-picks.txt --bar 0.03"));
        assertTrue(block(q, "pr").contains("open_results_pr.sh claude/pc-race-power-results"));
        assertTrue(q.contains("Why it should win"));
        for (String s : List.of("pilot", "screen", "confirm")) {
            assertTrue(block(q, s).contains("stop: skips 90 over 200") && block(q, s).contains("stop: stall 30m"), s);
        }
    }
}
