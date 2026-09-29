package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-5: reads a saved LiteRumble BotDetails page and reports it by band, hour and split. */
class LiveDetailsTest {

    private static Path fixture() throws URISyntaxException {
        return Path.of(LiveDetailsTest.class.getClassLoader()
            .getResource("2026-09-28T1724Z_roborumble_botdetails_hadur2.Hadur_3.0.mht").toURI());
    }

    @Test
    @Tag("BENCH-5")
    void parsesEveryPairingRow() throws Exception {
        List<LiveDetails.Pairing> pairings = LiveDetails.parse(fixture());
        assertEquals(507, pairings.size());
        LiveDetails.Pairing first = pairings.get(0);
        assertEquals("AD.CodaFirst 1.1", first.opponent());
        assertEquals(98.33, first.aps(), 0.001);
        assertEquals(97.14, first.survival(), 0.001);
        assertEquals(LocalDateTime.of(2026, 9, 28, 7, 58, 49), first.latestBattleUtc());
        assertEquals(23.60, first.opponentAps(), 0.001);
        assertEquals(17.19, first.opponentSurvival(), 0.001);
    }

    @Test
    @Tag("BENCH-5")
    void reproducesTheBeforeAfterSplitFromThePlan() throws Exception {
        List<LiveDetails.Pairing> pairings = LiveDetails.parse(fixture());
        LocalDateTime split = LocalDateTime.of(2026, 9, 28, 8, 30, 0);
        long before = pairings.stream().filter(p -> p.latestBattleUtc().isBefore(split)).count();
        long after = pairings.size() - before;
        // Plan section 1.1: 268 pairings before 08:30 UTC, 239 from it.
        assertEquals(268, before);
        assertEquals(239, after);
    }

    @Test
    @Tag("BENCH-5")
    void reportIncludesBandHourSplitAndBenchDiff(@org.junit.jupiter.api.io.TempDir Path tmp)
            throws IOException, URISyntaxException {
        List<LiveDetails.Pairing> pairings = LiveDetails.parse(fixture());
        Path benchReport = tmp.resolve("bench.md");
        java.nio.file.Files.writeString(benchReport,
            "| Opponent | Role | Score share | Survival share |\n|---|---|---|---|\n"
            + "| AD.CodaFirst 1.1 | weak | 95.00% ± 1.0 | 90.0% ± 1.0 |\n");
        String report = LiveDetails.report("hadur2.Hadur 3.0", pairings,
            LocalDateTime.of(2026, 9, 28, 8, 30, 0), LiveDetails.parseBenchShares(benchReport));
        assertTrue(report.contains("By opponent-APS band"));
        assertTrue(report.contains("By UTC hour"));
        assertTrue(report.contains("Before/after"));
        assertTrue(report.contains("Live minus bench"));
        assertTrue(report.contains("AD.CodaFirst 1.1 | 98.33 | 95.00 | +3.33"));
    }

    @Test
    @Tag("BENCH-5")
    void parseBenchSharesReadsTheSummaryTable(@org.junit.jupiter.api.io.TempDir Path tmp) throws IOException {
        Path benchReport = tmp.resolve("bench.md");
        java.nio.file.Files.writeString(benchReport,
            "| Opponent | Role | Score share | Survival share |\n|---|---|---|---|\n"
            + "| kc.mega.BeepBoop 2.0 | rumble-1 | 19.0% ± 4.3 | 2.3% ± 4.6 |\n");
        Map<String, Double> shares = LiveDetails.parseBenchShares(benchReport);
        assertEquals(19.0, shares.get("kc.mega.BeepBoop 2.0"), 0.001);
    }
}
