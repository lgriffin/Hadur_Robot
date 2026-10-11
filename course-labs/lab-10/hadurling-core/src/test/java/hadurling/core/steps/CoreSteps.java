package hadurling.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadurling.core.Core;
import hadurling.core.Guard;
import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;

/** The glue between the sentences in hadurling.feature and the core. */
public class CoreSteps {

    private double enemyBearing;
    private double gunHeat;
    private Orders orders;
    private Guard guard;
    private final List<Orders> guardedOrders = new ArrayList<>();
    private final List<String> log = new ArrayList<>();

    @Given("an enemy {int} degrees to our right")
    public void enemyToTheRight(int degrees) {
        enemyBearing = Math.toRadians(degrees);
    }

    @Given("an enemy dead ahead")
    public void enemyAhead() {
        enemyBearing = 0;
    }

    @Given("the gun heat is {double}")
    public void gunHeat(double heat) {
        gunHeat = heat;
    }

    @When("the core takes a tick")
    public void coreTick() {
        Event scan = new Event.Scan("foe", enemyBearing, 200, 100, 0, 0);
        orders = new Core().tick(new Input(1, 400, 300, 0, 0, 100, gunHeat, 0, 0, List.of(scan)));
    }

    @Then("the radar turns {int} degrees to the right")
    public void radarTurns(int degrees) {
        assertEquals(Math.toRadians(degrees), orders.radarTurn(), 1e-9);
    }

    @Then("the core holds fire")
    public void holdsFire() {
        assertEquals(0.0, orders.firePower());
    }

    @Given("a core that always throws")
    public void throwingCore() {
        guard = new Guard(in -> { throw new IllegalStateException("boom"); }, log::add);
        guard.newRound();
    }

    @When("the guard takes three ticks")
    public void guardTicks() {
        for (int t = 1; t <= 3; t++) {
            guardedOrders.add(guard.tick(new Input(t, 400, 300, 0, 0, 100, 0, 0, 0, List.of())));
        }
    }

    @Then("every tick has orders that drive {int} pixels ahead and hold fire")
    public void safeOrders(int px) {
        for (Orders o : guardedOrders) {
            assertEquals(px, o.ahead());
            assertEquals(0.0, o.firePower());
        }
    }

    @Then("exactly {int} FAULT line was logged")
    public void faultLines(int count) {
        assertEquals(count, log.stream().filter(l -> l.startsWith("FAULT")).count());
    }

    private Core watcher;
    private final List<Event> nextEvents = new ArrayList<>();

    @Given("the core has seen an enemy with {int} energy")
    public void coreHasSeen(int energy) {
        watcher = new Core();
        watcher.tick(new Input(1, 400, 300, 0, 0, 100, 0.4, 0, 0,
            List.of(new Event.Scan("foe", 0, 200, energy, 0, 0))));
    }

    @Given("our bullet of power {double} hits the enemy")
    public void ourBulletHits(double power) {
        nextEvents.add(new Event.BulletHit("foe", power));
    }

    @When("the enemy is next seen with {int} energy")
    public void enemySeenAgain(int energy) {
        nextEvents.add(new Event.Scan("foe", 0, 200, energy, 0, 0));
        watcher.tick(new Input(2, 400, 300, 0, 0, 100, 0.4, 0, 0, nextEvents));
    }

    @Then("the surfer watches {int} enemy waves")
    public void surferWatches(int waves) {
        assertEquals(waves, watcher.enemyWaves());
    }
}
