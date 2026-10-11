# Lab 00: the skeleton

The starting point for the course robot. `hadurling.Hadurling` extends `AdvancedRobot` and
spins its radar; nothing else.

```
mvn -B verify
```

builds `target/hadurling.Hadurling_0.1.jar`. Copy that jar into Robocode's `robots` folder
(or add `target` to Robocode's robot path) and the robot appears as `hadurling.Hadurling*`.

Lab 01 starts here.
