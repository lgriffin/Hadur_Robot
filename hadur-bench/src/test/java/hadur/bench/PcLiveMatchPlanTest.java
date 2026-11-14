package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
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
        }
        assertTrue(q.contains("\nread | rm -f ${OUT}/pc-livematch-old.md ${OUT}/pc-livematch-live.md && for t in old live; do "
            + "python3 tools/live_match.py ${W}-$t/arms.tsv --out ${OUT}/pc-livematch-$t.md; rc=$?; "
            + "if [ $rc -ne 0 ] && [ $rc -ne 3 ]; then exit $rc; fi; test -s ${OUT}/pc-livematch-$t.md || exit 1; done\n"),
            "both runs read fresh against live; a FAIL verdict goes on, an error stops");
        assertTrue(q.contains("set P = --parallel 16 --no-truth-log --failed-ok"), "16 workers, as every PC card");
        assertTrue(!q.contains("cpu-constant 1488498 --child") && q.contains("set C = --skip-build --skip-fetch --rounds 35 --child-heap 2G\n"),
            "each step names its own turn time");
        assertTrue(q.contains("stop: fails 30") && q.contains("stop: stall 30m") && !q.contains("stop: skips"),
            "no skips stop: BeepBoop's skips at the old constant are the measurement");
        assertTrue(q.contains("tools/open_results_pr.sh claude/pc-livematch-results ") 
            && q.contains(" ${OUT}/pc-livematch-old.md ${OUT}/pc-livematch-live.md\n"), "the PR carries only this run's two reports");
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

    /** One queue step: its name, its command with every {@code ${VAR}} expanded, and the step it waits for. */
    private record Step(String name, String cmd, String after) {}

    private static Map<String, Step> steps(String q) {
        Map<String, String> vars = new HashMap<>();
        Map<String, Step> out = new LinkedHashMap<>();
        Pattern set = Pattern.compile("^set ([A-Za-z0-9_]+) = (.*)$");
        Pattern head = Pattern.compile("^([a-z0-9-]+) \\| (.*)$");
        String name = null, cmd = null, after = null;
        for (String l : (q + "\n").split("\n")) {
            Matcher m = set.matcher(l);
            if (m.matches()) { vars.put(m.group(1), m.group(2)); continue; }
            m = head.matcher(l);
            if (m.matches() || l.isBlank()) {
                if (name != null) out.put(name, new Step(name, cmd, after));
                name = null;
                if (m.matches()) {
                    name = m.group(1);
                    cmd = expand(m.group(2), vars);
                    after = null;
                }
            } else if (name != null && l.startsWith("  after: ")) {
                after = l.substring("  after: ".length()).trim();
            }
        }
        if (name != null) out.put(name, new Step(name, cmd, after));
        return out;
    }

    private static String expand(String cmd, Map<String, String> vars) {
        for (int i = 0; i < 5 && cmd.contains("${"); i++) {
            for (Map.Entry<String, String> e : vars.entrySet()) cmd = cmd.replace("${" + e.getKey() + "}", e.getValue());
        }
        return cmd;
    }

    /**
     * The BENCH-245 rule for one new PC card. A card is 1v1 unless it declares {@code # battle: melee} or
     * {@code # battle: team}. A 1v1 card runs every bench through bench-top20.sh, each at {@code --cpu-constant live}
     * and nothing else, and every bench step waits, directly or through earlier steps, for a {@code livematch} step
     * that runs master and BeepBoop and reads them with tools/live_match.py.
     */
    static List<String> violations(String f, String q) {
        List<String> bad = new ArrayList<>();
        if (q.contains("\n# battle: melee") || q.contains("\n# battle: team") || q.startsWith("# battle: melee")
                || q.startsWith("# battle: team")) return bad;
        Map<String, Step> steps = steps(q);
        Step gate = steps.get("livematch");
        if (gate == null || !gate.cmd().contains("./bench-top20.sh") || !gate.cmd().contains("plans/livematch.arms")
                || !gate.cmd().contains("tools/live_match.py")) {
            bad.add(f + ": no livematch step (c and BeepBoop through plans/livematch.arms, read by tools/live_match.py)");
        }
        Pattern cc = Pattern.compile("--cpu-constant\\s+(\\S+)");
        for (Step s : steps.values()) {
            if (s.cmd().contains("exec:java") || s.cmd().contains("hadur.bench.Bench")) {
                bad.add(f + ": step " + s.name() + " runs the bench directly; a 1v1 PC card runs it through bench-top20.sh "
                    + "(or declares # battle: melee/team)");
                continue;
            }
            if (!s.cmd().contains("bench-top20.sh")) continue;
            Matcher m = cc.matcher(s.cmd());
            boolean live = false;
            while (m.find()) {
                if (m.group(1).equals("live")) live = true;
                else bad.add(f + ": step " + s.name() + " runs at --cpu-constant " + m.group(1) + ", not live");
            }
            if (!live) bad.add(f + ": step " + s.name() + " has no --cpu-constant live");
            if (s.name().equals("livematch")) continue;
            Set<String> seen = new HashSet<>();
            String a = s.after();
            while (a != null && !a.equals("livematch") && seen.add(a) && steps.containsKey(a)) a = steps.get(a).after();
            if (!"livematch".equals(a)) bad.add(f + ": step " + s.name() + " does not wait for livematch");
        }
        return bad;
    }

    @Test
    @Tag("BENCH-245")
    @DisplayName("every 1v1 PC card after 14 Nov pins --cpu-constant live on each bench and runs the live-match check before them")
    void newPcCardsMatchLive() throws IOException {
        Set<String> legacy = new HashSet<>();
        for (String l : Files.readAllLines(Path.of("plans/timing-legacy.txt"))) {
            if (!l.isBlank() && !l.startsWith("#")) legacy.add(l.trim());
        }
        List<String> bad = new ArrayList<>();
        try (Stream<Path> s = Files.list(Path.of("plans"))) {
            for (Path p : s.sorted().toList()) {
                String f = p.getFileName().toString();
                if (!f.startsWith("pc-") || !f.endsWith(".queue") || legacy.contains(f) || f.equals("pc-livematch.queue")) continue;
                bad.addAll(violations(f, Files.readString(p)));
            }
        }
        assertEquals(List.of(), bad);
    }

    private static final String GOOD = """
        set P = --parallel 16
        set C = --rounds 35 --cpu-constant live
        set W = work/x
        prep | true

        livematch | ./bench-top20.sh ${C} ${P} --set panel-r31.txt --arms plans/livematch.arms --out ${W}-lm && python3 tools/live_match.py ${W}-lm/arms.tsv
          after: prep

        screen | ./bench-top20.sh ${C} ${P} --set panel-r31.txt --arms plans/x.arms --out ${W}
          after: livematch

        lock | ./bench-top20.sh ${C} ${P} --set panel-r31.txt --arms plans/x.arms --out ${W}-lock
          after: pick

        pick | python3 pick.py
          after: screen
        """;

    @Test
    @Tag("BENCH-245")
    @DisplayName("the rule passes a gated card and fails each way a card could slip past it")
    void ruleCatchesEachEscape() {
        assertEquals(List.of(), violations("good", GOOD));
        assertEquals(2, violations("a", GOOD.replace("after: livematch", "after: prep")).size(),
            "screen waits only for prep, and lock waits for it through pick");
        assertEquals(1, violations("b", GOOD.replace("--arms plans/x.arms --out ${W}\n",
            "--arms plans/x.arms --cpu-constant 1488498 --out ${W}\n")).size(), "one bench at the old constant");
        assertEquals(3, violations("c", GOOD.replace(" --cpu-constant live", "")).size(), "no constant on any bench");
        assertTrue(!violations("d", GOOD.replace("livematch |", "check |").replace("after: livematch", "after: check")).isEmpty());
        assertEquals(1, violations("e", GOOD + "\nraw | mvn -q exec:java -Dexec.args=@x.args\n  after: livematch\n").size(),
            "a direct-runner 1v1 bench");
        assertEquals(List.of(), violations("f", "# battle: melee\n" + GOOD.replace(" --cpu-constant live", "")));
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
