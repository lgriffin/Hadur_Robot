# Lab 03: values and the tick

Changed from lab 02:

- New package `hadurling.model` with three immutable values: `Input` (a snapshot of one
  tick), `Event` (a closed hierarchy: `Scan`, `HitByBullet`, `BulletHit`, `HitWall`,
  `RobotDeath`) and `Orders` (where `NaN` means "leave it as it was").
- `Brain` holds all the decisions: `Orders think(Input)`. It does not import Robocode.
- `Hadurling` is now only an adapter: engine events become `Event`s, getters become an
  `Input`, and the `Orders` that come back are applied with setters.
- `ModelTest` (copies, immutability, equality, NaN) and `BrainTest` (no engine needed).

Lab 04 starts here.
