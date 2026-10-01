Feature: Unhittable
  Hadur makes itself harder to hit. Its own bullets shadow the enemy's waves: an enemy bullet
  fired where one of ours will cross it dies on the way, so the surf scores those angles
  as safe. When the enemy hits more often than its profile says, the movement changes
  flavour at the next wave. And the core never lets a slow tick become a skipped turn: it
  sheds work first, tick by tick, and for the rest of a round once a turn has been skipped.

  @MOVE-1
  Scenario: Our bullet flying at the enemy shadows the wave it crosses
    Given Hadur in a duel, 300 px from the enemy
    When Hadur fires at the enemy as the enemy fires at Hadur
    Then the enemy's wave carries a bullet shadow

  @MOVE-1 @TIME-1
  Scenario: Shadows are computed once, not every tick
    Given Hadur in a duel, 300 px from the enemy
    When Hadur fires at the enemy as the enemy fires at Hadur
    And a few more ticks pass with no bullet fired or gone
    Then the wave's shadows were not computed again

  @MOVE-1
  Scenario: A shadowed part of a wave is no danger
    Given an enemy wave whose middle fifth our bullet shadows
    Then a robot sitting in the middle of it is in no danger from it
    And a robot at its edge is in full danger from it

  @TIME-1
  Scenario: A slow tick sheds a level for the next tick only
    Given Hadur in a duel, 300 px from the enemy
    When a tick takes 2.4 ms of its 3 ms allowance
    Then the computation level is 1
    When a tick takes 0.5 ms of its 3 ms allowance
    Then the computation level is 0

  @TIME-2
  Scenario: A skipped turn sheds a level for the rest of the round
    Given Hadur in a duel, 300 px from the enemy
    When the engine skips a turn
    And a tick takes 0.5 ms of its 3 ms allowance
    Then the computation level is 1
    When the round ends
    Then the round record says computation level 1
    When the next round starts
    Then the computation level is 0

  @RES-9
  Scenario: Three skipped turns put the rest of the round in duress
    Given Hadur in a duel, 300 px from the enemy
    When the engine skips a turn
    And the engine skips a turn
    And the engine skips a turn
    And Hadur plays 10 ticks with a cool gun
    Then 10 ticks of the round ran in duress
    And every one of them fired at power 1.0 head-on
    When the next round starts
    And Hadur plays 1 ticks with a cool gun
    Then 0 ticks of the round ran in duress

  @MOVE-2 @DIAL-1
  Scenario: A gun hitting well above its profile's rate changes the movement's flavour
    Given a profile that saw the enemy hit 10% of 2000 waves
    When the enemy hits 4 in 10 of its next 50 waves
    Then the movement has added the flattener
    When the enemy hits 4 in 10 of its next 40 waves
    Then the movement has added go-to surfing

  @MOVE-2
  Scenario: A gun hitting at its profile's rate changes nothing
    Given a profile that saw the enemy hit 10% of 2000 waves
    When the enemy hits 1 in 10 of its next 300 waves
    Then the movement is as the opening set it
