# Stage 0 defect hunt (pc-top5, 2026-10-22)

Read-only analysis of the pc-top5 run (Stage F and the five Stage 0 blocks u12, p12, p18, p22, p12b) after
the drift stop rule (plan 7.4) tripped: c's level fell 1.24 points from p12 to p12b while aa, hv and xw
moved 0.1 to 0.3. No battles were run, nothing was deleted and RoboRumble stayed at 0.
Per-disable rows: `2026-10-22_stage0-defect-disables.tsv` (519 rows, one per engine disable).

## Summary

1. **c is the jar it should be, installed like the other arms.** The c jar in every worker home is
   byte-identical to `bisect/hadur2.Hadur_3.14.jar` and to `../hadur-robot/target/hadur2.Hadur_3.14.jar`.
   No other Hadur build, extracted classes or stale robot.database entry is in the homes. Hadur's data
   directory is wiped before every arm's battle, so no arm inherits another's profile. Nothing in
   Bench treats the first arm differently once the battles start.
2. **c's drop is broad, not a few battles, and disables don't explain it.** c falls 1.24 ± 0.39 points
   (z = -3.2) over 208 paired battles. Its 15 largest drops account for -1.04 points, but none of them
   has more engine disables in p12b. On the 168 battles with no disable in either block, c still falls
   1.44 points, while aa, hv and xw move +0.04 to +0.11 on theirs. Drops and rises split 86 to 80, so
   it is a shift in size, not in count. It runs through bands 1-4 (-1.75 to -2.34) and 10 of 12 workers.
   I found no mechanism specific to c. c is also the most variable arm from block to block: its level
   SD across the five blocks is 0.46, against 0.20-0.24 for aa, hv and xw. Against the mean of the other
   three arms, c sits at -0.02, +0.55, -0.03, +0.57, -0.55 in u12, p12, p18, p22, p12b. p12 is as high
   as p12b is low.
3. **Every engine disable is the engine killing Hadur after its thread went at least 31 turns without
   calling execute** (Robocode 1.11.1 `RobotPeer.checkSkippedTurn`: MAX_SKIPPED_TURNS = 30, or 240 for
   an IO robot, then `punishBadBehavior`, which calls `kill()` and `setInactive()`). All 519 are the
   "has not performed any actions in a reasonable amount of time" kind. None is a FAULT-driven or
   start-up-only problem: 15 of the 253 costly ones fall in round 0, and 9 of the 519 have a
   ConcurrentModificationException FAULT, which is the thread being force-stopped, not the cause.
   - **Costly (253):** mid-round, Hadur alive (damage taken in the round at most 99, median 51), and
     the round is lost. The round ends 14-152 ticks after the disable (median 36). Hadur's own log
     stops a median of 122 ticks before the disable (p90 133), which is about 180 ms of thread
     stall at the pinned CPU constant.
   - **Harmless (266):** the disable comes after "wins the round". Firsts and the survival score are
     intact in every such battle (rounds survived x 50 equals the survival score in all of them).
4. **Pinning causes the costly disables, and they hit every arm alike.** Unpinned (u12) there is 1
   costly disable in 832 battles. Pinned, there are 3.8-13.0 per 100 battles per arm. Each costs the arm
   0.01-0.44 points in a block. c had the largest cost in p18 and p22, but at most 0.10 points more than
   the next arm, far below its 1.24-point p12-to-p12b drop, so the conclusion stands. c had fewer costly disables in
   p12b (15) than in p12 (19), so they run against its drop. This is a separate bench defect: under
   `--pin` (2 logical CPUs a worker, from processor 2) Hadur's thread is regularly starved for 30-280
   turns mid-round.

## 1. How c differs from the other arms

### Robots in a worker home (work/top5-s0-p12b/home-1/robots)

Besides the opponent and sample jars, the folder holds the 4 Hadur jars below, `robot.database` and
`.data/`. There is no `robots/hadur2` class folder and no other cache. At the end of the block,
`.data/hadur2/Hadur.data/` is empty because it is wiped before every battle. The main home
(`work/top5-s0-p12b/home/robots`) holds the same 4 Hadur jars.

| Jar (arm) | sha256 in home-1 and home | Same in bisect/ | Same in ../hadur-robot/target |
|---|---|---|---|
| hadur2.Hadur_3.14.jar (c) | 67a121ecb104c5dda647f140927620457b9eeae7713635300ad242c5921c9e48 | yes | yes |
| hadur2.Hadur_3.14aa.jar (aa) | 171f8c76f890633a2a70b1fd941e82854ba995b921d20df3532cf9aaa18f76a1 | yes | - |
| hadur2.Hadur_3.14hjswhcpkw2.jar (hv) | e214c64a955f0d56f3cb555b91d0401e37771746ce99f1d5a029815b4fc6700e | yes | - |
| hadur2.Hadur_3.14xw.jar (xw) | 905ace5d7044144c17ebcb6d58e4b99931013b92bc92c901319dd34351b98d4b | yes | - |

The other `bisect/hadur2.Hadur_3.14*.jar`
builds (hjsw*, k12, k21) are not copied into any home.

`robot.database` in home-1 and home-7 of both p12 and p12b names the same 4 Hadur jars, each the same
number of times, and nothing else Hadur.

### How Bench installs the arms

- With `--arms`, Bench sets `robot` and `robot-jar` to the first arm (`Bench.java:214-216`). Here that
  is c, `bisect/hadur2.Hadur_3.14.jar`.
- `installRobots` copies `robot-jar` to `robots/hadur2.Hadur_3.14.jar` and then arms 2..n to
  `robots/<name>_<version>.jar`, all with `REPLACE_EXISTING` into the main home
  (`Bench.java:1664-1688`). `workerHomes` copies the main home's `robots/` into each fresh
  `home-N` (`out` is a new directory per block). So c gets the same file copy as the other arms,
  just from a different option.
- In `runArms` every battle goes through `fight(h, o, seed, dir, a.robot(), true)`, and `wipe=true`
  deletes `robots/.data` before every attempt (`Bench.java:618, 843`). The launch (`runBattle`) uses
  only the arm's robot name, with no c-specific flags. Pinning is applied after the JVM starts, the
  same way for every arm (`Bench.java:1076`).
- Arm order within a job is `Arms.order(arms, seedBase, seed, opponent)`, a shuffle keyed on
  (1200, 1, opponent). It is identical in all five blocks, so each opponent's arm order (and c's
  position) is the same in p12 and p12b. Position cannot explain a difference between those two
  blocks.
- None of these can stand in for c: an older 3.14 jar, extracted classes or a stale robot.database
  entry. c cannot inherit a profile either: every arm battle starts on an empty `.data`. One thing
  the code relies on: all four arms are class `hadur2.Hadur` and share `.data/hadur2/Hadur.data`,
  which is safe only because of the per-battle wipe.

## 2. c's drop from p12 to p12b

Paired by opponent and seed (seed 1, engine seed 1201, same arm order in both blocks):

| Arm | Mean change (points) | SE | Drops / rises | 15 largest drops | Other 193 | No disable in either block (n, change) |
|---|---:|---:|---|---:|---:|---|
| c | -1.24 | 0.39 | 86 / 80 | -1.04 | -0.20 | 168, -1.44 |
| aa | +0.10 | 0.53 | 90 / 90 | -1.13 | +1.24 | 177, +0.11 |
| hv | -0.29 | 0.46 | 89 / 82 | -1.05 | +0.76 | 164, +0.04 |
| xw | -0.24 | 0.53 | 99 / 77 | -1.02 | +0.78 | 165, +0.04 |

Every arm has a tail of large drops worth about -1 point. What sets c apart is the other 193 battles:
-0.20 for c against +0.76 to +1.24 for the rest. So it is not a few battles. c's change by band is
-2.02 (band 1, n=10), -1.75 (band 2), -1.97 (band 3), -2.34 (band 4), +0.49 (band 5), -0.46 (band 6).
By p12b worker it is -4.5 to +0.6, negative on 10 of 12 workers.

### c: the 15 largest drops (p12 then p12b)

| Opponent | Share p12 | Share p12b | Change | Engine disables | Skipped turns | Arm position | Errors |
|---|---:|---:|---:|---|---|---|---|
| stefw.Tigger 0.0.23 | 96.1 | 66.0 | -30.0 | 0 / 0 | 19 / 19 | 4 / 4 | - / - |
| exauge.LemonDrop 1.6.130 | 98.2 | 82.2 | -16.0 | 0 / 0 | 14 / 23 | 4 / 4 | - / - |
| trab.Crusader 0.1.7 | 94.2 | 78.8 | -15.3 | 0 / 0 | 10 / 26 | 4 / 4 | opponent unstoppable / same |
| kawigi.sbf.FloodSonnet 0.9 | 96.8 | 81.5 | -15.3 | 0 / 0 | 14 / 20 | 3 / 3 | - / - |
| fromHell.BlackBox 0.0.2 | 74.8 | 59.6 | -15.2 | 1 / 0 | 27 / 12 | 3 / 3 | Hadur unstoppable / - |
| pez.gloom.GloomyDark 0.9.2 | 97.6 | 82.8 | -14.8 | 0 / 0 | 39 / 23 | 1 / 1 | - / - |
| abc.Shadow 3.83c | 56.2 | 41.8 | -14.4 | 0 / 0 | 17 / 33 | 1 / 1 | - / - |
| zzx.Gron 1.14 | 97.2 | 82.8 | -14.4 | 0 / 0 | 20 / 11 | 3 / 3 | - / - |
| positive.Portia 1.26e | 71.5 | 59.1 | -12.5 | 0 / 0 | 38 / 52 | 3 / 3 | - / - |
| pez.rumble.CassiusClay 2rho.02no | 67.9 | 55.8 | -12.1 | 0 / 0 | 30 / 48 | 4 / 4 | - / - |
| mn.Combat 3.25.0 | 60.4 | 48.3 | -12.0 | 0 / 0 | 33 / 25 | 4 / 4 | - / opponent unstoppable |
| theo.real.Ahab 1.0 | 91.1 | 79.8 | -11.2 | 0 / 0 | 21 / 21 | 4 / 4 | - / - |
| ags.micro.Carpet 1.1 | 93.7 | 82.5 | -11.2 | 0 / 0 | 23 / 12 | 4 / 4 | - / - |
| hlavko.micro.Flex 1.5 | 88.1 | 77.3 | -10.8 | 0 / 0 | 16 / 19 | 2 / 2 | - / Hadur unstoppable |
| ary.mini.Nimi 1.0 | 89.5 | 79.0 | -10.5 | 0 / 0 | 25 / 32 | 1 / 1 | - / - |

"Unstoppable" is the engine's "Unable to stop thread: <robot>" line at battle end. None of the 15 has
more engine disables in p12b, and skipped turns go both ways.

### aa (control): the 15 largest drops (p12 then p12b)

| Opponent | Share p12 | Share p12b | Change | Engine disables | Skipped turns | Arm position | Errors |
|---|---:|---:|---:|---|---|---|---|
| trab.Crusader 0.1.7 | 96.6 | 56.0 | -40.6 | 0 / 0 | 13 / 25 | 2 / 2 | opponent unstoppable / same |
| cb.fire.Firestarter 2.0f | 60.6 | 37.4 | -23.1 | 0 / 0 | 63 / 51 | 4 / 4 | - / - |
| ad.Quest 0.10 | 91.0 | 70.3 | -20.7 | 0 / 0 | 20 / 28 | 3 / 3 | - / - |
| chase.pm.Pytko 1.0 | 89.3 | 69.0 | -20.3 | 1 / 2 | 99 / 29 | 4 / 4 | Hadur unstoppable / same |
| florent.test.Toad 0.14t | 68.7 | 52.1 | -16.6 | 0 / 0 | 151 / 205 | 1 / 1 | - / - |
| oog.mega.saguaro.Saguaro 1.0 | 75.8 | 59.8 | -16.0 | 0 / 0 | 19 / 24 | 2 / 2 | - / Hadur unstoppable |
| damij.mega.Boque aaah | 75.0 | 59.9 | -15.1 | 0 / 0 | 17 / 18 | 3 / 3 | - / opponent unstoppable |
| pez.rumble.CassiusClay 2rho.02no | 68.7 | 54.9 | -13.8 | 0 / 1 | 29 / 35 | 2 / 2 | - / Hadur unstoppable |
| robar.micro.Topaz 0.25 | 79.5 | 68.2 | -11.3 | 0 / 0 | 16 / 20 | 3 / 3 | - / - |
| supersample.SuperCorners 1.0 | 94.7 | 83.8 | -10.9 | 0 / 0 | 19 / 14 | 2 / 2 | - / - |
| cx.Princess 1.0 | 78.1 | 67.3 | -10.8 | 0 / 0 | 31 / 24 | 1 / 1 | - / opponent unstoppable |
| wiki.Wolverine 2.1 | 98.5 | 88.2 | -10.3 | 0 / 0 | 21 / 21 | 2 / 2 | opponent unstoppable / - |
| cs.s2.Seraphim 2.3.1 | 75.0 | 65.6 | -9.4 | 0 / 0 | 11 / 16 | 2 / 2 | - / - |
| spinnercat.mega.Tardis 1.2 | 84.3 | 75.9 | -8.4 | 0 / 1 | 26 / 13 | 1 / 1 | - / Hadur unstoppable |
| davidalves.net.DuelistMicroMkII 1.1 | 87.3 | 78.9 | -8.4 | 0 / 0 | 8 / 22 | 4 / 4 | - / - |

aa has drops as large as c's (3 of its 15 with an extra disable in p12b), but its other 193 battles
offset them (+1.24).

What the pairing shows about the bench: the same opponent, seed and arm order gives swings of 10-40
points between p12 and p12b. The pairing SD is 5.7-7.6 points a battle. Battles are not reproducible at
a fixed seed under load (timing decides them), so a block's level carries about ±0.4-0.5 points of noise
per arm at 208 battles. c's -1.24 is about 3 SE. That is unlikely to be chance for one named arm, but less
so as the most extreme of four arms (about 1% family-wise). I found no structural cause for it in the jar,
install, data or launch path.

## 3. Every engine disable (Stage F and Stage 0)

Mechanism, from the Robocode 1.11.1 bytecode (`net.sf.robocode.battle.peer.RobotPeer`):
`checkSkippedTurn` runs when the robot next calls execute. It counts the turns since the last call,
writes "SYSTEM: <robot> skipped turn N" for each only if the robot is alive, and if the count exceeds
30 (240 for an IO robot) it prints "has not performed any actions in a reasonable amount of time" and
"No score will be generated", then calls `punishBadBehavior(SKIPPED_TOO_MANY_TURNS)`. That calls
`kill()` and then `RobotStatistics.setInactive()`, and `setInactive()` resets the current round's scores.

Classification: **harmless** = a "wins the round" (or "has died") line for that round comes before the
disable. **Costly** = no such line, so Hadur was alive mid-round. In all 253 costly cases the round is
lost: rounds.tsv has `won` blank (no round record, 224) or 0 (29), damage taken is at most 99, and the
round ends 14-152 ticks after the disable. "Alive stall" means at least 30 skipped-turn lines were
logged before the disable. "Died during the stall" means no skip lines were logged: Hadur's own log
simply stops, a median of 122 ticks earlier. Est. cost is the sum over battles with a costly disable of
(arm's share minus the mean of the other arms on the same opponent and seed that had no disable),
divided by the arm's battles.

| Block | Arm | Battles | Costly | Alive stall (>=30 skips logged) | Died during the stall (no skip lines) | Harmless (after the round was won) | Costly /100 battles | Est. cost, points |
|---|---|---:|---:|---:|---:|---:|---:|---:|
| top5-F | c | 292 | 0 | 0 | 0 | 4 | 0.0 | +0.00 |
| top5-F | aa | 292 | 0 | 0 | 0 | 0 | 0.0 | +0.00 |
| top5-F | xw | 292 | 0 | 0 | 0 | 1 | 0.0 | +0.00 |
| top5-s0-u12 | c | 208 | 1 | 1 | 0 | 5 | 0.5 | -0.02 |
| top5-s0-u12 | aa | 208 | 0 | 0 | 0 | 0 | 0.0 | +0.00 |
| top5-s0-u12 | hv | 208 | 0 | 0 | 0 | 0 | 0.0 | +0.00 |
| top5-s0-u12 | xw | 208 | 0 | 0 | 0 | 2 | 0.0 | +0.00 |
| top5-s0-p12 | c | 208 | 19 | 0 | 19 | 5 | 9.1 | -0.04 |
| top5-s0-p12 | aa | 208 | 10 | 1 | 9 | 8 | 4.8 | -0.15 |
| top5-s0-p12 | hv | 208 | 23 | 1 | 22 | 3 | 11.1 | -0.17 |
| top5-s0-p12 | xw | 208 | 27 | 1 | 26 | 3 | 13.0 | -0.44 |
| top5-s0-p18 | c | 208 | 12 | 0 | 12 | 7 | 5.8 | -0.12 |
| top5-s0-p18 | aa | 208 | 12 | 3 | 9 | 15 | 5.8 | -0.09 |
| top5-s0-p18 | hv | 208 | 12 | 1 | 11 | 20 | 5.8 | -0.08 |
| top5-s0-p18 | xw | 208 | 11 | 0 | 11 | 22 | 5.3 | -0.11 |
| top5-s0-p22 | c | 208 | 15 | 4 | 11 | 39 | 7.2 | -0.30 |
| top5-s0-p22 | aa | 208 | 8 | 1 | 7 | 40 | 3.8 | -0.20 |
| top5-s0-p22 | hv | 208 | 12 | 2 | 10 | 34 | 5.8 | -0.26 |
| top5-s0-p22 | xw | 208 | 13 | 2 | 11 | 37 | 6.2 | -0.19 |
| top5-s0-p12b | c | 208 | 15 | 2 | 13 | 7 | 7.2 | -0.01 |
| top5-s0-p12b | aa | 208 | 15 | 1 | 14 | 4 | 7.2 | -0.09 |
| top5-s0-p12b | hv | 208 | 26 | 1 | 25 | 4 | 12.5 | -0.18 |
| top5-s0-p12b | xw | 208 | 22 | 1 | 21 | 6 | 10.6 | -0.24 |

Totals: 519 disables, 253 costly and 266 harmless. The bench's "Disables /100" counts both kinds. The
harmless ones climb with load (u12 7, p12 19, p18 64, p22 150, p12b 21 over the four arms) because
Hadur's thread misses 30+ turns during the end-of-round ticks after a win. In every such battle the
survival score equals rounds survived x 50, so firsts and survival are untouched.

### Longest skip run before each costly disable

| Longest skip run logged before the disable | Costly disables | Median ticks from Hadur's last own log line to the disable |
|---|---:|---:|
| 0 | 151 | 122 |
| 1-4 | 80 | 124 |
| 30-59 | 10 | 38 |
| 60-119 | 7 | 1 |
| 120 or more | 5 | 1 |

231 of the 253 costly disables have no run of 30 logged at all. Hadur's own log (a wave line about every
14 ticks) stops well before the disable: p10 44 ticks, median 122, p90 133, max 283. At the pinned CPU constant
(1.4885 ms a turn) the median gap is about 180 ms of wall time. The longest-run and gap value for every
costly disable is in the TSV (`longestSkipRun`, `silentTicks`).

- **Round 0 (start-up):** 15 of 253 costly disables, spread over all arms: u12 c 1; p12 aa, hv, xw 1
  each; p18 aa 3, hv 1; p22 c 2, aa 1, hv 1; p12b c, aa, xw 1 each. Stage F has none (consistent with
  its 0.00% start-up disables).
- **Faults:** 9 disables have a ConcurrentModificationException FAULT recorded for that round, each with
  "You cannot take action in this thread" from `Hadur.run`. That is the engine force-stopping the thread
  (`forceStopThread`) while Hadur was mid-turn, a consequence of the disable, not its cause.

## What this means for Stage 0

- The 7.4 drift trip stands: c moved -1.24 between identical blocks with no structural cause found, and
  c is the reference for every "vs ref" in the multi-arm read. Its block-to-block SD (0.46) is about twice
  the other arms'.
- Separately, pinning (`--pin`, 2 logical CPUs a worker from processor 2) makes Hadur's thread miss 31-280
  turns mid-round in 3.8-13 battles per 100, each costing a round. Unpinned at 12 workers it happened once
  in 832 battles. It falls on every arm alike, so it adds noise rather than bias between arms, but it
  costs 0.0-0.44 points per arm per block and must be fixed or avoided before pinned blocks are trusted.
  The masks are adjacent logical-CPU pairs (for example 0xc00), likely the two SMT threads of one
  physical core. Not verified against the topology here.
- Open questions this analysis cannot answer without battles: whether c's p12/p12b gap repeats in a third
  identical block (a repeat would point at a defect, not chance), and whether pinning to one logical CPU
  from each of two physical cores removes the mid-round stalls.

Method: logs only (`hadur.log`, `rounds.tsv`, `result.csv`, `arms.tsv`, `robot.database`), the Bench source
at master aebe1ffb5, and `javap` on robocode.battle 1.11.1. No battles were run and nothing was deleted.
