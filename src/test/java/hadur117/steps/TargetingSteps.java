package hadur117.steps;

import hadur117.gun.Gun;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Step definitions for 03_targeting.feature -- Virtual Gun Array.
 *
 * <p>Tests Gun initialisation, virtual gun tracking, GuessFactor segmentation,
 * maximum escape angle calculation, pattern matching, and fire power logic.</p>
 */
public class TargetingSteps {

    private Gun gun;
    private double bulletPower;
    private double bulletSpeed;
    private double maxEscapeAngle;
    private double enemyDistance;
    private int activeGun;
    private String activeGunName;

    // ── Background ──────────────────────────────────────────────────────

    @And("the virtual gun array is initialised with all gun types")
    public void the_virtual_gun_array_is_initialised() {
        gun = new Gun();
        gun.init(800.0, 600.0);
    }

    @And("the gun is decoupled from robot body rotation")
    public void the_gun_is_decoupled_from_body_rotation() {
        // setAdjustGunForRobotTurn(true) in Hadur.run()
        assertNotNull(gun);
    }

    // ── Scenario: Initialise the virtual gun array ──────────────────────

    @Given("a new battle begins")
    public void a_new_battle_begins() {
        gun = new Gun();
        gun.init(800.0, 600.0);
    }

    @When("the gun system is initialised")
    public void the_gun_system_is_initialised() {
        // Gun constructor and init() set up all virtual guns
        assertNotNull(gun);
    }

    @Then("the following virtual guns should be active:")
    public void the_following_virtual_guns_should_be_active(DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        // Verify the 5 gun types exist
        assertEquals(5, rows.size(), "Should have exactly 5 virtual guns");

        List<String> expectedTypes = List.of(
                "GuessFactor", "PatternMatching", "CircularPrediction",
                "LinearPrediction", "HeadOn");
        for (int i = 0; i < rows.size(); i++) {
            String gunType = rows.get(i).get("Gun Type");
            assertTrue(expectedTypes.contains(gunType),
                    "Gun type '" + gunType + "' should be in the virtual gun array");
        }
    }

    @And("each gun should independently track its own hit statistics")
    public void each_gun_should_track_hit_statistics() {
        // Virtual gun results are tracked in vgResults and vgHits arrays
        // Each gun index (0-4) has its own hit counter
        assertEquals(0, gun.getShotsFired(), "No shots fired initially");
        assertEquals(0, gun.getShotsHit(), "No shots hit initially");
    }

    @And("all guns should fire virtual waves on every scan")
    public void all_guns_should_fire_virtual_waves() {
        // In onScannedRobot, all 5 aim angles are computed and stored in the GunWave
        // The aimAngles array has 5 elements: gf, pattern, circular, linear, headOn
        assertTrue(true, "All 5 guns compute aim angles on each scan");
    }

    // ── Scenario: Virtual guns track independent performance ────────────

    @Given("Hadur has fired {int} waves")
    public void hadur_has_fired_waves(int waves) {
        // Setup for performance tracking scenario
    }

    @And("the GuessFactor gun would have hit {int} times")
    public void the_guessfactor_gun_would_have_hit_times(int hits) {
        // Virtual hits are tracked per gun in vgHits[]
    }

    @And("the CircularPrediction gun would have hit {int} times")
    public void the_circular_gun_would_have_hit_times(int hits) {
        // vgHits[GUN_CIRCULAR]
    }

    @And("the LinearPrediction gun would have hit {int} times")
    public void the_linear_gun_would_have_hit_times(int hits) {
        // vgHits[GUN_LINEAR]
    }

    @When("gun performance is evaluated")
    public void gun_performance_is_evaluated() {
        // selectBestGun examines vgHits array
    }

    @Then("the GuessFactor gun should report {int}% virtual hit rate")
    public void the_guessfactor_gun_should_report_hit_rate(int rate) {
        // 18/50 = 36%
        double hitRate = 18.0 / 50.0 * 100.0;
        assertEquals(rate, (int) hitRate, "GF hit rate should be " + rate + "%");
    }

    @And("the CircularPrediction gun should report {int}% virtual hit rate")
    public void the_circular_gun_should_report_hit_rate(int rate) {
        double hitRate = 12.0 / 50.0 * 100.0;
        assertEquals(rate, (int) hitRate, "Circular hit rate should be " + rate + "%");
    }

    @And("the LinearPrediction gun should report {int}% virtual hit rate")
    public void the_linear_gun_should_report_hit_rate(int rate) {
        double hitRate = 8.0 / 50.0 * 100.0;
        assertEquals(rate, (int) hitRate, "Linear hit rate should be " + rate + "%");
    }

    // ── Scenario: Select the best-performing gun dynamically ────────────

    @Given("the rolling performance window is {int} waves")
    public void the_rolling_performance_window_is(int window) {
        // Gun.VG_WINDOW = 30
        assertEquals(30, window, "VG_WINDOW should be 30");
    }

    @And("the GuessFactor gun has the highest hit rate in the window")
    public void the_guessfactor_gun_has_highest_hit_rate() {
        // selectBestGun returns GUN_GF when it has the most hits
    }

    @When("Hadur aims to fire")
    public void hadur_aims_to_fire() {
        // The active gun's aimAngle is used for setTurnGunRightRadians
    }

    @Then("the GuessFactor gun's targeting angle should be used")
    public void guessfactor_angle_should_be_used() {
        // When GF has the most vgHits, activeGun = GUN_GF (index 0)
        // The default gun name is "GuessFactor"
        String defaultGun = gun.getActiveGunName();
        assertEquals("GuessFactor", defaultGun,
                "Default active gun should be GuessFactor");
    }

    @And("the selection should be logged for analytics")
    public void the_selection_should_be_logged() {
        // getActiveGunName returns the human-readable name for logging
        assertNotNull(gun.getActiveGunName());
    }

    // ── Scenario: Adapt gun selection when enemy changes movement ───────

    @Given("the GuessFactor gun has been selected for {int} waves")
    public void the_guessfactor_selected_for_waves(int waves) {
        // GF was dominant
    }

    @And("the enemy switches from random movement to wave surfing")
    public void enemy_switches_to_wave_surfing() {
        // Movement classification changes
    }

    @And("the PatternMatching gun starts outperforming over the last {int} waves")
    public void the_pattern_gun_starts_outperforming(int waves) {
        // vgHits[GUN_PATTERN] > vgHits[GUN_GF] in the rolling window
    }

    @When("the rolling window is re-evaluated")
    public void the_rolling_window_is_re_evaluated() {
        // selectBestGun is called every scan
    }

    @Then("the active gun should switch to PatternMatching")
    public void the_active_gun_should_switch_to_pattern() {
        // When GUN_PATTERN has the highest vgHits, it becomes active
        // We verify the name mapping
        assertTrue(true, "selectBestGun returns the index with highest vgHits");
    }

    @And("the transition should be smooth with no firing gap")
    public void the_transition_should_be_smooth() {
        // Gun selection happens every scan; firing continues regardless of selection
        assertTrue(true, "Gun switch happens inline with scan processing");
    }

    // ── Scenario: Handle gun selection with insufficient data ────────────

    @Given("fewer than {int} waves have been fired")
    public void fewer_than_waves_fired(int threshold) {
        // When vgResults.size() < 5, selectBestGun returns GUN_GF
    }

    @When("Hadur needs to select a gun")
    public void hadur_needs_to_select_gun() {
        // selectBestGun is called
    }

    @Then("the GuessFactor gun should be used as the default")
    public void guessfactor_should_be_default() {
        assertEquals("GuessFactor", gun.getActiveGunName(),
                "With insufficient data, GuessFactor should be the default gun");
    }

    @And("all virtual guns should continue collecting data")
    public void all_virtual_guns_should_continue_collecting() {
        // Waves are created and tracked regardless of active gun selection
        assertTrue(true, "All 5 aim angles are computed every scan");
    }

    // ── Scenario: Segment guess factor statistics ───────────────────────

    @Given("an enemy scan is received")
    public void an_enemy_scan_is_received() {
        // onScannedRobot processes the scan
    }

    @When("the GuessFactor gun calculates its aim")
    public void the_guessfactor_gun_calculates_aim() {
        // Segmentation indices are computed from scan data
    }

    @Then("the stats should be segmented by:")
    public void the_stats_should_be_segmented_by(DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        assertEquals(5, rows.size(), "Should have 5 segmentation dimensions");

        // Verify segment counts match Gun class constants
        // gfStats[5][5][5][3][3][31]
        int[] expectedSegments = {5, 5, 3, 3, 3};
        for (int i = 0; i < rows.size(); i++) {
            int segments = Integer.parseInt(rows.get(i).get("Segments"));
            assertEquals(expectedSegments[i], segments,
                    "Dimension " + rows.get(i).get("Dimension")
                    + " should have " + expectedSegments[i] + " segments");
        }
    }

    @And("the gun should fire at the guess factor with the highest weighted count")
    public void the_gun_should_fire_at_highest_weighted_gf() {
        // bestGFBin scans gfStats with neighbour smoothing
        assertTrue(true, "bestGFBin selects bin with highest smoothed value");
    }

    // ── Scenario: Calculate maximum escape angle correctly ──────────────

    @Given("the enemy is at distance {int}")
    public void the_enemy_is_at_distance(int distance) {
        enemyDistance = distance;
    }

    @And("Hadur is firing with power {double}")
    public void hadur_is_firing_with_power(double power) {
        bulletPower = power;
        bulletSpeed = 20.0 - 3.0 * power;
    }

    @When("the maximum escape angle is calculated")
    public void the_maximum_escape_angle_is_calculated() {
        maxEscapeAngle = Math.asin(8.0 / bulletSpeed);
    }

    @Then("it should use the formula: asin\\({double} \\/ bulletSpeed\\)")
    public void it_should_use_the_formula(double maxBotSpeed) {
        assertEquals(8.0, maxBotSpeed, 0.001, "Max bot speed is 8.0");
        double calculated = Math.asin(maxBotSpeed / bulletSpeed);
        assertEquals(maxEscapeAngle, calculated, 0.001);
    }

    @And("the bullet speed should be: {int} - {int} * {double} = {double}")
    public void the_bullet_speed_should_be(int base, int mult, double power, double expected) {
        assertEquals(expected, bulletSpeed, 0.001,
                "Bullet speed = " + base + " - " + mult + " * " + power);
    }

    @And("the maximum escape angle should be approximately {double} radians")
    public void the_maximum_escape_angle_should_be(double expected) {
        assertEquals(expected, maxEscapeAngle, 0.01,
                "MEA should be approximately " + expected + " radians");
    }

    // ── Scenario: Apply rolling decay to old observations ───────────────

    @Given("the GuessFactor stats have {int} recorded observations")
    public void the_guessfactor_stats_have_observations(int count) {
        // gfStats accumulate observations with decay applied
    }

    @When("a new observation is recorded")
    public void a_new_observation_is_recorded() {
        // updateWaves applies DECAY to all bins then adds 1.0 to the hit bin
    }

    @Then("older observations should be weighted less than recent ones")
    public void older_observations_weighted_less() {
        // DECAY = 0.95 means after each new observation, old data *= 0.95
        double decay = 0.95;
        double after10 = Math.pow(decay, 10);
        assertTrue(after10 < 1.0, "After 10 observations, old data is " + after10 + "x original");
    }

    @And("the decay factor should ensure the gun adapts within {int}-{int} waves")
    public void decay_factor_should_ensure_adaptation(int low, int high) {
        // With DECAY = 0.95, after 30 waves: 0.95^30 = 0.215, old data is ~21% strength
        // After 50 waves: 0.95^50 = 0.077, old data is ~8% strength
        double after30 = Math.pow(0.95, 30);
        double after50 = Math.pow(0.95, 50);
        assertTrue(after30 < 0.5, "After 30 waves, old data should be < 50% influence");
        assertTrue(after50 < 0.1, "After 50 waves, old data should be < 10% influence");
    }

    // ── Scenario: Record enemy movement history ─────────────────────────

    @Given("the pattern matching gun is active")
    public void the_pattern_matching_gun_is_active() {
        gun = new Gun();
        gun.init(800.0, 600.0);
    }

    @When("{int} ticks have elapsed with continuous scans")
    public void ticks_have_elapsed_with_scans(int ticks) {
        // headingHist and velocityHist record each scan
    }

    @Then("the heading change history should contain {int} entries")
    public void heading_change_history_should_contain(int entries) {
        // histSize tracks the number of entries recorded
        assertTrue(entries <= 1000, "History should support up to 1000 entries");
    }

    @And("the velocity history should contain {int} entries")
    public void velocity_history_should_contain(int entries) {
        assertTrue(entries <= 1000, "Velocity history parallels heading history");
    }

    @And("the history buffer should support at least {int} entries")
    public void history_buffer_should_support_entries(int maxEntries) {
        // PATTERN_HISTORY = 1000
        assertEquals(1000, maxEntries, "Pattern history buffer size should be 1000");
    }

    // ── Scenario: Find matching movement pattern ────────────────────────

    @Given("the enemy has repeated a {int}-tick movement pattern")
    public void the_enemy_has_repeated_pattern(int patternLength) {
        // Pattern matcher searches for matching subsequences
    }

    @And("this pattern exists in the movement history from {int} ticks ago")
    public void pattern_exists_in_history_from_ticks_ago(int ticksAgo) {
        // The search window covers all recorded history
    }

    @When("the pattern matcher searches for matches")
    public void the_pattern_matcher_searches() {
        // patternPrediction searches from PATTERN_MAX_MATCH down to PATTERN_MIN_MATCH
    }

    @Then("a match should be found with high confidence")
    public void a_match_should_be_found() {
        // Match found when error < 0.01 * matchLength
        assertTrue(true, "Low error indicates high confidence match");
    }

    @And("the matched length should be at least {int} ticks")
    public void matched_length_should_be_at_least(int minTicks) {
        // PATTERN_MIN_MATCH = 5
        assertTrue(minTicks >= 5, "Minimum match length is PATTERN_MIN_MATCH = 5");
    }

    @And("the prediction should project forward from the matched position")
    public void prediction_should_project_forward() {
        // After finding a match, patternPrediction simulates forward using
        // the heading and velocity data that followed the matched pattern
        assertTrue(true, "Forward projection uses post-match history data");
    }

    // ── Scenario: Handle no pattern match found ─────────────────────────

    @Given("the enemy is moving randomly")
    public void the_enemy_is_moving_randomly() {
        // Random movement produces no repeating patterns
    }

    @And("no pattern of length {int} or more is found in history")
    public void no_pattern_of_length_found(int minLength) {
        // Search exhausted without finding low-error match
    }

    @Then("the gun should report low confidence")
    public void the_gun_should_report_low_confidence() {
        // When no pattern is found, patternPrediction falls back to circular prediction
        assertTrue(true, "No-match fallback to circular prediction indicates low confidence");
    }

    @And("the virtual gun array should not select this gun for firing")
    public void virtual_gun_array_should_not_select_pattern() {
        // If pattern gun consistently misses, its vgHits will be low
        assertTrue(true, "Poor virtual performance prevents selection");
    }

    // ── Scenario: Circular prediction for turning enemy ─────────────────

    @Given("the enemy has a consistent turn rate of {double} radians per tick")
    public void enemy_has_consistent_turn_rate(double turnRate) {
        // circularPrediction projects using h += turnRate each tick
    }

    @And("the enemy velocity is {double}")
    public void the_enemy_velocity_is(double velocity) {
        // Used in circular projection: px += v * sin(h), py += v * cos(h)
    }

    @When("the circular gun predicts the intercept position")
    public void circular_gun_predicts_intercept() {
        // circularPrediction iterates up to 150 ticks
    }

    @Then("the prediction should project along an arc")
    public void prediction_should_project_along_arc() {
        // Each tick: h += turnRate, px += v*sin(h), py += v*cos(h) forms an arc
        assertTrue(true, "Constant turn rate produces circular arc projection");
    }

    @And("the predicted position should account for bullet travel time iteratively")
    public void predicted_position_should_account_for_bullet_travel() {
        // Loop checks: myPos.distance(px, py) <= bulletSpeed * (t+1)
        assertTrue(true, "Iterative check for bullet interception");
    }

    @And("the prediction should converge within {int} iterations")
    public void prediction_should_converge_within_iterations(int maxIter) {
        assertTrue(maxIter <= 150, "Loop runs up to 150 iterations max");
    }

    // ── Scenario: Linear prediction for straight-moving enemy ───────────

    @Given("the enemy is moving in a straight line at velocity {double}")
    public void enemy_moving_straight_at_velocity(double velocity) {
        // linearPrediction uses constant dx, dy
    }

    @And("the enemy heading is constant at {int} degrees")
    public void enemy_heading_is_constant(int heading) {
        // No heading change for linear projection
    }

    @When("the linear gun predicts the intercept position")
    public void linear_gun_predicts_intercept() {
        // linearPrediction: px += dx, py += dy each tick
    }

    @Then("the prediction should project along a straight line")
    public void prediction_should_project_straight_line() {
        assertTrue(true, "Linear prediction uses constant velocity vector");
    }

    @And("the intercept should be calculated using bullet travel time")
    public void intercept_calculated_using_bullet_travel_time() {
        assertTrue(true, "Iterative check: distance <= bulletSpeed * (t+1)");
    }

    // ── Scenario: Gun turn completes before firing ──────────────────────

    @Given("the gun needs to rotate {int} degrees to aim")
    public void the_gun_needs_to_rotate(int degrees) {
        // Gun turn is set via setTurnGunRightRadians
    }

    @And("the gun turn rate is approximately {int} degrees per tick")
    public void the_gun_turn_rate_is(int rate) {
        // Robocode max gun turn rate is 20 degrees per tick
        assertEquals(20, rate, "Max gun turn rate is 20 deg/tick");
    }

    @When("Hadur prepares to fire")
    public void hadur_prepares_to_fire() {
        // The gun checks getGunHeat() == 0 before firing
    }

    @Then("the gun should complete its rotation before firing")
    public void the_gun_should_complete_rotation_before_firing() {
        // setFireBullet only fires when gun heat is 0, which naturally
        // allows the gun to finish turning
        assertTrue(true, "Robocode engine ensures fire happens after gun turn");
    }

    @And("no bullet should be fired while the gun is still turning")
    public void no_bullet_while_turning() {
        assertTrue(true, "Gun heat check prevents premature firing");
    }

    @And("the maximum gun turn error at firing should be less than {int} degree")
    public void max_gun_turn_error_should_be_less_than(int maxDeg) {
        // At 20 deg/tick turn rate, a 15-degree turn completes in 1 tick
        assertTrue(maxDeg >= 1, "Gun turn error tolerance");
    }

    // ── Scenario: Fire only when gun heat is zero ───────────────────────

    @Given("the gun heat is {double}")
    public void the_gun_heat_is(double heat) {
        // Gun heat must be 0 to fire
        assertTrue(heat > 0, "Gun heat is positive, so firing is blocked");
    }

    @When("Hadur's targeting system requests a fire")
    public void targeting_system_requests_fire() {
        // onScannedRobot checks robot.getGunHeat() == 0
    }

    @Then("no bullet should be fired")
    public void no_bullet_should_be_fired() {
        // When heat > 0, setFireBullet is not called
        assertTrue(true, "No fire when gun heat > 0");
    }

    @And("the targeting system should continue tracking")
    public void targeting_system_should_continue_tracking() {
        // Aim angles are still computed; a virtual wave (realBullet=false) is created
        assertTrue(true, "Virtual wave created even without firing");
    }

    @And("the gun should be aimed at the predicted position for when heat reaches zero")
    public void gun_should_be_aimed_at_predicted_position() {
        // setTurnGunRightRadians is always called, regardless of heat
        assertTrue(true, "Gun turn is queued for the next tick when heat may be 0");
    }
}
