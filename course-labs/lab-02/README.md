# Lab 02: physics as pure functions, and a first test

Changed from lab 01:

- New package `hadurling.physics`: `Angles` (normal absolute and relative angle, absolute
  bearing), `Rules` (bullet speed, damage, maximum escape angle) and `Field` (walls, distance
  to the nearest wall). All static or immutable, no engine types.
- `Hadurling` calls `Angles` instead of `robocode.util.Utils`.
- JUnit 5 tests for each class, and `AnglesMatchEngineProperties`, a jqwik property that our
  angles and rules equal the engine's for thousands of random inputs.
- jqwik 1.9.2 added to the pom. Surefire already includes classes ending in `Properties`.

Lab 03 starts here.
