# Melee final-duel energy race on 3.24

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.0 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower, and skipped turns a battle no more than 20%
over aa's. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Skips a battle | Verdict |
|---|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 46.2% of 5268 | 9.6% | 53.4 | 89.2% | 35.5 | - |
| bb | -0.04 ± 0.12 | 46 | 460 (0) | 44.8% of 2580 (-1.3) | 9.5% (-0.2) | 53.2 (-0.1) | 89.1% (-0.1) | 35.5 (-0%) | **CLEAN** |
| en | +0.15 ± 0.12 | 46 | 460 (0) | 61.7% of 2685 (+15.5) | 9.6% (-0.0) | 53.5 (+0.2) | 89.4% (+0.2) | 37.2 (+5%) | **PASS** |
| ez | +0.28 ± 0.13 | 46 | 460 (0) | 62.2% of 2672 (+16.0) | 9.9% (+0.2) | 53.6 (+0.2) | 89.7% (+0.5) | 35.6 (+0%) | **PASS** |
