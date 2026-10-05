package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.model.BattleFacts;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.shieldmode.ShieldList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;

/** Steps for shieldmode.feature: SHIELD-5 and SHIELD-6 through the whole core. */
public class ShieldModeSteps {

    private static final double MY_X = 200;
    private static final double MY_Y = 300;

    private final List<String> records = new ArrayList<>();
    private final List<String> plainRecords = new ArrayList<>();
    private final List<BotOrders> orders = new ArrayList<>();
    private final List<BotOrders> plainOrders = new ArrayList<>();
    private final List<BotEvent> pending = new ArrayList<>();
    private HadurCore core;
    /** The same battle with no list at all, fed the same inputs. */
    private HadurCore plain;
    private String enemy;
    private int round;
    private long time;

    private void start(String enemyName, int enemies, ShieldList list) {
        enemy = enemyName;
        BattleFacts facts = BattleFacts.solo(800, 600, enemies);
        core = new HadurCore(facts, records::add, null, null, list);
        plain = new HadurCore(facts, plainRecords::add, null, null, ShieldList.NONE);
        core.newRound(0);
        plain.newRound(0);
    }

    @Given("a duel against {string} and a shield list naming {string}")
    public void duel(String enemyName, String listed) {
        start(enemyName, 1, ShieldList.parse(List.of("# the list", listed)));
    }

    @Given("a duel against {string} and an empty shield list")
    public void duelEmptyList(String enemyName) {
        start(enemyName, 1, ShieldList.parse(List.of("# nobody")));
    }

    @Given("a melee against {string} and a second opponent, and a shield list naming {string}")
    public void melee(String enemyName, String listed) {
        start(enemyName, 2, ShieldList.parse(List.of(listed)));
    }

    @Given("{int} rounds won against it")
    public void roundsWon(int n) {
        for (int i = 0; i < n; i++) {
            scanTick(400, 1);
            core.roundEnded(time, "win", 100, 0);
            plain.roundEnded(time, "win", 100, 0);
            round++;
            time = 0;
            core.newRound(round);
            plain.newRound(round);
        }
    }

    /** One tick: a scan of the enemy {@code distance} px due east, plus whatever events are pending. */
    private void scanTick(double distance, int others) {
        List<BotEvent> events = new ArrayList<>(pending);
        pending.clear();
        events.add(new BotEvent.Scan(enemy, Math.PI / 2, distance, 100, 0, 0));
        if (others == 2) events.add(new BotEvent.Scan("second.Robot 1.0", -Math.PI / 2, 300, 100, 0, 0));
        BotInput in = new BotInput(++time, round, MY_X, MY_Y, 0, 0, 100, 1.5, 0.1, 0, 0,
            Math.PI / 2, others, events);
        orders.add(core.tick(in));
        plainOrders.add(plain.tick(in));
    }

    @When("the enemy is scanned {int} px due east")
    public void scanned(int distance) {
        scanTick(distance, 1);
    }

    @When("the enemy is scanned {int} px due east for {int} ticks")
    public void scannedFor(int distance, int ticks) {
        for (int i = 0; i < ticks; i++) scanTick(distance, 1);
    }

    @When("both are scanned for {int} ticks")
    public void bothScanned(int ticks) {
        for (int i = 0; i < ticks; i++) scanTick(400, 2);
    }

    @When("{int} enemy bullets of power {double} hit us")
    public void hit(int n, double power) {
        for (int i = 0; i < n; i++) {
            pending.add(new BotEvent.HitByBullet(enemy, power, MY_X, MY_Y, Math.PI * 1.5));
            scanTick(400, 1);
        }
    }

    @When("the next round starts and the enemy is scanned {int} px due east")
    public void nextRound(int distance) {
        core.roundEnded(time, "loss", 0, 0);
        plain.roundEnded(time, "loss", 0, 0);
        round++;
        time = 0;
        core.newRound(round);
        plain.newRound(round);
        scanTick(distance, 1);
    }

    private boolean has(String record) {
        return records.stream().anyMatch(r -> r.startsWith(record));
    }

    @Then("the telemetry says shield mode is on in round {int}")
    public void on(int r) {
        assertTrue(records.stream().anyMatch(rec -> rec.matches("SH," + r + ",\\d+,on")), records.toString());
    }

    @Then("the telemetry says shield mode was left in round {int} because {string}")
    public void left(int r, String why) {
        assertTrue(records.stream().anyMatch(rec -> rec.matches("SH," + r + ",\\d+,exit," + why)),
            records.toString());
    }

    @Then("the telemetry says shield mode is off for the battle because {string}")
    public void off(String why) {
        assertTrue(records.stream().anyMatch(rec -> rec.matches("SH,\\d+,\\d+,off," + why)), records.toString());
    }

    @Then("the telemetry holds no shield record")
    public void noShieldRecord() {
        assertFalse(has("SH,") || has("SR,"), records.toString());
    }

    @Then("the telemetry holds no shield record for round {int}")
    public void noShieldRecordForRound(int r) {
        assertFalse(has("SH," + r + ",") || has("SR," + r + ","), records.toString());
    }

    @Then("the telemetry holds no budget exit")
    public void noBudgetExit() {
        assertFalse(records.stream().anyMatch(rec -> rec.contains(",off,budget")), records.toString());
        assertTrue(has("SH,5,"), "shield mode ran in round 5: " + records);
    }

    @Then("the robot holds still and holds fire")
    public void holdsStill() {
        BotOrders last = orders.get(orders.size() - 1);
        assertEquals(0.0, last.ahead(), 0, "shield mode orders no movement");
        assertEquals(0.0, last.firePower(), 0, "and no shot with no bullet to meet");
    }

    @Then("every order is the one a core without the list gives")
    public void sameAsPlain() {
        assertEquals(plainOrders, orders);
        assertEquals(plainRecords, records);
        assertNotEquals(0, orders.size());
    }
}
