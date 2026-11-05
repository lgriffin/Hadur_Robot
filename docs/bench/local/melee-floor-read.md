# Far power from less spare energy on 3.21

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.0 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower, and skipped turns a battle no more than 20%
over aa's. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Skips a battle | Verdict |
|---|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 47.6% of 3201 | 9.2% | 53.7 | 89.3% | 32.1 | - |
| bb | +0.01 ± 0.19 | 46 | 276 (0) | 48.9% of 1624 (+1.3) | 9.0% (-0.2) | 53.7 (-0.1) | 89.3% (-0.0) | 28.9 (-10%) | **CLEAN** |
| z4 | -0.11 ± 0.13 | 46 | 276 (0) | 47.8% of 1622 (+0.3) | 9.3% (+0.1) | 53.8 (+0.1) | 88.8% (-0.5) | 26.2 (-19%) | **FAIL** |
| z5 | -0.00 ± 0.16 | 46 | 276 (0) | 49.7% of 1616 (+2.1) | 9.3% (+0.1) | 54.0 (+0.2) | 89.0% (-0.3) | 26.4 (-18%) | **FAIL** |
