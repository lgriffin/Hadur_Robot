Feature: Radar System
  As Hadur, the god of war
  I need perfect battlefield awareness
  So that I never lose sight of my enemy

  Background:
    Given Hadur is deployed on a standard 800x600 battlefield
    And the radar is decoupled from the gun
    And the gun is decoupled from the body

  # --- Radar Lock Acquisition ---

  Scenario: Acquire initial radar lock on enemy
    Given the battle has just started
    And no enemy has been scanned yet
    When Hadur executes the first tick
    Then the radar should spin at maximum rotation rate
    And the radar should complete a full sweep within 8 ticks

  Scenario: Establish narrow lock after first scan
    Given an enemy has been scanned at bearing 45 degrees
    When Hadur processes the scan event
    Then the radar should turn to overshoot the enemy bearing by a factor of 2
    And the radar lock width should be less than 5 degrees

  # --- Radar Lock Maintenance ---

  Scenario: Maintain radar lock across consecutive ticks
    Given Hadur has an active radar lock on the enemy
    When 100 ticks elapse during normal combat
    Then the enemy should be scanned on every single tick
    And no tick should pass without a scan event

  Scenario: Recover radar lock after enemy teleportation
    Given Hadur has an active radar lock
    When the enemy moves rapidly and the scan is missed for 1 tick
    Then the radar should widen its sweep to re-acquire
    And the lock should be re-established within 3 ticks

  # --- Radar Independence ---

  Scenario: Radar operates independently of gun rotation
    Given Hadur is tracking an enemy at bearing 90 degrees
    And the gun is aiming at bearing 45 degrees
    When the gun rotates to track a predicted position
    Then the radar should maintain its own lock bearing
    And radar accuracy should not be affected by gun movement

  Scenario: Radar operates independently of body rotation
    Given Hadur is performing a wave-surfing manoeuvre
    And the body is turning rapidly
    When the body completes a 180 degree reversal
    Then the radar should maintain continuous lock
    And scan frequency should remain at 1 scan per tick
