# R7: the session bench, its bisect and the prefilled-directory reproduction

Runs on 2026-10-01 in the Claude Code container (4 cores, Java 21, Robocode 1.9.5.6,
security manager on). The jars are the released 3.2 and 3.3 builds.

## 1. Session (BENCH-6/7): 300 battles, one engine process, 3.2 jar, control sample.Tracker

Heap cap 512M, data directory kept, 35 rounds a battle, blocks of 25. Weak means an opponent
under 50 APS.

| battles | weak survival | all survival | score share | skipped turns/battle | disables | heap MB after GC | live classes |
|---|---|---|---|---|---|---|---|
| 1-25 | 100.0% | 96.2% | 87.7% | 10.0 | 0 | 7 | 2844 |
| 26-50 | 100.0% | 94.2% | 86.3% | 14.9 | 0 | 6 | 2647 |
| 51-75 | 100.0% | 96.7% | 88.5% | 27.9 | 1 | 6 | 2663 |
| 76-100 | 99.8% | 95.1% | 89.0% | 38.2 | 0 | 7 | 2673 |
| 101-125 | 99.7% | 92.5% | 85.2% | 39.5 | 0 | 6 | 2668 |
| 126-150 | 100.0% | 96.9% | 88.0% | 46.4 | 0 | 6 | 2679 |
| 151-175 | 98.7% | 96.1% | 90.3% | 50.5 | 1 | 6 | 2680 |
| 176-200 | 99.5% | 96.0% | 87.2% | 55.7 | 0 | 6 | 2703 |
| 201-225 | 98.7% | 95.9% | 88.3% | 67.3 | 1 | 6 | 2704 |
| 226-250 | 99.8% | 96.2% | 87.6% | 75.4 | 0 | 6 | 2703 |
| 251-275 | 99.7% | 94.7% | 86.8% | 84.7 | 0 | 6 | 2707 |
| 276-300 | 99.5% | 95.9% | 87.4% | 89.6 | 0 | 6 | 2707 |

The control (sample.Tracker, same 300 opponents in the same process) skipped 0.0 to 0.1
turns a battle in every block. First 50 weak survival 100%, last 100 weak survival 99.4%.
No slide in survival or score; a steady climb in skipped turns, Hadur only. The three
engine disables (blocks 51-75, 151-175, 201-225) are Hadur's: `hadur.log` of battles 59
(pez.mako.Mako), 166 (pkbots.BoyTDSurfer) and 215 (djc.Aardvark) carries "Hadur 3.2 has
not performed any actions in a reasonable amount of time" mid-round (round 1 tick 685,
round 9 tick 553, round 8 tick 753) with no skipped-turn, fault or memory line before it,
so each is a silent freeze of about 240 turns that costs that round. They are not the
round-end stalls and are not explained by the data directory; see L-28 and
`docs/skipped-turns-plan.md`. (The "is not stopping, forcing a stop" lines in
`session.log` are on opponents, gjr.Cephalosporin and taqho.taqbot, and are a separate
thing.)

Where the skips are (from Robocode's "skipped turn" lines in `hadur.log`, against each
round's `R` record):

| battle | skipped turns | at round end + 1 | elsewhere |
|---|---|---|---|
| 1 kb.PingPong | 4 | 1 | 3 |
| 150 dy.LevelOne | 84 | 80 | 4 |
| 299 sheldor.nano.Sabreur | 164 | 160 | 4 |

Battle 299: 2, 2, 2, 1, 1, 3, 2, 4, 4, 2, 4, 3 ... skips per round, every group one tick
after that round ended. Turn p95 about 1 ms and turn max flat throughout.

## 2. Bisect: the same session with the data directory wiped before every battle

150 battles, 3.2 jar, no control.

| battles | weak survival | skipped turns/battle |
|---|---|---|
| 1-25 | 99.5% | 7.1 |
| 26-50 | 99.8% | 12.8 |
| 51-75 | 99.8% | 6.0 |
| 76-100 | 99.8% | 10.0 |
| 101-125 | 99.7% | 6.9 |
| 126-150 | 99.4% | 8.2 |

Flat. The growth needs the accumulating data directory.

## 3. Prefilled directory (BENCH-4 `--client`, `data=prefill:DIR`)

N stats-only profiles (275 bytes each, written by `ProfileLibrary.save` over a plain
`FileProfileStore` with no quota) copied into `robots/.data/hadur2/Hadur.data`, then one
35-round battle against kb.PingPong 1.0 (13.6 APS). Skips per round, from `hadur.log`:

| N | bytes | jar | skipped turns | at round 0 end | at round 34 end | save outcome | duress ticks | rounds won |
|---|---|---|---|---|---|---|---|---|
| 0 | 0 | 3.3 | 4 | 0 | 0 | written | 0 | 35/35 |
| 300 | 84 KB | 3.3 | 10 | 4 | 3 | written without seeds | 0 | 35/35 |
| 600 | 169 KB | 3.3 | 15 | 5 | 5 | written without seeds | 0 | 35/35 |
| 1000 | 283 KB | 3.3 | 57 | 31 | 23 | skipped ("275 bytes do not fit") | 0 | 35/35 |
| 2000 | 570 KB | 3.3 | 96 | 52 | 42 | skipped | 0 | 35/35 |
| 0 | 0 | 3.2 | 0 | 0 | 0 | written | - | 35/35 |
| 300 | 84 KB | 3.2 | 7 | 4 | 2 | written without seeds | - | 35/35 |
| 600 | 169 KB | 3.2 | 16 | 5 | 5 | written without seeds | - | 35/35 |
| 1000 | 283 KB | 3.2 | 57 | 31 | 21 | skipped | - | 35/35 |
| 2000 | 570 KB | 3.2 | 107 | 53 | 44 | skipped | - | 35/35 |

3.3 saves twice a battle (MEM-10: the end of round 0 and the battle's end); 3.2 saves at
every round end when alive, but against a bot it kills in a few ticks most rounds end with
Hadur's save being the only work, so both jars show the same cost per save here. The cost
is `ProfileLibrary.save`: a directory walk for `bytesUsed`, then above 90% of quota a read
and decode of every own-version file in `evictSeeds`, then at quota a skipped write.

Conclusions and the plan: [docs/rumble-memory-scale-plan.md](../rumble-memory-scale-plan.md).
