package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** BENCH-6 and BENCH-7: a session file, its blocks of 25 battles, and the reproduction gate. */
@Tag("BENCH-6")
@Tag("BENCH-7")
class SessionTest {

    @Test
    @DisplayName("a session file's keys parse, with the client's 512 MB cap, one JVM and a kept data directory by default")
    void parsesSessionFile(@TempDir Path tmp) throws Exception {
        Path f = tmp.resolve("s.txt");
        Files.writeString(f, "# comment\nopponents=set.txt\n");
        SessionFile s = SessionFile.parse(f);
        assertEquals("set.txt", s.opponents());
        assertEquals("512M", s.heap());
        assertEquals("-Xmx512M", s.heapFlag());
        assertFalse(s.fresh());
        assertFalse(s.wipe());
        assertEquals(35, s.rounds());
        assertNull(s.control());

        Files.writeString(f, "opponents=set.txt\nheap=none\nfresh=true\nwipe=true\nrounds=3\n"
            + "control=hadur2.Hadur 2.2\ncontrol-jar=/x/y.jar\n");
        s = SessionFile.parse(f);
        assertNull(s.heapFlag());
        assertTrue(s.fresh());
        assertTrue(s.wipe());
        assertEquals(3, s.rounds());
        assertEquals("hadur2.Hadur 2.2", s.control());
        assertEquals("/x/y.jar", s.controlJar());
    }

    @Test
    @DisplayName("a session file with no opponents is refused")
    void needsOpponents(@TempDir Path tmp) throws Exception {
        Path f = tmp.resolve("s.txt");
        Files.writeString(f, "heap=512M\n");
        assertThrows(IllegalArgumentException.class, () -> SessionFile.parse(f));
    }

    @Test
    @DisplayName("the reproduction gate fires on a slide, or on any engine disable")
    void reproductionGate() {
        List<SessionReport.Row> healthy = session(300, i -> 1.0, i -> 0);
        assertFalse(SessionReport.reproduced(healthy));

        // survival falls from 100% to 70% over the last 100 battles
        List<SessionReport.Row> slide = session(300, i -> i < 200 ? 1.0 : 0.7, i -> 0);
        assertTrue(SessionReport.reproduced(slide));

        // a fall that never starts from a healthy first 50 is not this slide
        List<SessionReport.Row> alwaysBad = session(300, i -> 0.7, i -> 0);
        assertFalse(SessionReport.reproduced(alwaysBad));

        // one engine disable is enough
        assertTrue(SessionReport.reproduced(session(300, i -> 1.0, i -> i == 120 ? 1 : 0)));
        // a short session cannot show the slide
        assertFalse(SessionReport.reproduced(session(100, i -> i < 50 ? 1.0 : 0.5, i -> 0)));
    }

    @Test
    @DisplayName("only opponents under 50 APS count towards weak survival")
    void weakSurvivalIgnoresStrongBots() {
        List<SessionReport.Row> rows = new ArrayList<>();
        rows.add(row(1, 20, 1.0, 0));
        rows.add(row(2, 80, 0.0, 0));
        rows.add(row(3, Double.NaN, 0.0, 0));
        assertEquals(1.0, SessionReport.weakSurvival(rows, 0, 3), 1e-9);
    }

    @Test
    @DisplayName("the report gives one row per block of 25 battles and puts a control beside the robot")
    void reportsBlocksAndControl() {
        Map<String, List<SessionReport.Row>> sessions = new LinkedHashMap<>();
        sessions.put("hadur2.Hadur 3.3", session(60, i -> i < 30 ? 1.0 : 0.8, i -> 0));
        String one = SessionReport.render(sessions, "512M", false, false, 35);
        assertTrue(one.contains("| 1-25 |"), one);
        assertTrue(one.contains("| 26-50 |"), one);
        assertTrue(one.contains("| 51-60 |"), one);
        assertFalse(one.contains("Side by side"));

        sessions.put("sample.Tracker 1.0", session(60, i -> 1.0, i -> 0));
        String two = SessionReport.render(sessions, "512M", false, false, 35);
        assertTrue(two.contains("Side by side (BENCH-7)"), two);
        assertTrue(two.contains("one JVM for the whole session"));
    }

    @Test
    @DisplayName("a session CSV record reads back by column name")
    void columnsByName() {
        Map<String, String> c = SessionReport.columns(SessionRunner.HEADER, "7,a b,true,41.5,3.2,6100,900,0,0,19");
        assertEquals("7", c.get("index"));
        assertEquals("41.5", c.get("heapAfterGcMb"));
        assertEquals("0", c.get("engineDisables"));
    }

    @Test
    @DisplayName("the sampled set holds 300 distinct robots named after their jars")
    void sessionSetLoads() throws Exception {
        List<Opponent> set = Opponent.load(Path.of("session-300-opponents.txt"));
        assertEquals(300, set.size());
        assertEquals(300, set.stream().map(o -> o.name).distinct().count());
        for (Opponent o : set) {
            assertEquals(o.jar, o.name.replace(' ', '_') + ".jar", o.name);
        }
    }

    private static List<SessionReport.Row> session(int n, java.util.function.IntToDoubleFunction survival,
                                                   java.util.function.IntUnaryOperator disables) {
        List<SessionReport.Row> rows = new ArrayList<>();
        for (int i = 0; i < n; i++) rows.add(row(i + 1, 20, survival.applyAsDouble(i), disables.applyAsInt(i)));
        return rows;
    }

    private static SessionReport.Row row(int index, double aps, double survival, int disables) {
        BattleResult r = new BattleResult();
        r.ok = true;
        r.rounds = 35;
        r.score = 60;
        r.theirScore = 40;
        r.survival = survival;
        r.theirSurvival = 1 - survival;
        return new SessionReport.Row(index, "bot" + index, aps, r, 40, 3, 6000, 200, disables, 0);
    }
}
