# The closest-robot factor on 3.21

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.0 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower, and skipped turns a battle no more than 20%
over aa's. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Skips a battle | Verdict |
|---|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 46.9% of 3298 | 9.3% | 54.2 | 89.6% | 27.0 | - |
| bb | +0.22 ± 0.20 | 46 | 276 (0) | 46.8% of 1680 (-0.1) | 9.0% (-0.3) | 54.5 (+0.3) | 90.1% (+0.4) | 27.3 (+1%) | **CLEAN** |
| n3 | +0.01 ± 0.15 | 46 | 276 (0) | 50.1% of 1659 (+3.2) | 9.0% (-0.3) | 55.4 (+1.2) | 89.7% (+0.0) | 27.4 (+2%) | **FAIL** |
| n4 | -0.03 ± 0.16 | 46 | 276 (0) | 49.1% of 1622 (+2.2) | 8.7% (-0.6) | 55.1 (+0.9) | 89.5% (-0.1) | 32.3 (+19%) | **FAIL** |
