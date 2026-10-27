package hadur117.micro.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.micro.core.Energy;
import hadur117.micro.core.Movement;
import hadur117.micro.core.Selection;
import hadur117.micro.core.Targeting;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Arrays;
import robocode.Rules;

/** Steps for saor.feature, on the core's pure functions. */
public class SaorSteps {

    private double myX;
    private double myY;
    private double targetDistance;
    private int x;
    private int y;
    private char[][] table;
    private int state;
    private int stopped;
    private int bin;
    private double bearing = 1.0;
    private double heading = 0.4;
    private double distance;
    private double power;

    @Given("Saor is at {int}, {int} with its target {int} px away")
    public void saorIsAt(int x, int y, int d) {
        myX = x;
        myY = y;
        targetDistance = d;
    }

    @When("it drives the leg on axis {int}")
    public void itDrivesTheLeg(int axis) {
        int leg = Movement.leg(targetDistance);
        x = Movement.coordinate(axis > 0, leg, myX);
        y = Movement.coordinate(axis <= 0, leg, myY);
    }

    @Then("the point it drives to is 25 px from an edge")
    public void thePointIsByAnEdge() {
        assertEquals(25, Math.min(Math.min(x, y), Math.min(1000 - x, 1000 - y)));
    }

    @Then("the point is in Saor's own corner")
    public void thePointIsInTheCorner() {
        assertEquals(myX > 500, x > 500);
        assertEquals(myY > 500, y > 500);
    }

    @Given("Saor's target is {int} px away")
    public void theTargetIs(int d) {
        targetDistance = d;
    }

    @Then("a robot scanned at {int} px is adopted")
    public void adopted(int d) {
        assertTrue(Selection.adopt(d, targetDistance, false));
    }

    @Then("a robot scanned at {int} px is not")
    public void notAdopted(int d) {
        assertFalse(Selection.adopt(d, targetDistance, false));
    }

    @Then("the target itself is kept at {int} px")
    public void kept(int d) {
        assertTrue(Selection.adopt(d, targetDistance, true));
    }

    @When("a robot dies")
    public void aRobotDies() {
        targetDistance = Selection.afterDeath();
    }

    @Then("the radar is set spinning")
    public void theRadarSpins() {
        assertEquals(Double.POSITIVE_INFINITY, Selection.afterDeath());
    }

    @Then("the radar is held at gun heat {double}")
    public void held(double heat) {
        assertTrue(Selection.holdRadar(heat));
    }

    @Then("the radar is not held at gun heat {double}")
    public void notHeld(double heat) {
        assertFalse(Selection.holdRadar(heat));
    }

    @Given("a target at full speed turning at the engine's limit, its row holding {int} samples of a stop")
    public void aTarget(int samples) {
        state = 1 + (16 << 2) + (4 << 7);
        stopped = 1 + (8 << 2) + (2 << 7);
        table = new char[Targeting.STATES][Targeting.ROW + 1];
        Arrays.fill(table[state], 0, samples, (char) stopped);
        table[state][Targeting.ROW] = (char) samples;
    }

    @When("Saor aims at it {int} px away with power {double}")
    public void saorAims(int d, double p) {
        distance = d;
        power = p;
        bin = Targeting.aim(table, state, 500, 500, bearing, distance, heading, 8, power);
    }

    @Then("the aim is the circular projection of its scan")
    public void theAimIsCircular() {
        assertEquals(project(state), bin);
    }

    @Then("the aim is where it was scanned")
    public void theAimIsTheScan() {
        assertEquals(project(stopped), bin);
        assertTrue(project(stopped) != project(state), "the scenario should tell the two guns apart");
    }

    /** Holds a state from the scan to bullet arrival, as circular projection does. */
    private int project(int s) {
        double px = 500 + Math.sin(bearing) * distance;
        double py = 500 + Math.cos(bearing) * distance;
        double v = ((s >> 2) & 31) - 8;
        double h = heading;
        int ticks = 1;
        do {
            h += ((s >> 7) - 2) * Rules.getTurnRateRadians(v) / 2;
            px += Math.sin(h) * v;
            py += Math.cos(h) * v;
        } while (++ticks * Rules.getBulletSpeed(power) < Math.hypot(px - 500, py - 500));
        return (int) (Math.atan2(px - 500, py - 500) * (512 / Math.PI)) & 1023;
    }

    @Then("with {int} energy at {int} px and {int} opponents left the power is {double}")
    public void powerIs(int energy, int d, int others, double expected) {
        assertEquals(expected, Energy.power(energy, d, others), 1e-9);
    }

    @Then("the gun fires with {double} gun turn left")
    public void fires(double left) {
        assertTrue(Energy.fire(left));
    }

    @Then("the gun holds fire with {double} gun turn left")
    public void holds(double left) {
        assertFalse(Energy.fire(left));
    }
}
