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
