package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.OpponentProfile;
import hadur2.core.memory.ProfileLibrary;
import hadur2.core.memory.Profiles;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.port.MemoryProfileStore;
import hadur2.core.port.Telemetry;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * END-3 and RAM-1 must never make an otherwise fireable shot unaffordable: a bug found by
 * review on PR #61 had each override replace the gun's chosen power outright, so a low-energy
 * robot that could have fired its own small choice fired nothing at all. POW-5 (R3) is a cap,
 * not a raise, so it needs no such guard of its own, but it must still compose correctly with
 * the rules that do.
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

    @Test
    @Tag("POW-10")
    @DisplayName("POW-10: a shot dearer than our energy is lowered to what we can pay for, not held")
    void shotDearerThanOurEnergyIsLowered() {
        // 200 px away the gun's own power is 1.95 (no power-down inside 325 px) and our energy
        // is 1.5, so the old rule capped it at 1.5 and then held it, since 1.5 is not above 1.5.
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE);
        core.newRound(0);
        core.tick(input(1, 1.5, 0.0005, scan(0.2, 200, 50, 0, 0)));
        BotOrders o = core.tick(input(2, 1.5, 0.0005, scan(0.2, 200, 50, 0, 0)));
        assertTrue(o.firePower() > 0, "the shot must go");
        assertTrue(o.firePower() < 1.5, "at a power our energy can pay for: " + o.firePower());
    }

    @Test
    @Tag("POW-10")
    @DisplayName("POW-10: a hit between the aim and the shot lowers the aimed power instead of holding the shot")
    void shotLoweredAfterAHitBetweenAimAndFire() {
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE);
        core.newRound(0);
        core.tick(input(1, 80, 0.0005, scan(0.2, 200, 50, 0, 0)));
        // The aim above was for 1.95; by the time it goes we are down to 1.0 energy.
        BotOrders o = core.tick(input(2, 1.0, 0.0005, scan(0.2, 200, 50, 0, 0)));
        assertTrue(o.firePower() > 0, "the shot must go");
        assertTrue(o.firePower() < 1.0, "at a power 1.0 energy can pay for: " + o.firePower());
    }

    @Test
    @Tag("POW-10")
    @DisplayName("POW-10: with 0.1 energy no power can be paid for, and no shot goes")
    void nothingToPayWith() {
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE);
        core.newRound(0);
        core.tick(input(1, 0.1, 0.0005, scan(0.2, 200, 50, 0, 0)));
        BotOrders o = core.tick(input(2, 0.1, 0.0005, scan(0.2, 200, 50, 0, 0)));
        assertTrue(o.firePower() == 0, "fired " + o.firePower());
    }

    @Test
    @Tag("ADAPT-5")
    @DisplayName("ADAPT-5: a profile that records the condition fires the lead-aware power from the very first shot")
    void profileVerdictAppliesFromTheFirstShot() {
        OpponentProfile p = Profiles.leadAware(Profiles.sample("enemy", 5, 0, 0), true);
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        new ProfileLibrary(store).save(p);
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE, store);
        core.newRound(0);
        // 50 energy against 52 at 400 px: level, below 60, so POW-7 fires 0.1 where 1.20's
        // power-down would fire 1.95 x (50/63)^3, about 0.97.
        core.tick(input(1, 50, 0.0005, scan(0.2, 400, 52, 0, 0)));
        BotOrders o = core.tick(input(2, 50, 0.0005, scan(0.2, 400, 52, 0, 0)));
        assertEquals(0.1, o.firePower(), 1e-9);

        // The same battle with no verdict in the profile is 1.20's.
        MemoryProfileStore stranger = new MemoryProfileStore(200_000);
        new ProfileLibrary(stranger).save(Profiles.sample("enemy", 5, 0, 0));
        HadurCore other = new HadurCore(800, 600, 1, Telemetry.NONE, stranger);
        other.newRound(0);
        other.tick(input(1, 50, 0.0005, scan(0.2, 400, 52, 0, 0)));
        BotOrders n = other.tick(input(2, 50, 0.0005, scan(0.2, 400, 52, 0, 0)));
        assertTrue(n.firePower() > 0.9 && n.firePower() < 1.0, "was " + n.firePower());
    }

    @Test
    @Tag("POW-5")
    @DisplayName("POW-5 caps a long-range shot against a T3 gun to 1.7, and it still fires")
    void t3CapStillFires() {
        // A profile whose normalised hit rate on us reads T3 (>= 7%, 2000 waves for a narrow
        // margin) and whose own virtual ratings are unremarkable, so no full-power rule
        // (POW-1..4) fires alongside POW-5's cap.
        OpponentProfile p = Profiles.sample("enemy", 5, 0, 0);
        Profiles.tiers(p, 0.10, 0.05, 0.05);
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        new ProfileLibrary(store).save(p);
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE, store);
        core.newRound(0);
        core.tick(input(1, 80, 0.0005, scan(0.2, 600, 80, 0, 0)));
        BotOrders o = core.tick(input(2, 80, 0.0005, scan(0.2, 600, 80, 0, 0)));
        assertTrue(o.firePower() > 0, "the capped shot must still fire");
        assertTrue(o.firePower() <= 1.7 + 1e-9, "POW-5 caps it at 1.7: was " + o.firePower());
    }
}
