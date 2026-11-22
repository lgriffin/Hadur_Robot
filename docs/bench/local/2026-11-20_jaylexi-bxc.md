# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| SB1 | 672 | 672 | 85.24% | 3 | 0.5 |
| SD2 | 672 | 672 | 85.24% | 10 | 0.5 |
| aa | 672 | 672 | 85.02% | 11 | 0.5 |
| c | 672 | 672 | 85.05% | 10 | 0.5 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=2530500. Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 6 seed(s) an arm.
