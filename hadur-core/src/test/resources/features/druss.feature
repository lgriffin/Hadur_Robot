Feature: The DrussGT route
  Both guns hit below break-even against DrussGT, so every shot costs its owner more energy
  than it takes, and the robot that fires the lighter bullet keeps its lead. Hadur keeps
  battle-long hit counts for both robots, and while both are certainly below break-even it
  fires the minimum power when level or ahead and the default when behind. It never holds a
  shot it can pay for, and it carries the verdict to the next battle in the profile.

  @POW-11
  Scenario: Battle-long counts are kept by power class for both robots
    Given a duel in which Hadur has 100 energy and the enemy 100
    When for 20 enemy waves of power 0.5 Hadur's 0.1 bullets hit 1 in 5 and the enemy's all miss
    And for 10 enemy waves of power 1.95 Hadur's 1.95 bullets hit 0 in 1 and the enemy's all miss
    And 80 quiet ticks pass so the last waves break
    Then Hadur's battle record has 20 bullets in power class 0, 4 of them hits, and the enemy's has 0 with 0 hits
    And Hadur's battle record has 0 bullets in power class 1, 0 of them hits, and the enemy's has 20 with 0 hits
    And Hadur's battle record has 10 bullets in power class 2, 0 of them hits, and the enemy's has 10 with 0 hits
    And each robot's rate over all its bullets carries a margin of error
    And the round record counts 20 of our bullets and 0 of theirs in power class 0
    And the round record counts 10 of our bullets and 10 of theirs in power class 2

  @POW-7
  Scenario: Both guns certainly below break-even and level on energy: the minimum power
    Given a duel in which Hadur has 55 energy and the enemy 85
    When for 60 enemy waves of power 0.5 Hadur's 0.1 bullets hit 0 in 1 and the enemy's all miss
    And Hadur scans the enemy for 2 ticks with a cool gun on target
    Then the lead-aware regime is on
    And the shot fired went out at power 0.1

  @POW-7
  Scenario: Ahead on energy, the minimum power as well
    Given a duel in which Hadur has 55 energy and the enemy 70
    When for 60 enemy waves of power 0.5 Hadur's 0.1 bullets hit 0 in 1 and the enemy's all miss
    And Hadur scans the enemy for 2 ticks with a cool gun on target
    Then the shot fired went out at power 0.1

  @POW-7
  Scenario: Too few bullets to be certain: 1.20's power-down stands
    Given a duel in which Hadur has 55 energy and the enemy 85
    When for 10 enemy waves of power 0.5 Hadur's 0.1 bullets hit 0 in 1 and the enemy's all miss
    And Hadur scans the enemy for 2 ticks with a cool gun on target
    Then the lead-aware regime is off
    And the shot fired went out above power 1.0

  @POW-7
  Scenario: A gun above break-even keeps 1.20's power
    Given a duel in which Hadur has 55 energy and the enemy 85
    When for 60 enemy waves of power 0.5 Hadur's 0.1 bullets hit 1 in 2 and the enemy's all miss
    And Hadur scans the enemy for 2 ticks with a cool gun on target
    Then the lead-aware regime is off
    And the shot fired went out above power 1.5

  @POW-8
  Scenario: Behind by more than 3 with more than 10 energy: the default power, not the power-down
    Given a duel in which Hadur has 25 energy and the enemy 85
    When for 60 enemy waves of power 0.5 Hadur's 0.1 bullets hit 0 in 1 and the enemy's all miss
    And Hadur scans the enemy for 2 ticks with a cool gun on target
    Then the lead-aware regime is on
    And the shot fired went out at power 1.95

  @POW-9
  Scenario: While both robots exceed 60 energy the opening is traded at the default power
    Given a duel in which Hadur has 100 energy and the enemy 130
    When for 60 enemy waves of power 0.5 Hadur's 0.1 bullets hit 0 in 1 and the enemy's all miss
    And Hadur scans the enemy for 2 ticks with a cool gun on target
    Then the lead-aware regime is on
    And the shot fired went out at power 1.95

  @POW-10
  Scenario: A shot whose power exceeds our energy is lowered, not held
    Given a duel at 300 px in which Hadur has 1.5 energy and the enemy 100
    When Hadur scans the enemy for 3 ticks with a cool gun on target
    Then the shot fired went out below power 1.5

  @POW-10
  Scenario: With energy for no shot at all, none is fired
    Given a duel at 300 px in which Hadur has 0.1 energy and the enemy 100
    When Hadur scans the enemy for 3 ticks with a cool gun on target
    Then no shot went out

  @ADAPT-5
  Scenario: A profile that recorded the condition applies it from the first shot
    Given Hadur remembers the enemy with the lead-aware verdict standing, and has 50 energy against 52
    When Hadur scans the enemy for 2 ticks with a cool gun on target
    Then the lead-aware regime is on
    And the shot fired went out at power 0.1

  @ADAPT-5
  Scenario: A stranger has no verdict and gets 1.20's power-down
    Given Hadur remembers the enemy with the lead-aware verdict absent, and has 50 energy against 52
    When Hadur scans the enemy for 2 ticks with a cool gun on target
    Then the lead-aware regime is off
    And the shot fired went out above power 0.5

  @ADAPT-5
  Scenario: This battle's rates contradict the verdict by more than their margins
    Given Hadur remembers the enemy with the lead-aware verdict standing, and has 50 energy against 52
    When for 30 enemy waves of power 0.5 Hadur's 0.1 bullets hit 1 in 1 and the enemy's all miss
    And Hadur scans the enemy for 2 ticks with a cool gun on target
    Then the lead-aware regime is off
    And the shot fired went out above power 1.5

  @ADAPT-5
  Scenario: The verdict is not contradicted by evidence that is merely thin
    Given Hadur remembers the enemy with the lead-aware verdict standing, and has 50 energy against 52
    When for 3 enemy waves of power 0.5 Hadur's 0.1 bullets hit 0 in 1 and the enemy's all miss
    And Hadur scans the enemy for 2 ticks with a cool gun on target
    Then the lead-aware regime is on

  @POW-8
  Scenario: Behind by more than 3 with 10 energy or less: the minimum power, even inside 325 px
    Given a duel at 300 px in which Hadur has 8 energy and the enemy 85
    When for 60 enemy waves of power 0.5 Hadur's 0.1 bullets hit 0 in 1 and the enemy's all miss
    And Hadur scans the enemy for 2 ticks with a cool gun on target
    Then the lead-aware regime is on
    And the shot fired went out at power 0.1
