package hadur2.core.shield;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** SHIELD-2's hold of the settled aim, and SHIELD-7's exception for a mirror aim. */
class AimHoldTest {

    @Test
    @Tag("SHIELD-2")
    @DisplayName("SHIELD-2: against a shielder the gun holds an aim without the offset, and fires one with it")
    void shielderHoldsTheSettledAim() {
        assertTrue(AimJitter.holdsShot(true, false, false));
        assertFalse(AimJitter.holdsShot(true, true, false));
    }

    @Test
    @Tag("SHIELD-2")
    @DisplayName("SHIELD-2: with no shielder found nothing is held")
    void noShielderHoldsNothing() {
        assertFalse(AimJitter.holdsShot(false, false, false));
        assertFalse(AimJitter.holdsShot(false, false, true));
    }

    @Test
    @Tag("SHIELD-7")
    @DisplayName("SHIELD-7: a mirror aim is fired against a shielder, so a latched verdict never silences the gun")
    void mirrorAimIsNeverHeld() {
        assertFalse(AimJitter.holdsShot(true, false, true));
    }
}
