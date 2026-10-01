# Skipped turns over a session: review of the R8 plan, corrections, and what is still open

Planning document, 2026-10-01, written on top of
[rumble-memory-scale-plan.md](rumble-memory-scale-plan.md) (PR #74, merged) and its data in
[bench/r7-session.md](bench/r7-session.md). Leigh's ask: why skipped turns per battle climbed
from 10 to 90 over the 300-battle one-JVM session on 3.2, how to prevent it, and what we gain
if it is gone. PR #74 answers the first two correctly. This document checks its evidence
against the raw session logs and the Robocode 1.9.5.6 engine source, reproduces the cause
independently in twenty minutes on the weak set, corrects four points, adds what R8 should
also do, and separates the question Leigh actually cares about (the live slide) from the one
the session answered.

**Status: final.** The Sonnet thread implements R8 as #74 lays it out, with the additions in
section 4 folded into the same PR. Section 5 is the experiment that decides whether the live
slide is related; it runs before 3.4 is cut.

## 1. Verdict on PR #74 in five lines

1. **Cause: confirmed.** The growth is the round-end profile save scanning a data directory
   that grows by one file per opponent. Independent evidence below (section 2).
2. **Fix: right rule, right shape.** "No work proportional to the number of files on disk"
   (MEM-11 to MEM-13) is the fix. MEM-14 (format bump to fit 1,216 profiles) is optional and
   should not hold the PR. Section 4 adds three things R8 must also do.
3. **Gain estimate: 0 to +1 APS for the skip growth itself: agreed.** The stall lands after
   the round is decided and costs no rounds. The live slide is a different question (section 5).
4. **Four corrections** (section 3): the three engine disables in the session were Hadur,
   mid-round, and are unexplained; a disable costs one round, not "that round's thread stop"
   nor the rest of the battle; the learnings were numbered L-22/L-23, which already exist;
   and the engine on Java 20+ cannot stop a robot thread at all, which the session log shows
   twice.
5. **What to run next**: the session again at a client-like CPU constant (1 ms and 0.5 ms),
   which is the cheapest test of whether anything Hadur does mid-round reaches the engine's
   240-turn disable rule on a fast client. That, not another directory experiment, is the
   test of the live slide.

## 2. Independent evidence

### 2.1 The session's own logs, classified by position (every skipped turn, 300 battles)

Each `SYSTEM: ... skipped turn N` line in `hadur.log` was placed against that round's `R`
record (`hadur-bench/tools/skips.py`, to go into the bench as BENCH-8): *start* (turn 10 or
earlier), *mid* (before the round was decided), *decided* (on or after the decided turn, where
`onRoundEnded` and the checkpoint run).

| Battles | Skips a battle | start | mid | decided |
|---|---|---|---|---|
| 1-25 | 10.0 | 0.0 | 4.1 | 5.9 |
| 76-100 | 38.2 | 0.1 | 5.5 | 32.6 |
| 151-175 | 50.5 | 0.0 | 3.8 | 46.7 |
| 226-250 | 75.4 | 0.0 | 3.8 | 71.6 |
| 276-300 | 89.6 | 0.0 | 3.9 | 85.8 |

Mid-round skips are flat at about 4 a battle from first block to last; the growth is
entirely on the decided turn. The longest consecutive mid-round run in 300 battles is 6
turns (battle 25); the longest run on a decided turn is 18 turns (about 50 ms at this host's
2.86 ms constant). Per-battle wall time, heap after GC and live classes are flat (the
`seconds` column: 8 to 14 s a battle in every block, no trend), so host load during the
session did not shape the curve.

### 2.2 The two bisects

| Session (3.2 jar) | Skips a battle, first 25 | last block | decided share |
|---|---|---|---|
| directory wiped before every battle, one JVM (150 battles) | 7.1 | 8.2 | about a third |
| fresh JVM per battle, directory kept (81 battles so far) | 9.9 | 36.4 at 76-100 | over 90% |

The growth follows the directory, not the process: a fresh JVM every battle grows the same
way, and one JVM with a wiped directory does not. That closes the "something accumulates in
the process" branch of the top-30 plan's R7b table (code cache, threads, engine state).

### 2.3 Reproduced in twenty minutes on the weak set

A 300-opponent directory built with the 3.2 jar's own `ProfileLibrary` (a stranger loaded,
600 gun and 300 surf samples added, saved in full, 300 times under the 200,000-byte quota; run
against the 3.2 jar's classes, where every save keeps its seeds, so the directory ends at 156 KB with
three seeded 23 KB profiles and 297 stripped ones, the state a 3.2 session reaches. Run against 3.3's
classes the same tool makes stats-only profiles, because MEM-8 strips seeds from any opponent fought
once, which is the state a 3.3 session reaches:
`hadur-bench/tools/Prefill.java`, the same idea as #74's generator, to be merged into `hadur.bench.Prefill`),
placed in `robots/.data/hadur2/Hadur.data/`, then `weak-pbi.txt` (12 bots, 35 rounds) with
the 3.2 release jar, solo on a quiet host:

| Condition | Skips a battle | decided / mid / start | Survival |
|---|---|---|---|
| empty directory (wiped per battle), calibrated 2.86 ms | 6 to 14 | 100 / 12 / 0 | 100% |
| 300 profiles, calibrated 2.86 ms | 11 to 33 | 233 / 16 / 0 | 94 to 100% |
| 300 profiles, constant forced to 1.0 ms | 86 to 142 | 1090 / 168 / 20 | 100% |

The directory alone triples the skips at the bench's constant and multiplies them by ten at
a client-like one; they sit on the checkpoint turn; the score does not move. The same
directory costs three times as many turns on a 1 ms client as here, which is the point of
section 5.

### 2.4 Engine facts the plan rests on (Robocode 1.9.5.6 source, Maven Central jars)

| Fact | Where |
|---|---|
| A skipped turn is a wall-clock miss: the battle thread wakes the robot and waits up to the CPU constant; turn 1 of a round gets ten constants, the round start up to 300. The robot's own tick time is not measured; the gap between two `execute()` calls is. | `Battle.wakeupSerial`, `RobotPeer.startRound` |
| Skips are counted when the robot next calls `execute()`; one console line per missed turn while alive. | `RobotPeer.checkSkippedTurn` |
| More than 30 consecutive misses disables the robot; 240 once it has called `getDataDirectory` in this battle (a sticky per-battle flag, so Hadur gets 240 from round 0 on). Disabled is `kill()` plus `statistics.setInactive()`; the statistics are reset per round, so the cost is the current round's score, not the battle's. | `RobotPeer.checkSkippedTurn`, `punishBadBehavior`, `RobotStatistics.reset` |
| The round is decided on the turn the last opponent dies; `RoundEndedEvent`, `WinEvent` and (last round) `BattleEndedEvent` are queued that turn, and the engine runs 150 more turns before the round ends. A stall inside those turns is counted but cannot cost the round. | `Battle.shutdownTurn`, `BaseBattle.isRoundOver` |
| At round end the engine interrupts the robot thread, waits up to 1 s, then calls `Thread.stop()`. On Java 20 and later that throws `UnsupportedOperationException` out of the battle thread. The session log shows it twice (`gjr.Cephalosporin`, `taqho.taqbot`). | `RobotThreadManager.stopSteps`, `session.log` lines 26 and 223 |
| A jar robot's data directory is `robots/.data/hadur2/Hadur.data/`, shared by every Hadur version on the client: the jar's URL ends in `!/`, so the per-jar component the code would add is empty. #74's reading is right. | `RobotItem.getWritableDirectory`; the bench's own `.data` tree after a run |
| After every battle the engine calls `System.gc()` five times, so class unloading happens per battle on a client too. | `Battle.cleanup` |
| The CPU constant is calibrated once from 5 s of `Math` calls; this host gives 2.86 to 3.98 ms. A current desktop calibrates well under 1 ms. | `CpuManager.setCpuConstant` |

## 3. Corrections to PR #74

1. **The three engine disables were Hadur, not opponents.** `r7-session.md` section 1 says
   the disables were the engine's "is not stopping, forcing a stop" on `gjr.Cephalosporin`
   and `taqho.taqbot`. Those two lines exist, but the harvester counts a different message,
   and `hadur.log` carries it for Hadur in battles 59, 166 and 215: `SYSTEM: Hadur 3.2 has
   not performed any actions in a reasonable amount of time. No score will be generated.`
   at round 1 turn 685, round 9 turn 553 and round 8 turn 753, each mid-round, each with no
   skipped-turn lines, no `FAULT` and no `MEM` line before it in that round. The rule that
   prints this needs 240 consecutive missed turns (about 700 ms of silence here), and the
   engine prints a skipped-turn line for each of them when the robot is alive, so a silent
   240-turn gap is itself odd. These are the only mid-round events in the session that cost
   score (one round each; 3 of 10,500 rounds), and they are unexplained. They are also the
   only thing in the session that looks like the live symptom. Section 5 is about them.
2. **A disable costs the round, not "only that round's thread stop", and not the battle.**
   `punishBadBehavior` kills the robot and resets its statistics for the round; the
   statistics object is re-initialised each round. #74 section 1's sentence on the kill path
   should read: a disabled round is a lost round (survival and score), and nothing more.
3. **Learning IDs.** The two learnings #74 added are numbered L-22 and L-23, which
   `data/learnings.md` already uses (3.1's slide and the gap). They should be L-26 and L-27;
   the fix is in this PR.
4. **Java 20+ and the engine's thread stop.** On this host (Java 21) the engine cannot stop
   a robot thread that outlives its round; the battle thread throws and continues. Two
   opponents hit it in the session. Any Hadur stall that crosses a round end (a checkpoint
   on a slow disk, a battle-end save at a fast constant) lands in the same path. R8's rule
   (bounded work per save) is also what keeps Hadur out of it, so this is a reason to ship
   R8, not a new stage; but the bench should record it (section 4).

## 4. Additions to R8 (same PR)

The MEM-11 to MEM-13 design in #74 stands as written. Add:

1. **TIME-6: nothing before the first `execute()`.** The adapter's `run()` calls
   `execute()` once before `warmUp` and `prepareMemory`. The battle-start work (class
   loading, the warm-up tick, the directory listing MEM-11 keeps, the clock read) then
   runs on tick 1 after the orders are applied. Today all of it runs before the first
   `execute()`, inside the engine's 300-constant grace: 860 ms here, 150 ms on a 0.5 ms
   client, after which turns are missed and 240 more disable round 0.
2. **TIME-7: the adapter times every file burst.** `IO,round,tick,kind,ms` for the
   checkpoint, the battle-end save and the prepare (the adapter may read a clock; the core
   may not, RES-6). The bench harvests it. This replaces inferring stall lengths from skip
   counts, and is the instrument that would have found this cause in an hour.
3. **BENCH-8, extended.** The harvester classifies each skipped turn as start, mid-round or
   decided (the script in section 2.1), the per-opponent tables and the session report show
   the three counts, the longest consecutive run and its position, and the engine log's
   "is not stopping" and `UnsupportedOperationException` lines are counted per battle.
   Session files accept `cpu=NANOS` (as `--client` already does) so a session can run at a
   client's constant. The prefill tool is one class, `hadur.bench.Prefill`, that builds a
   directory for any jar at any size.
4. **RES-11: self-protection.** If the adapter has counted more than 100 skipped-turn
   events in a battle before a save is due, that save (the one round-end checkpoint 3.3
   still makes, MEM-10, or the battle-end save) is skipped and a `MEM` line records it.
   Cheap insurance for a client whose disk makes even a bounded save slow.

Requirements rows (stage R8, alongside #74's MEM-11 to MEM-14 and BENCH-8):

| ID | Pattern | Requirement |
|---|---|---|
| TIME-6 | Event | When a battle starts, the adapter shall call `execute()` once before any file operation or warm-up work. |
| TIME-7 | Ubiquitous | The adapter shall report the wall-clock duration of each prepare, checkpoint and battle-end save as an `IO` record. |
| RES-11 | Unwanted | If more than 100 turns have been skipped in a battle when a profile save is due, then the adapter shall skip that save and record it. |

Gate, in addition to #74's: the 300-profile weak-set run of section 2.3 on the R8 jar shows
skipped turns at the empty-directory level at both constants (under 14 a battle at 2.86 ms,
under 30 at 1 ms), zero start skips, and `IO` records under 2 ms each.

## 5. The live slide: what the session did and did not answer

The session reproduced the skip growth and did **not** reproduce the live slide (survival
99.4 to 100% in every block against 3.1's live fall from 91.8% to 76.1%). So "if the growth
is removed, what happens live" has to be answered in two parts.

**Removing the growth (R8): 0 to +1 APS, as #74 estimates.** Memory starts working on
mature clients again (today every save past about 700 files is skipped), which is the
whole of the S3/R1/R5 investment; the skips themselves cost nothing.

**The slide: still open, and the session narrowed it.** Everything that grows with the
directory is now accounted for and harmless. What remains is whatever disabled Hadur in
three rounds out of 10,500 here: a mid-round silence of about 700 ms with nothing in
Hadur's own telemetry. On a client with a 0.5 ms constant the same rule fires after 120 ms
of silence, and a 1 ms client after 240 ms. If the silences have a distribution, not three
outliers, a fast client sees many more disabled rounds, and a disabled round is a round
lost against anyone, which is the live signature (survival falling against weak bots too).
This is a hypothesis with one data point, so it gets the cheapest decisive test:

| ID | Experiment | Cost | Decides |
|---|---|---|---|
| E1 | The 300-battle session on the **3.3** jar at `cpu=1000000` and again at `cpu=500000` (BENCH-8's `cpu=` key), with the engine log kept; count disabled rounds per block and the longest silent run per battle | 2 h each, solo | whether Hadur-only silences reach the disable rule at client constants; if disabled rounds appear in numbers, the slide is reproduced and the silences are the next bisect (JIT compilation of a cold loader, GC on Hadur's thread, the core's worst tick) |
| E2 | TIME-7 plus a `STALL,round,tick,ms` line from the adapter whenever the gap between two of its own ticks exceeds 20 constants, in the same sessions | in R8 | puts a position and a length on every silence, from Hadur's side |
| E3 | 3.3's live pass read by BENCH-5 by hour (needs Leigh's Drive entry) | a day | R5 removed the O(N) save; if 3.3 still slides, the slide is not the directory, consistent with the above |
| E4 | Leigh's own client run of 3.3 for a few hours with `health.hc` (RES-8: skipped turns and memory failures per battle) uploaded | Leigh | the only direct read of a real client's constant and disk |

Expected gain if E1 reproduces the slide and R8 plus the follow-up removes it: the whole
slide, +3 to +4 APS over a pass (3.1: 85.7 in its first hour, 81.46 for the pass; rank 30 was
84.30), which is the top 30. If E1 does not reproduce it, the live cause is not in Hadur's
process at any constant we can set, and the next lever is E4.

## 6. Order

1. This document and the learnings renumbering (this PR).
2. R8 as #74 lays it out plus section 4, one PR, gate as above. Ship as 3.4 only after
   3.3's live pass has been read (E3), so that pass stays a clean read of R5.
3. E1 runs while R8 is being built (it needs only the `cpu=` key, a one-line change to
   `SessionFile`, which can land first).
