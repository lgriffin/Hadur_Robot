# Live-match check (BENCH-245): FAIL

Bench `work/pc-livematch-old/arms.tsv`, our arm `c`, BeepBoop's arm `bb`, 31 opponents paired with live.

| | Us | BeepBoop | Gap |
|---|---:|---:|---:|
| Bench | 73.6 | 81.2 | +7.60 |
| Live | 66.2 | 83.6 | +17.36 |
| Bench minus live, paired | +7.36 +- 2.55 | -2.40 +- 2.09 | -9.76 +- 2.58 |
| Skipped turns a battle | 31.5 | 313.3 | |

Why it fails:

- gap off live by -9.76 points (tolerance 4.0)
- BeepBoop skips 313 turns a battle (at most 100.0)

