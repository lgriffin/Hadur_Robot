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

/** BENCH-126: the gap-to-2nd card (plans/pc-shield-exit.queue) is complete before it reaches the PC. */
class ShieldExitPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-shield-exit.queue");

    private static String release() throws IOException {
        Matcher m = Pattern.compile("<robot.release>(.*)</robot.release>")
            .matcher(Files.readString(Path.of("../hadur-robot/pom.xml")));
        assertTrue(m.find());
        return m.group(1);
    }

    @Test
    @Tag("BENCH-126")
    @DisplayName("both arms files name the control, its A/A copy and the candidates, all built by the card on the current release")
    void armsAreBuilt() throws IOException {
        String v = release();
        String queue = Files.readString(QUEUE);
        Path here = Path.of("").toAbsolutePath();
        List<Arms.Arm> exit = Arms.parse(Path.of("plans/shield-exit.arms"), here);
        assertEquals(List.of("c", "aa", "s4", "s0"), exit.stream().map(Arms.Arm::label).toList());
        List<Arms.Arm> repick = Arms.parse(Path.of("plans/repick-verify.arms"), here);
        assertEquals(List.of("c", "aa", "rp"), repick.stream().map(Arms.Arm::label).toList());
        for (Arms.Arm a : exit) assertTrue(a.robot().startsWith("hadur2.Hadur " + v), a.robot());
        for (Arms.Arm a : repick) assertTrue(a.robot().startsWith("hadur2.Hadur " + v), a.robot());
        assertTrue(queue.contains("cp ../hadur-robot/target/hadur2.Hadur_" + v + ".jar bisect/"));
        for (String b : new String[] {"aa", "sdmg400", "sdmgoff", "slistdrop,sgolist,sgo2list"}) {
            assertTrue(queue.contains("build-ablation.sh " + b + " "), b);
        }
        for (String f : new String[] {"panel-shield-listed-318.txt", "panel-repick-318.txt", "plans/repick-drop.txt",
                "plans/repick-stopgo.txt", "plans/repick-stopgo2.txt"}) {
            assertTrue(Files.isRegularFile(Path.of(f)), f);
        }
    }

    @Test
    @Tag("BENCH-126")
    @DisplayName("the screen covers every listed robot, the verify uses fresh seeds, and the run ends in gates and a results PR")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        assertTrue(queue.contains("set P = --parallel 12 --no-truth-log"));
        String[] steps = {"prep", "screen", "verify", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        long listed = Files.readAllLines(Path.of("panel-shield-listed-318.txt")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).count();
        assertTrue(listed >= 270, "the panel is the whole shield list: " + listed);
        assertTrue(queue.contains("--seed-base 3400 --arms plans/shield-exit.arms"));
        assertTrue(queue.contains("--seed-base 3500 --arms plans/repick-verify.arms"));
        assertTrue(queue.contains("--arm s4 --panel panel-shield-listed-318.txt"));
        assertTrue(queue.contains("--arm s0 --panel panel-shield-listed-318.txt"));
        assertTrue(queue.contains("--arm rp --panel panel-repick-318.txt"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-shield-exit-results"));
    }
}
