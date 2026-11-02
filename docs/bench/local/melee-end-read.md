# The endgame duel switches on 3.21

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.0 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower, and skipped turns a battle no more than 20%
over aa's. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Skips a battle | Verdict |
|---|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 48.2% of 3219 | 9.3% | 54.7 | 89.4% | 27.7 | - |
| bb | +0.03 ± 0.16 | 46 | 276 (0) | 47.7% of 1603 (-0.5) | 9.3% (-0.0) | 54.7 (+0.1) | 89.4% (+0.0) | 27.4 (-1%) | **CLEAN** |
| eg | -0.17 ± 0.23 | 46 | 276 (0) | 46.5% of 1636 (-1.8) | 9.3% (-0.0) | 54.7 (+0.0) | 89.2% (-0.2) | 28.2 (+2%) | **FAIL** |
| ek | +0.04 ± 0.23 | 46 | 276 (0) | 49.6% of 1632 (+1.3) | 9.4% (+0.1) | 54.4 (-0.3) | 89.5% (+0.1) | 28.4 (+2%) | **FAIL** |
