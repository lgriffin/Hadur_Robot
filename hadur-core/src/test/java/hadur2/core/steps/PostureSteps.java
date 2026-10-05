package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.melee.EnemyInfo;
import hadur2.core.melee.MeleeController;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.physics.BattleField;
import hadur2.core.role.Posture;
import hadur2.core.role.SentryFence;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;

/**
 * Drives the core through its port through the gate's scenarios, and records which posture
 * drove each tick. Opponent k sits 100 k px from Hadur, due east of it at k = 1 and fanning
 * round clockwise; the sentry, when there is one, sits in the border zone.
 */
public class PostureSteps {

    private static final double MY_X = 500, MY_Y = 500;

    private final List<Posture> postures = new ArrayList<>();
    private final List<BotOrders> orders = new ArrayList<>();
    private final List<String> telemetry = new ArrayList<>();
    private HadurCore core;
    private int others;
    private int sentries;
    private double border;
    private long time;
    private int round;

    @Given("a core in a {int} by {int} battle against {int} opponent(s)")
    public void aCore(int width, int height, int opponents) {
        start(width, height, opponents, null);
    }

    @Given("a core in a {int} by {int} battle against {int} opponents whose melee throws on tick {int}")
    public void aFaultyCore(int width, int height, int opponents, int faultTick) {
        MeleeController faulty = new MeleeController(new BattleField(width, height)) {
            @Override
            public Command tick(Situation s) {
                if (s.time == faultTick) throw new IllegalStateException("injected");
                return super.tick(s);
            }
        };
        start(width, height, opponents, faulty);
    }

    private void start(int width, int height, int opponents, MeleeController melee) {
        core = melee == null
            ? new HadurCore(width, height, opponents, telemetry::add)
            : new HadurCore(width, height, opponents, telemetry::add, null, melee);
        core.newRound(0);
        others = opponents;
    }

    @Given("a border sentry guarding {int} px")
    public void aSentry(int size) {
        sentries = 1;
        border = size;
    }

    private BotEvent.Scan opponent(int k) {
        double bearing = Math.toRadians(90 + 35 * (k - 1));
        return new BotEvent.Scan("opp" + k, bearing, 100.0 * k / 3 + 60, 100, 0, 0);
    }

    private BotEvent.Scan sentry() {
        // Heading north, the sentry is 450 px ahead: 50 px from the top wall.
        return new BotEvent.Scan("samplesentry.BorderGuard", 0, 450, 100, 0, 0, true);
    }

    private void tick(List<BotEvent> events) {
        time++;
        BotOrders o = core.tick(new BotInput(time, round, MY_X, MY_Y, 0, 0, 100, 0, 0.1, 0, 0,
            0, others, events, sentries, border));
        orders.add(o);
        postures.add(core.posture());
    }

    @When("it plays {int} ticks scanning every opponent")
    public void plays(int ticks) {
        for (int t = 0; t < ticks; t++) {
            List<BotEvent> events = new ArrayList<>();
            for (int k = 1; k <= others; k++) events.add(opponent(k));
            tick(events);
        }
    }

    @When("it plays {int} ticks scanning every opponent and the sentry")
    public void playsWithSentry(int ticks) {
        for (int t = 0; t < ticks; t++) {
            List<BotEvent> events = new ArrayList<>();
            for (int k = 1; k <= others; k++) events.add(opponent(k));
            events.add(sentry());
            tick(events);
        }
    }

    @When("the radar sees a sentry")
    public void seesSentry() {
        List<BotEvent> events = new ArrayList<>();
        for (int k = 1; k <= others; k++) events.add(opponent(k));
        events.add(sentry());
        tick(events);
    }

    @When("opponent {int} dies")
    public void dies(int k) {
        others--;
        tick(List.of(new BotEvent.RobotDeath("opp" + k)));
    }

    @When("the sentry dies unscanned")
    public void sentryDies() {
        sentries = 0;
        List<BotEvent> events = new ArrayList<>();
        for (int k = 1; k <= others; k++) events.add(opponent(k));
        events.add(new BotEvent.RobotDeath("samplesentry.BorderGuard"));
        tick(events);
    }

    @Then("the battle's charter is {string}")
    public void charterIs(String charter) {
        assertEquals(charter, core.charter().name());
    }

    @Then("the round's ROLE records name {string}")
    public void roleRecords(String roles) {
        List<String> named = new ArrayList<>();
        for (String l : telemetry) if (l.startsWith("ROLE," + round + ",")) named.add(l.split(",")[3]);
        assertEquals(roles, String.join(" ", named));
    }

    @When("the next melee round starts")
    public void nextRound() {
        round++;
        time = 0;
        core.newRound(round);
        postures.clear();
        orders.clear();
    }

    @When("the melee round ends")
    public void roundEnds() {
        core.roundEnded(time, "loss", 50, 0);
    }

    @Then("the duel drove every tick")
    public void duelEveryTick() {
        assertTrue(postures.stream().allMatch(p -> p == Posture.DUEL), postures.toString());
    }

    @Then("melee drove every tick")
    public void meleeEveryTick() {
        assertTrue(postures.stream().allMatch(p -> p == Posture.MELEE), postures.toString());
    }

    @Then("the duel drove the last {int} ticks")
    public void duelLast(int n) {
        List<Posture> last = postures.subList(postures.size() - n, postures.size());
        assertTrue(last.stream().allMatch(p -> p == Posture.DUEL), postures.toString());
    }

    @Then("melee drove the first {int} ticks")
    public void meleeFirst(int n) {
        assertTrue(postures.subList(0, n).stream().allMatch(p -> p == Posture.MELEE), postures.toString());
        assertEquals(Posture.DUEL, postures.get(n), postures.toString());
    }

    @Then("melee drove the last {int} ticks")
    public void meleeLast(int n) {
        List<Posture> last = postures.subList(postures.size() - n, postures.size());
        assertTrue(last.stream().allMatch(p -> p == Posture.MELEE), postures.toString());
    }

    @Then("the duel fights {string}")
    public void duelFights(String name) {
        // With one opponent left the duel has no focus to choose: it fights whoever is left.
        String focus = core.duelFocus();
        if (focus != null) assertEquals(name, focus);
        else assertEquals(1, others);
    }

    @Then("the sentry is never tracked as an opponent")
    public void sentryNeverTracked() {
        for (EnemyInfo e : core.melee().tracker.all()) {
            assertFalse(e.name.contains("BorderGuard"), "tracked " + e.name);
        }
        assertNotNull(core.duelFocus());
    }

    @Then("no order takes Hadur into the sentry border")
    public void noOrderIntoBorder() {
        SentryFence fence = new SentryFence(1000, 1000);
        for (BotOrders o : orders) {
            assertTrue(fence.staysSafe(MY_X, MY_Y, 0, 0, o, border), o.toString());
        }
    }

    @Given("the conductor withholds the fire permission")
    public void withholdFire() {
        core.firePermission(in -> false);
    }

    @Then("no order fires")
    public void noOrderFires() {
        for (BotOrders o : orders) assertEquals(0.0, o.firePower(), o.toString());
    }

    @Then("some order fires")
    public void someOrderFires() {
        assertTrue(orders.stream().anyMatch(o -> o.firePower() > 0), orders.toString());
    }

    @Then("the melee brain tracks {string}")
    public void meleeTracks(String name) {
        assertTrue(core.melee().tracker.all().stream().anyMatch(e -> e.name.equals(name)),
            core.melee().tracker.all().toString());
    }

    @Then("the duel fights {string} and the melee brain never saw the sentry")
    public void duelFightsNotSentry(String name) {
        assertEquals(name, core.duel().opponent());
        for (EnemyInfo e : core.melee().tracker.all()) {
            assertFalse(e.name.contains("BorderGuard"), "tracked " + e.name);
        }
    }

    @Then("the round's veto is {string}")
    public void vetoIs(String veto) {
        assertEquals(veto, core.veto().name().toLowerCase(java.util.Locale.ROOT));
    }

    @Then("a melee fault was recorded")
    public void faultRecorded() {
        assertTrue(telemetry.stream().anyMatch(l -> l.startsWith("FAULT,") && l.contains(",melee,")),
            telemetry.toString());
        assertEquals(1, core.stats().faults);
    }

    @Then("the M record reads {int} melee ticks, {int} focused-duel ticks, veto {string} and {int} fault(s)")
    public void mRecord(int melee, int focus, String veto, int faults) {
        String m = telemetry.stream().filter(l -> l.startsWith("M,")).reduce((a, b) -> b).orElseThrow();
        String[] f = m.split(",");
        assertEquals(String.valueOf(melee), f[3], m);
        assertEquals("0", f[4], m);
        assertEquals(String.valueOf(focus), f[5], m);
        assertEquals(veto, f[6], m);
        assertEquals(String.valueOf(faults), f[7], m);
        assertEquals("0", f[9], m);
        assertEquals("0", f[10], m);
    }
}
