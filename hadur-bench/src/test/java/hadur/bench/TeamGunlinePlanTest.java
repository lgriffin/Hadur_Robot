package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-120: the pc-team-gunline card (TMODE-19 screen) is complete before it reaches the PC. */
class TeamGunlinePlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-gunline.queue");

    @Test
    @Tag("BENCH-120")
    @DisplayName("the steps chain from prep through every arm and the reads to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"gnprep", "gnbb", "gngl", "gnglw", "gnread", "gnpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "tmgunline", "tmgunlinew")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        assertTrue(queue.contains("tools/team_losses.py") && queue.contains("tools/friendly_hits.py"), "both reads per arm");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-gunline-results"));
    }

    @Test
    @Tag("BENCH-120")
    @DisplayName("every arm runs on all 46 teams at 6 seeds from 4500 against the aa build, sized to the host")
    void args() throws IOException {
        for (String a : List.of("bb", "mgl", "mglw")) {
            String args = Files.readString(Path.of("plans/team-gunline-" + a + ".args"));
            assertTrue(args.contains("--set\nteam-census46.txt\n"), a);
            assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n4500\n"), a);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + a + ".jar\n") && args.contains("hadur117.HadurTeam @V@" + a + "\n"), a);
            assertTrue(args.contains("--out\nwork/team-gunline-@V@-" + a + "\n"), a);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a);
            assertTrue(args.contains("--parallel\nauto\n") && args.contains("--cpu-constant\nauto\n"), a);
        }
    }

    @Test
    @Tag("BENCH-120")
    @DisplayName("the arms edit exactly the TMODE-19 switch and constants, which ship off")
    void ablations() throws IOException {
        String build = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(build.contains("version=\"${version}mgl\"") && build.contains("version=\"${version}mglw\""));
        String modes = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/melee/TeamModes.java"));
        assertTrue(modes.contains("public static final boolean FORCE_GUNLINE = false;"));
        String mrm = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/melee/MinimumRiskMovement.java"));
        assertTrue(mrm.contains("static final double GUNLINE_K = 0.4;") && mrm.contains("static final double GUNLINE_HALF = 70;"));
    }
}
