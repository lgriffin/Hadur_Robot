# Live-match check (BENCH-245): FAIL

Bench `work/pc-livematch-live/arms.tsv`, our arm `c`, BeepBoop's arm `bb`, 31 opponents paired with live.

| | Us | BeepBoop | Gap |
|---|---:|---:|---:|
| Bench | 73.1 | 84.7 | +11.68 |
| Live | 66.2 | 83.6 | +17.36 |
| Bench minus live, paired | +6.82 +- 2.29 | +1.15 +- 0.72 | -5.68 +- 2.54 |
| Skipped turns a battle | 10.2 | 0.5 | |

Why it fails:

- gap off live by -5.68 points (tolerance 4.0)

