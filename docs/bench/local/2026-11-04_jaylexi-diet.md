# Multi-arm run

Files: `work/jaylexi-diet/run/arms.tsv`

## All files pooled

A/A: aa - c = +0.05 ± 0.07 points over 112 opponents; 1% band ± 0.32, inside: the run stands.

| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| aa | 112 | 84.47 | +0.05 ± 0.07 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| all | 112 | 77.20 | -7.24 ± 1.24 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| c | 112 | 84.42 | ref | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| n | 112 | 84.55 | +0.11 ± 0.16 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| r10 | 112 | 82.03 | -2.41 ± 0.45 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| r11 | 112 | 84.23 | -0.21 ± 0.22 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| r2 | 112 | 84.32 | -0.13 ± 0.17 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| r9 | 112 | 84.42 | -0.02 ± 0.24 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |

Difference against the reference by band (points, opponents):

| Arm | Band 1 | Band 2 | Band 3 | Band 4 | Band 5 | Band 6 |
|---|---:|---:|---:|---:|---:|---:|
| aa | - | - | - | - | - | - |
| all | - | - | - | - | - | - |
| n | - | - | - | - | - | - |
| r10 | - | - | - | - | - | - |
| r11 | - | - | - | - | - | - |
| r2 | - | - | - | - | - | - |
| r9 | - | - | - | - | - | - |

## Sizes

c 0.4 1,494 B; n 1,470; r2 1,460; r9 1,454; r10 1,455; r11 1,456; all 1,445 (plain javac, kitlab_codesize.py). A cut ships when its 95% interval against c and aa pooled is above -0.15 points.
