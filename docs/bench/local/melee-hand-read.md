# The endgame hand-off switches on 3.20

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.0 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower, and skipped turns a battle no more than 20%
over aa's. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Skips a battle | Verdict |
|---|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 46.2% of 3384 | 9.7% | 53.3 | 89.1% | 71.1 | - |
| bb | +0.07 ± 0.18 | 46 | 276 (0) | 45.3% of 1701 (-0.9) | 9.4% (-0.3) | 53.4 (+0.1) | 89.2% (+0.1) | 66.6 (-6%) | **CLEAN** |
| et | +0.03 ± 0.16 | 46 | 276 (0) | 44.7% of 1647 (-1.4) | 9.9% (+0.3) | 53.2 (-0.0) | 89.2% (+0.1) | 71.0 (-0%) | **FAIL** |
| ed | -0.04 ± 0.15 | 46 | 276 (0) | 43.2% of 1666 (-3.0) | 9.6% (-0.1) | 53.0 (-0.3) | 89.1% (-0.1) | 59.5 (-16%) | **FAIL** |
| es | -0.07 ± 0.17 | 46 | 276 (0) | 45.4% of 1653 (-0.8) | 9.4% (-0.2) | 53.3 (+0.1) | 89.0% (-0.2) | 69.0 (-3%) | **FAIL** |
