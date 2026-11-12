# Multi-arm run

Files: `work/jaylexi-knn2/run/arms.tsv`

## All files pooled

A/A: aa - c = -0.11 ± 0.30 points over 112 opponents; 1% band ± 0.64, inside: the run stands.

| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| KA | 112 | 84.28 | -0.50 ± 0.56 | - | 0.2 | 0.01 | 100% | 1.2 | 336 of 336 |
| KW | 112 | 84.66 | -0.12 ± 0.56 | - | 0.2 | 0.00 | 100% | 0.9 | 336 of 336 |
| KWN | 112 | 84.22 | -0.56 ± 0.75 | - | 0.2 | 0.01 | 100% | 1.5 | 336 of 336 |
| KWNO | 112 | 84.06 | -0.73 ± 0.62 | - | 0.2 | 0.01 | 100% | 0.9 | 336 of 336 |
| aa | 112 | 84.73 | -0.11 ± 0.30 | - | 0.2 | 0.00 | 100% | 1.5 | 336 of 336 |
| c | 112 | 84.84 | ref | - | 0.2 | 0.01 | 100% | 0.6 | 336 of 336 |

Difference against the reference by band (points, opponents):

| Arm | Band 1 | Band 2 | Band 3 | Band 4 | Band 5 | Band 6 |
|---|---:|---:|---:|---:|---:|---:|
| KA | - | - | - | - | - | - |
| KW | - | - | - | - | - | - |
| KWN | - | - | - | - | - | - |
| KWNO | - | - | - | - | - | - |
| aa | - | - | - | - | - | - |

## Conditions

Conditions: robocode.cpu.constant=3793721. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 3 seed(s) an arm.
