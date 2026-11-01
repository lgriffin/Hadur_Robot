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

/** BENCH-112: the factorial picks verify card and its inputs. */
class FactorPlanTest {

    private static List<String> names(String path) throws IOException {
        return Files.readAllLines(Path.of(path)).stream().map(String::trim)
            .filter(l -> !l.isEmpty() && !l.startsWith("#")).map(l -> l.split(" \\| ")[0].trim())
            .collect(Collectors.toList());
    }

    @Test
    @Tag("BENCH-112")
    @DisplayName("the verify panel is exactly the robots of the two candidate lists")
    void panelMatchesLists() throws IOException {
        Set<String> lists = new java.util.TreeSet<>(names("plans/factor-heatjit.txt"));
        lists.addAll(names("plans/factor-gunstack.txt"));
        assertEquals(lists, new java.util.TreeSet<>(names("panel-factor-picks.txt")));
        assertEquals(14, lists.size());
    }

    @Test
    @Tag("BENCH-112")
    @DisplayName("the card builds the candidate from both lists, verifies at fresh seeds and ends in a results PR")
    void card() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-1v1-factor.queue"));
        assertTrue(queue.contains("HEAT_JIT=plans/factor-heatjit.txt GUN_STACK=plans/factor-gunstack.txt bash ./build-ablation.sh hjlist,gslist"));
        assertTrue(queue.contains("--set panel-factor-picks.txt --seeds 6 --seed-base 3100 --arms plans/factor-verify.arms"));
        assertTrue(queue.contains("--arm t5 --bar 0.03"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-1v1-factor-results"));
        String arms = Files.readString(Path.of("plans/factor-verify.arms"));
        assertTrue(arms.contains("t5 | hadur117.Hadur 3.21hlgl | bisect/hadur117.Hadur_3.21hlgl.jar"));
        String robot = Files.readString(Path.of("../hadur-robot/pom.xml"));
        assertTrue(robot.contains("<robot.release>3.21</robot.release>"), "the arms name the master release");
    }
}
