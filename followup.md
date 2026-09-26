# Testing Follow-up Items

This document tracks known gaps in the test suite.

## Current state

`mvn test` runs the JUnit unit tests under `src/test/java/hadur117/melee/` and the
Cucumber scenarios in `08_melee_strategy.feature` (step definitions in
`src/test/java/hadur117/steps/MeleeSteps.java`). All pass.

The melee subsystems (`hadur117.melee`) hold no reference to the robot, so the whole
melee decision loop is tested offline through `MeleeController.tick()`. Radar coverage
is checked with a small radar simulation (`RadarSim`) that applies the real 45°/tick
radar limit.

## Feature files without step definitions

The v2.0 Diamond rebuild removed the old architecture (`Brain`, `Gun`, `WaveSurfer`,
`Radar`, ...) together with its tests. Features 01–07 still describe that architecture
(for example the 5-gun virtual array and 7-type movement classifier), so they are not
run: `junit-platform.properties` points Cucumber at the melee feature only. Each needs
to be rewritten against the v2.0 duel code (DV+KDE gun, KnnView danger, SurfMover)
before it gets step definitions.

## Duel code

The v2.0 duel classes (`gun/`, `move/`, `utils/`) have no unit tests yet.

## Battle simulation

Battles against the Robocode sample bots were run headlessly with the Robocode 1.9.5.6
engine (`robocode.control.RobocodeEngine`, run with `-DNOSECURITY=true` and the
`--add-opens` flags Java 17+ needs). This is not yet part of the build.
