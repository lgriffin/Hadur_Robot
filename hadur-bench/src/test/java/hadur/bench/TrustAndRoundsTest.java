package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import robocode.BattleResults;
import robocode.control.events.BattleFinishedEvent;

/** Issue #117: trust signals on the result row, the per-round series, and the paired metric tables. */
class TrustAndRoundsTest {

    private static final Opponent OPP = new Opponent("kc.mega.BeepBoop 2.0", "top30", "kc.mega.BeepBoop_2.0.jar", 0.25);

    /** A finished 35-round battle that is trusted unless a test spoils it. */
    private static BattleResult battle(double score, double theirScore) {
        BattleResult r = new BattleResult();
        r.ok = true;
        r.rounds = 35;
        r.roundRecords = 35;
        r.duressTicks = 0;
        r.score = score;
        r.theirScore = theirScore;
        r.firsts = 20;
        r.survival = 50;
        r.theirSurvival = 50;
        r.bulletDamage = 100;
        r.theirBulletDamage = 100;
        r.skippedTurns = 10;
        return r;
    }

    private static String rLine(int round, String result, double ourHit, int duress) {
        String[] f = new String[34];
        Arrays.fill(f, "0");
        f[0] = "R";
        f[1] = String.valueOf(round);
        f[2] = "500";
        f[3] = result;
        f[4] = "10.00";
        f[5] = "0.00";
        f[6] = String.valueOf(ourHit);
        f[8] = "0.1000";
        f[33] = String.valueOf(duress);
        return String.join(",", f);
    }

    @Test
    @Tag("BENCH-20")
    @DisplayName("the new trust columns come last in the header and survive a write and a read")
    void trustColumnsRoundTrip() {
        assertTrue(BattleResult.HEADER.endsWith(",errors,duressTicks,engineDisables,securityErrors,rShortfall,finalRMissing,hostCpuMin,hostCpuMean,hostCpuMax,otherJvms"));
        BattleResult r = battle(60, 40);
        r.duressTicks = 7;
        r.engineDisables = 2;
        r.securityErrors = 3;
        r.rShortfall = 1;
        r.finalRMissing = 1;
        r.errors = "boom";
        String csv = r.toCsv();
        assertEquals(BattleResult.HEADER.split(",").length, csv.split(",", -1).length);
        BattleResult back = BattleResult.parse(csv);
        assertEquals(7, back.duressTicks);
        assertEquals(2, back.engineDisables);
        assertEquals(3, back.securityErrors);
        assertEquals(1, back.rShortfall);
        assertEquals(1, back.finalRMissing);
        assertEquals("boom", back.errors);
    }

    @Test
    @Tag("BENCH-20")
    @DisplayName("a row written with the old 51 columns still parses, with duress unknown")
    void oldRowsStillParse() {
        String[] f = battle(60, 40).toCsv().split(",", -1);
        String old = String.join(",", Arrays.copyOf(f, 51));
        BattleResult back = BattleResult.parse(old);
        assertTrue(back.ok);
        assertEquals(-1, back.duressTicks);
        assertEquals(0, back.engineDisables);
        assertEquals(35, back.roundRecords);
    }

    @Test
    @Tag("BENCH-20")
    @DisplayName("a failed row has the same number of columns as the header")
    void failedRowMatchesHeader() {
        String row = BattleResult.failed("timed out, twice");
        assertEquals(BattleResult.HEADER.split(",").length, row.split(",", -1).length);
        assertFalse(BattleResult.parse(row).ok);
    }

    @Test
    @Tag("BENCH-20")
    @DisplayName("security-manager denials in the engine's error text are counted")
    void countsSecurityErrors() {
        assertEquals(0, BattleResult.securityErrorCount(""));
        assertEquals(2, BattleResult.securityErrorCount(
            "Preventing x.Y 1.0 from access: (java.io.FilePermission a read) Preventing x.Y 1.0 from access: (b)"));
    }

    @Test
    @Tag("BENCH-20")
    @DisplayName("the result row carries the harvester's duress ticks, engine disables and R shortfall")
    void resultOfTakesTrustSignals() throws IOException {
        Path dir = Files.createTempDirectory("trust");
        LogHarvester h = new LogHarvester(dir, "us");
        h.readRecord(rLine(0, "win", 0.2, 4));
        h.readRecord(rLine(1, "loss", 0.1, 3));
        h.close();
        BattleResults us = new BattleResults("us", 1, 100, 50, 0, 40, 0, 0, 0, 1, 0, 0);
        BattleResults them = new BattleResults("them", 2, 80, 40, 0, 30, 0, 0, 0, 0, 1, 0);
        BattleResult r = BattleResult.of(us, them, 3, h, "Preventing a from access: (x)");
        assertEquals(7, r.duressTicks);
        assertEquals(1, r.securityErrors);
        assertEquals(1, r.rShortfall);
        assertEquals(1, r.finalRMissing);
    }

    @Test
    @Tag("BENCH-21")
    @DisplayName("a battle is trusted only with no duress, few skips and an R record for every round")
    void trustedRules() {
        assertTrue(battle(60, 40).trusted(2.0));
        BattleResult duress = battle(60, 40);
        duress.duressTicks = 1;
        assertFalse(duress.trusted(2.0));
        assertEquals(List.of("duress"), duress.untrustedReasons(2.0));
        BattleResult skippy = battle(60, 40);
        skippy.skippedTurns = 71;
        assertFalse(skippy.trusted(2.0));
        assertTrue(skippy.trusted(3.0), "the skip ceiling is the caller's to set");
        BattleResult shortR = battle(60, 40);
        shortR.roundRecords = 34;
        assertFalse(shortR.trusted(2.0));
        BattleResult unknown = battle(60, 40);
        unknown.duressTicks = -1;
        assertTrue(unknown.trusted(2.0), "an old row with unknown duress is not called loaded");
        BattleResult failed = battle(60, 40);
        failed.ok = false;
        assertFalse(failed.trusted(2.0));
    }

    @Test
    @Tag("BENCH-21")
    @DisplayName("the report has a trust section per opponent with the trusted count and the tallies")
    void reportHasTrustSection() {
        BattleResult good = battle(60, 40);
        BattleResult loaded = battle(60, 40);
        loaded.duressTicks = 12;
        loaded.engineDisables = 1;
        loaded.securityErrors = 2;
        loaded.roundRecords = 34;
        loaded.finalRMissing = 1;
        Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
        results.put(OPP, List.of(good, loaded));
        String report = Report.render(results, "hadur2.Hadur 3.8", false, 35, 2, 800, 600, "unknown");
        assertTrue(report.contains("## Trust"));
        assertTrue(report.contains("| kc.mega.BeepBoop 2.0 | 2 | 1 | 12 | 1 |"), report);
        assertTrue(report.contains("1 of 2 battles trusted."));
    }

    @Test
    @Tag("BENCH-21")
    @DisplayName("the paired A/B repeats the score-share diff over trusted pairs only")
    void sensitivityDropsUntrustedPairs() {
        // Pair 1 is trusted and gains 10 points; pair 2's baseline ran in duress and the pair gains 50.
        BattleResult c1 = battle(60, 40), b1 = battle(50, 50);
        BattleResult c2 = battle(80, 20), b2 = battle(30, 70);
        b2.duressTicks = 20;
        Map<Opponent, List<BattleResult>> cand = new LinkedHashMap<>(), base = new LinkedHashMap<>();
        cand.put(OPP, List.of(c1, c2));
        base.put(OPP, List.of(b1, b2));
        String report = Report.renderPaired(cand, base, "hadur2.Hadur 3.8", "hadur2.Hadur 3.7");
        assertTrue(report.contains("### Sensitivity: trusted pairs only"));
        assertTrue(report.contains("| kc.mega.BeepBoop 2.0 | 2 | 1 | +30.0 ± "), report);
        assertTrue(report.contains("| All pairs | 2 | 1 | +30.0 ± "), report);
        assertEquals(10.0, Report.pairedDiff(List.of(c1, c2), List.of(b1, b2), BattleResult::scoreShare, true).mean * 100, 1e-9);
    }

    @Test
    @Tag("BENCH-22")
    @DisplayName("the harvester knows when the last round's R record never arrived")
    void finalRecordMissing() throws IOException {
        Path dir = Files.createTempDirectory("final");
        LogHarvester h = new LogHarvester(dir, "us");
        h.readRecord(rLine(0, "win", 0.2, 0));
        h.readRecord(rLine(1, "loss", 0.1, 0));
        assertFalse(h.finalRecordMissing(2));
        assertTrue(h.finalRecordMissing(3));
        h.noteTurn(2, 100, 5, 5, true);
        assertTrue(h.finalRecordMissing(3), "a round the engine played but Hadur never reported");
        h.close();
    }

    @Test
    @Tag("BENCH-22")
    @DisplayName("draining waits for the engine to announce the battle's end, within a bound")
    void drainWaitsForBattleFinished() throws Exception {
        Path dir = Files.createTempDirectory("drain");
        LogHarvester h = new LogHarvester(dir, "us");
        long start = System.nanoTime();
        assertFalse(h.awaitDrain(60, 10), "no battle-finished event, so the wait times out");
        assertTrue((System.nanoTime() - start) / 1_000_000 >= 55);
        h.onBattleFinished(new BattleFinishedEvent(false));
        assertTrue(h.awaitDrain(1000, 10));
        h.close();
    }

    @Test
    @Tag("BENCH-23")
    @DisplayName("each round's outcome, ticks, damage, hit rate, duress and skips are written to rounds.tsv and read back")
    void roundsTsvRoundTrip(@TempDir Path tmp) throws IOException {
        LogHarvester h = new LogHarvester(tmp, "us");
        h.noteTurn(0, 120, 1, 1, true);
        h.noteTurn(0, 499, 30.5, 10, true);
        h.noteTurn(1, 299, 0, 22, false);
        h.readRecord(rLine(0, "win", 0.25, 6));
        h.close();
        RoundSeries.write(tmp, "hadur2.Hadur 3.8", "kc.mega.BeepBoop 2.0", 4, h.rounds());
        List<String> lines = Files.readAllLines(tmp.resolve("rounds.tsv"));
        assertEquals(RoundSeries.HEADER, lines.get(0));
        assertEquals(3, lines.size());
        List<RoundSeries.Row> rows = RoundSeries.parse(String.join("\n", lines));
        assertEquals(2, rows.size());
        RoundSeries.Row r0 = rows.get(0), r1 = rows.get(1);
        assertEquals("hadur2.Hadur 3.8", r0.build);
        assertEquals(4, r0.seed);
        assertEquals(1, r0.won);
        assertEquals(500, r0.ticks);
        assertEquals(30.5, r0.damageDealt, 1e-9);
        assertEquals(0.25, r0.hitRate, 1e-9);
        assertEquals(6, r0.duressTicks);
        assertEquals(1, r0.survived);
        assertEquals(-1, r1.won, "no R record for round 1");
        assertEquals(0, r1.survived);
        assertTrue(Double.isNaN(r1.hitRate));
    }

    @Test
    @Tag("BENCH-23")
    @DisplayName("a run's battle directories merge into one file, in directory order")
    void mergesRunDirectories(@TempDir Path work) throws IOException {
        for (String d : List.of("b-2", "a-1")) {
            Path dir = Files.createDirectories(work.resolve("battles").resolve(d));
            LogHarvester h = new LogHarvester(dir, "us");
            h.noteTurn(0, 9, 1, 1, true);
            h.close();
            RoundSeries.write(dir, "us", d, 1, h.rounds());
        }
        List<RoundSeries.Row> rows = RoundSeries.readAll(work);
        assertEquals(List.of("a-1", "b-2"), rows.stream().map(r -> r.opponent).toList());
        String merged = RoundSeries.merge(rows);
        assertEquals(3, merged.split("\n").length);
        assertTrue(merged.startsWith(RoundSeries.HEADER));
    }

    private static List<RoundSeries.Row> series(String build, int seed, int rounds, int earlyWins, int lateWins) {
        List<RoundSeries.Row> rows = new ArrayList<>();
        for (int i = 0; i < rounds; i++) {
            boolean early = i < 5, late = i >= rounds - 10;
            int won = early ? (i < earlyWins ? 1 : 0) : late ? ((i - (rounds - 10)) < lateWins ? 1 : 0) : 0;
            double dealt = early ? 10 : late ? 30 : 20;
            rows.add(new RoundSeries.Row(build, "kc.mega.BeepBoop 2.0", seed, i, won, 1, 400, dealt, 30 - dealt + 10,
                0.2, 0, 0));
        }
        return rows;
    }

    @Test
    @Tag("BENCH-24")
    @DisplayName("first five rounds against last ten, with the late-minus-early difference per build")
    void firstVersusLastRounds() {
        List<RoundSeries.Row> rows = new ArrayList<>();
        for (int seed = 1; seed <= 3; seed++) rows.addAll(series("cand", seed, 35, 1, 8));
        for (int seed = 1; seed <= 3; seed++) rows.addAll(series("base", seed, 35, 1, 2));
        String md = Report.renderRoundSplit(rows, "cand", "base");
        assertTrue(md.contains("## First rounds against last rounds"));
        // cand: 20% early, 80% late, so +60.0 (every battle identical, so the interval is 0.0).
        assertTrue(md.contains("| kc.mega.BeepBoop 2.0 | cand | 3 | 20.0% ± 0.0 | 80.0% ± 0.0 | +60.0 ± 0.0 |"), md);
        assertTrue(md.contains("| kc.mega.BeepBoop 2.0 | base | 3 | 20.0% ± 0.0 | 20.0% ± 0.0 | +0.0 ± 0.0 |"), md);
        // Same cold start, candidate better late by 60 points.
        assertTrue(md.contains("| kc.mega.BeepBoop 2.0 | +0.0 ± 0.0 | +60.0 ± 0.0 |"), md);
    }

    @Test
    @Tag("BENCH-24")
    @DisplayName("a battle too short for two windows is left out of the first-against-last table")
    void shortBattlesAreSkipped() {
        List<RoundSeries.Row> rows = series("cand", 1, 12, 1, 1);
        String md = Report.renderRoundSplit(rows, "cand", null);
        assertTrue(md.contains("| kc.mega.BeepBoop 2.0 | cand | 0 | - | - | n/a |"), md);
    }

    @Test
    @Tag("BENCH-25")
    @DisplayName("the paired A/B gives intervals for score share, survival share, win rate and bullet-damage share")
    void pairedFourMetrics() {
        List<BattleResult> cand = new ArrayList<>(), base = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            BattleResult c = battle(60, 40);
            c.survival = 60;
            c.theirSurvival = 40;
            c.firsts = 21;
            c.bulletDamage = 120;
            c.theirBulletDamage = 80;
            cand.add(c);
            base.add(battle(50, 50));
        }
        Map<Opponent, List<BattleResult>> cm = new LinkedHashMap<>(), bm = new LinkedHashMap<>();
        cm.put(OPP, cand);
        bm.put(OPP, base);
        String md = Report.renderPaired(cm, bm, "hadur2.Hadur 3.8", "hadur2.Hadur 3.7");
        assertTrue(md.contains("| Opponent | Score share | Survival share | Win rate | Bullet-damage share |"), md);
        // score +10, survival +10, win rate 21/35 vs 20/35 = +2.9, damage share 60 vs 50 = +10.
        assertTrue(md.contains("| kc.mega.BeepBoop 2.0 | +10.0 ± 0.0 | +10.0 ± 0.0 | +2.9 ± 0.0 | +10.0 ± 0.0 |"), md);
        assertTrue(md.contains("| All pairs | +10.0 ± 0.0 | +10.0 ± 0.0 | +2.9 ± 0.0 | +10.0 ± 0.0 |"), md);
        assertNotEquals(-1, md.indexOf("### Paired intervals by metric (pp)"));
    }
}
