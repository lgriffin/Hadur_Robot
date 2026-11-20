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

/** BENCH-169: robots the engine will not load leave a set before the bench starts (BENCH-266: per engine). */
class BrokenTest {

    @Test
    @Tag("BENCH-169")
    @DisplayName("listed robots leave the set by exact name; a missing file drops nothing")
    void drops(@TempDir Path dir) throws IOException {
        Path file = dir.resolve(Broken.FILE_1112);
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
        List<String> lines = Files.readAllLines(Path.of(Broken.FILE_1112)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).toList();
        assertTrue(lines.size() > 0);
        for (String l : lines) assertEquals(3, l.split("\\|").length, l);
        assertEquals(lines.size(), Broken.names(Path.of(Broken.FILE_1112)).size(), "no robot twice");
    }

    @Test
    @Tag("BENCH-266")
    @DisplayName("the list follows the engine: 1.11.x reads broken-1.11.2.txt, 1.12.0 (the default) broken-1.12.0.txt")
    void listFollowsEngine() throws IOException {
        assertEquals("broken-1.11.2.txt", Broken.file("1.11.2"));
        assertEquals("broken-1.11.2.txt", Broken.file("1.11.1"));
        assertEquals("broken-1.11.2.txt", Broken.file("1.10.0"));
        assertEquals("broken-1.11.2.txt", Broken.file("1.9.5.6"));
        assertEquals("broken-1.12.0.txt", Broken.file("1.12.0"));
        assertEquals("broken-1.12.0.txt", Broken.file("unknown"));
        assertEquals("1.12.0", Report.ENGINE, "the bench runs on the live clients' engine");
        assertEquals(Broken.FILE_112, Broken.FILE);
        List<String> lines = Files.readAllLines(Path.of(Broken.FILE_112)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).toList();
        for (String l : lines) assertEquals(3, l.split("\\|").length, l);
        Set<String> on112 = Broken.names(Path.of(Broken.FILE_112));
        assertEquals(lines.size(), on112.size(), "no robot twice");
        assertTrue(Broken.names(Path.of(Broken.FILE_1112)).containsAll(on112), "1.12.0 rejects no robot 1.11.2 loads");
        for (String returner : List.of("dsekercioglu.mega.Raven 3.56j8", "pc.Wavelet 1.5", "Krabb.sliNk.Garm 0.9u",
                "zen.Mirage 0.9.5", "zen.Ronin 1.0.0")) {
            assertTrue(!on112.contains(returner), returner + " loads on 1.12.0 and is in the live rumble");
        }
    }
}
