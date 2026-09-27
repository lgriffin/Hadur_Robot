Feature: Aggressive
  Hadur fights as close as the exchange of hits allows and shoots as hard as the enemy's gun
  permits. The target distance starts where the opening puts it and moves a step a wave on
  the gap between the two rolling hit rates; a weak enemy is closed on and finished, and a
  disabled one is rammed. Nothing here waits for a tick count: every change follows from
  hits, energies and gun heats.

  @DIST-1
  Scenario: A certain lead in hit rate brings the fight in to 400 px and no closer
    Given a duel against a stranger
    Then the target distance is 650
    When for 60 enemy waves Hadur's bullets hit 4 in 5 and the enemy's all miss
    Then the target distance is 400
    And each step of the target distance was 25 px and was recorded

  @DIST-1 @DIAL-1
  Scenario: A lead that could still be luck keeps the conservative distance
    Given a duel against a stranger
    When for 8 enemy waves Hadur's bullets hit 1 in 4 and the enemy's all miss
    Then the target distance is 650
    When for 52 enemy waves Hadur's bullets hit 1 in 4 and the enemy's all miss
    Then the target distance is below 650

  @END-1
  Scenario: A weak enemy whose gun is hotter than ours is closed on to finish it
    Given a duel against a stranger
    When the enemy, down to 10 energy, fires while Hadur has 80 energy and a gun just short of cool
    Then the endgame is "finish"
    And the target distance is 150

  @DIST-1 @DIAL-1
  Scenario: A new opponent starts with nothing learned about the last one
    Given a duel against a stranger
    When for 60 enemy waves Hadur's bullets hit 4 in 5 and the enemy's all miss
    Then the target distance is 400
    When the duel's opponent is now "sample.Crazy (2)"
    Then the target distance is 650
    And neither rolling hit rate has any outcomes

  @END-1
  Scenario: Not while our gun is the hotter one
    Given a duel against a stranger
    When the enemy is down to 10 energy while Hadur has 80 energy and a hot gun
    Then the endgame is "none"
    And the target distance is 650

  @END-1
  Scenario: Not on the tick Hadur's own shot makes its gun the hotter one
    Given a duel against a stranger
    When the enemy, down to 10 energy, fires as Hadur, with 80 energy, fires its cool gun
    Then the endgame is "none"
    And the target distance is 650

  @END-2
  Scenario: A disabled enemy is rammed
    Given a duel against a stranger
    When the enemy is scanned with 0 energy
    Then the endgame is "ram"
    And Hadur drives straight at the enemy at full speed

  @POW-1
  Scenario: A gun the profile rates T0 is met with full-power shots
    Given Hadur remembers "sample.Walls" as a gun that hits 0.5% of the time
    When Hadur scans "sample.Walls" for 2 ticks with a cool gun on target
    Then the power policy is "pow_1"
    And the shot fired has power 3.0

  @POW-1
  Scenario: A stranger gets the gun's own power
    Given a duel against a stranger
    When Hadur scans "sample.Walls" for 2 ticks with a cool gun on target
    Then the shot fired has power 1.95

  @POW-2 @DIAL-1
  Scenario: A certain, wide lead in this battle turns on full power
    Given a duel against a stranger
    When for 60 enemy waves Hadur's bullets hit 4 in 5 and the enemy's all miss
    Then the power policy is "pow_2"
