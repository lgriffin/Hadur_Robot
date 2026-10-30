# Melee surfer on 3.19

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.3 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Verdict |
|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 40.9% of 2922 | 11.7% | 48.9 | 85.8% | - |
| bb | +0.11 ± 0.21 | 46 | 276 (0) | 40.0% of 1455 (-0.9) | 11.6% (-0.1) | 49.3 (+0.4) | 85.9% (+0.1) | **CLEAN** |
| ms | +0.99 ± 0.19 | 46 | 276 (0) | 44.1% of 1587 (+3.2) | 9.5% (-2.2) | 52.5 (+3.6) | 88.7% (+3.0) | **PASS** |
