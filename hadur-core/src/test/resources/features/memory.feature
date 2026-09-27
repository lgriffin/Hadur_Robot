Feature: Opponent memory
  Hadur keeps one profile per opponent lineage between battles. The first scan loads it,
  each round folds into it, and the battle's end saves it, crash-safe and within the data
  quota. A profile that can't be read makes the opponent a stranger, never a crash.

  @MEM-1
  Scenario: The first scan of a battle loads the lineage's profile
    Given a store holding a profile of "abc.Shadow 3.83c" from battle 7
    When a battle starts and the first scan names "abc.Shadow 3.84 (1)"
    Then the profile for "abc.Shadow" is loaded before that tick's orders
    And it is stamped as fought in battle 8 and has 2 battles
    And the B record says a profile was found

  @MEM-2
  Scenario: A round's end folds that round into the profile
    Given a store with no profiles
    When a battle starts and the first scan names "sample.Crazy"
    And the enemy is scanned 20 times and fires 3 shots, 1 of which hits us
    And the round ends in a win
    Then the profile holds 1 round, 20 scans, 3 enemy shots and 1 hit on us
    And the battle's outcome so far is 1 win in 1 round

  @MEM-3
  Scenario: The battle's end persists the profile within the quota
    Given a store with no profiles
    When a battle starts and the first scan names "sample.Crazy"
    And the round ends in a win
    And the battle ends
    Then the store holds a profile of "sample.Crazy" with 1 round
    And no temporary copy is left
    And the store is within its quota

  @MEM-4
  Scenario: A damaged profile makes the opponent a stranger
    Given a store holding a profile of "abc.Shadow 3.83c" from battle 7
    And the stored profile of "abc.Shadow" is damaged
    When a battle starts and the first scan names "abc.Shadow 3.83c"
    Then the opponent is treated as a stranger
    And a load failure is recorded in a MEM record

  @MEM-5
  Scenario: Near the quota, the least recently fought profiles lose their seeds first
    Given a nearly full store with seeded profiles fought in battles 1, 2 and 3
    When a seeded profile from battle 4 is saved
    Then the profile from battle 1 has no seeds but keeps its stats
    And the profile from battle 3 keeps its seeds
    And the store is at most 90% full

  @RES-3
  Scenario Outline: A save killed part way leaves a loadable profile
    Given a store holding a profile of "abc.Shadow 3.83c" from battle 7
    When a newer profile's save is killed <where>
    Then the next battle loads a profile of "abc.Shadow" without a failure

    Examples:
      | where                                       |
      | at the first byte of the temporary copy     |
      | half way through the temporary copy         |
      | half way through the profile                |
      | at the last byte of the profile             |
