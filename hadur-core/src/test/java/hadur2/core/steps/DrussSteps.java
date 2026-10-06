package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.memory.ProfileLibrary;
import hadur2.core.memory.Profiles;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.physics.Rules;
import hadur2.core.port.MemoryProfileStore;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;

/** Drives the D1 scenarios of the DrussGT route: POW-7 to POW-11, ADAPT-5. */
public class DrussSteps {

    private static final String ENEMY = "abc.Shadow 3.83c";
    private static final double BEARING = 0.3;

    private MemoryProfileStore store = new MemoryProfileStore(200_000);
    private HadurCore core;
    private final List<String> telemetry = new ArrayList<>();
    private BotOrders last;
    private long time;
    private double ourEnergy = 100;
    private double enemyEnergy = 100;
    private double distance = 400;
    private double enemyVelocity;

    private BotInput input(double gunHeat, List<BotEvent> events) {
        return new BotInput(++time, 0, 400, 300, 0, 4, ourEnergy, gunHeat, 0.1, 0, 0, 0, 1, events);
    }

    private BotEvent scan() {
        return new BotEvent.Scan(ENEMY, BEARING, distance, enemyEnergy, 0, enemyVelocity);
    }

    private void tick(double gunHeat, List<BotEvent> events) {
        last = core.tick(input(gunHeat, events));
    }

    private void start() {
        core = new HadurCore(800, 600, 1, telemetry::add, store);
        core.newRound(0);
        time = 0;
        tick(3, List.of(scan()));
    }

    @Given("a duel at {int} px in which Hadur has {double} energy and the enemy {int}")
    public void duelAtDistance(int px, double ours, int theirs) {
        distance = px;
        duelWithEnergies(ours, theirs);
    }

    @Given("a duel in which Hadur has {double} energy and the enemy {double}")
    public void duelAtFourHundred(double ours, double theirs) {
        distance = 400;
        duelWithEnergies(ours, theirs);
    }

    private void duelWithEnergies(double ours, double theirs) {
        store = new MemoryProfileStore(200_000);
        ourEnergy = ours;
        enemyEnergy = theirs;
        start();
    }

    @Given("Hadur remembers the enemy with the lead-aware verdict {word}, and has {int} energy against {int}")
    public void remembersVerdict(String verdict, int ours, int theirs) {
        distance = 400;
        store = new MemoryProfileStore(200_000);
        new ProfileLibrary(store).save(
            Profiles.leadAware(Profiles.sample(ENEMY, 9, 0, 0), verdict.equals("standing")));
        ourEnergy = ours;
        enemyEnergy = theirs;
        start();
    }

    @Given("Hadur remembers the enemy as a bullet shielder, and has {int} energy against {int}")
    public void remembersShielder(int ours, int theirs) {
        distance = 400;
        store = new MemoryProfileStore(200_000);
        new ProfileLibrary(store).save(Profiles.shielder(Profiles.sample(ENEMY, 9, 0, 0), true));
        ourEnergy = ours;
        enemyEnergy = theirs;
        start();
    }

    @When("the enemy moves for {int} ticks")
    public void enemyMoves(int ticks) {
        enemyVelocity = 6;
        for (int i = 0; i < ticks; i++) tick(3, List.of(scan()));
        enemyVelocity = 0;
    }

    @When("one of Hadur's bullets is destroyed by an enemy bullet")
    public void bulletDestroyed() {
        List<BotEvent> events = new ArrayList<>();
        events.add(new BotEvent.BulletHitBullet(1.0, 400, 300, 0.5));
        events.add(scan());
        tick(3, events);
    }

    @When("the enemy fires a {double} bullet")
    public void enemyFires(double power) {
        enemyEnergy -= power;
        tick(3, List.of(scan()));
    }

    @When("the round and the battle end")
    public void battleEnds() {
        core.roundEnded(time, "win", ourEnergy, 0);
        core.battleEnded(time);
    }

    /**
     * Each wave is 16 ticks: the enemy fires {@code enemyPower} on the first tick, and on the
     * ninth one of Hadur's bullets resolves: a hit ({@code hits} in every {@code every}, and the
     * enemy loses the damage) or a miss. The enemy's bullets all miss.
     */
    @When("for {int} enemy waves of power {double} Hadur's {double} bullets hit {int} in {int} and the enemy's all miss")
    public void exchange(int waves, double enemyPower, double ourPower, int hits, int every) {
        for (int wave = 0; wave < waves; wave++) {
            boolean hit = wave % every < hits;
            for (int k = 0; k < 16; k++) {
                List<BotEvent> events = new ArrayList<>();
                if (k == 0) enemyEnergy -= enemyPower;
                if (k == 8) {
                    if (hit) {
                        enemyEnergy -= Rules.getBulletDamage(ourPower);
                        events.add(new BotEvent.BulletHit(ENEMY, ourPower, enemyEnergy));
                    } else {
                        events.add(new BotEvent.BulletMissed(ourPower));
                    }
                }
                events.add(scan());
                tick(3, events);
            }
        }
    }

    @And("{int} quiet ticks pass so the last waves break")
    public void quiet(int ticks) {
        for (int i = 0; i < ticks; i++) tick(3, List.of(scan()));
    }

    @When("Hadur scans the enemy for {int} ticks with a cool gun on target")
    public void coolGun(int ticks) {
        for (int i = 0; i < ticks; i++) tick(0, List.of(scan()));
    }

    @Then("Hadur's battle record has {int} bullets in power class {int}, {int} of them hits, and the enemy's has {int} with {int} hits")
    public void battleCounts(int ours, int powerClass, int ourHits, int theirs, int theirHits) {
        assertEquals(ours, core.ourBattleRates().shots(powerClass), "our bullets in class " + powerClass);
        assertEquals(ourHits, core.ourBattleRates().hits(powerClass), "our hits in class " + powerClass);
        assertEquals(theirs, core.theirBattleRates().shots(powerClass), "their bullets in class " + powerClass);
        assertEquals(theirHits, core.theirBattleRates().hits(powerClass), "their hits in class " + powerClass);
    }

    @Then("each robot's rate over all its bullets carries a margin of error")
    public void margins() {
        assertTrue(core.ourBattleRates().estimate().margin() < 1.0);
        assertTrue(core.theirBattleRates().estimate().margin() < 1.0);
        assertEquals(core.ourBattleRates().shots(), core.ourBattleRates().shots(0)
            + core.ourBattleRates().shots(1) + core.ourBattleRates().shots(2));
    }

    @Then("the round record counts {int} of our bullets and {int} of theirs in power class {int}")
    public void roundRecord(int ours, int theirs, int powerClass) {
        core.roundEnded(time, "win", ourEnergy, 0);
        String[] r = telemetry.get(telemetry.size() - 1).split(",");
        assertEquals("R", r[0]);
        assertEquals(48, r.length);
        assertEquals(String.valueOf(ours), r[36 + 2 * powerClass], "our bullets, class " + powerClass);
        assertEquals(String.valueOf(theirs), r[42 + 2 * powerClass], "their bullets, class " + powerClass);
    }

    @Then("the lead-aware regime is on")
    public void regimeOn() {
        assertTrue(lastLeadRecord().endsWith(",lead_on"), lastLeadRecord());
    }

    @Then("the lead-aware regime is off")
    public void regimeOff() {
        String rec = lastLeadRecord();
        assertTrue(rec.isEmpty() || rec.endsWith(",lead_off"), rec);
    }

    private String lastLeadRecord() {
        String found = "";
        for (String l : telemetry) if (l.startsWith("P,") && l.contains(",lead,")) found = l;
        return found;
    }

    @Then("the shot fired went out at power {double}")
    public void firedPower(double power) {
        assertEquals(power, last.firePower(), 1e-9);
    }

    @Then("the shot fired went out above power {double}")
    public void firedAbove(double power) {
        assertTrue(last.firePower() > power, "fired " + last.firePower());
    }

    @Then("the shot fired went out below power {double}")
    public void firedBelow(double power) {
        assertTrue(last.firePower() > 0 && last.firePower() < power, "fired " + last.firePower());
    }

    @Then("the enemy is treated as a bullet shielder")
    public void treatedAsShielder() {
        assertTrue(shieldRecords() > 0 || core.stats().jitteredShots > 0, "no shielder verdict");
    }

    @Then("the enemy is not treated as a bullet shielder")
    public void notTreatedAsShielder() {
        assertEquals(0, shieldRecords());
        assertEquals(0, core.stats().jitteredShots);
    }

    private long shieldRecords() {
        return telemetry.stream().filter(l -> l.startsWith("P,") && l.contains(",shield,")).count();
    }

    @Then("a shot went out with an anti-shield aim offset")
    public void jittered() {
        assertTrue(core.stats().jitteredShots > 0, "jittered shots " + core.stats().jitteredShots);
    }

    @Then("no shot went out with an anti-shield aim offset")
    public void notJittered() {
        assertEquals(0, core.stats().jitteredShots);
    }

    @Then("the profile on disk records the enemy as a bullet shielder")
    public void profileRecordsShielder() {
        assertTrue(new ProfileLibrary(store).load(ENEMY).profile().shielder());
    }

    @Then("the profile on disk does not record the enemy as a bullet shielder")
    public void profileDoesNotRecordShielder() {
        assertFalse(new ProfileLibrary(store).load(ENEMY).profile().shielder());
    }

    @Then("a shot went out")
    public void aShotWentOut() {
        assertTrue(last.firePower() > 0, "fired " + last.firePower());
    }

    @Then("no shot went out")
    public void noShotWentOut() {
        assertFalse(last.firePower() > 0, "fired " + last.firePower());
    }
}
