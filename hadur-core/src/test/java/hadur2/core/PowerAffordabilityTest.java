package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.port.Telemetry;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * END-3 and RAM-1 must never make an otherwise fireable shot unaffordable: a bug found by
 * review on PR #61 had each override replace the gun's chosen power outright, so a low-energy
 * robot that could have fired its own small choice fired nothing at all.
 */
class PowerAffordabilityTest {

    private static BotInput input(long time, double energy, double gunTurnRemaining,
                                  BotEvent... events) {
        return new BotInput(time, 0, 400, 300, 0, 0, energy, 0, 0.1, 0, gunTurnRemaining, 0, 1,
            List.of(events));
    }

    private static BotEvent.Scan scan(double bearing, double distance, double energy,
                                      double heading, double velocity) {
        return new BotEvent.Scan("enemy", bearing, distance, energy, heading, velocity);
    }

    @Test
    @Tag("END-3")
    @DisplayName("END-3 only lowers the gun's power, never raises it past what we can afford")
    void killPowerNeverMakesAnAffordableShotUnaffordable() {
        // distance 400, our energy 1, enemy energy 5: the gun's own choice (a fraction of
        // 0.1, per calculate1v1BulletPower's low-energy power-down) is well within our 1
        // energy; the unguarded least-power-that-kills (about 1.17) would not have been.
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE);
        core.newRound(0);
        // The core fires the tick before's aimed shot (aimAndFire's javadoc), so the first
        // scan only sets it up; the same reading repeated is what actually fires.
        core.tick(input(1, 1, 0.0005, scan(0.2, 400, 5, 0, 0)));
        BotOrders o = core.tick(input(2, 1, 0.0005, scan(0.2, 400, 5, 0, 0)));
        assertTrue(o.firePower() > 0, "a shot the gun could already afford must still fire");
    }

    @Test
    @Tag("RAM-1")
    @DisplayName("RAM-1's full power never applies below the energy floor the other full-power rules share")
    void rammerResponseNeverMakesAnAffordableShotUnaffordable() {
        // Ten scans of an enemy closing at 8 px/tick, well within range, activate RAM-1; at
        // 2.5 energy (below PowerPolicy.MIN_OUR_ENERGY) the response must not force power
        // 3.0, which we could not afford, over the gun's own smaller, fireable choice.
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE);
        core.newRound(0);
        BotOrders last = null;
        for (int t = 1; t <= 10; t++) {
            last = core.tick(input(t, 2.5, 0.0005, scan(0.0, 200, 50, Math.PI, 8)));
        }
        assertTrue(last.firePower() > 0, "a shot the gun could already afford must still fire");
        assertTrue(last.firePower() < 3.0, "power 3.0 is unaffordable at 2.5 energy");
    }
}
