package hadur2.core.ledger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.physics.Rules;
import net.jqwik.api.Assume;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;

/**
 * WAVE-1 and WAVE-2 over the whole input space: whatever mix of hits, refunds, collisions
 * and wall damage lands between two scans, the ledger recovers exactly the power the
 * enemy spent, and a scan with no shot never becomes one.
 */
class EnergyLedgerProperties {

    private static double power(int tenths) {
        return tenths / 10.0;
    }

    @Property
    @Tag("WAVE-1")
    void recoversTheShotUnderAnyMixOfEffects(
            @ForAll @IntRange(min = 1, max = 30) int shotTenths,
            @ForAll @IntRange(min = 0, max = 2) int ourHits,
            @ForAll @IntRange(min = 1, max = 30) int ourPowerTenths,
            @ForAll boolean theyHitUs,
            @ForAll @IntRange(min = 1, max = 30) int theirPowerTenths,
            @ForAll @DoubleRange(min = 20, max = 100) double energy) {
        EnergyLedger ledger = new EnergyLedger(800, 600);
        ledger.newRound();
        ledger.scan(energy, 8, 400, 300);
        double after = energy - power(shotTenths);
        for (int i = 0; i < ourHits; i++) {
            ledger.ourBulletHit(power(ourPowerTenths));
            after -= Rules.getBulletDamage(power(ourPowerTenths));
        }
        if (theyHitUs) {
            ledger.enemyBulletHitUs(power(theirPowerTenths));
            after += Rules.getBulletHitBonus(power(theirPowerTenths));
        }
        EnergyLedger.Reading r = ledger.scan(after, 8, 400, 300);
        assertTrue(r.shot());
        assertEquals(power(shotTenths), r.corrected(), 1e-9);
    }

    @Property
    @Tag("WAVE-2")
    void explainedDropsNeverBecomeWaves(
            @ForAll @IntRange(min = 0, max = 3) int ourHits,
            @ForAll @IntRange(min = 1, max = 30) int ourPowerTenths,
            @ForAll boolean collided,
            @ForAll @DoubleRange(min = -8, max = 8) double speedBefore,
            @ForAll boolean atWall,
            @ForAll @DoubleRange(min = 30, max = 100) double energy) {
        EnergyLedger ledger = new EnergyLedger(800, 600);
        ledger.newRound();
        double x = atWall ? 18 : 400;
        ledger.scan(energy, speedBefore, x, 300);
        double after = energy;
        for (int i = 0; i < ourHits; i++) {
            ledger.ourBulletHit(power(ourPowerTenths));
            after -= Rules.getBulletDamage(power(ourPowerTenths));
        }
        if (collided) {
            ledger.robotsCollided();
            after -= Rules.ROBOT_HIT_DAMAGE;
        }
        boolean wallHit = !collided && atWall && Math.abs(speedBefore) > Rules.DECELERATION;
        if (wallHit) after -= Rules.getWallHitDamage(speedBefore);
        Assume.that(after > 0);
        EnergyLedger.Reading r = ledger.scan(after, wallHit ? 0 : speedBefore, x, 300);
        assertFalse(r.shot(), () -> "phantom wave from " + r);
    }

    @Property
    @Tag("WAVE-1")
    void wallHitsAtAnyReachableImpactSpeedAreExplained(
            @ForAll @DoubleRange(min = -8, max = 8) double lastSeen,
            @ForAll @IntRange(min = -2, max = 1) int step,
            @ForAll @DoubleRange(min = 30, max = 100) double energy) {
        double impact = Math.min(Math.abs(lastSeen) + step, Rules.MAX_VELOCITY);
        Assume.that(impact > 0);
        EnergyLedger ledger = new EnergyLedger(800, 600);
        ledger.newRound();
        ledger.scan(energy, lastSeen, 782, 300);
        EnergyLedger.Reading r = ledger.scan(energy - Rules.getWallHitDamage(impact), 0, 782, 300);
        assertFalse(r.shot(), () -> "phantom wave from " + r);
    }

    @Property
    @Tag("WAVE-2")
    void onlyDropsInsideTheBulletRangeAreShots(@ForAll @DoubleRange(min = -5, max = 20) double drop) {
        boolean inRange = drop >= Rules.MIN_BULLET_POWER - 1e-6 && drop <= Rules.MAX_BULLET_POWER + 1e-6;
        assertEquals(inRange, EnergyLedger.isShot(drop));
    }

    @Property
    @Tag("WAVE-1")
    void ledgerRulesMatchTheEngine(@ForAll @DoubleRange(min = 0.1, max = 3.0) double p,
                                   @ForAll @DoubleRange(min = -8, max = 8) double v) {
        assertEquals(robocode.Rules.getBulletDamage(p), Rules.getBulletDamage(p), 1e-12);
        assertEquals(robocode.Rules.getBulletHitBonus(p), Rules.getBulletHitBonus(p), 1e-12);
        assertEquals(robocode.Rules.getWallHitDamage(v), Rules.getWallHitDamage(v), 1e-12);
        assertEquals(robocode.Rules.ROBOT_HIT_DAMAGE, Rules.ROBOT_HIT_DAMAGE, 1e-12);
    }
}
