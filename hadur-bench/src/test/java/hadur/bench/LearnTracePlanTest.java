package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-221: the field-wide trace study card (plans/pc-learn-trace.queue) is complete before it reaches the PC. */
class LearnTracePlanTest {

    private static String step(String queue, String name, String next) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = next == null ? queue.length() : queue.indexOf("\n\n" + next + " | ");
        return queue.substring(at, end);
    }

    @Test
    @Tag("BENCH-221")
    @DisplayName("master and BeepBoop under every robot of the census at one seed, truth logs on, the paired read, the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-learn-trace.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card fights the current release");
        assertTrue(!queue.contains("--no-truth-log"), "the read needs the truth logs");
        assertTrue(queue.contains("fetch-opponents.sh --set census-312.txt")
            && queue.contains("test -f opponents/kc.mega.BeepBoop_2.0.jar"), "BeepBoop's jar is fetched with the census");
        assertTrue(queue.contains("--set census-312.txt --seeds 1 --seed-base 11800 --arms plans/pc-learn-trace.arms"));
        String arms = Files.readString(Path.of("plans/pc-learn-trace.arms"));
        assertTrue(arms.contains("\nc | hadur117.Hadur " + version + " | bisect/hadur117.Hadur_" + version + ".jar"));
        assertTrue(arms.contains("\nbb | kc.mega.BeepBoop 2.0 | opponents/kc.mega.BeepBoop_2.0.jar"));
        assertTrue(queue.contains("learn_trace.py ${W} --base c --other bb --set census-312.txt --out "));
        assertTrue(queue.contains("multiarm.py ${W}/arms.tsv --census census-312.txt --out "));
        assertTrue(Files.isRegularFile(Path.of("../data/tools/learn_trace.py")), "the read tool is in the repo");
        String[] steps = {"prep", "trace", "read", "pr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(step(queue, steps[i], i + 1 < steps.length ? steps[i + 1] : null).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(!step(queue, "read", "pr").contains(";"), "read: an error must stop the card before the PR");
        String trace = step(queue, "trace", "read");
        assertTrue(trace.contains("--shuffle-jobs"));
        for (String rule : new String[] {"fails 30", "skips 60 over 200 arms c", "stall 30m"}) {
            assertTrue(trace.contains("stop: " + rule), rule);
        }
        assertTrue(!trace.contains("stop: dead"), "BeepBoop scoring nothing against a robot is a finding, not a defect");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-learn-trace-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --failed-ok"));

        // The read-only plan: the same read and PR on the kept battles, with arms.tsv rebuilt from the battles' rows.
        String rest = Files.readString(Path.of("plans/pc-learn-trace-read.queue"));
        assertTrue(Files.isRegularFile(Path.of("tools/arms_from_battles.py")));
        assertTrue(queue.contains("read | python3 tools/arms_from_battles.py ${W} && "), "the card's own read rebuilds too");
        assertTrue(rest.contains("set W = work/learn-trace-pc\n")
            && rest.contains("read | python3 tools/arms_from_battles.py ${W} --force --report ${OUT}/$(date +%Y-%m-%d)_learn-trace-field-kept.md && "));
        String kept = "python3 tools/arms_from_battles.py ${W} --force --report ${OUT}/$(date +%Y-%m-%d)_learn-trace-field-kept.md && ";
        assertTrue(rest.replace(kept, "").contains(step(queue, "read", "pr").replaceAll("\\s*after: trace\\s*", "")
            .replace("python3 tools/arms_from_battles.py ${W} && ", "").trim()), "the same read as the card");
        assertTrue(rest.contains("open_results_pr.sh claude/pc-learn-trace-results") && rest.contains("  after: read"));
        assertTrue(!rest.contains("bench-top20.sh"), "no battles");
    }
}
