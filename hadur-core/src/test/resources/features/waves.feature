Feature: Enemy waves
  Hadur infers each enemy shot from the drop in the enemy's energy. The energy ledger
  takes out every drop that was not a bullet, so movement only dodges waves that exist.

  Background:
    Given a core that has scanned the enemy at 100 energy

  @WAVE-1
  Scenario: A plain energy drop is a shot
    When the next scan shows the enemy at 98.1 energy
    Then one enemy wave of power 1.9 is recorded
    And no phantom wave is counted

  @WAVE-1
  Scenario: Damage from our own bullet is not a shot
    When our 0.5 power bullet hits the enemy
    And the next scan shows the enemy at 98 energy
    Then no enemy wave is recorded
    And 1 phantom wave is counted

  @WAVE-1
  Scenario: A shot hidden by the enemy's hit refund is still found
    When an enemy 2.0 power bullet hits us
    And the next scan shows the enemy at 103 energy
    Then one enemy wave of power 3.0 is recorded

  @WAVE-1
  Scenario: Hitting a wall is not a shot
    When the next scan shows the enemy stopped against the left wall at 97 energy
    Then no enemy wave is recorded
    And 1 phantom wave is counted

  @WAVE-1 @RADAR-1
  Scenario: A shot seen after missed scans is surfed from the last scan before the gap
    When 2 ticks pass without a scan
    And the next scan shows the enemy at 98 energy
    Then one enemy wave of power 2.0 is recorded
    And that wave was fired on tick 1, the last scan before the gap

  @WAVE-2
  Scenario Outline: Only drops a bullet could cost become waves
    When the next scan shows the enemy at <energy> energy
    Then <waves> enemy waves are recorded

    Examples:
      | energy | waves |
      | 99.95  | 0     |
      | 99.9   | 1     |
      | 97     | 1     |
      | 96.9   | 0     |
      | 84     | 0     |

  @RADAR-1
  Scenario: The radar finds the enemy again after a missed scan
    When 3 ticks pass without a scan
    Then the radar sweeps toward the enemy's last bearing on the last 2 of them
    And the round statistics count 2 reacquire ticks
