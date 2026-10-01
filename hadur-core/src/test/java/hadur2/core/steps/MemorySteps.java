package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.memory.OpponentProfile;
import hadur2.core.memory.ProfileCodec;
import hadur2.core.memory.ProfileLibrary;
import hadur2.core.memory.Profiles;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.port.MemoryProfileStore;
import hadur2.core.port.ProfileStore;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;

public class MemorySteps {

    private MemoryProfileStore store;
    private HadurCore core;
    private final List<String> telemetry = new ArrayList<>();
    private String opponent;
    private long time;
    private double enemyEnergy = 100;

    private static String file(String key) {
        return ProfileLibrary.fileName(key);
    }

    private OpponentProfile stored(String key) {
        return ProfileCodec.decode(store.read(file(key)));
    }

    private BotInput tick(List<BotEvent> events) {
        time++;
        return new BotInput(time, 0, 400, 300, 0, 4, 100, 0, 0.1, 0, 0, 0, 1, events);
    }

    private BotEvent scan() {
        return new BotEvent.Scan(opponent, 0.3, 300, enemyEnergy, 0, 8);
    }

    @Given("a store with no profiles")
    public void emptyStore() {
        store = new MemoryProfileStore(200_000);
    }

    @Given("a store holding a profile of {string} from battle {int}")
    public void storeHolding(String name, int battle) {
        store = new MemoryProfileStore(200_000);
        new ProfileLibrary(store).save(Profiles.sample(name, battle, 20, 10));
    }

    @And("the stored profile of {string} is damaged")
    public void damaged(String key) {
        byte[] bytes = store.read(file(key));
        bytes[bytes.length - 1] ^= 0x40;
        store.write(file(key), bytes);
    }

    @When("a battle starts and the first scan names {string}")
    public void battleStarts(String name) {
        opponent = name;
        core = new HadurCore(800, 600, 1, telemetry::add, store);
        core.newRound(0);
        core.tick(tick(List.of(scan())));
    }

    @Then("the profile for {string} is loaded before that tick's orders")
    public void loadedBeforeOrders(String key) {
        // tick() returned, so the orders exist; the profile was loaded by then.
        assertNotNull(core.profile());
        assertEquals(key, core.profile().key());
    }

    @And("it is stamped as fought in battle {int} and has {int} battles")
    public void stamped(int battle, int battles) {
        assertEquals(battle, core.profile().lastFought());
        assertEquals(battles, core.profile().battles());
    }

    @And("the B record says a profile was found")
    public void bRecordFound() {
        String b = telemetry.stream().filter(l -> l.startsWith("B,")).findFirst().orElseThrow();
        assertEquals("1", b.split(",")[6], b);
    }

    @And("the enemy is scanned {int} times and fires {int} shots, {int} of which hits us")
    public void enemyPlays(int scans, int shots, int hits) {
        for (int i = 1; i < scans; i++) {
            List<BotEvent> events = new ArrayList<>();
            if (i % 5 == 0 && shots > 0) {
                enemyEnergy -= 2;
                shots--;
            }
            events.add(scan());
            if (i == 5 && hits > 0) {
                events.add(new BotEvent.HitByBullet(opponent, 2, 400, 300, 0));
                hits--;
            }
            core.tick(tick(events));
        }
    }

    @And("the round ends in a win")
    public void roundEndsWin() {
        core.roundEnded(time, "win", 100, 0);
        core.saveProfile(time);
    }

    @And("the battle ends")
    public void battleEnds() {
        core.battleEnded(time);
    }

    @Then("the profile holds {int} round, {int} scans, {int} enemy shots and {int} hit on us")
    public void profileHolds(int rounds, int scans, int shots, int hits) {
        OpponentProfile p = core.profile();
        assertEquals(rounds, p.rounds());
        assertEquals(scans, p.scans(), 1e-6);
        assertEquals(shots, p.theirShots(), 1e-6);
        assertEquals((double) hits / shots, p.theirHitRate(), 1e-6);
    }

    @And("the battle's outcome so far is {int} win in {int} round")
    public void outcome(int wins, int rounds) {
        OpponentProfile.BattleOutcome o = core.profile().outcomes().get(0);
        assertEquals(wins, o.wins());
        assertEquals(rounds, o.rounds());
    }

    @Then("the store holds a profile of {string} with {int} round")
    public void storeHolds(String key, int rounds) {
        assertEquals(rounds, stored(key).rounds());
    }

    @And("no temporary copy is left")
    public void noTemp() {
        for (String n : store.names()) assertFalse(n.endsWith(ProfileLibrary.TMP_SUFFIX), n);
    }

    @And("the store is within its quota")
    public void withinQuota() {
        assertTrue(store.bytesUsed() <= store.quota());
    }

    @Then("the opponent is treated as a stranger")
    public void stranger() {
        assertEquals(1, core.profile().battles());
        assertEquals(0, core.profile().rounds());
    }

    @And("a load failure is recorded in a MEM record")
    public void loadFailureRecorded() {
        assertTrue(telemetry.stream().anyMatch(l -> l.startsWith("MEM,") && l.contains("load-failed")),
            telemetry.toString());
    }

    @Given("a nearly full store with seeded profiles fought in battles {int}, {int} and {int}")
    public void nearlyFull(int a, int b, int c) {
        int size = ProfileCodec.encode(Profiles.seedWorthy("x.Y", 1, 600, 300)).length;
        store = new MemoryProfileStore((long) ((4 * size + 200) / ProfileLibrary.EVICT_AT));
        ProfileLibrary lib = new ProfileLibrary(store);
        for (int battle : new int[] {a, b, c}) lib.save(Profiles.seedWorthy("bot.B" + battle, battle, 600, 300));
    }

    @When("a seeded profile from battle {int} is saved")
    public void saveSeeded(int battle) {
        assertEquals(ProfileLibrary.Saved.WRITTEN,
            new ProfileLibrary(store).save(Profiles.seedWorthy("bot.B" + battle, battle, 600, 300)));
    }

    @Then("the profile from battle {int} has no seeds but keeps its stats")
    public void noSeeds(int battle) {
        OpponentProfile p = stored("bot.B" + battle);
        assertEquals(0, p.gunSeedSize() + p.surfSeedSize());
        // Profiles.seedWorthy folds two battles, so the stats it keeps span both.
        assertEquals(2, p.rounds());
    }

    @And("the profile from battle {int} keeps its seeds")
    public void keepsSeeds(int battle) {
        assertEquals(600, stored("bot.B" + battle).gunSeedSize());
    }

    @And("the store is at most 90% full")
    public void ninetyPercent() {
        assertTrue(store.bytesUsed() <= store.quota() * ProfileLibrary.EVICT_AT);
    }

    @When("a newer profile's save is killed {}")
    public void killed(String where) {
        OpponentProfile next = Profiles.sample("abc.Shadow 3.83c", 8, 30, 10);
        int size = ProfileCodec.encode(next).length;
        int write;
        int cut;
        switch (where) {
            case "at the first byte of the temporary copy": write = 0; cut = 0; break;
            case "half way through the temporary copy": write = 0; cut = size / 2; break;
            case "half way through the profile": write = 1; cut = size / 2; break;
            case "at the last byte of the profile": write = 1; cut = size - 1; break;
            default: throw new IllegalArgumentException(where);
        }
        int start = store.writes();
        ProfileStore killer = new ProfileStore() {
            public byte[] read(String name) { return store.read(name); }
            public void write(String name, byte[] bytes) {
                if (store.writes() == start + write) store.crashAfter(cut);
                store.write(name, bytes);
            }
            public void delete(String name) { store.delete(name); }
            public List<String> names() { return store.names(); }
            public long bytesUsed() { return store.bytesUsed(); }
            public long quota() { return store.quota(); }
        };
        assertEquals(ProfileLibrary.Saved.FAILED, new ProfileLibrary(killer).save(next));
    }

    @Then("the next battle loads a profile of {string} without a failure")
    public void nextBattleLoads(String key) {
        ProfileLibrary.Loaded loaded = new ProfileLibrary(store).load(key);
        assertTrue(loaded.found());
        assertNull(loaded.failure());
    }
}
