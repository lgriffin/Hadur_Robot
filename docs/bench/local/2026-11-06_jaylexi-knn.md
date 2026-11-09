# Multi-arm run

Files: `work/jaylexi-knn/run/arms.tsv`

## All files pooled

A/A: aa - c = +0.05 ± 0.40 points over 112 opponents; 1% band ± 0.55, inside: the run stands.

| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| KA | 112 | 84.16 | -0.39 ± 0.42 | - | 0.2 | 0.01 | 100% | 1.3 | 448 of 448 |
| KN | 112 | 83.69 | -0.86 ± 0.48 | - | 0.2 | 0.01 | 100% | 1.3 | 448 of 448 |
| aa | 112 | 84.58 | +0.05 ± 0.40 | - | 0.2 | 0.01 | 100% | 1.3 | 448 of 448 |
| c | 112 | 84.53 | ref | - | 0.2 | 0.01 | 100% | 1.3 | 448 of 448 |

Difference against the reference by band (points, opponents):

| Arm | Band 1 | Band 2 | Band 3 | Band 4 | Band 5 | Band 6 |
|---|---:|---:|---:|---:|---:|---:|
| KA | - | - | - | - | - | - |
| KN | - | - | - | - | - | - |
| aa | - | - | - | - | - | - |

## Sizes

c (0.6) 1,494 B ProGuard; KN 1,726 javac; KA 1,745 javac. Pass: KN or KA low end over c above 0; then the byte hunt.
