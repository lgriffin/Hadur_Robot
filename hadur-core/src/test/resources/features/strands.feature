Feature: One identity, three strands
  The architecture evolution's guardrails. Every package of the core has one owner (the
  kernel, the Duel, Melee or Team strand, or the conductor), the owners are layered, each
  owner's sources are pinned, and a recorded battle of every kind replays whole: orders,
  telemetry and the files it leaves in the store.

  @STRAND-1
  Scenario: Every package of the core has exactly one owner
    Given the ownership map
    Then every package of the core has exactly one owner

  @STRAND-2
  Scenario: The kernel sits under the strands, and the strands stay apart
    Given the ownership map
    Then no strand depends on another strand or on the conductor
    And the kernel depends on no strand and not on the conductor

  @STRAND-3
  Scenario: Each owner's sources are pinned
    Given the ownership map
    Then every owner's sources match its pin

  @STRAND-4
  Scenario Outline: A recorded battle replays whole
    Given the recorded battle "<fixture>"
    When it is replayed with its store and the adapter's memory calls
    Then the replay issues exactly the orders the live robot issued
    And its telemetry matches the fixture's snapshot
    And it leaves the files the live robot left

    Examples:
      | fixture               |
      | abc.Shadow_3.83c      |
      | warm-abc.Shadow_3.83c |
      | duress-sample.Walls   |
      | melee-samples         |
      | melee-sentry          |
      | melee-handoff         |

  @ROLE-5
  Scenario: The melee brain hears a duel's scans, and a sentry is offered to no role
    Given a core in a 1000 by 1000 battle against 1 opponent
    And a border sentry guarding 100 px
    When it plays 10 ticks scanning every opponent and the sentry
    Then the duel drove every tick
    And the melee brain tracks "opp1"
    And the duel fights "opp1" and the melee brain never saw the sentry

  @WEAVE-3
  Scenario: The driving role shoots only with the conductor's permission
    Given a core in a 1000 by 1000 battle against 1 opponent
    When it plays 40 ticks scanning every opponent
    Then some order fires

  @WEAVE-3
  Scenario: Without the fire permission no shot leaves, in a duel or a melee
    Given a core in a 1000 by 1000 battle against 3 opponents
    And the conductor withholds the fire permission
    When it plays 40 ticks scanning every opponent
    Then melee drove every tick
    And no order fires
    When opponent 2 dies
    And opponent 3 dies
    And it plays 40 ticks scanning every opponent
    Then no order fires
