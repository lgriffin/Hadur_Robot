package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-205: the cloud-race-power card (POW-17 against master and its A/A copy) is complete and self-consistent. */
class RacePowerPlanTest {

    private static final Path QUEUE = Path.of("plans/cloud-race-power.queue");

    private static List<String> names(Path file) throws IOException {
        return Files.readAllLines(file).stream().map(String::trim)
            .filter(l -> !l.isEmpty() && !l.startsWith("#"))
            .map(l -> l.split("\\|")[0].trim()).collect(Collectors.toList());
    }

    @Test
    @Tag("BENCH-205")
    @DisplayName("the arms are master, its A/A copy and rp, and rp's race-power list names exactly the panel's robots")
    void armsAndPanel() throws IOException {
        List<Arms.Arm> arms = Arms.parse(Path.of("plans/race-power.arms"), Path.of("."));
        assertEquals(List.of("c", "aa", "rp"), arms.stream().map(Arms.Arm::label).toList());
        List<String> panel = names(Path.of("race-guard.txt"));
        assertEquals(47, panel.size());
        assertEquals(Set.copyOf(panel), Set.copyOf(names(Path.of("plans/race-power-guard.list"))));
        assertTrue(panel.contains("oog.mega.saguaro.Saguaro 1.1"));
        assertTrue(Set.copyOf(panel).containsAll(names(Path.of("panel-race-confirm.txt"))), "the confirm panel is a subset of the screen");
    }

    @Test
    @Tag("BENCH-205")
    @DisplayName("the steps chain prep, bench, pick, confirm, report; the confirm fights the pick on fresh seeds; the bench resumes and stops on A/A drift")
    void stepsChain() throws IOException {
        String q = Files.readString(QUEUE);
        assertTrue(q.contains("RACE_POWER=plans/race-power-guard.list bash ./build-ablation.sh rplist"));
        assertTrue(q.contains("--set race-guard.txt --seeds 3 --seed-base 52000 --arms plans/race-power.arms"));
        assertTrue(q.contains("--set panel-race-confirm.txt --seeds 6 --seed-base 52100 --arms plans/race-power.arms"));
        assertTrue(q.contains("stop: aa after 20%"));
        assertTrue(q.contains("race-power-pick.tsv race-guard.txt > panel-race-confirm.txt && test -s panel-race-confirm.txt"),
            "the confirm panel comes from this screen's pick");
        assertTrue(!q.contains("--set race-guard.txt; "), "prep fails as a unit");
        for (String[] s : new String[][] {{"bench", "prep"}, {"pick", "bench"}, {"confirm", "pick"}, {"report", "confirm"}}) {
            int at = q.indexOf("\n" + s[0] + " |");
            assertTrue(at >= 0, s[0]);
            assertTrue(q.indexOf("after: " + s[1], at) > at, s[0] + " after " + s[1]);
        }
    }
}
