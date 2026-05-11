Feature: Movement System - Wave Surfing
  As Hadur, the god of war
  I need to dodge enemy bullets with precision
  So that I minimise damage taken and outlast my opponent

  Background:
    Given Hadur is deployed on a standard 800x600 battlefield
    And the movement system is initialised
    And enemy fire detection is active via energy monitoring

  # --- Enemy Fire Detection ---

  Scenario: Detect enemy bullet fire via energy drop
    Given the enemy has 100.0 energy
    When the next scan shows enemy energy at 97.0
    Then Hadur should detect an energy drop of 3.0
    And a new enemy wave should be created with bullet power 3.0
    And the wave velocity should be calculated as 11.0

  Scenario: Distinguish bullet fire from wall collision energy loss
    Given the enemy has 80.0 energy
    When the next scan shows enemy energy at 76.5
    Then the energy drop of 3.5 should be ignored
    # Because bullet power must be between 0.1 and 3.0

  Scenario: Detect low-power bullet fire
    Given the enemy has 50.0 energy
    When the next scan shows enemy energy at 49.9
    Then Hadur should detect an energy drop of 0.1
    And a new enemy wave should be created with bullet power 0.1
    And the wave velocity should be calculated as 19.7

  Scenario: Handle enemy-to-enemy collision energy change
    Given the enemy has 60.0 energy
    When the next scan shows enemy energy at 60.6
    Then no wave should be created
    # Because energy increased indicating a bullet hit reward

  # --- Wave Surfing Core ---

  Scenario: Surf the nearest incoming wave
    Given an enemy wave is approaching from 200 pixels away
    And the wave has 150 pixels until arrival
    When Hadur evaluates movement options
    Then Hadur should simulate movement in both orbital directions
    And Hadur should choose the direction with the lowest danger score
    And Hadur should begin moving to the safest position

  Scenario: Consider multiple incoming waves
    Given wave A is approaching and will arrive in 8 ticks
    And wave B is approaching and will arrive in 20 ticks
    When Hadur evaluates movement options
    Then Hadur should optimise primarily for wave A
    And Hadur should use wave B as a tiebreaker when wave A dangers are equal
    And the chosen position should not leave Hadur trapped against wave B

  Scenario: Movement prediction uses accurate physics
    Given Hadur is at position (400, 300) with velocity 6 and heading 90 degrees
    When the movement simulator predicts position for the next tick
    Then the prediction should account for maximum acceleration of 1.0
    And the prediction should account for maximum deceleration of 2.0
    And the prediction should account for velocity-dependent turn rate
    And the predicted position should match Robocode physics exactly

  # --- Danger Assessment ---

  Scenario: Segment danger statistics by distance
    Given enemy waves have been tracked across 50 ticks
    When a wave arrives from a distance of 300 pixels
    Then the danger calculation should use the medium-distance segment
    And the segment boundaries should be close (<250), medium (250-550), and far (>550)

  Scenario: Segment danger statistics by lateral velocity
    Given Hadur is moving with lateral velocity of 5.0
    When danger is calculated for the current wave
    Then the correct velocity segment should be selected
    And danger stats should reflect the enemy's targeting pattern for that velocity

  Scenario: Apply kernel density smoothing to danger stats
    Given Hadur has been hit at guess factor 0.3
    When the danger stats are updated
    Then the hit should be recorded at the primary bin
    And adjacent bins should receive smoothed contributions
    And the smoothing kernel should use weights [0.5, 1.0, 0.5]

  # --- Profile Flattening ---

  Scenario: Activate movement flattening after sustained hits
    Given Hadur has been hit 10 times in the current battle
    And the hit threshold for flattening is 8
    When Hadur evaluates movement options
    Then the movement should blend surfing danger with visit-count flattening
    And previously visited angles should receive a penalty
    And the overall movement profile should become less predictable

  Scenario: Do not flatten when hit count is low
    Given Hadur has been hit 3 times in the current battle
    When Hadur evaluates movement options
    Then pure wave surfing should be used without flattening
    And visit count data should still be collected for future use

  # --- Wall Smoothing ---

  Scenario: Smooth movement along a wall
    Given Hadur is 30 pixels from the north wall
    And the current movement direction would hit the wall
    When wall smoothing is applied
    Then the heading should be adjusted to glide parallel to the wall
    And the adjustment should use a stick length of 160 pixels
    And Hadur should never reverse direction due to a wall

  Scenario: Handle corner proximity
    Given Hadur is 30 pixels from both the north and east walls
    When wall smoothing is applied
    Then the heading should be adjusted to navigate the corner
    And the movement should remain smooth without oscillation
    And Hadur should not become stuck in the corner

  Scenario: Wall smoothing preserves surfing direction
    Given Hadur has chosen to surf clockwise to avoid a wave
    And the clockwise path approaches a wall
    When wall smoothing adjusts the heading
    Then the overall orbital direction should be preserved
    And the adjustment should be the minimum needed to avoid the wall
