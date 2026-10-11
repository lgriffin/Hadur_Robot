package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** SHIELD-4's power and END-4's hold, as pure functions. */
class LastShotTest {

    @Test
    @Tag("SHIELD-4")
    @DisplayName("SHIELD-4: a shielder that has not moved in 10 ticks is shot at 3.0, whatever was chosen")
    void stillShielderGetsFullPower() {
        assertEquals(3.0, PowerPolicy.shieldPower(true, true, 0.1, 100));
        assertEquals(3.0, PowerPolicy.shieldPower(true, true, 1.95, 100));
        assertEquals(3.0, PowerPolicy.shieldPower(true, true, 3.0, 100));
    }

    @Test
    @Tag("SHIELD-4")
    @DisplayName("SHIELD-4: no shielder, or one that moved lately, leaves the power as chosen")
    void otherwiseUntouched() {
        assertEquals(0.1, PowerPolicy.shieldPower(false, true, 0.1, 100));
        assertEquals(1.95, PowerPolicy.shieldPower(true, false, 1.95, 100));
        assertEquals(1.95, PowerPolicy.shieldPower(false, false, 1.95, 100));
    }

    @Test
    @Tag("SHIELD-4")
    @DisplayName("SHIELD-4: at 12 energy or less the shot stays as chosen, so a shielder cannot drain us")
    void lowEnergyKeepsThePower() {
        assertEquals(0.5, PowerPolicy.shieldPower(true, true, 0.5, PowerPolicy.MIN_OUR_ENERGY));
        assertEquals(0.5, PowerPolicy.shieldPower(true, true, 0.5, 4));
        assertEquals(3.0, PowerPolicy.shieldPower(true, true, 0.5, PowerPolicy.MIN_OUR_ENERGY + 0.1));
    }

    @Test
    @Tag("END-4")
    @DisplayName("END-4: shield mode's shots are held by the same rule, at the power that would leave")
    void holdsOtherShots() {
        // Shield mode keeps 1 of its energy: 1.3 energy fires 0.3; the enemy (0.1 left, fired 0.15 at least) is 1.2 behind.
        assertFalse(PowerPolicy.holdsShotAt(1.3, 3.0, 1, 0.1, 0.15), "0.3 off 1.3 leaves 0.9 above");
        assertTrue(PowerPolicy.holdsShotAt(0.45, 3.0, 0.1, 0.1, 0.15), "0.35 of 0.45 leaves nothing above");
        assertFalse(PowerPolicy.holdsShotAt(0.45, 3.0, 0.1, 0.1, Double.NaN), "no shot seen from them: not held");
        assertFalse(PowerPolicy.holdsShotAt(0.45, 3.0, 0.1, 0.5, 0.15), "they can still fire");
        assertFalse(PowerPolicy.holdsShotAt(1.05, 3.0, 1, 0.1, 0.15), "nothing payable leaves: nothing to hold");
    }

    @Test
    @Tag("SHIELD-4")
    @DisplayName("SHIELD-4: END-3 still caps the 3.0 to the least power that kills")
    void endThreeCapsIt() {
        double chosen = PowerPolicy.shieldPower(true, true, 0.1, 100);
        double kill = PowerPolicy.leastPowerThatKills(10);
        assertTrue(kill < chosen);
        assertEquals(kill, Math.min(chosen, kill));
    }

    @Test
    @Tag("END-4")
    @DisplayName("END-4: with the enemy unable to fire, a shot that would leave us under 0.3 ahead is held")
    void holdsTheLastShot() {
        // The enemy has fired 0.15 at the least and has 0.1 left; we have 0.5, a 0.1 shot leaves 0.3 above.
        assertFalse(PowerPolicy.holdsLastShot(0.51, 0.1, 0.1, 0.15), "0.31 above is not less than 0.3");
        assertTrue(PowerPolicy.holdsLastShot(0.49, 0.1, 0.1, 0.15));
        assertTrue(PowerPolicy.holdsLastShot(0.35, 0.3, 0.05, 0.15));
        assertFalse(PowerPolicy.holdsLastShot(5, 0.1, 0.1, 0.15), "plenty to spare");
    }

    @Test
    @Tag("END-4")
    @DisplayName("END-4: nothing is held while the enemy can still fire, or has not been seen to fire")
    void notWhileTheEnemyCanFire() {
        assertFalse(PowerPolicy.holdsLastShot(0.5, 0.1, 0.15, 0.15), "its energy equals the smallest bullet it fired");
        assertFalse(PowerPolicy.holdsLastShot(0.5, 0.1, 2, 0.15));
        assertFalse(PowerPolicy.holdsLastShot(0.5, 0.1, 0.1, Double.NaN), "no shot seen yet");
    }

    @Test
    @Tag("END-4")
    @DisplayName("END-4: when level or behind there is no lead to keep, so the shot goes")
    void noLeadNoHold() {
        assertFalse(PowerPolicy.holdsLastShot(0.1, 0.1, 0.1, 0.15), "level");
        assertFalse(PowerPolicy.holdsLastShot(0.1, 0.1, 0.12, 0.15), "behind");
    }
}
