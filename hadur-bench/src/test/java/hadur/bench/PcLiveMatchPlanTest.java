package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * BENCH-245: the PC bench must score us AND BeepBoop as LiteRumble does. The pc-livematch card checks the PC at
 * two turn times; every 1v1 PC card written after it pins the live turn time and runs the live-match check first.
 */
class PcLiveMatchPlanTest {

    private static String version() throws IOException {
        return Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
    }

    @Test
    @Tag("BENCH-245")
    @DisplayName("pc-livematch: c and BeepBoop on the 31 robots, 2 seeds, at the live constant and at 1488498, both read against live, a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-livematch.queue"));
        assertTrue(q.contains("set V = " + version() + "\n"), "the card builds the current release");
        assertTrue(q.contains("./fetch-opponents.sh --set livematch-bb.txt") && q.contains("test -f opponents/kc.mega.BeepBoop_2.0.jar"));
        for (String step : List.of("live", "old")) {
            String cc = step.equals("live") ? "live" : "1488498";
            assertTrue(q.contains("\n" + step + " | ./bench-top20.sh ${C} --cpu-constant " + cc + " ${P} --set panel-r31.txt --seeds 2 --seed-base 21700 --arms plans/livematch.arms --out ${W}-" + step + " "), step);
            assertTrue(q.contains("tools/live_match.py ${W}-" + step + "/arms.tsv --out "), step + " is read against live");
        }
        assertTrue(q.contains("set P = --parallel 16 --no-truth-log --failed-ok"), "16 workers, as every PC card");
        assertTrue(!q.contains("cpu-constant 1488498 --child") && q.contains("set C = --skip-build --skip-fetch --rounds 35 --child-heap 2G\n"),
            "each step names its own turn time");
        assertTrue(q.contains("stop: fails 30") && q.contains("stop: stall 30m") && !q.contains("stop: skips"),
            "no skips stop: BeepBoop's skips at the old constant are the measurement");
        assertTrue(q.contains("tools/open_results_pr.sh claude/pc-livematch-results"));
        assertTrue(q.contains("set ALERT = lgriffin"));
    }

    @Test
    @Tag("BENCH-245")
    @DisplayName("the live-match arms are master and BeepBoop 2.0, and the live reference covers the 31-robot panel")
    void armsAndReference() throws IOException {
        String arms = Files.readString(Path.of("plans/livematch.arms"));
        String v = version();
        assertTrue(arms.contains("\nc | hadur117.Hadur " + v + " | bisect/hadur117.Hadur_" + v + ".jar\n"), "c is the current release");
        assertTrue(arms.contains("\nbb | kc.mega.BeepBoop 2.0 | opponents/kc.mega.BeepBoop_2.0.jar\n"));
        Set<String> live = new HashSet<>();
        for (String l : Files.readAllLines(Path.of("plans/live-1v1-2026-11-13.tsv"))) {
            if (!l.startsWith("#") && !l.startsWith("robot\t")) live.add(l.split("\t")[0]);
        }
        for (String l : Files.readAllLines(Path.of("panel-r31.txt"))) {
            if (l.isBlank() || l.startsWith("#")) continue;
            String name = l.split("\\|")[0].trim().split(" ")[0];
            assertTrue(live.contains(name), name + " has a live score");
        }
    }

    @Test
    @Tag("BENCH-245")
    @DisplayName("every 1v1 PC card after 14 Nov pins --cpu-constant live and runs the live-match check before its benches")
    void newPcCardsMatchLive() throws IOException {
        Set<String> legacy = new HashSet<>();
        for (String l : Files.readAllLines(Path.of("plans/timing-legacy.txt"))) {
            if (!l.isBlank() && !l.startsWith("#")) legacy.add(l.trim());
        }
        List<String> bad = new ArrayList<>();
        Pattern cc = Pattern.compile("--cpu-constant\\s+(\\S+)");
        try (Stream<Path> s = Files.list(Path.of("plans"))) {
            for (Path p : s.sorted().toList()) {
                String f = p.getFileName().toString();
                if (!f.startsWith("pc-") || !f.endsWith(".queue") || legacy.contains(f) || f.equals("pc-livematch.queue")) continue;
                String q = Files.readString(p);
                if (!q.contains("bench-top20.sh")) continue; // melee and team cards use their own scripts
                Matcher m = cc.matcher(q);
                boolean pinned = false;
                while (m.find()) {
                    pinned = true;
                    if (!m.group(1).equals("live")) bad.add(f + ": --cpu-constant " + m.group(1) + ", not live");
                }
                if (!pinned) bad.add(f + ": no --cpu-constant live");
                if (!q.contains("\nlivematch | ") || !q.contains("tools/live_match.py") || !q.contains("plans/livematch.arms")) {
                    bad.add(f + ": no livematch step (c and BeepBoop on panel-r31.txt, read by tools/live_match.py)");
                }
                for (String block : q.split("\n(?=[a-z0-9-]+ \\| )")) {
                    if (block.contains("./bench-top20.sh") && !block.contains("\n  after: ")) {
                        bad.add(f + ": a bench step runs without waiting for an earlier step");
                    }
                }
                if (!q.contains("  after: livematch")) {
                    bad.add(f + ": no bench step waits for livematch");
                }
            }
        }
        assertEquals(List.of(), bad);
    }

    @Test
    @Tag("BENCH-245")
    @DisplayName("the legacy list is frozen at the 170 cards of 14 Nov and names only cards that exist")
    void legacyListIsClosed() throws IOException {
        List<String> missing = new ArrayList<>();
        int n = 0;
        for (String l : Files.readAllLines(Path.of("plans/timing-legacy.txt"))) {
            if (l.isBlank() || l.startsWith("#")) continue;
            n++;
            if (!Files.exists(Path.of("plans", l.trim()))) missing.add(l.trim());
        }
        assertEquals(List.of(), missing);
        assertEquals(170, n, "no card joins the legacy list after the rule");
        assertTrue(!Files.readString(Path.of("plans/timing-legacy.txt")).contains("pc-livematch.queue"));
    }
}
