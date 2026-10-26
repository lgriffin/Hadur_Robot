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
        assertTrue(queue.contains("live_client.py watch $(for d in ${CLIENTS}/rr0*"));
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
    @Tag("BENCH-113")
    @DisplayName("the release workflow names the release watch in its summary")
    void releaseNamesIt() throws IOException {
        String release = Files.readString(Path.of("../.github/workflows/release.yml"));
        assertTrue(release.contains("queue.ps1 run live-watch"));
        assertTrue(release.contains("GITHUB_STEP_SUMMARY"));
    }
}
