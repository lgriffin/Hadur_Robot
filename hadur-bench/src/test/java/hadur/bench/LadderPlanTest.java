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

/** BENCH-98: the worker-ladder card (plans/pc-ladder.queue) is complete before it reaches the PC. */
class LadderPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-ladder.queue");

    @Test
    @Tag("BENCH-98")
    @DisplayName("the ladder's arms are the control and its A/A copy, and the queue builds both")
    void armsAreBuilt() throws IOException {
        String queue = Files.readString(QUEUE);
        List<Arms.Arm> arms = Arms.parse(Path.of("plans/ladder.arms"), Path.of("").toAbsolutePath());
        assertEquals(List.of("c", "aa"), arms.stream().map(Arms.Arm::label).toList());
        assertTrue(queue.contains("cp ../hadur-robot/target/hadur2.Hadur_3.15.jar bisect/"), "builds the control");
        assertTrue(queue.contains("build-ablation.sh aa"), "builds the A/A copy");
        assertTrue(queue.contains("hadur2.HadurTeam_3.15.jar"), "fetches the team baseline");
        assertTrue(queue.contains("--set top5-s0-panel.txt") && queue.contains("fetch-opponents.sh --set top5-s0-panel.txt"));
    }

    @Test
    @Tag("BENCH-98")
    @DisplayName("every block runs at its own width into its own folder, and the read step reads every folder")
    void everyBlockIsRead() throws IOException {
        String queue = Files.readString(QUEUE);
        for (int w : new int[] {12, 16, 20, 24}) {
            assertTrue(queue.contains("--parallel " + w + " --out work/ladder-d" + w + " "), "d" + w);
            assertTrue(queue.contains("d" + w + "=work/ladder-d" + w), "read d" + w);
        }
        for (int w : new int[] {12, 16}) {
            assertTrue(queue.contains("--parallel " + w + " --no-truth-log --out work/ladder-d" + w + "x "), "d" + w + "x");
            assertTrue(queue.contains("d" + w + "x=work/ladder-d" + w + "x"), "read d" + w + "x");
        }
        for (int w : new int[] {8, 12, 16}) {
            List<String> args = Files.readAllLines(Path.of("plans/ladder-t" + w + ".args")).stream()
                .filter(l -> !l.isBlank() && !l.startsWith("#")).toList();
            assertEquals(String.valueOf(w), args.get(args.indexOf("--parallel") + 1), "t" + w + " width");
            assertEquals("work/ladder-t" + w, args.get(args.indexOf("--out") + 1), "t" + w + " folder");
            assertEquals("true", args.get(args.indexOf("--team") + 1));
            assertTrue(queue.contains("@plans/ladder-t" + w + ".args"), "runs t" + w);
            assertTrue(queue.contains("t" + w + "=work/ladder-t" + w), "read t" + w);
        }
        assertTrue(queue.contains("tools/ladder.py --base d12 --base t8"));
        assertTrue(Files.isRegularFile(Path.of("tools/ladder.py")) && Files.isRegularFile(Path.of("tools/test_ladder.py")));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-ladder-results"), "opens a results PR");
    }
}
