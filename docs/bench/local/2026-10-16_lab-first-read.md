# Movement lab, first reads: the gun-heat wave and the escape-room term

2026-10-16. The movement lab (`docs/bench/move-lab.md`, BENCH-90): Hadur 3.13 with its duel gun
silenced (`silent`, 3.13si) against the six `lab.*` reference shooters, each firing power 2.0. Variants
are `silent,heat` (3.13sihw, MOVE-11) and `silent,wallesc` (3.13siwe, MOVE-12). Cloud, 35 rounds,
12 seeds 305-316. Read with `python3 data/tools/move_lab.py --set lab-panel.txt si=... x=...`. Hit
rates are true hit rates (bullet damage over 10 a hit over the shots seen), not the bench's
`theirHitRate` column.

## Current read (builds with WAVE-5 and the MOVE-11 hold)

Work dirs `work/lab12f-si-*`, `work/lab12f-siwe-*` (WAVE-5, e43b33e2) and `work/lab12h-sihw-*`
(WAVE-5 plus the hold, 79431ece). Paired difference against silent 3.13 (95% interval, 12 seeds):

| Shooter | si hit % | gun-heat wave: hit % | dmg/round | escape room: hit % | dmg/round |
|---|---|---|---|---|---|
| HeadOn | 1.0 | +0.06 ± 0.67 | +0.5 ± 3.7 | -0.26 ± 0.49 | -1.3 ± 2.5 |
| Linear | 0.5 | +0.22 ± 0.20 | +1.1 ± 1.0 | +0.11 ± 0.22 | +0.5 ± 1.1 |
| Circular | 2.5 | -0.01 ± 0.36 | -0.1 ± 2.0 | -0.10 ± 0.39 | -0.5 ± 2.2 |
| GFHist | 9.3 | +0.18 ± 0.48 | +1.0 ± 3.2 | +0.01 ± 0.47 | +0.3 ± 3.4 |
| Knn | 13.3 | -0.68 ± 0.80 | -2.9 ± 4.4 | -0.68 ± 0.66 | -2.2 ± 4.0 |
| PatternMatch | 12.5 | -0.06 ± 0.69 | +0.1 ± 3.8 | -0.41 ± 0.59 | -3.9 ± 3.4 |
| All six | | -0.05 ± 0.34 | -0.0 ± 1.6 | -0.22 ± 0.31 | -1.2 ± 1.8 |

- **The gun-heat wave, done right, is level in the lab.** Only Linear's +0.22 points (from 0.5%)
  clears zero, and that is about one damage a round. It leans the right way against Knn.
- **The escape-room term leans the right way against the learning guns** (Knn -0.68, PatternMatch
  -0.41) without clearing the noise.

## Two faults the first read found

The first read (seeds 305-316, before either fix) showed the gun-heat wave raising Linear's hit rate
from 0.6% to about 4% (+3.49 ± 0.67). Two faults made that up:

1. **The inactivity drain.** Robocode takes 0.1 a turn from every robot after 450 turns without
   damage. Silent Hadur deals none, so lab rounds drain, and the energy ledger read each 0.1 drop as
   a 0.1-power shot; real shots then read 2.1. WAVE-5 (e43b33e2) subtracts the drain.
2. **The gun-heat wave dithered.** MOVE-11 surfed each tick's newest movement wave while the enemy's
   gun was ready, so while an enemy held a cool gun the surf re-ranked its options against a new wave
   every tick and reversed on most ticks:

   | Reversals per 1,000 ticks | HeadOn | Linear | Circular | GFHist | Knn | PatternMatch |
   |---|---|---|---|---|---|---|
   | silent 3.13 | 48 | 50 | 57 | 38 | 22 | 29 |
   | gun-heat wave, first build | 340 | 748 | 250 | 140 | 89 | 119 |
   | gun-heat wave, held | 20 | 30 | 29 | 22 | 17 | 17 |

   Against Linear the dither (mean speed 1.1 px a tick) kept the lab gun from settling, so it fired
   about 170 shots a battle instead of 1,740 and the rounds ran out on the drain. The fix (79431ece)
   holds the first ready tick's wave until it has gone or is found to be a real shot.

So the 400-bot screen's +0.23 APS for the gun-heat wave (`2026-10-15_top3-s1-heat-read.md`) was the
dithering build. It is being re-screened with the hold (label `top3-s1-heat2`).
