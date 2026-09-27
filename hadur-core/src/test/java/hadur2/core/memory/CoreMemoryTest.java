package hadur2.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.port.MemoryProfileStore;
import hadur2.core.port.Telemetry;
import hadur2.core.replay.Fixtures;
import hadur2.core.replay.Replay;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** Opponent memory as the core drives it: load, fold, save. */
class CoreMemoryTest {

    static final String SHADOW = "abc.Shadow 3.83c";

    static BotInput scan(long time, String name) {
        return new BotInput(time, 0, 400, 300, 0, 4, 100, 0, 0.1, 0, 0, 0, 1,
            List.of(new BotEvent.Scan(name, 0.3, 300, 100, 0, 8)));
    }

    static MemoryProfileStore storeWith(OpponentProfile p) {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        new ProfileLibrary(store).save(p);
        return store;
    }

    @Test
    @Tag("MEM-1")
    @DisplayName("the first scan loads the profile before that tick's orders, and B says so")
    void firstScanLoads() {
        MemoryProfileStore store = storeWith(Profiles.sample(SHADOW, 9, 0, 0));
        List<String> telemetry = new ArrayList<>();
        HadurCore core = new HadurCore(800, 600, 1, telemetry::add, store);
        core.newRound(0);
        core.tick(new BotInput(1, 0, 400, 300, 0, 0, 100, 3, 0.1, 0, 0, 0, 1, List.of()));
        assertNull(core.profile(), "nothing is loaded before a scan");

        core.tick(scan(2, "abc.Shadow 3.84"));
        OpponentProfile p = core.profile();
        assertNotNull(p);
        assertEquals(2, p.battles());
        assertEquals(10, p.lastFought());
        String b = telemetry.stream().filter(l -> l.startsWith("B,")).findFirst().orElseThrow();
        assertEquals("B,0,2,10,abc.Shadow 3.84,abc.Shadow,1,T?/M?,0,0,0", b);
    }

    @Test
    @Tag("MEM-2")
    @DisplayName("a round's end folds its statistics into the profile")
    void roundEndFolds() {
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE, new MemoryProfileStore(200_000));
        core.newRound(0);
        for (long t = 1; t <= 30; t++) core.tick(scan(t, SHADOW));
        assertEquals(0, core.profile().rounds());
        core.roundEnded(31, "win", 100, 0);
        OpponentProfile p = core.profile();
        assertEquals(1, p.rounds());
        assertEquals(30, p.scans(), 1e-6);
        assertEquals(1, p.outcomes().get(0).wins());
    }

    @Test
    @Tag("MEM-3")
    @DisplayName("a checkpoint and the battle's end persist the profile")
    void saves() {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE, store);
        core.newRound(0);
        core.tick(scan(1, SHADOW));
        core.roundEnded(2, "loss", 0, 0);
        core.saveProfile(2);
        OpponentProfile saved = ProfileCodec.decode(store.read(ProfileLibrary.fileName("abc.Shadow")));
        assertEquals(1, saved.rounds());
        core.newRound(1);
        core.tick(scan(3, SHADOW));
        core.roundEnded(4, "win", 50, 0);
        core.battleEnded(4);
        saved = ProfileCodec.decode(store.read(ProfileLibrary.fileName("abc.Shadow")));
        assertEquals(2, saved.rounds());
        assertEquals(1, saved.battles(), "one battle, however many checkpoints");
    }

    @Test
    @Tag("MEM-4")
    @DisplayName("a damaged profile is a stranger, recorded in MEM and R records")
    void damagedProfileRecorded() {
        MemoryProfileStore store = storeWith(Profiles.sample(SHADOW, 9, 0, 0));
        String file = ProfileLibrary.fileName("abc.Shadow");
        byte[] bytes = store.read(file);
        bytes[10] ^= 1;
        store.write(file, bytes);
        List<String> telemetry = new ArrayList<>();
        HadurCore core = new HadurCore(800, 600, 1, telemetry::add, store);
        core.newRound(0);
        core.tick(scan(1, SHADOW));
        assertEquals(1, core.profile().battles(), "fresh profile");
        assertTrue(telemetry.stream().anyMatch(l -> l.startsWith("MEM,0,1,load-failed,")), telemetry.toString());
        assertTrue(telemetry.stream().anyMatch(l -> l.startsWith("B,") && l.contains(",abc.Shadow,0,")));
        core.roundEnded(2, "win", 100, 0);
        String[] r = telemetry.get(telemetry.size() - 1).split(",");
        assertEquals("R", r[0]);
        assertEquals("1", r[16], "load failures in the R record (RES-5)");
    }

    @Test
    @Tag("RES-5")
    @DisplayName("memory counters are R fields 16 to 18")
    void rRecordCarriesMemoryCounters() {
        MemoryProfileStore store = new MemoryProfileStore(300);
        List<String> telemetry = new ArrayList<>();
        HadurCore core = new HadurCore(800, 600, 1, telemetry::add, store);
        core.newRound(0);
        core.tick(scan(1, SHADOW));
        core.roundEnded(2, "win", 100, 0);
        core.saveProfile(2);
        core.newRound(1);
        core.roundEnded(3, "win", 100, 0);
        String[] r = telemetry.get(telemetry.size() - 1).split(",");
        assertEquals(28, r.length);
        assertEquals("1", r[17], "the save that could not fit a 300-byte quota");
        assertTrue(telemetry.stream().anyMatch(l -> l.startsWith("MEM,0,2,skipped,")), telemetry.toString());
    }

    @Test
    @DisplayName("melee battles neither load nor save profiles")
    void meleeKeepsNoMemory() {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        HadurCore core = new HadurCore(1000, 1000, 3, Telemetry.NONE, store);
        core.newRound(0);
        for (long t = 1; t <= 5; t++) {
            core.tick(new BotInput(t, 0, 500, 500, 0, 0, 100, 3, 0.1, 0, 0, 0, 3,
                List.of(new BotEvent.Scan("sample.Crazy (" + t % 3 + ")", 0.3, 300, 100, 0, 8))));
        }
        core.roundEnded(6, "win", 100, 0);
        core.battleEnded(6);
        assertNull(core.profile());
        assertEquals(0, store.writes());
    }

    @Test
    @Tag("CORE-2")
    @Tag("DIAL-1")
    @DisplayName("a profile too thin to name a tier, with no seeds, changes no order against Shadow")
    void thinProfileChangesNoOrders() {
        MemoryProfileStore store = storeWith(Profiles.sample(SHADOW, 41, 0, 0));
        List<String> lines = Fixtures.lines(Fixtures.DIR.resolve("abc.Shadow_3.83c.txt.gz"));
        List<String> telemetry = new ArrayList<>();
        List<Replay.Tick> ticks = Replay.run(lines, telemetry::add, store);
        for (Replay.Tick t : ticks) {
            assertEquals(t.recorded(), t.replayed(), "line " + t.line());
        }
        assertTrue(telemetry.stream().anyMatch(l -> l.startsWith("B,") && l.contains(",abc.Shadow,1,T?/M?,")),
            "the replay did load the stored profile, and it named no tier");
        assertTrue(telemetry.stream().anyMatch(l -> l.startsWith("P,") && l.endsWith(",opening-gun,-,-,UNKNOWN:live")),
            telemetry.stream().filter(l -> l.startsWith("P,")).toList().toString());
    }

    @Test
    @Tag("ADAPT-1")
    @DisplayName("a profile with named tiers and seeds changes the orders against Shadow")
    void knownProfileChangesOrders() {
        OpponentProfile p = Profiles.sample(SHADOW, 41, 0, 0);
        Profiles.tiers(p, 0.16, 0.12, 0.22);
        MemoryProfileStore store = storeWith(p);
        List<String> lines = Fixtures.lines(Fixtures.DIR.resolve("abc.Shadow_3.83c.txt.gz"));
        List<String> telemetry = new ArrayList<>();
        List<Replay.Tick> ticks = Replay.run(lines, telemetry::add, store);
        assertTrue(ticks.stream().anyMatch(t -> !t.recorded().equals(t.replayed())),
            "an M2 profile opens on the anti-surfer gun, so some order must differ");
        assertTrue(telemetry.stream().anyMatch(l -> l.startsWith("P,") && l.endsWith(",opening-gun,-,-,M2:anti_surfer")),
            telemetry.stream().filter(l -> l.startsWith("P,")).toList().toString());
    }
}
