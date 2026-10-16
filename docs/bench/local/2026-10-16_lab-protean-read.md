# Movement lab: the protean pick (MOVE-14), first read

2026-10-16. Silent 3.13 builds from 7e265f2c against the six lab shooters, 12 seeds 305-316, cloud.
Variants: `silent,heatjit` (sihj, the stop-and-start), and `silent,heat,protean` at mean dwell 1, 3
and 8 (sihwpr, sihwp3, sihwp8; the protean pick on the held gun-heat wave, temperature gain c = 1).
Work dirs `work/lab12p-*`. Read with `data/tools/move_lab.py`, paired against sihj.

Paired damage taken a round, protean minus stop-and-start (95%):

| Shooter | dwell 1 | dwell 3 | dwell 8 |
|---|---|---|---|
| HeadOn | -0.4 ± 3.9 | +1.4 ± 6.2 | +1.9 ± 4.3 |
| Circular | +1.2 ± 1.8 | +3.0 ± 1.5 | +2.0 ± 2.1 |
| GFHist | +0.0 ± 4.0 | -1.8 ± 3.4 | +0.1 ± 4.4 |
| Knn | +4.7 ± 3.5 | +3.3 ± 4.1 | +3.9 ± 2.7 |
| PatternMatch | -0.7 ± 4.0 | +1.7 ± 4.1 | -1.0 ± 3.2 |

Linear is left out: the stop-and-start starves the lab's Linear gun (it fires only on a steady aim),
so those rounds end on the inactivity drain and are not comparable.

Reversals per 1,000 ticks (seed 305): stop-and-start 36-521 by shooter (Linear 521, Circular 223,
Knn 93); protean 18-35 at every dwell, below plain surfing's 22-57.

## What it says

- **At c = 1 the protean pick is cold.** It nearly always takes the safest option, so it moves
  more smoothly than plain surfing, not more erratically, and it does not reproduce the
  stop-and-start at dwell 1. The stop-and-start's churn came from re-rating the options against a
  new imaginary wave every tick, not from randomness in the choice.
- It takes slightly more damage than the stop-and-start, most against Knn (+3 to +5 a round),
  none of it clearly outside the noise.
- Next: hotter temperatures in the lab (`pc10`: c = 10; `phot`: near-uniform over options within
  twice the best danger), checking reversal rates and the learning guns before any 400-bot screen.
