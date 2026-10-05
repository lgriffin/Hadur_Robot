package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.ProfileLibrary;
import hadur2.core.model.BattleFacts;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.port.MemoryProfileStore;
import hadur2.core.port.ProfileStore;
import hadur2.core.role.Charter;
import hadur2.core.role.RoleId;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** SHELF-1, SHELF-3: the Archive's shelves by charter, behind the store's gate (A4). */
class ArchiveTest {

    @Test
    @Tag("SHELF-1")
    @DisplayName("SHELF-1: each file belongs to one strand's shelf, or to the conductor")
    void shelvesByFileName() {
        assertEquals(RoleId.DUEL, Archive.shelfOf("pkg.Bot~3.hp"));
        assertEquals(RoleId.DUEL, Archive.shelfOf("pkg.Bot~3.hp.tmp"));
        assertEquals(RoleId.DUEL, Archive.shelfOf(ProfileLibrary.CLOCK));
        assertEquals(RoleId.MELEE, Archive.shelfOf("pkg.Bot.hm"));
        assertEquals(RoleId.MELEE, Archive.shelfOf("pkg.Bot.hm.tmp"));
        assertEquals(RoleId.TEAM, Archive.shelfOf("pkg.Bot.ht"));
        assertNull(Archive.shelfOf("health.hc"));
    }

    @Test
    @Tag("SHELF-3")
    @DisplayName("SHELF-3: a charter's battle writes its own shelf and the conductor's files, nothing else")
    void writesByCharter() {
        assertTrue(Archive.mayWrite(Charter.DUEL, "a.hp"));
        assertFalse(Archive.mayWrite(Charter.DUEL, "a.hm"));
        assertFalse(Archive.mayWrite(Charter.MELEE, "a.hp"));
        assertFalse(Archive.mayWrite(Charter.MELEE, ProfileLibrary.CLOCK));
        assertTrue(Archive.mayWrite(Charter.MELEE, "a.hm"));
        assertFalse(Archive.mayWrite(Charter.TEAM, "a.hp"));
        assertFalse(Archive.mayWrite(Charter.TEAM, "a.hm"));
        assertTrue(Archive.mayWrite(Charter.TEAM, "a.ht"));
        for (Charter c : Charter.values()) assertTrue(Archive.mayWrite(c, "health.hc"), c.toString());
    }

    @Test
    @Tag("SHELF-3")
    @DisplayName("SHELF-3: a delete the gate refuses never reaches the store, and is counted")
    void gateRefusesQuietly() {
        MemoryProfileStore store = new MemoryProfileStore(10_000);
        store.write("x.hp", new byte[] {1});
        Archive archive = new Archive(store, Charter.MELEE);
        archive.store().delete("x.hp");
        archive.store().write("y.hp", new byte[] {2});
        assertNotNull(store.read("x.hp"));
        assertNull(store.read("y.hp"));
        assertEquals(2, archive.gated());
        assertEquals(1, archive.store().read("x.hp")[0], "reads pass the gate");
        assertFalse(archive.writes(RoleId.DUEL));
        assertTrue(archive.writes(RoleId.MELEE));
    }

    private static BotInput input(long time, int others, List<BotEvent> events) {
        return new BotInput(time, 0, 500, 500, 0, 0, 100, 0, 0.1, 0, 0, 0, others, events);
    }

    /** One round against {@code names}, saved at its end as the adapter saves it; the files left. */
    private static List<String> fight(BattleFacts facts, String... names) {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        HadurCore core = new HadurCore(facts, line -> {}, store);
        core.prepareMemory();
        core.newRound(0);
        for (long t = 1; t <= 40; t++) {
            List<BotEvent> scans = new ArrayList<>();
            for (int i = 0; i < names.length; i++) {
                scans.add(new BotEvent.Scan(names[i], i * 2.0, 300 + 50 * i, 100 - t * 0.1, 0, 0));
            }
            core.tick(input(t, names.length, scans));
        }
        core.roundEnded(41, "draw", 50, 0);
        core.checkpoint(41);
        core.battleEnded(42);
        core.writeBattleHealth(1, 1, 0, 0);
        return files(store);
    }

    private static List<String> files(ProfileStore store) {
        return store.names().stream().sorted().collect(Collectors.toList());
    }

    private static boolean has(List<String> files, String suffix) {
        return files.stream().anyMatch(f -> f.endsWith(suffix));
    }

    @Test
    @Tag("SHELF-3")
    @DisplayName("SHELF-3: a duel writes .hp only, a melee .hm only, a team battle neither")
    void eachCharterWritesItsOwnShelf() {
        List<String> duel = fight(BattleFacts.solo(1000, 1000, 1), "pkg.A 1.0");
        assertTrue(has(duel, ".hp") && !has(duel, ".hm"), duel.toString());
        List<String> melee = fight(BattleFacts.solo(1000, 1000, 3), "pkg.A 1.0", "pkg.B 1.0", "pkg.C 1.0");
        assertTrue(has(melee, ".hm") && !has(melee, ".hp") && !melee.contains(ProfileLibrary.CLOCK),
            melee.toString());
        BattleFacts team = new BattleFacts(1000, 1000, 3, List.of("hadur2.Hadur (2)"), "hadur2.Hadur (1)", 200, 0);
        List<String> teamFiles = fight(team, "pkg.A 1.0", "pkg.B 1.0", "hadur2.Hadur (2)");
        assertEquals(List.of("health.hc"), teamFiles, "the health record is the conductor's");
    }
}
