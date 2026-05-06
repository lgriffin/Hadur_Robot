Feature: Melee Battle Strategy
  As Hadur, the god of war
  I need to survive and dominate in multi-party battles
  So that I reign supreme regardless of the number of opponents

  Background:
    Given Hadur is deployed on a battlefield with 3 or more robots
    And the battle mode is detected as "MELEE"
    And the melee strategy subsystem is active

  # --- Mode Detection ---

  Scenario: Detect 1v1 battle mode
    Given there are exactly 2 robots in the battle (Hadur and one enemy)
    When the battle begins
    Then the battle mode should be set to "DUEL"
    And the 1v1 subsystems should be activated
    And wave surfing movement should be enabled
    And virtual gun array should target the single enemy

  Scenario: Detect melee battle mode
    Given there are 3 or more robots in the battle
    When the battle begins
    Then the battle mode should be set to "MELEE"
    And the melee subsystems should be activated
    And movement should switch to anti-gravity
    And the radar should switch to full sweep mode

  Scenario: Transition from melee to 1v1 when opponents are eliminated
    Given the battle started with 5 robots
    And 3 opponents have been destroyed
    And only Hadur and 1 enemy remain
    When the opponent count drops to 1
    Then the battle mode should switch to "DUEL"
    And movement should transition to wave surfing
    And the radar should switch to narrow lock
    And targeting should switch to the virtual gun array

  # --- Melee Radar ---

  Scenario: Sweep radar to track all opponents
    Given there are 4 opponents on the battlefield
    When the radar operates in melee mode
    Then the radar should perform full 360-degree sweeps
    And each opponent should be scanned at least once every 8 ticks
    And scan data should be stored for all known opponents

  Scenario: Maintain opponent data freshness
    Given 5 opponents are being tracked
    When an opponent has not been scanned for 20 ticks
    Then that opponent's data should be marked as "STALE"
    And stale opponent data should be weighted lower in decisions
    And the radar should prioritise re-scanning stale targets

  # --- Melee Movement: Anti-Gravity ---

  Scenario: Move away from clusters of enemies
    Given enemy A is at position (200, 200)
    And enemy B is at position (250, 230)
    And enemy C is at position (600, 400)
    When anti-gravity forces are calculated
    Then the combined repulsion from A and B should be strong (they are close together and to Hadur)
    And Hadur should move toward the area of lowest enemy density
    And the movement should favour open space

  Scenario: Apply wall repulsion force
    Given Hadur is at position (50, 300)
    And the west wall is 50 pixels away
    When anti-gravity forces are calculated
    Then the west wall should exert a repulsion force
    And the wall repulsion should prevent Hadur from getting cornered
    And the force should increase sharply below 50 pixels from any wall

  Scenario: Maintain minimum distance from all enemies
    Given 3 enemies are on the battlefield
    When Hadur selects a movement target
    Then the target should maintain at least 200 pixels from the nearest enemy
    And the target should prefer positions with clear escape routes
    And the target should avoid positioning between two enemies

  Scenario: Prefer corner avoidance in melee
    Given Hadur is near the northeast corner
    And 2 enemies are approaching from the south and west
    When anti-gravity forces are calculated
    Then the corner penalty should be high
    And Hadur should move toward the centre of the battlefield
    And escape paths should be evaluated for multiple opponents

  # --- Melee Targeting ---

  Scenario: Select the optimal target in melee
    Given 4 opponents are alive
    And opponent A has 20 energy and is 200 pixels away
    And opponent B has 80 energy and is 150 pixels away
    And opponent C has 50 energy and is 400 pixels away
    And opponent D has 10 energy and is 600 pixels away
    When the target selector evaluates all opponents
    Then target priority should consider:
      | Factor          | Weight | Description                              |
      | Energy          | HIGH   | Lower energy opponents are easier kills   |
      | Distance        | MEDIUM | Closer targets are more accurate           |
      | Angle to gun    | MEDIUM | Targets near current gun heading are faster |
      | Threat level    | LOW    | Prioritise threats only when endangered    |
    And opponent A should be the highest priority target (low energy, close range)

  Scenario: Switch targets when current target is destroyed
    Given Hadur is targeting opponent A
    And opponent A is destroyed
    When the next tick executes
    Then the target selector should immediately re-evaluate
    And the next best target should be selected
    And the gun should begin tracking the new target

  Scenario: Switch targets when a better opportunity appears
    Given Hadur is targeting opponent B at 400 pixels distance
    And opponent C moves to within 150 pixels with 15 energy
    When the target selector evaluates
    Then the target should switch to opponent C
    And the switch should only occur if the gun can reach the new target quickly

  Scenario: Use simpler targeting in melee
    Given the battle mode is "MELEE"
    And Hadur is targeting an opponent
    When the gun selects a targeting strategy
    Then the primary gun should be circular prediction (fast, good enough)
    And linear prediction should be the fallback
    And the full virtual gun array should NOT be used (too computationally expensive for melee)

  # --- Melee Survival ---

  Scenario: Avoid crossfire between two opponents
    Given opponent A is at bearing 30 degrees
    And opponent B is at bearing 210 degrees
    And Hadur is between them
    When the movement system evaluates position safety
    Then the current position should receive a high danger penalty
    And Hadur should move perpendicular to the A-B line
    And the escape direction should be chosen based on additional threats

  Scenario: Let opponents fight each other
    Given opponents A and B are engaged in close combat
    And both are taking damage from each other
    When Hadur evaluates strategy
    Then Hadur should maintain distance from the fight
    And Hadur should position for a finishing strike on the weakened survivor
    And fire power should be conserved during the engagement

  Scenario: Avoid being the last-hit target
    Given Hadur has the highest energy among all robots
    When the strategy is evaluated
    Then Hadur should reduce unnecessary aggression
    And Hadur should avoid drawing attention from multiple opponents
    And positioning should favour the periphery of the battle

  Scenario: Become aggressive when only 2 opponents remain
    Given 2 opponents remain alive
    And Hadur has the highest energy
    When the strategy is evaluated
    Then Hadur should target the weaker opponent aggressively
    And fire power should increase
    And positioning should cut off the weaker opponent's escape routes

  # --- Multi-Round Melee ---

  Scenario: Track per-opponent statistics in melee
    Given a melee battle has completed 5 rounds
    When opponent statistics are reviewed
    Then each opponent should have individual records for:
      | Stat                | Description                    |
      | Damage dealt to     | How much damage Hadur dealt     |
      | Damage received from | How much damage Hadur received  |
      | Movement type       | Classified movement pattern     |
      | Gun type detected   | Estimated targeting method      |
      | Average distance    | Typical engagement range        |
    And these stats should persist across rounds via static fields
