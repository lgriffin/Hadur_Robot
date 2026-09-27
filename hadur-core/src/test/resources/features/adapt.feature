Feature: Recognise and adapt
  The first scan loads the opponent's profile, and the opening book turns its tiers into the
  battle's opening: which gun aims first, which danger views are on, and seeds for the KNN
  views that count for less than what this battle shows. A profile too thin to trust opens
  as a stranger would, and a seed the opponent no longer matches fades out.

  @ADAPT-1
  Scenario: A wave surfer's profile opens on the anti-surfer gun
    Given a stored profile of "abc.Shadow 3.83c" with their hit rate 5%, main rating 12% and anti-surfer rating 20%
    When Hadur first scans "abc.Shadow 3.83c"
    Then the profile's tiers are "T2/M2"
    And the opening gun is "anti_surfer"

  @ADAPT-1
  Scenario: A predictable mover's profile opens on the main gun
    Given a stored profile of "sample.Walls" with their hit rate 0.5%, main rating 40% and anti-surfer rating 45%
    When Hadur first scans "sample.Walls"
    Then the profile's tiers are "T0/M0"
    And the opening gun is "main"

  @ADAPT-2
  Scenario: A top gun's profile turns the flattener on before the first wave
    Given a stored profile of "abc.Shadow 3.83c" with their hit rate 9%, main rating 20% and anti-surfer rating 19%
    When Hadur first scans "abc.Shadow 3.83c"
    Then the profile's tiers are "T3/M1"
    And the danger views on include "flattener" and "flattener2"

  @ADAPT-2 @DIAL-1
  Scenario: A stranger's surf starts with only the simple view
    Given no profile is stored
    When Hadur first scans "abc.Shadow 3.83c"
    Then the danger views on are only "simple"
    And the opening gun is "live"

  @ADAPT-3
  Scenario: Seeds are replayed over the first ticks at half a live sample's weight
    Given a stored profile of "abc.Shadow 3.83c" with their hit rate 9%, main rating 20% and anti-surfer rating 19%
    And the stored profile holds 600 gun samples and 300 surf samples
    When Hadur first scans "abc.Shadow 3.83c"
    Then the seeds are still loading
    And no more than 50 seed samples went in on that tick
    When 20 more ticks pass
    Then the seeds are loaded
    And both seeds weigh 0.5

  @DIAL-1
  Scenario: A profile too thin to name a tier opens as a stranger would
    Given a stored profile of "abc.Shadow 3.83c" from 40 waves with their hit rate 20%
    When Hadur first scans "abc.Shadow 3.83c"
    Then the profile's tiers are "T?/M?"
    And the opening gun is "live"
    And the danger views on are only "simple"

  @DIAL-2
  Scenario: The opening does not depend on when the first scan comes
    Given a stored profile of "abc.Shadow 3.83c" with their hit rate 9%, main rating 12% and anti-surfer rating 20%
    When Hadur first scans "abc.Shadow 3.83c"
    And another battle's first scan of "abc.Shadow 3.83c" comes in round 7 at tick 900
    Then both battles open the same way

  @RES-4
  Scenario: A seed the opponent no longer matches fades to nothing within 20 waves
    The profile says their gun hits 30%; this battle it hits nothing. Once the live rate is
    certain enough to judge, the surf seed loses a twentieth of its weight a wave.
    Given a stored profile of "abc.Shadow 3.83c" with their hit rate 30%, main rating 20% and anti-surfer rating 19%
    And the stored profile holds 100 gun samples and 100 surf samples
    When Hadur first scans "abc.Shadow 3.83c"
    And the enemy fires 100 bullets at Hadur and none hits
    Then the surf seed's weight fell to 0 within 20 waves of first falling
    And the surf prior was handed back to live data
