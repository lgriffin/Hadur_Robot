package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.memory.Estimate;
import hadur2.core.memory.ProfileLibrary;
import hadur2.core.memory.Profiles;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.policy.DistancePolicy;
import hadur2.core.port.MemoryProfileStore;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/** Drives the core through the S5 scenarios: DIST-1, POW-1, POW-2, END-1, END-2. */
public class AggressionSteps {

    private static final String ENEMY = "abc.Shadow 3.83c";
    private static final double BEARING = 0.3;

    private MemoryProfileStore store = new MemoryProfileStore(200_000);
    private HadurCore core;
    private final List<String> telemetry = new ArrayList<>();
    private BotOrders last;
    private long time;
    private double enemyEnergy = 100;

    private static BotInput input(long time, double energy, double gunHeat, List<BotEvent> events) {
        return new BotInput(time, 0, 400, 300, 0, 4, energy, gunHeat, 0.1, 0, 0, 0, 1, events);
    }

    private BotEvent scan(String name) {
        return new BotEvent.Scan(name, BEARING, 300, enemyEnergy, 0, 0);
    }

    private void start() {
        core = new HadurCore(800, 600, 1, telemetry::add, store);
        core.newRound(0);
        time = 0;
    }

    private BotOrders tick(double energy, double gunHeat, List<BotEvent> events) {
        last = core.tick(input(++time, energy, gunHeat, events));
        return last;
    }

    @Given("a duel against a stranger")
    public void stranger() {
        store = new MemoryProfileStore(200_000);
        start();
        tick(100, 3, List.of(scan(ENEMY)));
    }

    @Given("Hadur remembers {string} as a gun that hits {double}% of the time")
    public void remembers(String name, double theirs) {
        store = new MemoryProfileStore(200_000);
        new ProfileLibrary(store).save(
            Profiles.tiers(Profiles.sample(name, 9, 0, 0), theirs / 100, 0.4, 0.45));
        start();
    }

    /**
     * Each wave is 16 ticks: the enemy fires 0.5 on the first (its energy drops), and on the
     * ninth one of our 0.1 bullets resolves, a hit ({@code hits} in every {@code every}) or a miss.
     */
    @When("for {int} enemy waves Hadur's bullets hit {int} in {int} and the enemy's all miss")
    public void exchange(int waves, int hits, int every) {
        for (int wave = 0; wave < waves; wave++) {
            boolean hit = wave % every < hits;
            for (int k = 0; k < 16; k++) {
                List<BotEvent> events = new ArrayList<>();
                if (k == 0) enemyEnergy -= 0.5;
                if (k == 8) {
                    if (hit) {
                        enemyEnergy -= 0.4;
                        events.add(new BotEvent.BulletHit(ENEMY, 0.1, enemyEnergy));
                    } else {
                        events.add(new BotEvent.BulletMissed(0.1));
                    }
                }
                events.add(scan(ENEMY));
                tick(100, 3, events);
            }
        }
    }

    /** Hadur's gun is at 0.1: cooler than theirs after a shot, but not yet able to fire. */
    @When("the enemy, down to {int} energy, fires while Hadur has {int} energy and a gun just short of cool")
    public void weakEnemyFires(int energy, int ours) {
        enemyEnergy = energy + 0.5;
        tick(ours, 0.1, List.of(scan(ENEMY)));
        enemyEnergy = energy;
        tick(ours, 0.1, List.of(scan(ENEMY)));
    }

    /** As above, but Hadur's gun has been cool a tick: last tick's aim goes out as they fire. */
    @When("the enemy, down to {int} energy, fires as Hadur, with {int} energy, fires its cool gun")
    public void bothFire(int energy, int ours) {
        enemyEnergy = energy + 0.5;
        tick(ours, 0, List.of(scan(ENEMY)));
        enemyEnergy = energy;
        tick(ours, 0, List.of(scan(ENEMY)));
        assertTrue(last.firePower() > 0, "Hadur fired on the tick the enemy's shot was seen");
    }

    @When("the duel's opponent is now {string}")
    public void newOpponent(String name) {
        tick(100, 3, List.of(scan(name)));
    }

    @And("neither rolling hit rate has any outcomes")
    public void windowsEmpty() {
        assertSame(Estimate.NONE, core.ourRollingHitRate());
        assertSame(Estimate.NONE, core.theirRollingHitRate());
    }

    @When("the enemy is down to {int} energy while Hadur has {int} energy and a hot gun")
    public void weakEnemyHotGun(int energy, int ours) {
        enemyEnergy = energy;
        tick(ours, 3, List.of(scan(ENEMY)));
        tick(ours, 3, List.of(scan(ENEMY)));
    }

    @When("the enemy is scanned with {int} energy")
    public void enemyAt(int energy) {
        enemyEnergy = energy;
        tick(100, 3, List.of(scan(ENEMY)));
    }

    @When("Hadur scans {string} for {int} ticks with a cool gun on target")
    public void scansWithCoolGun(String name, int ticks) {
        if (core == null) start();
        for (int i = 0; i < ticks; i++) tick(100, 0, List.of(scan(name)));
    }

    @Then("the target distance is {int}")
    public void targetIs(int d) {
        assertEquals(d, core.targetDistance(), 1e-9);
    }

    @Then("the target distance is below {int}")
    public void targetBelow(int d) {
        assertTrue(core.targetDistance() < d, "target " + core.targetDistance());
    }

    @And("each step of the target distance was {int} px and was recorded")
    public void stepsRecorded(int step) {
        double previous = 650;
        int steps = 0;
        for (String l : telemetry) {
            if (!l.startsWith("P,") || !l.contains(",distance,")) continue;
            String[] f = l.split(",");
            if (f[f.length - 1].contains(":")) continue; // the opening's record: tier:distance
            double target = Double.parseDouble(f[f.length - 1]);
            assertEquals(step, previous - target, 1e-9, l);
            assertFalse(target < DistancePolicy.FLOOR, l);
            previous = target;
            steps++;
        }
        assertEquals((int) ((650 - DistancePolicy.FLOOR) / step), steps);
    }

    @Then("the endgame is {string}")
    public void endgameIs(String state) {
        assertEquals(state, core.endgame().name().toLowerCase(Locale.ROOT));
    }

    @And("Hadur drives straight at the enemy at full speed")
    public void ramming() {
        assertEquals(8.0, last.maxVelocity());
        // Heading 0, enemy at absolute bearing 0.3: turn 0.3 right and go ahead.
        assertEquals(BEARING, last.bodyTurn(), 1e-9);
        assertTrue(last.ahead() > 0, "ahead " + last.ahead());
    }

    @Then("the power policy is {string}")
    public void powerPolicy(String reason) {
        String lastPower = null;
        for (String l : telemetry) if (l.startsWith("P,") && l.contains(",power,")) lastPower = l;
        assertTrue(lastPower != null && lastPower.endsWith("," + reason), String.valueOf(lastPower));
    }

    @And("the shot fired has power {double}")
    public void shotPower(double power) {
        assertEquals(power, last.firePower(), 1e-9);
    }
}
