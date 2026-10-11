# Lab 09: the energy ledger

Changed from lab 08:

- `hadurling.core.ledger.EnergyLedger`: for each interval between two scans of the enemy it
  takes out our bullet hits (`ourBulletHit`), the energy the enemy gained by hitting us
  (`enemyBulletHitUs`, 3 times the power) and wall damage (inferred from a stop that braking
  cannot explain). What is left is the shot. A corrected drop outside 0.1 to 3.0 is no shot.
- `Core` uses the ledger instead of lab 08's "any drop between 0.1 and 3.0 is a shot" rule.
  `enemyWaves()` is now public so scenarios can read it.
- `EnergyLedgerTest` (written first, test-first style) and `EnergyLedgerProperties`: a jqwik
  generator builds a run of up to 25 intervals that mix shots, our hits, their hits and wall
  hits, and requires the ledger to recover each shot's power to within 1e-9.
- Requirements: `HL-13` is reworded (the core now follows the ledger, not the raw drop) and
  `HL-14` to `HL-16` are new. Two Cucumber scenarios in `features/hadurling.feature` cover
  the integration.
- `ArchitectureTest`: the ledger depends only on `physics` and `model`, and nothing but the
  core depends on the ledger.
- **Play changed on purpose, so the replay fixture was regenerated.** `ScriptedBattle` moved
  the enemy's hit on us to tick 26 so that the surfer has a history, and with it the ledger no
  longer sees our own hit at tick 38 as an enemy shot. The one order that changes is the
  direction of travel after that tick. Regenerate with the command in lab 08's README.

Lab 10 starts here.
