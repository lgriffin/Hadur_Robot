package hadurling.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadurling.core.gun.HeadOnGun;
import hadurling.core.memory.LineageKey;
import hadurling.core.memory.Profile;
import hadurling.core.memory.ProfileLibrary;
import hadurling.core.policy.Evidence;
import hadurling.core.port.MemoryProfileStore;
import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The core needs no engine: build an Input by hand and read the Orders. */
class CoreTest {

    private static Input input(long time, double gunHeat, Event... events) {
        return new Input(time, 400, 300, 0, 0, 100, gunHeat, 0, 0, List.of(events));
    }

    private static Event.Scan enemyAhead() {
        return new Event.Scan("foe", 0, 200, 100, 0, 0);
    }

    @Test
    @DisplayName("before it has seen the enemy, the core sweeps the radar")
    void sweepsWhenBlind() {
        Orders o = new Core().tick(input(1, 0));
        assertEquals(Double.POSITIVE_INFINITY, o.radarTurn());
        assertEquals(0, o.firePower());
    }

    @Test
    @DisplayName("with the enemy dead ahead it turns side-on and fires when the gun is cool")
    void firesAtEnemyAhead() {
        Orders o = new Core().tick(input(1, 0, enemyAhead()));
        assertEquals(Math.PI / 2, o.bodyTurn(), 1e-12);
        assertEquals(HeadOnGun.POWER, o.firePower());
        assertEquals(0, o.gunTurn(), 1e-12);
    }

    @Test

    @Tag("HL-4")
    @DisplayName("a hot gun does not fire")
    void hotGunHoldsFire() {
        assertEquals(0, new Core().tick(input(1, 0.4, enemyAhead())).firePower());
    }

    @Test

    @Tag("HL-3")
    @DisplayName("the radar overshoots the enemy to keep it in view")
    void radarOvershoots() {
        Event.Scan right = new Event.Scan("foe", Math.PI / 4, 200, 100, 0, 0);
        Orders o = new Core().tick(input(1, 0, right));
        assertEquals(Math.PI / 2, o.radarTurn(), 1e-12);
    }

    @Test

    @Tag("HL-5")
    @DisplayName("a wall hit reverses the direction of travel")
    void wallHitReverses() {
        Core core = new Core();
        assertTrue(core.tick(input(1, 0)).ahead() > 0);
        assertTrue(core.tick(input(2, 0, new Event.HitWall(0))).ahead() < 0);
    }

    private static Input scanned(long time, double enemyEnergy) {
        return input(time, 0.4, new Event.Scan("foe", 0, 200, enemyEnergy, 0, 0));
    }

    @Test
    @Tag("HL-13")
    @DisplayName("an energy drop the ledger cannot explain gives the surfer a wave")
    void energyDropIsAShot() {
        Core core = new Core();
        core.tick(scanned(1, 100));
        assertEquals(0, core.enemyWaves());
        core.tick(scanned(2, 98.5));
        assertEquals(1, core.enemyWaves());
    }

    @Test
    @Tag("HL-13")
    @DisplayName("a drop smaller than 0.1 or bigger than 3.0 is not a bullet")
    void otherDropsAreNot() {
        Core core = new Core();
        core.tick(scanned(1, 100));
        core.tick(scanned(2, 99.95));
        core.tick(scanned(3, 96.0));
        assertEquals(0, core.enemyWaves());
    }

    @Test
    @DisplayName("an enemy seen again after a long gap is not compared with a stale energy")
    void staleScanIsIgnored() {
        Core core = new Core();
        core.tick(scanned(1, 100));
        core.tick(scanned(50, 98));
        assertEquals(0, core.enemyWaves());
    }

    @Test
    @Tag("HL-16")
    @DisplayName("our own hit explains the drop: no wave")
    void ourHitIsNotAShot() {
        Core core = new Core();
        core.tick(scanned(1, 100));
        core.tick(input(2, 0.4, new Event.BulletHit("foe", 0.5), new Event.Scan("foe", 0, 200, 98, 0, 0)));
        assertEquals(0, core.enemyWaves());
    }

    @Test
    @Tag("HL-16")
    @DisplayName("our hit and its shot in one interval: the shot still makes a wave")
    void shotBehindOurHit() {
        Core core = new Core();
        core.tick(scanned(1, 100));
        core.tick(input(2, 0.4, new Event.BulletHit("foe", 0.5), new Event.Scan("foe", 0, 200, 96.5, 0, 0)));
        assertEquals(1, core.enemyWaves());
    }

    @Test
    @Tag("HL-16")
    @DisplayName("its bullet hitting us refunds energy, which must not hide its shot")
    void refundDoesNotHideAShot() {
        Core core = new Core();
        core.tick(scanned(1, 100));
        core.tick(input(2, 0.4, new Event.HitByBullet("foe", 2.0), new Event.Scan("foe", 0, 200, 104, 0, 0)));
        assertEquals(1, core.enemyWaves());
    }

    /** Plays {@code ticks} ticks against an enemy dead ahead whom we can always shoot at. */
    private static void play(Core core, int ticks) {
        for (int t = 1; t <= ticks; t++) {
            core.tick(input(t, 0, new Event.Scan("abc.Foe 1.0 (2)", 0, 200, 100, 0, 0)));
        }
    }

    @Test
    @Tag("HL-23")
    @DisplayName("a round teaches a profile, and the next core starts with its seed")
    void remembersAnOpponent() {
        MemoryProfileStore store = new MemoryProfileStore(100_000);
        ProfileLibrary library = new ProfileLibrary(store);

        Core first = new Core(library);
        play(first, 40);
        first.roundEnded();

        Profile saved = library.load(LineageKey.of("abc.Foe 1.0 (2)"));
        assertEquals("abc.Foe", saved.key());
        assertEquals(1, saved.rounds());
        assertTrue(saved.ourShots() > 0, "the waves that reached the enemy were counted");
        assertTrue(saved.seed().size() > 0, "the gun's samples were kept");

        Core second = new Core(library);
        second.tick(input(1, 0.4, new Event.Scan("abc.Foe 1.0", 0, 200, 100, 0, 0)));
        assertEquals(saved.seed().size(), second.gunSamples());
    }

    @Test
    @Tag("HL-23")
    @DisplayName("without a library the core remembers nothing and roundEnded is harmless")
    void noLibraryNoMemory() {
        Core core = new Core();
        play(core, 5);
        core.roundEnded();
        assertEquals(0, new Core().gunSamples());
    }

    @Test
    @Tag("HL-23")
    @DisplayName("a store that is full costs the lesson, not an exception")
    void fullStoreDoesNotThrow() {
        ProfileLibrary library = new ProfileLibrary(new MemoryProfileStore(0));
        Core core = new Core(library);
        play(core, 40);
        core.roundEnded();
        assertEquals(1, library.saveFailures());
    }

    /** Evidence in which we hit 40 of 100 shots and they hit none: certain on both counts. */
    private static Evidence certainEvidence() {
        Evidence evidence = new Evidence();
        evidence.against("foe");
        for (int i = 0; i < 100; i++) {
            evidence.ours().record(i < 40);
            evidence.theirs().record(false);
        }
        return evidence;
    }

    @Test
    @Tag("HL-32")
    @DisplayName("when both hit rates are certain, the core fires full power")
    void firesFullPowerOnCertainEvidence() {
        Orders o = new Core(null, certainEvidence()).tick(input(1, 0, enemyAhead()));
        assertEquals(3.0, o.firePower(), 0);
    }

    @Test
    @Tag("HL-32")
    @DisplayName("with no evidence yet, or after the opponent changes, it fires the gun's own power")
    void firesTheGunsPowerOtherwise() {
        assertEquals(HeadOnGun.POWER, new Core().tick(input(1, 0, enemyAhead())).firePower(), 0);
        Evidence evidence = certainEvidence();
        evidence.against("someone-else");
        assertEquals(HeadOnGun.POWER, new Core(null, evidence).tick(input(1, 0, new Event.Scan("foe", 0, 200, 100, 0, 0))).firePower(), 0);
    }

    /** A library whose profile for "abc.Foe" holds eight samples that all say "+0.6". */
    private static ProfileLibrary libraryWithASeed() {
        java.util.List<float[]> seed = new java.util.ArrayList<>();
        for (int i = 0; i < 8; i++) seed.add(new float[] {0f, 0.25f, 0.6f});
        ProfileLibrary library = new ProfileLibrary(new MemoryProfileStore(100_000));
        library.save(new Profile("abc.Foe", 1, 0, 0, 0, 0, seed));
        return library;
    }

    private static Input foeAhead(long time, Event... extra) {
        java.util.List<Event> events = new java.util.ArrayList<>();
        events.add(new Event.Scan("abc.Foe 1.0", 0, 200, 100, 0, 0));
        events.addAll(java.util.List.of(extra));
        return new Input(time, 400, 300, 0, 0, 100, 0.4, 0, 0, events);
    }

    @Test
    @Tag("HL-38")
    @DisplayName("at full computation the seeded gun aims where the profile says; after three skipped turns it aims head-on")
    void sheddingTurnsOffTheTree() {
        double learned = new Core(libraryWithASeed()).tick(foeAhead(1)).gunTurn();
        assertEquals(0.6 * hadurling.core.physics.Rules.maxEscapeAngle(1.0), learned, 1e-6);

        Core slow = new Core(libraryWithASeed());
        slow.tick(foeAhead(1, new Event.SkippedTurn()));
        slow.tick(foeAhead(2, new Event.SkippedTurn()));
        Orders last = slow.tick(foeAhead(3, new Event.SkippedTurn()));
        assertEquals(3, slow.level());
        assertEquals(0, last.gunTurn(), 1e-12);
    }

    @Test
    @Tag("HL-36")
    @DisplayName("a slow measurement sheds a level for one tick, a fast one gives it back")
    void tickTimeEventsDriveTheLevel() {
        Core core = new Core();
        core.tick(foeAhead(1, new Event.TickTime(5_000_000L)));
        assertEquals(1, core.level());
        core.tick(foeAhead(2, new Event.TickTime(100_000L)));
        assertEquals(0, core.level());
    }

    @Test
    @Tag("HL-37")
    @DisplayName("a skipped turn lowers the level for the rest of the round")
    void skippedTurnEventLowersTheLevel() {
        Core core = new Core();
        core.tick(foeAhead(1, new Event.SkippedTurn()));
        core.tick(foeAhead(2));
        assertEquals(1, core.level());
    }
}
