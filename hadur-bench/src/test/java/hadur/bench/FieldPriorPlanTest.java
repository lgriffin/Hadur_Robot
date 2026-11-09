package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-217, BENCH-218: the field-prior card (pc-field-prior) is complete before it reaches the PC. */
class FieldPriorPlanTest {

    private static String step(String queue, String name, String next) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = next == null ? queue.length() : queue.indexOf("\n\n" + next + " | ");
        return queue.substring(at, end);
    }

    private static String version() throws IOException {
        return Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
    }

    @Test
    @Tag("BENCH-217")
    @DisplayName("master, its A/A copy and the field prior fight the whole field at 2 fresh seeds, read field-normalised against c and aa pooled")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-field-prior.queue"));
        String arms = Files.readString(Path.of("plans/field-prior.arms"));
        String v = version();
        assertTrue(queue.contains("set V = " + v + "\n"), "the card builds the current release");
        for (String line : new String[] {"c | hadur117.Hadur " + v + "aa | bisect/hadur117.Hadur_" + v + "aa.jar",
                                         "aa | hadur117.Hadur " + v + "bb | bisect/hadur117.Hadur_" + v + "bb.jar",
                                         "pf | hadur117.Hadur " + v + "pf | bisect/hadur117.Hadur_" + v + "pf.jar"}) {
            assertTrue(arms.contains(line + "\n"), line);
        }
        String prep = step(queue, "prep", "pilot");
        assertTrue(prep.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && bash ./build-ablation.sh fprior"),
            "the three arms are built from master");
        assertTrue(prep.contains("./fetch-opponents.sh --set census-312.txt"), "the whole field");
        String[] steps = {"prep", "pilot", "screen", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(step(queue, steps[i], i + 1 < steps.length ? steps[i + 1] : null).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        for (String s : new String[] {"pilot", "screen"}) {
            String body = step(queue, s, steps[List.of(steps).indexOf(s) + 1]);
            assertTrue(body.contains("--shuffle-jobs") && body.contains("watch: field=1217"), s);
            for (String rule : new String[] {"fails 30", "dead 8", "skips 90 over 200", "stall 30m"}) {
                assertTrue(body.contains("stop: " + rule), s + " " + rule);
            }
        }
        assertTrue(step(queue, "screen", "gate").contains("--set census-312.txt --seeds 2 --seed-base 10600 --arms plans/field-prior.arms --out ${W}"),
            "the screen resumes the pilot's battles on the same seeds");
        String gate = step(queue, "gate", "pr");
        assertTrue(gate.contains("multiarm.py ${W}/arms.tsv --census census-312.txt"), "the field read by band");
        assertTrue(gate.contains("shield_s2.py gate ${W}/arms.tsv --arm pf --panel census-312.txt --bar 0.05"), "the gate");
        assertTrue(gate.contains("per_robot.py ${W}/arms.tsv --arms pf") && gate.contains("mode_table.py ${W}/arms.tsv --margin 2"),
            "per-robot reads for a per-opponent fallback");
        for (String s : new String[] {"screen", "gate"}) {
            assertTrue(step(queue, s, steps[List.of(steps).indexOf(s) + 1]).contains("if [ -f work/fpr.stop ]"), s + " stops with the pilot");
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-field-prior-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log --failed-ok\n"),
            "one failed battle in thousands must not fail the step (BENCH-187)");
        assertTrue(queue.contains("Why it should win"));
    }

    @Test
    @Tag("BENCH-218")
    @DisplayName("every fifth robot fights first; pf under 0.1 points over c there stops the card")
    void pilotStopsTheCard() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-field-prior.queue"));
        String prep = step(queue, "prep", "pilot");
        assertTrue(prep.contains("awk 'NR<=2 || (NR>2 && (NR-3)%5==0)' census-312.txt | awk -F'|'"),
            "every fifth robot by line, so the first run's battles resume");
        assertTrue(prep.contains("NR == FNR {b[n] = 1; next} !(n in b)' broken-1.11.2.txt - > work/panel-fpr-pilot.txt"),
            "less broken-1.11.2.txt's robots: they have no battles and the pilot analysis refuses an incomplete panel (issue #718)");
        String pilot = step(queue, "pilot", "screen");
        assertTrue(pilot.contains("--set work/panel-fpr-pilot.txt --seeds 2 --seed-base 10600 --arms plans/field-prior.arms --out ${W}"));
        assertTrue(pilot.contains("x5_card.py pilot ${W}/arms.tsv --names work/panel-fpr-pilot.txt --check pf=work/panel-fpr-pilot.txt@0.1 --ref c"));
        assertTrue(pilot.contains("--stop-file work/fpr.stop"));
        assertTrue(step(queue, "screen", "gate").contains("if [ -f work/fpr.stop ]; then echo 'pilot: pf under 0.1 points over c, no screen'; exit 0; fi"));
    }
}
