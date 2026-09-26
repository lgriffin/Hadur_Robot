# Follow-ups

Open items from the Hadur 2 stages, newest stage first.

## S2

- **Unseen shots.** A shot fired while Hadur is disabled, or just before a round ends,
  never shows in a scan. The bench counts unmatched shots from those moments apart
  ("Unseen"). Against Shadow, 33 other shots (0.3%) were missed; not yet examined.
- **Wall-hit inference is a heuristic.** A dead stop within 19 px of a wall that the enemy
  could not have braked into over the scan gap is taken as a wall hit. Energy alone cannot
  tell a wall struck at one speed plus a shot from a wall struck one speed step faster plus
  a shot 0.5 weaker, so such a shot's power can be 0.5 off; the ledger takes the speed
  nearest the scanned one that leaves a legal power, so the shot still becomes a wave.
  A wall hit during a scan gap, when the enemy could also have braked, is not inferred.
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
