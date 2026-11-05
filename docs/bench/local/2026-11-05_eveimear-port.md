# Multi-arm run

Files: `work/eveimear-port/run/arms.tsv`

## All files pooled

A/A: aa - c = +0.05 ± 0.07 points over 112 opponents; 1% band ± 0.32, inside: the run stands.

| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| P | 112 | 83.31 | +2.22 ± 0.76 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| XR | 112 | 83.04 | +1.95 ± 0.63 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| aa | 112 | 81.12 | +0.05 ± 0.07 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| c | 112 | 81.07 | ref | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| cot | 111 | 83.34 | +1.90 ± 0.70 | - | 0.0 | 0.00 | 100% | 0.0 | 1332 of 1344 |

Difference against the reference by band (points, opponents):

| Arm | Band 1 | Band 2 | Band 3 | Band 4 | Band 5 | Band 6 |
|---|---:|---:|---:|---:|---:|---:|
| P | - | - | - | - | - | - |
| XR | - | - | - | - | - | - |
| aa | - | - | - | - | - | - |
| cot | - | - | - | - | - | - |

## Sizes

c 0.4 742 B; P 749; XR 823; Cotillion 729 (ProGuard builds, kitlab_codesize.py). P passes when its 95% low end against c is above +0.3 points and it sits inside the XR interval.
