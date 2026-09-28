package hadur2.core.gun;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.physics.BattleField;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * GUN-1 (decayed live ratings, margin-gated switching) and GUN-4 (the third, hybrid gun's
 * gate and three-way choice), driven through {@link GunController#recordVirtualShotForTest}
 * rather than real wave geometry (see that method's javadoc).
 */
class GunControllerTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final String BOT = "abc.Shadow 3.83c";

    static GunController controller() {
        return new GunController(FIELD, 1);
    }

    @Test
    @Tag("GUN-1")
    @DisplayName("with too few shots, or too close a gap, the live verdict stays null (DIAL-1)")
    void tooCloseStaysNull() {
        GunController g = controller();
        for (int i = 0; i < 3; i++) {
            g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 1.0);
            g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 0.9);
        }
        assertNull(g.liveVerdict(BOT), "three shots each is nowhere near enough to be certain");
    }

    @Test
    @Tag("GUN-1")
    @DisplayName("once one gun clearly outhits the other beyond the margin, the verdict names it")
    void clearLeadIsNamed() {
        GunController g = controller();
        for (int i = 0; i < 200; i++) {
            g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 0.0);
            g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 1.0);
        }
        assertEquals(GunController.Opening.ANTI_SURFER, g.liveVerdict(BOT));
    }

    @Test
    @Tag("GUN-1")
    @DisplayName("GUN-1: a 100-shot half-life lets a movement change mid-battle flip the choice again")
    void decayLetsTheChoiceFlipBack() {
        GunController g = controller();
        // The anti-surfer gun wins the opening exchange...
        for (int i = 0; i < 300; i++) {
            g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 0.0);
            g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 1.0);
        }
        assertEquals(GunController.Opening.ANTI_SURFER, g.liveVerdict(BOT));
        // ...but the target changes its movement, and the main gun starts hitting instead.
        // A flat lifetime average could never recover from 300 shots of the opposite verdict
        // within a further few hundred; the 100-shot half-life does.
        for (int i = 0; i < 600; i++) {
            g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 1.0);
            g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 0.0);
        }
        assertEquals(GunController.Opening.MAIN, g.liveVerdict(BOT),
            "600 recent shots at a 100-shot half-life should outweigh 300 old ones");
    }

    @Test
    @Tag("GUN-1")
    @DisplayName("virtualGunScores (what folds into the profile) keeps the undecayed lifetime totals")
    void virtualGunScoresStayUndecayed() {
        GunController g = controller();
        for (int i = 0; i < 250; i++) {
            g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 1.0);
        }
        double[] scores = g.virtualGunScores(BOT);
        assertEquals(250.0, scores[0], 1e-9, "main-gun waves: a plain count, not decayed");
        assertEquals(250.0, scores[1], 1e-9, "main-gun weighted hits: a plain sum, not decayed");
    }

    @Test
    @Tag("GUN-4")
    @DisplayName("the hybrid gun never joins the comparison while its gate is closed")
    void hybridStaysOutWhileGateClosed() {
        GunController g = controller();
        // Main and anti-surfer both rate well (M0 territory: no M2/M3, no anti-surfer lead
        // beyond margin either), so the gate stays closed even though the hybrid gun, if it
        // could join, would win outright.
        for (int i = 0; i < 300; i++) {
            g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 1.0);
            g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 1.0);
            g.recordVirtualShotForTest(BOT, GunController.Opening.HYBRID, 5.0);
        }
        assertTrue(g.liveVerdict(BOT) != GunController.Opening.HYBRID,
            "a high main-gun rating (M0) keeps GUN-4's gate closed");
    }

    @Test
    @Tag("GUN-4")
    @DisplayName("once the movement tier reads M3 (both guns miss), the hybrid gun can win the verdict")
    void hybridWinsOnceGateOpensAndItRatesHighest() {
        GunController g = controller();
        // Neither main nor anti-surfer can find the target (M3): both certainly under 10%.
        // Enough shots to reach the decayed stats' steady state (past 300, the margin is
        // still shrinking toward it; the gate needs it under 3 points).
        for (int i = 0; i < 2000; i++) {
            g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 0.02);
            g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 0.02);
            g.recordVirtualShotForTest(BOT, GunController.Opening.HYBRID, 1.0);
        }
        assertEquals(GunController.Opening.HYBRID, g.liveVerdict(BOT),
            "the gate is open (M3) and the hybrid gun clearly rates highest");
    }

    @Test
    @Tag("GUN-4")
    @DisplayName("the gate also opens when the plain main-vs-anti-surfer verdict already favours a switch")
    void hybridGateOpensOnAPlainLiveSwitch() {
        GunController g = controller();
        // Main gun weak (but not M3-weak), anti-surfer clearly ahead: not M0, and the
        // anti-surfer lead alone is GUN-4's other gate condition.
        for (int i = 0; i < 300; i++) {
            g.recordVirtualShotForTest(BOT, GunController.Opening.MAIN, 0.05);
            g.recordVirtualShotForTest(BOT, GunController.Opening.ANTI_SURFER, 0.6);
            g.recordVirtualShotForTest(BOT, GunController.Opening.HYBRID, 1.0);
        }
        assertEquals(GunController.Opening.HYBRID, g.liveVerdict(BOT));
    }
}
