package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import robocode.BattleResults;

/**
 * Issue #138: a non-Hadur reference build is trusted on the engine's signals alone, the score
 * split is carried for both sides, and the report says where the opponent's points came from.
 */
class ReferenceBuildTest {

    private static final Opponent OPP = new Opponent("kc.mega.BeepBoop 2.0", "tail", "kc.mega.BeepBoop_2.0.jar", 0.25);

    private static BattleResult battle(boolean reference) {
        BattleResult r = new BattleResult();
        r.ok = true;
        r.rounds = 35;
        r.roundRecords = reference ? 0 : 35;
        r.duressTicks = reference ? -1 : 0;
        r.reference = reference;
        r.score = 600;
        r.theirScore = 400;
        r.survival = 300;
        r.theirSurvival = 100;
        r.bulletDamage = 250;
        r.theirBulletDamage = 200;
        r.skippedTurns = 10;
        return r;
    }

    @Test
    @Tag("BENCH-68")
    @DisplayName("a reference build with no R records is trusted on its skipped turns alone")
    void referenceBuildIsTrustedWithoutRecords() {
        BattleResult r = battle(true);
        assertTrue(r.trusted());
        assertTrue(r.untrustedReasons(2.0).isEmpty());
    }

    @Test
    @Tag("BENCH-68")
    @DisplayName("a Hadur build without R records is still untrusted")
    void hadurBuildStillNeedsItsRecords() {
        BattleResult r = battle(false);
        r.roundRecords = 20;
        assertFalse(r.trusted());
        assertEquals(List.of("R records"), r.untrustedReasons(2.0));
    }

    @Test
    @Tag("BENCH-68")
    @DisplayName("a reference build that skipped too many turns is untrusted")
    void referenceBuildStillGatedOnSkips() {
        BattleResult r = battle(true);
        r.skippedTurns = 200;
        assertFalse(r.trusted());
        assertEquals(List.of("skips"), r.untrustedReasons(2.0));
    }

    @Test
    @Tag("BENCH-68")
    @DisplayName("only names beginning with hadur are Hadur builds")
    void hadurNames() {
        assertTrue(BattleResult.isHadur("hadur2.Hadur 3.9"));
        assertTrue(BattleResult.isHadur("hadur2.HadurTeam 3.9"));
        assertFalse(BattleResult.isHadur("rsalesc.mega.Knight 0.6.28"));
        assertFalse(BattleResult.isHadur(null));
    }

    @Test
    @Tag("BENCH-69")
    @DisplayName("the score split and the reference flag are the last columns and survive a write and a read")
    void splitColumnsRoundTrip() {
        assertTrue(BattleResult.HEADER.endsWith(
            ",reference,ramDamage,theirRamDamage,ramDamageBonus,theirRamDamageBonus,"
            + "bulletDamageBonus,theirBulletDamageBonus,lastSurvivorBonus,theirLastSurvivorBonus,engineRoundTicks"));
        BattleResult r = battle(true);
        r.ramDamage = 1.5;
        r.theirRamDamage = 12.25;
        r.ramDamageBonus = 0.5;
        r.theirRamDamageBonus = 3.75;
        r.bulletDamageBonus = 7;
        r.theirBulletDamageBonus = 9;
        r.lastSurvivorBonus = 20;
        r.theirLastSurvivorBonus = 10;
        r.engineRoundTicks = 812.5;
        String csv = r.toCsv();
        assertEquals(BattleResult.HEADER.split(",").length, csv.split(",", -1).length);
        BattleResult back = BattleResult.parse(csv);
        assertTrue(back.reference);
        assertEquals(12.25, back.theirRamDamage, 1e-6);
        assertEquals(3.75, back.theirRamDamageBonus, 1e-6);
        assertEquals(9, back.theirBulletDamageBonus, 1e-6);
        assertEquals(10, back.theirLastSurvivorBonus, 1e-6);
        assertEquals(20, back.lastSurvivorBonus, 1e-6);
        assertEquals(812.5, back.engineRoundTicks, 1e-6);
    }

    @Test
    @Tag("BENCH-69")
    @DisplayName("a row written before the split columns reads with the split NaN and the build not a reference")
    void oldRowReadsAsNaN() {
        String[] f = battle(false).toCsv().split(",", -1);
        BattleResult back = BattleResult.parse(String.join(",", Arrays.copyOf(f, 60)));
        assertFalse(back.reference);
        assertTrue(Double.isNaN(back.theirRamDamage));
        assertTrue(Double.isNaN(back.engineRoundTicks));
        assertNull(back.theirScoreSplit());
    }

    @Test
    @Tag("BENCH-69")
    @DisplayName("a failed row is as wide as the header and carries no split")
    void failedRowIsAsWideAsTheHeader() {
        String row = BattleResult.failed("timed out");
        assertEquals(BattleResult.HEADER.split(",").length, row.split(",", -1).length);
        assertTrue(Double.isNaN(BattleResult.parse(row).ramDamage));
    }

    @Test
    @Tag("BENCH-69")
    @DisplayName("of() takes the split for both sides from the engine's BattleResults")
    void ofTakesTheSplit(@org.junit.jupiter.api.io.TempDir Path dir) throws IOException {
        LogHarvester h = new LogHarvester(dir, "us");
        h.close();
        // name, rank, score, survival, lastSurvivorBonus, bulletDamage, bulletDamageBonus, ramDamage, ramDamageBonus, firsts, seconds, thirds
        BattleResults us = new BattleResults("us", 1, 190, 100, 20, 60, 6, 3, 1, 1, 0, 0);
        BattleResults them = new BattleResults("them", 2, 90, 50, 0, 30, 3, 5, 2, 0, 1, 0);
        BattleResult r = BattleResult.of(us, them, 1, h, "");
        assertEquals(3, r.ramDamage, 1e-9);
        assertEquals(5, r.theirRamDamage, 1e-9);
        assertEquals(1, r.ramDamageBonus, 1e-9);
        assertEquals(2, r.theirRamDamageBonus, 1e-9);
        assertEquals(6, r.bulletDamageBonus, 1e-9);
        assertEquals(3, r.theirBulletDamageBonus, 1e-9);
        assertEquals(20, r.lastSurvivorBonus, 1e-9);
        assertEquals(0, r.theirLastSurvivorBonus, 1e-9);
        // survival, bullet damage, ram damage, bonuses (last survivor + bullet + ram)
        assertArrayEquals(new double[] {50, 30, 5, 5}, r.theirScoreSplit(), 1e-9);
    }

    @Test
    @Tag("BENCH-70")
    @DisplayName("the report says where the opponent's points come from, as shares of its total")
    void reportCarriesTheSplitTable() {
        BattleResult r = battle(false);
        r.theirScore = 100;
        r.theirSurvival = 50;
        r.theirBulletDamage = 30;
        r.theirRamDamage = 10;
        r.theirLastSurvivorBonus = 0;
        r.theirBulletDamageBonus = 5;
        r.theirRamDamageBonus = 5;
        r.engineRoundTicks = 700;
        Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
        results.put(OPP, List.of(r));
        String report = Report.render(results, "hadur2.Hadur 3.9", false, 35, 1, 800, 600, "unknown");
        assertTrue(report.contains("## Where their points come from"), report);
        assertTrue(report.contains("| kc.mega.BeepBoop 2.0 | 1 | 100 | 50.0% | 30.0% | 10.0% | 10.0% | 700 |"), report);
    }

    @Test
    @Tag("BENCH-70")
    @DisplayName("old rows with no split show dashes in that table instead of zeros")
    void oldRowsShowDashes() {
        BattleResult r = battle(false);
        Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
        results.put(OPP, List.of(r));
        String report = Report.render(results, "hadur2.Hadur 3.9", false, 35, 1, 800, 600, "unknown");
        assertTrue(report.contains("| kc.mega.BeepBoop 2.0 | 0 | - | - | - | - | - | - |"), report);
    }

    @Test
    @Tag("BENCH-68")
    @DisplayName("a reference build's report shows dashes for the Hadur-only columns and leaves out the Hadur-only sections")
    void referenceReportHidesHadurOnlyColumns() {
        BattleResult r = battle(true);
        Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
        results.put(OPP, List.of(r));
        assertTrue(Report.allReference(results));
        String report = Report.render(results, "rsalesc.mega.Knight 0.6.28", false, 35, 1, 800, 600, "unknown");
        assertTrue(report.contains("reference build"), report);
        assertTrue(report.contains("| 0 / 35 | - | - | 10 | - |"), report);
        assertFalse(report.contains("## Wave fidelity"), report);
        assertFalse(report.contains("## Bullet shielding"), report);
        assertTrue(report.contains("1 of 1 battles trusted."), report);
        assertTrue(report.contains("| kc.mega.BeepBoop 2.0 | 1 | 1 | n/a | 0 | 0.29 | 0 | 0 | 0 |"), report);
    }

    @Test
    @Tag("BENCH-71")
    @DisplayName("ticks per round is the engine's mean, shown for any build")
    void ticksPerRoundShownForAnyBuild() {
        BattleResult a = battle(false), b = battle(false);
        a.engineRoundTicks = 600;
        b.engineRoundTicks = 800;
        Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
        results.put(OPP, List.of(a, b));
        String report = Report.render(results, "hadur2.Hadur 3.9", false, 35, 2, 800, 600, "unknown");
        assertTrue(report.contains("| 700 |"), report);
    }
}
