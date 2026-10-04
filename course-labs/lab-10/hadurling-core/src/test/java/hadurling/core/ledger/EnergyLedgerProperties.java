package hadurling.core.ledger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadurling.core.physics.Rules;
import java.util.List;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Combinators;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;

/**
 * The strongest test of the ledger: build a battle where we <em>know</em> what happened, mix
 * every cause of an energy change in any combination, and require the ledger to recover the
 * power of each shot exactly (up to floating-point noise).
 *
 * <p>An {@link Interval} is the truth about the time between two scans: whether the enemy
 * fired and with what power, which of our bullets hit it, which of its bullets hit us, and
 * whether it hit a wall. {@link #play} turns a list of them into the calls the core would
 * make.</p>
 */
@Tag("HL-14")
class EnergyLedgerProperties {

    /** What happened between two scans. */
    record Interval(double shot, List<Double> ourHits, List<Double> theirHits, boolean wall, double speed) {
        /** The change in the enemy's energy, given the wall damage that really happened. */
        double energyChange(double wallDamage) {
            double change = -shot;
            for (double p : ourHits) change -= Rules.bulletDamage(p);
            for (double p : theirHits) change += 3 * p;
            return change - wallDamage;
        }
    }

    @Provide
    Arbitrary<Double> power() {
        return Arbitraries.doubles().between(0.1, 3.0);
    }

    /** About a third of intervals have no shot at all: 0 stands for "did not fire". */
    @Provide
    Arbitrary<Double> shotOrNone() {
        return Arbitraries.frequencyOf(
            net.jqwik.api.Tuple.of(1, Arbitraries.just(0.0)),
            net.jqwik.api.Tuple.of(2, power()));
    }

    @Provide
    Arbitrary<Interval> intervals() {
        return Combinators.combine(
                shotOrNone(),
                power().list().ofMaxSize(2),
                power().list().ofMaxSize(2),
                Arbitraries.of(true, false),
                Arbitraries.doubles().between(2.5, 8.0))
            .as(Interval::new);
    }

    /** A run of up to 25 intervals: the ledger has to carry its state from one to the next. */
    @Provide
    Arbitrary<List<Interval>> battles() {
        return intervals().list().ofMaxSize(25);
    }

    @Property
    void recoversEveryShotFromAnyMixOfEvents(@ForAll("battles") List<Interval> battle) {
        EnergyLedger ledger = new EnergyLedger();
        // A big start keeps the energy positive through any run of hits; the ledger does not care.
        double energy = 10_000;
        double speed = 5;
        ledger.scan(energy, speed);
        for (Interval i : battle) {
            for (double p : i.ourHits()) ledger.ourBulletHit(p);
            for (double p : i.theirHits()) ledger.enemyBulletHitUs(p);
            // A wall hit needs a robot going faster than it can brake: it was going `speed` at
            // the last scan and is now stopped. Otherwise it simply goes on at some speed.
            boolean wall = i.wall() && Math.abs(speed) > 2;
            double wallDamage = wall ? Math.abs(speed) / 2 - 1 : 0;
            energy += i.energyChange(wallDamage);
            speed = wall ? 0 : i.speed();
            EnergyLedger.Reading r = ledger.scan(energy, speed);
            if (i.shot() > 0) {
                assertTrue(r.shot(), "missed a shot of " + i.shot() + " in " + i);
                assertEquals(i.shot(), r.corrected(), 1e-9, "wrong power in " + i);
            } else {
                assertFalse(r.shot(), "invented a shot in " + i + ": " + r);
                assertEquals(0, r.corrected(), 1e-9);
            }
        }
    }

    @Property
    void aWallHitIsOnlyInferredFromAStop(@ForAll("intervals") Interval i) {
        // Without a wall the enemy keeps its speed, so the ledger infers no wall damage.
        EnergyLedger ledger = new EnergyLedger();
        ledger.scan(100, i.speed());
        EnergyLedger.Reading r = ledger.scan(100, i.speed());
        assertEquals(0, r.wallDamage(), 0);
    }
}
