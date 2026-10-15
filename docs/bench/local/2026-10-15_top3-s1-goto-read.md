# Top 3, first movement screen: go-to surfing from the start of every duel

2026-10-15. An experiment jar (`bisect/hadur2.Hadur_3.13gt.jar`, not committed): 3.13 with MOVE-9's
HF record and the surf in go-to mode from the first wave of every duel, instead of only after
MOVE-2's flavour steps (which never fired on the screen). Same screen, seeds and machine as
`top3-s0-hf2` (`2026-10-15_top3-s0-hf2-read.md`), which plays as 3.13, so every battle pairs.
Run report: `2026-10-15_top3-s1-goto.md`. Read with `export_battles.py` on both work dirs and
`screen_paired.py --candidate 3.13gt --baseline 3.13`.

| Band | Opponents | Mean difference (95%) | APS it adds (95%) |
|---|---|---|---|
| 1 | 3 | +3.26 (-1.45 to +7.97) | +0.024 (-0.011 to +0.060) |
| 2 | 13 | -4.58 (-7.41 to -1.76) | -0.149 (-0.241 to -0.057) |
| 3 | 49 | -0.95 (-2.30 to +0.40) | -0.116 (-0.281 to +0.049) |
| 4 | 66 | +0.19 (-0.71 to +1.10) | +0.032 (-0.118 to +0.181) |
| 5 | 99 | +0.03 (-0.60 to +0.66) | +0.008 (-0.148 to +0.164) |
| 6 | 170 | -0.38 (-0.61 to -0.16) | -0.163 (-0.259 to -0.067) |
| All | 400 | | **-0.36 (-0.67 to -0.06)** |

Damage taken from the 302 unlisted robots rose from 13.1 to 13.8 a round (on-plan 10.2 to 11.3,
off-plan 1.0 to 0.5). Skipped turns rose from 0.17 to 0.22 a round.

## Verdict

Rejected, as at S6. Go-to drives more faithfully to its plan (off-plan damage halves) but its
plans are hit more often. Choosing among more stop points with the same danger model does not
find safer spots; it overfits the danger estimate. The option-set question stays open, but this
mode is not the answer.

## Next

The counterfactual record: at each hit, whether the bullet would also have hit the other two
options' plans on that wave. That says directly whether a safe option existed and was passed
over (choice), or none did (reach), before building any new movement.
