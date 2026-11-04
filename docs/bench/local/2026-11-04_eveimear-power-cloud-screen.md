# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| aa | 80 | 80 | 84.76% | 0 | 0.0 |
| c | 80 | 80 | 84.88% | 0 | 0.0 |
| p1 | 80 | 80 | 79.56% | 0 | 0.1 |
| p3 | 80 | 80 | 82.98% | 0 | 0.0 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=4175607. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v233, no other Robocode JVMs running, parallel 1. Battle JVM flags: -Xmx512M -Dhadur.bench.truth=false. Rounds 10, field 800x600, 1 seed(s) an arm.
