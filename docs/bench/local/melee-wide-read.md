# Melee power 3 out to 300 px on 3.18.1

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.0 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Verdict |
|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 42.5% of 3815 | 11.7% | 49.4 | 86.5% | - |
| bb | -0.08 ± 0.14 | 46 | 368 (0) | 43.6% of 1882 (+1.1) | 11.7% (-0.1) | 49.3 (-0.1) | 86.5% (-0.1) | **CLEAN** |
| ow | +0.14 ± 0.17 | 46 | 368 (0) | 41.6% of 1896 (-0.9) | 12.1% (+0.4) | 49.5 (+0.1) | 86.3% (-0.2) | **FAIL** |
