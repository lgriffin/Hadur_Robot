# Multi-arm run

Files: `work/eveimear-diet/run/arms.tsv`

## All files pooled

A/A: aa - c = +0.01 ± 0.03 points over 112 opponents; 1% band ± 0.32, inside: the run stands.

| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| aa | 112 | 80.30 | +0.01 ± 0.03 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| c | 112 | 80.29 | ref | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| n | 112 | 80.27 | -0.02 ± 0.08 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| r2 | 112 | 79.97 | -0.32 ± 0.25 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| r27 | 112 | 79.96 | -0.33 ± 0.25 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |

Difference against the reference by band (points, opponents):

| Arm | Band 1 | Band 2 | Band 3 | Band 4 | Band 5 | Band 6 |
|---|---:|---:|---:|---:|---:|---:|
| aa | - | - | - | - | - | - |
| n | - | - | - | - | - | - |
| r2 | - | - | - | - | - | - |
| r27 | - | - | - | - | - | - |

## Sizes

c 0.2 746 B; n 719; r2 709; r27 704 (plain javac, kitlab_codesize.py). A cut ships when its 95% interval against c and aa pooled is above -0.15 points.
