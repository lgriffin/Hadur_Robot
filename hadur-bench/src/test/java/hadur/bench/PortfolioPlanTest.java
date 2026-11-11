package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-230: the pc-portfolio card (the leaning field banked as one group, no per-robot lock) is complete before it reaches the PC. */
class PortfolioPlanTest {

    private static String step(String queue, String name, String next) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = next == null ? queue.length() : queue.indexOf("\n\n" + next + " | ");
        return queue.substring(at, end);
    }

    @Test
    @Tag("BENCH-230")
    @DisplayName("the robots are kept by shrunk gain from pc-tailor-near's battles, built as one arm, piloted on a fifth and gated as a group on six fresh seeds against c and aa")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-portfolio.queue"));
        String v = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + v + "\n"), "the card builds the current release");
        assertTrue(queue.contains("if [ ! -f work/tnr/arms.tsv ]; then"), "it needs pc-tailor-near's battles");
        assertTrue(queue.contains("tools/x5_card.py portfolio --lean ${OUT}/tnr-lean.tsv --run work/tnr/arms.tsv@ln --census census-312.txt"
            + " --carry work/pf-carried.tsv --shielded panel-shield-listed-321.txt --min 0 --field 1217"),
            "kept by shrunk gain above 0; carried robots and shield-mode gs and fl are out");
        assertTrue(queue.contains("tools/x5_card.py carried ../hadur-robot/src/main/java/hadur117/ShieldTableData.java --out work/pf-carried.tsv"));
        assertTrue(Files.exists(Path.of("../docs/bench/local/tnr-lean.tsv")) && Files.exists(Path.of("panel-shield-listed-321.txt")));
        assertTrue(queue.contains("--arms-out work/pf.arms --version ${V} &&"), "one build, with c and aa beside it");
        assertFalse(queue.contains("--no-aa"), "the gate needs the A/A copy");
        assertFalse(queue.contains("mode_table.py"), "no per-robot lock");
        String[] steps = {"prep", "pilot", "confirm", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(step(queue, steps[i], i + 1 < steps.length ? steps[i + 1] : null).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        for (String s : List.of("pilot", "confirm")) {
            String body = step(queue, s, steps[List.of(steps).indexOf(s) + 1]);
            assertTrue(body.contains("--shuffle-jobs") && body.contains("watch: field=1217"), s);
            assertTrue(body.contains("--seeds 6 --seed-base 14500 --arms work/pf.arms --out ${W}"), s + ": the confirm resumes the pilot");
            for (String rule : new String[] {"fails 30", "dead 8", "skips 90 over 200", "stall 30m"}) {
                assertTrue(body.contains("stop: " + rule), s + " " + rule);
            }
        }
        assertTrue(queue.contains("--check xr=work/panel-pf-pilot.txt@0 --ref c,aa"), "the pilot stops a losing group");
        for (String s : List.of("confirm", "gate")) {
            assertTrue(step(queue, s, steps[List.of(steps).indexOf(s) + 1]).contains("if [ -f work/pf.stop ]"), s + " stops with the pilot");
        }
        assertTrue(queue.contains("shield_s2.py gate ${W}/arms.tsv --arm xr --panel work/panel-pf.txt --bar 0.03"), "the group is gated, not the robot");
        assertTrue(queue.contains("per_robot.py ${W}/arms.tsv --arms xr") && queue.contains("--out-tsv ${OUT}/pf-per-robot.tsv"),
            "the per-robot rows are kept for the next pass");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-portfolio-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log --failed-ok\n"), "BENCH-187");
        assertTrue(queue.contains("Why it should win"));
    }
}
