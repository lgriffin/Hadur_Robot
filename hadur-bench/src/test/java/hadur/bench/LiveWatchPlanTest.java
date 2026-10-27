package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-113: the release watch card, and the release workflow that points at it. */
class LiveWatchPlanTest {

    @Test
    @Tag("BENCH-113")
    @DisplayName("the release watch watches every client with the three pages, reports, and ends in a results PR")
    void card() throws IOException {
        String queue = Files.readString(Path.of("plans/live-watch.queue"));
        assertTrue(queue.contains("set V1 = ") && queue.contains("set VT = "));
        assertTrue(queue.contains("live_client.py watch --root ${CLIENTS} $(for d in ${ONES}; do printf -- '--launch %s:roborumble.bat ' \"$d\"; done)"));
        assertTrue(queue.contains("set ONES = rr01 rr02 rr03 rr04\n"), "four 1v1 clients, so the PC is not starved");
        assertTrue(queue.contains("--page \"roborumble:hadur2.Hadur ${V1}\""));
        assertTrue(queue.contains("--page \"meleerumble:hadur2.Hadur ${V1}\""));
        assertTrue(queue.contains("--page \"teamrumble:hadur2.HadurTeam ${VT}\""));
        assertTrue(queue.contains("--robot \"hadur2.Hadur ${V1}\" --robot \"hadur2.HadurTeam ${VT}\""),
                "only the released versions' battles enter the report");
        assertTrue(queue.contains("--new-only --stop-collapses ${COLLAPSES} --stop-battles ${DUELS} --hours ${HOURS}"),
                "the watch stops on what it caught, with a time cap");
        assertTrue(queue.contains("live_client.py report ${W}"));
        assertTrue(queue.contains("${W}/profiles"), "the profile TSVs go into the results PR");
        assertTrue(queue.contains("open_results_pr.sh claude/live-watch-${V1}-run${RUN}-results"));
        assertTrue(queue.contains("after: report"));
    }

    @Test
    @Tag("BENCH-121")
    @DisplayName("the release watch runs four 1v1 clients plus melee and team and restarts each on a schedule, between battles")
    void clients() throws IOException {
        String queue = Files.readString(Path.of("plans/live-watch.queue"));
        assertTrue(queue.contains("--launch ${MAIN}:meleerumble.bat --launch ${MAIN}:teamrumble.bat"));
        assertTrue(queue.contains("set MAIN = C:/robocode"));
        assertTrue(queue.contains("--restart-minutes ${RESTART} --wait-minutes ${WAIT}"));
        assertTrue(queue.contains("set RESTART = 15"));
        assertTrue(queue.contains("tar czf consoles.tar.gz consoles") && queue.contains("${W}/consoles.tar.gz"),
                "the consoles go into the results PR as one file");
    }

    @Test
    @Tag("BENCH-113")
    @DisplayName("the release workflow names the release watch in its summary")
    void releaseNamesIt() throws IOException {
        String release = Files.readString(Path.of("../.github/workflows/release.yml"));
        assertTrue(release.contains("queue.ps1 run live-watch --fresh"), "a new release starts the watch afresh");
        assertTrue(release.contains("GITHUB_STEP_SUMMARY"));
    }
}
