package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-159: the rival-picks card (plans/pc-rival-picks.queue) is complete before it reaches the PC. */
class RivalPicksPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-rival-picks.queue");

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("[\t|]")[0].trim()).toList();
    }

    private static String step(String queue, String name, String next) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = next == null ? queue.length() : queue.indexOf("\n\n" + next + " | ");
        return queue.substring(at, end < 0 ? queue.length() : end);
    }

    @Test
    @Tag("BENCH-159")
    @DisplayName("three lists with their panels and arms, 3 seeds from 5600, picks, per-robot reads and stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> add = names("plans/rival-shield-add.txt");
        List<String> exec = names("plans/rival-shield-exec.txt");
        List<String> stopGo = names("plans/rival-stopgo.txt");
        List<String> drop = names("plans/rival-stopgo-drop.txt");
        assertEquals(74, add.size());
        assertEquals(50, exec.size());
        assertEquals(36, stopGo.size());
        assertEquals(16, drop.size());
        assertEquals(add, names("panel-rival-shield-add.txt"), "the add panel is the add list");
        assertEquals(exec, names("panel-rival-shield-exec.txt"), "the exec panel is the exec list");
        assertEquals(stopGo, names("panel-rival-stopgo.txt"), "the stop-and-go panel is its list");
        assertTrue(stopGo.containsAll(drop), "every robot taken off the shield list plays stop-and-go");
        assertFalse(stopGo.contains("wiki.nano.Flick 1.0"), "Flick stays out: we lead it by 10 points");

        String listData = Files.readString(Path.of("../hadur-robot/src/main/java/hadur117/ShieldListData.java"));
        for (String n : drop) assertTrue(listData.contains("\"" + n + "\","), n + " is on the shield list to drop");
        for (String n : add) assertFalse(listData.contains("\"" + n + "\","), n + " is not on the shield list yet");

        String[][] arms = {
            {"plans/rival-shield-add.arms", "c", "aa", "mt", "mtzl"},
            {"plans/rival-shield-exec.arms", "c", "aa", "zl", "x0", "zlx0"},
            {"plans/rival-stopgo.arms", "c", "aa", "mdwl", "mdwm"}};
        for (String[] a : arms) {
            String text = Files.readString(Path.of(a[0]));
            for (int i = 1; i < a.length; i++) {
                assertTrue(text.contains("\n" + a[i] + " | hadur117.Hadur 3.20" + (i == 1 ? "" : a[i]) + " | "), a[0] + " " + a[i]);
            }
        }

        String prep = step(queue, "prep", "screen-add");
        for (String build : new String[] {
            "bash ./build-ablation.sh aa ",
            "SHIELD_ADD=plans/rival-shield-add.txt bash ./build-ablation.sh slistadd ",
            "SHIELD_ADD=plans/rival-shield-add.txt SHIELD_STILL=plans/rival-shield-add.txt bash ./build-ablation.sh slistadd,szlist ",
            "SHIELD_STILL=plans/rival-shield-exec.txt bash ./build-ablation.sh szlist ",
            "SHIELD_EXIT0=plans/rival-shield-exec.txt bash ./build-ablation.sh sx0list ",
            "SHIELD_STILL=plans/rival-shield-exec.txt SHIELD_EXIT0=plans/rival-shield-exec.txt bash ./build-ablation.sh szlist,sx0list ",
            "SHIELD_DROP=plans/rival-stopgo-drop.txt STOP_GO=plans/rival-stopgo.txt bash ./build-ablation.sh slistdrop,sgolist ",
            "SHIELD_DROP=plans/rival-stopgo-drop.txt STOP_GO2=plans/rival-stopgo.txt bash ./build-ablation.sh slistdrop,sgo2list "}) {
            assertTrue(prep.contains(build), build);
        }

        String[][] screens = {
            {"screen-add", "screen-exec", "panel-rival-shield-add.txt", "plans/rival-shield-add.arms", "prep"},
            {"screen-exec", "screen-stopgo", "panel-rival-shield-exec.txt", "plans/rival-shield-exec.arms", "screen-add"},
            {"screen-stopgo", "gate", "panel-rival-stopgo.txt", "plans/rival-stopgo.arms", "screen-exec"}};
        for (String[] s : screens) {
            String body = step(queue, s[0], s[1]);
            assertTrue(body.contains("--set " + s[2] + " --seeds 3 --seed-base 5600 --arms " + s[3]), s[0]);
            assertTrue(body.contains("--shuffle-jobs") && body.contains("watch: field=1217"), s[0]);
            assertTrue(body.contains("after: " + s[4]), s[0] + " after " + s[4]);
            for (String rule : new String[] {"fails 30", "dead 8", "skips 40 over 200", "stall 30m"}) {
                assertTrue(body.contains("stop: " + rule), s[0] + " " + rule);
            }
        }

        String gate = step(queue, "gate", "pr");
        assertTrue(gate.contains("after: screen-stopgo"));
        assertTrue(gate.contains("mode_table.py ${W}/$s/arms.tsv --margin 5") && gate.contains("|| exit 1"),
            "a failed pick stops the card before the results PR");
        for (String a : new String[] {"--arms mt mtzl", "--arms zl x0 zlx0", "--arms mdwl mdwm"}) assertTrue(gate.contains(a), a);
        assertTrue(step(queue, "pr", null).contains("after: gate"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-rival-picks-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
    }
}
