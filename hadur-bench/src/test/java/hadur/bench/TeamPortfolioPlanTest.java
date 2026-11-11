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

/** BENCH-231: the pc-team-portfolio card (every team on the change it leans to, banked as a group) is complete before it reaches the PC. */
class TeamPortfolioPlanTest {

    private static final List<String> ARMS = List.of("qt", "ga", "ho", "li", "nd", "nc", "nk", "nh", "np");

    @Test
    @Tag("BENCH-231")
    @DisplayName("nine per-team arms are screened beside bb, picked by shrunk gain with no interval test, and the picked group is gated on 24 fresh seeds")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-team-portfolio.queue"));
        String prev = "tpprep";
        for (String step : List.of("tpbb", "tpqt", "tpga", "tpho", "tpli", "tpnd", "tpnc", "tpnk", "tpnh", "tpnp", "tppick",
            "tpcprep", "tpcbb", "tpcfx", "tpgate", "tppr")) {
            int at = queue.indexOf("\n" + step + " | ");
            assertTrue(at >= 0, step);
            int next = queue.indexOf("\ntp", at + 1);
            String block = queue.substring(at, next < 0 ? queue.length() : next);
            assertTrue(block.contains("after: " + prev), step + " after " + prev);
            if (block.contains("mvn -q exec:java")) {
                for (String rule : List.of("watch:", "stop: fails 60", "stop: stall 30m", "stop: skips 60 over 200")) {
                    assertTrue(block.contains(rule), step + " declares " + rule);
                }
            }
            prev = step;
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("arms --arms plans/team-portfolio-arms.tsv --census team-census46.txt --opponents opponents"
            + " --shipped ${MODES} --default ${DEFAULT} --out-dir work --stem team-portfolio"));
        assertTrue(queue.contains("set DEFAULT = MATEFIRE,HUNT,PATH,DODGE,CONCORD,CLOSE\n"), "the default as master ships it");
        for (String a : ARMS) {
            assertTrue(queue.contains("--report " + a + "=${OUT}/team-portfolio-" + a + ".md --control " + a + "=${OUT}/team-portfolio-bb.md"), a);
        }
        assertTrue(queue.contains("--shrink --margin 0 --teams 46"), "picked on the shrunk gain");
        assertFalse(queue.contains("--low-end") || queue.contains(" lock "), "no team has to clear an interval or a lock");
        assertTrue(queue.contains("gate --report ${OUT}/team-portfolio-cfx.md --control ${OUT}/team-portfolio-cbb.md"
            + " --set work/team-portfolio-confirm.txt --seeds 24 --teams 46 --min-aps 0.15"), "the group is gated");
        for (String step : List.of("tpcprep", "tpcbb", "tpcfx", "tpgate")) {
            int at = queue.indexOf("\n" + step + " | ");
            String line = queue.substring(at + 1, queue.indexOf("\n", at + 1));
            assertTrue(line.contains("| if [ -s work/team-portfolio-pick.java ]; then ") && line.endsWith("; else echo \"nothing picked: no confirm\"; fi"),
                step + " does nothing, and does not fail, when no team was picked");
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-portfolio-results"));
        assertTrue(queue.contains("Why it should win"));
    }

    @Test
    @Tag("BENCH-231")
    @DisplayName("the arms change only modes master has, the screen is 6 seeds from 15000 and the confirm 24 fresh seeds from 15100, all against aa")
    void armsAndArgs() throws IOException {
        String arms = Files.readString(Path.of("plans/team-portfolio-arms.tsv"));
        String modes = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/melee/TeamModes.java"));
        int rows = 0;
        for (String line : arms.split("\n")) {
            if (line.isBlank() || line.startsWith("#") || line.startsWith("name\t")) continue;
            String[] c = line.split("\t");
            assertTrue(ARMS.contains(c[0]), c[0]);
            rows++;
            for (int i = 1; i < c.length; i++) {
                for (String m : c[i].split(",")) {
                    if (!m.equals("-")) assertTrue(modes.matches("(?s).*\\b" + m + "[,\\n ].*"), m + " is a mode on master");
                }
            }
        }
        assertTrue(rows == ARMS.size(), "nine arms");
        String bb = Files.readString(Path.of("plans/team-portfolio-bb.args"));
        String arm = Files.readString(Path.of("plans/team-portfolio-arm.args"));
        String confirm = Files.readString(Path.of("plans/team-portfolio-confirm.args"));
        assertTrue(bb.contains("--set\nteam-census46.txt\n") && bb.contains("--seeds\n6\n") && bb.contains("--seed-base\n15000\n"));
        assertTrue(arm.contains("--set\nwork/team-portfolio-@A@.txt\n") && arm.contains("--seeds\n6\n") && arm.contains("--seed-base\n15000\n"));
        assertTrue(arm.contains("bisect/hadur117.HadurTeam_@V@@A@.jar") && arm.contains("--report\n../docs/bench/local/team-portfolio-@A@.md\n"));
        assertTrue(confirm.contains("--set\nwork/team-portfolio-confirm.txt\n") && confirm.contains("--seeds\n24\n")
            && confirm.contains("--seed-base\n15100\n"), "fresh seeds");
        assertTrue(confirm.contains("--out\nwork/team-portfolio-@V@-c@J@\n") && confirm.contains("--report\n../docs/bench/local/team-portfolio-c@J@.md\n"));
        for (String a : List.of(bb, arm, confirm)) {
            assertTrue(a.contains("--rounds\n12\n") && a.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"));
        }
    }
}
