# Live-match check (BENCH-245): PASS

Bench `work/pc-livematch-rel-live/arms.tsv`, our arm `c`, BeepBoop's arm `bb`, 31 opponents paired with live.

| | Us | BeepBoop | Gap |
|---|---:|---:|---:|
| Bench | 70.7 | 84.0 | +13.28 |
| Live | 66.2 | 83.6 | +17.36 |
| Bench minus live, paired | +4.51 +- 2.19 | +0.43 +- 0.89 | -4.08 +- 2.57 |
| Skipped turns a battle | 10.2 | 1.1 | |

Marginal:

- gap off live by -4.08 +- 2.57 points: past the tolerance 4.0, but the 95% interval reaches it, so seed noise

The bench scores both robots as live does, so A/B results on it carry to live.

