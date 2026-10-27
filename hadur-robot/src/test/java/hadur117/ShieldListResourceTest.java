package hadur117;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.shieldmode.ShieldList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * SHIELD-5: Hadur's own shield list ships as a class of the robot jar, {@link ShieldListData},
 * because Robocode's sandbox denies a robot the read of a resource in its own jar (found by
 * the bench's smoke run). Whatever names are on it, every entry must be a robot name the core
 * can match, and the list holds the 14 robots the BENCH-11 probe (docs/bench/d5-probe.md) chose,
 * the 83 the 3.10 shield sweep (docs/bench/local/2026-10-08_shield-sweep.md) admitted and the 103
 * the 3.13 sweep of Nullstride's list admitted (SHIELD-13,
 * docs/bench/local/2026-10-12_plan90-pc-read.md).
 */
@Tag("SHIELD-5")
class ShieldListResourceTest {

    @Test
    @DisplayName("every entry is a comment, a blank or a robot name the core can match")
    void everyEntryParses() {
        List<String> lines = Arrays.asList(ShieldListData.lines());
        int robots = 0;
        for (String line : lines) {
            String t = line.trim();
            if (t.isEmpty() || t.startsWith("#")) continue;
            robots++;
            // "package.Class" or "package.Class version": a dotted class name, then at most a version.
            assertTrue(t.matches("[\\w$]+(\\.[\\w$]+)+( \\S+)?"), "not a robot name: " + t);
        }
        ShieldList list = ShieldList.parse(lines);
        assertEquals(robots, list.size(), "one list entry per robot entry");
        for (String line : lines) {
            String t = line.trim();
            if (!t.isEmpty() && !t.startsWith("#")) assertTrue(list.matches(t), t);
        }
    }

    @Test
    @DisplayName("the list holds the 14 robots of the D5 probe and nobody the probe lost against since")
    void listHoldsTheProbedRobots() {
        ShieldList list = ShieldList.parse(Arrays.asList(ShieldListData.lines()));
        assertEquals(14 + 83 + 103 + 49 + 16 + 11, list.size());
        for (String name : new String[] {
            "apv.test.Virus 0.6.1", "kcn.unnamed.Unnamed 1.21", "simonton.mega.SniperFrog 1.0.fix2",
            "vic.Locke 0.7.5.5", "cx.micro.Smoke 0.96", "dft.Virgin 1.25", "kid.Gladiator .7.2",
            "nkn.mini.Jskr0 0.1", "ej.ChocolateBar 1.1", "jam.micro.RaikoMicro 1.44",
            "ph.musketeer.Musketeer 0.6", "suh.micro.MirrorPM 1.00", "pez.gloom.GloomyDark 0.9.2",
            "reaper.Reaper 1.1"}) {
            assertTrue(list.matches(name), name);
        }
        for (String name : new String[] {
            // Hubris, RSK1 and ThroxBot lost to 3.12's shield and joined in 3.13 (SHIELD-13).
            "timmit.nano.TimCat 0.13", "gh.nano.Grofvuil 0.2", "sample.Fire", "suh.nano.OscillatorL 1.00"}) {
            assertTrue(!list.matches(name), name);
        }
    }

    @Test
    @DisplayName("the list holds the sweep's admitted robots and none of the robots shield mode lost to")
    void listHoldsTheSweptRobots() {
        ShieldList list = ShieldList.parse(Arrays.asList(ShieldListData.lines()));
        // The sweep's largest gains in each group: the #140 thirty, ranks 51-400, ranks 401-700.
        for (String name : new String[] {
            "dft.Cyanide 1.90", "cf.proto.Shiva 2.2", "simonton.beta.LifelongObsession 0.5.1",
            "simonton.mini.WeeksOnEnd 1.10.4", "pez.clean.Swiffer 0.2.9", "vuen.Fractal 0.55",
            "zen.Lindada 0.2"}) {
            assertTrue(list.matches(name), name);
        }
        // Robots whose interval lay below 0: shield mode costs points on them.
        for (String name : new String[] {
            // dz.Caedo 1.4 lost here and joined in 3.16 with SHIELD-16 (mode table v1).
            "sqTank.waveSurfing.LionWWSVMvoid 0.01", "suh.mega.WaveSurferGF 1.04", "rz.Artist 0.2",
            // rjw.RabidWombat 0.71 lost here and joined with shield part 2 (PR #256).
            "ratosh.Nobo 0.21", "dy.LevelOne 2.0"}) {
            assertTrue(!list.matches(name), name);
        }
        // Entries carry a version: a robot's next release is not on the list until benched.
        assertTrue(!list.matches("dft.Cyanide 1.91"));
    }

    @Test
    @Tag("SHIELD-13")
    @DisplayName("the list holds the 3.13 sweep's admitted robots, and none it left out")
    void listHoldsTheNullstrideSweep() {
        ShieldList list = ShieldList.parse(Arrays.asList(ShieldListData.lines()));
        // The largest gains of the 8-seed sweep, and robots 3.12's shield lost to that 3.13's wins.
        for (String name : new String[] {
            "davidalves.Phoenix 1.02", "kc.serpent.Hydra 0.21", "cjm.chalk.Chalk 2.6.Be",
            "wcsv.PowerHouse.PowerHouse 1.7e3", "pez.rumble.Ali 0.4.9", "css.Delitioner 0.11",
            "pedersen.Hubris 2.4", "rsk1.RSK1 4.0"}) {
            assertTrue(list.matches(name), name);
        }
        // Robots of Nullstride's list the sweep found worse or open with a small mean.
        for (String name : new String[] {
            "aaa.r.ScalarR 0.005h.053-noshield", "theo.Hydrogen 2.1r", "stelo.MatchupMicro 1.2",
            "cx.mini.BlackSwans 0.60"}) {
            assertTrue(!list.matches(name), name);
        }
    }

    @Test
    @Tag("SHIELD-16")
    @DisplayName("the list holds mode table v1's 49 confirmed robots, and none the confirm dropped")
    void listHoldsModeTableV1() {
        ShieldList list = ShieldList.parse(Arrays.asList(ShieldListData.lines()));
        // The largest confirmed gains (PR #244), and Saguaro shield bots that lost to SHIELD-16 before.
        for (String name : new String[] {
            "cs.s2.Seraphim 2.3.1", "slugzilla.ButtHead 2.0", "jk.micro.Cotillion 0.8",
            "ers.nano.gokdeniz.Gokdeniz 1.5b", "oog.micro.SavantMicro 1.1", "exauge.GateKeeper 1.1.121g",
            "dz.Caedo 1.4", "cuoq.Kakera 1.0"}) {
            assertTrue(list.matches(name), name);
        }
        // Locked on the first pick, dropped on the 8 fresh seeds of the confirm. TJ.Exupery 1.39 was
        // too, and joined with shield part 2's opening drive (PR #256).
        for (String name : new String[] {
            "ar.horizon.Horizon 1.2.2", "stelo.Spread 0.9", "florent.XSeries.X2 0.17"}) {
            assertTrue(!list.matches(name), name);
        }
    }

    @Test
    @Tag("SHIELD-17")
    @Tag("SHIELD-18")
    @DisplayName("shield parts 2 and 3 (PRs #256, #276): 16 + 11 list adds, 31 + 8 opening drives, 221 + 11 shipped aims")
    void listHoldsShieldPartTwo() {
        List<String> lines = new java.util.ArrayList<>(Arrays.asList(ShieldListData.lines()));
        for (String name : ShieldTableData.moves()) lines.add(ShieldList.MOVE_PREFIX + " " + name);
        for (String aim : ShieldTableData.aims()) lines.add(ShieldList.AIM_PREFIX + " " + aim);
        ShieldList list = ShieldList.parse(lines);
        for (String name : new String[] {"CharlieN.Omega.Omega 1.03", "SHAM.WOW 1.4", "voidious.micro.Jen 1.11"}) {
            assertTrue(list.matches(name), name);
        }
        assertEquals(31 + 8, ShieldTableData.moves().length);
        for (String name : ShieldTableData.moves()) {
            assertTrue(list.moves(name) && list.matches(name), "an opening drive is for a shielded robot: " + name);
        }
        assertEquals(221 + 11, ShieldTableData.aims().length);
        for (String aim : ShieldTableData.aims()) {
            String name = aim.split(" ", 3)[2];
            assertTrue(list.aimFor(name) != null && list.matches(name), "a shipped aim is for a shielded robot: " + name);
        }
        assertTrue(!list.moves("dft.Cyanide 1.90") && list.aimFor("sample.Fire") == null);
    }

    @Test
    @Tag("POISON-2")
    @DisplayName("stop-and-go entries, mode table v2 and pass 2 (PRs #263, #276): 18 + 8 variant 1, 35 + 12 variant 2")
    void listHoldsModeTableV2() {
        List<String> lines = new java.util.ArrayList<>(Arrays.asList(ShieldListData.lines()));
        for (String name : ShieldTableData.stopGos()) lines.add(ShieldList.STOP_GO_PREFIX + " " + name);
        for (String name : ShieldTableData.stopGoShifts()) lines.add(ShieldList.STOP_GO_SHIFT_PREFIX + " " + name);
        ShieldList list = ShieldList.parse(lines);
        assertEquals(18 + 8, ShieldTableData.stopGos().length);
        assertEquals(35 + 12, ShieldTableData.stopGoShifts().length);
        assertEquals(18 + 8, new java.util.HashSet<>(Arrays.asList(ShieldTableData.stopGos())).size(), "no duplicates");
        assertEquals(35 + 12, new java.util.HashSet<>(Arrays.asList(ShieldTableData.stopGoShifts())).size(), "no duplicates");
        // DuelistMicroMkII (PR #263) and Vanessa03 (PR #276) are on both: their verify gates measured
        // them that way, so they stay as measured.
        java.util.Set<String> both = java.util.Set.of("davidalves.net.DuelistMicroMkII 1.1", "rcb.Vanessa03 0");
        for (String name : ShieldTableData.stopGos()) {
            assertEquals(1, list.stopGo(name), name);
            assertTrue(!list.matches(name) || both.contains(name), "a stop-and-go robot is not shielded: " + name);
        }
        for (String name : ShieldTableData.stopGoShifts()) {
            assertEquals(2, list.stopGo(name), name);
            assertTrue(!list.matches(name) || both.contains(name), "a stop-and-go robot is not shielded: " + name);
        }
        assertEquals(0, list.stopGo("dft.Cyanide 1.90"));
    }

    @Test
    @DisplayName("the robot never reads a resource of its own jar: Robocode's sandbox kills it for that")
    void noResourceReads() throws java.io.IOException {
        java.nio.file.Path src = java.nio.file.Path.of("src/main/java/hadur117/Hadur.java");
        String text = java.nio.file.Files.readString(src);
        assertTrue(!text.contains("getResourceAsStream") && !text.contains("getResource("),
            "Robocode denies the robot a read of its own jar");
    }
}
