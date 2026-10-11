package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** Issue #151: the bench's conditions brought closer to the rumble client's. No battle is started. */
class HarnessGapsTest {

    @Test
    @Tag("BENCH-76")
    @DisplayName("unseeded, a battle gets no RANDOMSEED, as the rumble client runs it; seeded, it gets base + seed")
    void unseededPassesNoSeed() {
        assertEquals(List.of(), Bench.seedFlags(3, 100, true));
        assertEquals(List.of("-DRANDOMSEED=103"), Bench.seedFlags(3, 100, false));
        assertEquals(List.of("-DRANDOMSEED=1"), Bench.seedFlags(1, 0, false));
    }

    @Test
    @Tag("BENCH-76")
    @DisplayName("an unseeded run's reports say so; a seeded run's add nothing")
    void reportsNameUnseeded() {
        assertEquals("", Bench.seedingNote(false));
        assertTrue(Bench.seedingNote(true).contains("Unseeded: no -DRANDOMSEED"));
    }

    @Test
    @Tag("BENCH-76")
    @DisplayName("--unseeded is accepted with the other duel options and shows in the dry run")
    void unseededOptionParses() throws Exception {
        Bench b = new Bench(Map.of("unseeded", "true", "dry-run", "true", "set", "reference-set.txt"));
        java.io.ByteArrayOutputStream buf = new java.io.ByteArrayOutputStream();
        java.io.PrintStream old = System.out;
        System.setOut(new java.io.PrintStream(buf, true, java.nio.charset.StandardCharsets.UTF_8));
        try {
            assertEquals(0, b.run());
        } finally {
            System.setOut(old);
        }
        assertTrue(buf.toString(java.nio.charset.StandardCharsets.UTF_8).contains(", unseeded"));
    }

    @Test
    @Tag("BENCH-77")
    @DisplayName("repeat and shuffle parse, default to one pass in list order, and refuse a repeat under 1")
    void repeatAndShuffleParse(@TempDir Path tmp) throws Exception {
        Path f = tmp.resolve("s.txt");
        Files.writeString(f, "opponents=set.txt\n");
        SessionFile s = SessionFile.parse(f);
        assertEquals(1, s.repeat());
        assertNull(s.shuffle());
        assertEquals(List.of("a", "b"), s.order(List.of("a", "b")));

        Files.writeString(f, "opponents=set.txt\nrepeat=3\nshuffle=151\n");
        s = SessionFile.parse(f);
        assertEquals(3, s.repeat());
        assertEquals(151L, s.shuffle());

        Files.writeString(f, "opponents=set.txt\nrepeat=0\n");
        assertThrows(IllegalArgumentException.class, () -> SessionFile.parse(f));
    }

    @Test
    @Tag("BENCH-77")
    @DisplayName("a repeated list fights every opponent N times; a shuffle is fixed by its seed and keeps the count")
    void orderRepeatsAndShuffles(@TempDir Path tmp) throws Exception {
        Path f = tmp.resolve("s.txt");
        Files.writeString(f, "opponents=set.txt\nrepeat=4\n");
        List<String> set = List.of("a", "b", "c");
        List<String> plain = SessionFile.parse(f).order(set);
        assertEquals(12, plain.size());
        assertEquals(List.of("a", "b", "c", "a"), plain.subList(0, 4));

        Files.writeString(f, "opponents=set.txt\nrepeat=4\nshuffle=7\n");
        List<String> once = SessionFile.parse(f).order(set);
        List<String> again = SessionFile.parse(f).order(set);
        assertEquals(once, again);
        assertFalse(once.equals(plain));
        for (String o : set) assertEquals(4, once.stream().filter(o::equals).count());
    }

    @Test
    @Tag("BENCH-77")
    @DisplayName("with a control, the report gives each opponent's mean share for both and the mean difference, each opponent once")
    void perOpponentDifference() {
        Map<String, List<SessionReport.Row>> sessions = new LinkedHashMap<>();
        // robot: a 70, 80 (mean 75), b 60; control: a 70, b 50, 50.
        sessions.put("hadur2.Hadur 3.9", List.of(row(1, "a", 70), row(2, "b", 60), row(3, "a", 80)));
        sessions.put("hadur2.Hadur 3.8.5", List.of(row(1, "a", 70), row(2, "b", 50), row(3, "b", 50)));
        String report = SessionReport.perOpponent(sessions);
        assertTrue(report.contains("| a | 2 / 1 | 75.00 | 70.00 | +5.00 |"), report);
        assertTrue(report.contains("| b | 1 / 2 | 60.00 | 50.00 | +10.00 |"), report);
        assertTrue(report.contains("Mean difference over 2 opponents: +7.50 points."), report);
        assertTrue(SessionReport.render(sessions, "512M", false, false, 35).contains("Per opponent (BENCH-77)"));
    }

    @Test
    @Tag("BENCH-78")
    @DisplayName("a session pins --cpu-constant in the home it runs in, and leaves the home alone without one")
    void sessionPinsTheConstant(@TempDir Path home) throws Exception {
        Bench.pinSessionCpuConstant(Map.of(), home);
        assertFalse(Files.exists(home.resolve("config/robocode.properties")));
        Bench.pinSessionCpuConstant(Map.of("cpu-constant", " 1488498 "), home);
        assertTrue(Files.readString(home.resolve("config/robocode.properties"))
            .contains("robocode.cpu.constant=1488498"));
    }

    @Test
    @Tag("BENCH-78")
    @Tag("BENCH-79")
    @DisplayName("the session report names the engine, the CPU constant and the order")
    void sessionConditionsLine(@TempDir Path tmp) throws Exception {
        Path f = tmp.resolve("s.txt");
        Files.writeString(f, "opponents=set.txt\nrepeat=8\nshuffle=151\n");
        String line = Bench.sessionConditions(SessionFile.parse(f), 256, "1.11.1",
            "robocode.cpu.constant=1488498 (pinned with --cpu-constant)");
        assertEquals("Engine Robocode 1.11.1. robocode.cpu.constant=1488498 (pinned with --cpu-constant). "
            + "256 battles a robot, the list fought 8 times, shuffled with seed 151.", line);
        String report = SessionReport.render(Map.of("r", List.of(row(1, "a", 60))), "512M", false, false, 35, line);
        assertTrue(report.startsWith("# Session bench (BENCH-6)\n\n" + line + "\n\n"), report);
    }

    @Test
    @Tag("BENCH-79")
    @DisplayName("the default engine is 1.11.1, a release LiteRumble takes uploads from; others are flagged")
    void defaultEngineIsARumbleRelease() throws Exception {
        String pom = Files.readString(Path.of("pom.xml"));
        assertTrue(pom.contains("<robocode.version>1.11.1</robocode.version>"));
        assertEquals("", Report.engineNote("1.11.1"));
        assertEquals("", Report.engineNote("1.10.3"));
        assertTrue(Report.engineNote("1.9.5.6").contains("not a release the rumble accepts"));
    }

    private static SessionReport.Row row(int index, String opponent, double sharePoints) {
        BattleResult r = new BattleResult();
        r.ok = true;
        r.rounds = 35;
        r.score = sharePoints;
        r.theirScore = 100 - sharePoints;
        r.survival = 1;
        r.theirSurvival = 0;
        return new SessionReport.Row(index, opponent, 40, r, 40, 3, 6000, 200, 0, 0, false);
    }
}
