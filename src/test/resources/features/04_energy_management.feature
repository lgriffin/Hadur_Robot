Feature: Energy Management
  As Hadur, the god of war
  I need to manage my energy wisely
  So that I outlast opponents and deliver killing blows at the right moment

  Background:
    Given Hadur is deployed on a standard 800x600 battlefield
    And Hadur starts with 100.0 energy
    And the energy manager is integrated with the targeting system

  # --- Fire Power Selection ---

  Scenario Outline: Select fire power based on distance
    Given the enemy is at distance <distance> pixels
    And Hadur has <energy> energy
    When fire power is calculated
    Then the selected power should be approximately <power>

    Examples:
      | distance | energy | power |
      | 100      | 80.0   | 3.0   |
      | 200      | 80.0   | 2.5   |
      | 350      | 80.0   | 2.0   |
      | 500      | 80.0   | 1.0   |
      | 700      | 80.0   | 0.8   |

  Scenario: Finishing move at close range
    Given the enemy has less than 4.0 energy remaining
    And Hadur has more than 30.0 energy
    And the enemy is within 300 pixels
    When fire power is calculated
    Then the power should be the exact amount needed to destroy the enemy
    And the power should be capped at 3.0

  Scenario: Conserve energy when low
    Given Hadur has less than 15.0 energy
    And the enemy has more than 30.0 energy
    When fire power is calculated
    Then the power should not exceed 1.0
    And Hadur should never fire if it would reduce energy below 0.1

  Scenario: Reduce power when accuracy is poor
    Given Hadur's rolling accuracy over the last 30 shots is below 15%
    And the enemy is at distance 400 pixels
    When fire power is calculated
    Then the power should be reduced by at least 30% from the distance-based default
    And this reduction should help conserve energy during inaccurate phases

  # --- Energy Conservation ---

  Scenario: Avoid wall collisions to preserve energy
    Given Hadur is performing wave surfing movement
    When movement decisions are made over 100 ticks
    Then wall collisions should number zero
    And no energy should be lost to wall impacts

  Scenario: Consider energy differential in strategy
    Given Hadur has 45.0 energy
    And the enemy has 20.0 energy
    When the strategy is evaluated
    Then Hadur should maintain an aggressive posture
    And fire power should be moderate to sustain the advantage

  Scenario: Switch to survival mode when energy is critical
    Given Hadur has 5.0 energy
    And the enemy has 40.0 energy
    When the strategy is evaluated
    Then fire power should be minimal at 0.1
    And movement should prioritise maximum evasion
    And Hadur should focus on dodging rather than dealing damage

  # --- Bullet Damage Awareness ---

  Scenario: Calculate expected damage from bullet hit
    Given Hadur fires a bullet with power 2.0
    When the bullet hits the enemy
    Then the damage dealt should be: 4 * power + 2 * max(0, power - 1) = 10.0
    And Hadur should gain 3 * power = 6.0 energy back

  Scenario: Track net energy exchange rate
    Given Hadur has hit 5 of the last 20 shots
    And each shot was fired at power 2.0
    When the energy exchange rate is calculated
    Then energy spent on bullets should be 40.0
    And energy recovered from hits should be 30.0
    And damage dealt should be 50.0
    And the net energy cost should be 10.0
