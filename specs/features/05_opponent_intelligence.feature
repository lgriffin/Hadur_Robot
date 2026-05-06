Feature: Opponent Intelligence
  As Hadur, the god of war
  I need to analyse and classify my enemy
  So that I can select the optimal counter-strategy

  Background:
    Given Hadur is deployed on a standard 800x600 battlefield
    And the opponent intelligence module is active
    And scan data is being collected every tick

  # --- Movement Classification ---

  Scenario: Classify a stationary opponent
    Given the enemy has had velocity below 0.5 for 80% of the last 100 ticks
    When the movement classifier runs
    Then the enemy should be classified as "STOPPED"
    And the confidence level should be "HIGH"

  Scenario: Classify a linear mover
    Given the enemy heading change per tick averages below 0.03 radians
    And the enemy reversal rate is below 2%
    When the movement classifier runs
    Then the enemy should be classified as "LINEAR"
    And the recommended gun should bias toward LinearPrediction

  Scenario: Classify a circular mover
    Given the enemy has a consistent heading change rate
    And the variance in heading change is below 0.01
    When the movement classifier runs
    Then the enemy should be classified as "CIRCULAR"
    And the recommended gun should bias toward CircularPrediction

  Scenario: Classify an oscillating mover
    Given the enemy direction reversal rate is above 6%
    And reversals occur at semi-regular intervals
    When the movement classifier runs
    Then the enemy should be classified as "OSCILLATING"
    And the recommended gun should bias toward GuessFactor

  Scenario: Classify a random mover
    Given the enemy heading change has high variance (above 0.05)
    And no repeating pattern is detected
    When the movement classifier runs
    Then the enemy should be classified as "RANDOM"
    And the recommended gun should bias toward GuessFactor with broad segments

  Scenario: Detect a wave surfer
    Given the enemy consistently reverses direction within 4 ticks of Hadur firing
    And this correlation occurs in more than 60% of fire events
    When the movement classifier runs
    Then the enemy should be classified as "WAVE_SURFER"
    And Hadur should activate anti-surfer targeting strategies

  # --- Anti-Surfer Strategy ---

  Scenario: Counter a wave surfer with non-firing feints
    Given the enemy is classified as "WAVE_SURFER"
    When Hadur detects the enemy reacting to energy drops
    Then Hadur should occasionally skip firing to create false energy drops
    And the enemy's surfing profile should become less accurate over time

  Scenario: Counter a wave surfer with variable fire power
    Given the enemy is classified as "WAVE_SURFER"
    When Hadur selects fire power
    Then fire power should vary unpredictably between 0.1 and 3.0
    And bullet speed variation should degrade the enemy's wave timing

  # --- Threat Assessment ---

  Scenario: Calculate threat level from aggressive opponent
    Given the enemy fires at power 3.0 consistently
    And the enemy maintains close distance (under 200 pixels)
    And the enemy has high accuracy (above 30%)
    When the threat level is assessed
    Then the threat should be rated "HIGH" (above 0.7)
    And Hadur should increase evasion priority

  Scenario: Calculate threat level from passive opponent
    Given the enemy fires at power 0.5 or less
    And the enemy maintains far distance (above 500 pixels)
    And the enemy has low accuracy (below 10%)
    When the threat level is assessed
    Then the threat should be rated "LOW" (below 0.3)
    And Hadur should increase aggression

  # --- Opponent Gun Detection ---

  Scenario: Detect opponent using head-on targeting
    Given Hadur has been hit multiple times
    And the hit bearings cluster within 5 degrees of the direct bearing
    When the opponent gun type is analysed
    Then the opponent should be classified as using "HEAD_ON" targeting
    And Hadur's movement should easily defeat this gun

  Scenario: Detect opponent using statistical targeting
    Given Hadur has been hit multiple times
    And the hit bearings correlate with Hadur's recent movement patterns
    When the opponent gun type is analysed
    Then the opponent should be classified as using "STATISTICAL" targeting
    And Hadur should activate movement flattening

  # --- Multi-Round Learning ---

  Scenario: Persist opponent data across rounds
    Given round 1 has completed
    And the enemy was classified as "WAVE_SURFER" with high confidence
    When round 2 begins
    Then the classification from round 1 should be available
    And the initial strategy should account for prior classification
    And fresh data from round 2 should be blended with historical data

  Scenario: Adapt when opponent changes strategy between rounds
    Given rounds 1-3 classified the enemy as "OSCILLATING"
    And in round 4 the enemy is exhibiting "WAVE_SURFER" behaviour
    When the classifier runs in round 4
    Then the classification should update to "WAVE_SURFER"
    And historical data should be weighted less than current round data
    And Hadur should smoothly transition to anti-surfer strategy
