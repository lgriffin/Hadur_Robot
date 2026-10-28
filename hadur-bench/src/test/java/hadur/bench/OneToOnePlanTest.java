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

/** BENCH-133: the 1:1 tournament card (plans/pc-1to1.queue) is complete before it reaches the PC. */
class OneToOnePlanTest {

    private static final Path QUEUE = Path.of("plans/pc-1to1.queue");

    private static String release() throws IOException {
        Matcher m = Pattern.compile("<robot.release>(.*)</robot.release>")
            .matcher(Files.readString(Path.of("../hadur-robot/pom.xml")));
        assertTrue(m.find());
        return m.group(1);
    }

    private static long robots(String set) throws IOException {
        return Files.readAllLines(Path.of(set)).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).count();
    }

    @Test
    @Tag("BENCH-133")
    @DisplayName("both arms files name the control, its A/A copy and the candidates, all built by the card on the current release")
    void armsAreBuilt() throws IOException {
        String v = release();
        String queue = Files.readString(QUEUE);
        Path here = Path.of("").toAbsolutePath();
        List<Arms.Arm> shield = Arms.parse(Path.of("plans/1to1-shield.arms"), here);
        assertEquals(List.of("c", "aa", "s4", "sv", "sy"), shield.stream().map(Arms.Arm::label).toList());
        List<Arms.Arm> learn = Arms.parse(Path.of("plans/1to1-learn.arms"), here);
        assertEquals(List.of("c", "aa", "wp", "ws", "sp"), learn.stream().map(Arms.Arm::label).toList());
        for (Arms.Arm a : shield) assertTrue(a.robot().startsWith("hadur117.Hadur " + v), a.robot());
        for (Arms.Arm a : learn) assertTrue(a.robot().startsWith("hadur117.Hadur " + v), a.robot());
        assertTrue(queue.contains("cp ../hadur-robot/target/hadur117.Hadur_" + v + ".jar bisect/"));
        for (String b : new String[] {"aa", "shield-all,sdmg400", "shield-all,smove,sdmg400", "strial", "sgo", "sgo2", "sdplan"}) {
            assertTrue(queue.contains("build-ablation.sh " + b + " "), b);
        }
        // The jar each arm names is the one its ablation builds: the suffixes build-ablation.sh gives.
        assertTrue(shield.get(2).jar().getFileName().toString().equals("hadur117.Hadur_" + v + "sas4.jar"));
        assertTrue(shield.get(3).jar().getFileName().toString().equals("hadur117.Hadur_" + v + "sasvs4.jar"));
        assertTrue(shield.get(4).jar().getFileName().toString().equals("hadur117.Hadur_" + v + "sy.jar"));
        assertTrue(learn.get(2).jar().getFileName().toString().equals("hadur117.Hadur_" + v + "wp.jar"));
        assertTrue(learn.get(3).jar().getFileName().toString().equals("hadur117.Hadur_" + v + "ws.jar"));
        assertTrue(learn.get(4).jar().getFileName().toString().equals("hadur117.Hadur_" + v + "sp.jar"));
        for (String f : new String[] {"panel-1to1-shield.txt", "panel-1to1-learn.txt"}) {
            assertTrue(Files.isRegularFile(Path.of(f)), f);
            assertTrue(queue.contains("fetch-opponents.sh --set " + f), f);
        }
        assertTrue(robots("panel-1to1-shield.txt") >= 120, "the rival-shielded robots Hadur surfs, rammers out");
        assertTrue(robots("panel-1to1-learn.txt") >= 100, "the stat-prone and oscillating learners played normally");
    }

    @Test
    @Tag("BENCH-133")
    @DisplayName("fresh seeds, per-arm gates, per-robot picks and losses, and a results PR only after every analysis passes")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        assertTrue(queue.contains("set P = --parallel 12 --no-truth-log"));
        String[] steps = {"prep", "shield", "learn", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("--set panel-1to1-shield.txt --seeds 6 --seed-base 3800 --arms plans/1to1-shield.arms"));
        assertTrue(queue.contains("--set panel-1to1-learn.txt --seeds 6 --seed-base 3900 --arms plans/1to1-learn.arms"));
        for (String arm : new String[] {"s4", "sv", "sy"}) {
            assertTrue(queue.contains("--arm " + arm + " --panel panel-1to1-shield.txt --bar 0.05"), arm);
        }
        for (String arm : new String[] {"wp", "ws", "sp"}) {
            assertTrue(queue.contains("--arm " + arm + " --panel panel-1to1-learn.txt --bar 0.05"), arm);
        }
        assertTrue(queue.contains("mode_table.py work/1to1-shield/arms.tsv --margin 5"));
        assertTrue(queue.contains("mode_table.py work/1to1-learn/arms.tsv --margin 5"));
        assertTrue(queue.contains("tools/per_robot.py work/1to1-shield/arms.tsv --arms s4 sv sy"));
        assertTrue(queue.contains("tools/per_robot.py work/1to1-learn/arms.tsv --arms wp ws sp"));
        String gate = queue.substring(queue.indexOf("\ngate | "), queue.indexOf("\n\npr | "));
        assertTrue(!gate.contains(";"), "an analysis error must stop the card before the results PR");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-1to1-results"));
        // BENCH-129, BENCH-130: watched, with stop rules fixed before the run; no futility, since no arm ships field-wide.
        assertTrue(queue.contains("set ALERT = lgriffin"));
        String shield = queue.substring(queue.indexOf("\nshield | "), queue.indexOf("\n\nlearn | "));
        String learn = queue.substring(queue.indexOf("\nlearn | "), queue.indexOf("\n\ngate | "));
        for (String step : new String[] {shield, learn}) {
            assertTrue(step.contains("--shuffle-jobs") && step.contains("watch: field=1217"), step);
            for (String rule : new String[] {"fails 30", "dead 8", "skips 40 over 200", "stall 30m", "aa after 20%"}) {
                assertTrue(step.contains("stop: " + rule), rule);
            }
            assertTrue(!step.contains("futility"), "per-robot picks have no field-wide bar to read early");
        }
    }
}
