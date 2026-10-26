# Melee firepower on 3.17.1

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.3 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Verdict |
|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 40.1% of 2758 | 13.0% | 47.3 | 85.8% | - |
| bb | +0.21 ± 0.32 | 46 | 276 (0) | 39.9% of 1371 (-0.2) | 13.1% (+0.0) | 47.5 (+0.2) | 86.1% (+0.3) | **CLEAN** |
| pf | +0.44 ± 0.18 | 46 | 276 (0) | 40.3% of 1375 (+0.2) | 13.5% (+0.4) | 47.3 (+0.0) | 85.4% (-0.4) | **PASS** |
| po | +0.62 ± 0.18 | 46 | 276 (0) | 38.6% of 1427 (-1.5) | 13.4% (+0.3) | 47.2 (-0.1) | 86.0% (+0.2) | **PASS** |
