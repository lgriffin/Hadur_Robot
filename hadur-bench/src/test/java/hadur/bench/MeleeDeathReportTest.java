package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * The melee report's who-killed-Hadur section (BENCH-40) and its battles-used line for a
 * paired run (BENCH-43), from fixture directories. No battle runs.
 */
class MeleeDeathReportTest {

    private static final String US = "hadur2.Hadur 3.8";
    private static final String BASE = "hadur2.Hadur 3.7";

    @TempDir
    Path dir;
    private int n;

    private MeleeReport.Battle battle(String robot, String... rounds) throws IOException {
        Path d = dir.resolve("b" + (n++));
        Files.createDirectories(d);
        Files.writeString(d.resolve("melee.csv"), String.join("\n",
            "rank,robot,score,firsts,survival,bulletDamage",
            "1," + robot + ",300,1,100,50",
            "2,a,100,1,50,30", ""));
        Files.writeString(d.resolve("rounds.csv"), MeleeHarvester.HEADER + "\n" + String.join("\n", rounds) + "\n");
        return MeleeReport.read(n, d);
    }

    private static String render(List<MeleeReport.Battle> battles) {
        return MeleeReport.render("field", US, List.of("a"), Set.of(), battles, 3, 1000, 1000, 0);
    }

    @Test
    @Tag("BENCH-40")
    @DisplayName("the report names who killed Hadur, how often, the last hits and the mean death tick")
    void whoKillsHadur() throws IOException {
        String r = render(List.of(battle(US,
            "0,3,3,-,-,0,0,0,100,a.Alpha 1.0,a.Alpha 1.0",
            "1,2,3,-,-,0,0,0,300,a.Alpha 1.0,b.Beta 1.0",
            "2,1,3,-,-,0,0,0,-,-,b.Beta 1.0")));
        assertTrue(r.contains("Hadur died in 2 of 3 rounds, at a mean tick of 200."), r);
        assertTrue(r.contains("| a.Alpha 1.0 | 2 | 100% | 1 |"), r);
        assertTrue(r.contains("| b.Beta 1.0 | 0 | 0% | 2 |"), r);
    }

    @Test
    @Tag("BENCH-40")
    @DisplayName("a rounds.csv from before the death columns adds no section")
    void oldRoundsFile() throws IOException {
        String r = render(List.of(battle(US, "0,1,3,-,-,0,0,0")));
        assertFalse(r.contains("Hadur died in"), r);
    }

    @Test
    @Tag("BENCH-43")
    @DisplayName("the melee paired section says how many battles of each build were used and flags an uneven pair")
    void battlesUsedMelee() throws IOException {
        List<MeleeReport.Battle> cand = List.of(battle(US, "0,1,2,-,-,0,0,0"), battle(US, "0,1,2,-,-,0,0,0"));
        List<MeleeReport.Battle> base = List.of(battle(BASE, "0,1,2,-,-,0,0,0"), new MeleeReport.Battle(2, false));
        String r = MeleeReport.renderPaired(US, BASE, List.of("a"), Set.of(), cand, base);
        assertTrue(r.contains("Battles used on this field: candidate 2 of 2, baseline 1 of 2, 1 paired seeds. "
            + "**Uneven"), r);
        String even = MeleeReport.renderPaired(US, BASE, List.of("a"), Set.of(), cand, cand);
        assertTrue(even.contains("candidate 2 of 2, baseline 2 of 2, 2 paired seeds.\n"), even);
    }

    @Test
    @Tag("BENCH-43")
    @DisplayName("an opponent's own melee report with a baseline names the battles used")
    void battlesUsedOpponent() throws IOException {
        List<MeleeReport.Battle> cand = List.of(battle(US, "0,1,2,-,-,0,0,0"), battle(US, "0,1,2,-,-,0,0,0"));
        List<MeleeReport.Battle> base = List.of(battle(BASE, "0,1,2,-,-,0,0,0"), new MeleeReport.Battle(2, false));
        String r = MeleeReport.renderOpponent("a", null, US, BASE, cand, base, 3, 1000, 1000, null);
        assertTrue(r.contains("Battles used against a: candidate 2 of 2, baseline 1 of 2, 1 paired seeds."), r);
    }
}
