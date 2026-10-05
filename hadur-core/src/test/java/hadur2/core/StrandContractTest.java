package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.duel.DuelController;
import hadur2.core.world.EnemyInfo;
import hadur2.core.world.EnemyShot;
import hadur2.core.melee.MeleeController;
import hadur2.core.memory.Estimate;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.physics.BattleField;
import hadur2.core.port.Telemetry;
import hadur2.core.replay.Fixtures;
import hadur2.core.replay.LineCodec;
import hadur2.core.role.DuelFocus;
import hadur2.core.role.Role;
import hadur2.core.role.RoleId;
import hadur2.core.role.Tick;
import java.awt.geom.Point2D;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * The strand contract (A2) as the conductor applies it: which role is offered which event
 * (ROLE-5), whose bullet an outcome is after a hand-over (WORLD-5), and who may order what
 * (WEAVE-1, WEAVE-3, WEAVE-6). WEAVE-2 is a property in {@code role.WeaveProperties}.
 */
class StrandContractTest {

    /** Hadur stands still at (500, 500) with a cool gun on target. */
    private static BotInput input(long time, int others, int sentries, List<BotEvent> events) {
        return new BotInput(time, 0, 500, 500, 0, 0, 100, 0, 0.1, 0, 0, 0, others, events,
            sentries, sentries > 0 ? 100 : 0);
    }

    private static BotEvent.Scan scan(String name, double bearing, double distance, boolean sentry) {
        return new BotEvent.Scan(name, bearing, distance, 100, 0, 0, sentry);
    }

    /** A melee brain that writes down what it is offered, in order, beside the core's records. */
    static final class RecordingMelee extends MeleeController {
        final List<String> seen;

        RecordingMelee(List<String> seen) {
            super(new BattleField(1000, 1000));
            this.seen = seen;
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
        public void hitByBullet(String name, double power, double heading, Point2D.Double me, long time) {
            seen.add("hitBy:" + name);
            super.hitByBullet(name, power, heading, me, time);
        }
    }

    @Test
    @Tag("ROLE-5")
    @DisplayName("ROLE-5: a scan is offered to Melee before the Duel")
    void meleeBeforeDuel() {
        List<String> seen = new ArrayList<>();
        HadurCore core = new HadurCore(1000, 1000, 2, seen::add, null, new RecordingMelee(seen));
        core.newRound(0);
        core.tick(input(1, 1, 0, List.of(scan("x", 1.0, 300, false))));
        int melee = seen.indexOf("scan:x");
        int duel = -1;
        for (int i = 0; i < seen.size(); i++) if (seen.get(i).startsWith("B,")) duel = i;
        assertTrue(melee >= 0 && duel > melee, seen.toString());
    }

    @Test
    @Tag("ROLE-5")
    @DisplayName("ROLE-5: a sentry's scan and a sentry's bullet are offered to no role")
    void sentryOfferedToNoRole() {
        List<String> seen = new ArrayList<>();
        HadurCore core = new HadurCore(1000, 1000, 2, seen::add, null, new RecordingMelee(seen));
        core.newRound(0);
        core.tick(input(1, 1, 1, List.of(scan("s", 0, 450, true), scan("x", 1.0, 300, false))));
        core.tick(input(2, 1, 1, List.of(new BotEvent.HitByBullet("s", 1.0, 500, 520, Math.PI))));
        assertFalse(seen.contains("scan:s"), seen.toString());
        assertFalse(seen.contains("hitBy:s"), seen.toString());
        assertTrue(seen.contains("scan:x"), seen.toString());
        assertEquals("x", core.duel().opponent());
    }

    @Test
    @Tag("ROLE-5")
    @DisplayName("ROLE-5: Hadur's hit on a robot the Duel is ignoring is not offered to Melee")
    void ignoredHitNotOfferedToMelee() {
        List<String> seen = new ArrayList<>();
        HadurCore core = new HadurCore(1000, 1000, 2, seen::add, null, new RecordingMelee(seen));
        core.newRound(0);
        // A sentry vetoes melee, so the Duel fights the closer of the two: a.
        core.tick(input(1, 2, 1, List.of(scan("s", 0, 450, true), scan("a", 1.0, 200, false),
            scan("b", 2.0, 300, false))));
        assertEquals("a", core.duelFocus());
        core.tick(input(2, 2, 1, List.of(new BotEvent.BulletHit("b", 1.0, 90),
            new BotEvent.BulletHit("a", 1.0, 90))));
        assertFalse(seen.contains("hit:b"), seen.toString());
        assertTrue(seen.contains("hit:a"), seen.toString());
    }

    @Test
    @Tag("WORLD-1")
    @DisplayName("WORLD-1: a scan the World has not taken is booked against no robot")
    void unfedScanBooksNoRobot() {
        List<String> seen = new ArrayList<>();
        RecordingMelee melee = new RecordingMelee(seen);
        HadurCore core = new HadurCore(1000, 1000, 2, seen::add, null, melee);
        core.newRound(0);
        core.tick(input(1, 2, 0, List.of(scan("a", 1.0, 300, false))));
        assertTrue(seen.contains("scan:a"), seen.toString());
        seen.clear();
        // Straight through the role contract, past the conductor's feed: the World's last
        // scan is a's, so b's scan must not be booked as a's.
        MeleeSeam seam = new MeleeSeam(core, melee, null, false, new hadur2.core.model.RoundStats());
        Tick t = new Tick(input(2, 2, 0, List.of()), RoleId.MELEE, false, new DuelFocus(), n -> false, false);
        seam.observe(scan("b", 2.0, 300, false), t);
        assertFalse(seen.stream().anyMatch(s -> s.startsWith("scan:")), seen.toString());
    }

    @Test
    @Tag("ROLE-6")
    @DisplayName("ROLE-6: a duel holds no melee brain and no World; a melee holds both, one World")
    void onlyTheCharterRolesAreBuilt() {
        HadurCore duel = new HadurCore(1000, 1000, 1, Telemetry.NONE);
        assertEquals(null, duel.melee());
        assertEquals(null, duel.world());
        // A melee brain handed to a duel is not held either.
        HadurCore handed = new HadurCore(1000, 1000, 1, Telemetry.NONE, null, new RecordingMelee(new ArrayList<>()));
        assertEquals(null, handed.melee());
        HadurCore melee = new HadurCore(1000, 1000, 2, Telemetry.NONE);
        assertTrue(melee.melee() != null && melee.world() != null);
        assertSame(melee.world(), melee.melee().tracker, "one World, which the melee brain reads");
    }

    /** A melee brain that notes, at each event it is offered, whether the World already knew it. */
    static final class WorldFirstMelee extends MeleeController {
        final List<String> seen = new ArrayList<>();

        WorldFirstMelee() {
            super(new BattleField(1000, 1000));
        }

        @Override
        public void scanned(EnemyInfo info, EnemyShot shot, double distance, double velocity, long time) {
            seen.add("scan:" + info.name + "@" + tracker.get(info.name).lastScanTime);
            super.scanned(info, shot, distance, velocity, time);
        }

        @Override
        public void died(String name, boolean sentry) {
            seen.add("died:" + name + "@" + (tracker.get(name) != null));
            super.died(name, sentry);
        }
    }

    @Test
    @Tag("WORLD-1")
    @DisplayName("WORLD-1: the World takes each scan and death before any role is offered it")
    void worldIsFedFirst() {
        WorldFirstMelee melee = new WorldFirstMelee();
        HadurCore core = new HadurCore(1000, 1000, 3, Telemetry.NONE, null, melee);
        core.newRound(0);
        core.tick(input(1, 3, 0, List.of(scan("a", 1.0, 200, false), scan("b", 2.0, 300, false),
            scan("c", 3.0, 400, false))));
        core.tick(input(2, 2, 0, List.of(new BotEvent.RobotDeath("c"))));
        assertEquals(List.of("scan:a@1", "scan:b@1", "scan:c@1", "died:c@false"), melee.seen);
        // The World is fed whichever role drives: the Duel drives with one left.
        core.tick(input(3, 1, 0, List.of(new BotEvent.RobotDeath("b"), scan("a", 1.0, 200, false))));
        assertEquals(3, core.world().get("a").lastScanTime);
        assertEquals(null, core.world().get("b"), "b is dead in the World");
    }

    /** A melee brain that always wants to fire at power 1. */
    static final class TriggerHappyMelee extends MeleeController {
        TriggerHappyMelee() {
            super(new BattleField(1000, 1000));
        }

        @Override
        public Command tick(Situation s) {
            Command c = super.tick(s);
            c.firePower = 1.0;
            return c;
        }
    }

    @Test
    @Tag("WORLD-5")
    @DisplayName("WORLD-5: the outcomes of the melee's bullets in flight stay out of the Duel's hit rate")
    void meleeBulletsStayOutOfDuelEvidence() {
        HadurCore core = new HadurCore(1000, 1000, 3, Telemetry.NONE, null, new TriggerHappyMelee());
        core.newRound(0);
        List<BotEvent> three = List.of(scan("a", 1.0, 200, false), scan("b", 2.0, 300, false),
            scan("c", 3.0, 400, false));
        for (long t = 1; t <= 4; t++) core.tick(input(t, 3, 0, three));
        int inFlight = core.stats().shotsFired;
        assertTrue(inFlight >= 2, "the melee fired " + inFlight);
        // Two die: the Duel takes over, and only bullet outcomes arrive.
        core.tick(input(5, 1, 0, List.of(new BotEvent.RobotDeath("b"), new BotEvent.RobotDeath("c"))));
        for (int i = 0; i < inFlight; i++) {
            core.tick(input(6 + i, 1, 0, List.of(new BotEvent.BulletMissed(1.0))));
            assertSame(Estimate.NONE, core.ourRollingHitRate(), "melee outcome " + (i + 1));
        }
        core.tick(input(6 + inFlight, 1, 0, List.of(new BotEvent.BulletMissed(1.0))));
        assertEquals(1, core.ourRollingHitRate().samples(), 1e-9);
    }

    @Test
    @Tag("WEAVE-1")
    @DisplayName("WEAVE-1: only drive is handed the orders; observing an event cannot write one")
    void onlyTheDriverOriginatesOrders() {
        for (Method m : Role.class.getMethods()) {
            boolean takesOrders = Arrays.asList(m.getParameterTypes()).contains(BotOrders.Builder.class);
            assertEquals(m.getName().equals("drive"), takesOrders, m.toString());
        }
        Set<String> duelWriters = new TreeSet<>();
        for (Method m : DuelController.class.getMethods()) {
            if (Arrays.asList(m.getParameterTypes()).contains(BotOrders.Builder.class)) duelWriters.add(m.getName());
        }
        assertEquals(Set.of("drive", "duressDrive"), duelWriters);
        for (Method m : MeleeController.class.getMethods()) {
            assertFalse(Arrays.asList(m.getParameterTypes()).contains(BotOrders.Builder.class), m.toString());
        }
    }

    @Test
    @Tag("WEAVE-1")
    @DisplayName("WEAVE-1: the Duel's radar lock waits for the Duel to drive")
    void radarLockWaitsForDrive() {
        HadurCore core = new HadurCore(1000, 1000, 1, Telemetry.NONE);
        core.newRound(0);
        BotOrders o = core.tick(input(1, 1, 0, List.of(scan("x", 1.0, 300, false))));
        // The lock turns twice the angle to the opponent, from the radar's heading of 0.
        assertEquals(2.0, o.radarTurn(), 1e-9);
    }

    /** Ticks a fixture through a core whose fire permission is {@code mayFire}; returns shots ordered and faults. */
    private static int[] runFixture(String name, boolean mayFire, List<String> telemetry) {
        List<String> lines = Fixtures.lines(Fixtures.DIR.resolve(name + ".txt.gz"));
        HadurCore core = null;
        Guard guard = null;
        int shots = 0, faults = 0;
        for (String line : lines) {
            if (line.startsWith("F,")) {
                String[] f = line.split(",");
                core = new HadurCore(Double.parseDouble(f[1]), Double.parseDouble(f[2]),
                    Integer.parseInt(f[3]), telemetry::add);
                core.firePermission(in -> mayFire);
                HadurCore c = core;
                guard = new Guard(c::tick, c::recover, telemetry::add);
            } else if (line.startsWith("N,")) {
                core.newRound(Integer.parseInt(line.substring(2)));
                faults += guard.faultsThisRound();
                guard.newRound();
            } else if (line.startsWith("I,")) {
                BotOrders o = guard.tick(LineCodec.decodeInput(line));
                if (o.firePower() > 0) shots++;
            }
        }
        return new int[] {shots, faults + guard.faultsThisRound()};
    }

    @Test
    @Tag("WEAVE-3")
    @DisplayName("WEAVE-3: without the fire permission neither the Duel nor Melee orders a shot")
    void noShotWithoutPermission() {
        for (String fixture : List.of("sample.Walls", "melee-samples", "duress-sample.Walls")) {
            List<String> telemetry = new ArrayList<>();
            assertTrue(runFixture(fixture, true, new ArrayList<>())[0] > 0, fixture + " fires when allowed");
            int[] denied = runFixture(fixture, false, telemetry);
            assertEquals(0, denied[0], fixture);
            assertEquals(0, denied[1], fixture + ": holding fire is no fault");
            assertTrue(telemetry.stream().noneMatch(l -> l.startsWith("FAULT,")), fixture);
        }
    }

    private static Tick tick(boolean mayFire) {
        Tick t = new Tick(input(1, 1, 0, List.of()), RoleId.DUEL, false, new DuelFocus(), n -> false, false);
        return t.forDrive(RoleId.DUEL, false, 0, mayFire);
    }

    @Test
    @Tag("WEAVE-6")
    @DisplayName("WEAVE-6: a shot ordered without the permission is the driving role's fault")
    void shotWithoutPermissionIsAFault() {
        assertThrows(IllegalStateException.class,
            () -> HadurCore.checkFirePermission(tick(false), BotOrders.builder().fire(1.0)));
        HadurCore.checkFirePermission(tick(false), BotOrders.builder().turnGunRight(1.0));
        HadurCore.checkFirePermission(tick(true), BotOrders.builder().fire(1.0));
    }

    @Test
    @Tag("WEAVE-1")
    @DisplayName("the Duel takes a baton only inside the survivor's scan")
    void takeOutsideAScanFailsClearly() {
        HadurCore core = new HadurCore(1000, 1000, 1, Telemetry.NONE);
        DuelSeam seam = new DuelSeam(core, core.duel());
        IllegalStateException e = assertThrows(IllegalStateException.class,
            () -> seam.take(hadur2.core.model.Baton.EMPTY, tick(true)));
        assertTrue(e.getMessage().contains("survivor's scan"));
    }
}
