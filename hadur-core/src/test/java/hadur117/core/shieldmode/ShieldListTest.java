package hadur117.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
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
    @Tag("SHIELD-27")
    @DisplayName("shield-break lines name the opponents shield mode breaks off a close start against, matched as shield entries")
    void perOpponentCloseBreak() {
        ShieldList l = ShieldList.parse(List.of("shield-break: a.B 1.0", "shield-break: c.D", "shield-break:"));
        assertTrue(l.closeBreak("a.B 1.0"));
        assertTrue(l.closeBreak("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.closeBreak("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.floor("a.B 1.0") || l.tiny("a.B 1.0"), "no other switch");
        assertFalse(l.closeBreak(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.closeBreak("a.B 1.0"));
        assertFalse(l.ramLearn("a.B 1.0"), "its own set, not RAM-20's switch bit");
        assertFalse(ShieldList.parse(List.of("ram-learn: e.F")).closeBreak("e.F 1.0"), "a ram-learn line breaks off nothing");
    }

    @Test
    @Tag("SHIELD-35")
    @DisplayName("shield-yield lines name the opponents shield mode yields the drive to while close, matched as shield entries")
    void perOpponentCloseYield() {
        ShieldList l = ShieldList.parse(List.of("shield-yield: a.B 1.0", "shield-yield: c.D", "shield-yield:"));
        assertTrue(l.closeYield("a.B 1.0"));
        assertTrue(l.closeYield("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.closeYield("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.closeBreak("a.B 1.0"), "its own set, not SHIELD-27's");
        assertFalse(l.closeYield(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.closeYield("a.B 1.0"));
        assertFalse(ShieldList.parse(List.of("shield-break: e.F")).closeYield("e.F 1.0"), "a shield-break line yields nothing");
    }

    @Test
    @Tag("SHIELD-36")
    @DisplayName("shield-bail lines name the opponents shield mode leaves the round against after unpredicted hits")
    void perOpponentRoundBail() {
        ShieldList l = ShieldList.parse(List.of("shield-bail: a.B 1.0", "shield-bail: c.D"));
        assertTrue(l.roundBail("a.B 1.0"));
        assertTrue(l.roundBail("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.roundBail("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.closeBreak("a.B 1.0") || l.closeYield("a.B 1.0"), "its own set");
        assertFalse(l.roundBail(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.roundBail("a.B 1.0"));
        assertFalse(ShieldList.parse(List.of("shield-yield: e.F")).roundBail("e.F 1.0"), "a shield-yield line bails nothing");
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
    @Tag("POW-19")
    @DisplayName("hard-fire lines name the opponents the duel fires hard at while its energy is high, matched as shield entries")
    void perOpponentHardFire() {
        ShieldList l = ShieldList.parse(List.of("hard-fire: a.B 1.0", "hard-fire: c.D", "hard-fire:", "power-cap: e.F"));
        assertTrue(l.hardFire("a.B 1.0"));
        assertTrue(l.hardFire("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.hardFire("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.hardFire("e.F 1.0"), "a power-cap line is not a hard-fire line");
        assertFalse(l.powerCap("a.B 1.0") || l.racePower("a.B 1.0"), "no other switch");
        assertFalse(l.hardFire(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.hardFire("a.B 1.0"));
    }

    @Test
    @Tag("MOVE-44")
    @DisplayName("velocity-jitter lines name the exact-velocity pattern matchers the duel jitters its speed against, matched as shield entries")
    void perOpponentVelocityJitter() {
        ShieldList l = ShieldList.parse(List.of("velocity-jitter: a.B 1.0", "velocity-jitter: c.D", "velocity-jitter:", "hard-fire: e.F"));
        assertTrue(l.velocityJitter("a.B 1.0"));
        assertTrue(l.velocityJitter("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.velocityJitter("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.velocityJitter("e.F 1.0"), "a hard-fire line is not a velocity-jitter line");
        assertFalse(l.hardFire("a.B 1.0") || l.powerCap("a.B 1.0"), "no other switch");
        assertFalse(l.velocityJitter(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.velocityJitter("a.B 1.0"));
    }

    @Test
    @Tag("MOVE-45")
    @DisplayName("speed-band lines name the rounded-velocity pattern matchers the duel bands its top speed against, matched as shield entries")
    void perOpponentSpeedBand() {
        ShieldList l = ShieldList.parse(List.of("speed-band: a.B 1.0", "speed-band: c.D", "speed-band:", "velocity-jitter: e.F"));
        assertTrue(l.speedBand("a.B 1.0"));
        assertTrue(l.speedBand("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.speedBand("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.speedBand("e.F 1.0"), "a velocity-jitter line is not a speed-band line");
        assertFalse(l.velocityJitter("a.B 1.0") || l.hardFire("a.B 1.0"), "no other switch");
        assertFalse(l.speedBand(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.speedBand("a.B 1.0"));
    }

    @Test
    @Tag("MOVE-46")
    @DisplayName("ram-wait lines name the opponents a disabled enemy is rammed only after its last waves, matched as shield entries")
    void perOpponentRamWait() {
        ShieldList l = ShieldList.parse(List.of("ram-wait: a.B 1.0", "ram-wait: c.D", "ram-wait:", "speed-band: e.F"));
        assertTrue(l.ramWait("a.B 1.0"));
        assertTrue(l.ramWait("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.ramWait("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.ramWait("e.F 1.0"), "a speed-band line is not a ram-wait line");
        assertFalse(l.speedBand("a.B 1.0") || l.ramCirc("a.B 1.0"), "no other switch");
        assertFalse(l.ramWait(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.ramWait("a.B 1.0"));
    }

    @Test
    @Tag("RAM-15")
    @DisplayName("ram-flee lines name the slow chargers the duel backs away from, matched as shield entries")
    void perOpponentRamFlee() {
        ShieldList l = ShieldList.parse(List.of("ram-flee: a.B 1.0", "ram-flee: c.D", "ram-flee:", "ram-wait: e.F"));
        assertTrue(l.ramFlee("a.B 1.0"));
        assertTrue(l.ramFlee("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.ramFlee("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.ramFlee("e.F 1.0"), "a ram-wait line is not a ram-flee line");
        assertFalse(l.ramWait("a.B 1.0") || l.ramCirc("a.B 1.0"), "no other switch");
        assertFalse(l.ramFlee(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.ramFlee("a.B 1.0"));
    }

    @Test
    @Tag("MOVE-47")
    @DisplayName("steady-orbit lines name the opponents the surf orbits without stops, matched as shield entries")
    void perOpponentSteadyOrbit() {
        ShieldList l = ShieldList.parse(List.of("steady-orbit: a.B 1.0", "steady-orbit: c.D", "steady-orbit:", "ram-wait: e.F"));
        assertTrue(l.steadyOrbit("a.B 1.0"));
        assertTrue(l.steadyOrbit("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.steadyOrbit("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.steadyOrbit("e.F 1.0"), "a ram-wait line is not a steady-orbit line");
        assertFalse(l.ramWait("a.B 1.0") || l.velocityJitter("a.B 1.0"), "no other switch");
        assertFalse(l.steadyOrbit(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.steadyOrbit("a.B 1.0"));
    }

    @Test
    @Tag("RAM-14")
    @DisplayName("ram-heavy lines name the rammers whose shots the escape weighs twice as heavily, matched as shield entries")
    void perOpponentRamHeavy() {
        ShieldList l = ShieldList.parse(List.of("ram-heavy: a.B 1.0", "ram-heavy: c.D", "ram-heavy:", "ram-circ: e.F"));
        assertTrue(l.ramHeavy("a.B 1.0"));
        assertTrue(l.ramHeavy("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.ramHeavy("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.ramHeavy("e.F 1.0"), "a ram-circ line is not a ram-heavy line");
        assertFalse(l.ramCirc("a.B 1.0") || l.speedBand("a.B 1.0"), "no other switch");
        assertFalse(l.ramHeavy(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.ramHeavy("a.B 1.0"));
    }

    @Test
    @Tag("RAM-21")
    @DisplayName("ram-known lines name the rammers confirmed from the first scan, matched as shield entries")
    void perOpponentRamKnown() {
        ShieldList l = ShieldList.parse(List.of("ram-known: a.B 1.0", "ram-known: c.D", "ram-known:", "ram-learn: e.F"));
        assertTrue(l.ramKnown("a.B 1.0"));
        assertTrue(l.ramKnown("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.ramKnown("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.ramKnown("e.F 1.0"), "a ram-learn line is not a ram-known line");
        assertTrue(l.ramLearn("e.F 1.0"));
        assertFalse(l.ramLearn("a.B 1.0") || l.ramFan("a.B 1.0"), "no other switch");
        assertFalse(l.ramKnown(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.ramKnown("a.B 1.0"));
    }

    @Test
    @Tag("RAM-17")
    @DisplayName("ram-fan lines name the rammers whose aims the escape dodges as fans, matched as shield entries")
    void perOpponentRamFan() {
        ShieldList l = ShieldList.parse(List.of("ram-fan: a.B 1.0", "ram-fan: c.D", "ram-fan:", "ram-heavy: e.F"));
        assertTrue(l.ramFan("a.B 1.0"));
        assertTrue(l.ramFan("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertTrue(l.ramFan("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.ramFan("e.F 1.0"), "a ram-heavy line is not a ram-fan line");
        assertFalse(l.ramHeavy("a.B 1.0") || l.ramCirc("a.B 1.0"), "no other switch");
        assertFalse(l.ramFan(null));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertFalse(ShieldList.NONE.ramFan("a.B 1.0"));
    }

    @Test
    @Tag("POW-21")
    @DisplayName("fire-gap lines set one least gap between real duel shots per opponent, held to 12-200 ticks")
    void perOpponentFireGap() {
        ShieldList l = ShieldList.parse(List.of("fire-gap: 45 a.B 1.0", "fire-gap: 90 c.D", "fire-gap: 5 e.F",
            "fire-gap: 300 i.J", "fire-gap: x g.H", "fire-gap: 45", "fire-gap:"));
        assertEquals(45, l.fireGapFor("a.B 1.0"));
        assertEquals(45, l.fireGapFor("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertEquals(90, l.fireGapFor("c.D 2.3"), "a bare name matches every version");
        assertEquals(0, l.fireGapFor("e.F 1.0"), "a gap under 12 ticks is refused");
        assertEquals(0, l.fireGapFor("i.J 1.0"), "a gap over 200 ticks is refused");
        assertEquals(0, l.fireGapFor("g.H 1.0"), "a malformed line is skipped");
        assertEquals(0, l.fireGapFor(null));
        assertEquals(0, ShieldList.NONE.fireGapFor("a.B 1.0"));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
    }

    @Test
    @Tag("DIST-4")
    @DisplayName("dist-pin lines pin one duel distance per opponent, matched as shield entries, held to 150-900 px")
    void perOpponentDistPin() {
        ShieldList l = ShieldList.parse(List.of("dist-pin: 300 a.B 1.0", "dist-pin: 800 c.D", "dist-pin: 100 e.F",
            "dist-pin: x g.H", "dist-pin: 500", "dist-pin:"));
        assertEquals(300, l.distPinFor("a.B 1.0"));
        assertEquals(300, l.distPinFor("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertEquals(800, l.distPinFor("c.D 2.3"), "a bare name matches every version");
        assertTrue(Double.isNaN(l.distPinFor("e.F 1.0")), "a pin under 150 px is refused");
        assertTrue(Double.isNaN(l.distPinFor("g.H 1.0")), "a malformed line is skipped");
        assertTrue(Double.isNaN(l.distPinFor(null)));
        assertTrue(Double.isNaN(ShieldList.NONE.distPinFor("a.B 1.0")));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
    }

    @Test
    @Tag("POW-20")
    @DisplayName("power-band lines carry four energy-band multipliers per opponent, matched as shield entries")
    void perOpponentPowerBand() {
        ShieldList l = ShieldList.parse(List.of("power-band: 1.5 1.2 0.8 0.5 a.B 1.0", "power-band: 1 1 1 2 c.D",
            "power-band: 1 1 1 a.B", "power-band: 0 1 1 1 e.F", "power-band: x 1 1 1 g.H", "power-band:"));
        assertArrayEquals(new double[] {1.5, 1.2, 0.8, 0.5}, l.powerBandFor("a.B 1.0"));
        assertArrayEquals(new double[] {1.5, 1.2, 0.8, 0.5}, l.powerBandFor("a.B 1.1"), "a line carries over to a new version (SHIELD-26)");
        assertArrayEquals(new double[] {1, 1, 1, 2}, l.powerBandFor("c.D 2.3"), "a bare name matches every version");
        assertNull(l.powerBandFor("e.F 1.0"), "a zero multiplier is refused");
        assertNull(l.powerBandFor("g.H 1.0"), "a malformed line is skipped");
        assertNull(l.powerBandFor(null));
        assertFalse(l.matches("a.B 1.0") || l.hardFire("a.B 1.0"), "not a shield entry, no other switch");
        l.powerBandFor("a.B 1.0")[0] = 9;
        assertEquals(1.5, l.powerBandFor("a.B 1.0")[0], "callers get a copy");
        assertNull(ShieldList.NONE.powerBandFor("a.B 1.0"));
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
    @Tag("COPY-2")
    @DisplayName("copy lines give an opponent's bred gun genome, matched as shield entries; a line with no name is skipped")
    void copies() {
        ShieldList l = ShieldList.parse(List.of(
            "copy: hist;ticks=0;bins=31 a.B 1.0",
            "copy: pm;round=2.0x2.0;longest=20;least=1;lag=0 c.D",
            "copy: knn;k=3"));
        assertEquals("hist;ticks=0;bins=31", l.copyFor("a.B 1.0"));
        assertEquals("hist;ticks=0;bins=31", l.copyFor("a.B 1.1"), "a line carries over to a new version");
        assertEquals("pm;round=2.0x2.0;longest=20;least=1;lag=0", l.copyFor("c.D 7"));
        assertEquals(null, l.copyFor("e.F 1"));
        assertEquals(null, l.copyFor(null));
        assertEquals(null, ShieldList.NONE.copyFor("a.B 1.0"));
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

    @Test
    @Tag("MOVE-67")
    @DisplayName("aim-weight lines name opponents for the 1.0 aim weight, matched as shield entries, and add no shield entry")
    void aimWeights() {
        ShieldList l = ShieldList.parse(List.of("aim-weight: a.B 1.0", "pm-megas: c.D 1.0"));
        assertTrue(l.aimWeight("a.B 1.0"));
        assertTrue(l.aimWeight("a.B 1.1"), "a line carries over to a new version");
        assertFalse(l.aimWeight("c.D 1.0"), "another switch's line does not set it");
        assertFalse(l.patternMegas("a.B 1.0"), "nor does it set another switch");
        assertFalse(l.aimWeight(null));
        assertFalse(ShieldList.NONE.aimWeight("a.B 1.0"));
        assertEquals(0, l.size(), "no shield entry");
    }

    @Test
    @Tag("MOVE-71")
    @DisplayName("head-on-floor lines name opponents for the head-on floor, matched as shield entries, and add no shield entry")
    void headOnFloors() {
        ShieldList l = ShieldList.parse(List.of("head-on-floor: a.B 1.0", "aim-weight: c.D 1.0"));
        assertTrue(l.headOnFloor("a.B 1.0"));
        assertTrue(l.headOnFloor("a.B 1.1"), "a line carries over to a new version");
        assertFalse(l.headOnFloor("c.D 1.0"), "another switch's line does not set it");
        assertFalse(l.aimWeight("a.B 1.0"), "nor does it set another switch");
        assertFalse(l.headOnFloor(null));
        assertFalse(ShieldList.NONE.headOnFloor("a.B 1.0"));
        assertEquals(0, l.size(), "no shield entry");
    }

    @Test
    @Tag("GUN-12")
    @DisplayName("free-gun lines name opponents for the duel's free gun, matched as shield entries, and add no shield entry")
    void freeGuns() {
        ShieldList l = ShieldList.parse(List.of("free-gun: a.B 1.0", "head-on-floor: c.D 1.0"));
        assertTrue(l.freeGun("a.B 1.0"));
        assertTrue(l.freeGun("a.B 1.1"), "a line carries over to a new version");
        assertFalse(l.freeGun("c.D 1.0"), "another switch's line does not set it");
        assertFalse(l.headOnFloor("a.B 1.0"), "nor does it set another switch");
        assertFalse(l.freeGun(null));
        assertFalse(ShieldList.NONE.freeGun("a.B 1.0"));
        assertEquals(0, l.size(), "no shield entry");
    }
}
