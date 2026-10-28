package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** BENCH-92 (multi-arm runs) and BENCH-93 (pinned workers), docs/plan-top5.md section 6.1. */
class ArmsTest {

    private static Path armsFile(Path dir, String... lines) throws IOException {
        Path f = dir.resolve("arms.txt");
        Files.write(f, List.of(lines));
        return f;
    }

    @Test
    @Tag("BENCH-92")
    @DisplayName("an arms file gives each arm's label, Robocode name and jar, relative jars from the bench folder")
    void parsesArms(@TempDir Path dir) throws IOException {
        Path f = armsFile(dir, "# control and its A/A copy", "", "c | hadur2.Hadur 3.14 | bisect/a.jar",
            "aa | hadur2.Hadur 3.14aa | /abs/b.jar");
        List<Arms.Arm> arms = Arms.parse(f, dir);
        assertEquals(2, arms.size());
        assertEquals("c", arms.get(0).label());
        assertEquals("hadur2.Hadur 3.14aa", arms.get(1).robot());
        assertEquals(dir.resolve("bisect/a.jar"), arms.get(0).jar());
        assertEquals(Path.of("/abs/b.jar"), arms.get(1).jar());
    }

    @Test
    @Tag("BENCH-92")
    @DisplayName("an arms file with one arm, a repeated label or robot, or a malformed line is refused")
    void refusesBadArms(@TempDir Path dir) throws IOException {
        assertThrows(IllegalArgumentException.class, () -> Arms.parse(armsFile(dir, "c | hadur2.Hadur 3.14 | a.jar"), dir));
        assertThrows(IllegalArgumentException.class, () -> Arms.parse(armsFile(dir,
            "c | hadur2.Hadur 3.14 | a.jar", "c | hadur2.Hadur 3.14aa | b.jar"), dir));
        assertThrows(IllegalArgumentException.class, () -> Arms.parse(armsFile(dir,
            "c | hadur2.Hadur 3.14 | a.jar", "d | hadur2.Hadur 3.14 | b.jar"), dir));
        assertThrows(IllegalArgumentException.class, () -> Arms.parse(armsFile(dir,
            "c | hadur2.Hadur 3.14 | a.jar", "d/x | hadur2.Hadur 3.14aa | b.jar"), dir));
        assertThrows(IllegalArgumentException.class, () -> Arms.parse(armsFile(dir,
            "c | hadur2.Hadur 3.14 | a.jar", "d | hadur2.Hadur | b.jar"), dir));
        assertThrows(IllegalArgumentException.class, () -> Arms.parse(armsFile(dir,
            "c | hadur2.Hadur 3.14 | a.jar", "d | hadur2.Hadur 3.14aa"), dir));
    }

    @Test
    @Tag("BENCH-92")
    @DisplayName("a job's arm order is a shuffle that repeats for the same job and differs across jobs")
    void orderIsShuffledPerJob() {
        List<Arms.Arm> arms = List.of(new Arms.Arm("a", "x.A 1", Path.of("a")), new Arms.Arm("b", "x.B 1", Path.of("b")),
            new Arms.Arm("c", "x.C 1", Path.of("c")), new Arms.Arm("d", "x.D 1", Path.of("d")));
        assertEquals(Arms.order(arms, 1120, 3, "kc.mega.BeepBoop 2.0"), Arms.order(arms, 1120, 3, "kc.mega.BeepBoop 2.0"));
        Set<List<Arms.Arm>> orders = new HashSet<>();
        Map<String, Integer> firsts = new HashMap<>();
        for (int seed = 1; seed <= 400; seed++) {
            List<Arms.Arm> o = Arms.order(arms, 0, seed, "opp");
            assertEquals(new HashSet<>(arms), new HashSet<>(o), "every arm, once");
            orders.add(o);
            firsts.merge(o.get(0).label(), 1, Integer::sum);
        }
        assertTrue(orders.size() > 12, "many distinct orders");
        for (Arms.Arm a : arms) {
            int n = firsts.getOrDefault(a.label(), 0);
            assertTrue(n > 60 && n < 140, a.label() + " first in " + n + " of 400 jobs");
        }
        assertNotEquals(Arms.order(arms, 0, 1, "opp-a"), Arms.order(arms, 0, 1, "opp-b"));
    }

    @Test
    @Tag("BENCH-92")
    @DisplayName("each battle is one tab-separated row, and the report counts each arm's battles, disables and skips")
    void rowsAndReport() {
        BattleResult r = new BattleResult();
        r.ok = true;
        r.rounds = 35;
        r.score = 3000;
        r.theirScore = 1000;
        r.skippedTurns = 12;
        r.engineDisables = 1;
        r.errors = "a\tb\nc";
        Opponent o = new Opponent("ap.Frederick 1.1", "rank903-band6", "ap.Frederick_1.1.jar", 0);
        String row = Arms.row(new Arms.Arm("c", "hadur2.Hadur 3.14", Path.of("a")), o, 2, 5, 1, r);
        String[] f = row.split("\t", -1);
        assertEquals(Arms.HEADER.split("\t").length, f.length);
        assertEquals("0.7500", f[11]);
        assertEquals("a b c", f[24]);
        String other = Arms.row(new Arms.Arm("aa", "hadur2.Hadur 3.14aa", Path.of("b")), o, 2, 5, 2, r);
        String report = Bench.renderArms(List.of(row, other, row));
        assertTrue(report.contains("| c | 2 | 2 | 75.00% | 2 | 12.0 |"), report);
        assertTrue(report.contains("| aa | 1 | 1 | 75.00% | 1 | 12.0 |"), report);
    }

    @Test
    @Tag("BENCH-93")
    @DisplayName("worker w is bound to its own pair of processors, after the first core")
    void masks() {
        assertEquals(0b1100L, Affinity.mask(1, 2, 2));
        assertEquals(0b110000L, Affinity.mask(2, 2, 2));
        assertEquals(0x3L << 46, Affinity.mask(23, 2, 2));
        assertThrows(IllegalArgumentException.class, () -> Affinity.mask(32, 2, 2));
        assertThrows(IllegalArgumentException.class, () -> Affinity.mask(0, 2, 2));
        assertEquals(23, Affinity.maxWorkers(48, 2, 2));
        assertEquals(31, Affinity.maxWorkers(128, 2, 2), "a mask holds 64 processors");
    }

    @Test
    @Tag("BENCH-93")
    @DisplayName("the binding is PowerShell's ProcessorAffinity on Windows and taskset on every thread elsewhere")
    void commands() {
        assertEquals(List.of("powershell", "-NoProfile", "-NonInteractive", "-Command",
            "(Get-Process -Id 4242).ProcessorAffinity = 12"), Affinity.command("Windows 11", 4242, 12));
        assertEquals(List.of("taskset", "-a", "-p", "c", "4242"), Affinity.command("Linux", 4242, 12));
    }

    @Test
    @Tag("BENCH-95")
    @Tag("BENCH-128")
    @DisplayName("a finished battle's kept row is read back for the same arm, opponent and seed; a failed, foreign or missing one is fought again")
    void resumesOnlyFinishedBattles(@TempDir Path dir) throws IOException {
        Arms.Arm c = new Arms.Arm("c", "hadur2.Hadur 3.14", dir.resolve("a.jar"));
        Arms.Arm rc = new Arms.Arm("rc", "hadur2.Hadur 3.14swnf", dir.resolve("b.jar"));
        Opponent o = new Opponent("x.Bot 1.0", "rank1-band1", "x.Bot_1.0.jar", 0);
        Opponent other = new Opponent("y.Bot 2.0", "rank2-band1", "y.Bot_2.0.jar", 0);
        BattleResult ok = BattleResult.parse("true" + BattleResult.failed("none").substring("false".length()));
        String row = Arms.row(c, o, 1, 3, 2, ok);
        assertEquals(null, Arms.resumed(dir, c, o, 1), "no file: fought");
        Files.writeString(dir.resolve(Arms.ROW_FILE), row + "\n");
        assertEquals(row, Arms.resumed(dir, c, o, 1));
        // BENCH-128: a clean battle's row ends in an empty errors column (a trailing tab), as on the PC.
        ok.errors = "";
        String clean = Arms.row(c, o, 1, 3, 2, ok);
        assertTrue(clean.endsWith("\t"), "an empty errors column ends the row with a tab");
        Files.writeString(dir.resolve(Arms.ROW_FILE), clean + "\r\n");
        assertEquals(clean, Arms.resumed(dir, c, o, 1), "a clean battle is read back, not fought again");
        assertEquals(null, Arms.resumed(dir, rc, o, 1), "another arm's row");
        assertEquals(null, Arms.resumed(dir, c, other, 1), "another opponent's row");
        assertEquals(null, Arms.resumed(dir, c, o, 2), "another seed's row");
        Files.writeString(dir.resolve(Arms.ROW_FILE), Arms.row(c, o, 1, 3, 2, BattleResult.parse(BattleResult.failed("boom"))) + "\n");
        assertEquals(null, Arms.resumed(dir, c, o, 1), "a failed battle is fought again");
        Files.writeString(dir.resolve(Arms.ROW_FILE), "c\thadur2.Hadur 3.14\tx.Bot 1.0");
        assertEquals(null, Arms.resumed(dir, c, o, 1), "a half-written row is fought again");
    }
}
