package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.field;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MGUN-24: the field gun leans toward the opponents that keep finishing high this battle. */
class FieldGunStrongTest {

    private final FieldGun gun = new FieldGun(field(1000, 1000));

    @Test
    @Tag("MGUN-24")
    @DisplayName("MGUN-24 ships off")
    void shipsOff() {
        assertEquals(0.0, FieldGun.STRONG_BOOST);
    }

    @Test
    @Tag("MGUN-24")
    @DisplayName("MGUN-24: strength is 1 for a robot always last alive, 0 for one always first to die, from two placed rounds")
    void strengthFromPlaces() {
        gun.placed("top", 1, 9);
        gun.placed("low", 9, 9);
        gun.placed("mid", 5, 9);
        assertEquals(0, gun.strength("top"), 1e-9, "one round is not enough");
        gun.placed("top", 1, 9);
        gun.placed("low", 9, 9);
        gun.placed("mid", 5, 9);
        assertEquals(1, gun.strength("top"), 1e-9);
        assertEquals(0, gun.strength("low"), 1e-9);
        assertEquals(0.5, gun.strength("mid"), 1e-9);
        assertEquals(0, gun.strength("unseen"), 1e-9);
    }

    @Test
    @Tag("MGUN-24")
    @DisplayName("MGUN-24: an unplaced round and a battle of one opponent are ignored, and places persist across rounds")
    void ignoresUnplaced() {
        gun.placed("a", 0, 9);
        gun.placed("a", 3, 1);
        gun.placed("a", 1, 9);
        gun.newRound();
        gun.placed("a", 9, 9);
        assertEquals(0.5, gun.strength("a"), 1e-9);
    }
}
