package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur2.core.HadurCore;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;

public class WaveSteps {

    /** Hadur sits mid-field facing north; the enemy is due east unless a step moves it. */
    private static final double MY_X = 400;
    private static final double MY_Y = 300;

    private final List<String> telemetry = new ArrayList<>();
    private final List<BotEvent> pending = new ArrayList<>();
    private final List<BotOrders> orders = new ArrayList<>();
    private HadurCore core;
    private long time;

    private BotOrders tick(double x, double y, BotEvent... extra) {
        List<BotEvent> events = new ArrayList<>(pending);
        events.addAll(List.of(extra));
        pending.clear();
        // The radar points just short of east, so an enemy due east is to its right.
        BotOrders o = core.tick(new BotInput(++time, 0, x, y, 0, 0, 100, 0, 0.1, 0, 0,
            Math.PI / 2 - 0.1, 1, events));
        orders.add(o);
        return o;
    }

    private List<String> waves() {
        return telemetry.stream().filter(l -> l.startsWith("EW,")).toList();
    }

    @Given("a core that has scanned the enemy at {double} energy")
    public void scanned(double energy) {
        core = new HadurCore(800, 600, 1, telemetry::add);
        core.newRound(0);
        tick(MY_X, MY_Y, new BotEvent.Scan("enemy", Math.PI / 2, 300, energy, 0, 8));
    }

    @When("our {double} power bullet hits the enemy")
    public void ourBulletHits(double power) {
        pending.add(new BotEvent.BulletHit("enemy", power, 0));
    }

    @When("an enemy {double} power bullet hits us")
    public void enemyBulletHitsUs(double power) {
        pending.add(new BotEvent.HitByBullet("enemy", power, MY_X, MY_Y, 0));
    }

    @When("the next scan shows the enemy at {double} energy")
    public void nextScan(double energy) {
        tick(MY_X, MY_Y, new BotEvent.Scan("enemy", Math.PI / 2, 300, energy, 0, 8));
    }

    @When("the next scan shows the enemy stopped against the left wall at {double} energy")
    public void nextScanAtWall(double energy) {
        // Hadur moves so the enemy, 300 px due west, has its centre 18 px from the wall.
        tick(318, MY_Y, new BotEvent.Scan("enemy", -Math.PI / 2, 300, energy, 0, 0));
    }

    @When("{int} ticks pass without a scan")
    public void ticksWithoutScan(int ticks) {
        orders.clear();
        for (int i = 0; i < ticks; i++) tick(MY_X, MY_Y);
    }

    @Then("one enemy wave of power {double} is recorded")
    public void oneWave(double power) {
        List<String> ew = waves();
        assertEquals(1, ew.size(), ew::toString);
        assertEquals(power, Double.parseDouble(ew.get(0).split(",")[7]), 1e-4);
    }

    @Then("no enemy wave is recorded")
    public void noWave() {
        assertEquals(List.of(), waves());
    }

    @Then("{int} enemy waves are recorded")
    public void wavesRecorded(int count) {
        assertEquals(count, waves().size(), () -> waves().toString());
    }

    @Then("no phantom wave is counted")
    public void noPhantom() {
        assertEquals(0, core.stats().phantomWaves);
    }

    @Then("{int} phantom wave(s) is/are counted")
    public void phantoms(int count) {
        assertEquals(count, core.stats().phantomWaves);
    }

    @Then("the radar sweeps toward the enemy's last bearing on the last {int} of them")
    public void radarSweeps(int sweeps) {
        // The enemy was last seen due east, right of the radar, so the sweep turns
        // clockwise. The first tick after a scan is still covered by the lock.
        int n = orders.size();
        for (int i = 0; i < n - sweeps; i++) {
            assertEquals(false, Double.isInfinite(orders.get(i).radarTurn()), "tick " + i);
        }
        for (int i = n - sweeps; i < n; i++) {
            assertEquals(Double.POSITIVE_INFINITY, orders.get(i).radarTurn(), "tick " + i);
        }
    }

    @Then("the round statistics count {int} reacquire ticks")
    public void reacquireTicks(int ticks) {
        assertEquals(ticks, core.stats().radarReacquired);
    }
}
