Feature: Melee
  In a free-for-all (the MeleeRumble runs ten robots) Hadur sweeps its radar over every
  opponent, moves to the least risky spot, and shoots the easiest kill with a cheap
  circular gun. Once one opponent is left, the duel machinery takes over.

  Background:
    Given a core in an 800 by 600 battle against 3 opponents

  @GATE-1
  Scenario: With two or more opponents alive the melee brain drives
    When it scans opponents at bearings 0, 120 and 240 degrees, 300 px away
    Then it keeps sweeping the radar
    And it drives toward a destination

  @GATE-1 @MGUN-3
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

  @GATE-2
  Scenario: A duel from the start never runs the melee brain
    Given a core in an 800 by 600 battle against 1 opponent
    When the survivor is scanned at bearing 0 degrees, 300 px away
    Then it locks the radar onto the survivor

  @MMEM-1
  Scenario: A melee round's end writes each opponent's melee block beside its profile
    Given a core with a profile store in an 800 by 600 battle against 3 opponents
    When it scans opponents at bearings 0, 120 and 240 degrees, 300 px away, every tick for 3 ticks
    And opponent A fires a bullet of power 2.0
    And the round ends and the robot saves its memory
    Then the store holds a melee block for each of A, B and C
    And A's block records 1 shot at power 2.0
    And the store holds no 1v1 profile

  @MMEM-2
  Scenario: The survivor's bullets in flight become the duel's waves
    Given a core with a profile store in an 800 by 600 battle against 3 opponents
    When it scans opponents at bearings 0, 120 and 240 degrees, 300 px away, every tick for 3 ticks
    And opponent A fires a bullet of power 2.0
    And two opponents die
    And the survivor is scanned at bearing 0 degrees, 300 px away
    Then the duel takes over 1 wave from the survivor
