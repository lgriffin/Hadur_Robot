# Multi-arm run

Files: `work/jaylexi-wfit2/run/arms.tsv`

## All files pooled

A/A: aa - c = +0.11 ± 0.21 points over 112 opponents; 1% band ± 0.45, inside: the run stands.

| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| Jw | 112 | 84.95 | +0.48 ± 0.44 | - | 0.1 | 0.00 | 100% | 0.7 | 672 of 672 |
| Jwf2 | 112 | 85.03 | +0.55 ± 0.49 | - | 0.1 | 0.00 | 100% | 1.3 | 672 of 672 |
| aa | 112 | 84.53 | +0.11 ± 0.21 | - | 0.1 | 0.00 | 100% | 0.9 | 672 of 672 |
| c | 112 | 84.42 | ref | - | 0.1 | 0.00 | 100% | 1.0 | 672 of 672 |

Difference against the reference by band (points, opponents):

| Arm | Band 1 | Band 2 | Band 3 | Band 4 | Band 5 | Band 6 |
|---|---:|---:|---:|---:|---:|---:|
| Jw | - | - | - | - | - | - |
| Jwf2 | - | - | - | - | - | - |
| aa | - | - | - | - | - | - |

## Conditions

Conditions: robocode.cpu.constant=4161309. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 6 seed(s) an arm.
