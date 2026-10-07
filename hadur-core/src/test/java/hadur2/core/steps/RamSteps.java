package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.port.MemoryProfileStore;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;

/** Drives the RAM-3 scenarios: the escape from a confirmed rammer is tried, then kept only if it pays. */
public class RamSteps {

    private static final String ENEMY = "sample.Charger 1.0";
    private static final double BEARING = 0.3;

    private HadurCore core;
    private final List<String> telemetry = new ArrayList<>();
    private long time;
    private int round = -1;
    private double ourEnergy = 100;
    private double enemyEnergy = 100;

    private void tick(double distance, double velocity) {
        // The enemy heads straight at us: its own speed toward us is its velocity.
        BotEvent scan = new BotEvent.Scan(ENEMY, BEARING, distance, enemyEnergy, BEARING + Math.PI, velocity);
        core.tick(new BotInput(++time, round, 400, 300, 0, 0, ourEnergy, 3, 0.1, 0, 0, 0, 1, List.of(scan)));
    }

    /** One round: the enemy charges from 500 px to 100 px and sits there, then the round ends. */
    private void ramRound(String result, double ours, double theirs) {
        core.newRound(++round);
        ourEnergy = 100;
        enemyEnergy = 100;
        for (double d = 500; d >= 100; d -= 8) tick(d, 8);
        for (int i = 0; i < 5; i++) tick(100, 0);
        ourEnergy = ours;
        enemyEnergy = theirs;
        tick(100, 0);
        core.roundEnded(time, result, ours, 0);
    }

    @Given("a duel against a robot that charges and rams Hadur every round")
    public void duelAgainstRammer() {
        core = new HadurCore(800, 600, 1, telemetry::add, new MemoryProfileStore(200_000));
    }

    @When("Hadur fights its first {int} rounds and wins them on {double} energy against {double}")
    public void foughtRounds(int rounds, double ours, double theirs) {
        for (int i = 0; i < rounds; i++) ramRound("win", ours, theirs);
    }

    @When("Hadur's next {int} rounds end in a {word} on {double} energy against {double}")
    public void nextRounds(int rounds, String result, double ours, double theirs) {
        for (int i = 0; i < rounds; i++) ramRound(result.equals("loss") ? "loss" : "win", ours, theirs);
    }

    @When("another round starts and the robot charges")
    public void anotherRound() {
        core.newRound(++round);
        ourEnergy = 100;
        enemyEnergy = 100;
        for (double d = 500; d >= 100; d -= 8) tick(d, 8);
    }

    private List<String> records(String policy, int inRound) {
        List<String> out = new ArrayList<>();
        for (String r : telemetry) {
            String[] f = r.split(",");
            if (f.length > 3 && f[0].equals("P") && f[1].equals(Integer.toString(inRound)) && f[3].equals(policy)) {
                out.add(r);
            }
        }
        return out;
    }

    @Then("round {int} plays the {word}")
    public void roundPlays(int inRound, String arm) {
        List<String> trial = records("ram-trial", inRound);
        assertEquals(1, trial.size(), "one trial record at the round's start: " + telemetry);
        assertTrue(trial.get(0).endsWith("," + arm), trial.get(0));
    }

    @Then("Hadur runs from the charge in round {int}")
    public void runs(int inRound) {
        assertTrue(records("ram-escape", inRound).stream().anyMatch(r -> r.endsWith(",ram_2")),
            "the escape starts: " + records("ram-escape", inRound));
    }

    @Then("Hadur stands and fights the charge in round {int}")
    public void fights(int inRound) {
        assertTrue(records("ram-escape", inRound).isEmpty(), "no escape: " + records("ram-escape", inRound));
    }

    @Then("no round before round {int} played an arm")
    public void noArmBefore(int inRound) {
        for (int r = 0; r < inRound; r++) assertTrue(records("ram-trial", r).isEmpty(), "round " + r);
    }
}
