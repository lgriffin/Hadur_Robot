# Multi-arm run

Files: `work/jaylexi-own/run/arms.tsv`

## All files pooled

A/A: aa - c = +0.05 ± 0.29 points over 112 opponents; 1% band ± 0.64, inside: the run stands.

| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| Jn | 112 | 83.84 | -0.64 ± 0.73 | - | 0.2 | 0.00 | 100% | 0.6 | 336 of 336 |
| Jo | 112 | 84.28 | -0.20 ± 0.46 | - | 0.2 | 0.01 | 100% | 1.8 | 336 of 336 |
| Jw | 112 | 85.00 | +0.53 ± 0.55 | - | 0.2 | 0.01 | 100% | 3.0 | 336 of 336 |
| Jx | 112 | 84.10 | -0.38 ± 0.71 | - | 0.1 | 0.00 | 100% | 1.2 | 336 of 336 |
| aa | 112 | 84.50 | +0.05 ± 0.29 | - | 0.2 | 0.01 | 100% | 1.8 | 336 of 336 |
| c | 112 | 84.45 | ref | - | 0.2 | 0.00 | 100% | 0.6 | 336 of 336 |

Difference against the reference by band (points, opponents):

| Arm | Band 1 | Band 2 | Band 3 | Band 4 | Band 5 | Band 6 |
|---|---:|---:|---:|---:|---:|---:|
| Jn | - | - | - | - | - | - |
| Jo | - | - | - | - | - | - |
| Jw | - | - | - | - | - | - |
| Jx | - | - | - | - | - | - |
| aa | - | - | - | - | - | - |

## Conditions

Conditions: robocode.cpu.constant=3826336. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 3 seed(s) an arm.
