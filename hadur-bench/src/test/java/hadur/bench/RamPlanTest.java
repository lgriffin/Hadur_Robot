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

/** BENCH-132: the rammer and exit-pick card (plans/pc-1v1-ram.queue) is complete before it reaches the PC. */
class RamPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-1v1-ram.queue");

    private static String release() throws IOException {
        Matcher m = Pattern.compile("<robot.release>(.*)</robot.release>")
            .matcher(Files.readString(Path.of("../hadur-robot/pom.xml")));
        assertTrue(m.find());
        return m.group(1);
    }

    @Test
    @Tag("BENCH-132")
    @DisplayName("both arms files name the control, its A/A copy and the candidate, all built by the card on the current release")
    void armsAreBuilt() throws IOException {
        String v = release();
        String queue = Files.readString(QUEUE);
        Path here = Path.of("").toAbsolutePath();
        List<Arms.Arm> ram = Arms.parse(Path.of("plans/ram-dodge.arms"), here);
        assertEquals(List.of("c", "aa", "rk"), ram.stream().map(Arms.Arm::label).toList());
        List<Arms.Arm> exit = Arms.parse(Path.of("plans/exit-pick.arms"), here);
        assertEquals(List.of("c", "aa", "xp"), exit.stream().map(Arms.Arm::label).toList());
        for (Arms.Arm a : ram) assertTrue(a.robot().startsWith("hadur2.Hadur " + v), a.robot());
        for (Arms.Arm a : exit) assertTrue(a.robot().startsWith("hadur2.Hadur " + v), a.robot());
        assertTrue(queue.contains("cp ../hadur-robot/target/hadur2.Hadur_" + v + ".jar bisect/"));
        for (String b : new String[] {"aa", "rambrk", "sx4list,sx0list"}) {
            assertTrue(queue.contains("build-ablation.sh " + b + " "), b);
        }
        assertTrue(queue.contains("SHIELD_EXIT4=plans/exit-late.txt SHIELD_EXIT0=plans/exit-off.txt"));
        for (String f : new String[] {"panel-ram-318.txt", "panel-exit-pick.txt", "plans/exit-late.txt", "plans/exit-off.txt"}) {
            assertTrue(Files.isRegularFile(Path.of(f)), f);
        }
        long picks = Files.readAllLines(Path.of("plans/exit-late.txt")).size()
            + Files.readAllLines(Path.of("plans/exit-off.txt")).size();
        assertEquals(7, picks, "pc-shield-exit's 7 per-robot picks");
    }

    @Test
    @Tag("BENCH-132")
    @DisplayName("fresh seeds, both gates, losses per robot, and a results PR only after every analysis passes")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        assertTrue(queue.contains("set P = --parallel 12 --no-truth-log"));
        String[] steps = {"prep", "ram", "exit", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        long rammers = Files.readAllLines(Path.of("panel-ram-318.txt")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).count();
        assertTrue(rammers >= 40, "the whole rammer group: " + rammers);
        assertTrue(queue.contains("--seed-base 3600 --arms plans/ram-dodge.arms"));
        assertTrue(queue.contains("--seed-base 3700 --arms plans/exit-pick.arms"));
        assertTrue(queue.contains("--arm rk --panel panel-ram-318.txt --bar 0.05"));
        assertTrue(queue.contains("--arm xp --panel panel-exit-pick.txt --bar 0.01"));
        assertTrue(queue.contains("tools/per_robot.py work/ram-dodge/arms.tsv --arms rk"));
        assertTrue(queue.contains("tools/per_robot.py work/exit-pick/arms.tsv --arms xp"));
        String gate = queue.substring(queue.indexOf("\ngate | "), queue.indexOf("\n\npr | "));
        assertTrue(!gate.contains(";"), "an analysis error must stop the card before the results PR");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-1v1-ram-results"));
        // BENCH-129, BENCH-130: watched, with stop rules fixed before the run, and futility only where 10+ robots are read.
        assertTrue(queue.contains("set ALERT = lgriffin"));
        String ram = queue.substring(queue.indexOf("\nram | "), queue.indexOf("\n\nexit | "));
        String exit = queue.substring(queue.indexOf("\nexit | "), queue.indexOf("\n\ngate | "));
        for (String step : new String[] {ram, exit}) {
            assertTrue(step.contains("--shuffle-jobs") && step.contains("watch: field=1217"), step);
            for (String rule : new String[] {"fails 30", "dead 8", "skips 40 over 200", "stall 30m", "aa after 20%"}) {
                assertTrue(step.contains("stop: " + rule), rule);
            }
        }
        assertTrue(ram.contains("stop: futility rk below 0.05 after 30%"));
        assertTrue(!exit.contains("futility"), "7 robots are under the 10 a futility read needs");
    }
}
