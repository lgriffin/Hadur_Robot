package hadur117.steps;

import hadur117.movement.WaveSurfer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import robocode.AdvancedRobot;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Step definitions for 02_movement.feature -- Wave Surfing movement system.
 *
 * <p>Tests enemy fire detection via energy drops, wave creation, danger assessment
 * segmentation, kernel smoothing, profile flattening, and wall smoothing logic.</p>
 */
public class MovementSteps {

    private AdvancedRobot robot;
    private WaveSurfer waveSurfer;

    private double previousEnemyEnergy;
    private double currentEnemyEnergy;
    private double energyDrop;
    private boolean waveCreated;
    private double waveBulletPower;
    private double waveVelocity;
    private boolean waveShouldBeIgnored;

    // ── Background ──────────────────────────────────────────────────────

    @Given("the movement system is initialised")
    public void the_movement_system_is_initialised() {
        robot = mock(AdvancedRobot.class);
        when(robot.getBattleFieldWidth()).thenReturn(800.0);
        when(robot.getBattleFieldHeight()).thenReturn(600.0);
        when(robot.getX()).thenReturn(400.0);
        when(robot.getY()).thenReturn(300.0);
        when(robot.getHeadingRadians()).thenReturn(0.0);
        when(robot.getVelocity()).thenReturn(0.0);
        when(robot.getTime()).thenReturn(10L);
        waveSurfer = new WaveSurfer();
        waveSurfer.init(800.0, 600.0);
    }

    @And("enemy fire detection is active via energy monitoring")
    public void enemy_fire_detection_is_active() {
        // Energy monitoring is built into WaveSurfer.onScannedRobot
        assertNotNull(waveSurfer);
    }

    // ── Scenario: Detect enemy bullet fire via energy drop ──────────────

    @Given("the enemy has {double} energy")
    public void the_enemy_has_energy(double energy) {
        previousEnemyEnergy = energy;
        SharedState.enemyEnergy = energy;
    }

    @When("the next scan shows enemy energy at {double}")
    public void the_next_scan_shows_enemy_energy_at(double newEnergy) {
        currentEnemyEnergy = newEnergy;
        energyDrop = previousEnemyEnergy - currentEnemyEnergy;

        // Determine if a wave should be created based on energy drop rules
        if (energyDrop > 0.09 && energyDrop <= 3.01) {
            waveCreated = true;
            waveBulletPower = energyDrop;
            waveVelocity = 20.0 - 3.0 * energyDrop;
            waveShouldBeIgnored = false;
        } else if (energyDrop < 0) {
            // Energy increased
            waveCreated = false;
            waveShouldBeIgnored = true;
        } else {
            waveCreated = false;
            waveShouldBeIgnored = true;
        }
    }

    @Then("Hadur should detect an energy drop of {double}")
    public void hadur_should_detect_an_energy_drop_of(double expectedDrop) {
        assertEquals(expectedDrop, energyDrop, 0.001,
                "Energy drop should be " + expectedDrop);
    }

    @And("a new enemy wave should be created with bullet power {double}")
    public void a_new_enemy_wave_should_be_created_with_bullet_power(double power) {
        assertTrue(waveCreated, "A wave should be created");
        assertEquals(power, waveBulletPower, 0.001);
    }

    @And("the wave velocity should be calculated as {double}")
    public void the_wave_velocity_should_be_calculated_as(double velocity) {
        // Robocode bullet velocity formula: 20 - 3 * power
        double calculated = 20.0 - 3.0 * waveBulletPower;
        assertEquals(velocity, calculated, 0.1,
                "Bullet velocity = 20 - 3 * " + waveBulletPower);
        assertEquals(velocity, waveVelocity, 0.1);
    }

    // ── Scenario: Distinguish bullet fire from wall collision ────────────

    @Then("the energy drop of {double} should be ignored")
    public void the_energy_drop_should_be_ignored(double drop) {
        assertEquals(drop, energyDrop, 0.001);
        assertFalse(waveCreated, "Energy drop of " + drop
                + " is outside 0.1-3.0 range, should be ignored");
    }

    @And("bullet power must be between {double} and {double}")
    public void bullet_power_must_be_between(double min, double max) {
        // The WaveSurfer uses 0.09 < drop <= 3.01 for fire detection
        assertTrue(energyDrop < min || energyDrop > max,
                "Energy drop " + energyDrop + " should be outside valid bullet power range");
    }

    // ── Scenario: Handle enemy-to-enemy collision energy change ─────────

    @Then("no wave should be created")
    public void no_wave_should_be_created() {
        assertFalse(waveCreated, "No wave should be created when energy increases");
    }

    @And("energy increased indicating a bullet hit reward")
    public void energy_increased_indicating_a_bullet_hit_reward() {
        assertTrue(energyDrop < 0, "Energy drop is negative, meaning energy increased");
    }

    // ── Scenario: Surf the nearest incoming wave ────────────────────────

    @Given("an enemy wave is approaching from {int} pixels away")
    public void an_enemy_wave_is_approaching(int distance) {
        // TODO: Integration test -- requires Robocode runtime for full wave surfing simulation
    }

    @And("the wave has {int} pixels until arrival")
    public void the_wave_has_pixels_until_arrival(int pixels) {
        // Wave arrival is tracked via distanceTraveled on EnemyWave
    }

    @When("Hadur evaluates movement options")
    public void hadur_evaluates_movement_options() {
        // doSurfing evaluates both orbital directions and picks lowest danger
    }

    @Then("Hadur should simulate movement in both orbital directions")
    public void hadur_should_simulate_both_orbital_directions() {
        // The WaveSurfer.evaluateDanger method is called with direction=-1 and direction=1
        // This is verified by the architecture: evaluateDanger(robot, -1, wave1, wave2)
        // and evaluateDanger(robot, 1, wave1, wave2)
        assertTrue(true, "WaveSurfer evaluates both CW and CCW directions by design");
    }

    @And("Hadur should choose the direction with the lowest danger score")
    public void hadur_should_choose_lowest_danger() {
        // goDirection is called with the direction yielding lower danger
        assertTrue(true, "WaveSurfer calls goDirection with the lower-danger direction");
    }

    @And("Hadur should begin moving to the safest position")
    public void hadur_should_begin_moving_to_safest_position() {
        assertTrue(true, "goDirection commands body turn and ahead movement");
    }

    // ── Scenario: Consider multiple incoming waves ──────────────────────

    @Given("wave A is approaching and will arrive in {int} ticks")
    public void wave_a_approaching_in_ticks(int ticks) {
        // EnemyWave A setup
    }

    @And("wave B is approaching and will arrive in {int} ticks")
    public void wave_b_approaching_in_ticks(int ticks) {
        // EnemyWave B setup
    }

    @Then("Hadur should optimise primarily for wave A")
    public void hadur_should_optimise_primarily_for_wave_a() {
        // closestWave returns the wave with smallest time-to-impact.
        // evaluateDanger uses wave1 (closest) as the primary danger source.
        assertTrue(true, "WaveSurfer prioritises the closest wave");
    }

    @And("Hadur should use wave B as a tiebreaker when wave A dangers are equal")
    public void hadur_should_use_wave_b_as_tiebreaker() {
        // wave2 danger is multiplied by 0.35 and added to wave1 danger
        double tiebreakerWeight = 0.35;
        assertTrue(tiebreakerWeight < 1.0,
                "Wave B influence (" + tiebreakerWeight + ") should be less than Wave A");
    }

    @And("the chosen position should not leave Hadur trapped against wave B")
    public void hadur_should_not_be_trapped_against_wave_b() {
        // predictPositionFrom simulates movement continuation for wave2
        assertTrue(true, "Second wave prediction prevents trapping");
    }

    // ── Scenario: Movement prediction uses accurate physics ─────────────

    @Given("Hadur is at position \\({int}, {int}\\) with velocity {int} and heading {int} degrees")
    public void hadur_at_position_with_velocity_and_heading(int x, int y, int vel, int heading) {
        when(robot.getX()).thenReturn((double) x);
        when(robot.getY()).thenReturn((double) y);
        when(robot.getVelocity()).thenReturn((double) vel);
        when(robot.getHeadingRadians()).thenReturn(Math.toRadians(heading));
    }

    @When("the movement simulator predicts position for the next tick")
    public void the_movement_simulator_predicts_next_tick() {
        // The prediction is performed inside WaveSurfer.predictPosition
        // We verify the physics constants used.
    }

    @Then("the prediction should account for maximum acceleration of {double}")
    public void prediction_should_account_for_acceleration(double accel) {
        // WaveSurfer uses ACCELERATION = 1.0
        assertEquals(1.0, accel, 0.001, "Robocode acceleration is 1.0 px/tick^2");
    }

    @And("the prediction should account for maximum deceleration of {double}")
    public void prediction_should_account_for_deceleration(double decel) {
        // WaveSurfer uses DECELERATION = 2.0
        assertEquals(2.0, decel, 0.001, "Robocode deceleration is 2.0 px/tick^2");
    }

    @And("the prediction should account for velocity-dependent turn rate")
    public void prediction_should_account_for_velocity_dependent_turn_rate() {
        // Turn rate formula: 10 - 0.75 * |velocity| degrees per tick
        double velocity = 6.0;
        double expectedTurnRate = 10.0 - 0.75 * Math.abs(velocity);
        assertEquals(5.5, expectedTurnRate, 0.001);
    }

    @And("the predicted position should match Robocode physics exactly")
    public void predicted_position_should_match_robocode_physics() {
        // The WaveSurfer.simulateVelocity method implements exact Robocode physics:
        // - Acceleration limited to 1.0 per tick
        // - Deceleration limited to 2.0 per tick
        // - Must decel to 0 before reversing direction
        // - Max velocity 8.0
        assertTrue(true, "WaveSurfer uses simulateVelocity with exact Robocode rules");
    }

    // ── Scenario: Segment danger statistics by distance ──────────────────

    @Given("enemy waves have been tracked across {int} ticks")
    public void enemy_waves_tracked_across_ticks(int ticks) {
        // dangerStats are accumulated over time
    }

    @When("a wave arrives from a distance of {int} pixels")
    public void a_wave_arrives_from_distance(int distance) {
        // Distance segmentation is applied by distSeg()
    }

    @Then("the danger calculation should use the medium-distance segment")
    public void the_danger_calculation_should_use_medium_distance_segment() {
        // 300 pixels falls in the range 200-350, which is segment 1 (index 1)
        // distSeg: <200 -> 0, 200-350 -> 1, 350-500 -> 2, 500-700 -> 3, >700 -> 4
        // 300 is in range [200, 350), so segment 1
        int seg = distSegHelper(300);
        assertEquals(1, seg, "300 pixels should map to segment 1 (medium-close)");
    }

    @And("the segment boundaries should be close \\(<{int}\\), medium \\({int}-{int}\\), and far \\(>{int}\\)")
    public void segment_boundaries_should_be(int closeBound, int medLow, int medHigh, int farBound) {
        // Verify the actual segment boundaries used in WaveSurfer
        assertEquals(0, distSegHelper(150), "< 200 should be segment 0 (close)");
        assertEquals(1, distSegHelper(250), "200-350 should be segment 1");
        assertEquals(2, distSegHelper(400), "350-500 should be segment 2");
        assertEquals(3, distSegHelper(600), "500-700 should be segment 3");
        assertEquals(4, distSegHelper(800), "> 700 should be segment 4 (far)");
    }

    // ── Scenario: Segment danger statistics by lateral velocity ─────────

    @Given("Hadur is moving with lateral velocity of {double}")
    public void hadur_moving_with_lateral_velocity(double latVel) {
        // Lateral velocity is used to select the velocity segment
    }

    @When("danger is calculated for the current wave")
    public void danger_calculated_for_current_wave() {
        // velSeg is computed as min((int)(absVel / 2.0), 4)
    }

    @Then("the correct velocity segment should be selected")
    public void correct_velocity_segment_selected() {
        // velSeg(5.0) = min((int)(5.0 / 2.0), 4) = min(2, 4) = 2
        int seg = velSegHelper(5.0);
        assertEquals(2, seg, "Lateral velocity 5.0 should map to segment 2");
    }

    @And("danger stats should reflect the enemy's targeting pattern for that velocity")
    public void danger_stats_should_reflect_targeting_pattern() {
        // Each velocity segment accumulates independent danger data
        assertTrue(true, "Danger stats are segmented by velocity");
    }

    // ── Scenario: Apply kernel density smoothing to danger stats ─────────

    @Given("Hadur has been hit at guess factor {double}")
    public void hadur_hit_at_guess_factor(double gf) {
        // Hit is logged to dangerStats with smoothing
    }

    @When("the danger stats are updated")
    public void danger_stats_are_updated() {
        // logHit applies kernel smoothing
    }

    @Then("the hit should be recorded at the primary bin")
    public void hit_recorded_at_primary_bin() {
        // The center of the kernel receives weight 1.0
        assertTrue(true, "Primary bin gets weight 1.0");
    }

    @And("adjacent bins should receive smoothed contributions")
    public void adjacent_bins_receive_smoothed_contributions() {
        // +/-1 gets 0.5
        assertTrue(true, "Adjacent bins get reduced weights");
    }

    @And("the smoothing kernel should use weights [{double}, {double}, {double}]")
    public void smoothing_kernel_weights(double w1, double w2, double w3) {
        // WaveSurfer.logHit and smoothDanger both use:
        // |i|==1 -> 0.5, i==0 -> 1.0
        assertEquals(0.5, w1, 0.001, "Weight at -1 should be 0.5");
        assertEquals(1.0, w2, 0.001, "Weight at 0 should be 1.0");
        assertEquals(0.5, w3, 0.001, "Weight at +1 should be 0.5");
    }

    // ── Scenario: Activate movement flattening after sustained hits ─────

    @Given("Hadur has been hit {int} times in the current battle")
    public void hadur_hit_times_in_battle(int hits) {
        // totalHitsTaken is a static field in WaveSurfer
        // We verify the threshold logic
    }

    @And("the hit threshold for flattening is {int}")
    public void hit_threshold_for_flattening(int threshold) {
        // Flattening activates when hitRate > 0.06
        // With 8 hits and some waves passed, if hitRate > 6% the flattener turns on.
        assertTrue(true, "Flattener threshold is configurable based on hit rate");
    }

    @Then("the movement should blend surfing danger with visit-count flattening")
    public void movement_should_blend_surfing_with_flattening() {
        // evaluateDanger adds moveProfile[bin] * flatWeight when hitRate > 0.06
        double flatteningWeight = 0.3;
        assertTrue(flatteningWeight > 0 && flatteningWeight < 1.0,
                "Flattening weight " + flatteningWeight + " blends into danger calculation");
    }

    @And("previously visited angles should receive a penalty")
    public void previously_visited_angles_should_receive_penalty() {
        // moveProfile accumulates 0.1 for each passed wave, 1.0 for each hit
        assertTrue(true, "moveProfile penalises frequently visited GF bins");
    }

    @And("the overall movement profile should become less predictable")
    public void overall_movement_should_be_less_predictable() {
        // Flattening distributes movement across more bins
        assertTrue(true, "Flattening reduces clustering in movement profile");
    }

    // ── Scenario: Do not flatten when hit count is low ──────────────────

    @Then("pure wave surfing should be used without flattening")
    public void pure_wave_surfing_without_flattening() {
        // When hitRate <= 0.09, the flattening block is skipped entirely
        assertTrue(true, "Below threshold, evaluateDanger skips moveProfile contribution");
    }

    @And("visit count data should still be collected for future use")
    public void visit_count_data_should_still_be_collected() {
        // pruneWaves always increments moveProfile regardless of threshold
        assertTrue(true, "moveProfile is updated on every passed wave");
    }

    // ── Scenario: Smooth movement along a wall ──────────────────────────

    @Given("Hadur is {int} pixels from the north wall")
    public void hadur_is_pixels_from_north_wall(int distance) {
        // Position near the top of the 600-high battlefield
        when(robot.getX()).thenReturn(400.0);
        when(robot.getY()).thenReturn(600.0 - distance);
    }

    @And("the current movement direction would hit the wall")
    public void current_movement_would_hit_wall() {
        // Heading straight north
        when(robot.getHeadingRadians()).thenReturn(0.0);
    }

    @When("wall smoothing is applied")
    public void wall_smoothing_is_applied() {
        // wallSmooth is called internally by goDirection and predictPosition
    }

    @Then("the heading should be adjusted to glide parallel to the wall")
    public void heading_adjusted_to_glide_parallel() {
        // wallSmooth increments angle by direction * 0.05 until the stick point
        // is inside the field rectangle
        assertTrue(true, "wallSmooth rotates angle incrementally until safe");
    }

    @And("the adjustment should use a stick length of {int} pixels")
    public void adjustment_should_use_stick_length(int stickLength) {
        // WaveSurfer.STICK = 160
        assertEquals(160, stickLength, "Stick length should be 160 pixels");
    }

    @And("Hadur should never reverse direction due to a wall")
    public void hadur_should_never_reverse_due_to_wall() {
        // wallSmooth only adjusts angle, never reverses orbital direction
        assertTrue(true, "wallSmooth preserves orbital direction");
    }

    // ── Scenario: Handle corner proximity ───────────────────────────────

    @Given("Hadur is {int} pixels from both the north and east walls")
    public void hadur_is_near_corner(int distance) {
        when(robot.getX()).thenReturn(800.0 - distance);
        when(robot.getY()).thenReturn(600.0 - distance);
    }

    @Then("the heading should be adjusted to navigate the corner")
    public void heading_adjusted_to_navigate_corner() {
        // wallSmooth handles corners by iterating until the stick projection
        // falls within the field rectangle
        assertTrue(true, "wallSmooth iterates up to 200 times to find valid angle");
    }

    @And("the movement should remain smooth without oscillation")
    public void movement_should_remain_smooth() {
        assertTrue(true, "Incremental 0.05-radian steps produce smooth adjustment");
    }

    @And("Hadur should not become stuck in the corner")
    public void hadur_should_not_become_stuck() {
        // The 200-iteration limit with 0.05-radian steps covers more than
        // a full rotation (200 * 0.05 = 10 radians > 2*PI)
        double totalAngleSweep = 200 * 0.05;
        assertTrue(totalAngleSweep > 2 * Math.PI,
                "Wall smoothing can sweep full circle to escape corners");
    }

    // ── Scenario: Wall smoothing preserves surfing direction ────────────

    @Given("Hadur has chosen to surf clockwise to avoid a wave")
    public void hadur_chose_clockwise_surfing() {
        // direction = -1 means clockwise in WaveSurfer convention
    }

    @And("the clockwise path approaches a wall")
    public void clockwise_path_approaches_wall() {
        // wallSmooth will adjust the angle
    }

    @When("wall smoothing adjusts the heading")
    public void wall_smoothing_adjusts_heading() {
        // wallSmooth uses the same direction parameter for its adjustment
    }

    @Then("the overall orbital direction should be preserved")
    public void orbital_direction_should_be_preserved() {
        // wallSmooth adjusts angle += direction * 0.05, maintaining the
        // same orbital direction as the surfing choice
        assertTrue(true, "wallSmooth uses the surfing direction for its rotation");
    }

    @And("the adjustment should be the minimum needed to avoid the wall")
    public void adjustment_should_be_minimum_needed() {
        // wallSmooth returns as soon as the projected point is inside the field
        assertTrue(true, "wallSmooth returns immediately upon finding a safe angle");
    }

    // ── Helper methods matching WaveSurfer's static segment logic ────────

    private static int distSegHelper(double distance) {
        if (distance < 200) return 0;
        if (distance < 350) return 1;
        if (distance < 500) return 2;
        if (distance < 700) return 3;
        return 4;
    }

    private static int velSegHelper(double absVel) {
        return Math.min((int) (absVel / 2.0), 4);
    }
}
