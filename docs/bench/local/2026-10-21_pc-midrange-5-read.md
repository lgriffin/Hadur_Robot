# pc-midrange-5 read: the gun stack is +0.6 on the 149 and +2.7 on the top 50; it goes to the census

Queue `hadur-bench/plans/pc-midrange-5.queue` (docs/plan-midrange.md stage 3), run on the PC
2026-10-20, reports in PR #217 (`docs/bench/local/2026-10-20_pc-midrange5-*`). The three gun
switches of `2026-10-20_gun-read.md`, built on du09qh ed968c98 (PR #212), each alone and stacked
on 3.14hjsw, on the 149 random movers with guess-factor guns at 4 fresh seeds (1101-1104), then
the stack on the census top 50 (1111-1114). Paired against 3.14hjsw.

| Step | Candidate | Score (pp) | Survival (pp) | Bullet damage (pp) | Our hit rate vs hjsw |
|---|---|---|---|---|---|
| th | GUN-8 TripHammer main gun | -0.1 ± 0.5 | -0.2 ± 0.6 | +0.2 ± 0.4 | 15.7% vs 15.2% |
| fg | GUN-9 free gun choice | +0.2 ± 0.5 | +0.2 ± 0.6 | +0.2 ± 0.4 | 15.7% vs 15.2% |
| nk | GUN-10 undecayed ratings | -0.2 ± 0.5 | -0.1 ± 0.6 | -0.4 ± 0.5 | 15.3% vs 15.2% |
| thfgnk | all three, on the 149 | **+0.6 ± 0.5** | +0.4 ± 0.6 | **+0.9 ± 0.5** | 15.9% vs 15.2% |
| guard | all three, on the top 50 | **+2.7 ± 1.1** | +2.6 ± 1.4 | +2.5 ± 1.3 | 9.6% vs 9.2% |

The hit rates compare each report's candidate rows with 3.13hjsw's rows for the same robots in
the 18 October census (4 seeds each, different seeds).

## Verdict

- **No switch reaches the +1.0 class rule, and the stack does not either** (+0.6, interval
  +0.1 to +1.1). Alone, each is noise; together they are a real but small gain on the 149,
  carried by bullet damage (+0.9) with the hit rate up 0.7 points. The TripHammer gun is not a
  different gun against a random mover, which the stage 3 read half expected: a random mover's
  fallback movement has no structure for a better kernel to find.
- **The top 50 is the result.** +2.7 ± 1.1 on the guard, 34 of the 48 robots up, and the gains
  are on the surfers: GresSuffurd +11.1 ± 6.5, Wintermute +8.3, WaveSerpent +8.2, Domogled +8.1,
  Dookious +7.0, Lambda +6.0, Ascendant +5.8, Nullstride +5.5 ± 7.0, Combat +3.6 ± 4.0, BeepBoop
  +3.3, DrussGT +1.6; down are Midboss -5.6 ± 6.6, Foilist -3.0, Diamond -2.2 ± 5.1. This is the
  gun-choice and rating change at work against surfers (the anti-surfer gun gets picked sooner
  and the TripHammer main gun holds its own against them), not the random-mover gain the stage
  was after. The guard was written as a floor; here it is the gain.
- Worth on the field, taken at face value: +0.6 on the 149 is +0.07 APS, +2.7 on the top 50 is
  +0.11, and what the stack does on the 1,015 other robots is unknown. Only the census says.

## What follows

The whole-field census of the release-candidate form, `pc-midrange-census-2`: 3.14hjswthfgnkxl
(stop-and-start stack with the top-200 off-list, plus the three gun switches) against the 3.13
release on all 1,212 at 4 fresh seeds (1121-1124), gate +0.3 APS with the interval above 0 and
no band below -0.05. Against the top 200 the off-list turns the stack off, so there the paired
difference to 3.13 is the gun alone; below rank 200 the earlier hjsw census (+0.38 / +0.48 /
+0.20 by band) subtracts out. A pass makes hj, sw, xl, th, fg and nk the next release's 1v1
defaults. A miss closes stage 3 with the stack-plus-list census still to run on its own.
