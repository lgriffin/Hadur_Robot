# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| bb | 8 | 8 | 95.91% | 0 | 1.1 |
| c | 8 | 8 | 91.91% | 0 | 4.3 |
| mz | 8 | 8 | 90.49% | 0 | 2.9 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=3206250. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G. Rounds 35, field 800x600, 4 seed(s) an arm.
