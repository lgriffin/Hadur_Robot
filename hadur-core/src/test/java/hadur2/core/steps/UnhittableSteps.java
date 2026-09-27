package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.memory.Estimate;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import hadur2.core.policy.MoveFlavour;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/** Drives the S6 scenarios: MOVE-1, MOVE-2, TIME-1, TIME-2. */
public class UnhittableSteps {

    private static final String ENEMY = "abc.Shadow 3.83c";
    private static final long ALLOWANCE = 3_000_000L;

    private HadurCore core;
    private final List<String> telemetry = new ArrayList<>();
    private long time;
    private double enemyEnergy = 100;
    private int round;
    private Wave wave;
    private MoveFlavour flavour;

    private BotInput input(double gunHeat, List<BotEvent> events) {
        // Hadur at (400, 200) facing north; the enemy 300 px due north, the gun on it.
        return new BotInput(++time, round, 400, 200, 0, 0, 100, gunHeat, 0.1, 0, 0, 0, 1, events);
    }

    private BotEvent scan() {
        return new BotEvent.Scan(ENEMY, 0, 300, enemyEnergy, Math.PI / 2, 0);
    }

    private void tick(double gunHeat, BotEvent... extra) {
        List<BotEvent> events = new ArrayList<>(List.of(extra));
        events.add(scan());
        core.tick(input(gunHeat, events));
    }

    @Given("Hadur in a duel, 300 px from the enemy")
    public void duel() {
        core = new HadurCore(800, 600, 1, telemetry::add);
        core.newRound(0);
        tick(3);
    }

    @When("Hadur fires at the enemy as the enemy fires at Hadur")
    public void bothFire() {
        tick(0);
        tick(0);
        enemyEnergy -= 2;
        for (int i = 0; i < 4; i++) tick(1);
    }

    @Then("the enemy's wave carries a bullet shadow")
    public void shadowed() {
        assertTrue(core.shadowedWaves() >= 1, "shadowed waves " + core.shadowedWaves());
    }

    @Given("an enemy wave whose middle fifth our bullet shadows")
    public void shadowedWave() {
        BattleField field = new BattleField(800, 600);
        wave = new Wave("enemy", new Point2D.Double(400, 500), new Point2D.Double(400, 100), 0, 0, 2,
            0, 0, 1, field, new MovementPredictor(field));
        // Facing the robot due south (bearing pi), a robot 0.1 rad wide; the middle 0.02 shadowed.
        wave.setShadows(List.of(new double[] {Math.PI - 0.01, Math.PI + 0.01}));
    }

    @Then("a robot sitting in the middle of it is in no danger from it")
    public void middleSafe() {
        assertEquals(1.0, wave.shadowedFraction(new Wave.Intersection(Math.PI, 0.01)), 1e-9);
        assertEquals(0.2, wave.shadowedFraction(new Wave.Intersection(Math.PI, 0.05)), 1e-9);
    }

    @And("a robot at its edge is in full danger from it")
    public void edgeDangerous() {
        assertEquals(0.0, wave.shadowedFraction(new Wave.Intersection(Math.PI + 0.04, 0.01)), 1e-9);
    }

    @When("a tick takes {double} ms of its 3 ms allowance")
    public void tickTakes(double ms) {
        tick(3, new BotEvent.TickTime((long) (ms * 1_000_000), ALLOWANCE));
    }

    @When("the engine skips a turn")
    public void skipped() {
        tick(3, new BotEvent.SkippedTurn(time));
    }

    @Then("the computation level is {int}")
    public void level(int level) {
        assertEquals(level, core.computationLevel());
    }

    @When("the round ends")
    public void roundEnds() {
        core.roundEnded(time, "win", 100, 0);
    }

    @Then("the round record says computation level {int}")
    public void recordLevel(int level) {
        String r = telemetry.get(telemetry.size() - 1);
        assertTrue(r.startsWith("R,"), r);
        assertEquals(String.valueOf(level), r.split(",")[13], r);
    }

    @When("the next round starts")
    public void nextRound() {
        core.newRound(++round);
        tick(3);
    }

    @Given("a profile that saw the enemy hit {int}% of {int} waves")
    public void profileBaseline(int percent, int waves) {
        flavour = new MoveFlavour(Estimate.of(waves * percent / 100.0, waves));
    }

    @When("the enemy hits {int} in 10 of its next {int} waves")
    public void enemyHits(int hits, int waves) {
        for (int i = 0; i < waves; i++) flavour.onWave(i % 10 < hits);
    }

    @Then("the movement has added the flattener")
    public void flattener() {
        assertEquals(MoveFlavour.Step.FLATTENER, flavour.step());
    }

    @Then("the movement has added go-to surfing")
    public void goTo() {
        assertEquals(MoveFlavour.Step.GO_TO, flavour.step());
    }

    @Then("the movement is as the opening set it")
    public void base() {
        assertEquals(MoveFlavour.Step.BASE, flavour.step());
        assertFalse(Double.isNaN(flavour.baseline().value()));
    }
}
