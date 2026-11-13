package hadur117.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** SHIELD-5: which opponents the list names, and how a line matches a scanned name. */
@Tag("SHIELD-5")
class ShieldListTest {

    @Test
    @DisplayName("a list of only comments and blanks is empty and matches nobody")
    void emptyHeaderOnly() {
        ShieldList list = ShieldList.parse(List.of("# a header", "", "   ", "# apv.test.Virus 0.6.1"));
        assertTrue(list.isEmpty());
        assertSame(ShieldList.NONE, list);
        assertFalse(list.matches("apv.test.Virus 0.6.1"));
        assertFalse(ShieldList.NONE.matches(null));
    }

    @Test
    @Tag("SHIELD-26")
    @DisplayName("a name with its version matches every version of that robot: lines carry over to a new version")
    void withVersion() {
        ShieldList list = ShieldList.parse(List.of("apv.test.Virus 0.6.1"));
        assertTrue(list.matches("apv.test.Virus 0.6.1"));
        assertTrue(list.matches("apv.test.Virus 0.6.2"));
        assertTrue(list.matches("apv.test.Virus"));
        assertFalse(list.matches("apv.test.VirusX 0.6.1"), "still never a prefix");
    }

    @Test
    @DisplayName("a name without a version matches every version of that robot")
    void withoutVersion() {
        ShieldList list = ShieldList.parse(List.of("apv.test.Virus"));
        assertTrue(list.matches("apv.test.Virus 0.6.1"));
        assertTrue(list.matches("apv.test.Virus 9.9"));
        assertTrue(list.matches("apv.test.Virus"));
    }

    @Test
    @DisplayName("matching is exact: never a prefix, and case counts")
    void notAPrefix() {
        ShieldList list = ShieldList.parse(List.of("apv.test.Virus"));
        assertFalse(list.matches("apv.test.VirusX 1.0"));
        assertFalse(list.matches("apv.test.Vir 1.0"));
        assertFalse(list.matches("APV.test.virus 0.6.1"));
        assertFalse(list.matches("other.apv.test.Virus 0.6.1"));
    }

    @Test
    @DisplayName("comments, blanks and stray white space are ignored")
    void tidiness() {
        ShieldList list = ShieldList.parse(List.of("# header", "  cx.micro.Smoke   0.96  ", "", "sample.Walls"));
        assertEquals(2, list.size());
        assertTrue(list.matches("cx.micro.Smoke 0.96"));
        assertTrue(list.matches("sample.Walls 1.0"));
    }

    @Test
    @DisplayName("the list is bounded")
    void bounded() {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < ShieldList.MAX_ENTRIES + 500; i++) lines.add("r.Robot" + i);
        assertEquals(ShieldList.MAX_ENTRIES, ShieldList.parse(lines).size());
    }

    @Test
    @DisplayName("a missing list is the empty list")
    void nullLines() {
        assertTrue(ShieldList.parse(null).isEmpty());
    }

    @Test
    @Tag("MOVE-28")
    @Tag("GUN-11")
    @DisplayName("heat-jit and gun-stack lines name per-opponent switches, matched as shield entries, and no shield entry")
    void perOpponentSwitches() {
        ShieldList l = ShieldList.parse(List.of("heat-jit: a.B 1.0", "gun-stack: a.B 1.0", "gun-stack: c.D",
            "heat-jit:", "gun-stack:   "));
        assertTrue(l.heatJit("a.B 1.0"));
        assertTrue(l.gunStack("a.B 1.0"));
        assertTrue(l.heatJit("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.gunStack("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.heatJit("c.D 2.3"));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertTrue(l.isEmpty());
        assertFalse(ShieldList.NONE.heatJit("a.B 1.0"));
        assertFalse(ShieldList.NONE.gunStack(null));
        assertSame(ShieldList.NONE, ShieldList.parse(List.of("heat-jit:", "gun-stack:")));
    }

    @Test
    @Tag("SHIELD-25")
    @DisplayName("shield-floor lines name the opponents shield mode fires no shot under 0.4 at, matched as shield entries")
    void perOpponentFloor() {
        ShieldList l = ShieldList.parse(List.of("shield-floor: a.B 1.0", "shield-floor: c.D", "shield-floor:"));
        assertTrue(l.floor("a.B 1.0"));
        assertTrue(l.floor("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.floor("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.still("a.B 1.0") || l.mirrorOff("a.B 1.0"), "no other switch");
        assertFalse(l.floor(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.floor("a.B 1.0"));
    }

    @Test
    @Tag("POW-18")
    @DisplayName("power-cap lines name the opponents the duel caps its power against, matched as shield entries")
    void perOpponentPowerCap() {
        ShieldList l = ShieldList.parse(List.of("power-cap: a.B 1.0", "power-cap: c.D", "power-cap:"));
        assertTrue(l.powerCap("a.B 1.0"));
        assertTrue(l.powerCap("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.powerCap("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.floor("a.B 1.0") || l.racePower("a.B 1.0"), "no other switch");
        assertFalse(l.powerCap(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.powerCap("a.B 1.0"));
        ShieldList h = ShieldList.parse(List.of("power-cap5: e.F", "power-cap: g.H"));
        assertTrue(h.powerCapHalf("e.F 1.0") && !h.powerCap("e.F 1.0"), "a power-cap5 line is the 0.5 cap only");
        assertTrue(h.powerCap("g.H 1.0") && !h.powerCapHalf("g.H 1.0"));
    }

    @Test
    @Tag("MOVE-40")
    @DisplayName("a wall-hug: line names its opponent for the closer wall orbit, by name, and sets no other switch")
    void wallHugLines() {
        ShieldList l = ShieldList.parse(List.of("wall-hug: a.B 1.0", "power-cap: c.D"));
        assertTrue(l.wallHug("a.B 1.0") && l.wallHug("a.B 2.0"), "matched by name (SHIELD-26)");
        assertFalse(l.powerCap("a.B 1.0") || l.matches("a.B 1.0"), "no other switch");
        assertFalse(l.wallHug("c.D 1.0"));
        assertFalse(ShieldList.NONE.wallHug("a.B 1.0"));
    }

    @Test
    @Tag("MIR-2")
    @DisplayName("mirror-off lines name the opponents the duel never runs MIR-1 against, matched as shield entries")
    void perOpponentMirrorOff() {
        ShieldList l = ShieldList.parse(List.of("mirror-off: a.B 1.0", "mirror-off: c.D", "flat-on: c.D", "mirror-off:"));
        assertTrue(l.mirrorOff("a.B 1.0"));
        assertTrue(l.mirrorOff("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.mirrorOff("c.D 2.3"), "a bare name matches every version");
        assertTrue(l.flatOn("c.D 2.3"), "switches on one robot combine");
        assertFalse(l.flatOn("a.B 1.0") || l.racePower("a.B 1.0"), "no other switch");
        assertFalse(l.mirrorOff(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.mirrorOff("a.B 1.0"));
    }

    @Test
    @Tag("MOVE-32")
    @DisplayName("flat-on lines name the opponents the duel surfs with the flatteners on, matched as shield entries")
    void perOpponentFlatOn() {
        ShieldList l = ShieldList.parse(List.of("flat-on: a.B 1.0", "flat-on: c.D", "heat-jit: c.D", "flat-on:"));
        assertTrue(l.flatOn("a.B 1.0"));
        assertTrue(l.flatOn("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.flatOn("c.D 2.3"), "a bare name matches every version");
        assertTrue(l.heatJit("c.D 2.3"), "switches on one robot combine");
        assertFalse(l.heatJit("a.B 1.0") || l.still("a.B 1.0"), "no other switch");
        assertFalse(l.flatOn(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.flatOn("a.B 1.0"));
    }

    @Test
    @Tag("MOVE-34")
    @DisplayName("mimic-on lines name the opponents the duel surfs with the mimic members, matched as shield entries")
    void perOpponentMimicOn() {
        ShieldList l = ShieldList.parse(List.of("mimic-on: a.B 1.0", "mimic-on: c.D", "flat-on: c.D", "mimic-on:"));
        assertTrue(l.mimicOn("a.B 1.0"));
        assertTrue(l.mimicOn("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.mimicOn("c.D 2.3"), "a bare name matches every version");
        assertTrue(l.flatOn("c.D 2.3"), "switches on one robot combine");
        assertFalse(l.flatOn("a.B 1.0") || l.heatJit("a.B 1.0"), "no other switch");
        assertFalse(l.mimicOn(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.mimicOn("a.B 1.0"));
    }

    @Test
    @Tag("POW-15")
    @DisplayName("full-off lines name the opponents the duel never fires the full-power rules at, matched as shield entries")
    void perOpponentFullOff() {
        ShieldList l = ShieldList.parse(List.of("full-off: a.B 1.0", "full-off: c.D", "mimic-on: c.D", "full-off:"));
        assertTrue(l.fullOff("a.B 1.0"));
        assertTrue(l.fullOff("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.fullOff("c.D 2.3"), "a bare name matches every version");
        assertTrue(l.mimicOn("c.D 2.3"), "switches on one robot combine");
        assertFalse(l.mimicOn("a.B 1.0") || l.flatOn("a.B 1.0"), "no other switch");
        assertFalse(l.fullOff(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.fullOff("a.B 1.0"));
    }

    @Test
    @Tag("POW-16")
    @DisplayName("x5-power lines name opponents for POW-16, matched as shield entries")
    void perOpponentX5() {
        ShieldList l = ShieldList.parse(List.of("x5-power: a.B 1.0", "full-off: c.D", "x5-power:"));
        assertTrue(l.x5Power("a.B 1.0"));
        assertTrue(l.x5Power("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.fullOff("c.D 2.3"), "switches on one robot combine");
        assertFalse(l.x5Power("c.D 2.3") || l.fullOff("a.B 1.0"), "no other switch");
        assertFalse(l.x5Power(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.x5Power("a.B 1.0"));
    }

    @Test
    @Tag("SHIELD-19")
    @DisplayName("shield-exit4 and shield-exit0 lines give an opponent's battle exit, matched as shield entries")
    void perOpponentExit() {
        ShieldList l = ShieldList.parse(List.of("a.B", "shield-exit4: a.B 1.0", "shield-exit0: c.D", "shield-exit4: c.D",
            "shield-exit0:"));
        assertEquals(400, l.stayDamage("a.B 1.0", 150));
        assertEquals(400, l.stayDamage("a.B 1.1", 150), "a line carries over to a new version (SHIELD-26)");
        assertEquals(Double.MAX_VALUE, l.stayDamage("c.D 2.3", 150), "no exit wins over the later exit");
        assertEquals(150, l.stayDamage("e.F 1", 150));
        assertEquals(150, l.stayDamage(null, 150));
        assertFalse(l.heatJit("a.B 1.0") || l.gunStack("c.D 2.3"), "no other switch");
        assertEquals(1, l.size(), "no shield entry");
        assertEquals(150, ShieldList.NONE.stayDamage("a.B 1.0", 150));
    }

    @Test
    @Tag("SKEY-2")
    @DisplayName("surf-key lines give an opponent's ten key values, matched as shield entries; malformed lines skipped")
    void surfKeys() {
        ShieldList l = ShieldList.parse(List.of(
            "surf-key: 1 2 1 1 0.5 1 1 1 1 1.4 a.B 1.0",
            "surf-key: 1 1 1 1 1 1 1 1 1 2 c.D",
            "surf-key: 1 1 1 1 1 1 1 1 1 e.F 1.0",
            "surf-key: 1 1 1 1 1 1 1 1 0 1 g.H",
            "surf-key: 1 1 1 1 x 1 1 1 1 1 i.J"));
        double[] k = l.surfKeyFor("a.B 1.0");
        assertEquals(10, k.length);
        assertEquals(2.0, k[1]);
        assertEquals(1.4, k[9]);
        k[1] = 9;
        assertEquals(2.0, l.surfKeyFor("a.B 1.0")[1], "a fresh copy each call");
        assertEquals(2.0, l.surfKeyFor("a.B 1.1")[1], "a line carries over to a new version (SHIELD-26)");
        assertEquals(2.0, l.surfKeyFor("c.D 3")[9], "a versionless line matches every version");
        assertEquals(null, l.surfKeyFor("e.F 1.0"), "nine values: the name would be a number");
        assertEquals(null, l.surfKeyFor("g.H 1"), "a zero multiplier is skipped");
        assertEquals(null, l.surfKeyFor("i.J 1"), "a non-number is skipped");
        assertEquals(null, l.surfKeyFor(null));
        assertEquals(0, l.size(), "no shield entry");
        assertEquals(null, ShieldList.NONE.surfKeyFor("a.B 1.0"));
    }
}
