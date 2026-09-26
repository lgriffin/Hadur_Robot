# Follow-ups

Open items from the Hadur 2 stages, newest stage first.

## S2

- **Unseen shots.** A shot the enemy fires while Hadur is disabled, or its last shot that
  leaves it at 0 energy, never shows in a scan. The bench counts these apart ("Unseen");
  they cannot be dodged, so they are not a ledger gap.
- **Hidden shots are counted but not reported.** `RoundStats.hiddenShots` and
  `radarReacquired` stay out of the `R` record so its format is unchanged; add them when
  the record next changes (S3 adds profile fields).
- **Wall-hit inference is a heuristic.** A stop from above 2 px/tick within 19 px of a wall
  is taken as a wall hit. An enemy that brakes hard exactly at a wall in the same tick it
  fires would have its shot read 1-3 energy low; the Shadow diagnostic showed none.
- **The robot jar must be rebuilt, not reused.** The robot shade overwrites the plain jar,
  so the jar plugin now forces a rebuild each package; without it, a second `package`
  without `clean` produced a recorder jar with no recorder in it.

## S1

- **ProGuard dropped.** 1.x shrank the robot jar with ProGuard; 2.0 ships the shaded jar
  unshrunk (about 100 KB). Revisit if RoboRumble size matters.
- **The adapter has no unit tests of its own.** It is covered end to end instead: the replay
  fixtures are recorded from the adapter in the real engine, and the bench runs it. A fake
  `AdvancedRobot` harness could test `NaN` handling directly.
- **Replay fixtures pin behaviour.** Any change meant to alter Hadur's play must re-record
  them (see hadur-bench/README.md). Floating-point results come from `Math` functions,
  which HotSpot keeps consistent on one platform; if CI on another architecture disagrees,
  compare with a tolerance there.
- **Skipped turns remain**, and the first scan of a battle is slower than in 1.20, which
  sometimes delays that tick's orders by one turn (see docs/bench/s1-2.0-cold.md). The tick
  budget is S6 work; warming the core up at battle start would be the cheap fix.
