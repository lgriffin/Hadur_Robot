package hadurling.core.ledger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** Written before the ledger: each test is a sentence of the rule the ledger has to keep. */
class EnergyLedgerTest {

    private static final double EPS = 1e-9;

    /** A ledger that has already seen the enemy at 100 energy, standing still. */
    private static EnergyLedger watching() {
        EnergyLedger ledger = new EnergyLedger();
        ledger.scan(100, 0);
        return ledger;
    }

    @Test
    @DisplayName("the first scan has nothing to compare with, so it is never a shot")
    void firstScan() {
        assertFalse(new EnergyLedger().scan(100, 0).shot());
    }

    @Test
    @Tag("HL-14")
    @DisplayName("a plain drop is a shot of that power")
    void plainDrop() {
        EnergyLedger.Reading r = watching().scan(98.5, 0);
        assertTrue(r.shot());
        assertEquals(1.5, r.corrected(), EPS);
        assertEquals(1.5, r.raw(), EPS);
    }

    @Test
    @Tag("HL-14")
    @DisplayName("a drop that is exactly our bullet's damage is not a shot")
    void ourHitExplainsTheDrop() {
        EnergyLedger ledger = watching();
        ledger.ourBulletHit(0.5); // damage 4 * 0.5 = 2
        EnergyLedger.Reading r = ledger.scan(98, 0);
        assertFalse(r.shot());
        assertEquals(0, r.corrected(), EPS);
    }

    @Test
    @Tag("HL-14")
    @DisplayName("a shot hidden inside a bigger drop is found once our hit is taken out")
    void shotPlusOurHit() {
        EnergyLedger ledger = watching();
        ledger.ourBulletHit(2.0); // damage 4 * 2 + 2 * (2 - 1) = 10
        EnergyLedger.Reading r = ledger.scan(100 - 10 - 1.5, 0);
        assertTrue(r.shot());
        assertEquals(1.5, r.corrected(), EPS);
        assertTrue(r.raw() > EnergyLedger.MAX_SHOT, "the raw drop alone is too big to be a shot");
    }

    @Test
    @Tag("HL-14")
    @DisplayName("when its bullet hits us the enemy gains 3 times the power, and its shot is still found")
    void refund() {
        EnergyLedger ledger = watching();
        ledger.enemyBulletHitUs(2.0); // +6
        EnergyLedger.Reading r = ledger.scan(100 - 2.0 + 6.0, 0);
        assertTrue(r.shot());
        assertEquals(2.0, r.corrected(), EPS);
        assertTrue(r.raw() < 0, "the enemy's energy went up, which looks like no shot at all");
    }

    @Test
    @Tag("HL-14")
    @DisplayName("stopping dead from full speed is a wall hit and costs speed / 2 - 1")
    void wallHit() {
        EnergyLedger ledger = new EnergyLedger();
        ledger.scan(100, 8);
        EnergyLedger.Reading r = ledger.scan(97, 0);
        assertEquals(3, r.wallDamage(), EPS);
        assertFalse(r.shot());
    }

    @Test
    @Tag("HL-14")
    @DisplayName("a shot in the same interval as a wall hit is still found")
    void wallHitAndShot() {
        EnergyLedger ledger = new EnergyLedger();
        ledger.scan(100, -8);
        EnergyLedger.Reading r = ledger.scan(100 - 3 - 1.5, 0);
        assertTrue(r.shot());
        assertEquals(1.5, r.corrected(), EPS);
    }

    @Test
    @DisplayName("braking normally is not a wall hit")
    void brakingIsNotAWall() {
        assertEquals(0, EnergyLedger.wallDamage(2, 0), 0);
        assertEquals(0, EnergyLedger.wallDamage(8, 6), 0);
        assertEquals(0, EnergyLedger.wallDamage(Double.NaN, 0), 0);
    }

    @Test
    @Tag("HL-15")
    @DisplayName("a corrected drop outside 0.1 to 3.0 is not a shot")
    void outOfRange() {
        assertFalse(watching().scan(99.95, 0).shot());
        assertFalse(watching().scan(96.5, 0).shot());
        assertFalse(watching().scan(100, 0).shot());
        assertFalse(watching().scan(103, 0).shot());
    }

    @Test
    @Tag("HL-15")
    @DisplayName("the limits themselves, 0.1 and 3.0, are shots")
    void limitsAreShots() {
        assertTrue(watching().scan(99.9, 0).shot());
        assertTrue(watching().scan(97.0, 0).shot());
    }

    @Test
    @DisplayName("hits are forgotten once the interval closes: they explain one drop only")
    void intervalsAreIndependent() {
        EnergyLedger ledger = watching();
        ledger.ourBulletHit(0.5);
        ledger.scan(98, 0);
        EnergyLedger.Reading next = ledger.scan(96, 0);
        assertTrue(next.shot());
        assertEquals(2, next.corrected(), EPS);
    }
}
