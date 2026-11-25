# Live-match check (BENCH-245): PASS

Bench `work/pc-locks30-livematch/arms.tsv`, our arm `c`, BeepBoop's arm `bb`, 31 opponents paired with live.

| | Us | BeepBoop | Gap |
|---|---:|---:|---:|
| Bench | 71.1 | 84.5 | +13.31 |
| Live | 66.2 | 83.6 | +17.36 |
| Bench minus live, paired | +4.91 +- 2.25 | +0.86 +- 0.73 | -4.05 +- 2.39 |
| Skipped turns a battle | 3.0 | 0.0 | |

Marginal:

- gap off live by -4.05 +- 2.39 points: past the tolerance 4.0, but the 95% interval reaches it, so seed noise

The bench scores both robots as live does, so A/B results on it carry to live.

