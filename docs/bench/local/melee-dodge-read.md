# The shot profiles in the crowd on 3.21

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.0 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower, and skipped turns a battle no more than 20%
over aa's. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Skips a battle | Verdict |
|---|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 47.6% of 3253 | 9.1% | 54.0 | 89.3% | 28.5 | - |
| bb | -0.11 ± 0.16 | 46 | 276 (0) | 46.8% of 1629 (-0.8) | 9.1% (+0.0) | 53.6 (-0.4) | 89.2% (-0.2) | 28.5 (+0%) | **CLEAN** |
| md | -0.07 ± 0.19 | 46 | 276 (0) | 47.8% of 1556 (+0.2) | 9.4% (+0.4) | 53.8 (-0.2) | 89.1% (-0.2) | 27.6 (-3%) | **FAIL** |
