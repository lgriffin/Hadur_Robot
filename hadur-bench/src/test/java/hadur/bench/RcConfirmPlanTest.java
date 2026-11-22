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

/**
 * BENCH-264: the release-candidate confirm card (plans/pc-rc-confirm.queue) is complete before it reaches the PC: the
 * released jar checked by sha256 against two A/A master builds, the whole field and the 1.12.0 returners at the live
 * turn time after the live-match check, the stop rules, the case written on the card, the read and the PR.
 */
class RcConfirmPlanTest {

    @Test
    @Tag("BENCH-264")
    @DisplayName("pc-rc-confirm: rel (released 3.23), c and aa (master A/A) on the field and the 1.12.0 returners")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-rc-confirm.queue"));
        List<String> arms = Files.readAllLines(Path.of("plans/pc-rc-confirm.arms")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).map(l -> l.split("\\|")[0].trim()).toList();
        assertEquals(List.of("rel", "c", "aa"), arms);
        assertTrue(queue.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb"), "c and aa are master A/A builds");
        assertTrue(queue.contains("hashlib.sha256") && queue.contains("set RELSHA = "), "the released jar is checked");
        assertTrue(queue.contains("# Why it should win"));
        int at = queue.indexOf("\nfield | ");
        assertTrue(at >= 0);
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        assertTrue(body.contains("--shuffle-jobs") && body.contains("--arms plans/pc-rc-confirm.arms")
            && body.contains("--set census-312.txt") && body.contains("--seeds 2 --seed-base 83200"));
        assertTrue(body.contains("  after: livematch"));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 90 over 200", "stall 30m", "aa after 20%"}) {
            assertTrue(body.contains("stop: " + rule), rule);
        }
        assertTrue(queue.contains("--engine 1.12.0 --keep-broken --set panel-ret16.txt"), "the returners run on 1.12.0");
        assertTrue(queue.contains("robocode.host/1.12.0"), "gate112 checks the engine");
        assertTrue(queue.contains("set C = --skip-build --skip-fetch --rounds 35 --cpu-constant live "));
        assertTrue(PcLiveMatchPlanTest.violations("pc-rc-confirm.queue", queue).isEmpty(),
            String.valueOf(PcLiveMatchPlanTest.violations("pc-rc-confirm.queue", queue)));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-rc-confirm-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
        // Run 4 read back run 3's battles (same --out and seeds); run 5 has its own directory and fresh seeds.
        assertTrue(queue.contains("set W = work/pc-rc-confirm-r5"), "run 5 has its own work directory");
        assertTrue(queue.contains("--seeds 6 --seed-base 83300"), "run 5 returners on fresh seeds");
    }
}
