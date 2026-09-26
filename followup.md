# Follow-ups

Open items from the Hadur 2 stages, newest stage first.

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
