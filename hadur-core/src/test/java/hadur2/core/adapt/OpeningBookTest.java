package hadur2.core.adapt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.OpponentProfile;
import hadur2.core.memory.Profiles;
import hadur2.core.memory.Tiers;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/** The opening book: tiers in, one opening out. */
class OpeningBookTest {

    static OpponentProfile known(double theirRate, double main, double antiSurfer) {
        return Profiles.tiers(Profiles.sample("abc.Shadow 3.83c", 9, 0, 0), theirRate, main, antiSurfer);
    }

    @ParameterizedTest(name = "main {0}, anti-surfer {1}: {2}")
    @CsvSource({"0.12,0.20,ANTI_SURFER", "0.05,0.04,ANTI_SURFER", "0.30,0.20,MAIN", "0.20,0.19,MAIN"})
    @Tag("ADAPT-1")
    @DisplayName("M2 and M3 open on the anti-surfer gun, M0 and M1 on the main gun")
    void gunFromMovementTier(double main, double antiSurfer, Opening.Gun expected) {
        assertEquals(expected, OpeningBook.read(known(0.05, main, antiSurfer)).gun());
    }

    @Test
    @Tag("ADAPT-2")
    @DisplayName("T3 turns the flattener on from the first wave and hands the surf the profile's rate")
    void flattenerFromGunTier() {
        Opening o = OpeningBook.read(known(0.09, 0.2, 0.19));
        assertEquals(Tiers.Gun.T3, o.gunTier());
        assertTrue(o.flattenerFirst());
        assertEquals(0.09, o.surfPrior().value(), 1e-6);
        assertTrue(o.surfPrior().margin() < Tiers.MAX_MARGIN);
        for (double rate : new double[] {0.01, 0.03, 0.05}) {
            Opening lower = OpeningBook.read(known(rate, 0.2, 0.19));
            assertFalse(lower.flattenerFirst(), "tier " + lower.gunTier());
            assertEquals(rate, lower.surfPrior().value(), 1e-6, "a known tier still hands over its rate");
        }
    }

    @Test
    @Tag("DIAL-1")
    @DisplayName("a profile too thin to name a tier opens as a stranger would")
    void thinProfileIsConservative() {
        Opening o = OpeningBook.read(Profiles.sample("abc.Shadow 3.83c", 9, 0, 0));
        assertEquals(Tiers.Gun.UNKNOWN, o.gunTier());
        assertEquals(Tiers.Move.UNKNOWN, o.moveTier());
        assertEquals(Opening.Gun.LIVE, o.gun());
        assertFalse(o.flattenerFirst());
        assertTrue(Double.isNaN(o.surfPrior().value()), "no prior for the surf");
        assertSame(Opening.STRANGER, OpeningBook.read(null));
    }

    @Test
    @Tag("ADAPT-3")
    @DisplayName("seeds replay what was stored, at half a live sample's weight")
    void seedsReplayed() {
        OpponentProfile p = known(0.09, 0.2, 0.19);
        p.addGunSample(hadur2.core.memory.Seeds.gun(Profiles.gunSample(0.4, 2.5, -1)));
        p.addSurfSample(hadur2.core.memory.Seeds.surf(Profiles.surfSample(-0.3)));
        Opening o = OpeningBook.read(p);
        assertEquals(1, o.gunSeed().size());
        assertEquals(0.4, o.gunSeed().get(0)[10], 1e-4);
        assertEquals(2.5, o.gunSeed().get(0)[11], 1e-3);
        assertEquals(-0.3, o.surfSeed().get(0)[12], 1e-4);
        assertTrue(o.seedWeight() > 0 && o.seedWeight() < 1, "lower than a live sample's 1");
    }

    @Test
    @Tag("DIAL-2")
    @DisplayName("the book reads only the profile: no tick, round or clock goes in")
    void bookTakesNoTime() {
        for (Method m : OpeningBook.class.getDeclaredMethods()) {
            if (!Modifier.isPublic(m.getModifiers())) continue;
            for (Class<?> t : m.getParameterTypes()) {
                assertEquals(OpponentProfile.class, t, m + " takes only a profile");
            }
        }
        OpponentProfile p = known(0.09, 0.12, 0.2);
        Opening a = OpeningBook.read(p);
        Opening b = OpeningBook.read(p);
        assertEquals(a.gun(), b.gun());
        assertEquals(a.gunTier(), b.gunTier());
        assertEquals(a.surfPrior().value(), b.surfPrior().value());
    }
}
