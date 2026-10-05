package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.duel.ShadowWorld;
import hadur2.core.gun.ShadowAimWorld;
import hadur2.core.move.PlanWorld;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/** Drives the D4 scenarios of the DrussGT route: MOVE-8 and GUN-7. */
public class ShadowSteps {

    private final PlanWorld plan = new PlanWorld();
    private final ShadowWorld seam = new ShadowWorld();
    private final ShadowAimWorld aim = new ShadowAimWorld();

    // MOVE-8

    @Given("an enemy bullet is in the air towards Hadur")
    public void waveInTheAir() {
        plan.waveInTheAir();
    }

    @Given("no enemy bullet is in the air")
    public void noWave() {
        // Nothing to add: the world starts without a wave.
    }

    @When("Hadur's movement plans its next tick")
    public void surfDrives() {
        plan.surfDrives();
    }

    @When("Hadur's movement plans to stand still")
    public void surfPlansAStop() {
        plan.surfPlansAStop();
    }

    @Then("movement publishes an interval for that bullet")
    public void published() {
        assertEquals(true, plan.publishedOnTheWave());
    }

    @Then("movement publishes nothing")
    public void publishedNothing() {
        assertEquals(0, plan.published());
    }

    @Then("the interval holds the bearing from the enemy to where Hadur will be")
    public void holdsOurPosition() {
        assertTrue(plan.stopIntervalHoldsOurPosition());
    }

    // GUN-7, the gun's choice

    @Given("a gun with a full main view and no enemy bullet in the air")
    public void gunNoWave() {
        // The world's gun is built with a full view; the shadow term is given per step.
    }

    @Given("a gun with a full main view")
    public void gunWithView() {
        // As above.
    }

    @Then("the gun fires exactly the angle it aimed")
    public void exactAngle() {
        assertEquals(0.0, aim.shiftWithNoWave(), 0.0);
    }

    @Then("a bullet clockwise of the aim that would save {double} damage moves the shot clockwise, within two bot half-widths")
    public void shadowMovesTheShot(double worth) {
        double shift = aim.shiftWhenClockwiseSaves(worth);
        assertTrue(shift > 0 && shift <= 2 * aim.botHalfWidth() + 1e-9, "shift " + shift);
    }

    @Then("a bullet clockwise of the aim that would save {double} damage leaves the shot where it was")
    public void shadowTooSmall(double worth) {
        assertEquals(0.0, aim.shiftWhenClockwiseSaves(worth), 0.0);
    }

    // GUN-7, the saving

    @Given("a plan interval on that bullet with a {double} chance of a hit")
    public void planOnTheWave(double danger) {
        seam.planOnTheWave(danger);
    }

    @Given("our bullets in flight already stop all of that interval")
    public void alreadyStopped() {
        seam.shadowsAlreadyStopEverything();
    }

    @Then("a bullet fired across the field saves nothing")
    public void sidewaysSavesNothing() {
        assertEquals(0.0, seam.sidewaysSaving(), 0.0);
    }

    @Then("a bullet fired close to the line at the enemy saves some damage, never more than the interval is worth")
    public void nearLineSaves() {
        double saved = seam.bestSaving();
        assertTrue(saved > 0, "saved " + saved);
        assertTrue(saved <= seam.ceiling() + 1e-12);
    }

    @Then("no bullet saves anything more")
    public void nothingMore() {
        assertEquals(0.0, seam.bestSaving(), 0.0);
    }
}
