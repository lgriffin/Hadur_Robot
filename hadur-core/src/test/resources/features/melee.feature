Feature: Melee
  In a free-for-all (the MeleeRumble runs ten robots) Hadur sweeps its radar over every
  opponent, moves to the least risky spot, and shoots the easiest kill with a cheap
  circular gun. Once one opponent is left, the duel machinery takes over.

  Background:
    Given a core in an 800 by 600 battle against 3 opponents

  @MELEE-1
  Scenario: With two or more opponents alive the melee brain drives
    When it scans opponents at bearings 0, 120 and 240 degrees, 300 px away
    Then it keeps sweeping the radar
    And it drives toward a destination

  @MELEE-1 @MELEE-6
  Scenario: A fresh target is shot at
    When it scans opponents at bearings 0, 120 and 240 degrees, 300 px away, every tick for 5 ticks
    Then it fires within those ticks
    And no shot is heavier than 3

  @MELEE-7
  Scenario: A target not scanned for more than 5 ticks is not shot at
    When it scans opponents at bearings 0, 120 and 240 degrees, 300 px away
    And 10 melee ticks pass without a scan
    Then it does not fire after the first 6 ticks

  @MELEE-2
  Scenario: The last opponent standing gets the duel treatment
    When it scans opponents at bearings 0, 120 and 240 degrees, 300 px away
    And two opponents die
    And the survivor is scanned at bearing 0 degrees, 300 px away
    Then it restores full speed
    And it locks the radar onto the survivor

  @MELEE-1
  Scenario: A duel from the start never runs the melee brain
    Given a core in an 800 by 600 battle against 1 opponent
    When the survivor is scanned at bearing 0 degrees, 300 px away
    Then it locks the radar onto the survivor
