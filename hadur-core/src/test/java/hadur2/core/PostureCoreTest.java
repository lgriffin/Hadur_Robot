package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.port.MemoryProfileStore;
import hadur2.core.port.Telemetry;
import hadur2.core.world.EnemyInfo;
import hadur2.core.world.EnemyShot;
import hadur2.core.melee.MeleeController;
import hadur2.core.physics.BattleField;
import hadur2.core.role.Posture;
import hadur2.core.role.Veto;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The gate as the orchestrator applies it, beyond the Cucumber scenarios. */
class PostureCoreTest {

    private static BotInput input(long time, int others, int sentries, List<BotEvent> events) {
        return new BotInput(time, 0, 500, 500, 0, 0, 100, 0, 0.1, 0, 0, 0, others, events,
            sentries, sentries > 0 ? 100 : 0);
    }

    private static BotEvent.Scan scan(String name, double bearing, double distance, boolean sentry) {
        return new BotEvent.Scan(name, bearing, distance, 100, 0, 0, sentry);
    }

    @Test
    @Tag("GATE-5")
    @DisplayName("GATE-5: a duel beside a sentry profiles the opponent, never the sentry")
    void sentryNeverProfiled() {
        HadurCore core = new HadurCore(1000, 1000, 1, Telemetry.NONE, new MemoryProfileStore(200_000));
        core.newRound(0);
        // The sentry is scanned first; the opponent a tick later.
        core.tick(input(1, 1, 1, List.of(scan("samplesentry.BorderGuard", 0, 450, true))));
        assertNull(core.profile());
        core.tick(input(2, 1, 1, List.of(scan("sample.Crazy 1.0", 1.0, 300, false))));
        assertEquals("sample.Crazy 1.0", core.profile().lastName());
        assertEquals(Posture.DUEL, core.posture());
    }

    @Test
    @Tag("GATE-5")
    @DisplayName("GATE-5: our bullets and their hits from a sentry never reach the duel's ledger")
    void sentryEventsIgnored() {
        List<String> telemetry = new ArrayList<>();
        HadurCore core = new HadurCore(1000, 1000, 2, telemetry::add);
        core.newRound(0);
        core.tick(input(1, 2, 1, List.of(scan("s", 0, 450, true), scan("a", 1.0, 200, false),
            scan("b", 2.0, 300, false))));
        core.tick(input(2, 2, 1, List.of(new BotEvent.BulletHit("s", 1.0, 99, 0),
            new BotEvent.HitByBullet("s", 1.0, 500, 520, Math.PI))));
        core.roundEnded(2, "win", 100, 0);
        String m = telemetry.stream().filter(l -> l.startsWith("M,")).findFirst().orElseThrow();
        // One of our bullets hit the sentry; it is counted, and nothing else follows from it.
        assertEquals("1", m.split(",")[10], m);
        assertEquals("a", core.duelFocus());
    }

    @Test
    @Tag("GATE-2")
    @DisplayName("GATE-2: a pure duel emits no M record")
    void duelHasNoMeleeRecord() {
        List<String> telemetry = new ArrayList<>();
        HadurCore core = new HadurCore(800, 600, 1, telemetry::add);
        core.newRound(0);
        core.tick(input(1, 1, 0, List.of(scan("a", 1.0, 300, false))));
        core.roundEnded(1, "win", 100, 0);
        assertTrue(telemetry.stream().noneMatch(l -> l.startsWith("M,")), telemetry.toString());
    }

    @Test
    @Tag("GATE-3")
    @DisplayName("GATE-3: next to a sentry the duel's orders are fenced")
    void duelOrdersFenced() {
        HadurCore core = new HadurCore(1000, 1000, 1, Telemetry.NONE);
        core.newRound(0);
        // Hadur deep in the south border zone: whatever the duel wants, it drives north.
        BotOrders o = core.tick(new BotInput(1, 0, 500, 60, 0, 0, 100, 0, 0.1, 0, 0, 0, 1,
            List.of(scan("a", 0.5, 300, false)), 1, 100));
        assertTrue(o.ahead() > 0, o.toString());
        assertEquals(0, o.bodyTurn(), 1e-9);
    }

    /** A melee brain that throws from one event handler, from tick {@code from} on. */
    private static MeleeController throwing(String handler, long from) {
        return new MeleeController(new BattleField(1000, 1000)) {
            @Override
            public void scanned(EnemyInfo info, EnemyShot shot, double distance, double velocity, long time) {
                if (handler.equals("scan") && time >= from) throw new IllegalStateException("scan");
                super.scanned(info, shot, distance, velocity, time);
            }

            @Override
            public void died(String name, boolean sentry) {
                if (handler.equals("death")) throw new IllegalStateException("death");
                super.died(name, sentry);
            }
        };
    }

    private static List<BotEvent> threeScans() {
        return List.of(scan("a", 0, 300, false), scan("b", 2, 300, false), scan("c", 4, 300, false));
    }

    @Test
    @Tag("GATE-4")
    @DisplayName("GATE-4: a melee scan handler that throws hands the round to the duel at once")
    void scanHandlerFaultFailsClosed() {
        List<String> telemetry = new ArrayList<>();
        HadurCore core = new HadurCore(1000, 1000, 3, telemetry::add, null, throwing("scan", 2));
        core.newRound(0);
        core.tick(input(1, 3, 0, threeScans()));
        assertEquals(Posture.MELEE, core.posture());
        BotOrders o = core.tick(input(2, 3, 0, threeScans()));
        assertEquals(Veto.FAULT, core.veto());
        assertTrue(telemetry.stream().anyMatch(l -> l.startsWith("FAULT,0,2,melee,")), telemetry.toString());
        assertTrue(Double.isInfinite(o.radarTurn()));
        core.tick(input(3, 3, 0, List.of()));
        assertEquals(Posture.DUEL, core.posture());
        core.roundEnded(3, "loss", 50, 0);
        String m = telemetry.stream().filter(l -> l.startsWith("M,")).findFirst().orElseThrow();
        assertEquals("fault", m.split(",")[6], m);
        assertEquals("1", m.split(",")[7], m);
    }

    @Test
    @Tag("GATE-4")
    @DisplayName("GATE-4: a melee death handler that throws vetoes melee too")
    void deathHandlerFaultFailsClosed() {
        HadurCore core = new HadurCore(1000, 1000, 3, Telemetry.NONE, null, throwing("death", 0));
        core.newRound(0);
        core.tick(input(1, 3, 0, threeScans()));
        core.tick(input(2, 2, 0, List.of(new BotEvent.RobotDeath("c"))));
        assertEquals(Veto.FAULT, core.veto());
        assertEquals(Posture.DUEL, core.posture());
    }
}
