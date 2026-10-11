package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import hadur2.core.arch.StrandOwnershipTest;
import hadur2.core.replay.FixtureReplay;
import hadur2.core.replay.Fixtures;
import hadur2.core.replay.Replay;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

/** The architecture evolution's guardrails (STRAND-1 to STRAND-4), reusing the unit checks. */
public class StrandSteps {

    private final StrandOwnershipTest ownership = new StrandOwnershipTest();
    private String fixture;
    private List<String> recording;
    private FixtureReplay.Result result;

    @Given("the ownership map")
    public void theOwnershipMap() {
        assertFalse(StrandOwnershipTest.map().isEmpty());
    }

    @Then("every package of the core has exactly one owner")
    public void everyPackageHasOneOwner() {
        ownership.everyPackageHasOneOwner();
    }

    @Then("no strand depends on another strand or on the conductor")
    public void strandsStayApart() {
        ownership.strandsStayApart();
    }

    @Then("the kernel depends on no strand and not on the conductor")
    public void kernelIsUnderneath() {
        ownership.kernelIsUnderneath();
    }

    @Then("every owner's sources match its pin")
    public void everyOwnerMatchesItsPin() throws Exception {
        for (String owner : StrandOwnershipTest.OWNERS) ownership.ownerSourcesMatchPin(owner);
    }

    @Given("the recorded battle {string}")
    public void theRecordedBattle(String name) {
        fixture = name;
        recording = Fixtures.lines(Fixtures.DIR.resolve(name + ".txt.gz"));
    }

    @When("it is replayed with its store and the adapter's memory calls")
    public void replayedWhole() {
        result = FixtureReplay.run(recording);
    }

    @Then("the replay issues exactly the orders the live robot issued")
    public void ordersMatch() {
        assertFalse(result.ticks.isEmpty());
        for (Replay.Tick t : result.ticks) assertEquals(t.recorded(), t.replayed(), fixture + " line " + t.line());
    }

    @Then("its telemetry matches the fixture's snapshot")
    public void telemetryMatches() {
        assertEquals(FixtureReplay.snapshot(fixture), FixtureReplay.comparable(result.telemetry), fixture);
    }

    @Then("it leaves the files the live robot left")
    public void storeMatches() {
        if (!result.hasStore) return;
        assertEquals(FixtureReplay.readable(result.recordedStore), FixtureReplay.readable(result.store), fixture);
    }
}
