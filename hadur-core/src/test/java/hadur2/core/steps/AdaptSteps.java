package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.adapt.Opening;
import hadur2.core.memory.OpponentProfile;
import hadur2.core.memory.ProfileLibrary;
import hadur2.core.memory.Profiles;
import hadur2.core.memory.Seeds;
import hadur2.core.memory.Tiers;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.port.MemoryProfileStore;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AdaptSteps {

    private MemoryProfileStore store = new MemoryProfileStore(200_000);
    private OpponentProfile profile;
    private HadurCore core;
    private HadurCore other;
    private final List<String> telemetry = new ArrayList<>();
    private long time;

    private static BotInput input(int round, long time, List<BotEvent> events) {
        return new BotInput(time, round, 400, 300, 0, 4, 100, 3, 0.1, 0, 0, 0, 1, events);
    }

    private static BotEvent scan(String name) {
        return new BotEvent.Scan(name, 0.3, 300, 100, 0, 8);
    }

    private void save() {
        store = new MemoryProfileStore(200_000);
        new ProfileLibrary(store).save(profile);
    }

    @Given("no profile is stored")
    public void noProfile() {
        store = new MemoryProfileStore(200_000);
    }

    @Given("a stored profile of {string} with their hit rate {double}%, main rating {double}% and anti-surfer rating {double}%")
    public void storedProfile(String name, double theirs, double main, double antiSurfer) {
        profile = Profiles.tiers(Profiles.sample(name, 9, 0, 0), theirs / 100, main / 100, antiSurfer / 100);
        save();
    }

    @Given("a stored profile of {string} from {int} waves with their hit rate {double}%")
    public void thinProfile(String name, int waves, double theirs) {
        profile = Profiles.sample(name, 9, 0, 0);
        Profiles.evidence(profile, waves, theirs / 100);
        save();
    }

    @And("the stored profile holds {int} gun samples and {int} surf samples")
    public void seeds(int gun, int surf) {
        for (int i = 0; i < gun; i++) profile.addGunSample(Seeds.gun(Profiles.gunSample(i % 20 / 10.0 - 1, 1, 0)));
        for (int i = 0; i < surf; i++) profile.addSurfSample(Seeds.surf(Profiles.surfSample(i % 20 / 10.0 - 1)));
        save();
    }

    @When("Hadur first scans {string}")
    public void battleStarts(String name) {
        core = new HadurCore(800, 600, 1, telemetry::add, store);
        core.newRound(0);
        time = 1;
        core.tick(input(0, time, List.of(scan(name))));
    }

    @And("another battle's first scan of {string} comes in round {int} at tick {int}")
    public void anotherBattle(String name, int round, int tick) {
        MemoryProfileStore copy = new MemoryProfileStore(200_000);
        new ProfileLibrary(copy).save(profile);
        other = new HadurCore(800, 600, 1, l -> { }, copy);
        other.newRound(round);
        for (long t = 1; t < tick; t++) other.tick(input(round, t, List.of()));
        other.tick(input(round, tick, List.of(scan(name))));
    }

    @When("{int} more ticks pass")
    public void ticksPass(int n) {
        for (int i = 0; i < n; i++) core.tick(input(0, ++time, List.of()));
    }

    @Then("the profile's tiers are {string}")
    public void tiers(String label) {
        assertEquals(label, Tiers.label(core.profile()));
    }

    @Then("the opening gun is {string}")
    public void openingGun(String gun) {
        assertEquals(gun, core.opening().gun().name().toLowerCase(Locale.ROOT));
        assertTrue(telemetry.stream().anyMatch(l -> l.startsWith("P,0,1,opening-gun,") && l.endsWith(":" + gun)),
            telemetry.toString());
    }

    @Then("the danger views on include {string} and {string}")
    public void viewsInclude(String a, String b) {
        assertTrue(core.dangerViewsOn().containsAll(List.of(a, b)), core.dangerViewsOn().toString());
    }

    @Then("the danger views on are only {string}")
    public void viewsOnly(String view) {
        assertEquals(List.of(view), core.dangerViewsOn());
    }

    @Then("the seeds are still loading")
    public void stillLoading() {
        assertTrue(core.seedsLoading(), "900 samples do not all go in on the first scan's tick");
    }

    @Then("the seeds are loaded")
    public void loaded() {
        assertFalse(core.seedsLoading());
    }

    @And("both seeds weigh {double}")
    public void seedsWeigh(double w) {
        assertEquals(w, core.gunSeedWeight(), 1e-12);
        assertEquals(w, core.surfSeedWeight(), 1e-12);
    }

    @Then("both battles open the same way")
    public void sameOpening() {
        Opening a = core.opening();
        Opening b = other.opening();
        assertEquals(a.gun(), b.gun());
        assertEquals(a.gunTier(), b.gunTier());
        assertEquals(a.moveTier(), b.moveTier());
        assertEquals(a.flattenerFirst(), b.flattenerFirst());
        assertEquals(a.surfPrior().value(), b.surfPrior().value());
        assertEquals(core.dangerViewsOn(), other.dangerViewsOn());
    }

    @And("the enemy fires {int} bullets at Hadur and none hits")
    public void enemyMisses(int bullets) {
        double energy = 100;
        for (int shot = 0; shot < bullets; shot++) {
            for (int k = 0; k < 16; k++) {
                time++;
                if (k == 0) energy -= 0.5;
                core.tick(input(0, time, List.of(new BotEvent.Scan("abc.Shadow 3.83c", 0.3, 300, energy, 0, 0))));
            }
        }
    }

    @Then("the surf seed's weight fell to 0 within 20 waves of first falling")
    public void surfSeedFaded() {
        List<String> decays = new ArrayList<>();
        for (String l : telemetry) if (l.startsWith("P,") && l.contains(",surf-seed,")) decays.add(l);
        assertFalse(decays.isEmpty(), "the seed never lost weight");
        assertTrue(decays.size() <= 20, decays.size() + " decays");
        assertTrue(decays.get(decays.size() - 1).endsWith(",0.00"), decays.get(decays.size() - 1));
        assertEquals(0, core.surfSeedWeight());
    }

    @And("the surf prior was handed back to live data")
    public void priorDropped() {
        assertTrue(telemetry.stream().anyMatch(l -> l.startsWith("P,") && l.contains(",surf-prior,") && l.endsWith(",live")
            && !l.contains(",-,")), telemetry.stream().filter(l -> l.startsWith("P,")).toList().toString());
    }
}
