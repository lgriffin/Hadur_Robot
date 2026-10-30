<!-- Cloud smoke, 2026-10-30 (4-core box): bw (MMOVE-20 own bullet shadows) and fv (MMOVE-21 five-step search),
each alone on the melee surfer, against the ms surfer run (identical melee behaviour to master's surfer).
12 census fields x 2 seeds (scal-smoke-suite.txt, seed-base 3232), built from master after PR #470's review fixes.
No A/A arm here and only 24 battles an arm: a sanity check only; pc-melee-scal (BENCH-146) decides.
Skipped turns over all 24 battles: ms 762, bw 574, fv 431 (the search costs no extra skips). -->

# Melee Stage 1: two opponents left

Each arm paired with the aa baseline battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.3 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Verdict |
|---|---|---|---|---|---|---|---|---|
| aa (baseline) | - | - | - | 32.0% of 153 | 12.1% | 47.2 | 85.4% | - |
| bw | +0.94 ± 0.58 | 12 | 24 (0) | 39.0% of 159 (+7.0) | 11.5% (-0.6) | 51.9 (+4.7) | 87.3% (+1.9) | **PASS** |
| fv | -0.09 ± 0.54 | 12 | 24 (0) | 31.9% of 138 (-0.1) | 8.6% (-3.6) | 47.4 (+0.2) | 84.0% (-1.4) | **FAIL** |
