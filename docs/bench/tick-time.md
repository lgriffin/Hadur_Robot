# Tick time, garbage and skipped turns (TIME-11, TIME-12, TIME-13)

20 November 2026. Why Hadur skips turns, how to measure it, and the first cut.

## What a skip is

Robocode gives each robot one CPU constant of wall time a turn (live 3,272,413 ns, BENCH-245).
A robot whose thread has not called `execute()` by then loses the turn: no move, no shot. A run of
30 or more turns in one gap and the engine disables the robot for the round. Each skip also drops
Hadur's computation level for the rest of the round (TIME-2), so a skip costs more than its turn.

## Where they come from

1. **Not our computation.** `TickPerf` replayed a recorded 35-round battle against BeepBoop 2.0
   (270,853 ticks) twice in one JVM. 207 ticks went over the live allowance on the second pass, but
   only 4 ticks were over it on *both* passes, and only 131 were over 70% on both. The work Hadur does
   a tick fits the turn; the long ticks are not repeatable.
2. **Garbage-collection pauses.** The same replay logged a G1 young pause every 2 s or so, 25 to 70 ms
   each on a busy 4-core box and up to 440 ms. A 30 ms pause is 9 turns. In the live battle the
   recorder captured, 52 of the 57 skips came straight after one of our own ticks that took 4 to 66 ms.
   Long runs (10 to 58 turns) appear in about half of the strong battles, and some reach the 30-turn
   disable.
3. **Why so much garbage.** Hadur allocated about 60 KB a tick in a duel, 365 KB in a melee and
   800 KB as a team member. At ~2,000 ticks a second that fills a young generation in seconds.
   The robot cannot choose the client's GC settings, so the only lever is allocating less.
4. **Not unusual among the top robots.** The same box, live constant, 35 rounds against Diamond
   1.8.22 and XanderCat 12.9, each robot as the bench subject (seed 99300):

   | Subject | vs Diamond | vs XanderCat | Skips per 1,000 turns |
   |---|---|---|---|
   | Hadur 3.23 | 31 | 3 | 0.22 |
   | BeepBoop 2.0 | 94 | 28 | 0.85 |
   | Saguaro 1.1.4 | 362 | 28 | 4.4 |
   | DrussGT 3.1.18 | 16 | 4 | 0.13 |

   The rest of the table is in the PR. The ~60 a battle the PC reads over the whole field comes from
   long battles and a loaded host, not from Hadur being heavier than its peers.

## The tick-time replay (TIME-11)

```sh
mvn -o install -DskipTests && mvn -o -pl hadur-robot test-compile
cd hadur-bench && mvn -q -o exec:java -Dexec.args="--record /tmp/rec --set census-live.txt --seeds 1 --cpu-constant 3272413"
tools/tickperf.sh --passes 2 /tmp/rec/*.txt.gz
TICKPERF_JVM="-Xlog:gc:file=gc.log:uptime" tools/tickperf.sh /tmp/rec/kc.mega.BeepBoop_2.0.txt.gz
```

Columns: `ticks`, `mean_us` .. `max_us` (tick time), `over70` and `over100` (ticks over 70% and 100%
of the allowance), `kb_tick` (bytes the core allocated a tick), `gc_n`, `gc_ms` (the pass's
collections and pause time, decoding included), `roundend_max_us`, `wall_s`, `mismatch` (ticks whose
orders differ from the recording; 0 means identical play), `first_mismatch` (its line) and `digest`.
Pass 1 is a cold JVM, as every battle is; later passes are warm. A tick slow on every pass is
computation; slow on one pass only is GC, JIT or the host.

## The first cut (TIME-12)

Every change keeps the same arithmetic in the same order; every recording replays with 0 differing
ticks. Warm, second pass:

| Recording | Before KB/tick | After KB/tick | Change |
|---|---|---|---|
| BeepBoop 2.0, 35 rounds (duel) | 59.5 | 50.0 | -16% |
| melee-samples | 364 | 34 | -91% |
| team MyFirstTeam member 1 | 795 | 159 | -80% |

| Site | What changed |
|---|---|
| `RobotStateLog` | `TickMap`: tick to state with no boxed key or entry, iterating exactly as `HashMap<Long, RobotState>` (a property test checks it against HashMap); one lookup, not two |
| `KdTree.nearestNeighbor` | the search heap is reused |
| `Wave.preciseIntersection` | angles in a plain array, bearings without a point each |
| `BulletShadows.cast` | three points reused |
| `FieldGun.playForward` | one offset buffer, the point built once; per-target sums only for a new best |
| `TeamRisk.pathDamage` / `crossesBox` | segment clip over plain doubles, bullet points reused |

The duel's remaining garbage is mostly predicted states and their points in the surf (about 28%),
which the surf keeps in its danger lists, so it needs a design change rather than a reuse.

## The guard (TIME-13)

`TickPerfBudgetTest` fails when the duel, melee or team fixture allocates more than 35, 70 or
210 KB a tick (least of three warm passes), or plays any tick differently.

## Skips at tight timing (TIME-14, TIME-15)

26 November 2026. A loaded host (many battles side by side) or a slow client shows 10 to 20 skips
a battle where a quiet cloud box shows 2 to 3. 0.5x the live constant (1,636,206 ns) on a quiet
box reproduces that level.

**Hadur's computation fits.** At 0.5x the p95 tick is 0.7 to 0.9 ms of a 1.64 ms allowance. The
skips are stalls: each battle JVM collects garbage every 0.5 to 1 s with young pauses of about 8 ms
(5x the turn), and only about a third of that JVM's garbage is ours (the engine and the opponent
make the rest). Inside the robot, a stall cannot be told from slowness.

**The skips cost score through the shedding.** A skip held a computation level for the rest of
the round (TIME-2) and taught a battle-long allowance from the tick before it (TIME-3), so each
stall bought hundreds of single-wave, no-go-to turns: at 0.5x, master spent 13% of its ticks shed.
TIME-15 retires both; only TIME-1's slow tick sheds now.

**Close range was genuinely heavy.** A profile of replayed battles (`tickperf.sh` with
`TICKPERF_JVM="-XX:StartFlightRecording=..."` and `--profile-loop`) put half of a close-range
tick in the rammer escape's shot checks and the surf's gun-mimic profiles. TIME-14 cuts them with
identical play (every recording replays with zero differing ticks and the same digest):

| Recording (warm pass) | mean us before | after | p99 us before | after | KB/tick before | after |
|---|---|---|---|---|---|---|
| stelo.RamTrackSurfer 1.2 | 435 | 179 | 1,481 | 487 | 83.1 | 19.7 |
| whind.StrengthBee 0.6.4 | 290 | 223 | 818 | 697 | 85.8 | 49.6 |
| mbro.BelajarBot 0.0.3 | 125 | 100 | 627 | 389 | 50.4 | 26.7 |
| davidalves.Phoenix 1.02 | 113 | 109 | 325 | 297 | 17.4 | 14.4 |

**Bench** (30 robots across the 70-95+ bands, 4 seeds each, c and aa = master, sk = this change):

| Timing | skips a battle c / aa / sk | sk minus mean(c, aa), share pts | A/A |
|---|---|---|---|
| 0.5x (seeds 77300) | 14.8 / 15.1 / 9.6 | +0.18 +- 0.38 | +0.27 +- 0.59 |
| live (seeds 77400) | 2.3 / 2.6 / 1.5 | +0.20 +- 0.48 | +0.19 +- 0.56 |
| 0.5x, TIME-15 alone (seeds 77200) | 17.0 / 15.7 / 18.2 | +0.39 +- 0.45 | -0.10 +- 0.52 |

The rammer blow-ups are gone at 0.5x (Impact 46 to 9 skips a battle, Caligula 38 to 7, Colossus2
37 to 11, RamTrackSurfer 26 to 6). What is left, about 8 a battle at 0.5x, is the JVM's own
collections, which the robot cannot stop.
