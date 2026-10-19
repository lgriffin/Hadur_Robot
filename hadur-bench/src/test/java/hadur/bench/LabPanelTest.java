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

/** BENCH-90: the movement lab's panel (lab-panel.txt) loads, and names the shooters lab/ builds. */
class LabPanelTest {

    static final List<String> SHOOTERS = List.of("HeadOn", "Linear", "Circular", "GFHist", "Knn", "PatternMatch");

    @Test
    @Tag("BENCH-90")
    @DisplayName("lab-panel.txt loads: six lab.<Name> 1.0 shooters, each with a lab.<Name>_1.0.jar and a lab- role")
    void panelLoads() throws IOException {
        List<Opponent> panel = Opponent.load(Path.of("lab-panel.txt"));
        assertEquals(SHOOTERS.size(), panel.size());
        for (int i = 0; i < panel.size(); i++) {
            String s = SHOOTERS.get(i);
            Opponent o = panel.get(i);
            assertEquals("lab." + s + " 1.0", o.name);
            assertEquals("lab." + s + "_1.0.jar", o.jar);
            assertEquals("lab-" + s.toLowerCase(), o.role);
        }
    }

    @Test
    @Tag("BENCH-90")
    @DisplayName("every shooter has a source, a .properties of the right class and version, and is built by build-lab.sh")
    void shootersAreBuilt() throws IOException {
        String build = Files.readString(Path.of("lab/build-lab.sh"));
        assertTrue(build.contains("shooters=(" + String.join(" ", SHOOTERS) + ")"), "build-lab.sh lists the six");
        for (String s : SHOOTERS) {
            assertTrue(Files.isRegularFile(Path.of("lab/lab/" + s + ".java")), s + ".java");
            List<String> props = Files.readAllLines(Path.of("lab/lab/" + s + ".properties"));
            assertTrue(props.contains("robot.classname=lab." + s), s + " classname");
            assertTrue(props.contains("robot.version=1.0"), s + " version");
        }
    }
}
