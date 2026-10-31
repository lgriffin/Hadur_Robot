# ScalarR-inspired melee switches on 3.20

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.3 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Verdict |
|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 45.8% of 3132 | 10.3% | 51.8 | 88.1% | - |
| bb | -0.03 ± 0.21 | 46 | 276 (0) | 45.4% of 1536 (-0.3) | 10.2% (-0.1) | 51.7 (-0.1) | 88.1% (+0.0) | **CLEAN** |
| wm | +0.08 ± 0.16 | 46 | 276 (0) | 45.7% of 1605 (-0.1) | 10.6% (+0.4) | 52.5 (+0.7) | 88.3% (+0.2) | **FAIL** |
| xh | +0.19 ± 0.14 | 46 | 276 (0) | 44.2% of 1613 (-1.6) | 9.7% (-0.5) | 51.5 (-0.2) | 88.5% (+0.5) | **FAIL** |
| wq | +0.00 ± 0.16 | 46 | 276 (0) | 46.3% of 1569 (+0.5) | 10.8% (+0.5) | 51.5 (-0.2) | 87.9% (-0.1) | **FAIL** |
| bw | +0.10 ± 0.15 | 46 | 276 (0) | 43.5% of 1588 (-2.3) | 10.0% (-0.3) | 52.0 (+0.3) | 88.3% (+0.2) | **FAIL** |
| fv | -0.20 ± 0.21 | 46 | 276 (0) | 46.0% of 1551 (+0.2) | 10.1% (-0.2) | 51.8 (+0.1) | 86.9% (-1.1) | **FAIL** |
| ec | +0.18 ± 0.15 | 46 | 276 (0) | 41.0% of 1443 (-4.8) | 11.9% (+1.6) | 51.1 (-0.6) | 87.0% (-1.0) | **FAIL** |
| bs | +0.06 ± 0.14 | 46 | 276 (0) | 42.1% of 1588 (-3.7) | 9.9% (-0.4) | 52.1 (+0.4) | 88.2% (+0.2) | **FAIL** |
