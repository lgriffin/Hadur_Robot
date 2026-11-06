package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-204: the pc-team-farm card (a per-team strategy table from every team-only lever) is complete before it reaches the PC. */
class TeamFarmPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-farm.queue");
    private static final List<String> ARMS = List.of("fo", "cl", "nl", "po", "ga", "ho", "li", "nh", "np");
    private static final List<String> PILOT = ARMS.subList(0, 3);

    private static String block(String queue, String step) {
        int at = queue.indexOf("\n" + step + " ");
        assertTrue(at >= 0, step);
        int next = queue.indexOf("\ntf", at + 1);
        return queue.substring(at, next < 0 ? queue.length() : next);
    }

    @Test
    @Tag("BENCH-204")
    @DisplayName("the steps chain from prep through bb, the pilot's three arms, the pilot, the other six, the pick, the confirm, the lock and the gate to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> steps = new java.util.ArrayList<>(List.of("tfprep", "tfbb"));
        for (String a : PILOT) steps.add("tf" + a);
        steps.add("tfpilot");
        for (String a : ARMS.subList(3, ARMS.size())) steps.add("tf" + a);
        steps.addAll(List.of("tfpick", "tfcprep", "tfcbb", "tfcfx", "tflock", "tfgate", "tfpr"));
        for (int i = 1; i < steps.size(); i++) {
            assertTrue(block(queue, steps.get(i)).contains("after: " + steps.get(i - 1)), steps.get(i) + " after " + steps.get(i - 1));
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        String prep = block(queue, "tfprep");
        assertTrue(prep.contains("arms --arms plans/team-farm-arms.tsv --census team-census46.txt --opponents opponents --shipped ${MODES} --default ${DEFAULT} --out-dir work --stem team-farm"),
            "every arm's table and set come from the arms TSV over the shipped table");
        assertTrue(prep.contains("TEAM_MODE_TABLE=\"$(pwd)/work/team-farm-$a.java\" TEAM_MODE_SUFFIX=$a bash ./build-ablation.sh tmtab"));
        assertTrue(prep.contains("rm -f ${OUT}/team-farm-*.md"), "a rerun never carries an old verdict");
        assertTrue(prep.contains("echo \"$V\" > work/team-farm.version") && block(queue, "tfcprep").contains("V=$(cat work/team-farm.version)"),
            "the confirm builds on the version prep built");
        assertTrue(block(queue, "tfcprep").contains("TEAM_MODE_TABLE=\"$(pwd)/work/team-farm-pick.java\" TEAM_MODE_SUFFIX=fx bash ./build-ablation.sh tmtab"));
        assertTrue(block(queue, "tflock").contains("lock --confirm ${OUT}/team-farm-cfx.md --control ${OUT}/team-farm-cbb.md --pick-tsv work/team-farm-pick.tsv")
            && block(queue, "tflock").contains("--min-gain 1.0"), "the lock keeps a pick at +1.0 on fresh seeds against both baselines");
        assertTrue(block(queue, "tfgate").contains("gate --report ${OUT}/team-farm-cfx.md --control ${OUT}/team-farm-cbb.md --set work/team-farm-locked.txt --seeds 12 --teams 46 --min-aps 0.15"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-farm-results"));
    }

    @Test
    @Tag("BENCH-204")
    @DisplayName("the pilot and the pick score each arm against both baselines, need the 95% low end above zero, and stop the card with a results PR under +0.15 APS")
    void pilotAndPick() throws IOException {
        String queue = Files.readString(QUEUE);
        assertTrue(queue.contains("set PICK = --low-end 0 --margin 0 --teams 46 --census team-census46.txt --opponents opponents --counters work/team-farm-counters.tsv"));
        for (String step : List.of("tfpilot", "tfpick")) {
            String body = block(queue, step);
            List<String> arms = step.equals("tfpilot") ? PILOT : ARMS;
            for (String a : arms) {
                assertTrue(body.contains("--report " + a + "=${OUT}/team-farm-" + a + ".md --control " + a + "=${OUT}/team-farm-bb.md"), step + " reads " + a);
            }
            assertTrue(body.contains("${PICK} --stop-below 0.15"), step + " stops under +0.15 APS");
            assertTrue(body.contains("|| { bash tools/open_results_pr.sh claude/pc-team-farm-results") && body.contains("exit 1; }"),
                step + " opens the results PR and ends the card when it stops");
        }
        assertFalse(block(queue, "tfpilot").contains("team-farm-po.md"), "the pilot reads only its three arms");
        assertTrue(block(queue, "tfpick").contains("--out-tsv work/team-farm-pick.tsv --out-java work/team-farm-pick.java --out-set work/team-farm-confirm.txt"));
    }

    @Test
    @Tag("BENCH-204")
    @DisplayName("every battle step declares its stop rules")
    void stopRules() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> steps = new java.util.ArrayList<>(List.of("tfbb", "tfcbb", "tfcfx"));
        for (String a : ARMS) steps.add("tf" + a);
        for (String step : steps) {
            String body = block(queue, step);
            assertTrue(body.contains("watch: battles="), step + " is watched");
            for (String rule : List.of("stop: fails 60", "stop: stall 30m", "stop: skips 60 over 200")) {
                assertTrue(body.contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-204")
    @DisplayName("the arms TSV names the nine arms in the queue's order, each a change to the current entry; HEAVY, already failed per team, is not among them")
    void armsTable() throws IOException {
        List<String> rows = Files.readAllLines(Path.of("plans/team-farm-arms.tsv")).stream()
            .filter(l -> !l.startsWith("#") && !l.isBlank()).toList();
        assertEquals("name\tadd\tremove\tneeds", rows.get(0));
        assertEquals(ARMS, rows.subList(1, rows.size()).stream().map(l -> l.split("\t")[0]).toList());
        for (String row : rows) assertFalse(row.contains("HEAVY"), row);
        assertTrue(rows.contains("cl\tCLOSE\t-\tHUNT"), "CLOSE only means something with HUNT");
        assertTrue(rows.contains("ho\tOWN,HEADON\tLINEAR\t-") && rows.contains("li\tOWN,LINEAR\tHEADON\t-"));
        assertTrue(rows.contains("nh\t-\tHUNT\t-") && rows.contains("np\t-\tPATH\t-"));
    }

    @Test
    @Tag("BENCH-204")
    @DisplayName("the screen pairs bb and every arm with aa on 6 seeds from 9400 at 12 rounds; the confirm on 12 fresh seeds from 9500 on the picked teams")
    void args() throws IOException {
        String bb = Files.readString(Path.of("plans/team-farm-bb.args"));
        assertTrue(bb.contains("--set\nteam-census46.txt\n") && bb.contains("--seeds\n6\n") && bb.contains("--seed-base\n9400\n") && bb.contains("--rounds\n12\n"));
        assertTrue(bb.contains("bisect/hadur117.HadurTeam_@V@bb.jar") && bb.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"));
        String arm = Files.readString(Path.of("plans/team-farm-arm.args"));
        assertTrue(arm.contains("--set\nwork/team-farm-@A@.txt\n") && arm.contains("--seeds\n6\n") && arm.contains("--seed-base\n9400\n") && arm.contains("--rounds\n12\n"));
        assertTrue(arm.contains("bisect/hadur117.HadurTeam_@V@@A@.jar") && arm.contains("--report\n../docs/bench/local/team-farm-@A@.md\n"));
        String confirm = Files.readString(Path.of("plans/team-farm-confirm.args"));
        assertTrue(confirm.contains("--set\nwork/team-farm-confirm.txt\n") && confirm.contains("--seeds\n12\n") && confirm.contains("--seed-base\n9500\n"));
        assertTrue(confirm.contains("bisect/hadur117.HadurTeam_@V@@J@.jar") && confirm.contains("--out\nwork/team-farm-@V@-c@J@\n"));
        for (String f : List.of(bb, arm, confirm)) assertFalse(f.matches("(?s).*3\\.[12]\\d.*"), "names no version");
    }
}
