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

/** BENCH-214: the next-lever card (pc-tailor-stack) is complete before it reaches the PC. */
class TailorStackPlanTest {

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
    @Tag("BENCH-214")
    @DisplayName("each tailored robot on its best other-family lever and each race-power leaner on rp, a fifth of each set as its pilot, picked on the new seeds only, then confirmed on fresh ones")
    void stackCardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-tailor-stack.queue"));
        assertTrue(queue.contains("set V = " + version() + "\n"), "the card builds the current release");
        assertTrue(queue.contains("if [ ! -f work/x5f/arms.tsv ] || [ ! -f work/rpf/arms.tsv ]; then"), "it needs both earlier screens' battles");
        assertTrue(queue.contains("tools/x5_card.py carried ../hadur-robot/src/main/java/hadur117/ShieldTableData.java --out work/tms-carried.tsv"),
            "the carried levers come from the table itself");
        assertTrue(queue.contains("tools/x5_card.py lean work/x5f/arms.tsv --census census-312.txt --carry work/tms-carried.tsv --only-carried"
            + " --shielded panel-shield-listed-321.txt --levers x5,gs,fp,sg,sw,hj,fl,mm --min 1 --req BENCH-214"),
            "the stack set: tailored robots, another family, no gs or fl on a shield-mode robot");
        assertTrue(queue.contains("tools/x5_card.py lean work/rpf/arms.tsv --census census-312.txt --carry work/tms-carried.tsv --exclude ${OUT}/rpf-pick.tsv"),
            "the race set leaves out pc-race-power's picks and the robots on a power lever");
        assertTrue(queue.contains("--levers rp --min 1 --req BENCH-214"));
        assertTrue(queue.contains("--arms-out work/tms.arms --version ${V} --arm ln --no-aa"), "one build, two arms");
        String[] steps = {"prep", "pilot", "screen", "pick", "prep2", "confirm", "gate", "pr"};
        ordered(queue, steps);
        watched(queue, steps, "pilot", "screen", "confirm");
        String pilot = step(queue, "pilot", "screen");
        assertTrue(pilot.contains("--set work/panel-tms-pilot.txt --seeds 4 --seed-base 10400 --arms work/tms.arms --out ${W}"));
        assertTrue(pilot.contains("--check ln=work/panel-tms-stack.txt@0.3 --ref c") && pilot.contains("--stop-file work/tms-stack.stop"),
            "the stack set has its own pilot bar");
        assertTrue(pilot.contains("--check ln=work/panel-tms-rp.txt@0.3 --ref c") && pilot.contains("--stop-file work/tms-rp.stop"),
            "the race set has its own pilot bar");
        assertTrue(pilot.contains("echo 'both pilots below the bar' > work/tms.stop"), "the card stops when both sets fail");
        assertTrue(step(queue, "screen", "pick").contains("--set work/panel-tms.txt --seeds 4 --seed-base 10400 --arms work/tms.arms --out ${W}"),
            "the screen resumes the pilot's battles");
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 2 --out-tsv ${OUT}/tms-pick.tsv"), "picked on the new seeds alone");
        assertTrue(queue.contains("> work/tms-pick-levers.tsv"), "each pick goes back to its lever");
        assertTrue(queue.contains("--seeds 4 --seed-base 10500 --arms work/tms-2.arms"), "the confirm's seeds are fresh");
        assertTrue(queue.contains("shield_s2.py gate ${W2}/arms.tsv --arm xr --panel work/panel-tms-picks.txt --bar 0.03"));
        for (String s : new String[] {"screen", "pick", "prep2", "confirm", "gate"}) {
            assertTrue(step(queue, s, steps[List.of(steps).indexOf(s) + 1]).contains("if [ -f work/tms.stop ]"), s + " stops with the pilots");
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-tailor-stack-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log --failed-ok\n"),
            "one failed battle in thousands must not fail the step (BENCH-187)");
        assertTrue(queue.contains("Why it should win"));
    }

    @Test
    @Tag("BENCH-214")
    @DisplayName("the helper knows race power as a lever, the lever families and the levers a shield-mode robot may not take")
    void helperCarriesTheRules() throws IOException {
        String tool = Files.readString(Path.of("tools/x5_card.py"));
        assertTrue(tool.contains("\"rp\": (\"rplist\", \"RACE_POWER\", \"rp\")"), "rp builds through rplist");
        Matcher m = Pattern.compile("FAMILY = \\{(.*?)\\}", Pattern.DOTALL).matcher(tool);
        assertTrue(m.find());
        String family = m.group(1);
        for (String pair : new String[] {"\"x5\": \"power\"", "\"fp\": \"power\"", "\"rp\": \"power\"", "\"sg\": \"stopgo\"", "\"sw\": \"stopgo\""}) {
            assertTrue(family.contains(pair), pair);
        }
        assertTrue(tool.contains("SHIELD_FREE = {\"gs\", \"fl\"}"), "GUN-11 and the flattener never apply in shield mode");
        assertTrue(tool.contains("--only-carried") && tool.contains("--shielded") && tool.contains("--carry"));
        for (String method : new String[] {"x5Powers", "gunStacks", "fullOffs", "stopGos", "stopGoShifts", "heatJits", "flatOns", "mimicOns", "racePowers"}) {
            assertTrue(tool.contains("\"" + method + "\":"), "carried reads " + method);
        }
        assertEquals(9, Pattern.compile("\"\\w+\": \"\\w+\"").matcher(family).results().count(), "every lever has a family");
    }
}
