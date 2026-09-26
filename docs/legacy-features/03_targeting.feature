Feature: Targeting System - Virtual Gun Array
  As Hadur, the god of war
  I need to accurately predict enemy positions and select the best targeting strategy
  So that I maximise my hit rate and damage output

  Background:
    Given Hadur is deployed on a standard 800x600 battlefield
    And the virtual gun array is initialised with all gun types
    And the gun is decoupled from robot body rotation

  # --- Virtual Gun Architecture ---

  Scenario: Initialise the virtual gun array
    Given a new battle begins
    When the gun system is initialised
    Then the following virtual guns should be active:
      | Gun Type          | Description                                      |
      | GuessFactor       | Statistical targeting using segmented guess factors |
      | PatternMatching   | Symbolic pattern matching on movement history       |
      | CircularPrediction | Assumes constant turn rate projection              |
      | LinearPrediction  | Assumes straight-line movement                     |
      | HeadOn            | Fires directly at current enemy position            |
    And each gun should independently track its own hit statistics
    And all guns should fire virtual waves on every scan

  Scenario: Virtual guns track independent performance
    Given Hadur has fired 50 waves
    And the GuessFactor gun would have hit 18 times
    And the CircularPrediction gun would have hit 12 times
    And the LinearPrediction gun would have hit 8 times
    When gun performance is evaluated
    Then the GuessFactor gun should report 36% virtual hit rate
    And the CircularPrediction gun should report 24% virtual hit rate
    And the LinearPrediction gun should report 16% virtual hit rate

  # --- Gun Selection ---

  Scenario: Select the best-performing gun dynamically
    Given the rolling performance window is 30 waves
    And the GuessFactor gun has the highest hit rate in the window
    When Hadur aims to fire
    Then the GuessFactor gun's targeting angle should be used
    And the selection should be logged for analytics

  Scenario: Adapt gun selection when enemy changes movement
    Given the GuessFactor gun has been selected for 20 waves
    And the enemy switches from random movement to wave surfing
    And the PatternMatching gun starts outperforming over the last 15 waves
    When the rolling window is re-evaluated
    Then the active gun should switch to PatternMatching
    And the transition should be smooth with no firing gap

  Scenario: Handle gun selection with insufficient data
    Given fewer than 10 waves have been fired
    When Hadur needs to select a gun
    Then the GuessFactor gun should be used as the default
    And all virtual guns should continue collecting data

  # --- GuessFactor Gun ---

  Scenario: Segment guess factor statistics
    Given an enemy scan is received
    When the GuessFactor gun calculates its aim
    Then the stats should be segmented by:
      | Dimension        | Segments | Description                         |
      | Distance         | 5        | Range bands from close to far        |
      | Lateral velocity | 5        | Speed perpendicular to bearing       |
      | Advancing velocity | 3      | Speed towards or away from Hadur     |
      | Acceleration     | 3        | Accelerating, decelerating, constant |
      | Wall proximity   | 3        | Distance to nearest wall             |
    And the gun should fire at the guess factor with the highest weighted count

  Scenario: Calculate maximum escape angle correctly
    Given the enemy is at distance 400
    And Hadur is firing with power 2.0
    When the maximum escape angle is calculated
    Then it should use the formula: asin(8.0 / bulletSpeed)
    And the bullet speed should be: 20 - 3 * 2.0 = 14.0
    And the maximum escape angle should be approximately 0.608 radians

  Scenario: Apply rolling decay to old observations
    Given the GuessFactor stats have 200 recorded observations
    When a new observation is recorded
    Then older observations should be weighted less than recent ones
    And the decay factor should ensure the gun adapts within 30-50 waves

  # --- Pattern Matching Gun ---

  Scenario: Record enemy movement history
    Given the pattern matching gun is active
    When 100 ticks have elapsed with continuous scans
    Then the heading change history should contain 100 entries
    And the velocity history should contain 100 entries
    And the history buffer should support at least 1000 entries

  Scenario: Find matching movement pattern
    Given the enemy has repeated a 12-tick movement pattern
    And this pattern exists in the movement history from 50 ticks ago
    When the pattern matcher searches for matches
    Then a match should be found with high confidence
    And the matched length should be at least 8 ticks
    And the prediction should project forward from the matched position

  Scenario: Handle no pattern match found
    Given the enemy is moving randomly
    And no pattern of length 5 or more is found in history
    When the pattern matcher searches for matches
    Then the gun should report low confidence
    And the virtual gun array should not select this gun for firing

  # --- Circular and Linear Prediction ---

  Scenario: Circular prediction for turning enemy
    Given the enemy has a consistent turn rate of 0.05 radians per tick
    And the enemy velocity is 6.0
    When the circular gun predicts the intercept position
    Then the prediction should project along an arc
    And the predicted position should account for bullet travel time iteratively
    And the prediction should converge within 20 iterations

  Scenario: Linear prediction for straight-moving enemy
    Given the enemy is moving in a straight line at velocity 8.0
    And the enemy heading is constant at 180 degrees
    When the linear gun predicts the intercept position
    Then the prediction should project along a straight line
    And the intercept should be calculated using bullet travel time

  # --- Aiming Precision ---

  Scenario: Gun turn completes before firing
    Given the gun needs to rotate 15 degrees to aim
    And the gun turn rate is approximately 20 degrees per tick
    When Hadur prepares to fire
    Then the gun should complete its rotation before firing
    And no bullet should be fired while the gun is still turning
    And the maximum gun turn error at firing should be less than 1 degree

  Scenario: Fire only when gun heat is zero
    Given the gun heat is 0.4
    When Hadur's targeting system requests a fire
    Then no bullet should be fired
    And the targeting system should continue tracking
    And the gun should be aimed at the predicted position for when heat reaches zero
