Feature: RAM-3, the escape from a confirmed rammer is kept only where it pays

  RAM-2 (3.5) runs from a robot that has rammed Hadur in two rounds. Against pure rammers that
  won rounds back; against close-range fighters that 3.4 beat by standing its ground, running
  cost 6 to 28 points a pairing. RAM-3 tries the escape for two rounds and then plays, round by
  round, whichever way has ended its rounds with the better energy margin.

  @RAM-3
  Scenario: the rounds that confirm a rammer are fought, and the next two try the escape
    Given a duel against a robot that charges and rams Hadur every round
    When Hadur fights its first 2 rounds and wins them on 80 energy against 0
    And another round starts and the robot charges
    Then no round before round 2 played an arm
    And round 2 plays the escape
    And Hadur runs from the charge in round 2

  @RAM-3
  Scenario: a rammer that out-fights a standing Hadur keeps being escaped
    Given a duel against a robot that charges and rams Hadur every round
    When Hadur fights its first 2 rounds and wins them on 20 energy against 0
    And Hadur's next 2 rounds end in a win on 90 energy against 0
    And another round starts and the robot charges
    Then round 4 plays the escape
    And Hadur runs from the charge in round 4

  @RAM-3
  Scenario: a close-range fighter that Hadur beats standing is fought again after the trial
    Given a duel against a robot that charges and rams Hadur every round
    When Hadur fights its first 2 rounds and wins them on 85 energy against 0
    And Hadur's next 2 rounds end in a loss on 0 energy against 40
    And another round starts and the robot charges
    Then round 4 plays the fight
    And Hadur stands and fights the charge in round 4
