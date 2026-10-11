Feature: Posture gate and the role resolver
  Hadur stays a duellist. Melee is a second posture the core takes only while two or more
  opponents are alive, no sentry is on the field or has been scanned this round, and the
  melee subsystems have not failed this round; otherwise the duel drives, the same tick.

  @GATE-2
  Scenario: A 1v1 battle is a duel on every tick
    Given a core in a 1000 by 1000 battle against 1 opponent
    When it plays 20 ticks scanning every opponent
    Then the duel drove every tick

  @ROLE-3 @GATE-2
  Scenario: A 3-robot melee is melee until one opponent is left
    Given a core in a 1000 by 1000 battle against 2 opponents
    When it plays 20 ticks scanning every opponent
    Then melee drove every tick
    When opponent 2 dies
    And it plays 5 ticks scanning every opponent
    Then the duel drove the last 5 ticks
    And the duel fights "opp1"

  @ROLE-3
  Scenario: A 10-robot melee is melee on every tick
    Given a core in a 1000 by 1000 battle against 9 opponents
    When it plays 30 ticks scanning every opponent
    Then melee drove every tick

  @ROLE-3 @GATE-3 @GATE-5
  Scenario: A 10-robot battle with a border sentry is a duel against the closest opponent
    Given a core in a 1000 by 1000 battle against 9 opponents
    And a border sentry guarding 100 px
    When it plays 30 ticks scanning every opponent and the sentry
    Then the duel drove every tick
    And the duel fights "opp1"
    And the sentry is never tracked as an opponent
    And no order takes Hadur into the sentry border

  @GATE-3 @GATE-5
  Scenario: A sentry scanned mid-round vetoes melee for the rest of that round
    Given a core in a 1000 by 1000 battle against 4 opponents
    When it plays 10 ticks scanning every opponent
    And the radar sees a sentry
    And it plays 10 ticks scanning every opponent
    Then melee drove the first 10 ticks
    And the duel drove the last 11 ticks
    And the round's veto is "sentry"
    When the next melee round starts
    And it plays 5 ticks scanning every opponent
    Then melee drove the last 5 ticks

  @GATE-4
  Scenario: A melee fault hands the rest of the round to the duel
    Given a core in a 1000 by 1000 battle against 4 opponents whose melee throws on tick 6
    When it plays 15 ticks scanning every opponent
    Then melee drove the first 5 ticks
    And the duel drove the last 10 ticks
    And a melee fault was recorded
    And the round's veto is "fault"

  @ROLE-3 @GATE-4
  Scenario: The round record counts the postures
    Given a core in a 1000 by 1000 battle against 4 opponents whose melee throws on tick 6
    When it plays 15 ticks scanning every opponent
    And the melee round ends
    Then the M record reads 5 melee ticks, 10 focused-duel ticks, veto "fault" and 1 fault

  @ROLE-1
  Scenario: The battle's facts fix its charter before the first tick
    Given a core in a 1000 by 1000 battle against 9 opponents
    Then the battle's charter is "MELEE"
    Given a core in a 800 by 600 battle against 1 opponent
    Then the battle's charter is "DUEL"

  @ROLE-2 @ROLE-4
  Scenario: Once the duel has driven, a sentry that dies unscanned leaves the round to the duel
    Given a core in a 1000 by 1000 battle against 4 opponents
    And a border sentry guarding 100 px
    When it plays 5 ticks scanning every opponent
    Then the duel drove every tick
    When the sentry dies unscanned
    And it plays 5 ticks scanning every opponent
    Then the duel drove the last 5 ticks
    And the round's ROLE records name "DUEL"

  @ROLE-4
  Scenario: The role steps down once when the melee ends, and never back up
    Given a core in a 1000 by 1000 battle against 2 opponents
    When it plays 5 ticks scanning every opponent
    And opponent 2 dies
    And it plays 5 ticks scanning every opponent
    Then the duel drove the last 5 ticks
    And the round's ROLE records name "MELEE DUEL"
