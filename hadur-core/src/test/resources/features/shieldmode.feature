Feature: Shield mode and its list (D5)
  On the opponents of a list of Hadur's own, each round opens with Hadur sitting still and
  shooting the enemy's bullets down. Anyone else is fought as before. The mode is left for
  the round on its safety exits and for the battle once the enemy's bullet damage would hold
  Hadur's score share below 85%.

  @SHIELD-5
  Scenario: A listed opponent's round opens in shield mode
    Given a duel against "list.Target 1.0" and a shield list naming "list.Target"
    When the enemy is scanned 400 px due east
    Then the telemetry says shield mode is on in round 0
    And the robot holds still and holds fire

  @SHIELD-5
  Scenario: An opponent not on the list is fought exactly as without a list
    Given a duel against "other.Robot 1.0" and a shield list naming "list.Target"
    When the enemy is scanned 400 px due east for 40 ticks
    Then the telemetry holds no shield record
    And every order is the one a core without the list gives

  @SHIELD-5
  Scenario: An empty list changes nothing
    Given a duel against "list.Target 1.0" and an empty shield list
    When the enemy is scanned 400 px due east for 40 ticks
    Then the telemetry holds no shield record
    And every order is the one a core without the list gives

  @SHIELD-5
  Scenario: A melee never has shield mode, whoever is on the list
    Given a melee against "list.Target 1.0" and a second opponent, and a shield list naming "list.Target"
    When both are scanned for 40 ticks
    Then the telemetry holds no shield record

  @SHIELD-5
  Scenario: A rammer ends shield mode for the round and the next round opens in it again
    Given a duel against "list.Target 1.0" and a shield list naming "list.Target"
    When the enemy is scanned 80 px due east
    Then the telemetry says shield mode was left in round 0 because "close"
    When the next round starts and the enemy is scanned 400 px due east
    Then the telemetry says shield mode is on in round 1

  @SHIELD-6
  Scenario: Damage past what holds the share at 85% ends shield mode for the battle
    Given a duel against "list.Target 1.0" and a shield list naming "list.Target"
    When the enemy is scanned 400 px due east
    And 2 enemy bullets of power 1.95 hit us
    Then the telemetry says shield mode is off for the battle because "budget"
    When the next round starts and the enemy is scanned 400 px due east
    Then the telemetry holds no shield record for round 1

  @SHIELD-6
  Scenario: Rounds won raise the limit
    Given a duel against "list.Target 1.0" and a shield list naming "list.Target"
    And 5 rounds won against it
    When the enemy is scanned 400 px due east
    And 3 enemy bullets of power 3.0 hit us
    Then the telemetry holds no budget exit
