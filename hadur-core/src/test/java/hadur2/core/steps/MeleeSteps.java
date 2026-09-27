package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.melee.MeleeProfile;
import hadur2.core.melee.MeleeProfileCodec;
import hadur2.core.memory.LineageKey;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.port.MemoryProfileStore;
import hadur2.core.port.Telemetry;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;

/** Drives the whole core through its port, as the adapter would, in a melee. */
public class MeleeSteps {

    /** Hadur sits mid-field facing north, gun cool and on target unless a step says not. */
    private static final double MY_X = 400;
    private static final double MY_Y = 300;

    private final List<BotOrders> orders = new ArrayList<>();
    private final List<String> telemetry = new ArrayList<>();
    private MemoryProfileStore store;
    private HadurCore core;
    private long time;
    private int others;
    private int markTick;

    private BotOrders tick(BotEvent... events) {
        BotOrders o = core.tick(new BotInput(++time, 0, MY_X, MY_Y, 0, 0, 100, 0, 0.1, 0, 0,
            0, others, List.of(events)));
        orders.add(o);
        return o;
    }

    private static BotEvent.Scan scan(String name, double bearingDeg, double distance) {
        return new BotEvent.Scan(name, Math.toRadians(bearingDeg), distance, 100, 0, 0);
    }

    private BotOrders last() {
        return orders.get(orders.size() - 1);
    }

    @Given("a core in an {int} by {int} battle against {int} opponent(s)")
    public void aCore(int width, int height, int opponents) {
        core = new HadurCore(width, height, opponents, Telemetry.NONE);
        core.newRound(0);
        others = opponents;
        orders.clear();
        time = 0;
    }

    @Given("a core with a profile store in an {int} by {int} battle against {int} opponents")
    public void aCoreWithStore(int width, int height, int opponents) {
        store = new MemoryProfileStore(200_000);
        telemetry.clear();
        core = new HadurCore(width, height, opponents, telemetry::add, store);
        core.prepareMemory();
        core.newRound(0);
        others = opponents;
        orders.clear();
        time = 0;
    }

    @When("it scans opponents at bearings {int}, {int} and {int} degrees, {int} px away")
    public void scansThree(int a, int b, int c, int distance) {
        tick(scan("A", a, distance), scan("B", b, distance), scan("C", c, distance));
    }

    @When("it scans opponents at bearings {int}, {int} and {int} degrees, {int} px away, every tick for {int} ticks")
    public void scansThreeRepeatedly(int a, int b, int c, int distance, int ticks) {
        for (int i = 0; i < ticks; i++) scansThree(a, b, c, distance);
    }

    @When("{int} melee ticks pass without a scan")
    public void ticksPass(int ticks) {
        markTick = orders.size();
        for (int i = 0; i < ticks; i++) tick();
    }

    @When("opponent A fires a bullet of power {double}")
    public void aFires(double power) {
        // The three opponents where the scans above put them; A's energy shows the shot.
        tick(new BotEvent.Scan("A", 0, 300, 100 - power, 0, 0), scan("B", 120, 300), scan("C", 240, 300));
    }

    @When("the round ends and the robot saves its memory")
    public void roundEnds() {
        core.roundEnded(time, "win", 100, 0);
        core.saveProfile(time);
    }

    @When("two opponents die")
    public void twoDie() {
        others = 1;
        tick(new BotEvent.RobotDeath("B"), new BotEvent.RobotDeath("C"));
    }

    @When("the survivor is scanned at bearing {int} degrees, {int} px away")
    public void survivorScanned(int bearing, int distance) {
        tick(scan("A", bearing, distance));
    }

    @Then("the store holds a melee block for each of A, B and C")
    public void blocksStored() {
        for (String name : List.of("A", "B", "C")) {
            assertTrue(store.read(LineageKey.fileStem(name) + ".hm") != null, name + " in " + store.names());
        }
    }

    @Then("A's block records {int} shot(s) at power {double}")
    public void aBlock(int shots, double power) {
        MeleeProfile a = MeleeProfileCodec.decode(store.read(LineageKey.fileStem("A") + ".hm"));
        assertEquals(shots, a.shotsInferred(), 1e-9);
        assertEquals(power, a.avgBulletPower(), 1e-6);
    }

    @Then("the store holds no 1v1 profile")
    public void noProfile() {
        assertTrue(store.names().stream().noneMatch(n -> n.endsWith(".hp")), store.names().toString());
    }

    @Then("the duel takes over {int} wave(s) from the survivor")
    public void wavesHandedOver(int waves) {
        String h = telemetry.stream().filter(l -> l.startsWith("H,")).findFirst().orElseThrow();
        assertEquals(String.valueOf(waves), h.split(",")[6], h);
        assertEquals("A", h.split(",")[3], h);
    }

    @Then("it keeps sweeping the radar")
    public void keepsSweeping() {
        assertTrue(Double.isInfinite(last().radarTurn()), "radar turn " + last().radarTurn());
    }

    @Then("it drives toward a destination")
    public void drivesToDestination() {
        assertFalse(Double.isNaN(last().ahead()));
        assertFalse(Double.isNaN(last().bodyTurn()));
        assertTrue(Math.abs(last().ahead()) > 0);
    }

    @Then("it fires within those ticks")
    public void firesWithin() {
        assertTrue(orders.stream().anyMatch(o -> o.firePower() > 0));
    }

    @Then("no shot is heavier than {int}")
    public void noShotHeavier(int max) {
        assertTrue(orders.stream().allMatch(o -> o.firePower() <= max));
    }

    @Then("it does not fire after the first {int} ticks")
    public void noFireAfter(int ticks) {
        for (int i = markTick + ticks; i < orders.size(); i++) {
            assertEquals(0.0, orders.get(i).firePower(), "tick " + (i + 1));
        }
    }

    @Then("it restores full speed")
    public void fullSpeed() {
        // The first duel tick lifts the melee's slow-for-sharp-turns limit.
        assertEquals(8.0, orders.get(orders.size() - 2).maxVelocity());
    }

    @Then("it locks the radar onto the survivor")
    public void locksRadar() {
        double turn = last().radarTurn();
        assertTrue(Double.isFinite(turn), "radar turn " + turn);
        assertTrue(Math.abs(turn) < Math.PI, "radar turn " + turn);
    }
}
