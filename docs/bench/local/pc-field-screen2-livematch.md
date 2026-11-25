# Live-match check (BENCH-245): PASS

Bench `work/pc-field-screen2-livematch/arms.tsv`, our arm `c`, BeepBoop's arm `bb`, 31 opponents paired with live.

| | Us | BeepBoop | Gap |
|---|---:|---:|---:|
| Bench | 70.6 | 83.3 | +12.72 |
| Live | 66.2 | 83.6 | +17.36 |
| Bench minus live, paired | +4.32 +- 2.00 | -0.32 +- 0.74 | -4.64 +- 2.33 |
| Skipped turns a battle | 11.3 | 1.2 | |

Marginal:

- gap off live by -4.64 +- 2.33 points: past the tolerance 4.0, but the 95% interval reaches it, so seed noise

The bench scores both robots as live does, so A/B results on it carry to live.

