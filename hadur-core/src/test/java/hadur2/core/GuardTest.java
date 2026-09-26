package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.physics.Angles;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RES-1: a core that throws never leaves the robot without orders. */
@Tag("RES-1")
class GuardTest {

    private final List<String> telemetry = new ArrayList<>();
    private int recoveries;

    private Guard guard(Function<BotInput, BotOrders> core) {
        return new Guard(core, () -> recoveries++, telemetry::add);
    }

    static BotInput input(long time, double velocity, BotEvent... events) {
        return new BotInput(time, 0, 400, 300, 0, velocity, 100, 0, 0.1, 0, 0, 0, 1,
            List.of(events));
    }

    static BotEvent.Scan scanAt(double bearing) {
        return new BotEvent.Scan("enemy", bearing, 300, 100, 0, 8);
    }

    @Test
    @DisplayName("passes the core's orders through while it works")
    void passesOrdersThrough() {
        BotOrders orders = BotOrders.builder().ahead(50).build();
        Guard g = guard(in -> orders);
        assertSame(orders, g.tick(input(1, 0)));
        assertEquals(0, g.faultsThisRound());
        assertTrue(telemetry.isEmpty());
    }

    @Test
    @DisplayName("a throwing core gets safe orders, a fault count and one FAULT record")
    void throwingCoreGetsSafeOrders() {
        Guard g = guard(in -> { throw new IllegalStateException("boom, with a comma"); });
        BotOrders a = g.tick(input(7, 5));
        BotOrders b = g.tick(input(8, 5));
        assertEquals(2, g.faultsThisRound());
        assertEquals(List.of("FAULT,0,7,IllegalStateException:boom; with a comma"), telemetry);
        for (BotOrders o : List.of(a, b)) {
            assertEquals(0, o.firePower(), "safe orders hold fire");
            assertEquals(8, o.maxVelocity());
            assertEquals(Guard.SAFE_DISTANCE, o.ahead(), "keeps going forwards");
            assertEquals(Double.POSITIVE_INFINITY, o.radarTurn(), "sweeps when no enemy seen");
        }
    }

    @Test
    @DisplayName("errors and a null result are faults too")
    void errorsAndNullAreFaults() {
        Guard g = guard(in -> { throw new StackOverflowError(); });
        g.tick(input(1, 0));
        Guard n = guard(in -> null);
        BotOrders o = n.tick(input(1, 0));
        assertEquals(1, g.faultsThisRound());
        assertEquals(1, n.faultsThisRound());
        assertEquals(0, o.firePower());
    }

    @Test
    @DisplayName("safe orders keep reversing if the robot was reversing")
    void keepsDirection() {
        Guard g = guard(in -> { throw new RuntimeException(); });
        assertEquals(-Guard.SAFE_DISTANCE, g.tick(input(1, -3)).ahead());
    }

    @Test
    @DisplayName("with an enemy seen, safe orders lock the radar and turn side-on")
    void locksRadarAndOrbits() {
        double bearing = 0.5;
        Guard g = guard(in -> { throw new RuntimeException(); });
        BotOrders o = g.tick(input(1, 8, scanAt(bearing)));
        double abs = Angles.normalAbsoluteAngle(bearing);
        assertEquals(Angles.normalRelativeAngle(abs) * 2, o.radarTurn(), 1e-12);
        // Heading 0 plus the turn is perpendicular to the enemy.
        double after = Angles.normalRelativeAngle(o.bodyTurn() - abs);
        assertEquals(Math.PI / 2, Math.abs(after), 1e-12);
        assertTrue(Math.abs(o.bodyTurn()) <= Math.PI / 2, "turns the short way");
    }

    @Test
    @DisplayName("the core recovers on the next scan after a fault, and only once")
    void recoversOnNextScan() {
        boolean[] fail = {true};
        Guard g = guard(in -> {
            if (fail[0]) throw new RuntimeException();
            return BotOrders.NONE;
        });
        g.tick(input(1, 0));
        fail[0] = false;
        g.tick(input(2, 0));
        assertEquals(0, recoveries, "no scan yet");
        g.tick(input(3, 0, scanAt(0)));
        g.tick(input(4, 0, scanAt(0)));
        assertEquals(1, recoveries);
    }

    @Test
    @DisplayName("a new round clears the fault count and logs the next fault again")
    void newRoundResets() {
        Guard g = guard(in -> { throw new RuntimeException(); });
        g.tick(input(1, 0));
        g.newRound();
        assertEquals(0, g.faultsThisRound());
        g.tick(input(1, 0));
        assertEquals(2, telemetry.size());
    }

    @Test
    @DisplayName("a real core that faults mid-battle keeps producing orders")
    void realCoreSurvivesInjectedFault() {
        HadurCore core = new HadurCore(800, 600, 1, telemetry::add);
        core.newRound(0);
        int[] tick = {0};
        Guard g = guard(in -> {
            if (++tick[0] % 10 == 0) throw new IllegalStateException("injected");
            return core.tick(in);
        });
        for (long t = 1; t <= 50; t++) {
            BotOrders o = g.tick(input(t, 4, scanAt(0.3)));
            assertFalse(Double.isNaN(o.radarTurn()), "every tick turns the radar");
        }
        assertEquals(5, g.faultsThisRound());
    }
}
