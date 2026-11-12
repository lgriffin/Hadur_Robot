# Multi-arm run

Files: `work/jaylexi-wfit/run/arms.tsv`

## All files pooled

A/A: aa - c = -0.08 ± 0.21 points over 112 opponents; 1% band ± 0.45, inside: the run stands.

| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| Jw | 112 | 84.79 | +0.31 ± 0.46 | - | 0.1 | 0.00 | 100% | 0.6 | 672 of 672 |
| Jwf | 112 | 84.69 | +0.21 ± 0.47 | - | 0.1 | 0.00 | 100% | 0.9 | 672 of 672 |
| aa | 112 | 84.44 | -0.08 ± 0.21 | - | 0.1 | 0.00 | 100% | 1.6 | 672 of 672 |
| c | 112 | 84.52 | ref | - | 0.1 | 0.00 | 100% | 0.6 | 672 of 672 |

Difference against the reference by band (points, opponents):

| Arm | Band 1 | Band 2 | Band 3 | Band 4 | Band 5 | Band 6 |
|---|---:|---:|---:|---:|---:|---:|
| Jw | - | - | - | - | - | - |
| Jwf | - | - | - | - | - | - |
| aa | - | - | - | - | - | - |

## Conditions

Conditions: robocode.cpu.constant=4113143. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 6 seed(s) an arm.
