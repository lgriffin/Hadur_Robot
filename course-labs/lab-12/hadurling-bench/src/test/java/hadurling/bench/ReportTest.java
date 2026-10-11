package hadurling.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class ReportTest {

    @Test
    @DisplayName("overall averages the opponents seed by seed")
    void overall() {
        Map<String, List<Double>> m = new LinkedHashMap<>();
        m.put("a", List.of(0.2, 0.4));
        m.put("b", List.of(0.6, 0.8));
        List<Double> overall = Report.overall(m);
        assertEquals(2, overall.size());
        assertEquals(0.4, overall.get(0), 1e-12);
        assertEquals(0.6, overall.get(1), 1e-12);
    }

    @Test
    @DisplayName("a single report lists each opponent and an overall row")
    void single() {
        Map<String, List<Double>> m = new LinkedHashMap<>();
        m.put("sample.Crazy", List.of(0.5, 0.6, 0.55));
        String text = Report.single("Candidate", m);
        assertTrue(text.contains("## Candidate"));
        assertTrue(text.contains("| sample.Crazy | 55.0% +/- "));
        assertTrue(text.contains("all, averaged per seed"));
    }

    @Test
    @Tag("HL-35")
    @DisplayName("an A/B says better, worse or inside the noise in words")
    void compare() {
        List<Double> base = List.of(0.40, 0.60, 0.50, 0.30, 0.55);
        assertTrue(Report.compare("old", base, "new", List.of(0.43, 0.63, 0.53, 0.33, 0.58)).contains("Better, outside the noise"));
        assertTrue(Report.compare("old", base, "new", List.of(0.37, 0.57, 0.47, 0.27, 0.52)).contains("Worse, outside the noise"));
        assertTrue(Report.compare("old", base, "new", List.of(0.50, 0.50, 0.50, 0.50, 0.50)).contains("Inside the noise"));
    }

    @Test
    @DisplayName("a result file becomes a score share; an error file is an error")
    void readShare(@TempDir Path dir) throws IOException {
        Path ok = dir.resolve("ok.txt");
        Files.writeString(ok, "600.0,400.0\n");
        assertEquals(0.6, Bench.readShare(ok), 1e-12);
        Files.writeString(ok, "0.0,0.0\n");
        assertEquals(0.5, Bench.readShare(ok), 0);
        Path bad = dir.resolve("bad.txt");
        Files.writeString(bad, "ERROR expected 2 robots, found 1\n");
        org.junit.jupiter.api.Assertions.assertThrows(IOException.class, () -> Bench.readShare(bad));
        org.junit.jupiter.api.Assertions.assertThrows(IOException.class, () -> Bench.readShare(dir.resolve("missing.txt")));
    }

    @Test
    @DisplayName("options parse as key and value, with --warm a flag")
    void options() {
        Map<String, String> o = Bench.parse(new String[] {"--seeds", "3", "--warm", "--opponent", "a,b"});
        assertEquals("3", o.get("seeds"));
        assertEquals("true", o.get("warm"));
        assertEquals("a,b", o.get("opponent"));
    }
}
