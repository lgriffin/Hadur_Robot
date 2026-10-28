# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| c | 24 | 24 | 80.05% | 0 | 2.5 |
| sag | 24 | 24 | 83.98% | 0 | 7.3 |
| sask | 24 | 24 | 76.48% | 6 | 2.8 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=4097450. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G. Rounds 35, field 800x600, 3 seed(s) an arm.
