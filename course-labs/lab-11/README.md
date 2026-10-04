# Lab 11: deciding under uncertainty

Changed from lab 10:

- `hadurling.core.policy.Estimate`: a rate with its 95% margin of error. The interval is
  **Agresti-Coull**: add two hits and two misses (`p = (h + 2) / (n + 4)`), then
  `margin = 1.96 * sqrt(p (1 - p) / (n + 4))`. Unlike the plain Wald interval it stays wide when
  every shot so far hit or missed. With no samples the rate is unknown and the margin is 1.
- `policy.HitWindow`: the last 100 shot outcomes in a ring buffer, and their `Estimate`.
  `HitWindowProperties` checks it against "keep the list and count the last N".
- `policy.Evidence`: this battle's two windows (our shots, their shots), kept by the robot
  across rounds and cleared when the opponent changes.
- `policy.PowerPolicy`: full power (3.0, at most a quarter of their energy) only when our
  hit rate is certainly above 20% and theirs certainly below 10%, by the interval and not the
  raw rate, and we have more than 12 energy. Otherwise the gun's own power.
- `policy.SeedTrust`: the profile's seed fades by a twentieth per wave while the live hit rate
  is certain (margin at most 0.10) and differs from the profile's by more than the wider
  margin. A test plays a full window to prove the rule can fire.
- `GuessFactorGun.aim` takes the power to fire; `seedWeight(double)` lets seeded samples count
  less, down to not at all.
- `Core(ProfileLibrary, Evidence)` wires them together; `Hadurling` keeps one `Evidence` per
  battle.
- Requirements `HL-25` to `HL-32`; `ArchitectureTest` makes `policy` a leaf that only the core
  uses.
- The replay fixture is unchanged: the scripted duel is too short for the evidence to become
  certain, so the new code never fires in it.

Lab 12 starts here.
