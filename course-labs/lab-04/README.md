# Lab 04: the hexagon

Changed from lab 03: the project is now a parent pom with two modules.

- `hadurling-core` has **no Robocode in its main code**. Packages: `hadurling.core` (`Core`,
  `Guard`), `.model`, `.physics`, `.gun` (`HeadOnGun`), `.move` (`Orbit`), `.port`
  (`Telemetry`). `Brain` became `Core`; the gun and the movement were pulled out of it.
- `Guard` wraps the core: if the core throws or returns null, the robot still gets safe
  orders, and one `FAULT` line per round goes to the `Telemetry` port.
- `hadurling-robot` is the adapter (`Hadurling`) plus the `.properties` file; its jar has the
  core shaded in, because Robocode loads one jar per robot.
- Tests: `GuardTest` (a core that fails on purpose), `CoreTest`, `RobotPropertiesTest`, and the
  lab 02/03 tests moved into the core module.

Lab 05 starts here. Build everything from this folder with `mvn -B verify`; the robot jar is
`hadurling-robot/target/hadurling.Hadurling_0.1.jar`.
