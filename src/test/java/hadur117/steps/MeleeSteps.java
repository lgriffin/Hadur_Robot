package hadur117.steps;

import static org.junit.jupiter.api.Assertions.*;

import hadur117.melee.*;
import hadur117.utils.BattleField;
import hadur117.utils.DiaUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import java.awt.geom.Point2D;
import java.util.*;
import robocode.util.Utils;

/**
 * Step definitions for {@code 08_melee_strategy.feature}. Each scenario drives the
 * real melee subsystems offline on an 800x600 battlefield.
 */
public class MeleeSteps {

    private final BattleField field = new BattleField(800, 600);
    private final MeleeController controller = new MeleeController(field);
    private final EnemyTracker tracker = controller.tracker;
    private final MeleeMover mover = controller.mover();
    private final Map<String, EnemyInfo> named = new LinkedHashMap<>();

    private Point2D.Double me = new Point2D.Double(400, 300);
    private double myEnergy = 100;
    private double gunHeading = 0;
    private long now = 0;
    private int others;
    private BattleMode mode;
    private Point2D.Double destination;
    private MeleeStrategy.Plan plan;
    private MeleeController.Command command;
    private String selected;
    private EnemyInfo staleOne;
    private MeleeGun.Aim aim;
    private RadarSim radarSim;

    @Before
    public void freshBattle() {
        OpponentStatsBook.clear();
    }

    // --- helpers ---

    private EnemyInfo place(String name, Point2D.Double at, double energy) {
        EnemyInfo e = tracker.onScan(name, at, energy, 0, 0, now);
        named.put(name, e);
        others = Math.max(others, tracker.alive().size());
        return e;
    }

    private MeleeController.Command tick() {
        command = controller.tick(new MeleeController.Situation(
            me, gunHeading, 0, myEnergy, now, others));
        return command;
    }

    private MeleeStrategy.Plan evaluate() {
        plan = controller.strategy().evaluate(tracker, me, myEnergy, others, now);
        return plan;
    }

    private Point2D.Double choose() {
        destination = mover.chooseDestination(me, tracker.alive(), now,
            plan != null ? plan : evaluate());
        return destination;
    }

    private double enemyRisk(Point2D.Double p) {
        double r = 0;
        for (EnemyInfo e : tracker.alive()) r += mover.enemyRisk(p, p, e, now);
        return r;
    }

    private static double minDistance(Point2D.Double p, Collection<EnemyInfo> enemies) {
        double d = Double.POSITIVE_INFINITY;
        for (EnemyInfo e : enemies) d = Math.min(d, e.distance(p));
        return d;
    }

    private static Point2D.Double at(Point2D.Double from, double bearingDeg, double distance) {
        return DiaUtils.project(from, Math.toRadians(bearingDeg), distance);
    }

    // --- background ---

    @Given("Hadur is deployed on a battlefield with {int} or more robots")
    public void deployed(int robots) {
        others = robots - 1;
    }

    @Given("the battle mode is detected as {string}")
    public void modeDetected(String expected) {
        mode = BattleMode.fromOthers(others);
        assertEquals(BattleMode.valueOf(expected), mode);
    }

    @Given("the melee strategy subsystem is active")
    public void meleeActive() {
        assertNotNull(controller);
    }

    // --- mode detection ---

    @Given("^there are exactly (\\d+) robots in the battle \\(Hadur and one enemy\\)$")
    public void exactlyRobots(int robots) {
        others = robots - 1;
    }

    @Given("there are {int} or more robots in the battle")
    public void orMoreRobots(int robots) {
        others = robots - 1;
    }

    @When("the battle begins")
    public void battleBegins() {
        mode = BattleMode.fromOthers(others);
    }

    @Then("the battle mode should be set to {string}")
    @Then("the battle mode should switch to {string}")
    public void modeIs(String expected) {
        assertEquals(BattleMode.valueOf(expected), mode);
    }

    @Then("the 1v1 subsystems should be activated")
    public void duelSubsystems() {
        assertEquals(BattleMode.DUEL, mode);
    }

    @Then("wave surfing movement should be enabled")
    @Then("movement should transition to wave surfing")
    public void waveSurfing() {
        assertEquals(BattleMode.Movement.WAVE_SURFING, mode.movement);
    }

    @Then("virtual gun array should target the single enemy")
    @Then("targeting should switch to the virtual gun array")
    public void virtualGuns() {
        assertEquals(BattleMode.Targeting.VIRTUAL_GUN_ARRAY, mode.targeting);
        assertEquals(1, others);
    }

    @Then("the melee subsystems should be activated")
    public void meleeSubsystems() {
        assertEquals(BattleMode.MELEE, mode);
        place("a", new Point2D.Double(150, 150), 100);
        place("b", new Point2D.Double(650, 450), 100);
        tick();
        assertNotNull(command.destination, "melee movement picks a destination");
        assertNotNull(command.target, "melee targeting picks a target");
    }

    @Then("movement should switch to anti-gravity")
    public void antiGravity() {
        assertEquals(BattleMode.Movement.MINIMUM_RISK, mode.movement);
    }

    @Then("the radar should switch to full sweep mode")
    public void fullSweep() {
        assertEquals(BattleMode.Radar.FULL_SWEEP, mode.radar);
        assertTrue(Double.isInfinite(tick().radarTurn));
    }

    @Given("the battle started with {int} robots")
    public void battleStarted(int robots) {
        others = robots - 1;
        mode = BattleMode.fromOthers(others);
        assertEquals(BattleMode.MELEE, mode);
    }

    @Given("{int} opponents have been destroyed")
    public void destroyed(int n) {
        others -= n;
    }

    @Given("only Hadur and {int} enemy remain")
    public void remain(int n) {
        assertEquals(n, others);
    }

    @When("the opponent count drops to {int}")
    public void countDrops(int n) {
        others = n;
        mode = BattleMode.fromOthers(others);
    }

    @Then("the radar should switch to narrow lock")
    public void narrowLock() {
        assertEquals(BattleMode.Radar.NARROW_LOCK, mode.radar);
    }

    // --- radar ---

    @Given("there are {int} opponents on the battlefield")
    public void opponentsOnField(int n) {
        Map<String, Point2D.Double> robots = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            robots.put("r" + i, at(me, 20 + i * 360.0 / n + i * 17, 150 + 40 * i));
        }
        others = n;
        radarSim = new RadarSim(tracker, me, robots);
    }

    @When("the radar operates in melee mode")
    public void radarOperates() {
        radarSim.run(8);
        assertTrue(radarSim.sawAll(), "the opening sweep finds everyone within one turn");
        radarSim.run(192);
    }

    @Then("the radar should perform full 360-degree sweeps")
    public void fullSweeps() {
        EnemyTracker empty = new EnemyTracker();
        assertEquals(Double.POSITIVE_INFINITY,
            new MeleeRadar().radarTurn(me, 0, empty, others));
    }

    @Then("each opponent should be scanned at least once every {int} ticks")
    public void scannedEvery(int ticks) {
        assertTrue(radarSim.worstGap() <= ticks, "worst gap " + radarSim.worstGap());
    }

    @Then("scan data should be stored for all known opponents")
    public void scanDataStored() {
        assertEquals(others, tracker.alive().size());
        for (EnemyInfo e : tracker.alive()) assertNotNull(e.location);
    }

    @Given("{int} opponents are being tracked")
    public void beingTracked(int n) {
        for (int i = 0; i < n; i++) {
            place("t" + i, at(me, i * 360.0 / n, 250), 100);
        }
        staleOne = named.get("t0");
    }

    @When("an opponent has not been scanned for {int} ticks")
    public void notScannedFor(int ticks) {
        now += ticks;
        for (EnemyInfo e : new ArrayList<>(named.values())) {
            if (e != staleOne) tracker.onScan(e.name, e.location, e.energy, 0, 0, now);
        }
    }

    @Then("that opponent's data should be marked as {string}")
    public void markedAs(String status) {
        assertEquals("STALE", status);
        assertTrue(staleOne.isStale(now));
        for (EnemyInfo e : tracker.alive()) {
            if (e != staleOne) assertFalse(e.isStale(now));
        }
    }

    @Then("stale opponent data should be weighted lower in decisions")
    public void staleWeightedLower() {
        EnemyInfo fresh = named.get("t1");
        assertTrue(staleOne.freshness(now) < fresh.freshness(now));
        Point2D.Double p = new Point2D.Double(400, 300);
        assertTrue(mover.enemyRisk(p, p, staleOne, now) < mover.enemyRisk(p, p, fresh, now));
        MeleeTargetSelector s = controller.selector();
        assertTrue(s.score(staleOne, me, 0, now, myEnergy) > s.score(fresh, me, 0, now, myEnergy));
    }

    @Then("the radar should prioritise re-scanning stale targets")
    public void radarPrioritisesStale() {
        assertSame(staleOne, tracker.stalest());
        double bearing = DiaUtils.absoluteBearing(me, staleOne.location);
        double radarHeading = Utils.normalAbsoluteAngle(bearing + 1.0);
        double turn = new MeleeRadar().radarTurn(me, radarHeading, tracker, others);
        assertTrue(turn < 0, "radar turns back toward the stale opponent");
    }

    // --- anti-gravity movement ---

    @Given("enemy {word} is at position \\({int}, {int})")
    public void enemyAt(String name, int x, int y) {
        place(name, new Point2D.Double(x, y), 100);
    }

    @Given("Hadur is at position \\({int}, {int})")
    public void hadurAt(int x, int y) {
        me = new Point2D.Double(x, y);
    }

    @Given("the west wall is {int} pixels away")
    public void westWall(int px) {
        assertEquals(px, me.x, 1e-9);
    }

    @When("anti-gravity forces are calculated")
    @When("Hadur selects a movement target")
    @When("the movement system evaluates position safety")
    public void calculateForces() {
        plan = MeleeStrategy.Plan.normal();
        choose();
    }

    @Then("the combined repulsion from A and B should be strong \\(they are close together and to Hadur)")
    public void clusterRepulsion() {
        EnemyInfo a = named.get("A"), b = named.get("B"), c = named.get("C");
        double ab = mover.enemyRisk(me, me, a, now) + mover.enemyRisk(me, me, b, now);
        double cr = mover.enemyRisk(me, me, c, now);
        assertTrue(ab > 3 * cr, "A+B " + ab + " vs C " + cr);
    }

    @Then("Hadur should move toward the area of lowest enemy density")
    public void lowestDensity() {
        assertTrue(enemyRisk(destination) < enemyRisk(me));
        Point2D.Double cluster = new Point2D.Double(225, 215);
        assertTrue(destination.distance(cluster) > me.distance(cluster));
    }

    @Then("the movement should favour open space")
    public void openSpace() {
        assertTrue(minDistance(destination, tracker.alive()) > minDistance(me, tracker.alive()));
    }

    @Then("the west wall should exert a repulsion force")
    public void westWallRepels() {
        assertTrue(mover.wallRisk(me) > 0);
        assertTrue(mover.wallRisk(me) > mover.wallRisk(new Point2D.Double(200, 300)));
    }

    @Then("the wall repulsion should prevent Hadur from getting cornered")
    public void notCornered() {
        assertTrue(destination.x > me.x, "moves away from the west wall");
        assertTrue(mover.wallRisk(destination) < mover.wallRisk(me));
    }

    @Then("the force should increase sharply below {int} pixels from any wall")
    public void sharpIncrease(int px) {
        double inside = wallAt(px - 10) - wallAt(px);
        double outside = wallAt(px) - wallAt(px + 10);
        assertTrue(inside > 2 * outside, "rise below " + px + ": " + inside + " vs " + outside);
    }

    private double wallAt(double x) {
        return mover.wallRisk(new Point2D.Double(x, 300));
    }

    @Given("{int} enemies are on the battlefield")
    public void enemiesOnField(int n) {
        Point2D.Double[] spots = {
            new Point2D.Double(200, 200), new Point2D.Double(600, 450), new Point2D.Double(650, 150)
        };
        for (int i = 0; i < n; i++) place("e" + i, spots[i % spots.length], 100);
    }

    @Then("the target should maintain at least {int} pixels from the nearest enemy")
    public void keepsDistance(int px) {
        assertTrue(minDistance(destination, tracker.alive()) >= px,
            "nearest enemy " + minDistance(destination, tracker.alive()));
    }

    @Then("the target should prefer positions with clear escape routes")
    public void escapeRoutes() {
        assertTrue(mover.escapeRoutes(destination, tracker.alive()) >= 6);
    }

    @Then("the target should avoid positioning between two enemies")
    public void notBetween() {
        List<EnemyInfo> alive = tracker.alive();
        for (int i = 0; i < alive.size(); i++) {
            for (int j = i + 1; j < alive.size(); j++) {
                double angle = Math.abs(Utils.normalRelativeAngle(
                    DiaUtils.absoluteBearing(destination, alive.get(i).location)
                    - DiaUtils.absoluteBearing(destination, alive.get(j).location)));
                assertTrue(angle < Math.toRadians(150), "between two enemies");
            }
        }
    }

    @Given("Hadur is near the northeast corner")
    public void nearNortheast() {
        me = new Point2D.Double(740, 540);
    }

    @Given("{int} enemies are approaching from the south and west")
    public void approachingSouthWest(int n) {
        assertEquals(2, n);
        place("south", new Point2D.Double(700, 180), 100);
        place("west", new Point2D.Double(360, 520), 100);
    }

    @Then("the corner penalty should be high")
    public void cornerPenaltyHigh() {
        double corner = mover.cornerRisk(me);
        assertTrue(corner > 0);
        for (EnemyInfo e : tracker.alive()) {
            assertTrue(corner > mover.enemyRisk(me, me, e, now), "corner outweighs " + e.name);
        }
        assertEquals(0, mover.cornerRisk(new Point2D.Double(400, 300)));
    }

    @Then("Hadur should move toward the centre of the battlefield")
    public void towardCentre() {
        Point2D.Double centre = new Point2D.Double(400, 300);
        assertTrue(destination.distance(centre) < me.distance(centre));
    }

    @Then("escape paths should be evaluated for multiple opponents")
    public void escapePathsEvaluated() {
        assertTrue(mover.escapeRoutes(destination, tracker.alive())
            > mover.escapeRoutes(me, tracker.alive()));
    }

    // --- targeting ---

    @Given("{int} opponents are alive")
    public void opponentsAlive(int n) {
        others = n;
    }

    @Given("opponent {word} has {int} energy and is {int} pixels away")
    public void opponentHas(String name, int energy, int distance) {
        double bearing = 90.0 * named.size();
        place(name, at(me, bearing, distance), energy);
    }

    @When("the target selector evaluates all opponents")
    @When("the target selector evaluates")
    public void selectorEvaluates() {
        selected = controller.selector().select(tracker, me, gunHeading, now, myEnergy, null);
    }

    @Then("target priority should consider:")
    public void priorityConsiders(DataTable table) {
        Map<String, Double> influence = new HashMap<>();
        // Score swing across each factor's realistic range.
        influence.put("Energy", scoreSwing(e -> place("probe", e.location, 0),
                                           e -> place("probe", e.location, 100)));
        influence.put("Distance", scoreSwing(e -> place("probe", at(me, 0, 100), 50),
                                             e -> place("probe", at(me, 0, 1000), 50)));
        influence.put("Angle to gun", scoreSwing(e -> place("probe", at(me, 0, 300), 50),
                                                 e -> place("probe", at(me, 180, 300), 50)));
        influence.put("Threat level", threatSwing());
        tracker.onRobotDeath("probe");

        Map<String, Integer> rank = Map.of("HIGH", 3, "MEDIUM", 2, "LOW", 1);
        List<Map<String, String>> rows = table.asMaps();
        for (Map<String, String> a : rows) {
            assertTrue(influence.get(a.get("Factor")) > 0, a.get("Factor") + " has no effect");
            for (Map<String, String> b : rows) {
                if (rank.get(a.get("Weight")) > rank.get(b.get("Weight"))) {
                    assertTrue(influence.get(a.get("Factor")) > influence.get(b.get("Factor")),
                        a.get("Factor") + " should outweigh " + b.get("Factor"));
                }
            }
        }
    }

    private double scoreSwing(java.util.function.Consumer<EnemyInfo> low,
                              java.util.function.Consumer<EnemyInfo> high) {
        EnemyInfo probe = place("probe", at(me, 0, 300), 50);
        MeleeTargetSelector s = controller.selector();
        low.accept(probe);
        double a = s.score(named.get("probe"), me, gunHeading, now, myEnergy);
        high.accept(probe);
        double b = s.score(named.get("probe"), me, gunHeading, now, myEnergy);
        return Math.abs(b - a);
    }

    private double threatSwing() {
        EnemyInfo probe = place("probe", at(me, 0, 300), 50);
        MeleeTargetSelector s = controller.selector();
        double calm = s.score(probe, me, gunHeading, now, 20);
        double healthy = s.score(probe, me, gunHeading, now, 100);
        OpponentStatsBook.get("probe").recordDamageReceived(100, Double.NaN, 0);
        // Threat only counts once Hadur is endangered.
        assertEquals(healthy, s.score(probe, me, gunHeading, now, 100));
        return Math.abs(calm - s.score(probe, me, gunHeading, now, 20));
    }

    @Then("^opponent (\\w+) should be the highest priority target \\(low energy, close range\\)$")
    public void highestPriority(String name) {
        assertEquals(name, selected);
    }

    @Given("Hadur is targeting opponent {word}")
    public void targeting(String name) {
        place(name, at(me, 10, 180), 15);
        place("B", at(me, 100, 300), 70);
        place("C", at(me, 250, 450), 40);
        others = 3;
        selectorEvaluates();
        assertEquals(name, selected);
    }

    @Given("opponent {word} is destroyed")
    public void opponentDestroyed(String name) {
        controller.onRobotDeath(name);
        others--;
    }

    @When("the next tick executes")
    public void nextTick() {
        now++;
        tick();
    }

    @Then("the target selector should immediately re-evaluate")
    public void reEvaluated() {
        assertNotNull(command.target);
        assertNotEquals("A", command.target);
    }

    @Then("the next best target should be selected")
    public void nextBest() {
        MeleeTargetSelector s = controller.selector();
        EnemyInfo best = null;
        for (EnemyInfo e : tracker.alive()) {
            if (best == null || s.score(e, me, gunHeading, now, myEnergy)
                    < s.score(best, me, gunHeading, now, myEnergy)) best = e;
        }
        assertEquals(best.name, command.target);
    }

    @Then("the gun should begin tracking the new target")
    public void gunTracks() {
        EnemyInfo target = tracker.get(command.target);
        double aimed = gunHeading + command.gunTurn;
        double bearing = DiaUtils.absoluteBearing(me, target.location);
        assertEquals(0, Utils.normalRelativeAngle(aimed - bearing), 0.05);
    }

    @Given("Hadur is targeting opponent {word} at {int} pixels distance")
    public void targetingAt(String name, int distance) {
        place(name, at(me, 0, distance), 60);
        others = 3;
        selectorEvaluates();
        assertEquals(name, selected);
    }

    @Given("opponent {word} moves to within {int} pixels with {int} energy")
    public void movesWithin(String name, int distance, int energy) {
        place(name, at(me, 30, distance), energy);
    }

    @Then("the target should switch to opponent {word}")
    public void switchedTo(String name) {
        assertEquals(name, selected);
    }

    @Then("the switch should only occur if the gun can reach the new target quickly")
    public void onlyIfGunReaches() {
        assertTrue(MeleeTargetSelector.gunTurnTicks(named.get("C"), me, gunHeading) <= 4);

        // The same opportunity directly behind the gun does not pull it off target.
        EnemyTracker t = new EnemyTracker();
        MeleeTargetSelector s = new MeleeTargetSelector();
        t.onScan("B", at(me, 0, 400), 60, 0, 0, now);
        assertEquals("B", s.select(t, me, gunHeading, now, myEnergy, null));
        t.onScan("C", at(me, 180, 150), 15, 0, 0, now);
        assertEquals("B", s.select(t, me, gunHeading, now, myEnergy, null));
    }

    @Given("the battle mode is {string}")
    public void battleModeIs(String expected) {
        mode = BattleMode.fromOthers(others);
        assertEquals(BattleMode.valueOf(expected), mode);
    }

    @Given("Hadur is targeting an opponent")
    public void targetingAnOpponent() {
        tracker.onScan("circler", new Point2D.Double(150, 250), 100, 0.0, 8, now);
        now += 2;
        named.put("circler", tracker.onScan("circler", new Point2D.Double(151, 266),
            100, 0.1, 8, now));
    }

    @When("the gun selects a targeting strategy")
    public void gunSelects() {
        aim = controller.gun().aim(me, named.get("circler"), 2.0, now);
    }

    @Then("the primary gun should be circular prediction \\(fast, good enough)")
    public void circularPrimary() {
        assertEquals(MeleeGun.Strategy.CIRCULAR, aim.strategy);
        EnemyInfo e = named.get("circler");
        Point2D.Double linear = controller.gun().predict(me, e, 2.0, now, 0.0);
        assertTrue(aim.predicted.distance(linear) > 5, "circular accounts for the turn");
    }

    @Then("linear prediction should be the fallback")
    public void linearFallback() {
        EnemyInfo newcomer = tracker.onScan("newcomer", new Point2D.Double(100, 100),
            100, 1.0, 8, now);
        assertEquals(MeleeGun.Strategy.LINEAR, controller.gun().aim(me, newcomer, 2.0, now).strategy);
    }

    @Then("the full virtual gun array should NOT be used \\(too computationally expensive for melee)")
    public void noVirtualGuns() {
        assertNotEquals(BattleMode.Targeting.VIRTUAL_GUN_ARRAY, mode.targeting);
    }

    // --- survival ---

    @Given("opponent {word} is at bearing {int} degrees")
    public void atBearing(String name, int bearing) {
        place(name, at(me, bearing, 220), 100);
    }

    @Given("Hadur is between them")
    public void between() {
        double angle = Math.abs(Utils.normalRelativeAngle(
            DiaUtils.absoluteBearing(me, named.get("A").location)
            - DiaUtils.absoluteBearing(me, named.get("B").location)));
        assertEquals(Math.PI, angle, 0.01);
    }

    @Then("the current position should receive a high danger penalty")
    public void highDanger() {
        List<EnemyInfo> alive = tracker.alive();
        double here = mover.crossfireRisk(me, alive, now);
        assertTrue(here > mover.enemyRisk(me, me, named.get("A"), now), "crossfire dominates");
        assertTrue(mover.crossfireRisk(destination, alive, now) < here / 4);
    }

    @Then("Hadur should move perpendicular to the A-B line")
    public void perpendicular() {
        double line = DiaUtils.absoluteBearing(named.get("A").location, named.get("B").location);
        double move = DiaUtils.absoluteBearing(me, destination);
        assertTrue(Math.abs(Math.sin(move - line)) > 0.7,
            "move " + Math.toDegrees(move) + " vs line " + Math.toDegrees(line));
    }

    @Then("the escape direction should be chosen based on additional threats")
    public void escapeFromThirdThreat() {
        // A third opponent on one side of the line pushes the escape to the other side.
        mover.newRound();
        place("C", at(me, 120, 260), 100);
        choose();
        Point2D.Double away = at(me, 300, 1);
        double dot = (destination.x - me.x) * (away.x - me.x) + (destination.y - me.y) * (away.y - me.y);
        assertTrue(dot > 0, "escapes away from C");
    }

    @Given("opponents A and B are engaged in close combat")
    public void engaged() {
        me = new Point2D.Double(650, 200);
        place("A", new Point2D.Double(180, 450), 100);
        place("B", new Point2D.Double(320, 470), 100);
        place("C", new Point2D.Double(700, 540), 100);
        others = 3;
    }

    @Given("both are taking damage from each other")
    public void takingDamage() {
        now += 10;
        place("A", named.get("A").location, 84);
        place("B", named.get("B").location, 88);
        place("C", named.get("C").location, 100);
    }

    @When("Hadur evaluates strategy")
    @When("the strategy is evaluated")
    public void strategyEvaluated() {
        evaluate();
        mover.newRound();
        tick();
        destination = command.destination;
    }

    @Then("Hadur should maintain distance from the fight")
    public void distanceFromFight() {
        assertEquals(MeleeStrategy.Posture.LET_THEM_FIGHT, plan.posture);
        Point2D.Double mid = new Point2D.Double(250, 460);
        assertTrue(destination.distance(mid) >= 350, "distance " + destination.distance(mid));
    }

    @Then("Hadur should position for a finishing strike on the weakened survivor")
    public void finishingStrike() {
        assertEquals("A", plan.preferredTarget.name);
        assertEquals("A", command.target);
        assertTrue(destination.distance(named.get("A").location) < 650);
    }

    @Then("fire power should be conserved during the engagement")
    public void powerConserved() {
        double base = MeleeGun.basePower(named.get("A").distance(me), myEnergy, 84, others);
        assertTrue(MeleeStrategy.adjustPower(base, plan.posture) < base);
        assertTrue(command.firePower < base);
    }

    @Given("Hadur has the highest energy among all robots")
    public void highestEnergyAmongAll() {
        myEnergy = 100;
        place("x", new Point2D.Double(250, 420), 60);
        place("y", new Point2D.Double(520, 420), 70);
        place("z", new Point2D.Double(430, 150), 50);
        me = new Point2D.Double(400, 330);
        others = 3;
    }

    @Then("Hadur should reduce unnecessary aggression")
    public void reduceAggression() {
        assertEquals(MeleeStrategy.Posture.LOW_PROFILE, plan.posture);
        EnemyInfo t = tracker.get(command.target);
        double base = MeleeGun.basePower(t.distance(me), myEnergy, t.energy, others);
        assertTrue(command.firePower < base);
    }

    @Then("Hadur should avoid drawing attention from multiple opponents")
    @Then("positioning should favour the periphery of the battle")
    public void periphery() {
        Point2D.Double c = new Point2D.Double(400, 330);
        assertTrue(destination.distance(c) > me.distance(c));
    }

    @Given("{int} opponents remain alive")
    public void remainAlive(int n) {
        place("weak", new Point2D.Double(180, 450), 30);
        place("strong", new Point2D.Double(650, 150), 70);
        others = n;
    }

    @Given("Hadur has the highest energy")
    public void highestEnergy() {
        myEnergy = 90;
        me = new Point2D.Double(620, 430);
    }

    @Then("Hadur should target the weaker opponent aggressively")
    public void targetWeaker() {
        assertEquals(MeleeStrategy.Posture.AGGRESSIVE, plan.posture);
        assertEquals("weak", command.target);
    }

    @Then("fire power should increase")
    public void powerIncreases() {
        double base = MeleeGun.basePower(named.get("weak").distance(me), myEnergy, 30, others);
        assertTrue(MeleeStrategy.adjustPower(base, plan.posture) > base);
        assertTrue(command.firePower > base);
    }

    @Then("positioning should cut off the weaker opponent's escape routes")
    public void cutOff() {
        Point2D.Double cut = mover.cutOffPoint(named.get("weak"));
        assertTrue(destination.distance(cut) < me.distance(cut));
    }

    // --- multi-round ---

    @Given("a melee battle has completed {int} rounds")
    public void roundsCompleted(int rounds) {
        for (int round = 0; round < rounds; round++) {
            controller.newRound();
            for (int t = 0; t < 20; t++) {
                long time = t * 4L;
                // A sits still, B drives in a circle, C shuffles back and forth.
                observe("A", new Point2D.Double(100, 100), 0, 0, time);
                observe("B", new Point2D.Double(600, 300), 0.15 * t, 8, time);
                observe("C", new Point2D.Double(300, 500), 0, (t % 2 == 0) ? 6 : -6, time);
            }
            for (String name : List.of("A", "B", "C")) {
                OpponentStatsBook.get(name).recordDamageDealt(10);
                OpponentStatsBook.get(name).recordDamageReceived(4, 0.0, 0.05);
            }
        }
    }

    private void observe(String name, Point2D.Double at, double heading, double velocity, long time) {
        EnemyInfo e = tracker.onScan(name, at, 100, heading, velocity, time);
        OpponentStatsBook.get(name).recordScan(e.distance(me), velocity, e.turnRate());
    }

    @When("opponent statistics are reviewed")
    public void statsReviewed() {
        assertEquals(3, OpponentStatsBook.all().size());
    }

    @Then("each opponent should have individual records for:")
    public void individualRecords(DataTable table) {
        for (OpponentStats s : OpponentStatsBook.all()) {
            for (Map<String, String> row : table.asMaps()) {
                String stat = row.get("Stat").trim();
                switch (stat) {
                    case "Damage dealt to": assertTrue(s.damageDealtTo() > 0); break;
                    case "Damage received from": assertTrue(s.damageReceivedFrom() > 0); break;
                    case "Movement type":
                        assertNotEquals(OpponentStats.MovementType.UNKNOWN, s.movementType()); break;
                    case "Gun type detected":
                        assertNotEquals(OpponentStats.GunType.UNKNOWN, s.gunType()); break;
                    case "Average distance": assertTrue(s.averageDistance() > 0); break;
                    default: fail("unknown stat " + stat);
                }
            }
        }
        assertEquals(OpponentStats.MovementType.STOPPED, OpponentStatsBook.get("A").movementType());
        assertEquals(OpponentStats.MovementType.CIRCULAR, OpponentStatsBook.get("B").movementType());
        assertEquals(OpponentStats.MovementType.OSCILLATING, OpponentStatsBook.get("C").movementType());
        assertEquals(OpponentStats.GunType.HEAD_ON, OpponentStatsBook.get("A").gunType());
    }

    @Then("these stats should persist across rounds via static fields")
    public void persistAcrossRounds() {
        // Round state was reset five times; the battle-long totals kept every round.
        assertTrue(tracker.alive().size() <= 3);
        for (OpponentStats s : OpponentStatsBook.all()) {
            assertEquals(50, s.damageDealtTo(), 1e-9);
            assertEquals(20, s.damageReceivedFrom(), 1e-9);
        }
    }
}
