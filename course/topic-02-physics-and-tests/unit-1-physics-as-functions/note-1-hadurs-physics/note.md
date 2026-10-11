# Hadur's version: physics

Read this after the talk. It walks through the two physics classes in Hadur's core and the tests that pin them to the engine.

Both classes are older than any single stage, so the links use the 3.5.1 commit, `a9ee021`.

## Angles

[`Angles`](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/hadur-core/src/main/java/hadur2/core/physics/Angles.java) is 50 lines and has two methods: `normalAbsoluteAngle` and `normalRelativeAngle`. The class comment gives the convention used all through the core: radians, 0 is north, angles grow clockwise.

Read the comment inside `normalAbsoluteAngle` about `%`. It is the one Java trap in the file.

## Rules

[`Rules`](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/hadur-core/src/main/java/hadur2/core/physics/Rules.java) holds the engine's constants and formulas: acceleration, top speed, turn rates, bullet speed, damage, the hit bonus, wall damage and gun heat. Each has a Javadoc line with the formula and the unit.

Two things to notice:

- The constants are `public static final`, so they cannot change and need no object.
- The class comment says turn rates are in degrees while the rest of the core uses radians. `getTurnRateRadians` converts. Mixing units is a classic source of bugs, so the comment says it out loud.

The energy formulas are used by `ledger.EnergyLedger`, which Topic 09 covers.

## The maximum escape angle

It is not in `Rules`. It lives where it is used, in [`Wave`](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/hadur-core/src/main/java/hadur2/core/model/Wave.java), as `Math.asin(8.0 / bulletSpeed)`. Search the file for `maxEscapeAngle` and read how the guess factor divides by it.

## The tests

| Test | What it shows |
|---|---|
| [`PhysicsMatchesEngineProperties`](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/hadur-core/src/test/java/hadur2/core/physics/PhysicsMatchesEngineProperties.java) | jqwik properties and examples. Every formula and constant equals `robocode.Rules` or `robocode.util.Utils`, with no tolerance |
| [`WallStopTest`](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/hadur-core/src/test/java/hadur2/core/physics/WallStopTest.java) | three plain JUnit 5 tests of a predicted robot meeting a wall, using a tolerance of `1e-9` |

The two files show the two ways to compare doubles. When the same formula is written twice, demand equality. When a result is computed through many steps, allow a tolerance.

The class comment of the properties file also explains that the engine API is a test-only dependency of `hadur-core`. The core never imports it, but the tests may. That is how the build compares the copy with the original.

## Try it

Run one class from the repository root:

```sh
mvn -B -pl hadur-core test -Dtest=PhysicsMatchesEngineProperties
```
