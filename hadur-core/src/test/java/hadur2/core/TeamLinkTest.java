package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.link.LinkCodec;
import hadur2.core.link.Report;
import hadur2.core.melee.MeleeController;
import hadur2.core.model.BattleFacts;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.physics.BattleField;
import hadur2.core.port.MemoryProfileStore;
import hadur2.core.role.Posture;
import hadur2.core.world.EnemyInfo;
import hadur2.core.world.EnemyShot;
import hadur2.core.world.Roster;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** A5: the conductor's part in a team battle, through the core's public surface. */
class TeamLinkTest {

    static final String ME = "hadur2.Hadur (1)";
    static final String MATE = "hadur2.Hadur (2)";
    static final String MATE2 = "hadur2.Hadur (3)";

    /** Three of us against three enemies on a 1200 x 1200 field; we lead. */
    static BattleFacts facts() {
        return new BattleFacts(1200, 1200, 5, List.of(MATE, MATE2), ME, 200, 0);
    }

    /** Hadur at (600, 600), facing north, gun north and cool. */
    static BotInput input(long time, int others, List<BotEvent> events) {
        return new BotInput(time, 0, 600, 600, 0, 0, 200, 0, 0.1, 0, 0, 0, others, events);
    }

    static BotEvent.Scan scan(String name, double bearing, double distance) {
        return new BotEvent.Scan(name, bearing, distance, 100, 0, 0);
    }

    static BotEvent.Message report(String from, long tick, double x, double y, List<Report.Sighting> seen,
                                   List<String> deaths) {
        return new BotEvent.Message(from, LinkCodec.encode(new Report(0, tick, x, y, 0, 0, 100, seen,
            deaths, List.of())));
    }

    /** A melee brain that writes down every event it is offered and how many others it was told of. */
    static final class Recording extends MeleeController {
        final List<String> seen = new ArrayList<>();

        Recording() {
            super(new BattleField(1200, 1200));
        }

        @Override
        public void scanned(EnemyInfo info, EnemyShot shot, double distance, double velocity, long time) {
            seen.add("scan:" + info.name);
            super.scanned(info, shot, distance, velocity, time);
        }

        @Override
        public void bulletHit(String name, double power) {
            seen.add("hit:" + name);
            super.bulletHit(name, power);
        }

        @Override
        public void died(String name, boolean sentry) {
            seen.add("died:" + name);
            super.died(name, sentry);
        }

        @Override
        public Command tick(Situation s) {
            seen.add("others:" + s.others);
            return super.tick(s);
        }
    }

    static List<BotEvent> enemies() {
        return List.of(scan("e.A", 1.0, 300), scan("e.B", 2.5, 350), scan("e.C", 4.0, 400));
    }

    @Test
    @Tag("WORLD-7")
    @DisplayName("WORLD-7: a teammate's scan, collision and death go to the World alone")
    void teammateEventsToTheWorldAlone() {
        Recording melee = new Recording();
        HadurCore core = new HadurCore(facts(), line -> {}, null, melee);
        core.newRound(0);
        List<BotEvent> events = new ArrayList<>(enemies());
        events.add(scan(MATE, 0, 200));
        events.add(new BotEvent.HitRobot(MATE, 0, 100, true));
        core.tick(input(1, 5, events));
        core.tick(input(2, 4, List.of(new BotEvent.RobotDeath(MATE))));
        assertFalse(melee.seen.stream().anyMatch(s -> s.contains(MATE)), melee.seen.toString());
        assertNull(core.world().get(MATE));
        Roster.Mate mate = core.roster().mate(MATE);
        assertEquals(800, mate.y(), 1e-9);
        assertFalse(mate.alive());
        assertTrue(core.roster().mate(MATE2).alive());
    }

    @Test
    @Tag("WORLD-6")
    @DisplayName("WORLD-6: our bullet on a teammate, or on a teammate's bullet, reaches the role as a miss")
    void bulletsOnTeammatesAreMisses() {
        List<String> telemetry = new ArrayList<>();
        Recording melee = new Recording();
        HadurCore core = new HadurCore(facts(), telemetry::add, null, melee);
        core.newRound(0);
        core.tick(input(1, 5, enemies()));
        core.tick(input(2, 5, List.of(new BotEvent.BulletHit(MATE, 1.0, 90, 0.3),
            new BotEvent.BulletHitBullet(1.0, 600, 650, 2.0, 0.3, MATE2),
            new BotEvent.BulletHit("e.A", 1.0, 90, 0.3))));
        assertFalse(melee.seen.contains("hit:" + MATE), melee.seen.toString());
        assertTrue(melee.seen.contains("hit:e.A"), melee.seen.toString());
        core.roundEnded(3, "win", 50, 0);
        String t = telemetry.stream().filter(l -> l.startsWith("T,")).findFirst().orElseThrow();
        assertTrue(t.startsWith("T,0,3,1,1,0,"), t);
    }

    @Test
    @Tag("WORLD-2")
    @Tag("WORLD-8")
    @DisplayName("WORLD-2, WORLD-8: a role is told the enemies alive, never fewer than the truth")
    void rolesCountEnemies() {
        Recording melee = new Recording();
        HadurCore core = new HadurCore(facts(), line -> {}, null, melee);
        core.newRound(0);
        // No report yet (LINK-3): the engine's five others less no one heard, or three
        // enemies at the start less none dead: three.
        core.tick(input(1, 5, enemies()));
        assertEquals("others:3", last(melee.seen, "others:"));
        // One teammate reports the tick before, one enemy dies: min(4 - 1, 3 - 1) = 2.
        core.tick(input(2, 4, List.of(report(MATE, 1, 500, 500, List.of(), List.of()),
            new BotEvent.RobotDeath("e.C"))));
        assertEquals("others:2", last(melee.seen, "others:"));
        assertEquals(Posture.MELEE, core.posture());
        // A second enemy dies: one left, so the Duel takes over, as a melee does.
        core.tick(input(3, 3, List.of(new BotEvent.RobotDeath("e.B"), scan("e.A", 1.0, 300))));
        assertEquals(Posture.DUEL, core.posture());
    }

    private static String last(List<String> seen, String prefix) {
        String l = null;
        for (String s : seen) if (s.startsWith(prefix)) l = s;
        return l;
    }

    @Test
    @Tag("WORLD-8")
    @DisplayName("WORLD-8: a teammate's last report, read with its death, does not bring it back")
    void lastReportWithDeathStaysDead() {
        Recording melee = new Recording();
        HadurCore core = new HadurCore(facts(), line -> {}, null, melee);
        core.newRound(0);
        core.tick(input(1, 5, enemies()));
        // MATE's report of tick 1 arrives with its death; MATE2 reports too. Truth: three
        // enemies and MATE2 alive, others 4.
        core.tick(input(2, 4, List.of(new BotEvent.RobotDeath(MATE), report(MATE, 1, 500, 500, List.of(), List.of()),
            report(MATE2, 1, 700, 700, List.of(), List.of()))));
        assertFalse(core.roster().mate(MATE).alive(), "the dead stay dead");
        assertEquals(1, core.roster().heardFrom(), "only MATE2 is heard on this tick");
        assertEquals("others:3", last(melee.seen, "others:"), "never fewer enemies than the truth");
    }

    @Test
    @Tag("WORLD-4")
    @DisplayName("WORLD-4: an enemy's death heard first in a report closes the melee books once")
    void reportedKillClosesTheBooksOnce() {
        Recording melee = new Recording();
        HadurCore core = new HadurCore(facts(), line -> {}, null, melee);
        core.newRound(0);
        core.tick(input(1, 5, enemies()));
        core.tick(input(2, 5, List.of(report(MATE, 1, 500, 500, List.of(), List.of("e.C")))));
        assertNull(core.world().get("e.C"));
        assertEquals(1, melee.seen.stream().filter("died:e.C"::equals).count(), melee.seen.toString());
        // The engine's own event for it comes a tick later: not offered again.
        core.tick(input(3, 4, List.of(new BotEvent.RobotDeath("e.C"))));
        assertEquals(1, melee.seen.stream().filter("died:e.C"::equals).count(), melee.seen.toString());
    }

    @Test
    @Tag("WORLD-4")
    @DisplayName("WORLD-4: a report is merged once, and the newer of two sightings is kept")
    void reportsMergedOnce() {
        HadurCore core = new HadurCore(facts(), line -> {}, null);
        core.newRound(0);
        core.tick(input(1, 5, enemies()));
        double ownY = core.world().get("e.A").location.y;
        // A teammate saw e.A on tick 0, older than our own scan on tick 1: dropped.
        Report.Sighting old = new Report.Sighting("e.A", 0, 100, 100, 0, 0, 100);
        // MATE2's report of tick 2 arrives, and MATE's of tick 1 again (a skipped sender).
        Report.Sighting newer = new Report.Sighting("e.B", 2, 900, 900, 0, 0, 80);
        core.tick(input(3, 5, List.of(report(MATE2, 2, 300, 300, List.of(newer), List.of()),
            report(MATE, 1, 500, 500, List.of(old), List.of()), report(MATE, 1, 500, 500, List.of(old), List.of()))));
        assertEquals(ownY, core.world().get("e.A").location.y, 1e-9);
        assertEquals(new Point2D.Double(900, 900), core.world().get("e.B").location);
        assertEquals(2, core.world().get("e.B").lastScanTime);
        core.tick(input(4, 5, List.of(report(MATE, 1, 500, 500, List.of(old), List.of()))));
        core.roundEnded(5, "win", 50, 0);
        assertEquals(500, core.roster().mate(MATE).x(), 1e-9);
    }

    @Test
    @Tag("WORLD-3")
    @DisplayName("WORLD-3: a teammate silent past the window while the others fell is counted dead")
    void silentTeammatePresumedDead() {
        HadurCore core = new HadurCore(facts(), line -> {}, null);
        core.newRound(0);
        core.tick(input(1, 5, List.of(report(MATE, 0, 500, 500, List.of(), List.of()),
            report(MATE2, 0, 700, 700, List.of(), List.of()))));
        for (long t = 2; t <= 30; t++) {
            core.tick(input(t, 5, List.of(report(MATE2, t - 1, 700, 700, List.of(), List.of()))));
        }
        assertTrue(core.roster().mate(MATE).alive(), "the count has not fallen");
        core.tick(input(31, 4, List.of(report(MATE2, 30, 700, 700, List.of(), List.of()))));
        assertFalse(core.roster().mate(MATE).alive());
        assertTrue(core.roster().mate(MATE2).alive());
    }

    /** A melee brain that always wants to fire at power 1. */
    static final class TriggerHappy extends MeleeController {
        TriggerHappy() {
            super(new BattleField(1200, 1200));
        }

        @Override
        public Command tick(Situation s) {
            Command c = super.tick(s);
            c.firePower = 1.0;
            return c;
        }
    }

    @Test
    @Tag("WEAVE-4")
    @DisplayName("WEAVE-4: no shot leaves while a teammate's last known position is in the fire lane")
    void fireLaneHoldsTheShot() {
        List<String> telemetry = new ArrayList<>();
        HadurCore core = new HadurCore(facts(), telemetry::add, null, new TriggerHappy());
        core.newRound(0);
        // MATE straight up the gun's heading (north), 200 px away: blocked.
        List<BotEvent> events = new ArrayList<>(enemies());
        events.add(scan(MATE, 0, 200));
        BotOrders o = core.tick(input(1, 5, events));
        assertEquals(0, o.firePower(), 1e-9);
        // Its position ages: at 10 ticks the lane is 24 + 80 px wide; a teammate seen 100 px
        // to the side of the lane is still in it, then out once older than the window.
        BotOrders later = null;
        for (long t = 2; t <= 22; t++) later = core.tick(input(t, 5, enemies()));
        assertTrue(later.firePower() > 0, "a position older than the window is not used");
        core.roundEnded(23, "win", 50, 0);
        String t = telemetry.stream().filter(l -> l.startsWith("T,")).findFirst().orElseThrow();
        assertEquals(1, Integer.parseInt(t.split(",")[6]), "one shot held, however long it waited: " + t);
    }

    @Test
    @Tag("WEAVE-4")
    @DisplayName("WEAVE-4: a teammate behind the gun or wide of the lane does not hold the shot")
    void clearLaneFires() {
        HadurCore core = new HadurCore(facts(), line -> {}, null, new TriggerHappy());
        core.newRound(0);
        List<BotEvent> events = new ArrayList<>(enemies());
        events.add(scan(MATE, Math.PI, 300));
        events.add(scan(MATE2, Math.PI / 2, 300));
        double fired = 0;
        for (long t = 1; t <= 4; t++) fired += core.tick(input(t, 5, events)).firePower();
        assertTrue(fired > 0);
    }

    @Test
    @Tag("WEAVE-5")
    @DisplayName("WEAVE-5: on a team the guard's safe orders hold fire however often the core faults")
    void guardHoldsFireOnATeam() {
        Guard guard = new Guard(in -> {
            throw new IllegalStateException("boom");
        }, () -> {}, line -> {}, true);
        guard.newRound();
        for (long t = 1; t <= 10; t++) {
            BotOrders o = guard.tick(input(t, 5, List.of(scan("e.A", 0.5, 300))));
            assertEquals(0, o.firePower(), 1e-9, "tick " + t);
        }
        Guard solo = new Guard(in -> {
            throw new IllegalStateException("boom");
        }, () -> {}, line -> {});
        solo.newRound();
        double fired = 0;
        for (long t = 1; t <= 10; t++) fired += solo.tick(input(t, 1, List.of(scan("e.A", 0.5, 300)))).firePower();
        assertTrue(fired > 0, "RES-7 still holds off a team");
    }

    @Test
    @Tag("LINK-4")
    @DisplayName("LINK-4: while a teammate lives each tick's orders carry our report; with none alive, none")
    void ordersCarryTheReport() {
        HadurCore core = new HadurCore(facts(), line -> {}, null);
        core.newRound(0);
        BotOrders o = core.tick(input(1, 5, enemies()));
        assertEquals(1, o.messages().size());
        Report r = LinkCodec.decode(o.messages().get(0));
        assertEquals(1, r.tick());
        assertEquals(600, r.x(), 1e-9);
        assertEquals(3, r.sightings().size());
        assertEquals("e.A", r.sightings().get(0).name);
        o = core.tick(input(2, 4, List.of(new BotEvent.RobotDeath("e.C"))));
        assertEquals(List.of("e.C"), LinkCodec.decode(o.messages().get(0)).deaths());
        o = core.tick(input(3, 2, List.of(new BotEvent.RobotDeath(MATE), new BotEvent.RobotDeath(MATE2))));
        assertTrue(o.messages().isEmpty(), "no living teammate to tell");
    }

    @Test
    @Tag("LINK-3")
    @DisplayName("LINK-3: with no report ever arriving the role is still resolved, from the engine's facts")
    void noReportsStillResolves() {
        HadurCore core = new HadurCore(facts(), line -> {}, null);
        core.newRound(0);
        for (long t = 1; t <= 5; t++) core.tick(input(t, 5, enemies()));
        assertEquals(Posture.MELEE, core.posture());
        assertEquals(0, core.linkReceived());
    }

    @Test
    @Tag("SHELF-2")
    @DisplayName("SHELF-2: on a team only the leader writes, and only the conductor's health record")
    void onlyTheLeaderWrites() {
        for (boolean leads : new boolean[] {true, false}) {
            MemoryProfileStore store = new MemoryProfileStore(200_000);
            store.write("old.hp", new byte[] {1});
            BattleFacts f = new BattleFacts(1200, 1200, 5, List.of(MATE, MATE2), ME, leads ? 200 : 100, 0);
            HadurCore core = new HadurCore(f, line -> {}, store);
            core.prepareMemory();
            core.newRound(0);
            for (long t = 1; t <= 20; t++) core.tick(input(t, 5, enemies()));
            core.roundEnded(21, "win", 50, 0);
            core.checkpoint(21);
            core.battleEnded(22);
            core.writeBattleHealth(1, 1, 0, 0);
            List<String> names = new ArrayList<>(store.names());
            names.sort(null);
            assertEquals(leads ? List.of("health.hc", "old.hp") : List.of("old.hp"), names, "leads " + leads);
        }
    }
}
