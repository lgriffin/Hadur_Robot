# Diamond-inspired melee switches on 3.20

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.0 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower, and skipped turns a battle no more than 20%
over aa's. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Skips a battle | Verdict |
|---|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 43.8% of 3250 | 10.0% | 51.9 | 88.7% | 66.6 | - |
| bb | +0.08 ± 0.18 | 46 | 276 (0) | 44.7% of 1598 (+0.8) | 10.2% (+0.2) | 52.0 (+0.0) | 88.8% (+0.1) | 77.6 (+17%) | **CLEAN** |
| dm | +0.43 ± 0.17 | 46 | 276 (0) | 44.6% of 1633 (+0.7) | 9.8% (-0.2) | 53.7 (+1.8) | 89.2% (+0.5) | 71.7 (+8%) | **PASS** |
| la | +0.00 ± 0.16 | 46 | 276 (0) | 45.7% of 1633 (+1.9) | 9.3% (-0.6) | 52.6 (+0.7) | 88.7% (+0.0) | 69.2 (+4%) | **FAIL** |
