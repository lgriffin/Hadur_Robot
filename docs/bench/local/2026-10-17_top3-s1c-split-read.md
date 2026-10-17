# Top 3 stage 1: movement by the enemy's gun (MOVE-15), stopped at 250 bots

2026-10-17. 3.13sp (`split`: hot protean on the held gun-heat wave once 6+ of the enemy's hits on
us are counted and 60%+ are of the learned class, the stop-and-start otherwise) against 3.13,
paired, screen-311 chunks 0-4 (250 of 400 bots), seeds 951-954, cloud. Stopped there: the direct
comparison with the stop-and-start on the same bots and seeds already decides it.

| Band | Opponents | Mean difference (95%) | APS (95%) |
|---|---|---|---|
| 1 | 3 | -1.12 (-3.73 to +1.50) | -0.008 |
| 2 | 7 | +0.38 (-2.41 to +3.17) | +0.012 |
| 3 | 31 | -0.09 (-1.10 to +0.92) | -0.010 |
| 4 | 42 | +0.40 (-0.37 to +1.17) | +0.066 |
| 5 | 62 | -0.10 (-0.55 to +0.36) | -0.024 |
| 6 | 105 | +0.11 (-0.10 to +0.31) | +0.045 |
| All (250) | | | **+0.08 (-0.17 to +0.33)** |

On the same 250 bots the stop-and-start (MOVE-13) reads +0.22 (-0.02 to +0.46). Direct, per bot,
split minus stop-and-start: **-0.29 ± 0.27 score points**. Damage taken: 3.13 11.60, split 11.65.

## What it says

- The protean pick costs on the real field. In the lab it cut damage from the k-NN and pattern
  matching guns, but on the 400 bots, where the HF "learned" class takes in every gun that is
  neither head-on nor linear (circular, statistical, random-offset nanos), switching those bots
  to protean gives back more than it wins from the true learners.
- So the stop-and-start alone stays the best movement change found: +0.24 APS on fresh seeds.
- A finer gun reading (a circular class, or a test of whether the enemy's aim follows our past
  choices) could rescue the split, but the lab's gain against true learners was small (-3 a round
  against the stop-and-start, inside the noise), so it is not the next lever.
