Feature: Clean Architecture
  As the developer of Hadur
  I need a well-structured codebase with clear separation of concerns
  So that each subsystem can be developed, tested, and improved independently

  # --- Component Structure ---

  Scenario: Hadur follows a delegated subsystem architecture
    Given the Hadur codebase
    Then the following components should exist as separate classes:
      | Class                | Package           | Responsibility                                         |
      | Hadur                | hadur117          | Main robot, event dispatch, subsystem coordination      |
      | Radar                | hadur117.radar    | Radar lock (duel) and sweep (melee) management          |
      | Gun                  | hadur117.gun      | Virtual gun array, targeting, fire decisions             |
      | WaveSurfer           | hadur117.movement | Wave surfing for duel mode                              |
      | MinimumRiskMovement  | hadur117.movement | Anti-gravity movement for melee mode                    |
      | Brain                | hadur117.intel    | Opponent intel, classification, threat assessment        |
      | MeleeTargetSelector  | hadur117.intel    | Target prioritisation for multi-party battles            |
    And each subsystem should receive only the data it needs from the main robot
    And no subsystem should directly call another subsystem

  # --- Dependency Direction ---

  Scenario: Main robot orchestrates subsystems
    Given the Hadur class
    Then it should hold references to Radar, Gun, WaveSurfer, MinimumRiskMovement, Brain, and MeleeTargetSelector
    And it should pass scan data to each subsystem
    And it should collect commands from each subsystem
    And it should call execute() once per tick to commit all commands
    And subsystems should not hold a reference back to the main robot class

  Scenario: Subsystems support dual-mode operation
    Given Hadur detects the battle mode
    When the mode is "DUEL"
    Then Radar should use narrow lock
    And WaveSurfer should handle movement
    And Gun should use the full virtual gun array
    When the mode is "MELEE"
    Then Radar should use full sweep
    And MinimumRiskMovement should handle movement
    And Gun should use circular/linear prediction
    And MeleeTargetSelector should be active

  Scenario: Subsystems communicate through data objects
    Given a scan event is received
    When data flows between subsystems
    Then scan data should be passed as an immutable state object
    And movement commands should be returned as a value object
    And gun commands should be returned as a value object
    And no subsystem should mutate shared state directly

  # --- State Management ---

  Scenario: Transient state resets each round
    Given a new round begins
    When subsystems are reset
    Then active wave lists should be cleared
    And current scan data should be reset
    And tick counters should restart
    And gun heat should be recalculated from initial state

  Scenario: Persistent state survives across rounds
    Given a round ends
    When the next round begins
    Then guess factor statistics should be retained (static fields)
    And opponent classification history should be retained
    And virtual gun performance records should be retained
    And multi-round analytics should be accumulated

  # --- Interface Contracts ---

  Scenario: Movement subsystem has a clear contract
    Given a battle state snapshot
    When the movement system is invoked
    Then it should accept: robot position, heading, velocity, enemy waves, battlefield dimensions
    And it should return: desired body turn angle and desired movement distance
    And it should not require access to the Robot object directly

  Scenario: Gun subsystem has a clear contract
    Given a battle state snapshot and enemy state
    When the gun system is invoked
    Then it should accept: robot position, gun heading, enemy position, enemy velocity, enemy heading
    And it should return: desired gun turn angle, recommended fire power, and fire/hold decision
    And it should not call any Robot methods directly

  Scenario: Brain subsystem has a clear contract
    Given accumulated scan history
    When the brain is invoked
    Then it should accept: list of recent enemy snapshots and fire events
    And it should return: enemy classification, threat level, and strategy recommendations
    And it should be purely analytical with no side effects

  # --- Naming & Package Convention ---

  Scenario: All classes reside in the hadur117 package hierarchy
    Given the Hadur source files
    Then all Java files should declare a package under "hadur117"
    And all files should be located under src/main/java/hadur117/
    And the robot classname should be "hadur117.Hadur"
    And the properties file should be Hadur.properties

  Scenario: Class naming follows consistent conventions
    Given the Hadur source files
    Then classes should use short names scoped by their sub-package
    And data carriers should be standalone classes in their appropriate package
    And public methods should use camelCase
    And constants should use UPPER_SNAKE_CASE
