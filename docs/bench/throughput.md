# Bench throughput (2026-10-23)

Leigh asked why the bench averages about 12 battles a minute when a minimised rumble client runs
10 battles in seconds. The full read, with every measurement, is the artifact
https://claude.ai/artifact/7bWonLGQsi7obMGXHXtQEP. This page keeps the findings, the two changes
they led to, and the PC card that measures the rest.

## Findings

- **Headless is already at full speed.** In Robocode 1.11.1, `BaseBattle.synchronizeTPS()` sleeps
  to hold the desired TPS only while `isManagedTPS()` is true, which only the GUI sets, and only
  while its window is visible. The bench has no window.
- **The gap is the pairings.** Two light rumble bots (vort.Chaser vs SpinBot) run 35 rounds in
  about 1.6 s: rounds of about 360 ticks at 0.10 to 0.16 ms a tick. Hadur against DrussGT runs
  2,600 to 3,100 ticks a round at 1.0 to 1.1 ms a tick, so 95 to 140 s in the cloud. Every bench
  battle has Hadur in it. The rumble client meets Hadur about once in 650 battles.
- **The engine runs one robot at a time** (`Battle.wakeupSerial`), so one battle uses about one
  core, plus a second for the JIT. Robot classes reload every battle, so the JIT recompiles
  (about 15 s of CPU) in every battle, even in a reused JVM. Measured: a duel battle uses about
  1.25 cores and a team battle about 1.95.
- **Bench overheads** on top of the robots: a fresh JVM per battle (about 1.5 s, about 3 s in all
  against a reused JVM); the per-tick truth log (+7 to 12% a tick on strong pairings, 5.6 MB a
  battle); GC (about 4%).
- **The PC** (Threadripper PRO 9965WX, 24 cores, 48 threads) ran team-s1 at 8 workers (about 16
  busy cores) with a RoboRumble client beside it. Duel queues run 12 workers. Stage 0 measured only
  *pinned* widths above 12, and pinning raised engine disables 4 to 10 times.

## Changes (BENCH-97, BENCH-98)

- `--truth-log false` (`bench-top20.sh --no-truth-log`) stops a duel battle writing
  `truth.log.gz`. Result rows and reports are unchanged: the enemy-shot counts that wave fidelity
  needs are still taken. Only the offline `data/tools` scripts (DrussGT forensics, movement maps,
  style lab) read the truth log, so keep it on for runs those scripts will read.
- `hadur-bench/tools/ladder.py` reads bench run folders and reports battles an hour, skipped
  turns a round, engine disables and truth-log disk a battle against a base run.

## PC card: worker ladder (`hadur-bench/plans/pc-ladder.queue`, about 1.75 h)

`./queue.sh run pc-ladder` (or `.\queue.ps1 run pc-ladder`) from master, with RoboRumble clients
at 0 and nothing else running on the PC.

| Block | What | Battles |
|---|---|---|
| d12, d16, d20, d24 | 208-bot Stage 0 panel, arms c (3.15) and aa (A/A), 1 seed, the same seed each block, truth log on | 416 each |
| d12x, d16x | the same at 12 and 16 workers with the truth log off | 416 each |
| t8, t12, t16 | 3.15aa against the 3.15 release on all 46 teams, 2 seeds | 184 each |

Every step resumes (BENCH-95, BENCH-96), so a stop throws no battles away. The `read` step writes
`docs/bench/local/2026-10-23_worker-ladder.md` (ladder.py) and `..._worker-ladder-arms.md`
(multiarm.py, A/A and c level per duel block). The `pr` step opens a PR from
`claude/pc-ladder-results`.

**Pick rule.** For each kind, use the widest block whose skipped turns a round stay within 15% of
its base (d12, t8), whose engine disables a 100 battles stay within 1 of the base's, and whose
battles an hour are at least the base's. The truth-off blocks (d12x, d16x) are left out of the width
pick, because they do less work a tick. The read compares each one with the truth-on block of the
same width. In
multiarm, the A/A must sit inside its interval in every duel block, and c's level must agree
across widths (the Stage 0 stop rule). Then set `--parallel` in later queues to that width. If
d12x is faster than d12 and its counts agree, add `--no-truth-log` to census and screen queues.

**Expected** (estimates, not measured): team +30 to 45% at 12 workers, duel +20 to 30% at 16,
and +8 to 10% more on strong panels with the truth log off.
