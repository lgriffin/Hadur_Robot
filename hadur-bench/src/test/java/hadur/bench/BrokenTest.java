package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** BENCH-169: robots Robocode 1.11.2 will not load leave a set before the bench starts. */
class BrokenTest {

    @Test
    @Tag("BENCH-169")
    @DisplayName("listed robots leave the set by exact name; a missing file drops nothing")
    void drops(@TempDir Path dir) throws IOException {
        Path file = dir.resolve(Broken.FILE);
        Files.writeString(file, "# comment\npc.Wavelet 1.5 | 1v1 | FileWriter\n\nrsalesc.mega.Knight  0.6.28 | 1v1 | invalid\n");
        Set<String> broken = Broken.names(file);
        assertEquals(Set.of("pc.Wavelet 1.5", "rsalesc.mega.Knight 0.6.28"), broken);
        List<Opponent> set = new ArrayList<>(List.of(
            new Opponent("pc.Wavelet 1.5", "", "pc.Wavelet_1.5.jar", 0),
            new Opponent("pc.Wavelet 1.6", "", "pc.Wavelet_1.6.jar", 0),
            new Opponent("rsalesc.mega.Knight 0.6.28", "", "k.jar", 0)));
        assertEquals(2, Broken.drop(set, broken));
        assertEquals("pc.Wavelet 1.6", set.get(0).name, "another version stays");
        assertTrue(Broken.names(dir.resolve("none.txt")).isEmpty());
    }

    @Test
    @Tag("BENCH-169")
    @DisplayName("the shared list parses and names no robot twice")
    void sharedList() throws IOException {
        List<String> lines = Files.readAllLines(Path.of(Broken.FILE)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).toList();
        assertTrue(lines.size() > 0);
        for (String l : lines) assertEquals(3, l.split("\\|").length, l);
        assertEquals(lines.size(), Broken.names(Path.of(Broken.FILE)).size(), "no robot twice");
    }
}
