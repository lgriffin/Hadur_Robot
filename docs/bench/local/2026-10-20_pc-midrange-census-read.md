# pc-midrange-census read: the surf stack adds nothing to the field, stage 2 closed

Queue `hadur-bench/plans/pc-midrange-census.queue` (docs/plan-midrange.md stage 2), run on the PC
2026-10-20, report in PR #216 (`docs/bench/local/2026-10-20_pc-midrange-census.md`). 3.14hjswhcpkw2
(stop-and-start + wall-hit shield + hitclr + pkern + keep2) against the 3.13 release on all 1,212
robots of `census-312.txt` at 4 fresh seeds (1091-1094), the same shape as `pc-1018-stack`
(3.13hjsw against 3.13, master `2026-10-18_pc-1018-stack-census.md`). Gate: +0.3 APS over 3.13
with the interval above 0 and no rank band below -0.05.

The two censuses share opponents, seeds count and baseline, so the per-opponent paired
differences subtract: the third column is what hitclr + pkern + keep2 add on top of 3.13hjsw.

| Set | n | 3.13hjsw vs 3.13 (pp) | 3.14hjswhcpkw2 vs 3.13 (pp) | surf stack alone (pp) |
|---|---|---|---|---|
| all | 1212 | +0.20 ± 0.14 | **+0.22 ± 0.13** | **+0.03 ± 0.18** |
| the 149 flat x learning (stage target) | 149 | -0.43 ± 0.47 | -0.11 ± 0.51 | +0.32 ± 0.70 |
| guard top 50 | 48 | -0.25 ± 1.32 | -0.08 ± 0.99 | +0.17 ± 1.47 |
| band 1 (ranks 1-10) | 10 | +0.46 ± 1.88 | -0.45 ± 2.28 | -0.91 ± 2.23 |
| band 2 (11-50) | 38 | -0.44 ± 1.60 | +0.02 ± 1.11 | +0.46 ± 1.77 |
| band 3 (51-200) | 149 | -0.46 ± 0.53 | -0.23 ± 0.50 | +0.23 ± 0.74 |
| band 4 (201-400) | 200 | +0.38 ± 0.45 | +0.47 ± 0.42 | +0.10 ± 0.62 |
| band 5 (401-700) | 300 | +0.48 ± 0.28 | +0.44 ± 0.27 | -0.04 ± 0.34 |
| band 6 (701+) | 515 | +0.20 ± 0.11 | +0.16 ± 0.11 | -0.04 ± 0.15 |

Plain means over opponents of the reports' per-opponent paired score-share differences; the
all-row agrees with each report's own "All pairs" line (+0.2 ± 0.1). Trusted pairs only
(2,690 of 4,848): +0.2 ± 0.2, the same. Skipped turns 39.3 per battle, as on pc-1018-stack.

## Verdict

- **Gate not met.** +0.22 is under +0.3, and bands 1 and 3 sit under -0.05 (both intervals
  include 0). Everything the stack gains is in ranks 201 and down, where 3.13hjsw already
  gained it.
- **The three surf switches add nothing to the field:** +0.03 ± 0.18 over 3.13hjsw. The +0.6
  ± 0.3 on the class at 8 seeds (`2026-10-20_pc-midrange-4-read.md`) reads +0.32 ± 0.70 here
  at 4 seeds, same sign, not significant, and it is worth +0.04 APS on the field even at face
  value. The top-50 guard's +0.9 ± 1.1 reads +0.17 ± 1.47. Both earlier numbers were honest
  and small; the census says they do not reach the field.
- The one new fact is about the stop-and-start stack itself: 3.13hjsw costs -0.43 ± 0.47 on
  the 149 random movers and -0.46 ± 0.53 on ranks 51-200, and gains it back below rank 200.
  The surf switches recover a third of that cost on the class and none of it on the field.
- Stage 2 is closed at "the surf port is faithful enough; the class is not lost in its
  details". All five switches (hj, sw, hc, pk, w2) stay off by default. hc + pk + w2 is parked
  as a +0.2 stack to be gated together with whatever stage 3 produces, not released alone.

## What follows

Stage 3, the gun, on the 149: Hadur's hit rate against random movers by distance band against
Diamond's and DrussGT's from the same census rows, then the gun's own levers (bin width, kNN
depth, the random-mover fallback) as duel-only switches, screened on the PC on the 149 with
the usual guard. The stage's budget is the 0.74 APS the class holds and the 76.8 against
82-87 that the top bots score on it.
