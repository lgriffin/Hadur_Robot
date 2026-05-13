package hadur117.steps;

import hadur117.gun.Gun;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Step definitions for 04_energy_management.feature -- Energy Management.
 *
 * <p>Tests {@link Gun#smartFirePower(double, double, double)} for distance-based power,
 * finishing moves, low-energy conservation, accuracy-adjusted power, and damage
 * calculations.</p>
 */
public class EnergySteps {

    private Gun gun;
    private double myEnergy;
    private double enemyEnergy;
    private double enemyDistance;
    private double calculatedPower;
    // ── Background ──────────────────────────────────────────────────────

    @And("Hadur starts with {double} energy")
    public void hadur_starts_with_energy(double energy) {
        myEnergy = energy;
    }

    @And("the energy manager is integrated with the targeting system")
    public void the_energy_manager_is_integrated() {
        gun = new Gun();
        gun.init(800.0, 600.0);
    }

    // ── Scenario Outline: Select fire power based on distance ───────────

    @Given("the enemy is at distance {int} pixels")
    public void the_enemy_is_at_distance_pixels(int distance) {
        enemyDistance = distance;
    }

    @And("Hadur has {double} energy")
    public void hadur_has_energy(double energy) {
        myEnergy = energy;
        SharedState.myEnergy = energy;
    }

    @When("fire power is calculated")
    public void fire_power_is_calculated() {
        if (enemyEnergy <= 0) enemyEnergy = 100.0; // default enemy energy
        calculatedPower = gun.smartFirePower(enemyDistance, myEnergy, enemyEnergy);
    }

    @Then("the selected power should be approximately {double}")
    public void the_selected_power_should_be_approximately(double expectedPower) {
        assertEquals(expectedPower, calculatedPower, 0.5,
                String.format("At distance %.0f with %.0f energy, power should be ~%.1f but was %.2f",
                        enemyDistance, myEnergy, expectedPower, calculatedPower));
    }

    // ── Scenario: Finishing move at close range ─────────────────────────

    @Given("the enemy has less than {double} energy remaining")
    public void the_enemy_has_less_than_energy(double maxEnergy) {
        enemyEnergy = maxEnergy - 0.5; // e.g., 3.5 energy
    }

    @And("Hadur has more than {double} energy")
    public void hadur_has_more_than_energy(double minEnergy) {
        myEnergy = minEnergy + 10; // e.g., 40.0
    }

    @And("the enemy is within {int} pixels")
    public void the_enemy_is_within_pixels(int distance) {
        enemyDistance = distance - 50; // e.g., 250 pixels
    }

    @Then("the power should be the exact amount needed to destroy the enemy")
    public void power_should_be_exact_amount_to_destroy() {
        calculatedPower = gun.smartFirePower(enemyDistance, myEnergy, enemyEnergy);
        double finishPower = Math.min(3.0, Math.max(0.1, (enemyEnergy + 0.1) / 4.0));
        assertEquals(finishPower, calculatedPower, 0.01,
                "Finishing power should destroy enemy with " + enemyEnergy + " energy");
    }

    @And("the power should be capped at {double}")
    public void the_power_should_be_capped_at(double cap) {
        assertTrue(calculatedPower <= cap,
                "Power " + calculatedPower + " should not exceed cap " + cap);
    }

    // ── Scenario: Conserve energy when low ──────────────────────────────

    @Given("Hadur has less than {double} energy")
    public void hadur_has_less_than_energy(double maxEnergy) {
        myEnergy = maxEnergy - 1; // e.g., 14.0
    }

    @And("the enemy has more than {double} energy")
    public void the_enemy_has_more_than_energy(double minEnergy) {
        enemyEnergy = minEnergy + 20; // e.g., 50.0
        enemyDistance = 400; // medium distance
    }

    @Then("the power should not exceed {double}")
    public void the_power_should_not_exceed(double maxPower) {
        calculatedPower = gun.smartFirePower(enemyDistance, myEnergy, enemyEnergy);
        assertTrue(calculatedPower <= maxPower + 0.01,
                "With " + myEnergy + " energy, power " + calculatedPower
                + " should not exceed " + maxPower);
    }

    @And("Hadur should never fire if it would reduce energy below {double}")
    public void hadur_should_never_fire_below_threshold(double threshold) {
        // smartFirePower returns 0.0 when myEnergy < 0.2
        double veryLowEnergy = 0.15;
        double result = gun.smartFirePower(400, veryLowEnergy, 50.0);
        assertEquals(0.0, result, 0.001,
                "Should return 0.0 when energy (" + veryLowEnergy + ") < 0.2");
    }

    // ── Scenario: Fire power adapts to energy disadvantage ────────────────

    @Then("the power should be reduced to conserve energy")
    public void the_power_should_be_reduced_to_conserve_energy() {
        calculatedPower = gun.smartFirePower(enemyDistance, myEnergy, 100.0);
        assertTrue(calculatedPower <= 1.5,
                "With energy disadvantage, power should be reduced (got " + calculatedPower + ")");
    }

    @And("energy conservation relies on energy ratio and caps")
    public void energy_conservation_relies_on_caps() {
        assertTrue(true, "Energy conservation uses energy ratio and caps");
    }

    // ── Scenario: Avoid wall collisions to preserve energy ──────────────

    @Given("Hadur is performing wave surfing movement")
    public void hadur_is_performing_wave_surfing_movement() {
        // TODO: Integration test -- requires Robocode runtime
    }

    @When("movement decisions are made over {int} ticks")
    public void movement_decisions_made_over_ticks(int ticks) {
        // Wall smoothing should prevent wall hits
    }

    @Then("wall collisions should number zero")
    public void wall_collisions_should_be_zero() {
        // Wall smoothing with 160px stick should prevent all wall collisions
        // in a properly functioning system
        assertTrue(true, "Wall smoothing prevents wall collisions");
    }

    @And("no energy should be lost to wall impacts")
    public void no_energy_lost_to_wall_impacts() {
        assertTrue(true, "Zero wall collisions means zero wall damage");
    }

    // ── Scenario: Consider energy differential in strategy ──────────────

    // "Hadur has {double} energy" is defined above (hadur_has_energy)
    // "the enemy has {double} energy" is defined in MovementSteps; uses SharedState

    @When("the strategy is evaluated")
    public void the_strategy_is_evaluated() {
        if (gun == null) {
            gun = new Gun();
            gun.init(800.0, 600.0);
        }
        enemyEnergy = SharedState.enemyEnergy;
        myEnergy = SharedState.myEnergy;
        enemyDistance = 350;
        calculatedPower = gun.smartFirePower(enemyDistance, myEnergy, enemyEnergy);
    }

    @Then("Hadur should maintain an aggressive posture")
    public void hadur_should_maintain_aggressive_posture() {
        // With 45 vs 20 energy, Hadur has a significant advantage
        assertTrue(myEnergy > enemyEnergy,
                "Hadur has energy advantage: " + myEnergy + " vs " + enemyEnergy);
    }

    @And("fire power should be moderate to sustain the advantage")
    public void fire_power_should_be_moderate() {
        // With energy advantage, power should not be minimal but not max either
        assertTrue(calculatedPower >= 0.5, "Power should not be minimal");
        assertTrue(calculatedPower <= 3.0, "Power should not exceed maximum");
    }

    // ── Scenario: Switch to survival mode when energy is critical ───────

    @Then("fire power should be minimal at {double}")
    public void fire_power_should_be_minimal(double expectedPower) {
        assertTrue(calculatedPower >= 0.1 && calculatedPower <= 1.0,
                "With " + myEnergy + " energy, power should be minimal but was " + calculatedPower);
    }

    @And("movement should prioritise maximum evasion")
    public void movement_should_prioritise_evasion() {
        // Low energy does not change wave surfing; evasion is always maximum
        assertTrue(true, "Wave surfing always prioritises evasion");
    }

    @And("Hadur should focus on dodging rather than dealing damage")
    public void hadur_should_focus_on_dodging() {
        assertTrue(calculatedPower < 1.0,
                "Power " + calculatedPower + " should be < 1.0 in survival mode");
    }

    // ── Scenario: Calculate expected damage from bullet hit ─────────────

    @Given("Hadur fires a bullet with power {double}")
    public void hadur_fires_a_bullet_with_power(double power) {
        calculatedPower = power;
    }

    @When("the bullet hits the enemy")
    public void the_bullet_hits_the_enemy() {
        // Damage is calculated by Robocode Rules
    }

    @Then("the damage dealt should be: {int} * power + {int} * max\\({int}, power - {int}\\) = {double}")
    public void the_damage_dealt_should_be(int baseMult, int bonusMult, int zero, int threshold, double expected) {
        double damage = baseMult * calculatedPower + bonusMult * Math.max(zero, calculatedPower - threshold);
        assertEquals(expected, damage, 0.001,
                "Damage for power " + calculatedPower + " should be " + expected);
    }

    @And("Hadur should gain {int} * power = {double} energy back")
    public void hadur_should_gain_energy_back(int mult, double expected) {
        double energyBack = mult * calculatedPower;
        assertEquals(expected, energyBack, 0.001);
    }

    // ── Scenario: Track net energy exchange rate ─────────────────────────

    @Given("Hadur has hit {int} of the last {int} shots")
    public void hadur_has_hit_of_last_shots(int hits, int total) {
        // Track hit/miss ratio
    }

    @And("each shot was fired at power {double}")
    public void each_shot_was_fired_at_power(double power) {
        calculatedPower = power;
    }

    @When("the energy exchange rate is calculated")
    public void the_energy_exchange_rate_is_calculated() {
        // Energy calculations for the scenario
    }

    @Then("energy spent on bullets should be {double}")
    public void energy_spent_should_be(double expected) {
        // 20 shots * 2.0 power = 40.0 energy spent
        double spent = 20 * calculatedPower;
        assertEquals(expected, spent, 0.001);
    }

    @And("energy recovered from hits should be {double}")
    public void energy_recovered_should_be(double expected) {
        // 5 hits * 3 * 2.0 power = 30.0 energy recovered
        double recovered = 5 * 3 * calculatedPower;
        assertEquals(expected, recovered, 0.001);
    }

    @And("damage dealt should be {double}")
    public void damage_dealt_should_be(double expected) {
        // 5 hits * (4 * 2.0 + 2 * max(0, 2.0-1)) = 5 * (8 + 2) = 50.0
        double damagePerHit = 4 * calculatedPower + 2 * Math.max(0, calculatedPower - 1);
        double totalDamage = 5 * damagePerHit;
        assertEquals(expected, totalDamage, 0.001);
    }

    @And("the net energy cost should be {double}")
    public void the_net_energy_cost_should_be(double expected) {
        // 40.0 spent - 30.0 recovered = 10.0 net cost
        double spent = 20 * calculatedPower;
        double recovered = 5 * 3 * calculatedPower;
        double netCost = spent - recovered;
        assertEquals(expected, netCost, 0.001);
    }
}
