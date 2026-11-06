# Multi-arm run

Files: `work/eveimear-cot/run/arms.tsv`

## All files pooled

A/A: aa - c = -0.03 ± 0.04 points over 112 opponents; 1% band ± 0.32, inside: the run stands.

| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| X | 112 | 82.65 | +1.47 ± 0.56 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| XR | 112 | 83.08 | +1.90 ± 0.63 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| aa | 112 | 81.16 | -0.03 ± 0.04 | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| c | 112 | 81.20 | ref | - | 0.0 | 0.00 | 100% | 0.0 | 1344 of 1344 |
| cot | 111 | 83.29 | +1.78 ± 0.67 | - | 0.0 | 0.00 | 100% | 0.0 | 1332 of 1344 |

Difference against the reference by band (points, opponents):

| Arm | Band 1 | Band 2 | Band 3 | Band 4 | Band 5 | Band 6 |
|---|---:|---:|---:|---:|---:|---:|
| X | - | - | - | - | - | - |
| XR | - | - | - | - | - | - |
| aa | - | - | - | - | - | - |
| cot | - | - | - | - | - | - |

## Sizes

c 0.4 742 B; X 802; XR 823; Cotillion 729 (ProGuard builds, kitlab_codesize.py). A transplant passes when its 95% low end against c is above +0.3 points; the next step is the byte port.
