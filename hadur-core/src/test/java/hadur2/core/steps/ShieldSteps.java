package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;

public class ShieldSteps {

    /** Hadur sits mid-field facing north with its gun pointing north. */
    private static final double MY_X = 200;
    private static final double MY_Y = 300;
    private static final double DISTANCE = 400;
    /** The head-on aim from a gun pointing north at an enemy due east. */
    private static final double HEAD_ON_TURN = Math.PI / 2;

    private final List<BotEvent> pending = new ArrayList<>();
    private final List<BotOrders> orders = new ArrayList<>();
    private HadurCore core;
    private long time;

    /** A scan of the still enemy, gun too hot to fire, so the aim is all that moves. */
    private void scan() {
        scan(1.5);
    }

    private void scan(double gunHeat) {
        List<BotEvent> events = new ArrayList<>(pending);
        pending.clear();
        events.add(new BotEvent.Scan("shielder", Math.PI / 2, DISTANCE, 100, 0, 0));
        orders.add(core.tick(new BotInput(++time, 0, MY_X, MY_Y, 0, 0, 100, gunHeat, 0.1, 0, 0,
            Math.PI / 2, 1, events)));
    }

    private double offset(BotOrders o) {
        return o.gunTurn() - HEAD_ON_TURN;
    }

    @Given("a duel against an enemy sitting still {int} px due east")
    public void duel(int distance) {
        assertEquals(DISTANCE, distance);
        core = new HadurCore(800, 600, 1, line -> { });
        core.newRound(0);
        scan();
    }

    @When("{int} of our bullets are/is shot down")
    public void shotDown(int n) {
        for (int i = 0; i < n; i++) pending.add(new BotEvent.BulletHitBullet(1.9, 300, 300, 0.5));
    }

    @When("{int} of our bullets is shot down among {int} misses")
    public void shotDownAmongMisses(int n, int misses) {
        for (int i = 0; i < misses; i++) pending.add(new BotEvent.BulletMissed(1.9));
        shotDown(n);
    }

    @Given("a melee in which we have fired {int} bullets")
    public void meleeWithShots(int shots) {
        core = new HadurCore(800, 600, 2, line -> { });
        core.newRound(0);
        // Two opponents; the gun is always cool and on target, so the melee gun fires as
        // soon as it has aimed, and again each time it cools.
        for (int i = 0; i < 400 && core.stats().shotsFired < shots; i++) {
            List<BotEvent> events = new ArrayList<>();
            events.add(new BotEvent.Scan("a", Math.PI / 2, DISTANCE, 100, 0, 0));
            events.add(new BotEvent.Scan("b", -Math.PI / 2, 300, 100, 0, 0));
            double heat = Math.max(0, 1.5 - 0.1 * (i % 16));
            core.tick(new BotInput(++time, 0, MY_X, MY_Y, 0, 0, 100, heat, 0.1, 0, 0,
                0, 2, events));
        }
        assertEquals(shots, core.stats().shotsFired, "melee shots fired");
    }

    @When("the last other opponent dies")
    public void lastOtherDies() {
        pending.add(new BotEvent.RobotDeath("b"));
        scan();
    }

    @When("the enemy is scanned again with the gun cool and on target")
    public void scannedCool() {
        scan(0);
    }

    @Then("no shot is fired")
    public void noShot() {
        assertEquals(0, orders.get(orders.size() - 1).firePower());
        assertEquals(0, core.stats().jitteredShots);
    }

    @When("the enemy is scanned again with the gun still hot")
    public void scannedAgain() {
        scan();
    }

    @Then("the aim is off the head-on line by {int}% to {int}% of the enemy's angular half-width")
    public void aimIsOff(int minPercent, int maxPercent) {
        double halfWidth = Math.atan(18 / DISTANCE);
        double fraction = Math.abs(offset(orders.get(orders.size() - 1))) / halfWidth;
        assertTrue(fraction >= minPercent / 100.0 - 1e-9 && fraction <= maxPercent / 100.0 + 1e-9,
            "offset is " + fraction + " of the half-width");
    }

    @Then("the gun aims head-on")
    public void headOn() {
        assertEquals(0, offset(orders.get(orders.size() - 1)), 1e-9);
    }

    @Then("both aims carry the same offset")
    public void sameOffset() {
        double last = offset(orders.get(orders.size() - 1));
        assertTrue(Math.abs(last) > 1e-6, "the offset is on");
        assertEquals(last, offset(orders.get(orders.size() - 2)), 1e-12);
    }

    @Then("the round statistics count {int} bullets shot down")
    public void countsShotDown(int n) {
        assertEquals(n, core.stats().bulletsIntercepted);
    }
}
