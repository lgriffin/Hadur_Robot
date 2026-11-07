package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-207 and BENCH-208: the rest-of-the-field cards (pc-tailor-near, pc-hj-field) are complete before they reach the PC. */
class TailorNearPlanTest {

    private static String step(String queue, String name, String next) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = next == null ? queue.length() : queue.indexOf("\n\n" + next + " | ");
        return queue.substring(at, end);
    }

    private static void ordered(String queue, String[] steps) {
        for (int i = 1; i < steps.length; i++) {
            assertTrue(step(queue, steps[i], i + 1 < steps.length ? steps[i + 1] : null).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
    }

    private static void watched(String queue, String[] steps, String... benchSteps) {
        for (String s : benchSteps) {
            String body = step(queue, s, steps[List.of(steps).indexOf(s) + 1]);
            assertTrue(body.contains("--shuffle-jobs") && body.contains("watch: field=1217"), s);
            for (String rule : new String[] {"fails 30", "dead 8", "skips 90 over 200", "stall 30m"}) {
                assertTrue(body.contains("stop: " + rule), s + " " + rule);
            }
        }
    }

    private static String version() throws IOException {
        return Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
    }

    @Test
    @Tag("BENCH-207")
    @DisplayName("each robot pc-tailor-field left undecided is fought on the lever it leaned to, a fifth as the pilot, picked on the new seeds only, then confirmed on fresh ones")
    void nearCardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-tailor-near.queue"));
        assertTrue(queue.contains("set V = " + version() + "\n"), "the card builds the current release");
        assertTrue(queue.contains("if [ ! -f work/x5f/arms.tsv ]; then"), "it needs the first screen's battles");
        assertTrue(queue.contains("tools/x5_card.py lean work/x5f/arms.tsv --census census-312.txt --exclude ${OUT}/x5f-pick.tsv"
            + " --levers x5,gs,fp,sg,sw,hj,fl,mm --min 1"), "the robots already picked are out; dg and rd are not levers");
        assertTrue(queue.contains("--arms-out work/tnr.arms --version ${V} --arm ln --no-aa"), "one build, two arms");
        String[] steps = {"prep", "pilot", "screen", "pick", "prep2", "confirm", "gate", "pr"};
        ordered(queue, steps);
        watched(queue, steps, "pilot", "screen", "confirm");
        assertTrue(step(queue, "pilot", "screen").contains("--set work/panel-tnr-pilot.txt --seeds 4 --seed-base 9500 --arms work/tnr.arms --out ${W}"));
        assertTrue(queue.contains("--check ln=work/panel-tnr-pilot.txt@0.3 --ref c"));
        assertTrue(step(queue, "screen", "pick").contains("--set work/panel-tnr.txt --seeds 4 --seed-base 9500 --arms work/tnr.arms --out ${W}"),
            "the screen resumes the pilot's battles");
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 2 --out-tsv ${OUT}/tnr-pick.tsv"), "picked on the new seeds alone");
        assertTrue(queue.contains("> work/tnr-pick-levers.tsv"), "each pick goes back to its lever");
        assertTrue(queue.contains("--seeds 4 --seed-base 9600 --arms work/tnr-2.arms"), "the confirm's seeds are fresh");
        assertTrue(queue.contains("shield_s2.py gate ${W2}/arms.tsv --arm xr --panel work/panel-tnr-picks.txt --bar 0.03"));
        for (String s : new String[] {"screen", "pick", "prep2", "confirm", "gate"}) {
            assertTrue(step(queue, s, steps[List.of(steps).indexOf(s) + 1]).contains("if [ -f work/tnr.stop ]"), s + " stops with the pilot");
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-tailor-near-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
        assertTrue(queue.contains("Why it should win"));
    }

    @Test
    @Tag("BENCH-208")
    @DisplayName("hj on every robot of the field against c and aa on 3 fresh seeds, every fifth robot as the pilot, then the field gate")
    void hjFieldCardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-hj-field.queue"));
        String v = version();
        assertTrue(queue.contains("set V = " + v + "\n"));
        String arms = Files.readString(Path.of("plans/hj-field.arms"));
        assertTrue(arms.contains("\nc | hadur117.Hadur " + v + " | bisect/hadur117.Hadur_" + v + ".jar"));
        assertTrue(arms.contains("\naa | hadur117.Hadur " + v + "aa | bisect/hadur117.Hadur_" + v + "aa.jar"));
        assertTrue(arms.contains("\nhj | hadur117.Hadur " + v + "hl | bisect/hadur117.Hadur_" + v + "hl.jar"));
        assertTrue(queue.contains("HEAT_JIT=work/field.list bash ./build-ablation.sh hjlist"), "hj names every robot");
        String[] steps = {"prep", "pilot", "field", "gate", "pr"};
        ordered(queue, steps);
        watched(queue, steps, "pilot", "field");
        assertTrue(queue.contains("awk 'NR % 5 == 1' > work/panel-hjf-pilot.txt"));
        assertTrue(queue.contains("--set work/panel-hjf-pilot.txt --seeds 3 --seed-base 9700 --arms plans/hj-field.arms --out ${W}"));
        assertTrue(queue.contains("--check hj=work/panel-hjf-pilot.txt@0 --ref c,aa"));
        assertTrue(queue.contains("--set census-312.txt --seeds 3 --seed-base 9700 --arms plans/hj-field.arms --out ${W}"));
        assertTrue(queue.contains("shield_s2.py gate ${W}/arms.tsv --arm hj --panel census-312.txt --bar 0.03"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-hj-field-results"));
        assertTrue(queue.contains("Why it should win"));
    }
}
