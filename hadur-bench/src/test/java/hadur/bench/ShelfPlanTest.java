package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-180: the K3 shelf card (plans/pc-shelf.queue) is complete before it reaches the PC. */
class ShelfPlanTest {

    private static List<String> names(String file, String split) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split(split)[0].trim()).toList();
    }

    private static String step(String queue, String name, String next) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = next == null ? queue.length() : queue.indexOf("\n" + next + " | ");
        return queue.substring(at, end);
    }

    @Test
    @Tag("BENCH-180")
    @DisplayName("two panels with their switch arms, a per-robot pilot per panel, the pick, one confirm jar, the gate and the PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-shelf.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> u = names("panel-shelf-u.txt", "\\|");
        List<String> s = names("panel-shelf-s.txt", "\\|");
        assertEquals(177, u.size());
        assertEquals(33, s.size());
        assertEquals(u, names("plans/shelf-u.list", "\t"), "U's switches name exactly its panel");
        assertEquals(s, names("plans/shelf-s.list", "\t"), "S's switches name exactly its panel");
        List<String> shield = List.of(Files.readString(Path.of("../hadur-robot/src/main/java/hadur117/ShieldListData.java"))
            .split("\n")).stream().map(String::trim).filter(l -> l.startsWith("\"") && l.endsWith("\","))
            .map(l -> l.substring(1, l.length() - 2)).toList();
        // Issue #630: pilot-u found these two do not load; the bench drops them, the panel keeps its first run's names.
        List<String> foundBroken = List.of("zen.Mirage 0.9.5", "zen.Ronin 1.0.0");
        // pc-shield-audit (PR #697) shielded Princess, pc-ala-shield (PR #733) Ala and pc-shield-rescreen (PR #739)
        // Saturn and OperatorZeze, and pc-still-field (PR #746) X2, Che and Aardvark after this card ran; U was the
        // unshielded panel at run time.
        List<String> shieldedSince = List.of("cx.Princess 1.0", "lechu.Ala 0.0.4", "tobe.Saturn lambda",
            "zeze2.OperatorZeze 1.05", "florent.XSeries.X2 0.17", "cjm.Che 1.2", "djc.Aardvark 0.3.6");
        for (String n : u) {
            assertTrue(shieldedSince.contains(n) || !shield.contains(n), n + " is off the shield list");
            assertTrue(!s.contains(n), n + " on one panel only");
            assertTrue(foundBroken.contains(n) || !Broken.names(Path.of(Broken.FILE)).contains(n), n + " loads on 1.11.2");
        }
        for (String n : s) {
            assertTrue(shield.contains(n), n + " is on the shield list");
            assertTrue(!Broken.names(Path.of(Broken.FILE)).contains(n), n + " loads on 1.11.2");
        }
        assertEquals(List.of("c", "aa", "mt", "wl", "hl", "gl"), names("plans/shelf-u.arms", "\\|"));
        assertEquals(List.of("c", "aa", "md", "zl", "x0", "x4", "mv"), names("plans/shelf-s.arms", "\\|"));
        String[] steps = {"prep", "pilot-s", "screen-s", "pilot-u", "screen-u", "pick", "build", "confirm", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            String body = step(queue, steps[i], i + 1 < steps.length ? steps[i + 1] : null);
            assertTrue(body.contains("after: " + steps[i - 1]), steps[i] + " after " + steps[i - 1]);
        }
        for (String p : new String[] {"s", "u"}) {
            String pilot = step(queue, "pilot-" + p, "screen-" + p);
            assertTrue(pilot.contains("--seeds 1 --seed-base 9300") && pilot.contains("tools/shelf_pilot.py")
                && pilot.contains("--stop-file work/shelf-" + p + ".stop"), "pilot " + p + " reads the first of 5 seeds");
            String screen = step(queue, "screen-" + p, p.equals("s") ? "pilot-u" : "pick");
            assertTrue(screen.contains("if [ -f work/shelf-" + p + ".stop ]") && screen.contains("--seeds 5 --seed-base 9300")
                && screen.contains("--out ${W}/" + p + " "), "screen " + p + " skips on a stop and resumes the pilot's seed");
            for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%"}) {
                assertTrue(screen.contains("stop: " + rule), p + " " + rule);
            }
        }
        assertTrue(queue.contains("--seeds 12 --seed-base 9500 --arms ${W}/jar/shelf.arms"), "picks on 12 fresh seeds");
        assertTrue(queue.contains("--arm sh --panel work/panel-shelf-picks.txt"));
        assertTrue(step(queue, "build", "confirm").contains("rm -f ${OUT}/*_shelf-confirm*.md"), "old confirms never reach the PR");
        assertTrue(queue.contains("# Why it should win"), "the card says why it should win before it runs");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-shelf-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log --failed-ok"));
    }
}
