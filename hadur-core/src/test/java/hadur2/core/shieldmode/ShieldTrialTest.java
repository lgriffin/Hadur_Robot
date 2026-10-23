package hadur2.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * SHIELD-15: Ogi's shield trial. With the trial switch on, an unlisted duel opponent starts in
 * shield mode and leaves it for the battle once the shield fails the trial; a listed opponent
 * plays as without the switch. The opponent stands still 400 px north of us.
 */
class ShieldTrialTest {

    private static final double MY_X = 400, MY_Y = 100, ENEMY_X = 400, ENEMY_Y = 500;
    private static final String LISTED = "list.Target 1.0";
    private static final String UNLISTED = "other.Robot 1.0";

    private final List<String> records = new ArrayList<>();

    private ShieldMode mode(String design) {
        return new ShieldMode(ShieldList.parse(List.of("list.Target")), records::add, 35,
            ShieldDesign.parse(design));
    }

    private static void scan(ShieldMode m, String name, long time) {
        m.onScan(name, time, MY_X, MY_Y, 0, 0, ENEMY_X, ENEMY_Y, Math.PI, 0);
    }

    // ---- the rule

    @Test
    @Tag("SHIELD-15")
    @DisplayName("the trial switch parses, stays out of 'all' and off the shipped design")
    void parses() {
        ShieldDesign d = ShieldDesign.parse("wall,trial");
        assertTrue(d.trial && d.wall);
        assertEquals("wall,trial", d.toString());
        assertFalse(ShieldDesign.parse("all").trial);
        assertFalse(ShieldDesign.SHIPPED.trial);
        assertFalse(ShieldDesign.NONE.trial);
    }

    @Test
    @Tag("SHIELD-15")
    @DisplayName("damage over 35 plus 0.25 a shot fails the trial")
    void damageFails() {
        assertFalse(ShieldDesign.trialFails(35, 0, 0, 0, 3));
        assertTrue(ShieldDesign.trialFails(35.1, 0, 0, 0, 3));
        assertFalse(ShieldDesign.trialFails(39.9, 20, 0, 15, 3), "20 shots allow 40");
        assertTrue(ShieldDesign.trialFails(40.1, 20, 0, 15, 3));
    }

    @Test
    @Tag("SHIELD-15")
    @DisplayName("two lost rounds fail the trial")
    void lostRoundsFail() {
        assertFalse(ShieldDesign.trialFails(0, 0, 1, 0, 0));
        assertTrue(ShieldDesign.trialFails(0, 0, 2, 0, 0));
    }

    @Test
    @Tag("SHIELD-15")
    @DisplayName("of 20 ended bullets, under half shot down fails; half or more goes on")
    void downShare() {
        assertFalse(ShieldDesign.trialFails(0, 100, 0, 9, 10), "19 ended is too few to judge");
        assertTrue(ShieldDesign.trialFails(0, 100, 0, 9, 11));
        assertFalse(ShieldDesign.trialFails(0, 100, 0, 10, 10));
    }

    @Test
    @Tag("SHIELD-15")
    @DisplayName("six hits with none shot down fail; one shot down saves it")
    void blankHits() {
        assertFalse(ShieldDesign.trialFails(0, 100, 0, 0, 5));
        assertTrue(ShieldDesign.trialFails(0, 100, 0, 0, 6));
        assertFalse(ShieldDesign.trialFails(0, 100, 0, 1, 6));
    }

    // ---- the mode

    @Test
    @Tag("SHIELD-15")
    @DisplayName("without the switch an unlisted opponent never starts shield mode")
    void offByDefault() {
        ShieldMode m = mode("");
        scan(m, UNLISTED, 1);
        assertFalse(m.listed());
        assertFalse(m.onTrial());
    }

    @Test
    @Tag("SHIELD-15")
    @DisplayName("with it, an unlisted opponent starts shield mode on trial; a listed one is not on trial")
    void unlistedStartsOnTrial() {
        ShieldMode m = mode("trial");
        scan(m, UNLISTED, 1);
        assertTrue(m.listed());
        assertTrue(m.onTrial());
        assertTrue(m.active());
        ShieldMode l = mode("trial");
        scan(l, LISTED, 1);
        assertTrue(l.listed());
        assertFalse(l.onTrial());
    }

    @Test
    @Tag("SHIELD-15")
    @DisplayName("six hits with nothing shot down end shield mode for the battle")
    void blankHitsEndTheBattle() {
        ShieldMode m = mode("trial");
        scan(m, UNLISTED, 1);
        for (int i = 0; i < 5; i++) m.onHitByBullet(30 + 20 * i, 0.5, MY_X, MY_Y, Math.PI);
        assertFalse(m.battleOff());
        m.onHitByBullet(200, 0.5, MY_X, MY_Y, Math.PI);
        assertTrue(m.battleOff());
        assertEquals("SH,0,200,off,trial", records.get(records.size() - 1));
        m.newRound(1);
        scan(m, UNLISTED, 1);
        assertFalse(m.active(), "off for the rest of the battle");
    }

    @Test
    @Tag("SHIELD-15")
    @DisplayName("the same hits against a listed opponent leave the trial out")
    void listedIgnoresTrial() {
        ShieldMode m = mode("trial");
        scan(m, LISTED, 1);
        for (int i = 0; i < 6; i++) m.onHitByBullet(30 + 20 * i, 0.5, MY_X, MY_Y, Math.PI);
        assertFalse(m.battleOff());
    }

    @Test
    @Tag("SHIELD-15")
    @DisplayName("two rounds lost on trial end it; won rounds do not count")
    void lostRoundsEndIt() {
        ShieldMode m = mode("trial");
        scan(m, UNLISTED, 1);
        m.onRoundEnded(500, true);
        m.newRound(1);
        scan(m, UNLISTED, 1);
        m.onRoundEnded(500, false);
        assertFalse(m.battleOff());
        m.newRound(2);
        scan(m, UNLISTED, 1);
        m.onRoundEnded(500, false);
        assertTrue(m.battleOff());
    }

    @Test
    @Tag("SHIELD-15")
    @DisplayName("being rammed ends the trial for the battle")
    void rammedEndsIt() {
        ShieldMode m = mode("trial,stay");
        scan(m, UNLISTED, 1);
        m.onRammed();
        assertTrue(m.battleOff());
        assertEquals("SH,0,1,off,trial-rammed", records.get(records.size() - 1));
    }
}
