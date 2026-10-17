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

## Hotter temperatures (pc10, phot)

Same seeds, both at mean dwell 1 on the held gun-heat wave: `pc10` (c = 10, 3.13sihwprpc) and `phot`
(temperature floor 0.5 of the best danger and cap at twice it: near-uniform over the options in
the cap, 3.13sihwprph).

| Shooter | pc10 − stop-and-start | phot − stop-and-start | phot − plain surfing (si) |
|---|---|---|---|
| HeadOn | -0.3 ± 3.9 | -0.1 ± 4.2 | -0.2 ± 1.9 |
| Linear | (starved) | (starved) | +2.5 ± 1.1 |
| Circular | +2.1 ± 2.5 | +3.6 ± 2.3 | +3.0 ± 2.0 |
| GFHist | -0.2 ± 3.4 | +1.2 ± 4.1 | +4.2 ± 3.1 |
| Knn | +1.1 ± 3.9 | -2.8 ± 4.3 | **-6.0 ± 3.8** |
| PatternMatch | -1.5 ± 3.7 | -2.8 ± 3.7 | -4.4 ± 4.3 |

Damage taken a round, 95% intervals. Reversals per 1,000 ticks: pc10 22-36, phot 25-44.

- **The protean trade shows up at phot.** Against plain surfing it cuts the k-NN gun's hit rate from
  13.3% by 1.4 points (-6.0 damage a round) and leans the same way against the pattern matcher, and
  it costs against the simple and statistical guns (Linear +2.5, Circular +3.0, GFHist +4.2). That
  is what unpredictability should do: it hurts guns that learn our choice and helps guns that only
  extrapolate our motion.
- Even near-uniform, it reverses little: the cap often leaves one option, and the window (gun cool,
  no real bullet within 10 ticks) is a small share of the time.
- Neither hot version beats the stop-and-start overall. Because the APS gap is mostly the weak tail,
  where simple guns dominate, phot alone would likely lose on the 400 bots.
- That points to splitting by the enemy's gun rather than by name: protean against learning guns,
  the stop-and-start against the rest. Hadur already rates each enemy's gun (ADAPT tiers), so this
  is one rule for the whole field.

## The gun-based split (MOVE-15)

`silent,split` (3.13sisp, 54115811): hot protean on the held wave once the enemy's hits read as a
learning gun, the stop-and-start otherwise. Same seeds.

| Shooter | split − stop-and-start | split − plain surfing |
|---|---|---|
| HeadOn | -0.2 ± 4.1 | -0.3 ± 2.2 |
| Linear | -0.2 ± 0.4 | -1.4 ± 0.7 |
| Circular | **+3.8 ± 1.7** | +3.2 ± 2.0 |
| GFHist | +0.3 ± 4.2 | +3.3 ± 3.4 |
| Knn | -2.9 ± 4.8 | -6.0 ± 5.3 |
| PatternMatch | -2.3 ± 3.7 | -3.9 ± 4.2 |

- It keeps the protean gain against the learning guns and the stop-and-start's level against
  head-on and linear guns, as designed.
- **Circular is misread as a learning gun.** The HF class only tells head-on and linear apart from
  everything else, so a circular gun's hits count as "learned" and get the protean pick, which
  circular aim punishes (+3.8 a round). A circular class in the classifier is the obvious fix.
- Overall level with the stop-and-start in the lab (-0.2 ± 2.5 a round). The 400-bot screen
  (`s1c-sp-*`, running) decides.

## Replicator weights for the danger views (MOVE-16), on the stop-and-start

`silent,heatjit,repl` (3.13sihjrp, 502fd91a) against `silent,heatjit` (sihj), same seeds. Damage taken
a round, replicator minus stop-and-start: HeadOn -1.2 ± 4.8, Linear +0.5 ± 1.8, Circular -0.0 ± 2.3,
GFHist +3.2 ± 4.3, Knn +3.1 ± 4.3, PatternMatch -2.2 ± 3.9; over the six +0.6 ± 2.3. Level, with no
hole; the 400-bot screen against 3.13hj (`s1c-hjrp-*`) decides.
