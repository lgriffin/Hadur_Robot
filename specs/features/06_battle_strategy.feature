Feature: Overall Battle Strategy
  As Hadur, the god of war
  I need to coordinate all subsystems into a cohesive battle plan
  So that I reign supreme on the battlefield

  Background:
    Given Hadur is deployed on a standard 800x600 battlefield
    And all subsystems are initialised and operational
    And Hadur extends AdvancedRobot for non-blocking command execution

  # --- Mode Detection ---

  Scenario: Detect battle mode at startup
    Given a new battle begins
    When Hadur's run() method executes
    Then Hadur should query getOthers() to count opponents
    And if getOthers() equals 1 the mode should be "DUEL"
    And if getOthers() is greater than 1 the mode should be "MELEE"
    And all subsystems should be configured for the detected mode

  # --- Initialisation ---

  Scenario: Battle initialisation
    Given a new battle begins
    When Hadur's run() method executes
    Then the robot body colour should be set to dark crimson
    And the gun colour should be set to molten gold
    And the radar colour should be set to blood red
    And gun-for-robot-turn adjustment should be enabled
    And radar-for-gun-turn adjustment should be enabled
    And the radar should begin spinning to find enemies

  Scenario: Round initialisation with memory
    Given this is round 5 of a 10-round battle
    When the round begins
    Then static fields should retain data from rounds 1-4
    And the opponent profile should be loaded from previous rounds
    And analytics should record the new round number
    And the gun and movement systems should reset transient state only

  # --- Main Loop Coordination ---

  Scenario: Execute one tick of the main battle loop
    Given Hadur has an active radar lock
    When one tick of the main loop executes
    Then the following should happen in order:
      | Step | Action                                          |
      | 1    | Process latest scan data                         |
      | 2    | Update opponent profile with new observation      |
      | 3    | Evaluate and queue movement commands              |
      | 4    | Evaluate and queue gun aiming commands            |
      | 5    | Evaluate and queue fire command if appropriate    |
      | 6    | Queue radar lock maintenance command              |
      | 7    | Call execute() to commit all queued commands       |

  Scenario: Handle tick with no scan data
    Given the radar has lost lock for 1 tick
    When the main loop executes without a scan event
    Then movement should continue with last known enemy data
    And the gun should hold its current aim
    And the radar should widen sweep to re-acquire

  # --- Subsystem Coordination ---

  Scenario: Movement and gun do not conflict
    Given the wave surfer wants to move clockwise
    And the gun needs to aim counter-clockwise
    When both subsystems set their commands
    Then the body turn should follow the movement system
    And the gun turn should be independent of body turn
    And both systems should function without interference

  Scenario: Fire power decision integrates multiple factors
    Given the distance to enemy is 350 pixels
    And Hadur's energy is 60.0
    And the enemy's energy is 25.0
    And the current accuracy is 28%
    And the enemy is classified as "OSCILLATING"
    When the fire power is determined
    Then the base power should reflect the distance (approximately 2.0)
    And adjustments should be made for energy advantage
    And adjustments should be made for accuracy
    And the opponent intelligence should influence the final power

  # --- Winning Conditions ---

  Scenario: Dominate a head-on targeting robot
    Given the enemy uses head-on targeting
    And the enemy uses simple back-and-forth movement
    When a 10-round battle completes
    Then Hadur should win at least 9 of 10 rounds
    And average damage dealt per round should exceed 200

  Scenario: Compete against a wave-surfing robot
    Given the enemy uses wave surfing movement
    And the enemy uses guess factor targeting
    When a 35-round battle completes
    Then Hadur should win at least 50% of rounds
    And Hadur's hit rate should be above 15%
    And Hadur's damage taken per round should be below 60

  Scenario: Defeat a ram bot
    Given the enemy charges directly at Hadur
    And the enemy attempts to ram repeatedly
    When Hadur detects ramming behaviour
    Then Hadur should increase distance while firing at maximum power
    And Hadur should use simple head-on targeting since the enemy is approaching directly
    And Hadur should win the energy exchange decisively

  # --- Analytics & Observability ---

  Scenario: Report round summary
    Given a round has just ended
    When the round summary is generated
    Then it should include:
      | Metric                  | Format          |
      | Result                  | WIN or LOSS      |
      | Damage dealt            | Numeric          |
      | Damage received         | Numeric          |
      | Bullet hit rate         | Percentage       |
      | Enemy movement type     | Classification   |
      | Active gun selected     | Gun name         |
      | Wall collisions         | Count            |
      | Energy remaining        | Numeric          |

  Scenario: Report multi-round aggregate
    Given 10 rounds have completed
    When the aggregate report is generated
    Then it should include win/loss ratio across all rounds
    And it should include average accuracy trend
    And it should include damage efficiency ratio
    And it should identify performance trends (IMPROVING, STABLE, DECLINING)
