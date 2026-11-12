# Multi-arm run

Files: `work/jaylexi-walls/run/arms.tsv`

## All files pooled

A/A: aa - c = +0.10 ± 0.18 points over 112 opponents; 1% band ± 0.45, inside: the run stands.

| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| Jw | 112 | 85.05 | +0.29 ± 0.42 | - | 0.2 | 0.01 | 100% | 1.3 | 672 of 672 |
| Jw2 | 112 | 84.56 | -0.20 ± 0.41 | - | 0.2 | 0.01 | 100% | 1.3 | 672 of 672 |
| aa | 112 | 84.80 | +0.10 ± 0.18 | - | 0.2 | 0.01 | 100% | 1.6 | 672 of 672 |
| c | 112 | 84.70 | ref | - | 0.2 | 0.01 | 100% | 1.2 | 672 of 672 |

Difference against the reference by band (points, opponents):

| Arm | Band 1 | Band 2 | Band 3 | Band 4 | Band 5 | Band 6 |
|---|---:|---:|---:|---:|---:|---:|
| Jw | - | - | - | - | - | - |
| Jw2 | - | - | - | - | - | - |
| aa | - | - | - | - | - | - |

## Conditions

Conditions: robocode.cpu.constant=3675111. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 6 seed(s) an arm.
