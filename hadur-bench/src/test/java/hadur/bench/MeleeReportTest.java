package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** The melee report reads the gates' numbers the MeleeRumble way. */
class MeleeReportTest {

    @TempDir
    Path dir;

    private MeleeReport.Battle battle() throws IOException {
        Files.writeString(dir.resolve("melee.csv"), String.join("\n",
            "rank,robot,score,firsts,survival,bulletDamage",
            "1,hadur2.Hadur 2.3,300,2,200,90",
            "2,a,100,1,50,30",
            "3,b,0,0,0,10",
            "4,samplesentry.BorderGuard,0,0,0,0", ""));
        Files.writeString(dir.resolve("rounds.csv"), String.join("\n",
            MeleeHarvester.HEADER,
            // Three robots fielded: first, first, last.
            "0,1,3,a,1,0,0,0",
            "1,1,3,b,1,0,1,2",
            "2,3,3,-,-,1,0,0", ""));
        Files.writeString(dir.resolve("hadur.log"), String.join("\n",
            "0,5,R,0,5,win",
            "0,900,M,0,900,880,20,0,-,0,7,0,0",
            "1,800,M,1,800,700,0,100,sentry,0,6,0,1",
            "2,300,M,2,300,300,0,0,-,0,9,0,0", ""));
        return MeleeReport.read(1, dir);
    }

    @Test
    void apsIsPairwiseAndLeavesSentriesOut() throws IOException {
        MeleeReport.Battle b = battle();
        // Against a: 300 / 400 = 75; against b: 100. The sentry is not a pair.
        assertEquals(87.5, MeleeReport.aps(b, "hadur2.Hadur", Set.of("samplesentry.BorderGuard")), 1e-9);
    }

    @Test
    void survivalIsTheShareOfOthersOutlived() throws IOException {
        // Rounds: outlived 2 of 2, 2 of 2, 0 of 2.
        assertEquals(200.0 / 3, MeleeReport.survival(battle()), 1e-9);
    }

    @Test
    void reportShowsGatesHandoffSentriesAndRecords() throws IOException {
        String r = MeleeReport.render("test", "hadur2.Hadur", List.of("a", "b"),
            Set.of("samplesentry.BorderGuard"), List.of(battle()), 3, 1000, 1000, 100);
        assertTrue(r.contains("| 87.5 | 66.7 | 2 / 3 | 1.67 |"), r);
        assertTrue(r.contains("| a | 1 | 100% |"), r);
        assertTrue(r.contains("Sentry safety: 1 sentry bullets hit Hadur, 1 of Hadur's bullets hit a sentry."), r);
        assertTrue(r.contains("1880 melee ticks, 20 duel ticks, 100 focused-duel ticks; 1 rounds vetoed"), r);
        assertTrue(r.contains("longest scan gap 9 ticks"), r);
        assertTrue(r.contains("Skipped turns: 2."), r);
    }
}
