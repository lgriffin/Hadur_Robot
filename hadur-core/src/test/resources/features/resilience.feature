Feature: Resilience
  Hadur keeps fighting when its own code misbehaves, stays within memory over a long
  battle, reports every fault, and behaves the same every time.

  @RES-1
  Scenario: A core that throws still gets the robot orders
    Given a core that throws on every 10th tick
    When the robot plays 50 ticks against an enemy it can see
    Then every tick has orders that turn the radar
    And 5 faults are counted for the round
    And exactly one FAULT record is written

  @RES-2
  Scenario Outline: Growing structures are bounded
    When <count> entries are added to a <structure>
    Then it holds at most <bound> entries

    Examples:
      | structure        | count | bound |
      | robot state log  | 6000  | 5000  |
      | size-limited tree| 500   | 100   |

  @RES-5
  Scenario: Faults and skipped turns reach the round record
    Given a fresh core in round 4
    When it receives 2 skipped-turn events
    And the round ends after the guard covered 3 faults
    Then the R record shows 2 skipped turns and 3 faults

  @RES-6
  Scenario: The core is deterministic by construction
    Given the compiled core classes
    Then no core class uses unseeded randomness
    And no core class uses threads
    And no core class uses reflection
    And no core class does file I/O or reads the clock
    And no core class holds mutable static state
