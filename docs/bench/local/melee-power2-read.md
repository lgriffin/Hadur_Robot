# Melee firepower part 2 on 3.18

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.0 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Verdict |
|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 41.3% of 2899 | 11.7% | 49.5 | 86.9% | - |
| bb | +0.03 ± 0.23 | 46 | 276 (0) | 42.6% of 1468 (+1.4) | 11.6% (-0.0) | 49.4 (-0.0) | 86.9% (+0.1) | **CLEAN** |
| o2 | +0.06 ± 0.14 | 46 | 276 (0) | 42.0% of 1391 (+0.7) | 12.1% (+0.5) | 50.0 (+0.5) | 86.7% (-0.1) | **FAIL** |
| oe | +0.04 ± 0.17 | 46 | 276 (0) | 39.0% of 1397 (-2.3) | 11.5% (-0.2) | 50.1 (+0.7) | 86.8% (-0.0) | **FAIL** |
| ow | +0.15 ± 0.15 | 46 | 276 (0) | 44.4% of 1435 (+3.1) | 12.0% (+0.3) | 49.8 (+0.3) | 86.6% (-0.3) | **PASS** |
| o2oeow | -0.02 ± 0.17 | 46 | 276 (0) | 44.6% of 1362 (+3.3) | 13.3% (+1.6) | 49.7 (+0.2) | 85.7% (-1.2) | **FAIL** |
