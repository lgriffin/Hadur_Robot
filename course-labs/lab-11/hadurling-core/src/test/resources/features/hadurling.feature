Feature: Hadurling's core
  The core decides from an Input alone, and a guard makes sure a decision always exists.

  @HL-3
  Scenario: The radar overshoots the enemy
    Given an enemy 45 degrees to our right
    When the core takes a tick
    Then the radar turns 90 degrees to the right

  @HL-4
  Scenario: A hot gun holds fire
    Given an enemy dead ahead
    And the gun heat is 0.4
    When the core takes a tick
    Then the core holds fire

  @HL-6
  Scenario: A failing core does not leave the robot without orders
    Given a core that always throws
    When the guard takes three ticks
    Then every tick has orders that drive 100 pixels ahead and hold fire
    And exactly 1 FAULT line was logged

  @HL-13
  Scenario: A drop nothing else explains is an enemy shot
    Given the core has seen an enemy with 100 energy
    When the enemy is next seen with 98 energy
    Then the surfer watches 1 enemy waves

  @HL-16
  Scenario: Our own hit explains a drop
    Given the core has seen an enemy with 100 energy
    And our bullet of power 0.5 hits the enemy
    When the enemy is next seen with 98 energy
    Then the surfer watches 0 enemy waves
