package hadur2.core.steps;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import hadur2.core.arch.ArchitectureTest;
import hadur2.core.physics.Angles;
import hadur2.core.physics.Rules;
import hadur2.core.port.Telemetry;
import hadur2.core.replay.Fixtures;
import hadur2.core.replay.Replay;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.nio.file.Path;
import java.util.List;

public class CoreSteps {

    private JavaClasses core;
    private List<String> recording;
    private List<Replay.Tick> first;
    private List<Replay.Tick> second;

    @Given("the compiled core classes")
    public void theCompiledCoreClasses() {
        core = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("hadur2.core");
    }

    @Then("no core class depends on a class in {string}")
    public void noCoreClassDependsOn(String pkg) {
        noClasses().that().resideInAPackage("hadur2.core..")
            .should().dependOnClassesThat().resideInAPackage(pkg + "..")
            .check(core);
    }

    @Then("the core's angle and rule helpers give the engine's answers")
    public void helpersMatchEngine() {
        for (double a = -20; a <= 20; a += 0.37) {
            assertEquals(robocode.util.Utils.normalRelativeAngle(a), Angles.normalRelativeAngle(a));
            assertEquals(robocode.util.Utils.normalAbsoluteAngle(a), Angles.normalAbsoluteAngle(a));
        }
        for (double p = 0.1; p <= 3.0; p += 0.1) {
            assertEquals(robocode.Rules.getBulletSpeed(p), Rules.getBulletSpeed(p));
            assertEquals(robocode.Rules.getBulletDamage(p), Rules.getBulletDamage(p));
        }
    }

    @Given("the recorded battle against {string}")
    public void theRecordedBattleAgainst(String opponent) {
        recording = Fixtures.lines(Fixtures.DIR.resolve(opponent + ".txt.gz"));
    }

    @When("it is replayed through a fresh core twice")
    public void replayedTwice() {
        first = Replay.run(recording, Telemetry.NONE);
        second = Replay.run(recording, Telemetry.NONE);
    }

    @Then("both replays issue exactly the orders the live robot issued")
    public void bothMatchLiveRobot() {
        assertFalse(first.isEmpty());
        assertEquals(first.size(), second.size());
        for (int i = 0; i < first.size(); i++) {
            Replay.Tick t = first.get(i);
            assertEquals(t.recorded(), t.replayed(), "line " + t.line());
            assertEquals(t.replayed(), second.get(i).replayed(), "line " + t.line());
        }
    }

    // RES-6 steps reuse the architecture rules so the two can't drift apart.

    @Then("no core class uses unseeded randomness")
    public void noRandomness() {
        new ArchitectureTest().noRandomness();
    }

    @Then("no core class uses threads")
    public void noThreads() {
        new ArchitectureTest().noThreads();
    }

    @Then("no core class uses reflection")
    public void noReflection() {
        new ArchitectureTest().noReflection();
    }

    @Then("no core class does file I\\/O or reads the clock")
    public void noIo() {
        new ArchitectureTest().noIo();
    }

    @Then("no core class holds mutable static state")
    public void noMutableStatics() {
        new ArchitectureTest().noMutableStatics();
    }
}
