Feature: Bullet shielding
  A bullet shielder sits still, so every gun fires head-on at it and it can shoot the
  bullet down. Hadur notices from how its bullets end, then moves each shot's aim by an
  amount the shielder can't predict but that still lands on the shielder's body.

  Background:
    Given a duel against an enemy sitting still 400 px due east

  @SHIELD-1 @SHIELD-2
  Scenario: Bullets shot down one after another switch on the aim offset
    When 4 of our bullets are shot down
    And the enemy is scanned again with the gun still hot
    Then the aim is off the head-on line by 15% to 50% of the enemy's angular half-width
    And the round statistics count 4 bullets shot down

  @SHIELD-1
  Scenario: A bullet shot down by accident changes nothing
    When 1 of our bullets is shot down among 19 misses
    And the enemy is scanned again with the gun still hot
    Then the gun aims head-on

  @SHIELD-2
  Scenario: The shot aimed before the shield was found is held back
    When 4 of our bullets are shot down
    And the enemy is scanned again with the gun cool and on target
    Then no shot is fired
    And the aim is off the head-on line by 15% to 50% of the enemy's angular half-width

  @SHIELD-1
  Scenario: Bullets fired in a melee are no evidence about the duel that follows
    Given a melee in which we have fired 4 bullets
    When the last other opponent dies
    And 4 of our bullets are shot down
    And the enemy is scanned again with the gun still hot
    Then the gun aims head-on

  @SHIELD-2
  Scenario: The offset holds until the shot goes out
    When 4 of our bullets are shot down
    And the enemy is scanned again with the gun still hot
    And the enemy is scanned again with the gun still hot
    Then both aims carry the same offset
