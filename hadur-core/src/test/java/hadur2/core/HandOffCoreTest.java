package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.world.EnemyShot;
import hadur2.core.melee.MeleeProfile;
import hadur2.core.melee.MeleeProfileCodec;
import hadur2.core.memory.ProfileLibrary;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.port.MemoryProfileStore;
import hadur2.core.role.Posture;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The melee's memory and its hand-off to the duel, as the orchestrator runs them (MMEM-1, MMEM-2). */
class HandOffCoreTest {

    static final String A = "pkg.Alpha 1.0";
    static final String B = "pkg.Beta 2.0";
    static final String C = "pkg.Gamma 3.0";

    private final List<String> telemetry = new ArrayList<>();

    /** Hadur stands still at (500, 500) with a cool gun. */
    private static BotInput input(long time, int others, List<BotEvent> events) {
        return new BotInput(time, 0, 500, 500, 0, 0, 100, 0, 0.1, 0, 0, 0, others, events);
    }

    /** A still opponent at {@code bearing}, 400 px away, with {@code energy}. */
    private static BotEvent.Scan scan(String name, double bearing, double energy) {
        return new BotEvent.Scan(name, bearing, 400, energy, 0, 0);
    }

    private static List<BotEvent> three(double energyA, double energyB) {
        return List.of(scan(A, 0, energyA), scan(B, 2, energyB), scan(C, 4, 100));
    }

    /**
     * Ticks 1 to 29 of melee: A fires power 1 at tick 1 (its drop shows at tick 2) and
     * power 2 at tick 25; B fires power 2 at tick 25. At tick 30 B and C die and A is
     * scanned by the duel.
     */
    private HadurCore meleeToDuel(MemoryProfileStore store) {
        HadurCore core = new HadurCore(1000, 1000, 3, telemetry::add, store);
        core.prepareMemory();
        core.newRound(0);
        double a = 100;
        double b = 100;
        for (long t = 1; t < 30; t++) {
            if (t == 2) a -= 1;
            if (t == 26) {
                a -= 2;
                b -= 2;
            }
            core.tick(input(t, 3, three(a, b)));
            assertEquals(Posture.MELEE, core.posture());
        }
        core.tick(input(30, 1, List.of(new BotEvent.RobotDeath(B), new BotEvent.RobotDeath(C),
            scan(A, 0, a))));
        assertEquals(Posture.DUEL, core.posture());
        return core;
    }

    private String record(String type) {
        return telemetry.stream().filter(l -> l.startsWith(type + ",")).findFirst().orElseThrow();
    }

    @Test
    @Tag("MMEM-2")
    @DisplayName("the survivor's shots still short of Hadur become the duel's firing waves")
    void wavesInFlightHandedOver() {
        HadurCore core = meleeToDuel(null);
        // A's two shots and B's one are in the melee's record; only A's tick-25 shot is short
        // of Hadur (70 of 400 px flown), the tick-1 shot passed it long ago.
        List<EnemyShot> shots = core.melee().tracker.shots(30);
        assertEquals(3, shots.size(), shots.toString());
        long unreached = shots.stream().filter(s -> s.shooter.equals(A)
            && s.travelled(30) < 400 - 25).count();
        assertEquals(1, unreached);
        assertEquals("H,0,30," + A + ",0,0," + unreached, record("H"));
    }

    @Test
    @Tag("MMEM-2")
    @DisplayName("the survivor's 1v1 profile is read for the duel and a melee battle writes no 1v1 profile")
    void profileReadNeverWritten() {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        ProfileLibrary library = new ProfileLibrary(store);
        library.save(library.load(A).profile());
        Map<String, byte[]> before = oneVOne(store);

        HadurCore core = meleeToDuel(store);
        core.tick(input(31, 1, List.of(scan(A, 0, 97))));
        core.roundEnded(32, "win", 100, 0);
        core.saveProfile(32);
        core.battleEnded(33);

        assertTrue(record("H").startsWith("H,0,30," + A + ",1,0,"), record("H"));
        Map<String, byte[]> after = oneVOne(store);
        assertEquals(before.keySet(), after.keySet());
        for (String name : before.keySet()) assertArrayEquals(before.get(name), after.get(name), name);
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("a save that fails at the last checkpoint still shows in the battle's closing count")
    void lastCheckpointFailuresCounted() {
        // Too small a store for any block: every save is skipped and counted.
        MemoryProfileStore store = new MemoryProfileStore(100);
        HadurCore core = meleeToDuel(store);
        core.roundEnded(31, "win", 100, 0);
        core.saveProfile(31);
        core.battleEnded(32);
        String last = telemetry.stream().filter(l -> l.contains(",melee-battle-failures,"))
            .reduce((x, y) -> y).orElseThrow();
        assertTrue(Integer.parseInt(last.substring(last.lastIndexOf(',') + 1)) >= 1, last);
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("a melee round's end writes each opponent's block, and the next battle finds it")
    void blocksWrittenAndFound() {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        HadurCore core = meleeToDuel(store);
        core.roundEnded(31, "win", 100, 0);
        core.saveProfile(31);
        for (String name : List.of("pkg.Alpha", "pkg.Beta", "pkg.Gamma")) {
            assertNotNull(store.read(MeleeMemory.fileName(name)), name);
        }
        MeleeProfile a = MeleeProfileCodec.decode(store.read(MeleeMemory.fileName("pkg.Alpha")));
        assertEquals(2, a.shotsInferred(), 1e-9);
        assertEquals(1.5, a.avgBulletPower(), 1e-6);
        assertEquals(1, a.typicalSurvivalRank(), 1e-9);
        MeleeProfile b = MeleeProfileCodec.decode(store.read(MeleeMemory.fileName("pkg.Beta")));
        assertEquals(3, b.typicalSurvivalRank(), 1e-9);
        assertTrue(oneVOne(store).isEmpty(), "no 1v1 profile: " + store.names());

        telemetry.clear();
        meleeToDuel(store);
        assertTrue(record("H").startsWith("H,0,30," + A + ",0,1,"), record("H"));
    }

    @Test
    @Tag("MMEM-2")
    @DisplayName("after the hand-off a dead robot's bullet is not credited to the survivor")
    void deadShootersHitIgnored() {
        HadurCore core = meleeToDuel(null);
        // B's bullet, fired before it died, hits Hadur. Had the ledger credited A with the
        // 6 energy it refunds, A's real 1.0 shot below would read as a 7.0 drop: no shot.
        core.tick(input(31, 1, List.of(new BotEvent.HitByBullet(B, 2.0, 500, 520, Math.PI))));
        core.tick(input(32, 1, List.of(scan(A, 0, 96))));
        assertEquals(1, core.stats().enemyShotsDetected);
        assertEquals(0, core.stats().phantomWaves);
        assertTrue(telemetry.stream().anyMatch(l -> l.startsWith("EW,0,32,")), telemetry.toString());
    }

    @Test
    @Tag("MMEM-2")
    @DisplayName("a duel from the start never hands anything over")
    void duelHasNoHandOff() {
        HadurCore core = new HadurCore(1000, 1000, 1, telemetry::add, new MemoryProfileStore(200_000));
        core.newRound(0);
        for (long t = 1; t < 5; t++) core.tick(input(t, 1, List.of(scan(A, 0, 100 - t))));
        core.roundEnded(5, "win", 100, 0);
        core.saveProfile(5);
        assertTrue(telemetry.stream().noneMatch(l -> l.startsWith("H,")), telemetry.toString());
    }

    private static Map<String, byte[]> oneVOne(MemoryProfileStore store) {
        return store.names().stream().filter(n -> !n.contains(".hm"))
            .collect(Collectors.toMap(n -> n, store::read, (x, y) -> x, TreeMap::new));
    }
}
