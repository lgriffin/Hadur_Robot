<!-- Cloud smoke, 2026-10-31 (4-core box, parallel 1): the three Diamond-inspired switches (docs/bench/local/../../plan-melee-top5.md,
MMOVE-22 dm, MMOVE-23 la, MGUN-23 ea), each alone on master (surfer + cross-learning on), against the aa build of the same
commit (b9dcd7c70). 12 census fields x 2 seeds (scal-smoke-suite.txt, seeds 3251-3252), 24 battles an arm, no A/A arm:
a sanity check only, the pc-melee-dia card (BENCH-154) decides. Skipped turns over the 24 battles: aa 392, dm 373, la 409,
ea 494 (+26%, which the card's skip bar would fail). Read: dm is the arm worth the PC (energy entering the endgame +3.9,
skips down); la is inside noise either way; ea loses energy before the endgame and skips more, so it is dropped from the card. -->

# Diamond-inspired melee switches: cloud smoke on 3.20

Each arm paired with the aa baseline battle for battle (same field, same seed). Paired APS is the mean over
fields of the per-field mean difference, with its 95% interval. Pass: +0.0 or more, low end above 0, and
1-30 endgame wins no more than 3 points below the baseline's, and the share of others outlived no more than 1 point lower, and skipped turns a battle no more than 20%
over aa's. The bb copy is clean within ±0.25.

| Arm | Paired APS | Fields | Battles (missing) | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Others outlived | Skips a battle | Verdict |
|---|---|---|---|---|---|---|---|---|---|
| aa (baseline) | - | - | - | 39.5% of 157 | 9.6% | 48.3 | 86.9% | 16.3 | - |
| dm | +0.44 ± 0.58 | 12 | 24 (0) | 40.6% of 160 (+1.1) | 11.7% (+2.0) | 52.2 (+3.9) | 87.0% (+0.0) | 15.5 (-5%) | **FAIL** |
| la | +0.20 ± 0.75 | 12 | 24 (0) | 40.3% of 144 (+0.8) | 10.4% (+0.7) | 50.8 (+2.5) | 87.1% (+0.1) | 17.0 (+4%) | **FAIL** |
| ea | -0.11 ± 0.49 | 12 | 24 (0) | 42.6% of 162 (+3.1) | 10.4% (+0.7) | 44.3 (-4.1) | 86.4% (-0.5) | 20.6 (+26%) | **FAIL** |
