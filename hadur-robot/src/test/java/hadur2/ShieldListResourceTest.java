package hadur2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.shieldmode.ShieldList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * SHIELD-5: Hadur's own shield list ships as a class of the robot jar, {@link ShieldListData},
 * because Robocode's sandbox denies a robot the read of a resource in its own jar (found by
 * the bench's smoke run). Whatever names are on it, every entry must be a robot name the core
 * can match, and the list holds the 14 robots the BENCH-11 probe (docs/bench/d5-probe.md) chose
 * and the 83 the 3.10 shield sweep (docs/bench/local/2026-10-08_shield-sweep.md) admitted.
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
    @DisplayName("the list holds the 14 robots of the D5 probe and nobody the probe lost against")
    void listHoldsTheProbedRobots() {
        ShieldList list = ShieldList.parse(Arrays.asList(ShieldListData.lines()));
        assertEquals(14 + 83, list.size());
        for (String name : new String[] {
            "apv.test.Virus 0.6.1", "kcn.unnamed.Unnamed 1.21", "simonton.mega.SniperFrog 1.0.fix2",
            "vic.Locke 0.7.5.5", "cx.micro.Smoke 0.96", "dft.Virgin 1.25", "kid.Gladiator .7.2",
            "nkn.mini.Jskr0 0.1", "ej.ChocolateBar 1.1", "jam.micro.RaikoMicro 1.44",
            "ph.musketeer.Musketeer 0.6", "suh.micro.MirrorPM 1.00", "pez.gloom.GloomyDark 0.9.2",
            "reaper.Reaper 1.1"}) {
            assertTrue(list.matches(name), name);
        }
        for (String name : new String[] {
            "pedersen.Hubris 2.4", "timmit.nano.TimCat 0.13", "rsk1.RSK1 4.0", "throxbot.ThroxBot 0.1",
            "gh.nano.Grofvuil 0.2", "sample.Fire", "suh.nano.OscillatorL 1.00"}) {
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
            "css.Delitioner 0.11", "dz.Caedo 1.4", "pedersen.Hubris 2.4",
            "sqTank.waveSurfing.LionWWSVMvoid 0.01", "suh.mega.WaveSurferGF 1.04", "rz.Artist 0.2",
            "ratosh.Nobo 0.21", "dy.LevelOne 2.0", "rjw.RabidWombat 0.71"}) {
            assertTrue(!list.matches(name), name);
        }
        // Entries carry a version: a robot's next release is not on the list until benched.
        assertTrue(!list.matches("dft.Cyanide 1.91"));
    }

    @Test
    @DisplayName("the robot never reads a resource of its own jar: Robocode's sandbox kills it for that")
    void noResourceReads() throws java.io.IOException {
        java.nio.file.Path src = java.nio.file.Path.of("src/main/java/hadur2/Hadur.java");
        String text = java.nio.file.Files.readString(src);
        assertTrue(!text.contains("getResourceAsStream") && !text.contains("getResource("),
            "Robocode denies the robot a read of its own jar");
    }
}
