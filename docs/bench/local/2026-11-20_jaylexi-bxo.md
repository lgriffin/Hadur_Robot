# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| SB1 | 448 | 448 | 84.94% | 6 | 0.2 |
| SD2 | 448 | 448 | 85.32% | 6 | 0.2 |
| aa | 448 | 448 | 84.92% | 4 | 0.2 |
| c | 448 | 448 | 84.99% | 3 | 0.2 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=3209114. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 4 seed(s) an arm.
