package hadur117.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.duel.HandOffDesign;
import hadur117.core.model.BattleFacts;
import hadur117.core.model.BotEvent;
import hadur117.core.model.BotInput;
import hadur117.core.role.Posture;
import hadur117.core.shieldmode.ShieldList;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * HAND-1 to HAND-3: what the duel plays in a melee's endgame, set at the hand-off from the 1v1
 * mode table and the melee's verdict on the survivor's gun, off a team only; all shipped off.
 */
class HandOffSwitchesCoreTest {

    static final String A = "pkg.Alpha 1.0";
    static final String B = "pkg.Beta 2.0";
    static final String C = "pkg.Gamma 3.0";

    private final List<String> telemetry = new ArrayList<>();

    /** Hadur stands still at (500, 500) with a cool gun. */
    private static BotInput input(long time, int others, List<BotEvent> events) {
        return new BotInput(time, 0, 500, 500, 0, 0, 100, 0, 0.1, 0, 0, 0, others, events);
    }

    /** A still opponent at {@code bearing}, 400 px away. A at bearing 0 stands at (500, 900). */
    private static BotEvent.Scan scan(String name, double bearing) {
        return new BotEvent.Scan(name, bearing, 400, 100, 0, 0);
    }

    /**
     * Ticks 1 to 29 of melee against A, B and C; from tick 26 A's bullets hit Hadur on three
     * ticks at {@code aimOffset} radians from head-on (0 is a head-on gun, 0.3 a leading one;
     * NaN for no hits). At tick 30 B and C die and A is scanned by the duel.
     */
    private HadurCore meleeToDuel(ShieldList list, boolean table, boolean dodge, boolean shield,
                                  double aimOffset, boolean onTeam) {
        HadurCore core = new HadurCore(BattleFacts.solo(1000, 1000, 3), telemetry::add, null, null, list);
        core.duel().handOffSwitches(table, dodge, shield);
        core.duel().team(onTeam);
        core.prepareMemory();
        core.newRound(0);
        for (long t = 1; t < 30; t++) {
            List<BotEvent> events = new ArrayList<>(List.of(scan(A, 0), scan(B, 2), scan(C, 4)));
            // A bullet from A (north of Hadur) flies south: heading pi is straight at where Hadur stood.
            if (!Double.isNaN(aimOffset) && t >= 26 && t <= 28) {
                events.add(new BotEvent.HitByBullet(A, 1.0, 500, 520, Math.PI + aimOffset));
            }
            core.tick(input(t, 3, events));
            assertEquals(Posture.MELEE, core.posture());
        }
        core.tick(input(30, 1, List.of(new BotEvent.RobotDeath(B), new BotEvent.RobotDeath(C), scan(A, 0))));
        assertEquals(Posture.DUEL, core.posture());
        return core;
    }

    private boolean has(String prefix) {
        return telemetry.stream().anyMatch(l -> l.startsWith(prefix));
    }

    private static ShieldList listNamingA() {
        return ShieldList.parse(List.of("pkg.Alpha", ShieldList.STOP_GO_PREFIX + " pkg.Alpha"));
    }

    @Test
    @Tag("HAND-1")
    @Tag("HAND-2")
    @Tag("HAND-3")
    @DisplayName("HAND-1 to HAND-3 ship off: a melee's endgame plays the plain duel, its table entries and shield unread")
    void shipOff() {
        assertFalse(HandOffDesign.ENDGAME_TABLE);
        assertFalse(HandOffDesign.ENDGAME_LEARNED_DODGE);
        assertFalse(HandOffDesign.ENDGAME_LEARNED_SHIELD);
        HadurCore core = meleeToDuel(listNamingA(), false, false, false, 0, false);
        assertEquals("-", core.duel().endgameSetting());
        assertFalse(has("P,0,30,endgame"), telemetry.toString());
        assertFalse(has("SH,"), telemetry.toString());
        assertTrue(has("H,0,30," + A), "the hand-off itself still happens");
    }

    @Test
    @Tag("HAND-1")
    @DisplayName("HAND-1: the survivor's table entries apply at the hand-off: shield mode opens on its scan, stop-and-go is on")
    void tableApplies() {
        HadurCore core = meleeToDuel(listNamingA(), true, false, false, Double.NaN, false);
        assertEquals("shield+stopgo", core.duel().endgameSetting());
        assertTrue(has("P,0,30,endgame,-,-,shield+stopgo"), telemetry.toString());
        assertTrue(has("SH,0,30,on"), telemetry.toString());
    }

    @Test
    @Tag("HAND-1")
    @DisplayName("HAND-1: a survivor the table does not name plays plain")
    void tableUnlisted() {
        HadurCore core = meleeToDuel(ShieldList.parse(List.of("other.Bot")), true, false, false, Double.NaN, false);
        assertEquals("plain", core.duel().endgameSetting());
        assertFalse(has("SH,"), telemetry.toString());
    }

    @Test
    @Tag("HAND-2")
    @DisplayName("HAND-2: three head-on hits this battle turn the dodge planner on against the survivor; leading hits do not")
    void learnedDodge() {
        HadurCore core = meleeToDuel(ShieldList.NONE, false, true, false, 0, false);
        assertEquals("learned-dodge", core.duel().endgameSetting());
        telemetry.clear();
        core = meleeToDuel(ShieldList.NONE, false, true, false, 0.3, false);
        assertEquals("plain", core.duel().endgameSetting());
        telemetry.clear();
        core = meleeToDuel(ShieldList.NONE, false, true, false, Double.NaN, false);
        assertEquals("plain", core.duel().endgameSetting(), "no hits: no verdict");
    }

    @Test
    @Tag("HAND-3")
    @DisplayName("HAND-3: a head-on verdict starts shield mode on trial against an unlisted survivor")
    void learnedShield() {
        HadurCore core = meleeToDuel(ShieldList.NONE, false, false, true, 0, false);
        assertEquals("learned-shield", core.duel().endgameSetting());
        assertTrue(has("SH,0,30,on"), telemetry.toString());
        telemetry.clear();
        core = meleeToDuel(ShieldList.NONE, false, false, true, 0.3, false);
        assertEquals("plain", core.duel().endgameSetting());
        assertFalse(has("SH,"), telemetry.toString());
    }

    @Test
    @Tag("HAND-1")
    @Tag("HAND-3")
    @DisplayName("HAND-1 before HAND-3: a listed survivor's shield is the list's, not a trial; the two together name both dodges once")
    void tableBeforeLearned() {
        HadurCore core = meleeToDuel(listNamingA(), true, true, true, 0, false);
        assertEquals("shield+stopgo+learned-dodge", core.duel().endgameSetting());
    }

    @Test
    @Tag("HAND-1")
    @Tag("HAND-2")
    @Tag("HAND-3")
    @DisplayName("on a team none of the switches acts")
    void teamNeverActs() {
        HadurCore core = meleeToDuel(listNamingA(), true, true, true, 0, true);
        assertEquals("-", core.duel().endgameSetting());
        assertFalse(has("SH,"), telemetry.toString());
        assertFalse(has("P,0,30,endgame"), telemetry.toString());
    }
}
