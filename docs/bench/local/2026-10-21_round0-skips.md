# Round-0 engine disables and skipped turns (pc-1018-stack census, live 3.12 watch)

Read-only log analysis, 2026-10-21. No battles were run.

- Bench source: `hadur-bench/work/pc-1018-stack-census-20261018-105321` on the PC, 4,848 battles per
  build (1,212 opponents x 4 seeds, cold, parallel 12, `-XX:ActiveProcessorCount=2`, CPU constant
  pinned at 1,488,498 ns). 3.13 is the `*-baseline` dirs; 3.13hjsw is the rest.
- Script: `hadur-bench/tools/round0_skips.py RUN_DIR OUT.tsv` writes one row per battle dir from
  `hadur.log`, `result.csv`, `rounds.tsv` and `engine.log`. The tables below were computed from that TSV.
- Live source: `data/live/2026-10-11_3.12` (the newest live watch; see Part B).

## The engine rule

Robocode 1.11.1 `net.sf.robocode.battle.peer.RobotPeer` (read from the bytecode of
`robocode.battle-1.11.1.jar`) handles a robot's action like this:

1. It computes `skipped = currentExecutionTime - lastExecutionTime - 1` and prints one
   `SYSTEM: <name> skipped turn N` line for each missed turn.
2. If `skipped > 30`, or `> 240` for a robot flagged as doing IO, it prints "has not performed any
   actions in a reasonable amount of time." and "No score will be generated.", sets halt, and calls
   `punishBadBehavior(SKIPPED_TOO_MANY_TURNS)`. In the truth log, Hadur's energy goes to 0 that turn,
   and it forces the robot's thread to stop.

So a disable happens at the first action after a run of more than 30 consecutive skipped turns.
The data fit this. Start-up disables fire one turn after Hadur's first record, which is never earlier than turn 32.
Post-win disables follow runs of 36 turns or more (p10). The round ends at the disable: the round's
tick count is the disable turn + 152 in 90 of 91 start-up cases, the same post-round tail as R tick + 151 in every normal win.
The 30-turn limit applied in all of these: Hadur was not flagged as an IO robot, or the 240 limit would have spared runs of 31 to 240.

## Summary

1. **The "11% round-0 disable" is mostly not a round-0 loss.** The 530 3.13 battles that
   `score_split.py` counts (round 0 `survived=0` and under 5 damage in `*_cold_rounds.tsv`) break down like this:

   | Round-0 row in rounds.tsv | 3.13 battles | What the log shows |
   |---|---:|---|
   | won=1, survived=0, damage 0 | 373 | Hadur **won** round 0. It then skipped about 58 turns in a row during the post-round wait, and the engine printed "has not performed any actions ... No score will be generated" |
   | won empty | 100 | 39 are real start-up disables (below). The other 61 are rounds whose R record is missing (for example ArchimedesAlpha-3: Hadur won, but no R record), with no disable |
   | won=0, damage < 5 | 57 | real losses with Hadur running (2 skipped turns median). None has a disable line in round 0. 21 have one elsewhere: 18 in the last round, 3 in round 1 |

   For the 373, the per-round row is a recording artefact. `LogHarvester.noteTurn` stores the engine's
   *current-round* score and alive flag at the last turn, and the engine zeroes those when it
   disables the robot. The battle totals in `result.csv` still credit the round: survival/50 minus the
   rows' survived count is +1 in 294 of the 373 battles and +2 in 75 (0 in 286 of 300 battles without a disable), and
   `bulletDamage` minus the rows' damage is +64 median (0 without a disable). Those battles lost no score
   in round 0. The 0.13 APS "cost" in plan-top5 section 4 is a correlation, not lost points.

2. **Real round-0 engine disables are 39 of 4,848 3.13 battles (0.80%) and 52 of 4,848 for
   3.13hjsw (1.07%).** Every one has the same shape: the engine skips every turn from turn 1;
   Hadur's first record (`V,1`) arrives at turn N (median 105 for 3.13, quartiles 65 / 247, range
   32 to 1,061); the disable line comes one turn later. Hadur never took a turn in that round. In 39 of 39 (and 49 of 52) the longest run of
   skipped turns is exactly turns 1 to N-1. In every other battle, Hadur's first record is at turn 1 (99.9%).

3. **Post-round disables are the bulk of the engine's disable lines, and they fall in the first and last
   rounds.** 3.13 has 1,059 disable lines: 412 in round 0, 612 in round 34 (the last),
   and 35 in all the rounds between. 965 battles (19.9%) have at least one. Disables cluster at round 0 and at battle end, the two
   places where Hadur does once-a-battle work, but the logs carry no timing that would show the cause.

4. **Clustering.** Neither kind clusters by seed slot. Neither repeats by opponent beyond chance (start-up:
   37 opponents for 39 battles). Both rise through the run: start-up disables go from 0% of battles in the first 4 hours
   to 1.8% in the last 4, post-win disables from 6.9% to 11.9% of round-0 wins. But the queue
   ran in rank order (start time vs opponent rank: r = 0.993), so time in the run and opponent
   strength cannot be told apart in this run. The worker home (`home-1..12`) is not recorded per battle. Concurrency
   at battle start is the same for disabled and other battles (9.7 vs 9.6 running).

5. **Setup timing is not in the logs.** No bench `hadur.log` has a WARM, MEM, IO,
   prepareMemory or profile line in round 0 (0 of 9,696). The only measure of setup is the
   turn of Hadur's first record.

6. **Live:** no 3.13 live data exists. The rumble clients last ran on 2026-10-11 with 3.12. The newest
   watch (`data/live/2026-10-11_3.12`, rr01..rr04) has per-battle skipped-turn and survival
   counts but nothing per round. **No live data says anything about round 0.** No client has Robocode
   console logs, so there are no "has not performed any actions" lines to count.

## Part A: bench, pc-1018-stack census

### Where round-0 skipped turns land

Skipped turn numbers come from the engine's `SYSTEM: ... skipped turn N` lines in round 0. "Before R"
counts only turns before the tick of Hadur's round-0 R record (the round still being fought). "Run" is the longest
run of consecutive turn numbers.

| 3.13, round 0 | Battles | Skips median / mean | Skips before R, median / mean | Longest run, median / mean | First skipped turn, median |
|---|---:|---|---|---|---:|
| Start-up disable (disable line, no round-0 win) | 39 | 108 / - | (no R) | 108 | 1 |
| Post-win disable (disable line after an R `win`) | 373 | 63 / 78.7 | 3 / 2.6 | 61 / 76.4 | 7 |
| No round-0 disable | 4,436 | 8 / 8.5 | 3 / 2.6 | 6 / 6.3 | 7 |
| of which round 0 won | 3,771 | 9 / 9.5 | 3 / 2.5 | 6 / 7.0 | 7 |
| round 0 lost, damage < 5 | 57 | 2 / 2.2 | 2 / 2.2 | 2 / 2.1 | 7 |
| round 0 lost, damage >= 5 | 214 | 3 / 3.6 | 3 / 3.6 | 2 / 2.1 | 7 |

| 3.13hjsw, round 0 | Battles | Skips median / mean | Skips before R, median / mean | Longest run, median / mean | First skipped turn, median |
|---|---:|---|---|---|---:|
| Start-up disable | 52 | 96.5 / - | (no R) | 96.5 | 1 |
| Post-win disable | 301 | 62 / 80.1 | 3 / 2.8 | 60 / 77.9 | 7 |
| No round-0 disable | 4,495 | 8 / 8.5 | 2 / 2.4 | 6 / 6.4 | 7 |
| round 0 lost, damage < 5 | 63 | 2 / 2.4 | 2 / 2.4 | 2 / 2.2 | 7 |

While the round is being fought, the post-win battles look like any other battle: 3 skips before R. Their extra skips all
come after the round is decided. The disable line comes a median 59 turns after the R tick (p10 36,
p90 102). Other round-0 wins skip a median 6 turns in the same post-round window and are not disabled.

### Start-up disables (Hadur never acted in round 0)

| | 3.13 | 3.13hjsw |
|---|---:|---:|
| Battles | 39 (0.80%) | 52 (1.07%) |
| First skipped turn | 1 in 39 | 1 in 49, 9 in 2 |
| Turn of Hadur's first record (`V,1`): min / p25 / median / p75 / max | 32 / 65 / 105 / 247 / 1,061 | 1 / 74 / 104 / 204 / 1,060 |
| Disable turn minus first-record turn | 1 in 36, 0 in 3 | 1 in 44, 0 in 6, 43 and 73 once |
| WARM line before the first skip | 0 | 0 |
| ROLE/TICK/R record before the first skip | 0 | 0 |
| Skipped turns in the rest of the battle, median | 30 (others 17) | 25 (others 18) |
| Turn max ms, median | 905 (others 1,251) | 893 (others 1,241) |
| Seed slot 1 / 2 / 3 / 4 | 10 / 8 / 11 / 10 | 14 / 10 / 16 / 12 |
| Distinct opponents | 37 (2 twice) | 49 (3 twice) |

The longest stalls are ap.Frederick 1.1 (1,061 and 1,060 turns, both builds), com.sociesc.T1000
1.0.0 (1,055 and 1,054) and bh.PencilRain 0.01 (812 and 821, two seeds). The same opponents
stall for about the same number of turns on different seeds and builds (Frederick: 3.13 seed 4 and 3.13hjsw
seed 3; PencilRain: 3.13hjsw seeds 1 and 3). That points to the opponent pairing more than to chance. In a normal battle,
`V,1` and `ROLE` arrive at harvest turn 1 and the first skip comes at turn 7 (median).

### Clustering by time and rank (same run, so the two are confounded)

| Hours into run | 3.13 battles | Start-up disables | Post-win disables / round-0 wins | 3.13hjsw start-up | 3.13hjsw post-win |
|---|---:|---:|---:|---:|---:|
| 0-4 | 1,132 | 0.00% | 6.9% | 0.27% | 5.2% |
| 4-8 | 1,174 | 0.26% | 6.1% | 0.77% | 5.6% |
| 8-12 | 1,482 | 1.15% | 10.6% | 1.49% | 9.4% |
| 12-16 | 1,060 | 1.79% | 11.9% | 1.70% | 8.1% |

| Opponent rank | 3.13 start-up | 3.13 post-win / wins | 3.13hjsw start-up | 3.13hjsw post-win |
|---|---:|---:|---:|---:|
| 1-300 | 0.00% | 6.8% | 0.25% | 5.3% |
| 301-600 | 0.33% | 6.3% | 0.84% | 5.6% |
| 601-900 | 1.17% | 10.6% | 1.50% | 9.9% |
| 901-1200 | 1.51% | 12.3% | 1.68% | 8.4% |

Post-win disables by seed slot (3.13): 90 / 81 / 91 / 111. Post-win disables per opponent (3.13): 248
opponents once, 47 twice, 9 three times, 1 four times. Independent draws at 7.7% would give about
294 / 37 / 2 / 0, so there is a small opponent effect at 3-4 seeds.

## Part B: the live client

The clients are `C:\RoboRumbleWorkers\rr01..rr06`. No Robocode JVM or watch was running on 2026-10-21. The
newest `Hadur.data` write is 2026-10-11 18:59. The clients hold Hadur jars up to 3.12, and 3.13 was never
installed on them. No `health.tsv` or `battles.tsv` is newer than 2026-10-11 anywhere on C: or D:. The
newest watch OUT folder is `data/live/2026-10-11_3.12` (rr01..rr04 only: `start-6.bat` starts four
workers). The 3.11 watch folder has 205 health records, with 2.5 skipped turns on average and no battle over 30.

### Skipped turns per battle

Live is Hadur's own count (health.hc, RES-8: SkippedTurnEvents it received). Bench is the engine's
SYSTEM lines (`result.csv` skippedTurns). These are different counters: skips after Hadur's death, or
after the engine disables it, may never reach Hadur.

| | Battles | Mean | p50 | p75 | p90 | p99 | Max | > 30 skipped |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| Live 3.12 (35-round health records) | 1,083 | 27.9 | 5 | 13 | 45 | 590 | 1,756 | 141 (13.0%) |
| Bench 3.13 | 4,848 | 31.1 | 17 | 32 | 76 | 155 | 1,094 | 1,265 (26.1%) |
| Bench 3.13hjsw | 4,848 | 32.0 | 19 | 36 | 73 | 139 | 1,074 | 1,427 (29.4%) |

| Skipped turns | 0 | 1-4 | 5-9 | 10-19 | 20-29 | 30-49 | 50-99 | 100-499 | 500+ |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| Live 3.12 | 19 | 516 | 213 | 127 | 62 | 42 | 55 | 35 | 14 |
| Bench 3.13 | 4 | 53 | 440 | 2,386 | 667 | 465 | 560 | 271 | 2 |

Live has a lower median and a heavier top tail (14 battles of 500 or more against 2 of 4,848 on the bench).

### Rounds survived per battle

| | Battles | Mean rounds survived of 35 | p10 | Battles at 17 or fewer |
|---|---:|---:|---:|---:|
| Live 3.12 (health.hc) | 1,083 | 33.34 | 30 | 7 |
| Bench 3.13 (result.csv survival / 50) | 4,848 | 33.58 | 31 | 27 |
| Bench 3.13hjsw | 4,848 | 33.57 | 30 | 29 |

The live opponent mix is the rumble's random pairings, not the census field, and the build is 3.12, not 3.13,
so the two rows are not a like-for-like comparison.

### Console and log files on the clients

There are no Robocode console or log files under `C:\RoboRumbleWorkers`: no `*.log`, `*.out` or
`*.err`. A grep of every `.txt`/`.log` there for "not performed any actions" or "skipped turn" hits only one file, another
robot's data file (`robots/.data/dk/stable/Gorgatron.data/stats.txt`). The roborumble client's console is not saved.
**So there is no live record of round-0 skips or engine disables, per battle or per round.**
Live health records count skipped turns per battle only, with no round.

## What would answer the open parts

- Live round 0: the roborumble console has to be captured (redirect `roborumble.bat` output to a
  file per client), or Hadur has to write a per-round skip count to health.hc.
- Time vs opponent: a census with the queue order shuffled, or an A/A rerun of only the late-ranked
  opponents early in a run, would separate the two.
- The post-round disables do not cost score on the bench (the battle totals credit the round), but they mean
  Hadur stops answering for about 60 turns after a won round 0 and after the last round. Timing Hadur's round-end and
  battle-end work would show which step it is.
- `score_split.py`'s round-0 rule should count a disable only when round 0 was not won. With that rule the bench set is 39
  (3.13) and 52 (3.13hjsw), not 530.
