# Melee release check, 3.22: so (shadow fix OFF) is screened as the candidate, so a PASS on so means the fix hurts melee and blocks it; FAIL or level means the fix is safe

Each arm but bb paired with the mean of the aa and bb baselines battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.0 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower, and skipped turns a battle no more than 20%
over aa's. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Skips a battle | Verdict |
|---|---|---|---|---|---|---|---|---|---|
| aa and bb (baseline) | - | - | - | 48.7% of 2166 | 9.3% | 54.2 | 89.4% | 32.7 | - |
| bb | +0.20 ± 0.19 | 46 | 184 (0) | 50.0% of 1070 (+1.3) | 9.1% (-0.2) | 54.7 (+0.5) | 89.6% (+0.2) | 31.5 (-4%) | **CLEAN** |
| so | -0.14 ± 0.21 | 46 | 184 (0) | 44.1% of 1044 (-4.6) | 9.5% (+0.2) | 54.0 (-0.2) | 89.2% (-0.3) | 31.9 (-2%) | **FAIL** |
