Feature: Saor, a MicroMelee bot
  The behaviour of hadur117.micro.Saor, stated on its pure core. The shipped class is the core
  flattened by hand, held to it by the equivalence test (SAOR-15).

  @SAOR-1
  Scenario Outline: Every leg ends 25 px from an edge
    Given Saor is at <x>, <y> with its target 400 px away
    When it drives the leg on axis <axis>
    Then the point it drives to is 25 px from an edge
    And the point is in Saor's own corner

    Examples:
      | x   | y   | axis |
      | 120 | 140 | 0    |
      | 120 | 140 | 1    |
      | 880 | 130 | 0    |
      | 870 | 910 | 1    |

  @SAOR-3
  Scenario: A nearer robot is adopted and kept until a nearer one appears
    Given Saor's target is 400 px away
    Then a robot scanned at 300 px is adopted
    And a robot scanned at 500 px is not
    And the target itself is kept at 900 px

  @SAOR-4
  Scenario: A death frees the target and the radar
    Given Saor's target is 100 px away
    When a robot dies
    Then a robot scanned at 1200 px is adopted
    And the radar is set spinning

  @SAOR-5
  Scenario: The radar is held only while the gun is about to fire
    Then the radar is held at gun heat 0.9
    And the radar is not held at gun heat 1.0

  @SAOR-6
  Scenario: A cold row aims by circular projection
    Given a target at full speed turning at the engine's limit, its row holding 7 samples of a stop
    When Saor aims at it 400 px away with power 2
    Then the aim is the circular projection of its scan

  @SAOR-7
  Scenario: A warm row is played out
    Given a target at full speed turning at the engine's limit, its row holding 8 samples of a stop
    When Saor aims at it 400 px away with power 2
    Then the aim is where it was scanned

  @SAOR-8
  Scenario Outline: Power by range, capped in the end game
    The cap is others / 3 + 1.9: 1.9 below three opponents, 2.9 from three to five, and above
    3 from six, where the engine's own limit of 3 applies.

    Then with 100 energy at <distance> px and <others> opponents left the power is <power>

    Examples:
      | distance | others | power |
      | 650      | 9      | 1.0   |
      | 100      | 9      | 4.9   |
      | 100      | 6      | 3.9   |
      | 100      | 4      | 2.9   |
      | 100      | 2      | 1.9   |
      | 100      | 1      | 1.9   |

  @SAOR-9
  Scenario: A collision shortens the leg to 50 px
    Then the leg is 50 px after a collision
    And no robot scanned is nearer than the rammer's mark

  @SAOR-10
  Scenario: The gun fires only once it is on its aim
    Then the gun fires with 0 gun turn left
    And the gun holds fire with 0.01 gun turn left
