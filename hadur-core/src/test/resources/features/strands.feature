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
