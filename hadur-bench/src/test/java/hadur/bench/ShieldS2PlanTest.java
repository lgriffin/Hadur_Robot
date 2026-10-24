package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-100: the shield part 2 card (plans/pc-shield-s2.queue) is complete before it reaches the PC. */
class ShieldS2PlanTest {

    private static final Path QUEUE = Path.of("plans/pc-shield-s2.queue");

    /** The robot version the build makes, from hadur-robot's pom. */
    private static String release() throws IOException {
        Matcher m = Pattern.compile("<robot.release>([^<]+)</robot.release>")
            .matcher(Files.readString(Path.of("../hadur-robot/pom.xml")));
        assertTrue(m.find());
        return m.group(1);
    }

    @Test
    @Tag("BENCH-100")
    @DisplayName("the screen's arms are the control, its A/A copy, shield-all with records and with the opening drive, and the queue builds all four")
    void armsAreBuilt() throws IOException {
        String queue = Files.readString(QUEUE);
        List<Arms.Arm> arms = Arms.parse(Path.of("plans/shield-s2.arms"), Path.of("").toAbsolutePath());
        assertEquals(List.of("c", "aa", "sask", "sasvsk"), arms.stream().map(Arms.Arm::label).toList());
        assertTrue(queue.contains("build-ablation.sh aa"), "builds the A/A copy");
        assertTrue(queue.contains("build-ablation.sh shield-all,srec "), "builds sask");
        assertTrue(queue.contains("build-ablation.sh shield-all,smove,srec "), "builds sasvsk");
        assertTrue(queue.contains("fetch-opponents.sh --set work/shield-s2-panel.txt"));
    }

    @Test
    @Tag("BENCH-100")
    @DisplayName("the card's control is the version the build makes")
    void controlIsTheBuild() throws IOException {
        String v = release();
        String queue = Files.readString(QUEUE);
        assertTrue(queue.contains("cp ../hadur-robot/target/hadur2.Hadur_" + v + ".jar bisect/"), "builds the control " + v);
        assertTrue(queue.contains("--base " + v + " "), "the candidate is built on " + v);
        for (Arms.Arm a : Arms.parse(Path.of("plans/shield-s2.arms"), Path.of("").toAbsolutePath())) {
            assertTrue(a.robot().startsWith("hadur2.Hadur " + v), a.robot());
        }
    }

    @Test
    @Tag("BENCH-100")
    @DisplayName("every step reads the one before it, runs at 12 workers, and the run ends in a gate and a results PR")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        assertTrue(queue.contains("set P = --parallel 12 --no-truth-log"));
        String[] steps = {"prep", "screen", "pick", "entries", "candidate", "verify", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(queue.contains("\n" + steps[i] + " | "), steps[i]);
            int at = queue.indexOf("\n" + steps[i] + " | ");
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("--out work/shield-s2-screen ") && queue.contains("work/shield-s2-screen/arms.tsv"));
        assertTrue(queue.contains("aims work/shield-s2-screen "), "aims read the screen's records");
        assertTrue(queue.contains("--arms work/shield-s2-verify.arms") && queue.contains("--out work/shield-s2-verify.arms"));
        assertTrue(queue.contains("--out work/shield-s2-verify ") && queue.contains("gate work/shield-s2-verify/arms.tsv --arm t2"));
        assertTrue(!queue.contains("--seed-base 2300 --arms work/shield-s2-verify.arms"), "the verify uses fresh seeds");
        assertTrue(Files.isRegularFile(Path.of("tools/shield_s2.py")) && Files.isRegularFile(Path.of("tools/test_shield_s2.py")));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-shield-s2-results"), "opens a results PR");
    }

    @Test
    @Tag("BENCH-100")
    @DisplayName("the team stage S4 steps run after the 1v1 results PR, from master, each after the one before, and end in their own results PR")
    void teamStepsFollow() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"pr", "t4prep", "t4bb", "t4md", "t4mb", "t4mr", "t4all", "t4pr"};
        for (int i = 1; i < steps.length; i++) {
            Matcher m = Pattern.compile("\n" + steps[i] + " +\\| [^\n]*\n  after: (\\S+)").matcher(queue);
            assertTrue(m.find(), steps[i]);
            assertEquals(steps[i - 1], m.group(1), steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("\nt4prep | git checkout -q master && "), "back on master before the team builds");
        for (String a : new String[] {"bb", "md", "mb", "mr", "mdmbmr"}) {
            assertTrue(queue.contains("@plans/team-s4-" + a + ".args"), a);
            assertTrue(Files.isRegularFile(Path.of("plans/team-s4-" + a + ".args")), a);
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-s4-results"), "the team screens open their own results PR");
    }
}
