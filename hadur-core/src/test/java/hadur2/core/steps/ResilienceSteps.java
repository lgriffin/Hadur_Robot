package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.Guard;
import hadur2.core.HadurCore;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.model.RobotState;
import hadur2.core.model.RobotStateLog;
import hadur2.core.knn.KdTree;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ResilienceSteps {

    private final List<String> telemetry = new ArrayList<>();
    private Function<BotInput, BotOrders> failingCore;
    private Guard guard;
    private final List<BotOrders> issued = new ArrayList<>();
    private HadurCore core;
    private int round;
    private int held;

    private static BotInput input(long time, int round, List<BotEvent> events) {
        return new BotInput(time, round, 400, 300, 0, 4, 100, 0, 0.1, 0, 0, 0, 1, events);
    }

    @Given("a core that throws on every {int}th tick")
    public void aCoreThatThrows(int every) {
        HadurCore real = new HadurCore(800, 600, 1, telemetry::add);
        real.newRound(0);
        int[] tick = {0};
        failingCore = in -> {
            if (++tick[0] % every == 0) throw new IllegalStateException("injected");
            return real.tick(in);
        };
        telemetry.clear();
        guard = new Guard(failingCore, real::recover, telemetry::add);
    }

    @When("the robot plays {int} ticks against an enemy it can see")
    public void playsTicks(int ticks) {
        for (long t = 1; t <= ticks; t++) {
            issued.add(guard.tick(input(t, 0,
                List.of(new BotEvent.Scan("enemy", 0.3, 300, 100, 0, 8)))));
        }
    }

    @Then("every tick has orders that turn the radar")
    public void everyTickHasOrders() {
        for (BotOrders o : issued) {
            assertFalse(Double.isNaN(o.radarTurn()));
        }
    }

    @Then("{int} faults are counted for the round")
    public void faultsCounted(int faults) {
        assertEquals(faults, guard.faultsThisRound());
    }

    @Then("exactly one FAULT record is written")
    public void oneFaultRecord() {
        assertEquals(1, telemetry.stream().filter(l -> l.startsWith("FAULT,")).count());
    }

    @When("{int} entries are added to a robot state log")
    public void addToStateLog(int count) {
        RobotStateLog log = new RobotStateLog();
        for (long t = 0; t < count; t++) {
            log.addState(RobotState.newBuilder().setLocation(new Point2D.Double(1, 1))
                .setHeading(0).setVelocity(0).setTime(t).build());
        }
        held = log.size();
    }

    @When("{int} entries are added to a size-limited tree")
    public void addToTree(int count) {
        KdTree<Integer> tree = new KdTree<>(1, 100);
        for (int i = 0; i < count; i++) tree.addPoint(new double[] {i}, i);
        held = tree.size();
    }

    @Then("it holds at most {int} entries")
    public void holdsAtMost(int bound) {
        assertTrue(held <= bound, held + " > " + bound);
    }

    @Given("a fresh core in round {int}")
    public void aFreshCore(int round) {
        this.round = round;
        core = new HadurCore(800, 600, 1, telemetry::add);
        core.newRound(round);
    }

    @When("it receives {int} skipped-turn events")
    public void skippedTurns(int n) {
        List<BotEvent> events = new ArrayList<>();
        for (int i = 0; i < n; i++) events.add(new BotEvent.SkippedTurn(10 + i));
        core.tick(input(12, round, events));
    }

    @When("the round ends after the guard covered {int} faults")
    public void roundEnds(int faults) {
        core.roundEnded(500, "loss", 0, faults);
    }

    @Then("the R record shows {int} skipped turns and {int} faults")
    public void rRecordShows(int skipped, int faults) {
        String r = telemetry.get(telemetry.size() - 1);
        String[] f = r.split(",");
        assertEquals("R", f[0]);
        assertEquals(String.valueOf(round), f[1]);
        assertEquals(String.valueOf(skipped), f[11]);
        assertEquals(String.valueOf(faults), f[12]);
    }
}
