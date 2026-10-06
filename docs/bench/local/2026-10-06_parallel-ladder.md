# Parallel width on the local host: the ladder

The first thing to settle before any local bench is trusted (issue #102): how many battles
this PC can run at once before the load itself changes the result. Hadur reads its own tick
times and enters duress when the engine skips its turns, and in duress it sheds work (wave
detection among it), so an overloaded bench does not just lose a few turns, it measures a
different robot. The `R` records carry both counts: skipped turns, and the ticks spent in
duress.

Host: AMD Ryzen Threadripper PRO 9965WX (24 cores, 48 logical), 128 GB, Windows 11, Java
21.0.10, Robocode 1.9.5.6 from Maven Central. Six of the owner's RoboRumbleAtHome clients
(four 1v1, one melee, one team) were running throughout, as they normally do on this PC, and
every row below includes their load. All runs: cold, 10 rounds, 1 seed, the same 8 opponents
from the top 20 (BeepBoop, DrussGT, Saguaro, Diamond, Tomcat, WaveSerpent, WhiteFang,
Dookious), the CPU constant calibrated once idle (1876154 ns, this ladder only) and shared by every worker. The real benches pin the rumble client's own 1488498 instead.

## The first try: 20 wide, children left to size themselves

The smoke run of the whole top 20 at `--parallel 20`, before any child-JVM flag:

| | Skipped turns per battle | Duress ticks per battle | Their hit rate as reported |
|---|---|---|---|
| 20 wide, 20 battles | 58 (max 167) | 527 to 2879 (of about 3000 ticks) | up to 154%, i.e. broken |

Every battle spent most of its ticks in duress. The hit-rate column breaks because in duress
Hadur stops detecting enemy shots, so the denominator collapses. The cause is not the
battles themselves: each child JVM sized its JIT and GC thread pools for a 48-core machine,
so twenty of them started several hundred compiler and collector threads between them.

## The ladder: children told they have 2 processors

`--child-cpus 2` (the default once `--parallel` is above 1) passes
`-XX:ActiveProcessorCount=2` to each battle JVM. The same 8 opponents at each width:

| Width | Wall time | Skipped turns per battle (max) | Battles with any duress | Duress ticks in those |
|---|---|---|---|---|
| 1 (sequential) | 127 s | 8.4 (12) | 2 | 298, 298 |
| 6 | 46 s | 13.0 (31) | 0 | |
| 12 | 44 s | 15.5 (20) | 4 | 298 to 596 |
| 18 | 45 s | 16.5 (32) | 2 | 50, 596 |
| 24 | 38 s | 13.9 (23) | 2 | 182, 298 |
| 12, `--child-cpus 0` (control) | 41 s | 26.3 (38) | 8 | 298 to 1608 |

298 ticks is one short round: the sequential run's two duress battles (DrussGT, Diamond)
spent exactly their first round in it, which is JIT warm-up, and the parallel rungs' duress
is the same first-round effect in one or two more battles. The control row, the same width
with the flag off, doubles the skips and puts every battle into duress.

Their hit rate stayed between 4% and 11% in every battle of the flagged rungs (one 56% in
the width-12 rung's WaveSerpent battle, a duress round), against the broken figures of the
first try.

## What this sets

- `--child-cpus 2` is the default for any parallel run. Without it the host cannot run even
  12 battles cleanly.
- The bench-top20 scripts default `--parallel` to a quarter of the logical processors (12
  here), not the half issue #102 guessed. The ladder shows 24 is also workable on this host
  with the flag, but 12 leaves room for the rumble clients and keeps the skipped-turn count
  within about 7 of the sequential run's at 10 rounds, where the warm-up round weighs most.
- A 35-round battle's warm-up round is a smaller share, so the real runs should sit closer
  to the sequential figure than the 10-round ladder does. Each real report records its own
  skipped-turn line against this baseline.
- The report header now names the host, the parallel width, the CPU constant and the other
  Robocode JVMs running, so a later run on a quieter or busier machine is read against the
  right conditions.

Raw rows: `hadur-bench/work-ladder.log` of the run (not committed; the table above is the
whole of it).
