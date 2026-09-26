Feature: Hexagonal core
  The core holds all of Hadur's strategy and sees the engine only through BotInput and
  BotOrders, so it can be tested and replayed without Robocode.

  @CORE-1
  Scenario: The core does not depend on the engine
    Given the compiled core classes
    Then no core class depends on a class in "robocode"
    And the core's angle and rule helpers give the engine's answers

  @CORE-2
  Scenario Outline: A recorded battle replays exactly
    Given the recorded battle against "<opponent>"
    When it is replayed through a fresh core twice
    Then both replays issue exactly the orders the live robot issued

    Examples:
      | opponent         |
      | sample.SpinBot   |
      | sample.Tracker   |
      | sample.Crazy     |
      | sample.Walls     |
      | sample.RamFire   |
      | abc.Shadow_3.83c |
