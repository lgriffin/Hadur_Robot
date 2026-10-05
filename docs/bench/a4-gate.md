# A4 gate: ports for a team, paired against A3

A4 (the adapter on `TeamRobot`, the message and bullet-owner ports, the link codec, the
Archive over the gated store) against A3. Both jars were built at 3.6 from the same tree,
apart from the stage, and the two ran side by side on one 4-core machine, so they shared
its load. A4 leaves solo play unchanged: the roster is empty off a team, so no message is
sent and every gate stays open. This bench checks the cost of the new adapter.

**Verdict: within noise.** Neither side faulted, turn times are level, and the
300-battle session shows no slide and no growth in heap or classes.

## The gate suite (`arch-gates.txt`)

| Set | Battles | A3 | A4 | Change | Skipped turns (A3 / A4) |
|---|---|---|---|---|---|
| Reference duels (score share) | 5 seeds x 6 | 91.2% | 92.1% | +0.9 | 115 / 109 |
| Top 19 (score share) | 1 seed x 18 | 48.8% | 50.3% | +1.5 | 319 / 410 |
| Weak leak (score share) | 1 seed x 11 | 87.9% | 88.4% | +0.4 | 23 / 27 |
| Melee sentry (APS) | 3 battles | 66.1 | 67.8 | +1.7 | 2 / 18 |
| Melee reference (APS) | 3 battles | 55.5 | 55.7 | +0.2 | 15 / 18 |
| Melee hand-off (APS) | 3 battles | 52.5 | 51.6 | -0.9 | 25 / 22 |
| Strong duels (score share) | 3 seeds x 3 | 53.6% | 51.4% | -2.2 | 46 / 89 |

The strong set is Shadow 57.8 to 55.2, Diamond 36.7 to 31.2 and Portia 66.2 to 67.8. That
is within its noise: the A2 rerun on 5 seeds put the same jar on Diamond anywhere from 29
to 32. The top-19 set is one seed per opponent; the largest single swings (Wavelet -13.6,
Raven +9.9, Dookious +9.8) go both ways and net +1.5.

Skipped turns are higher on A4 in the top-19 and strong sets and lower in the duels and
the hand-off set. Turn time per engine turn is level, so the skips follow the shared load
rather than the adapter. The median turn p95 per set, A3 then A4, is: reference
0.97 / 1.05 ms, top 19 2.71 / 2.64 ms, weak 0.96 / 0.97 ms, strong 1.97 / 2.02 ms. The
session below, 300 battles a side, counts 10.7 skips a battle on A3 and 10.2 on A4.

The melee M records held still. Both sides had 0 melee faults, 0 ticks aimed at a dead
robot, and no robot dropped as dead without a death event.

## The session bench (`session-300.txt`, without the control)

The 300 rumble participants were fought in order through one engine process under a 512M
heap, with the data directory kept throughout. Both sessions ran at the same time.

| | A3 | A4 |
|---|---|---|
| Survival (mean of the 12 blocks) | 94.9% | 94.6% |
| Score share | 86.9% | 86.6% |
| Skipped turns a battle | 10.7 | 10.2 |
| Engine disables | 25 | 22 |
| Duress ticks | 87561 | 76833 |
| Weak survival, first 50 / last 100 | 99.1% / 98.8% | 99.0% / 98.6% |
| Heap after GC, most | 7 MB | 8 MB |
| Live classes, most | 2893 | 2902 |

Both reports say "slide reproduced". That is the BENCH-6 rule firing on any engine
disable, and two sessions sharing four cores both had about two dozen. Survival against
weak opponents holds at 99% from the first block to the last on both sides, so there is
no slide.

## Old transcripts and profiles

Every replay fixture replays unchanged in orders, telemetry and store files, the eleven
recorded on 3.5.1 included (`ReplayTest`). The v1 and v2 profile fixtures still decode
(`ProfileCodecTest`). The Archive sends each file to its shelf by suffix, so the `.hp` and
`.hm` files already on disk open as before (`ArchiveTest`, SHELF-1).
