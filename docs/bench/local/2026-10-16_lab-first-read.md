# Movement lab, first read: the gun-heat wave and the escape-room term

2026-10-16. The movement lab (`docs/bench/move-lab.md`, BENCH-90): Hadur 3.13 with its duel gun
silenced (`silent`, 3.13si) against the six `lab.*` reference shooters, each firing power 2.0. Variants
are `silent,heat` (3.13sihw, MOVE-11) and `silent,wallesc` (3.13siwe, MOVE-12). Cloud, 35 rounds,
12 seeds 305-316 (`work/lab12-*`); a first pass at 4 seeds 301-304 (`work/lab-*`) agrees. Read with
`python3 data/tools/move_lab.py --set lab-panel.txt si=... x=...`. Hit rates are true hit rates
(bullet damage over 10 a hit over the shots seen), not the bench's `theirHitRate` column.

Silent 3.13's shooter hit rates: HeadOn 0.9%, Linear 0.6%, Circular 1.9%, GFHist 8.0%, Knn 11.6%,
PatternMatch 10.8%. The simple guns barely touch it; the learning guns are where the damage is.

Paired difference in the shooter's hit rate, points (95% interval), 12 seeds:

| Shooter | gun-heat wave | escape room |
|---|---|---|
| HeadOn | -0.30 ± 0.40 | +0.14 ± 0.68 |
| Linear | **+3.49 ± 0.67** | +0.02 ± 0.19 |
| Circular | +0.02 ± 0.44 | -0.06 ± 0.28 |
| GFHist | -0.18 ± 0.71 | -0.29 ± 0.79 |
| Knn | -0.65 ± 0.77 | -0.30 ± 0.78 |
| PatternMatch | -0.57 ± 0.60 | **-0.88 ± 0.52** |

## What it says

- **The gun-heat wave opens a hole to linear guns.** A linear gun's hit rate goes from 0.6% to about
  4%, in both runs (+2.6 at 4 seeds, +3.5 at 12). Against the learning guns it leans the right way
  (-0.2 to -0.7) without clearing the noise. That fits the 400-bot screen's +0.23 APS: a gain that a
  hole somewhere is eating. Next: find why surfing the not-yet-fired wave makes us linear-predictable
  (likely the drive it picks at the fire tick), close it, and re-screen.
- **The escape-room term helps against the pattern matcher** (-0.88 ± 0.52) and is level elsewhere.
- The lab costs about 7 minutes a variant at 4 seeds on the cloud, against 2 hours for the 400-bot
  screen, and it separates guns the screen mixes together.
